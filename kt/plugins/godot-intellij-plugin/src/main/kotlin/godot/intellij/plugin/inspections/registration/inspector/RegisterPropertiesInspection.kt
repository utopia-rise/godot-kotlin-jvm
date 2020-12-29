package godot.intellij.plugin.inspections.registration.inspector

import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiElementVisitor
import godot.annotation.*
import godot.annotation.IntRange
import godot.annotation.LongRange
import godot.core.Color
import godot.intellij.plugin.inspections.registration.quickfix.RegisterPropertyMutabilityQuickFix
import org.jetbrains.kotlin.backend.common.serialization.findPackage
import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.descriptors.impl.ClassConstructorDescriptorImpl
import org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl
import org.jetbrains.kotlin.idea.caches.resolve.analyze
import org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection
import org.jetbrains.kotlin.idea.intentions.loopToCallChain.isConstant
import org.jetbrains.kotlin.idea.refactoring.fqName.fqName
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.js.resolve.diagnostics.findPsi
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.nj2k.postProcessing.type
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.referenceExpression
import org.jetbrains.kotlin.resolve.bindingContextUtil.getReferenceTargets
import org.jetbrains.kotlin.resolve.calls.callUtil.getType
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.resolve.descriptorUtil.isCompanionObject
import org.jetbrains.kotlin.resolve.lazy.BodyResolveMode
import org.jetbrains.kotlin.types.typeUtil.*

class RegisterPropertiesInspection : AbstractKotlinInspection() {
    private val mutabilityQuickFix by lazy { RegisterPropertyMutabilityQuickFix() }

    override fun buildVisitor(holder: ProblemsHolder, isOnTheFly: Boolean): PsiElementVisitor {
        return propertyVisitor { ktProperty ->
            if (ktProperty.findAnnotation(FqName(RegisterProperty::class.java.canonicalName)) != null) {
                checkMutability(ktProperty, holder)
                checkRegisteredType(ktProperty, holder)
                checkIfDefaultValueIsConstant(ktProperty, holder)
            }
            checkPropertyHintAnnotations(ktProperty, holder) //outside to check if the property is also registered
        }
    }

    private fun checkMutability(ktProperty: KtProperty, holder: ProblemsHolder) {
        if (!ktProperty.isVar) {
            holder.registerProblem(ktProperty.valOrVarKeyword, "Registered properties have to be mutable", mutabilityQuickFix)
        }
    }

    private fun checkRegisteredType(ktProperty: KtProperty, holder: ProblemsHolder) {
        val type = ktProperty.type() ?: return
        if (type.getJetTypeFqName(false).startsWith("kotlin.collections") && ktProperty.findAnnotation(FqName("godot.annotation.EnumFlag")) == null) { //enum flag is the only case where registering a kotlin collection is allowed
            holder.registerProblem(getInitializerProblemLocation(ktProperty), "Kotlin collections cannot be registered as default values. Consider using one of the godot collections. There are handy conversion functions available")
        }
    }

    private fun checkIfDefaultValueIsConstant(ktProperty: KtProperty, holder: ProblemsHolder) {
        ktProperty
            .initializer
            ?.let {
                if (!it.isConstant() && !isConstantEnoughForRegistration(it)) {
                    holder.registerProblem(getInitializerProblemLocation(ktProperty), "Default values of registered properties have to be compile time constants or direct constructor calls")
                }
            }
    }

    private fun isConstantEnoughForRegistration(ktExpression: KtExpression): Boolean {
        return if (!ktExpression.isConstant()) {
            return when (ktExpression) {
                is KtCallExpression -> {
                    val bindingContext = ktExpression.analyze(BodyResolveMode.FULL)
                    ktExpression
                        .referenceExpression()
                        ?.getReferenceTargets(bindingContext)
                        ?.firstOrNull()
                        ?.let { declarationDescriptor ->
                            val psi = declarationDescriptor.findPsi()
                            val transformedArgs = ktExpression
                                .valueArguments
                                .mapNotNull { valueArgument -> valueArgument.getArgumentExpression() }
                                .map { isConstantEnoughForRegistration(it) }

                            // if an arg is false, then it means that it contained a non static reference
                            if (transformedArgs.any { !it }) {
                                return false
                            }

                            when {
                                //constructor
                                psi is KtConstructor<*> || declarationDescriptor is ClassConstructorDescriptorImpl -> true
                                //godot arrays and kotlin collections
                                //Note: kotlin collections only as constructor arguments or function params. checkRegisteredType already ensures that they are not registered as property types
                                declarationDescriptor is SimpleFunctionDescriptorImpl && (
                                    declarationDescriptor.fqNameSafe.asString().matches(Regex("^godot\\.core\\..*(ArrayOf|Array)\$"))
                                        || declarationDescriptor.fqNameSafe.asString().matches(Regex("^godot\\.core\\..*(dictionaryOf|Dictionary)\$"))
                                        || declarationDescriptor.findPackage().fqName.asString() == "kotlin.collections"
                                    ) -> true
                                //set's for enum flag registration
                                ktExpression.getType(bindingContext)?.let(KotlinBuiltIns::isSetOrNullableSet) == true -> true
                                else -> false
                            }
                        } ?: false
                }
                is KtDotQualifiedExpression -> {
                    val bindingContext = ktExpression.analyze(BodyResolveMode.FULL)
                    val receiver = ktExpression.receiverExpression
                    val receiverRef = receiver.getReferenceTargets(bindingContext).firstOrNull()

                    //Enums
                    if (receiverRef != null) {
                        val psi = receiverRef.findPsi()
                        if (psi is KtClass && psi.isEnum()) {
                            true
                        } else receiverRef.isCompanionObject()
                    } else if (receiver is KtStringTemplateExpression) {
                        val selectorExpression = ktExpression
                            .selectorExpression
                            ?.referenceExpression()
                            ?.getReferenceTargets(bindingContext)
                            ?.firstOrNull()

                        selectorExpression?.fqNameSafe?.asString() == "kotlin.text.trimIndent"
                    } else false
                }
                is KtStringTemplateExpression -> !ktExpression.hasInterpolation()
                is KtBinaryExpression -> {
                    val assignment = ktExpression
                        .children
                        .filterNot { it is KtOperationReferenceExpression } //stuff like the `to` keyword in `key to value`
                        .map { isConstantEnoughForRegistration(it as KtExpression) }

                    !assignment.any { !it }
                }
                else -> false
            }
        } else true
    }

    private fun checkPropertyHintAnnotations(ktProperty: KtProperty, holder: ProblemsHolder) {
        when {
            ktProperty.findAnnotation(FqName(IntRange::class.java.canonicalName)) != null -> {
                checkForRegistrationAnnotation(ktProperty, holder)
                if (ktProperty.type()?.isInt() == false) {
                    holder.registerProblem(
                        ktProperty.findAnnotation(FqName(IntRange::class.java.canonicalName))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement,
                        "Property must be of type ${Int::class.qualifiedName}"
                    )
                }
            }
            ktProperty.findAnnotation(FqName(LongRange::class.java.canonicalName)) != null -> {
                checkForRegistrationAnnotation(ktProperty, holder)
                if (ktProperty.type()?.isLong() == false) {
                    holder.registerProblem(
                        ktProperty.findAnnotation(FqName(LongRange::class.java.canonicalName))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement,
                        "Property must be of type ${Long::class.qualifiedName}"
                    )
                }
            }
            ktProperty.findAnnotation(FqName(FloatRange::class.java.canonicalName)) != null -> {
                checkForRegistrationAnnotation(ktProperty, holder)
                if (ktProperty.type()?.isFloat() == false) {
                    holder.registerProblem(
                        ktProperty.findAnnotation(FqName(FloatRange::class.java.canonicalName))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement,
                        "Property must be of type ${Float::class.qualifiedName}"
                    )
                }
            }
            ktProperty.findAnnotation(FqName(DoubleRange::class.java.canonicalName)) != null -> {
                checkForRegistrationAnnotation(ktProperty, holder)
                if (ktProperty.type()?.isDouble() == false) {
                    holder.registerProblem(
                        ktProperty.findAnnotation(FqName(DoubleRange::class.java.canonicalName))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement,
                        "Property must be of type ${Double::class.qualifiedName}"
                    )
                }
            }
            ktProperty.findAnnotation(FqName(ExpRange::class.java.canonicalName)) != null -> {
                checkForRegistrationAnnotation(ktProperty, holder)
                if (ktProperty.type()?.isFloat() == false && ktProperty.type()?.isDouble() == false) {
                    holder.registerProblem(
                        ktProperty.findAnnotation(FqName(ExpRange::class.java.canonicalName))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement,
                        "Property must be of type ${Float::class.qualifiedName} or ${Double::class.qualifiedName}"
                    )
                }
            }
            ktProperty.findAnnotation(FqName(ExpEasing::class.java.canonicalName)) != null -> {
                checkForRegistrationAnnotation(ktProperty, holder)
                if (ktProperty.type()?.isFloat() == false && ktProperty.type()?.isDouble() == false) {
                    holder.registerProblem(
                        ktProperty.findAnnotation(FqName(ExpEasing::class.java.canonicalName))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement,
                        "Property must be of type ${Float::class.qualifiedName} or ${Double::class.qualifiedName}"
                    )
                }
            }
            ktProperty.findAnnotation(FqName(EnumTypeHint::class.java.canonicalName)) != null -> {
                checkForRegistrationAnnotation(ktProperty, holder)
                if (ktProperty.type()?.isEnum() == false) {
                    holder.registerProblem(
                        ktProperty.findAnnotation(FqName(EnumTypeHint::class.java.canonicalName))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement,
                        "Property must be of type ${Enum::class.qualifiedName}"
                    )
                }
            }
            ktProperty.findAnnotation(FqName(EnumFlag::class.java.canonicalName)) != null -> {
                checkForRegistrationAnnotation(ktProperty, holder)
                if (ktProperty.type()?.fqName?.asString()?.matches(Regex("^kotlin\\.collections\\..*Set\$")) == false) {
                    holder.registerProblem(
                        ktProperty.findAnnotation(FqName(EnumFlag::class.java.canonicalName))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement,
                        "Property must be of type ${Set::class.qualifiedName} or ${MutableSet::class.qualifiedName}"
                    )
                } else {
                    val numberOfEnumEntriesInEnum = ktProperty
                        .type()
                        ?.constructor
                        ?.declarationDescriptor
                        ?.findPsi()
                        ?.let { it as? KtClass }
                        ?.declarations
                        ?.filterIsInstance<KtEnumEntry>()
                        ?.size ?: 0

                    if (numberOfEnumEntriesInEnum > 32) {
                        holder.registerProblem(
                            ktProperty.findAnnotation(FqName(EnumFlag::class.java.canonicalName))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement,
                            "Enums used as EnumFlags can only have a maximum of 32 entries"
                        )
                    }
                }
            }
            ktProperty.findAnnotation(FqName(IntFlag::class.java.canonicalName)) != null -> {
                checkForRegistrationAnnotation(ktProperty, holder)
                if (ktProperty.type()?.isInt() == false) {
                    holder.registerProblem(
                        ktProperty.findAnnotation(FqName(IntFlag::class.java.canonicalName))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement,
                        "Property must be of type ${Int::class.qualifiedName}"
                    )
                }
            }
            ktProperty.findAnnotation(FqName(File::class.java.canonicalName)) != null -> {
                checkForRegistrationAnnotation(ktProperty, holder)
                if (ktProperty.type()?.getJetTypeFqName(false) != "kotlin.String") {
                    holder.registerProblem(
                        ktProperty.findAnnotation(FqName(File::class.java.canonicalName))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement,
                        "Property must be of type ${String::class.qualifiedName}"
                    )
                }
            }
            ktProperty.findAnnotation(FqName(Dir::class.java.canonicalName)) != null -> {
                checkForRegistrationAnnotation(ktProperty, holder)
                if (ktProperty.type()?.getJetTypeFqName(false) != "kotlin.String") {
                    holder.registerProblem(
                        ktProperty.findAnnotation(FqName(Dir::class.java.canonicalName))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement,
                        "Property must be of type ${String::class.qualifiedName}"
                    )
                }
            }
            ktProperty.findAnnotation(FqName(MultilineText::class.java.canonicalName)) != null -> {
                checkForRegistrationAnnotation(ktProperty, holder)
                if (ktProperty.type()?.getJetTypeFqName(false) != "kotlin.String") {
                    holder.registerProblem(
                        ktProperty.findAnnotation(FqName(MultilineText::class.java.canonicalName))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement,
                        "Property must be of type ${String::class.qualifiedName}"
                    )
                }
            }
            ktProperty.findAnnotation(FqName(PlaceHolderText::class.java.canonicalName)) != null -> {
                checkForRegistrationAnnotation(ktProperty, holder)
                if (ktProperty.type()?.getJetTypeFqName(false) != "kotlin.String") {
                    holder.registerProblem(
                        ktProperty.findAnnotation(FqName(PlaceHolderText::class.java.canonicalName))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement,
                        "Property must be of type ${String::class.qualifiedName}"
                    )
                }
            }
            ktProperty.findAnnotation(FqName(ColorNoAlpha::class.java.canonicalName)) != null -> {
                checkForRegistrationAnnotation(ktProperty, holder)
                if (ktProperty.type()?.getJetTypeFqName(false) != Color::class.java.canonicalName) {
                    holder.registerProblem(
                        ktProperty.findAnnotation(FqName(ColorNoAlpha::class.java.canonicalName))?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement,
                        "Property must be of type ${Color::class.qualifiedName}"
                    )
                }
            }
        }
    }

    private fun checkForRegistrationAnnotation(ktProperty: KtProperty, holder: ProblemsHolder) {
        if (ktProperty.findAnnotation(FqName(RegisterProperty::class.java.canonicalName)) == null) {
            holder.registerProblem(ktProperty.nameIdentifier ?: ktProperty.navigationElement, "Property has a type hint but is not registered")
        }
    }

    private fun getInitializerProblemLocation(ktProperty: KtProperty) = ktProperty.initializer?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
}

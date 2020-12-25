package godot.intellij.plugin.inspections.registration.property.inspector

import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiElementVisitor
import godot.intellij.plugin.inspections.registration.property.quickfix.ClassNotRegisteredQuickFix
import godot.intellij.plugin.inspections.registration.property.quickfix.RegisterPropertyMutabilityQuickFix
import org.jetbrains.kotlin.backend.common.serialization.findPackage
import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.descriptors.impl.ClassConstructorDescriptorImpl
import org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl
import org.jetbrains.kotlin.idea.caches.resolve.analyze
import org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection
import org.jetbrains.kotlin.idea.intentions.loopToCallChain.isConstant
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.js.resolve.diagnostics.findPsi
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.nj2k.postProcessing.type
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.containingClass
import org.jetbrains.kotlin.psi.psiUtil.referenceExpression
import org.jetbrains.kotlin.resolve.bindingContextUtil.getReferenceTargets
import org.jetbrains.kotlin.resolve.calls.callUtil.getType
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.resolve.lazy.BodyResolveMode
import org.jetbrains.kotlin.types.typeUtil.*

class RegisterPropertiesInspection : AbstractKotlinInspection() {
    private val mutabilityQuickFix by lazy { RegisterPropertyMutabilityQuickFix() }

    override fun buildVisitor(holder: ProblemsHolder, isOnTheFly: Boolean): PsiElementVisitor {
        return propertyVisitor { ktProperty ->
            if (ktProperty.findAnnotation(FqName("godot.annotation.RegisterProperty")) != null) {
                checkMutability(ktProperty, holder)
                checkRegisteredType(ktProperty, holder)
                checkIfDefaultValueIsConstant(ktProperty, holder)
                when {
                    ktProperty.type()?.isEnum() == true -> checkEnum(ktProperty, holder)
                }
            }
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
            if (ktExpression is KtCallExpression) {
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

                        return when {
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
                    } ?: return false
            } else {
                false
            }
        } else false
    }

    private fun checkEnum(ktProperty: KtProperty, holder: ProblemsHolder) {
        if (ktProperty.findAnnotation(FqName("godot.annotation.EnumFlag")) != null) {
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
                holder.registerProblem(ktProperty.navigationElement, "Registered properties have to be mutable")
            }
        }
    }

    private fun getInitializerProblemLocation(ktProperty: KtProperty) = ktProperty.initializer?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
}

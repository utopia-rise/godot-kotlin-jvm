package godot.intellij.plugin.annotator.property

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiField
import com.intellij.psi.PsiTypeParameterListOwner
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.annotator.general.checkNotGeneric
import godot.intellij.plugin.extension.isCoreType
import godot.intellij.plugin.extension.isGodotPrimitive
import godot.intellij.plugin.extension.isInGodotRoot
import godot.intellij.plugin.extension.isRegistered
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.extension.type
import godot.intellij.plugin.quickfix.RegisterPropertyMutabilityQuickFix
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.godotAnnotationPackage
import godot.tools.common.constants.godotApiPackage
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.kotlinCollectionsPackage
import org.jetbrains.kotlin.asJava.toLightElements
import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.js.descriptorUtils.getKotlinTypeFqName
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.types.isNullable
import org.jetbrains.kotlin.types.typeUtil.isChar
import org.jetbrains.kotlin.types.typeUtil.isEnum
import org.jetbrains.kotlin.types.typeUtil.supertypes
import org.jetbrains.kotlin.utils.addToStdlib.firstIsInstance

class RegisterPropertiesAnnotator : Annotator {
    private val mutabilityQuickFix by lazy { RegisterPropertyMutabilityQuickFix() }
    private val propertyHintAnnotationChecker by lazy { PropertyHintAnnotationChecker() }

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (!element.isInGodotRoot()) return

        when(element) {
            is KtProperty -> {
                if (element.isRegistered()) {
                    checkNotGeneric(element.toLightElements().firstIsInstance(), holder)
                    checkMutability(element, holder)
                    checkRegisteredType(element, holder)
                    lateinitChecks(element, holder)
                    nullableChecks(element, holder)
                }
                // outside to check if the property is also registered
                propertyHintAnnotationChecker.checkPropertyHintAnnotations(element, holder)
            }
            is PsiField -> {
                if (element.isRegistered()) {
                    (element as? PsiTypeParameterListOwner)?.let { checkNotGeneric(it, holder) }
                    checkMutability(element, holder)
                }
            }
        }
    }

    private fun checkMutability(psiElement: PsiElement, holder: AnnotationHolder) {
        when(psiElement) {
            is KtProperty -> if (!psiElement.isVar) {
                holder.registerProblem(
                    GodotPluginBundle.message("problem.property.mutability"),
                    psiElement.valOrVarKeyword,
                    mutabilityQuickFix
                )
            }
            is PsiField -> if (psiElement.modifierList?.hasModifierProperty("final") == true) {
                holder.registerProblem(
                    GodotPluginBundle.message("problem.property.mutability"),
                    psiElement.modifierList?.children?.firstOrNull { it.text.contains("final") } ?: psiElement
                )
            }
            else -> return
        }
    }

    private fun checkRegisteredType(ktProperty: KtProperty, holder: AnnotationHolder) {
        val type = ktProperty.type() ?: return
        // enum flag is the only case where registering a kotlin collection is allowed
        if (
            type.getKotlinTypeFqName(false).startsWith(kotlinCollectionsPackage) &&
            ktProperty.findAnnotation(FqName("$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.enumFlag}")) == null &&
            type.arguments.firstOrNull()?.type?.isEnum() != true
        ) {
            // TODO: add quick fix
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.registeredKotlinCollection"),
                getInitializerProblemLocation(ktProperty)
            )
        }
        if (
            type.getKotlinTypeFqName(false).startsWith("$godotCorePackage.${GodotKotlinJvmTypes.variantArray}") &&
            type.arguments.firstOrNull()?.type?.isEnum() == true
        ) {
            // TODO: add quick fix
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.registeredEnumListWithVariantArray"),
                getInitializerProblemLocation(ktProperty)
            )
        }


        val isInheritingObject = ktProperty.type()?.supertypes()
            ?.any { it.getKotlinTypeFqName(false) == "$godotApiPackage.${GodotKotlinJvmTypes.obj}" } == true
        val isCoreType = ktProperty.type()?.isCoreType() == true
        val isSupportedJvmType = ktProperty.type()?.isSupportedJvmType() == true

        if (
            !isInheritingObject
            && !isCoreType
            && !isSupportedJvmType
        ) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.export.triedToExportUnsupportedType"),
                ktProperty.nameIdentifier ?: ktProperty.navigationElement
            )
        }
    }

    private fun lateinitChecks(ktProperty: KtProperty, holder: AnnotationHolder) {
        if (
            ktProperty.hasModifier(org.jetbrains.kotlin.lexer.KtTokens.LATEINIT_KEYWORD)
            && (ktProperty.type()?.isCoreType() == true || ktProperty.type()?.isGodotPrimitive() == true)
        ) {
            holder.registerProblem(
                message = GodotPluginBundle.message("problem.property.lateinit.coreType"),
                errorLocation = ktProperty.nameIdentifier ?: ktProperty.navigationElement,
            )
        }
    }

    private fun nullableChecks(ktProperty: KtProperty, holder: AnnotationHolder) {
        if (
            ktProperty.type()?.isNullable() == true
            && (ktProperty.type()?.isCoreType() == true || ktProperty.type()?.isGodotPrimitive() == true)
        ) {
            holder.registerProblem(
                message = GodotPluginBundle.message("problem.property.nullable"),
                errorLocation = ktProperty.nameIdentifier ?: ktProperty.navigationElement,
            )
        }
    }

    private fun getInitializerProblemLocation(ktProperty: KtProperty) =
        ktProperty.initializer?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement

    private fun KotlinType.isSupportedJvmType(): Boolean {
        return KotlinBuiltIns.isPrimitiveTypeOrNullablePrimitiveType(this)
            || KotlinBuiltIns.isStringOrNullableString(this)
            || this.isEnum()
            || KotlinBuiltIns.isCollectionOrNullableCollection(this)
            || KotlinBuiltIns.isString(this)
            || KotlinBuiltIns.isArrayOrPrimitiveArray(this)
            || this.isChar()
            || this.supertypes().any { it.isSupportedJvmType() }
    }
}


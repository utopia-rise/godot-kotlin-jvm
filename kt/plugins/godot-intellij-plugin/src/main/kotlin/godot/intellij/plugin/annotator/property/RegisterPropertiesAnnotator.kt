package godot.intellij.plugin.annotator.property

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.annotator.general.checkNotGeneric
import godot.intellij.plugin.data.model.EXPORT_ANNOTATION
import godot.intellij.plugin.data.model.REGISTER_PROPERTY_ANNOTATION
import godot.intellij.plugin.extension.isInGodotRoot
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.quickfix.PropertyNotRegisteredQuickFix
import godot.intellij.plugin.quickfix.PropertyRemoveExportAnnotationQuickFix
import godot.intellij.plugin.quickfix.RegisterPropertyMutabilityQuickFix
import godot.tools.common.constants.*
import org.jetbrains.kotlin.idea.intentions.loopToCallChain.isConstant
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.nj2k.postProcessing.type
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.types.typeUtil.isEnum
import org.jetbrains.kotlin.types.typeUtil.supertypes

class RegisterPropertiesAnnotator : Annotator {
    private val mutabilityQuickFix by lazy { RegisterPropertyMutabilityQuickFix() }
    private val propertyNotRegisteredQuickFix by lazy { PropertyNotRegisteredQuickFix() }
    private val propertyRemoveExportAnnotationQuickFix by lazy { PropertyRemoveExportAnnotationQuickFix() }
    private val ktExpressionConstantChecker by lazy { KtExpressionConstantChecker() }
    private val propertyHintAnnotationChecker by lazy { PropertyHintAnnotationChecker() }

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (!element.isInGodotRoot()) return

        if (element is KtProperty) {
            if (element.findAnnotation(FqName(REGISTER_PROPERTY_ANNOTATION)) != null) {
                checkNotGeneric(element, holder)
                checkMutability(element, holder)
                checkRegisteredType(element, holder)
                checkIfDefaultValueIsConstantWhenExported(element, holder)
            }
            // outside to check if the property is also registered
            propertyHintAnnotationChecker.checkPropertyHintAnnotations(element, holder)
            checkExportAnnotation(element, holder)
        }
    }

    private fun checkMutability(ktProperty: KtProperty, holder: AnnotationHolder) {
        if (!ktProperty.isVar) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.mutability"),
                ktProperty.valOrVarKeyword,
                mutabilityQuickFix
            )
        }
    }

    private fun checkExportAnnotation(ktProperty: KtProperty, holder: AnnotationHolder) {
        if (ktProperty.findAnnotation(FqName(EXPORT_ANNOTATION)) != null) {
            if (ktProperty.findAnnotation(FqName(REGISTER_PROPERTY_ANNOTATION)) == null) {
                holder.registerProblem(
                    GodotPluginBundle.message("problem.property.export.notRegistered"),
                    ktProperty.nameIdentifier ?: ktProperty.navigationElement,
                    propertyNotRegisteredQuickFix
                )
            }
            if (
                ktProperty.type()?.supertypes()?.any { it.getJetTypeFqName(false) == "$godotApiPackage.${GodotKotlinJvmTypes.obj}" } == true &&
                ktProperty.type()?.supertypes()?.any { it.getJetTypeFqName(false) == "$godotApiPackage.${GodotKotlinJvmTypes.refCounted}" } == false
            ) {
                holder.registerProblem(
                    GodotPluginBundle.message("problem.property.export.triedToExportObject"),
                    ktProperty.nameIdentifier ?: ktProperty.navigationElement,
                    propertyRemoveExportAnnotationQuickFix
                )
            }
        }
    }

    private fun checkRegisteredType(ktProperty: KtProperty, holder: AnnotationHolder) {
        val type = ktProperty.type() ?: return
        // enum flag is the only case where registering a kotlin collection is allowed
        if (
            type.getJetTypeFqName(false).startsWith(kotlinCollectionsPackage) &&
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
            type.getJetTypeFqName(false).startsWith("$godotCorePackage.${GodotKotlinJvmTypes.variantArray}") &&
            type.arguments.firstOrNull()?.type?.isEnum() == true
        ) {
            // TODO: add quick fix
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.registeredEnumListWithVariantArray"),
                getInitializerProblemLocation(ktProperty)
            )
        }
    }

    private fun checkIfDefaultValueIsConstantWhenExported(ktProperty: KtProperty, holder: AnnotationHolder) {
        if (ktProperty.findAnnotation(FqName(EXPORT_ANNOTATION)) != null) {
            ktProperty
                .initializer
                ?.let {
                    if (!it.isConstant() && !ktExpressionConstantChecker.isConstantEnoughForRegistration(it)) {
                        holder.registerProblem(
                            GodotPluginBundle.message("problem.property.defaultValue.notConstant"),
                            getInitializerProblemLocation(ktProperty)
                        )
                    }
                }
        }
    }

    private fun getInitializerProblemLocation(ktProperty: KtProperty) =
        ktProperty.initializer?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
}

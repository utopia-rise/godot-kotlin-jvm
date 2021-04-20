package godot.intellij.plugin.annotator.property

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.model.REGISTER_PROPERTY_ANNOTATION
import godot.intellij.plugin.extension.isInGodotRoot
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.quickfix.RegisterPropertyMutabilityQuickFix
import org.jetbrains.kotlin.idea.intentions.loopToCallChain.isConstant
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.nj2k.postProcessing.type
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.types.typeUtil.isEnum

class RegisterPropertiesAnnotator : Annotator {
    private val mutabilityQuickFix by lazy { RegisterPropertyMutabilityQuickFix() }
    private val ktExpressionConstantChecker by lazy { KtExpressionConstantChecker() }
    private val propertyHintAnnotationChecker by lazy { PropertyHintAnnotationChecker() }

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (!element.isInGodotRoot()) return

        if (element is KtProperty) {
            if (element.findAnnotation(FqName(REGISTER_PROPERTY_ANNOTATION)) != null) {
                checkMutability(element, holder)
                checkRegisteredType(element, holder)
                checkIfDefaultValueIsConstant(element, holder)
            }
            // outside to check if the property is also registered
            propertyHintAnnotationChecker.checkPropertyHintAnnotations(element, holder)
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

    private fun checkRegisteredType(ktProperty: KtProperty, holder: AnnotationHolder) {
        val type = ktProperty.type() ?: return
        // enum flag is the only case where registering a kotlin collection is allowed
        if (
            type.getJetTypeFqName(false).startsWith("kotlin.collections") &&
            ktProperty.findAnnotation(FqName("godot.annotation.EnumFlag")) == null &&
            type.arguments.firstOrNull()?.type?.isEnum() != true
        ) {
            // TODO: add quick fix
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.registeredKotlinCollection"),
                getInitializerProblemLocation(ktProperty)
            )
        }
        if (
            type.getJetTypeFqName(false).startsWith("godot.core.VariantArray") &&
            type.arguments.firstOrNull()?.type?.isEnum() == true
        ) {
            // TODO: add quick fix
            holder.registerProblem(
                GodotPluginBundle.message("problem.property.registeredEnumListWithVariantArray"),
                getInitializerProblemLocation(ktProperty)
            )
        }
    }

    private fun checkIfDefaultValueIsConstant(ktProperty: KtProperty, holder: AnnotationHolder) {
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

    private fun getInitializerProblemLocation(ktProperty: KtProperty) =
        ktProperty.initializer?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
}

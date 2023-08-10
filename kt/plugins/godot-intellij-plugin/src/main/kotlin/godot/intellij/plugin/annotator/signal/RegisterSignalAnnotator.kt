package godot.intellij.plugin.annotator.signal

import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.annotator.general.checkNotGeneric
import godot.intellij.plugin.data.model.REGISTER_SIGNAL_ANNOTATION
import godot.intellij.plugin.extension.isInGodotRoot
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.extension.type
import godot.intellij.plugin.quickfix.RegisterSignalInitializerQuickFix
import godot.intellij.plugin.quickfix.RegisterSignalMutabilityQuickFix
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.signalPackage
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.js.descriptorUtils.getKotlinTypeFqName

import org.jetbrains.kotlin.name.FqName

import org.jetbrains.kotlin.psi.KtProperty

class RegisterSignalAnnotator : Annotator {
    private val mutabilityQuickFix by lazy { RegisterSignalMutabilityQuickFix() }
    private val useDelegateQuickFix by lazy { RegisterSignalInitializerQuickFix() }

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (!element.isInGodotRoot()) return

        if (element is KtProperty && element.findAnnotation(FqName(REGISTER_SIGNAL_ANNOTATION)) != null) {
            checkNotGeneric(element, holder)
            checkMutability(element, holder)
            checkRegisteredType(element, holder)
        }
    }

    private fun checkMutability(ktProperty: KtProperty, holder: AnnotationHolder) {
        if (ktProperty.isVar) {
            holder.registerProblem(
                message = GodotPluginBundle.message("problem.signal.mutability"),
                errorLocation = ktProperty.valOrVarKeyword,
                quickFixes = arrayOf(mutabilityQuickFix),
                problemHighlightType = ProblemHighlightType.WARNING,
            )
        }
    }

    private fun checkRegisteredType(ktProperty: KtProperty, holder: AnnotationHolder) {
        val type = ktProperty.type() ?: return
        if (!type.getKotlinTypeFqName(false).startsWith("$signalPackage.${GodotKotlinJvmTypes.signal}")) {
            holder.registerProblem(
                message = GodotPluginBundle.message("problem.signal.wrongType"),
                errorLocation = getInitializerProblemLocation(ktProperty),
                quickFixes = arrayOf(useDelegateQuickFix)
            )
        }
    }

    private fun getInitializerProblemLocation(ktProperty: KtProperty) = ktProperty
        .initializer
        ?.psiOrParent
        ?: ktProperty
            .nameIdentifier
        ?: ktProperty
            .navigationElement
}

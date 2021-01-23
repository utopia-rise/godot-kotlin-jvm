package godot.intellij.plugin.annotator.signal

import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.quickfix.RegisterSignalInitializerQuickFix
import godot.intellij.plugin.quickfix.RegisterSignalMutabilityQuickFix
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.nj2k.postProcessing.type
import org.jetbrains.kotlin.psi.KtProperty

class RegisterSignalAnnotator : Annotator {
    private val mutabilityQuickFix by lazy { RegisterSignalMutabilityQuickFix() }
    private val useDelegateQuickFix by lazy { RegisterSignalInitializerQuickFix() }

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (element is KtProperty && element.findAnnotation(FqName("godot.annotation.RegisterSignal")) != null) {
            checkMutability(element, holder)
            checkRegisteredType(element, holder)
        }
    }

    private fun checkMutability(ktProperty: KtProperty, holder: AnnotationHolder) {
        if (ktProperty.isVar) {
            holder.registerProblem(
                "Registered signals should not be mutable",
                ktProperty.valOrVarKeyword,
                mutabilityQuickFix,
                ProblemHighlightType.WARNING
            )
        }
    }

    private fun checkRegisteredType(ktProperty: KtProperty, holder: AnnotationHolder) {
        val type = ktProperty.type() ?: return
        if (!type.getJetTypeFqName(false).startsWith("godot.signals.Signal")) {
            holder.registerProblem(
                "Not of type signal. Properties annotated with @RegisterSignal have to be of type signal. Consider using one of the \"by signal\" delegates",
                getInitializerProblemLocation(ktProperty),
                useDelegateQuickFix
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

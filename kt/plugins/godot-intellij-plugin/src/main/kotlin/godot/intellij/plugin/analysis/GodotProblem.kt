package godot.intellij.plugin.analysis

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiElement

class GodotProblem(
    val message: String,
    val location: PsiElement,
    val quickFixes: Array<out LocalQuickFix> = emptyArray(),
    val highlightType: ProblemHighlightType = ProblemHighlightType.GENERIC_ERROR
)

fun ProblemsHolder.registerProblems(problems: Iterable<GodotProblem>) {
    problems.forEach {
        registerProblem(
            it.location,
            it.message,
            it.highlightType,
            *it.quickFixes
        )
    }
}

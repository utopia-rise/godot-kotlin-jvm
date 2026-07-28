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
        if (!it.location.isValid || it.location.textLength == 0) return@forEach
        registerProblem(
            it.location,
            it.message,
            it.highlightType,
            *it.quickFixes
        )
    }
}

fun List<GodotProblem>.withPhysicalAnchor(sourceElement: PsiElement): List<GodotProblem> =
    map { problem ->
        if (problem.location.isPhysical) {
            problem
        } else {
            val candidates = listOf(
                sourceElement.navigationElement,
                sourceElement.firstChild,
                sourceElement,
                problem.location.navigationElement,
                problem.location
            )
            GodotProblem(
                message = problem.message,
                location = candidates.firstOrNull { candidate -> candidate?.isPhysical == true }
                    ?: candidates.firstOrNull { candidate -> candidate?.isValid == true }
                    ?: sourceElement,
                quickFixes = problem.quickFixes,
                highlightType = problem.highlightType
            )
        }
    }

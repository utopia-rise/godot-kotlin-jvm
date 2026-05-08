package godot.intellij.plugin.inspection

import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiClass
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiMethod
import godot.intellij.plugin.analysis.GodotProblem
import godot.intellij.plugin.analysis.jvm.RegisterClassAnalyzer
import godot.intellij.plugin.analysis.jvm.RegisterMethodAnalyzer
import godot.intellij.plugin.analysis.registerProblems

class ScalaInspection : GodotInspection() {
    override fun getDisplayName(): String = "Scala registration checks"

    override fun checkElement(element: PsiElement, holder: ProblemsHolder, isOnTheFly: Boolean) {
        when (element) {
            is PsiClass -> holder.registerProblems(RegisterClassAnalyzer.analyze(element).withPhysicalAnchor(element))
            is PsiMethod -> holder.registerProblems(RegisterMethodAnalyzer.analyze(element).withPhysicalAnchor(element))
        }
    }

    private fun List<GodotProblem>.withPhysicalAnchor(sourceElement: PsiElement): List<GodotProblem> {
        return map { problem ->
            if (problem.location.isPhysical) {
                problem
            } else {
                GodotProblem(
                    message = problem.message,
                    location = physicalAnchor(sourceElement, problem.location),
                    quickFixes = problem.quickFixes,
                    highlightType = problem.highlightType
                )
            }
        }
    }

    private fun physicalAnchor(sourceElement: PsiElement, fallback: PsiElement): PsiElement {
        return listOf(
            sourceElement.navigationElement,
            sourceElement.firstChild,
            sourceElement,
            fallback.navigationElement,
            fallback
        ).firstOrNull { candidate -> candidate?.isPhysical == true }
            ?: listOf(
                sourceElement.navigationElement,
                sourceElement.firstChild,
                sourceElement,
                fallback.navigationElement,
                fallback
            ).firstOrNull { candidate -> candidate?.isValid == true }
            ?: sourceElement
    }
}

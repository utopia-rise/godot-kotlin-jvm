package godot.intellij.plugin.inspection

import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiElement
import godot.intellij.plugin.analysis.GodotProblem
import godot.intellij.plugin.analysis.jvm.GodotScriptAnalyzer
import godot.intellij.plugin.analysis.jvm.RegisterMethodAnalyzer
import godot.intellij.plugin.analysis.kotlin.PropertyHintAnalyzer
import godot.intellij.plugin.analysis.kotlin.RegisterAnalyzer
import godot.intellij.plugin.analysis.kotlin.VisibleAnalyzer
import godot.intellij.plugin.analysis.kotlin.EmitAnalyzer
import godot.intellij.plugin.analysis.kotlin.RpcAnnotationAnalyzer
import godot.intellij.plugin.analysis.kotlin.reference.CallFunctionReferenceAnalyzer
import godot.intellij.plugin.analysis.kotlin.reference.RpcFunctionReferenceAnalyzer
import godot.intellij.plugin.analysis.kotlin.reference.SignalFunctionReferenceAnalyzer
import godot.intellij.plugin.analysis.registerProblems
import org.jetbrains.kotlin.asJava.toLightMethods
import org.jetbrains.kotlin.psi.KtAnnotated
import org.jetbrains.kotlin.psi.KtCallableReferenceExpression
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.KtProperty

class KotlinInspection : GodotInspection() {
    override fun getDisplayName(): String = "Kotlin registration checks"

    override fun checkElement(element: PsiElement, holder: ProblemsHolder, isOnTheFly: Boolean) {
        when (element) {
            is KtClass -> {
                holder.registerProblems(GodotScriptAnalyzer.analyze(element).withPhysicalAnchor(element))
            }

            is KtProperty -> {
                holder.registerProblems(VisibleAnalyzer.analyze(element))
                holder.registerProblems(PropertyHintAnalyzer.analyze(element))
                holder.registerProblems(EmitAnalyzer.analyze(element))
            }

            is KtNamedFunction -> {
                element.toLightMethods().forEach { lightMethod ->
                    holder.registerProblems(RegisterMethodAnalyzer.analyze(lightMethod).withPhysicalAnchor(element))
                }
                holder.registerProblems(RegisterAnalyzer.analyze(element))
            }

            is KtCallableReferenceExpression -> {
                holder.registerProblems(SignalFunctionReferenceAnalyzer.analyze(element))
                holder.registerProblems(RpcFunctionReferenceAnalyzer.analyze(element))
                holder.registerProblems(CallFunctionReferenceAnalyzer.analyze(element))
            }

            is KtAnnotated -> {
                holder.registerProblems(RpcAnnotationAnalyzer.analyze(element))
            }
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


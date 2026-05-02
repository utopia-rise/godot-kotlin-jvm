package godot.intellij.plugin.inspection

import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiElement
import godot.intellij.plugin.analysis.kotlin.PropertyHintAnalyzer
import godot.intellij.plugin.analysis.kotlin.RegisterFunctionAnalyzer
import godot.intellij.plugin.analysis.kotlin.RegisterPropertyAnalyzer
import godot.intellij.plugin.analysis.kotlin.RegisterSignalAnalyzer
import godot.intellij.plugin.analysis.kotlin.RpcAnnotationAnalyzer
import godot.intellij.plugin.analysis.kotlin.reference.CallFunctionReferenceAnalyzer
import godot.intellij.plugin.analysis.kotlin.reference.RpcFunctionReferenceAnalyzer
import godot.intellij.plugin.analysis.kotlin.reference.SignalFunctionReferenceAnalyzer
import godot.intellij.plugin.analysis.registerProblems
import org.jetbrains.kotlin.psi.KtAnnotated
import org.jetbrains.kotlin.psi.KtCallableReferenceExpression
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.KtProperty

class KotlinInspection : GodotInspection() {
    override fun getDisplayName(): String = "Kotlin registration checks"

    override fun checkElements(elements: List<PsiElement>, holder: ProblemsHolder, isOnTheFly: Boolean) {
        elements.forEach { element ->
            when (element) {
                is KtProperty -> {
                    holder.registerProblems(RegisterPropertyAnalyzer.analyze(element))
                    holder.registerProblems(PropertyHintAnalyzer.analyze(element))
                    holder.registerProblems(RegisterSignalAnalyzer.analyze(element))
                }

                is KtNamedFunction -> {
                    holder.registerProblems(RegisterFunctionAnalyzer.analyze(element))
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
    }
}

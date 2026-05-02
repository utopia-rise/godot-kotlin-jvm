package godot.intellij.plugin.inspection

import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiClass
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiMethod
import godot.intellij.plugin.analysis.jvm.RegisterClassAnalyzer
import godot.intellij.plugin.analysis.jvm.RegisterMethodAnalyzer
import godot.intellij.plugin.analysis.registerProblems

class JvmInspection : GodotInspection() {
    override fun getDisplayName(): String = "JVM registration checks"

    override fun checkElements(elements: List<PsiElement>, holder: ProblemsHolder, isOnTheFly: Boolean) {
        elements.forEach { element ->
            when (element) {
                is PsiClass -> holder.registerProblems(RegisterClassAnalyzer.analyze(element))
                is PsiMethod -> holder.registerProblems(RegisterMethodAnalyzer.analyze(element))
            }
        }
    }
}

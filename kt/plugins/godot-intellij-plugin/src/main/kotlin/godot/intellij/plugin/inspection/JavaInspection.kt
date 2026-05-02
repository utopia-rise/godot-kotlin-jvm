package godot.intellij.plugin.inspection

import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiClass
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiMethod
import godot.intellij.plugin.analysis.jvm.RegisterClassAnalyzer
import godot.intellij.plugin.analysis.jvm.RegisterMethodAnalyzer
import godot.intellij.plugin.analysis.registerProblems

class JavaInspection : GodotInspection() {
    override fun getDisplayName(): String = "Java registration checks"

    override fun checkElement(element: PsiElement, holder: ProblemsHolder, isOnTheFly: Boolean) {
        when (element) {
            is PsiClass -> holder.registerProblems(RegisterClassAnalyzer.analyze(element))
            is PsiMethod -> holder.registerProblems(RegisterMethodAnalyzer.analyze(element))
        }
    }
}

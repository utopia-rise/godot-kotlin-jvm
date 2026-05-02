package godot.intellij.plugin.inspection

import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiElement
import godot.intellij.plugin.analysis.kotlin.CoreTypeCopyModificationAnalyzer
import godot.intellij.plugin.analysis.registerProblems
import org.jetbrains.kotlin.psi.KtBinaryExpression
import org.jetbrains.kotlin.psi.KtCallExpression

class CoreTypeCopyModificationInspection : GodotInspection() {
    override fun getDisplayName(): String = "Core type copy mutation checks"

    override fun getShortName(): String = "CoreTypeCopyModification"

    override fun checkElements(elements: List<PsiElement>, holder: ProblemsHolder, isOnTheFly: Boolean) {
        elements.forEach { element ->
            when (element) {
                is KtBinaryExpression -> holder.registerProblems(CoreTypeCopyModificationAnalyzer.analyzeAssignment(element))
                is KtCallExpression -> holder.registerProblems(CoreTypeCopyModificationAnalyzer.analyzeHelperCall(element))
            }
        }
    }
}

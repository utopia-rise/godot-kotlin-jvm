package godot.intellij.plugin.inspection

import com.intellij.codeInspection.LocalInspectionTool
import com.intellij.codeInspection.ProblemsHolder
import com.intellij.codeHighlighting.HighlightDisplayLevel
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementVisitor
import godot.intellij.plugin.project.isInGodotRoot

abstract class GodotInspection : LocalInspectionTool() {
    override fun getGroupDisplayName(): String = "Godot-JVM"

    override fun isEnabledByDefault(): Boolean = true

    override fun getDefaultLevel(): HighlightDisplayLevel = HighlightDisplayLevel.ERROR

    override fun buildVisitor(holder: ProblemsHolder, isOnTheFly: Boolean): PsiElementVisitor {
        return object : PsiElementVisitor() {
            override fun visitElement(element: PsiElement) {
                if (!element.isInGodotRoot()) return
                checkElement(element, holder, isOnTheFly)
            }
        }
    }

    abstract fun checkElement(element: PsiElement, holder: ProblemsHolder, isOnTheFly: Boolean)
}

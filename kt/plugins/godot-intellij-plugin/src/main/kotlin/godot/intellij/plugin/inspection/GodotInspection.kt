package godot.intellij.plugin.inspection

import com.intellij.codeInspection.LocalInspectionTool
import com.intellij.codeInspection.ProblemsHolder
import com.intellij.codeHighlighting.HighlightDisplayLevel
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementVisitor
import godot.intellij.plugin.project.isInGodotRoot
import org.jetbrains.kotlin.asJava.toLightElements
import org.jetbrains.kotlin.psi.KtElement

abstract class GodotInspection : LocalInspectionTool() {
    override fun getGroupDisplayName(): String = "Godot-JVM"

    override fun isEnabledByDefault(): Boolean = true

    override fun getDefaultLevel(): HighlightDisplayLevel = HighlightDisplayLevel.ERROR

    override fun buildVisitor(holder: ProblemsHolder, isOnTheFly: Boolean): PsiElementVisitor {
        return object : PsiElementVisitor() {
            override fun visitElement(element: PsiElement) {
                if (!element.isInGodotRoot()) return
                checkElements(buildInspectionElements(element), holder, isOnTheFly)
            }
        }
    }

    private fun buildInspectionElements(element: PsiElement): List<PsiElement> {
        if (element !is KtElement) {
            return listOf(element)
        }

        return buildList {
            add(element)
            addAll(element.toLightElements())
        }.distinct()
    }

    abstract fun checkElements(elements: List<PsiElement>, holder: ProblemsHolder, isOnTheFly: Boolean)
}

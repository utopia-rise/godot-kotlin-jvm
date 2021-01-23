package godot.intellij.plugin.inspections.registration.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project
import godot.intellij.plugin.ui.toolwindow.ClassNameRegisteredToolWindowManager

class ClassAlreadyRegisteredQuickFix(private val registeredClassName: String) : LocalQuickFix {
    override fun getFamilyName(): String = "Show classes registered with same name"

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        ClassNameRegisteredToolWindowManager.show(registeredClassName, project)
    }
}

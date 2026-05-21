package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project
import godot.annotation.RegisterFunction
import godot.intellij.plugin.GodotPluginBundle
import org.jetbrains.kotlin.scripting.resolve.classId
import org.jetbrains.kotlin.idea.util.addAnnotation
import org.jetbrains.kotlin.psi.KtNamedFunction

class FunctionNotRegisteredQuickFix : LocalQuickFix {
    override fun getFamilyName(): String = GodotPluginBundle.message("quickFix.function.notificationFunctionNotRegistered.familyName")

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        val ktNamedFunction = descriptor.psiElement as? KtNamedFunction
            ?: descriptor.psiElement.parent as? KtNamedFunction
            ?: return
        ktNamedFunction.addAnnotation(RegisterFunction::class.classId)
    }
}

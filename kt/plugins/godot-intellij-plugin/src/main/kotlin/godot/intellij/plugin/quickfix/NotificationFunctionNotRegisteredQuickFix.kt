package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.model.REGISTER_FUNCTION_ANNOTATION
import org.jetbrains.kotlin.idea.util.addAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtNamedFunction

class NotificationFunctionNotRegisteredQuickFix : LocalQuickFix {
    override fun getFamilyName(): String = GodotPluginBundle.message("quickFix.function.notificationFunctionNotRegistered.familyName")

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        val ktNamedFunction = descriptor.psiElement as KtNamedFunction
        ktNamedFunction.addAnnotation(FqName(REGISTER_FUNCTION_ANNOTATION))
    }
}

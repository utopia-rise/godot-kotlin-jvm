package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project
import org.jetbrains.kotlin.idea.util.addAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtNamedFunction

class NotificationFunctionNotRegisteredQuickFix : LocalQuickFix {
    override fun getFamilyName(): String {
        return "Add @RegisterFunction annotation"
    }

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        val ktNamedFunction = descriptor.psiElement as KtNamedFunction
        ktNamedFunction.addAnnotation(FqName("godot.annotation.RegisterFunction"))
    }
}

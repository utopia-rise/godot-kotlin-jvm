package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.project.asClassId
import godot.tools.common.names.Registration
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.idea.util.addAnnotation
import org.jetbrains.kotlin.psi.KtCallableReferenceExpression
import org.jetbrains.kotlin.psi.KtNamedFunction

class TargetFunctionHasNoRpcAnnotationQuickFix : LocalQuickFix {
    override fun getFamilyName(): String = GodotPluginBundle.message("quickFix.function.connectedFunctionHasNoRpcAnnotationRegistered.familyName")

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        val ktNamedFunction = (descriptor.psiElement as? KtCallableReferenceExpression)
            ?.callableReference
            ?.mainReference
            ?.resolve() as? KtNamedFunction

        ktNamedFunction?.addAnnotation(Registration.rpc.asClassId())
    }
}

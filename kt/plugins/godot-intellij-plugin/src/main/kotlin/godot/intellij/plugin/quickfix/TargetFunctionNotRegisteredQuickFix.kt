package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.model.GODOT_MEMBER_ANNOTATION
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.idea.util.addAnnotation
import org.jetbrains.kotlin.name.FqName

import org.jetbrains.kotlin.psi.KtCallableReferenceExpression
import org.jetbrains.kotlin.psi.KtNamedFunction

class TargetFunctionNotRegisteredQuickFix : LocalQuickFix {
    override fun getFamilyName(): String = GodotPluginBundle.message("quickFix.function.connectedFunctionNotRegistered.familyName")

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        val ktNamedFunction = (descriptor.psiElement as? KtCallableReferenceExpression)
            ?.callableReference
            ?.mainReference
            ?.resolve() as? KtNamedFunction

        ktNamedFunction?.addAnnotation(FqName(GODOT_MEMBER_ANNOTATION))
    }
}

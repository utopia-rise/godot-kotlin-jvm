package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.project.asClassId
import godot.tools.common.names.Annotation
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.psi.KtCallableReferenceExpression
import org.jetbrains.kotlin.psi.KtNamedFunction

class TargetFunctionsRpcAnnotationHasRpcModeDisabled : LocalQuickFix {
    override fun getFamilyName(): String = GodotPluginBundle.message("quickFix.function.connectedFunctionsRpcAnnotationHasRpcModeDisabled.familyName")

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        val ktNamedFunction = (descriptor.psiElement as? KtCallableReferenceExpression)
            ?.callableReference
            ?.mainReference
            ?.resolve() as? KtNamedFunction

        val rpcAnnotationValueArgumentList = ktNamedFunction
            ?.findAnnotation(Annotation.rpc.asClassId())
            ?.valueArgumentList

        val rpcModeValueArgument = rpcAnnotationValueArgumentList
            ?.arguments
            ?.firstOrNull { it.isNamed() && it.getArgumentName()?.text == "rpcMode" }
            ?: rpcAnnotationValueArgumentList
                ?.arguments
                ?.getOrNull(0)

        rpcModeValueArgument?.let { rpcAnnotationValueArgumentList?.removeArgument(it) }
    }
}

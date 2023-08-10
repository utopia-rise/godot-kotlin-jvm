package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.model.RPC_ANNOTATION
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.FqName

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
            ?.findAnnotation(FqName(RPC_ANNOTATION))
            ?.valueArgumentList

        val rpcModeValueArgument = rpcAnnotationValueArgumentList
            ?.arguments
            ?.firstOrNull { it.isNamed() && it.getArgumentName()?.text == "rpcMode" } // named; so position is not relevant
            ?: rpcAnnotationValueArgumentList
                ?.arguments
                ?.getOrNull(0) // not named; so getting by argument position

        rpcModeValueArgument?.let { rpcAnnotationValueArgumentList?.removeArgument(it) }
    }
}

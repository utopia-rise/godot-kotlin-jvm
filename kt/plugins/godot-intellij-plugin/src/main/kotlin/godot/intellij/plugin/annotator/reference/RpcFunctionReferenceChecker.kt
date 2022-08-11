package godot.intellij.plugin.annotator.reference

import com.intellij.lang.annotation.AnnotationHolder
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.model.REGISTER_FUNCTION_ANNOTATION
import godot.intellij.plugin.extension.getKotlinFqName
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.quickfix.TargetFunctionNotRegisteredQuickFix
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.nj2k.postProcessing.resolve
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtCallableReferenceExpression
import org.jetbrains.kotlin.psi.KtNameReferenceExpression
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.KtValueArgument
import org.jetbrains.kotlin.psi.psiUtil.containingClass
import org.jetbrains.kotlin.psi.psiUtil.getChildOfType
import org.jetbrains.kotlin.utils.addToStdlib.firstIsInstanceOrNull

object RpcFunctionReferenceChecker {
    private val rpcFunctionNames = listOf(
        "rpc",
        "rpcId",
        "rpcUnreliable",
        "rpcUnreliableId",
    )

    fun checkRpcTargetFunction(element: KtCallableReferenceExpression, holder: AnnotationHolder) {
        val relevantParent = element.parent.parent.parent
        val callReference = relevantParent.children.firstIsInstanceOrNull<KtNameReferenceExpression>()
        if (
            relevantParent is KtCallExpression &&
            rpcFunctionNames.contains(callReference?.text) &&
            (callReference?.resolve() as? KtNamedFunction)?.containingClass()?.fqName?.asString() == "godot.Node"
        ) {
            val targetFunction = element
                .callableReference
                .resolve() as? KtNamedFunction

            val registerFunctionAnnotation = targetFunction?.findAnnotation(FqName(REGISTER_FUNCTION_ANNOTATION))
            if (targetFunction != null && registerFunctionAnnotation == null) {
                holder.registerProblem(
                    GodotPluginBundle.message("problem.rpc.calledFunctionNotRegistered"),
                    element,
                    TargetFunctionNotRegisteredQuickFix()
                )
            } else {
                if (
                    registerFunctionAnnotation?.valueArguments?.isEmpty() == true ||
                    registerFunctionAnnotation
                        ?.valueArgumentList
                        ?.getChildOfType<KtValueArgument>()
                        ?.getArgumentExpression()
                        ?.getChildOfType<KtNameReferenceExpression>()
                        ?.resolve()
                        ?.getKotlinFqName()
                        ?.asString() == "godot.MultiplayerAPI.RPCMode.DISABLED"
                ) {
                    holder.registerProblem(
                        GodotPluginBundle.message("problem.rpc.calledFunctionNotAccessible"),
                        element
                    )
                }
            }
        }
    }
}

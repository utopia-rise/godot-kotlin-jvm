package godot.intellij.plugin.analysis.kotlin.reference

import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.GodotProblem
import godot.intellij.plugin.project.asClassId
import godot.intellij.plugin.quickfix.TargetFunctionHasNoRpcAnnotationQuickFix
import godot.intellij.plugin.quickfix.TargetFunctionNotRegisteredQuickFix
import godot.intellij.plugin.quickfix.TargetFunctionsRpcAnnotationHasRpcModeDisabled
import godot.tools.common.names.API
import godot.tools.common.names.Annotation
import godot.tools.common.names.qualifiedName
import org.jetbrains.kotlin.idea.base.psi.kotlinFqName
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtCallableReferenceExpression
import org.jetbrains.kotlin.psi.KtNameReferenceExpression
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.psiUtil.containingClass
import org.jetbrains.kotlin.psi.psiUtil.getChildrenOfType
import org.jetbrains.kotlin.utils.addToStdlib.firstIsInstanceOrNull

object RpcFunctionReferenceAnalyzer {
    private val targetFunctionNotRegisteredQuickFix by lazy { TargetFunctionNotRegisteredQuickFix() }
    private val targetFunctionHasNoRpcAnnotationQuickFix by lazy { TargetFunctionHasNoRpcAnnotationQuickFix() }
    private val targetFunctionsRpcAnnotationHasRpcModeDisabled by lazy { TargetFunctionsRpcAnnotationHasRpcModeDisabled() }

    fun analyze(element: KtCallableReferenceExpression): List<GodotProblem> {
        val relevantParent = element.parent.parent.parent
        val callReference = relevantParent.children.firstIsInstanceOrNull<KtNameReferenceExpression>()
        if (
            relevantParent is KtCallExpression &&
            API.rpcFunctions.any { it.simpleName == callReference?.text } &&
            (callReference?.mainReference?.resolve() as? KtNamedFunction)?.containingClass()?.fqName?.asString() == API.node.qualifiedName
        ) {
            val targetFunction = element
                .callableReference
                .mainReference
                .resolve() as? KtNamedFunction

            val registerFunctionAnnotation = targetFunction?.findAnnotation(Annotation.register.asClassId())
            val rpcAnnotation = targetFunction?.findAnnotation(Annotation.rpc.asClassId())

            when {
                targetFunction != null && registerFunctionAnnotation == null -> {
                    return listOf(
                        GodotProblem(
                            GodotPluginBundle.message("problem.rpc.calledFunctionNotRegistered"),
                            element,
                            arrayOf(targetFunctionNotRegisteredQuickFix)
                        )
                    )
                }

                targetFunction != null && rpcAnnotation == null -> {
                    return listOf(
                        GodotProblem(
                            GodotPluginBundle.message("problem.rpc.calledFunctionHasNoRpcAnnotation"),
                            element,
                            arrayOf(targetFunctionHasNoRpcAnnotationQuickFix)
                        )
                    )
                }

                else -> {
                    val rpcModeValueArgument = rpcAnnotation
                        ?.valueArgumentList
                        ?.arguments
                        ?.firstOrNull { it.isNamed() && it.getArgumentName()?.text == "rpcMode" } // named; so position is not relevant
                        ?: rpcAnnotation
                            ?.valueArgumentList
                            ?.arguments
                            ?.getOrNull(0) // not named; so getting by argument position

                    if (
                        rpcModeValueArgument
                            ?.getArgumentExpression()
                            ?.getChildrenOfType<KtNameReferenceExpression>()
                            ?.lastOrNull()
                            ?.mainReference
                            ?.resolve()
                            ?.kotlinFqName
                            ?.asString() == API.rpcModeDisabled.qualifiedName
                    ) {
                        return listOf(
                            GodotProblem(
                                GodotPluginBundle.message("problem.rpc.calledFunctionNotAccessible"),
                                element,
                                arrayOf(targetFunctionsRpcAnnotationHasRpcModeDisabled)
                            )
                        )
                    }
                }
            }
        }

        return emptyList()
    }
}

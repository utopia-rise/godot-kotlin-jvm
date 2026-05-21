package godot.intellij.plugin.analysis.kotlin

import com.intellij.codeInspection.ProblemHighlightType
import godot.annotation.Rpc
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.GodotProblem
import org.jetbrains.kotlin.scripting.resolve.classId
import godot.intellij.plugin.quickfix.TransferModeIgnoresChannelQuickFix
import godot.tools.common.constants.transferModeUnreliableOrdered
import org.jetbrains.kotlin.idea.base.psi.kotlinFqName
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.psi.KtAnnotated
import org.jetbrains.kotlin.psi.KtNameReferenceExpression
import org.jetbrains.kotlin.psi.psiUtil.getChildOfType

object RpcAnnotationAnalyzer {
    private val transferModeIgnoresChannelQuickFix = TransferModeIgnoresChannelQuickFix()

    fun analyze(element: KtAnnotated): List<GodotProblem> {
        val rpcAnnotation = element.findAnnotation(Rpc::class.classId) ?: return emptyList()
        val valueArgumentList = rpcAnnotation.valueArgumentList ?: return emptyList()

        val transferModeValueArgument = valueArgumentList
            .arguments
            .firstOrNull { it.isNamed() && it.getArgumentName()?.text == "transferMode" }
            ?: valueArgumentList.arguments.getOrNull(2)

        val isTransferModeUnreliableOrdered = transferModeValueArgument
            ?.getArgumentExpression()
            ?.getChildOfType<KtNameReferenceExpression>()
            ?.mainReference
            ?.resolve()
            ?.kotlinFqName
            ?.asString() == transferModeUnreliableOrdered

        val channelElement = valueArgumentList
            .arguments
            .firstOrNull { it.isNamed() && it.getArgumentName()?.text == "transferChannel" }
            ?: valueArgumentList.arguments.getOrNull(3)

        val channel = (if (channelElement?.isNamed() == true) {
            channelElement.text.substringAfterLast("=").trim()
        } else {
            channelElement?.text
        })
            ?.removeSurrounding("\"")
            ?.toIntOrNull() ?: 0

        if (channelElement != null && !isTransferModeUnreliableOrdered && channel != 0) {
            return listOf(
                GodotProblem(
                    GodotPluginBundle.message("problem.function.rpcChannelSetWhenTransferTypeIgnoresIt"),
                    channelElement,
                    arrayOf(transferModeIgnoresChannelQuickFix),
                    ProblemHighlightType.WEAK_WARNING
                )
            )
        }

        return emptyList()
    }
}

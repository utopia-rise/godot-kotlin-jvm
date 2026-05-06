package godot.intellij.plugin.analysis.kotlin

import com.intellij.codeInspection.ProblemHighlightType
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.GodotProblem
import godot.intellij.plugin.project.asClassId
import godot.intellij.plugin.quickfix.TransferModeIgnoresChannelQuickFix
import godot.tools.common.names.Annotation
import godot.tools.common.names.API
import godot.tools.common.names.qualifiedName
import org.jetbrains.kotlin.idea.base.psi.kotlinFqName
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.psi.KtAnnotated
import org.jetbrains.kotlin.psi.KtNameReferenceExpression
import org.jetbrains.kotlin.psi.psiUtil.getChildOfType

object RpcAnnotationAnalyzer {
    private val transferModeIgnoresChannelQuickFix = TransferModeIgnoresChannelQuickFix()

    fun analyze(element: KtAnnotated): List<GodotProblem> {
        val rpcAnnotation = element.findAnnotation(Annotation.rpc.asClassId()) ?: return emptyList()
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
            ?.asString() == API.transferModeUnreliableOrdered.qualifiedName

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

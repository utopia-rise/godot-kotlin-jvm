package godot.intellij.plugin.annotator.function

import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.model.RPC_ANNOTATION
import godot.intellij.plugin.extension.isInGodotRoot
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.quickfix.TransferModeIgnoresChannelQuickFix
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.godotAnnotationPackage
import org.jetbrains.kotlin.idea.base.utils.fqname.getKotlinFqName
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.nj2k.postProcessing.resolve
import org.jetbrains.kotlin.psi.KtAnnotated
import org.jetbrains.kotlin.psi.KtNameReferenceExpression
import org.jetbrains.kotlin.psi.psiUtil.getChildOfType

class RpcAnnotator : Annotator {
    private val transferModeIgnoresChannelQuickFix by lazy { TransferModeIgnoresChannelQuickFix() }

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (!element.isInGodotRoot()) return

        if (element is KtAnnotated && element.findAnnotation(FqName(RPC_ANNOTATION)) != null) {
            val valueArgumentList = element.findAnnotation(FqName(RPC_ANNOTATION))?.valueArgumentList ?: return

            val transferModeValueArgument = valueArgumentList
                .arguments
                .firstOrNull { it.isNamed() && it.getArgumentName()?.text == "transferMode" } // named; so position is not relevant
                ?: valueArgumentList
                    .arguments
                    .getOrNull(2) // not named; so getting by argument position

            val isTransferModeUnreliableOrdered = transferModeValueArgument
                ?.getArgumentExpression()
                ?.getChildOfType<KtNameReferenceExpression>()
                ?.mainReference
                ?.resolve()
                ?.getKotlinFqName()
                ?.asString() == "$godotAnnotationPackage.${GodotKotlinJvmTypes.transferMode}.UNRELIABLE_ORDERED"

            val channelElement = valueArgumentList
                .arguments
                .firstOrNull { it.isNamed() && it.getArgumentName()?.text == "transferChannel" } // named; so position is not relevant
                ?: valueArgumentList
                    .arguments
                    .getOrNull(3)// not named; so getting by argument position

            val channel = if (channelElement?.isNamed() == true) {
                channelElement.text.substringAfterLast("=").trim()
            } else {
                channelElement?.text
            }
                ?.removeSurrounding("\"")
                ?.toIntOrNull() ?: 0

            if (channelElement != null && !isTransferModeUnreliableOrdered && channel != 0) {
                holder.registerProblem(
                    message = GodotPluginBundle.message("problem.function.rpcChannelSetWhenTransferTypeIgnoresIt"),
                    errorLocation = channelElement,
                    quickFixes = arrayOf(transferModeIgnoresChannelQuickFix),
                    problemHighlightType = ProblemHighlightType.WEAK_WARNING
                )
            }
        }
    }
}

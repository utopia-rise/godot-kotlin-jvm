package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project
import godot.intellij.plugin.GodotPluginBundle
import org.jetbrains.kotlin.psi.KtValueArgument
import org.jetbrains.kotlin.psi.KtValueArgumentList

class TransferModeIgnoresChannelQuickFix : LocalQuickFix {
    override fun getFamilyName(): String = GodotPluginBundle.message("quickFix.function.rpcTransferModeIgnoresChannel.familyName")

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        val channelValueArgument = descriptor.psiElement as? KtValueArgument ?: return
        (channelValueArgument.parent as? KtValueArgumentList)?.removeArgument(channelValueArgument)
    }
}

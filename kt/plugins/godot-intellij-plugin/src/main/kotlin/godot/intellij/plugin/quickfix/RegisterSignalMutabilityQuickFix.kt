package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.NotNullLazyValue
import godot.intellij.plugin.GodotPluginBundle
import org.jetbrains.kotlin.psi.KtPsiFactory

class RegisterSignalMutabilityQuickFix : LocalQuickFix {
    override fun getFamilyName(): String = GodotPluginBundle.message("quickFix.signal.mutability.familyName")

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        if (descriptor.psiElement.text == "var") {
            val factory = KtPsiFactory(project)
            descriptor.psiElement.replace(factory.createValKeyword())
        } else {
            val signalName = descriptor.psiElement.nextSibling.text
            Notifications.Bus.notify(
                NOTIFICATION_GROUP.value
                    .createNotification(
                        GodotPluginBundle.message("notification.signal.mutability.error.title"),
                        GodotPluginBundle.message("notification.signal.mutability.error.content", signalName),
                        NotificationType.ERROR,
                        null
                    )
            )
        }
    }

    companion object {
        private val NOTIFICATION_GROUP = object : NotNullLazyValue<NotificationGroup>() {
            override fun compute(): NotificationGroup {
                return NotificationGroup(
                    GodotPluginBundle.message("notification.group.error"),
                    NotificationDisplayType.STICKY_BALLOON,
                    true
                )
            }
        }
    }
}

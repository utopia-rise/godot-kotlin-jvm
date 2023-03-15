package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.notification.NotificationGroupManager
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.project.Project
import godot.intellij.plugin.GodotPluginBundle
import org.jetbrains.kotlin.psi.KtPsiFactory

class RegisterPropertyMutabilityQuickFix : LocalQuickFix {
    override fun getFamilyName(): String = GodotPluginBundle.message("quickFix.property.mutability.familyName")

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        if (descriptor.psiElement.text == "val") {
            val factory = KtPsiFactory(project)
            descriptor.psiElement.replace(factory.createVarKeyword())
        } else {
            val propertyName = descriptor.psiElement.nextSibling.text
            @Suppress("DialogTitleCapitalization")
            Notifications.Bus.notify(
                NotificationGroupManager
                    .getInstance()
                    .getNotificationGroup(GodotPluginBundle.message("notification.group.error"))
                    .createNotification(
                        GodotPluginBundle.message("notification.property.mutability.error.title"),
                        GodotPluginBundle.message("notification.property.mutability.error.content", propertyName),
                        NotificationType.ERROR,
                    )
            )
        }
    }
}

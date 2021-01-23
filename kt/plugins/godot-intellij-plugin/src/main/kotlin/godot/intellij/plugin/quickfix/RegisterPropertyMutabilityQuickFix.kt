package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.NotNullLazyValue
import org.jetbrains.kotlin.psi.KtPsiFactory

class RegisterPropertyMutabilityQuickFix : LocalQuickFix {
    override fun getFamilyName(): String {
        return "Make property mutable"
    }

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        if (descriptor.psiElement.text == "val") {
            val factory = KtPsiFactory(project)
            descriptor.psiElement.replace(factory.createVarKeyword())
        } else {
            val propertyName = descriptor.psiElement.nextSibling.text
            Notifications.Bus.notify(
                NOTIFICATION_GROUP.value
                    .createNotification(
                        "@RegisterProperty Quick Fix",
                        "Could not change the mutability of property $propertyName. Change it manually",
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
                    "Error message",
                    NotificationDisplayType.STICKY_BALLOON,
                    true
                )
            }
        }
    }
}

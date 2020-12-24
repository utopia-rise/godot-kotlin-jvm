package godot.intellij.plugin.inspections

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.codeInspection.ProblemsHolder
import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.NotNullLazyValue
import com.intellij.psi.PsiElementVisitor
import org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtPsiFactory
import org.jetbrains.kotlin.psi.propertyVisitor

class RegisterPropertiesInspection : AbstractKotlinInspection() {
    private val quickFix = RegisterPropertyMutabilityQuickFix()

    override fun buildVisitor(holder: ProblemsHolder, isOnTheFly: Boolean): PsiElementVisitor {
        return propertyVisitor { ktProperty ->
            if (ktProperty.findAnnotation(FqName("godot.annotation.RegisterProperty")) != null) {
                if (!ktProperty.isVar) {
                    holder.registerProblem(ktProperty.valOrVarKeyword, "Registered properties have to be mutable", quickFix)
                }
            }
        }
    }

}

private class RegisterPropertyMutabilityQuickFix : LocalQuickFix {
    override fun getFamilyName(): String {
        return "Make property mutable"
    }

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        if (descriptor.psiElement.text == "val") {
            val factory = KtPsiFactory(project)
            descriptor.psiElement.replace(factory.createVarKeyword())
        } else {
            Notifications.Bus.notify(
                NOTIFICATION_GROUP.value
                    .createNotification(
                        "Register Property Quick Fix",
                        "Could not change the mutability of property. Change it manually",
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

package godot.intellij.plugin.gradle

import com.intellij.openapi.externalSystem.model.task.ExternalSystemTaskId
import com.intellij.openapi.externalSystem.model.task.ExternalSystemTaskNotificationListenerAdapter
import com.intellij.openapi.externalSystem.model.task.ExternalSystemTaskType.RESOLVE_PROJECT
import godot.intellij.plugin.notification.SettingsFetchingNotification
import org.jetbrains.kotlin.idea.configuration.GRADLE_SYSTEM_ID

class GradleSystemListener : ExternalSystemTaskNotificationListenerAdapter(null) {
    override fun onStart(
        id: ExternalSystemTaskId,
        workingDir: String,
    ) {
        if (id.projectSystemId == GRADLE_SYSTEM_ID && id.type == RESOLVE_PROJECT) {
            // Gradle sync just started, pause our existing import if one is happening.
            id.findProject()?.let { project ->
                GodotKotlinJvmSettings.close()
                SettingsFetchingNotification.getInstance(project).unconfiguredReason =
                    SettingsFetchingNotification.UnconfiguredReason.GradleSyncing
            }
        }
    }

    override fun onFailure(id: ExternalSystemTaskId, e: Exception) {
        if (id.projectSystemId == GRADLE_SYSTEM_ID && id.type == RESOLVE_PROJECT) {
            // Gradle sync failed, pause our existing import if one is happening and hide our message banner
            id.findProject()?.let { project ->
                GodotKotlinJvmSettings.close()
                SettingsFetchingNotification.getInstance(project).hide()
            }
        }
    }
}

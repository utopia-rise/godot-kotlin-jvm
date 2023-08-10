package godot.intellij.plugin.gradle

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.externalSystem.model.ExternalSystemException
import com.intellij.openapi.externalSystem.service.execution.ExternalSystemJdkUtil
import com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil
import com.intellij.openapi.module.Module
import com.intellij.openapi.progress.EmptyProgressIndicator
import com.intellij.openapi.progress.ProgressIndicator
import com.intellij.openapi.progress.ProgressManager
import com.intellij.openapi.progress.Task
import com.intellij.ui.EditorNotifications
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.notification.SettingsFetchingNotification
import godot.plugins.common.GodotKotlinJvmPropertiesFile
import org.jetbrains.plugins.gradle.service.execution.GradleExecutionHelper
import org.jetbrains.plugins.gradle.settings.DistributionType
import org.jetbrains.plugins.gradle.settings.GradleExecutionSettings
import java.io.File

/**
 * Loads the users configuration of our gradle extension for each module it is configured and provides it
 *
 * This setup is inspired by https://github.com/cashapp/sqldelight/blob/4b3602ca6a38887683249554c8f71f97ada04bf2/sqldelight-idea-plugin/src/main/kotlin/app/cash/sqldelight/intellij/gradle/FileIndexMap.kt
 */
internal object GodotKotlinJvmSettings {
    private var fetchThread: Thread? = null
    private val settingsPerModule = mutableMapOf<String, GodotKotlinJvmPropertiesFile>()
    private val defaultSettings: GodotKotlinJvmPropertiesFile = object : GodotKotlinJvmPropertiesFile {}

    private var initialized = false
    private var retries = 0

    fun close() {
        fetchThread?.interrupt()
        fetchThread = null
        initialized = false
        settingsPerModule.clear()
        retries = 0
    }

    operator fun get(module: Module?): GodotKotlinJvmPropertiesFile {
        if (module == null) return defaultSettings
        val projectPath = ExternalSystemApiUtil.getExternalProjectPath(module) ?: return defaultSettings

        val result = settingsPerModule[projectPath]
        if (result != null) return result

        ApplicationManager.getApplication().invokeLater {
            synchronized(this) {
                if (!initialized) {
                    initialized = true

                    if (!module.isDisposed && !module.project.isDisposed) {
                        try {
                            ProgressManager.getInstance().runProcessWithProgressAsynchronously(
                                FetchModuleModels(module, projectPath),
                                EmptyProgressIndicator().apply { start() },
                            )
                        } catch (e: Throwable) {
                            // IntelliJ can fail to start the fetch command, reinitialize later in this case.
                            if (retries++ < 3) {
                                initialized = false
                            }
                        }
                    }
                }
            }
        }
        return settingsPerModule[projectPath] ?: defaultSettings
    }

    private class FetchModuleModels(
        private val module: Module,
        private val projectPath: String,
    ) : Task.Backgroundable(
        /* project = */
        module.project,
        /* title = */
        GodotPluginBundle.message("settingsIndex.action.title", module.name),
    ) {
        override fun run(indicator: ProgressIndicator) {
            SettingsFetchingNotification.getInstance(module.project).unconfiguredReason =
                SettingsFetchingNotification.UnconfiguredReason.Syncing

            val executionSettings = GradleExecutionSettings(
                /* gradleHome = */
                null,
                /* serviceDirectory = */
                null,
                /* distributionType = */
                DistributionType.DEFAULT_WRAPPED,
                /* isOfflineWork = */
                false,
            )

            try {
                val properties = GradleExecutionHelper().execute(projectPath, executionSettings) { connection ->
                    fetchThread = Thread.currentThread()
                    if (!initialized) return@execute emptyMap()

                    val javaHomePath = ExternalSystemJdkUtil.getJavaHome()
                        ?: ExternalSystemJdkUtil.getAvailableJdk(project).second.homePath
                    val javaHome = javaHomePath?.let { File(it) }

                    connection
                        .action(FetchProjectModelsBuildAction)
                        .setJavaHome(javaHome)
                        .run()
                }

                properties.mapValues { (_, value) ->
                    val compatibility = GradleCompatibility.validate(value)

                    if (compatibility is GradleCompatibility.CompatibilityReport.Incompatible) {
                        SettingsFetchingNotification.getInstance(project).unconfiguredReason =
                            SettingsFetchingNotification.UnconfiguredReason.Incompatible(compatibility.reason, null)
                    } else {
                        settingsPerModule.putAll(properties)
                        SettingsFetchingNotification.getInstance(project).hide()
                    }
                }
                EditorNotifications.getInstance(module.project).updateAllNotifications()
            } catch (externalException: ExternalSystemException) {
                // Expected interrupt from calling close() on the index.
                if (externalException.rootCause() !is InterruptedException) {
                    // It's a gradle error, ignore and let the user fix when they try and build the project

                    SettingsFetchingNotification.getInstance(project).unconfiguredReason =
                        SettingsFetchingNotification.UnconfiguredReason.Incompatible(
                            GodotPluginBundle.message("settingsIndex.error.connectionFailed"),
                            externalException,
                        )
                }
            } finally {
                fetchThread = null
                initialized = false
            }
        }
    }

    private fun Throwable.rootCause(): Throwable = cause?.rootCause() ?: this
}

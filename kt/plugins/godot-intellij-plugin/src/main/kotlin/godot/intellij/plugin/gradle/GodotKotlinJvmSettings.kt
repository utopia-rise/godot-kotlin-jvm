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
import godot.intellij.plugin.notification.FileIndexingNotification
import godot.plugins.common.GodotKotlinJvmPropertiesFile
import godot.plugins.common.GodotKotlinJvmPropertiesFileImpl
import org.jetbrains.plugins.gradle.service.execution.GradleExecutionHelper
import org.jetbrains.plugins.gradle.settings.DistributionType
import org.jetbrains.plugins.gradle.settings.GradleExecutionSettings
import java.io.File

internal object GodotKotlinJvmSettings {
    private var fetchThread: Thread? = null
    private val fileIndices = mutableMapOf<String, GodotKotlinJvmPropertiesFile>()
    private val defaultIndex: GodotKotlinJvmPropertiesFile = GodotKotlinJvmPropertiesFileImpl()

    private var initialized = false
    private var retries = 0

    fun close() {
        fetchThread?.interrupt()
        fetchThread = null
        initialized = false
        fileIndices.clear()
        retries = 0
    }

    operator fun get(module: Module?): GodotKotlinJvmPropertiesFile {
        if (module == null) return defaultIndex
        val projectPath = ExternalSystemApiUtil.getExternalProjectPath(module) ?: return defaultIndex
        val result = fileIndices[projectPath]
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
        return fileIndices[projectPath] ?: defaultIndex
    }

    private class FetchModuleModels(
        private val module: Module,
        private val projectPath: String,
    ) : Task.Backgroundable(
        /* project = */
        module.project,
        /* title = */
        "Importing ${module.name} GodotKotlinJvm",
    ) {
        override fun run(indicator: ProgressIndicator) {
            FileIndexingNotification.getInstance(module.project).unconfiguredReason = FileIndexingNotification.UnconfiguredReason.Syncing

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
                fileIndices.putAll(
                    GradleExecutionHelper().execute(projectPath, executionSettings) { connection ->
                        fetchThread = Thread.currentThread()
                        if (!initialized) return@execute emptyMap()

                        val javaHome = (
                            ExternalSystemJdkUtil.getJavaHome()
                                ?: ExternalSystemJdkUtil.getAvailableJdk(project).second.homePath
                            )?.let { File(it) }

                        connection
                            .action(FetchProjectModelsBuildAction)
                            .setJavaHome(javaHome)
                            .run()
                    },
                )
                FileIndexingNotification.getInstance(project).hide()
                EditorNotifications.getInstance(module.project).updateAllNotifications()
            } catch (externalException: ExternalSystemException) {
                // Expected interrupt from calling close() on the index.
                if (externalException.rootCause() !is InterruptedException) {
                    // It's a gradle error, ignore and let the user fix when they try and build the project

                    FileIndexingNotification.getInstance(project).unconfiguredReason =
                        FileIndexingNotification.UnconfiguredReason.Incompatible(
                            """
                                Connecting with the GodotKotlinJvm plugin failed: try building from the command line.
                            """.trimIndent(),
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

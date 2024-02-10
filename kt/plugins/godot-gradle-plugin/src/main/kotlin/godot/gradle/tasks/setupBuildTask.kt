package godot.gradle.tasks

import godot.gradle.projectExt.godotJvmExtension
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.setupBuildTask(
    packageUsercodeJarTask: TaskProvider<out Task>,
    deleteBuildLockTask: TaskProvider<out Task>,
    packageUsercodeDexJarTask: TaskProvider<out Task>,
    createGraalNativeImageTask: TaskProvider<out Task>,
    createIOSTask: TaskProvider<out Task>,
    createBuildLockTask: TaskProvider<out Task>,
    generateGdIgnoreFilesTask: TaskProvider<out Task>,
) {
    tasks.named("build") {
        with(it) {
            dependsOn(
                createBuildLockTask,
                packageUsercodeJarTask,
                generateGdIgnoreFilesTask
            )

            finalizedBy(deleteBuildLockTask)
            if (godotJvmExtension.isAndroidExportEnabled.get()) {
                finalizedBy(packageUsercodeDexJarTask)
            }
            if (godotJvmExtension.isGraalNativeImageExportEnabled.get()) {
                finalizedBy(createGraalNativeImageTask)
            }
            if (godotJvmExtension.isIOSExportEnabled.get()) {
                require(godotJvmExtension.isGraalNativeImageExportEnabled.get()) {
                    "GraalVM should be enabled when exporting for ios."
                }
                finalizedBy(createIOSTask)
            }
        }
    }
}

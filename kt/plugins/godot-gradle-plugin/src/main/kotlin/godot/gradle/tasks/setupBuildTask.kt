package godot.gradle.tasks

import godot.gradle.projectExt.godotJvmExtension
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.setupBuildTask(
    packageBootstrapJarTask: TaskProvider<out Task>,
    packageMainJarTask: TaskProvider<out Task>,
    deleteBuildLockTask: TaskProvider<out Task>,
    packageBootstrapDexJarTask: TaskProvider<out Task>,
    packageMainDexJarTask: TaskProvider<out Task>,
    createGraalNativeImageTask: TaskProvider<out Task>,
    createIOSTask: TaskProvider<out Task>,
    createBuildLockTask: TaskProvider<out Task>,
    generateGdIgnoreFilesTask: TaskProvider<out Task>,
) {
    tasks.named("build") {
        with(it) {
            dependsOn(
                createBuildLockTask,
                packageBootstrapJarTask,
                packageMainJarTask,
                generateGdIgnoreFilesTask
            )

            finalizedBy(deleteBuildLockTask)
            if (godotJvmExtension.isAndroidExportEnabled.get()) {
                finalizedBy(packageBootstrapDexJarTask, packageMainDexJarTask)
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

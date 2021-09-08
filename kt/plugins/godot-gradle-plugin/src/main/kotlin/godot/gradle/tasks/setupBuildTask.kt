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
    createBuildLockTask: TaskProvider<out Task>
) {
    tasks.named("build") {
        with(it) {
            dependsOn(createBuildLockTask, packageUsercodeJarTask)
            finalizedBy(deleteBuildLockTask)
            if (godotJvmExtension.isAndroidExportEnabled.get()) {
                finalizedBy(packageUsercodeDexJarTask)
            }
            if (godotJvmExtension.isGraalNativeImageExportEnabled.get()) {
                finalizedBy(createGraalNativeImageTask)
            }
        }
    }
}

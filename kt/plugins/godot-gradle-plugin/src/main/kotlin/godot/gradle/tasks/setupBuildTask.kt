package godot.gradle.tasks

import godot.gradle.projectExt.godotJvmExtension
import org.gradle.api.Project
import org.gradle.api.Task

fun Project.setupBuildTask(
    packageBootstrapJarTask: Task,
    packageMainJarTask: Task,
    generateEntryServiceFileTask: Task,
    deleteBuildLockTask: Task,
    packageBootstrapDexJarTask: Task,
    packageMainDexJarTask: Task,
    createGraalNativeImageTask: Task,
    createBuildLockTask: Task
) {
    with(tasks.getByName("build")) {
        dependsOn(createBuildLockTask, packageBootstrapJarTask, packageMainJarTask, generateEntryServiceFileTask)
        finalizedBy(deleteBuildLockTask)
        if (godotJvmExtension.isAndroidExportEnabled.get()) {
            finalizedBy(packageBootstrapDexJarTask, packageMainDexJarTask)
        }
        if (godotJvmExtension.isGraalNativeImageExportEnabled.get()) {
            finalizedBy(createGraalNativeImageTask)
        }
    }
}

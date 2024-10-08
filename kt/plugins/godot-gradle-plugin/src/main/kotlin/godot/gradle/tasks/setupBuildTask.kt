package godot.gradle.tasks

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import godot.gradle.projectExt.godotJvmExtension
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider
import org.gradle.jvm.tasks.Jar

fun Project.setupBuildTask(
    packageBootstrapJarTask: TaskProvider<out Task>,
    packageMainJarTask: TaskProvider<out Task>,
    packageBootstrapDexJarTask: TaskProvider<out Task>,
    packageMainDexJarTask: TaskProvider<out Task>,
    createGraalNativeImageTask: TaskProvider<out Task>,
    createIOSTask: TaskProvider<out Task>,
    generateGdIgnoreFilesTask: TaskProvider<out Task>,
    copyJarTask: TaskProvider<out Task>,
) {
    tasks
        .withType(Jar::class.java)
        .filter { jarTask -> jarTask !is ShadowJar }
        .forEach { task ->
            task.dependsOn(
                generateGdIgnoreFilesTask
            )

            task.finalizedBy(
                copyJarTask,
                packageBootstrapJarTask,
                packageMainJarTask,
            )

            if (godotJvmExtension.isAndroidExportEnabled.get()) {
                copyJarTask.configure { copyTask ->
                    copyTask.dependsOn(packageBootstrapDexJarTask, packageMainDexJarTask)
                }
                task.finalizedBy(packageBootstrapDexJarTask, packageMainDexJarTask)
            }
            if (godotJvmExtension.isGraalNativeImageExportEnabled.get()) {
                copyJarTask.configure { copyTask ->
                    copyTask.dependsOn(createGraalNativeImageTask)
                }
                task.finalizedBy(createGraalNativeImageTask)
            }
            if (godotJvmExtension.isIOSExportEnabled.get()) {
                copyJarTask.configure { copyTask ->
                    copyTask.dependsOn(createIOSTask)
                }
                task.finalizedBy(createIOSTask)
            }
        }
}

package godot.gradle.tasks.android

import godot.gradle.projectExt.godotJvmExtension
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.Exec
import org.gradle.api.tasks.TaskProvider
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform
import java.io.File

fun Project.packageBootstrapDexJarTask(
    checkAndroidJarAccessibleTask: TaskProvider<out Task>,
    checkD8ToolAccessibleTask: TaskProvider<out Task>,
    packageBootstrapJarTask: TaskProvider<out Task>
): TaskProvider<out Task> {
    return tasks.register("packageBootstrapDexJar", Exec::class.java) {
        with(it) {
            group = "godot-kotlin-jvm"
            description =
                "Converts the godot-bootstrap.jar to an android compatible version. Needed for android builds only"

            dependsOn(checkD8ToolAccessibleTask, checkAndroidJarAccessibleTask, packageBootstrapJarTask)

            doFirst {
                val libsDir = project.buildDir.resolve("libs")
                val godotBootstrapJar = File(libsDir, "godot-bootstrap.jar")

                workingDir = libsDir
                if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
                    commandLine(
                        "cmd",
                        "/c",
                        godotJvmExtension.d8ToolPath.get().asFile.absolutePath,
                        godotBootstrapJar.absolutePath,
                        "--output",
                        "godot-bootstrap-dex.jar",
                        "--lib",
                        "${godotJvmExtension.androidCompileSdkDir.get().asFile.absolutePath}${File.separator}android.jar",
                        "--min-api",
                        godotJvmExtension.androidMinApi.get(),
                    )
                } else {
                    commandLine(
                        godotJvmExtension.d8ToolPath.get().asFile.absolutePath,
                        godotBootstrapJar.absolutePath,
                        "--output",
                        "godot-bootstrap-dex.jar",
                        "--lib",
                        "${godotJvmExtension.androidCompileSdkDir.get().asFile.absolutePath}/android.jar",
                        "--min-api",
                        godotJvmExtension.androidMinApi.get(),
                    )
                }
            }
        }
    }
}

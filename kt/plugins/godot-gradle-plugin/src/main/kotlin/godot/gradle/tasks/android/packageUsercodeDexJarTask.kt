package godot.gradle.tasks.android

import godot.gradle.projectExt.godotJvmExtension
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.Exec
import org.gradle.api.tasks.TaskProvider
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform
import java.io.File

fun Project.packageUsercodeDexJarTask(
    checkAndroidJarAccessibleTask: TaskProvider<out Task>,
    checkD8ToolAccessibleTask: TaskProvider<out Task>,
    packageUsercodeJarTask: TaskProvider<out Task>
): TaskProvider<out Task> {
    return tasks.register("packageUsercodeDexJar", Exec::class.java) {
        with(it) {
            group = "godot-kotlin-jvm"
            description = "Converts the usercode.jar to an android dex jar. Needed for android builds only"

            dependsOn(
                checkD8ToolAccessibleTask,
                checkAndroidJarAccessibleTask,
                packageUsercodeJarTask
            )

            doFirst {
                val libsDir = project.buildDir.resolve("libs")
                val usercodeJar = File(libsDir, "usercode.jar")

                workingDir = libsDir
                if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
                    commandLine(
                        "cmd",
                        "/c",
                        godotJvmExtension.d8ToolPath.get().asFile.absolutePath,
                        usercodeJar.absolutePath,
                        "--output",
                        "usercode-dex.jar",
                        "--lib",
                        "${godotJvmExtension.androidCompileSdkDir.get().asFile.absolutePath}${File.separator}android.jar",
                    )
                } else {
                    commandLine(
                        godotJvmExtension.d8ToolPath.get().asFile.absolutePath,
                        usercodeJar.absolutePath,
                        "--output",
                        "usercode-dex.jar",
                        "--lib",
                        "${godotJvmExtension.androidCompileSdkDir.get().asFile.absolutePath}/android.jar"
                    )
                }
            }
        }
    }
}

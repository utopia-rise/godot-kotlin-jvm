package godot.gradle.tasks.android

import godot.gradle.GodotPlugin
import godot.gradle.projectExt.godotJvmExtension
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.Exec
import org.gradle.api.tasks.TaskProvider
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform
import java.io.File

fun Project.createMainDexFileTask(
    checkAndroidJarAccessibleTask: TaskProvider<out Task>,
    checkD8ToolAccessibleTask: TaskProvider<out Task>,
    packageBootstrapDexJarTask: TaskProvider<out Task>,
    packageMainJarTask: TaskProvider<out Task>
): TaskProvider<out Task> {
    return tasks.register("createMainDexFile", Exec::class.java) {
        with(it) {
            group = "godot-kotlin-jvm"
            description = "Converts the main.jar to an android dex file. Needed for android builds only"

            dependsOn(
                checkD8ToolAccessibleTask,
                checkAndroidJarAccessibleTask,
                packageMainJarTask,
                packageBootstrapDexJarTask
            )

            doFirst {
                val libsDir = project.layout.buildDirectory.asFile.get().resolve("libs")
                val mainJar = File(libsDir, "main.jar")
                val godotBootstrapJar = File(libsDir, "godot-bootstrap.jar")
                val mainDexRules = project.layout.buildDirectory.asFile.get().resolve("main-dex-rules.proguard").also { mainDexRules ->
                    mainDexRules.outputStream().use { outputStream ->
                        requireNotNull(GodotPlugin::class.java.getResourceAsStream("android/main-dex-rules.proguard"))
                            .copyTo(outputStream)
                    }
                }.absolutePath

                workingDir = libsDir
                if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
                    commandLine(
                        "cmd",
                        "/c",
                        godotJvmExtension.d8ToolPath.get().asFile.absolutePath,
                        mainJar.absolutePath,
                        "--lib",
                        "${godotJvmExtension.androidCompileSdkDir.get().asFile.absolutePath}${File.separator}android.jar",
                        "--min-api",
                        godotJvmExtension.androidMinApi.get(),
                        "--main-dex-rules",
                        mainDexRules,
                    )
                } else {
                    commandLine(
                        godotJvmExtension.d8ToolPath.get().asFile.absolutePath,
                        mainJar.absolutePath,
                        "--lib",
                        "${godotJvmExtension.androidCompileSdkDir.get().asFile.absolutePath}/android.jar",
                        "--classpath",
                        godotBootstrapJar.absolutePath,
                        "--min-api",
                        godotJvmExtension.androidMinApi.get(),
                        "--main-dex-rules",
                        mainDexRules,
                    )
                }
            }
        }
    }
}

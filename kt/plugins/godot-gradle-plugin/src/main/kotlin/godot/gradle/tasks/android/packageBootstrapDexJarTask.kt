package godot.gradle.tasks.android

import godot.gradle.projectExt.godotJvmExtension
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.Exec
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform
import java.io.File

fun Project.packageBootstrapDexJarTask(
    checkAndroidJarAccessibleTask: Task,
    checkD8ToolAccessibleTask: Task,
    packageBootstrapJarTask: Task
): Task {
    return with(tasks.create("packageBootstrapDexJar", Exec::class.java)) {
        group = "godot-kotlin-jvm"
        description =
            "Converts the godot-bootstrap.jar to an android compatible version. Needed for android builds only"

        dependsOn(checkD8ToolAccessibleTask, checkAndroidJarAccessibleTask, packageBootstrapJarTask)

        doLast {
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
                )
            } else {
                commandLine(
                    godotJvmExtension.d8ToolPath.get().asFile.absolutePath,
                    godotBootstrapJar.absolutePath,
                    "--output",
                    "godot-bootstrap-dex.jar",
                    "--lib",
                    "${godotJvmExtension.androidCompileSdkDir.get().asFile.absolutePath}/android.jar",
                )
            }
        }
    }
}

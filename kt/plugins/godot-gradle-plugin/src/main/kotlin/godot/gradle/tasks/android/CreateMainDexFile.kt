package godot.gradle.tasks.android

import godot.gradle.exception.D8ToolNotFoundException
import godot.gradle.ext.godotJvmExtension
import godot.gradle.tasks.TaskRegistry
import godot.gradle.tasks.ToolTask
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform
import java.io.File

open class CreateMainDexFile: ToolTask() {

    override val toolFile: File
        get() = project
            .godotJvmExtension
            .d8ToolPath
            ?: throw D8ToolNotFoundException()

    // d8 doc: https://developer.android.com/studio/command-line/d8
    override fun setup() {
        group = "godot-kotlin-jvm"
        description = "Converts the main.jar to an android dex file. Needed for android builds only"

        checkToolAccessible()
        dependsOn(
            TaskRegistry.ANDROID_JAR_ACCESSIBLE.taskName,
            TaskRegistry.PACKAGE_MAIN_JAR.taskName,
            TaskRegistry.PACKAGE_BOOTSTRAP_JAR.taskName
        )

        val libsDir = project.buildDir.resolve("libs")
        val mainJar = File(libsDir, "main.jar")
        val godotBootstrapJar = File(libsDir, "godot-bootstrap.jar")
        val androidCompileSdkDir = project
            .godotJvmExtension
            .androidCompileSdkDir
            ?: throw IllegalStateException("androidCompileSdkDir not set but this should have already thrown in ${TaskRegistry.ANDROID_JAR_ACCESSIBLE.taskName} task")

        workingDir = libsDir
        if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
            commandLine(
                "cmd",
                "/c",
                toolFile.absolutePath,
                mainJar.absolutePath,
                "--lib",
                "${androidCompileSdkDir.absolutePath.removeSuffix(File.separator)}${File.separator}android.jar",
                "--classpath",
                godotBootstrapJar.absolutePath,
            )
        } else {
            commandLine(
                toolFile.absolutePath,
                mainJar.absolutePath,
                "--lib",
                "${androidCompileSdkDir.absolutePath.removeSuffix(File.separator)}/android.jar",
                "--classpath",
                godotBootstrapJar.absolutePath,
            )
        }
    }
}

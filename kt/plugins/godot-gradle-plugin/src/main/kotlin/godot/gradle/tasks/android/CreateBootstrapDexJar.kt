package godot.gradle.tasks.android

import godot.gradle.exception.D8ToolNotFoundException
import godot.gradle.ext.godotJvmExtension
import godot.gradle.tasks.TaskRegistry
import godot.gradle.tasks.ToolTask
import org.gradle.api.tasks.InputFile
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform
import java.io.File

open class CreateBootstrapDexJar : ToolTask() {

    @InputFile
    override val toolFile = project.objects.fileProperty().apply {
        this.set(
            project
                .godotJvmExtension
                .d8ToolPath
        )
    }

    // d8 doc: https://developer.android.com/studio/command-line/d8
    override fun setup() {
        group = "godot-kotlin-jvm"
        description =
            "Converts the godot-bootstrap.jar to an android compatible version. Needed for android builds only"

        if (!project.godotJvmExtension.isAndroidExportEnabled.get()) {
            return
        }

        checkToolAccessible {
            throw D8ToolNotFoundException()
        }

        dependsOn(
            TaskRegistry.ANDROID_JAR_ACCESSIBLE.taskName,
            TaskRegistry.PACKAGE_MAIN_JAR.taskName,
            TaskRegistry.PACKAGE_BOOTSTRAP_JAR.taskName
        )

        val libsDir = project.buildDir.resolve("libs")
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
                toolFile.get().asFile.absolutePath,
                godotBootstrapJar.absolutePath,
                "--output",
                "godot-bootstrap-dex.jar",
                "--lib",
                "${androidCompileSdkDir.absolutePath.removeSuffix(File.separator)}${File.separator}android.jar",
            )
        } else {
            commandLine(
                toolFile.get().asFile.absolutePath,
                godotBootstrapJar.absolutePath,
                "--output",
                "godot-bootstrap-dex.jar",
                "--lib",
                "${androidCompileSdkDir.absolutePath.removeSuffix(File.separator)}/android.jar",
            )
        }
    }
}

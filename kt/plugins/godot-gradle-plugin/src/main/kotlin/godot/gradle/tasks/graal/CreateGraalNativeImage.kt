package godot.gradle.tasks.graal

import godot.gradle.exception.D8ToolNotFoundException
import godot.gradle.ext.godotJvmExtension
import godot.gradle.tasks.TaskRegistry
import godot.gradle.tasks.ToolTask
import org.gradle.api.tasks.InputFile
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform
import java.io.File

open class CreateGraalNativeImage: ToolTask() {
    @InputFile
    override val toolFile = project.objects.fileProperty().apply {
        this.set(
            project
                .godotJvmExtension
                .nativeImageToolPath
        )
    }

    override fun setup() {
        group = "godot-kotlin-jvm"
        description = "Checks if tha native tool is accessible and converts main.jar and bootstrap.jar into a GraalVM native image."

        if (!project.godotJvmExtension.isGraalNativeImageExportEnabled.get()) {
            return
        }

        checkToolAccessible {
            throw D8ToolNotFoundException()
        }

        dependsOn(
            TaskRegistry.CREATE_GRAAL_DEFAULT_JNI_CONFIG.taskName,
            TaskRegistry.PACKAGE_MAIN_JAR.taskName,
            TaskRegistry.PACKAGE_BOOTSTRAP_JAR.taskName
        )

        val libsDir = project.buildDir.resolve("libs")
        val resourcesDir = project.buildDir.resolve("resources")


        val mainJar = File(libsDir, "main.jar")
        val godotBootstrapJar = File(libsDir, "godot-bootstrap.jar")

        workingDir = libsDir

        val graalDirectory = project.projectDir.resolve("graal")

        val additionalJniConfiguration = project.godotJvmExtension.additionalGraalJniConfigurationFiles.get()
            .map {
                graalDirectory.resolve(it).absolutePath
            }
        val additionalJoinedJniConfiguration = if (additionalJniConfiguration.isNotEmpty()) {
            ",${additionalJniConfiguration.joinToString(separator = ",") }"
        } else {
            ""
        }

        val jniConfigurationFilesArgument = "-H:JNIConfigurationFiles=" +
            graalDirectory.resolve("godot-kotlin-graal-jni-config.json").absolutePath +
            additionalJoinedJniConfiguration

        val verboseArgument = if (project.godotJvmExtension.isGraalVmNativeImageGenerationVerbose.get()) {
            "--verbose"
        } else {
            ""
        }

        //TODO: @piertho add comment linking to native image documentation and add comment of an example how a fully assembled command looks like both for windows and unix
        if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
            commandLine(
                "cmd",
                "/c",
                "(",
                project.godotJvmExtension.windowsDeveloperVCVarsPath.get(),
                "&&",
                toolFile.get().asFile.absolutePath,
                "-cp",
                "\"${godotBootstrapJar.absolutePath}\";\"${mainJar.absolutePath}\"",
                "--shared",
                "-H:Name=usercode",
                jniConfigurationFilesArgument,
                "-H:IncludeResources=${
                    resourcesDir.absolutePath.replace(
                        '\\',
                        '/'
                    )
                }/main/META-INF/services/*.*",
                "--no-fallback",
                verboseArgument,
                ")"
            )
        } else {
            commandLine(
                toolFile.get().asFile.absolutePath,
                "-cp",
                "${godotBootstrapJar.absolutePath}:${mainJar.absolutePath}",
                "--shared",
                "-H:Name=usercode",
                jniConfigurationFilesArgument,
                "-H:IncludeResources=${resourcesDir.absolutePath}/main/META-INF/services/*.*",
                "--no-fallback",
                verboseArgument,
            )
        }
    }
}

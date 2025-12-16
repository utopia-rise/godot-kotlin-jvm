package godot.gradle.tasks.graal.ios

import godot.gradle.projectExt.godotJvmExtension
import godot.gradle.tasks.graal.*
import godot.utils.GodotBuildProperties
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.Exec
import org.gradle.api.tasks.TaskProvider
import java.io.File

fun Project.createIOSGraalNativeImageTask(
    checkNativeImageToolAccessibleTask: TaskProvider<out Task>,
    copyDefaultGraalIOSConfigsTask: TaskProvider<out Task>,
    downloadIOSCapCacheTask: TaskProvider<out Task>,
    packageMainJarTask: TaskProvider<out Task>,
    packageBootstrapJarTask: TaskProvider<out Task>
): TaskProvider<out Task> = tasks.register("createIOSGraalNativeImage", Exec::class.java) {
    with(it) {
        group = "godot-jvm-internal"
        description = "INTERNAL TASK ! Converts main.jar and bootstrap.jar into a GraalVM ios native image."

        dependsOn(
            checkNativeImageToolAccessibleTask,
            copyDefaultGraalIOSConfigsTask,
            downloadIOSCapCacheTask,
            packageMainJarTask,
            packageBootstrapJarTask
        )

        doFirst {
            val libsDir = project.layout.buildDirectory.asFile.get().resolve("libs")
            val iosLibDir = layout.buildDirectory.asFile.get().resolve("libs").resolve("ios")

            val graalDirectory = layout.buildDirectory.asFile.get().resolve("graal")

            val iosGraalConfigDir = graalDirectory.resolve("ios")
            val jniConfigurationFilesArgument = "-H:JNIConfigurationFiles=" +
                graalDirectory.resolve("godot-kotlin-graal-jni-config.json").absolutePath + "," +
                iosGraalConfigDir.resolve(iosJniConfig) + "," +
                getGraalVmAdditionalJniConfigs()


            val additionalReflectionConfigurationFiles = getAdditionalGraalReflectionConfigurationFiles()
            val reflectionConfigurationFilesArgument = if (additionalReflectionConfigurationFiles.isNotEmpty()) {
                "-H:ReflectionConfigurationFiles=" +
                    iosGraalConfigDir.resolve(iosReflectionConfig) + "," +
                    getAdditionalGraalReflectionConfigurationFiles()
            } else {
                "-H:ReflectionConfigurationFiles=" +
                    iosGraalConfigDir.resolve(iosReflectionConfig)
            }

            val additionalResourceConfigurationFiles = getAdditionalGraalResourceConfigurationFiles()
            val resourceConfigurationFilesArgument = if (additionalResourceConfigurationFiles.isNotEmpty()) {
                "-H:ResourceConfigurationFiles=" +
                    iosGraalConfigDir.resolve(iosResourceConfig) + "," +
                    getAdditionalGraalResourceConfigurationFiles()
            } else {
                "-H:ResourceConfigurationFiles=" +
                    iosGraalConfigDir.resolve(iosResourceConfig)
            }

            val verboseArgument = if (godotJvmExtension.isGraalVmNativeImageGenerationVerbose.get()) {
                "--verbose"
            } else {
                ""
            }

            val mainJar = File(libsDir, "main.jar")
            val godotBootstrapJar = File(libsDir, "godot-bootstrap.jar")

            val arguments = arrayOf(
                godotJvmExtension.graalVmDirectory
                    .get()
                    .asFile
                    .resolve("bin")
                    .resolve("native-image")
                    .absolutePath,
                "-cp",
                "${godotBootstrapJar.absolutePath}:${mainJar.absolutePath}",
                "--no-server",
                "-H:+ExitAfterRelocatableImageWrite",
                "-H:+SharedLibrary",
                "-H:TempDirectory=${iosLibDir.absolutePath}",
                "-H:Name=usercode",
                "-H:+AddAllCharsets",
                "-H:-DeadlockWatchdogExitOnTimeout",
                "-H:DeadlockWatchdogInterval=0",
                "-H:+RemoveSaturatedTypeFlows",
                "-H:-SpawnIsolates",
                "-H:PageSize=16384",
                "-H:EnableURLProtocols=http,https,jar",
                "-H:+PrintAnalysisCallTree",
                "-H:Log=registerResource:",
                "-Djdk.internal.lambda.eagerlyInitialize=false",
                "-H:+ReportExceptionStackTraces",
                "-Dsvm.targetName=iOS",
                "-Dsvm.targetArch=arm64",
                "-H:+UseCAPCache",
                "-H:CAPCacheDir=${
                    iosGraalConfigDir
                        .resolve("capcache")
                        .resolve("${GodotBuildProperties.iosCapCacheVersion}-${GodotBuildProperties.iosJdkVersion}")
                        .absolutePath
                }",
                "-H:CompilerBackend=lir",
                "-Dsvm.platform=org.graalvm.nativeimage.Platform\$IOS_AARCH64",
                jniConfigurationFilesArgument,
                reflectionConfigurationFilesArgument,
                resourceConfigurationFilesArgument,
                "--no-fallback",
                verboseArgument,
            )

            println(arguments.joinToString(" "))

            commandLine(*arguments)
        }
    }
}

package godot.gradle.tasks.graal

import godot.gradle.projectExt.godotJvmExtension
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.Exec
import org.gradle.api.tasks.TaskProvider
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform
import java.io.File

fun Project.createGraalNativeImageTask(
    checkNativeImageToolAccessibleTask: TaskProvider<out Task>,
    checkPresenceOfDefaultGraalJniConfigTask: TaskProvider<out Task>,
    packageMainJarTask: TaskProvider<out Task>,
    packageBootstrapJarTask: TaskProvider<out Task>
): TaskProvider<out Task> {
    return tasks.register("createGraalNativeImage", Exec::class.java) {
        with(it) {
            group = "godot-kotlin-jvm"
            description = "Converts main.jar and bootstrap.jar into a GraalVM native image."

            dependsOn(
                checkNativeImageToolAccessibleTask,
                checkPresenceOfDefaultGraalJniConfigTask,
                packageMainJarTask,
                packageBootstrapJarTask
            )

            doFirst {
                val libsDir = project.layout.buildDirectory.asFile.get().resolve("libs")

                val mainJar = File(libsDir, "main.jar")
                val godotBootstrapJar = File(libsDir, "godot-bootstrap.jar")


                workingDir = libsDir

                val graalDirectory = layout.buildDirectory.asFile.get().resolve("graal")

                val jniConfigurationFilesArgument = "-H:JNIConfigurationFiles=" +
                    graalDirectory.resolve("godot-kotlin-graal-jni-config.json").absolutePath + "," +
                    getGraalVmAdditionalJniConfigs()


                val additionalConfigFiles = getAdditionalGraalReflectionConfigurationFiles()
                val reflectionConfigurationFilesArgument = if (additionalConfigFiles.isNotEmpty()) {
                    "-H:ReflectionConfigurationFiles=${getAdditionalGraalReflectionConfigurationFiles()}"
                } else {
                    ""
                }

                val resourceConfigFiles = getAdditionalGraalResourceConfigurationFiles()
                val resourceConfigurationFilesArgument = if (resourceConfigFiles.isNotEmpty()) {
                    "-H:ResourceConfigurationFiles=${getAdditionalGraalResourceConfigurationFiles()}"
                } else {
                    ""
                }

                val verboseArgument = if (godotJvmExtension.isGraalVmNativeImageGenerationVerbose.get()) {
                    "--verbose"
                } else {
                    ""
                }

                val graalBinDir = godotJvmExtension
                    .graalVmDirectory
                    .get()
                    .asFile
                    .resolve("bin")


                val arguments = if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
                    mutableListOf(
                        "cmd",
                        "/c",

                        "(",

                        godotJvmExtension.windowsDeveloperVCVarsPath.get().asFile.absolutePath,

                        "&&",

                        graalBinDir
                            .resolve("native-image.cmd"),
                        "-cp",
                        "\"${godotBootstrapJar.absolutePath}\";\"${mainJar.absolutePath}\"",
                        "--shared",
                        "-H:Name=usercode",
                        jniConfigurationFilesArgument,
                        "--no-fallback",
                        verboseArgument
                    )

                } else {
                    mutableListOf(
                        graalBinDir
                            .resolve("native-image"),
                        "-cp",
                        "${godotBootstrapJar.absolutePath}:${mainJar.absolutePath}",
                        "--shared",
                        "-H:Name=usercode",
                        jniConfigurationFilesArgument,
                        "--no-fallback",
                        verboseArgument,
                    )
                }

                if(additionalConfigFiles.isNotEmpty()){
                    arguments.add(reflectionConfigurationFilesArgument)
                }

                if(resourceConfigFiles.isNotEmpty()){
                    arguments.add(resourceConfigurationFilesArgument)
                }

                if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
                    arguments.add(")")
                }

                println(arguments.joinToString(" "))

                commandLine(
                    arguments
                )
            }
        }
    }
}

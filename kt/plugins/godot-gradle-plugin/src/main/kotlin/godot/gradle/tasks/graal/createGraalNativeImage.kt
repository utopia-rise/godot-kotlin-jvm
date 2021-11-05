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
                val libsDir = project.buildDir.resolve("libs")
                val resourcesDir = project.buildDir.resolve("resources")


                val mainJar = File(libsDir, "main.jar")
                val godotBootstrapJar = File(libsDir, "godot-bootstrap.jar")


                workingDir = libsDir

                val graalDirectory = projectDir.resolve("graal")

                val additionalJniConfiguration = godotJvmExtension.additionalGraalJniConfigurationFiles.get()
                    .map {
                        graalDirectory.resolve(it).absolutePath
                    }
                val additionalJoinedJniConfiguration = if (additionalJniConfiguration.isNotEmpty()) {
                    ",${additionalJniConfiguration.joinToString(separator = ",")}"
                } else {
                    ""
                }

                val jniConfigurationFilesArgument = "-H:JNIConfigurationFiles=" +
                    graalDirectory.resolve("godot-kotlin-graal-jni-config.json").absolutePath +
                    additionalJoinedJniConfiguration

                val verboseArgument = if (godotJvmExtension.isGraalVmNativeImageGenerationVerbose.get()) {
                    "--verbose"
                } else {
                    ""
                }

                if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
                    commandLine(
                        "cmd",
                        "/c",

                        "(",

                        godotJvmExtension.windowsDeveloperVCVarsPath.get(),

                        "&&",

                        godotJvmExtension.nativeImageToolPath.get(),
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
                        godotJvmExtension.nativeImageToolPath.get(),
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
    }
}

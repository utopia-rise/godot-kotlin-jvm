package godot.gradle.tasks.graal

import godot.gradle.exception.GraalNativeImageToolNotFountException
import godot.gradle.projectExt.checkToolAccessible
import godot.gradle.projectExt.godotJvmExtension
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform

fun Project.checkNativeImageToolAccessibleTask(): TaskProvider<Task> {
    return tasks.register("checkNativeImageToolAccessible") {
        with(it) {
            group = "godot-kotlin-jvm"
            description =
                "Checks if the GraalVM native image tool is accessible and executable. Needed for GraalVM native-image builds only"

            doLast {
                try {
                    val graalBinDir = godotJvmExtension.graalVmDirectory
                        .get()
                        .asFile
                        .resolve("bin")
                    val result = checkToolAccessible(
                        if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
                            graalBinDir
                                .resolve("native-image.cmd")
                                .absolutePath
                        } else {
                            graalBinDir
                                .resolve("native-image")
                                .absolutePath
                        }
                    )
                    if (result.exitValue != 0) {
                        throw GraalNativeImageToolNotFountException()
                    }
                } catch (e: Throwable) {
                    throw GraalNativeImageToolNotFountException()
                }
            }
        }
    }
}

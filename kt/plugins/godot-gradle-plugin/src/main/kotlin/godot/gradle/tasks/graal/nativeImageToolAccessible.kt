package godot.gradle.tasks.graal

import godot.gradle.exception.GraalNativeImageToolNotFountException
import godot.gradle.projectExt.checkToolAccessible
import godot.gradle.projectExt.godotJvmExtension
import org.gradle.api.Project
import org.gradle.api.Task

fun Project.checkNativeImageToolAccessibleTask(): Task {
    return with(tasks.create("checkNativeImageToolAccessible")) {
        group = "godot-kotlin-jvm"
        description =
            "Checks if the GraalVM native image tool is accessible and executable. Needed for GraalVM native-image builds only"

        doLast {
            try {
                val result = checkToolAccessible(godotJvmExtension.nativeImageToolPath.get().asFile.absolutePath)
                if (result.exitValue != 0) {
                    throw GraalNativeImageToolNotFountException()
                }
            } catch (e: Throwable) {
                throw GraalNativeImageToolNotFountException()
            }
        }
    }
}

package godot.gradle.tasks.android

import godot.gradle.exception.D8ToolNotFoundException
import godot.gradle.projectExt.checkToolAccessible
import godot.gradle.projectExt.godotJvmExtension
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.checkD8ToolAccessibleTask(): TaskProvider<Task> {
    return tasks.register("checkD8ToolAccessible") {
        with(it) {
            group = "godot-jvm"
            description = "Checks if the d8 tool is accessible and executable. Needed for android builds only"

            doLast {
                try {
                    val d8Tool = godotJvmExtension.d8ToolPath.orNull?.asFile ?: throw D8ToolNotFoundException()
                    val result = checkToolAccessible(d8Tool.absolutePath)
                    if (result.exitValue != 0) {
                        throw D8ToolNotFoundException()
                    }
                } catch (e: Throwable) {
                    throw D8ToolNotFoundException()
                }
            }
        }
    }
}

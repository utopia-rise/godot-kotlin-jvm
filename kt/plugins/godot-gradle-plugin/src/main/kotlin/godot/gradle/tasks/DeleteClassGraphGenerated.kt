package godot.gradle.tasks

import godot.gradle.projectExt.classGraphGeneratedDirectory
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.deleteClassGraphGeneratedSourceTask(): TaskProvider<out Task> {
    val directory = classGraphGeneratedDirectory

    return tasks.register("deleteClassGraphGeneratedSource") {
        directory.deleteRecursively()
    }
}

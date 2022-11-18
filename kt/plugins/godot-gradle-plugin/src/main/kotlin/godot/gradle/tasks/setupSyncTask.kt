package godot.gradle.tasks

import godot.gradle.projectExt.ideaExtension
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider
import org.jetbrains.gradle.ext.settings
import org.jetbrains.gradle.ext.taskTriggers

fun Project.setupAfterIdeaSyncTasks(
    generateGdIgnoreFilesTask: TaskProvider<out Task>,
) {
    ideaExtension.project.settings {
        taskTriggers {
            afterSync(generateGdIgnoreFilesTask)
        }
    }
}

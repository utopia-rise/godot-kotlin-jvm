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

    // note: do NOT use "ideaExtension.project.settings" here!
    // This doesn't work when our plugin is applied to a sub-project in a multi-module gradle build
    // (the "ideaExtension.project" will return NULL). We can only manage the idea triggers in
    // the *root* project. From the root project, the task will find the projects which require
    // further processing on its own.
    rootProject.ideaExtension.project.settings {
        taskTriggers {
            afterSync(generateGdIgnoreFilesTask)
        }
    }

}

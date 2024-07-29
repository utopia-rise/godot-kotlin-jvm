package godot.gradle.tasks

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.setupCleanTask(
    generateGdIgnoreFilesTask: TaskProvider<out Task>
) {
    tasks.named("clean") {
        with(it) {
            finalizedBy(generateGdIgnoreFilesTask)
        }
    }
}

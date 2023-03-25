package godot.gradle.tasks

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.setupCleanTask(
    createBuildLockTask: TaskProvider<out Task>,
    deleteBuildLockTask: TaskProvider<out Task>,
    generateGdIgnoreFilesTask: TaskProvider<out Task>
) {
    tasks.named("clean") {
        with(it) {
            dependsOn(createBuildLockTask)
            finalizedBy(deleteBuildLockTask, generateGdIgnoreFilesTask)
        }
    }
}

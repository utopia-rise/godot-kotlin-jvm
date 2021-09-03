package godot.gradle.tasks

import org.gradle.api.Project
import org.gradle.api.Task

fun Project.setupCleanTask(
    createBuildLockTask: Task,
    deleteBuildLockTask: Task
) {
    with(tasks.getByName("clean")) {
        dependsOn(createBuildLockTask)
        finalizedBy(deleteBuildLockTask)
    }
}

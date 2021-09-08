package godot.gradle.tasks

import godot.gradle.projectExt.getBuildLockDir
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider
import java.io.File

fun Project.deleteBuildLockTask(): TaskProvider<Task> {
    return tasks.register("deleteBuildLock") {
        with(it) {
            group = "godot-kotlin-jvm-internal"
            description =
                "Internal task! Deletes the build lock file which prevents the module to reload user classes while a build/clean is still in progress"

            doLast {
                val buildLockDir = getBuildLockDir()
                File(buildLockDir, "buildLock.lock").delete()
            }
        }
    }
}

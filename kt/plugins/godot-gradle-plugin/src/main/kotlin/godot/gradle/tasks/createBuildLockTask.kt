package godot.gradle.tasks

import godot.gradle.projectExt.getBuildLockDir
import org.gradle.api.Project
import org.gradle.api.Task
import java.io.File

fun Project.createBuildLockTask(): Task {
    return with(tasks.create("createBuildLock")) {
        group = "godot-kotlin-jvm-internal"
        description =
            "Internal task! Creates a build lock file which prevents the bootstrap to reload user classes while a build/clean is still in progress"

        doFirst {
            val buildLockFileName = "buildLock.lock"
            val buildLockDir = getBuildLockDir()
            File(buildLockDir, buildLockFileName).createNewFile()
        }
    }
}

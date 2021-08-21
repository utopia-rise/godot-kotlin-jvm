package godot.gradle.tasks

import godot.gradle.ext.getBuildLockDir
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import java.io.File

abstract class BuildLockTask: DefaultTask(), GodotJvmTask {
    private val buildLockFileName = "buildLock.lock"
    private val buildLockDir = project.getBuildLockDir()
    @Input
    val buildLockFile = project.objects.fileProperty().apply {
        this.set(File(buildLockDir, buildLockFileName))
    }
}

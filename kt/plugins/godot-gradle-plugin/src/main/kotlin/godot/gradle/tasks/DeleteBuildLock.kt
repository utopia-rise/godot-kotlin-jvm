package godot.gradle.tasks

import org.gradle.api.tasks.TaskAction

open class DeleteBuildLock: BuildLockTask() {

    override fun setup() {
        group = "godot-kotlin-jvm"
        description = "Deletes the build lock file created by ${TaskRegistry.CREATE_BUILD_LOCK.taskName}"
    }

    @TaskAction
    fun execute() {
        buildLockFile.get().asFile.delete()
    }
}

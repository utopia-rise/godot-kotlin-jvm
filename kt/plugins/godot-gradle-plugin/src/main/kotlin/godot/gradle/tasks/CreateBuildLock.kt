package godot.gradle.tasks

import org.gradle.api.tasks.TaskAction

open class CreateBuildLock: BuildLockTask() {

    override fun setup() {
        group = "godot-kotlin-jvm-internal"
        description = "Internal task! Creates a build lock file which prevents the bootstrap to reload user classes while a build/clean is still in progress"
    }

    @TaskAction
    fun execute() {
        buildLockFile.get().asFile.createNewFile()
    }
}

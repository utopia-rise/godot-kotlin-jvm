package godot.gradle.tasks.godotruntime


import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.Exec
import org.gradle.api.tasks.TaskProvider


fun Project.createGodotEditorBinaryExecTask(): TaskProvider<Exec> {

    return tasks.register("executeGodotEditor", Exec::class.java) {
        it.apply {
            group = "godot-kotlin-jvm-internal"
            description = "Runs the downloaded Godot Editor"
            val editorPath = PathManager.getEditorExecutablePath(project = project)
            workingDir = projectDir
            commandLine(editorPath,"./project.godot")
        }
    }
}

fun Project.createGodotEditorBinaryRunTask(execTask: Task, downloadTask: Task): TaskProvider<Task> {

    return tasks.register("runEditor") {
        with(it) {
            group = "godot-kotlin-jvm"
            description = "Sets up the required binaries, then runs the editor"

            dependsOn(downloadTask)
            finalizedBy(execTask)
        }
    }
}

/**
 * Creates a task that sets the executable permission for the binary, so we can run it.
 * */
fun Project.createGodotEditorPermissionTasks(execTask: Task, downloadTask: Task,extractTask:Task){
    val targetOS = PathManager.getTargetOS(project)
    var chmodTask:TaskProvider<Exec>? = null
    if(targetOS == OS.LINUX){
        val editorPath = PathManager.getEditorExecutablePath(project = project)
        chmodTask= tasks.register("chmodEditorExecutable",Exec::class.java){
            it.commandLine("chmod","+x",editorPath)
            it.dependsOn(downloadTask,extractTask)
        }
        execTask.dependsOn(chmodTask)
    }
}

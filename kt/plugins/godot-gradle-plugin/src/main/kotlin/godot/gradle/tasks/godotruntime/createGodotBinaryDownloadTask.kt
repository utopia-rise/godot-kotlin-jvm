package godot.gradle.tasks.godotruntime

import godot.gradle.GodotExtension
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.TaskProvider


/**
 * Downloads Godot binaries from the specified URL
 * */
fun Project.createGodotBinaryDownloadTask(): TaskProvider<GodotBinaryDownloadTask> {

    return tasks.register("downloadGodotBinaries", GodotBinaryDownloadTask::class.java) {}
}

fun Project.createGodotBinaryExtractTask():TaskProvider<Copy>{

    return tasks.register("extractGodotBinaries",Copy::class.java){
        val godotExtension = project.extensions.getByName("godot") as GodotExtension
        val os = godotExtension.os
        val output = PathManager.getDownloadPathForOS(os.get(),project)
        it.apply {
            from(zipTree(output))
            into(PathManager.getEditorFilePath(project,os.get()))

            group = "godot-kotlin-jvm-internal"
            description = "Extracts downloaded godot binaries"
        }
    }
}

fun Project.createGodotBinarySetupTask(downloadTask: GodotBinaryDownloadTask):TaskProvider<Task>{
    return tasks.register("godotBinarySetup") {
        with(it) {
            group = "godot-kotlin-jvm"
            description = "Sets up godot binaries for us to run the editor and our games from"

            dependsOn(downloadTask)
        }
    }
}

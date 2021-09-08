package godot.gradle.tasks

import godot.gradle.projectExt.generateServiceFile
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.generateEntryServiceFileTask(): TaskProvider<Task> {
    return tasks.register("generateEntryServiceFile") {
        with(it) {
            group = "godot-kotlin-jvm"
            description = "Generates the service file needed by our service loader to load the entry file."

            doFirst {
                generateServiceFile()
            }
        }
    }
}

package godot.gradle.tasks

import godot.gradle.projectExt.generateServiceFile
import org.gradle.api.Project
import org.gradle.api.Task

fun Project.generateEntryServiceFileTask(): Task {
    return with(tasks.create("generateEntryServiceFile")) {
        group = "godot-kotlin-jvm"
        description = "Generates the service file needed by our service loader to load the entry file."

        doFirst {
            generateServiceFile()
        }
    }
}

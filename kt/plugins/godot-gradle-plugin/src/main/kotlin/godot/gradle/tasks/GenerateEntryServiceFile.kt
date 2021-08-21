package godot.gradle.tasks

import godot.gradle.ext.generateServiceFile
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class GenerateEntryServiceFile: DefaultTask(), GodotJvmTask {

    override fun setup() {
        group = "godot-kotlin-jvm"
        description = "Generates the service file needed by bootstrap to load the Entry file"
    }

    @TaskAction
    fun execute() {
        project.generateServiceFile()
    }
}

package godot.gradle

import godot.codegen.generateApiFrom
import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.model.ObjectFactory
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction

open class ApiGeneratorPluginExtension(objects: ObjectFactory) {
    var outputDir = objects.directoryProperty()
    var sourceJson = objects.fileProperty()
}

open class GenerateAPI : DefaultTask() {
    @OutputDirectory
    val outputDir = project.objects.directoryProperty()

    @InputFile
    val sourceJson = project.objects.fileProperty()

    @TaskAction
    fun execute() {
        val output = outputDir.get().asFile
        output.deleteRecursively()
        output.generateApiFrom(sourceJson.get().asFile)
    }
}

class ApiGeneratorPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val extension = project.extensions.create("apiGenerator", ApiGeneratorPluginExtension::class.java)
        project.tasks.register("generateAPI", GenerateAPI::class.java) { task ->
            task.outputDir.set(extension.outputDir)
            task.sourceJson.set(extension.sourceJson)

            task.group = "godot-jvm"
            task.description = "Generate Godot's classes from its api."
        }
    }
}

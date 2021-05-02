package godot.gradle

import godot.codegen.generateApiFrom
import godot.docgen.DocGen
import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.model.ObjectFactory
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.property

open class ApiGeneratorPluginExtension(objects: ObjectFactory) {
    var outputDir = objects.directoryProperty()
    var sourceJson = objects.fileProperty()
    var docsDir = objects.directoryProperty()
}

open class GenerateAPI : DefaultTask() {
    @OutputDirectory
    val outputDir = project.objects.directoryProperty()

    @InputFile
    val sourceJson = project.objects.fileProperty()
    @InputDirectory
    val docsDir = project.objects.directoryProperty()

    @TaskAction
    fun execute() {
        val output = outputDir.get().asFile
        output.deleteRecursively()
        output.generateApiFrom(sourceJson.get().asFile, docsDir.get().asFile)
    }
}

class ApiGeneratorPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val extension = project.extensions.create<ApiGeneratorPluginExtension>("apiGenerator")
        project.tasks.register("generateAPI", GenerateAPI::class.java) {
            outputDir.set(extension.outputDir)
            sourceJson.set(extension.sourceJson)
            docsDir.set(extension.docsDir)

            group = "godot-jvm"
            description = "Generate Godot's classes from its api."
        }
    }
}

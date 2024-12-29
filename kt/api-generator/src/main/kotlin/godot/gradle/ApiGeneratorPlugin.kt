package godot.gradle

import godot.codegen.generateApiFrom
import godot.codegen.generateCoroutine
import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.model.ObjectFactory
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction

open class ApiGeneratorPluginExtension(objects: ObjectFactory) {
    var sourceJson = objects.fileProperty()
    var coreOutputDir = objects.directoryProperty()
    var apiOutputDir = objects.directoryProperty()
    var extensionOutputDir = objects.directoryProperty()
    var coroutineOutputDir = objects.directoryProperty()
}

open class GenerateAPI : DefaultTask() {
    @InputFile
    val sourceJson = project.objects.fileProperty()

    @OutputDirectory
    val coreOutputDir = project.objects.directoryProperty()

    @OutputDirectory
    val apiOutputDir = project.objects.directoryProperty()

    @OutputDirectory
    val extensionOutputDir = project.objects.directoryProperty()

    @OutputDirectory
    val coroutineOutputDir = project.objects.directoryProperty()

    @TaskAction
    fun execute() {
        val coreOutput = coreOutputDir.get().asFile
        coreOutput.deleteRecursively()

        val apiOutput = apiOutputDir.get().asFile
        apiOutput.deleteRecursively()

        generateApiFrom(
            sourceJson.get().asFile,
            coreOutput,
            apiOutput,
        )

        val coroutineOutput = coroutineOutputDir.get().asFile
        coroutineOutput.deleteRecursively()
        generateCoroutine(coroutineOutput)
    }
}

class ApiGeneratorPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val extension = project.extensions.create("apiGenerator", ApiGeneratorPluginExtension::class.java)
        project.tasks.register("generateAPI", GenerateAPI::class.java) { task ->
            task.sourceJson.set(extension.sourceJson)
            task.coreOutputDir.set(extension.coreOutputDir)
            task.apiOutputDir.set(extension.apiOutputDir)
            task.coroutineOutputDir.set(extension.coroutineOutputDir)

            task.group = "godot-jvm"
            task.description = "Generate Godot's classes from its api."
        }
    }
}

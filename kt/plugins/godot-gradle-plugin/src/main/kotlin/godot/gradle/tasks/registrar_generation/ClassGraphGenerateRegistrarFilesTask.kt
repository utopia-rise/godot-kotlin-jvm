package godot.gradle.tasks

import godot.annotation.processor.classgraph.ClassGraphProcessor
import godot.annotation.processor.classgraph.ProcessorSettings
import godot.registration.model.logging.LoggerWrapper
import godot.registrar.generator.RegistrarGenerator
import godot.registrar.generator.ext.getRegisteredName
import godot.registrar.generator.ext.provideRegistrationFileRelativePath
import godot.registrar.generator.ext.shouldGenerateGdjFile
import godot.registrar.generator.filebuilder.RegistrationFileGenerator
import godot.registration.model.types.ScriptClass
import godot.registration.model.checks.ChecksFailedException
import godot.registration.model.ModelCheck
import godot.registrar.generator.settings.RegisteredNameMode
import godot.registrar.generator.settings.RegistrationFileIndentation
import godot.registrar.generator.settings.RegistrationFileLayoutMode
import godot.registrar.generator.settings.Settings
import godot.registrar.generator.utils.DefaultJvmTypeProvider
import godot.gradle.projectExt.godotJvmExtension
import godot.tools.common.constants.godotRegistrationPackage
import org.gradle.api.DefaultTask
import org.gradle.api.Project
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.Classpath
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.SourceSetContainer
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.TaskProvider
import org.gradle.api.tasks.bundling.Jar
import java.io.File

private const val registrarServiceName = "$godotRegistrationPackage.ClassRegistrar"

@CacheableTask
abstract class ClassGraphGenerateRegistrarFilesTask : DefaultTask() {
    @get:Classpath
    abstract val userCodeClassPathRoots: ConfigurableFileCollection

    @get:Classpath
    abstract val runtimeClassPathFiles: ConfigurableFileCollection

    @get:Input
    abstract val registeredNameMode: Property<RegisteredNameMode>

    @get:Input
    abstract val projectName: Property<String>

    @get:Input
    abstract val registrationFileLayoutMode: Property<RegistrationFileLayoutMode>

    @get:Input
    abstract val registrationFileIndentation: Property<RegistrationFileIndentation>

    @get:Input
    abstract val disableGdj: Property<Boolean>

    @get:OutputDirectory
    abstract val generatedSourceRootDir: DirectoryProperty

    @get:OutputDirectory
    abstract val generatedRegistrationFilesRootDir: DirectoryProperty

    @TaskAction
    fun generate() {
        val outputRoot = generatedSourceRootDir.get().asFile
        outputRoot.deleteRecursively()
        outputRoot.mkdirs()
        val generatedRegistrationRoot = generatedRegistrationFilesRootDir.get().asFile
        generatedRegistrationRoot.deleteRecursively()
        if (!disableGdj.get()) {
            generatedRegistrationRoot.mkdirs()
        }

        val settings = Settings(
            registeredNameMode = registeredNameMode.get(),
            projectName = projectName.get(),
            registrationFileLayoutMode = registrationFileLayoutMode.get(),
            registrationFileIndentation = registrationFileIndentation.get(),
        )
        val processorSettings = ProcessorSettings(
            projectName = projectName.get(),
            userCodeClassPathRoots = userCodeClassPathRoots.files.map { it.canonicalFile }.toSet(),
        )
        val modelLogger = LoggerWrapper(logger)

        // 1. scan compiled user code into the registration model
        val allRegisteredClasses = ClassGraphProcessor.process(
            runtimeClassPathFiles = runtimeClassPathFiles.files.map { it.canonicalFile }.toSet(),
            processorSettings
        )

        // 2. validate the model before generating anything
        val registeredNameProvider = if (settings.registeredNameMode == RegisteredNameMode.SIMPLE_NAME) {
            { registeredClass: ScriptClass -> registeredClass.getRegisteredName(settings) }
        } else {
            null
        }

        if (!ModelCheck.check(allRegisteredClasses, modelLogger, registeredNameProvider)) {
            throw ChecksFailedException()
        }

        // 3. generate registrar sources/resources from the validated model
        val serviceFile = outputRoot
            .resolve("resources")
            .resolve("META-INF")
            .resolve("services")
            .resolve(registrarServiceName)

        RegistrarGenerator.generateRegistrarFilesUsingRegisteredClasses(
            settings = settings,
            registeredClasses = allRegisteredClasses,
            logger = modelLogger,
            jvmTypeFqNamesProvider = DefaultJvmTypeProvider(),
            sourceOutputDir = outputRoot.resolve("main").resolve("kotlin"),
            serviceFile = serviceFile,
        )

        if (!disableGdj.get()) {
            generateRegistrationFiles(
                settings = settings,
                registeredClasses = allRegisteredClasses.filter { it.shouldGenerateGdjFile },
                generatedRegistrationRootDir = generatedRegistrationRoot,
            )
        }
    }
}

private fun generateRegistrationFiles(
    settings: Settings,
    registeredClasses: List<ScriptClass>,
    generatedRegistrationRootDir: File,
) {
    registeredClasses.forEach { registeredClass ->
        val targetFile = generatedRegistrationRootDir
            .resolve(registeredClass.provideRegistrationFileRelativePath(settings))

        RegistrationFileGenerator(registeredClass, settings, targetFile).build()
    }
}

fun Project.registrarGenerationGenerateFilesTask(
    packageUserJarTask: TaskProvider<Jar>,
): TaskProvider<ClassGraphGenerateRegistrarFilesTask> {
    val mainSourceSet = extensions
        .getByType(SourceSetContainer::class.java)
        .getByName("main")
    val generatedSourceRootDir = layout.buildDirectory.dir("generated/registrar-generation")
    val generatedRegistrationRootDir = layout.buildDirectory.dir("generated/registrar-generation/registration")

    return tasks.register(
        "registrarGenerationGenerateFiles",
        ClassGraphGenerateRegistrarFilesTask::class.java
    ) { task ->
        task.group = "godot-kotlin-jvm-internal"
        task.description = "Generates registrar sources/resources plus staged .gdj files from compiled user code."
        task.dependsOn(packageUserJarTask)
        task.userCodeClassPathRoots.from(packageUserJarTask.flatMap { it.archiveFile })
        task.runtimeClassPathFiles.from(mainSourceSet.compileClasspath)
        task.runtimeClassPathFiles.from(packageUserJarTask.flatMap { it.archiveFile })
        task.registeredNameMode.convention(godotJvmExtension.registrationNameMode)
        task.projectName.convention(
            providers.provider { project.name.replace(" ", "_") }
        )
        task.registrationFileLayoutMode.convention(godotJvmExtension.registrationFilesLayoutMode)
        task.registrationFileIndentation.convention(godotJvmExtension.registrationFilesIndentation)
        task.disableGdj.convention(godotJvmExtension.disableGdj)
        task.generatedSourceRootDir.convention(generatedSourceRootDir)
        task.generatedRegistrationFilesRootDir.convention(generatedRegistrationRootDir)
    }
}

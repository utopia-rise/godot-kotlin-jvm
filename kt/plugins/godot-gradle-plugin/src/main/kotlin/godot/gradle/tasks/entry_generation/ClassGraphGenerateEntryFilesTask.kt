package godot.gradle.tasks

import godot.annotation.processor.classgraph.ClassGraphProcessor
import godot.annotation.processor.classgraph.logging.LoggerWrapper
import godot.entrygenerator.EntryGenerator
import godot.entrygenerator.ext.provideRegistrationFileRelativePath
import godot.entrygenerator.ext.shouldGenerateGdjFile
import godot.entrygenerator.filebuilder.RegistrationFileGenerator
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.settings.RegisteredNameMode
import godot.entrygenerator.settings.RegistrationFileLayoutMode
import godot.entrygenerator.settings.Settings
import godot.entrygenerator.utils.DefaultJvmTypeProvider
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
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.SourceSetContainer
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.TaskProvider
import org.gradle.api.tasks.bundling.Jar
import java.io.File
import java.io.FileOutputStream

private const val entryServiceName = "$godotRegistrationPackage.Entry"

@CacheableTask
abstract class ClassGraphGenerateEntryFilesTask : DefaultTask() {
    @get:Classpath
    abstract val userCodeClassPathRoots: ConfigurableFileCollection

    @get:Classpath
    abstract val runtimeClassPathFiles: ConfigurableFileCollection

    @get:Input
    abstract val registeredNameMode: Property<RegisteredNameMode>

    @get:Input
    abstract val projectName: Property<String>

    @get:Input
    abstract val projectBaseDirPath: Property<String>

    @get:Input
    abstract val registrationFileLayoutMode: Property<RegistrationFileLayoutMode>

    @get:Input
    @get:Optional
    abstract val previousServiceContent: Property<String>

    @get:OutputDirectory
    abstract val generatedSourceRootDir: DirectoryProperty

    @get:OutputDirectory
    abstract val generatedRegistrationFilesRootDir: DirectoryProperty

    @TaskAction
    fun generate() {
        ensureBuildDirectoryIsIgnoredByGodot()

        val outputRoot = generatedSourceRootDir.get().asFile
        outputRoot.deleteRecursively()
        outputRoot.mkdirs()
        val generatedRegistrationRoot = generatedRegistrationFilesRootDir.get().asFile
        generatedRegistrationRoot.deleteRecursively()
        generatedRegistrationRoot.mkdirs()

        val settings = Settings(
            registeredNameMode = registeredNameMode.get(),
            projectName = projectName.get(),
            projectBaseDir = File(projectBaseDirPath.get()),
            userCodeClassPathRoots = userCodeClassPathRoots.files.map { it.canonicalFile }.toSet(),
            registrationFileLayoutMode = registrationFileLayoutMode.get(),
            generatedSourceRootDir = outputRoot,
        )
        val allRegisteredClasses = ClassGraphProcessor.process(
            runtimeClassPathFiles = runtimeClassPathFiles.files.map { it.canonicalFile }.toSet(),
            settings
        )

        val serviceFile = outputRoot
            .resolve("resources")
            .resolve("META-INF")
            .resolve("services")
            .resolve(entryServiceName)

        if (!previousServiceContent.orNull.isNullOrBlank()) {
            serviceFile.parentFile.mkdirs()
            serviceFile.writeText(previousServiceContent.get())
        }

        EntryGenerator.generateEntryFilesUsingRegisteredClasses(
            settings = settings,
            registeredClasses = allRegisteredClasses,
            logger = LoggerWrapper(logger),
            jvmTypeFqNamesProvider = DefaultJvmTypeProvider(),
            classRegistrarAppendableProvider = { registeredClass ->
                val file = outputRoot
                    .resolve("main")
                    .resolve("kotlin")
                    .resolve("godot")
                    .resolve("entry")
                    .resolve("${registeredClass.getRegisteredName(settings)}Registrar.kt")

                file.parentFile.mkdirs()
                if (!file.exists()) {
                    file.createNewFile()
                }

                FileOutputStream(file).bufferedWriter()
            },
            mainBufferedWriterProvider = {
                val file = outputRoot
                    .resolve("main")
                    .resolve("kotlin")
                    .resolve("godot")
                    .resolve("Entry.kt")

                file.parentFile.mkdirs()
                if (!file.exists()) {
                    file.createNewFile()
                }

                FileOutputStream(file).bufferedWriter()
            },
            serviceFile = serviceFile,
        )

        generateRegistrationFiles(
            settings = settings,
            registeredClasses = allRegisteredClasses.filter { it.shouldGenerateGdjFile },
            generatedRegistrationRootDir = generatedRegistrationRoot,
        )
    }

    private fun ensureBuildDirectoryIsIgnoredByGodot() {
        val buildDir = project.layout.buildDirectory.asFile.get()
        if (!buildDir.exists()) {
            buildDir.mkdirs()
        }

        buildDir.resolve(".gdignore").createNewFile()
    }
}

private fun generateRegistrationFiles(
    settings: Settings,
    registeredClasses: List<RegisteredClass>,
    generatedRegistrationRootDir: File,
) {
    registeredClasses.forEach { registeredClass ->
        val targetFile = generatedRegistrationRootDir
            .resolve(registeredClass.provideRegistrationFileRelativePath(settings))
        targetFile.parentFile.mkdirs()

        RegistrationFileGenerator(registeredClass, settings) { _: RegisteredClass ->
            FileOutputStream(targetFile).bufferedWriter()
        }.build()
    }
}

fun Project.entryGenerationGenerateFilesTask(
    packageUserJarTask: TaskProvider<Jar>,
): TaskProvider<ClassGraphGenerateEntryFilesTask> {
    val mainSourceSet = extensions
        .getByType(SourceSetContainer::class.java)
        .getByName("main")
    val generatedSourceRootDir = layout.buildDirectory.dir("generated/entry-generation")
    val generatedRegistrationRootDir = layout.buildDirectory.dir("generated/entry-generation/registration")
    val serviceFileProvider = generatedSourceRootDir.map { generatedRoot ->
        generatedRoot.file("resources/META-INF/services/$entryServiceName")
    }

    return tasks.register(
        "entryGenerationGenerateFiles",
        ClassGraphGenerateEntryFilesTask::class.java
    ) { task ->
        task.group = "godot-kotlin-jvm-internal"
        task.description = "Generates entry sources/resources plus staged .gdj files from compiled user code."
        task.dependsOn(packageUserJarTask)
        task.userCodeClassPathRoots.from(packageUserJarTask.flatMap { it.archiveFile })
        task.runtimeClassPathFiles.from(mainSourceSet.compileClasspath)
        task.runtimeClassPathFiles.from(packageUserJarTask.flatMap { it.archiveFile })
        task.registeredNameMode.convention(godotJvmExtension.registrationNameMode)
        task.projectName.convention(
            providers.provider { project.name.replace(" ", "_") }
        )
        task.projectBaseDirPath.convention(
            providers.provider { layout.projectDirectory.asFile.absolutePath }
        )
        task.registrationFileLayoutMode.convention(godotJvmExtension.registrationFilesLayoutMode)
        task.previousServiceContent.convention(
            providers.provider {
                val serviceFile = serviceFileProvider.get().asFile
                if (serviceFile.isFile) serviceFile.readText() else null
            }
        )
        task.generatedSourceRootDir.convention(generatedSourceRootDir)
        task.generatedRegistrationFilesRootDir.convention(generatedRegistrationRootDir)
    }
}

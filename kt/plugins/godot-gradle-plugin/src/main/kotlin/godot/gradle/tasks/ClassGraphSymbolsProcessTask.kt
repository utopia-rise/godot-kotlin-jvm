package godot.gradle.tasks

import godot.annotation.processor.classgraph.Settings
import godot.annotation.processor.classgraph.generateEntryUsingClassGraph
import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.Classpath
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import java.io.File

@CacheableTask
abstract class ClassGraphSymbolsProcessTask : DefaultTask() {

    @get:Classpath
    abstract val userCodeClassPathRoots: ConfigurableFileCollection

    @get:Input
    @get:Optional
    abstract val classPrefix: Property<String>

    @get:Input
    abstract val fqNameRegistrationEnabled: Property<Boolean>

    @get:Input
    abstract val projectName: Property<String>

    @get:Input
    abstract val projectBaseDirPath: Property<String>

    @get:Input
    abstract val registrationBaseDirPathRelativeToProjectDir: Property<String>

    @get:Input
    abstract val registrationFileHierarchyEnabled: Property<Boolean>

    @get:Input
    abstract val registrationFileGenerationEnabled: Property<Boolean>

    @get:OutputDirectory
    abstract val generatedSourceRootDir: DirectoryProperty

    @get:OutputDirectory
    abstract val registrationFilesOutputDir: DirectoryProperty

    @TaskAction
    fun process() {
        val generatedSourceRoot = generatedSourceRootDir.get().asFile
        generatedSourceRoot.mkdirs()

        if (registrationFileGenerationEnabled.get()) {
            registrationFilesOutputDir.get().asFile.mkdirs()
        }

        generateEntryUsingClassGraph(
            settings = Settings(
                classPrefix = classPrefix.orNull,
                isFqNameRegistrationEnabled = fqNameRegistrationEnabled.get(),
                projectName = projectName.get(),
                projectBaseDir = File(projectBaseDirPath.get()),
                userCodeClassPathRoots = userCodeClassPathRoots.files.map { it.canonicalFile }.toSet(),
                registrationBaseDirPathRelativeToProjectDir = registrationBaseDirPathRelativeToProjectDir.get(),
                isRegistrationFileHierarchyEnabled = registrationFileHierarchyEnabled.get(),
                isRegistrationFileGenerationEnabled = registrationFileGenerationEnabled.get(),
                generatedSourceRootDir = generatedSourceRoot
            ),
            logger = logger,
            runtimeClassPathFiles = userCodeClassPathRoots.files.map { it.canonicalFile }.toSet()
        )
    }
}

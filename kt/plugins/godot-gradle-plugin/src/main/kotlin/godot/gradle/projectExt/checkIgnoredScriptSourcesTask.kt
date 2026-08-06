package godot.gradle.projectExt

import org.gradle.api.Project
import org.gradle.api.DefaultTask
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.SourceSetContainer
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.TaskProvider
import java.io.File

abstract class CheckIgnoredScriptSourcesTask : DefaultTask() {
    @get:Input
    abstract val godotProjectDirPath: Property<String>

    @get:Input
    abstract val sourceRootPaths: ListProperty<String>

    @TaskAction
    fun check() {
        val godotProjectDir = File(godotProjectDirPath.get())
        val godotProjectPath = godotProjectDir.toPath().toAbsolutePath().normalize()

        sourceRootPaths.get().map(::File).forEach { sourceRoot ->
            if (!sourceRoot.isDirectory || !sourceRoot.toPath().toAbsolutePath().normalize().startsWith(godotProjectPath)) {
                return@forEach
            }

            var directory: File? = sourceRoot
            while (directory != null) {
                val gdIgnore = directory.resolve(".gdignore")
                if (gdIgnore.isFile) {
                    logger.warn(
                        "Godot ignores source root ${sourceRoot.relativeTo(godotProjectDir).invariantSeparatorsPath} " +
                            "because ${gdIgnore.relativeTo(godotProjectDir).invariantSeparatorsPath} shadows it. " +
                            "Scenes cannot load @Script classes from this directory. Remove the .gdignore file."
                    )
                    break
                }
                if (directory == godotProjectDir) break
                directory = directory.parentFile
            }
        }
    }
}

fun Project.checkIgnoredScriptSourcesTask(): TaskProvider<CheckIgnoredScriptSourcesTask> {
    val mainSourceSet = extensions.getByType(SourceSetContainer::class.java)
    val sourceRoots = (mainSourceSet.getByName("main").allJava.srcDirs + kotlinJvmExtension.sourceSets.getByName("main").kotlin.srcDirs)
        .distinct()

    return tasks.register("checkIgnoredScriptSources", CheckIgnoredScriptSourcesTask::class.java) { task ->
        task.group = "verification"
        task.description = "Warns when .gdignore hides a JVM script source root from Godot."
        task.godotProjectDirPath.set(godotJvmExtension.godotProjectDirectory.get().asFile.absolutePath)
        task.sourceRootPaths.set(sourceRoots.map(File::getAbsolutePath))
    }
}

package godot.gradle.tasks

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.generateGdIgnoreFilesTask(): TaskProvider<Task> {
    return tasks.register("generateGdIgnoreFiles") {
        with(it) {
            group = "godot-kotlin-jvm"
            description = "Generates .gdignore files to hide gradle files, kotlin build files and jre files from the godot editor."

            // safety check: make sure that the target project has our plugin
            val hasPlugin = provider { pluginManager.hasPlugin("com.utopia-rise.godot-kotlin-jvm") }
            onlyIf { hasPlugin.get() }

            val projectDir = layout.projectDirectory.asFile
            val buildDirProvider = layout.buildDirectory.asFile
            doFirst {

                val buildDir = buildDirProvider.get()

                val targetDirSequence = sequenceOf(
                    buildDir,
                    projectDir.resolve("gradle"),
                    *(projectDir
                        .listFiles()
                        ?.filter { it.name.startsWith("jre-") }
                        ?.toTypedArray()
                        ?: emptyArray()),
                )
                targetDirSequence.filter { dirToIgnore -> dirToIgnore.exists() && dirToIgnore.isDirectory }
                    .forEach { dirToIgnore ->
                        dirToIgnore.resolve(".gdignore").createNewFile()
                    }
            }
        }
    }
}

package godot.gradle.tasks

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.generateGdIgnoreFilesTask(): TaskProvider<Task> {
    return tasks.register("generateGdIgnoreFiles") {
        with(it) {
            group = "godot-jvm"
            description = "Generates .gdignore files to hide gradle files, kotlin build files and jre files from the godot editor."

            doFirst {

                // safety check: make sure that the target project has our plugin
                if (!this.project.pluginManager.hasPlugin("com.utopia-rise.godot-jvm")) {
                    // the target project doesn't seem to have our plugin; skip.
                    return@doFirst
                }

                val projectDir = this.project.projectDir
                val buildDir = this.project.layout.buildDirectory.asFile.get()

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

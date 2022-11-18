package godot.gradle.tasks

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.generateGdIgnoreFilesTask(): TaskProvider<Task> {
    return tasks.register("generateGdIgnoreFiles") {
        with(it) {
            group = "godot-kotlin-jvm"
            description = "Generates .gdignore files to hide gradle files, kotlin build files and jre files from the godot editor"

            doFirst {
                val dirsToIgnore = listOf(
                    buildDir,
                    projectDir.resolve("gradle"),
                    projectDir.resolve("jre-arm64"),
                    projectDir.resolve("jre-amd64"),
                )

                dirsToIgnore
                    .filter { dirToIgnore -> dirToIgnore.exists() && dirToIgnore.isDirectory }
                    .forEach { dirToIgnore ->
                        dirToIgnore.resolve(".gdignore").createNewFile()
                    }
            }
        }
    }
}

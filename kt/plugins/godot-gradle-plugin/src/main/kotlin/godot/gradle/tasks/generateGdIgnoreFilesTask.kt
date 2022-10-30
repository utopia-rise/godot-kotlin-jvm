package godot.gradle.tasks

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.generateGdIgnoreFilesTask(): TaskProvider<Task> {
    return tasks.register("generateGdIgnoreFiles") {
        with(it) {
            group = "godot-kotlin-jvm"
            description = "Generates .gdignore files to hide gradle and kotlin build files from the godot editor"

            doFirst {
                buildDir.apply { mkdirs() }.resolve(".gdignore").createNewFile()

                val gradleDir = projectDir.resolve("gradle")

                if (gradleDir.exists() && gradleDir.isDirectory) {
                    gradleDir.resolve(".gdignore").createNewFile()
                } else {
                    logger.info("Could not create .gdignore file in gradle folder as the folder does not seem to exist. Looked for it at: ${gradleDir.absolutePath}")
                }
            }
        }
    }
}

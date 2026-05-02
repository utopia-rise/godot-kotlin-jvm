package godot.gradle.tasks

import godot.tools.common.constants.Paths
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.TaskProvider

fun Project.createCopyJarsTask(
    packageBootstrapJarTask: TaskProvider<out Task>,
    packageMainJarTask: TaskProvider<out Task>,
): TaskProvider<Copy> {
    return tasks.register("copyJars", Copy::class.java) {
        with(it) {
            group = "godot-kotlin-jvm-internal"
            description =
                "Internal task! Copies the built jars into the final output dir for the cpp reloading to pick up."

            dependsOn(
                packageBootstrapJarTask,
                packageMainJarTask,
            )

            this.from(layout.buildDirectory.asFile.get().resolve("libs"))
            this.destinationDir = projectDir.resolve(Paths.GODOT_KOTLIN_JVM_DIR)
        }
    }
}

package godot.gradle.tasks.android

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.Exec
import org.gradle.api.tasks.TaskProvider

fun Project.packageBootstrapDexJarTask(
    createBootstrapDexJarTask: TaskProvider<out Task>
): TaskProvider<out Task> {
    return tasks.register("packageBootstrapDexJar", Exec::class.java) {
        with(it) {
            group = "godot-kotlin-jvm"
            description = "Finalizes godot-bootstrap-dex.jar. Needed for android builds only"

            dependsOn(createBootstrapDexJarTask)
            onlyIf { false }
        }
    }
}

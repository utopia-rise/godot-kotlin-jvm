package godot.gradle.tasks.graal

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.copyDefaultGraalJniConfigTask(): TaskProvider<out Task> {
    return tasks.register("createDefaultGraalJniConfig") {
        with(it) {
            group = "godot-jvm"
            description =
                "Checks if the default jni config for graalVM native image is present and creates it if it's not"

            doLast {
                copyToGraalBuildDirectory(
                    "godot-kotlin-graal-jni-config.json"
                )
            }
        }
    }
}

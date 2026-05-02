package godot.gradle.tasks.graal.ios

import godot.gradle.tasks.graal.copyToGraalBuildDirectory
import godot.gradle.tasks.graal.iosJniConfig
import godot.gradle.tasks.graal.iosReflectionConfig
import godot.gradle.tasks.graal.iosResourceConfig
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.copyDefaultGraalIOSConfigsTask(
    checkPresenceOfDefaultGraalJniConfigTask: TaskProvider<out Task>,
): TaskProvider<out Task> = tasks.register("copyDefaultGraalIOSJniConfig") {
    with(it) {
        group = "godot-kotlin-jvm"
        description =
            "Checks if the default configs for ios graalVM native image are present and creates them if they're not"

        dependsOn(checkPresenceOfDefaultGraalJniConfigTask)

        doLast {
            listOf(
                // Configurations from gluon substrate: https://github.com/gluonhq/substrate/tree/master/src/main/resources/config

                "ios/$iosJniConfig",
                "ios/$iosReflectionConfig",
                "ios/$iosResourceConfig",
            ).forEach { resource -> copyToGraalBuildDirectory(resource) }
        }
    }
}

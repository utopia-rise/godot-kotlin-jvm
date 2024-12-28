package godot.gradle.tasks

import godot.annotation.processor.classgraph.Settings
import godot.annotation.processor.classgraph.generateEntryUsingClassGraph
import godot.gradle.projectExt.godotJvmExtension
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider

fun Project.classGraphSymbolsProcess(mainJarTask: TaskProvider<out Task>): TaskProvider<out Task> = tasks.register(
    "classGraphSymbolsProcess"
) {
    group = "godot-kotlin-jvm-internal"
    description = "Generates entry files using ClassGraph api"

    with(it) {
//        dependsOn(mainJarTask)

        if (godotJvmExtension.experimentalClassGraphRegistration.get()) {
            doFirst {
                generateEntryUsingClassGraph(
                    Settings(
                        godotJvmExtension.classPrefix.orNull,
                        godotJvmExtension.isFqNameRegistrationEnabled.get()
                    ),
                    layout.buildDirectory.asFile
                        .get()
                        .resolve("libs/main.jar")
                        .absolutePath,
                    layout.buildDirectory.asFile
                        .get()
                        .resolve("libs/godot-bootstrap.jar")
                        .absolutePath,
                )
            }
        }
    }
}

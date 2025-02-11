package godot.gradle.tasks

import godot.annotation.processor.classgraph.Settings
import godot.annotation.processor.classgraph.generateEntryUsingClassGraph
import godot.gradle.projectExt.godotJvmExtension
import godot.tools.common.constants.FileExtensions
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider
import java.io.File

fun Project.classGraphSymbolsProcess(mainJarTask: TaskProvider<out Task>): TaskProvider<out Task> = tasks.register(
    "classGraphSymbolsProcess"
) {
    group = "godot-kotlin-jvm-internal"
    description = "Generates entry files using ClassGraph api"

    with(it) {
//        dependsOn(mainJarTask)

        if (godotJvmExtension.experimentalClassGraphRegistration.get()) {
            doFirst {
                logger
                generateEntryUsingClassGraph(
                    Settings(
                        godotJvmExtension.classPrefix.orNull,
                        godotJvmExtension.isFqNameRegistrationEnabled.get(),
                        (godotJvmExtension.projectName.orNull ?: project.name).replace(" ", "_"),
                        File(projectDir.absolutePath.replace(File.separator, "/")),
                        (
                            godotJvmExtension
                            .registrationFileBaseDir
                            .orNull
                            ?.asFile
                            ?: projectDir
                                .resolve(FileExtensions.GodotKotlinJvm.registrationFile)
                                .apply {
                                    if (godotJvmExtension.isRegistrationFileGenerationEnabled.getOrElse(true)) {
                                        mkdirs()
                                    }
                                }
                        )
                            .relativeTo(projectDir)
                            .path
                            .replace(File.separator, "/")
                            .removePrefix("/")
                            .removeSuffix("/"),
                        godotJvmExtension.isRegistrationFileHierarchyEnabled.get(),
                        layout.buildDirectory.get()
                            .asFile
                            .resolve("generated")
                            .resolve("classgraph")
                            .resolve("main")
                            .resolve("kotlin")
                    ),
                    logger,
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

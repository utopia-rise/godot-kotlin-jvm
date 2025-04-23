package godot.gradle.tasks

import godot.annotation.processor.classgraph.Settings
import godot.annotation.processor.classgraph.generateEntryUsingClassGraph
import godot.gradle.projectExt.godotJvmExtension
import godot.tools.common.constants.FileExtensions
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompilerOptions
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinWithJavaCompilation
import java.io.File

fun Project.classGraphSymbolsProcess(
    classGraphKotlinCompile: KotlinWithJavaCompilation<KotlinJvmOptions, KotlinJvmCompilerOptions>,
    deleteClassGraphGeneratedTask: TaskProvider<out Task>
): TaskProvider<out Task> {
    val classGraphGenerationTask = tasks.register(
        "classGraphSymbolsProcess"
    ) {
        group = "godot-kotlin-jvm-internal"
        description = "Generates entry files using ClassGraph api"

        with(it) {
            dependsOn(classGraphKotlinCompile.compileTaskProvider)
            dependsOn(deleteClassGraphGeneratedTask)

            doFirst {
                val classPath = (classGraphKotlinCompile.compileDependencyFiles + classGraphKotlinCompile.output.allOutputs).files

                generateEntryUsingClassGraph(
                    Settings(
                        classPrefix = godotJvmExtension.classPrefix.orNull,
                        isFqNameRegistrationEnabled = godotJvmExtension.isFqNameRegistrationEnabled.get(),
                        projectName = (godotJvmExtension.projectName.orNull ?: project.name).replace(" ", "_"),
                        projectBaseDir = File(projectDir.absolutePath.replace(File.separator, "/")),
                        registrationBaseDirPathRelativeToProjectDir = (
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
                        isRegistrationFileHierarchyEnabled = godotJvmExtension.isRegistrationFileHierarchyEnabled.get(),
                        isRegistrationFileGenerationEnabled = godotJvmExtension.isRegistrationFileGenerationEnabled.getOrElse(true),
                        generatedSourceRootDir = layout.buildDirectory.get()
                            .asFile
                            .resolve("generated")
                            .resolve("classgraph")
                    ),
                    logger,
                    classPath
                )
            }
        }
    }

    tasks.getByName("compileKotlin").dependsOn(classGraphGenerationTask)

    return classGraphGenerationTask
}

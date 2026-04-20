package godot.gradle.tasks

import godot.gradle.projectExt.godotJvmExtension
import godot.tools.common.constants.FileExtensions
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskProvider
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinWithJavaCompilation

fun Project.classGraphSymbolsProcess(
    classGraphKotlinCompile: KotlinWithJavaCompilation<*, *>
): TaskProvider<out Task> {
    val classGraphGenerationTask = tasks.register(
        "classGraphSymbolsProcess",
        ClassGraphSymbolsProcessTask::class.java
    ) { task ->
        task.group = "godot-kotlin-jvm-internal"
        task.description = "Generates entry files using ClassGraph api"

        task.dependsOn(classGraphKotlinCompile.compileTaskProvider)

        task.userCodeClassPathRoots.from(classGraphKotlinCompile.output.allOutputs)
        task.classPrefix.convention(godotJvmExtension.classPrefix)
        task.fqNameRegistrationEnabled.convention(godotJvmExtension.isFqNameRegistrationEnabled)
        task.projectName.convention(
            providers.provider {
                (godotJvmExtension.projectName.orNull ?: project.name).replace(" ", "_")
            }
        )
        task.registrationBaseDirPathRelativeToProjectDir.convention(
            providers.provider {
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
                    .replace(java.io.File.separator, "/")
                    .removePrefix("/")
                    .removeSuffix("/")
            }
        )
        task.registrationFileHierarchyEnabled.convention(godotJvmExtension.isRegistrationFileHierarchyEnabled)
        task.registrationFileGenerationEnabled.convention(godotJvmExtension.isRegistrationFileGenerationEnabled)
        task.generatedSourceRootDir.convention(layout.buildDirectory.dir("generated/classgraph"))
        task.registrationFilesOutputDir.convention(
            task.registrationBaseDirPathRelativeToProjectDir.map { relativePath ->
                layout.projectDirectory.dir(relativePath)
            }
        )
    }

    tasks.getByName("compileKotlin").dependsOn(classGraphGenerationTask)

    return classGraphGenerationTask
}

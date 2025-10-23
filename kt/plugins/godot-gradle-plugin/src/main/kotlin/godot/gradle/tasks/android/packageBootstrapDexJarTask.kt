package godot.gradle.tasks.android

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.Exec
import org.gradle.api.tasks.TaskProvider
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform
import java.io.File

fun Project.packageBootstrapDexJarTask(
    createBootstrapDexJarTask: TaskProvider<out Task>
): TaskProvider<out Task> {
    return tasks.register("packageBootstrapDexJar", Exec::class.java) {
        with(it) {
            group = "godot-jvm"
            description = "Packages needed resources into godot-bootstrap-dex.jar. Needed for android builds only"

            dependsOn(createBootstrapDexJarTask)

            doFirst {
                val libsDir = project.layout.buildDirectory.asFile.get().resolve("libs")
                val godotBootstrapJar = File(libsDir, "godot-bootstrap.jar")
                val godotBootstrapDexJar = File(libsDir, "godot-bootstrap-dex.jar")
                val resourcesDir = libsDir.resolve("resources").apply { mkdirs() }

                val resourcesToCopy = listOf(
                    "build.properties",
                )

                val zipTree = zipTree(godotBootstrapJar)

                resourcesToCopy.forEach { resourcePath ->
                    val resourceFile = zipTree.firstOrNull { file -> file.path.endsWith(resourcePath) }

                    if (resourceFile == null) {
                        project.logger.error("Could not copy $resourcePath to godot-bootstrap-dex.jar")
                    } else {
                        resourceFile.copyTo(resourcesDir.resolve(resourcePath), overwrite = true)
                    }
                }

                workingDir = libsDir


                // assembles the following command: jar uf <path_to_bootstrap_dex_jar> -C <path_to_resource_dirs_containing_resources_to_copy> build.properties
                // which updates the godot-bootstrap-dex.jar to include the necessary resources as the r8 tool handles only files
                val resourceCopyCommands = resourcesToCopy
                    .flatMap { resourcesToCopy ->
                        listOf(
                            "-C",
                            resourcesDir.absolutePath,
                            resourcesToCopy,
                        )
                    }
                    .toTypedArray()

                if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
                    commandLine(
                        "cmd",
                        "/c",
                        "jar",
                        "uf",
                        godotBootstrapDexJar.absolutePath,
                        *resourceCopyCommands,
                    )
                } else {
                    commandLine(
                        "jar",
                        "uf",
                        godotBootstrapDexJar.absolutePath,
                        *resourceCopyCommands,
                    )
                }
            }
        }
    }
}

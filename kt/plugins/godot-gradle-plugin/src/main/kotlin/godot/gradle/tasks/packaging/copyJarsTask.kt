package godot.gradle.tasks

import godot.gradle.tasks.entry_generation.requireConfiguredGodotProjectDirectory
import godot.tools.common.constants.Paths
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.TaskProvider
import java.io.File

fun Project.createCopyJarsTask(
    packageBootstrapJarTask: TaskProvider<out Task>,
    packageMainJarTask: TaskProvider<out Task>,
    createBootstrapDexJarTask: TaskProvider<out Task>,
    packageMainDexJarTask: TaskProvider<out Task>,
    createGraalNativeImageTask: TaskProvider<out Task>,
    createIOSTask: TaskProvider<out Task>,
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
            mustRunAfter(
                createBootstrapDexJarTask,
                packageMainDexJarTask,
                createGraalNativeImageTask,
                createIOSTask,
            )

            val libsDir = layout.buildDirectory.asFile.get().resolve("libs")
            this.from(File(libsDir, "godot-bootstrap.jar"))
            this.from(File(libsDir, "main.jar"))
            this.from(provider {
                listOf(
                    File(libsDir, "godot-bootstrap-dex.jar"),
                    File(libsDir, "main-dex.jar"),
                    File(libsDir, "usercode.dll"),
                    File(libsDir, "usercode.so"),
                    File(libsDir, "usercode.dylib"),
                ).filter(File::exists)
            })
            this.from(provider {
                listOf(File(libsDir.resolve("ios"), "usercode.a")).filter(File::exists)
            }) {
                into("ios")
            }
            this.from(provider {
                listOf(libsDir.resolve("ios").resolve("ios-jdk")).filter(File::exists)
            }) {
                into("ios")
            }
            this.destinationDir = requireConfiguredGodotProjectDirectory().resolve(Paths.GODOT_KOTLIN_JVM_DIR)
        }
    }
}

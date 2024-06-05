package godot.gradle.tasks.graal.ios

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.Exec
import org.gradle.api.tasks.TaskProvider

fun Project.createIOSStaticLibraryTask(
    downloadStaticJdkLibrariesTask: TaskProvider<out Task>,
    createIOSGraalNativeImageTask: TaskProvider<out Task>
): TaskProvider<out Task> = tasks.register("createIOSStaticLibrary", Exec::class.java) {
    with(it) {
        group = "godot-kotlin-jvm"
        description = "Pack usercode.o in a static library."

        dependsOn(
            downloadStaticJdkLibrariesTask,
            createIOSGraalNativeImageTask
        )

        doFirst {
            val iosLibDir = project.layout.buildDirectory.asFile.get().resolve("libs").resolve("ios")

            commandLine(
                "ar",
                "-r",
                "${iosLibDir.absolutePath}/usercode.a",
                iosLibDir.listFiles()
                    ?.filter { file -> file.isDirectory && file.name.startsWith("SVM-") }
                    ?.maxByOrNull { file -> file.lastModified() }
                    ?.resolve("usercode.o")
                    ?.absolutePath,
            )

            logger.quiet(commandLine.joinToString(" "))
        }
    }
}

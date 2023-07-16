package godot.gradle.tasks.graal.ios

import godot.gradle.tasks.graal.iosGraalFixObject
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.Exec
import org.gradle.api.tasks.TaskProvider
import org.jetbrains.kotlin.gradle.internal.ensureParentDirsCreated
import java.net.URL
import java.util.zip.ZipEntry
import java.util.zip.ZipInputStream

fun Project.createIOSStaticLibraryTask(
    compileIOSGraalFixTask: TaskProvider<out Task>,
    createIOSGraalNativeImageTask: TaskProvider<out Task>
): TaskProvider<out Task> = tasks.register("createIOSStaticLibrary", Exec::class.java) {
    with(it) {
        group = "godot-kotlin-jvm"
        description = "Pack $iosGraalFixObject, usercode.o, jvm and svm object files in one static library."

        dependsOn(
            compileIOSGraalFixTask,
            createIOSGraalNativeImageTask
        )

        doFirst {
            val iosLibDir = project.buildDir.resolve("libs").resolve("ios")

            val jvmVersion = when(IOSJavaVersion(project)) {
                IOSJavaVersion.JVM_11 -> "11-ea-10"
                IOSJavaVersion.JVM_17 -> "18-ea-prep18-8"
            }

            val jdkName = "lib-svm-openjdk-$jvmVersion"
            val javaLibFolder = iosLibDir.resolve("$jdkName-main")

            if (!javaLibFolder.exists()) {
                // Those JDK's are static libraries downloaded from https://download2.gluonhq.com/substrate/staticjdk/
                // Then those libraries have been unpacked to get all objects files
                // This way we can combine JDK's objects files, ios_graal_fix.c and user code object files into one
                // static library that we add using our export plugin.
                val url = URL("https://github.com/utopia-rise/$jdkName/archive/refs/heads/main.zip")
                url.openStream().use { urlStream ->
                    ZipInputStream(urlStream).use { zipInputStream ->
                        var zipEntry: ZipEntry?
                        while (zipInputStream.nextEntry.also { entry -> zipEntry = entry } != null) {
                            val entry = zipEntry
                            requireNotNull(entry)
                            if (!entry.name.endsWith(".o")) continue

                            val file = iosLibDir
                                .resolve(entry.name)
                            file.ensureParentDirsCreated()
                            file.writeBytes(zipInputStream.readAllBytes())
                        }
                    }
                }
            }

            commandLine(
                "ar",
                "-r",
                "${iosLibDir.absolutePath}/usercode.a",
                iosLibDir.listFiles()
                    ?.filter { file -> file.isDirectory && file.name.startsWith("SVM-") }
                    ?.maxByOrNull { file -> file.lastModified() }
                    ?.resolve("usercode.o")
                    ?.absolutePath,
                iosLibDir.resolve(iosGraalFixObject).absolutePath,
                *javaLibFolder
                    .walk()
                    .filter { file -> file.name.endsWith(".o") }
                    .map { file -> file.absolutePath }
                    .toList()
                    .toTypedArray()
            )

            logger.quiet(commandLine.joinToString(" "))
        }
    }
}

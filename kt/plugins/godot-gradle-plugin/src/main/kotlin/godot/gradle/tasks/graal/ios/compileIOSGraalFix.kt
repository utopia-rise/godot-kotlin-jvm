package godot.gradle.tasks.graal.ios

import godot.gradle.GodotExtension
import godot.gradle.tasks.graal.iosGraalFixC
import godot.gradle.tasks.graal.iosGraalFixObject
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.Exec
import org.gradle.api.tasks.TaskProvider
import org.jetbrains.kotlin.gradle.internal.ensureParentDirsCreated
import java.io.InputStream

fun Project.compileIOSGraalFixTask(): TaskProvider<out Task> = tasks.register("compileIOSGraalFix", Exec::class.java) {
    with(it) {
        group = "godot-kotlin-jvm-internal"
        description =
            "INTERNAL TASK ! Compile $iosGraalFixC to $iosGraalFixObject object file, ready to be included in ios static library."

        doFirst {
            val fixCFile = GodotExtension::class.java.getResource("ios/$iosGraalFixC")?.content
            require(fixCFile is InputStream)
            val iosLibDir = project.buildDir.resolve("libs").resolve("ios")
            val fixCFileToWrite = iosLibDir.resolve(iosGraalFixC)
            if (fixCFileToWrite.exists()) {
                fixCFileToWrite.delete()
            }
            fixCFileToWrite.ensureParentDirsCreated()
            fixCFileToWrite.createNewFile()
            fixCFileToWrite.writeBytes(fixCFile.readAllBytes())

            val fixGraalObjectFile = iosLibDir.resolve(iosGraalFixObject).absolutePath

            val xcrunProcess = ProcessBuilder("xcrun", "--sdk", "iphoneos", "--show-sdk-path")
                .start()

            require(xcrunProcess.waitFor() == 0) {
                buildString {
                    appendLine("Can't find ios sdk. Please check your xcode setup.")
                    appendLine(xcrunProcess.errorStream.readAllBytes().decodeToString())
                }
            }

            val iphoneOsSdk = xcrunProcess.inputStream
                .readAllBytes()
                .decodeToString()
                .removeSuffix("\n")

            val gvmPreProcessor = when(IOSJavaVersion(project)) {
                IOSJavaVersion.JVM_11 -> "GVM_11"
                IOSJavaVersion.JVM_17 -> "GVM_17"
            }

            commandLine(
                "clang",
                "-c",
                "-arch",
                "arm64",
                "-mios-version-min=11.0",
                "-isysroot",
                iphoneOsSdk,
                "-D$gvmPreProcessor",
                fixCFileToWrite.absolutePath,
                "-o",
                fixGraalObjectFile
            )

            logger.quiet(commandLine.joinToString(" "))
        }
    }
}

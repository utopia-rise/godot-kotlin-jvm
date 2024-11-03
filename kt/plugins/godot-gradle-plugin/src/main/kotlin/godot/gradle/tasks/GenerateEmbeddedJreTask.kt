package godot.gradle.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.util.*

open class GenerateEmbeddedJreTask : DefaultTask() {

    @Input
    var modules: String = "java.base,java.logging"

    @Input
    var outputDir: String = "jvm/jre-${getArch()}-${getOs()}"

    @Input
    var arguments: Array<String> = arrayOf(
        "--strip-debug",
        "--no-header-files",
        "--no-man-pages"
    )

    @Input
    var javaHome: String = System.getProperty("java.home")

    @TaskAction
    fun createJre() {
        File(outputDir).deleteRecursively()
        project.exec {
            it.commandLine(
                "$javaHome/bin/jlink",
                "--add-modules", modules,
                "--output", outputDir,
                *arguments,
            )
        }

        logger.lifecycle("Custom JRE created in $outputDir using modules: '$modules', arguments: '${arguments.joinToString(" ")}' and java home: $javaHome")
    }

    private fun getArch(): String {
        return when (val arch = System.getProperty("os.arch")) {
            "aarch64", "arm64" -> "arm64"
            "x86_64", "amd64" -> "amd64"
            else -> throw IllegalArgumentException("Unsupported host architecture: $arch")
        }
    }

    private fun getOs(): String {
        val os = System.getProperty("os.name").lowercase(Locale.US)
        return when {
            os.contains("mac", true) -> "macos"
            os.contains("nix", true) || os.contains("nux", true) || os.contains("aix", true) -> "linux"
            os.contains("win", true) -> "windows"
            else -> throw IllegalArgumentException("Unsupported host operating system: $os")
        }
    }
}

package godot.gradle.tasks

import godot.tools.common.constants.Paths
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import org.gradle.process.ExecOperations
import java.io.File
import java.util.*
import javax.inject.Inject

open class GenerateEmbeddedJreTask @Inject constructor(
    private val execOperations: ExecOperations,
) : DefaultTask() {

    @Input
    var modules: Array<String> = arrayOf(
        "java.base",
        "java.logging",
    )

    @Input
    var outputDir: String = "${Paths.GODOT_JVM_DIR}/jre-${getArch()}-${getOs()}"

    @Input
    var arguments: Array<String> = arrayOf(
        "--strip-debug",
        "--no-header-files",
        "--no-man-pages"
    )

    @Input
    var javaHome: String? = null

    @TaskAction
    fun createJre() {
        File(outputDir).deleteRecursively()

        val resolvedJavaHome = javaHome ?: System.getProperty("java.home")

        execOperations.exec { spec ->
            spec.commandLine(
                "$resolvedJavaHome/bin/jlink",
                "--add-modules", modules.joinToString(","),
                "--output", outputDir,
                *arguments,
            )
        }

        logger.lifecycle(
            "Custom JRE created in $outputDir using modules: '${modules.joinToString(",")}', arguments: '${
                arguments.joinToString(" ")
            }' and java home: $resolvedJavaHome"
        )
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

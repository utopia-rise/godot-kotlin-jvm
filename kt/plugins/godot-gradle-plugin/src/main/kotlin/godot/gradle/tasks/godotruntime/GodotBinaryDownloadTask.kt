package godot.gradle.tasks.godotruntime

import godot.gradle.GodotExtension
import kong.unirest.Unirest
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import java.io.File


/**
 * This task comes with its own class, because we want to be able to make multiple versions, depending on which OS version we want to try out.
 * This is useful for linux and mac, where we can try the application against Wine, as a quick test.
 * */
abstract class GodotBinaryDownloadTask : DefaultTask() {
    init {
        group = "godot-kotlin-jvm-internal"
        description = "Downloads godot binaries to be used by the run tasks"
    }

    @TaskAction
    fun downloadBinaries() {

        val godotExtension = project.extensions.getByName("godot") as GodotExtension
        //create a version url, that we can use as a base for the individual binaries
        val os = godotExtension.os
        val editorURL = PathManager.getEditorURL(godotExtension)
        val editorFilePath = PathManager.getEditorFilePath(project, os.get())
        val tempFile = PathManager.getDownloadPathForOS(os.get(), project)

        File(tempFile).parentFile.mkdirs()

        logger.info(
            "downloading" +
                " godot editor from $editorURL into $editorFilePath"
        )
        //we only download if the file is missing
        if (!File(tempFile).exists()) {
            Unirest.get(editorURL)
                .downloadMonitor { b, fileName, bytesWritten, totalBytes -> logger.info("Downloading file, ${totalBytes - bytesWritten} bytes left") }
                .asFile(tempFile)
                .ifSuccess {
                    logger.info("Editor downloaded!")
                }
                .ifFailure {
                    logger.error("Failed to download godot editor! Status: ${it.statusText}")
                    it.parsingError.ifPresent { e ->
                        logger.error("Parsing Exception: ", e)
                        logger.error("Original body: " + e.originalBody)
                    }
                }
        }
    }
}

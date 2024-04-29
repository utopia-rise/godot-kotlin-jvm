package godot.gradle.tasks.graal

import godot.gradle.GodotExtension
import godot.gradle.projectExt.godotJvmExtension
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.internal.ensureParentDirsCreated
import java.io.File
import java.io.InputStream

fun Project.copyToGraalBuildDirectory(resourcePath: String) {
    val resource = GodotExtension::class.java.getResource(resourcePath)?.content
    require(resource is InputStream)

    val outputFile = buildDir.resolve("graal").resolve(resourcePath)
    outputFile.ensureParentDirsCreated()
    if (outputFile.exists()) {
        outputFile.delete()
    }
    outputFile.createNewFile()
    resource.copyTo(
        outputFile.outputStream()
    )
}

fun Project.getGraalVmAdditionalJniConfigs(): String {
    val additionalJniConfiguration = godotJvmExtension.additionalGraalJniConfigurationFiles.get()
        .map {
            projectDir.resolve("graal").resolve(it).absolutePath
        }
    return if (additionalJniConfiguration.isNotEmpty()) {
        additionalJniConfiguration.joinToString(separator = ",")
    } else {
        ""
    }
}

fun Project.getAdditionalGraalResourceConfigurationFiles() = godotJvmExtension
    .additionalGraalResourceConfigurationFiles
    .getOrElse(arrayOf())
    .joinToString(",")

fun Project.getAdditionalGraalReflectionConfigurationFiles() = godotJvmExtension
    .additionalGraalReflectionConfigurationFiles
    .getOrElse(arrayOf())
    .joinToString(",")

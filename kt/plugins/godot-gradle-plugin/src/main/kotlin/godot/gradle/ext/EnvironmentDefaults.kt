package godot.gradle.ext

import java.io.File

internal fun environmentVariable(name: String): String? =
    System.getenv(name)?.takeUnless(String::isBlank)

internal fun File.existingDirectoryOrNull(): File? =
    takeIf { it.exists() && it.isDirectory }

internal fun File.existingFileOrNull(): File? =
    takeIf { it.exists() && it.isFile }

internal fun File.executableFileOrNull(): File? =
    takeIf { it.exists() && it.isFile && it.canExecute() }

internal fun File.resolveExecutable(name: String): File =
    resolve("bin").resolve(name)

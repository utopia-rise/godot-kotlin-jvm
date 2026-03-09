package godot.entrygenerator.ext

import godot.tools.common.constants.FileExtensions
import java.io.File

fun File.provideExistingRegistrationFiles(): Map<String, File> {
    val excludedDirs = listOf(
        "build", // needs to be excluded so the registration files generated from the entry generator are not counted as existing registration files
        "android", // needs to be excluded as godot copies every godot asset to the embedded android gradle project located in this directory which includes our gdj files. Thus we would never update them.
    )

    return walkTopDown()
        .onEnter { directory ->
            // do not enter excluded directories or hidden directories
            !excludedDirs.contains(directory.toRelativeString(this))
                && !directory.name.startsWith(".")
        }
        .filter { file ->
            file.extension == FileExtensions.GodotKotlinJvm.registrationFile
        }
        .associateBy { file ->
            file.name
        }
}

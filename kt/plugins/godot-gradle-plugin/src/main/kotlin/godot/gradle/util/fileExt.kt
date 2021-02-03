package godot.gradle.util

import java.io.File

val File.absolutePathFixedForWindows: String
    get() = absolutePath.removeSuffix(";C") // don't know what this is but it's here on windows on kotlin sources dir's path and it has to be removed for the files to be found...


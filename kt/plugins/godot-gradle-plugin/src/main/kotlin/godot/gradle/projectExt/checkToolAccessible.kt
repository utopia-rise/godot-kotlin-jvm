package godot.gradle.projectExt

import org.gradle.api.Project
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform

fun Project.checkToolAccessible(toolPath: String) = exec {
    with(it) {
        workingDir = projectDir
        isIgnoreExitValue = true

        if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
            commandLine("cmd", "/c", toolPath, "--version")
        } else {
            commandLine(toolPath, "--version")
        }
    }
}

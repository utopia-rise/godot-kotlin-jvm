package godot.gradle.projectExt

import org.gradle.api.Project
import org.gradle.internal.extensions.core.serviceOf
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform
import org.gradle.process.ExecOperations
import org.gradle.process.ExecResult

fun Project.checkToolAccessible(toolPath: String): ExecResult {
    return this.serviceOf<ExecOperations>().exec {
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
}

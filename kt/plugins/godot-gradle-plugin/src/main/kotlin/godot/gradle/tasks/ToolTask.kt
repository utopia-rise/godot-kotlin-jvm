package godot.gradle.tasks

import org.gradle.api.tasks.Exec
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform
import java.io.File

abstract class ToolTask: Exec(), GodotJvmTask {

    abstract val toolFile: File

    protected fun checkToolAccessible() = project.exec {
        with(it) {
            workingDir = project.projectDir
            isIgnoreExitValue = true

            if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
                commandLine("cmd", "/c", toolFile.absolutePath, "--version")
            } else {
                commandLine(toolFile.absolutePath, "--version")
            }
        }
    }
}

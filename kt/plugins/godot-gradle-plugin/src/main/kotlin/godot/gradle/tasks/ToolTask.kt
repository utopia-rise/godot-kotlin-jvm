package godot.gradle.tasks

import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.Exec
import org.gradle.api.tasks.Internal
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform

abstract class ToolTask: Exec(), GodotJvmTask {

    @Internal
    open val toolFile: RegularFileProperty = throw NotImplementedError()

    protected fun checkToolAccessible(notAccessibleCallback: () -> Unit) = try {
        project.exec {
            with(it) {
                workingDir = project.projectDir
                isIgnoreExitValue = true

                if (DefaultNativePlatform.getCurrentOperatingSystem().isWindows) {
                    commandLine("cmd", "/c", toolFile.get().asFile.absolutePath, "--version")
                } else {
                    commandLine(toolFile.get().asFile.absolutePath, "--version")
                }
            }
        }
    } catch (e: Throwable) {
        notAccessibleCallback()
    }
}

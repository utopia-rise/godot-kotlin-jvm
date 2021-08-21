package godot.gradle.tasks

import org.gradle.api.Task

interface GodotJvmTask: Task {
    fun setup()
}

package godot.intellij.plugin

import com.intellij.openapi.project.Project

interface ProjectDisposable {
    fun dispose(project: Project)
}

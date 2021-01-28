package godot.intellij.plugin

import com.intellij.openapi.Disposable
import com.intellij.openapi.project.Project

interface ProjectDisposable : Disposable {
    fun dispose(project: Project)
    override fun dispose() {}
}

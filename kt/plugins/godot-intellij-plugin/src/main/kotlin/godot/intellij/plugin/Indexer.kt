package godot.intellij.plugin

import com.intellij.openapi.Disposable
import com.intellij.openapi.project.Project

interface Indexer {
    fun initialIndex(parentDisposable: Disposable, project: Project)
    fun dispose(project: Project) {}
}

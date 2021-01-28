package godot.intellij.plugin.listener

import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import com.intellij.openapi.vfs.VirtualFileManager
import com.intellij.openapi.vfs.newvfs.BulkFileListener
import godot.intellij.plugin.ProjectDisposable

class GodotProjectManagerListener : ProjectManagerListener {
    private val listenerPerProject: MutableMap<Project, MutableList<ProjectDisposable>> = mutableMapOf()

    override fun projectOpened(project: Project) {
        listenerPerProject[project] = mutableListOf(
            KtPsiTreeListener(project)
        )

        listenerPerProject
            .values
            .flatten()
            .filterIsInstance<BulkFileListener>()
            .forEach { bulkFileListener ->
                project.messageBus.connect().subscribe(VirtualFileManager.VFS_CHANGES, bulkFileListener)
            }
    }

    override fun projectClosing(project: Project) {
        listenerPerProject.remove(project)?.forEach { godotListener ->
            godotListener.dispose(project)
        }
    }
}

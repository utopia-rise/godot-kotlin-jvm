package godot.intellij.plugin.listener

import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity
import com.intellij.openapi.vfs.VirtualFileManager
import com.intellij.openapi.vfs.newvfs.BulkFileListener
import godot.intellij.plugin.ProjectDisposable

class GodotProjectManagerListener : ProjectActivity, ProjectDisposable {
    private val listenerPerProject: MutableMap<Project, List<ProjectDisposable>> = mutableMapOf()

    override suspend fun execute(project: Project) {
        listenerPerProject[project] = listOf(
            PsiTreeListener(project),
            GodotSceneBulkFileListener(project)
        )

        listenerPerProject
            .values
            .flatten()
            .filterIsInstance<BulkFileListener>()
            .forEach { bulkFileListener ->
                project.messageBus.connect().subscribe(VirtualFileManager.VFS_CHANGES, bulkFileListener)
            }
    }

    override fun dispose(project: Project) {
        listenerPerProject.remove(project)?.forEach { godotListener ->
            godotListener.dispose(project)
        }
    }
}

package godot.intellij.plugin.listener

import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.StartupActivity
import com.intellij.openapi.vfs.VirtualFileManager
import com.intellij.openapi.vfs.newvfs.BulkFileListener

class GodotStartupActivity: StartupActivity {
    override fun runActivity(project: Project) {
        val listenersForThisProject = listOf(
            KtPsiTreeListener(project),
            GodotSceneBulkFileListener(project)
        )

        listenersForThisProject
            .filterIsInstance<BulkFileListener>()
            .forEach { bulkFileListener ->
                project.messageBus.connect().subscribe(VirtualFileManager.VFS_CHANGES, bulkFileListener)
            }
    }
}

package godot.intellij.plugin.listener

import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.fileTypes.PlainTextFileType
import com.intellij.openapi.project.DumbService
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.ProjectFileIndex
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.vfs.newvfs.BulkFileListener
import com.intellij.openapi.vfs.newvfs.events.VFileEvent
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.util.indexing.FileBasedIndex
import com.intellij.util.indexing.ID
import com.utopiarise.serialization.godot.scene.sceneFromTscn
import godot.intellij.plugin.ProjectDisposable
import godot.intellij.plugin.data.cache.signalconnection.SignalConnectionCacheProvider
import godot.intellij.plugin.extension.getGodotRoot

class GodotSceneBulkFileListener(private val project: Project) : BulkFileListener, ProjectDisposable {

    init {
        DumbService.getInstance(project).runWhenSmart {
            initialIndexing()
        }
    }

    override fun after(events: MutableList<out VFileEvent>) {
        events
            .filter {
                it.file?.let { vFile -> ProjectFileIndex.getInstance(project).isInContent(vFile) } ?: false
            }
            .forEach { event ->
                event.file?.let { file ->
                    virtualFileChanged(file)
                }
            }
    }

    private fun initialIndexing() = getContainingFiles()
        .forEach { vFile ->
            virtualFileChanged(vFile)
        }

    private fun getContainingFiles() = FileBasedIndex
        .getInstance()
        .getContainingFiles(
            ID.create<FileType, Void>("filetypes"),
            PlainTextFileType.INSTANCE,
            GlobalSearchScope.projectScope(project)
        )

    private fun virtualFileChanged(file: VirtualFile) {
        val godotRoot = file.getGodotRoot(project) ?: return

        if (file.extension == "tscn" && file.isValid && file.isInLocalFileSystem) {
            val path = file.canonicalPath ?: return
            val signals = try {
                sceneFromTscn(path)
            } catch (e: Throwable) {
                // TODO: show some info maybe
                null
            }
                ?.signalConnections
                ?: return

            SignalConnectionCacheProvider
                .provide(godotRoot)
                .updateSignalConnections(
                    project,
                    path,
                    signals
                )
        } else {
            val path = file.canonicalPath ?: return
            SignalConnectionCacheProvider
                .provide(godotRoot)
                .removeSignalConnections(
                    path
                )
        }
    }

    override fun dispose(project: Project) {
        SignalConnectionCacheProvider
            .disposeForProject(project)
    }
}

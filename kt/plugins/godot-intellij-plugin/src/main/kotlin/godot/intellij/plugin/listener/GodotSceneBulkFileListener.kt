package godot.intellij.plugin.listener

import com.intellij.openapi.fileTypes.PlainTextFileType
import com.intellij.openapi.project.DumbService
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.ProjectFileIndex
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.vfs.newvfs.BulkFileListener
import com.intellij.openapi.vfs.newvfs.events.VFileEvent
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.util.indexing.FileBasedIndex
import com.utopiarise.serialization.godot.scene.sceneFromTscn
import godot.intellij.plugin.ProjectDisposable
import godot.intellij.plugin.data.cache.SignalConnectionCacheProvider

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

    private fun initialIndexing() {
        FileBasedIndex
            .getInstance()
            .getContainingFiles(
                FileTypeIndex.NAME,
                PlainTextFileType.INSTANCE,
                GlobalSearchScope.projectScope(project)
            )
            .forEach { vFile ->
                virtualFileChanged(vFile)
            }
    }

    private fun virtualFileChanged(file: VirtualFile) {
        if (file.extension == "tscn" && file.isValid && file.isInLocalFileSystem) {
            val path = file.canonicalPath ?: return
            val signals = try {
                sceneFromTscn(path)
            } catch (e: Throwable) {
                //TODO: show some info maybe
                null
            }
                ?.signalConnections
                ?: return

            SignalConnectionCacheProvider
                .provide(project)
                .updateSignalConnections(
                    project,
                    path,
                    signals
                )
        } else {
            val path = file.canonicalPath ?: return
            SignalConnectionCacheProvider
                .provide(project)
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

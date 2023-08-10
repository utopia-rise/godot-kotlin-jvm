package godot.intellij.plugin.listener

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.project.DumbService
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.ProjectFileIndex
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.vfs.newvfs.BulkFileListener
import com.intellij.openapi.vfs.newvfs.events.VFileEvent
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.utopiarise.serialization.godot.scene.sceneFromTscn
import godot.intellij.plugin.ProjectDisposable
import godot.intellij.plugin.data.cache.signalconnection.SignalConnectionCacheProvider
import godot.intellij.plugin.extension.getGodotRoot
import godot.intellij.plugin.language.scene.filetype.GodotSceneFileType
import org.jetbrains.kotlin.idea.util.projectStructure.getModule

class GodotSceneBulkFileListener(private val project: Project) : BulkFileListener, ProjectDisposable {

    init {
        DumbService.getInstance(project).runWhenSmart {
            ApplicationManager.getApplication().executeOnPooledThread {
                // needs to run in background initially to avoid:
                // java.lang.Throwable: Slow operations are prohibited on EDT. See SlowOperations.assertSlowOperationsAreAllowed javadoc.
                initialIndexing()
            }
        }
    }

    override fun after(events: MutableList<out VFileEvent>) {
        events
            .filter {
                !project.isDisposed && it.file?.let { vFile ->
                    ProjectFileIndex.getInstance(project).isInContent(vFile)
                } ?: false
            }
            .forEach { event ->
                event.file?.let { file ->
                    virtualFileChanged(file)
                }
            }
    }

    private fun initialIndexing() = provideContainingFilesAsync { vFiles ->
        vFiles.forEach { vFile ->
            virtualFileChanged(vFile)
        }
    }

    @Suppress("UnstableApiUsage")
    private fun provideContainingFilesAsync(callback: (List<VirtualFile>) -> Unit) {
        ApplicationManager.getApplication().runReadAction {
            val files = FileTypeIndex
                .getFiles(GodotSceneFileType.INSTANCE, GlobalSearchScope.allScope(project))
                .toList()

            ApplicationManager.getApplication().executeOnPooledThread {
                callback(files)
            }
        }
    }

    private fun virtualFileChanged(file: VirtualFile) {
        val godotRoot = file.getGodotRoot(project) ?: return
        val module = file.getModule(project) ?: return

        if (file.extension == GodotSceneFileType.EXTENSION && file.isValid && file.isInLocalFileSystem) {
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
                    module,
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

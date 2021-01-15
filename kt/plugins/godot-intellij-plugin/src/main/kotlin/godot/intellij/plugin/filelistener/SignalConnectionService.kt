package godot.intellij.plugin.filelistener

import com.intellij.openapi.components.Service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import com.intellij.openapi.roots.ProjectFileIndex
import com.intellij.openapi.vfs.VirtualFileManager
import com.intellij.openapi.vfs.newvfs.BulkFileListener
import com.intellij.openapi.vfs.newvfs.events.VFileEvent
import com.utopiarise.serialization.godot.scene.sceneFromTscn
import godot.intellij.plugin.signal.SignalConnectionHandlerProvider

@Service
class SignalConnectionService : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        project.messageBus.connect().subscribe(VirtualFileManager.VFS_CHANGES, SceneFileListener(project))
    }

    override fun projectClosing(project: Project) {
        SignalConnectionHandlerProvider
            .disposeSignalConnectionHandlerForProject(project)
    }

    class SceneFileListener(private val project: Project) : BulkFileListener {
        override fun after(events: MutableList<out VFileEvent>) {
            events
                .filter {
                    it.file?.let { vFile -> ProjectFileIndex.getInstance(project).isInContent(vFile) } ?: false
                }
                .forEach { event ->
                    if (event.file?.extension == "tscn") {
                        if (event.file?.isValid == true && event.file?.isInLocalFileSystem == true) {
                            val path = event.file?.canonicalPath ?: return@forEach
                            val signals = try {
                                sceneFromTscn(path)
                            } catch (e: Throwable) {
                                //TODO: show some info maybe
                                null
                            }
                                ?.signalConnections
                                ?: return@forEach

                            SignalConnectionHandlerProvider
                                .getInstanceForProject(project)
                                .updateSignalConnections(
                                    path,
                                    signals
                                )
                        } else {
                            val path = event.file?.canonicalPath ?: return@forEach
                            SignalConnectionHandlerProvider
                                .getInstanceForProject(project)
                                .removeSignalConnections(
                                    path
                                )
                        }
                    }
                }
        }
    }
}

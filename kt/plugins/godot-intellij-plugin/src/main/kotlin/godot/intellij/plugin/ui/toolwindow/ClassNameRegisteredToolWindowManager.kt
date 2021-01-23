package godot.intellij.plugin.ui.toolwindow

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.RegisterToolWindowTask
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowManager
import com.intellij.ui.OnePixelSplitter
import com.intellij.ui.components.Label
import godot.intellij.plugin.inspections.registration.inspector.clazz.RegisteredClassNameCheckerProvider
import java.awt.EventQueue

object ClassNameRegisteredToolWindowManager {
    private val toolWindowId = "testiblubb"

    fun show(registeredName: String, project: Project) {
        EventQueue.invokeLater {
            with(project.classNameRegisteredToolWindow) {
                val content = with(contentManager.factory) {
                    createContent(
                        createPanel(RegisteredClassNameCheckerProvider.provide(project).getFqNamesRegisteredWithName(registeredName)),
                        "Classes registered with $registeredName",
                        false
                    )
                }
                contentManager.addContent(content)
                show()
            }
        }
    }

    private fun createPanel(fqNamesRegisteredWithName: Set<String>): OnePixelSplitter {
        val panel = OnePixelSplitter()
        panel.firstComponent = Label(fqNamesRegisteredWithName.joinToString("\n"))
        return panel
    }

    private val Project.classNameRegisteredToolWindow: ToolWindow
        get() = toolWindowManager.getToolWindow(toolWindowId)
            ?: toolWindowManager.registerToolWindow(
                RegisterToolWindowTask(
                    toolWindowId
                )
            )
}

val Project.toolWindowManager: ToolWindowManager
    get() = ToolWindowManager.getInstance(this)

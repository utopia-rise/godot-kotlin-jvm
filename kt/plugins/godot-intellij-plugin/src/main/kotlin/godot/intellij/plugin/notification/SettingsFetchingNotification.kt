package godot.intellij.plugin.notification

import com.intellij.ide.highlighter.JavaFileType
import com.intellij.openapi.fileEditor.FileEditor
import com.intellij.openapi.ide.CopyPasteManager
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.DumbService
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.popup.JBPopupFactory
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.ui.EditorNotificationPanel
import com.intellij.ui.EditorNotificationProvider
import com.intellij.ui.EditorNotifications
import com.intellij.ui.components.JBScrollPane
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.extension.isInGodotRoot
import org.jetbrains.kotlin.idea.KotlinFileType
import org.jetbrains.kotlin.utils.addToStdlib.firstIsInstance
import java.awt.BorderLayout
import java.awt.Color
import java.awt.Dimension
import java.awt.datatransfer.StringSelection
import java.util.function.Function
import javax.swing.JButton
import javax.swing.JComponent
import javax.swing.JLabel
import javax.swing.JTextArea
import javax.swing.UIManager
import javax.swing.text.DefaultCaret

/**
 * Displays a in editor banner notification when retrieving the gradle settings
 */
class SettingsFetchingNotification(
    private val project: Project,
) : DumbAware, EditorNotificationProvider {
    private var isHidden: Boolean = true

    internal var unconfiguredReason: UnconfiguredReason = UnconfiguredReason.GradleSyncing
        set(value) {
            field = value
            isHidden = false
            EditorNotifications.getInstance(project).updateAllNotifications()
        }

    fun hide() {
        isHidden = true
    }

    override fun collectNotificationData(
        project: Project,
        file: VirtualFile
    ): Function<in FileEditor, out JComponent?> {
        return Function { createNotificationPanel(file, project) }
    }

    private fun createNotificationPanel(file: VirtualFile, project: Project): EditorNotificationPanel? {
        if (file.fileType != KotlinFileType.INSTANCE && file.fileType != JavaFileType.INSTANCE) return null
        if (!file.isInGodotRoot(project)) return null

        return if (!DumbService.isDumb(project) && !isHidden) {
            val message = when (val unconfiguredReason = unconfiguredReason) {
                is UnconfiguredReason.GradleSyncing -> GodotPluginBundle.message("settingsIndex.unconfigured.reason.gradleSyncInProgress")
                is UnconfiguredReason.Syncing -> GodotPluginBundle.message("settingsIndex.unconfigured.reason.syncInProgress")
                is UnconfiguredReason.Incompatible -> unconfiguredReason.errorMessage
            }
            EditorNotificationPanel(Color.decode("#7e56c2")).apply {
                text = message
                val unconfiguredReason = unconfiguredReason
                if (unconfiguredReason is UnconfiguredReason.Incompatible && unconfiguredReason.exception != null) {
                    createActionLabel(GodotPluginBundle.message("settingsIndex.error.showErrorAction")) {
                        val errorText = """
                          ${unconfiguredReason.exception.message}:
                            ${unconfiguredReason.exception.stackTraceToString()}
                        """.trimIndent()

                        @Suppress("DialogTitleCapitalization")
                        JBPopupFactory.getInstance().createComponentPopupBuilder(PopupComponent(errorText), null)
                            .setTitle(GodotPluginBundle.message("settingsIndex.error.connectionError")).createPopup().showInFocusCenter()
                    }
                }
            }
        } else null
    }

    @Suppress("CompanionObjectInExtension")
    companion object {
        fun getInstance(project: Project): SettingsFetchingNotification {
            return DumbService.getDumbAwareExtensions(project, EditorNotificationProvider.EP_NAME).firstIsInstance()
        }
    }

    internal sealed interface UnconfiguredReason {
        data object GradleSyncing : UnconfiguredReason
        data class Incompatible(
            val errorMessage: String,
            val exception: Exception?,
        ) : UnconfiguredReason

        data object Syncing : UnconfiguredReason
    }

    private class PopupComponent(text: String) : JComponent() {
        private val textArea: JTextArea

        init {
            layout = BorderLayout()
            textArea = JTextArea(text)
            textArea.isEditable = false
            textArea.lineWrap = true
            textArea.wrapStyleWord = true
            textArea.background = UIManager.getColor("Panel.background")
            textArea.font = UIManager.getFont("Label.font")
            val scrollPane = JBScrollPane(textArea)
            scrollPane.preferredSize = Dimension(500, 500)
            val caret = textArea.caret as DefaultCaret
            caret.updatePolicy = DefaultCaret.NEVER_UPDATE
            add(scrollPane, BorderLayout.CENTER)
            val copyButton = JButton(GodotPluginBundle.message("settingsIndex.error.copyAction"))
            copyButton.addActionListener {
                val stringSelection = StringSelection(textArea.text)
                CopyPasteManager.getInstance().setContents(stringSelection)
                JBPopupFactory.getInstance().createBalloonBuilder(JLabel(GodotPluginBundle.message("settingsIndex.error.copyMessage")))
                    .createBalloon().showInCenterOf(copyButton)
            }
            add(copyButton, BorderLayout.SOUTH)
        }
    }
}

package godot.intellij.plugin.ui.dialog

import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.components.JBScrollPane
import godot.intellij.plugin.data.model.IncomingSignalConnectionDataContainer
import godot.intellij.plugin.ui.component.table.IncomingSignalConnectionTable
import godot.intellij.plugin.ui.component.table.IncomingSignalConnectionTableModel
import java.awt.BorderLayout
import java.awt.Dimension
import javax.swing.Action
import javax.swing.JComponent
import javax.swing.JLabel
import javax.swing.JPanel

class IncomingSignalConnectionsDialog(
    private val incomingSignalConnectionDataContainers: List<IncomingSignalConnectionDataContainer>
) : DialogWrapper(true) {
    private val titleString = "Connections to Method: ::${incomingSignalConnectionDataContainers.firstOrNull()?.toFunctionName ?: "n/a"}"

    init {
        init() // from dialog wrapper class
        title = titleString
    }

    override fun createCenterPanel(): JComponent {
        return JPanel(BorderLayout()).apply {
            preferredSize = Dimension(800, 200)
            add(JLabel(titleString), BorderLayout.NORTH) // for window manager with no window borders (like i3wm)
            add(
                JBScrollPane(
                    IncomingSignalConnectionTable(
                        IncomingSignalConnectionTableModel(incomingSignalConnectionDataContainers)
                    )
                ),
                BorderLayout.CENTER
            )
        }
    }

    override fun createActions(): Array<Action> = arrayOf(okAction)
}

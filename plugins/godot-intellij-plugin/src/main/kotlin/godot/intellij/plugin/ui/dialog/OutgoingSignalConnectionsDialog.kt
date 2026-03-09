package godot.intellij.plugin.ui.dialog

import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.components.JBScrollPane
import godot.intellij.plugin.data.model.OutgoingSignalConnectionDataContainer
import godot.intellij.plugin.ui.component.table.OutgoingSignalConnectionTable
import godot.intellij.plugin.ui.component.table.OutgoingSignalConnectionTableModel
import java.awt.BorderLayout
import java.awt.Dimension
import javax.swing.Action
import javax.swing.JComponent
import javax.swing.JLabel
import javax.swing.JPanel

class OutgoingSignalConnectionsDialog(
    private val outgoingSignalConnectionDataContainers: List<OutgoingSignalConnectionDataContainer>
) : DialogWrapper(true) {
    private val titleString = "Connections from Signal: ::${outgoingSignalConnectionDataContainers.firstOrNull()?.signalName ?: "n/a"}"

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
                    OutgoingSignalConnectionTable(
                        OutgoingSignalConnectionTableModel(outgoingSignalConnectionDataContainers)
                    )
                ),
                BorderLayout.CENTER
            )
        }
    }

    override fun createActions(): Array<Action> = arrayOf(okAction)
}

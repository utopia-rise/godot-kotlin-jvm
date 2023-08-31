package godot.intellij.plugin.ui.component.table

import com.intellij.ui.table.JBTable
import javax.swing.table.DefaultTableCellRenderer
import javax.swing.table.TableCellRenderer

class OutgoingSignalConnectionTable(
    model: OutgoingSignalConnectionTableModel
) : JBTable(model) {
    private val sceneCellRenderer = IconCellRenderer("/icon_packed_scene.svg")
    private val sourceCellRenderer = IconCellRenderer("/icon_node.svg")
    private val signalCellRenderer = IconCellRenderer("/linemarkerIcons/icon_signals.svg")
    private val targetCellRenderer = IconCellRenderer("/icon_node.svg")

    init {
        cellSelectionEnabled = false
        rowSelectionAllowed = false
        columnSelectionAllowed = false
        showHorizontalLines = false
        showVerticalLines = false
        fillsViewportHeight = true
    }

    override fun getCellRenderer(row: Int, column: Int): TableCellRenderer {
        return when (column) {
            0 -> sceneCellRenderer
            1 -> sourceCellRenderer
            2 -> signalCellRenderer
            3 -> targetCellRenderer
            else -> DefaultTableCellRenderer()
        }
    }
}

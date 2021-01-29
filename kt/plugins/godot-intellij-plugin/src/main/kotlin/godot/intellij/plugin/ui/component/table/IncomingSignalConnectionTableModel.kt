package godot.intellij.plugin.ui.component.table

import godot.intellij.plugin.data.model.IncomingSignalConnectionDataContainer
import javax.swing.table.AbstractTableModel

class IncomingSignalConnectionTableModel(
    private val incomingSignalConnectionDataContainers: List<IncomingSignalConnectionDataContainer>
): AbstractTableModel() {
    private val columnNames = arrayOf("Scene", "Source", "Signal", "Target")
    private val tableData = incomingSignalConnectionDataContainers
        .map { incomingSignalConnectionDataContainer ->
            arrayOf(
                incomingSignalConnectionDataContainer.scenePath,
                incomingSignalConnectionDataContainer.fromNodeName,
                incomingSignalConnectionDataContainer.signalName,
                incomingSignalConnectionDataContainer.toNodeName
            )
        }
        .toTypedArray()

    override fun getRowCount(): Int = incomingSignalConnectionDataContainers.size
    override fun getColumnCount(): Int = columnNames.size
    override fun getColumnName(index: Int): String {
        return columnNames.getOrNull(index) ?: "n/a"
    }

    override fun getValueAt(rowIndex: Int, columnIndex: Int): Any {
        return tableData.getOrNull(rowIndex)?.getOrNull(columnIndex) ?: "n/a"
    }
}

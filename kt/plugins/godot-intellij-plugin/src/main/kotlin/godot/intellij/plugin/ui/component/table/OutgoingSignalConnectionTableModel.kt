package godot.intellij.plugin.ui.component.table

import godot.intellij.plugin.data.model.OutgoingSignalConnectionDataContainer
import javax.swing.table.AbstractTableModel

class OutgoingSignalConnectionTableModel(
    private val outgoingSignalConnectionDataContainers: List<OutgoingSignalConnectionDataContainer>
) : AbstractTableModel() {
    private val columnNames = arrayOf("Scene", "Source", "Method", "Target")
    private val tableData = outgoingSignalConnectionDataContainers
        .map { outgoingSignalConnectionDataContainer ->
            arrayOf(
                outgoingSignalConnectionDataContainer.scenePath,
                outgoingSignalConnectionDataContainer.fromNodeName,
                outgoingSignalConnectionDataContainer.targetFunctionName,
                outgoingSignalConnectionDataContainer.targetNodeName
            )
        }
        .toTypedArray()

    override fun getRowCount(): Int = outgoingSignalConnectionDataContainers.size
    override fun getColumnCount(): Int = columnNames.size
    override fun getColumnName(index: Int): String {
        return columnNames.getOrNull(index) ?: "n/a"
    }

    override fun getValueAt(rowIndex: Int, columnIndex: Int): Any {
        return tableData.getOrNull(rowIndex)?.getOrNull(columnIndex) ?: "n/a"
    }
}

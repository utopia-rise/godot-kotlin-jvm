package godot.intellij.plugin.ui.component.table

import com.intellij.openapi.util.IconLoader
import javax.swing.table.DefaultTableCellRenderer

class IconCellRenderer(iconPath: String): DefaultTableCellRenderer() {
    init {
        icon = IconLoader.getIcon(iconPath, this::class.java)
    }
}

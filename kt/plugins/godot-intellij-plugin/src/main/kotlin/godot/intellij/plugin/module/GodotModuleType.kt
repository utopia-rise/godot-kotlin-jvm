package godot.intellij.plugin.module

import com.intellij.openapi.module.ModuleType
import com.intellij.openapi.util.IconLoader
import godot.intellij.plugin.GodotPluginBundle
import javax.swing.Icon

object GodotModuleType : ModuleType<GodotModuleBuilder>("godot-module") {
    override fun createModuleBuilder(): GodotModuleBuilder = GodotModuleBuilder()
    override fun getName(): String = GodotPluginBundle.message("module.name")
    override fun getDescription(): String = GodotPluginBundle.message("module.description")
    override fun getNodeIcon(isOpened: Boolean): Icon = IconLoader
        .getIcon("/pluginIcon_small.svg", this::class.java)
}

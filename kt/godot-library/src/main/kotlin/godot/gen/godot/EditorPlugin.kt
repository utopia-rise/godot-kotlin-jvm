// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class EditorPlugin : Node() {
  val mainScreenChanged: Signal1<String> by signal("screen_name")

  val resourceSaved: Signal1<Resource> by signal("resource")

  val sceneChanged: Signal1<Node> by signal("scene_root")

  val sceneClosed: Signal1<String> by signal("filepath")

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_EDITORPLUGIN)

  open fun addAutoloadSingleton(name: String, path: String) {
    TransferContext.writeArguments(STRING to name, STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_AUTOLOAD_SINGLETON,
        NIL)
  }

  open fun addControlToBottomPanel(control: Control, title: String): ToolButton? {
    TransferContext.writeArguments(OBJECT to control, STRING to title)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_CONTROL_TO_BOTTOM_PANEL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ToolButton?
  }

  open fun addControlToContainer(container: Long, control: Control) {
    TransferContext.writeArguments(LONG to container, OBJECT to control)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_CONTROL_TO_CONTAINER, NIL)
  }

  open fun addControlToDock(slot: Long, control: Control) {
    TransferContext.writeArguments(LONG to slot, OBJECT to control)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_CONTROL_TO_DOCK,
        NIL)
  }

  open fun addCustomType(
    type: String,
    base: String,
    script: Script,
    icon: Texture
  ) {
    TransferContext.writeArguments(STRING to type, STRING to base, OBJECT to script, OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_CUSTOM_TYPE, NIL)
  }

  open fun addExportPlugin(plugin: EditorExportPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_EXPORT_PLUGIN, NIL)
  }

  open fun addImportPlugin(importer: EditorImportPlugin) {
    TransferContext.writeArguments(OBJECT to importer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_IMPORT_PLUGIN, NIL)
  }

  open fun addInspectorPlugin(plugin: EditorInspectorPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_INSPECTOR_PLUGIN,
        NIL)
  }

  open fun addSceneImportPlugin(sceneImporter: EditorSceneImporter) {
    TransferContext.writeArguments(OBJECT to sceneImporter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_SCENE_IMPORT_PLUGIN, NIL)
  }

  open fun addSpatialGizmoPlugin(plugin: EditorSpatialGizmoPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_SPATIAL_GIZMO_PLUGIN, NIL)
  }

  open fun addToolMenuItem(
    name: String,
    handler: Object,
    callback: String,
    ud: Any? = null
  ) {
    TransferContext.writeArguments(STRING to name, OBJECT to handler, STRING to callback, ANY to ud)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_TOOL_MENU_ITEM,
        NIL)
  }

  open fun addToolSubmenuItem(name: String, submenu: Object) {
    TransferContext.writeArguments(STRING to name, OBJECT to submenu)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_TOOL_SUBMENU_ITEM,
        NIL)
  }

  open fun apply_changes() {
  }

  open fun build(): Boolean {
    throw NotImplementedError("build is not implemented for EditorPlugin")
  }

  open fun clear() {
  }

  open fun disable_plugin() {
  }

  open fun edit(_object: Object) {
  }

  open fun enable_plugin() {
  }

  open fun forward_canvas_draw_over_viewport(overlay: Control) {
  }

  open fun forward_canvas_force_draw_over_viewport(overlay: Control) {
  }

  open fun forward_canvas_gui_input(event: InputEvent): Boolean {
    throw NotImplementedError("forward_canvas_gui_input is not implemented for EditorPlugin")
  }

  open fun forward_spatial_gui_input(camera: Camera, event: InputEvent): Boolean {
    throw NotImplementedError("forward_spatial_gui_input is not implemented for EditorPlugin")
  }

  open fun get_breakpoints(): PoolStringArray {
    throw NotImplementedError("get_breakpoints is not implemented for EditorPlugin")
  }

  open fun getEditorInterface(): EditorInterface? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_GET_EDITOR_INTERFACE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorInterface?
  }

  open fun get_plugin_icon(): Texture? {
    throw NotImplementedError("get_plugin_icon is not implemented for EditorPlugin")
  }

  open fun get_plugin_name(): String {
    throw NotImplementedError("get_plugin_name is not implemented for EditorPlugin")
  }

  open fun getScriptCreateDialog(): ScriptCreateDialog? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_GET_SCRIPT_CREATE_DIALOG, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ScriptCreateDialog?
  }

  open fun get_state(): Dictionary<Any?, Any?> {
    throw NotImplementedError("get_state is not implemented for EditorPlugin")
  }

  open fun getUndoRedo(): UndoRedo? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_GET_UNDO_REDO, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as UndoRedo?
  }

  open fun get_window_layout(layout: ConfigFile) {
  }

  open fun handles(_object: Object): Boolean {
    throw NotImplementedError("handles is not implemented for EditorPlugin")
  }

  open fun has_main_screen(): Boolean {
    throw NotImplementedError("has_main_screen is not implemented for EditorPlugin")
  }

  open fun hideBottomPanel() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_HIDE_BOTTOM_PANEL, NIL)
  }

  open fun makeBottomPanelItemVisible(item: Control) {
    TransferContext.writeArguments(OBJECT to item)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_MAKE_BOTTOM_PANEL_ITEM_VISIBLE, NIL)
  }

  open fun make_visible(visible: Boolean) {
  }

  open fun queueSaveLayout() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_QUEUE_SAVE_LAYOUT, NIL)
  }

  open fun removeAutoloadSingleton(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_AUTOLOAD_SINGLETON, NIL)
  }

  open fun removeControlFromBottomPanel(control: Control) {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_CONTROL_FROM_BOTTOM_PANEL, NIL)
  }

  open fun removeControlFromContainer(container: Long, control: Control) {
    TransferContext.writeArguments(LONG to container, OBJECT to control)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_CONTROL_FROM_CONTAINER, NIL)
  }

  open fun removeControlFromDocks(control: Control) {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_CONTROL_FROM_DOCKS, NIL)
  }

  open fun removeCustomType(type: String) {
    TransferContext.writeArguments(STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_CUSTOM_TYPE,
        NIL)
  }

  open fun removeExportPlugin(plugin: EditorExportPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_EXPORT_PLUGIN,
        NIL)
  }

  open fun removeImportPlugin(importer: EditorImportPlugin) {
    TransferContext.writeArguments(OBJECT to importer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_IMPORT_PLUGIN,
        NIL)
  }

  open fun removeInspectorPlugin(plugin: EditorInspectorPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_INSPECTOR_PLUGIN, NIL)
  }

  open fun removeSceneImportPlugin(sceneImporter: EditorSceneImporter) {
    TransferContext.writeArguments(OBJECT to sceneImporter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_SCENE_IMPORT_PLUGIN, NIL)
  }

  open fun removeSpatialGizmoPlugin(plugin: EditorSpatialGizmoPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_SPATIAL_GIZMO_PLUGIN, NIL)
  }

  open fun removeToolMenuItem(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_TOOL_MENU_ITEM,
        NIL)
  }

  open fun save_external_data() {
  }

  open fun setForceDrawOverForwardingEnabled() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_SET_FORCE_DRAW_OVER_FORWARDING_ENABLED, NIL)
  }

  open fun setInputEventForwardingAlwaysEnabled() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_SET_INPUT_EVENT_FORWARDING_ALWAYS_ENABLED, NIL)
  }

  open fun set_state(state: Dictionary<Any?, Any?>) {
  }

  open fun set_window_layout(layout: ConfigFile) {
  }

  open fun updateOverlays(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_UPDATE_OVERLAYS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  enum class DockSlot(
    id: Long
  ) {
    DOCK_SLOT_LEFT_UL(0),

    DOCK_SLOT_LEFT_BL(1),

    DOCK_SLOT_LEFT_UR(2),

    DOCK_SLOT_LEFT_BR(3),

    DOCK_SLOT_RIGHT_UL(4),

    DOCK_SLOT_RIGHT_BL(5),

    DOCK_SLOT_RIGHT_UR(6),

    DOCK_SLOT_RIGHT_BR(7),

    DOCK_SLOT_MAX(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CustomControlContainer(
    id: Long
  ) {
    CONTAINER_TOOLBAR(0),

    CONTAINER_SPATIAL_EDITOR_MENU(1),

    CONTAINER_SPATIAL_EDITOR_SIDE_LEFT(2),

    CONTAINER_SPATIAL_EDITOR_SIDE_RIGHT(3),

    CONTAINER_SPATIAL_EDITOR_BOTTOM(4),

    CONTAINER_CANVAS_EDITOR_MENU(5),

    CONTAINER_CANVAS_EDITOR_SIDE_LEFT(6),

    CONTAINER_CANVAS_EDITOR_SIDE_RIGHT(7),

    CONTAINER_CANVAS_EDITOR_BOTTOM(8),

    CONTAINER_PROPERTY_EDITOR_BOTTOM(9),

    CONTAINER_PROJECT_SETTING_TAB_LEFT(10),

    CONTAINER_PROJECT_SETTING_TAB_RIGHT(11);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val CONTAINER_CANVAS_EDITOR_BOTTOM: Long = 8

    final const val CONTAINER_CANVAS_EDITOR_MENU: Long = 5

    final const val CONTAINER_CANVAS_EDITOR_SIDE_LEFT: Long = 6

    final const val CONTAINER_CANVAS_EDITOR_SIDE_RIGHT: Long = 7

    final const val CONTAINER_PROJECT_SETTING_TAB_LEFT: Long = 10

    final const val CONTAINER_PROJECT_SETTING_TAB_RIGHT: Long = 11

    final const val CONTAINER_PROPERTY_EDITOR_BOTTOM: Long = 9

    final const val CONTAINER_SPATIAL_EDITOR_BOTTOM: Long = 4

    final const val CONTAINER_SPATIAL_EDITOR_MENU: Long = 1

    final const val CONTAINER_SPATIAL_EDITOR_SIDE_LEFT: Long = 2

    final const val CONTAINER_SPATIAL_EDITOR_SIDE_RIGHT: Long = 3

    final const val CONTAINER_TOOLBAR: Long = 0

    final const val DOCK_SLOT_LEFT_BL: Long = 1

    final const val DOCK_SLOT_LEFT_BR: Long = 3

    final const val DOCK_SLOT_LEFT_UL: Long = 0

    final const val DOCK_SLOT_LEFT_UR: Long = 2

    final const val DOCK_SLOT_MAX: Long = 8

    final const val DOCK_SLOT_RIGHT_BL: Long = 5

    final const val DOCK_SLOT_RIGHT_BR: Long = 7

    final const val DOCK_SLOT_RIGHT_UL: Long = 4

    final const val DOCK_SLOT_RIGHT_UR: Long = 6
  }
}

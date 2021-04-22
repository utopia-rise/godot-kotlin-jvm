// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

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
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 * Used by the editor to extend its functionality.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.3/tutorials/plugins/editor/index.html](https://docs.godotengine.org/en/3.3/tutorials/plugins/editor/index.html)
 *
 * Plugins are used by the editor to extend functionality. The most common types of plugins are those which edit a given node or resource type, import plugins and export plugins. See also [godot.EditorScript] to add functions to the editor.
 */
@GodotBaseType
open class EditorPlugin : Node() {
  /**
   * Emitted when user changes the workspace (**2D**, **3D**, **Script**, **AssetLib**). Also works with custom screens defined by plugins.
   */
  val mainScreenChanged: Signal1<String> by signal("screen_name")

  /**
   *
   */
  val resourceSaved: Signal1<Resource> by signal("resource")

  /**
   * Emitted when the scene is changed in the editor. The argument will return the root node of the scene that has just become active. If this scene is new and empty, the argument will be `null`.
   */
  val sceneChanged: Signal1<Node> by signal("scene_root")

  /**
   * Emitted when user closes a scene. The argument is file path to a closed scene.
   */
  val sceneClosed: Signal1<String> by signal("filepath")

  override fun __new() {
    callConstructor(ENGINECLASS_EDITORPLUGIN)
  }

  /**
   * Adds a script at `path` to the Autoload list as `name`.
   */
  open fun addAutoloadSingleton(name: String, path: String) {
    TransferContext.writeArguments(STRING to name, STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_AUTOLOAD_SINGLETON,
        NIL)
  }

  /**
   * Adds a control to the bottom panel (together with Output, Debug, Animation, etc). Returns a reference to the button added. It's up to you to hide/show the button when needed. When your plugin is deactivated, make sure to remove your custom control with [removeControlFromBottomPanel] and free it with [godot.Node.queueFree].
   */
  open fun addControlToBottomPanel(control: Control, title: String): ToolButton? {
    TransferContext.writeArguments(OBJECT to control, STRING to title)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_CONTROL_TO_BOTTOM_PANEL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ToolButton?
  }

  /**
   * Adds a custom control to a container (see [enum CustomControlContainer]). There are many locations where custom controls can be added in the editor UI.
   *
   * Please remember that you have to manage the visibility of your custom controls yourself (and likely hide it after adding it).
   *
   * When your plugin is deactivated, make sure to remove your custom control with [removeControlFromContainer] and free it with [godot.Node.queueFree].
   */
  open fun addControlToContainer(container: Long, control: Control) {
    TransferContext.writeArguments(LONG to container, OBJECT to control)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_CONTROL_TO_CONTAINER, NIL)
  }

  /**
   * Adds the control to a specific dock slot (see [enum DockSlot] for options).
   *
   * If the dock is repositioned and as long as the plugin is active, the editor will save the dock position on further sessions.
   *
   * When your plugin is deactivated, make sure to remove your custom control with [removeControlFromDocks] and free it with [godot.Node.queueFree].
   */
  open fun addControlToDock(slot: Long, control: Control) {
    TransferContext.writeArguments(LONG to slot, OBJECT to control)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_CONTROL_TO_DOCK,
        NIL)
  }

  /**
   * Adds a custom type, which will appear in the list of nodes or resources. An icon can be optionally passed.
   *
   * When given node or resource is selected, the base type will be instanced (ie, "Spatial", "Control", "Resource"), then the script will be loaded and set to this object.
   *
   * You can use the virtual method [handles] to check if your custom object is being edited by checking the script or using the `is` keyword.
   *
   * During run-time, this will be a simple object with a script so this function does not need to be called then.
   */
  open fun addCustomType(
    type: String,
    base: String,
    script: Script,
    icon: Texture
  ) {
    TransferContext.writeArguments(STRING to type, STRING to base, OBJECT to script, OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_CUSTOM_TYPE, NIL)
  }

  /**
   * Registers a new export plugin. Export plugins are used when the project is being exported. See [godot.EditorExportPlugin] for more information.
   */
  open fun addExportPlugin(plugin: EditorExportPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_EXPORT_PLUGIN, NIL)
  }

  /**
   *
   */
  open fun addImportPlugin(importer: EditorImportPlugin) {
    TransferContext.writeArguments(OBJECT to importer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_IMPORT_PLUGIN, NIL)
  }

  /**
   *
   */
  open fun addInspectorPlugin(plugin: EditorInspectorPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_INSPECTOR_PLUGIN,
        NIL)
  }

  /**
   *
   */
  open fun addSceneImportPlugin(sceneImporter: EditorSceneImporter) {
    TransferContext.writeArguments(OBJECT to sceneImporter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_SCENE_IMPORT_PLUGIN, NIL)
  }

  /**
   *
   */
  open fun addSpatialGizmoPlugin(plugin: EditorSpatialGizmoPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_SPATIAL_GIZMO_PLUGIN, NIL)
  }

  /**
   * Adds a custom menu item to **Project > Tools** as `name` that calls `callback` on an instance of `handler` with a parameter `ud` when user activates it.
   */
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

  /**
   * Adds a custom submenu under **Project > Tools >** `name`. `submenu` should be an object of class [godot.PopupMenu]. This submenu should be cleaned up using `remove_tool_menu_item(name)`.
   */
  open fun addToolSubmenuItem(name: String, submenu: Object) {
    TransferContext.writeArguments(STRING to name, OBJECT to submenu)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_TOOL_SUBMENU_ITEM,
        NIL)
  }

  /**
   * This method is called when the editor is about to save the project, switch to another tab, etc. It asks the plugin to apply any pending state changes to ensure consistency.
   *
   * This is used, for example, in shader editors to let the plugin know that it must apply the shader code being written by the user to the object.
   */
  open fun _applyChanges() {
  }

  /**
   * This method is called when the editor is about to run the project. The plugin can then perform required operations before the project runs.
   *
   * This method must return a boolean. If this method returns `false`, the project will not run. The run is aborted immediately, so this also prevents all other plugins' [build] methods from running.
   */
  open fun _build(): Boolean {
    throw NotImplementedError("build is not implemented for EditorPlugin")
  }

  /**
   * Clear all the state and reset the object being edited to zero. This ensures your plugin does not keep editing a currently existing node, or a node from the wrong scene.
   */
  open fun _clear() {
  }

  /**
   * Called by the engine when the user disables the [godot.EditorPlugin] in the Plugin tab of the project settings window.
   */
  open fun _disablePlugin() {
  }

  /**
   * This function is used for plugins that edit specific object types (nodes or resources). It requests the editor to edit the given object.
   */
  open fun _edit(_object: Object) {
  }

  /**
   * Called by the engine when the user enables the [godot.EditorPlugin] in the Plugin tab of the project settings window.
   */
  open fun _enablePlugin() {
  }

  /**
   * Called by the engine when the 2D editor's viewport is updated. Use the `overlay` [godot.Control] for drawing. You can update the viewport manually by calling [updateOverlays].
   *
   * ```
   * 				func forward_canvas_draw_over_viewport(overlay):
   * 				    # Draw a circle at cursor position.
   * 				    overlay.draw_circle(overlay.get_local_mouse_position(), 64, Color.white)
   *
   * 				func forward_canvas_gui_input(event):
   * 				    if event is InputEventMouseMotion:
   * 				        # Redraw viewport when cursor is moved.
   * 				        update_overlays()
   * 				        return true
   * 				    return false
   * 				```
   */
  open fun _forwardCanvasDrawOverViewport(overlay: Control) {
  }

  /**
   * This method is the same as [forwardCanvasDrawOverViewport], except it draws on top of everything. Useful when you need an extra layer that shows over anything else.
   *
   * You need to enable calling of this method by using [setForceDrawOverForwardingEnabled].
   */
  open fun _forwardCanvasForceDrawOverViewport(overlay: Control) {
  }

  /**
   * Called when there is a root node in the current edited scene, [handles] is implemented and an [godot.InputEvent] happens in the 2D viewport. Intercepts the [godot.InputEvent], if `return true` [godot.EditorPlugin] consumes the `event`, otherwise forwards `event` to other Editor classes. Example:
   *
   * ```
   * 				# Prevents the InputEvent to reach other Editor classes
   * 				func forward_canvas_gui_input(event):
   * 				    var forward = true
   * 				    return forward
   * 				```
   *
   * Must `return false` in order to forward the [godot.InputEvent] to other Editor classes. Example:
   *
   * ```
   * 				# Consumes InputEventMouseMotion and forwards other InputEvent types
   * 				func forward_canvas_gui_input(event):
   * 				    var forward = false
   * 				    if event is InputEventMouseMotion:
   * 				        forward = true
   * 				    return forward
   * 				```
   */
  open fun _forwardCanvasGuiInput(event: InputEvent): Boolean {
    throw NotImplementedError("forward_canvas_gui_input is not implemented for EditorPlugin")
  }

  /**
   * Called by the engine when the 3D editor's viewport is updated. Use the `overlay` [godot.Control] for drawing. You can update the viewport manually by calling [updateOverlays].
   *
   * ```
   * 				func forward_spatial_draw_over_viewport(overlay):
   * 				    # Draw a circle at cursor position.
   * 				    overlay.draw_circle(overlay.get_local_mouse_position(), 64)
   *
   * 				func forward_spatial_gui_input(camera, event):
   * 				    if event is InputEventMouseMotion:
   * 				        # Redraw viewport when cursor is moved.
   * 				        update_overlays()
   * 				        return true
   * 				    return false
   * 				```
   */
  open fun _forwardSpatialDrawOverViewport(overlay: Control) {
  }

  /**
   * This method is the same as [forwardSpatialDrawOverViewport], except it draws on top of everything. Useful when you need an extra layer that shows over anything else.
   *
   * You need to enable calling of this method by using [setForceDrawOverForwardingEnabled].
   */
  open fun _forwardSpatialForceDrawOverViewport(overlay: Control) {
  }

  /**
   * Called when there is a root node in the current edited scene, [handles] is implemented and an [godot.InputEvent] happens in the 3D viewport. Intercepts the [godot.InputEvent], if `return true` [godot.EditorPlugin] consumes the `event`, otherwise forwards `event` to other Editor classes. Example:
   *
   * ```
   * 				# Prevents the InputEvent to reach other Editor classes
   * 				func forward_spatial_gui_input(camera, event):
   * 				    var forward = true
   * 				    return forward
   * 				```
   *
   * Must `return false` in order to forward the [godot.InputEvent] to other Editor classes. Example:
   *
   * ```
   * 				# Consumes InputEventMouseMotion and forwards other InputEvent types
   * 				func forward_spatial_gui_input(camera, event):
   * 				    var forward = false
   * 				    if event is InputEventMouseMotion:
   * 				        forward = true
   * 				    return forward
   * 				```
   */
  open fun _forwardSpatialGuiInput(camera: Camera, event: InputEvent): Boolean {
    throw NotImplementedError("forward_spatial_gui_input is not implemented for EditorPlugin")
  }

  /**
   * This is for editors that edit script-based objects. You can return a list of breakpoints in the format (`script:line`), for example: `res://path_to_script.gd:25`.
   */
  open fun _getBreakpoints(): PoolStringArray {
    throw NotImplementedError("get_breakpoints is not implemented for EditorPlugin")
  }

  /**
   * Returns the [godot.EditorInterface] object that gives you control over Godot editor's window and its functionalities.
   */
  open fun getEditorInterface(): EditorInterface? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_GET_EDITOR_INTERFACE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorInterface?
  }

  /**
   * Override this method in your plugin to return a [godot.Texture] in order to give it an icon.
   *
   * For main screen plugins, this appears at the top of the screen, to the right of the "2D", "3D", "Script", and "AssetLib" buttons.
   *
   * Ideally, the plugin icon should be white with a transparent background and 16x16 pixels in size.
   *
   * ```
   * 				func get_plugin_icon():
   * 				    # You can use a custom icon:
   * 				    return preload("res://addons/my_plugin/my_plugin_icon.svg")
   * 				    # Or use a built-in icon:
   * 				    return get_editor_interface().get_base_control().get_icon("Node", "EditorIcons")
   * 				```
   */
  open fun _getPluginIcon(): Texture? {
    throw NotImplementedError("get_plugin_icon is not implemented for EditorPlugin")
  }

  /**
   * Override this method in your plugin to provide the name of the plugin when displayed in the Godot editor.
   *
   * For main screen plugins, this appears at the top of the screen, to the right of the "2D", "3D", "Script", and "AssetLib" buttons.
   */
  open fun _getPluginName(): String {
    throw NotImplementedError("get_plugin_name is not implemented for EditorPlugin")
  }

  /**
   * Gets the Editor's dialogue used for making scripts.
   *
   * **Note:** Users can configure it before use.
   */
  open fun getScriptCreateDialog(): ScriptCreateDialog? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_GET_SCRIPT_CREATE_DIALOG, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ScriptCreateDialog?
  }

  /**
   * Gets the state of your plugin editor. This is used when saving the scene (so state is kept when opening it again) and for switching tabs (so state can be restored when the tab returns).
   */
  open fun _getState(): Dictionary<Any?, Any?> {
    throw NotImplementedError("get_state is not implemented for EditorPlugin")
  }

  /**
   * Gets the undo/redo object. Most actions in the editor can be undoable, so use this object to make sure this happens when it's worth it.
   */
  open fun getUndoRedo(): UndoRedo? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_GET_UNDO_REDO, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as UndoRedo?
  }

  /**
   * Gets the GUI layout of the plugin. This is used to save the project's editor layout when [queueSaveLayout] is called or the editor layout was changed(For example changing the position of a dock).
   */
  open fun _getWindowLayout(layout: ConfigFile) {
  }

  /**
   * Implement this function if your plugin edits a specific type of object (Resource or Node). If you return `true`, then you will get the functions [edit] and [makeVisible] called when the editor requests them. If you have declared the methods [forwardCanvasGuiInput] and [forwardSpatialGuiInput] these will be called too.
   */
  open fun _handles(_object: Object): Boolean {
    throw NotImplementedError("handles is not implemented for EditorPlugin")
  }

  /**
   * Returns `true` if this is a main screen editor plugin (it goes in the workspace selector together with **2D**, **3D**, **Script** and **AssetLib**).
   */
  open fun _hasMainScreen(): Boolean {
    throw NotImplementedError("has_main_screen is not implemented for EditorPlugin")
  }

  /**
   *
   */
  open fun hideBottomPanel() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_HIDE_BOTTOM_PANEL, NIL)
  }

  /**
   *
   */
  open fun makeBottomPanelItemVisible(item: Control) {
    TransferContext.writeArguments(OBJECT to item)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_MAKE_BOTTOM_PANEL_ITEM_VISIBLE, NIL)
  }

  /**
   * This function will be called when the editor is requested to become visible. It is used for plugins that edit a specific object type.
   *
   * Remember that you have to manage the visibility of all your editor controls manually.
   */
  open fun _makeVisible(visible: Boolean) {
  }

  /**
   * Queue save the project's editor layout.
   */
  open fun queueSaveLayout() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_QUEUE_SAVE_LAYOUT, NIL)
  }

  /**
   * Removes an Autoload `name` from the list.
   */
  open fun removeAutoloadSingleton(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_AUTOLOAD_SINGLETON, NIL)
  }

  /**
   * Removes the control from the bottom panel. You have to manually [godot.Node.queueFree] the control.
   */
  open fun removeControlFromBottomPanel(control: Control) {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_CONTROL_FROM_BOTTOM_PANEL, NIL)
  }

  /**
   * Removes the control from the specified container. You have to manually [godot.Node.queueFree] the control.
   */
  open fun removeControlFromContainer(container: Long, control: Control) {
    TransferContext.writeArguments(LONG to container, OBJECT to control)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_CONTROL_FROM_CONTAINER, NIL)
  }

  /**
   * Removes the control from the dock. You have to manually [godot.Node.queueFree] the control.
   */
  open fun removeControlFromDocks(control: Control) {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_CONTROL_FROM_DOCKS, NIL)
  }

  /**
   * Removes a custom type added by [addCustomType].
   */
  open fun removeCustomType(type: String) {
    TransferContext.writeArguments(STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_CUSTOM_TYPE,
        NIL)
  }

  /**
   *
   */
  open fun removeExportPlugin(plugin: EditorExportPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_EXPORT_PLUGIN,
        NIL)
  }

  /**
   *
   */
  open fun removeImportPlugin(importer: EditorImportPlugin) {
    TransferContext.writeArguments(OBJECT to importer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_IMPORT_PLUGIN,
        NIL)
  }

  /**
   *
   */
  open fun removeInspectorPlugin(plugin: EditorInspectorPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_INSPECTOR_PLUGIN, NIL)
  }

  /**
   *
   */
  open fun removeSceneImportPlugin(sceneImporter: EditorSceneImporter) {
    TransferContext.writeArguments(OBJECT to sceneImporter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_SCENE_IMPORT_PLUGIN, NIL)
  }

  /**
   *
   */
  open fun removeSpatialGizmoPlugin(plugin: EditorSpatialGizmoPlugin) {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_SPATIAL_GIZMO_PLUGIN, NIL)
  }

  /**
   * Removes a menu `name` from **Project > Tools**.
   */
  open fun removeToolMenuItem(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_TOOL_MENU_ITEM,
        NIL)
  }

  /**
   * This method is called after the editor saves the project or when it's closed. It asks the plugin to save edited external scenes/resources.
   */
  open fun _saveExternalData() {
  }

  /**
   * Enables calling of [forwardCanvasForceDrawOverViewport] for the 2D editor and [forwardSpatialForceDrawOverViewport] for the 3D editor when their viewports are updated. You need to call this method only once and it will work permanently for this plugin.
   */
  open fun setForceDrawOverForwardingEnabled() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_SET_FORCE_DRAW_OVER_FORWARDING_ENABLED, NIL)
  }

  /**
   * Use this method if you always want to receive inputs from 3D view screen inside [forwardSpatialGuiInput]. It might be especially usable if your plugin will want to use raycast in the scene.
   */
  open fun setInputEventForwardingAlwaysEnabled() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_SET_INPUT_EVENT_FORWARDING_ALWAYS_ENABLED, NIL)
  }

  /**
   * Restore the state saved by [getState].
   */
  open fun _setState(state: Dictionary<Any?, Any?>) {
  }

  /**
   * Restore the plugin GUI layout saved by [getWindowLayout].
   */
  open fun _setWindowLayout(layout: ConfigFile) {
  }

  /**
   * Updates the overlays of the 2D and 3D editor viewport. Causes methods [forwardCanvasDrawOverViewport], [forwardCanvasForceDrawOverViewport], [forwardSpatialDrawOverViewport] and [forwardSpatialForceDrawOverViewport] to be called.
   */
  open fun updateOverlays(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_UPDATE_OVERLAYS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  enum class DockSlot(
    id: Long
  ) {
    /**
     *
     */
    DOCK_SLOT_LEFT_UL(0),

    /**
     *
     */
    DOCK_SLOT_LEFT_BL(1),

    /**
     *
     */
    DOCK_SLOT_LEFT_UR(2),

    /**
     *
     */
    DOCK_SLOT_LEFT_BR(3),

    /**
     *
     */
    DOCK_SLOT_RIGHT_UL(4),

    /**
     *
     */
    DOCK_SLOT_RIGHT_BL(5),

    /**
     *
     */
    DOCK_SLOT_RIGHT_UR(6),

    /**
     *
     */
    DOCK_SLOT_RIGHT_BR(7),

    /**
     * Represents the size of the [enum DockSlot] enum.
     */
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
    /**
     *
     */
    CONTAINER_TOOLBAR(0),

    /**
     *
     */
    CONTAINER_SPATIAL_EDITOR_MENU(1),

    /**
     *
     */
    CONTAINER_SPATIAL_EDITOR_SIDE_LEFT(2),

    /**
     *
     */
    CONTAINER_SPATIAL_EDITOR_SIDE_RIGHT(3),

    /**
     *
     */
    CONTAINER_SPATIAL_EDITOR_BOTTOM(4),

    /**
     *
     */
    CONTAINER_CANVAS_EDITOR_MENU(5),

    /**
     *
     */
    CONTAINER_CANVAS_EDITOR_SIDE_LEFT(6),

    /**
     *
     */
    CONTAINER_CANVAS_EDITOR_SIDE_RIGHT(7),

    /**
     *
     */
    CONTAINER_CANVAS_EDITOR_BOTTOM(8),

    /**
     *
     */
    CONTAINER_PROPERTY_EDITOR_BOTTOM(9),

    /**
     *
     */
    CONTAINER_PROJECT_SETTING_TAB_LEFT(10),

    /**
     *
     */
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
    /**
     *
     */
    final const val CONTAINER_CANVAS_EDITOR_BOTTOM: Long = 8

    /**
     *
     */
    final const val CONTAINER_CANVAS_EDITOR_MENU: Long = 5

    /**
     *
     */
    final const val CONTAINER_CANVAS_EDITOR_SIDE_LEFT: Long = 6

    /**
     *
     */
    final const val CONTAINER_CANVAS_EDITOR_SIDE_RIGHT: Long = 7

    /**
     *
     */
    final const val CONTAINER_PROJECT_SETTING_TAB_LEFT: Long = 10

    /**
     *
     */
    final const val CONTAINER_PROJECT_SETTING_TAB_RIGHT: Long = 11

    /**
     *
     */
    final const val CONTAINER_PROPERTY_EDITOR_BOTTOM: Long = 9

    /**
     *
     */
    final const val CONTAINER_SPATIAL_EDITOR_BOTTOM: Long = 4

    /**
     *
     */
    final const val CONTAINER_SPATIAL_EDITOR_MENU: Long = 1

    /**
     *
     */
    final const val CONTAINER_SPATIAL_EDITOR_SIDE_LEFT: Long = 2

    /**
     *
     */
    final const val CONTAINER_SPATIAL_EDITOR_SIDE_RIGHT: Long = 3

    /**
     *
     */
    final const val CONTAINER_TOOLBAR: Long = 0

    /**
     *
     */
    final const val DOCK_SLOT_LEFT_BL: Long = 1

    /**
     *
     */
    final const val DOCK_SLOT_LEFT_BR: Long = 3

    /**
     *
     */
    final const val DOCK_SLOT_LEFT_UL: Long = 0

    /**
     *
     */
    final const val DOCK_SLOT_LEFT_UR: Long = 2

    /**
     * Represents the size of the [enum DockSlot] enum.
     */
    final const val DOCK_SLOT_MAX: Long = 8

    /**
     *
     */
    final const val DOCK_SLOT_RIGHT_BL: Long = 5

    /**
     *
     */
    final const val DOCK_SLOT_RIGHT_BR: Long = 7

    /**
     *
     */
    final const val DOCK_SLOT_RIGHT_UL: Long = 4

    /**
     *
     */
    final const val DOCK_SLOT_RIGHT_UR: Long = 6
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.Dictionary
import godot.core.PackedStringArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Used by the editor to extend its functionality.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/plugins/editor/index.html]($DOCS_URL/tutorials/plugins/editor/index.html)
 *
 * Plugins are used by the editor to extend functionality. The most common types of plugins are those which edit a given node or resource type, import plugins and export plugins. See also [godot.EditorScript] to add functions to the editor.
 */
@GodotBaseType
public open class EditorPlugin internal constructor() : Node() {
  /**
   * Emitted when the scene is changed in the editor. The argument will return the root node of the scene that has just become active. If this scene is new and empty, the argument will be `null`.
   */
  public val sceneChanged: Signal1<Node> by signal("sceneRoot")

  /**
   * Emitted when user closes a scene. The argument is file path to a closed scene.
   */
  public val sceneClosed: Signal1<String> by signal("filepath")

  /**
   * Emitted when user changes the workspace (**2D**, **3D**, **Script**, **AssetLib**). Also works with custom screens defined by plugins.
   */
  public val mainScreenChanged: Signal1<String> by signal("screenName")

  /**
   * Emitted when the given [resource] was saved on disc.
   */
  public val resourceSaved: Signal1<Resource> by signal("resource")

  /**
   * Emitted when any project setting has changed.
   */
  public val projectSettingsChanged: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORPLUGIN, scriptIndex)
    return true
  }

  /**
   * Called when there is a root node in the current edited scene, [_handles] is implemented and an [godot.InputEvent] happens in the 2D viewport. Intercepts the [godot.InputEvent], if `return true` [godot.EditorPlugin] consumes the [event], otherwise forwards [event] to other Editor classes.
   *
   * **Example:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * # Prevents the InputEvent from reaching other Editor classes.
   *
   * func _forward_canvas_gui_input(event):
   *
   *     return true
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * // Prevents the InputEvent from reaching other Editor classes.
   *
   * public override bool ForwardCanvasGuiInput(InputEvent @event)
   *
   * {
   *
   *     return true;
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * Must `return false` in order to forward the [godot.InputEvent] to other Editor classes.
   *
   * **Example:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * # Consumes InputEventMouseMotion and forwards other InputEvent types.
   *
   * func _forward_canvas_gui_input(event):
   *
   *     if (event is InputEventMouseMotion):
   *
   *         return true
   *
   *     return false
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * // Consumes InputEventMouseMotion and forwards other InputEvent types.
   *
   * public override bool _ForwardCanvasGuiInput(InputEvent @event)
   *
   * {
   *
   *     if (@event is InputEventMouseMotion)
   *
   *     {
   *
   *         return true;
   *
   *     }
   *
   *     return false;
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public open fun _forwardCanvasGuiInput(event: InputEvent): Boolean {
    throw NotImplementedError("_forward_canvas_gui_input is not implemented for EditorPlugin")
  }

  /**
   * Called by the engine when the 2D editor's viewport is updated. Use the `overlay` [godot.Control] for drawing. You can update the viewport manually by calling [updateOverlays].
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * func _forward_canvas_draw_over_viewport(overlay):
   *
   *     # Draw a circle at cursor position.
   *
   *     overlay.draw_circle(overlay.get_local_mouse_position(), 64, Color.WHITE)
   *
   *
   *
   * func _forward_canvas_gui_input(event):
   *
   *     if event is InputEventMouseMotion:
   *
   *         # Redraw viewport when cursor is moved.
   *
   *         update_overlays()
   *
   *         return true
   *
   *     return false
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * public override void _ForwardCanvasDrawOverViewport(Control viewportControl)
   *
   * {
   *
   *     // Draw a circle at cursor position.
   *
   *     viewportControl.DrawCircle(viewportControl.GetLocalMousePosition(), 64, Colors.White);
   *
   * }
   *
   *
   *
   * public override bool _ForwardCanvasGuiInput(InputEvent @event)
   *
   * {
   *
   *     if (@event is InputEventMouseMotion)
   *
   *     {
   *
   *         // Redraw viewport when cursor is moved.
   *
   *         UpdateOverlays();
   *
   *         return true;
   *
   *     }
   *
   *     return false;
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public open fun _forwardCanvasDrawOverViewport(viewportControl: Control): Unit {
  }

  /**
   * This method is the same as [_forwardCanvasDrawOverViewport], except it draws on top of everything. Useful when you need an extra layer that shows over anything else.
   *
   * You need to enable calling of this method by using [setForceDrawOverForwardingEnabled].
   */
  public open fun _forwardCanvasForceDrawOverViewport(viewportControl: Control): Unit {
  }

  /**
   * Called when there is a root node in the current edited scene, [_handles] is implemented, and an [godot.InputEvent] happens in the 3D viewport. The return value decides whether the [godot.InputEvent] is consumed or forwarded to other [godot.EditorPlugin]s. See [enum AfterGUIInput] for options.
   *
   * **Example:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * # Prevents the InputEvent from reaching other Editor classes.
   *
   * func _forward_3d_gui_input(camera, event):
   *
   *     return EditorPlugin.AFTER_GUI_INPUT_STOP
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * // Prevents the InputEvent from reaching other Editor classes.
   *
   * public override EditorPlugin.AfterGuiInput _Forward3DGuiInput(Camera3D camera, InputEvent @event)
   *
   * {
   *
   *     return EditorPlugin.AfterGuiInput.Stop;
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * Must `return EditorPlugin.AFTER_GUI_INPUT_PASS` in order to forward the [godot.InputEvent] to other Editor classes.
   *
   * **Example:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * # Consumes InputEventMouseMotion and forwards other InputEvent types.
   *
   * func _forward_3d_gui_input(camera, event):
   *
   *     return EditorPlugin.AFTER_GUI_INPUT_STOP if event is InputEventMouseMotion else EditorPlugin.AFTER_GUI_INPUT_PASS
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * // Consumes InputEventMouseMotion and forwards other InputEvent types.
   *
   * public override EditorPlugin.AfterGuiInput _Forward3DGuiInput(Camera3D camera, InputEvent @event)
   *
   * {
   *
   *     return @event is InputEventMouseMotion ? EditorPlugin.AfterGuiInput.Stop : EditorPlugin.AfterGuiInput.Pass;
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public open fun _forward3dGuiInput(viewportCamera: Camera3D, event: InputEvent): Int {
    throw NotImplementedError("_forward_3d_gui_input is not implemented for EditorPlugin")
  }

  /**
   * Called by the engine when the 3D editor's viewport is updated. Use the `overlay` [godot.Control] for drawing. You can update the viewport manually by calling [updateOverlays].
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * func _forward_3d_draw_over_viewport(overlay):
   *
   *     # Draw a circle at cursor position.
   *
   *     overlay.draw_circle(overlay.get_local_mouse_position(), 64)
   *
   *
   *
   * func _forward_3d_gui_input(camera, event):
   *
   *     if event is InputEventMouseMotion:
   *
   *         # Redraw viewport when cursor is moved.
   *
   *         update_overlays()
   *
   *         return EditorPlugin.AFTER_GUI_INPUT_STOP
   *
   *     return EditorPlugin.AFTER_GUI_INPUT_PASS
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * public override void _Forward3DDrawOverViewport(Control viewportControl)
   *
   * {
   *
   *     // Draw a circle at cursor position.
   *
   *     viewportControl.DrawCircle(viewportControl.GetLocalMousePosition(), 64, Colors.White);
   *
   * }
   *
   *
   *
   * public override EditorPlugin.AfterGuiInput _Forward3DGuiInput(Camera3D viewportCamera, InputEvent @event)
   *
   * {
   *
   *     if (@event is InputEventMouseMotion)
   *
   *     {
   *
   *         // Redraw viewport when cursor is moved.
   *
   *         UpdateOverlays();
   *
   *         return EditorPlugin.AfterGuiInput.Stop;
   *
   *     }
   *
   *     return EditorPlugin.AfterGuiInput.Pass;
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public open fun _forward3dDrawOverViewport(viewportControl: Control): Unit {
  }

  /**
   * This method is the same as [_forward3dDrawOverViewport], except it draws on top of everything. Useful when you need an extra layer that shows over anything else.
   *
   * You need to enable calling of this method by using [setForceDrawOverForwardingEnabled].
   */
  public open fun _forward3dForceDrawOverViewport(viewportControl: Control): Unit {
  }

  /**
   * Override this method in your plugin to provide the name of the plugin when displayed in the Godot editor.
   *
   * For main screen plugins, this appears at the top of the screen, to the right of the "2D", "3D", "Script", and "AssetLib" buttons.
   */
  public open fun _getPluginName(): String {
    throw NotImplementedError("_get_plugin_name is not implemented for EditorPlugin")
  }

  /**
   * Override this method in your plugin to return a [godot.Texture2D] in order to give it an icon.
   *
   * For main screen plugins, this appears at the top of the screen, to the right of the "2D", "3D", "Script", and "AssetLib" buttons.
   *
   * Ideally, the plugin icon should be white with a transparent background and 16x16 pixels in size.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * func _get_plugin_icon():
   *
   *     # You can use a custom icon:
   *
   *     return preload("res://addons/my_plugin/my_plugin_icon.svg")
   *
   *     # Or use a built-in icon:
   *
   *     return get_editor_interface().get_base_control().get_theme_icon("Node", "EditorIcons")
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * public override Texture2D _GetPluginIcon()
   *
   * {
   *
   *     // You can use a custom icon:
   *
   *     return ResourceLoader.Load<Texture2D>("res://addons/my_plugin/my_plugin_icon.svg");
   *
   *     // Or use a built-in icon:
   *
   *     return GetEditorInterface().GetBaseControl().GetThemeIcon("Node", "EditorIcons");
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public open fun _getPluginIcon(): Texture2D? {
    throw NotImplementedError("_get_plugin_icon is not implemented for EditorPlugin")
  }

  /**
   * Returns `true` if this is a main screen editor plugin (it goes in the workspace selector together with **2D**, **3D**, **Script** and **AssetLib**).
   *
   * When the plugin's workspace is selected, other main screen plugins will be hidden, but your plugin will not appear automatically. It needs to be added as a child of [godot.EditorInterface.getBaseControl] and made visible inside [_makeVisible].
   *
   * Use [_getPluginName] and [_getPluginIcon] to customize the plugin button's appearance.
   *
   * ```
   * 				var plugin_control
   *
   * 				func _enter_tree():
   * 				    plugin_control = preload("my_plugin_control.tscn").instantiate()
   * 				    get_editor_interface().get_editor_main_screen().add_child(plugin_control)
   * 				    plugin_control.hide()
   *
   * 				func _has_main_screen():
   * 				    return true
   *
   * 				func _make_visible(visible):
   * 				    plugin_control.visible = visible
   *
   * 				func _get_plugin_name():
   * 				    return "My Super Cool Plugin 3000"
   *
   * 				func _get_plugin_icon():
   * 				    return get_editor_interface().get_base_control().get_theme_icon("Node", "EditorIcons")
   * 				```
   */
  public open fun _hasMainScreen(): Boolean {
    throw NotImplementedError("_has_main_screen is not implemented for EditorPlugin")
  }

  /**
   * This function will be called when the editor is requested to become visible. It is used for plugins that edit a specific object type.
   *
   * Remember that you have to manage the visibility of all your editor controls manually.
   */
  public open fun _makeVisible(visible: Boolean): Unit {
  }

  /**
   * This function is used for plugins that edit specific object types (nodes or resources). It requests the editor to edit the given object.
   *
   * [object] can be `null` if the plugin was editing an object, but there is no longer any selected object handled by this plugin. It can be used to cleanup editing state.
   */
  public open fun _edit(_object: Object): Unit {
  }

  /**
   * Implement this function if your plugin edits a specific type of object (Resource or Node). If you return `true`, then you will get the functions [_edit] and [_makeVisible] called when the editor requests them. If you have declared the methods [_forwardCanvasGuiInput] and [_forward3dGuiInput] these will be called too.
   */
  public open fun _handles(_object: Object): Boolean {
    throw NotImplementedError("_handles is not implemented for EditorPlugin")
  }

  /**
   * Override this method to provide a state data you want to be saved, like view position, grid settings, folding, etc. This is used when saving the scene (so state is kept when opening it again) and for switching tabs (so state can be restored when the tab returns). This data is automatically saved for each scene in an `editstate` file in the editor metadata folder. If you want to store global (scene-independent) editor data for your plugin, you can use [_getWindowLayout] instead.
   *
   * Use [_setState] to restore your saved state.
   *
   * **Note:** This method should not be used to save important settings that should persist with the project.
   *
   * **Note:** You must implement [_getPluginName] for the state to be stored and restored correctly.
   *
   * ```
   * 				func _get_state():
   * 				    var state = {"zoom": zoom, "preferred_color": my_color}
   * 				    return state
   * 				```
   */
  public open fun _getState(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_state is not implemented for EditorPlugin")
  }

  /**
   * Restore the state saved by [_getState]. This method is called when the current scene tab is changed in the editor.
   *
   * **Note:** Your plugin must implement [_getPluginName], otherwise it will not be recognized and this method will not be called.
   *
   * ```
   * 				func _set_state(data):
   * 				    zoom = data.get("zoom", 1.0)
   * 				    preferred_color = data.get("my_color", Color.WHITE)
   * 				```
   */
  public open fun _setState(state: Dictionary<Any?, Any?>): Unit {
  }

  /**
   * Clear all the state and reset the object being edited to zero. This ensures your plugin does not keep editing a currently existing node, or a node from the wrong scene.
   */
  public open fun _clear(): Unit {
  }

  /**
   * This method is called after the editor saves the project or when it's closed. It asks the plugin to save edited external scenes/resources.
   */
  public open fun _saveExternalData(): Unit {
  }

  /**
   * This method is called when the editor is about to save the project, switch to another tab, etc. It asks the plugin to apply any pending state changes to ensure consistency.
   *
   * This is used, for example, in shader editors to let the plugin know that it must apply the shader code being written by the user to the object.
   */
  public open fun _applyChanges(): Unit {
  }

  /**
   * This is for editors that edit script-based objects. You can return a list of breakpoints in the format (`script:line`), for example: `res://path_to_script.gd:25`.
   */
  public open fun _getBreakpoints(): PackedStringArray {
    throw NotImplementedError("_get_breakpoints is not implemented for EditorPlugin")
  }

  /**
   * Restore the plugin GUI layout and data saved by [_getWindowLayout]. This method is called for every plugin on editor startup. Use the provided [configuration] file to read your saved data.
   *
   * ```
   * 				func _set_window_layout(configuration):
   * 				    $Window.position = configuration.get_value("MyPlugin", "window_position", Vector2())
   * 				    $Icon.modulate = configuration.get_value("MyPlugin", "icon_color", Color.WHITE)
   * 				```
   */
  public open fun _setWindowLayout(configuration: ConfigFile): Unit {
  }

  /**
   * Override this method to provide the GUI layout of the plugin or any other data you want to be stored. This is used to save the project's editor layout when [queueSaveLayout] is called or the editor layout was changed (for example changing the position of a dock). The data is stored in the `editor_layout.cfg` file in the editor metadata directory.
   *
   * Use [_setWindowLayout] to restore your saved layout.
   *
   * ```
   * 				func _get_window_layout(configuration):
   * 				    configuration.set_value("MyPlugin", "window_position", $Window.position)
   * 				    configuration.set_value("MyPlugin", "icon_color", $Icon.modulate)
   * 				```
   */
  public open fun _getWindowLayout(configuration: ConfigFile): Unit {
  }

  /**
   * This method is called when the editor is about to run the project. The plugin can then perform required operations before the project runs.
   *
   * This method must return a boolean. If this method returns `false`, the project will not run. The run is aborted immediately, so this also prevents all other plugins' [_build] methods from running.
   */
  public open fun _build(): Boolean {
    throw NotImplementedError("_build is not implemented for EditorPlugin")
  }

  /**
   * Called by the engine when the user enables the [godot.EditorPlugin] in the Plugin tab of the project settings window.
   */
  public open fun _enablePlugin(): Unit {
  }

  /**
   * Called by the engine when the user disables the [godot.EditorPlugin] in the Plugin tab of the project settings window.
   */
  public open fun _disablePlugin(): Unit {
  }

  /**
   * Adds a custom control to a container (see [enum CustomControlContainer]). There are many locations where custom controls can be added in the editor UI.
   *
   * Please remember that you have to manage the visibility of your custom controls yourself (and likely hide it after adding it).
   *
   * When your plugin is deactivated, make sure to remove your custom control with [removeControlFromContainer] and free it with [godot.Node.queueFree].
   */
  public fun addControlToContainer(container: CustomControlContainer, control: Control): Unit {
    TransferContext.writeArguments(LONG to container.id, OBJECT to control)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_CONTROL_TO_CONTAINER, NIL)
  }

  /**
   * Adds a control to the bottom panel (together with Output, Debug, Animation, etc). Returns a reference to the button added. It's up to you to hide/show the button when needed. When your plugin is deactivated, make sure to remove your custom control with [removeControlFromBottomPanel] and free it with [godot.Node.queueFree].
   */
  public fun addControlToBottomPanel(control: Control, title: String): Button? {
    TransferContext.writeArguments(OBJECT to control, STRING to title)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_CONTROL_TO_BOTTOM_PANEL, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Button?)
  }

  /**
   * Adds the control to a specific dock slot (see [enum DockSlot] for options).
   *
   * If the dock is repositioned and as long as the plugin is active, the editor will save the dock position on further sessions.
   *
   * When your plugin is deactivated, make sure to remove your custom control with [removeControlFromDocks] and free it with [godot.Node.queueFree].
   */
  public fun addControlToDock(slot: DockSlot, control: Control): Unit {
    TransferContext.writeArguments(LONG to slot.id, OBJECT to control)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_CONTROL_TO_DOCK,
        NIL)
  }

  /**
   * Removes the control from the dock. You have to manually [godot.Node.queueFree] the control.
   */
  public fun removeControlFromDocks(control: Control): Unit {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_CONTROL_FROM_DOCKS, NIL)
  }

  /**
   * Removes the control from the bottom panel. You have to manually [godot.Node.queueFree] the control.
   */
  public fun removeControlFromBottomPanel(control: Control): Unit {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_CONTROL_FROM_BOTTOM_PANEL, NIL)
  }

  /**
   * Removes the control from the specified container. You have to manually [godot.Node.queueFree] the control.
   */
  public fun removeControlFromContainer(container: CustomControlContainer, control: Control): Unit {
    TransferContext.writeArguments(LONG to container.id, OBJECT to control)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_CONTROL_FROM_CONTAINER, NIL)
  }

  /**
   * Adds a custom menu item to **Project > Tools** named [name]. When clicked, the provided [callable] will be called.
   */
  public fun addToolMenuItem(name: String, callable: Callable): Unit {
    TransferContext.writeArguments(STRING to name, CALLABLE to callable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_TOOL_MENU_ITEM,
        NIL)
  }

  /**
   * Adds a custom [godot.PopupMenu] submenu under **Project > Tools >** [name]. Use `remove_tool_menu_item(name)` on plugin clean up to remove the menu.
   */
  public fun addToolSubmenuItem(name: String, submenu: PopupMenu): Unit {
    TransferContext.writeArguments(STRING to name, OBJECT to submenu)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_TOOL_SUBMENU_ITEM,
        NIL)
  }

  /**
   * Removes a menu [name] from **Project > Tools**.
   */
  public fun removeToolMenuItem(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_TOOL_MENU_ITEM,
        NIL)
  }

  /**
   * Returns the [godot.PopupMenu] under **Scene > Export As...**.
   */
  public fun getExportAsMenu(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_GET_EXPORT_AS_MENU,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PopupMenu?)
  }

  /**
   * Adds a custom type, which will appear in the list of nodes or resources. An icon can be optionally passed.
   *
   * When a given node or resource is selected, the base type will be instantiated (e.g. "Node3D", "Control", "Resource"), then the script will be loaded and set to this object.
   *
   * **Note:** The base type is the base engine class which this type's class hierarchy inherits, not any custom type parent classes.
   *
   * You can use the virtual method [_handles] to check if your custom object is being edited by checking the script or using the `is` keyword.
   *
   * During run-time, this will be a simple object with a script so this function does not need to be called then.
   *
   * **Note:** Custom types added this way are not true classes. They are just a helper to create a node with specific script.
   */
  public fun addCustomType(
    type: String,
    base: String,
    script: Script,
    icon: Texture2D,
  ): Unit {
    TransferContext.writeArguments(STRING to type, STRING to base, OBJECT to script, OBJECT to icon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_CUSTOM_TYPE, NIL)
  }

  /**
   * Removes a custom type added by [addCustomType].
   */
  public fun removeCustomType(type: String): Unit {
    TransferContext.writeArguments(STRING to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_CUSTOM_TYPE,
        NIL)
  }

  /**
   * Adds a script at [path] to the Autoload list as [name].
   */
  public fun addAutoloadSingleton(name: String, path: String): Unit {
    TransferContext.writeArguments(STRING to name, STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_AUTOLOAD_SINGLETON,
        NIL)
  }

  /**
   * Removes an Autoload [name] from the list.
   */
  public fun removeAutoloadSingleton(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_AUTOLOAD_SINGLETON, NIL)
  }

  /**
   * Updates the overlays of the 2D and 3D editor viewport. Causes methods [_forwardCanvasDrawOverViewport], [_forwardCanvasForceDrawOverViewport], [_forward3dDrawOverViewport] and [_forward3dForceDrawOverViewport] to be called.
   */
  public fun updateOverlays(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_UPDATE_OVERLAYS, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Makes a specific item in the bottom panel visible.
   */
  public fun makeBottomPanelItemVisible(item: Control): Unit {
    TransferContext.writeArguments(OBJECT to item)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_MAKE_BOTTOM_PANEL_ITEM_VISIBLE, NIL)
  }

  /**
   * Minimizes the bottom panel.
   */
  public fun hideBottomPanel(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_HIDE_BOTTOM_PANEL, NIL)
  }

  /**
   * Gets the undo/redo object. Most actions in the editor can be undoable, so use this object to make sure this happens when it's worth it.
   */
  public fun getUndoRedo(): EditorUndoRedoManager? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_GET_UNDO_REDO, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorUndoRedoManager?)
  }

  /**
   * Hooks a callback into the undo/redo action creation when a property is modified in the inspector. This allows, for example, to save other properties that may be lost when a given property is modified.
   *
   * The callback should have 4 arguments: [godot.Object] `undo_redo`, [godot.Object] `modified_object`, [godot.String] `property` and [Variant] `new_value`. They are, respectively, the [godot.UndoRedo] object used by the inspector, the currently modified object, the name of the modified property and the new value the property is about to take.
   */
  public fun addUndoRedoInspectorHookCallback(callable: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to callable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_UNDO_REDO_INSPECTOR_HOOK_CALLBACK, NIL)
  }

  /**
   * Removes a callback previously added by [addUndoRedoInspectorHookCallback].
   */
  public fun removeUndoRedoInspectorHookCallback(callable: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to callable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_UNDO_REDO_INSPECTOR_HOOK_CALLBACK, NIL)
  }

  /**
   * Queue save the project's editor layout.
   */
  public fun queueSaveLayout(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_QUEUE_SAVE_LAYOUT, NIL)
  }

  /**
   * Registers a custom translation parser plugin for extracting translatable strings from custom files.
   */
  public fun addTranslationParserPlugin(parser: EditorTranslationParserPlugin): Unit {
    TransferContext.writeArguments(OBJECT to parser)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_TRANSLATION_PARSER_PLUGIN, NIL)
  }

  /**
   * Removes a custom translation parser plugin registered by [addTranslationParserPlugin].
   */
  public fun removeTranslationParserPlugin(parser: EditorTranslationParserPlugin): Unit {
    TransferContext.writeArguments(OBJECT to parser)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_TRANSLATION_PARSER_PLUGIN, NIL)
  }

  /**
   * Registers a new [godot.EditorImportPlugin]. Import plugins are used to import custom and unsupported assets as a custom [godot.Resource] type.
   *
   * If [firstPriority] is `true`, the new import plugin is inserted first in the list and takes precedence over pre-existing plugins.
   *
   * **Note:** If you want to import custom 3D asset formats use [addSceneFormatImporterPlugin] instead.
   *
   * See [addInspectorPlugin] for an example of how to register a plugin.
   */
  public fun addImportPlugin(importer: EditorImportPlugin, firstPriority: Boolean = false): Unit {
    TransferContext.writeArguments(OBJECT to importer, BOOL to firstPriority)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_IMPORT_PLUGIN, NIL)
  }

  /**
   * Removes an import plugin registered by [addImportPlugin].
   */
  public fun removeImportPlugin(importer: EditorImportPlugin): Unit {
    TransferContext.writeArguments(OBJECT to importer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_IMPORT_PLUGIN,
        NIL)
  }

  /**
   * Registers a new [godot.EditorSceneFormatImporter]. Scene importers are used to import custom 3D asset formats as scenes.
   *
   * If [firstPriority] is `true`, the new import plugin is inserted first in the list and takes precedence over pre-existing plugins.
   */
  public fun addSceneFormatImporterPlugin(sceneFormatImporter: EditorSceneFormatImporter,
      firstPriority: Boolean = false): Unit {
    TransferContext.writeArguments(OBJECT to sceneFormatImporter, BOOL to firstPriority)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_SCENE_FORMAT_IMPORTER_PLUGIN, NIL)
  }

  /**
   * Removes a scene format importer registered by [addSceneFormatImporterPlugin].
   */
  public fun removeSceneFormatImporterPlugin(sceneFormatImporter: EditorSceneFormatImporter): Unit {
    TransferContext.writeArguments(OBJECT to sceneFormatImporter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_SCENE_FORMAT_IMPORTER_PLUGIN, NIL)
  }

  /**
   * Add a [godot.EditorScenePostImportPlugin]. These plugins allow customizing the import process of 3D assets by adding new options to the import dialogs.
   *
   * If [firstPriority] is `true`, the new import plugin is inserted first in the list and takes precedence over pre-existing plugins.
   */
  public fun addScenePostImportPlugin(sceneImportPlugin: EditorScenePostImportPlugin,
      firstPriority: Boolean = false): Unit {
    TransferContext.writeArguments(OBJECT to sceneImportPlugin, BOOL to firstPriority)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_SCENE_POST_IMPORT_PLUGIN, NIL)
  }

  /**
   * Remove the [godot.EditorScenePostImportPlugin], added with [addScenePostImportPlugin].
   */
  public fun removeScenePostImportPlugin(sceneImportPlugin: EditorScenePostImportPlugin): Unit {
    TransferContext.writeArguments(OBJECT to sceneImportPlugin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_SCENE_POST_IMPORT_PLUGIN, NIL)
  }

  /**
   * Registers a new [godot.EditorExportPlugin]. Export plugins are used to perform tasks when the project is being exported.
   *
   * See [addInspectorPlugin] for an example of how to register a plugin.
   */
  public fun addExportPlugin(plugin: EditorExportPlugin): Unit {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_EXPORT_PLUGIN, NIL)
  }

  /**
   * Removes an export plugin registered by [addExportPlugin].
   */
  public fun removeExportPlugin(plugin: EditorExportPlugin): Unit {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_EXPORT_PLUGIN,
        NIL)
  }

  /**
   * Registers a new [godot.EditorNode3DGizmoPlugin]. Gizmo plugins are used to add custom gizmos to the 3D preview viewport for a [godot.Node3D].
   *
   * See [addInspectorPlugin] for an example of how to register a plugin.
   */
  public fun addNode3dGizmoPlugin(plugin: EditorNode3DGizmoPlugin): Unit {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_NODE_3D_GIZMO_PLUGIN, NIL)
  }

  /**
   * Removes a gizmo plugin registered by [addNode3dGizmoPlugin].
   */
  public fun removeNode3dGizmoPlugin(plugin: EditorNode3DGizmoPlugin): Unit {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_NODE_3D_GIZMO_PLUGIN, NIL)
  }

  /**
   * Registers a new [godot.EditorInspectorPlugin]. Inspector plugins are used to extend [godot.EditorInspector] and provide custom configuration tools for your object's properties.
   *
   * **Note:** Always use [removeInspectorPlugin] to remove the registered [godot.EditorInspectorPlugin] when your [godot.EditorPlugin] is disabled to prevent leaks and an unexpected behavior.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * const MyInspectorPlugin = preload("res://addons/your_addon/path/to/your/script.gd")
   *
   * var inspector_plugin = MyInspectorPlugin.new()
   *
   *
   *
   * func _enter_tree():
   *
   *     add_inspector_plugin(inspector_plugin)
   *
   *
   *
   * func _exit_tree():
   *
   *     remove_inspector_plugin(inspector_plugin)
   *
   * [/gdscript]
   *
   * [/codeblocks]
   */
  public fun addInspectorPlugin(plugin: EditorInspectorPlugin): Unit {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_INSPECTOR_PLUGIN,
        NIL)
  }

  /**
   * Removes an inspector plugin registered by [addImportPlugin]
   */
  public fun removeInspectorPlugin(plugin: EditorInspectorPlugin): Unit {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_INSPECTOR_PLUGIN, NIL)
  }

  /**
   * Registers a new [godot.EditorResourceConversionPlugin]. Resource conversion plugins are used to add custom resource converters to the editor inspector.
   *
   * See [godot.EditorResourceConversionPlugin] for an example of how to create a resource conversion plugin.
   */
  public fun addResourceConversionPlugin(plugin: EditorResourceConversionPlugin): Unit {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_RESOURCE_CONVERSION_PLUGIN, NIL)
  }

  /**
   * Removes a resource conversion plugin registered by [addResourceConversionPlugin].
   */
  public fun removeResourceConversionPlugin(plugin: EditorResourceConversionPlugin): Unit {
    TransferContext.writeArguments(OBJECT to plugin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_RESOURCE_CONVERSION_PLUGIN, NIL)
  }

  /**
   * Use this method if you always want to receive inputs from 3D view screen inside [_forward3dGuiInput]. It might be especially usable if your plugin will want to use raycast in the scene.
   */
  public fun setInputEventForwardingAlwaysEnabled(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_SET_INPUT_EVENT_FORWARDING_ALWAYS_ENABLED, NIL)
  }

  /**
   * Enables calling of [_forwardCanvasForceDrawOverViewport] for the 2D editor and [_forward3dForceDrawOverViewport] for the 3D editor when their viewports are updated. You need to call this method only once and it will work permanently for this plugin.
   */
  public fun setForceDrawOverForwardingEnabled(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_SET_FORCE_DRAW_OVER_FORWARDING_ENABLED, NIL)
  }

  /**
   * Returns the [godot.EditorInterface] object that gives you control over Godot editor's window and its functionalities.
   */
  public fun getEditorInterface(): EditorInterface? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_GET_EDITOR_INTERFACE,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorInterface?)
  }

  /**
   * Gets the Editor's dialog used for making scripts.
   *
   * **Note:** Users can configure it before use.
   *
   * **Warning:** Removing and freeing this node will render a part of the editor useless and may cause a crash.
   */
  public fun getScriptCreateDialog(): ScriptCreateDialog? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_GET_SCRIPT_CREATE_DIALOG, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ScriptCreateDialog?)
  }

  /**
   * Adds a [godot.Script] as debugger plugin to the Debugger. The script must extend [godot.EditorDebuggerPlugin].
   */
  public fun addDebuggerPlugin(script: EditorDebuggerPlugin): Unit {
    TransferContext.writeArguments(OBJECT to script)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_ADD_DEBUGGER_PLUGIN,
        NIL)
  }

  /**
   * Removes the debugger plugin with given script from the Debugger.
   */
  public fun removeDebuggerPlugin(script: EditorDebuggerPlugin): Unit {
    TransferContext.writeArguments(OBJECT to script)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORPLUGIN_REMOVE_DEBUGGER_PLUGIN,
        NIL)
  }

  public enum class CustomControlContainer(
    id: Long,
  ) {
    /**
     * Main editor toolbar, next to play buttons.
     */
    CONTAINER_TOOLBAR(0),
    /**
     * The toolbar that appears when 3D editor is active.
     */
    CONTAINER_SPATIAL_EDITOR_MENU(1),
    /**
     * Left sidebar of the 3D editor.
     */
    CONTAINER_SPATIAL_EDITOR_SIDE_LEFT(2),
    /**
     * Right sidebar of the 3D editor.
     */
    CONTAINER_SPATIAL_EDITOR_SIDE_RIGHT(3),
    /**
     * Bottom panel of the 3D editor.
     */
    CONTAINER_SPATIAL_EDITOR_BOTTOM(4),
    /**
     * The toolbar that appears when 2D editor is active.
     */
    CONTAINER_CANVAS_EDITOR_MENU(5),
    /**
     * Left sidebar of the 2D editor.
     */
    CONTAINER_CANVAS_EDITOR_SIDE_LEFT(6),
    /**
     * Right sidebar of the 2D editor.
     */
    CONTAINER_CANVAS_EDITOR_SIDE_RIGHT(7),
    /**
     * Bottom panel of the 2D editor.
     */
    CONTAINER_CANVAS_EDITOR_BOTTOM(8),
    /**
     * Bottom section of the inspector.
     */
    CONTAINER_INSPECTOR_BOTTOM(9),
    /**
     * Tab of Project Settings dialog, to the left of other tabs.
     */
    CONTAINER_PROJECT_SETTING_TAB_LEFT(10),
    /**
     * Tab of Project Settings dialog, to the right of other tabs.
     */
    CONTAINER_PROJECT_SETTING_TAB_RIGHT(11),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DockSlot(
    id: Long,
  ) {
    /**
     * Dock slot, left side, upper-left (empty in default layout).
     */
    DOCK_SLOT_LEFT_UL(0),
    /**
     * Dock slot, left side, bottom-left (empty in default layout).
     */
    DOCK_SLOT_LEFT_BL(1),
    /**
     * Dock slot, left side, upper-right (in default layout includes Scene and Import docks).
     */
    DOCK_SLOT_LEFT_UR(2),
    /**
     * Dock slot, left side, bottom-right (in default layout includes FileSystem dock).
     */
    DOCK_SLOT_LEFT_BR(3),
    /**
     * Dock slot, right side, upper-left (empty in default layout).
     */
    DOCK_SLOT_RIGHT_UL(4),
    /**
     * Dock slot, right side, bottom-left (empty in default layout).
     */
    DOCK_SLOT_RIGHT_BL(5),
    /**
     * Dock slot, right side, upper-right (in default layout includes Inspector, Node and History docks).
     */
    DOCK_SLOT_RIGHT_UR(6),
    /**
     * Dock slot, right side, bottom-right (empty in default layout).
     */
    DOCK_SLOT_RIGHT_BR(7),
    /**
     * Represents the size of the [enum DockSlot] enum.
     */
    DOCK_SLOT_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class AfterGUIInput(
    id: Long,
  ) {
    /**
     * Forwards the [godot.InputEvent] to other EditorPlugins.
     */
    AFTER_GUI_INPUT_PASS(0),
    /**
     * Prevents the [godot.InputEvent] from reaching other Editor classes.
     */
    AFTER_GUI_INPUT_STOP(1),
    /**
     * Pass the [godot.InputEvent] to other editor plugins except the main [godot.Node3D] one. This can be used to prevent node selection changes and work with sub-gizmos instead.
     */
    AFTER_GUI_INPUT_CUSTOM(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}

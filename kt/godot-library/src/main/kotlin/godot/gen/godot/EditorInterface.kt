// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Godot editor's interface.
 *
 * EditorInterface gives you control over Godot editor's window. It allows customizing the window, saving and (re-)loading scenes, rendering mesh previews, inspecting and editing resources and objects, and provides access to [godot.EditorSettings], [godot.EditorFileSystem], [godot.EditorResourcePreview], [godot.ScriptEditor], the editor viewport, and information about scenes.
 *
 * **Note:** This class shouldn't be instantiated directly. Instead, access the singleton using [godot.EditorPlugin.getEditorInterface].
 */
@GodotBaseType
open class EditorInterface : Node() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_EDITORINTERFACE)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  /**
   * Edits the given [godot.Resource].
   */
  open fun editResource(resource: Resource) {
    TransferContext.writeArguments(OBJECT to resource)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_EDIT_RESOURCE, NIL)
  }

  /**
   * Returns the main container of Godot editor's window. For example, you can use it to retrieve the size of the container and place your controls accordingly.
   */
  open fun getBaseControl(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_BASE_CONTROL,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Control?
  }

  /**
   * Returns the current path being viewed in the [godot.FileSystemDock].
   */
  open fun getCurrentPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_CURRENT_PATH,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the edited (current) scene's root [godot.Node].
   */
  open fun getEditedSceneRoot(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_EDITED_SCENE_ROOT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Returns the editor's [godot.EditorSettings] instance.
   */
  open fun getEditorSettings(): EditorSettings? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_EDITOR_SETTINGS,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorSettings?
  }

  /**
   * Returns the main editor control. Use this as a parent for main screens.
   *
   * **Note:** This returns the main editor control containing the whole editor, not the 2D or 3D viewports specifically.
   */
  open fun getEditorViewport(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_EDITOR_VIEWPORT,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Control?
  }

  /**
   * Returns the editor's [godot.FileSystemDock] instance.
   */
  open fun getFileSystemDock(): FileSystemDock? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_FILE_SYSTEM_DOCK, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as FileSystemDock?
  }

  /**
   * Returns the editor's [godot.EditorInspector] instance.
   */
  open fun getInspector(): EditorInspector? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_INSPECTOR,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorInspector?
  }

  /**
   * Returns an [godot.Array] with the file paths of the currently opened scenes.
   */
  open fun getOpenScenes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_OPEN_SCENES,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the editor's [godot.EditorFileSystem] instance.
   */
  open fun getResourceFilesystem(): EditorFileSystem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_RESOURCE_FILESYSTEM, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorFileSystem?
  }

  /**
   * Returns the editor's [godot.EditorResourcePreview] instance.
   */
  open fun getResourcePreviewer(): EditorResourcePreview? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_RESOURCE_PREVIEWER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorResourcePreview?
  }

  /**
   * Returns the editor's [godot.ScriptEditor] instance.
   */
  open fun getScriptEditor(): ScriptEditor? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_SCRIPT_EDITOR,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ScriptEditor?
  }

  /**
   * Returns the path of the directory currently selected in the [godot.FileSystemDock]. If a file is selected, its base directory will be returned using [godot.String.getBaseDir] instead.
   */
  open fun getSelectedPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_SELECTED_PATH,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the editor's [godot.EditorSelection] instance.
   */
  open fun getSelection(): EditorSelection? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_SELECTION,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorSelection?
  }

  /**
   * Shows the given property on the given `object` in the editor's Inspector dock.
   */
  open fun inspectObject(_object: Object, forProperty: String = "") {
    TransferContext.writeArguments(OBJECT to _object, STRING to forProperty)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_INSPECT_OBJECT, NIL)
  }

  /**
   * Returns `true` if the specified `plugin` is enabled. The plugin name is the same as its directory name.
   */
  open fun isPluginEnabled(plugin: String): Boolean {
    TransferContext.writeArguments(STRING to plugin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_IS_PLUGIN_ENABLED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns mesh previews rendered at the given size as an [godot.Array] of [godot.Texture]s.
   */
  open fun makeMeshPreviews(meshes: VariantArray<Any?>, previewSize: Long): VariantArray<Any?> {
    TransferContext.writeArguments(ARRAY to meshes, LONG to previewSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_MAKE_MESH_PREVIEWS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Opens the scene at the given path.
   */
  open fun openSceneFromPath(sceneFilepath: String) {
    TransferContext.writeArguments(STRING to sceneFilepath)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_OPEN_SCENE_FROM_PATH, NIL)
  }

  /**
   * Reloads the scene at the given path.
   */
  open fun reloadSceneFromPath(sceneFilepath: String) {
    TransferContext.writeArguments(STRING to sceneFilepath)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_RELOAD_SCENE_FROM_PATH, NIL)
  }

  /**
   * Saves the scene. Returns either `OK` or `ERR_CANT_CREATE` (see [@GlobalScope] constants).
   */
  open fun saveScene(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_SAVE_SCENE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Saves the scene as a file at `path`.
   */
  open fun saveSceneAs(path: String, withPreview: Boolean = true) {
    TransferContext.writeArguments(STRING to path, BOOL to withPreview)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_SAVE_SCENE_AS, NIL)
  }

  /**
   * Selects the file, with the path provided by `file`, in the FileSystem dock.
   */
  open fun selectFile(file: String) {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_SELECT_FILE, NIL)
  }

  open fun setDistractionFreeMode(enter: Boolean) {
    TransferContext.writeArguments(BOOL to enter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_SET_DISTRACTION_FREE_MODE, NIL)
  }

  /**
   * Sets the editor's current main screen to the one specified in `name`. `name` must match the text of the tab in question exactly (`2D`, `3D`, `Script`, `AssetLib`).
   */
  open fun setMainScreenEditor(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_SET_MAIN_SCREEN_EDITOR, NIL)
  }

  /**
   * Sets the enabled status of a plugin. The plugin name is the same as its directory name.
   */
  open fun setPluginEnabled(plugin: String, enabled: Boolean) {
    TransferContext.writeArguments(STRING to plugin, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_SET_PLUGIN_ENABLED,
        NIL)
  }
}

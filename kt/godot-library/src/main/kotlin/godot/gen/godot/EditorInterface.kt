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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class EditorInterface : Node() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_EDITORINTERFACE)

  open fun editResource(resource: Resource) {
    TransferContext.writeArguments(OBJECT to resource)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_EDIT_RESOURCE, NIL)
  }

  open fun getBaseControl(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_BASE_CONTROL,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Control?
  }

  open fun getCurrentPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_CURRENT_PATH,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getEditedSceneRoot(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_EDITED_SCENE_ROOT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  open fun getEditorSettings(): EditorSettings? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_EDITOR_SETTINGS,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorSettings?
  }

  open fun getEditorViewport(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_EDITOR_VIEWPORT,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Control?
  }

  open fun getFileSystemDock(): FileSystemDock? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_FILE_SYSTEM_DOCK, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as FileSystemDock?
  }

  open fun getInspector(): EditorInspector? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_INSPECTOR,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorInspector?
  }

  open fun getOpenScenes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_OPEN_SCENES,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun getResourceFilesystem(): EditorFileSystem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_RESOURCE_FILESYSTEM, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorFileSystem?
  }

  open fun getResourcePreviewer(): EditorResourcePreview? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_RESOURCE_PREVIEWER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorResourcePreview?
  }

  open fun getScriptEditor(): ScriptEditor? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_SCRIPT_EDITOR,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ScriptEditor?
  }

  open fun getSelectedPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_SELECTED_PATH,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getSelection(): EditorSelection? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_SELECTION,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorSelection?
  }

  open fun inspectObject(_object: Object, forProperty: String = "") {
    TransferContext.writeArguments(OBJECT to _object, STRING to forProperty)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_INSPECT_OBJECT, NIL)
  }

  open fun isPluginEnabled(plugin: String): Boolean {
    TransferContext.writeArguments(STRING to plugin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_IS_PLUGIN_ENABLED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun makeMeshPreviews(meshes: VariantArray<Any?>, previewSize: Long): VariantArray<Any?> {
    TransferContext.writeArguments(ARRAY to meshes, LONG to previewSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_MAKE_MESH_PREVIEWS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun openSceneFromPath(sceneFilepath: String) {
    TransferContext.writeArguments(STRING to sceneFilepath)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_OPEN_SCENE_FROM_PATH, NIL)
  }

  open fun reloadSceneFromPath(sceneFilepath: String) {
    TransferContext.writeArguments(STRING to sceneFilepath)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_RELOAD_SCENE_FROM_PATH, NIL)
  }

  open fun saveScene(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_SAVE_SCENE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun saveSceneAs(path: String, withPreview: Boolean = true) {
    TransferContext.writeArguments(STRING to path, BOOL to withPreview)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_SAVE_SCENE_AS, NIL)
  }

  open fun selectFile(file: String) {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_SELECT_FILE, NIL)
  }

  open fun setDistractionFreeMode(enter: Boolean) {
    TransferContext.writeArguments(BOOL to enter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_SET_DISTRACTION_FREE_MODE, NIL)
  }

  open fun setMainScreenEditor(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_SET_MAIN_SCREEN_EDITOR, NIL)
  }

  open fun setPluginEnabled(plugin: String, enabled: Boolean) {
    TransferContext.writeArguments(STRING to plugin, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_SET_PLUGIN_ENABLED,
        NIL)
  }

  companion object
}

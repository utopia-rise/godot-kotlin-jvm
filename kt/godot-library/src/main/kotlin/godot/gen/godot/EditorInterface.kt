// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.Rect2i
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.RECT2I
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Godot editor's interface.
 *
 * [godot.EditorInterface] gives you control over Godot editor's window. It allows customizing the window, saving and (re-)loading scenes, rendering mesh previews, inspecting and editing resources and objects, and provides access to [godot.EditorSettings], [godot.EditorFileSystem], [godot.EditorResourcePreview], [godot.ScriptEditor], the editor viewport, and information about scenes.
 *
 * **Note:** This class shouldn't be instantiated directly. Instead, access the singleton directly by its name.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var editor_settings = EditorInterface.get_editor_settings()
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * // In C# you can access it via the static Singleton property.
 *
 * EditorSettings settings = EditorInterface.Singleton.GetEditorSettings();
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class EditorInterface internal constructor() : Object() {
  /**
   * If `true`, enables distraction-free mode which hides side docks to increase the space available for the main view.
   */
  public var distractionFreeMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDistractionFreeModeEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDistractionFreeModePtr, NIL)
    }

  /**
   * If `true`, the Movie Maker mode is enabled in the editor. See [godot.MovieWriter] for more information.
   */
  public var movieMakerEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMovieMakerEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMovieMakerEnabledPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORINTERFACE, scriptIndex)
    return true
  }

  /**
   * Restarts the editor. This closes the editor and then opens the same project. If [save] is `true`, the project will be saved before restarting.
   */
  @JvmOverloads
  public fun restartEditor(save: Boolean = true): Unit {
    TransferContext.writeArguments(BOOL to save)
    TransferContext.callMethod(rawPtr, MethodBindings.restartEditorPtr, NIL)
  }

  /**
   * Returns the editor's [godot.EditorCommandPalette] instance.
   *
   * **Warning:** Removing and freeing this node will render a part of the editor useless and may cause a crash.
   */
  public fun getCommandPalette(): EditorCommandPalette? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCommandPalettePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorCommandPalette?)
  }

  /**
   * Returns the editor's [godot.EditorFileSystem] instance.
   */
  public fun getResourceFilesystem(): EditorFileSystem? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getResourceFilesystemPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorFileSystem?)
  }

  /**
   * Returns the [godot.EditorPaths] singleton.
   */
  public fun getEditorPaths(): EditorPaths? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditorPathsPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorPaths?)
  }

  /**
   * Returns the editor's [godot.EditorResourcePreview] instance.
   */
  public fun getResourcePreviewer(): EditorResourcePreview? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getResourcePreviewerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorResourcePreview?)
  }

  /**
   * Returns the editor's [godot.EditorSelection] instance.
   */
  public fun getSelection(): EditorSelection? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorSelection?)
  }

  /**
   * Returns the editor's [godot.EditorSettings] instance.
   */
  public fun getEditorSettings(): EditorSettings? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditorSettingsPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorSettings?)
  }

  /**
   * Returns mesh previews rendered at the given size as an [godot.Array] of [godot.Texture2D]s.
   */
  public fun makeMeshPreviews(meshes: VariantArray<Mesh>, previewSize: Int):
      VariantArray<Texture2D> {
    TransferContext.writeArguments(ARRAY to meshes, LONG to previewSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.makeMeshPreviewsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Texture2D>)
  }

  /**
   * Sets the enabled status of a plugin. The plugin name is the same as its directory name.
   */
  public fun setPluginEnabled(plugin: String, enabled: Boolean): Unit {
    TransferContext.writeArguments(STRING to plugin, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setPluginEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the specified [plugin] is enabled. The plugin name is the same as its directory name.
   */
  public fun isPluginEnabled(plugin: String): Boolean {
    TransferContext.writeArguments(STRING to plugin)
    TransferContext.callMethod(rawPtr, MethodBindings.isPluginEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the editor's [godot.Theme].
   *
   * **Note:** When creating custom editor UI, prefer accessing theme items directly from your GUI nodes using the `get_theme_*` methods.
   */
  public fun getEditorTheme(): Theme? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_EDITOR_THEME,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Theme?)
  }

  /**
   * Returns the main container of Godot editor's window. For example, you can use it to retrieve the size of the container and place your controls accordingly.
   *
   * **Warning:** Removing and freeing this node will render the editor useless and may cause a crash.
   */
  public fun getBaseControl(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBaseControlPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Control?)
  }

  /**
   * Returns the editor control responsible for main screen plugins and tools. Use it with plugins that implement [godot.EditorPlugin.HasMainScreen].
   *
   * **Warning:** Removing and freeing this node will render a part of the editor useless and may cause a crash.
   */
  public fun getEditorMainScreen(): VBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditorMainScreenPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as VBoxContainer?)
  }

  /**
   * Returns the editor's [godot.ScriptEditor] instance.
   *
   * **Warning:** Removing and freeing this node will render a part of the editor useless and may cause a crash.
   */
  public fun getScriptEditor(): ScriptEditor? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScriptEditorPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as ScriptEditor?)
  }

  /**
   * Returns the 2D editor [godot.SubViewport]. It does not have a camera. Instead, the view transforms are done directly and can be accessed with [godot.Viewport.globalCanvasTransform].
   */
  public fun getEditorViewport2d(): SubViewport? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_EDITOR_VIEWPORT_2D, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as SubViewport?)
  }

  /**
   * Returns the specified 3D editor [godot.SubViewport], from `0` to `3`. The viewport can be used to access the active editor cameras with [godot.Viewport.getCamera3d].
   */
  @JvmOverloads
  public fun getEditorViewport3d(idx: Int = 0): SubViewport? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_EDITOR_VIEWPORT_3D, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as SubViewport?)
  }

  /**
   * Sets the editor's current main screen to the one specified in [name]. [name] must match the title of the tab in question exactly (e.g. `2D`, `3D`, [code skip-lint]Script`, or `AssetLib` for default tabs).
   */
  public fun setMainScreenEditor(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setMainScreenEditorPtr, NIL)
  }

  /**
   * Returns the actual scale of the editor UI (`1.0` being 100% scale). This can be used to adjust position and dimensions of the UI added by plugins.
   *
   * **Note:** This value is set via the `interface/editor/display_scale` and `interface/editor/custom_display_scale` editor settings. Editor must be restarted for changes to be properly applied.
   */
  public fun getEditorScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditorScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Pops up the [dialog] in the editor UI with [godot.Window.popupExclusive]. The dialog must have no current parent, otherwise the method fails.
   *
   * See also [godot.Window.setUnparentWhenInvisible].
   */
  @JvmOverloads
  public fun popupDialog(dialog: Window, rect: Rect2i = Rect2i(0, 0, 0, 0)): Unit {
    TransferContext.writeArguments(OBJECT to dialog, RECT2I to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.popupDialogPtr, NIL)
  }

  /**
   * Pops up the [dialog] in the editor UI with [godot.Window.popupExclusiveCentered]. The dialog must have no current parent, otherwise the method fails.
   *
   * See also [godot.Window.setUnparentWhenInvisible].
   */
  @JvmOverloads
  public fun popupDialogCentered(dialog: Window, minsize: Vector2i = Vector2i(0, 0)): Unit {
    TransferContext.writeArguments(OBJECT to dialog, VECTOR2I to minsize)
    TransferContext.callMethod(rawPtr, MethodBindings.popupDialogCenteredPtr, NIL)
  }

  /**
   * Pops up the [dialog] in the editor UI with [godot.Window.popupExclusiveCenteredRatio]. The dialog must have no current parent, otherwise the method fails.
   *
   * See also [godot.Window.setUnparentWhenInvisible].
   */
  @JvmOverloads
  public fun popupDialogCenteredRatio(dialog: Window, ratio: Float = 0.8f): Unit {
    TransferContext.writeArguments(OBJECT to dialog, DOUBLE to ratio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.popupDialogCenteredRatioPtr, NIL)
  }

  /**
   * Pops up the [dialog] in the editor UI with [godot.Window.popupExclusiveCenteredClamped]. The dialog must have no current parent, otherwise the method fails.
   *
   * See also [godot.Window.setUnparentWhenInvisible].
   */
  @JvmOverloads
  public fun popupDialogCenteredClamped(
    dialog: Window,
    minsize: Vector2i = Vector2i(0, 0),
    fallbackRatio: Float = 0.75f,
  ): Unit {
    TransferContext.writeArguments(OBJECT to dialog, VECTOR2I to minsize, DOUBLE to fallbackRatio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.popupDialogCenteredClampedPtr, NIL)
  }

  /**
   * Returns the name of the currently activated feature profile. If the default profile is currently active, an empty string is returned instead.
   *
   * In order to get a reference to the [godot.EditorFeatureProfile], you must load the feature profile using [godot.EditorFeatureProfile.loadFromFile].
   *
   * **Note:** Feature profiles created via the user interface are loaded from the `feature_profiles` directory, as a file with the `.profile` extension. The editor configuration folder can be found by using [godot.EditorPaths.getConfigDir].
   */
  public fun getCurrentFeatureProfile(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_GET_CURRENT_FEATURE_PROFILE, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Selects and activates the specified feature profile with the given [profileName]. Set [profileName] to an empty string to reset to the default feature profile.
   *
   * A feature profile can be created programmatically using the [godot.EditorFeatureProfile] class.
   *
   * **Note:** The feature profile that gets activated must be located in the `feature_profiles` directory, as a file with the `.profile` extension. If a profile could not be found, an error occurs. The editor configuration folder can be found by using [godot.EditorPaths.getConfigDir].
   */
  public fun setCurrentFeatureProfile(profileName: String): Unit {
    TransferContext.writeArguments(STRING to profileName)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_SET_CURRENT_FEATURE_PROFILE, NIL)
  }

  /**
   * Returns the editor's [godot.FileSystemDock] instance.
   *
   * **Warning:** Removing and freeing this node will render a part of the editor useless and may cause a crash.
   */
  public fun getFileSystemDock(): FileSystemDock? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFileSystemDockPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as FileSystemDock?)
  }

  /**
   * Selects the file, with the path provided by [file], in the FileSystem dock.
   */
  public fun selectFile(`file`: String): Unit {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(rawPtr, MethodBindings.selectFilePtr, NIL)
  }

  /**
   * Returns an array containing the paths of the currently selected files (and directories) in the [godot.FileSystemDock].
   */
  public fun getSelectedPaths(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedPathsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns the current path being viewed in the [godot.FileSystemDock].
   */
  public fun getCurrentPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the current directory being viewed in the [godot.FileSystemDock]. If a file is selected, its base directory will be returned using [godot.String.getBaseDir] instead.
   */
  public fun getCurrentDirectory(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentDirectoryPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the editor's [godot.EditorInspector] instance.
   *
   * **Warning:** Removing and freeing this node will render a part of the editor useless and may cause a crash.
   */
  public fun getInspector(): EditorInspector? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInspectorPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as EditorInspector?)
  }

  /**
   * Shows the given property on the given [object] in the editor's Inspector dock. If [inspectorOnly] is `true`, plugins will not attempt to edit [object].
   */
  @JvmOverloads
  public fun inspectObject(
    _object: Object,
    forProperty: String = "",
    inspectorOnly: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(OBJECT to _object, STRING to forProperty, BOOL to inspectorOnly)
    TransferContext.callMethod(rawPtr, MethodBindings.inspectObjectPtr, NIL)
  }

  /**
   * Edits the given [godot.Resource]. If the resource is a [godot.Script] you can also edit it with [editScript] to specify the line and column position.
   */
  public fun editResource(resource: Resource): Unit {
    TransferContext.writeArguments(OBJECT to resource)
    TransferContext.callMethod(rawPtr, MethodBindings.editResourcePtr, NIL)
  }

  /**
   * Edits the given [godot.Node]. The node will be also selected if it's inside the scene tree.
   */
  public fun editNode(node: Node): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.editNodePtr, NIL)
  }

  /**
   * Edits the given [godot.Script]. The line and column on which to open the script can also be specified. The script will be open with the user-configured editor for the script's language which may be an external editor.
   */
  @JvmOverloads
  public fun editScript(
    script: Script,
    line: Int = -1,
    column: Int = 0,
    grabFocus: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(OBJECT to script, LONG to line.toLong(), LONG to column.toLong(), BOOL to grabFocus)
    TransferContext.callMethod(rawPtr, MethodBindings.editScriptPtr, NIL)
  }

  /**
   * Opens the scene at the given path.
   */
  public fun openSceneFromPath(sceneFilepath: String): Unit {
    TransferContext.writeArguments(STRING to sceneFilepath)
    TransferContext.callMethod(rawPtr, MethodBindings.openSceneFromPathPtr, NIL)
  }

  /**
   * Reloads the scene at the given path.
   */
  public fun reloadSceneFromPath(sceneFilepath: String): Unit {
    TransferContext.writeArguments(STRING to sceneFilepath)
    TransferContext.callMethod(rawPtr, MethodBindings.reloadSceneFromPathPtr, NIL)
  }

  /**
   * Returns an [godot.Array] with the file paths of the currently opened scenes.
   */
  public fun getOpenScenes(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOpenScenesPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns the edited (current) scene's root [godot.Node].
   */
  public fun getEditedSceneRoot(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEditedSceneRootPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Node?)
  }

  /**
   * Saves the currently active scene. Returns either [OK] or [ERR_CANT_CREATE].
   */
  public fun saveScene(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.saveScenePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Saves the currently active scene as a file at [path].
   */
  @JvmOverloads
  public fun saveSceneAs(path: String, withPreview: Boolean = true): Unit {
    TransferContext.writeArguments(STRING to path, BOOL to withPreview)
    TransferContext.callMethod(rawPtr, MethodBindings.saveSceneAsPtr, NIL)
  }

  /**
   * Saves all opened scenes in the editor.
   */
  public fun saveAllScenes(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORINTERFACE_SAVE_ALL_SCENES,
        NIL)
  }

  /**
   * Marks the current scene tab as unsaved.
   */
  public fun markSceneAsUnsaved(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.markSceneAsUnsavedPtr, NIL)
  }

  /**
   * Plays the main scene.
   */
  public fun playMainScene(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.playMainScenePtr, NIL)
  }

  /**
   * Plays the currently active scene.
   */
  public fun playCurrentScene(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.playCurrentScenePtr, NIL)
  }

  /**
   * Plays the scene specified by its filepath.
   */
  public fun playCustomScene(sceneFilepath: String): Unit {
    TransferContext.writeArguments(STRING to sceneFilepath)
    TransferContext.callMethod(rawPtr, MethodBindings.playCustomScenePtr, NIL)
  }

  /**
   * Stops the scene that is currently playing.
   */
  public fun stopPlayingScene(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPlayingScenePtr, NIL)
  }

  /**
   * Returns `true` if a scene is currently being played, `false` otherwise. Paused scenes are considered as being played.
   */
  public fun isPlayingScene(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPlayingScenePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the name of the scene that is being played. If no scene is currently being played, returns an empty string.
   */
  public fun getPlayingScene(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlayingScenePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public companion object

  internal object MethodBindings {
    public val restartEditorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "restart_editor")

    public val getCommandPalettePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_command_palette")

    public val getResourceFilesystemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_resource_filesystem")

    public val getEditorPathsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_editor_paths")

    public val getResourcePreviewerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_resource_previewer")

    public val getSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_selection")

    public val getEditorSettingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_editor_settings")

    public val makeMeshPreviewsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "make_mesh_previews")

    public val setPluginEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "set_plugin_enabled")

    public val isPluginEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "is_plugin_enabled")

    public val getBaseControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_base_control")

    public val getEditorMainScreenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_editor_main_screen")

    public val getScriptEditorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_script_editor")

    public val setMainScreenEditorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "set_main_screen_editor")

    public val setDistractionFreeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "set_distraction_free_mode")

    public val isDistractionFreeModeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "is_distraction_free_mode_enabled")

    public val getEditorScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_editor_scale")

    public val popupDialogPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "popup_dialog")

    public val popupDialogCenteredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "popup_dialog_centered")

    public val popupDialogCenteredRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "popup_dialog_centered_ratio")

    public val popupDialogCenteredClampedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "popup_dialog_centered_clamped")

    public val getFileSystemDockPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_file_system_dock")

    public val selectFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "select_file")

    public val getSelectedPathsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_selected_paths")

    public val getCurrentPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_current_path")

    public val getCurrentDirectoryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_current_directory")

    public val getInspectorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_inspector")

    public val inspectObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "inspect_object")

    public val editResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "edit_resource")

    public val editNodePtr: VoidPtr = TypeManager.getMethodBindPtr("EditorInterface", "edit_node")

    public val editScriptPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "edit_script")

    public val openSceneFromPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "open_scene_from_path")

    public val reloadSceneFromPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "reload_scene_from_path")

    public val getOpenScenesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_open_scenes")

    public val getEditedSceneRootPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_edited_scene_root")

    public val saveScenePtr: VoidPtr = TypeManager.getMethodBindPtr("EditorInterface", "save_scene")

    public val saveSceneAsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "save_scene_as")

    public val markSceneAsUnsavedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "mark_scene_as_unsaved")

    public val playMainScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "play_main_scene")

    public val playCurrentScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "play_current_scene")

    public val playCustomScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "play_custom_scene")

    public val stopPlayingScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "stop_playing_scene")

    public val isPlayingScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "is_playing_scene")

    public val getPlayingScenePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "get_playing_scene")

    public val setMovieMakerEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "set_movie_maker_enabled")

    public val isMovieMakerEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorInterface", "is_movie_maker_enabled")
  }
}

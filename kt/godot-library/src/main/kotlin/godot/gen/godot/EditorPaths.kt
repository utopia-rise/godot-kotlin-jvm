// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

/**
 * Editor-only singleton that returns paths to various OS-specific data folders and files.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/io/data_paths.html]($DOCS_URL/tutorials/io/data_paths.html)
 *
 * This editor-only singleton returns OS-specific paths to various data folders and files. It can be used in editor plugins to ensure files are saved in the correct location on each operating system.
 *
 * **Note:** This singleton is not accessible in exported projects. Attempting to access it in an exported project will result in a script error as the singleton won't be declared. To prevent script errors in exported projects, use [godot.Engine.hasSingleton] to check whether the singleton is available before using it.
 *
 * **Note:** On the Linux/BSD platform, Godot complies with the [godot.XDG Base Directory Specification](https://specifications.freedesktop.org/basedir-spec/basedir-spec-latest.html). You can override environment variables following the specification to change the editor and project data paths.
 */
@GodotBaseType
public open class EditorPaths internal constructor() : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORPATHS, scriptIndex)
    return true
  }

  /**
   * Returns the absolute path to the user's data folder. This folder should be used for *persistent* user data files such as installed export templates.
   *
   * **Default paths per platform:**
   *
   * ```
   * 				- Windows: %APPDATA%\Godot\                    (same as `get_config_dir()`)
   * 				- macOS: ~/Library/Application Support/Godot/  (same as `get_config_dir()`)
   * 				- Linux: ~/.local/share/godot/
   * 				```
   */
  public fun getDataDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDataDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the absolute path to the user's configuration folder. This folder should be used for *persistent* user configuration files.
   *
   * **Default paths per platform:**
   *
   * ```
   * 				- Windows: %APPDATA%\Godot\                    (same as `get_data_dir()`)
   * 				- macOS: ~/Library/Application Support/Godot/  (same as `get_data_dir()`)
   * 				- Linux: ~/.config/godot/
   * 				```
   */
  public fun getConfigDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConfigDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the absolute path to the user's cache folder. This folder should be used for temporary data that can be removed safely whenever the editor is closed (such as generated resource thumbnails).
   *
   * **Default paths per platform:**
   *
   * ```
   * 				- Windows: %LOCALAPPDATA%\Godot\
   * 				- macOS: ~/Library/Caches/Godot/
   * 				- Linux: ~/.cache/godot/
   * 				```
   */
  public fun getCacheDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns `true` if the editor is marked as self-contained, `false` otherwise. When self-contained mode is enabled, user configuration, data and cache files are saved in an `editor_data/` folder next to the editor binary. This makes portable usage easier and ensures the Godot editor minimizes file writes outside its own folder. Self-contained mode is not available for exported projects.
   *
   * Self-contained mode can be enabled by creating a file named `._sc_` or `_sc_` in the same folder as the editor binary or macOS .app bundle while the editor is not running. See also [getSelfContainedFile].
   *
   * **Note:** On macOS, quarantine flag should be manually removed before using self-contained mode, see [godot.Running on macOS](https://docs.godotengine.org/en/stable/tutorials/export/running_on_macos.html).
   *
   * **Note:** On macOS, placing `_sc_` or any other file inside .app bundle will break digital signature and make it non-portable, consider placing it in the same folder as the .app bundle instead.
   *
   * **Note:** The Steam release of Godot uses self-contained mode by default.
   */
  public fun isSelfContained(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isSelfContainedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the absolute path to the self-contained file that makes the current Godot editor instance be considered as self-contained. Returns an empty string if the current Godot editor instance isn't self-contained. See also [isSelfContained].
   */
  public fun getSelfContainedFile(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelfContainedFilePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the project-specific editor settings path. Projects all have a unique subdirectory inside the settings path where project-specific editor settings are saved.
   */
  public fun getProjectSettingsDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProjectSettingsDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public companion object

  internal object MethodBindings {
    public val getDataDirPtr: VoidPtr = TypeManager.getMethodBindPtr("EditorPaths", "get_data_dir")

    public val getConfigDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPaths", "get_config_dir")

    public val getCacheDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPaths", "get_cache_dir")

    public val isSelfContainedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPaths", "is_self_contained")

    public val getSelfContainedFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPaths", "get_self_contained_file")

    public val getProjectSettingsDirPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorPaths", "get_project_settings_dir")
  }
}

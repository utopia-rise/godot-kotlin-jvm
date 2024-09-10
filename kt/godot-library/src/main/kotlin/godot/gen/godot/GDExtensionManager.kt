// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * The GDExtensionManager loads, initializes, and keeps track of all available [GDExtension]
 * libraries in the project.
 * **Note:** Do not worry about GDExtension unless you know what you are doing.
 */
@GodotBaseType
public object GDExtensionManager : Object() {
  /**
   * Emitted after the editor has finished reloading one or more extensions.
   */
  public val extensionsReloaded: Signal0 by signal()

  public override fun new(scriptIndex: Int): Unit {
    getSingleton(ENGINECLASS_GDEXTENSIONMANAGER)
  }

  /**
   * Loads an extension by absolute file path. The [path] needs to point to a valid [GDExtension].
   * Returns [LOAD_STATUS_OK] if successful.
   */
  public fun loadExtension(path: String): LoadStatus {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.loadExtensionPtr, LONG)
    return GDExtensionManager.LoadStatus.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Reloads the extension at the given file path. The [path] needs to point to a valid
   * [GDExtension], otherwise this method may return either [LOAD_STATUS_NOT_LOADED] or
   * [LOAD_STATUS_FAILED].
   * **Note:** You can only reload extensions in the editor. In release builds, this method always
   * fails and returns [LOAD_STATUS_FAILED].
   */
  public fun reloadExtension(path: String): LoadStatus {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.reloadExtensionPtr, LONG)
    return GDExtensionManager.LoadStatus.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Unloads an extension by file path. The [path] needs to point to an already loaded
   * [GDExtension], otherwise this method returns [LOAD_STATUS_NOT_LOADED].
   */
  public fun unloadExtension(path: String): LoadStatus {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.unloadExtensionPtr, LONG)
    return GDExtensionManager.LoadStatus.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the extension at the given file [path] has already been loaded successfully.
   * See also [getLoadedExtensions].
   */
  public fun isExtensionLoaded(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.isExtensionLoadedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the file paths of all currently loaded extensions.
   */
  public fun getLoadedExtensions(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLoadedExtensionsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns the [GDExtension] at the given file [path], or `null` if it has not been loaded or does
   * not exist.
   */
  public fun getExtension(path: String): GDExtension? {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.getExtensionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as GDExtension?)
  }

  public enum class LoadStatus(
    id: Long,
  ) {
    /**
     * The extension has loaded successfully.
     */
    LOAD_STATUS_OK(0),
    /**
     * The extension has failed to load, possibly because it does not exist or has missing
     * dependencies.
     */
    LOAD_STATUS_FAILED(1),
    /**
     * The extension has already been loaded.
     */
    LOAD_STATUS_ALREADY_LOADED(2),
    /**
     * The extension has not been loaded.
     */
    LOAD_STATUS_NOT_LOADED(3),
    /**
     * The extension requires the application to restart to fully load.
     */
    LOAD_STATUS_NEEDS_RESTART(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LoadStatus = entries.single { it.id == `value` }
    }
  }

  internal object MethodBindings {
    public val loadExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtensionManager", "load_extension", 4024158731)

    public val reloadExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtensionManager", "reload_extension", 4024158731)

    public val unloadExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtensionManager", "unload_extension", 4024158731)

    public val isExtensionLoadedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtensionManager", "is_extension_loaded", 3927539163)

    public val getLoadedExtensionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtensionManager", "get_loaded_extensions", 1139954409)

    public val getExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtensionManager", "get_extension", 49743343)
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.PackedStringArray
import godot.core.Signal0
import godot.core.Signal1
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

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
  @JvmStatic
  public val extensionsReloaded: Signal0 by Signal0

  /**
   * Emitted after the editor has finished loading a new extension.
   * **Note:** This signal is only emitted in editor builds.
   */
  @JvmStatic
  public val extensionLoaded: Signal1<GDExtension> by Signal1

  /**
   * Emitted before the editor starts unloading an extension.
   * **Note:** This signal is only emitted in editor builds.
   */
  @JvmStatic
  public val extensionUnloading: Signal1<GDExtension> by Signal1

  public override fun new(scriptIndex: Int): Unit {
    getSingleton(20)
  }

  /**
   * Loads an extension by absolute file path. The [path] needs to point to a valid [GDExtension].
   * Returns [LOAD_STATUS_OK] if successful.
   */
  @JvmStatic
  public final fun loadExtension(path: String): LoadStatus {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.loadExtensionPtr, LONG)
    return GDExtensionManager.LoadStatus.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Reloads the extension at the given file path. The [path] needs to point to a valid
   * [GDExtension], otherwise this method may return either [LOAD_STATUS_NOT_LOADED] or
   * [LOAD_STATUS_FAILED].
   * **Note:** You can only reload extensions in the editor. In release builds, this method always
   * fails and returns [LOAD_STATUS_FAILED].
   */
  @JvmStatic
  public final fun reloadExtension(path: String): LoadStatus {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.reloadExtensionPtr, LONG)
    return GDExtensionManager.LoadStatus.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Unloads an extension by file path. The [path] needs to point to an already loaded
   * [GDExtension], otherwise this method returns [LOAD_STATUS_NOT_LOADED].
   */
  @JvmStatic
  public final fun unloadExtension(path: String): LoadStatus {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.unloadExtensionPtr, LONG)
    return GDExtensionManager.LoadStatus.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the extension at the given file [path] has already been loaded successfully.
   * See also [getLoadedExtensions].
   */
  @JvmStatic
  public final fun isExtensionLoaded(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.isExtensionLoadedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the file paths of all currently loaded extensions.
   */
  @JvmStatic
  public final fun getLoadedExtensions(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLoadedExtensionsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns the [GDExtension] at the given file [path], or `null` if it has not been loaded or does
   * not exist.
   */
  @JvmStatic
  public final fun getExtension(path: String): GDExtension? {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(ptr, MethodBindings.getExtensionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as GDExtension?)
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

  public object MethodBindings {
    internal val loadExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtensionManager", "load_extension", 4024158731)

    internal val reloadExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtensionManager", "reload_extension", 4024158731)

    internal val unloadExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtensionManager", "unload_extension", 4024158731)

    internal val isExtensionLoadedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtensionManager", "is_extension_loaded", 3927539163)

    internal val getLoadedExtensionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtensionManager", "get_loaded_extensions", 1139954409)

    internal val getExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtensionManager", "get_extension", 49743343)
  }
}

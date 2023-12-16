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

/**
 *
 */
@GodotBaseType
public object GDExtensionManager : Object() {
  /**
   * Emitted after the editor has automatically reloaded any extensions.
   */
  public val extensionsReloaded: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_GDEXTENSIONMANAGER)
    return false
  }

  /**
   *
   */
  public fun loadExtension(path: String): LoadStatus {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.loadExtensionPtr, LONG)
    return GDExtensionManager.LoadStatus.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   *
   */
  public fun reloadExtension(path: String): LoadStatus {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.reloadExtensionPtr, LONG)
    return GDExtensionManager.LoadStatus.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   *
   */
  public fun unloadExtension(path: String): LoadStatus {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.unloadExtensionPtr, LONG)
    return GDExtensionManager.LoadStatus.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   *
   */
  public fun isExtensionLoaded(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.isExtensionLoadedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   *
   */
  public fun getLoadedExtensions(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLoadedExtensionsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   *
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
     *
     */
    LOAD_STATUS_OK(0),
    /**
     *
     */
    LOAD_STATUS_FAILED(1),
    /**
     *
     */
    LOAD_STATUS_ALREADY_LOADED(2),
    /**
     *
     */
    LOAD_STATUS_NOT_LOADED(3),
    /**
     *
     */
    LOAD_STATUS_NEEDS_RESTART(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  internal object MethodBindings {
    public val loadExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtensionManager", "load_extension")

    public val reloadExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtensionManager", "reload_extension")

    public val unloadExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtensionManager", "unload_extension")

    public val isExtensionLoadedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtensionManager", "is_extension_loaded")

    public val getLoadedExtensionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtensionManager", "get_loaded_extensions")

    public val getExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GDExtensionManager", "get_extension")
  }
}

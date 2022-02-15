// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.NativeExtensionManager
import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public object NativeExtensionManager : Object() {
  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_NATIVEEXTENSIONMANAGER)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   *
   */
  public open fun loadExtension(path: String): NativeExtensionManager.LoadStatus {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NATIVEEXTENSIONMANAGER_LOAD_EXTENSION, LONG)
    return NativeExtensionManager.LoadStatus.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public open fun reloadExtension(path: String): NativeExtensionManager.LoadStatus {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NATIVEEXTENSIONMANAGER_RELOAD_EXTENSION, LONG)
    return NativeExtensionManager.LoadStatus.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public open fun unloadExtension(path: String): NativeExtensionManager.LoadStatus {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NATIVEEXTENSIONMANAGER_UNLOAD_EXTENSION, LONG)
    return NativeExtensionManager.LoadStatus.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public open fun isExtensionLoaded(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NATIVEEXTENSIONMANAGER_IS_EXTENSION_LOADED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun getLoadedExtensions(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NATIVEEXTENSIONMANAGER_GET_LOADED_EXTENSIONS, PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   *
   */
  public open fun getExtension(path: String): NativeExtension? {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NATIVEEXTENSIONMANAGER_GET_EXTENSION, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as NativeExtension?
  }

  public enum class LoadStatus(
    id: Long
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }
}

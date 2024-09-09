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
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * This binding resource binds an [OpenXRAction] to inputs or outputs. As most controllers have left
 * hand and right versions that are handled by the same interaction profile we can specify multiple
 * bindings. For instance an action "Fire" could be bound to both "/user/hand/left/input/trigger" and
 * "/user/hand/right/input/trigger".
 */
@GodotBaseType
public open class OpenXRIPBinding : Resource() {
  /**
   * [OpenXRAction] that is bound to these paths.
   */
  public var action: OpenXRAction?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getActionPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as OpenXRAction?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setActionPtr, NIL)
    }

  /**
   * Paths that define the inputs or outputs bound on the device.
   */
  public var paths: PackedStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPathsPtr, PACKED_STRING_ARRAY)
      return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_STRING_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPathsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_OPENXRIPBINDING, scriptIndex)
  }

  /**
   * Get the number of input/output paths in this binding.
   */
  public fun getPathCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPathCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns `true` if this input/output path is part of this binding.
   */
  public fun hasPath(path: String): Boolean {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.hasPathPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Add an input/output path to this binding.
   */
  public fun addPath(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.addPathPtr, NIL)
  }

  /**
   * Removes this input/output path from this binding.
   */
  public fun removePath(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.removePathPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "set_action", 349361333)

    public val getActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "get_action", 4072409085)

    public val getPathCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "get_path_count", 3905245786)

    public val setPathsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "set_paths", 4015028928)

    public val getPathsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "get_paths", 1139954409)

    public val hasPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "has_path", 3927539163)

    public val addPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "add_path", 83702148)

    public val removePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRIPBinding", "remove_path", 83702148)
  }
}

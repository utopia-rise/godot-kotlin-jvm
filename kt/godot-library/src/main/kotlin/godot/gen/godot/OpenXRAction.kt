// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class OpenXRAction : Resource() {
  public var localizedName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLocalizedNamePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLocalizedNamePtr, NIL)
    }

  public var actionType: ActionType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getActionTypePtr, LONG)
      return OpenXRAction.ActionType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setActionTypePtr, NIL)
    }

  public var toplevelPaths: PackedStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getToplevelPathsPtr, PACKED_STRING_ARRAY)
      return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_STRING_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setToplevelPathsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OPENXRACTION, scriptIndex)
    return true
  }

  public enum class ActionType(
    id: Long,
  ) {
    OPENXR_ACTION_BOOL(0),
    OPENXR_ACTION_FLOAT(1),
    OPENXR_ACTION_VECTOR2(2),
    OPENXR_ACTION_POSE(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setLocalizedNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAction", "set_localized_name")

    public val getLocalizedNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAction", "get_localized_name")

    public val setActionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAction", "set_action_type")

    public val getActionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAction", "get_action_type")

    public val setToplevelPathsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAction", "set_toplevel_paths")

    public val getToplevelPathsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAction", "get_toplevel_paths")
  }
}

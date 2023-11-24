// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class OpenXRActionSet : Resource() {
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

  public var priority: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPriorityPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPriorityPtr, NIL)
    }

  public var actions: VariantArray<Any?>?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getActionsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, true) as VariantArray<Any?>?)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setActionsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OPENXRACTIONSET, scriptIndex)
    return true
  }

  public fun getActionCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getActionCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun addAction(action: OpenXRAction): Unit {
    TransferContext.writeArguments(OBJECT to action)
    TransferContext.callMethod(rawPtr, MethodBindings.addActionPtr, NIL)
  }

  public fun removeAction(action: OpenXRAction): Unit {
    TransferContext.writeArguments(OBJECT to action)
    TransferContext.callMethod(rawPtr, MethodBindings.removeActionPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setLocalizedNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionSet", "set_localized_name")

    public val getLocalizedNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionSet", "get_localized_name")

    public val setPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionSet", "set_priority")

    public val getPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionSet", "get_priority")

    public val getActionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionSet", "get_action_count")

    public val setActionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionSet", "set_actions")

    public val getActionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionSet", "get_actions")

    public val addActionPtr: VoidPtr = TypeManager.getMethodBindPtr("OpenXRActionSet", "add_action")

    public val removeActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionSet", "remove_action")
  }
}

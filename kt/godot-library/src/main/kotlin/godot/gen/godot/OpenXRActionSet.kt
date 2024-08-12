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

/**
 * Action sets in OpenXR define a collection of actions that can be activated in unison. This allows
 * games to easily change between different states that require different inputs or need to reinterpret
 * inputs. For instance we could have an action set that is active when a menu is open, an action set
 * that is active when the player is freely walking around and an action set that is active when the
 * player is controlling a vehicle.
 * Action sets can contain the same action with the same name, if such action sets are active at the
 * same time the action set with the highest priority defines which binding is active.
 */
@GodotBaseType
public open class OpenXRActionSet : Resource() {
  /**
   * The localized name of this action set.
   */
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

  /**
   * The priority for this action set.
   */
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

  /**
   * Collection of actions for this action set.
   */
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

  /**
   * Retrieve the number of actions in our action set.
   */
  public fun getActionCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getActionCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Add an action to this action set.
   */
  public fun addAction(action: OpenXRAction): Unit {
    TransferContext.writeArguments(OBJECT to action)
    TransferContext.callMethod(rawPtr, MethodBindings.addActionPtr, NIL)
  }

  /**
   * Remove an action from this action set.
   */
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

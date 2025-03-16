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
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Action sets in OpenXR define a collection of actions that can be activated in unison. This allows
 * games to easily change between different states that require different inputs or need to reinterpret
 * inputs. For instance we could have an action set that is active when a menu is open, an action set
 * that is active when the player is freely walking around and an action set that is active when the
 * player is controlling a vehicle.
 *
 * Action sets can contain the same action with the same name, if such action sets are active at the
 * same time the action set with the highest priority defines which binding is active.
 */
@GodotBaseType
public open class OpenXRActionSet : Resource() {
  /**
   * The localized name of this action set.
   */
  public final inline var localizedName: String
    @JvmName("localizedNameProperty")
    get() = getLocalizedName()
    @JvmName("localizedNameProperty")
    set(`value`) {
      setLocalizedName(value)
    }

  /**
   * The priority for this action set.
   */
  public final inline var priority: Int
    @JvmName("priorityProperty")
    get() = getPriority()
    @JvmName("priorityProperty")
    set(`value`) {
      setPriority(value)
    }

  /**
   * Collection of actions for this action set.
   */
  public final inline var actions: VariantArray<Any?>
    @JvmName("actionsProperty")
    get() = getActions()
    @JvmName("actionsProperty")
    set(`value`) {
      setActions(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(414, scriptIndex)
  }

  public final fun setLocalizedName(localizedName: String): Unit {
    TransferContext.writeArguments(STRING to localizedName)
    TransferContext.callMethod(ptr, MethodBindings.setLocalizedNamePtr, NIL)
  }

  public final fun getLocalizedName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLocalizedNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setPriority(priority: Int): Unit {
    TransferContext.writeArguments(LONG to priority.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setPriorityPtr, NIL)
  }

  public final fun getPriority(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPriorityPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Retrieve the number of actions in our action set.
   */
  public final fun getActionCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getActionCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setActions(actions: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to actions)
    TransferContext.callMethod(ptr, MethodBindings.setActionsPtr, NIL)
  }

  public final fun getActions(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getActionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Add an action to this action set.
   */
  public final fun addAction(action: OpenXRAction?): Unit {
    TransferContext.writeArguments(OBJECT to action)
    TransferContext.callMethod(ptr, MethodBindings.addActionPtr, NIL)
  }

  /**
   * Remove an action from this action set.
   */
  public final fun removeAction(action: OpenXRAction?): Unit {
    TransferContext.writeArguments(OBJECT to action)
    TransferContext.callMethod(ptr, MethodBindings.removeActionPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val setLocalizedNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionSet", "set_localized_name", 83702148)

    internal val getLocalizedNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionSet", "get_localized_name", 201670096)

    internal val setPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionSet", "set_priority", 1286410249)

    internal val getPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionSet", "get_priority", 3905245786)

    internal val getActionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionSet", "get_action_count", 3905245786)

    internal val setActionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionSet", "set_actions", 381264803)

    internal val getActionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionSet", "get_actions", 3995934104)

    internal val addActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionSet", "add_action", 349361333)

    internal val removeActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRActionSet", "remove_action", 349361333)
  }
}

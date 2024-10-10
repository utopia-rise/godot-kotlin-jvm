// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_OPENXRACTIONSET_INDEX: Int = 383

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
    Internals.callConstructor(this, ENGINE_CLASS_OPENXRACTIONSET_INDEX, scriptIndex)
  }

  public final fun setLocalizedName(localizedName: String): Unit {
    Internals.writeArguments(STRING to localizedName)
    Internals.callMethod(rawPtr, MethodBindings.setLocalizedNamePtr, NIL)
  }

  public final fun getLocalizedName(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLocalizedNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setPriority(priority: Int): Unit {
    Internals.writeArguments(LONG to priority.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setPriorityPtr, NIL)
  }

  public final fun getPriority(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPriorityPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Retrieve the number of actions in our action set.
   */
  public final fun getActionCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getActionCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setActions(actions: VariantArray<Any?>): Unit {
    Internals.writeArguments(ARRAY to actions)
    Internals.callMethod(rawPtr, MethodBindings.setActionsPtr, NIL)
  }

  public final fun getActions(): VariantArray<Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getActionsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Add an action to this action set.
   */
  public final fun addAction(action: OpenXRAction?): Unit {
    Internals.writeArguments(OBJECT to action)
    Internals.callMethod(rawPtr, MethodBindings.addActionPtr, NIL)
  }

  /**
   * Remove an action from this action set.
   */
  public final fun removeAction(action: OpenXRAction?): Unit {
    Internals.writeArguments(OBJECT to action)
    Internals.callMethod(rawPtr, MethodBindings.removeActionPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setLocalizedNamePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionSet", "set_localized_name", 83702148)

    public val getLocalizedNamePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionSet", "get_localized_name", 201670096)

    public val setPriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionSet", "set_priority", 1286410249)

    public val getPriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionSet", "get_priority", 3905245786)

    public val getActionCountPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionSet", "get_action_count", 3905245786)

    public val setActionsPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionSet", "set_actions", 381264803)

    public val getActionsPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionSet", "get_actions", 3995934104)

    public val addActionPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionSet", "add_action", 349361333)

    public val removeActionPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRActionSet", "remove_action", 349361333)
  }
}

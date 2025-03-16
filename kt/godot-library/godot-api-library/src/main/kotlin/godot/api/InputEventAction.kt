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
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING_NAME
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Contains a generic action which can be targeted from several types of inputs. Actions and their
 * events can be set in the **Input Map** tab in **Project > Project Settings**, or with the [InputMap]
 * class.
 * **Note:** Unlike the other [InputEvent] subclasses which map to unique physical events, this
 * virtual one is not emitted by the engine. This class is useful to emit actions manually with
 * [Input.parseInputEvent], which are then received in [Node.Input]. To check if a physical event
 * matches an action from the Input Map, use [InputEvent.isAction] and [InputEvent.isActionPressed].
 */
@GodotBaseType
public open class InputEventAction : InputEvent() {
  /**
   * The action's name. Actions are accessed via this [String].
   */
  public final inline var action: StringName
    @JvmName("actionProperty")
    get() = getAction()
    @JvmName("actionProperty")
    set(`value`) {
      setAction(value)
    }

  /**
   * If `true`, the action's state is pressed. If `false`, the action's state is released.
   */
  public final inline var pressed: Boolean
    @JvmName("pressedProperty")
    get() = isPressed()
    @JvmName("pressedProperty")
    set(`value`) {
      setPressed(value)
    }

  /**
   * The action's strength between 0 and 1. This value is considered as equal to 0 if pressed is
   * `false`. The event strength allows faking analog joypad motion events, by specifying how strongly
   * the joypad axis is bent or pressed.
   */
  public final inline var strength: Float
    @JvmName("strengthProperty")
    get() = getStrength()
    @JvmName("strengthProperty")
    set(`value`) {
      setStrength(value)
    }

  /**
   * The real event index in action this event corresponds to (from events defined for this action
   * in the [InputMap]). If `-1`, a unique ID will be used and actions pressed with this ID will need
   * to be released with another [InputEventAction].
   */
  public final inline var eventIndex: Int
    @JvmName("eventIndexProperty")
    get() = getEventIndex()
    @JvmName("eventIndexProperty")
    set(`value`) {
      setEventIndex(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(293, scriptIndex)
  }

  public final fun setAction(action: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(ptr, MethodBindings.setActionPtr, NIL)
  }

  public final fun getAction(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getActionPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setPressed(pressed: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pressed)
    TransferContext.callMethod(ptr, MethodBindings.setPressedPtr, NIL)
  }

  public final fun setStrength(strength: Float): Unit {
    TransferContext.writeArguments(DOUBLE to strength.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setStrengthPtr, NIL)
  }

  public final fun getStrength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEventIndex(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setEventIndexPtr, NIL)
  }

  public final fun getEventIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEventIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  public object MethodBindings {
    internal val setActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventAction", "set_action", 3304788590)

    internal val getActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventAction", "get_action", 2002593661)

    internal val setPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventAction", "set_pressed", 2586408642)

    internal val setStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventAction", "set_strength", 373806689)

    internal val getStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventAction", "get_strength", 1740695150)

    internal val setEventIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventAction", "set_event_index", 1286410249)

    internal val getEventIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventAction", "get_event_index", 3905245786)
  }
}

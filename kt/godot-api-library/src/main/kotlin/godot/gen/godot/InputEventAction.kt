// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING_NAME
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_INPUTEVENTACTION_INDEX: Int = 291

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
    Internals.callConstructor(this, ENGINE_CLASS_INPUTEVENTACTION_INDEX, scriptIndex)
  }

  public final fun setAction(action: StringName): Unit {
    Internals.writeArguments(STRING_NAME to action)
    Internals.callMethod(rawPtr, MethodBindings.setActionPtr, NIL)
  }

  public final fun getAction(): StringName {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getActionPtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setPressed(pressed: Boolean): Unit {
    Internals.writeArguments(BOOL to pressed)
    Internals.callMethod(rawPtr, MethodBindings.setPressedPtr, NIL)
  }

  public final fun setStrength(strength: Float): Unit {
    Internals.writeArguments(DOUBLE to strength.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setStrengthPtr, NIL)
  }

  public final fun getStrength(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getStrengthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEventIndex(index: Int): Unit {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setEventIndexPtr, NIL)
  }

  public final fun getEventIndex(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEventIndexPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setActionPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventAction", "set_action", 3304788590)

    public val getActionPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventAction", "get_action", 2002593661)

    public val setPressedPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventAction", "set_pressed", 2586408642)

    public val setStrengthPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventAction", "set_strength", 373806689)

    public val getStrengthPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventAction", "get_strength", 1740695150)

    public val setEventIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventAction", "set_event_index", 1286410249)

    public val getEventIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventAction", "get_event_index", 3905245786)
  }
}

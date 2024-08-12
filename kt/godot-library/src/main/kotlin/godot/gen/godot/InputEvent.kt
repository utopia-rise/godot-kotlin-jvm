// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

/**
 * Abstract base class of all types of input events. See [Node.Input].
 */
@GodotBaseType
public open class InputEvent internal constructor() : Resource() {
  /**
   * The event's device ID.
   * **Note:** [device] can be negative for special use cases that don't refer to devices physically
   * present on the system. See [DEVICE_ID_EMULATION].
   */
  public var device: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDevicePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setDevicePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENT, scriptIndex)
    return true
  }

  /**
   * Returns `true` if this input event matches a pre-defined action of any type.
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   */
  @JvmOverloads
  public fun isAction(action: StringName, exactMatch: Boolean = false): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.isActionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the given action is being pressed (and is not an echo event for
   * [InputEventKey] events, unless [allowEcho] is `true`). Not relevant for events of type
   * [InputEventMouseMotion] or [InputEventScreenDrag].
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   * **Note:** Due to keyboard ghosting, [isActionPressed] may return `false` even if one of the
   * action's keys is pressed. See
   * [url=$DOCS_URL/tutorials/inputs/input_examples.html#keyboard-events]Input examples[/url] in the
   * documentation for more information.
   */
  @JvmOverloads
  public fun isActionPressed(
    action: StringName,
    allowEcho: Boolean = false,
    exactMatch: Boolean = false,
  ): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to allowEcho, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.isActionPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the given action is released (i.e. not pressed). Not relevant for events of
   * type [InputEventMouseMotion] or [InputEventScreenDrag].
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   */
  @JvmOverloads
  public fun isActionReleased(action: StringName, exactMatch: Boolean = false): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.isActionReleasedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns a value between 0.0 and 1.0 depending on the given actions' state. Useful for getting
   * the value of events of type [InputEventJoypadMotion].
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   */
  @JvmOverloads
  public fun getActionStrength(action: StringName, exactMatch: Boolean = false): Float {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.getActionStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns `true` if this input event has been canceled.
   */
  public fun isCanceled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCanceledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if this input event is pressed. Not relevant for events of type
   * [InputEventMouseMotion] or [InputEventScreenDrag].
   * **Note:** Due to keyboard ghosting, [isPressed] may return `false` even if one of the action's
   * keys is pressed. See [url=$DOCS_URL/tutorials/inputs/input_examples.html#keyboard-events]Input
   * examples[/url] in the documentation for more information.
   */
  public fun isPressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if this input event is released. Not relevant for events of type
   * [InputEventMouseMotion] or [InputEventScreenDrag].
   */
  public fun isReleased(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isReleasedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if this input event is an echo event (only for events of type [InputEventKey]).
   * An echo event is a repeated key event sent when the user is holding down the key. Any other event
   * type returns `false`.
   * **Note:** The rate at which echo events are sent is typically around 20 events per second
   * (after holding down the key for roughly half a second). However, the key repeat delay/speed can be
   * changed by the user or disabled entirely in the operating system settings. To ensure your project
   * works correctly on all configurations, do not assume the user has a specific key repeat
   * configuration in your project's behavior.
   */
  public fun isEcho(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isEchoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns a [String] representation of the event.
   */
  public fun asText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.asTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns `true` if the specified [event] matches this event. Only valid for action events i.e
   * key ([InputEventKey]), button ([InputEventMouseButton] or [InputEventJoypadButton]), axis
   * [InputEventJoypadMotion] or action ([InputEventAction]) events.
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   */
  @JvmOverloads
  public fun isMatch(event: InputEvent, exactMatch: Boolean = true): Boolean {
    TransferContext.writeArguments(OBJECT to event, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.isMatchPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if this input event's type is one that can be assigned to an input action.
   */
  public fun isActionType(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isActionTypePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the given input event and this input event can be added together (only for
   * events of type [InputEventMouseMotion]).
   * The given input event's position, global position and speed will be copied. The resulting
   * `relative` is a sum of both events. Both events' modifiers have to be identical.
   */
  public fun accumulate(withEvent: InputEvent): Boolean {
    TransferContext.writeArguments(OBJECT to withEvent)
    TransferContext.callMethod(rawPtr, MethodBindings.accumulatePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns a copy of the given input event which has been offset by [localOfs] and transformed by
   * [xform]. Relevant for events of type [InputEventMouseButton], [InputEventMouseMotion],
   * [InputEventScreenTouch], [InputEventScreenDrag], [InputEventMagnifyGesture] and
   * [InputEventPanGesture].
   */
  @JvmOverloads
  public fun xformedBy(xform: Transform2D, localOfs: Vector2 = Vector2(0, 0)): InputEvent? {
    TransferContext.writeArguments(TRANSFORM2D to xform, VECTOR2 to localOfs)
    TransferContext.callMethod(rawPtr, MethodBindings.xformedByPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as InputEvent?)
  }

  public companion object {
    /**
     * Device ID used for emulated mouse input from a touchscreen, or for emulated touch input from
     * a mouse. This can be used to distinguish emulated mouse input from physical mouse input, or
     * emulated touch input from physical touch input.
     */
    public final const val DEVICE_ID_EMULATION: Long = -1
  }

  internal object MethodBindings {
    public val setDevicePtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "set_device")

    public val getDevicePtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "get_device")

    public val isActionPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "is_action")

    public val isActionPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "is_action_pressed")

    public val isActionReleasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "is_action_released")

    public val getActionStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "get_action_strength")

    public val isCanceledPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "is_canceled")

    public val isPressedPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "is_pressed")

    public val isReleasedPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "is_released")

    public val isEchoPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "is_echo")

    public val asTextPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "as_text")

    public val isMatchPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "is_match")

    public val isActionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "is_action_type")

    public val accumulatePtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "accumulate")

    public val xformedByPtr: VoidPtr = TypeManager.getMethodBindPtr("InputEvent", "xformed_by")
  }
}

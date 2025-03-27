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
import godot.core.Transform2D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.VariantParser.TRANSFORM2D
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.core.asCachedStringName
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * Abstract base class of all types of input events. See [Node.Input].
 */
@GodotBaseType
public open class InputEvent internal constructor() : Resource() {
  /**
   * The event's device ID.
   *
   * **Note:** [device] can be negative for special use cases that don't refer to devices physically
   * present on the system. See [DEVICE_ID_EMULATION].
   */
  public final inline var device: Int
    @JvmName("deviceProperty")
    get() = getDevice()
    @JvmName("deviceProperty")
    set(`value`) {
      setDevice(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(292, scriptIndex)
  }

  public final fun setDevice(device: Int): Unit {
    TransferContext.writeArguments(LONG to device.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setDevicePtr, NIL)
  }

  public final fun getDevice(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDevicePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if this input event matches a pre-defined action of any type.
   *
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   */
  @JvmOverloads
  public final fun isAction(action: StringName, exactMatch: Boolean = false): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(ptr, MethodBindings.isActionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the given action is being pressed (and is not an echo event for
   * [InputEventKey] events, unless [allowEcho] is `true`). Not relevant for events of type
   * [InputEventMouseMotion] or [InputEventScreenDrag].
   *
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   *
   * **Note:** Due to keyboard ghosting, [isActionPressed] may return `false` even if one of the
   * action's keys is pressed. See
   * [url=$DOCS_URL/tutorials/inputs/input_examples.html#keyboard-events]Input examples[/url] in the
   * documentation for more information.
   */
  @JvmOverloads
  public final fun isActionPressed(
    action: StringName,
    allowEcho: Boolean = false,
    exactMatch: Boolean = false,
  ): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to allowEcho, BOOL to exactMatch)
    TransferContext.callMethod(ptr, MethodBindings.isActionPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the given action is released (i.e. not pressed). Not relevant for events of
   * type [InputEventMouseMotion] or [InputEventScreenDrag].
   *
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   */
  @JvmOverloads
  public final fun isActionReleased(action: StringName, exactMatch: Boolean = false): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(ptr, MethodBindings.isActionReleasedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns a value between 0.0 and 1.0 depending on the given actions' state. Useful for getting
   * the value of events of type [InputEventJoypadMotion].
   *
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   */
  @JvmOverloads
  public final fun getActionStrength(action: StringName, exactMatch: Boolean = false): Float {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(ptr, MethodBindings.getActionStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns `true` if this input event has been canceled.
   */
  public final fun isCanceled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCanceledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if this input event is pressed. Not relevant for events of type
   * [InputEventMouseMotion] or [InputEventScreenDrag].
   *
   * **Note:** Due to keyboard ghosting, [isPressed] may return `false` even if one of the action's
   * keys is pressed. See [url=$DOCS_URL/tutorials/inputs/input_examples.html#keyboard-events]Input
   * examples[/url] in the documentation for more information.
   */
  public final fun isPressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPressedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if this input event is released. Not relevant for events of type
   * [InputEventMouseMotion] or [InputEventScreenDrag].
   */
  public final fun isReleased(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isReleasedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if this input event is an echo event (only for events of type [InputEventKey]).
   * An echo event is a repeated key event sent when the user is holding down the key. Any other event
   * type returns `false`.
   *
   * **Note:** The rate at which echo events are sent is typically around 20 events per second
   * (after holding down the key for roughly half a second). However, the key repeat delay/speed can be
   * changed by the user or disabled entirely in the operating system settings. To ensure your project
   * works correctly on all configurations, do not assume the user has a specific key repeat
   * configuration in your project's behavior.
   */
  public final fun isEcho(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEchoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns a [String] representation of the event.
   */
  public final fun asText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.asTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if the specified [event] matches this event. Only valid for action events i.e
   * key ([InputEventKey]), button ([InputEventMouseButton] or [InputEventJoypadButton]), axis
   * [InputEventJoypadMotion] or action ([InputEventAction]) events.
   *
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   *
   * **Note:** Only considers the event configuration (such as the keyboard key or joypad axis), not
   * state information like [isPressed], [isReleased], [isEcho], or [isCanceled].
   */
  @JvmOverloads
  public final fun isMatch(event: InputEvent?, exactMatch: Boolean = true): Boolean {
    TransferContext.writeArguments(OBJECT to event, BOOL to exactMatch)
    TransferContext.callMethod(ptr, MethodBindings.isMatchPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if this input event's type is one that can be assigned to an input action.
   */
  public final fun isActionType(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isActionTypePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the given input event and this input event can be added together (only for
   * events of type [InputEventMouseMotion]).
   *
   * The given input event's position, global position and speed will be copied. The resulting
   * `relative` is a sum of both events. Both events' modifiers have to be identical.
   */
  public final fun accumulate(withEvent: InputEvent?): Boolean {
    TransferContext.writeArguments(OBJECT to withEvent)
    TransferContext.callMethod(ptr, MethodBindings.accumulatePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns a copy of the given input event which has been offset by [localOfs] and transformed by
   * [xform]. Relevant for events of type [InputEventMouseButton], [InputEventMouseMotion],
   * [InputEventScreenTouch], [InputEventScreenDrag], [InputEventMagnifyGesture] and
   * [InputEventPanGesture].
   */
  @JvmOverloads
  public final fun xformedBy(xform: Transform2D, localOfs: Vector2 = Vector2(0, 0)): InputEvent? {
    TransferContext.writeArguments(TRANSFORM2D to xform, VECTOR2 to localOfs)
    TransferContext.callMethod(ptr, MethodBindings.xformedByPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as InputEvent?)
  }

  /**
   * Returns `true` if this input event matches a pre-defined action of any type.
   *
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   */
  @JvmOverloads
  public final fun isAction(action: String, exactMatch: Boolean = false): Boolean =
      isAction(action.asCachedStringName(), exactMatch)

  /**
   * Returns `true` if the given action is being pressed (and is not an echo event for
   * [InputEventKey] events, unless [allowEcho] is `true`). Not relevant for events of type
   * [InputEventMouseMotion] or [InputEventScreenDrag].
   *
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   *
   * **Note:** Due to keyboard ghosting, [isActionPressed] may return `false` even if one of the
   * action's keys is pressed. See
   * [url=$DOCS_URL/tutorials/inputs/input_examples.html#keyboard-events]Input examples[/url] in the
   * documentation for more information.
   */
  @JvmOverloads
  public final fun isActionPressed(
    action: String,
    allowEcho: Boolean = false,
    exactMatch: Boolean = false,
  ): Boolean = isActionPressed(action.asCachedStringName(), allowEcho, exactMatch)

  /**
   * Returns `true` if the given action is released (i.e. not pressed). Not relevant for events of
   * type [InputEventMouseMotion] or [InputEventScreenDrag].
   *
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   */
  @JvmOverloads
  public final fun isActionReleased(action: String, exactMatch: Boolean = false): Boolean =
      isActionReleased(action.asCachedStringName(), exactMatch)

  /**
   * Returns a value between 0.0 and 1.0 depending on the given actions' state. Useful for getting
   * the value of events of type [InputEventJoypadMotion].
   *
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   */
  @JvmOverloads
  public final fun getActionStrength(action: String, exactMatch: Boolean = false): Float =
      getActionStrength(action.asCachedStringName(), exactMatch)

  public companion object {
    /**
     * Device ID used for emulated mouse input from a touchscreen, or for emulated touch input from
     * a mouse. This can be used to distinguish emulated mouse input from physical mouse input, or
     * emulated touch input from physical touch input.
     */
    public final const val DEVICE_ID_EMULATION: Long = -1
  }

  public object MethodBindings {
    internal val setDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "set_device", 1286410249)

    internal val getDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "get_device", 3905245786)

    internal val isActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "is_action", 1558498928)

    internal val isActionPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "is_action_pressed", 1631499404)

    internal val isActionReleasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "is_action_released", 1558498928)

    internal val getActionStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "get_action_strength", 801543509)

    internal val isCanceledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "is_canceled", 36873697)

    internal val isPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "is_pressed", 36873697)

    internal val isReleasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "is_released", 36873697)

    internal val isEchoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "is_echo", 36873697)

    internal val asTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "as_text", 201670096)

    internal val isMatchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "is_match", 1754951977)

    internal val isActionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "is_action_type", 36873697)

    internal val accumulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "accumulate", 1062211774)

    internal val xformedByPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEvent", "xformed_by", 1282766827)
  }
}

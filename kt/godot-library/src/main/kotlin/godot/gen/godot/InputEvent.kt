// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TransferContext
import godot.core.Transform2D
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Generic input event.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/676](https://godotengine.org/asset-library/asset/676)
 *
 * Base class of all sort of input event. See [godot.Node.Input].
 */
@GodotBaseType
public open class InputEvent internal constructor() : Resource() {
  /**
   * The event's device ID.
   *
   * **Note:** This device ID will always be `-1` for emulated mouse input from a touchscreen. This can be used to distinguish emulated mouse input from physical mouse input.
   */
  public var device: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_GET_DEVICE, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_SET_DEVICE, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_INPUTEVENT)
  }

  /**
   * Returns `true` if this input event matches a pre-defined action of any type.
   *
   * If `exact_match` is `false`, it ignores additional input modifiers for [godot.InputEventKey] and [godot.InputEventMouseButton] events, and the direction for [godot.InputEventJoypadMotion] events.
   */
  public fun isAction(action: StringName, exactMatch: Boolean = false): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_IS_ACTION, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given action is being pressed (and is not an echo event for [godot.InputEventKey] events, unless `allow_echo` is `true`). Not relevant for events of type [godot.InputEventMouseMotion] or [godot.InputEventScreenDrag].
   *
   * If `exact_match` is `false`, it ignores additional input modifiers for [godot.InputEventKey] and [godot.InputEventMouseButton] events, and the direction for [godot.InputEventJoypadMotion] events.
   *
   * **Note:** Due to keyboard ghosting, [isActionPressed] may return `false` even if one of the action's keys is pressed. See [godot.Input examples]($DOCS_URL/tutorials/inputs/input_examples.html#keyboard-events) in the documentation for more information.
   */
  public fun isActionPressed(
    action: StringName,
    allowEcho: Boolean = false,
    exactMatch: Boolean = false
  ): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to allowEcho, BOOL to exactMatch)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_IS_ACTION_PRESSED,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given action is released (i.e. not pressed). Not relevant for events of type [godot.InputEventMouseMotion] or [godot.InputEventScreenDrag].
   *
   * If `exact_match` is `false`, it ignores additional input modifiers for [godot.InputEventKey] and [godot.InputEventMouseButton] events, and the direction for [godot.InputEventJoypadMotion] events.
   */
  public fun isActionReleased(action: StringName, exactMatch: Boolean = false): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_IS_ACTION_RELEASED,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a value between 0.0 and 1.0 depending on the given actions' state. Useful for getting the value of events of type [godot.InputEventJoypadMotion].
   *
   * If `exact_match` is `false`, it ignores additional input modifiers for [godot.InputEventKey] and [godot.InputEventMouseButton] events, and the direction for [godot.InputEventJoypadMotion] events.
   */
  public fun getActionStrength(action: StringName, exactMatch: Boolean = false): Double {
    TransferContext.writeArguments(STRING_NAME to action, BOOL to exactMatch)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_GET_ACTION_STRENGTH,
        DOUBLE.ordinal)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns `true` if this input event is pressed. Not relevant for events of type [godot.InputEventMouseMotion] or [godot.InputEventScreenDrag].
   *
   * **Note:** Due to keyboard ghosting, [isPressed] may return `false` even if one of the action's keys is pressed. See [godot.Input examples]($DOCS_URL/tutorials/inputs/input_examples.html#keyboard-events) in the documentation for more information.
   */
  public fun isPressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_IS_PRESSED, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if this input event is an echo event (only for events of type [godot.InputEventKey]).
   */
  public fun isEcho(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_IS_ECHO, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a [godot.String] representation of the event.
   */
  public fun asText(): String {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_AS_TEXT, STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the specified `event` matches this event. Only valid for action events i.e key ([godot.InputEventKey]), button ([godot.InputEventMouseButton] or [godot.InputEventJoypadButton]), axis [godot.InputEventJoypadMotion] or action ([godot.InputEventAction]) events.
   *
   * If `exact_match` is `false`, it ignores additional input modifiers for [godot.InputEventKey] and [godot.InputEventMouseButton] events, and the direction for [godot.InputEventJoypadMotion] events.
   */
  public fun isMatch(event: InputEvent, exactMatch: Boolean = true): Boolean {
    TransferContext.writeArguments(OBJECT to event, BOOL to exactMatch)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_IS_MATCH, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if this input event's type is one that can be assigned to an input action.
   */
  public fun isActionType(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_IS_ACTION_TYPE, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given input event and this input event can be added together (only for events of type [godot.InputEventMouseMotion]).
   *
   * The given input event's position, global position and speed will be copied. The resulting `relative` is a sum of both events. Both events' modifiers have to be identical.
   */
  public fun accumulate(withEvent: InputEvent): Boolean {
    TransferContext.writeArguments(OBJECT to withEvent)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_ACCUMULATE, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a copy of the given input event which has been offset by `local_ofs` and transformed by `xform`. Relevant for events of type [godot.InputEventMouseButton], [godot.InputEventMouseMotion], [godot.InputEventScreenTouch], [godot.InputEventScreenDrag], [godot.InputEventMagnifyGesture] and [godot.InputEventPanGesture].
   */
  public fun xformedBy(xform: Transform2D, localOfs: Vector2 = Vector2(0, 0)): InputEvent? {
    TransferContext.writeArguments(TRANSFORM2D to xform, VECTOR2 to localOfs)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_XFORMED_BY, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as InputEvent?
  }

  public companion object
}

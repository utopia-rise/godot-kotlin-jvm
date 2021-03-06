// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Generic input event.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/inputs/inputevent.html](https://docs.godotengine.org/en/latest/tutorials/inputs/inputevent.html)
 * [https://docs.godotengine.org/en/latest/tutorials/2d/2d_transforms.html](https://docs.godotengine.org/en/latest/tutorials/2d/2d_transforms.html)
 *
 * Base class of all sort of input event. See [godot.Node.Input].
 */
@GodotBaseType
open class InputEvent : Resource() {
  /**
   * The event's device ID.
   *
   * **Note:** This device ID will always be `-1` for emulated mouse input from a touchscreen. This can be used to distinguish emulated mouse input from physical mouse input.
   */
  open var device: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_GET_DEVICE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_SET_DEVICE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_INPUTEVENT)

  /**
   * Returns `true` if the given input event and this input event can be added together (only for events of type [godot.InputEventMouseMotion]).
   *
   * The given input event's position, global position and speed will be copied. The resulting `relative` is a sum of both events. Both events' modifiers have to be identical.
   */
  open fun accumulate(withEvent: InputEvent): Boolean {
    TransferContext.writeArguments(OBJECT to withEvent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_ACCUMULATE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a [godot.String] representation of the event.
   */
  open fun asText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_AS_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns a value between 0.0 and 1.0 depending on the given actions' state. Useful for getting the value of events of type [godot.InputEventJoypadMotion].
   */
  open fun getActionStrength(action: String): Double {
    TransferContext.writeArguments(STRING to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_GET_ACTION_STRENGTH,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns `true` if this input event matches a pre-defined action of any type.
   */
  open fun isAction(action: String): Boolean {
    TransferContext.writeArguments(STRING to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_IS_ACTION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given action is being pressed (and is not an echo event for [godot.InputEventKey] events, unless `allow_echo` is `true`). Not relevant for events of type [godot.InputEventMouseMotion] or [godot.InputEventScreenDrag].
   */
  open fun isActionPressed(action: String, allowEcho: Boolean = false): Boolean {
    TransferContext.writeArguments(STRING to action, BOOL to allowEcho)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_IS_ACTION_PRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given action is released (i.e. not pressed). Not relevant for events of type [godot.InputEventMouseMotion] or [godot.InputEventScreenDrag].
   */
  open fun isActionReleased(action: String): Boolean {
    TransferContext.writeArguments(STRING to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_IS_ACTION_RELEASED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if this input event's type is one that can be assigned to an input action.
   */
  open fun isActionType(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_IS_ACTION_TYPE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if this input event is an echo event (only for events of type [godot.InputEventKey]).
   */
  open fun isEcho(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_IS_ECHO, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if this input event is pressed. Not relevant for events of type [godot.InputEventMouseMotion] or [godot.InputEventScreenDrag].
   */
  open fun isPressed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_IS_PRESSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given input event is checking for the same key ([godot.InputEventKey]), button ([godot.InputEventJoypadButton]) or action ([godot.InputEventAction]).
   */
  open fun shortcutMatch(event: InputEvent): Boolean {
    TransferContext.writeArguments(OBJECT to event)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_SHORTCUT_MATCH, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a copy of the given input event which has been offset by `local_ofs` and transformed by `xform`. Relevant for events of type [godot.InputEventMouseButton], [godot.InputEventMouseMotion], [godot.InputEventScreenTouch], [godot.InputEventScreenDrag], [godot.InputEventMagnifyGesture] and [godot.InputEventPanGesture].
   */
  open fun xformedBy(xform: Transform2D, localOfs: Vector2 = Vector2(0.0, 0.0)): InputEvent? {
    TransferContext.writeArguments(TRANSFORM2D to xform, VECTOR2 to localOfs)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENT_XFORMED_BY, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as InputEvent?
  }
}

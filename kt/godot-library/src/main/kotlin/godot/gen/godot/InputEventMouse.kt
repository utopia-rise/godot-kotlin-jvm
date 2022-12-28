// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Base input event type for mouse events.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/inputs/inputevent.html]($DOCS_URL/tutorials/inputs/inputevent.html)
 *
 * Stores general mouse events information.
 */
@GodotBaseType
public open class InputEventMouse internal constructor() : InputEventWithModifiers() {
  /**
   * The mouse button mask identifier, one of or a bitwise combination of the [enum MouseButton] button masks.
   */
  public var buttonMask: MouseButton
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSE_GET_BUTTON_MASK,
          LONG)
      return MouseButton.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSE_SET_BUTTON_MASK,
          NIL)
    }

  /**
   * When received in [godot.Node.Input] or [godot.Node.UnhandledInput], returns the mouse's position in the [godot.Viewport] this [godot.Node] is in using the coordinate system of this [godot.Viewport].
   *
   * When received in [godot.Control.GuiInput], returns the mouse's position in the [godot.Control] using the local coordinate system of the [godot.Control].
   */
  public var position: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSE_GET_POSITION,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSE_SET_POSITION, NIL)
    }

  /**
   * When received in [godot.Node.Input] or [godot.Node.UnhandledInput], returns the mouse's position in the root [godot.Viewport] using the coordinate system of the root [godot.Viewport].
   *
   * When received in [godot.Control.GuiInput], returns the mouse's position in the [godot.CanvasLayer] that the [godot.Control] is in using the coordinate system of the [godot.CanvasLayer].
   */
  public var globalPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSE_GET_GLOBAL_POSITION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSE_SET_GLOBAL_POSITION, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENTMOUSE, scriptIndex)
    return true
  }

  public companion object
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for keys events with modifiers.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.3/tutorials/inputs/inputevent.html](https://docs.godotengine.org/en/3.3/tutorials/inputs/inputevent.html)
 *
 * Contains keys events information with modifiers support like `Shift` or `Alt`. See [godot.Node.Input].
 */
@GodotBaseType
public open class InputEventWithModifiers : InputEvent() {
  /**
   * State of the `Alt` modifier.
   */
  public open var alt: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_GET_ALT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_SET_ALT,
          NIL)
    }

  /**
   * State of the `Command` modifier.
   */
  public open var command: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_GET_COMMAND, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_SET_COMMAND, NIL)
    }

  /**
   * State of the `Ctrl` modifier.
   */
  public open var control: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_GET_CONTROL, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_SET_CONTROL, NIL)
    }

  /**
   * State of the `Meta` modifier.
   */
  public open var meta: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_GET_META,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_SET_META,
          NIL)
    }

  /**
   * State of the `Shift` modifier.
   */
  public open var shift: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_GET_SHIFT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_SET_SHIFT,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_INPUTEVENTWITHMODIFIERS)
  }
}

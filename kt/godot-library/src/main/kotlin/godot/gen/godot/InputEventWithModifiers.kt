// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
 * [$DOCS_URL/tutorials/inputs/inputevent.html]($DOCS_URL/tutorials/inputs/inputevent.html)
 *
 * Contains keys events information with modifiers support like [kbd]Shift[/kbd] or [kbd]Alt[/kbd]. See [godot.Node.Input].
 */
@GodotBaseType
public open class InputEventWithModifiers internal constructor() : InputEventFromWindow() {
  /**
   * If `true`, pressing [kbd]Cmd[/kbd] on macOS or [kbd]Ctrl[/kbd] on all other platforms will both be serialized as [commandPressed]. If `false`, those same keys will be serialized as [metaPressed] on macOS and [ctrlPressed] on all other platforms.
   *
   * This aids with cross-platform compatibility when developing e.g. on Windows for macOS, or vice-versa.
   */
  public var storeCommand: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_IS_STORING_COMMAND, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_SET_STORE_COMMAND, NIL.ordinal)
    }

  /**
   * State of the [kbd]Alt[/kbd] modifier.
   */
  public var altPressed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_IS_ALT_PRESSED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_SET_ALT_PRESSED, NIL.ordinal)
    }

  /**
   * State of the [kbd]Shift[/kbd] modifier.
   */
  public var shiftPressed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_IS_SHIFT_PRESSED, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_SET_SHIFT_PRESSED, NIL.ordinal)
    }

  /**
   * State of the [kbd]Ctrl[/kbd] modifier.
   */
  public var ctrlPressed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_IS_CTRL_PRESSED, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_SET_CTRL_PRESSED, NIL.ordinal)
    }

  /**
   * State of the [kbd]Meta[/kbd] modifier.
   */
  public var metaPressed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_IS_META_PRESSED, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_SET_META_PRESSED, NIL.ordinal)
    }

  /**
   * State of the [kbd]Cmd[/kbd] modifier.
   */
  public var commandPressed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_IS_COMMAND_PRESSED, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTWITHMODIFIERS_SET_COMMAND_PRESSED, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_INPUTEVENTWITHMODIFIERS)
  }

  public companion object
}

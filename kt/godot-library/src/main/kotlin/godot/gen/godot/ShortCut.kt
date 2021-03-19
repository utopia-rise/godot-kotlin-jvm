// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress

/**
 * A shortcut for binding input.
 *
 * A shortcut for binding input.
 *
 * Shortcuts are commonly used for interacting with a [godot.Control] element from a [godot.InputEvent].
 */
@GodotBaseType
open class ShortCut : Resource() {
  /**
   * The shortcut's [godot.InputEvent].
   *
   * Generally the [godot.InputEvent] is a keyboard key, though it can be any [godot.InputEvent].
   */
  open var shortcut: InputEvent?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHORTCUT_GET_SHORTCUT, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as InputEvent?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHORTCUT_SET_SHORTCUT, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_SHORTCUT)
  }

  /**
   * Returns the shortcut's [godot.InputEvent] as a [godot.String].
   */
  open fun getAsText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHORTCUT_GET_AS_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the shortcut's [godot.InputEvent] equals `event`.
   */
  open fun isShortcut(event: InputEvent): Boolean {
    TransferContext.writeArguments(OBJECT to event)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHORTCUT_IS_SHORTCUT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If `true`, this shortcut is valid.
   */
  open fun isValid(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHORTCUT_IS_VALID, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}

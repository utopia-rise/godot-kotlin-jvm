// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A shortcut for binding input.
 *
 * Shortcuts are commonly used for interacting with a [godot.Control] element from an [godot.InputEvent] (also known as hotkeys).
 *
 * One shortcut can contain multiple [godot.InputEvent]'s, allowing the possibility of triggering one action with multiple different inputs.
 */
@GodotBaseType
public open class Shortcut : Resource() {
  /**
   * The shortcut's [godot.InputEvent] array.
   *
   * Generally the [godot.InputEvent] used is an [godot.InputEventKey], though it can be any [godot.InputEvent], including an [godot.InputEventAction].
   */
  public open var events: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHORTCUT_GET_EVENTS, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHORTCUT_SET_EVENTS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SHORTCUT)
  }

  /**
   * Returns whether [events] contains an [godot.InputEvent] which is valid.
   */
  public open fun hasValidEvent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHORTCUT_HAS_VALID_EVENT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether any [godot.InputEvent] in [events] equals `event`.
   */
  public open fun matchesEvent(event: InputEvent): Boolean {
    TransferContext.writeArguments(OBJECT to event)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHORTCUT_MATCHES_EVENT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the shortcut's first valid [godot.InputEvent] as a [godot.String].
   */
  public open fun getAsText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHORTCUT_GET_AS_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public companion object
}

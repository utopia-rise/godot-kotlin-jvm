// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

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
  public var events: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEventsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEventsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SHORTCUT, scriptIndex)
    return true
  }

  /**
   * Returns whether [events] contains an [godot.InputEvent] which is valid.
   */
  public fun hasValidEvent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasValidEventPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns whether any [godot.InputEvent] in [events] equals [event].
   */
  public fun matchesEvent(event: InputEvent): Boolean {
    TransferContext.writeArguments(OBJECT to event)
    TransferContext.callMethod(rawPtr, MethodBindings.matchesEventPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the shortcut's first valid [godot.InputEvent] as a [godot.String].
   */
  public fun getAsText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAsTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public companion object

  internal object MethodBindings {
    public val setEventsPtr: VoidPtr = TypeManager.getMethodBindPtr("Shortcut", "set_events")

    public val getEventsPtr: VoidPtr = TypeManager.getMethodBindPtr("Shortcut", "get_events")

    public val hasValidEventPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shortcut", "has_valid_event")

    public val matchesEventPtr: VoidPtr = TypeManager.getMethodBindPtr("Shortcut", "matches_event")

    public val getAsTextPtr: VoidPtr = TypeManager.getMethodBindPtr("Shortcut", "get_as_text")
  }
}

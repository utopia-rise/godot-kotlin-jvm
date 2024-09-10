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
import kotlin.Unit

/**
 * Shortcuts are commonly used for interacting with a [Control] element from an [InputEvent] (also
 * known as hotkeys).
 * One shortcut can contain multiple [InputEvent]'s, allowing the possibility of triggering one
 * action with multiple different inputs.
 */
@GodotBaseType
public open class Shortcut : Resource() {
  /**
   * The shortcut's [InputEvent] array.
   * Generally the [InputEvent] used is an [InputEventKey], though it can be any [InputEvent],
   * including an [InputEventAction].
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

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SHORTCUT, scriptIndex)
  }

  /**
   * Returns whether [events] contains an [InputEvent] which is valid.
   */
  public fun hasValidEvent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasValidEventPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns whether any [InputEvent] in [events] equals [event].
   */
  public fun matchesEvent(event: InputEvent): Boolean {
    TransferContext.writeArguments(OBJECT to event)
    TransferContext.callMethod(rawPtr, MethodBindings.matchesEventPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the shortcut's first valid [InputEvent] as a [String].
   */
  public fun getAsText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAsTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public companion object

  internal object MethodBindings {
    public val setEventsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shortcut", "set_events", 381264803)

    public val getEventsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shortcut", "get_events", 3995934104)

    public val hasValidEventPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shortcut", "has_valid_event", 36873697)

    public val matchesEventPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shortcut", "matches_event", 3738334489)

    public val getAsTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shortcut", "get_as_text", 201670096)
  }
}

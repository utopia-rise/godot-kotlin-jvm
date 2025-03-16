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
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Shortcuts are commonly used for interacting with a [Control] element from an [InputEvent] (also
 * known as hotkeys).
 *
 * One shortcut can contain multiple [InputEvent]s, allowing the possibility of triggering one
 * action with multiple different inputs.
 */
@GodotBaseType
public open class Shortcut : Resource() {
  /**
   * The shortcut's [InputEvent] array.
   *
   * Generally the [InputEvent] used is an [InputEventKey], though it can be any [InputEvent],
   * including an [InputEventAction].
   */
  public final inline var events: VariantArray<Any?>
    @JvmName("eventsProperty")
    get() = getEvents()
    @JvmName("eventsProperty")
    set(`value`) {
      setEvents(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(598, scriptIndex)
  }

  public final fun setEvents(events: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to events)
    TransferContext.callMethod(ptr, MethodBindings.setEventsPtr, NIL)
  }

  public final fun getEvents(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEventsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns whether [events] contains an [InputEvent] which is valid.
   */
  public final fun hasValidEvent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasValidEventPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns whether any [InputEvent] in [events] equals [event]. This uses [InputEvent.isMatch] to
   * compare events.
   */
  public final fun matchesEvent(event: InputEvent?): Boolean {
    TransferContext.writeArguments(OBJECT to event)
    TransferContext.callMethod(ptr, MethodBindings.matchesEventPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the shortcut's first valid [InputEvent] as a [String].
   */
  public final fun getAsText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAsTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public companion object

  public object MethodBindings {
    internal val setEventsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shortcut", "set_events", 381264803)

    internal val getEventsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shortcut", "get_events", 3995934104)

    internal val hasValidEventPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shortcut", "has_valid_event", 36873697)

    internal val matchesEventPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shortcut", "matches_event", 3738334489)

    internal val getAsTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shortcut", "get_as_text", 201670096)
  }
}

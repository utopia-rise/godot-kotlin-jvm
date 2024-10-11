// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_SHORTCUT_INDEX: Int = 582

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
  public final inline var events: VariantArray<Any?>
    @JvmName("eventsProperty")
    get() = getEvents()
    @JvmName("eventsProperty")
    set(`value`) {
      setEvents(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_SHORTCUT_INDEX, scriptIndex)
  }

  public final fun setEvents(events: VariantArray<Any?>): Unit {
    Internals.writeArguments(ARRAY to events)
    Internals.callMethod(rawPtr, MethodBindings.setEventsPtr, NIL)
  }

  public final fun getEvents(): VariantArray<Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEventsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns whether [events] contains an [InputEvent] which is valid.
   */
  public final fun hasValidEvent(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.hasValidEventPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns whether any [InputEvent] in [events] equals [event].
   */
  public final fun matchesEvent(event: InputEvent?): Boolean {
    Internals.writeArguments(OBJECT to event)
    Internals.callMethod(rawPtr, MethodBindings.matchesEventPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the shortcut's first valid [InputEvent] as a [String].
   */
  public final fun getAsText(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAsTextPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public companion object

  public object MethodBindings {
    internal val setEventsPtr: VoidPtr =
        Internals.getMethodBindPtr("Shortcut", "set_events", 381264803)

    internal val getEventsPtr: VoidPtr =
        Internals.getMethodBindPtr("Shortcut", "get_events", 3995934104)

    internal val hasValidEventPtr: VoidPtr =
        Internals.getMethodBindPtr("Shortcut", "has_valid_event", 36873697)

    internal val matchesEventPtr: VoidPtr =
        Internals.getMethodBindPtr("Shortcut", "matches_event", 3738334489)

    internal val getAsTextPtr: VoidPtr =
        Internals.getMethodBindPtr("Shortcut", "get_as_text", 201670096)
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING_NAME
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

private const val ENGINE_CLASS_INPUTMAP_INDEX: Int = 19

/**
 * Manages all [InputEventAction] which can be created/modified from the project settings menu
 * **Project > Project Settings > Input Map** or in code with [addAction] and [actionAddEvent]. See
 * [Node.Input].
 */
@GodotBaseType
public object InputMap : Object() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.getSingleton(this, ENGINE_CLASS_INPUTMAP_INDEX)
  }

  /**
   * Returns `true` if the [InputMap] has a registered action with the given name.
   */
  @JvmStatic
  public final fun hasAction(action: StringName): Boolean {
    Internals.writeArguments(STRING_NAME to action)
    Internals.callMethod(rawPtr, MethodBindings.hasActionPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns an array of all actions in the [InputMap].
   */
  @JvmStatic
  public final fun getActions(): VariantArray<StringName> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getActionsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<StringName>)
  }

  /**
   * Adds an empty action to the [InputMap] with a configurable [deadzone].
   * An [InputEvent] can then be added to this action with [actionAddEvent].
   */
  @JvmOverloads
  @JvmStatic
  public final fun addAction(action: StringName, deadzone: Float = 0.5f): Unit {
    Internals.writeArguments(STRING_NAME to action, DOUBLE to deadzone.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.addActionPtr, NIL)
  }

  /**
   * Removes an action from the [InputMap].
   */
  @JvmStatic
  public final fun eraseAction(action: StringName): Unit {
    Internals.writeArguments(STRING_NAME to action)
    Internals.callMethod(rawPtr, MethodBindings.eraseActionPtr, NIL)
  }

  /**
   * Sets a deadzone value for the action.
   */
  @JvmStatic
  public final fun actionSetDeadzone(action: StringName, deadzone: Float): Unit {
    Internals.writeArguments(STRING_NAME to action, DOUBLE to deadzone.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.actionSetDeadzonePtr, NIL)
  }

  /**
   * Returns a deadzone value for the action.
   */
  @JvmStatic
  public final fun actionGetDeadzone(action: StringName): Float {
    Internals.writeArguments(STRING_NAME to action)
    Internals.callMethod(rawPtr, MethodBindings.actionGetDeadzonePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Adds an [InputEvent] to an action. This [InputEvent] will trigger the action.
   */
  @JvmStatic
  public final fun actionAddEvent(action: StringName, event: InputEvent?): Unit {
    Internals.writeArguments(STRING_NAME to action, OBJECT to event)
    Internals.callMethod(rawPtr, MethodBindings.actionAddEventPtr, NIL)
  }

  /**
   * Returns `true` if the action has the given [InputEvent] associated with it.
   */
  @JvmStatic
  public final fun actionHasEvent(action: StringName, event: InputEvent?): Boolean {
    Internals.writeArguments(STRING_NAME to action, OBJECT to event)
    Internals.callMethod(rawPtr, MethodBindings.actionHasEventPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Removes an [InputEvent] from an action.
   */
  @JvmStatic
  public final fun actionEraseEvent(action: StringName, event: InputEvent?): Unit {
    Internals.writeArguments(STRING_NAME to action, OBJECT to event)
    Internals.callMethod(rawPtr, MethodBindings.actionEraseEventPtr, NIL)
  }

  /**
   * Removes all events from an action.
   */
  @JvmStatic
  public final fun actionEraseEvents(action: StringName): Unit {
    Internals.writeArguments(STRING_NAME to action)
    Internals.callMethod(rawPtr, MethodBindings.actionEraseEventsPtr, NIL)
  }

  /**
   * Returns an array of [InputEvent]s associated with a given action.
   * **Note:** When used in the editor (e.g. a tool script or [EditorPlugin]), this method will
   * return events for the editor action. If you want to access your project's input binds from the
   * editor, read the `input&#47;*` settings from [ProjectSettings].
   */
  @JvmStatic
  public final fun actionGetEvents(action: StringName): VariantArray<InputEvent> {
    Internals.writeArguments(STRING_NAME to action)
    Internals.callMethod(rawPtr, MethodBindings.actionGetEventsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<InputEvent>)
  }

  /**
   * Returns `true` if the given event is part of an existing action. This method ignores keyboard
   * modifiers if the given [InputEvent] is not pressed (for proper release detection). See
   * [actionHasEvent] if you don't want this behavior.
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   */
  @JvmOverloads
  @JvmStatic
  public final fun eventIsAction(
    event: InputEvent?,
    action: StringName,
    exactMatch: Boolean = false,
  ): Boolean {
    Internals.writeArguments(OBJECT to event, STRING_NAME to action, BOOL to exactMatch)
    Internals.callMethod(rawPtr, MethodBindings.eventIsActionPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Clears all [InputEventAction] in the [InputMap] and load it anew from [ProjectSettings].
   */
  @JvmStatic
  public final fun loadFromProjectSettings(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.loadFromProjectSettingsPtr, NIL)
  }

  internal object MethodBindings {
    public val hasActionPtr: VoidPtr =
        Internals.getMethodBindPtr("InputMap", "has_action", 2619796661)

    public val getActionsPtr: VoidPtr =
        Internals.getMethodBindPtr("InputMap", "get_actions", 2915620761)

    public val addActionPtr: VoidPtr =
        Internals.getMethodBindPtr("InputMap", "add_action", 4100757082)

    public val eraseActionPtr: VoidPtr =
        Internals.getMethodBindPtr("InputMap", "erase_action", 3304788590)

    public val actionSetDeadzonePtr: VoidPtr =
        Internals.getMethodBindPtr("InputMap", "action_set_deadzone", 4135858297)

    public val actionGetDeadzonePtr: VoidPtr =
        Internals.getMethodBindPtr("InputMap", "action_get_deadzone", 1391627649)

    public val actionAddEventPtr: VoidPtr =
        Internals.getMethodBindPtr("InputMap", "action_add_event", 518302593)

    public val actionHasEventPtr: VoidPtr =
        Internals.getMethodBindPtr("InputMap", "action_has_event", 1185871985)

    public val actionEraseEventPtr: VoidPtr =
        Internals.getMethodBindPtr("InputMap", "action_erase_event", 518302593)

    public val actionEraseEventsPtr: VoidPtr =
        Internals.getMethodBindPtr("InputMap", "action_erase_events", 3304788590)

    public val actionGetEventsPtr: VoidPtr =
        Internals.getMethodBindPtr("InputMap", "action_get_events", 689397652)

    public val eventIsActionPtr: VoidPtr =
        Internals.getMethodBindPtr("InputMap", "event_is_action", 3193353650)

    public val loadFromProjectSettingsPtr: VoidPtr =
        Internals.getMethodBindPtr("InputMap", "load_from_project_settings", 3218959716)
  }
}

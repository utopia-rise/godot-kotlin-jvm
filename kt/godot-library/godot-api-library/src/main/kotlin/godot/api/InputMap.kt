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
import godot.core.MethodStringName0
import godot.core.MethodStringName1
import godot.core.MethodStringName2
import godot.core.MethodStringName3
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedStringName
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Manages all [InputEventAction] which can be created/modified from the project settings menu
 * **Project > Project Settings > Input Map** or in code with [addAction] and [actionAddEvent]. See
 * [Node.Input].
 */
@GodotBaseType
public object InputMap : Object() {
  @JvmStatic
  public val hasActionName: MethodStringName1<InputMap, Boolean, StringName> =
      MethodStringName1<InputMap, Boolean, StringName>("has_action")

  @JvmStatic
  public val getActionsName: MethodStringName0<InputMap, VariantArray<StringName>> =
      MethodStringName0<InputMap, VariantArray<StringName>>("get_actions")

  @JvmStatic
  public val addActionName: MethodStringName2<InputMap, Unit, StringName, Float> =
      MethodStringName2<InputMap, Unit, StringName, Float>("add_action")

  @JvmStatic
  public val eraseActionName: MethodStringName1<InputMap, Unit, StringName> =
      MethodStringName1<InputMap, Unit, StringName>("erase_action")

  @JvmStatic
  public val actionSetDeadzoneName: MethodStringName2<InputMap, Unit, StringName, Float> =
      MethodStringName2<InputMap, Unit, StringName, Float>("action_set_deadzone")

  @JvmStatic
  public val actionGetDeadzoneName: MethodStringName1<InputMap, Float, StringName> =
      MethodStringName1<InputMap, Float, StringName>("action_get_deadzone")

  @JvmStatic
  public val actionAddEventName: MethodStringName2<InputMap, Unit, StringName, InputEvent?> =
      MethodStringName2<InputMap, Unit, StringName, InputEvent?>("action_add_event")

  @JvmStatic
  public val actionHasEventName: MethodStringName2<InputMap, Boolean, StringName, InputEvent?> =
      MethodStringName2<InputMap, Boolean, StringName, InputEvent?>("action_has_event")

  @JvmStatic
  public val actionEraseEventName: MethodStringName2<InputMap, Unit, StringName, InputEvent?> =
      MethodStringName2<InputMap, Unit, StringName, InputEvent?>("action_erase_event")

  @JvmStatic
  public val actionEraseEventsName: MethodStringName1<InputMap, Unit, StringName> =
      MethodStringName1<InputMap, Unit, StringName>("action_erase_events")

  @JvmStatic
  public val actionGetEventsName: MethodStringName1<InputMap, VariantArray<InputEvent>, StringName>
      = MethodStringName1<InputMap, VariantArray<InputEvent>, StringName>("action_get_events")

  @JvmStatic
  public val eventIsActionName:
      MethodStringName3<InputMap, Boolean, InputEvent?, StringName, Boolean> =
      MethodStringName3<InputMap, Boolean, InputEvent?, StringName, Boolean>("event_is_action")

  @JvmStatic
  public val loadFromProjectSettingsName: MethodStringName0<InputMap, Unit> =
      MethodStringName0<InputMap, Unit>("load_from_project_settings")

  public override fun new(scriptIndex: Int): Unit {
    getSingleton(11)
  }

  /**
   * Returns `true` if the [InputMap] has a registered action with the given name.
   */
  @JvmStatic
  public final fun hasAction(action: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(ptr, MethodBindings.hasActionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns an array of all actions in the [InputMap].
   */
  @JvmStatic
  public final fun getActions(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getActionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<StringName>)
  }

  /**
   * Adds an empty action to the [InputMap] with a configurable [deadzone].
   *
   * An [InputEvent] can then be added to this action with [actionAddEvent].
   */
  @JvmOverloads
  @JvmStatic
  public final fun addAction(action: StringName, deadzone: Float = 0.2f): Unit {
    TransferContext.writeArguments(STRING_NAME to action, DOUBLE to deadzone.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.addActionPtr, NIL)
  }

  /**
   * Removes an action from the [InputMap].
   */
  @JvmStatic
  public final fun eraseAction(action: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(ptr, MethodBindings.eraseActionPtr, NIL)
  }

  /**
   * Sets a deadzone value for the action.
   */
  @JvmStatic
  public final fun actionSetDeadzone(action: StringName, deadzone: Float): Unit {
    TransferContext.writeArguments(STRING_NAME to action, DOUBLE to deadzone.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.actionSetDeadzonePtr, NIL)
  }

  /**
   * Returns a deadzone value for the action.
   */
  @JvmStatic
  public final fun actionGetDeadzone(action: StringName): Float {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(ptr, MethodBindings.actionGetDeadzonePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Adds an [InputEvent] to an action. This [InputEvent] will trigger the action.
   */
  @JvmStatic
  public final fun actionAddEvent(action: StringName, event: InputEvent?): Unit {
    TransferContext.writeArguments(STRING_NAME to action, OBJECT to event)
    TransferContext.callMethod(ptr, MethodBindings.actionAddEventPtr, NIL)
  }

  /**
   * Returns `true` if the action has the given [InputEvent] associated with it.
   */
  @JvmStatic
  public final fun actionHasEvent(action: StringName, event: InputEvent?): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, OBJECT to event)
    TransferContext.callMethod(ptr, MethodBindings.actionHasEventPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Removes an [InputEvent] from an action.
   */
  @JvmStatic
  public final fun actionEraseEvent(action: StringName, event: InputEvent?): Unit {
    TransferContext.writeArguments(STRING_NAME to action, OBJECT to event)
    TransferContext.callMethod(ptr, MethodBindings.actionEraseEventPtr, NIL)
  }

  /**
   * Removes all events from an action.
   */
  @JvmStatic
  public final fun actionEraseEvents(action: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(ptr, MethodBindings.actionEraseEventsPtr, NIL)
  }

  /**
   * Returns an array of [InputEvent]s associated with a given action.
   *
   * **Note:** When used in the editor (e.g. a tool script or [EditorPlugin]), this method will
   * return events for the editor action. If you want to access your project's input binds from the
   * editor, read the `input&#47;*` settings from [ProjectSettings].
   */
  @JvmStatic
  public final fun actionGetEvents(action: StringName): VariantArray<InputEvent> {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(ptr, MethodBindings.actionGetEventsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<InputEvent>)
  }

  /**
   * Returns `true` if the given event is part of an existing action. This method ignores keyboard
   * modifiers if the given [InputEvent] is not pressed (for proper release detection). See
   * [actionHasEvent] if you don't want this behavior.
   *
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
    TransferContext.writeArguments(OBJECT to event, STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(ptr, MethodBindings.eventIsActionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Clears all [InputEventAction] in the [InputMap] and load it anew from [ProjectSettings].
   */
  @JvmStatic
  public final fun loadFromProjectSettings(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.loadFromProjectSettingsPtr, NIL)
  }

  /**
   * Returns `true` if the [InputMap] has a registered action with the given name.
   */
  @JvmStatic
  public final fun hasAction(action: String): Boolean = hasAction(action.asCachedStringName())

  /**
   * Adds an empty action to the [InputMap] with a configurable [deadzone].
   *
   * An [InputEvent] can then be added to this action with [actionAddEvent].
   */
  @JvmOverloads
  @JvmStatic
  public final fun addAction(action: String, deadzone: Float = 0.2f) =
      addAction(action.asCachedStringName(), deadzone)

  /**
   * Removes an action from the [InputMap].
   */
  @JvmStatic
  public final fun eraseAction(action: String) = eraseAction(action.asCachedStringName())

  /**
   * Sets a deadzone value for the action.
   */
  @JvmStatic
  public final fun actionSetDeadzone(action: String, deadzone: Float) =
      actionSetDeadzone(action.asCachedStringName(), deadzone)

  /**
   * Returns a deadzone value for the action.
   */
  @JvmStatic
  public final fun actionGetDeadzone(action: String): Float =
      actionGetDeadzone(action.asCachedStringName())

  /**
   * Adds an [InputEvent] to an action. This [InputEvent] will trigger the action.
   */
  @JvmStatic
  public final fun actionAddEvent(action: String, event: InputEvent?) =
      actionAddEvent(action.asCachedStringName(), event)

  /**
   * Returns `true` if the action has the given [InputEvent] associated with it.
   */
  @JvmStatic
  public final fun actionHasEvent(action: String, event: InputEvent?): Boolean =
      actionHasEvent(action.asCachedStringName(), event)

  /**
   * Removes an [InputEvent] from an action.
   */
  @JvmStatic
  public final fun actionEraseEvent(action: String, event: InputEvent?) =
      actionEraseEvent(action.asCachedStringName(), event)

  /**
   * Removes all events from an action.
   */
  @JvmStatic
  public final fun actionEraseEvents(action: String) =
      actionEraseEvents(action.asCachedStringName())

  /**
   * Returns an array of [InputEvent]s associated with a given action.
   *
   * **Note:** When used in the editor (e.g. a tool script or [EditorPlugin]), this method will
   * return events for the editor action. If you want to access your project's input binds from the
   * editor, read the `input&#47;*` settings from [ProjectSettings].
   */
  @JvmStatic
  public final fun actionGetEvents(action: String): VariantArray<InputEvent> =
      actionGetEvents(action.asCachedStringName())

  /**
   * Returns `true` if the given event is part of an existing action. This method ignores keyboard
   * modifiers if the given [InputEvent] is not pressed (for proper release detection). See
   * [actionHasEvent] if you don't want this behavior.
   *
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   */
  @JvmOverloads
  @JvmStatic
  public final fun eventIsAction(
    event: InputEvent?,
    action: String,
    exactMatch: Boolean = false,
  ): Boolean = eventIsAction(event, action.asCachedStringName(), exactMatch)

  public object MethodBindings {
    internal val hasActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "has_action", 2619796661)

    internal val getActionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "get_actions", 2915620761)

    internal val addActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "add_action", 1195233573)

    internal val eraseActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "erase_action", 3304788590)

    internal val actionSetDeadzonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_set_deadzone", 4135858297)

    internal val actionGetDeadzonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_get_deadzone", 1391627649)

    internal val actionAddEventPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_add_event", 518302593)

    internal val actionHasEventPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_has_event", 1185871985)

    internal val actionEraseEventPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_erase_event", 518302593)

    internal val actionEraseEventsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_erase_events", 3304788590)

    internal val actionGetEventsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_get_events", 689397652)

    internal val eventIsActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "event_is_action", 3193353650)

    internal val loadFromProjectSettingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "load_from_project_settings", 3218959716)
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Manages all [InputEventAction] which can be created/modified from the project settings menu
 * **Project > Project Settings > Input Map** or in code with [addAction] and [actionAddEvent]. See
 * [Node.Input].
 */
@GodotBaseType
public object InputMap : Object() {
  public override fun new(scriptIndex: Int): Unit {
    getSingleton(ENGINECLASS_INPUTMAP)
  }

  /**
   * Returns `true` if the [InputMap] has a registered action with the given name.
   */
  public fun hasAction(action: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(rawPtr, MethodBindings.hasActionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns an array of all actions in the [InputMap].
   */
  public fun getActions(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getActionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<StringName>)
  }

  /**
   * Adds an empty action to the [InputMap] with a configurable [deadzone].
   * An [InputEvent] can then be added to this action with [actionAddEvent].
   */
  @JvmOverloads
  public fun addAction(action: StringName, deadzone: Float = 0.5f): Unit {
    TransferContext.writeArguments(STRING_NAME to action, DOUBLE to deadzone.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.addActionPtr, NIL)
  }

  /**
   * Removes an action from the [InputMap].
   */
  public fun eraseAction(action: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(rawPtr, MethodBindings.eraseActionPtr, NIL)
  }

  /**
   * Sets a deadzone value for the action.
   */
  public fun actionSetDeadzone(action: StringName, deadzone: Float): Unit {
    TransferContext.writeArguments(STRING_NAME to action, DOUBLE to deadzone.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.actionSetDeadzonePtr, NIL)
  }

  /**
   * Returns a deadzone value for the action.
   */
  public fun actionGetDeadzone(action: StringName): Float {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(rawPtr, MethodBindings.actionGetDeadzonePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Adds an [InputEvent] to an action. This [InputEvent] will trigger the action.
   */
  public fun actionAddEvent(action: StringName, event: InputEvent): Unit {
    TransferContext.writeArguments(STRING_NAME to action, OBJECT to event)
    TransferContext.callMethod(rawPtr, MethodBindings.actionAddEventPtr, NIL)
  }

  /**
   * Returns `true` if the action has the given [InputEvent] associated with it.
   */
  public fun actionHasEvent(action: StringName, event: InputEvent): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, OBJECT to event)
    TransferContext.callMethod(rawPtr, MethodBindings.actionHasEventPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Removes an [InputEvent] from an action.
   */
  public fun actionEraseEvent(action: StringName, event: InputEvent): Unit {
    TransferContext.writeArguments(STRING_NAME to action, OBJECT to event)
    TransferContext.callMethod(rawPtr, MethodBindings.actionEraseEventPtr, NIL)
  }

  /**
   * Removes all events from an action.
   */
  public fun actionEraseEvents(action: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(rawPtr, MethodBindings.actionEraseEventsPtr, NIL)
  }

  /**
   * Returns an array of [InputEvent]s associated with a given action.
   * **Note:** When used in the editor (e.g. a tool script or [EditorPlugin]), this method will
   * return events for the editor action. If you want to access your project's input binds from the
   * editor, read the `input&#47;*` settings from [ProjectSettings].
   */
  public fun actionGetEvents(action: StringName): VariantArray<InputEvent> {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(rawPtr, MethodBindings.actionGetEventsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<InputEvent>)
  }

  /**
   * Returns `true` if the given event is part of an existing action. This method ignores keyboard
   * modifiers if the given [InputEvent] is not pressed (for proper release detection). See
   * [actionHasEvent] if you don't want this behavior.
   * If [exactMatch] is `false`, it ignores additional input modifiers for [InputEventKey] and
   * [InputEventMouseButton] events, and the direction for [InputEventJoypadMotion] events.
   */
  @JvmOverloads
  public fun eventIsAction(
    event: InputEvent,
    action: StringName,
    exactMatch: Boolean = false,
  ): Boolean {
    TransferContext.writeArguments(OBJECT to event, STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, MethodBindings.eventIsActionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Clears all [InputEventAction] in the [InputMap] and load it anew from [ProjectSettings].
   */
  public fun loadFromProjectSettings(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.loadFromProjectSettingsPtr, NIL)
  }

  internal object MethodBindings {
    public val hasActionPtr: VoidPtr = TypeManager.getMethodBindPtr("InputMap", "has_action")

    public val getActionsPtr: VoidPtr = TypeManager.getMethodBindPtr("InputMap", "get_actions")

    public val addActionPtr: VoidPtr = TypeManager.getMethodBindPtr("InputMap", "add_action")

    public val eraseActionPtr: VoidPtr = TypeManager.getMethodBindPtr("InputMap", "erase_action")

    public val actionSetDeadzonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_set_deadzone")

    public val actionGetDeadzonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_get_deadzone")

    public val actionAddEventPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_add_event")

    public val actionHasEventPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_has_event")

    public val actionEraseEventPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_erase_event")

    public val actionEraseEventsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_erase_events")

    public val actionGetEventsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "action_get_events")

    public val eventIsActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "event_is_action")

    public val loadFromProjectSettingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputMap", "load_from_project_settings")
  }
}

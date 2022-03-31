// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Singleton that manages [godot.InputEventAction].
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/inputs/inputevent.html#inputmap]($DOCS_URL/tutorials/inputs/inputevent.html#inputmap)
 *
 * Manages all [godot.InputEventAction] which can be created/modified from the project settings menu **Project > Project Settings > Input Map** or in code with [addAction] and [actionAddEvent]. See [godot.Node.Input].
 */
@GodotBaseType
public object InputMap : Object() {
  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_INPUTMAP)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Returns `true` if the [godot.InputMap] has a registered action with the given name.
   */
  public open fun hasAction(action: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTMAP_HAS_ACTION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns an array of all actions in the [godot.InputMap].
   */
  public open fun getActions(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTMAP_GET_ACTIONS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Adds an empty action to the [godot.InputMap] with a configurable `deadzone`.
   *
   * An [godot.InputEvent] can then be added to this action with [actionAddEvent].
   */
  public open fun addAction(action: StringName, deadzone: Double = 0.5): Unit {
    TransferContext.writeArguments(STRING_NAME to action, DOUBLE to deadzone)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTMAP_ADD_ACTION, NIL)
  }

  /**
   * Removes an action from the [godot.InputMap].
   */
  public open fun eraseAction(action: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTMAP_ERASE_ACTION, NIL)
  }

  /**
   * Sets a deadzone value for the action.
   */
  public open fun actionSetDeadzone(action: StringName, deadzone: Double): Unit {
    TransferContext.writeArguments(STRING_NAME to action, DOUBLE to deadzone)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTMAP_ACTION_SET_DEADZONE, NIL)
  }

  /**
   * Returns a deadzone value for the action.
   */
  public open fun actionGetDeadzone(action: StringName): Double {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTMAP_ACTION_GET_DEADZONE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Adds an [godot.InputEvent] to an action. This [godot.InputEvent] will trigger the action.
   */
  public open fun actionAddEvent(action: StringName, event: InputEvent): Unit {
    TransferContext.writeArguments(STRING_NAME to action, OBJECT to event)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTMAP_ACTION_ADD_EVENT, NIL)
  }

  /**
   * Returns `true` if the action has the given [godot.InputEvent] associated with it.
   */
  public open fun actionHasEvent(action: StringName, event: InputEvent): Boolean {
    TransferContext.writeArguments(STRING_NAME to action, OBJECT to event)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTMAP_ACTION_HAS_EVENT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes an [godot.InputEvent] from an action.
   */
  public open fun actionEraseEvent(action: StringName, event: InputEvent): Unit {
    TransferContext.writeArguments(STRING_NAME to action, OBJECT to event)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTMAP_ACTION_ERASE_EVENT, NIL)
  }

  /**
   * Removes all events from an action.
   */
  public open fun actionEraseEvents(action: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTMAP_ACTION_ERASE_EVENTS, NIL)
  }

  /**
   * Returns an array of [godot.InputEvent]s associated with a given action.
   */
  public open fun actionGetEvents(action: StringName): VariantArray<Any?> {
    TransferContext.writeArguments(STRING_NAME to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTMAP_ACTION_GET_EVENTS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns `true` if the given event is part of an existing action. This method ignores keyboard modifiers if the given [godot.InputEvent] is not pressed (for proper release detection). See [actionHasEvent] if you don't want this behavior.
   *
   * If `exact_match` is `false`, it ignores additional input modifiers for [godot.InputEventKey] and [godot.InputEventMouseButton] events, and the direction for [godot.InputEventJoypadMotion] events.
   */
  public open fun eventIsAction(
    event: InputEvent,
    action: StringName,
    exactMatch: Boolean = false
  ): Boolean {
    TransferContext.writeArguments(OBJECT to event, STRING_NAME to action, BOOL to exactMatch)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTMAP_EVENT_IS_ACTION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Clears all [godot.InputEventAction] in the [godot.InputMap] and load it anew from [godot.ProjectSettings].
   */
  public open fun loadFromProjectSettings(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTMAP_LOAD_FROM_PROJECT_SETTINGS,
        NIL)
  }
}

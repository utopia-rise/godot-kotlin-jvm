// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.StringName
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Helper to manage undo/redo operations in the editor or custom tools.
 *
 * Helper to manage undo/redo operations in the editor or custom tools. It works by registering methods and property changes inside "actions".
 *
 * Common behavior is to create an action, then add do/undo calls to functions or property changes, then committing the action.
 *
 * Here's an example on how to add an action to the Godot editor's own [godot.UndoRedo], from a plugin:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var undo_redo = get_undo_redo() # Method of EditorPlugin.
 *
 *
 *
 * func do_something():
 *
 *     pass # Put your code here.
 *
 *
 *
 * func undo_something():
 *
 *     pass # Put here the code that reverts what's done by "do_something()".
 *
 *
 *
 * func _on_MyButton_pressed():
 *
 *     var node = get_node("MyNode2D")
 *
 *     undo_redo.create_action("Move the node")
 *
 *     undo_redo.add_do_method(self, "do_something")
 *
 *     undo_redo.add_undo_method(self, "undo_something")
 *
 *     undo_redo.add_do_property(node, "position", Vector2(100,100))
 *
 *     undo_redo.add_undo_property(node, "position", node.position)
 *
 *     undo_redo.commit_action()
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * public UndoRedo UndoRedo;
 *
 *
 *
 * public override void _Ready()
 *
 * {
 *
 *     UndoRedo = GetUndoRedo(); // Method of EditorPlugin.
 *
 * }
 *
 *
 *
 * public void DoSomething()
 *
 * {
 *
 *     // Put your code here.
 *
 * }
 *
 *
 *
 * public void UndoSomething()
 *
 * {
 *
 *     // Put here the code that reverts what's done by "DoSomething()".
 *
 * }
 *
 *
 *
 * private void OnMyButtonPressed()
 *
 * {
 *
 *     var node = GetNode<Node2D>("MyNode2D");
 *
 *     UndoRedo.CreateAction("Move the node");
 *
 *     UndoRedo.AddDoMethod(this, nameof(DoSomething));
 *
 *     UndoRedo.AddUndoMethod(this, nameof(UndoSomething));
 *
 *     UndoRedo.AddDoProperty(node, "position", new Vector2(100, 100));
 *
 *     UndoRedo.AddUndoProperty(node, "position", node.Position);
 *
 *     UndoRedo.CommitAction();
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * [createAction], [addDoMethod], [addUndoMethod], [addDoProperty], [addUndoProperty], and [commitAction] should be called one after the other, like in the example. Not doing so could lead to crashes.
 *
 * If you don't need to register a method, you can leave [addDoMethod] and [addUndoMethod] out; the same goes for properties. You can also register more than one method/property.
 */
@GodotBaseType
public open class UndoRedo : Object() {
  /**
   * Called when [undo] or [redo] was called.
   */
  public val versionChanged: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_UNDOREDO, scriptIndex)
    return true
  }

  /**
   * Create a new action. After this is called, do all your calls to [addDoMethod], [addUndoMethod], [addDoProperty], and [addUndoProperty], then commit the action with [commitAction].
   *
   * The way actions are merged is dictated by [mergeMode]. See [enum MergeMode] for details.
   */
  public fun createAction(name: String, mergeMode: MergeMode = UndoRedo.MergeMode.MERGE_DISABLE):
      Unit {
    TransferContext.writeArguments(STRING to name, LONG to mergeMode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_CREATE_ACTION, NIL)
  }

  /**
   * Commit the action. If [execute] is `true` (which it is by default), all "do" methods/properties are called/set when this function is called.
   */
  public fun commitAction(execute: Boolean = true): Unit {
    TransferContext.writeArguments(BOOL to execute)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_COMMIT_ACTION, NIL)
  }

  /**
   * Returns `true` if the [godot.UndoRedo] is currently committing the action, i.e. running its "do" method or property change (see [commitAction]).
   */
  public fun isCommittingAction(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_IS_COMMITTING_ACTION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Register a [godot.Callable] that will be called when the action is committed.
   */
  public fun addDoMethod(callable: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to callable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_ADD_DO_METHOD, NIL)
  }

  /**
   * Register a [godot.Callable] that will be called when the action is undone.
   */
  public fun addUndoMethod(callable: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to callable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_ADD_UNDO_METHOD, NIL)
  }

  /**
   * Register a [property] that would change its value to [value] when the action is committed.
   */
  public fun addDoProperty(
    _object: Object,
    `property`: StringName,
    `value`: Any
  ): Unit {
    TransferContext.writeArguments(OBJECT to _object, STRING_NAME to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_ADD_DO_PROPERTY, NIL)
  }

  /**
   * Register a [property] that would change its value to [value] when the action is undone.
   */
  public fun addUndoProperty(
    _object: Object,
    `property`: StringName,
    `value`: Any
  ): Unit {
    TransferContext.writeArguments(OBJECT to _object, STRING_NAME to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_ADD_UNDO_PROPERTY, NIL)
  }

  /**
   * Register a reference for "do" that will be erased if the "do" history is lost. This is useful mostly for new nodes created for the "do" call. Do not use for resources.
   */
  public fun addDoReference(_object: Object): Unit {
    TransferContext.writeArguments(OBJECT to _object)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_ADD_DO_REFERENCE, NIL)
  }

  /**
   * Register a reference for "undo" that will be erased if the "undo" history is lost. This is useful mostly for nodes removed with the "do" call (not the "undo" call!).
   */
  public fun addUndoReference(_object: Object): Unit {
    TransferContext.writeArguments(OBJECT to _object)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_ADD_UNDO_REFERENCE, NIL)
  }

  /**
   * Marks the next "do" and "undo" operations to be processed even if the action gets merged with another in the [MERGE_ENDS] mode. Return to normal operation using [endForceKeepInMergeEnds].
   */
  public fun startForceKeepInMergeEnds(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_UNDOREDO_START_FORCE_KEEP_IN_MERGE_ENDS, NIL)
  }

  /**
   * Stops marking operations as to be processed even if the action gets merged with another in the [MERGE_ENDS] mode. See [startForceKeepInMergeEnds].
   */
  public fun endForceKeepInMergeEnds(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_UNDOREDO_END_FORCE_KEEP_IN_MERGE_ENDS, NIL)
  }

  /**
   * Returns how many elements are in the history.
   */
  public fun getHistoryCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_GET_HISTORY_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets the index of the current action.
   */
  public fun getCurrentAction(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_GET_CURRENT_ACTION, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Gets the action name from its index.
   */
  public fun getActionName(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_GET_ACTION_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Clear the undo/redo history and associated references.
   *
   * Passing `false` to [increaseVersion] will prevent the version number from increasing when the history is cleared.
   */
  public fun clearHistory(increaseVersion: Boolean = true): Unit {
    TransferContext.writeArguments(BOOL to increaseVersion)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_CLEAR_HISTORY, NIL)
  }

  /**
   * Gets the name of the current action, equivalent to `get_action_name(get_current_action())`.
   */
  public fun getCurrentActionName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_GET_CURRENT_ACTION_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if an "undo" action is available.
   */
  public fun hasUndo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_HAS_UNDO, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if a "redo" action is available.
   */
  public fun hasRedo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_HAS_REDO, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Gets the version. Every time a new action is committed, the [godot.UndoRedo]'s version number is increased automatically.
   *
   * This is useful mostly to check if something changed from a saved version.
   */
  public fun getVersion(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_GET_VERSION, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Redo the last action.
   */
  public fun redo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_REDO, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Undo the last action.
   */
  public fun undo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_UNDO, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public enum class MergeMode(
    id: Long
  ) {
    /**
     * Makes "do"/"undo" operations stay in separate actions.
     */
    MERGE_DISABLE(0),
    /**
     * Makes so that the action's "undo" operations are from the first action created and the "do" operations are from the last subsequent action with the same name.
     */
    MERGE_ENDS(1),
    /**
     * Makes subsequent actions with the same name be merged into one.
     */
    MERGE_ALL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}

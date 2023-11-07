// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.StringName
import godot.core.TypeManager
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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * UndoRedo works by registering methods and property changes inside "actions". You can create an
 * action, then provide ways to do and undo this action using function calls and property changes, then
 * commit the action.
 * When an action is committed, all of the `do_*` methods will run. If the [undo] method is used,
 * the `undo_*` methods will run. If the [redo] method is used, once again, all of the `do_*` methods
 * will run.
 * Here's an example on how to add an action:
 *
 * gdscript:
 * ```gdscript
 * var undo_redo = UndoRedo.new()
 *
 * func do_something():
 *     pass # Put your code here.
 *
 * func undo_something():
 *     pass # Put here the code that reverts what's done by "do_something()".
 *
 * func _on_my_button_pressed():
 *     var node = get_node("MyNode2D")
 *     undo_redo.create_action("Move the node")
 *     undo_redo.add_do_method(do_something)
 *     undo_redo.add_undo_method(undo_something)
 *     undo_redo.add_do_property(node, "position", Vector2(100,100))
 *     undo_redo.add_undo_property(node, "position", node.position)
 *     undo_redo.commit_action()
 * ```
 * csharp:
 * ```csharp
 * private UndoRedo _undoRedo;
 *
 * public override void _Ready()
 * {
 *     _undoRedo = new UndoRedo();
 * }
 *
 * public void DoSomething()
 * {
 *     // Put your code here.
 * }
 *
 * public void UndoSomething()
 * {
 *     // Put here the code that reverts what's done by "DoSomething()".
 * }
 *
 * private void OnMyButtonPressed()
 * {
 *     var node = GetNode<Node2D>("MyNode2D");
 *     _undoRedo.CreateAction("Move the node");
 *     _undoRedo.AddDoMethod(new Callable(this, MethodName.DoSomething));
 *     _undoRedo.AddUndoMethod(new Callable(this, MethodName.UndoSomething));
 *     _undoRedo.AddDoProperty(node, "position", new Vector2(100, 100));
 *     _undoRedo.AddUndoProperty(node, "position", node.Position);
 *     _undoRedo.CommitAction();
 * }
 * ```
 *
 * Before calling any of the `add_(un)do_*` methods, you need to first call [createAction].
 * Afterwards you need to call [commitAction].
 * If you don't need to register a method, you can leave [addDoMethod] and [addUndoMethod] out; the
 * same goes for properties. You can also register more than one method/property.
 * If you are making an [EditorPlugin] and want to integrate into the editor's undo history, use
 * [EditorUndoRedoManager] instead.
 * If you are registering multiple properties/method which depend on one another, be aware that by
 * default undo operation are called in the same order they have been added. Therefore instead of
 * grouping do operation with their undo operations it is better to group do on one side and undo on
 * the other as shown below.
 *
 * gdscript:
 * ```gdscript
 * undo_redo.create_action("Add object")
 *
 * # DO
 * undo_redo.add_do_method(_create_object)
 * undo_redo.add_do_method(_add_object_to_singleton)
 *
 * # UNDO
 * undo_redo.add_undo_method(_remove_object_from_singleton)
 * undo_redo.add_undo_method(_destroy_that_object)
 *
 * undo_redo.commit_action()
 * ```
 * csharp:
 * ```csharp
 * _undo_redo.CreateAction("Add object");
 *
 * // DO
 * _undo_redo.AddDoMethod(new Callable(this, MethodName.CreateObject));
 * _undo_redo.AddDoMethod(new Callable(this, MethodName.AddObjectToSingleton));
 *
 * // UNDO
 * _undo_redo.AddUndoMethod(new Callable(this, MethodName.RemoveObjectFromSingleton));
 * _undo_redo.AddUndoMethod(new Callable(this, MethodName.DestroyThatObject));
 *
 * _undo_redo.CommitAction();
 * ```
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
   * Create a new action. After this is called, do all your calls to [addDoMethod], [addUndoMethod],
   * [addDoProperty], and [addUndoProperty], then commit the action with [commitAction].
   * The way actions are merged is dictated by [param merge_mode]. See [enum MergeMode] for details.
   * The way undo operation are ordered in actions is dictated by [param backward_undo_ops]. When
   * [param backward_undo_ops] is `false` undo option are ordered in the same order they were added.
   * Which means the first operation to be added will be the first to be undone.
   */
  @JvmOverloads
  public fun createAction(
    name: String,
    mergeMode: MergeMode = UndoRedo.MergeMode.MERGE_DISABLE,
    backwardUndoOps: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING to name, LONG to mergeMode.id, BOOL to backwardUndoOps)
    TransferContext.callMethod(rawPtr, MethodBindings.createActionPtr, NIL)
  }

  /**
   * Commit the action. If [param execute] is `true` (which it is by default), all "do"
   * methods/properties are called/set when this function is called.
   */
  @JvmOverloads
  public fun commitAction(execute: Boolean = true): Unit {
    TransferContext.writeArguments(BOOL to execute)
    TransferContext.callMethod(rawPtr, MethodBindings.commitActionPtr, NIL)
  }

  /**
   * Returns `true` if the [UndoRedo] is currently committing the action, i.e. running its "do"
   * method or property change (see [commitAction]).
   */
  public fun isCommittingAction(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCommittingActionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Register a [Callable] that will be called when the action is committed.
   */
  public fun addDoMethod(callable: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to callable)
    TransferContext.callMethod(rawPtr, MethodBindings.addDoMethodPtr, NIL)
  }

  /**
   * Register a [Callable] that will be called when the action is undone.
   */
  public fun addUndoMethod(callable: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to callable)
    TransferContext.callMethod(rawPtr, MethodBindings.addUndoMethodPtr, NIL)
  }

  /**
   * Register a [param property] that would change its value to [param value] when the action is
   * committed.
   */
  public fun addDoProperty(
    _object: Object,
    `property`: StringName,
    `value`: Any?,
  ): Unit {
    TransferContext.writeArguments(OBJECT to _object, STRING_NAME to property, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.addDoPropertyPtr, NIL)
  }

  /**
   * Register a [param property] that would change its value to [param value] when the action is
   * undone.
   */
  public fun addUndoProperty(
    _object: Object,
    `property`: StringName,
    `value`: Any?,
  ): Unit {
    TransferContext.writeArguments(OBJECT to _object, STRING_NAME to property, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.addUndoPropertyPtr, NIL)
  }

  /**
   * Register a reference for "do" that will be erased if the "do" history is lost. This is useful
   * mostly for new nodes created for the "do" call. Do not use for resources.
   * [codeblock]
   * var node = Node2D.new()
   * undo_redo.create_action("Add node")
   * undo_redo.add_do_method(add_child.bind(node))
   * undo_redo.add_do_reference(node)
   * undo_redo.add_undo_method(remove_child.bind(node))
   * undo_redo.commit_action()
   * [/codeblock]
   */
  public fun addDoReference(_object: Object): Unit {
    TransferContext.writeArguments(OBJECT to _object)
    TransferContext.callMethod(rawPtr, MethodBindings.addDoReferencePtr, NIL)
  }

  /**
   * Register a reference for "undo" that will be erased if the "undo" history is lost. This is
   * useful mostly for nodes removed with the "do" call (not the "undo" call!).
   * [codeblock]
   * var node = $Node2D
   * undo_redo.create_action("Remove node")
   * undo_redo.add_do_method(remove_child.bind(node))
   * undo_redo.add_undo_method(add_child.bind(node))
   * undo_redo.add_undo_reference(node)
   * undo_redo.commit_action()
   * [/codeblock]
   */
  public fun addUndoReference(_object: Object): Unit {
    TransferContext.writeArguments(OBJECT to _object)
    TransferContext.callMethod(rawPtr, MethodBindings.addUndoReferencePtr, NIL)
  }

  /**
   * Marks the next "do" and "undo" operations to be processed even if the action gets merged with
   * another in the [constant MERGE_ENDS] mode. Return to normal operation using
   * [endForceKeepInMergeEnds].
   */
  public fun startForceKeepInMergeEnds(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.startForceKeepInMergeEndsPtr, NIL)
  }

  /**
   * Stops marking operations as to be processed even if the action gets merged with another in the
   * [constant MERGE_ENDS] mode. See [startForceKeepInMergeEnds].
   */
  public fun endForceKeepInMergeEnds(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.endForceKeepInMergeEndsPtr, NIL)
  }

  /**
   * Returns how many elements are in the history.
   */
  public fun getHistoryCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHistoryCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Gets the index of the current action.
   */
  public fun getCurrentAction(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentActionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Gets the action name from its index.
   */
  public fun getActionName(id: Int): String {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getActionNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Clear the undo/redo history and associated references.
   * Passing `false` to [param increase_version] will prevent the version number from increasing
   * when the history is cleared.
   */
  @JvmOverloads
  public fun clearHistory(increaseVersion: Boolean = true): Unit {
    TransferContext.writeArguments(BOOL to increaseVersion)
    TransferContext.callMethod(rawPtr, MethodBindings.clearHistoryPtr, NIL)
  }

  /**
   * Gets the name of the current action, equivalent to `get_action_name(get_current_action())`.
   */
  public fun getCurrentActionName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentActionNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns `true` if an "undo" action is available.
   */
  public fun hasUndo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasUndoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if a "redo" action is available.
   */
  public fun hasRedo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasRedoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Gets the version. Every time a new action is committed, the [UndoRedo]'s version number is
   * increased automatically.
   * This is useful mostly to check if something changed from a saved version.
   */
  public fun getVersion(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVersionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Redo the last action.
   */
  public fun redo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.redoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Undo the last action.
   */
  public fun undo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.undoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class MergeMode(
    id: Long,
  ) {
    /**
     * Makes "do"/"undo" operations stay in separate actions.
     */
    MERGE_DISABLE(0),
    /**
     * Makes so that the action's "undo" operations are from the first action created and the "do"
     * operations are from the last subsequent action with the same name.
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val createActionPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "create_action")

    public val commitActionPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "commit_action")

    public val isCommittingActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "is_committing_action")

    public val addDoMethodPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "add_do_method")

    public val addUndoMethodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "add_undo_method")

    public val addDoPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "add_do_property")

    public val addUndoPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "add_undo_property")

    public val addDoReferencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "add_do_reference")

    public val addUndoReferencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "add_undo_reference")

    public val startForceKeepInMergeEndsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "start_force_keep_in_merge_ends")

    public val endForceKeepInMergeEndsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "end_force_keep_in_merge_ends")

    public val getHistoryCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "get_history_count")

    public val getCurrentActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "get_current_action")

    public val getActionNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "get_action_name")

    public val clearHistoryPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "clear_history")

    public val getCurrentActionNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "get_current_action_name")

    public val hasUndoPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "has_undo")

    public val hasRedoPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "has_redo")

    public val getVersionPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "get_version")

    public val redoPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "redo")

    public val undoPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "undo")
  }
}

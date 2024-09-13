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
import godot.core.VariantCaster.ANY
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
import kotlin.jvm.JvmName
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

  /**
   * The maximum number of steps that can be stored in the undo/redo history. If the number of
   * stored steps exceeds this limit, older steps are removed from history and can no longer be reached
   * by calling [undo]. A value of `0` or lower means no limit.
   */
  public final inline var maxSteps: Int
    @JvmName("maxStepsProperty")
    get() = getMaxSteps()
    @JvmName("maxStepsProperty")
    set(`value`) {
      setMaxSteps(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_UNDOREDO, scriptIndex)
  }

  /**
   * Create a new action. After this is called, do all your calls to [addDoMethod], [addUndoMethod],
   * [addDoProperty], and [addUndoProperty], then commit the action with [commitAction].
   * The way actions are merged is dictated by [mergeMode]. See [MergeMode] for details.
   * The way undo operation are ordered in actions is dictated by [backwardUndoOps]. When
   * [backwardUndoOps] is `false` undo option are ordered in the same order they were added. Which
   * means the first operation to be added will be the first to be undone.
   */
  @JvmOverloads
  public final fun createAction(
    name: String,
    mergeMode: MergeMode = UndoRedo.MergeMode.MERGE_DISABLE,
    backwardUndoOps: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING to name, LONG to mergeMode.id, BOOL to backwardUndoOps)
    TransferContext.callMethod(rawPtr, MethodBindings.createActionPtr, NIL)
  }

  /**
   * Commit the action. If [execute] is `true` (which it is by default), all "do" methods/properties
   * are called/set when this function is called.
   */
  @JvmOverloads
  public final fun commitAction(execute: Boolean = true): Unit {
    TransferContext.writeArguments(BOOL to execute)
    TransferContext.callMethod(rawPtr, MethodBindings.commitActionPtr, NIL)
  }

  /**
   * Returns `true` if the [UndoRedo] is currently committing the action, i.e. running its "do"
   * method or property change (see [commitAction]).
   */
  public final fun isCommittingAction(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCommittingActionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Register a [Callable] that will be called when the action is committed.
   */
  public final fun addDoMethod(callable: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to callable)
    TransferContext.callMethod(rawPtr, MethodBindings.addDoMethodPtr, NIL)
  }

  /**
   * Register a [Callable] that will be called when the action is undone.
   */
  public final fun addUndoMethod(callable: Callable): Unit {
    TransferContext.writeArguments(CALLABLE to callable)
    TransferContext.callMethod(rawPtr, MethodBindings.addUndoMethodPtr, NIL)
  }

  /**
   * Register a [property] that would change its value to [value] when the action is committed.
   */
  public final fun addDoProperty(
    _object: Object?,
    `property`: StringName,
    `value`: Any?,
  ): Unit {
    TransferContext.writeArguments(OBJECT to _object, STRING_NAME to property, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.addDoPropertyPtr, NIL)
  }

  /**
   * Register a [property] that would change its value to [value] when the action is undone.
   */
  public final fun addUndoProperty(
    _object: Object?,
    `property`: StringName,
    `value`: Any?,
  ): Unit {
    TransferContext.writeArguments(OBJECT to _object, STRING_NAME to property, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.addUndoPropertyPtr, NIL)
  }

  /**
   * Register a reference to an object that will be erased if the "do" history is deleted. This is
   * useful for objects added by the "do" action and removed by the "undo" action.
   * When the "do" history is deleted, if the object is a [RefCounted], it will be unreferenced.
   * Otherwise, it will be freed. Do not use for resources.
   * [codeblock]
   * var node = Node2D.new()
   * undo_redo.create_action("Add node")
   * undo_redo.add_do_method(add_child.bind(node))
   * undo_redo.add_do_reference(node)
   * undo_redo.add_undo_method(remove_child.bind(node))
   * undo_redo.commit_action()
   * [/codeblock]
   */
  public final fun addDoReference(_object: Object?): Unit {
    TransferContext.writeArguments(OBJECT to _object)
    TransferContext.callMethod(rawPtr, MethodBindings.addDoReferencePtr, NIL)
  }

  /**
   * Register a reference to an object that will be erased if the "undo" history is deleted. This is
   * useful for objects added by the "undo" action and removed by the "do" action.
   * When the "undo" history is deleted, if the object is a [RefCounted], it will be unreferenced.
   * Otherwise, it will be freed. Do not use for resources.
   * [codeblock]
   * var node = $Node2D
   * undo_redo.create_action("Remove node")
   * undo_redo.add_do_method(remove_child.bind(node))
   * undo_redo.add_undo_method(add_child.bind(node))
   * undo_redo.add_undo_reference(node)
   * undo_redo.commit_action()
   * [/codeblock]
   */
  public final fun addUndoReference(_object: Object?): Unit {
    TransferContext.writeArguments(OBJECT to _object)
    TransferContext.callMethod(rawPtr, MethodBindings.addUndoReferencePtr, NIL)
  }

  /**
   * Marks the next "do" and "undo" operations to be processed even if the action gets merged with
   * another in the [MERGE_ENDS] mode. Return to normal operation using [endForceKeepInMergeEnds].
   */
  public final fun startForceKeepInMergeEnds(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.startForceKeepInMergeEndsPtr, NIL)
  }

  /**
   * Stops marking operations as to be processed even if the action gets merged with another in the
   * [MERGE_ENDS] mode. See [startForceKeepInMergeEnds].
   */
  public final fun endForceKeepInMergeEnds(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.endForceKeepInMergeEndsPtr, NIL)
  }

  /**
   * Returns how many elements are in the history.
   */
  public final fun getHistoryCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHistoryCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Gets the index of the current action.
   */
  public final fun getCurrentAction(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentActionPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Gets the action name from its index.
   */
  public final fun getActionName(id: Int): String {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getActionNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Clear the undo/redo history and associated references.
   * Passing `false` to [increaseVersion] will prevent the version number from increasing when the
   * history is cleared.
   */
  @JvmOverloads
  public final fun clearHistory(increaseVersion: Boolean = true): Unit {
    TransferContext.writeArguments(BOOL to increaseVersion)
    TransferContext.callMethod(rawPtr, MethodBindings.clearHistoryPtr, NIL)
  }

  /**
   * Gets the name of the current action, equivalent to `get_action_name(get_current_action())`.
   */
  public final fun getCurrentActionName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentActionNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if an "undo" action is available.
   */
  public final fun hasUndo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasUndoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if a "redo" action is available.
   */
  public final fun hasRedo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasRedoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Gets the version. Every time a new action is committed, the [UndoRedo]'s version number is
   * increased automatically.
   * This is useful mostly to check if something changed from a saved version.
   */
  public final fun getVersion(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVersionPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMaxSteps(maxSteps: Int): Unit {
    TransferContext.writeArguments(LONG to maxSteps.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setMaxStepsPtr, NIL)
  }

  public final fun getMaxSteps(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaxStepsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Redo the last action.
   */
  public final fun redo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.redoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Undo the last action.
   */
  public final fun undo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.undoPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public enum class MergeMode(
    id: Long,
  ) {
    /**
     * Makes "do"/"undo" operations stay in separate actions.
     */
    MERGE_DISABLE(0),
    /**
     * Merges this action with the previous one if they have the same name. Keeps only the first
     * action's "undo" operations and the last action's "do" operations. Useful for sequential changes
     * to a single value.
     */
    MERGE_ENDS(1),
    /**
     * Merges this action with the previous one if they have the same name.
     */
    MERGE_ALL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): MergeMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val createActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "create_action", 3171901514)

    public val commitActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "commit_action", 3216645846)

    public val isCommittingActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "is_committing_action", 36873697)

    public val addDoMethodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "add_do_method", 1611583062)

    public val addUndoMethodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "add_undo_method", 1611583062)

    public val addDoPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "add_do_property", 1017172818)

    public val addUndoPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "add_undo_property", 1017172818)

    public val addDoReferencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "add_do_reference", 3975164845)

    public val addUndoReferencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "add_undo_reference", 3975164845)

    public val startForceKeepInMergeEndsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "start_force_keep_in_merge_ends", 3218959716)

    public val endForceKeepInMergeEndsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "end_force_keep_in_merge_ends", 3218959716)

    public val getHistoryCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "get_history_count", 2455072627)

    public val getCurrentActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "get_current_action", 2455072627)

    public val getActionNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "get_action_name", 990163283)

    public val clearHistoryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "clear_history", 3216645846)

    public val getCurrentActionNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "get_current_action_name", 201670096)

    public val hasUndoPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "has_undo", 36873697)

    public val hasRedoPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "has_redo", 36873697)

    public val getVersionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "get_version", 3905245786)

    public val setMaxStepsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "set_max_steps", 1286410249)

    public val getMaxStepsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UndoRedo", "get_max_steps", 3905245786)

    public val redoPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "redo", 2240911060)

    public val undoPtr: VoidPtr = TypeManager.getMethodBindPtr("UndoRedo", "undo", 2240911060)
  }
}

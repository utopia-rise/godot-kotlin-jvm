// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Helper to manage undo/redo operations in the editor or custom tools.
 *
 * Helper to manage undo/redo operations in the editor or custom tools. It works by registering methods and property changes inside "actions".
 *
 * Common behavior is to create an action, then add do/undo calls to functions or property changes, then committing the action.
 *
 * Here's an example on how to add an action to the Godot editor's own [godot.UndoRedo], from a plugin:
 *
 * ```
 * 		var undo_redo = get_undo_redo() # Method of EditorPlugin.
 *
 * 		func do_something():
 * 		    pass # Put your code here.
 *
 * 		func undo_something():
 * 		    pass # Put here the code that reverts what's done by "do_something()".
 *
 * 		func _on_MyButton_pressed():
 * 		    var node = get_node("MyNode2D")
 * 		    undo_redo.create_action("Move the node")
 * 		    undo_redo.add_do_method(self, "do_something")
 * 		    undo_redo.add_undo_method(self, "undo_something")
 * 		    undo_redo.add_do_property(node, "position", Vector2(100,100))
 * 		    undo_redo.add_undo_property(node, "position", node.position)
 * 		    undo_redo.commit_action()
 * 		```
 *
 * [createAction], [addDoMethod], [addUndoMethod], [addDoProperty], [addUndoProperty], and [commitAction] should be called one after the other, like in the example. Not doing so could lead to crashes.
 *
 * If you don't need to register a method, you can leave [addDoMethod] and [addUndoMethod] out; the same goes for properties. You can also register more than one method/property.
 */
@GodotBaseType
open class UndoRedo : Object() {
  /**
   * Called when [undo] or [redo] was called.
   */
  val versionChanged: Signal0 by signal()

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_UNDOREDO, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Register a method that will be called when the action is committed.
   */
  open fun addDoMethod(
    _object: Object,
    method: String,
    vararg __var_args: Any?
  ) {
    TransferContext.writeArguments(OBJECT to _object, STRING to method,  *__var_args.map { ANY to it
        }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_ADD_DO_METHOD, NIL)
  }

  /**
   * Register a property value change for "do".
   */
  open fun addDoProperty(
    _object: Object,
    property: String,
    value: Any?
  ) {
    TransferContext.writeArguments(OBJECT to _object, STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_ADD_DO_PROPERTY, NIL)
  }

  /**
   * Register a reference for "do" that will be erased if the "do" history is lost. This is useful mostly for new nodes created for the "do" call. Do not use for resources.
   */
  open fun addDoReference(_object: Object) {
    TransferContext.writeArguments(OBJECT to _object)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_ADD_DO_REFERENCE, NIL)
  }

  /**
   * Register a method that will be called when the action is undone.
   */
  open fun addUndoMethod(
    _object: Object,
    method: String,
    vararg __var_args: Any?
  ) {
    TransferContext.writeArguments(OBJECT to _object, STRING to method,  *__var_args.map { ANY to it
        }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_ADD_UNDO_METHOD, NIL)
  }

  /**
   * Register a property value change for "undo".
   */
  open fun addUndoProperty(
    _object: Object,
    property: String,
    value: Any?
  ) {
    TransferContext.writeArguments(OBJECT to _object, STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_ADD_UNDO_PROPERTY, NIL)
  }

  /**
   * Register a reference for "undo" that will be erased if the "undo" history is lost. This is useful mostly for nodes removed with the "do" call (not the "undo" call!).
   */
  open fun addUndoReference(_object: Object) {
    TransferContext.writeArguments(OBJECT to _object)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_ADD_UNDO_REFERENCE, NIL)
  }

  /**
   * Clear the undo/redo history and associated references.
   *
   * Passing `false` to `increase_version` will prevent the version number to be increased from this.
   */
  open fun clearHistory(increaseVersion: Boolean = true) {
    TransferContext.writeArguments(BOOL to increaseVersion)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_CLEAR_HISTORY, NIL)
  }

  /**
   * Commit the action. All "do" methods/properties are called/set when this function is called.
   */
  open fun commitAction() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_COMMIT_ACTION, NIL)
  }

  /**
   * Create a new action. After this is called, do all your calls to [addDoMethod], [addUndoMethod], [addDoProperty], and [addUndoProperty], then commit the action with [commitAction].
   *
   * The way actions are merged is dictated by the `merge_mode` argument. See [enum MergeMode] for details.
   */
  open fun createAction(name: String, mergeMode: Long = 0) {
    TransferContext.writeArguments(STRING to name, LONG to mergeMode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_CREATE_ACTION, NIL)
  }

  /**
   * Gets the name of the current action.
   */
  open fun getCurrentActionName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_GET_CURRENT_ACTION_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Gets the version. Every time a new action is committed, the [godot.UndoRedo]'s version number is increased automatically.
   *
   * This is useful mostly to check if something changed from a saved version.
   */
  open fun getVersion(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_GET_VERSION, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if a "redo" action is available.
   */
  open fun hasRedo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_HAS_REDO, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if an "undo" action is available.
   */
  open fun hasUndo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_HAS_UNDO, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the [godot.UndoRedo] is currently committing the action, i.e. running its "do" method or property change (see [commitAction]).
   */
  open fun isCommitingAction(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_IS_COMMITING_ACTION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Redo the last action.
   */
  open fun redo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_REDO, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Undo the last action.
   */
  open fun undo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_UNDO, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  enum class MergeMode(
    id: Long
  ) {
    /**
     * Makes "do"/"undo" operations stay in separate actions.
     */
    MERGE_DISABLE(0),

    /**
     * Makes so that the action's "do" operation is from the first action created and the "undo" operation is from the last subsequent action with the same name.
     */
    MERGE_ENDS(1),

    /**
     * Makes subsequent actions with the same name be merged into one.
     */
    MERGE_ALL(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Makes subsequent actions with the same name be merged into one.
     */
    final const val MERGE_ALL: Long = 2

    /**
     * Makes "do"/"undo" operations stay in separate actions.
     */
    final const val MERGE_DISABLE: Long = 0

    /**
     * Makes so that the action's "do" operation is from the first action created and the "undo" operation is from the last subsequent action with the same name.
     */
    final const val MERGE_ENDS: Long = 1
  }
}

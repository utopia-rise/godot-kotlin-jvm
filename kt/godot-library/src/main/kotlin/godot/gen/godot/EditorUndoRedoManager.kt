// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
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
 * Manages undo history of scenes opened in the editor.
 *
 * [godot.EditorUndoRedoManager] is a manager for [godot.UndoRedo] objects associated with edited scenes. Each scene has its own undo history and [godot.EditorUndoRedoManager] ensures that each action performed in the editor gets associated with a proper scene. For actions not related to scenes ([godot.ProjectSettings] edits, external resources, etc.), a separate global history is used.
 *
 * The usage is mostly the same as [godot.UndoRedo]. You create and commit actions and the manager automatically decides under-the-hood what scenes it belongs to. The scene is deduced based on the first operation in an action, using the object from the operation. The rules are as follows:
 *
 * - If the object is a [godot.Node], use the currently edited scene;
 *
 * - If the object is a built-in resource, use the scene from its path;
 *
 * - If the object is external resource or anything else, use global history.
 *
 * This guessing can sometimes yield false results, so you can provide a custom context object when creating an action.
 *
 * [godot.EditorUndoRedoManager] is intended to be used by Godot editor plugins. You can obtain it using [godot.EditorPlugin.getUndoRedo]. For non-editor uses or plugins that don't need to integrate with the editor's undo history, use [godot.UndoRedo] instead.
 *
 * The manager's API is mostly the same as in [godot.UndoRedo], so you can refer to its documentation for more examples. The main difference is that [godot.EditorUndoRedoManager] uses object + method name for actions, instead of [godot.Callable].
 */
@GodotBaseType
public open class EditorUndoRedoManager internal constructor() : Object() {
  /**
   * Emitted when the list of actions in any history has changed, either when an action is committed or a history is cleared.
   */
  public val historyChanged: Signal0 by signal()

  /**
   * Emitted when the version of any history has changed as a result of undo or redo call.
   */
  public val versionChanged: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORUNDOREDOMANAGER, scriptIndex)
    return true
  }

  /**
   * Create a new action. After this is called, do all your calls to [addDoMethod], [addUndoMethod], [addDoProperty], and [addUndoProperty], then commit the action with [commitAction].
   *
   * The way actions are merged is dictated by the [mergeMode] argument. See [enum UndoRedo.MergeMode] for details.
   *
   * If [customContext] object is provided, it will be used for deducing target history (instead of using the first operation).
   *
   * The way undo operation are ordered in actions is dictated by [backwardUndoOps]. When [backwardUndoOps] is `false` undo option are ordered in the same order they were added. Which means the first operation to be added will be the first to be undone.
   */
  @JvmOverloads
  public fun createAction(
    name: String,
    mergeMode: UndoRedo.MergeMode = UndoRedo.MergeMode.MERGE_DISABLE,
    customContext: Object? = null,
    backwardUndoOps: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING to name, LONG to mergeMode.id, OBJECT to customContext, BOOL to backwardUndoOps)
    TransferContext.callMethod(rawPtr, MethodBindings.createActionPtr, NIL)
  }

  /**
   * Commit the action. If [execute] is true (default), all "do" methods/properties are called/set when this function is called.
   */
  @JvmOverloads
  public fun commitAction(execute: Boolean = true): Unit {
    TransferContext.writeArguments(BOOL to execute)
    TransferContext.callMethod(rawPtr, MethodBindings.commitActionPtr, NIL)
  }

  /**
   * Returns `true` if the [godot.EditorUndoRedoManager] is currently committing the action, i.e. running its "do" method or property change (see [commitAction]).
   */
  public fun isCommittingAction(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCommittingActionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Register a method that will be called when the action is committed (i.e. the "do" action).
   *
   * If this is the first operation, the [object] will be used to deduce target undo history.
   */
  public fun addDoMethod(
    _object: Object,
    method: StringName,
    vararg __var_args: Any?,
  ): Unit {
    TransferContext.writeArguments(OBJECT to _object, STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, MethodBindings.addDoMethodPtr, NIL)
  }

  /**
   * Register a method that will be called when the action is undone (i.e. the "undo" action).
   *
   * If this is the first operation, the [object] will be used to deduce target undo history.
   */
  public fun addUndoMethod(
    _object: Object,
    method: StringName,
    vararg __var_args: Any?,
  ): Unit {
    TransferContext.writeArguments(OBJECT to _object, STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, MethodBindings.addUndoMethodPtr, NIL)
  }

  /**
   * Register a property value change for "do".
   *
   * If this is the first operation, the [object] will be used to deduce target undo history.
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
   * Register a property value change for "undo".
   *
   * If this is the first operation, the [object] will be used to deduce target undo history.
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
   * Register a reference for "do" that will be erased if the "do" history is lost. This is useful mostly for new nodes created for the "do" call. Do not use for resources.
   */
  public fun addDoReference(_object: Object): Unit {
    TransferContext.writeArguments(OBJECT to _object)
    TransferContext.callMethod(rawPtr, MethodBindings.addDoReferencePtr, NIL)
  }

  /**
   * Register a reference for "undo" that will be erased if the "undo" history is lost. This is useful mostly for nodes removed with the "do" call (not the "undo" call!).
   */
  public fun addUndoReference(_object: Object): Unit {
    TransferContext.writeArguments(OBJECT to _object)
    TransferContext.callMethod(rawPtr, MethodBindings.addUndoReferencePtr, NIL)
  }

  /**
   * Returns the history ID deduced from the given [object]. It can be used with [getHistoryUndoRedo].
   */
  public fun getObjectHistoryId(_object: Object): Int {
    TransferContext.writeArguments(OBJECT to _object)
    TransferContext.callMethod(rawPtr, MethodBindings.getObjectHistoryIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [godot.UndoRedo] object associated with the given history [id].
   *
   * [id] above `0` are mapped to the opened scene tabs (but it doesn't match their order). [id] of `0` or lower have special meaning (see [enum SpecialHistory]).
   *
   * Best used with [getObjectHistoryId]. This method is only provided in case you need some more advanced methods of [godot.UndoRedo] (but keep in mind that directly operating on the [godot.UndoRedo] object might affect editor's stability).
   */
  public fun getHistoryUndoRedo(id: Int): UndoRedo? {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getHistoryUndoRedoPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as UndoRedo?)
  }

  public enum class SpecialHistory(
    id: Long,
  ) {
    /**
     * Global history not associated with any scene, but with external resources etc.
     */
    GLOBAL_HISTORY(0),
    /**
     * History associated with remote inspector. Used when live editing a running project.
     */
    REMOTE_HISTORY(-9),
    /**
     * Invalid "null" history. It's a special value, not associated with any object.
     */
    INVALID_HISTORY(-99),
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
    public val createActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "create_action")

    public val commitActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "commit_action")

    public val isCommittingActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "is_committing_action")

    public val addDoMethodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "add_do_method")

    public val addUndoMethodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "add_undo_method")

    public val addDoPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "add_do_property")

    public val addUndoPropertyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "add_undo_property")

    public val addDoReferencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "add_do_reference")

    public val addUndoReferencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "add_undo_reference")

    public val getObjectHistoryIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "get_object_history_id")

    public val getHistoryUndoRedoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorUndoRedoManager", "get_history_undo_redo")
  }
}

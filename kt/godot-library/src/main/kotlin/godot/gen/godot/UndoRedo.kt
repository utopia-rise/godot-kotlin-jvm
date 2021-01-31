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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class UndoRedo : Object() {
  val versionChanged: Signal0 by signal()

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_UNDOREDO)

  open fun addDoMethod(
    _object: Object,
    method: String,
    vararg __var_args: Any?
  ) {
    TransferContext.writeArguments(OBJECT to _object, STRING to method,  *__var_args.map { ANY to it
        }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_ADD_DO_METHOD, NIL)
  }

  open fun addDoProperty(
    _object: Object,
    property: String,
    value: Any
  ) {
    TransferContext.writeArguments(OBJECT to _object, STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_ADD_DO_PROPERTY, NIL)
  }

  open fun addDoReference(_object: Object) {
    TransferContext.writeArguments(OBJECT to _object)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_ADD_DO_REFERENCE, NIL)
  }

  open fun addUndoMethod(
    _object: Object,
    method: String,
    vararg __var_args: Any?
  ) {
    TransferContext.writeArguments(OBJECT to _object, STRING to method,  *__var_args.map { ANY to it
        }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_ADD_UNDO_METHOD, NIL)
  }

  open fun addUndoProperty(
    _object: Object,
    property: String,
    value: Any
  ) {
    TransferContext.writeArguments(OBJECT to _object, STRING to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_ADD_UNDO_PROPERTY, NIL)
  }

  open fun addUndoReference(_object: Object) {
    TransferContext.writeArguments(OBJECT to _object)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_ADD_UNDO_REFERENCE, NIL)
  }

  open fun clearHistory(increaseVersion: Boolean = true) {
    TransferContext.writeArguments(BOOL to increaseVersion)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_CLEAR_HISTORY, NIL)
  }

  open fun commitAction() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_COMMIT_ACTION, NIL)
  }

  open fun createAction(name: String, mergeMode: Long = 0) {
    TransferContext.writeArguments(STRING to name, LONG to mergeMode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_CREATE_ACTION, NIL)
  }

  open fun getCurrentActionName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_GET_CURRENT_ACTION_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getVersion(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_GET_VERSION, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun hasRedo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_HAS_REDO, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun hasUndo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_HAS_UNDO, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isCommitingAction(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_IS_COMMITING_ACTION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun redo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_REDO, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun undo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_UNDOREDO_UNDO, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  enum class MergeMode(
    id: Long
  ) {
    MERGE_DISABLE(0),

    MERGE_ENDS(1),

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
    final const val MERGE_ALL: Long = 2

    final const val MERGE_DISABLE: Long = 0

    final const val MERGE_ENDS: Long = 1
  }
}

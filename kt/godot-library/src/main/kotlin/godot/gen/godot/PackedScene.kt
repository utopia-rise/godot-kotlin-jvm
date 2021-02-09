// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
open class PackedScene : Resource() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_PACKEDSCENE)

  open fun _getBundledScene(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_bundled_scene is not implemented for PackedScene")
  }

  open fun _setBundledScene(arg0: Dictionary<Any?, Any?>) {
  }

  open fun canInstance(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDSCENE_CAN_INSTANCE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getState(): SceneState? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDSCENE_GET_STATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SceneState?
  }

  open fun instance(editState: Long = 0): Node? {
    TransferContext.writeArguments(LONG to editState)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDSCENE_INSTANCE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  open fun pack(path: Node): GodotError {
    TransferContext.writeArguments(OBJECT to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PACKEDSCENE_PACK, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  enum class GenEditState(
    id: Long
  ) {
    GEN_EDIT_STATE_DISABLED(0),

    GEN_EDIT_STATE_INSTANCE(1),

    GEN_EDIT_STATE_MAIN(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val GEN_EDIT_STATE_DISABLED: Long = 0

    final const val GEN_EDIT_STATE_INSTANCE: Long = 1

    final const val GEN_EDIT_STATE_MAIN: Long = 2
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 *
 */
@GodotBaseType
open class Skin : Resource() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_SKIN)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  /**
   *
   */
  open fun addBind(bone: Long, pose: Transform) {
    TransferContext.writeArguments(LONG to bone, TRANSFORM to pose)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_ADD_BIND, NIL)
  }

  /**
   *
   */
  open fun clearBinds() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_CLEAR_BINDS, NIL)
  }

  /**
   *
   */
  open fun getBindBone(bindIndex: Long): Long {
    TransferContext.writeArguments(LONG to bindIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_GET_BIND_BONE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  open fun getBindCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_GET_BIND_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  open fun getBindName(bindIndex: Long): String {
    TransferContext.writeArguments(LONG to bindIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_GET_BIND_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   *
   */
  open fun getBindPose(bindIndex: Long): Transform {
    TransferContext.writeArguments(LONG to bindIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_GET_BIND_POSE, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   *
   */
  open fun setBindBone(bindIndex: Long, bone: Long) {
    TransferContext.writeArguments(LONG to bindIndex, LONG to bone)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_SET_BIND_BONE, NIL)
  }

  /**
   *
   */
  open fun setBindCount(bindCount: Long) {
    TransferContext.writeArguments(LONG to bindCount)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_SET_BIND_COUNT, NIL)
  }

  /**
   *
   */
  open fun setBindName(bindIndex: Long, name: String) {
    TransferContext.writeArguments(LONG to bindIndex, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_SET_BIND_NAME, NIL)
  }

  /**
   *
   */
  open fun setBindPose(bindIndex: Long, pose: Transform) {
    TransferContext.writeArguments(LONG to bindIndex, TRANSFORM to pose)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_SET_BIND_POSE, NIL)
  }
}

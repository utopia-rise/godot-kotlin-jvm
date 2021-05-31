// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class Skin : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SKIN)
  }

  /**
   *
   */
  public open fun addBind(bone: Long, pose: Transform): Unit {
    TransferContext.writeArguments(LONG to bone, TRANSFORM to pose)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_ADD_BIND, NIL)
  }

  /**
   *
   */
  public open fun clearBinds(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_CLEAR_BINDS, NIL)
  }

  /**
   *
   */
  public open fun getBindBone(bindIndex: Long): Long {
    TransferContext.writeArguments(LONG to bindIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_GET_BIND_BONE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public open fun getBindCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_GET_BIND_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public open fun getBindName(bindIndex: Long): String {
    TransferContext.writeArguments(LONG to bindIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_GET_BIND_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   *
   */
  public open fun getBindPose(bindIndex: Long): Transform {
    TransferContext.writeArguments(LONG to bindIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_GET_BIND_POSE, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   *
   */
  public open fun setBindBone(bindIndex: Long, bone: Long): Unit {
    TransferContext.writeArguments(LONG to bindIndex, LONG to bone)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_SET_BIND_BONE, NIL)
  }

  /**
   *
   */
  public open fun setBindCount(bindCount: Long): Unit {
    TransferContext.writeArguments(LONG to bindCount)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_SET_BIND_COUNT, NIL)
  }

  /**
   *
   */
  public open fun setBindName(bindIndex: Long, name: String): Unit {
    TransferContext.writeArguments(LONG to bindIndex, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_SET_BIND_NAME, NIL)
  }

  /**
   *
   */
  public open fun setBindPose(bindIndex: Long, pose: Transform): Unit {
    TransferContext.writeArguments(LONG to bindIndex, TRANSFORM to pose)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_SET_BIND_POSE, NIL)
  }
}

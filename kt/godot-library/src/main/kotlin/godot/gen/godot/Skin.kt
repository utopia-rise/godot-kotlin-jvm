// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TransferContext
import godot.core.Transform3D
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM3D
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class Skin : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKIN, scriptIndex)
    return true
  }

  /**
   *
   */
  public fun setBindCount(bindCount: Long): Unit {
    TransferContext.writeArguments(LONG to bindCount)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_SET_BIND_COUNT, NIL)
  }

  /**
   *
   */
  public fun getBindCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_GET_BIND_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun addBind(bone: Long, pose: Transform3D): Unit {
    TransferContext.writeArguments(LONG to bone, TRANSFORM3D to pose)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_ADD_BIND, NIL)
  }

  /**
   *
   */
  public fun addNamedBind(name: String, pose: Transform3D): Unit {
    TransferContext.writeArguments(STRING to name, TRANSFORM3D to pose)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_ADD_NAMED_BIND, NIL)
  }

  /**
   *
   */
  public fun setBindPose(bindIndex: Long, pose: Transform3D): Unit {
    TransferContext.writeArguments(LONG to bindIndex, TRANSFORM3D to pose)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_SET_BIND_POSE, NIL)
  }

  /**
   *
   */
  public fun getBindPose(bindIndex: Long): Transform3D {
    TransferContext.writeArguments(LONG to bindIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_GET_BIND_POSE, TRANSFORM3D)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   *
   */
  public fun setBindName(bindIndex: Long, name: StringName): Unit {
    TransferContext.writeArguments(LONG to bindIndex, STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_SET_BIND_NAME, NIL)
  }

  /**
   *
   */
  public fun getBindName(bindIndex: Long): StringName {
    TransferContext.writeArguments(LONG to bindIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_GET_BIND_NAME, STRING_NAME)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   *
   */
  public fun setBindBone(bindIndex: Long, bone: Long): Unit {
    TransferContext.writeArguments(LONG to bindIndex, LONG to bone)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_SET_BIND_BONE, NIL)
  }

  /**
   *
   */
  public fun getBindBone(bindIndex: Long): Long {
    TransferContext.writeArguments(LONG to bindIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_GET_BIND_BONE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun clearBinds(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKIN_CLEAR_BINDS, NIL)
  }

  public companion object
}

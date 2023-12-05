// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM3D
import godot.core.memory.TransferContext
import godot.util.VoidPtr
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
  public fun setBindCount(bindCount: Int): Unit {
    TransferContext.writeArguments(LONG to bindCount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setBindCountPtr, NIL)
  }

  /**
   *
   */
  public fun getBindCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBindCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   *
   */
  public fun addBind(bone: Int, pose: Transform3D): Unit {
    TransferContext.writeArguments(LONG to bone.toLong(), TRANSFORM3D to pose)
    TransferContext.callMethod(rawPtr, MethodBindings.addBindPtr, NIL)
  }

  /**
   *
   */
  public fun addNamedBind(name: String, pose: Transform3D): Unit {
    TransferContext.writeArguments(STRING to name, TRANSFORM3D to pose)
    TransferContext.callMethod(rawPtr, MethodBindings.addNamedBindPtr, NIL)
  }

  /**
   *
   */
  public fun setBindPose(bindIndex: Int, pose: Transform3D): Unit {
    TransferContext.writeArguments(LONG to bindIndex.toLong(), TRANSFORM3D to pose)
    TransferContext.callMethod(rawPtr, MethodBindings.setBindPosePtr, NIL)
  }

  /**
   *
   */
  public fun getBindPose(bindIndex: Int): Transform3D {
    TransferContext.writeArguments(LONG to bindIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBindPosePtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   *
   */
  public fun setBindName(bindIndex: Int, name: StringName): Unit {
    TransferContext.writeArguments(LONG to bindIndex.toLong(), STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setBindNamePtr, NIL)
  }

  /**
   *
   */
  public fun getBindName(bindIndex: Int): StringName {
    TransferContext.writeArguments(LONG to bindIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBindNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   *
   */
  public fun setBindBone(bindIndex: Int, bone: Int): Unit {
    TransferContext.writeArguments(LONG to bindIndex.toLong(), LONG to bone.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setBindBonePtr, NIL)
  }

  /**
   *
   */
  public fun getBindBone(bindIndex: Int): Int {
    TransferContext.writeArguments(LONG to bindIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBindBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   *
   */
  public fun clearBinds(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearBindsPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setBindCountPtr: VoidPtr = TypeManager.getMethodBindPtr("Skin", "set_bind_count")

    public val getBindCountPtr: VoidPtr = TypeManager.getMethodBindPtr("Skin", "get_bind_count")

    public val addBindPtr: VoidPtr = TypeManager.getMethodBindPtr("Skin", "add_bind")

    public val addNamedBindPtr: VoidPtr = TypeManager.getMethodBindPtr("Skin", "add_named_bind")

    public val setBindPosePtr: VoidPtr = TypeManager.getMethodBindPtr("Skin", "set_bind_pose")

    public val getBindPosePtr: VoidPtr = TypeManager.getMethodBindPtr("Skin", "get_bind_pose")

    public val setBindNamePtr: VoidPtr = TypeManager.getMethodBindPtr("Skin", "set_bind_name")

    public val getBindNamePtr: VoidPtr = TypeManager.getMethodBindPtr("Skin", "get_bind_name")

    public val setBindBonePtr: VoidPtr = TypeManager.getMethodBindPtr("Skin", "set_bind_bone")

    public val getBindBonePtr: VoidPtr = TypeManager.getMethodBindPtr("Skin", "get_bind_bone")

    public val clearBindsPtr: VoidPtr = TypeManager.getMethodBindPtr("Skin", "clear_binds")
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.StringName
import godot.core.Transform3D
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.VariantParser.TRANSFORM3D
import godot.core.asCachedStringName
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class Skin : Resource() {
  override fun new(scriptIndex: Int) {
    createNativeObject(608, scriptIndex)
  }

  public final fun setBindCount(bindCount: Int) {
    TransferContext.writeArguments(LONG to bindCount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setBindCountPtr, NIL)
  }

  public final fun getBindCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBindCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun addBind(bone: Int, pose: Transform3D) {
    TransferContext.writeArguments(LONG to bone.toLong(), TRANSFORM3D to pose)
    TransferContext.callMethod(ptr, MethodBindings.addBindPtr, NIL)
  }

  public final fun addNamedBind(name: String, pose: Transform3D) {
    TransferContext.writeArguments(STRING to name, TRANSFORM3D to pose)
    TransferContext.callMethod(ptr, MethodBindings.addNamedBindPtr, NIL)
  }

  public final fun setBindPose(bindIndex: Int, pose: Transform3D) {
    TransferContext.writeArguments(LONG to bindIndex.toLong(), TRANSFORM3D to pose)
    TransferContext.callMethod(ptr, MethodBindings.setBindPosePtr, NIL)
  }

  public final fun getBindPose(bindIndex: Int): Transform3D {
    TransferContext.writeArguments(LONG to bindIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBindPosePtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  public final fun setBindName(bindIndex: Int, name: StringName) {
    TransferContext.writeArguments(LONG to bindIndex.toLong(), STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.setBindNamePtr, NIL)
  }

  public final fun getBindName(bindIndex: Int): StringName {
    TransferContext.writeArguments(LONG to bindIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBindNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setBindBone(bindIndex: Int, bone: Int) {
    TransferContext.writeArguments(LONG to bindIndex.toLong(), LONG to bone.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setBindBonePtr, NIL)
  }

  public final fun getBindBone(bindIndex: Int): Int {
    TransferContext.writeArguments(LONG to bindIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBindBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun clearBinds() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearBindsPtr, NIL)
  }

  public final fun setBindName(bindIndex: Int, name: String): Unit = setBindName(bindIndex, name.asCachedStringName())

  public companion object

  public object MethodBindings {
    internal val setBindCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "set_bind_count", 1_286_410_249)

    internal val getBindCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "get_bind_count", 3_905_245_786)

    internal val addBindPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "add_bind", 3_616_898_986)

    internal val addNamedBindPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "add_named_bind", 3_154_712_474)

    internal val setBindPosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "set_bind_pose", 3_616_898_986)

    internal val getBindPosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "get_bind_pose", 1_965_739_696)

    internal val setBindNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "set_bind_name", 3_780_747_571)

    internal val getBindNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "get_bind_name", 659_327_637)

    internal val setBindBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "set_bind_bone", 3_937_882_851)

    internal val getBindBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "get_bind_bone", 923_996_154)

    internal val clearBindsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "clear_binds", 3_218_959_716)
  }
}

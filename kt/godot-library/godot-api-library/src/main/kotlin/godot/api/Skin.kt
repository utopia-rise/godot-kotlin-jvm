// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(625, scriptIndex)
  }

  public final fun setBindCount(bindCount: Int): Unit {
    TransferContext.writeArguments(LONG to bindCount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setBindCountPtr, NIL)
  }

  public final fun getBindCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBindCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun addBind(bone: Int, pose: Transform3D): Unit {
    TransferContext.writeArguments(LONG to bone.toLong(), TRANSFORM3D to pose)
    TransferContext.callMethod(ptr, MethodBindings.addBindPtr, NIL)
  }

  public final fun addNamedBind(name: String, pose: Transform3D): Unit {
    TransferContext.writeArguments(STRING to name, TRANSFORM3D to pose)
    TransferContext.callMethod(ptr, MethodBindings.addNamedBindPtr, NIL)
  }

  public final fun setBindPose(bindIndex: Int, pose: Transform3D): Unit {
    TransferContext.writeArguments(LONG to bindIndex.toLong(), TRANSFORM3D to pose)
    TransferContext.callMethod(ptr, MethodBindings.setBindPosePtr, NIL)
  }

  public final fun getBindPose(bindIndex: Int): Transform3D {
    TransferContext.writeArguments(LONG to bindIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBindPosePtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  public final fun setBindName(bindIndex: Int, name: StringName): Unit {
    TransferContext.writeArguments(LONG to bindIndex.toLong(), STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.setBindNamePtr, NIL)
  }

  public final fun getBindName(bindIndex: Int): StringName {
    TransferContext.writeArguments(LONG to bindIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBindNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setBindBone(bindIndex: Int, bone: Int): Unit {
    TransferContext.writeArguments(LONG to bindIndex.toLong(), LONG to bone.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setBindBonePtr, NIL)
  }

  public final fun getBindBone(bindIndex: Int): Int {
    TransferContext.writeArguments(LONG to bindIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBindBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun clearBinds(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearBindsPtr, NIL)
  }

  public final fun setBindName(bindIndex: Int, name: String) =
      setBindName(bindIndex, name.asCachedStringName())

  public companion object

  public object MethodBindings {
    internal val setBindCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "set_bind_count", 1286410249)

    internal val getBindCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "get_bind_count", 3905245786)

    internal val addBindPtr: VoidPtr = TypeManager.getMethodBindPtr("Skin", "add_bind", 3616898986)

    internal val addNamedBindPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "add_named_bind", 3154712474)

    internal val setBindPosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "set_bind_pose", 3616898986)

    internal val getBindPosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "get_bind_pose", 1965739696)

    internal val setBindNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "set_bind_name", 3780747571)

    internal val getBindNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "get_bind_name", 659327637)

    internal val setBindBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "set_bind_bone", 3937882851)

    internal val getBindBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "get_bind_bone", 923996154)

    internal val clearBindsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skin", "clear_binds", 3218959716)
  }
}

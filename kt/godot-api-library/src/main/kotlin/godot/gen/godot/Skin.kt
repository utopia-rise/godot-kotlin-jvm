// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.Transform3D
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.VariantParser.TRANSFORM3D
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_SKIN_INDEX: Int = 598

@GodotBaseType
public open class Skin : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_SKIN_INDEX, scriptIndex)
  }

  public final fun setBindCount(bindCount: Int): Unit {
    Internals.writeArguments(LONG to bindCount.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setBindCountPtr, NIL)
  }

  public final fun getBindCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBindCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun addBind(bone: Int, pose: Transform3D): Unit {
    Internals.writeArguments(LONG to bone.toLong(), TRANSFORM3D to pose)
    Internals.callMethod(rawPtr, MethodBindings.addBindPtr, NIL)
  }

  public final fun addNamedBind(name: String, pose: Transform3D): Unit {
    Internals.writeArguments(STRING to name, TRANSFORM3D to pose)
    Internals.callMethod(rawPtr, MethodBindings.addNamedBindPtr, NIL)
  }

  public final fun setBindPose(bindIndex: Int, pose: Transform3D): Unit {
    Internals.writeArguments(LONG to bindIndex.toLong(), TRANSFORM3D to pose)
    Internals.callMethod(rawPtr, MethodBindings.setBindPosePtr, NIL)
  }

  public final fun getBindPose(bindIndex: Int): Transform3D {
    Internals.writeArguments(LONG to bindIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBindPosePtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  public final fun setBindName(bindIndex: Int, name: StringName): Unit {
    Internals.writeArguments(LONG to bindIndex.toLong(), STRING_NAME to name)
    Internals.callMethod(rawPtr, MethodBindings.setBindNamePtr, NIL)
  }

  public final fun getBindName(bindIndex: Int): StringName {
    Internals.writeArguments(LONG to bindIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBindNamePtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setBindBone(bindIndex: Int, bone: Int): Unit {
    Internals.writeArguments(LONG to bindIndex.toLong(), LONG to bone.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setBindBonePtr, NIL)
  }

  public final fun getBindBone(bindIndex: Int): Int {
    Internals.writeArguments(LONG to bindIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBindBonePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun clearBinds(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearBindsPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val setBindCountPtr: VoidPtr =
        Internals.getMethodBindPtr("Skin", "set_bind_count", 1286410249)

    internal val getBindCountPtr: VoidPtr =
        Internals.getMethodBindPtr("Skin", "get_bind_count", 3905245786)

    internal val addBindPtr: VoidPtr = Internals.getMethodBindPtr("Skin", "add_bind", 3616898986)

    internal val addNamedBindPtr: VoidPtr =
        Internals.getMethodBindPtr("Skin", "add_named_bind", 3154712474)

    internal val setBindPosePtr: VoidPtr =
        Internals.getMethodBindPtr("Skin", "set_bind_pose", 3616898986)

    internal val getBindPosePtr: VoidPtr =
        Internals.getMethodBindPtr("Skin", "get_bind_pose", 1965739696)

    internal val setBindNamePtr: VoidPtr =
        Internals.getMethodBindPtr("Skin", "set_bind_name", 3780747571)

    internal val getBindNamePtr: VoidPtr =
        Internals.getMethodBindPtr("Skin", "get_bind_name", 659327637)

    internal val setBindBonePtr: VoidPtr =
        Internals.getMethodBindPtr("Skin", "set_bind_bone", 3937882851)

    internal val getBindBonePtr: VoidPtr =
        Internals.getMethodBindPtr("Skin", "get_bind_bone", 923996154)

    internal val clearBindsPtr: VoidPtr =
        Internals.getMethodBindPtr("Skin", "clear_binds", 3218959716)
  }
}

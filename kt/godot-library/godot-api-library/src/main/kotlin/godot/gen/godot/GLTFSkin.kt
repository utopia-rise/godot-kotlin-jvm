// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedInt32Array
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_GLTFSKIN_INDEX: Int = 263

@GodotBaseType
public open class GLTFSkin : Resource() {
  public final inline var skinRoot: Int
    @JvmName("skinRootProperty")
    get() = getSkinRoot()
    @JvmName("skinRootProperty")
    set(`value`) {
      setSkinRoot(value)
    }

  public final inline var jointsOriginal: PackedInt32Array
    @JvmName("jointsOriginalProperty")
    get() = getJointsOriginal()
    @JvmName("jointsOriginalProperty")
    set(`value`) {
      setJointsOriginal(value)
    }

  public final inline var inverseBinds: VariantArray<Transform3D>
    @JvmName("inverseBindsProperty")
    get() = getInverseBinds()
    @JvmName("inverseBindsProperty")
    set(`value`) {
      setInverseBinds(value)
    }

  public final inline var joints: PackedInt32Array
    @JvmName("jointsProperty")
    get() = getJoints()
    @JvmName("jointsProperty")
    set(`value`) {
      setJoints(value)
    }

  public final inline var nonJoints: PackedInt32Array
    @JvmName("nonJointsProperty")
    get() = getNonJoints()
    @JvmName("nonJointsProperty")
    set(`value`) {
      setNonJoints(value)
    }

  public final inline var roots: PackedInt32Array
    @JvmName("rootsProperty")
    get() = getRoots()
    @JvmName("rootsProperty")
    set(`value`) {
      setRoots(value)
    }

  public final inline var skeleton: Int
    @JvmName("skeletonProperty")
    get() = getSkeleton()
    @JvmName("skeletonProperty")
    set(`value`) {
      setSkeleton(value)
    }

  public final inline var jointIToBoneI: Dictionary<Any?, Any?>
    @JvmName("jointIToBoneIProperty")
    get() = getJointIToBoneI()
    @JvmName("jointIToBoneIProperty")
    set(`value`) {
      setJointIToBoneI(value)
    }

  public final inline var jointIToName: Dictionary<Any?, Any?>
    @JvmName("jointIToNameProperty")
    get() = getJointIToName()
    @JvmName("jointIToNameProperty")
    set(`value`) {
      setJointIToName(value)
    }

  public final inline var godotSkin: Skin?
    @JvmName("godotSkinProperty")
    get() = getGodotSkin()
    @JvmName("godotSkinProperty")
    set(`value`) {
      setGodotSkin(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_GLTFSKIN_INDEX, scriptIndex)
  }

  public final fun getSkinRoot(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSkinRootPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSkinRoot(skinRoot: Int): Unit {
    Internals.writeArguments(LONG to skinRoot.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setSkinRootPtr, NIL)
  }

  public final fun getJointsOriginal(): PackedInt32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getJointsOriginalPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setJointsOriginal(jointsOriginal: PackedInt32Array): Unit {
    Internals.writeArguments(PACKED_INT_32_ARRAY to jointsOriginal)
    Internals.callMethod(rawPtr, MethodBindings.setJointsOriginalPtr, NIL)
  }

  public final fun getInverseBinds(): VariantArray<Transform3D> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInverseBindsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Transform3D>)
  }

  public final fun setInverseBinds(inverseBinds: VariantArray<Transform3D>): Unit {
    Internals.writeArguments(ARRAY to inverseBinds)
    Internals.callMethod(rawPtr, MethodBindings.setInverseBindsPtr, NIL)
  }

  public final fun getJoints(): PackedInt32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getJointsPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setJoints(joints: PackedInt32Array): Unit {
    Internals.writeArguments(PACKED_INT_32_ARRAY to joints)
    Internals.callMethod(rawPtr, MethodBindings.setJointsPtr, NIL)
  }

  public final fun getNonJoints(): PackedInt32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNonJointsPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setNonJoints(nonJoints: PackedInt32Array): Unit {
    Internals.writeArguments(PACKED_INT_32_ARRAY to nonJoints)
    Internals.callMethod(rawPtr, MethodBindings.setNonJointsPtr, NIL)
  }

  public final fun getRoots(): PackedInt32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRootsPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setRoots(roots: PackedInt32Array): Unit {
    Internals.writeArguments(PACKED_INT_32_ARRAY to roots)
    Internals.callMethod(rawPtr, MethodBindings.setRootsPtr, NIL)
  }

  public final fun getSkeleton(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSkeletonPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSkeleton(skeleton: Int): Unit {
    Internals.writeArguments(LONG to skeleton.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setSkeletonPtr, NIL)
  }

  public final fun getJointIToBoneI(): Dictionary<Any?, Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getJointIToBoneIPtr, DICTIONARY)
    return (Internals.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public final fun setJointIToBoneI(jointIToBoneI: Dictionary<Any?, Any?>): Unit {
    Internals.writeArguments(DICTIONARY to jointIToBoneI)
    Internals.callMethod(rawPtr, MethodBindings.setJointIToBoneIPtr, NIL)
  }

  public final fun getJointIToName(): Dictionary<Any?, Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getJointIToNamePtr, DICTIONARY)
    return (Internals.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public final fun setJointIToName(jointIToName: Dictionary<Any?, Any?>): Unit {
    Internals.writeArguments(DICTIONARY to jointIToName)
    Internals.callMethod(rawPtr, MethodBindings.setJointIToNamePtr, NIL)
  }

  public final fun getGodotSkin(): Skin? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGodotSkinPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Skin?)
  }

  public final fun setGodotSkin(godotSkin: Skin?): Unit {
    Internals.writeArguments(OBJECT to godotSkin)
    Internals.callMethod(rawPtr, MethodBindings.setGodotSkinPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val getSkinRootPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkin", "get_skin_root", 2455072627)

    internal val setSkinRootPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkin", "set_skin_root", 1286410249)

    internal val getJointsOriginalPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkin", "get_joints_original", 969006518)

    internal val setJointsOriginalPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkin", "set_joints_original", 3614634198)

    internal val getInverseBindsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkin", "get_inverse_binds", 2915620761)

    internal val setInverseBindsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkin", "set_inverse_binds", 381264803)

    internal val getJointsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkin", "get_joints", 969006518)

    internal val setJointsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkin", "set_joints", 3614634198)

    internal val getNonJointsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkin", "get_non_joints", 969006518)

    internal val setNonJointsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkin", "set_non_joints", 3614634198)

    internal val getRootsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkin", "get_roots", 969006518)

    internal val setRootsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkin", "set_roots", 3614634198)

    internal val getSkeletonPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkin", "get_skeleton", 2455072627)

    internal val setSkeletonPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkin", "set_skeleton", 1286410249)

    internal val getJointIToBoneIPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkin", "get_joint_i_to_bone_i", 2382534195)

    internal val setJointIToBoneIPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkin", "set_joint_i_to_bone_i", 4155329257)

    internal val getJointIToNamePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkin", "get_joint_i_to_name", 2382534195)

    internal val setJointIToNamePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkin", "set_joint_i_to_name", 4155329257)

    internal val getGodotSkinPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkin", "get_godot_skin", 1032037385)

    internal val setGodotSkinPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFSkin", "set_godot_skin", 3971435618)
  }
}

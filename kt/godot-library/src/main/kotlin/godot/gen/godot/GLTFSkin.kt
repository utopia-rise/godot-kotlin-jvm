// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Dictionary
import godot.core.PackedInt32Array
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    callConstructor(ENGINECLASS_GLTFSKIN, scriptIndex)
  }

  public final fun getSkinRoot(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkinRootPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSkinRoot(skinRoot: Int): Unit {
    TransferContext.writeArguments(LONG to skinRoot.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSkinRootPtr, NIL)
  }

  public final fun getJointsOriginal(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJointsOriginalPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setJointsOriginal(jointsOriginal: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to jointsOriginal)
    TransferContext.callMethod(ptr, MethodBindings.setJointsOriginalPtr, NIL)
  }

  public final fun getInverseBinds(): VariantArray<Transform3D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInverseBindsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Transform3D>)
  }

  public final fun setInverseBinds(inverseBinds: VariantArray<Transform3D>): Unit {
    TransferContext.writeArguments(ARRAY to inverseBinds)
    TransferContext.callMethod(ptr, MethodBindings.setInverseBindsPtr, NIL)
  }

  public final fun getJoints(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJointsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setJoints(joints: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to joints)
    TransferContext.callMethod(ptr, MethodBindings.setJointsPtr, NIL)
  }

  public final fun getNonJoints(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNonJointsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setNonJoints(nonJoints: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to nonJoints)
    TransferContext.callMethod(ptr, MethodBindings.setNonJointsPtr, NIL)
  }

  public final fun getRoots(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRootsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setRoots(roots: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to roots)
    TransferContext.callMethod(ptr, MethodBindings.setRootsPtr, NIL)
  }

  public final fun getSkeleton(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkeletonPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSkeleton(skeleton: Int): Unit {
    TransferContext.writeArguments(LONG to skeleton.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSkeletonPtr, NIL)
  }

  public final fun getJointIToBoneI(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJointIToBoneIPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public final fun setJointIToBoneI(jointIToBoneI: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to jointIToBoneI)
    TransferContext.callMethod(ptr, MethodBindings.setJointIToBoneIPtr, NIL)
  }

  public final fun getJointIToName(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJointIToNamePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public final fun setJointIToName(jointIToName: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to jointIToName)
    TransferContext.callMethod(ptr, MethodBindings.setJointIToNamePtr, NIL)
  }

  public final fun getGodotSkin(): Skin? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGodotSkinPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Skin?)
  }

  public final fun setGodotSkin(godotSkin: Skin?): Unit {
    TransferContext.writeArguments(OBJECT to godotSkin)
    TransferContext.callMethod(ptr, MethodBindings.setGodotSkinPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getSkinRootPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "get_skin_root", 2455072627)

    public val setSkinRootPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "set_skin_root", 1286410249)

    public val getJointsOriginalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "get_joints_original", 969006518)

    public val setJointsOriginalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "set_joints_original", 3614634198)

    public val getInverseBindsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "get_inverse_binds", 2915620761)

    public val setInverseBindsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "set_inverse_binds", 381264803)

    public val getJointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "get_joints", 969006518)

    public val setJointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "set_joints", 3614634198)

    public val getNonJointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "get_non_joints", 969006518)

    public val setNonJointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "set_non_joints", 3614634198)

    public val getRootsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "get_roots", 969006518)

    public val setRootsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "set_roots", 3614634198)

    public val getSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "get_skeleton", 2455072627)

    public val setSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "set_skeleton", 1286410249)

    public val getJointIToBoneIPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "get_joint_i_to_bone_i", 2382534195)

    public val setJointIToBoneIPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "set_joint_i_to_bone_i", 4155329257)

    public val getJointIToNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "get_joint_i_to_name", 2382534195)

    public val setJointIToNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "set_joint_i_to_name", 4155329257)

    public val getGodotSkinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "get_godot_skin", 1032037385)

    public val setGodotSkinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "set_godot_skin", 3971435618)
  }
}

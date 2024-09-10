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
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GLTFSkin : Resource() {
  public var skinRoot: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkinRootPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSkinRootPtr, NIL)
    }

  public var jointsOriginal: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getJointsOriginalPtr, PACKED_INT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setJointsOriginalPtr, NIL)
    }

  public var inverseBinds: VariantArray<Transform3D>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInverseBindsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Transform3D>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setInverseBindsPtr, NIL)
    }

  public var joints: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getJointsPtr, PACKED_INT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setJointsPtr, NIL)
    }

  public var nonJoints: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNonJointsPtr, PACKED_INT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNonJointsPtr, NIL)
    }

  public var roots: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRootsPtr, PACKED_INT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRootsPtr, NIL)
    }

  public var skeleton: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkeletonPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSkeletonPtr, NIL)
    }

  public var jointIToBoneI: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getJointIToBoneIPtr, DICTIONARY)
      return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setJointIToBoneIPtr, NIL)
    }

  public var jointIToName: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getJointIToNamePtr, DICTIONARY)
      return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setJointIToNamePtr, NIL)
    }

  public var godotSkin: Skin?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGodotSkinPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Skin?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGodotSkinPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GLTFSKIN, scriptIndex)
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

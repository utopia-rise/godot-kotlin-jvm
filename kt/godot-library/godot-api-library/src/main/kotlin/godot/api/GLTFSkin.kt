// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
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

  /**
   *
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
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

  /**
   *
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var joints: PackedInt32Array
    @JvmName("jointsProperty")
    get() = getJoints()
    @JvmName("jointsProperty")
    set(`value`) {
      setJoints(value)
    }

  /**
   *
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var nonJoints: PackedInt32Array
    @JvmName("nonJointsProperty")
    get() = getNonJoints()
    @JvmName("nonJointsProperty")
    set(`value`) {
      setNonJoints(value)
    }

  /**
   *
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
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

  override fun new(scriptIndex: Int) {
    createNativeObject(238, scriptIndex)
  }

  /**
   * This is a helper function for [jointsOriginal] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = gltfskin.jointsOriginal
   * //Your changes
   * gltfskin.jointsOriginal = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun jointsOriginalMutate(block: PackedInt32Array.() -> Unit): PackedInt32Array = jointsOriginal.apply {
     block(this)
     jointsOriginal = this
  }

  /**
   * This is a helper function for [jointsOriginal] to make dealing with local copies easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to the Object.
   */
  @CoreTypeHelper
  public final fun jointsOriginalMutateEach(block: (index: Int, `value`: Int) -> Unit): PackedInt32Array = jointsOriginal.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     jointsOriginal = this
  }

  /**
   * This is a helper function for [joints] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = gltfskin.joints
   * //Your changes
   * gltfskin.joints = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun jointsMutate(block: PackedInt32Array.() -> Unit): PackedInt32Array = joints.apply {
     block(this)
     joints = this
  }

  /**
   * This is a helper function for [joints] to make dealing with local copies easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to the Object.
   */
  @CoreTypeHelper
  public final fun jointsMutateEach(block: (index: Int, `value`: Int) -> Unit): PackedInt32Array = joints.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     joints = this
  }

  /**
   * This is a helper function for [nonJoints] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = gltfskin.nonJoints
   * //Your changes
   * gltfskin.nonJoints = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun nonJointsMutate(block: PackedInt32Array.() -> Unit): PackedInt32Array = nonJoints.apply {
     block(this)
     nonJoints = this
  }

  /**
   * This is a helper function for [nonJoints] to make dealing with local copies easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to the Object.
   */
  @CoreTypeHelper
  public final fun nonJointsMutateEach(block: (index: Int, `value`: Int) -> Unit): PackedInt32Array = nonJoints.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     nonJoints = this
  }

  /**
   * This is a helper function for [roots] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = gltfskin.roots
   * //Your changes
   * gltfskin.roots = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun rootsMutate(block: PackedInt32Array.() -> Unit): PackedInt32Array = roots.apply {
     block(this)
     roots = this
  }

  /**
   * This is a helper function for [roots] to make dealing with local copies easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to the Object.
   */
  @CoreTypeHelper
  public final fun rootsMutateEach(block: (index: Int, `value`: Int) -> Unit): PackedInt32Array = roots.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     roots = this
  }

  public final fun getSkinRoot(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkinRootPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSkinRoot(skinRoot: Int) {
    TransferContext.writeArguments(LONG to skinRoot.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSkinRootPtr, NIL)
  }

  public final fun getJointsOriginal(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJointsOriginalPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setJointsOriginal(jointsOriginal: PackedInt32Array) {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to jointsOriginal)
    TransferContext.callMethod(ptr, MethodBindings.setJointsOriginalPtr, NIL)
  }

  public final fun getInverseBinds(): VariantArray<Transform3D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInverseBindsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Transform3D>)
  }

  public final fun setInverseBinds(inverseBinds: VariantArray<Transform3D>) {
    TransferContext.writeArguments(ARRAY to inverseBinds)
    TransferContext.callMethod(ptr, MethodBindings.setInverseBindsPtr, NIL)
  }

  public final fun getJoints(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJointsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setJoints(joints: PackedInt32Array) {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to joints)
    TransferContext.callMethod(ptr, MethodBindings.setJointsPtr, NIL)
  }

  public final fun getNonJoints(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNonJointsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setNonJoints(nonJoints: PackedInt32Array) {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to nonJoints)
    TransferContext.callMethod(ptr, MethodBindings.setNonJointsPtr, NIL)
  }

  public final fun getRoots(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRootsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setRoots(roots: PackedInt32Array) {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to roots)
    TransferContext.callMethod(ptr, MethodBindings.setRootsPtr, NIL)
  }

  public final fun getSkeleton(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkeletonPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSkeleton(skeleton: Int) {
    TransferContext.writeArguments(LONG to skeleton.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSkeletonPtr, NIL)
  }

  public final fun getJointIToBoneI(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJointIToBoneIPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public final fun setJointIToBoneI(jointIToBoneI: Dictionary<Any?, Any?>) {
    TransferContext.writeArguments(DICTIONARY to jointIToBoneI)
    TransferContext.callMethod(ptr, MethodBindings.setJointIToBoneIPtr, NIL)
  }

  public final fun getJointIToName(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJointIToNamePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public final fun setJointIToName(jointIToName: Dictionary<Any?, Any?>) {
    TransferContext.writeArguments(DICTIONARY to jointIToName)
    TransferContext.callMethod(ptr, MethodBindings.setJointIToNamePtr, NIL)
  }

  public final fun getGodotSkin(): Skin? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGodotSkinPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Skin?)
  }

  public final fun setGodotSkin(godotSkin: Skin?) {
    TransferContext.writeArguments(OBJECT to godotSkin)
    TransferContext.callMethod(ptr, MethodBindings.setGodotSkinPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val getSkinRootPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "get_skin_root", 2_455_072_627)

    internal val setSkinRootPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "set_skin_root", 1_286_410_249)

    internal val getJointsOriginalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "get_joints_original", 969_006_518)

    internal val setJointsOriginalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "set_joints_original", 3_614_634_198)

    internal val getInverseBindsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "get_inverse_binds", 2_915_620_761)

    internal val setInverseBindsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "set_inverse_binds", 381_264_803)

    internal val getJointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "get_joints", 969_006_518)

    internal val setJointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "set_joints", 3_614_634_198)

    internal val getNonJointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "get_non_joints", 969_006_518)

    internal val setNonJointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "set_non_joints", 3_614_634_198)

    internal val getRootsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "get_roots", 969_006_518)

    internal val setRootsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "set_roots", 3_614_634_198)

    internal val getSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "get_skeleton", 2_455_072_627)

    internal val setSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "set_skeleton", 1_286_410_249)

    internal val getJointIToBoneIPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "get_joint_i_to_bone_i", 2_382_534_195)

    internal val setJointIToBoneIPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "set_joint_i_to_bone_i", 4_155_329_257)

    internal val getJointIToNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "get_joint_i_to_name", 2_382_534_195)

    internal val setJointIToNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "set_joint_i_to_name", 4_155_329_257)

    internal val getGodotSkinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "get_godot_skin", 1_032_037_385)

    internal val setGodotSkinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkin", "set_godot_skin", 3_971_435_618)
  }
}

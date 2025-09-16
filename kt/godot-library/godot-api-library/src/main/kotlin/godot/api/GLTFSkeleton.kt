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
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

@GodotBaseType
public open class GLTFSkeleton : Resource() {
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
  public final inline var roots: PackedInt32Array
    @JvmName("rootsProperty")
    get() = getRoots()
    @JvmName("rootsProperty")
    set(`value`) {
      setRoots(value)
    }

  public final inline var uniqueNames: VariantArray<String>
    @JvmName("uniqueNamesProperty")
    get() = getUniqueNames()
    @JvmName("uniqueNamesProperty")
    set(`value`) {
      setUniqueNames(value)
    }

  public final inline var godotBoneNode: Dictionary<Any?, Any?>
    @JvmName("godotBoneNodeProperty")
    get() = getGodotBoneNode()
    @JvmName("godotBoneNodeProperty")
    set(`value`) {
      setGodotBoneNode(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(237, scriptIndex)
  }

  /**
   * This is a helper function for [joints] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = gltfskeleton.joints
   * //Your changes
   * gltfskeleton.joints = myCoreType
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
   * This is a helper function for [roots] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = gltfskeleton.roots
   * //Your changes
   * gltfskeleton.roots = myCoreType
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

  public final fun getJoints(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJointsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setJoints(joints: PackedInt32Array) {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to joints)
    TransferContext.callMethod(ptr, MethodBindings.setJointsPtr, NIL)
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

  public final fun getGodotSkeleton(): Skeleton3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGodotSkeletonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Skeleton3D?)
  }

  public final fun getUniqueNames(): VariantArray<String> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUniqueNamesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<String>)
  }

  public final fun setUniqueNames(uniqueNames: VariantArray<String>) {
    TransferContext.writeArguments(ARRAY to uniqueNames)
    TransferContext.callMethod(ptr, MethodBindings.setUniqueNamesPtr, NIL)
  }

  /**
   * Returns a [Dictionary] that maps skeleton bone indices to the indices of glTF nodes. This property is unused during import, and only set during export. In a glTF file, a bone is a node, so Godot converts skeleton bones to glTF nodes.
   */
  public final fun getGodotBoneNode(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGodotBoneNodePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Sets a [Dictionary] that maps skeleton bone indices to the indices of glTF nodes. This property is unused during import, and only set during export. In a glTF file, a bone is a node, so Godot converts skeleton bones to glTF nodes.
   */
  public final fun setGodotBoneNode(godotBoneNode: Dictionary<Any?, Any?>) {
    TransferContext.writeArguments(DICTIONARY to godotBoneNode)
    TransferContext.callMethod(ptr, MethodBindings.setGodotBoneNodePtr, NIL)
  }

  public final fun getBoneAttachmentCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBoneAttachmentCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getBoneAttachment(idx: Int): BoneAttachment3D? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBoneAttachmentPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as BoneAttachment3D?)
  }

  public companion object

  public object MethodBindings {
    internal val getJointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "get_joints", 969_006_518)

    internal val setJointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "set_joints", 3_614_634_198)

    internal val getRootsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "get_roots", 969_006_518)

    internal val setRootsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "set_roots", 3_614_634_198)

    internal val getGodotSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "get_godot_skeleton", 1_814_733_083)

    internal val getUniqueNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "get_unique_names", 2_915_620_761)

    internal val setUniqueNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "set_unique_names", 381_264_803)

    internal val getGodotBoneNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "get_godot_bone_node", 2_382_534_195)

    internal val setGodotBoneNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "set_godot_bone_node", 4_155_329_257)

    internal val getBoneAttachmentCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "get_bone_attachment_count", 2_455_072_627)

    internal val getBoneAttachmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "get_bone_attachment", 945_440_495)
  }
}

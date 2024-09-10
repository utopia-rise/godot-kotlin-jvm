// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedInt32Array
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
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

@GodotBaseType
public open class GLTFSkeleton : Resource() {
  public var joints: PackedInt32Array
    @JvmName("jointsProperty")
    get() = getJoints()
    @JvmName("jointsProperty")
    set(`value`) {
      setJoints(value)
    }

  public var roots: PackedInt32Array
    @JvmName("rootsProperty")
    get() = getRoots()
    @JvmName("rootsProperty")
    set(`value`) {
      setRoots(value)
    }

  public var uniqueNames: VariantArray<String>
    @JvmName("uniqueNamesProperty")
    get() = getUniqueNames()
    @JvmName("uniqueNamesProperty")
    set(`value`) {
      setUniqueNames(value)
    }

  public var godotBoneNode: Dictionary<Any?, Any?>
    @JvmName("godotBoneNodeProperty")
    get() = getGodotBoneNode()
    @JvmName("godotBoneNodeProperty")
    set(`value`) {
      setGodotBoneNode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GLTFSKELETON, scriptIndex)
  }

  public fun getJoints(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getJointsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun setJoints(joints: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to joints)
    TransferContext.callMethod(rawPtr, MethodBindings.setJointsPtr, NIL)
  }

  public fun getRoots(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRootsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun setRoots(roots: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to roots)
    TransferContext.callMethod(rawPtr, MethodBindings.setRootsPtr, NIL)
  }

  public fun getGodotSkeleton(): Skeleton3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGodotSkeletonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Skeleton3D?)
  }

  public fun getUniqueNames(): VariantArray<String> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUniqueNamesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<String>)
  }

  public fun setUniqueNames(uniqueNames: VariantArray<String>): Unit {
    TransferContext.writeArguments(ARRAY to uniqueNames)
    TransferContext.callMethod(rawPtr, MethodBindings.setUniqueNamesPtr, NIL)
  }

  /**
   * Returns a [Dictionary] that maps skeleton bone indices to the indices of GLTF nodes. This
   * property is unused during import, and only set during export. In a GLTF file, a bone is a node, so
   * Godot converts skeleton bones to GLTF nodes.
   */
  public fun getGodotBoneNode(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGodotBoneNodePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Sets a [Dictionary] that maps skeleton bone indices to the indices of GLTF nodes. This property
   * is unused during import, and only set during export. In a GLTF file, a bone is a node, so Godot
   * converts skeleton bones to GLTF nodes.
   */
  public fun setGodotBoneNode(godotBoneNode: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to godotBoneNode)
    TransferContext.callMethod(rawPtr, MethodBindings.setGodotBoneNodePtr, NIL)
  }

  public fun getBoneAttachmentCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneAttachmentCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getBoneAttachment(idx: Int): BoneAttachment3D? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneAttachmentPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as BoneAttachment3D?)
  }

  public companion object

  internal object MethodBindings {
    public val getJointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "get_joints", 969006518)

    public val setJointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "set_joints", 3614634198)

    public val getRootsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "get_roots", 969006518)

    public val setRootsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "set_roots", 3614634198)

    public val getGodotSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "get_godot_skeleton", 1814733083)

    public val getUniqueNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "get_unique_names", 2915620761)

    public val setUniqueNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "set_unique_names", 381264803)

    public val getGodotBoneNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "get_godot_bone_node", 2382534195)

    public val setGodotBoneNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "set_godot_bone_node", 4155329257)

    public val getBoneAttachmentCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "get_bone_attachment_count", 2455072627)

    public val getBoneAttachmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "get_bone_attachment", 945440495)
  }
}

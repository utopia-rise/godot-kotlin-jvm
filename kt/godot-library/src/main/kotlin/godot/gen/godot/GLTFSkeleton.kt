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
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

@GodotBaseType
public open class GLTFSkeleton : Resource() {
  public final inline var joints: PackedInt32Array
    @JvmName("jointsProperty")
    get() = getJoints()
    @JvmName("jointsProperty")
    set(`value`) {
      setJoints(value)
    }

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

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GLTFSKELETON, scriptIndex)
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

  public final fun getRoots(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRootsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setRoots(roots: PackedInt32Array): Unit {
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

  public final fun setUniqueNames(uniqueNames: VariantArray<String>): Unit {
    TransferContext.writeArguments(ARRAY to uniqueNames)
    TransferContext.callMethod(ptr, MethodBindings.setUniqueNamesPtr, NIL)
  }

  /**
   * Returns a [Dictionary] that maps skeleton bone indices to the indices of GLTF nodes. This
   * property is unused during import, and only set during export. In a GLTF file, a bone is a node, so
   * Godot converts skeleton bones to GLTF nodes.
   */
  public final fun getGodotBoneNode(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGodotBoneNodePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Sets a [Dictionary] that maps skeleton bone indices to the indices of GLTF nodes. This property
   * is unused during import, and only set during export. In a GLTF file, a bone is a node, so Godot
   * converts skeleton bones to GLTF nodes.
   */
  public final fun setGodotBoneNode(godotBoneNode: Dictionary<Any?, Any?>): Unit {
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

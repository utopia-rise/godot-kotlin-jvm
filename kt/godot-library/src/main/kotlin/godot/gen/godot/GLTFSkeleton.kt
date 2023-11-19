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
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class GLTFSkeleton : Resource() {
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

  public var uniqueNames: VariantArray<String>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUniqueNamesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<String>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUniqueNamesPtr, NIL)
    }

  public var godotBoneNode: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGodotBoneNodePtr, DICTIONARY)
      return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGodotBoneNodePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GLTFSKELETON, scriptIndex)
    return true
  }

  public fun getGodotSkeleton(): Skeleton3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGodotSkeletonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Skeleton3D?)
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
    public val getJointsPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFSkeleton", "get_joints")

    public val setJointsPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFSkeleton", "set_joints")

    public val getRootsPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFSkeleton", "get_roots")

    public val setRootsPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFSkeleton", "set_roots")

    public val getGodotSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "get_godot_skeleton")

    public val getUniqueNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "get_unique_names")

    public val setUniqueNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "set_unique_names")

    public val getGodotBoneNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "get_godot_bone_node")

    public val setGodotBoneNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "set_godot_bone_node")

    public val getBoneAttachmentCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "get_bone_attachment_count")

    public val getBoneAttachmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFSkeleton", "get_bone_attachment")
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedInt32Array
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import kotlin.Any
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GLTFSkeleton : Resource() {
  public var joints: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKELETON_GET_JOINTS,
          PACKED_INT_32_ARRAY)
      return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKELETON_SET_JOINTS, NIL)
    }

  public var roots: PackedInt32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKELETON_GET_ROOTS,
          PACKED_INT_32_ARRAY)
      return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_INT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKELETON_SET_ROOTS, NIL)
    }

  public var uniqueNames: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKELETON_GET_UNIQUE_NAMES,
          ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKELETON_SET_UNIQUE_NAMES,
          NIL)
    }

  public var godotBoneNode: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKELETON_GET_GODOT_BONE_NODE,
          DICTIONARY)
      return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKELETON_SET_GODOT_BONE_NODE,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GLTFSKELETON)
  }

  public fun getGodotSkeleton(): Skeleton3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKELETON_GET_GODOT_SKELETON,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Skeleton3D?
  }

  public fun getBoneAttachmentCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GLTFSKELETON_GET_BONE_ATTACHMENT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun getBoneAttachment(idx: Long): BoneAttachment3D? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKELETON_GET_BONE_ATTACHMENT,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as BoneAttachment3D?
  }

  public companion object
}

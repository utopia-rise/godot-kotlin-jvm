// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PoolIntArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_INT_ARRAY
import kotlin.Any
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GLTFSkeleton : Resource() {
  public open var godotBoneNode: Dictionary<Any?, Any?>
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

  public open var joints: PoolIntArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKELETON_GET_JOINTS,
          POOL_INT_ARRAY)
      return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_INT_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKELETON_SET_JOINTS, NIL)
    }

  public open var roots: PoolIntArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKELETON_GET_ROOTS,
          POOL_INT_ARRAY)
      return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_INT_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKELETON_SET_ROOTS, NIL)
    }

  public open var uniqueNames: VariantArray<Any?>
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

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GLTFSKELETON)
  }

  public open fun getBoneAttachment(idx: Long): BoneAttachment? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKELETON_GET_BONE_ATTACHMENT,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as BoneAttachment?
  }

  public open fun getBoneAttachmentCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GLTFSKELETON_GET_BONE_ATTACHMENT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public open fun getGodotSkeleton(): Skeleton? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFSKELETON_GET_GODOT_SKELETON,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Skeleton?
  }
}

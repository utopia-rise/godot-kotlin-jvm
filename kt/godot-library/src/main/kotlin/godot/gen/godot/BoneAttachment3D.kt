// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * А node that dynamically copies or overrides the 3D transform of a bone in its parent [godot.Skeleton3D].
 *
 * This node selects a bone in a [godot.Skeleton3D] and attaches to it. This means that the [godot.BoneAttachment3D] node will either dynamically copy or override the 3D transform of the selected bone.
 */
@GodotBaseType
public open class BoneAttachment3D : Node3D() {
  /**
   * The name of the attached bone.
   */
  public var boneName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT3D_GET_BONE_NAME,
          STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT3D_SET_BONE_NAME,
          NIL)
    }

  /**
   * The index of the attached bone.
   */
  public var boneIdx: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT3D_GET_BONE_IDX,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT3D_SET_BONE_IDX,
          NIL)
    }

  /**
   * Whether the BoneAttachment3D node will override the bone pose of the bone it is attached to. When set to `true`, the BoneAttachment3D node can change the pose of the bone. When set to `false`, the BoneAttachment3D will always be set to the bone's transform.
   */
  public var overridePose: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT3D_GET_OVERRIDE_POSE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT3D_SET_OVERRIDE_POSE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BONEATTACHMENT3D, scriptIndex)
    return true
  }

  /**
   * A function that is called automatically when the [godot.Skeleton3D] the BoneAttachment3D node is using has a bone that has changed its pose. This function is where the BoneAttachment3D node updates its position so it is correctly bound when it is *not* set to override the bone pose.
   */
  public fun onBonePoseUpdate(boneIndex: Int): Unit {
    TransferContext.writeArguments(LONG to boneIndex.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT3D_ON_BONE_POSE_UPDATE, NIL)
  }

  /**
   * Sets whether the BoneAttachment3D node will use an external [godot.Skeleton3D] node rather than attempting to use its parent node as the [godot.Skeleton3D]. When set to `true`, the BoneAttachment3D node will use the external [godot.Skeleton3D] node set in [setExternalSkeleton].
   */
  public fun setUseExternalSkeleton(useExternalSkeleton: Boolean): Unit {
    TransferContext.writeArguments(BOOL to useExternalSkeleton)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT3D_SET_USE_EXTERNAL_SKELETON, NIL)
  }

  /**
   * Returns whether the BoneAttachment3D node is using an external [godot.Skeleton3D] rather than attempting to use its parent node as the [godot.Skeleton3D].
   */
  public fun getUseExternalSkeleton(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT3D_GET_USE_EXTERNAL_SKELETON, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the [godot.core.NodePath] to the external skeleton that the BoneAttachment3D node should use. See [setUseExternalSkeleton] to enable the external [godot.Skeleton3D] node.
   */
  public fun setExternalSkeleton(externalSkeleton: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to externalSkeleton)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT3D_SET_EXTERNAL_SKELETON, NIL)
  }

  /**
   * Returns the [godot.core.NodePath] to the external [godot.Skeleton3D] node, if one has been set.
   */
  public fun getExternalSkeleton(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT3D_GET_EXTERNAL_SKELETON, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public companion object
}

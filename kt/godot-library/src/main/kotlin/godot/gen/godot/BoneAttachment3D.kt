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
 * A node that will attach to a bone.
 *
 * This node will allow you to select a bone for this node to attach to. The BoneAttachment3D node can copy the transform of the select bone, or can override the transform of the selected bone.
 *
 * The BoneAttachment3D node must either be a child of a [godot.Skeleton3D] node or be given an external [godot.Skeleton3D] to use in order to function properly.
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
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT3D_SET_BONE_NAME,
          NIL)
    }

  /**
   * The index of the attached bone.
   */
  public var boneIdx: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT3D_GET_BONE_IDX,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT3D_SET_BONE_IDX,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BONEATTACHMENT3D, scriptIndex)
    return true
  }

  /**
   * A function that is called automatically when the [godot.Skeleton3D] the BoneAttachment3D node is using has a bone that has changed its pose. This function is where the BoneAttachment3D node updates its position so it is correctly bound when it is *not* set to override the bone pose.
   */
  public fun onBonePoseUpdate(boneIndex: Long): Unit {
    TransferContext.writeArguments(LONG to boneIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT3D_ON_BONE_POSE_UPDATE, NIL)
  }

  /**
   * Sets whether the BoneAttachment3D node will override the bone pose of the bone it is attached to. When set to `true`, the BoneAttachment3D node can change the pose of the bone.
   */
  public fun setOverridePose(overridePose: Boolean): Unit {
    TransferContext.writeArguments(BOOL to overridePose)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT3D_SET_OVERRIDE_POSE,
        NIL)
  }

  /**
   * Returns whether the BoneAttachment3D node is overriding the bone pose of the bone it's attached to.
   */
  public fun getOverridePose(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT3D_GET_OVERRIDE_POSE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Deprecated. Local pose overrides will be removed.
   *
   * Sets the override mode for the BoneAttachment3D node (0=global / 1=local). The override mode defines which of the bone poses the BoneAttachment3D node will override.
   */
  public fun setOverrideMode(overrideMode: Long): Unit {
    TransferContext.writeArguments(LONG to overrideMode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT3D_SET_OVERRIDE_MODE,
        NIL)
  }

  /**
   * Deprecated. Local pose overrides will be removed.
   *
   * Returns the override mode for the BoneAttachment3D node (0=global / 1=local).
   */
  public fun getOverrideMode(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BONEATTACHMENT3D_GET_OVERRIDE_MODE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets whether the BoneAttachment3D node will use an extenral [godot.Skeleton3D] node rather than attenpting to use its parent node as the [godot.Skeleton3D]. When set to `true`, the BoneAttachment3D node will use the external [godot.Skeleton3D] node set in `set_external_skeleton`.
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
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the [godot.core.NodePath] to the external skeleton that the BoneAttachment3D node should use. The external [godot.Skeleton3D] node is only used when `use_external_skeleton` is set to `true`.
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
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  public companion object
}

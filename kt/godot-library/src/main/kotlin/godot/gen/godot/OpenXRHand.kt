// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * This node enables OpenXR's hand tracking functionality. The node should be a child node of an
 * [XROrigin3D] node, tracking will update its position to the player's tracked hand Palm joint
 * location (the center of the middle finger's metacarpal bone). This node also updates the skeleton of
 * a properly skinned hand or avatar model.
 * If the skeleton is a hand (one of the hand bones is the root node of the skeleton), then the
 * skeleton will be placed relative to the hand palm location and the hand mesh and skeleton should be
 * children of the OpenXRHand node.
 * If the hand bones are part of a full skeleton, then the root of the hand will keep its location
 * with the assumption that IK is used to position the hand and arm.
 * By default the skeleton hand bones are repositioned to match the size of the tracked hand. To
 * preserve the modeled bone sizes change [boneUpdate] to apply rotation only.
 */
@GodotBaseType
public open class OpenXRHand : Node3D() {
  /**
   * Specifies whether this node tracks the left or right hand of the player.
   */
  public var hand: Hands
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHandPtr, LONG)
      return OpenXRHand.Hands.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setHandPtr, NIL)
    }

  /**
   * Set the motion range (if supported) limiting the hand motion.
   */
  public var motionRange: MotionRange
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMotionRangePtr, LONG)
      return OpenXRHand.MotionRange.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMotionRangePtr, NIL)
    }

  /**
   * Set a [Skeleton3D] node for which the pose positions will be updated.
   */
  public var handSkeleton: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHandSkeletonPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHandSkeletonPtr, NIL)
    }

  /**
   * Set the type of skeleton rig the [handSkeleton] is compliant with.
   */
  public var skeletonRig: SkeletonRig
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkeletonRigPtr, LONG)
      return OpenXRHand.SkeletonRig.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSkeletonRigPtr, NIL)
    }

  /**
   * Specify the type of updates to perform on the bone.
   */
  public var boneUpdate: BoneUpdate
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBoneUpdatePtr, LONG)
      return OpenXRHand.BoneUpdate.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBoneUpdatePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OPENXRHAND, scriptIndex)
    return true
  }

  public enum class Hands(
    id: Long,
  ) {
    /**
     * Tracking the player's left hand.
     */
    HAND_LEFT(0),
    /**
     * Tracking the player's right hand.
     */
    HAND_RIGHT(1),
    /**
     * Maximum supported hands.
     */
    HAND_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Hands = entries.single { it.id == `value` }
    }
  }

  public enum class MotionRange(
    id: Long,
  ) {
    /**
     * When player grips, hand skeleton will form a full fist.
     */
    MOTION_RANGE_UNOBSTRUCTED(0),
    /**
     * When player grips, hand skeleton conforms to the controller the player is holding.
     */
    MOTION_RANGE_CONFORM_TO_CONTROLLER(1),
    /**
     * Maximum supported motion ranges.
     */
    MOTION_RANGE_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): MotionRange = entries.single { it.id == `value` }
    }
  }

  public enum class SkeletonRig(
    id: Long,
  ) {
    /**
     * An OpenXR compliant skeleton.
     */
    SKELETON_RIG_OPENXR(0),
    /**
     * A [SkeletonProfileHumanoid] compliant skeleton.
     */
    SKELETON_RIG_HUMANOID(1),
    /**
     * Maximum supported hands.
     */
    SKELETON_RIG_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class BoneUpdate(
    id: Long,
  ) {
    /**
     * The skeletons bones are fully updated (both position and rotation) to match the tracked
     * bones.
     */
    BONE_UPDATE_FULL(0),
    /**
     * The skeletons bones are only rotated to align with the tracked bones, preserving bone length.
     */
    BONE_UPDATE_ROTATION_ONLY(1),
    /**
     * Maximum supported bone update mode.
     */
    BONE_UPDATE_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setHandPtr: VoidPtr = TypeManager.getMethodBindPtr("OpenXRHand", "set_hand")

    public val getHandPtr: VoidPtr = TypeManager.getMethodBindPtr("OpenXRHand", "get_hand")

    public val setHandSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRHand", "set_hand_skeleton")

    public val getHandSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRHand", "get_hand_skeleton")

    public val setMotionRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRHand", "set_motion_range")

    public val getMotionRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRHand", "get_motion_range")

    public val setSkeletonRigPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRHand", "set_skeleton_rig")

    public val getSkeletonRigPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRHand", "get_skeleton_rig")

    public val setBoneUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRHand", "set_bone_update")

    public val getBoneUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRHand", "get_bone_update")
  }
}

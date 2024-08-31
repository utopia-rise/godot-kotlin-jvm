// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * This node uses hand tracking data from an [XRHandTracker] to pose the skeleton of a hand mesh.
 * Positioning of hands is performed by creating an [XRNode3D] ancestor of the hand mesh driven by
 * the same [XRHandTracker].
 * The hand tracking position-data is scaled by [Skeleton3D.motionScale] when applied to the
 * skeleton, which can be used to adjust the tracked hand to match the scale of the hand model.
 */
@GodotBaseType
public open class XRHandModifier3D : SkeletonModifier3D() {
  /**
   * The name of the [XRHandTracker] registered with [XRServer] to obtain the hand tracking data
   * from.
   */
  public var handTracker: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHandTrackerPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHandTrackerPtr, NIL)
    }

  /**
   * Specifies the type of updates to perform on the bones.
   */
  public var boneUpdate: BoneUpdate
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBoneUpdatePtr, LONG)
      return XRHandModifier3D.BoneUpdate.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBoneUpdatePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_XRHANDMODIFIER3D, scriptIndex)
    return true
  }

  public enum class BoneUpdate(
    id: Long,
  ) {
    /**
     * The skeleton's bones are fully updated (both position and rotation) to match the tracked
     * bones.
     */
    BONE_UPDATE_FULL(0),
    /**
     * The skeleton's bones are only rotated to align with the tracked bones, preserving bone
     * length.
     */
    BONE_UPDATE_ROTATION_ONLY(1),
    /**
     * Represents the size of the [BoneUpdate] enum.
     */
    BONE_UPDATE_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BoneUpdate = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setHandTrackerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandModifier3D", "set_hand_tracker")

    public val getHandTrackerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandModifier3D", "get_hand_tracker")

    public val setBoneUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandModifier3D", "set_bone_update")

    public val getBoneUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRHandModifier3D", "get_bone_update")
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.RID
import godot.core.Signal0
import godot.core.Transform2D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.TRANSFORM2D
import godot.core.VariantParser._RID
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * [Skeleton2D] parents a hierarchy of [Bone2D] nodes. It holds a reference to each [Bone2D]'s rest
 * pose and acts as a single point of access to its bones.
 *
 * To set up different types of inverse kinematics for the given Skeleton2D, a
 * [SkeletonModificationStack2D] should be created. The inverse kinematics be applied by increasing
 * [SkeletonModificationStack2D.modificationCount] and creating the desired number of modifications.
 */
@GodotBaseType
public open class Skeleton2D : Node2D() {
  /**
   * Emitted when the [Bone2D] setup attached to this skeletons changes. This is primarily used
   * internally within the skeleton.
   */
  public val boneSetupChanged: Signal0 by Signal0

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(610, scriptPtr)
  }

  /**
   * Returns the number of [Bone2D] nodes in the node hierarchy parented by Skeleton2D.
   */
  public final fun getBoneCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBoneCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns a [Bone2D] from the node hierarchy parented by Skeleton2D. The object to return is
   * identified by the parameter [idx]. Bones are indexed by descending the node hierarchy from top to
   * bottom, adding the children of each branch before moving to the next sibling.
   */
  public final fun getBone(idx: Int): Bone2D? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBonePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Bone2D?)
  }

  /**
   * Returns the [RID] of a Skeleton2D instance.
   */
  public final fun getSkeleton(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkeletonPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Sets the [SkeletonModificationStack2D] attached to this skeleton.
   */
  public final fun setModificationStack(modificationStack: SkeletonModificationStack2D?): Unit {
    TransferContext.writeArguments(OBJECT to modificationStack)
    TransferContext.callMethod(ptr, MethodBindings.setModificationStackPtr, NIL)
  }

  /**
   * Returns the [SkeletonModificationStack2D] attached to this skeleton, if one exists.
   */
  public final fun getModificationStack(): SkeletonModificationStack2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getModificationStackPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as SkeletonModificationStack2D?)
  }

  /**
   * Executes all the modifications on the [SkeletonModificationStack2D], if the Skeleton2D has one
   * assigned.
   */
  public final fun executeModifications(delta: Float, executionMode: Int): Unit {
    TransferContext.writeArguments(DOUBLE to delta.toDouble(), LONG to executionMode.toLong())
    TransferContext.callMethod(ptr, MethodBindings.executeModificationsPtr, NIL)
  }

  /**
   * Sets the local pose transform, [overridePose], for the bone at [boneIdx].
   *
   * [strength] is the interpolation strength that will be used when applying the pose, and
   * [persistent] determines if the applied pose will remain.
   *
   * **Note:** The pose transform needs to be a local transform relative to the [Bone2D] node at
   * [boneIdx]!
   */
  public final fun setBoneLocalPoseOverride(
    boneIdx: Int,
    overridePose: Transform2D,
    strength: Float,
    persistent: Boolean,
  ): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), TRANSFORM2D to overridePose, DOUBLE to strength.toDouble(), BOOL to persistent)
    TransferContext.callMethod(ptr, MethodBindings.setBoneLocalPoseOverridePtr, NIL)
  }

  /**
   * Returns the local pose override transform for [boneIdx].
   */
  public final fun getBoneLocalPoseOverride(boneIdx: Int): Transform2D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBoneLocalPoseOverridePtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  public companion object

  public object MethodBindings {
    internal val getBoneCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton2D", "get_bone_count", 3905245786)

    internal val getBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton2D", "get_bone", 2556267111)

    internal val getSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton2D", "get_skeleton", 2944877500)

    internal val setModificationStackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton2D", "set_modification_stack", 3907307132)

    internal val getModificationStackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton2D", "get_modification_stack", 2107508396)

    internal val executeModificationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton2D", "execute_modifications", 1005356550)

    internal val setBoneLocalPoseOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton2D", "set_bone_local_pose_override", 555457532)

    internal val getBoneLocalPoseOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton2D", "get_bone_local_pose_override", 2995540667)
  }
}

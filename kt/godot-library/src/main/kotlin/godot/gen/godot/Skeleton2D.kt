// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Skeleton for 2D characters and animated objects.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/2d_skeletons.html]($DOCS_URL/tutorials/animation/2d_skeletons.html)
 *
 * Skeleton2D parents a hierarchy of [godot.Bone2D] objects. It is a requirement of [godot.Bone2D]. Skeleton2D holds a reference to the rest pose of its children and acts as a single point of access to its bones.
 */
@GodotBaseType
public open class Skeleton2D : Node2D() {
  /**
   *
   */
  public val boneSetupChanged: Signal0 by signal()

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SKELETON2D)
  }

  public open fun _updateBoneSetup(): Unit {
  }

  public open fun _updateTransform(): Unit {
  }

  /**
   * Returns a [godot.Bone2D] from the node hierarchy parented by Skeleton2D. The object to return is identified by the parameter `idx`. Bones are indexed by descending the node hierarchy from top to bottom, adding the children of each branch before moving to the next sibling.
   */
  public open fun getBone(idx: Long): Bone2D? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON2D_GET_BONE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Bone2D?
  }

  /**
   * Returns the number of [godot.Bone2D] nodes in the node hierarchy parented by Skeleton2D.
   */
  public open fun getBoneCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON2D_GET_BONE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [RID] of a Skeleton2D instance.
   */
  public open fun getSkeleton(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON2D_GET_SKELETON, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }
}

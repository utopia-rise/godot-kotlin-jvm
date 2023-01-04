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
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A modification that rotates a bone to look at a target.
 *
 * This [godot.SkeletonModification3D] rotates a bone to look a target. This is extremely helpful for moving character's heads to look at the player, rotating a turret to look at a target, or any other case where you want to make a bone rotate towards something quickly and easily.
 */
@GodotBaseType
public open class SkeletonModification3DLookAt : SkeletonModification3D() {
  /**
   * The name of the bone that should be operated on by this modification.
   *
   * When possible, this will also update the [boneIndex] based on data provided by the [godot.Skeleton3D].
   */
  public var boneName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DLOOKAT_GET_BONE_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DLOOKAT_SET_BONE_NAME, NIL)
    }

  /**
   * The bone index of the bone that should be operated on by this modification.
   *
   * When possible, this will also update the [boneName] based on data provided by the [godot.Skeleton3D].
   */
  public var boneIndex: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DLOOKAT_GET_BONE_INDEX, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DLOOKAT_SET_BONE_INDEX, NIL)
    }

  /**
   * The NodePath to the node that is the target for the modification.
   */
  public var targetNodepath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DLOOKAT_GET_TARGET_NODE, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DLOOKAT_SET_TARGET_NODE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION3DLOOKAT, scriptIndex)
    return true
  }

  /**
   * Sets the amount of extra rotation to be applied after the LookAt modification executes. This allows you to adjust the finished result.
   */
  public fun setAdditionalRotation(additionalRotation: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to additionalRotation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DLOOKAT_SET_ADDITIONAL_ROTATION, NIL)
  }

  /**
   * Returns the amount of extra rotation that is applied to the bone after the LookAt modification executes.
   */
  public fun getAdditionalRotation(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DLOOKAT_GET_ADDITIONAL_ROTATION, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * When `true`, the LookAt modification will limit its rotation to a single plane in 3D space. The plane used can be configured using the `set_lock_rotation_plane` function.
   */
  public fun setLockRotationToPlane(lockToPlane: Boolean): Unit {
    TransferContext.writeArguments(BOOL to lockToPlane)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DLOOKAT_SET_LOCK_ROTATION_TO_PLANE, NIL)
  }

  /**
   * Returns whether the LookAt modification is limiting rotation to a single plane in 3D space.
   */
  public fun getLockRotationToPlane(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DLOOKAT_GET_LOCK_ROTATION_TO_PLANE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public fun setLockRotationPlane(plane: Long): Unit {
    TransferContext.writeArguments(LONG to plane)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DLOOKAT_SET_LOCK_ROTATION_PLANE, NIL)
  }

  /**
   * Returns the plane that the LookAt modification is limiting rotation to.
   */
  public fun getLockRotationPlane(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DLOOKAT_GET_LOCK_ROTATION_PLANE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public companion object
}

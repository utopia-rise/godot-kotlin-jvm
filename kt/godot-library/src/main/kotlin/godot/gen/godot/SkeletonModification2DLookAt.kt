// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A modification that rotates a [godot.Bone2D] node to look at a target.
 *
 * This [godot.SkeletonModification2D] rotates a bone to look a target. This is extremely helpful for moving character's head to look at the player, rotating a turret to look at a target, or any other case where you want to make a bone rotate towards something quickly and easily.
 */
@GodotBaseType
public open class SkeletonModification2DLookAt : SkeletonModification2D() {
  /**
   * The index of the [godot.Bone2D] node that the modification will oeprate on.
   */
  public var boneIndex: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DLOOKAT_GET_BONE_INDEX, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DLOOKAT_SET_BONE_INDEX, NIL)
    }

  /**
   * The [godot.Bone2D] node that the modification will operate on.
   */
  public var bone2dNode: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DLOOKAT_GET_BONE2D_NODE, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DLOOKAT_SET_BONE2D_NODE, NIL)
    }

  /**
   * The NodePath to the node that is the target for the LookAt modification. This node is what the modification will rotate the [godot.Bone2D] to.
   */
  public var targetNodepath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DLOOKAT_GET_TARGET_NODE, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DLOOKAT_SET_TARGET_NODE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION2DLOOKAT, scriptIndex)
    return true
  }

  /**
   * Sets the amount of additional rotation that is to be applied after executing the modification. This allows for offsetting the results by the inputted rotation amount.
   */
  public fun setAdditionalRotation(rotation: Double): Unit {
    TransferContext.writeArguments(DOUBLE to rotation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DLOOKAT_SET_ADDITIONAL_ROTATION, NIL)
  }

  /**
   * Returns the amount of additional rotation that is applied after the LookAt modification executes.
   */
  public fun getAdditionalRotation(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DLOOKAT_GET_ADDITIONAL_ROTATION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets whether this modification will use constraints or not. When `true`, constraints will be applied when solving the LookAt modification.
   */
  public fun setEnableConstraint(enableConstraint: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enableConstraint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DLOOKAT_SET_ENABLE_CONSTRAINT, NIL)
  }

  /**
   * Returns `true` if the LookAt modification is using constraints.
   */
  public fun getEnableConstraint(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DLOOKAT_GET_ENABLE_CONSTRAINT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the constraint's minimum allowed angle.
   */
  public fun setConstraintAngleMin(angleMin: Double): Unit {
    TransferContext.writeArguments(DOUBLE to angleMin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DLOOKAT_SET_CONSTRAINT_ANGLE_MIN, NIL)
  }

  /**
   * Returns the constraint's minimum allowed angle.
   */
  public fun getConstraintAngleMin(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DLOOKAT_GET_CONSTRAINT_ANGLE_MIN, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the constraint's maximum allowed angle.
   */
  public fun setConstraintAngleMax(angleMax: Double): Unit {
    TransferContext.writeArguments(DOUBLE to angleMax)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DLOOKAT_SET_CONSTRAINT_ANGLE_MAX, NIL)
  }

  /**
   * Returns the constraint's maximum allowed angle.
   */
  public fun getConstraintAngleMax(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DLOOKAT_GET_CONSTRAINT_ANGLE_MAX, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * When `true`, the modification will use an inverted joint constraint.
   *
   * An inverted joint constraint only constraints the [godot.Bone2D] to the angles *outside of* the inputted minimum and maximum angles. For this reason, it is referred to as an inverted joint constraint, as it constraints the joint to the outside of the inputted values.
   */
  public fun setConstraintAngleInvert(invert: Boolean): Unit {
    TransferContext.writeArguments(BOOL to invert)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DLOOKAT_SET_CONSTRAINT_ANGLE_INVERT, NIL)
  }

  /**
   * Returns whether the constraints to this modification are inverted or not.
   */
  public fun getConstraintAngleInvert(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DLOOKAT_GET_CONSTRAINT_ANGLE_INVERT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A modification that jiggles bones as they move towards a target.
 *
 * This modification moves a series of bones, typically called a bone chain, towards a target. What makes this modification special is that it calculates the velocity and acceleration for each bone in the bone chain, and runs a very light physics-like calculation using the inputted values. This allows the bones to overshoot the target and "jiggle" around. It can be configured to act more like a spring, or sway around like cloth might.
 *
 * This modification is useful for adding additional motion to things like hair, the edges of clothing, and more. It has several settings to that allow control over how the joint moves when the target moves.
 *
 * **Note:** The Jiggle modifier has `jiggle_joints`, which are the data objects that hold the data for each joint in the Jiggle chain. This is different from a bone! Jiggle joints hold the data needed for each bone in the bone chain used by the Jiggle modification.
 */
@GodotBaseType
public open class SkeletonModification3DJiggle : SkeletonModification3D() {
  /**
   * The NodePath to the node that is the target for the Jiggle modification. This node is what the Jiggle chain will attempt to rotate the bone chain to.
   */
  public open var targetNodepath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_GET_TARGET_NODEPATH, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_SET_TARGET_NODEPATH, NIL)
    }

  /**
   * The amount of Jiggle joints in the Jiggle modification.
   */
  public open var jiggleDataChainLength: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_GET_JIGGLE_DATA_CHAIN_LENGTH, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_SET_JIGGLE_DATA_CHAIN_LENGTH, NIL)
    }

  /**
   * The default amount of stiffness assigned to the Jiggle joints, if they are not overridden. Higher values act more like springs, quickly moving into the correct position.
   */
  public open var stiffness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_GET_STIFFNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_SET_STIFFNESS, NIL)
    }

  /**
   * The default amount of mass assigned to the Jiggle joints, if they are not overridden. Higher values lead to faster movements and more overshooting.
   */
  public open var mass: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_GET_MASS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_SET_MASS, NIL)
    }

  /**
   * The default amount of dampening applied to the Jiggle joints, if they are not overridden. Higher values lead to more of the calculated velocity being applied.
   */
  public open var damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_GET_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_SET_DAMPING, NIL)
    }

  /**
   * Whether the gravity vector, [gravity], should be applied to the Jiggle joints, assuming they are not overriding the default settings.
   */
  public open var useGravity: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_GET_USE_GRAVITY, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_SET_USE_GRAVITY, NIL)
    }

  /**
   * The default amount of gravity applied to the Jiggle joints, if they are not overridden.
   */
  public open var gravity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_GET_GRAVITY, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_SET_GRAVITY, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION3DJIGGLE)
  }

  /**
   * When `true`, the Jiggle modifier will use raycasting to prevent the Jiggle joints from rotating themselves into collision objects when solving.
   */
  public open fun setUseColliders(useColliders: Boolean): Unit {
    TransferContext.writeArguments(BOOL to useColliders)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_SET_USE_COLLIDERS, NIL)
  }

  /**
   * Returns whether the Jiggle modifier is taking physics colliders into account when solving.
   */
  public open fun getUseColliders(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_GET_USE_COLLIDERS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the collision mask that the Jiggle modifier takes into account when performing physics calculations.
   */
  public open fun setCollisionMask(mask: Long): Unit {
    TransferContext.writeArguments(LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_SET_COLLISION_MASK, NIL)
  }

  /**
   * Returns the collision mask that the Jiggle modifier will take into account when performing physics calculations.
   */
  public open fun getCollisionMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_GET_COLLISION_MASK, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the bone name, `bone_name`, of the Jiggle joint at `joint_idx`. When possible, this will also update the `bone_index` of the Jiggle joint based on data provided by the [godot.Skeleton3D].
   */
  public open fun setJiggleJointBoneName(jointIdx: Long, name: String): Unit {
    TransferContext.writeArguments(LONG to jointIdx, STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_SET_JIGGLE_JOINT_BONE_NAME, NIL)
  }

  /**
   * Returns the name of the bone that is assigned to the Jiggle joint at `joint_idx`.
   */
  public open fun getJiggleJointBoneName(jointIdx: Long): String {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_GET_JIGGLE_JOINT_BONE_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets the bone index, `bone_index`, of the Jiggle joint at `joint_idx`. When possible, this will also update the `bone_name` of the Jiggle joint based on data provided by the [godot.Skeleton3D].
   */
  public open fun setJiggleJointBoneIndex(jointIdx: Long, boneIdx: Long): Unit {
    TransferContext.writeArguments(LONG to jointIdx, LONG to boneIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_SET_JIGGLE_JOINT_BONE_INDEX, NIL)
  }

  /**
   * Returns the bone index of the bone assigned to the Jiggle joint at `joint_idx`.
   */
  public open fun getJiggleJointBoneIndex(jointIdx: Long): Long {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_GET_JIGGLE_JOINT_BONE_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets whether the Jiggle joint at `joint_idx` should override the default Jiggle joint settings. Setting this to true will make the joint use its own settings rather than the default ones attached to the modification.
   */
  public open fun setJiggleJointOverride(jointIdx: Long, `override`: Boolean): Unit {
    TransferContext.writeArguments(LONG to jointIdx, BOOL to override)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_SET_JIGGLE_JOINT_OVERRIDE, NIL)
  }

  /**
   * Returns a boolean that indicates whether the joint at `joint_idx` is overriding the default jiggle joint data defined in the modification.
   */
  public open fun getJiggleJointOverride(jointIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_GET_JIGGLE_JOINT_OVERRIDE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the of stiffness of the Jiggle joint at `joint_idx`.
   */
  public open fun setJiggleJointStiffness(jointIdx: Long, stiffness: Double): Unit {
    TransferContext.writeArguments(LONG to jointIdx, DOUBLE to stiffness)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_SET_JIGGLE_JOINT_STIFFNESS, NIL)
  }

  /**
   * Returns the stiffness of the Jiggle joint at `joint_idx`.
   */
  public open fun getJiggleJointStiffness(jointIdx: Long): Double {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_GET_JIGGLE_JOINT_STIFFNESS, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the of mass of the Jiggle joint at `joint_idx`.
   */
  public open fun setJiggleJointMass(jointIdx: Long, mass: Double): Unit {
    TransferContext.writeArguments(LONG to jointIdx, DOUBLE to mass)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_SET_JIGGLE_JOINT_MASS, NIL)
  }

  /**
   * Returns the amount of mass of the Jiggle joint at `joint_idx`.
   */
  public open fun getJiggleJointMass(jointIdx: Long): Double {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_GET_JIGGLE_JOINT_MASS, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the amount of dampening of the Jiggle joint at `joint_idx`.
   */
  public open fun setJiggleJointDamping(jointIdx: Long, damping: Double): Unit {
    TransferContext.writeArguments(LONG to jointIdx, DOUBLE to damping)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_SET_JIGGLE_JOINT_DAMPING, NIL)
  }

  /**
   * Returns the amount of dampening of the Jiggle joint at `joint_idx`.
   */
  public open fun getJiggleJointDamping(jointIdx: Long): Double {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_GET_JIGGLE_JOINT_DAMPING, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets whether the Jiggle joint at `joint_idx` should use gravity.
   */
  public open fun setJiggleJointUseGravity(jointIdx: Long, useGravity: Boolean): Unit {
    TransferContext.writeArguments(LONG to jointIdx, BOOL to useGravity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_SET_JIGGLE_JOINT_USE_GRAVITY, NIL)
  }

  /**
   * Returns a boolean that indicates whether the joint at `joint_idx` is using gravity or not.
   */
  public open fun getJiggleJointUseGravity(jointIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_GET_JIGGLE_JOINT_USE_GRAVITY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the gravity vector of the Jiggle joint at `joint_idx`.
   */
  public open fun setJiggleJointGravity(jointIdx: Long, gravity: Vector3): Unit {
    TransferContext.writeArguments(LONG to jointIdx, VECTOR3 to gravity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_SET_JIGGLE_JOINT_GRAVITY, NIL)
  }

  /**
   * Returns a [godot.core.Vector3] representign the amount of gravity the Jiggle joint at `joint_idx` is influenced by.
   */
  public open fun getJiggleJointGravity(jointIdx: Long): Vector3 {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_GET_JIGGLE_JOINT_GRAVITY, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Sets the amount of roll/twist on the bone the Jiggle joint is attached to.
   */
  public open fun setJiggleJointRoll(jointIdx: Long, roll: Double): Unit {
    TransferContext.writeArguments(LONG to jointIdx, DOUBLE to roll)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_SET_JIGGLE_JOINT_ROLL, NIL)
  }

  /**
   * Returns the amount of roll/twist applied to the bone that the Jiggle joint is applied to.
   */
  public open fun getJiggleJointRoll(jointIdx: Long): Double {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DJIGGLE_GET_JIGGLE_JOINT_ROLL, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public companion object
}

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
import godot.core.NodePath
import godot.core.Quaternion
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.QUATERNION
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import godot.core.asCachedNodePath
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Base class of [SkeletonModifier3D] to approach the goal by repeating small rotations.
 *
 * Each bone chain (setting) has one effector, which is processed in order of the setting list. You
 * can set some limitations for each joint.
 */
@GodotBaseType
public open class IterateIK3D internal constructor() : ChainIK3D() {
  /**
   * The number of iteration loops used by the IK solver to produce more accurate results.
   */
  public final inline var maxIterations: Int
    @JvmName("maxIterationsProperty")
    get() = getMaxIterations()
    @JvmName("maxIterationsProperty")
    set(`value`) {
      setMaxIterations(value)
    }

  /**
   * The minimum distance between the end bone and the target. If the distance is below this value,
   * the IK solver stops any further iterations.
   */
  public final inline var minDistance: Double
    @JvmName("minDistanceProperty")
    get() = getMinDistance()
    @JvmName("minDistanceProperty")
    set(`value`) {
      setMinDistance(value)
    }

  /**
   * The maximum amount each bone can rotate in a single iteration.
   *
   * **Note:** This limitation is applied during each iteration. For example, if [maxIterations] is
   * `4` and [angularDeltaLimit] is `5` degrees, the maximum rotation possible in a single frame is
   * `20` degrees.
   */
  public final inline var angularDeltaLimit: Double
    @JvmName("angularDeltaLimitProperty")
    get() = getAngularDeltaLimit()
    @JvmName("angularDeltaLimitProperty")
    set(`value`) {
      setAngularDeltaLimit(value)
    }

  /**
   * If `false`, the result is calculated from the previous frame's [IterateIK3D] result as the
   * initial state.
   *
   * If `true`, the previous frame's [IterateIK3D] result is discarded. At this point, the new
   * result is calculated from the bone pose excluding the [IterateIK3D] as the initial state. This
   * means the result will be always equal as long as the target position and the previous bone pose
   * are the same. However, if [angularDeltaLimit] and [maxIterations] are set too small, the end bone
   * of the chain will never reach the target.
   */
  public final inline var deterministic: Boolean
    @JvmName("deterministicProperty")
    get() = isDeterministic()
    @JvmName("deterministicProperty")
    set(`value`) {
      setDeterministic(value)
    }

  /**
   * The number of settings.
   */
  public final inline var settingCount: Int
    @JvmName("settingCountProperty")
    get() = getSettingCount()
    @JvmName("settingCountProperty")
    set(`value`) {
      setSettingCount(value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(325, scriptPtr)
  }

  public final fun setMaxIterations(maxIterations: Int): Unit {
    TransferContext.writeArguments(LONG to maxIterations.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMaxIterationsPtr, NIL)
  }

  public final fun getMaxIterations(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxIterationsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMinDistance(minDistance: Double): Unit {
    TransferContext.writeArguments(DOUBLE to minDistance)
    TransferContext.callMethod(ptr, MethodBindings.setMinDistancePtr, NIL)
  }

  public final fun getMinDistance(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMinDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setAngularDeltaLimit(angularDeltaLimit: Double): Unit {
    TransferContext.writeArguments(DOUBLE to angularDeltaLimit)
    TransferContext.callMethod(ptr, MethodBindings.setAngularDeltaLimitPtr, NIL)
  }

  public final fun getAngularDeltaLimit(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAngularDeltaLimitPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setDeterministic(deterministic: Boolean): Unit {
    TransferContext.writeArguments(BOOL to deterministic)
    TransferContext.callMethod(ptr, MethodBindings.setDeterministicPtr, NIL)
  }

  public final fun isDeterministic(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDeterministicPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the target node that the end bone is trying to reach.
   */
  public final fun setTargetNode(index: Int, targetNode: NodePath): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), NODE_PATH to targetNode)
    TransferContext.callMethod(ptr, MethodBindings.setTargetNodePtr, NIL)
  }

  /**
   * Returns the target node that the end bone is trying to reach.
   */
  public final fun getTargetNode(index: Int): NodePath {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTargetNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Sets the rotation axis at [joint] in the bone chain's joint list.
   *
   * The axes are based on the [Skeleton3D.getBoneRest]'s space, if [axis] is
   * [SkeletonModifier3D.ROTATION_AXIS_CUSTOM], you can specify any axis.
   *
   * **Note:** The rotation axis and the forward vector shouldn't be colinear to avoid unintended
   * rotation since [ChainIK3D] does not factor in twisting forces.
   */
  public final fun setJointRotationAxis(
    index: Int,
    joint: Int,
    axis: SkeletonModifier3D.RotationAxis,
  ): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong(), LONG to axis.value)
    TransferContext.callMethod(ptr, MethodBindings.setJointRotationAxisPtr, NIL)
  }

  /**
   * Returns the rotation axis at [joint] in the bone chain's joint list.
   */
  public final fun getJointRotationAxis(index: Int, joint: Int): SkeletonModifier3D.RotationAxis {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getJointRotationAxisPtr, LONG)
    return SkeletonModifier3D.RotationAxis.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the rotation axis vector for the specified joint in the bone chain.
   *
   * This vector is normalized by an internal process and represents the axis around which the bone
   * chain can rotate.
   *
   * If the vector length is `0`, it is considered synonymous with
   * [SkeletonModifier3D.ROTATION_AXIS_ALL].
   */
  public final fun setJointRotationAxisVector(
    index: Int,
    joint: Int,
    axisVector: Vector3,
  ): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong(), VECTOR3 to axisVector)
    TransferContext.callMethod(ptr, MethodBindings.setJointRotationAxisVectorPtr, NIL)
  }

  /**
   * Returns the rotation axis vector for the specified joint in the bone chain. This vector
   * represents the axis around which the joint can rotate. It is determined based on the rotation axis
   * set for the joint.
   *
   * If [getJointRotationAxis] is [SkeletonModifier3D.ROTATION_AXIS_ALL], this method returns
   * `Vector3(0, 0, 0)`.
   */
  public final fun getJointRotationAxisVector(index: Int, joint: Int): Vector3 {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getJointRotationAxisVectorPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the joint limitation at [joint] in the bone chain's joint list.
   */
  public final fun setJointLimitation(
    index: Int,
    joint: Int,
    limitation: JointLimitation3D?,
  ): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong(), OBJECT to limitation)
    TransferContext.callMethod(ptr, MethodBindings.setJointLimitationPtr, NIL)
  }

  /**
   * Returns the joint limitation at [joint] in the bone chain's joint list.
   */
  public final fun getJointLimitation(index: Int, joint: Int): JointLimitation3D? {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getJointLimitationPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as JointLimitation3D?)
  }

  /**
   * Sets the joint limitation right axis at [joint] in the bone chain's joint list.
   */
  public final fun setJointLimitationRightAxis(
    index: Int,
    joint: Int,
    direction: SkeletonModifier3D.SecondaryDirection,
  ): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong(), LONG to direction.value)
    TransferContext.callMethod(ptr, MethodBindings.setJointLimitationRightAxisPtr, NIL)
  }

  /**
   * Returns the joint limitation right axis at [joint] in the bone chain's joint list.
   */
  public final fun getJointLimitationRightAxis(index: Int, joint: Int):
      SkeletonModifier3D.SecondaryDirection {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getJointLimitationRightAxisPtr, LONG)
    return SkeletonModifier3D.SecondaryDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the optional joint limitation right axis vector at [joint] in the bone chain's joint list.
   */
  public final fun setJointLimitationRightAxisVector(
    index: Int,
    joint: Int,
    vector: Vector3,
  ): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong(), VECTOR3 to vector)
    TransferContext.callMethod(ptr, MethodBindings.setJointLimitationRightAxisVectorPtr, NIL)
  }

  /**
   * Returns the joint limitation right axis vector at [joint] in the bone chain's joint list.
   *
   * If [getJointLimitationRightAxis] is [SkeletonModifier3D.SECONDARY_DIRECTION_NONE], this method
   * returns `Vector3(0, 0, 0)`.
   */
  public final fun getJointLimitationRightAxisVector(index: Int, joint: Int): Vector3 {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getJointLimitationRightAxisVectorPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the joint limitation rotation offset at [joint] in the bone chain's joint list.
   *
   * Rotation is done in the local space which is constructed by the bone direction (in general
   * parent to child) as the +Y axis and [getJointLimitationRightAxisVector] as the +X axis.
   *
   * If the +X and +Y axes are not orthogonal, the +X axis is implicitly modified to make it
   * orthogonal.
   *
   * Also, if the length of [getJointLimitationRightAxisVector] is zero, the space is created by
   * rotating the bone rest using the shortest arc that rotates the +Y axis of the bone rest to match
   * the bone direction.
   */
  public final fun setJointLimitationRotationOffset(
    index: Int,
    joint: Int,
    offset: Quaternion,
  ): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong(), QUATERNION to offset)
    TransferContext.callMethod(ptr, MethodBindings.setJointLimitationRotationOffsetPtr, NIL)
  }

  /**
   * Returns the joint limitation rotation offset at [joint] in the bone chain's joint list.
   *
   * Rotation is done in the local space which is constructed by the bone direction (in general
   * parent to child) as the +Y axis and [getJointLimitationRightAxisVector] as the +X axis.
   *
   * If the +X and +Y axes are not orthogonal, the +X axis is implicitly modified to make it
   * orthogonal.
   *
   * Also, if the length of [getJointLimitationRightAxisVector] is zero, the space is created by
   * rotating the bone rest using the shortest arc that rotates the +Y axis of the bone rest to match
   * the bone direction.
   */
  public final fun getJointLimitationRotationOffset(index: Int, joint: Int): Quaternion {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getJointLimitationRotationOffsetPtr, QUATERNION)
    return (TransferContext.readReturnValue(QUATERNION) as Quaternion)
  }

  /**
   * Sets the target node that the end bone is trying to reach.
   */
  public final fun setTargetNode(index: Int, targetNode: String) =
      setTargetNode(index, targetNode.asCachedNodePath())

  public companion object

  public object MethodBindings {
    internal val setMaxIterationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "set_max_iterations", 1286410249)

    internal val getMaxIterationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "get_max_iterations", 3905245786)

    internal val setMinDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "set_min_distance", 373806689)

    internal val getMinDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "get_min_distance", 1740695150)

    internal val setAngularDeltaLimitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "set_angular_delta_limit", 373806689)

    internal val getAngularDeltaLimitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "get_angular_delta_limit", 1740695150)

    internal val setDeterministicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "set_deterministic", 2586408642)

    internal val isDeterministicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "is_deterministic", 36873697)

    internal val setTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "set_target_node", 2761262315)

    internal val getTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "get_target_node", 408788394)

    internal val setJointRotationAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "set_joint_rotation_axis", 1391134969)

    internal val getJointRotationAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "get_joint_rotation_axis", 3312594080)

    internal val setJointRotationAxisVectorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "set_joint_rotation_axis_vector", 2866752138)

    internal val getJointRotationAxisVectorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "get_joint_rotation_axis_vector", 1592972041)

    internal val setJointLimitationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "set_joint_limitation", 1194636955)

    internal val getJointLimitationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "get_joint_limitation", 91665146)

    internal val setJointLimitationRightAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "set_joint_limitation_right_axis", 3838967147)

    internal val getJointLimitationRightAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "get_joint_limitation_right_axis", 623936134)

    internal val setJointLimitationRightAxisVectorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "set_joint_limitation_right_axis_vector", 2866752138)

    internal val getJointLimitationRightAxisVectorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "get_joint_limitation_right_axis_vector", 1592972041)

    internal val setJointLimitationRotationOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "set_joint_limitation_rotation_offset", 4188936002)

    internal val getJointLimitationRotationOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("IterateIK3D", "get_joint_limitation_rotation_offset", 2722473700)
  }
}

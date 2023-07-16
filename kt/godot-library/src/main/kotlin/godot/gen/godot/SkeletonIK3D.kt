// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.StringName
import godot.core.Transform3D
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A node used to rotate all bones of a [godot.Skeleton3D] bone chain a way that places the end bone at a desired 3D position.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/523](https://godotengine.org/asset-library/asset/523)
 *
 * SkeletonIK3D is used to rotate all bones of a [godot.Skeleton3D] bone chain a way that places the end bone at a desired 3D position. A typical scenario for IK in games is to place a character's feet on the ground or a character's hands on a currently held object. SkeletonIK uses FabrikInverseKinematic internally to solve the bone chain and applies the results to the [godot.Skeleton3D] `bones_global_pose_override` property for all affected bones in the chain. If fully applied, this overwrites any bone transform from [godot.Animation]s or bone custom poses set by users. The applied amount can be controlled with the [interpolation] property.
 *
 * ```
 * 		# Apply IK effect automatically on every new frame (not the current)
 * 		skeleton_ik_node.start()
 *
 * 		# Apply IK effect only on the current frame
 * 		skeleton_ik_node.start(true)
 *
 * 		# Stop IK effect and reset bones_global_pose_override on Skeleton
 * 		skeleton_ik_node.stop()
 *
 * 		# Apply full IK effect
 * 		skeleton_ik_node.set_interpolation(1.0)
 *
 * 		# Apply half IK effect
 * 		skeleton_ik_node.set_interpolation(0.5)
 *
 * 		# Apply zero IK effect (a value at or below 0.01 also removes bones_global_pose_override on Skeleton)
 * 		skeleton_ik_node.set_interpolation(0.0)
 * 		```
 *
 * *Deprecated.* This class is deprecated, and might be removed in a future release.
 */
@GodotBaseType
public open class SkeletonIK3D : Node() {
  /**
   * The name of the current root bone, the first bone in the IK chain.
   */
  public var rootBone: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_ROOT_BONE,
          STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_ROOT_BONE, NIL)
    }

  /**
   * The name of the current tip bone, the last bone in the IK chain placed at the [target] transform (or [targetNode] if defined).
   */
  public var tipBone: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_TIP_BONE,
          STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_TIP_BONE, NIL)
    }

  /**
   * Interpolation value for how much the IK results are applied to the current skeleton bone chain. A value of `1.0` will overwrite all skeleton bone transforms completely while a value of `0.0` will visually disable the SkeletonIK. A value at or below `0.01` also calls [godot.Skeleton3D.clearBonesGlobalPoseOverride].
   */
  public var interpolation: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_INTERPOLATION,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_INTERPOLATION,
          NIL)
    }

  /**
   * First target of the IK chain where the tip bone is placed and, if [overrideTipBasis] is `true`, how the tip bone is rotated. If a [targetNode] path is available the nodes transform is used instead and this property is ignored.
   */
  public var target: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_TARGET_TRANSFORM,
          TRANSFORM3D)
      return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_TARGET_TRANSFORM,
          NIL)
    }

  /**
   * If `true` overwrites the rotation of the tip bone with the rotation of the [target] (or [targetNode] if defined).
   */
  public var overrideTipBasis: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_IS_OVERRIDE_TIP_BASIS, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_OVERRIDE_TIP_BASIS, NIL)
    }

  /**
   * If `true`, instructs the IK solver to consider the secondary magnet target (pole target) when calculating the bone chain. Use the magnet position (pole target) to control the bending of the IK chain.
   */
  public var useMagnet: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_IS_USING_MAGNET,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_USE_MAGNET, NIL)
    }

  /**
   * Secondary target position (first is [target] property or [targetNode]) for the IK chain. Use magnet position (pole target) to control the bending of the IK chain. Only works if the bone chain has more than 2 bones. The middle chain bone position will be linearly interpolated with the magnet position.
   */
  public var magnet: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_MAGNET_POSITION,
          VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_MAGNET_POSITION,
          NIL)
    }

  /**
   * Target node [godot.core.NodePath] for the IK chain. If available, the node's current [godot.Transform3D] is used instead of the [target] property.
   */
  public var targetNode: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_TARGET_NODE,
          NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_TARGET_NODE, NIL)
    }

  /**
   * The minimum distance between bone and goal target. If the distance is below this value, the IK solver stops further iterations.
   */
  public var minDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_MIN_DISTANCE,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_MIN_DISTANCE,
          NIL)
    }

  /**
   * Number of iteration loops used by the IK solver to produce more accurate (and elegant) bone chain results.
   */
  public var maxIterations: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_MAX_ITERATIONS,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_MAX_ITERATIONS,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONIK3D, scriptIndex)
    return true
  }

  /**
   * Returns the parent [godot.Skeleton3D] Node that was present when SkeletonIK entered the [godot.SceneTree]. Returns null if the parent node was not a [godot.Skeleton3D] Node when SkeletonIK3D entered the [godot.SceneTree].
   */
  public fun getParentSkeleton(): Skeleton3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_PARENT_SKELETON,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Skeleton3D?)
  }

  /**
   * Returns `true` if SkeletonIK is applying IK effects on continues frames to the [godot.Skeleton3D] bones. Returns `false` if SkeletonIK is stopped or [start] was used with the `one_time` parameter set to `true`.
   */
  public fun isRunning(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_IS_RUNNING, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Starts applying IK effects on each frame to the [godot.Skeleton3D] bones but will only take effect starting on the next frame. If [oneTime] is `true`, this will take effect immediately but also reset on the next frame.
   */
  @JvmOverloads
  public fun start(oneTime: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to oneTime)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_START, NIL)
  }

  /**
   * Stops applying IK effects on each frame to the [godot.Skeleton3D] bones and also calls [godot.Skeleton3D.clearBonesGlobalPoseOverride] to remove existing overrides on all bones.
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_STOP, NIL)
  }

  public companion object
}

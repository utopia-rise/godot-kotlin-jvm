// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * SkeletonIK is used to place the end bone of a [godot.Skeleton] bone chain at a certain point in 3D by rotating all bones in the chain accordingly.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/523](https://godotengine.org/asset-library/asset/523)
 *
 * SkeletonIK is used to place the end bone of a [godot.Skeleton] bone chain at a certain point in 3D by rotating all bones in the chain accordingly. A typical scenario for IK in games is to place a characters feet on the ground or a characters hands on a currently hold object. SkeletonIK uses FabrikInverseKinematic internally to solve the bone chain and applies the results to the [godot.Skeleton] `bones_global_pose_override` property for all affected bones in the chain. If fully applied this overwrites any bone transform from [godot.Animation]s or bone custom poses set by users. The applied amount can be controlled with the `interpolation` property.
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
 */
@GodotBaseType
public open class SkeletonIK : Node() {
  /**
   * Interpolation value for how much the IK results are applied to the current skeleton bone chain. A value of `1.0` will overwrite all skeleton bone transforms completely while a value of `0.0` will visually disable the SkeletonIK. A value at or below `0.01` also calls [godot.Skeleton.clearBonesGlobalPoseOverride].
   */
  public open var interpolation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_GET_INTERPOLATION,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_SET_INTERPOLATION, NIL)
    }

  /**
   * Secondary target position (first is [target] property or [targetNode]) for the IK chain. Use magnet position (pole target) to control the bending of the IK chain. Only works if the bone chain has more than 2 bones. The middle chain bone position will be linearly interpolated with the magnet position.
   */
  public open var magnet: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_GET_MAGNET, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_SET_MAGNET, NIL)
    }

  /**
   * Number of iteration loops used by the IK solver to produce more accurate (and elegant) bone chain results.
   */
  public open var maxIterations: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_GET_MAX_ITERATIONS,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_SET_MAX_ITERATIONS,
          NIL)
    }

  /**
   * The minimum distance between bone and goal target. If the distance is below this value, the IK solver stops further iterations.
   */
  public open var minDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_GET_MIN_DISTANCE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_SET_MIN_DISTANCE, NIL)
    }

  /**
   * If `true` overwrites the rotation of the tip bone with the rotation of the [target] (or [targetNode] if defined).
   */
  public open var overrideTipBasis: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_GET_OVERRIDE_TIP_BASIS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_SET_OVERRIDE_TIP_BASIS,
          NIL)
    }

  /**
   * The name of the current root bone, the first bone in the IK chain.
   */
  public open var rootBone: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_GET_ROOT_BONE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_SET_ROOT_BONE, NIL)
    }

  /**
   * First target of the IK chain where the tip bone is placed and, if [overrideTipBasis] is `true`, how the tip bone is rotated. If a [targetNode] path is available the nodes transform is used instead and this property is ignored.
   */
  public open var target: Transform
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_GET_TARGET, TRANSFORM)
      return TransferContext.readReturnValue(TRANSFORM, false) as Transform
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_SET_TARGET, NIL)
    }

  /**
   * Target node [godot.core.NodePath] for the IK chain. If available, the node's current [godot.core.Transform] is used instead of the [target] property.
   */
  public open var targetNode: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_GET_TARGET_NODE,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_SET_TARGET_NODE, NIL)
    }

  /**
   * The name of the current tip bone, the last bone in the IK chain placed at the [target] transform (or [targetNode] if defined).
   */
  public open var tipBone: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_GET_TIP_BONE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_SET_TIP_BONE, NIL)
    }

  /**
   * If `true`, instructs the IK solver to consider the secondary magnet target (pole target) when calculating the bone chain. Use the magnet position (pole target) to control the bending of the IK chain.
   */
  public open var useMagnet: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_GET_USE_MAGNET, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_SET_USE_MAGNET, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SKELETONIK)
  }

  @CoreTypeHelper
  public open fun magnet(schedule: Vector3.() -> Unit): Vector3 = magnet.apply{
      schedule(this)
      magnet = this
  }


  @CoreTypeHelper
  public open fun target(schedule: Transform.() -> Unit): Transform = target.apply{
      schedule(this)
      target = this
  }


  /**
   * Returns the parent [godot.Skeleton] Node that was present when SkeletonIK entered the [godot.SceneTree]. Returns null if the parent node was not a [godot.Skeleton] Node when SkeletonIK entered the [godot.SceneTree].
   */
  public open fun getParentSkeleton(): Skeleton? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_GET_PARENT_SKELETON,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Skeleton?
  }

  /**
   * Returns `true` if SkeletonIK is applying IK effects on continues frames to the [godot.Skeleton] bones. Returns `false` if SkeletonIK is stopped or [start] was used with the `one_time` parameter set to `true`.
   */
  public open fun isRunning(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_IS_RUNNING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Starts applying IK effects on each frame to the [godot.Skeleton] bones but will only take effect starting on the next frame. If `one_time` is `true`, this will take effect immediately but also reset on the next frame.
   */
  public open fun start(oneTime: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to oneTime)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_START, NIL)
  }

  /**
   * Stops applying IK effects on each frame to the [godot.Skeleton] bones and also calls [godot.Skeleton.clearBonesGlobalPoseOverride] to remove existing overrides on all bones.
   */
  public open fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK_STOP, NIL)
  }
}

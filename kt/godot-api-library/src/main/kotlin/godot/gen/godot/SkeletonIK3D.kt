// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.StringName
import godot.core.Transform3D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING_NAME
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_SKELETONIK3D_INDEX: Int = 585

/**
 * SkeletonIK3D is used to rotate all bones of a [Skeleton3D] bone chain a way that places the end
 * bone at a desired 3D position. A typical scenario for IK in games is to place a character's feet on
 * the ground or a character's hands on a currently held object. SkeletonIK uses FabrikInverseKinematic
 * internally to solve the bone chain and applies the results to the [Skeleton3D]
 * `bones_global_pose_override` property for all affected bones in the chain. If fully applied, this
 * overwrites any bone transform from [Animation]s or bone custom poses set by users. The applied
 * amount can be controlled with the [SkeletonModifier3D.influence] property.
 * [codeblock]
 * # Apply IK effect automatically on every new frame (not the current)
 * skeleton_ik_node.start()
 *
 * # Apply IK effect only on the current frame
 * skeleton_ik_node.start(true)
 *
 * # Stop IK effect and reset bones_global_pose_override on Skeleton
 * skeleton_ik_node.stop()
 *
 * # Apply full IK effect
 * skeleton_ik_node.set_influence(1.0)
 *
 * # Apply half IK effect
 * skeleton_ik_node.set_influence(0.5)
 *
 * # Apply zero IK effect (a value at or below 0.01 also removes bones_global_pose_override on
 * Skeleton)
 * skeleton_ik_node.set_influence(0.0)
 * [/codeblock]
 */
@GodotBaseType
public open class SkeletonIK3D : SkeletonModifier3D() {
  /**
   * The name of the current root bone, the first bone in the IK chain.
   */
  public final inline var rootBone: StringName
    @JvmName("rootBoneProperty")
    get() = getRootBone()
    @JvmName("rootBoneProperty")
    set(`value`) {
      setRootBone(value)
    }

  /**
   * The name of the current tip bone, the last bone in the IK chain placed at the [target]
   * transform (or [targetNode] if defined).
   */
  public final inline var tipBone: StringName
    @JvmName("tipBoneProperty")
    get() = getTipBone()
    @JvmName("tipBoneProperty")
    set(`value`) {
      setTipBone(value)
    }

  /**
   * First target of the IK chain where the tip bone is placed and, if [overrideTipBasis] is `true`,
   * how the tip bone is rotated. If a [targetNode] path is available the nodes transform is used
   * instead and this property is ignored.
   */
  @CoreTypeLocalCopy
  public final inline var target: Transform3D
    @JvmName("targetProperty")
    get() = getTargetTransform()
    @JvmName("targetProperty")
    set(`value`) {
      setTargetTransform(value)
    }

  /**
   * If `true` overwrites the rotation of the tip bone with the rotation of the [target] (or
   * [targetNode] if defined).
   */
  public final inline var overrideTipBasis: Boolean
    @JvmName("overrideTipBasisProperty")
    get() = isOverrideTipBasis()
    @JvmName("overrideTipBasisProperty")
    set(`value`) {
      setOverrideTipBasis(value)
    }

  /**
   * If `true`, instructs the IK solver to consider the secondary magnet target (pole target) when
   * calculating the bone chain. Use the magnet position (pole target) to control the bending of the IK
   * chain.
   */
  public final inline var useMagnet: Boolean
    @JvmName("useMagnetProperty")
    get() = isUsingMagnet()
    @JvmName("useMagnetProperty")
    set(`value`) {
      setUseMagnet(value)
    }

  /**
   * Secondary target position (first is [target] property or [targetNode]) for the IK chain. Use
   * magnet position (pole target) to control the bending of the IK chain. Only works if the bone chain
   * has more than 2 bones. The middle chain bone position will be linearly interpolated with the
   * magnet position.
   */
  @CoreTypeLocalCopy
  public final inline var magnet: Vector3
    @JvmName("magnetProperty")
    get() = getMagnetPosition()
    @JvmName("magnetProperty")
    set(`value`) {
      setMagnetPosition(value)
    }

  /**
   * Target node [NodePath] for the IK chain. If available, the node's current [Transform3D] is used
   * instead of the [target] property.
   */
  public final inline var targetNode: NodePath
    @JvmName("targetNodeProperty")
    get() = getTargetNode()
    @JvmName("targetNodeProperty")
    set(`value`) {
      setTargetNode(value)
    }

  /**
   * The minimum distance between bone and goal target. If the distance is below this value, the IK
   * solver stops further iterations.
   */
  public final inline var minDistance: Float
    @JvmName("minDistanceProperty")
    get() = getMinDistance()
    @JvmName("minDistanceProperty")
    set(`value`) {
      setMinDistance(value)
    }

  /**
   * Number of iteration loops used by the IK solver to produce more accurate (and elegant) bone
   * chain results.
   */
  public final inline var maxIterations: Int
    @JvmName("maxIterationsProperty")
    get() = getMaxIterations()
    @JvmName("maxIterationsProperty")
    set(`value`) {
      setMaxIterations(value)
    }

  /**
   * Interpolation value for how much the IK results are applied to the current skeleton bone chain.
   * A value of `1.0` will overwrite all skeleton bone transforms completely while a value of `0.0`
   * will visually disable the SkeletonIK.
   */
  public final inline var interpolation: Float
    @JvmName("interpolationProperty")
    get() = getInterpolation()
    @JvmName("interpolationProperty")
    set(`value`) {
      setInterpolation(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_SKELETONIK3D_INDEX, scriptIndex)
  }

  /**
   * First target of the IK chain where the tip bone is placed and, if [overrideTipBasis] is `true`,
   * how the tip bone is rotated. If a [targetNode] path is available the nodes transform is used
   * instead and this property is ignored.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = skeletonik3d.target
   * //Your changes
   * skeletonik3d.target = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun targetMutate(block: Transform3D.() -> Unit): Transform3D = target.apply{
      block(this)
      target = this
  }


  /**
   * Secondary target position (first is [target] property or [targetNode]) for the IK chain. Use
   * magnet position (pole target) to control the bending of the IK chain. Only works if the bone chain
   * has more than 2 bones. The middle chain bone position will be linearly interpolated with the
   * magnet position.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = skeletonik3d.magnet
   * //Your changes
   * skeletonik3d.magnet = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun magnetMutate(block: Vector3.() -> Unit): Vector3 = magnet.apply{
      block(this)
      magnet = this
  }


  public final fun setRootBone(rootBone: StringName): Unit {
    Internals.writeArguments(STRING_NAME to rootBone)
    Internals.callMethod(rawPtr, MethodBindings.setRootBonePtr, NIL)
  }

  public final fun getRootBone(): StringName {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRootBonePtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setTipBone(tipBone: StringName): Unit {
    Internals.writeArguments(STRING_NAME to tipBone)
    Internals.callMethod(rawPtr, MethodBindings.setTipBonePtr, NIL)
  }

  public final fun getTipBone(): StringName {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTipBonePtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setTargetTransform(target: Transform3D): Unit {
    Internals.writeArguments(TRANSFORM3D to target)
    Internals.callMethod(rawPtr, MethodBindings.setTargetTransformPtr, NIL)
  }

  public final fun getTargetTransform(): Transform3D {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTargetTransformPtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  public final fun setTargetNode(node: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to node)
    Internals.callMethod(rawPtr, MethodBindings.setTargetNodePtr, NIL)
  }

  public final fun getTargetNode(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTargetNodePtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setOverrideTipBasis(`override`: Boolean): Unit {
    Internals.writeArguments(BOOL to override)
    Internals.callMethod(rawPtr, MethodBindings.setOverrideTipBasisPtr, NIL)
  }

  public final fun isOverrideTipBasis(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isOverrideTipBasisPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUseMagnet(use: Boolean): Unit {
    Internals.writeArguments(BOOL to use)
    Internals.callMethod(rawPtr, MethodBindings.setUseMagnetPtr, NIL)
  }

  public final fun isUsingMagnet(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isUsingMagnetPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMagnetPosition(localPosition: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to localPosition)
    Internals.callMethod(rawPtr, MethodBindings.setMagnetPositionPtr, NIL)
  }

  public final fun getMagnetPosition(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMagnetPositionPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the parent [Skeleton3D] Node that was present when SkeletonIK entered the [SceneTree].
   * Returns null if the parent node was not a [Skeleton3D] Node when SkeletonIK3D entered the
   * [SceneTree].
   */
  public final fun getParentSkeleton(): Skeleton3D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getParentSkeletonPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Skeleton3D?)
  }

  /**
   * Returns `true` if SkeletonIK is applying IK effects on continues frames to the [Skeleton3D]
   * bones. Returns `false` if SkeletonIK is stopped or [start] was used with the `one_time` parameter
   * set to `true`.
   */
  public final fun isRunning(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isRunningPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMinDistance(minDistance: Float): Unit {
    Internals.writeArguments(DOUBLE to minDistance.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMinDistancePtr, NIL)
  }

  public final fun getMinDistance(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMinDistancePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMaxIterations(iterations: Int): Unit {
    Internals.writeArguments(LONG to iterations.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMaxIterationsPtr, NIL)
  }

  public final fun getMaxIterations(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxIterationsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Starts applying IK effects on each frame to the [Skeleton3D] bones but will only take effect
   * starting on the next frame. If [oneTime] is `true`, this will take effect immediately but also
   * reset on the next frame.
   */
  @JvmOverloads
  public final fun start(oneTime: Boolean = false): Unit {
    Internals.writeArguments(BOOL to oneTime)
    Internals.callMethod(rawPtr, MethodBindings.startPtr, NIL)
  }

  /**
   * Stops applying IK effects on each frame to the [Skeleton3D] bones and also calls
   * [Skeleton3D.clearBonesGlobalPoseOverride] to remove existing overrides on all bones.
   */
  public final fun stop(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  public final fun setInterpolation(interpolation: Float): Unit {
    Internals.writeArguments(DOUBLE to interpolation.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setInterpolationPtr, NIL)
  }

  public final fun getInterpolation(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInterpolationPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val setRootBonePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "set_root_bone", 3304788590)

    internal val getRootBonePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "get_root_bone", 2002593661)

    internal val setTipBonePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "set_tip_bone", 3304788590)

    internal val getTipBonePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "get_tip_bone", 2002593661)

    internal val setTargetTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "set_target_transform", 2952846383)

    internal val getTargetTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "get_target_transform", 3229777777)

    internal val setTargetNodePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "set_target_node", 1348162250)

    internal val getTargetNodePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "get_target_node", 277076166)

    internal val setOverrideTipBasisPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "set_override_tip_basis", 2586408642)

    internal val isOverrideTipBasisPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "is_override_tip_basis", 36873697)

    internal val setUseMagnetPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "set_use_magnet", 2586408642)

    internal val isUsingMagnetPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "is_using_magnet", 36873697)

    internal val setMagnetPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "set_magnet_position", 3460891852)

    internal val getMagnetPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "get_magnet_position", 3360562783)

    internal val getParentSkeletonPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "get_parent_skeleton", 1488626673)

    internal val isRunningPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "is_running", 2240911060)

    internal val setMinDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "set_min_distance", 373806689)

    internal val getMinDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "get_min_distance", 1740695150)

    internal val setMaxIterationsPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "set_max_iterations", 1286410249)

    internal val getMaxIterationsPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "get_max_iterations", 3905245786)

    internal val startPtr: VoidPtr = Internals.getMethodBindPtr("SkeletonIK3D", "start", 107499316)

    internal val stopPtr: VoidPtr = Internals.getMethodBindPtr("SkeletonIK3D", "stop", 3218959716)

    internal val setInterpolationPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "set_interpolation", 373806689)

    internal val getInterpolationPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonIK3D", "get_interpolation", 1740695150)
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM3D
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * This node takes its parent [Path3D], and returns the coordinates of a point within it, given a
 * distance from the first vertex.
 * It is useful for making other nodes follow a path, without coding the movement pattern. For that,
 * the nodes must be children of this node. The descendant nodes will then move accordingly when
 * setting the [progress] in this node.
 */
@GodotBaseType
public open class PathFollow3D : Node3D() {
  /**
   * The distance from the first vertex, measured in 3D units along the path. Changing this value
   * sets this node's position to a point within the path.
   */
  public var progress: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProgressPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setProgressPtr, NIL)
    }

  /**
   * The distance from the first vertex, considering 0.0 as the first vertex and 1.0 as the last.
   * This is just another way of expressing the progress within the path, as the progress supplied is
   * multiplied internally by the path's length.
   */
  public var progressRatio: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProgressRatioPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setProgressRatioPtr, NIL)
    }

  /**
   * The node's offset along the curve.
   */
  public var hOffset: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setHOffsetPtr, NIL)
    }

  /**
   * The node's offset perpendicular to the curve.
   */
  public var vOffset: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVOffsetPtr, NIL)
    }

  /**
   * Allows or forbids rotation on one or more axes, depending on the [RotationMode] constants being
   * used.
   */
  public var rotationMode: RotationMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRotationModePtr, LONG)
      return PathFollow3D.RotationMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationModePtr, NIL)
    }

  /**
   * If `true`, the node moves on the travel path with orienting the +Z axis as forward. See also
   * [Vector3.FORWARD] and [Vector3.MODEL_FRONT].
   */
  public var useModelFront: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingModelFrontPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseModelFrontPtr, NIL)
    }

  /**
   * If `true`, the position between two cached points is interpolated cubically, and linearly
   * otherwise.
   * The points along the [Curve3D] of the [Path3D] are precomputed before use, for faster
   * calculations. The point at the requested offset is then calculated interpolating between two
   * adjacent cached points. This may present a problem if the curve makes sharp turns, as the cached
   * points may not follow the curve closely enough.
   * There are two answers to this problem: either increase the number of cached points and increase
   * memory consumption, or make a cubic interpolation between two points at the cost of (slightly)
   * slower calculations.
   */
  public var cubicInterp: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCubicInterpolationPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCubicInterpolationPtr, NIL)
    }

  /**
   * If `true`, any offset outside the path's length will wrap around, instead of stopping at the
   * ends. Use it for cyclic paths.
   */
  public var loop: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.hasLoopPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLoopPtr, NIL)
    }

  /**
   * If `true`, the tilt property of [Curve3D] takes effect.
   */
  public var tiltEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isTiltEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTiltEnabledPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PATHFOLLOW3D, scriptIndex)
    return true
  }

  public enum class RotationMode(
    id: Long,
  ) {
    /**
     * Forbids the PathFollow3D to rotate.
     */
    ROTATION_NONE(0),
    /**
     * Allows the PathFollow3D to rotate in the Y axis only.
     */
    ROTATION_Y(1),
    /**
     * Allows the PathFollow3D to rotate in both the X, and Y axes.
     */
    ROTATION_XY(2),
    /**
     * Allows the PathFollow3D to rotate in any axis.
     */
    ROTATION_XYZ(3),
    /**
     * Uses the up vector information in a [Curve3D] to enforce orientation. This rotation mode
     * requires the [Path3D]'s [Curve3D.upVectorEnabled] property to be set to `true`.
     */
    ROTATION_ORIENTED(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): RotationMode = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Correct the [transform]. [rotationMode] implicitly specifies how posture (forward, up and
     * sideway direction) is calculated.
     */
    public fun correctPosture(transform: Transform3D, rotationMode: RotationMode): Transform3D {
      TransferContext.writeArguments(TRANSFORM3D to transform, LONG to rotationMode.id)
      TransferContext.callMethod(0, MethodBindings.correctPosturePtr, TRANSFORM3D)
      return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
    }
  }

  internal object MethodBindings {
    public val setProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "set_progress")

    public val getProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "get_progress")

    public val setHOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow3D", "set_h_offset")

    public val getHOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow3D", "get_h_offset")

    public val setVOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow3D", "set_v_offset")

    public val getVOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow3D", "get_v_offset")

    public val setProgressRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "set_progress_ratio")

    public val getProgressRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "get_progress_ratio")

    public val setRotationModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "set_rotation_mode")

    public val getRotationModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "get_rotation_mode")

    public val setCubicInterpolationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "set_cubic_interpolation")

    public val getCubicInterpolationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "get_cubic_interpolation")

    public val setUseModelFrontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "set_use_model_front")

    public val isUsingModelFrontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "is_using_model_front")

    public val setLoopPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow3D", "set_loop")

    public val hasLoopPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow3D", "has_loop")

    public val setTiltEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "set_tilt_enabled")

    public val isTiltEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "is_tilt_enabled")

    public val correctPosturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "correct_posture")
  }
}

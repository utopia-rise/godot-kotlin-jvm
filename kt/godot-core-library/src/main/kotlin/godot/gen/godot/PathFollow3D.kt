// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.TRANSFORM3D
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var progress: Float
    @JvmName("progressProperty")
    get() = getProgress()
    @JvmName("progressProperty")
    set(`value`) {
      setProgress(value)
    }

  /**
   * The distance from the first vertex, considering 0.0 as the first vertex and 1.0 as the last.
   * This is just another way of expressing the progress within the path, as the progress supplied is
   * multiplied internally by the path's length.
   */
  public final inline var progressRatio: Float
    @JvmName("progressRatioProperty")
    get() = getProgressRatio()
    @JvmName("progressRatioProperty")
    set(`value`) {
      setProgressRatio(value)
    }

  /**
   * The node's offset along the curve.
   */
  public final inline var hOffset: Float
    @JvmName("hOffsetProperty")
    get() = getHOffset()
    @JvmName("hOffsetProperty")
    set(`value`) {
      setHOffset(value)
    }

  /**
   * The node's offset perpendicular to the curve.
   */
  public final inline var vOffset: Float
    @JvmName("vOffsetProperty")
    get() = getVOffset()
    @JvmName("vOffsetProperty")
    set(`value`) {
      setVOffset(value)
    }

  /**
   * Allows or forbids rotation on one or more axes, depending on the [RotationMode] constants being
   * used.
   */
  public final inline var rotationMode: RotationMode
    @JvmName("rotationModeProperty")
    get() = getRotationMode()
    @JvmName("rotationModeProperty")
    set(`value`) {
      setRotationMode(value)
    }

  /**
   * If `true`, the node moves on the travel path with orienting the +Z axis as forward. See also
   * [Vector3.FORWARD] and [Vector3.MODEL_FRONT].
   */
  public final inline var useModelFront: Boolean
    @JvmName("useModelFrontProperty")
    get() = isUsingModelFront()
    @JvmName("useModelFrontProperty")
    set(`value`) {
      setUseModelFront(value)
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
  public final inline var cubicInterp: Boolean
    @JvmName("cubicInterpProperty")
    get() = getCubicInterpolation()
    @JvmName("cubicInterpProperty")
    set(`value`) {
      setCubicInterpolation(value)
    }

  /**
   * If `true`, any offset outside the path's length will wrap around, instead of stopping at the
   * ends. Use it for cyclic paths.
   */
  public final inline var loop: Boolean
    @JvmName("loopProperty")
    get() = hasLoop()
    @JvmName("loopProperty")
    set(`value`) {
      setLoop(value)
    }

  /**
   * If `true`, the tilt property of [Curve3D] takes effect.
   */
  public final inline var tiltEnabled: Boolean
    @JvmName("tiltEnabledProperty")
    get() = isTiltEnabled()
    @JvmName("tiltEnabledProperty")
    set(`value`) {
      setTiltEnabled(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PATHFOLLOW3D, scriptIndex)
  }

  public final fun setProgress(progress: Float): Unit {
    TransferContext.writeArguments(DOUBLE to progress.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setProgressPtr, NIL)
  }

  public final fun getProgress(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProgressPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHOffset(hOffset: Float): Unit {
    TransferContext.writeArguments(DOUBLE to hOffset.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setHOffsetPtr, NIL)
  }

  public final fun getHOffset(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVOffset(vOffset: Float): Unit {
    TransferContext.writeArguments(DOUBLE to vOffset.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVOffsetPtr, NIL)
  }

  public final fun getVOffset(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setProgressRatio(ratio: Float): Unit {
    TransferContext.writeArguments(DOUBLE to ratio.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setProgressRatioPtr, NIL)
  }

  public final fun getProgressRatio(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProgressRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRotationMode(rotationMode: RotationMode): Unit {
    TransferContext.writeArguments(LONG to rotationMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setRotationModePtr, NIL)
  }

  public final fun getRotationMode(): RotationMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRotationModePtr, LONG)
    return PathFollow3D.RotationMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setCubicInterpolation(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setCubicInterpolationPtr, NIL)
  }

  public final fun getCubicInterpolation(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCubicInterpolationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUseModelFront(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setUseModelFrontPtr, NIL)
  }

  public final fun isUsingModelFront(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingModelFrontPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setLoop(loop: Boolean): Unit {
    TransferContext.writeArguments(BOOL to loop)
    TransferContext.callMethod(ptr, MethodBindings.setLoopPtr, NIL)
  }

  public final fun hasLoop(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasLoopPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTiltEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setTiltEnabledPtr, NIL)
  }

  public final fun isTiltEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isTiltEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
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
    public final fun correctPosture(transform: Transform3D, rotationMode: RotationMode):
        Transform3D {
      TransferContext.writeArguments(TRANSFORM3D to transform, LONG to rotationMode.id)
      TransferContext.callMethod(0, MethodBindings.correctPosturePtr, TRANSFORM3D)
      return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
    }
  }

  internal object MethodBindings {
    public val setProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "set_progress", 373806689)

    public val getProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "get_progress", 1740695150)

    public val setHOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "set_h_offset", 373806689)

    public val getHOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "get_h_offset", 1740695150)

    public val setVOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "set_v_offset", 373806689)

    public val getVOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "get_v_offset", 1740695150)

    public val setProgressRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "set_progress_ratio", 373806689)

    public val getProgressRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "get_progress_ratio", 1740695150)

    public val setRotationModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "set_rotation_mode", 1640311967)

    public val getRotationModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "get_rotation_mode", 3814010545)

    public val setCubicInterpolationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "set_cubic_interpolation", 2586408642)

    public val getCubicInterpolationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "get_cubic_interpolation", 36873697)

    public val setUseModelFrontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "set_use_model_front", 2586408642)

    public val isUsingModelFrontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "is_using_model_front", 36873697)

    public val setLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "set_loop", 2586408642)

    public val hasLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "has_loop", 36873697)

    public val setTiltEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "set_tilt_enabled", 2586408642)

    public val isTiltEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "is_tilt_enabled", 36873697)

    public val correctPosturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow3D", "correct_posture", 2686588690)
  }
}

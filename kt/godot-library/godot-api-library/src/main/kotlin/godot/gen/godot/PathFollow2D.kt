// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_PATHFOLLOW2D_INDEX: Int = 454

/**
 * This node takes its parent [Path2D], and returns the coordinates of a point within it, given a
 * distance from the first vertex.
 * It is useful for making other nodes follow a path, without coding the movement pattern. For that,
 * the nodes must be children of this node. The descendant nodes will then move accordingly when
 * setting the [progress] in this node.
 */
@GodotBaseType
public open class PathFollow2D : Node2D() {
  /**
   * The distance along the path, in pixels. Changing this value sets this node's position to a
   * point within the path.
   */
  public final inline var progress: Float
    @JvmName("progressProperty")
    get() = getProgress()
    @JvmName("progressProperty")
    set(`value`) {
      setProgress(value)
    }

  /**
   * The distance along the path as a number in the range 0.0 (for the first vertex) to 1.0 (for the
   * last). This is just another way of expressing the progress within the path, as the offset supplied
   * is multiplied internally by the path's length.
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
   * If `true`, this node rotates to follow the path, with the +X direction facing forward on the
   * path.
   */
  public final inline var rotates: Boolean
    @JvmName("rotatesProperty")
    get() = isRotating()
    @JvmName("rotatesProperty")
    set(`value`) {
      setRotates(value)
    }

  /**
   * If `true`, the position between two cached points is interpolated cubically, and linearly
   * otherwise.
   * The points along the [Curve2D] of the [Path2D] are precomputed before use, for faster
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

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_PATHFOLLOW2D_INDEX, scriptIndex)
  }

  public final fun setProgress(progress: Float): Unit {
    Internals.writeArguments(DOUBLE to progress.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setProgressPtr, NIL)
  }

  public final fun getProgress(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getProgressPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHOffset(hOffset: Float): Unit {
    Internals.writeArguments(DOUBLE to hOffset.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setHOffsetPtr, NIL)
  }

  public final fun getHOffset(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHOffsetPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVOffset(vOffset: Float): Unit {
    Internals.writeArguments(DOUBLE to vOffset.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setVOffsetPtr, NIL)
  }

  public final fun getVOffset(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVOffsetPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setProgressRatio(ratio: Float): Unit {
    Internals.writeArguments(DOUBLE to ratio.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setProgressRatioPtr, NIL)
  }

  public final fun getProgressRatio(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getProgressRatioPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRotates(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setRotatesPtr, NIL)
  }

  public final fun isRotating(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isRotatingPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCubicInterpolation(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setCubicInterpolationPtr, NIL)
  }

  public final fun getCubicInterpolation(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCubicInterpolationPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setLoop(loop: Boolean): Unit {
    Internals.writeArguments(BOOL to loop)
    Internals.callMethod(rawPtr, MethodBindings.setLoopPtr, NIL)
  }

  public final fun hasLoop(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.hasLoopPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setProgressPtr: VoidPtr =
        Internals.getMethodBindPtr("PathFollow2D", "set_progress", 373806689)

    internal val getProgressPtr: VoidPtr =
        Internals.getMethodBindPtr("PathFollow2D", "get_progress", 1740695150)

    internal val setHOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("PathFollow2D", "set_h_offset", 373806689)

    internal val getHOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("PathFollow2D", "get_h_offset", 1740695150)

    internal val setVOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("PathFollow2D", "set_v_offset", 373806689)

    internal val getVOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("PathFollow2D", "get_v_offset", 1740695150)

    internal val setProgressRatioPtr: VoidPtr =
        Internals.getMethodBindPtr("PathFollow2D", "set_progress_ratio", 373806689)

    internal val getProgressRatioPtr: VoidPtr =
        Internals.getMethodBindPtr("PathFollow2D", "get_progress_ratio", 1740695150)

    internal val setRotatesPtr: VoidPtr =
        Internals.getMethodBindPtr("PathFollow2D", "set_rotates", 2586408642)

    internal val isRotatingPtr: VoidPtr =
        Internals.getMethodBindPtr("PathFollow2D", "is_rotating", 36873697)

    internal val setCubicInterpolationPtr: VoidPtr =
        Internals.getMethodBindPtr("PathFollow2D", "set_cubic_interpolation", 2586408642)

    internal val getCubicInterpolationPtr: VoidPtr =
        Internals.getMethodBindPtr("PathFollow2D", "get_cubic_interpolation", 36873697)

    internal val setLoopPtr: VoidPtr =
        Internals.getMethodBindPtr("PathFollow2D", "set_loop", 2586408642)

    internal val hasLoopPtr: VoidPtr =
        Internals.getMethodBindPtr("PathFollow2D", "has_loop", 36873697)
  }
}

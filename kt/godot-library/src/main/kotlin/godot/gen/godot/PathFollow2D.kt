// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    callConstructor(ENGINECLASS_PATHFOLLOW2D, scriptIndex)
  }

  public final fun setProgress(progress: Float): Unit {
    TransferContext.writeArguments(DOUBLE to progress.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setProgressPtr, NIL)
  }

  public final fun getProgress(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProgressPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHOffset(hOffset: Float): Unit {
    TransferContext.writeArguments(DOUBLE to hOffset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setHOffsetPtr, NIL)
  }

  public final fun getHOffset(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVOffset(vOffset: Float): Unit {
    TransferContext.writeArguments(DOUBLE to vOffset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setVOffsetPtr, NIL)
  }

  public final fun getVOffset(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setProgressRatio(ratio: Float): Unit {
    TransferContext.writeArguments(DOUBLE to ratio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setProgressRatioPtr, NIL)
  }

  public final fun getProgressRatio(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProgressRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRotates(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setRotatesPtr, NIL)
  }

  public final fun isRotating(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isRotatingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCubicInterpolation(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setCubicInterpolationPtr, NIL)
  }

  public final fun getCubicInterpolation(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCubicInterpolationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setLoop(loop: Boolean): Unit {
    TransferContext.writeArguments(BOOL to loop)
    TransferContext.callMethod(rawPtr, MethodBindings.setLoopPtr, NIL)
  }

  public final fun hasLoop(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasLoopPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "set_progress", 373806689)

    public val getProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "get_progress", 1740695150)

    public val setHOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "set_h_offset", 373806689)

    public val getHOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "get_h_offset", 1740695150)

    public val setVOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "set_v_offset", 373806689)

    public val getVOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "get_v_offset", 1740695150)

    public val setProgressRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "set_progress_ratio", 373806689)

    public val getProgressRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "get_progress_ratio", 1740695150)

    public val setRotatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "set_rotates", 2586408642)

    public val isRotatingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "is_rotating", 36873697)

    public val setCubicInterpolationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "set_cubic_interpolation", 2586408642)

    public val getCubicInterpolationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "get_cubic_interpolation", 36873697)

    public val setLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "set_loop", 2586408642)

    public val hasLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "has_loop", 36873697)
  }
}

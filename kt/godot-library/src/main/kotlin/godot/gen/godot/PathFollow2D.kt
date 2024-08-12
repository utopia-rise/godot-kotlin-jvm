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
   * The distance along the path as a number in the range 0.0 (for the first vertex) to 1.0 (for the
   * last). This is just another way of expressing the progress within the path, as the offset supplied
   * is multiplied internally by the path's length.
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
   * If `true`, this node rotates to follow the path, with the +X direction facing forward on the
   * path.
   */
  public var rotates: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRotatingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRotatesPtr, NIL)
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PATHFOLLOW2D, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "set_progress")

    public val getProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "get_progress")

    public val setHOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow2D", "set_h_offset")

    public val getHOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow2D", "get_h_offset")

    public val setVOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow2D", "set_v_offset")

    public val getVOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow2D", "get_v_offset")

    public val setProgressRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "set_progress_ratio")

    public val getProgressRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "get_progress_ratio")

    public val setRotatesPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow2D", "set_rotates")

    public val isRotatingPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow2D", "is_rotating")

    public val setCubicInterpolationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "set_cubic_interpolation")

    public val getCubicInterpolationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PathFollow2D", "get_cubic_interpolation")

    public val setLoopPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow2D", "set_loop")

    public val hasLoopPtr: VoidPtr = TypeManager.getMethodBindPtr("PathFollow2D", "has_loop")
  }
}

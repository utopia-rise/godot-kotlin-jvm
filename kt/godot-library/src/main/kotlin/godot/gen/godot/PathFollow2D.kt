// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Point sampler for a [godot.Path2D].
 *
 * This node takes its parent [godot.Path2D], and returns the coordinates of a point within it, given a distance from the first vertex.
 *
 * It is useful for making other nodes follow a path, without coding the movement pattern. For that, the nodes must be children of this node. The descendant nodes will then move accordingly when setting an offset in this node.
 */
@GodotBaseType
public open class PathFollow2D : Node2D() {
  /**
   * The distance along the path in pixels.
   */
  public open var offset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW2D_GET_OFFSET, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW2D_SET_OFFSET, NIL)
    }

  /**
   * The distance along the path as a number in the range 0.0 (for the first vertex) to 1.0 (for the last). This is just another way of expressing the offset within the path, as the offset supplied is multiplied internally by the path's length.
   */
  public open var unitOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW2D_GET_UNIT_OFFSET,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW2D_SET_UNIT_OFFSET, NIL)
    }

  /**
   * The node's offset along the curve.
   */
  public open var hOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW2D_GET_H_OFFSET, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW2D_SET_H_OFFSET, NIL)
    }

  /**
   * The node's offset perpendicular to the curve.
   */
  public open var vOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW2D_GET_V_OFFSET, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW2D_SET_V_OFFSET, NIL)
    }

  /**
   * If `true`, this node rotates to follow the path, with the +X direction facing forward on the path.
   */
  public open var rotates: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW2D_GET_ROTATES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW2D_SET_ROTATES, NIL)
    }

  /**
   * If `true`, the position between two cached points is interpolated cubically, and linearly otherwise.
   *
   * The points along the [godot.Curve2D] of the [godot.Path2D] are precomputed before use, for faster calculations. The point at the requested offset is then calculated interpolating between two adjacent cached points. This may present a problem if the curve makes sharp turns, as the cached points may not follow the curve closely enough.
   *
   * There are two answers to this problem: either increase the number of cached points and increase memory consumption, or make a cubic interpolation between two points at the cost of (slightly) slower calculations.
   */
  public open var cubicInterp: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW2D_GET_CUBIC_INTERP,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW2D_SET_CUBIC_INTERP,
          NIL)
    }

  /**
   * If `true`, any offset outside the path's length will wrap around, instead of stopping at the ends. Use it for cyclic paths.
   */
  public open var loop: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW2D_GET_LOOP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW2D_SET_LOOP, NIL)
    }

  /**
   * How far to look ahead of the curve to calculate the tangent if the node is rotating. E.g. shorter lookaheads will lead to faster rotations.
   */
  public open var lookahead: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW2D_GET_LOOKAHEAD,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW2D_SET_LOOKAHEAD, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PATHFOLLOW2D)
  }

  public companion object
}

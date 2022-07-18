// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Point sampler for a [godot.Path3D].
 *
 * This node takes its parent [godot.Path3D], and returns the coordinates of a point within it, given a distance from the first vertex.
 *
 * It is useful for making other nodes follow a path, without coding the movement pattern. For that, the nodes must be children of this node. The descendant nodes will then move accordingly when setting an offset in this node.
 */
@GodotBaseType
public open class PathFollow3D : Node3D() {
  /**
   * The distance from the first vertex, measured in 3D units along the path. This sets this node's position to a point within the path.
   */
  public var offset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW3D_GET_OFFSET,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW3D_SET_OFFSET, NIL.ordinal)
    }

  /**
   * The distance from the first vertex, considering 0.0 as the first vertex and 1.0 as the last. This is just another way of expressing the offset within the path, as the offset supplied is multiplied internally by the path's length.
   */
  public var unitOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW3D_GET_UNIT_OFFSET,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW3D_SET_UNIT_OFFSET,
          NIL.ordinal)
    }

  /**
   * The node's offset along the curve.
   */
  public var hOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW3D_GET_H_OFFSET,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW3D_SET_H_OFFSET, NIL.ordinal)
    }

  /**
   * The node's offset perpendicular to the curve.
   */
  public var vOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW3D_GET_V_OFFSET,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW3D_SET_V_OFFSET, NIL.ordinal)
    }

  /**
   * Allows or forbids rotation on one or more axes, depending on the [enum RotationMode] constants being used.
   */
  public var rotationMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW3D_GET_ROTATION_MODE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW3D_SET_ROTATION_MODE,
          NIL.ordinal)
    }

  /**
   * If `true`, the position between two cached points is interpolated cubically, and linearly otherwise.
   *
   * The points along the [godot.Curve3D] of the [godot.Path3D] are precomputed before use, for faster calculations. The point at the requested offset is then calculated interpolating between two adjacent cached points. This may present a problem if the curve makes sharp turns, as the cached points may not follow the curve closely enough.
   *
   * There are two answers to this problem: either increase the number of cached points and increase memory consumption, or make a cubic interpolation between two points at the cost of (slightly) slower calculations.
   */
  public var cubicInterp: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW3D_GET_CUBIC_INTERPOLATION,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW3D_SET_CUBIC_INTERPOLATION,
          NIL.ordinal)
    }

  /**
   * If `true`, any offset outside the path's length will wrap around, instead of stopping at the ends. Use it for cyclic paths.
   */
  public var loop: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW3D_HAS_LOOP, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PATHFOLLOW3D_SET_LOOP, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PATHFOLLOW3D)
  }

  public enum class RotationMode(
    id: Long
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
     * Uses the up vector information in a [godot.Curve3D] to enforce orientation. This rotation mode requires the [godot.Path3D]'s [godot.Curve3D.upVectorEnabled] property to be set to `true`.
     */
    ROTATION_ORIENTED(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedVector2Array
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A 2D line.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/583](https://godotengine.org/asset-library/asset/583)
 *
 * A line through several points in 2D space.
 */
@GodotBaseType
public open class Line2D : Node2D() {
  /**
   * The points that form the lines. The line is drawn between every point set in this array. Points are interpreted as local vectors.
   */
  public var points: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_POINTS,
          PACKED_VECTOR2_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_POINTS, NIL)
    }

  /**
   * The line's width.
   */
  public var width: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_WIDTH, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_WIDTH, NIL)
    }

  /**
   * The line's width varies with the curve. The original width is simply multiply by the value of the Curve.
   */
  public var widthCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_CURVE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_CURVE, NIL)
    }

  /**
   * The line's color. Will not be used if a gradient is set.
   */
  public var defaultColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_DEFAULT_COLOR, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_DEFAULT_COLOR, NIL)
    }

  /**
   * The gradient is drawn through the whole line from start to finish. The default color will not be used if a gradient is set.
   */
  public var gradient: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_GRADIENT, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Gradient?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_GRADIENT, NIL)
    }

  /**
   * The texture used for the line's texture. Uses `texture_mode` for drawing style.
   */
  public var texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_TEXTURE, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_TEXTURE, NIL)
    }

  /**
   * The style to render the `texture` on the line. Use [enum LineTextureMode] constants.
   */
  public var textureMode: LineTextureMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_TEXTURE_MODE, LONG)
      return Line2D.LineTextureMode.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_TEXTURE_MODE, NIL)
    }

  /**
   * The style for the points between the start and the end.
   */
  public var jointMode: LineJointMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_JOINT_MODE, LONG)
      return Line2D.LineJointMode.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_JOINT_MODE, NIL)
    }

  /**
   * Controls the style of the line's first point. Use [enum LineCapMode] constants.
   */
  public var beginCapMode: LineCapMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_BEGIN_CAP_MODE, LONG)
      return Line2D.LineCapMode.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_BEGIN_CAP_MODE, NIL)
    }

  /**
   * Controls the style of the line's last point. Use [enum LineCapMode] constants.
   */
  public var endCapMode: LineCapMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_END_CAP_MODE, LONG)
      return Line2D.LineCapMode.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_END_CAP_MODE, NIL)
    }

  /**
   * The direction difference in radians between vector points. This value is only used if [jointMode] is set to [LINE_JOINT_SHARP].
   */
  public var sharpLimit: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_SHARP_LIMIT, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_SHARP_LIMIT, NIL)
    }

  /**
   * The smoothness of the rounded joints and caps. Higher values result in smoother corners, but are more demanding to render and update. This is only used if a cap or joint is set as round.
   *
   * **Note:** The default value is tuned for lines with the default [width]. For thin lines, this value should be reduced to a number between `2` and `4` to improve performance.
   */
  public var roundPrecision: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_ROUND_PRECISION, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_ROUND_PRECISION, NIL)
    }

  /**
   * If `true`, the line's border will be anti-aliased.
   *
   * **Note:** Line2D is not accelerated by batching when being anti-aliased.
   */
  public var antialiased: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_ANTIALIASED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_ANTIALIASED, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_LINE2D, scriptIndex)
    return true
  }

  /**
   * Overwrites the position of the point at index [index] with the supplied [position].
   */
  public fun setPointPosition(index: Int, position: Vector2): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_POINT_POSITION, NIL)
  }

  /**
   * Returns the position of the point at index [index].
   */
  public fun getPointPosition(index: Int): Vector2 {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_POINT_POSITION, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the number of points in the line.
   */
  public fun getPointCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_POINT_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a point with the specified [position] relative to the line's own position. Appends the new point at the end of the point list.
   *
   * If [index] is given, the new point is inserted before the existing point identified by index [index]. Every existing point starting from [index] is shifted further down the list of points. The index must be greater than or equal to `0` and must not exceed the number of existing points in the line. See [getPointCount].
   */
  public fun addPoint(position: Vector2, index: Int = -1): Unit {
    TransferContext.writeArguments(VECTOR2 to position, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_ADD_POINT, NIL)
  }

  /**
   * Removes the point at index [index] from the line.
   */
  public fun removePoint(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_REMOVE_POINT, NIL)
  }

  /**
   * Removes all points from the line.
   */
  public fun clearPoints(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_CLEAR_POINTS, NIL)
  }

  public enum class LineJointMode(
    id: Long,
  ) {
    /**
     * The line's joints will be pointy. If `sharp_limit` is greater than the rotation of a joint, it becomes a bevel joint instead.
     */
    LINE_JOINT_SHARP(0),
    /**
     * The line's joints will be bevelled/chamfered.
     */
    LINE_JOINT_BEVEL(1),
    /**
     * The line's joints will be rounded.
     */
    LINE_JOINT_ROUND(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class LineCapMode(
    id: Long,
  ) {
    /**
     * Don't draw a line cap.
     */
    LINE_CAP_NONE(0),
    /**
     * Draws the line cap as a box.
     */
    LINE_CAP_BOX(1),
    /**
     * Draws the line cap as a circle.
     */
    LINE_CAP_ROUND(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class LineTextureMode(
    id: Long,
  ) {
    /**
     * Takes the left pixels of the texture and renders it over the whole line.
     */
    LINE_TEXTURE_NONE(0),
    /**
     * Tiles the texture over the line. [godot.CanvasItem.textureRepeat] of the [godot.Line2D] node must be [godot.CanvasItem.TEXTURE_REPEAT_ENABLED] or [godot.CanvasItem.TEXTURE_REPEAT_MIRROR] for it to work properly.
     */
    LINE_TEXTURE_TILE(1),
    /**
     * Stretches the texture across the line. [godot.CanvasItem.textureRepeat] of the [godot.Line2D] node must be [godot.CanvasItem.TEXTURE_REPEAT_DISABLED] for best results.
     */
    LINE_TEXTURE_STRETCH(2),
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

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PoolVector2Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
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
 *
 * **Note:** By default, Godot can only draw up to 4,096 polygon points at a time. To increase this limit, open the Project Settings and increase [godot.ProjectSettings.rendering/limits/buffers/canvasPolygonBufferSizeKb] and [godot.ProjectSettings.rendering/limits/buffers/canvasPolygonIndexBufferSizeKb].
 */
@GodotBaseType
public open class Line2D : Node2D() {
  /**
   * If `true`, the line's border will be anti-aliased.
   */
  public open var antialiased: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_ANTIALIASED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_ANTIALIASED, NIL)
    }

  /**
   * Controls the style of the line's first point. Use [enum LineCapMode] constants.
   */
  public open var beginCapMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_BEGIN_CAP_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_BEGIN_CAP_MODE, NIL)
    }

  /**
   * The line's color. Will not be used if a gradient is set.
   */
  public open var defaultColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_DEFAULT_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_DEFAULT_COLOR, NIL)
    }

  /**
   * Controls the style of the line's last point. Use [enum LineCapMode] constants.
   */
  public open var endCapMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_END_CAP_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_END_CAP_MODE, NIL)
    }

  /**
   * The gradient is drawn through the whole line from start to finish. The default color will not be used if a gradient is set.
   */
  public open var gradient: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_GRADIENT, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Gradient?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_GRADIENT, NIL)
    }

  /**
   * The style for the points between the start and the end.
   */
  public open var jointMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_JOINT_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_JOINT_MODE, NIL)
    }

  /**
   * The points that form the lines. The line is drawn between every point set in this array. Points are interpreted as local vectors.
   */
  public open var points: PoolVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_POINTS,
          POOL_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_POINTS, NIL)
    }

  /**
   * The smoothness of the rounded joints and caps. This is only used if a cap or joint is set as round.
   */
  public open var roundPrecision: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_ROUND_PRECISION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_ROUND_PRECISION, NIL)
    }

  /**
   * The direction difference in radians between vector points. This value is only used if `joint mode` is set to [LINE_JOINT_SHARP].
   */
  public open var sharpLimit: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_SHARP_LIMIT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_SHARP_LIMIT, NIL)
    }

  /**
   * The texture used for the line's texture. Uses `texture_mode` for drawing style.
   */
  public open var texture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_TEXTURE, NIL)
    }

  /**
   * The style to render the `texture` on the line. Use [enum LineTextureMode] constants.
   */
  public open var textureMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_TEXTURE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_TEXTURE_MODE, NIL)
    }

  /**
   * The line's width.
   */
  public open var width: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_WIDTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_WIDTH, NIL)
    }

  /**
   * The line's width varies with the curve. The original width is simply multiply by the value of the Curve.
   */
  public open var widthCurve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_WIDTH_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_WIDTH_CURVE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_LINE2D)
  }

  @CoreTypeHelper
  public open fun defaultColor(schedule: Color.() -> Unit): Color = defaultColor.apply{
      schedule(this)
      defaultColor = this
  }


  public open fun _curveChanged(): Unit {
  }

  public open fun _gradientChanged(): Unit {
  }

  /**
   * Adds a point at the `position`. Appends the point at the end of the line.
   *
   * If `at_position` is given, the point is inserted before the point number `at_position`, moving that point (and every point after) after the inserted point. If `at_position` is not given, or is an illegal value (`at_position < 0` or `at_position >= [getPointCount]`), the point will be appended at the end of the point list.
   */
  public open fun addPoint(position: Vector2, atPosition: Long = -1): Unit {
    TransferContext.writeArguments(VECTOR2 to position, LONG to atPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_ADD_POINT, NIL)
  }

  /**
   * Removes all points from the line.
   */
  public open fun clearPoints(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_CLEAR_POINTS, NIL)
  }

  /**
   * Returns the Line2D's amount of points.
   */
  public open fun getPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_POINT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns point `i`'s position.
   */
  public open fun getPointPosition(i: Long): Vector2 {
    TransferContext.writeArguments(LONG to i)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_POINT_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Removes the point at index `i` from the line.
   */
  public open fun removePoint(i: Long): Unit {
    TransferContext.writeArguments(LONG to i)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_REMOVE_POINT, NIL)
  }

  /**
   * Overwrites the position in point `i` with the supplied `position`.
   */
  public open fun setPointPosition(i: Long, position: Vector2): Unit {
    TransferContext.writeArguments(LONG to i, VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_POINT_POSITION, NIL)
  }

  public enum class LineTextureMode(
    id: Long
  ) {
    /**
     * Takes the left pixels of the texture and renders it over the whole line.
     */
    LINE_TEXTURE_NONE(0),
    /**
     * Tiles the texture over the line. The texture must be imported with **Repeat** enabled for it to work properly.
     */
    LINE_TEXTURE_TILE(1),
    /**
     * Stretches the texture across the line. Import the texture with **Repeat** disabled for best results.
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

  public enum class LineCapMode(
    id: Long
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

  public enum class LineJointMode(
    id: Long
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

  public companion object {
    /**
     * Draws the line cap as a box.
     */
    public final const val LINE_CAP_BOX: Long = 1

    /**
     * Don't draw a line cap.
     */
    public final const val LINE_CAP_NONE: Long = 0

    /**
     * Draws the line cap as a circle.
     */
    public final const val LINE_CAP_ROUND: Long = 2

    /**
     * The line's joints will be bevelled/chamfered.
     */
    public final const val LINE_JOINT_BEVEL: Long = 1

    /**
     * The line's joints will be rounded.
     */
    public final const val LINE_JOINT_ROUND: Long = 2

    /**
     * The line's joints will be pointy. If `sharp_limit` is greater than the rotation of a joint, it becomes a bevel joint instead.
     */
    public final const val LINE_JOINT_SHARP: Long = 0

    /**
     * Takes the left pixels of the texture and renders it over the whole line.
     */
    public final const val LINE_TEXTURE_NONE: Long = 0

    /**
     * Stretches the texture across the line. Import the texture with **Repeat** disabled for best results.
     */
    public final const val LINE_TEXTURE_STRETCH: Long = 2

    /**
     * Tiles the texture over the line. The texture must be imported with **Repeat** enabled for it to work properly.
     */
    public final const val LINE_TEXTURE_TILE: Long = 1
  }
}

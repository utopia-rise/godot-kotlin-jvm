// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
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
import kotlin.jvm.JvmOverloads

/**
 * A 2D polyline that can optionally be textured.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/583](https://godotengine.org/asset-library/asset/583)
 *
 * This node draws a 2D polyline, i.e. a shape consisting of several points connected by segments. [godot.Line2D] is not a mathematical polyline, i.e. the segments are not infinitely thin. It is intended for rendering and it can be colored and optionally textured.
 *
 * **Warning:** Certain configurations may be impossible to draw nicely, such as very sharp angles. In these situations, the node uses fallback drawing logic to look decent.
 *
 * **Note:** [godot.Line2D] is drawn using a 2D mesh.
 */
@GodotBaseType
public open class Line2D : Node2D() {
  /**
   * The points of the polyline, interpreted in local 2D coordinates. Segments are drawn between the adjacent points in this array.
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
   * If `true` and the polyline has more than 2 points, the last point and the first one will be connected by a segment.
   *
   * **Note:** The shape of the closing segment is not guaranteed to be seamless if a [widthCurve] is provided.
   *
   * **Note:** The joint between the closing segment and the first segment is drawn first and it samples the [gradient] and the [widthCurve] at the beginning. This is an implementation detail that might change in a future version.
   */
  public var closed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_IS_CLOSED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_CLOSED, NIL)
    }

  /**
   * The polyline's width.
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
   * The polyline's width curve. The width of the polyline over its length will be equivalent to the value of the width curve over its domain.
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
   * The color of the polyline. Will not be used if a gradient is set.
   */
  @CoreTypeLocalCopy
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
   * The gradient is drawn through the whole line from start to finish. The [defaultColor] will not be used if this property is set.
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
   * The texture used for the polyline. Uses [textureMode] for drawing style.
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
   * The style to render the [texture] of the polyline. Use [enum LineTextureMode] constants.
   */
  public var textureMode: LineTextureMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_TEXTURE_MODE, LONG)
      return Line2D.LineTextureMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_TEXTURE_MODE, NIL)
    }

  /**
   * The style of the connections between segments of the polyline. Use [enum LineJointMode] constants.
   */
  public var jointMode: LineJointMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_JOINT_MODE, LONG)
      return Line2D.LineJointMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_JOINT_MODE, NIL)
    }

  /**
   * The style of the beginning of the polyline, if [closed] is `false`. Use [enum LineCapMode] constants.
   */
  public var beginCapMode: LineCapMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_BEGIN_CAP_MODE, LONG)
      return Line2D.LineCapMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_BEGIN_CAP_MODE, NIL)
    }

  /**
   * The style of the end of the polyline, if [closed] is `false`. Use [enum LineCapMode] constants.
   */
  public var endCapMode: LineCapMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_END_CAP_MODE, LONG)
      return Line2D.LineCapMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_SET_END_CAP_MODE, NIL)
    }

  /**
   * Determines the miter limit of the polyline. Normally, when [jointMode] is set to [LINE_JOINT_SHARP], sharp angles fall back to using the logic of [LINE_JOINT_BEVEL] joints to prevent very long miters. Higher values of this property mean that the fallback to a bevel joint will happen at sharper angles.
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
   * The smoothness used for rounded joints and caps. Higher values result in smoother corners, but are more demanding to render and update.
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
   * If `true`, the polyline's border will be anti-aliased.
   *
   * **Note:** [godot.Line2D] is not accelerated by batching when being anti-aliased.
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
   * The color of the polyline. Will not be used if a gradient is set.
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
   * val myCoreType = line2d.defaultColor
   * //Your changes
   * line2d.defaultColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun defaultColorMutate(block: Color.() -> Unit): Color = defaultColor.apply{
      block(this)
      defaultColor = this
  }


  /**
   * Overwrites the position of the point at the given [index] with the supplied [position].
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
   * Returns the number of points in the polyline.
   */
  public fun getPointCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_GET_POINT_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a point with the specified [position] relative to the polyline's own position. If no [index] is provided, the new point will be added to the end of the points array.
   *
   * If [index] is given, the new point is inserted before the existing point identified by index [index]. The indices of the points after the new point get increased by 1. The provided [index] must not exceed the number of existing points in the polyline. See [getPointCount].
   */
  @JvmOverloads
  public fun addPoint(position: Vector2, index: Int = -1): Unit {
    TransferContext.writeArguments(VECTOR2 to position, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_ADD_POINT, NIL)
  }

  /**
   * Removes the point at index [index] from the polyline.
   */
  public fun removePoint(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_REMOVE_POINT, NIL)
  }

  /**
   * Removes all points from the polyline, making it empty.
   */
  public fun clearPoints(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINE2D_CLEAR_POINTS, NIL)
  }

  public enum class LineJointMode(
    id: Long,
  ) {
    /**
     * Makes the polyline's joints pointy, connecting the sides of the two segments by extending them until they intersect. If the rotation of a joint is too big (based on [sharpLimit]), the joint falls back to [LINE_JOINT_BEVEL] to prevent very long miters.
     */
    LINE_JOINT_SHARP(0),
    /**
     * Makes the polyline's joints bevelled/chamfered, connecting the sides of the two segments with a simple line.
     */
    LINE_JOINT_BEVEL(1),
    /**
     * Makes the polyline's joints rounded, connecting the sides of the two segments with an arc. The detail of this arc depends on [roundPrecision].
     */
    LINE_JOINT_ROUND(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class LineCapMode(
    id: Long,
  ) {
    /**
     * Draws no line cap.
     */
    LINE_CAP_NONE(0),
    /**
     * Draws the line cap as a box, slightly extending the first/last segment.
     */
    LINE_CAP_BOX(1),
    /**
     * Draws the line cap as a semicircle attached to the first/last segment.
     */
    LINE_CAP_ROUND(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class LineTextureMode(
    id: Long,
  ) {
    /**
     * Takes the left pixels of the texture and renders them over the whole polyline.
     */
    LINE_TEXTURE_NONE(0),
    /**
     * Tiles the texture over the polyline. [godot.CanvasItem.textureRepeat] of the [godot.Line2D] node must be [godot.CanvasItem.TEXTURE_REPEAT_ENABLED] or [godot.CanvasItem.TEXTURE_REPEAT_MIRROR] for it to work properly.
     */
    LINE_TEXTURE_TILE(1),
    /**
     * Stretches the texture across the polyline. [godot.CanvasItem.textureRepeat] of the [godot.Line2D] node must be [godot.CanvasItem.TEXTURE_REPEAT_DISABLED] for best results.
     */
    LINE_TEXTURE_STRETCH(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}

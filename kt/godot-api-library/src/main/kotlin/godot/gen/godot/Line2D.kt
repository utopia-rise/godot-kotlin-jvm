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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_LINE2D_INDEX: Int = 321

/**
 * This node draws a 2D polyline, i.e. a shape consisting of several points connected by segments.
 * [Line2D] is not a mathematical polyline, i.e. the segments are not infinitely thin. It is intended
 * for rendering and it can be colored and optionally textured.
 * **Warning:** Certain configurations may be impossible to draw nicely, such as very sharp angles.
 * In these situations, the node uses fallback drawing logic to look decent.
 * **Note:** [Line2D] is drawn using a 2D mesh.
 */
@GodotBaseType
public open class Line2D : Node2D() {
  /**
   * The points of the polyline, interpreted in local 2D coordinates. Segments are drawn between the
   * adjacent points in this array.
   */
  public final inline var points: PackedVector2Array
    @JvmName("pointsProperty")
    get() = getPoints()
    @JvmName("pointsProperty")
    set(`value`) {
      setPoints(value)
    }

  /**
   * If `true` and the polyline has more than 2 points, the last point and the first one will be
   * connected by a segment.
   * **Note:** The shape of the closing segment is not guaranteed to be seamless if a [widthCurve]
   * is provided.
   * **Note:** The joint between the closing segment and the first segment is drawn first and it
   * samples the [gradient] and the [widthCurve] at the beginning. This is an implementation detail
   * that might change in a future version.
   */
  public final inline var closed: Boolean
    @JvmName("closedProperty")
    get() = isClosed()
    @JvmName("closedProperty")
    set(`value`) {
      setClosed(value)
    }

  /**
   * The polyline's width.
   */
  public final inline var width: Float
    @JvmName("widthProperty")
    get() = getWidth()
    @JvmName("widthProperty")
    set(`value`) {
      setWidth(value)
    }

  /**
   * The polyline's width curve. The width of the polyline over its length will be equivalent to the
   * value of the width curve over its domain.
   */
  public final inline var widthCurve: Curve?
    @JvmName("widthCurveProperty")
    get() = getCurve()
    @JvmName("widthCurveProperty")
    set(`value`) {
      setCurve(value)
    }

  /**
   * The color of the polyline. Will not be used if a gradient is set.
   */
  @CoreTypeLocalCopy
  public final inline var defaultColor: Color
    @JvmName("defaultColorProperty")
    get() = getDefaultColor()
    @JvmName("defaultColorProperty")
    set(`value`) {
      setDefaultColor(value)
    }

  /**
   * The gradient is drawn through the whole line from start to finish. The [defaultColor] will not
   * be used if this property is set.
   */
  public final inline var gradient: Gradient?
    @JvmName("gradientProperty")
    get() = getGradient()
    @JvmName("gradientProperty")
    set(`value`) {
      setGradient(value)
    }

  /**
   * The texture used for the polyline. Uses [textureMode] for drawing style.
   */
  public final inline var texture: Texture2D?
    @JvmName("textureProperty")
    get() = getTexture()
    @JvmName("textureProperty")
    set(`value`) {
      setTexture(value)
    }

  /**
   * The style to render the [texture] of the polyline. Use [LineTextureMode] constants.
   */
  public final inline var textureMode: LineTextureMode
    @JvmName("textureModeProperty")
    get() = getTextureMode()
    @JvmName("textureModeProperty")
    set(`value`) {
      setTextureMode(value)
    }

  /**
   * The style of the connections between segments of the polyline. Use [LineJointMode] constants.
   */
  public final inline var jointMode: LineJointMode
    @JvmName("jointModeProperty")
    get() = getJointMode()
    @JvmName("jointModeProperty")
    set(`value`) {
      setJointMode(value)
    }

  /**
   * The style of the beginning of the polyline, if [closed] is `false`. Use [LineCapMode]
   * constants.
   */
  public final inline var beginCapMode: LineCapMode
    @JvmName("beginCapModeProperty")
    get() = getBeginCapMode()
    @JvmName("beginCapModeProperty")
    set(`value`) {
      setBeginCapMode(value)
    }

  /**
   * The style of the end of the polyline, if [closed] is `false`. Use [LineCapMode] constants.
   */
  public final inline var endCapMode: LineCapMode
    @JvmName("endCapModeProperty")
    get() = getEndCapMode()
    @JvmName("endCapModeProperty")
    set(`value`) {
      setEndCapMode(value)
    }

  /**
   * Determines the miter limit of the polyline. Normally, when [jointMode] is set to
   * [LINE_JOINT_SHARP], sharp angles fall back to using the logic of [LINE_JOINT_BEVEL] joints to
   * prevent very long miters. Higher values of this property mean that the fallback to a bevel joint
   * will happen at sharper angles.
   */
  public final inline var sharpLimit: Float
    @JvmName("sharpLimitProperty")
    get() = getSharpLimit()
    @JvmName("sharpLimitProperty")
    set(`value`) {
      setSharpLimit(value)
    }

  /**
   * The smoothness used for rounded joints and caps. Higher values result in smoother corners, but
   * are more demanding to render and update.
   */
  public final inline var roundPrecision: Int
    @JvmName("roundPrecisionProperty")
    get() = getRoundPrecision()
    @JvmName("roundPrecisionProperty")
    set(`value`) {
      setRoundPrecision(value)
    }

  /**
   * If `true`, the polyline's border will be anti-aliased.
   * **Note:** [Line2D] is not accelerated by batching when being anti-aliased.
   */
  public final inline var antialiased: Boolean
    @JvmName("antialiasedProperty")
    get() = getAntialiased()
    @JvmName("antialiasedProperty")
    set(`value`) {
      setAntialiased(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_LINE2D_INDEX, scriptIndex)
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
  public final fun defaultColorMutate(block: Color.() -> Unit): Color = defaultColor.apply{
      block(this)
      defaultColor = this
  }


  public final fun setPoints(points: PackedVector2Array): Unit {
    Internals.writeArguments(PACKED_VECTOR2_ARRAY to points)
    Internals.callMethod(rawPtr, MethodBindings.setPointsPtr, NIL)
  }

  public final fun getPoints(): PackedVector2Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPointsPtr, PACKED_VECTOR2_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * Overwrites the position of the point at the given [index] with the supplied [position].
   */
  public final fun setPointPosition(index: Int, position: Vector2): Unit {
    Internals.writeArguments(LONG to index.toLong(), VECTOR2 to position)
    Internals.callMethod(rawPtr, MethodBindings.setPointPositionPtr, NIL)
  }

  /**
   * Returns the position of the point at index [index].
   */
  public final fun getPointPosition(index: Int): Vector2 {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getPointPositionPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the number of points in the polyline.
   */
  public final fun getPointCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPointCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds a point with the specified [position] relative to the polyline's own position. If no
   * [index] is provided, the new point will be added to the end of the points array.
   * If [index] is given, the new point is inserted before the existing point identified by index
   * [index]. The indices of the points after the new point get increased by 1. The provided [index]
   * must not exceed the number of existing points in the polyline. See [getPointCount].
   */
  @JvmOverloads
  public final fun addPoint(position: Vector2, index: Int = -1): Unit {
    Internals.writeArguments(VECTOR2 to position, LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addPointPtr, NIL)
  }

  /**
   * Removes the point at index [index] from the polyline.
   */
  public final fun removePoint(index: Int): Unit {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.removePointPtr, NIL)
  }

  /**
   * Removes all points from the polyline, making it empty.
   */
  public final fun clearPoints(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearPointsPtr, NIL)
  }

  public final fun setClosed(closed: Boolean): Unit {
    Internals.writeArguments(BOOL to closed)
    Internals.callMethod(rawPtr, MethodBindings.setClosedPtr, NIL)
  }

  public final fun isClosed(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isClosedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setWidth(width: Float): Unit {
    Internals.writeArguments(DOUBLE to width.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
  }

  public final fun getWidth(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getWidthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setCurve(curve: Curve?): Unit {
    Internals.writeArguments(OBJECT to curve)
    Internals.callMethod(rawPtr, MethodBindings.setCurvePtr, NIL)
  }

  public final fun getCurve(): Curve? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCurvePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Curve?)
  }

  public final fun setDefaultColor(color: Color): Unit {
    Internals.writeArguments(COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.setDefaultColorPtr, NIL)
  }

  public final fun getDefaultColor(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDefaultColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setGradient(color: Gradient?): Unit {
    Internals.writeArguments(OBJECT to color)
    Internals.callMethod(rawPtr, MethodBindings.setGradientPtr, NIL)
  }

  public final fun getGradient(): Gradient? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGradientPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Gradient?)
  }

  public final fun setTexture(texture: Texture2D?): Unit {
    Internals.writeArguments(OBJECT to texture)
    Internals.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
  }

  public final fun getTexture(): Texture2D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setTextureMode(mode: LineTextureMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setTextureModePtr, NIL)
  }

  public final fun getTextureMode(): LineTextureMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextureModePtr, LONG)
    return Line2D.LineTextureMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setJointMode(mode: LineJointMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setJointModePtr, NIL)
  }

  public final fun getJointMode(): LineJointMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getJointModePtr, LONG)
    return Line2D.LineJointMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setBeginCapMode(mode: LineCapMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setBeginCapModePtr, NIL)
  }

  public final fun getBeginCapMode(): LineCapMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBeginCapModePtr, LONG)
    return Line2D.LineCapMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setEndCapMode(mode: LineCapMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setEndCapModePtr, NIL)
  }

  public final fun getEndCapMode(): LineCapMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEndCapModePtr, LONG)
    return Line2D.LineCapMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setSharpLimit(limit: Float): Unit {
    Internals.writeArguments(DOUBLE to limit.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setSharpLimitPtr, NIL)
  }

  public final fun getSharpLimit(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSharpLimitPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRoundPrecision(precision: Int): Unit {
    Internals.writeArguments(LONG to precision.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setRoundPrecisionPtr, NIL)
  }

  public final fun getRoundPrecision(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRoundPrecisionPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setAntialiased(antialiased: Boolean): Unit {
    Internals.writeArguments(BOOL to antialiased)
    Internals.callMethod(rawPtr, MethodBindings.setAntialiasedPtr, NIL)
  }

  public final fun getAntialiased(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAntialiasedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public enum class LineJointMode(
    id: Long,
  ) {
    /**
     * Makes the polyline's joints pointy, connecting the sides of the two segments by extending
     * them until they intersect. If the rotation of a joint is too big (based on [sharpLimit]), the
     * joint falls back to [LINE_JOINT_BEVEL] to prevent very long miters.
     */
    LINE_JOINT_SHARP(0),
    /**
     * Makes the polyline's joints bevelled/chamfered, connecting the sides of the two segments with
     * a simple line.
     */
    LINE_JOINT_BEVEL(1),
    /**
     * Makes the polyline's joints rounded, connecting the sides of the two segments with an arc.
     * The detail of this arc depends on [roundPrecision].
     */
    LINE_JOINT_ROUND(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LineJointMode = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): LineCapMode = entries.single { it.id == `value` }
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
     * Tiles the texture over the polyline. [CanvasItem.textureRepeat] of the [Line2D] node must be
     * [CanvasItem.TEXTURE_REPEAT_ENABLED] or [CanvasItem.TEXTURE_REPEAT_MIRROR] for it to work
     * properly.
     */
    LINE_TEXTURE_TILE(1),
    /**
     * Stretches the texture across the polyline. [CanvasItem.textureRepeat] of the [Line2D] node
     * must be [CanvasItem.TEXTURE_REPEAT_DISABLED] for best results.
     */
    LINE_TEXTURE_STRETCH(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LineTextureMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setPointsPtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "set_points", 1509147220)

    public val getPointsPtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "get_points", 2961356807)

    public val setPointPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "set_point_position", 163021252)

    public val getPointPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "get_point_position", 2299179447)

    public val getPointCountPtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "get_point_count", 3905245786)

    public val addPointPtr: VoidPtr = Internals.getMethodBindPtr("Line2D", "add_point", 2654014372)

    public val removePointPtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "remove_point", 1286410249)

    public val clearPointsPtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "clear_points", 3218959716)

    public val setClosedPtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "set_closed", 2586408642)

    public val isClosedPtr: VoidPtr = Internals.getMethodBindPtr("Line2D", "is_closed", 36873697)

    public val setWidthPtr: VoidPtr = Internals.getMethodBindPtr("Line2D", "set_width", 373806689)

    public val getWidthPtr: VoidPtr = Internals.getMethodBindPtr("Line2D", "get_width", 1740695150)

    public val setCurvePtr: VoidPtr = Internals.getMethodBindPtr("Line2D", "set_curve", 270443179)

    public val getCurvePtr: VoidPtr = Internals.getMethodBindPtr("Line2D", "get_curve", 2460114913)

    public val setDefaultColorPtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "set_default_color", 2920490490)

    public val getDefaultColorPtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "get_default_color", 3444240500)

    public val setGradientPtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "set_gradient", 2756054477)

    public val getGradientPtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "get_gradient", 132272999)

    public val setTexturePtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "set_texture", 4051416890)

    public val getTexturePtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "get_texture", 3635182373)

    public val setTextureModePtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "set_texture_mode", 1952559516)

    public val getTextureModePtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "get_texture_mode", 2341040722)

    public val setJointModePtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "set_joint_mode", 604292979)

    public val getJointModePtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "get_joint_mode", 2546544037)

    public val setBeginCapModePtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "set_begin_cap_mode", 1669024546)

    public val getBeginCapModePtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "get_begin_cap_mode", 1107511441)

    public val setEndCapModePtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "set_end_cap_mode", 1669024546)

    public val getEndCapModePtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "get_end_cap_mode", 1107511441)

    public val setSharpLimitPtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "set_sharp_limit", 373806689)

    public val getSharpLimitPtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "get_sharp_limit", 1740695150)

    public val setRoundPrecisionPtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "set_round_precision", 1286410249)

    public val getRoundPrecisionPtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "get_round_precision", 3905245786)

    public val setAntialiasedPtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "set_antialiased", 2586408642)

    public val getAntialiasedPtr: VoidPtr =
        Internals.getMethodBindPtr("Line2D", "get_antialiased", 36873697)
  }
}

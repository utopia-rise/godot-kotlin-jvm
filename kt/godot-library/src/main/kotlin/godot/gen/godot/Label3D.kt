// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Displays plain text in a 3D world.
 *
 * Label3D displays plain text in a 3D world. It gives you control over the horizontal and vertical alignment.
 */
@GodotBaseType
public open class Label3D : GeometryInstance() {
  /**
   * The alpha cutting mode to use for the sprite. See [enum AlphaCutMode] for possible values.
   */
  public open var alphaCut: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_ALPHA_CUT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_ALPHA_CUT, NIL)
    }

  /**
   * Threshold at which the alpha scissor will discard values.
   */
  public open var alphaScissorThreshold: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_ALPHA_SCISSOR_THRESHOLD, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_ALPHA_SCISSOR_THRESHOLD, NIL)
    }

  /**
   * If `true`, wraps the text to the [width].
   */
  public open var autowrap: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_AUTOWRAP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_AUTOWRAP, NIL)
    }

  /**
   * The billboard mode to use for the label. See [enum SpatialMaterial.BillboardMode] for possible values.
   */
  public open var billboard: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_BILLBOARD, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_BILLBOARD, NIL)
    }

  /**
   * If `true`, text can be seen from the back as well, if `false`, it is invisible when looking at it from behind.
   */
  public open var doubleSided: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_DOUBLE_SIDED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_DOUBLE_SIDED, NIL)
    }

  /**
   * If `true`, the label is rendered at the same size regardless of distance.
   */
  public open var fixedSize: Boolean
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_FIXED_SIZE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_FIXED_SIZE, NIL)
    }

  /**
   * [godot.Font] used for the [godot.Label3D]'s text.
   */
  public open var font: Font?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_FONT, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Font?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_FONT, NIL)
    }

  /**
   * Controls the text's horizontal alignment. Supports left, center, right. Set it to one of the [enum Align] constants.
   */
  public open var horizontalAlignment: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_HORIZONTAL_ALIGNMENT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_HORIZONTAL_ALIGNMENT,
          NIL)
    }

  /**
   * Vertical space between lines in multiline [godot.Label3D].
   */
  public open var lineSpacing: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_LINE_SPACING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_LINE_SPACING, NIL)
    }

  /**
   * Text [godot.core.Color] of the [godot.Label3D].
   */
  public open var modulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_MODULATE, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_MODULATE, NIL)
    }

  /**
   * If `true`, depth testing is disabled and the object will be drawn in render order.
   */
  public open var noDepthTest: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_NO_DEPTH_TEST, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_NO_DEPTH_TEST, NIL)
    }

  /**
   * The text drawing offset (in pixels).
   */
  public open var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_OFFSET, NIL)
    }

  /**
   * The tint of [godot.Font]'s outline.
   */
  public open var outlineModulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_OUTLINE_MODULATE,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_OUTLINE_MODULATE, NIL)
    }

  /**
   * Sets the render priority for the text outline. Higher priority objects will be sorted in front of lower priority objects.
   *
   * **Node:** This only applies if [alphaCut] is set to [ALPHA_CUT_DISABLED] (default value).
   *
   * **Note:** This only applies to sorting of transparent objects. This will not impact how transparent objects are sorted relative to opaque objects. This is because opaque objects are not sorted, while transparent objects are sorted from back to front (subject to priority).
   */
  public open var outlineRenderPriority: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_OUTLINE_RENDER_PRIORITY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_OUTLINE_RENDER_PRIORITY, NIL)
    }

  /**
   * The size of one pixel's width on the label to scale it in 3D.
   */
  public open var pixelSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_PIXEL_SIZE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_PIXEL_SIZE, NIL)
    }

  /**
   * Sets the render priority for the text. Higher priority objects will be sorted in front of lower priority objects.
   *
   * **Node:** This only applies if [alphaCut] is set to [ALPHA_CUT_DISABLED] (default value).
   *
   * **Note:** This only applies to sorting of transparent objects. This will not impact how transparent objects are sorted relative to opaque objects. This is because opaque objects are not sorted, while transparent objects are sorted from back to front (subject to priority).
   */
  public open var renderPriority: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_RENDER_PRIORITY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_RENDER_PRIORITY, NIL)
    }

  /**
   * If `true`, the [godot.Light] in the [godot.Environment] has effects on the label.
   */
  public open var shaded: Boolean
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_SHADED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_SHADED, NIL)
    }

  /**
   * The text to display on screen.
   */
  public open var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_TEXT, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_TEXT, NIL)
    }

  /**
   * If `true`, all the text displays as UPPERCASE.
   */
  public open var uppercase: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_UPPERCASE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_UPPERCASE, NIL)
    }

  /**
   * Controls the text's vertical alignment. Supports top, center, bottom. Set it to one of the [enum VAlign] constants.
   */
  public open var verticalAlignment: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_VERTICAL_ALIGNMENT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_VERTICAL_ALIGNMENT,
          NIL)
    }

  /**
   * Text width (in pixels), used for autowrap and fill alignment.
   */
  public open var width: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_WIDTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_WIDTH, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_LABEL3D)
  }

  @CoreTypeHelper
  public open fun modulate(schedule: Color.() -> Unit): Color = modulate.apply{
      schedule(this)
      modulate = this
  }


  @CoreTypeHelper
  public open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  @CoreTypeHelper
  public open fun outlineModulate(schedule: Color.() -> Unit): Color = outlineModulate.apply{
      schedule(this)
      outlineModulate = this
  }


  public open fun _fontChanged(): Unit {
  }

  public open fun _imUpdate(): Unit {
  }

  public open fun _queueUpdate(): Unit {
  }

  /**
   * Returns a [godot.TriangleMesh] with the label's vertices following its current configuration (such as its [pixelSize]).
   */
  public open fun generateTriangleMesh(): TriangleMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GENERATE_TRIANGLE_MESH,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TriangleMesh?
  }

  public enum class Align(
    id: Long
  ) {
    /**
     * Align rows to the left (default).
     */
    ALIGN_LEFT(0),
    /**
     * Align rows centered.
     */
    ALIGN_CENTER(1),
    /**
     * Align rows to the right.
     */
    ALIGN_RIGHT(2),
    /**
     * Expand row whitespaces to fit the width.
     */
    ALIGN_FILL(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DrawFlags(
    id: Long
  ) {
    /**
     * If set, lights in the environment affect the label.
     */
    FLAG_SHADED(0),
    /**
     * If set, text can be seen from the back as well. If not, the texture is invisible when looking at it from behind.
     */
    FLAG_DOUBLE_SIDED(1),
    /**
     * Disables the depth test, so this object is drawn on top of all others. However, objects drawn after it in the draw order may cover it.
     */
    FLAG_DISABLE_DEPTH_TEST(2),
    /**
     * Label is scaled by depth so that it always appears the same size on screen.
     */
    FLAG_FIXED_SIZE(3),
    /**
     * Represents the size of the [enum DrawFlags] enum.
     */
    FLAG_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class AlphaCutMode(
    id: Long
  ) {
    /**
     * This mode performs standard alpha blending. It can display translucent areas, but transparency sorting issues may be visible when multiple transparent materials are overlapping.
     */
    ALPHA_CUT_DISABLED(0),
    /**
     * This mode only allows fully transparent or fully opaque pixels. This mode is also known as *alpha testing* or *1-bit transparency*.
     *
     * **Note:** This mode might have issues with anti-aliased fonts and outlines, try adjusting [alphaScissorThreshold] or using SDF font.
     *
     * **Note:** When using text with overlapping glyphs (e.g., cursive scripts), this mode might have transparency sorting issues between the main text and the outline.
     */
    ALPHA_CUT_DISCARD(1),
    /**
     * This mode draws fully opaque pixels in the depth prepass. This is slower than [ALPHA_CUT_DISABLED] or [ALPHA_CUT_DISCARD], but it allows displaying translucent areas and smooth edges while using proper sorting.
     *
     * **Note:** When using text with overlapping glyphs (e.g., cursive scripts), this mode might have transparency sorting issues between the main text and the outline.
     */
    ALPHA_CUT_OPAQUE_PREPASS(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class VAlign(
    id: Long
  ) {
    /**
     * Align the whole text to the top.
     */
    VALIGN_TOP(0),
    /**
     * Align the whole text to the center.
     */
    VALIGN_CENTER(1),
    /**
     * Align the whole text to the bottom.
     */
    VALIGN_BOTTOM(2),
    /**
     * Align the whole text by spreading the rows.
     */
    VALIGN_FILL(3),
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
     * Align rows centered.
     */
    public final const val ALIGN_CENTER: Long = 1

    /**
     * Expand row whitespaces to fit the width.
     */
    public final const val ALIGN_FILL: Long = 3

    /**
     * Align rows to the left (default).
     */
    public final const val ALIGN_LEFT: Long = 0

    /**
     * Align rows to the right.
     */
    public final const val ALIGN_RIGHT: Long = 2

    /**
     * This mode performs standard alpha blending. It can display translucent areas, but transparency sorting issues may be visible when multiple transparent materials are overlapping.
     */
    public final const val ALPHA_CUT_DISABLED: Long = 0

    /**
     * This mode only allows fully transparent or fully opaque pixels. This mode is also known as *alpha testing* or *1-bit transparency*.
     *
     * **Note:** This mode might have issues with anti-aliased fonts and outlines, try adjusting [alphaScissorThreshold] or using SDF font.
     *
     * **Note:** When using text with overlapping glyphs (e.g., cursive scripts), this mode might have transparency sorting issues between the main text and the outline.
     */
    public final const val ALPHA_CUT_DISCARD: Long = 1

    /**
     * This mode draws fully opaque pixels in the depth prepass. This is slower than [ALPHA_CUT_DISABLED] or [ALPHA_CUT_DISCARD], but it allows displaying translucent areas and smooth edges while using proper sorting.
     *
     * **Note:** When using text with overlapping glyphs (e.g., cursive scripts), this mode might have transparency sorting issues between the main text and the outline.
     */
    public final const val ALPHA_CUT_OPAQUE_PREPASS: Long = 2

    /**
     * Disables the depth test, so this object is drawn on top of all others. However, objects drawn after it in the draw order may cover it.
     */
    public final const val FLAG_DISABLE_DEPTH_TEST: Long = 2

    /**
     * If set, text can be seen from the back as well. If not, the texture is invisible when looking at it from behind.
     */
    public final const val FLAG_DOUBLE_SIDED: Long = 1

    /**
     * Label is scaled by depth so that it always appears the same size on screen.
     */
    public final const val FLAG_FIXED_SIZE: Long = 3

    /**
     * Represents the size of the [enum DrawFlags] enum.
     */
    public final const val FLAG_MAX: Long = 4

    /**
     * If set, lights in the environment affect the label.
     */
    public final const val FLAG_SHADED: Long = 0

    /**
     * Align the whole text to the bottom.
     */
    public final const val VALIGN_BOTTOM: Long = 2

    /**
     * Align the whole text to the center.
     */
    public final const val VALIGN_CENTER: Long = 1

    /**
     * Align the whole text by spreading the rows.
     */
    public final const val VALIGN_FILL: Long = 3

    /**
     * Align the whole text to the top.
     */
    public final const val VALIGN_TOP: Long = 0
  }
}

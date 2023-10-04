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
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A node for displaying plain text in 3D space.
 *
 * A node for displaying plain text in 3D space. By adjusting various properties of this node, you can configure things such as the text's appearance and whether it always faces the camera.
 */
@GodotBaseType
public open class Label3D : GeometryInstance3D() {
  /**
   * The size of one pixel's width on the label to scale it in 3D. To make the font look more detailed when up close, increase [fontSize] while decreasing [pixelSize] at the same time.
   */
  public var pixelSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_PIXEL_SIZE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_PIXEL_SIZE, NIL)
    }

  /**
   * The text drawing offset (in pixels).
   */
  @CoreTypeLocalCopy
  public var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_OFFSET, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_OFFSET, NIL)
    }

  /**
   * The billboard mode to use for the label. See [enum BaseMaterial3D.BillboardMode] for possible values.
   */
  public var billboard: BaseMaterial3D.BillboardMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_BILLBOARD_MODE, LONG)
      return BaseMaterial3D.BillboardMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_BILLBOARD_MODE, NIL)
    }

  /**
   * If `true`, the [godot.Light3D] in the [godot.Environment] has effects on the label.
   */
  public var shaded: Boolean
    get() {
      TransferContext.writeArguments(LONG to 0)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_DRAW_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_DRAW_FLAG, NIL)
    }

  /**
   * If `true`, text can be seen from the back as well, if `false`, it is invisible when looking at it from behind.
   */
  public var doubleSided: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_DRAW_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_DRAW_FLAG, NIL)
    }

  /**
   * If `true`, depth testing is disabled and the object will be drawn in render order.
   */
  public var noDepthTest: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_DRAW_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_DRAW_FLAG, NIL)
    }

  /**
   * If `true`, the label is rendered at the same size regardless of distance.
   */
  public var fixedSize: Boolean
    get() {
      TransferContext.writeArguments(LONG to 3)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_DRAW_FLAG, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_DRAW_FLAG, NIL)
    }

  /**
   * The alpha cutting mode to use for the sprite. See [enum AlphaCutMode] for possible values.
   */
  public var alphaCut: AlphaCutMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_ALPHA_CUT_MODE, LONG)
      return Label3D.AlphaCutMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_ALPHA_CUT_MODE, NIL)
    }

  /**
   * Threshold at which the alpha scissor will discard values.
   */
  public var alphaScissorThreshold: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_ALPHA_SCISSOR_THRESHOLD, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_ALPHA_SCISSOR_THRESHOLD, NIL)
    }

  /**
   * The hashing scale for Alpha Hash. Recommended values between `0` and `2`.
   */
  public var alphaHashScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_ALPHA_HASH_SCALE,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_ALPHA_HASH_SCALE, NIL)
    }

  /**
   * The type of alpha antialiasing to apply. See [enum BaseMaterial3D.AlphaAntiAliasing].
   */
  public var alphaAntialiasingMode: BaseMaterial3D.AlphaAntiAliasing
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_ALPHA_ANTIALIASING,
          LONG)
      return BaseMaterial3D.AlphaAntiAliasing.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_ALPHA_ANTIALIASING,
          NIL)
    }

  /**
   * Threshold at which antialiasing will be applied on the alpha channel.
   */
  public var alphaAntialiasingEdge: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_ALPHA_ANTIALIASING_EDGE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_ALPHA_ANTIALIASING_EDGE, NIL)
    }

  /**
   * Filter flags for the texture. See [enum BaseMaterial3D.TextureFilter] for options.
   */
  public var textureFilter: BaseMaterial3D.TextureFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_TEXTURE_FILTER, LONG)
      return BaseMaterial3D.TextureFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_TEXTURE_FILTER, NIL)
    }

  /**
   * Sets the render priority for the text. Higher priority objects will be sorted in front of lower priority objects.
   *
   * **Note:** This only applies if [alphaCut] is set to [ALPHA_CUT_DISABLED] (default value).
   *
   * **Note:** This only applies to sorting of transparent objects. This will not impact how transparent objects are sorted relative to opaque objects. This is because opaque objects are not sorted, while transparent objects are sorted from back to front (subject to priority).
   */
  public var renderPriority: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_RENDER_PRIORITY, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_RENDER_PRIORITY, NIL)
    }

  /**
   * Sets the render priority for the text outline. Higher priority objects will be sorted in front of lower priority objects.
   *
   * **Note:** This only applies if [alphaCut] is set to [ALPHA_CUT_DISABLED] (default value).
   *
   * **Note:** This only applies to sorting of transparent objects. This will not impact how transparent objects are sorted relative to opaque objects. This is because opaque objects are not sorted, while transparent objects are sorted from back to front (subject to priority).
   */
  public var outlineRenderPriority: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_OUTLINE_RENDER_PRIORITY, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_OUTLINE_RENDER_PRIORITY, NIL)
    }

  /**
   * Text [godot.core.Color] of the [godot.Label3D].
   */
  @CoreTypeLocalCopy
  public var modulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_MODULATE, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_MODULATE, NIL)
    }

  /**
   * The tint of text outline.
   */
  @CoreTypeLocalCopy
  public var outlineModulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_OUTLINE_MODULATE,
          COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_OUTLINE_MODULATE, NIL)
    }

  /**
   * The text to display on screen.
   */
  public var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_TEXT, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_TEXT, NIL)
    }

  /**
   * Font configuration used to display text.
   */
  public var font: Font?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_FONT, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Font?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_FONT, NIL)
    }

  /**
   * Font size of the [godot.Label3D]'s text. To make the font look more detailed when up close, increase [fontSize] while decreasing [pixelSize] at the same time.
   *
   * Higher font sizes require more time to render new characters, which can cause stuttering during gameplay.
   */
  public var fontSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_FONT_SIZE, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_FONT_SIZE, NIL)
    }

  /**
   * Text outline size.
   */
  public var outlineSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_OUTLINE_SIZE, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_OUTLINE_SIZE, NIL)
    }

  /**
   * Controls the text's horizontal alignment. Supports left, center, right, and fill, or justify. Set it to one of the [enum HorizontalAlignment] constants.
   */
  public var horizontalAlignment: HorizontalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_HORIZONTAL_ALIGNMENT,
          LONG)
      return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_HORIZONTAL_ALIGNMENT,
          NIL)
    }

  /**
   * Controls the text's vertical alignment. Supports top, center, bottom. Set it to one of the [enum VerticalAlignment] constants.
   */
  public var verticalAlignment: VerticalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_VERTICAL_ALIGNMENT,
          LONG)
      return VerticalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_VERTICAL_ALIGNMENT,
          NIL)
    }

  /**
   * If `true`, all the text displays as UPPERCASE.
   */
  public var uppercase: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_IS_UPPERCASE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_UPPERCASE, NIL)
    }

  /**
   * Vertical space between lines in multiline [godot.Label3D].
   */
  public var lineSpacing: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_LINE_SPACING, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_LINE_SPACING, NIL)
    }

  /**
   * If set to something other than [godot.TextServer.AUTOWRAP_OFF], the text gets wrapped inside the node's bounding rectangle. If you resize the node, it will change its height automatically to show all the text. To see how each mode behaves, see [enum TextServer.AutowrapMode].
   */
  public var autowrapMode: TextServer.AutowrapMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_AUTOWRAP_MODE, LONG)
      return TextServer.AutowrapMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_AUTOWRAP_MODE, NIL)
    }

  /**
   * Line fill alignment rules. For more info see [enum TextServer.JustificationFlag].
   */
  public var justificationFlags: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_JUSTIFICATION_FLAGS,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_JUSTIFICATION_FLAGS,
          NIL)
    }

  /**
   * Text width (in pixels), used for autowrap and fill alignment.
   */
  public var width: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_WIDTH, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_WIDTH, NIL)
    }

  /**
   * Base text writing direction.
   */
  public var textDirection: TextServer.Direction
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_TEXT_DIRECTION, LONG)
      return TextServer.Direction.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_TEXT_DIRECTION, NIL)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_LANGUAGE, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_LANGUAGE, NIL)
    }

  /**
   * Set BiDi algorithm override for the structured text.
   */
  public var structuredTextBidiOverride: TextServer.StructuredTextParser
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_STRUCTURED_TEXT_BIDI_OVERRIDE, LONG)
      return TextServer.StructuredTextParser.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_STRUCTURED_TEXT_BIDI_OVERRIDE, NIL)
    }

  /**
   * Set additional options for BiDi override.
   */
  public var structuredTextBidiOverrideOptions: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL3D_GET_STRUCTURED_TEXT_BIDI_OVERRIDE_OPTIONS, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL3D_SET_STRUCTURED_TEXT_BIDI_OVERRIDE_OPTIONS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_LABEL3D, scriptIndex)
    return true
  }

  /**
   * The text drawing offset (in pixels).
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
   * val myCoreType = label3d.offset
   * //Your changes
   * label3d.offset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
      block(this)
      offset = this
  }


  /**
   * Text [godot.core.Color] of the [godot.Label3D].
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
   * val myCoreType = label3d.modulate
   * //Your changes
   * label3d.modulate = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun modulateMutate(block: Color.() -> Unit): Color = modulate.apply{
      block(this)
      modulate = this
  }


  /**
   * The tint of text outline.
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
   * val myCoreType = label3d.outlineModulate
   * //Your changes
   * label3d.outlineModulate = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun outlineModulateMutate(block: Color.() -> Unit): Color = outlineModulate.apply{
      block(this)
      outlineModulate = this
  }


  /**
   * Returns a [godot.TriangleMesh] with the label's vertices following its current configuration (such as its [pixelSize]).
   */
  public fun generateTriangleMesh(): TriangleMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL3D_GENERATE_TRIANGLE_MESH,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TriangleMesh?)
  }

  public enum class DrawFlags(
    id: Long,
  ) {
    /**
     * If set, lights in the environment affect the label.
     */
    FLAG_SHADED(0),
    /**
     * If set, text can be seen from the back as well. If not, the text is invisible when looking at it from behind.
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class AlphaCutMode(
    id: Long,
  ) {
    /**
     * This mode performs standard alpha blending. It can display translucent areas, but transparency sorting issues may be visible when multiple transparent materials are overlapping. [godot.GeometryInstance3D.castShadow] has no effect when this transparency mode is used; the [godot.Label3D] will never cast shadows.
     */
    ALPHA_CUT_DISABLED(0),
    /**
     * This mode only allows fully transparent or fully opaque pixels. Harsh edges will be visible unless some form of screen-space antialiasing is enabled (see [godot.ProjectSettings.rendering/antiAliasing/quality/screenSpaceAa]). This mode is also known as *alpha testing* or *1-bit transparency*.
     *
     * **Note:** This mode might have issues with anti-aliased fonts and outlines, try adjusting [alphaScissorThreshold] or using MSDF font.
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
    /**
     * This mode draws cuts off all values below a spatially-deterministic threshold, the rest will remain opaque.
     */
    ALPHA_CUT_HASH(3),
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

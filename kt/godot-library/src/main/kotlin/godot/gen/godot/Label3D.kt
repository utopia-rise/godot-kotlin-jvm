// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.TextServer.JustificationFlagValue
import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TypeManager
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
import godot.util.VoidPtr
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
 * A node for displaying plain text in 3D space. By adjusting various properties of this node, you
 * can configure things such as the text's appearance and whether it always faces the camera.
 */
@GodotBaseType
public open class Label3D : GeometryInstance3D() {
  /**
   * The size of one pixel's width on the label to scale it in 3D. To make the font look more
   * detailed when up close, increase [fontSize] while decreasing [pixelSize] at the same time.
   */
  public var pixelSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPixelSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPixelSizePtr, NIL)
    }

  /**
   * The text drawing offset (in pixels).
   */
  @CoreTypeLocalCopy
  public var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
    }

  /**
   * The billboard mode to use for the label. See [BaseMaterial3D.BillboardMode] for possible
   * values.
   */
  public var billboard: BaseMaterial3D.BillboardMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBillboardModePtr, LONG)
      return BaseMaterial3D.BillboardMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBillboardModePtr, NIL)
    }

  /**
   * If `true`, the [Light3D] in the [Environment] has effects on the label.
   */
  public var shaded: Boolean
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDrawFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawFlagPtr, NIL)
    }

  /**
   * If `true`, text can be seen from the back as well, if `false`, it is invisible when looking at
   * it from behind.
   */
  public var doubleSided: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDrawFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawFlagPtr, NIL)
    }

  /**
   * If `true`, depth testing is disabled and the object will be drawn in render order.
   */
  public var noDepthTest: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDrawFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawFlagPtr, NIL)
    }

  /**
   * If `true`, the label is rendered at the same size regardless of distance.
   */
  public var fixedSize: Boolean
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDrawFlagPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDrawFlagPtr, NIL)
    }

  /**
   * The alpha cutting mode to use for the sprite. See [AlphaCutMode] for possible values.
   */
  public var alphaCut: AlphaCutMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaCutModePtr, LONG)
      return Label3D.AlphaCutMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaCutModePtr, NIL)
    }

  /**
   * Threshold at which the alpha scissor will discard values.
   */
  public var alphaScissorThreshold: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaScissorThresholdPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaScissorThresholdPtr, NIL)
    }

  /**
   * The hashing scale for Alpha Hash. Recommended values between `0` and `2`.
   */
  public var alphaHashScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaHashScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaHashScalePtr, NIL)
    }

  /**
   * The type of alpha antialiasing to apply. See [BaseMaterial3D.AlphaAntiAliasing].
   */
  public var alphaAntialiasingMode: BaseMaterial3D.AlphaAntiAliasing
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaAntialiasingPtr, LONG)
      return BaseMaterial3D.AlphaAntiAliasing.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaAntialiasingPtr, NIL)
    }

  /**
   * Threshold at which antialiasing will be applied on the alpha channel.
   */
  public var alphaAntialiasingEdge: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaAntialiasingEdgePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaAntialiasingEdgePtr, NIL)
    }

  /**
   * Filter flags for the texture. See [BaseMaterial3D.TextureFilter] for options.
   */
  public var textureFilter: BaseMaterial3D.TextureFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureFilterPtr, LONG)
      return BaseMaterial3D.TextureFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureFilterPtr, NIL)
    }

  /**
   * Sets the render priority for the text. Higher priority objects will be sorted in front of lower
   * priority objects.
   * **Note:** This only applies if [alphaCut] is set to [ALPHA_CUT_DISABLED] (default value).
   * **Note:** This only applies to sorting of transparent objects. This will not impact how
   * transparent objects are sorted relative to opaque objects. This is because opaque objects are not
   * sorted, while transparent objects are sorted from back to front (subject to priority).
   */
  public var renderPriority: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRenderPriorityPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setRenderPriorityPtr, NIL)
    }

  /**
   * Sets the render priority for the text outline. Higher priority objects will be sorted in front
   * of lower priority objects.
   * **Note:** This only applies if [alphaCut] is set to [ALPHA_CUT_DISABLED] (default value).
   * **Note:** This only applies to sorting of transparent objects. This will not impact how
   * transparent objects are sorted relative to opaque objects. This is because opaque objects are not
   * sorted, while transparent objects are sorted from back to front (subject to priority).
   */
  public var outlineRenderPriority: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOutlineRenderPriorityPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setOutlineRenderPriorityPtr, NIL)
    }

  /**
   * Text [Color] of the [Label3D].
   */
  @CoreTypeLocalCopy
  public var modulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getModulatePtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setModulatePtr, NIL)
    }

  /**
   * The tint of text outline.
   */
  @CoreTypeLocalCopy
  public var outlineModulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOutlineModulatePtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOutlineModulatePtr, NIL)
    }

  /**
   * The text to display on screen.
   */
  public var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextPtr, NIL)
    }

  /**
   * Font configuration used to display text.
   */
  public var font: Font?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFontPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Font?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFontPtr, NIL)
    }

  /**
   * Font size of the [Label3D]'s text. To make the font look more detailed when up close, increase
   * [fontSize] while decreasing [pixelSize] at the same time.
   * Higher font sizes require more time to render new characters, which can cause stuttering during
   * gameplay.
   */
  public var fontSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFontSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFontSizePtr, NIL)
    }

  /**
   * Text outline size.
   */
  public var outlineSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOutlineSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setOutlineSizePtr, NIL)
    }

  /**
   * Controls the text's horizontal alignment. Supports left, center, right, and fill, or justify.
   * Set it to one of the [HorizontalAlignment] constants.
   */
  public var horizontalAlignment: HorizontalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHorizontalAlignmentPtr, LONG)
      return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setHorizontalAlignmentPtr, NIL)
    }

  /**
   * Controls the text's vertical alignment. Supports top, center, bottom. Set it to one of the
   * [VerticalAlignment] constants.
   */
  public var verticalAlignment: VerticalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVerticalAlignmentPtr, LONG)
      return VerticalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticalAlignmentPtr, NIL)
    }

  /**
   * If `true`, all the text displays as UPPERCASE.
   */
  public var uppercase: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUppercasePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUppercasePtr, NIL)
    }

  /**
   * Vertical space between lines in multiline [Label3D].
   */
  public var lineSpacing: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLineSpacingPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLineSpacingPtr, NIL)
    }

  /**
   * If set to something other than [TextServer.AUTOWRAP_OFF], the text gets wrapped inside the
   * node's bounding rectangle. If you resize the node, it will change its height automatically to show
   * all the text. To see how each mode behaves, see [TextServer.AutowrapMode].
   */
  public var autowrapMode: TextServer.AutowrapMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutowrapModePtr, LONG)
      return TextServer.AutowrapMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutowrapModePtr, NIL)
    }

  /**
   * Line fill alignment rules. For more info see [TextServer.JustificationFlag].
   */
  public var justificationFlags: TextServer.JustificationFlag
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getJustificationFlagsPtr, LONG)
      return JustificationFlagValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, MethodBindings.setJustificationFlagsPtr, NIL)
    }

  /**
   * Text width (in pixels), used for autowrap and fill alignment.
   */
  public var width: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWidthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setWidthPtr, NIL)
    }

  /**
   * Base text writing direction.
   */
  public var textDirection: TextServer.Direction
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextDirectionPtr, LONG)
      return TextServer.Direction.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextDirectionPtr, NIL)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale
   * is used instead.
   */
  public var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLanguagePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLanguagePtr, NIL)
    }

  /**
   * Set BiDi algorithm override for the structured text.
   */
  public var structuredTextBidiOverride: TextServer.StructuredTextParser
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverridePtr, LONG)
      return TextServer.StructuredTextParser.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverridePtr, NIL)
    }

  /**
   * Set additional options for BiDi override.
   */
  public var structuredTextBidiOverrideOptions: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverrideOptionsPtr,
          ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverrideOptionsPtr,
          NIL)
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
   * Text [Color] of the [Label3D].
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
   * Returns a [TriangleMesh] with the label's vertices following its current configuration (such as
   * its [pixelSize]).
   */
  public fun generateTriangleMesh(): TriangleMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.generateTriangleMeshPtr, OBJECT)
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
     * If set, text can be seen from the back as well. If not, the text is invisible when looking at
     * it from behind.
     */
    FLAG_DOUBLE_SIDED(1),
    /**
     * Disables the depth test, so this object is drawn on top of all others. However, objects drawn
     * after it in the draw order may cover it.
     */
    FLAG_DISABLE_DEPTH_TEST(2),
    /**
     * Label is scaled by depth so that it always appears the same size on screen.
     */
    FLAG_FIXED_SIZE(3),
    /**
     * Represents the size of the [DrawFlags] enum.
     */
    FLAG_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DrawFlags = entries.single { it.id == `value` }
    }
  }

  public enum class AlphaCutMode(
    id: Long,
  ) {
    /**
     * This mode performs standard alpha blending. It can display translucent areas, but
     * transparency sorting issues may be visible when multiple transparent materials are overlapping.
     * [GeometryInstance3D.castShadow] has no effect when this transparency mode is used; the [Label3D]
     * will never cast shadows.
     */
    ALPHA_CUT_DISABLED(0),
    /**
     * This mode only allows fully transparent or fully opaque pixels. Harsh edges will be visible
     * unless some form of screen-space antialiasing is enabled (see
     * [ProjectSettings.rendering/antiAliasing/quality/screenSpaceAa]). This mode is also known as
     * *alpha testing* or *1-bit transparency*.
     * **Note:** This mode might have issues with anti-aliased fonts and outlines, try adjusting
     * [alphaScissorThreshold] or using MSDF font.
     * **Note:** When using text with overlapping glyphs (e.g., cursive scripts), this mode might
     * have transparency sorting issues between the main text and the outline.
     */
    ALPHA_CUT_DISCARD(1),
    /**
     * This mode draws fully opaque pixels in the depth prepass. This is slower than
     * [ALPHA_CUT_DISABLED] or [ALPHA_CUT_DISCARD], but it allows displaying translucent areas and
     * smooth edges while using proper sorting.
     * **Note:** When using text with overlapping glyphs (e.g., cursive scripts), this mode might
     * have transparency sorting issues between the main text and the outline.
     */
    ALPHA_CUT_OPAQUE_PREPASS(2),
    /**
     * This mode draws cuts off all values below a spatially-deterministic threshold, the rest will
     * remain opaque.
     */
    ALPHA_CUT_HASH(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AlphaCutMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "set_horizontal_alignment")

    public val getHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "get_horizontal_alignment")

    public val setVerticalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "set_vertical_alignment")

    public val getVerticalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "get_vertical_alignment")

    public val setModulatePtr: VoidPtr = TypeManager.getMethodBindPtr("Label3D", "set_modulate")

    public val getModulatePtr: VoidPtr = TypeManager.getMethodBindPtr("Label3D", "get_modulate")

    public val setOutlineModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "set_outline_modulate")

    public val getOutlineModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "get_outline_modulate")

    public val setTextPtr: VoidPtr = TypeManager.getMethodBindPtr("Label3D", "set_text")

    public val getTextPtr: VoidPtr = TypeManager.getMethodBindPtr("Label3D", "get_text")

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "set_text_direction")

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "get_text_direction")

    public val setLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("Label3D", "set_language")

    public val getLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("Label3D", "get_language")

    public val setStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "set_structured_text_bidi_override")

    public val getStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "get_structured_text_bidi_override")

    public val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "set_structured_text_bidi_override_options")

    public val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "get_structured_text_bidi_override_options")

    public val setUppercasePtr: VoidPtr = TypeManager.getMethodBindPtr("Label3D", "set_uppercase")

    public val isUppercasePtr: VoidPtr = TypeManager.getMethodBindPtr("Label3D", "is_uppercase")

    public val setRenderPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "set_render_priority")

    public val getRenderPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "get_render_priority")

    public val setOutlineRenderPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "set_outline_render_priority")

    public val getOutlineRenderPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "get_outline_render_priority")

    public val setFontPtr: VoidPtr = TypeManager.getMethodBindPtr("Label3D", "set_font")

    public val getFontPtr: VoidPtr = TypeManager.getMethodBindPtr("Label3D", "get_font")

    public val setFontSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Label3D", "set_font_size")

    public val getFontSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Label3D", "get_font_size")

    public val setOutlineSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "set_outline_size")

    public val getOutlineSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "get_outline_size")

    public val setLineSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "set_line_spacing")

    public val getLineSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "get_line_spacing")

    public val setAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "set_autowrap_mode")

    public val getAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "get_autowrap_mode")

    public val setJustificationFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "set_justification_flags")

    public val getJustificationFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "get_justification_flags")

    public val setWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("Label3D", "set_width")

    public val getWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("Label3D", "get_width")

    public val setPixelSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Label3D", "set_pixel_size")

    public val getPixelSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Label3D", "get_pixel_size")

    public val setOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Label3D", "set_offset")

    public val getOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("Label3D", "get_offset")

    public val setDrawFlagPtr: VoidPtr = TypeManager.getMethodBindPtr("Label3D", "set_draw_flag")

    public val getDrawFlagPtr: VoidPtr = TypeManager.getMethodBindPtr("Label3D", "get_draw_flag")

    public val setBillboardModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "set_billboard_mode")

    public val getBillboardModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "get_billboard_mode")

    public val setAlphaCutModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "set_alpha_cut_mode")

    public val getAlphaCutModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "get_alpha_cut_mode")

    public val setAlphaScissorThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "set_alpha_scissor_threshold")

    public val getAlphaScissorThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "get_alpha_scissor_threshold")

    public val setAlphaHashScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "set_alpha_hash_scale")

    public val getAlphaHashScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "get_alpha_hash_scale")

    public val setAlphaAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "set_alpha_antialiasing")

    public val getAlphaAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "get_alpha_antialiasing")

    public val setAlphaAntialiasingEdgePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "set_alpha_antialiasing_edge")

    public val getAlphaAntialiasingEdgePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "get_alpha_antialiasing_edge")

    public val setTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "set_texture_filter")

    public val getTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "get_texture_filter")

    public val generateTriangleMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label3D", "generate_triangle_mesh")
  }
}

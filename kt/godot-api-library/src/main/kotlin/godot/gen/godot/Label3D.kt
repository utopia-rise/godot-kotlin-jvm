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
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.util.Internals
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
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_LABEL3D_INDEX: Int = 346

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
  public final inline var pixelSize: Float
    @JvmName("pixelSizeProperty")
    get() = getPixelSize()
    @JvmName("pixelSizeProperty")
    set(`value`) {
      setPixelSize(value)
    }

  /**
   * The text drawing offset (in pixels).
   */
  @CoreTypeLocalCopy
  public final inline var offset: Vector2
    @JvmName("offsetProperty")
    get() = getOffset()
    @JvmName("offsetProperty")
    set(`value`) {
      setOffset(value)
    }

  /**
   * The billboard mode to use for the label. See [BaseMaterial3D.BillboardMode] for possible
   * values.
   */
  public final inline var billboard: BaseMaterial3D.BillboardMode
    @JvmName("billboardProperty")
    get() = getBillboardMode()
    @JvmName("billboardProperty")
    set(`value`) {
      setBillboardMode(value)
    }

  /**
   * If `true`, the [Light3D] in the [Environment] has effects on the label.
   */
  public final inline var shaded: Boolean
    @JvmName("shadedProperty")
    get() = getDrawFlag(Label3D.DrawFlags.FLAG_SHADED)
    @JvmName("shadedProperty")
    set(`value`) {
      setDrawFlag(Label3D.DrawFlags.FLAG_SHADED, value)
    }

  /**
   * If `true`, text can be seen from the back as well, if `false`, it is invisible when looking at
   * it from behind.
   */
  public final inline var doubleSided: Boolean
    @JvmName("doubleSidedProperty")
    get() = getDrawFlag(Label3D.DrawFlags.FLAG_DOUBLE_SIDED)
    @JvmName("doubleSidedProperty")
    set(`value`) {
      setDrawFlag(Label3D.DrawFlags.FLAG_DOUBLE_SIDED, value)
    }

  /**
   * If `true`, depth testing is disabled and the object will be drawn in render order.
   */
  public final inline var noDepthTest: Boolean
    @JvmName("noDepthTestProperty")
    get() = getDrawFlag(Label3D.DrawFlags.FLAG_DISABLE_DEPTH_TEST)
    @JvmName("noDepthTestProperty")
    set(`value`) {
      setDrawFlag(Label3D.DrawFlags.FLAG_DISABLE_DEPTH_TEST, value)
    }

  /**
   * If `true`, the label is rendered at the same size regardless of distance.
   */
  public final inline var fixedSize: Boolean
    @JvmName("fixedSizeProperty")
    get() = getDrawFlag(Label3D.DrawFlags.FLAG_FIXED_SIZE)
    @JvmName("fixedSizeProperty")
    set(`value`) {
      setDrawFlag(Label3D.DrawFlags.FLAG_FIXED_SIZE, value)
    }

  /**
   * The alpha cutting mode to use for the sprite. See [AlphaCutMode] for possible values.
   */
  public final inline var alphaCut: AlphaCutMode
    @JvmName("alphaCutProperty")
    get() = getAlphaCutMode()
    @JvmName("alphaCutProperty")
    set(`value`) {
      setAlphaCutMode(value)
    }

  /**
   * Threshold at which the alpha scissor will discard values.
   */
  public final inline var alphaScissorThreshold: Float
    @JvmName("alphaScissorThresholdProperty")
    get() = getAlphaScissorThreshold()
    @JvmName("alphaScissorThresholdProperty")
    set(`value`) {
      setAlphaScissorThreshold(value)
    }

  /**
   * The hashing scale for Alpha Hash. Recommended values between `0` and `2`.
   */
  public final inline var alphaHashScale: Float
    @JvmName("alphaHashScaleProperty")
    get() = getAlphaHashScale()
    @JvmName("alphaHashScaleProperty")
    set(`value`) {
      setAlphaHashScale(value)
    }

  /**
   * The type of alpha antialiasing to apply. See [BaseMaterial3D.AlphaAntiAliasing].
   */
  public final inline var alphaAntialiasingMode: BaseMaterial3D.AlphaAntiAliasing
    @JvmName("alphaAntialiasingModeProperty")
    get() = getAlphaAntialiasing()
    @JvmName("alphaAntialiasingModeProperty")
    set(`value`) {
      setAlphaAntialiasing(value)
    }

  /**
   * Threshold at which antialiasing will be applied on the alpha channel.
   */
  public final inline var alphaAntialiasingEdge: Float
    @JvmName("alphaAntialiasingEdgeProperty")
    get() = getAlphaAntialiasingEdge()
    @JvmName("alphaAntialiasingEdgeProperty")
    set(`value`) {
      setAlphaAntialiasingEdge(value)
    }

  /**
   * Filter flags for the texture. See [BaseMaterial3D.TextureFilter] for options.
   */
  public final inline var textureFilter: BaseMaterial3D.TextureFilter
    @JvmName("textureFilterProperty")
    get() = getTextureFilter()
    @JvmName("textureFilterProperty")
    set(`value`) {
      setTextureFilter(value)
    }

  /**
   * Sets the render priority for the text. Higher priority objects will be sorted in front of lower
   * priority objects.
   * **Note:** This only applies if [alphaCut] is set to [ALPHA_CUT_DISABLED] (default value).
   * **Note:** This only applies to sorting of transparent objects. This will not impact how
   * transparent objects are sorted relative to opaque objects. This is because opaque objects are not
   * sorted, while transparent objects are sorted from back to front (subject to priority).
   */
  public final inline var renderPriority: Int
    @JvmName("renderPriorityProperty")
    get() = getRenderPriority()
    @JvmName("renderPriorityProperty")
    set(`value`) {
      setRenderPriority(value)
    }

  /**
   * Sets the render priority for the text outline. Higher priority objects will be sorted in front
   * of lower priority objects.
   * **Note:** This only applies if [alphaCut] is set to [ALPHA_CUT_DISABLED] (default value).
   * **Note:** This only applies to sorting of transparent objects. This will not impact how
   * transparent objects are sorted relative to opaque objects. This is because opaque objects are not
   * sorted, while transparent objects are sorted from back to front (subject to priority).
   */
  public final inline var outlineRenderPriority: Int
    @JvmName("outlineRenderPriorityProperty")
    get() = getOutlineRenderPriority()
    @JvmName("outlineRenderPriorityProperty")
    set(`value`) {
      setOutlineRenderPriority(value)
    }

  /**
   * Text [Color] of the [Label3D].
   */
  @CoreTypeLocalCopy
  public final inline var modulate: Color
    @JvmName("modulateProperty")
    get() = getModulate()
    @JvmName("modulateProperty")
    set(`value`) {
      setModulate(value)
    }

  /**
   * The tint of text outline.
   */
  @CoreTypeLocalCopy
  public final inline var outlineModulate: Color
    @JvmName("outlineModulateProperty")
    get() = getOutlineModulate()
    @JvmName("outlineModulateProperty")
    set(`value`) {
      setOutlineModulate(value)
    }

  /**
   * The text to display on screen.
   */
  public final inline var text: String
    @JvmName("textProperty")
    get() = getText()
    @JvmName("textProperty")
    set(`value`) {
      setText(value)
    }

  /**
   * Font configuration used to display text.
   */
  public final inline var font: Font?
    @JvmName("fontProperty")
    get() = getFont()
    @JvmName("fontProperty")
    set(`value`) {
      setFont(value)
    }

  /**
   * Font size of the [Label3D]'s text. To make the font look more detailed when up close, increase
   * [fontSize] while decreasing [pixelSize] at the same time.
   * Higher font sizes require more time to render new characters, which can cause stuttering during
   * gameplay.
   */
  public final inline var fontSize: Int
    @JvmName("fontSizeProperty")
    get() = getFontSize()
    @JvmName("fontSizeProperty")
    set(`value`) {
      setFontSize(value)
    }

  /**
   * Text outline size.
   */
  public final inline var outlineSize: Int
    @JvmName("outlineSizeProperty")
    get() = getOutlineSize()
    @JvmName("outlineSizeProperty")
    set(`value`) {
      setOutlineSize(value)
    }

  /**
   * Controls the text's horizontal alignment. Supports left, center, right, and fill, or justify.
   * Set it to one of the [HorizontalAlignment] constants.
   */
  public final inline var horizontalAlignment: HorizontalAlignment
    @JvmName("horizontalAlignmentProperty")
    get() = getHorizontalAlignment()
    @JvmName("horizontalAlignmentProperty")
    set(`value`) {
      setHorizontalAlignment(value)
    }

  /**
   * Controls the text's vertical alignment. Supports top, center, bottom. Set it to one of the
   * [VerticalAlignment] constants.
   */
  public final inline var verticalAlignment: VerticalAlignment
    @JvmName("verticalAlignmentProperty")
    get() = getVerticalAlignment()
    @JvmName("verticalAlignmentProperty")
    set(`value`) {
      setVerticalAlignment(value)
    }

  /**
   * If `true`, all the text displays as UPPERCASE.
   */
  public final inline var uppercase: Boolean
    @JvmName("uppercaseProperty")
    get() = isUppercase()
    @JvmName("uppercaseProperty")
    set(`value`) {
      setUppercase(value)
    }

  /**
   * Vertical space between lines in multiline [Label3D].
   */
  public final inline var lineSpacing: Float
    @JvmName("lineSpacingProperty")
    get() = getLineSpacing()
    @JvmName("lineSpacingProperty")
    set(`value`) {
      setLineSpacing(value)
    }

  /**
   * If set to something other than [TextServer.AUTOWRAP_OFF], the text gets wrapped inside the
   * node's bounding rectangle. If you resize the node, it will change its height automatically to show
   * all the text. To see how each mode behaves, see [TextServer.AutowrapMode].
   */
  public final inline var autowrapMode: TextServer.AutowrapMode
    @JvmName("autowrapModeProperty")
    get() = getAutowrapMode()
    @JvmName("autowrapModeProperty")
    set(`value`) {
      setAutowrapMode(value)
    }

  /**
   * Line fill alignment rules. For more info see [TextServer.JustificationFlag].
   */
  public final inline var justificationFlags: TextServer.JustificationFlag
    @JvmName("justificationFlagsProperty")
    get() = getJustificationFlags()
    @JvmName("justificationFlagsProperty")
    set(`value`) {
      setJustificationFlags(value)
    }

  /**
   * Text width (in pixels), used for autowrap and fill alignment.
   */
  public final inline var width: Float
    @JvmName("widthProperty")
    get() = getWidth()
    @JvmName("widthProperty")
    set(`value`) {
      setWidth(value)
    }

  /**
   * Base text writing direction.
   */
  public final inline var textDirection: TextServer.Direction
    @JvmName("textDirectionProperty")
    get() = getTextDirection()
    @JvmName("textDirectionProperty")
    set(`value`) {
      setTextDirection(value)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale
   * is used instead.
   */
  public final inline var language: String
    @JvmName("languageProperty")
    get() = getLanguage()
    @JvmName("languageProperty")
    set(`value`) {
      setLanguage(value)
    }

  /**
   * Set BiDi algorithm override for the structured text.
   */
  public final inline var structuredTextBidiOverride: TextServer.StructuredTextParser
    @JvmName("structuredTextBidiOverrideProperty")
    get() = getStructuredTextBidiOverride()
    @JvmName("structuredTextBidiOverrideProperty")
    set(`value`) {
      setStructuredTextBidiOverride(value)
    }

  /**
   * Set additional options for BiDi override.
   */
  public final inline var structuredTextBidiOverrideOptions: VariantArray<Any?>
    @JvmName("structuredTextBidiOverrideOptionsProperty")
    get() = getStructuredTextBidiOverrideOptions()
    @JvmName("structuredTextBidiOverrideOptionsProperty")
    set(`value`) {
      setStructuredTextBidiOverrideOptions(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_LABEL3D_INDEX, scriptIndex)
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
  public final fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
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
  public final fun modulateMutate(block: Color.() -> Unit): Color = modulate.apply{
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
  public final fun outlineModulateMutate(block: Color.() -> Unit): Color = outlineModulate.apply{
      block(this)
      outlineModulate = this
  }


  public final fun setHorizontalAlignment(alignment: HorizontalAlignment): Unit {
    Internals.writeArguments(LONG to alignment.id)
    Internals.callMethod(rawPtr, MethodBindings.setHorizontalAlignmentPtr, NIL)
  }

  public final fun getHorizontalAlignment(): HorizontalAlignment {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHorizontalAlignmentPtr, LONG)
    return HorizontalAlignment.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setVerticalAlignment(alignment: VerticalAlignment): Unit {
    Internals.writeArguments(LONG to alignment.id)
    Internals.callMethod(rawPtr, MethodBindings.setVerticalAlignmentPtr, NIL)
  }

  public final fun getVerticalAlignment(): VerticalAlignment {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVerticalAlignmentPtr, LONG)
    return VerticalAlignment.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setModulate(modulate: Color): Unit {
    Internals.writeArguments(COLOR to modulate)
    Internals.callMethod(rawPtr, MethodBindings.setModulatePtr, NIL)
  }

  public final fun getModulate(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getModulatePtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setOutlineModulate(modulate: Color): Unit {
    Internals.writeArguments(COLOR to modulate)
    Internals.callMethod(rawPtr, MethodBindings.setOutlineModulatePtr, NIL)
  }

  public final fun getOutlineModulate(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOutlineModulatePtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setText(text: String): Unit {
    Internals.writeArguments(STRING to text)
    Internals.callMethod(rawPtr, MethodBindings.setTextPtr, NIL)
  }

  public final fun getText(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setTextDirection(direction: TextServer.Direction): Unit {
    Internals.writeArguments(LONG to direction.id)
    Internals.callMethod(rawPtr, MethodBindings.setTextDirectionPtr, NIL)
  }

  public final fun getTextDirection(): TextServer.Direction {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextDirectionPtr, LONG)
    return TextServer.Direction.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setLanguage(language: String): Unit {
    Internals.writeArguments(STRING to language)
    Internals.callMethod(rawPtr, MethodBindings.setLanguagePtr, NIL)
  }

  public final fun getLanguage(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLanguagePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setStructuredTextBidiOverride(parser: TextServer.StructuredTextParser): Unit {
    Internals.writeArguments(LONG to parser.id)
    Internals.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverridePtr, NIL)
  }

  public final fun getStructuredTextBidiOverride(): TextServer.StructuredTextParser {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverridePtr, LONG)
    return TextServer.StructuredTextParser.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setStructuredTextBidiOverrideOptions(args: VariantArray<Any?>): Unit {
    Internals.writeArguments(ARRAY to args)
    Internals.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverrideOptionsPtr, NIL)
  }

  public final fun getStructuredTextBidiOverrideOptions(): VariantArray<Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverrideOptionsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  public final fun setUppercase(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setUppercasePtr, NIL)
  }

  public final fun isUppercase(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isUppercasePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setRenderPriority(priority: Int): Unit {
    Internals.writeArguments(LONG to priority.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setRenderPriorityPtr, NIL)
  }

  public final fun getRenderPriority(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRenderPriorityPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setOutlineRenderPriority(priority: Int): Unit {
    Internals.writeArguments(LONG to priority.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setOutlineRenderPriorityPtr, NIL)
  }

  public final fun getOutlineRenderPriority(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOutlineRenderPriorityPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setFont(font: Font?): Unit {
    Internals.writeArguments(OBJECT to font)
    Internals.callMethod(rawPtr, MethodBindings.setFontPtr, NIL)
  }

  public final fun getFont(): Font? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFontPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Font?)
  }

  public final fun setFontSize(size: Int): Unit {
    Internals.writeArguments(LONG to size.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setFontSizePtr, NIL)
  }

  public final fun getFontSize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFontSizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setOutlineSize(outlineSize: Int): Unit {
    Internals.writeArguments(LONG to outlineSize.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setOutlineSizePtr, NIL)
  }

  public final fun getOutlineSize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOutlineSizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setLineSpacing(lineSpacing: Float): Unit {
    Internals.writeArguments(DOUBLE to lineSpacing.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setLineSpacingPtr, NIL)
  }

  public final fun getLineSpacing(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLineSpacingPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAutowrapMode(autowrapMode: TextServer.AutowrapMode): Unit {
    Internals.writeArguments(LONG to autowrapMode.id)
    Internals.callMethod(rawPtr, MethodBindings.setAutowrapModePtr, NIL)
  }

  public final fun getAutowrapMode(): TextServer.AutowrapMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAutowrapModePtr, LONG)
    return TextServer.AutowrapMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setJustificationFlags(justificationFlags: TextServer.JustificationFlag): Unit {
    Internals.writeArguments(LONG to justificationFlags.flag)
    Internals.callMethod(rawPtr, MethodBindings.setJustificationFlagsPtr, NIL)
  }

  public final fun getJustificationFlags(): TextServer.JustificationFlag {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getJustificationFlagsPtr, LONG)
    return JustificationFlagValue(Internals.readReturnValue(LONG) as Long)
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

  public final fun setPixelSize(pixelSize: Float): Unit {
    Internals.writeArguments(DOUBLE to pixelSize.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setPixelSizePtr, NIL)
  }

  public final fun getPixelSize(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPixelSizePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setOffset(offset: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to offset)
    Internals.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
  }

  public final fun getOffset(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOffsetPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * If `true`, the specified flag will be enabled. See [Label3D.DrawFlags] for a list of flags.
   */
  public final fun setDrawFlag(flag: DrawFlags, enabled: Boolean): Unit {
    Internals.writeArguments(LONG to flag.id, BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setDrawFlagPtr, NIL)
  }

  /**
   * Returns the value of the specified flag.
   */
  public final fun getDrawFlag(flag: DrawFlags): Boolean {
    Internals.writeArguments(LONG to flag.id)
    Internals.callMethod(rawPtr, MethodBindings.getDrawFlagPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setBillboardMode(mode: BaseMaterial3D.BillboardMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setBillboardModePtr, NIL)
  }

  public final fun getBillboardMode(): BaseMaterial3D.BillboardMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBillboardModePtr, LONG)
    return BaseMaterial3D.BillboardMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setAlphaCutMode(mode: AlphaCutMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setAlphaCutModePtr, NIL)
  }

  public final fun getAlphaCutMode(): AlphaCutMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAlphaCutModePtr, LONG)
    return Label3D.AlphaCutMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setAlphaScissorThreshold(threshold: Float): Unit {
    Internals.writeArguments(DOUBLE to threshold.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAlphaScissorThresholdPtr, NIL)
  }

  public final fun getAlphaScissorThreshold(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAlphaScissorThresholdPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAlphaHashScale(threshold: Float): Unit {
    Internals.writeArguments(DOUBLE to threshold.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAlphaHashScalePtr, NIL)
  }

  public final fun getAlphaHashScale(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAlphaHashScalePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAlphaAntialiasing(alphaAa: BaseMaterial3D.AlphaAntiAliasing): Unit {
    Internals.writeArguments(LONG to alphaAa.id)
    Internals.callMethod(rawPtr, MethodBindings.setAlphaAntialiasingPtr, NIL)
  }

  public final fun getAlphaAntialiasing(): BaseMaterial3D.AlphaAntiAliasing {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAlphaAntialiasingPtr, LONG)
    return BaseMaterial3D.AlphaAntiAliasing.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setAlphaAntialiasingEdge(edge: Float): Unit {
    Internals.writeArguments(DOUBLE to edge.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAlphaAntialiasingEdgePtr, NIL)
  }

  public final fun getAlphaAntialiasingEdge(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAlphaAntialiasingEdgePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTextureFilter(mode: BaseMaterial3D.TextureFilter): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setTextureFilterPtr, NIL)
  }

  public final fun getTextureFilter(): BaseMaterial3D.TextureFilter {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextureFilterPtr, LONG)
    return BaseMaterial3D.TextureFilter.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns a [TriangleMesh] with the label's vertices following its current configuration (such as
   * its [pixelSize]).
   */
  public final fun generateTriangleMesh(): TriangleMesh? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.generateTriangleMeshPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as TriangleMesh?)
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
        Internals.getMethodBindPtr("Label3D", "set_horizontal_alignment", 2312603777)

    public val getHorizontalAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_horizontal_alignment", 341400642)

    public val setVerticalAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_vertical_alignment", 1796458609)

    public val getVerticalAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_vertical_alignment", 3274884059)

    public val setModulatePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_modulate", 2920490490)

    public val getModulatePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_modulate", 3444240500)

    public val setOutlineModulatePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_outline_modulate", 2920490490)

    public val getOutlineModulatePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_outline_modulate", 3444240500)

    public val setTextPtr: VoidPtr = Internals.getMethodBindPtr("Label3D", "set_text", 83702148)

    public val getTextPtr: VoidPtr = Internals.getMethodBindPtr("Label3D", "get_text", 201670096)

    public val setTextDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_text_direction", 1418190634)

    public val getTextDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_text_direction", 2516697328)

    public val setLanguagePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_language", 83702148)

    public val getLanguagePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_language", 201670096)

    public val setStructuredTextBidiOverridePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_structured_text_bidi_override", 55961453)

    public val getStructuredTextBidiOverridePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_structured_text_bidi_override", 3385126229)

    public val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_structured_text_bidi_override_options", 381264803)

    public val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_structured_text_bidi_override_options", 3995934104)

    public val setUppercasePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_uppercase", 2586408642)

    public val isUppercasePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "is_uppercase", 36873697)

    public val setRenderPriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_render_priority", 1286410249)

    public val getRenderPriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_render_priority", 3905245786)

    public val setOutlineRenderPriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_outline_render_priority", 1286410249)

    public val getOutlineRenderPriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_outline_render_priority", 3905245786)

    public val setFontPtr: VoidPtr = Internals.getMethodBindPtr("Label3D", "set_font", 1262170328)

    public val getFontPtr: VoidPtr = Internals.getMethodBindPtr("Label3D", "get_font", 3229501585)

    public val setFontSizePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_font_size", 1286410249)

    public val getFontSizePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_font_size", 3905245786)

    public val setOutlineSizePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_outline_size", 1286410249)

    public val getOutlineSizePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_outline_size", 3905245786)

    public val setLineSpacingPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_line_spacing", 373806689)

    public val getLineSpacingPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_line_spacing", 1740695150)

    public val setAutowrapModePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_autowrap_mode", 3289138044)

    public val getAutowrapModePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_autowrap_mode", 1549071663)

    public val setJustificationFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_justification_flags", 2877345813)

    public val getJustificationFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_justification_flags", 1583363614)

    public val setWidthPtr: VoidPtr = Internals.getMethodBindPtr("Label3D", "set_width", 373806689)

    public val getWidthPtr: VoidPtr = Internals.getMethodBindPtr("Label3D", "get_width", 1740695150)

    public val setPixelSizePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_pixel_size", 373806689)

    public val getPixelSizePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_pixel_size", 1740695150)

    public val setOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_offset", 743155724)

    public val getOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_offset", 3341600327)

    public val setDrawFlagPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_draw_flag", 1285833066)

    public val getDrawFlagPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_draw_flag", 259226453)

    public val setBillboardModePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_billboard_mode", 4202036497)

    public val getBillboardModePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_billboard_mode", 1283840139)

    public val setAlphaCutModePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_alpha_cut_mode", 2549142916)

    public val getAlphaCutModePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_alpha_cut_mode", 219468601)

    public val setAlphaScissorThresholdPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_alpha_scissor_threshold", 373806689)

    public val getAlphaScissorThresholdPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_alpha_scissor_threshold", 1740695150)

    public val setAlphaHashScalePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_alpha_hash_scale", 373806689)

    public val getAlphaHashScalePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_alpha_hash_scale", 1740695150)

    public val setAlphaAntialiasingPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_alpha_antialiasing", 3212649852)

    public val getAlphaAntialiasingPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_alpha_antialiasing", 2889939400)

    public val setAlphaAntialiasingEdgePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_alpha_antialiasing_edge", 373806689)

    public val getAlphaAntialiasingEdgePtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_alpha_antialiasing_edge", 1740695150)

    public val setTextureFilterPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "set_texture_filter", 22904437)

    public val getTextureFilterPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "get_texture_filter", 3289213076)

    public val generateTriangleMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("Label3D", "generate_triangle_mesh", 3476533166)
  }
}

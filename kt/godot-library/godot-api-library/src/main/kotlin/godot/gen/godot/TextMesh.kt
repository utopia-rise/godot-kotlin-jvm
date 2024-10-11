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
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
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

private const val ENGINE_CLASS_TEXTMESH_INDEX: Int = 641

/**
 * Generate an [PrimitiveMesh] from the text.
 * TextMesh can be generated only when using dynamic fonts with vector glyph contours. Bitmap fonts
 * (including bitmap data in the TrueType/OpenType containers, like color emoji fonts) are not
 * supported.
 * The UV layout is arranged in 4 horizontal strips, top to bottom: 40&#37; of the height for the
 * front face, 40&#37; for the back face, 10&#37; for the outer edges and 10&#37; for the inner edges.
 */
@GodotBaseType
public open class TextMesh : PrimitiveMesh() {
  /**
   * The text to generate mesh from.
   * **Note:** Due to being a [Resource], it doesn't follow the rules of [Node.autoTranslateMode].
   * If disabling translation is desired, it should be done manually with
   * [Object.setMessageTranslation].
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
   * Font size of the [TextMesh]'s text.
   */
  public final inline var fontSize: Int
    @JvmName("fontSizeProperty")
    get() = getFontSize()
    @JvmName("fontSizeProperty")
    set(`value`) {
      setFontSize(value)
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
   * Vertical space between lines in multiline [TextMesh].
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
   * The size of one pixel's width on the text to scale it in 3D.
   */
  public final inline var pixelSize: Float
    @JvmName("pixelSizeProperty")
    get() = getPixelSize()
    @JvmName("pixelSizeProperty")
    set(`value`) {
      setPixelSize(value)
    }

  /**
   * Step (in pixels) used to approximate Bézier curves.
   */
  public final inline var curveStep: Float
    @JvmName("curveStepProperty")
    get() = getCurveStep()
    @JvmName("curveStepProperty")
    set(`value`) {
      setCurveStep(value)
    }

  /**
   * Depths of the mesh, if set to `0.0` only front surface, is generated, and UV layout is changed
   * to use full texture for the front face only.
   */
  public final inline var depth: Float
    @JvmName("depthProperty")
    get() = getDepth()
    @JvmName("depthProperty")
    set(`value`) {
      setDepth(value)
    }

  /**
   * Text width (in pixels), used for fill alignment.
   */
  public final inline var width: Float
    @JvmName("widthProperty")
    get() = getWidth()
    @JvmName("widthProperty")
    set(`value`) {
      setWidth(value)
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
   * Language code used for text shaping algorithms, if left empty current locale is used instead.
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
    Internals.callConstructor(this, ENGINE_CLASS_TEXTMESH_INDEX, scriptIndex)
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
   * val myCoreType = textmesh.offset
   * //Your changes
   * textmesh.offset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
      block(this)
      offset = this
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

  public final fun setText(text: String): Unit {
    Internals.writeArguments(STRING to text)
    Internals.callMethod(rawPtr, MethodBindings.setTextPtr, NIL)
  }

  public final fun getText(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
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

  public final fun setFontSize(fontSize: Int): Unit {
    Internals.writeArguments(LONG to fontSize.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setFontSizePtr, NIL)
  }

  public final fun getFontSize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFontSizePtr, LONG)
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

  public final fun setDepth(depth: Float): Unit {
    Internals.writeArguments(DOUBLE to depth.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDepthPtr, NIL)
  }

  public final fun getDepth(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDepthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
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

  public final fun setCurveStep(curveStep: Float): Unit {
    Internals.writeArguments(DOUBLE to curveStep.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setCurveStepPtr, NIL)
  }

  public final fun getCurveStep(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCurveStepPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
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

  public companion object

  public object MethodBindings {
    internal val setHorizontalAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "set_horizontal_alignment", 2312603777)

    internal val getHorizontalAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "get_horizontal_alignment", 341400642)

    internal val setVerticalAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "set_vertical_alignment", 1796458609)

    internal val getVerticalAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "get_vertical_alignment", 3274884059)

    internal val setTextPtr: VoidPtr = Internals.getMethodBindPtr("TextMesh", "set_text", 83702148)

    internal val getTextPtr: VoidPtr = Internals.getMethodBindPtr("TextMesh", "get_text", 201670096)

    internal val setFontPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "set_font", 1262170328)

    internal val getFontPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "get_font", 3229501585)

    internal val setFontSizePtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "set_font_size", 1286410249)

    internal val getFontSizePtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "get_font_size", 3905245786)

    internal val setLineSpacingPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "set_line_spacing", 373806689)

    internal val getLineSpacingPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "get_line_spacing", 1740695150)

    internal val setAutowrapModePtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "set_autowrap_mode", 3289138044)

    internal val getAutowrapModePtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "get_autowrap_mode", 1549071663)

    internal val setJustificationFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "set_justification_flags", 2877345813)

    internal val getJustificationFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "get_justification_flags", 1583363614)

    internal val setDepthPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "set_depth", 373806689)

    internal val getDepthPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "get_depth", 1740695150)

    internal val setWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "set_width", 373806689)

    internal val getWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "get_width", 1740695150)

    internal val setPixelSizePtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "set_pixel_size", 373806689)

    internal val getPixelSizePtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "get_pixel_size", 1740695150)

    internal val setOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "set_offset", 743155724)

    internal val getOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "get_offset", 3341600327)

    internal val setCurveStepPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "set_curve_step", 373806689)

    internal val getCurveStepPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "get_curve_step", 1740695150)

    internal val setTextDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "set_text_direction", 1418190634)

    internal val getTextDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "get_text_direction", 2516697328)

    internal val setLanguagePtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "set_language", 83702148)

    internal val getLanguagePtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "get_language", 201670096)

    internal val setStructuredTextBidiOverridePtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "set_structured_text_bidi_override", 55961453)

    internal val getStructuredTextBidiOverridePtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "get_structured_text_bidi_override", 3385126229)

    internal val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "set_structured_text_bidi_override_options", 381264803)

    internal val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "get_structured_text_bidi_override_options", 3995934104)

    internal val setUppercasePtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "set_uppercase", 2586408642)

    internal val isUppercasePtr: VoidPtr =
        Internals.getMethodBindPtr("TextMesh", "is_uppercase", 36873697)
  }
}

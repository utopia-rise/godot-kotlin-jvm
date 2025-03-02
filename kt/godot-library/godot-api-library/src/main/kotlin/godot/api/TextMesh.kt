// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.api.TextServer.JustificationFlagValue
import godot.common.interop.VoidPtr
import godot.core.HorizontalAlignment
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
import godot.core.VerticalAlignment
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
   * Additional vertical spacing between lines (in pixels), spacing is added to line descent. This
   * value can be negative.
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
   * Line fill alignment rules. See [TextServer.JustificationFlag] for more information.
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
    createNativeObject(666, scriptIndex)
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
    TransferContext.writeArguments(LONG to alignment.id)
    TransferContext.callMethod(ptr, MethodBindings.setHorizontalAlignmentPtr, NIL)
  }

  public final fun getHorizontalAlignment(): HorizontalAlignment {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHorizontalAlignmentPtr, LONG)
    return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setVerticalAlignment(alignment: VerticalAlignment): Unit {
    TransferContext.writeArguments(LONG to alignment.id)
    TransferContext.callMethod(ptr, MethodBindings.setVerticalAlignmentPtr, NIL)
  }

  public final fun getVerticalAlignment(): VerticalAlignment {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVerticalAlignmentPtr, LONG)
    return VerticalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setText(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(ptr, MethodBindings.setTextPtr, NIL)
  }

  public final fun getText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setFont(font: Font?): Unit {
    TransferContext.writeArguments(OBJECT to font)
    TransferContext.callMethod(ptr, MethodBindings.setFontPtr, NIL)
  }

  public final fun getFont(): Font? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFontPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Font?)
  }

  public final fun setFontSize(fontSize: Int): Unit {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setFontSizePtr, NIL)
  }

  public final fun getFontSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFontSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setLineSpacing(lineSpacing: Float): Unit {
    TransferContext.writeArguments(DOUBLE to lineSpacing.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setLineSpacingPtr, NIL)
  }

  public final fun getLineSpacing(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLineSpacingPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAutowrapMode(autowrapMode: TextServer.AutowrapMode): Unit {
    TransferContext.writeArguments(LONG to autowrapMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setAutowrapModePtr, NIL)
  }

  public final fun getAutowrapMode(): TextServer.AutowrapMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAutowrapModePtr, LONG)
    return TextServer.AutowrapMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setJustificationFlags(justificationFlags: TextServer.JustificationFlag): Unit {
    TransferContext.writeArguments(LONG to justificationFlags.flag)
    TransferContext.callMethod(ptr, MethodBindings.setJustificationFlagsPtr, NIL)
  }

  public final fun getJustificationFlags(): TextServer.JustificationFlag {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJustificationFlagsPtr, LONG)
    return JustificationFlagValue(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setDepth(depth: Float): Unit {
    TransferContext.writeArguments(DOUBLE to depth.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDepthPtr, NIL)
  }

  public final fun getDepth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDepthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setWidth(width: Float): Unit {
    TransferContext.writeArguments(DOUBLE to width.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setWidthPtr, NIL)
  }

  public final fun getWidth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWidthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPixelSize(pixelSize: Float): Unit {
    TransferContext.writeArguments(DOUBLE to pixelSize.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPixelSizePtr, NIL)
  }

  public final fun getPixelSize(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPixelSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setOffset(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(ptr, MethodBindings.setOffsetPtr, NIL)
  }

  public final fun getOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setCurveStep(curveStep: Float): Unit {
    TransferContext.writeArguments(DOUBLE to curveStep.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setCurveStepPtr, NIL)
  }

  public final fun getCurveStep(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCurveStepPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTextDirection(direction: TextServer.Direction): Unit {
    TransferContext.writeArguments(LONG to direction.id)
    TransferContext.callMethod(ptr, MethodBindings.setTextDirectionPtr, NIL)
  }

  public final fun getTextDirection(): TextServer.Direction {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextDirectionPtr, LONG)
    return TextServer.Direction.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setLanguage(language: String): Unit {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.setLanguagePtr, NIL)
  }

  public final fun getLanguage(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setStructuredTextBidiOverride(parser: TextServer.StructuredTextParser): Unit {
    TransferContext.writeArguments(LONG to parser.id)
    TransferContext.callMethod(ptr, MethodBindings.setStructuredTextBidiOverridePtr, NIL)
  }

  public final fun getStructuredTextBidiOverride(): TextServer.StructuredTextParser {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStructuredTextBidiOverridePtr, LONG)
    return TextServer.StructuredTextParser.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setStructuredTextBidiOverrideOptions(args: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to args)
    TransferContext.callMethod(ptr, MethodBindings.setStructuredTextBidiOverrideOptionsPtr, NIL)
  }

  public final fun getStructuredTextBidiOverrideOptions(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStructuredTextBidiOverrideOptionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  public final fun setUppercase(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setUppercasePtr, NIL)
  }

  public final fun isUppercase(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUppercasePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_horizontal_alignment", 2312603777)

    internal val getHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_horizontal_alignment", 341400642)

    internal val setVerticalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_vertical_alignment", 1796458609)

    internal val getVerticalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_vertical_alignment", 3274884059)

    internal val setTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_text", 83702148)

    internal val getTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_text", 201670096)

    internal val setFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_font", 1262170328)

    internal val getFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_font", 3229501585)

    internal val setFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_font_size", 1286410249)

    internal val getFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_font_size", 3905245786)

    internal val setLineSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_line_spacing", 373806689)

    internal val getLineSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_line_spacing", 1740695150)

    internal val setAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_autowrap_mode", 3289138044)

    internal val getAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_autowrap_mode", 1549071663)

    internal val setJustificationFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_justification_flags", 2877345813)

    internal val getJustificationFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_justification_flags", 1583363614)

    internal val setDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_depth", 373806689)

    internal val getDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_depth", 1740695150)

    internal val setWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_width", 373806689)

    internal val getWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_width", 1740695150)

    internal val setPixelSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_pixel_size", 373806689)

    internal val getPixelSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_pixel_size", 1740695150)

    internal val setOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_offset", 743155724)

    internal val getOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_offset", 3341600327)

    internal val setCurveStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_curve_step", 373806689)

    internal val getCurveStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_curve_step", 1740695150)

    internal val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_text_direction", 1418190634)

    internal val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_text_direction", 2516697328)

    internal val setLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_language", 83702148)

    internal val getLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_language", 201670096)

    internal val setStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_structured_text_bidi_override", 55961453)

    internal val getStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_structured_text_bidi_override", 3385126229)

    internal val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_structured_text_bidi_override_options", 381264803)

    internal val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_structured_text_bidi_override_options", 3995934104)

    internal val setUppercasePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_uppercase", 2586408642)

    internal val isUppercasePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "is_uppercase", 36873697)
  }
}

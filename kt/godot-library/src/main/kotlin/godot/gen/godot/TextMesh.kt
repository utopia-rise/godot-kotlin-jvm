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
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
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
   * Font size of the [TextMesh]'s text.
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
   * Vertical space between lines in multiline [TextMesh].
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
   * The size of one pixel's width on the text to scale it in 3D.
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
   * Step (in pixels) used to approximate Bézier curves.
   */
  public var curveStep: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurveStepPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCurveStepPtr, NIL)
    }

  /**
   * Depths of the mesh, if set to `0.0` only front surface, is generated, and UV layout is changed
   * to use full texture for the front face only.
   */
  public var depth: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDepthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDepthPtr, NIL)
    }

  /**
   * Text width (in pixels), used for fill alignment.
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
   * Language code used for text shaping algorithms, if left empty current locale is used instead.
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

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_TEXTMESH, scriptIndex)
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
  public open fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
      block(this)
      offset = this
  }


  public companion object

  internal object MethodBindings {
    public val setHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_horizontal_alignment", 2312603777)

    public val getHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_horizontal_alignment", 341400642)

    public val setVerticalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_vertical_alignment", 1796458609)

    public val getVerticalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_vertical_alignment", 3274884059)

    public val setTextPtr: VoidPtr = TypeManager.getMethodBindPtr("TextMesh", "set_text", 83702148)

    public val getTextPtr: VoidPtr = TypeManager.getMethodBindPtr("TextMesh", "get_text", 201670096)

    public val setFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_font", 1262170328)

    public val getFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_font", 3229501585)

    public val setFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_font_size", 1286410249)

    public val getFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_font_size", 3905245786)

    public val setLineSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_line_spacing", 373806689)

    public val getLineSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_line_spacing", 1740695150)

    public val setAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_autowrap_mode", 3289138044)

    public val getAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_autowrap_mode", 1549071663)

    public val setJustificationFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_justification_flags", 2877345813)

    public val getJustificationFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_justification_flags", 1583363614)

    public val setDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_depth", 373806689)

    public val getDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_depth", 1740695150)

    public val setWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_width", 373806689)

    public val getWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_width", 1740695150)

    public val setPixelSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_pixel_size", 373806689)

    public val getPixelSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_pixel_size", 1740695150)

    public val setOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_offset", 743155724)

    public val getOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_offset", 3341600327)

    public val setCurveStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_curve_step", 373806689)

    public val getCurveStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_curve_step", 1740695150)

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_text_direction", 1418190634)

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_text_direction", 2516697328)

    public val setLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_language", 83702148)

    public val getLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_language", 201670096)

    public val setStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_structured_text_bidi_override", 55961453)

    public val getStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_structured_text_bidi_override", 3385126229)

    public val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_structured_text_bidi_override_options", 381264803)

    public val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "get_structured_text_bidi_override_options", 3995934104)

    public val setUppercasePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "set_uppercase", 2586408642)

    public val isUppercasePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextMesh", "is_uppercase", 36873697)
  }
}

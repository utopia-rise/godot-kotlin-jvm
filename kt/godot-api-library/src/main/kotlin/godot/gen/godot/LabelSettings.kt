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
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_LABELSETTINGS_INDEX: Int = 347

/**
 * [LabelSettings] is a resource that provides common settings to customize the text in a [Label].
 * It will take priority over the properties defined in [Control.theme]. The resource can be shared
 * between multiple labels and changed on the fly, so it's convenient and flexible way to setup text
 * style.
 */
@GodotBaseType
public open class LabelSettings : Resource() {
  /**
   * Vertical space between lines when the text is multiline.
   */
  public final inline var lineSpacing: Float
    @JvmName("lineSpacingProperty")
    get() = getLineSpacing()
    @JvmName("lineSpacingProperty")
    set(`value`) {
      setLineSpacing(value)
    }

  /**
   * [Font] used for the text.
   */
  public final inline var font: Font?
    @JvmName("fontProperty")
    get() = getFont()
    @JvmName("fontProperty")
    set(`value`) {
      setFont(value)
    }

  /**
   * Size of the text.
   */
  public final inline var fontSize: Int
    @JvmName("fontSizeProperty")
    get() = getFontSize()
    @JvmName("fontSizeProperty")
    set(`value`) {
      setFontSize(value)
    }

  /**
   * Color of the text.
   */
  @CoreTypeLocalCopy
  public final inline var fontColor: Color
    @JvmName("fontColorProperty")
    get() = getFontColor()
    @JvmName("fontColorProperty")
    set(`value`) {
      setFontColor(value)
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
   * The color of the outline.
   */
  @CoreTypeLocalCopy
  public final inline var outlineColor: Color
    @JvmName("outlineColorProperty")
    get() = getOutlineColor()
    @JvmName("outlineColorProperty")
    set(`value`) {
      setOutlineColor(value)
    }

  /**
   * Size of the shadow effect.
   */
  public final inline var shadowSize: Int
    @JvmName("shadowSizeProperty")
    get() = getShadowSize()
    @JvmName("shadowSizeProperty")
    set(`value`) {
      setShadowSize(value)
    }

  /**
   * Color of the shadow effect. If alpha is `0`, no shadow will be drawn.
   */
  @CoreTypeLocalCopy
  public final inline var shadowColor: Color
    @JvmName("shadowColorProperty")
    get() = getShadowColor()
    @JvmName("shadowColorProperty")
    set(`value`) {
      setShadowColor(value)
    }

  /**
   * Offset of the shadow effect, in pixels.
   */
  @CoreTypeLocalCopy
  public final inline var shadowOffset: Vector2
    @JvmName("shadowOffsetProperty")
    get() = getShadowOffset()
    @JvmName("shadowOffsetProperty")
    set(`value`) {
      setShadowOffset(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_LABELSETTINGS_INDEX, scriptIndex)
  }

  /**
   * Color of the text.
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
   * val myCoreType = labelsettings.fontColor
   * //Your changes
   * labelsettings.fontColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun fontColorMutate(block: Color.() -> Unit): Color = fontColor.apply{
      block(this)
      fontColor = this
  }


  /**
   * The color of the outline.
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
   * val myCoreType = labelsettings.outlineColor
   * //Your changes
   * labelsettings.outlineColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun outlineColorMutate(block: Color.() -> Unit): Color = outlineColor.apply{
      block(this)
      outlineColor = this
  }


  /**
   * Color of the shadow effect. If alpha is `0`, no shadow will be drawn.
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
   * val myCoreType = labelsettings.shadowColor
   * //Your changes
   * labelsettings.shadowColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun shadowColorMutate(block: Color.() -> Unit): Color = shadowColor.apply{
      block(this)
      shadowColor = this
  }


  /**
   * Offset of the shadow effect, in pixels.
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
   * val myCoreType = labelsettings.shadowOffset
   * //Your changes
   * labelsettings.shadowOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun shadowOffsetMutate(block: Vector2.() -> Unit): Vector2 = shadowOffset.apply{
      block(this)
      shadowOffset = this
  }


  public final fun setLineSpacing(spacing: Float): Unit {
    Internals.writeArguments(DOUBLE to spacing.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setLineSpacingPtr, NIL)
  }

  public final fun getLineSpacing(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLineSpacingPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
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

  public final fun setFontColor(color: Color): Unit {
    Internals.writeArguments(COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.setFontColorPtr, NIL)
  }

  public final fun getFontColor(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFontColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setOutlineSize(size: Int): Unit {
    Internals.writeArguments(LONG to size.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setOutlineSizePtr, NIL)
  }

  public final fun getOutlineSize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOutlineSizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setOutlineColor(color: Color): Unit {
    Internals.writeArguments(COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.setOutlineColorPtr, NIL)
  }

  public final fun getOutlineColor(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOutlineColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setShadowSize(size: Int): Unit {
    Internals.writeArguments(LONG to size.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setShadowSizePtr, NIL)
  }

  public final fun getShadowSize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getShadowSizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setShadowColor(color: Color): Unit {
    Internals.writeArguments(COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.setShadowColorPtr, NIL)
  }

  public final fun getShadowColor(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getShadowColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setShadowOffset(offset: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to offset)
    Internals.callMethod(rawPtr, MethodBindings.setShadowOffsetPtr, NIL)
  }

  public final fun getShadowOffset(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getShadowOffsetPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public companion object

  internal object MethodBindings {
    public val setLineSpacingPtr: VoidPtr =
        Internals.getMethodBindPtr("LabelSettings", "set_line_spacing", 373806689)

    public val getLineSpacingPtr: VoidPtr =
        Internals.getMethodBindPtr("LabelSettings", "get_line_spacing", 1740695150)

    public val setFontPtr: VoidPtr =
        Internals.getMethodBindPtr("LabelSettings", "set_font", 1262170328)

    public val getFontPtr: VoidPtr =
        Internals.getMethodBindPtr("LabelSettings", "get_font", 3229501585)

    public val setFontSizePtr: VoidPtr =
        Internals.getMethodBindPtr("LabelSettings", "set_font_size", 1286410249)

    public val getFontSizePtr: VoidPtr =
        Internals.getMethodBindPtr("LabelSettings", "get_font_size", 3905245786)

    public val setFontColorPtr: VoidPtr =
        Internals.getMethodBindPtr("LabelSettings", "set_font_color", 2920490490)

    public val getFontColorPtr: VoidPtr =
        Internals.getMethodBindPtr("LabelSettings", "get_font_color", 3444240500)

    public val setOutlineSizePtr: VoidPtr =
        Internals.getMethodBindPtr("LabelSettings", "set_outline_size", 1286410249)

    public val getOutlineSizePtr: VoidPtr =
        Internals.getMethodBindPtr("LabelSettings", "get_outline_size", 3905245786)

    public val setOutlineColorPtr: VoidPtr =
        Internals.getMethodBindPtr("LabelSettings", "set_outline_color", 2920490490)

    public val getOutlineColorPtr: VoidPtr =
        Internals.getMethodBindPtr("LabelSettings", "get_outline_color", 3444240500)

    public val setShadowSizePtr: VoidPtr =
        Internals.getMethodBindPtr("LabelSettings", "set_shadow_size", 1286410249)

    public val getShadowSizePtr: VoidPtr =
        Internals.getMethodBindPtr("LabelSettings", "get_shadow_size", 3905245786)

    public val setShadowColorPtr: VoidPtr =
        Internals.getMethodBindPtr("LabelSettings", "set_shadow_color", 2920490490)

    public val getShadowColorPtr: VoidPtr =
        Internals.getMethodBindPtr("LabelSettings", "get_shadow_color", 3444240500)

    public val setShadowOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("LabelSettings", "set_shadow_offset", 743155724)

    public val getShadowOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("LabelSettings", "get_shadow_offset", 3341600327)
  }
}

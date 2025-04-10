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
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [LabelSettings] is a resource that provides common settings to customize the text in a [Label].
 * It will take priority over the properties defined in [Control.theme]. The resource can be shared
 * between multiple labels and changed on the fly, so it's convenient and flexible way to setup text
 * style.
 */
@GodotBaseType
public open class LabelSettings : Resource() {
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
   * Vertical space between paragraphs. Added on top of [lineSpacing].
   */
  public final inline var paragraphSpacing: Float
    @JvmName("paragraphSpacingProperty")
    get() = getParagraphSpacing()
    @JvmName("paragraphSpacingProperty")
    set(`value`) {
      setParagraphSpacing(value)
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
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
    createNativeObject(330, scriptIndex)
  }

  /**
   * This is a helper function for [fontColor] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = labelsettings.fontColor
   * //Your changes
   * labelsettings.fontColor = myCoreType
   * ``````
   *
   * Color of the text.
   */
  @CoreTypeHelper
  public final fun fontColorMutate(block: Color.() -> Unit): Color = fontColor.apply {
     block(this)
     fontColor = this
  }

  /**
   * This is a helper function for [outlineColor] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = labelsettings.outlineColor
   * //Your changes
   * labelsettings.outlineColor = myCoreType
   * ``````
   *
   * The color of the outline.
   */
  @CoreTypeHelper
  public final fun outlineColorMutate(block: Color.() -> Unit): Color = outlineColor.apply {
     block(this)
     outlineColor = this
  }

  /**
   * This is a helper function for [shadowColor] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = labelsettings.shadowColor
   * //Your changes
   * labelsettings.shadowColor = myCoreType
   * ``````
   *
   * Color of the shadow effect. If alpha is `0`, no shadow will be drawn.
   */
  @CoreTypeHelper
  public final fun shadowColorMutate(block: Color.() -> Unit): Color = shadowColor.apply {
     block(this)
     shadowColor = this
  }

  /**
   * This is a helper function for [shadowOffset] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = labelsettings.shadowOffset
   * //Your changes
   * labelsettings.shadowOffset = myCoreType
   * ``````
   *
   * Offset of the shadow effect, in pixels.
   */
  @CoreTypeHelper
  public final fun shadowOffsetMutate(block: Vector2.() -> Unit): Vector2 = shadowOffset.apply {
     block(this)
     shadowOffset = this
  }

  public final fun setLineSpacing(spacing: Float): Unit {
    TransferContext.writeArguments(DOUBLE to spacing.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setLineSpacingPtr, NIL)
  }

  public final fun getLineSpacing(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLineSpacingPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setParagraphSpacing(spacing: Float): Unit {
    TransferContext.writeArguments(DOUBLE to spacing.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setParagraphSpacingPtr, NIL)
  }

  public final fun getParagraphSpacing(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getParagraphSpacingPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
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

  public final fun setFontSize(size: Int): Unit {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setFontSizePtr, NIL)
  }

  public final fun getFontSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFontSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setFontColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setFontColorPtr, NIL)
  }

  public final fun getFontColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFontColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setOutlineSize(size: Int): Unit {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setOutlineSizePtr, NIL)
  }

  public final fun getOutlineSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOutlineSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setOutlineColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setOutlineColorPtr, NIL)
  }

  public final fun getOutlineColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOutlineColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setShadowSize(size: Int): Unit {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setShadowSizePtr, NIL)
  }

  public final fun getShadowSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getShadowSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setShadowColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setShadowColorPtr, NIL)
  }

  public final fun getShadowColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getShadowColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setShadowOffset(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(ptr, MethodBindings.setShadowOffsetPtr, NIL)
  }

  public final fun getShadowOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getShadowOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public companion object

  public object MethodBindings {
    internal val setLineSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "set_line_spacing", 373806689)

    internal val getLineSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "get_line_spacing", 1740695150)

    internal val setParagraphSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "set_paragraph_spacing", 373806689)

    internal val getParagraphSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "get_paragraph_spacing", 1740695150)

    internal val setFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "set_font", 1262170328)

    internal val getFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "get_font", 3229501585)

    internal val setFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "set_font_size", 1286410249)

    internal val getFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "get_font_size", 3905245786)

    internal val setFontColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "set_font_color", 2920490490)

    internal val getFontColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "get_font_color", 3444240500)

    internal val setOutlineSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "set_outline_size", 1286410249)

    internal val getOutlineSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "get_outline_size", 3905245786)

    internal val setOutlineColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "set_outline_color", 2920490490)

    internal val getOutlineColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "get_outline_color", 3444240500)

    internal val setShadowSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "set_shadow_size", 1286410249)

    internal val getShadowSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "get_shadow_size", 3905245786)

    internal val setShadowColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "set_shadow_color", 2920490490)

    internal val getShadowColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "get_shadow_color", 3444240500)

    internal val setShadowOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "set_shadow_offset", 743155724)

    internal val getShadowOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "get_shadow_offset", 3341600327)
  }
}

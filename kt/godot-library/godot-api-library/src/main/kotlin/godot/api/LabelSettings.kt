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
import kotlin.jvm.JvmOverloads

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

  /**
   * The number of stacked outlines.
   */
  public final inline var stackedOutlineCount: Int
    @JvmName("stackedOutlineCountProperty")
    get() = getStackedOutlineCount()
    @JvmName("stackedOutlineCountProperty")
    set(`value`) {
      setStackedOutlineCount(value)
    }

  /**
   * The number of stacked shadows.
   */
  public final inline var stackedShadowCount: Int
    @JvmName("stackedShadowCountProperty")
    get() = getStackedShadowCount()
    @JvmName("stackedShadowCountProperty")
    set(`value`) {
      setStackedShadowCount(value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(337, scriptPtr)
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

  public final fun getStackedOutlineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStackedOutlineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setStackedOutlineCount(count: Int): Unit {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setStackedOutlineCountPtr, NIL)
  }

  /**
   * Adds a new stacked outline to the label at the given [index]. If [index] is `-1`, the new
   * stacked outline will be added at the end of the list.
   */
  @JvmOverloads
  public final fun addStackedOutline(index: Int = -1): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addStackedOutlinePtr, NIL)
  }

  /**
   * Moves the stacked outline at index [fromIndex] to the given position [toPosition] in the array.
   */
  public final fun moveStackedOutline(fromIndex: Int, toPosition: Int): Unit {
    TransferContext.writeArguments(LONG to fromIndex.toLong(), LONG to toPosition.toLong())
    TransferContext.callMethod(ptr, MethodBindings.moveStackedOutlinePtr, NIL)
  }

  /**
   * Removes the stacked outline at index [index].
   */
  public final fun removeStackedOutline(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeStackedOutlinePtr, NIL)
  }

  /**
   * Sets the size of the stacked outline identified by the given [index] to [size].
   */
  public final fun setStackedOutlineSize(index: Int, size: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to size.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setStackedOutlineSizePtr, NIL)
  }

  /**
   * Returns the size of the stacked outline at [index].
   */
  public final fun getStackedOutlineSize(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getStackedOutlineSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the color of the stacked outline identified by the given [index] to [color].
   */
  public final fun setStackedOutlineColor(index: Int, color: Color): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setStackedOutlineColorPtr, NIL)
  }

  /**
   * Returns the color of the stacked outline at [index].
   */
  public final fun getStackedOutlineColor(index: Int): Color {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getStackedOutlineColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun getStackedShadowCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStackedShadowCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setStackedShadowCount(count: Int): Unit {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setStackedShadowCountPtr, NIL)
  }

  /**
   * Adds a new stacked shadow to the label at the given [index]. If [index] is `-1`, the new
   * stacked shadow will be added at the end of the list.
   */
  @JvmOverloads
  public final fun addStackedShadow(index: Int = -1): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addStackedShadowPtr, NIL)
  }

  /**
   * Moves the stacked shadow at index [fromIndex] to the given position [toPosition] in the array.
   */
  public final fun moveStackedShadow(fromIndex: Int, toPosition: Int): Unit {
    TransferContext.writeArguments(LONG to fromIndex.toLong(), LONG to toPosition.toLong())
    TransferContext.callMethod(ptr, MethodBindings.moveStackedShadowPtr, NIL)
  }

  /**
   * Removes the stacked shadow at index [index].
   */
  public final fun removeStackedShadow(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeStackedShadowPtr, NIL)
  }

  /**
   * Sets the offset of the stacked shadow identified by the given [index] to [offset].
   */
  public final fun setStackedShadowOffset(index: Int, offset: Vector2): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), VECTOR2 to offset)
    TransferContext.callMethod(ptr, MethodBindings.setStackedShadowOffsetPtr, NIL)
  }

  /**
   * Returns the offset of the stacked shadow at [index].
   */
  public final fun getStackedShadowOffset(index: Int): Vector2 {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getStackedShadowOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the color of the stacked shadow identified by the given [index] to [color].
   */
  public final fun setStackedShadowColor(index: Int, color: Color): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setStackedShadowColorPtr, NIL)
  }

  /**
   * Returns the color of the stacked shadow at [index].
   */
  public final fun getStackedShadowColor(index: Int): Color {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getStackedShadowColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  /**
   * Sets the outline size of the stacked shadow identified by the given [index] to [size].
   */
  public final fun setStackedShadowOutlineSize(index: Int, size: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to size.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setStackedShadowOutlineSizePtr, NIL)
  }

  /**
   * Returns the outline size of the stacked shadow at [index].
   */
  public final fun getStackedShadowOutlineSize(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getStackedShadowOutlineSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
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

    internal val getStackedOutlineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "get_stacked_outline_count", 3905245786)

    internal val setStackedOutlineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "set_stacked_outline_count", 1286410249)

    internal val addStackedOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "add_stacked_outline", 1025054187)

    internal val moveStackedOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "move_stacked_outline", 3937882851)

    internal val removeStackedOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "remove_stacked_outline", 1286410249)

    internal val setStackedOutlineSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "set_stacked_outline_size", 3937882851)

    internal val getStackedOutlineSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "get_stacked_outline_size", 923996154)

    internal val setStackedOutlineColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "set_stacked_outline_color", 2878471219)

    internal val getStackedOutlineColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "get_stacked_outline_color", 3457211756)

    internal val getStackedShadowCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "get_stacked_shadow_count", 3905245786)

    internal val setStackedShadowCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "set_stacked_shadow_count", 1286410249)

    internal val addStackedShadowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "add_stacked_shadow", 1025054187)

    internal val moveStackedShadowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "move_stacked_shadow", 3937882851)

    internal val removeStackedShadowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "remove_stacked_shadow", 1286410249)

    internal val setStackedShadowOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "set_stacked_shadow_offset", 163021252)

    internal val getStackedShadowOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "get_stacked_shadow_offset", 2299179447)

    internal val setStackedShadowColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "set_stacked_shadow_color", 2878471219)

    internal val getStackedShadowColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "get_stacked_shadow_color", 3457211756)

    internal val setStackedShadowOutlineSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "set_stacked_shadow_outline_size", 3937882851)

    internal val getStackedShadowOutlineSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("LabelSettings", "get_stacked_shadow_outline_size", 923996154)
  }
}

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
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Provides common settings to customize the text in a [godot.Label].
 *
 * [godot.LabelSettings] is a resource that provides common settings to customize the text in a [godot.Label]. It will take priority over the properties defined in [godot.Control.theme]. The resource can be shared between multiple labels and changed on the fly, so it's convenient and flexible way to setup text style.
 */
@GodotBaseType
public open class LabelSettings : Resource() {
  /**
   * Vertical space between lines when the text is multiline.
   */
  public var lineSpacing: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABELSETTINGS_GET_LINE_SPACING,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABELSETTINGS_SET_LINE_SPACING,
          NIL)
    }

  /**
   * [godot.Font] used for the text.
   */
  public var font: Font?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABELSETTINGS_GET_FONT, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Font?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABELSETTINGS_SET_FONT, NIL)
    }

  /**
   * Size of the text.
   */
  public var fontSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABELSETTINGS_GET_FONT_SIZE, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABELSETTINGS_SET_FONT_SIZE, NIL)
    }

  /**
   * Color of the text.
   */
  @CoreTypeLocalCopy
  public var fontColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABELSETTINGS_GET_FONT_COLOR,
          COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABELSETTINGS_SET_FONT_COLOR, NIL)
    }

  /**
   * Text outline size.
   */
  public var outlineSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABELSETTINGS_GET_OUTLINE_SIZE,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABELSETTINGS_SET_OUTLINE_SIZE,
          NIL)
    }

  /**
   * The color of the outline.
   */
  @CoreTypeLocalCopy
  public var outlineColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABELSETTINGS_GET_OUTLINE_COLOR,
          COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABELSETTINGS_SET_OUTLINE_COLOR,
          NIL)
    }

  /**
   * Size of the shadow effect.
   */
  public var shadowSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABELSETTINGS_GET_SHADOW_SIZE,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABELSETTINGS_SET_SHADOW_SIZE,
          NIL)
    }

  /**
   * Color of the shadow effect. If alpha is `0`, no shadow will be drawn.
   */
  @CoreTypeLocalCopy
  public var shadowColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABELSETTINGS_GET_SHADOW_COLOR,
          COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABELSETTINGS_SET_SHADOW_COLOR,
          NIL)
    }

  /**
   * Offset of the shadow effect, in pixels.
   */
  @CoreTypeLocalCopy
  public var shadowOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABELSETTINGS_GET_SHADOW_OFFSET,
          VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABELSETTINGS_SET_SHADOW_OFFSET,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_LABELSETTINGS, scriptIndex)
    return true
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
  public open fun fontColorMutate(block: Color.() -> Unit): Color = fontColor.apply{
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
  public open fun outlineColorMutate(block: Color.() -> Unit): Color = outlineColor.apply{
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
  public open fun shadowColorMutate(block: Color.() -> Unit): Color = shadowColor.apply{
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
  public open fun shadowOffsetMutate(block: Vector2.() -> Unit): Vector2 = shadowOffset.apply{
      block(this)
      shadowOffset = this
  }


  public companion object
}

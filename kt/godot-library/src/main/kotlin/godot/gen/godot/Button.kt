// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Standard themed Button.
 *
 * Button is the standard themed button. It can contain text and an icon, and will display them according to the current [godot.Theme].
 *
 * **Example of creating a button and assigning an action when pressed by code:**
 *
 * ```
 * 		func _ready():
 * 		    var button = Button.new()
 * 		    button.text = "Click me"
 * 		    button.connect("pressed", self, "_button_pressed")
 * 		    add_child(button)
 *
 * 		func _button_pressed():
 * 		    print("Hello world!")
 * 		```
 *
 * Buttons (like all Control nodes) can also be created in the editor, but some situations may require creating them from code.
 */
@GodotBaseType
open class Button : BaseButton() {
  /**
   * Text alignment policy for the button's text, use one of the [enum TextAlign] constants.
   */
  open var align: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_ALIGN, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_ALIGN, NIL)
    }

  /**
   * When this property is enabled, text that is too large to fit the button is clipped, when disabled the Button will always be wide enough to hold the text.
   */
  open var clipText: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_CLIP_TEXT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_CLIP_TEXT, NIL)
    }

  /**
   * When enabled, the button's icon will expand/shrink to fit the button's size while keeping its aspect.
   */
  open var expandIcon: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_EXPAND_ICON, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_EXPAND_ICON, NIL)
    }

  /**
   * Flat buttons don't display decoration.
   */
  open var flat: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_FLAT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_FLAT, NIL)
    }

  /**
   * Button's icon, if text is present the icon will be placed before the text.
   */
  open var icon: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_ICON, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_ICON, NIL)
    }

  /**
   * The button's text that will be displayed inside the button's area.
   */
  open var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_TEXT, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_TEXT, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_BUTTON)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  enum class TextAlign(
    id: Long
  ) {
    /**
     * Align the text to the left.
     */
    ALIGN_LEFT(0),

    /**
     * Align the text to the center.
     */
    ALIGN_CENTER(1),

    /**
     * Align the text to the right.
     */
    ALIGN_RIGHT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Align the text to the center.
     */
    final const val ALIGN_CENTER: Long = 1

    /**
     * Align the text to the left.
     */
    final const val ALIGN_LEFT: Long = 0

    /**
     * Align the text to the right.
     */
    final const val ALIGN_RIGHT: Long = 2
  }
}

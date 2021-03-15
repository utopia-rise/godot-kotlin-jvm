// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Simple button used to represent a link to some resource.
 *
 * This kind of button is primarily used when the interaction with the button causes a context change (like linking to a web page).
 */
@GodotBaseType
open class LinkButton : BaseButton() {
  /**
   * The button's text that will be displayed inside the button's area.
   */
  open var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINKBUTTON_GET_TEXT, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINKBUTTON_SET_TEXT, NIL)
    }

  /**
   * Determines when to show the underline. See [enum UnderlineMode] for options.
   */
  open var underline: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINKBUTTON_GET_UNDERLINE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINKBUTTON_SET_UNDERLINE, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_LINKBUTTON, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  enum class UnderlineMode(
    id: Long
  ) {
    /**
     * The LinkButton will always show an underline at the bottom of its text.
     */
    UNDERLINE_MODE_ALWAYS(0),

    /**
     * The LinkButton will show an underline at the bottom of its text when the mouse cursor is over it.
     */
    UNDERLINE_MODE_ON_HOVER(1),

    /**
     * The LinkButton will never show an underline at the bottom of its text.
     */
    UNDERLINE_MODE_NEVER(2);

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
     * The LinkButton will always show an underline at the bottom of its text.
     */
    final const val UNDERLINE_MODE_ALWAYS: Long = 0

    /**
     * The LinkButton will never show an underline at the bottom of its text.
     */
    final const val UNDERLINE_MODE_NEVER: Long = 2

    /**
     * The LinkButton will show an underline at the bottom of its text when the mouse cursor is over it.
     */
    final const val UNDERLINE_MODE_ON_HOVER: Long = 1
  }
}

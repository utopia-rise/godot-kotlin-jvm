// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Simple button used to represent a link to some resource.
 *
 * This kind of button is primarily used when the interaction with the button causes a context change (like linking to a web page).
 *
 * See also [godot.BaseButton] which contains common properties and methods associated with this node.
 */
@GodotBaseType
public open class LinkButton : BaseButton() {
  /**
   * The button's text that will be displayed inside the button's area.
   */
  public open var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINKBUTTON_GET_TEXT, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINKBUTTON_SET_TEXT, NIL)
    }

  /**
   * Determines when to show the underline. See [enum UnderlineMode] for options.
   */
  public open var underline: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINKBUTTON_GET_UNDERLINE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINKBUTTON_SET_UNDERLINE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_LINKBUTTON)
  }

  public enum class UnderlineMode(
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
    UNDERLINE_MODE_NEVER(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * The LinkButton will always show an underline at the bottom of its text.
     */
    public final const val UNDERLINE_MODE_ALWAYS: Long = 0

    /**
     * The LinkButton will never show an underline at the bottom of its text.
     */
    public final const val UNDERLINE_MODE_NEVER: Long = 2

    /**
     * The LinkButton will show an underline at the bottom of its text when the mouse cursor is over it.
     */
    public final const val UNDERLINE_MODE_ON_HOVER: Long = 1
  }
}

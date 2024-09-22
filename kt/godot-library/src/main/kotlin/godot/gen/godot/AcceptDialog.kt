// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Signal0
import godot.core.Signal1
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * The default use of [AcceptDialog] is to allow it to only be accepted or closed, with the same
 * result. However, the [signal confirmed] and [signal canceled] signals allow to make the two actions
 * different, and the [addButton] method allows to add custom buttons and actions.
 */
@GodotBaseType
public open class AcceptDialog : Window() {
  /**
   * Emitted when the dialog is accepted, i.e. the OK button is pressed.
   */
  public val confirmed: Signal0 by Signal0

  /**
   * Emitted when the dialog is closed or the button created with [addCancelButton] is pressed.
   */
  public val canceled: Signal0 by Signal0

  /**
   * Emitted when a custom button is pressed. See [addButton].
   */
  public val customAction: Signal1<StringName> by Signal1

  /**
   * The text displayed by the OK button (see [getOkButton]).
   */
  public final inline var okButtonText: String
    @JvmName("okButtonTextProperty")
    get() = getOkButtonText()
    @JvmName("okButtonTextProperty")
    set(`value`) {
      setOkButtonText(value)
    }

  /**
   * The text displayed by the dialog.
   */
  public final inline var dialogText: String
    @JvmName("dialogTextProperty")
    get() = getText()
    @JvmName("dialogTextProperty")
    set(`value`) {
      setText(value)
    }

  /**
   * If `true`, the dialog is hidden when the OK button is pressed. You can set it to `false` if you
   * want to do e.g. input validation when receiving the [signal confirmed] signal, and handle hiding
   * the dialog in your own logic.
   * **Note:** Some nodes derived from this class can have a different default value, and
   * potentially their own built-in logic overriding this setting. For example [FileDialog] defaults to
   * `false`, and has its own input validation code that is called when you press OK, which eventually
   * hides the dialog if the input is valid. As such, this property can't be used in [FileDialog] to
   * disable hiding the dialog when pressing OK.
   */
  public final inline var dialogHideOnOk: Boolean
    @JvmName("dialogHideOnOkProperty")
    get() = getHideOnOk()
    @JvmName("dialogHideOnOkProperty")
    set(`value`) {
      setHideOnOk(value)
    }

  /**
   * If `true`, the dialog will be hidden when the escape key ([KEY_ESCAPE]) is pressed.
   */
  public final inline var dialogCloseOnEscape: Boolean
    @JvmName("dialogCloseOnEscapeProperty")
    get() = getCloseOnEscape()
    @JvmName("dialogCloseOnEscapeProperty")
    set(`value`) {
      setCloseOnEscape(value)
    }

  /**
   * Sets autowrapping for the text in the dialog.
   */
  public final inline var dialogAutowrap: Boolean
    @JvmName("dialogAutowrapProperty")
    get() = hasAutowrap()
    @JvmName("dialogAutowrapProperty")
    set(`value`) {
      setAutowrap(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_ACCEPTDIALOG, scriptIndex)
  }

  /**
   * Returns the OK [Button] instance.
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [CanvasItem.visible] property.
   */
  public final fun getOkButton(): Button? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOkButtonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Button?)
  }

  /**
   * Returns the label used for built-in text.
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [CanvasItem.visible] property.
   */
  public final fun getLabel(): Label? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLabelPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Label?)
  }

  public final fun setHideOnOk(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setHideOnOkPtr, NIL)
  }

  public final fun getHideOnOk(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHideOnOkPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCloseOnEscape(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setCloseOnEscapePtr, NIL)
  }

  public final fun getCloseOnEscape(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCloseOnEscapePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds a button with label [text] and a custom [action] to the dialog and returns the created
   * button. [action] will be passed to the [signal custom_action] signal when pressed.
   * If `true`, [right] will place the button to the right of any sibling buttons.
   * You can use [removeButton] method to remove a button created with this method from the dialog.
   */
  @JvmOverloads
  public final fun addButton(
    text: String,
    right: Boolean = false,
    action: String = "",
  ): Button? {
    TransferContext.writeArguments(STRING to text, BOOL to right, STRING to action)
    TransferContext.callMethod(rawPtr, MethodBindings.addButtonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Button?)
  }

  /**
   * Adds a button with label [name] and a cancel action to the dialog and returns the created
   * button.
   * You can use [removeButton] method to remove a button created with this method from the dialog.
   */
  public final fun addCancelButton(name: String): Button? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.addCancelButtonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Button?)
  }

  /**
   * Removes the [button] from the dialog. Does NOT free the [button]. The [button] must be a
   * [Button] added with [addButton] or [addCancelButton] method. After removal, pressing the [button]
   * will no longer emit this dialog's [signal custom_action] or [signal canceled] signals.
   */
  public final fun removeButton(button: Button?): Unit {
    TransferContext.writeArguments(OBJECT to button)
    TransferContext.callMethod(rawPtr, MethodBindings.removeButtonPtr, NIL)
  }

  /**
   * Registers a [LineEdit] in the dialog. When the enter key is pressed, the dialog will be
   * accepted.
   */
  public final fun registerTextEnter(lineEdit: LineEdit?): Unit {
    TransferContext.writeArguments(OBJECT to lineEdit)
    TransferContext.callMethod(rawPtr, MethodBindings.registerTextEnterPtr, NIL)
  }

  public final fun setText(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.setTextPtr, NIL)
  }

  public final fun getText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setAutowrap(autowrap: Boolean): Unit {
    TransferContext.writeArguments(BOOL to autowrap)
    TransferContext.callMethod(rawPtr, MethodBindings.setAutowrapPtr, NIL)
  }

  public final fun hasAutowrap(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasAutowrapPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setOkButtonText(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.setOkButtonTextPtr, NIL)
  }

  public final fun getOkButtonText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOkButtonTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public companion object

  internal object MethodBindings {
    public val getOkButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "get_ok_button", 1856205918)

    public val getLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "get_label", 566733104)

    public val setHideOnOkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "set_hide_on_ok", 2586408642)

    public val getHideOnOkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "get_hide_on_ok", 36873697)

    public val setCloseOnEscapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "set_close_on_escape", 2586408642)

    public val getCloseOnEscapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "get_close_on_escape", 36873697)

    public val addButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "add_button", 3328440682)

    public val addCancelButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "add_cancel_button", 242045556)

    public val removeButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "remove_button", 2068354942)

    public val registerTextEnterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "register_text_enter", 3714008017)

    public val setTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "set_text", 83702148)

    public val getTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "get_text", 201670096)

    public val setAutowrapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "set_autowrap", 2586408642)

    public val hasAutowrapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "has_autowrap", 2240911060)

    public val setOkButtonTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "set_ok_button_text", 83702148)

    public val getOkButtonTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "get_ok_button_text", 201670096)
  }
}

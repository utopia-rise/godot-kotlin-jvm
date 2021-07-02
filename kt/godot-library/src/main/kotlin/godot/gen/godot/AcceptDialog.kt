// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base dialog for user notification.
 *
 * This dialog is useful for small notifications to the user about an event. It can only be accepted or closed, with the same result.
 */
@GodotBaseType
public open class AcceptDialog : WindowDialog() {
  /**
   * Emitted when the dialog is accepted, i.e. the OK button is pressed.
   */
  public val confirmed: Signal0 by signal()

  /**
   * Emitted when a custom button is pressed. See [addButton].
   */
  public val customAction: Signal1<String> by signal("action")

  /**
   * Sets autowrapping for the text in the dialog.
   */
  public open var dialogAutowrap: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_GET_DIALOG_AUTOWRAP,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_SET_DIALOG_AUTOWRAP,
          NIL)
    }

  /**
   * If `true`, the dialog is hidden when the OK button is pressed. You can set it to `false` if you want to do e.g. input validation when receiving the [confirmed] signal, and handle hiding the dialog in your own logic.
   *
   * **Note:** Some nodes derived from this class can have a different default value, and potentially their own built-in logic overriding this setting. For example [godot.FileDialog] defaults to `false`, and has its own input validation code that is called when you press OK, which eventually hides the dialog if the input is valid. As such, this property can't be used in [godot.FileDialog] to disable hiding the dialog when pressing OK.
   */
  public open var dialogHideOnOk: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_GET_DIALOG_HIDE_ON_OK, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_SET_DIALOG_HIDE_ON_OK, NIL)
    }

  /**
   * The text displayed by the dialog.
   */
  public open var dialogText: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_GET_DIALOG_TEXT,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_SET_DIALOG_TEXT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ACCEPTDIALOG)
  }

  public open fun _builtinTextEntered(arg0: String): Unit {
  }

  public open fun _customAction(arg0: String): Unit {
  }

  public open fun _ok(): Unit {
  }

  /**
   * Adds a button with label `text` and a custom `action` to the dialog and returns the created button. `action` will be passed to the [customAction] signal when pressed.
   *
   * If `true`, `right` will place the button to the right of any sibling buttons.
   */
  public open fun addButton(
    text: String,
    right: Boolean = false,
    action: String = ""
  ): Button? {
    TransferContext.writeArguments(STRING to text, BOOL to right, STRING to action)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_ADD_BUTTON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Button?
  }

  /**
   * Adds a button with label `name` and a cancel action to the dialog and returns the created button.
   */
  public open fun addCancel(name: String): Button? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_ADD_CANCEL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Button?
  }

  /**
   * Returns the label used for built-in text.
   */
  public open fun getLabel(): Label? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_GET_LABEL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Label?
  }

  /**
   * Returns the OK [godot.Button] instance.
   */
  public open fun getOk(): Button? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_GET_OK, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Button?
  }

  /**
   * Registers a [godot.LineEdit] in the dialog. When the enter key is pressed, the dialog will be accepted.
   */
  public open fun registerTextEnter(lineEdit: Node): Unit {
    TransferContext.writeArguments(OBJECT to lineEdit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_REGISTER_TEXT_ENTER,
        NIL)
  }
}

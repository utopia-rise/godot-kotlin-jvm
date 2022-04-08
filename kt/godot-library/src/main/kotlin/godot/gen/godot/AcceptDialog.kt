// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
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
public open class AcceptDialog : Window() {
  /**
   * Emitted when the dialog is closed or the button created with [addCancelButton] is pressed.
   */
  public val cancelled: Signal0 by signal()

  /**
   * Emitted when the dialog is accepted, i.e. the OK button is pressed.
   */
  public val confirmed: Signal0 by signal()

  /**
   * Emitted when a custom button is pressed. See [addButton].
   */
  public val customAction: Signal1<StringName> by signal("action")

  /**
   * The text displayed by the dialog.
   */
  public var dialogText: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_GET_TEXT, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_SET_TEXT, NIL)
    }

  /**
   * If `true`, the dialog is hidden when the OK button is pressed. You can set it to `false` if you want to do e.g. input validation when receiving the [confirmed] signal, and handle hiding the dialog in your own logic.
   *
   * **Note:** Some nodes derived from this class can have a different default value, and potentially their own built-in logic overriding this setting. For example [godot.FileDialog] defaults to `false`, and has its own input validation code that is called when you press OK, which eventually hides the dialog if the input is valid. As such, this property can't be used in [godot.FileDialog] to disable hiding the dialog when pressing OK.
   */
  public var dialogHideOnOk: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_GET_HIDE_ON_OK, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_SET_HIDE_ON_OK, NIL)
    }

  /**
   * Sets autowrapping for the text in the dialog.
   */
  public var dialogAutowrap: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_HAS_AUTOWRAP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_SET_AUTOWRAP, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ACCEPTDIALOG)
  }

  /**
   * Returns the OK [godot.Button] instance.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public fun getOkButton(): Button? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_GET_OK_BUTTON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Button?
  }

  /**
   * Returns the label used for built-in text.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public fun getLabel(): Label? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_GET_LABEL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Label?
  }

  /**
   * Adds a button with label `text` and a custom `action` to the dialog and returns the created button. `action` will be passed to the [customAction] signal when pressed.
   *
   * If `true`, `right` will place the button to the right of any sibling buttons.
   *
   * You can use [removeButton] method to remove a button created with this method from the dialog.
   */
  public fun addButton(
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
   *
   * You can use [removeButton] method to remove a button created with this method from the dialog.
   */
  public fun addCancelButton(name: String): Button? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_ADD_CANCEL_BUTTON,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Button?
  }

  /**
   * Removes the `button` from the dialog. Does NOT free the `button`. The `button` must be a [godot.Button] added with [addButton] or [addCancelButton] method. After removal, pressing the `button` will no longer emit this dialog's [customAction] or [cancelled] signals.
   */
  public fun removeButton(button: Control): Unit {
    TransferContext.writeArguments(OBJECT to button)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_REMOVE_BUTTON, NIL)
  }

  /**
   * Registers a [godot.LineEdit] in the dialog. When the enter key is pressed, the dialog will be accepted.
   */
  public fun registerTextEnter(lineEdit: Control): Unit {
    TransferContext.writeArguments(OBJECT to lineEdit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ACCEPTDIALOG_REGISTER_TEXT_ENTER,
        NIL)
  }

  public companion object
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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
  public val confirmed: Signal0 by signal()

  /**
   * Emitted when the dialog is closed or the button created with [addCancelButton] is pressed.
   */
  public val canceled: Signal0 by signal()

  /**
   * Emitted when a custom button is pressed. See [addButton].
   */
  public val customAction: Signal1<StringName> by signal("action")

  /**
   * The text displayed by the OK button (see [getOkButton]).
   */
  public var okButtonText: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOkButtonTextPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOkButtonTextPtr, NIL)
    }

  /**
   * The text displayed by the dialog.
   */
  public var dialogText: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextPtr, NIL)
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
  public var dialogHideOnOk: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHideOnOkPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHideOnOkPtr, NIL)
    }

  /**
   * If `true`, the dialog will be hidden when the escape key ([KEYESCAPE]) is pressed.
   */
  public var dialogCloseOnEscape: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCloseOnEscapePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCloseOnEscapePtr, NIL)
    }

  /**
   * Sets autowrapping for the text in the dialog.
   */
  public var dialogAutowrap: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.hasAutowrapPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutowrapPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ACCEPTDIALOG, scriptIndex)
    return true
  }

  /**
   * Returns the OK [Button] instance.
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [CanvasItem.visible] property.
   */
  public fun getOkButton(): Button? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOkButtonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Button?)
  }

  /**
   * Returns the label used for built-in text.
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [CanvasItem.visible] property.
   */
  public fun getLabel(): Label? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLabelPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Label?)
  }

  /**
   * Adds a button with label [text] and a custom [action] to the dialog and returns the created
   * button. [action] will be passed to the [signal custom_action] signal when pressed.
   * If `true`, [right] will place the button to the right of any sibling buttons.
   * You can use [removeButton] method to remove a button created with this method from the dialog.
   */
  @JvmOverloads
  public fun addButton(
    text: String,
    right: Boolean = false,
    action: String = "",
  ): Button? {
    TransferContext.writeArguments(STRING to text, BOOL to right, STRING to action)
    TransferContext.callMethod(rawPtr, MethodBindings.addButtonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Button?)
  }

  /**
   * Adds a button with label [name] and a cancel action to the dialog and returns the created
   * button.
   * You can use [removeButton] method to remove a button created with this method from the dialog.
   */
  public fun addCancelButton(name: String): Button? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.addCancelButtonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Button?)
  }

  /**
   * Removes the [button] from the dialog. Does NOT free the [button]. The [button] must be a
   * [Button] added with [addButton] or [addCancelButton] method. After removal, pressing the [button]
   * will no longer emit this dialog's [signal custom_action] or [signal canceled] signals.
   */
  public fun removeButton(button: Control): Unit {
    TransferContext.writeArguments(OBJECT to button)
    TransferContext.callMethod(rawPtr, MethodBindings.removeButtonPtr, NIL)
  }

  /**
   * Registers a [LineEdit] in the dialog. When the enter key is pressed, the dialog will be
   * accepted.
   */
  public fun registerTextEnter(lineEdit: Control): Unit {
    TransferContext.writeArguments(OBJECT to lineEdit)
    TransferContext.callMethod(rawPtr, MethodBindings.registerTextEnterPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getOkButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "get_ok_button")

    public val getLabelPtr: VoidPtr = TypeManager.getMethodBindPtr("AcceptDialog", "get_label")

    public val setHideOnOkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "set_hide_on_ok")

    public val getHideOnOkPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "get_hide_on_ok")

    public val setCloseOnEscapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "set_close_on_escape")

    public val getCloseOnEscapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "get_close_on_escape")

    public val addButtonPtr: VoidPtr = TypeManager.getMethodBindPtr("AcceptDialog", "add_button")

    public val addCancelButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "add_cancel_button")

    public val removeButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "remove_button")

    public val registerTextEnterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "register_text_enter")

    public val setTextPtr: VoidPtr = TypeManager.getMethodBindPtr("AcceptDialog", "set_text")

    public val getTextPtr: VoidPtr = TypeManager.getMethodBindPtr("AcceptDialog", "get_text")

    public val setAutowrapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "set_autowrap")

    public val hasAutowrapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "has_autowrap")

    public val setOkButtonTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "set_ok_button_text")

    public val getOkButtonTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AcceptDialog", "get_ok_button_text")
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class LineEdit : Control() {
  val textChangeRejected: Signal0 by signal()

  val textChanged: Signal1<String> by signal("new_text")

  val textEntered: Signal1<String> by signal("new_text")

  open var align: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_ALIGN, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_ALIGN, NIL)
    }

  open var caretBlink: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_CARET_BLINK, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_CARET_BLINK, NIL)
    }

  open var caretBlinkSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_CARET_BLINK_SPEED,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_CARET_BLINK_SPEED,
          NIL)
    }

  open var caretPosition: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_CARET_POSITION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_CARET_POSITION, NIL)
    }

  open var clearButtonEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_CLEAR_BUTTON_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_CLEAR_BUTTON_ENABLED,
          NIL)
    }

  open var contextMenuEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_CONTEXT_MENU_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_CONTEXT_MENU_ENABLED,
          NIL)
    }

  open var editable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_EDITABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_EDITABLE, NIL)
    }

  open var expandToTextLength: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_EXPAND_TO_TEXT_LENGTH, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_EXPAND_TO_TEXT_LENGTH, NIL)
    }

  open var maxLength: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_MAX_LENGTH, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_MAX_LENGTH, NIL)
    }

  open var placeholderAlpha: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_PLACEHOLDER_ALPHA,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_PLACEHOLDER_ALPHA,
          NIL)
    }

  open var placeholderText: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_PLACEHOLDER_TEXT,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_PLACEHOLDER_TEXT,
          NIL)
    }

  open var rightIcon: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_RIGHT_ICON, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_RIGHT_ICON, NIL)
    }

  open var secret: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_SECRET, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_SECRET, NIL)
    }

  open var secretCharacter: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_SECRET_CHARACTER,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_SECRET_CHARACTER,
          NIL)
    }

  open var selectingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_SELECTING_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_SELECTING_ENABLED,
          NIL)
    }

  open var shortcutKeysEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_SHORTCUT_KEYS_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_SHORTCUT_KEYS_ENABLED, NIL)
    }

  open var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_TEXT, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SET_TEXT, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_LINEEDIT)

  open fun _editorSettingsChanged() {
  }

  override fun _guiInput(event: InputEvent) {
  }

  open fun _textChanged() {
  }

  open fun _toggleDrawCaret() {
  }

  open fun appendAtCursor(text: String) {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_APPEND_AT_CURSOR, NIL)
  }

  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_CLEAR, NIL)
  }

  open fun deselect() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_DESELECT, NIL)
  }

  open fun getMenu(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_GET_MENU, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PopupMenu?
  }

  open fun menuOption(option: Long) {
    TransferContext.writeArguments(LONG to option)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_MENU_OPTION, NIL)
  }

  open fun select(from: Long = 0, to: Long = -1) {
    TransferContext.writeArguments(LONG to from, LONG to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SELECT, NIL)
  }

  open fun selectAll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LINEEDIT_SELECT_ALL, NIL)
  }

  enum class Align(
    id: Long
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2),

    ALIGN_FILL(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class MenuItems(
    id: Long
  ) {
    MENU_CUT(0),

    MENU_COPY(1),

    MENU_PASTE(2),

    MENU_CLEAR(3),

    MENU_SELECT_ALL(4),

    MENU_UNDO(5),

    MENU_REDO(6),

    MENU_MAX(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ALIGN_CENTER: Long = 1

    final const val ALIGN_FILL: Long = 3

    final const val ALIGN_LEFT: Long = 0

    final const val ALIGN_RIGHT: Long = 2

    final const val MENU_CLEAR: Long = 3

    final const val MENU_COPY: Long = 1

    final const val MENU_CUT: Long = 0

    final const val MENU_MAX: Long = 7

    final const val MENU_PASTE: Long = 2

    final const val MENU_REDO: Long = 6

    final const val MENU_SELECT_ALL: Long = 4

    final const val MENU_UNDO: Long = 5
  }
}

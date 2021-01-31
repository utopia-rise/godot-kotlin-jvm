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
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class ScrollContainer : Container() {
  val scrollEnded: Signal0 by signal()

  val scrollStarted: Signal0 by signal()

  open var followFocus: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_FOLLOW_FOCUS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_FOLLOW_FOCUS,
          NIL)
    }

  open var scrollDeadzone: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_SCROLL_DEADZONE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_SCROLL_DEADZONE, NIL)
    }

  open var scrollHorizontal: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_SCROLL_HORIZONTAL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_SCROLL_HORIZONTAL, NIL)
    }

  open var scrollHorizontalEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_SCROLL_HORIZONTAL_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_SCROLL_HORIZONTAL_ENABLED, NIL)
    }

  open var scrollVertical: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_SCROLL_VERTICAL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_SCROLL_VERTICAL, NIL)
    }

  open var scrollVerticalEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_SCROLL_VERTICAL_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_SET_SCROLL_VERTICAL_ENABLED, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SCROLLCONTAINER)

  open fun _ensure_focused_visible(arg0: Control) {
  }

  override fun _gui_input(event: InputEvent) {
  }

  open fun _scroll_moved(arg0: Double) {
  }

  open fun _update_scrollbar_position() {
  }

  open fun getHScrollbar(): HScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_H_SCROLLBAR,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as HScrollBar?
  }

  open fun getVScrollbar(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SCROLLCONTAINER_GET_V_SCROLLBAR,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VScrollBar?
  }
}

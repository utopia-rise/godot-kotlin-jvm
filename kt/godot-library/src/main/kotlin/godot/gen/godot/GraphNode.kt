// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class GraphNode : Container() {
  val closeRequest: Signal0 by signal()

  val dragged: Signal2<Vector2, Vector2> by signal("from", "to")

  val offsetChanged: Signal0 by signal()

  val raiseRequest: Signal0 by signal()

  val resizeRequest: Signal1<Vector2> by signal("new_minsize")

  open var comment: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_COMMENT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_COMMENT, NIL)
    }

  open var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_OFFSET, NIL)
    }

  open var overlay: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_OVERLAY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_OVERLAY, NIL)
    }

  open var resizable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_RESIZABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_RESIZABLE, NIL)
    }

  open var selected: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_SELECTED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SELECTED, NIL)
    }

  open var showClose: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_SHOW_CLOSE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SHOW_CLOSE, NIL)
    }

  open var title: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_TITLE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_TITLE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_GRAPHNODE)

  open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  override fun _gui_input(event: InputEvent) {
  }

  open fun clearAllSlots() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_CLEAR_ALL_SLOTS, NIL)
  }

  open fun clearSlot(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_CLEAR_SLOT, NIL)
  }

  open fun getConnectionInputColor(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_INPUT_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  open fun getConnectionInputCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_INPUT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getConnectionInputPosition(idx: Long): Vector2 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_INPUT_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getConnectionInputType(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_INPUT_TYPE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getConnectionOutputColor(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_OUTPUT_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  open fun getConnectionOutputCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_OUTPUT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getConnectionOutputPosition(idx: Long): Vector2 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_OUTPUT_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getConnectionOutputType(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_OUTPUT_TYPE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getSlotColorLeft(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_SLOT_COLOR_LEFT,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  open fun getSlotColorRight(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_SLOT_COLOR_RIGHT,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  open fun getSlotTypeLeft(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_SLOT_TYPE_LEFT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getSlotTypeRight(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_SLOT_TYPE_RIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun isSlotEnabledLeft(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_IS_SLOT_ENABLED_LEFT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isSlotEnabledRight(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_IS_SLOT_ENABLED_RIGHT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun setSlot(
    idx: Long,
    enableLeft: Boolean,
    typeLeft: Long,
    colorLeft: Color,
    enableRight: Boolean,
    typeRight: Long,
    colorRight: Color,
    customLeft: Texture? = null,
    customRight: Texture? = null
  ) {
    TransferContext.writeArguments(LONG to idx, BOOL to enableLeft, LONG to typeLeft, COLOR to
        colorLeft, BOOL to enableRight, LONG to typeRight, COLOR to colorRight, OBJECT to
        customLeft, OBJECT to customRight)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SLOT, NIL)
  }

  enum class Overlay(
    id: Long
  ) {
    OVERLAY_DISABLED(0),

    OVERLAY_BREAKPOINT(1),

    OVERLAY_POSITION(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val OVERLAY_BREAKPOINT: Long = 1

    final const val OVERLAY_DISABLED: Long = 0

    final const val OVERLAY_POSITION: Long = 2
  }
}

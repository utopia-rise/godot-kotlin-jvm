// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

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
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A GraphNode is a container with potentially several input and output slots allowing connections between GraphNodes. Slots can have different, incompatible types.
 *
 * A GraphNode is a container. Each GraphNode can have several input and output slots, sometimes referred to as ports, allowing connections between GraphNodes. To add a slot to GraphNode, add any [godot.Control]-derived child node to it.
 *
 * After adding at least one child to GraphNode new sections will be automatically created in the Inspector called 'Slot'. When 'Slot' is expanded you will see list with index number for each slot. You can click on each of them to expand further.
 *
 * In the Inspector you can enable (show) or disable (hide) slots. By default all slots are disabled so you may not see any slots on your GraphNode initially. You can assign a type to each slot. Only slots of the same type will be able to connect to each other. You can also assign colors to slots. A tuple of input and output slots is defined for each GUI element included in the GraphNode. Input connections are on the left and output connections are on the right side of GraphNode. Only enabled slots are counted as connections.
 */
@GodotBaseType
open class GraphNode : Container() {
  /**
   * Emitted when the GraphNode is requested to be closed. Happens on clicking the close button (see [showClose]).
   */
  val closeRequest: Signal0 by signal()

  /**
   * Emitted when the GraphNode is dragged.
   */
  val dragged: Signal2<Vector2, Vector2> by signal("from", "to")

  /**
   * Emitted when the GraphNode is moved.
   */
  val offsetChanged: Signal0 by signal()

  /**
   * Emitted when the GraphNode is requested to be displayed over other ones. Happens on focusing (clicking into) the GraphNode.
   */
  val raiseRequest: Signal0 by signal()

  /**
   * Emitted when the GraphNode is requested to be resized. Happens on dragging the resizer handle (see [resizable]).
   */
  val resizeRequest: Signal1<Vector2> by signal("new_minsize")

  /**
   * If `true`, the GraphNode is a comment node.
   */
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

  /**
   * The offset of the GraphNode, relative to the scroll offset of the [godot.GraphEdit].
   *
   * **Note:** You cannot use position directly, as [godot.GraphEdit] is a [godot.Container].
   */
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

  /**
   * Sets the overlay shown above the GraphNode. See [enum Overlay].
   */
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

  /**
   * If `true`, the user can resize the GraphNode.
   *
   * **Note:** Dragging the handle will only emit the [resizeRequest] signal, the GraphNode needs to be resized manually.
   */
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

  /**
   * If `true`, the GraphNode is selected.
   */
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

  /**
   * If `true`, the close button will be visible.
   *
   * **Note:** Pressing it will only emit the [closeRequest] signal, the GraphNode needs to be removed manually.
   */
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

  /**
   * The text displayed in the GraphNode's title bar.
   */
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

  override fun __new() {
    callConstructor(ENGINECLASS_GRAPHNODE)
  }

  open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  override fun _guiInput(event: InputEvent) {
  }

  /**
   * Disables all input and output slots of the GraphNode.
   */
  open fun clearAllSlots() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_CLEAR_ALL_SLOTS, NIL)
  }

  /**
   * Disables input and output slot whose index is `idx`.
   */
  open fun clearSlot(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_CLEAR_SLOT, NIL)
  }

  /**
   * Returns the color of the input connection `idx`.
   */
  open fun getConnectionInputColor(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_INPUT_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the number of enabled input slots (connections) to the GraphNode.
   */
  open fun getConnectionInputCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_INPUT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the position of the input connection `idx`.
   */
  open fun getConnectionInputPosition(idx: Long): Vector2 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_INPUT_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the type of the input connection `idx`.
   */
  open fun getConnectionInputType(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_INPUT_TYPE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the color of the output connection `idx`.
   */
  open fun getConnectionOutputColor(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_OUTPUT_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the number of enabled output slots (connections) of the GraphNode.
   */
  open fun getConnectionOutputCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_OUTPUT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the position of the output connection `idx`.
   */
  open fun getConnectionOutputPosition(idx: Long): Vector2 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_OUTPUT_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the type of the output connection `idx`.
   */
  open fun getConnectionOutputType(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_OUTPUT_TYPE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the color set to `idx` left (input) slot.
   */
  open fun getSlotColorLeft(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_SLOT_COLOR_LEFT,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the color set to `idx` right (output) slot.
   */
  open fun getSlotColorRight(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_SLOT_COLOR_RIGHT,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the (integer) type of left (input) `idx` slot.
   */
  open fun getSlotTypeLeft(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_SLOT_TYPE_LEFT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the (integer) type of right (output) `idx` slot.
   */
  open fun getSlotTypeRight(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_SLOT_TYPE_RIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if left (input) slot `idx` is enabled, `false` otherwise.
   */
  open fun isSlotEnabledLeft(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_IS_SLOT_ENABLED_LEFT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if right (output) slot `idx` is enabled, `false` otherwise.
   */
  open fun isSlotEnabledRight(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_IS_SLOT_ENABLED_RIGHT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets properties of the slot with ID `idx`.
   *
   * If `enable_left`/`right`, a port will appear and the slot will be able to be connected from this side.
   *
   * `type_left`/`right` is an arbitrary type of the port. Only ports with the same type values can be connected.
   *
   * `color_left`/`right` is the tint of the port's icon on this side.
   *
   * `custom_left`/`right` is a custom texture for this side's port.
   *
   * **Note:** This method only sets properties of the slot. To create the slot, add a [godot.Control]-derived child to the GraphNode.
   */
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
    /**
     * No overlay is shown.
     */
    OVERLAY_DISABLED(0),

    /**
     * Show overlay set in the `breakpoint` theme property.
     */
    OVERLAY_BREAKPOINT(1),

    /**
     * Show overlay set in the `position` theme property.
     */
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
    /**
     * Show overlay set in the `breakpoint` theme property.
     */
    final const val OVERLAY_BREAKPOINT: Long = 1

    /**
     * No overlay is shown.
     */
    final const val OVERLAY_DISABLED: Long = 0

    /**
     * Show overlay set in the `position` theme property.
     */
    final const val OVERLAY_POSITION: Long = 2
  }
}

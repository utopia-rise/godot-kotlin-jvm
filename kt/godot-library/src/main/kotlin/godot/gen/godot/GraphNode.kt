// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * GraphNode is a [godot.Container] control that represents a single data unit in a [godot.GraphEdit] graph. You can customize the number, type, and color of left- and right-side connection ports.
 *
 * **Note:** Please be aware that this node will undergo extensive refactoring in a future 4.x version involving compatibility-breaking API changes.
 *
 * GraphNode allows to create nodes for a [godot.GraphEdit] graph with customizable content based on its child [godot.Control]s. GraphNode is a [godot.Container] and is responsible for placing its children on screen. This works similar to [godot.VBoxContainer]. Children, in turn, provide GraphNode with so-called slots, each of which can have a connection port on either side. This is similar to how [godot.TabContainer] uses children to create the tabs.
 *
 * Each GraphNode slot is defined by its index and can provide the node with up to two ports: one on the left, and one on the right. By convention the left port is also referred to as the input port and the right port is referred to as the output port. Each port can be enabled and configured individually, using different type and color. The type is an arbitrary value that you can define using your own considerations. The parent [godot.GraphEdit] will receive this information on each connect and disconnect request.
 *
 * Slots can be configured in the Inspector dock once you add at least one child [godot.Control]. The properties are grouped by each slot's index in the "Slot" section.
 *
 * **Note:** While GraphNode is set up using slots and slot indices, connections are made between the ports which are enabled. Because of that [godot.GraphEdit] uses port's index and not slot's index. You can use [getConnectionInputSlot] and [getConnectionOutputSlot] to get the slot index from the port index.
 */
@GodotBaseType
public open class GraphNode : Container() {
  /**
   * Emitted when the GraphNode is moved.
   */
  public val positionOffsetChanged: Signal0 by signal()

  /**
   * Emitted when the GraphNode is selected.
   */
  public val nodeSelected: Signal0 by signal()

  /**
   * Emitted when the GraphNode is deselected.
   */
  public val nodeDeselected: Signal0 by signal()

  /**
   * Emitted when any GraphNode's slot is updated.
   */
  public val slotUpdated: Signal1<Long> by signal("idx")

  /**
   * Emitted when the GraphNode is dragged.
   */
  public val dragged: Signal2<Vector2, Vector2> by signal("from", "to")

  /**
   * Emitted when the GraphNode is requested to be displayed over other ones. Happens on focusing (clicking into) the GraphNode.
   */
  public val raiseRequest: Signal0 by signal()

  /**
   * Emitted when the GraphNode is requested to be closed. Happens on clicking the close button (see [showClose]).
   */
  public val closeRequest: Signal0 by signal()

  /**
   * Emitted when the GraphNode is requested to be resized. Happens on dragging the resizer handle (see [resizable]).
   */
  public val resizeRequest: Signal1<Vector2> by signal("newMinsize")

  /**
   * The text displayed in the GraphNode's title bar.
   */
  public var title: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_TITLE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_TITLE, NIL)
    }

  /**
   * The offset of the GraphNode, relative to the scroll offset of the [godot.GraphEdit].
   *
   * **Note:** You cannot use position offset directly, as [godot.GraphEdit] is a [godot.Container].
   */
  public var positionOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_POSITION_OFFSET,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_POSITION_OFFSET,
          NIL)
    }

  /**
   * If `true`, the close button will be visible.
   *
   * **Note:** Pressing it will only emit the [closeRequest] signal, the GraphNode needs to be removed manually.
   */
  public var showClose: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_IS_CLOSE_BUTTON_VISIBLE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SHOW_CLOSE_BUTTON,
          NIL)
    }

  /**
   * If `true`, the user can resize the GraphNode.
   *
   * **Note:** Dragging the handle will only emit the [resizeRequest] signal, the GraphNode needs to be resized manually.
   */
  public var resizable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_IS_RESIZABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_RESIZABLE, NIL)
    }

  /**
   * If `true`, the user can drag the GraphNode.
   */
  public var draggable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_IS_DRAGGABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_DRAGGABLE, NIL)
    }

  /**
   * If `true`, the user can select the GraphNode.
   */
  public var selectable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_IS_SELECTABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SELECTABLE, NIL)
    }

  /**
   * If `true`, the GraphNode is selected.
   */
  public var selected: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_IS_SELECTED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SELECTED, NIL)
    }

  /**
   * If `true`, the GraphNode is a comment node.
   */
  public var comment: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_IS_COMMENT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_COMMENT, NIL)
    }

  /**
   * Sets the overlay shown above the GraphNode. See [enum Overlay].
   */
  public var overlay: Overlay
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_OVERLAY, LONG)
      return GraphNode.Overlay.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_OVERLAY, NIL)
    }

  /**
   * Base text writing direction.
   */
  public var textDirection: Control.TextDirection
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_TEXT_DIRECTION,
          LONG)
      return Control.TextDirection.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_TEXT_DIRECTION, NIL)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_LANGUAGE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_LANGUAGE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GRAPHNODE, scriptIndex)
    return true
  }

  /**
   * Sets properties of the slot with the [slotIndex] index.
   *
   * If [enableLeftPort]/[enableRightPort] is `true`, a port will appear and the slot will be able to be connected from this side.
   *
   * With [typeLeft]/[typeRight] an arbitrary type can be assigned to each port. Two ports can be connected if they share the same type, or if the connection between their types is allowed in the parent [godot.GraphEdit] (see [godot.GraphEdit.addValidConnectionType]). Keep in mind that the [godot.GraphEdit] has the final say in accepting the connection. Type compatibility simply allows the [godot.GraphEdit.connectionRequest] signal to be emitted.
   *
   * Ports can be further customized using [colorLeft]/[colorRight] and [customIconLeft]/[customIconRight]. The color parameter adds a tint to the icon. The custom icon can be used to override the default port dot.
   *
   * Additionally, [drawStylebox] can be used to enable or disable drawing of the background stylebox for each slot. See [theme_item slot].
   *
   * Individual properties can also be set using one of the `set_slot_*` methods.
   *
   * **Note:** This method only sets properties of the slot. To create the slot itself, add a [godot.Control]-derived child to the GraphNode.
   */
  public fun setSlot(
    slotIndex: Long,
    enableLeftPort: Boolean,
    typeLeft: Long,
    colorLeft: Color,
    enableRightPort: Boolean,
    typeRight: Long,
    colorRight: Color,
    customIconLeft: Texture2D? = null,
    customIconRight: Texture2D? = null,
    drawStylebox: Boolean = true
  ): Unit {
    TransferContext.writeArguments(LONG to slotIndex, BOOL to enableLeftPort, LONG to typeLeft, COLOR to colorLeft, BOOL to enableRightPort, LONG to typeRight, COLOR to colorRight, OBJECT to customIconLeft, OBJECT to customIconRight, BOOL to drawStylebox)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SLOT, NIL)
  }

  /**
   * Disables input and output slot whose index is [slotIndex].
   */
  public fun clearSlot(slotIndex: Long): Unit {
    TransferContext.writeArguments(LONG to slotIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_CLEAR_SLOT, NIL)
  }

  /**
   * Disables all input and output slots of the GraphNode.
   */
  public fun clearAllSlots(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_CLEAR_ALL_SLOTS, NIL)
  }

  /**
   * Toggles the left (input) side of the slot [slotIndex]. If [enable] is `true`, a port will appear on the left side and the slot will be able to be connected from this side.
   */
  public fun setSlotEnabledLeft(slotIndex: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to slotIndex, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SLOT_ENABLED_LEFT,
        NIL)
  }

  /**
   * Returns `true` if left (input) side of the slot [slotIndex] is enabled.
   */
  public fun isSlotEnabledLeft(slotIndex: Long): Boolean {
    TransferContext.writeArguments(LONG to slotIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_IS_SLOT_ENABLED_LEFT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the left (input) type of the slot [slotIndex] to [type]. If the value is negative, all connections will be disallowed to be created via user inputs.
   */
  public fun setSlotTypeLeft(slotIndex: Long, type: Long): Unit {
    TransferContext.writeArguments(LONG to slotIndex, LONG to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SLOT_TYPE_LEFT, NIL)
  }

  /**
   * Returns the left (input) type of the slot [slotIndex].
   */
  public fun getSlotTypeLeft(slotIndex: Long): Long {
    TransferContext.writeArguments(LONG to slotIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_SLOT_TYPE_LEFT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the [godot.core.Color] of the left (input) side of the slot [slotIndex] to [color].
   */
  public fun setSlotColorLeft(slotIndex: Long, color: Color): Unit {
    TransferContext.writeArguments(LONG to slotIndex, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SLOT_COLOR_LEFT, NIL)
  }

  /**
   * Returns the left (input) [godot.core.Color] of the slot [slotIndex].
   */
  public fun getSlotColorLeft(slotIndex: Long): Color {
    TransferContext.writeArguments(LONG to slotIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_SLOT_COLOR_LEFT,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Toggles the right (output) side of the slot [slotIndex]. If [enable] is `true`, a port will appear on the right side and the slot will be able to be connected from this side.
   */
  public fun setSlotEnabledRight(slotIndex: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to slotIndex, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SLOT_ENABLED_RIGHT,
        NIL)
  }

  /**
   * Returns `true` if right (output) side of the slot [slotIndex] is enabled.
   */
  public fun isSlotEnabledRight(slotIndex: Long): Boolean {
    TransferContext.writeArguments(LONG to slotIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_IS_SLOT_ENABLED_RIGHT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the right (output) type of the slot [slotIndex] to [type]. If the value is negative, all connections will be disallowed to be created via user inputs.
   */
  public fun setSlotTypeRight(slotIndex: Long, type: Long): Unit {
    TransferContext.writeArguments(LONG to slotIndex, LONG to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SLOT_TYPE_RIGHT, NIL)
  }

  /**
   * Returns the right (output) type of the slot [slotIndex].
   */
  public fun getSlotTypeRight(slotIndex: Long): Long {
    TransferContext.writeArguments(LONG to slotIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_SLOT_TYPE_RIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the [godot.core.Color] of the right (output) side of the slot [slotIndex] to [color].
   */
  public fun setSlotColorRight(slotIndex: Long, color: Color): Unit {
    TransferContext.writeArguments(LONG to slotIndex, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SLOT_COLOR_RIGHT, NIL)
  }

  /**
   * Returns the right (output) [godot.core.Color] of the slot [slotIndex].
   */
  public fun getSlotColorRight(slotIndex: Long): Color {
    TransferContext.writeArguments(LONG to slotIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_SLOT_COLOR_RIGHT,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns true if the background [godot.StyleBox] of the slot [slotIndex] is drawn.
   */
  public fun isSlotDrawStylebox(slotIndex: Long): Boolean {
    TransferContext.writeArguments(LONG to slotIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_IS_SLOT_DRAW_STYLEBOX,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Toggles the background [godot.StyleBox] of the slot [slotIndex].
   */
  public fun setSlotDrawStylebox(slotIndex: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to slotIndex, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SLOT_DRAW_STYLEBOX,
        NIL)
  }

  /**
   * Returns the number of enabled input slots (connections) to the GraphNode.
   */
  public fun getConnectionInputCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_INPUT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the height of the input connection [port].
   */
  public fun getConnectionInputHeight(port: Long): Long {
    TransferContext.writeArguments(LONG to port)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_INPUT_HEIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the position of the input connection [port].
   */
  public fun getConnectionInputPosition(port: Long): Vector2 {
    TransferContext.writeArguments(LONG to port)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_INPUT_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the type of the input connection [port].
   */
  public fun getConnectionInputType(port: Long): Long {
    TransferContext.writeArguments(LONG to port)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_INPUT_TYPE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [godot.core.Color] of the input connection [port].
   */
  public fun getConnectionInputColor(port: Long): Color {
    TransferContext.writeArguments(LONG to port)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_INPUT_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the corresponding slot index of the input connection [port].
   */
  public fun getConnectionInputSlot(port: Long): Long {
    TransferContext.writeArguments(LONG to port)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_INPUT_SLOT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of enabled output slots (connections) of the GraphNode.
   */
  public fun getConnectionOutputCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_OUTPUT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the height of the output connection [port].
   */
  public fun getConnectionOutputHeight(port: Long): Long {
    TransferContext.writeArguments(LONG to port)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_OUTPUT_HEIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the position of the output connection [port].
   */
  public fun getConnectionOutputPosition(port: Long): Vector2 {
    TransferContext.writeArguments(LONG to port)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_OUTPUT_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the type of the output connection [port].
   */
  public fun getConnectionOutputType(port: Long): Long {
    TransferContext.writeArguments(LONG to port)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_OUTPUT_TYPE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [godot.core.Color] of the output connection [port].
   */
  public fun getConnectionOutputColor(port: Long): Color {
    TransferContext.writeArguments(LONG to port)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_OUTPUT_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the corresponding slot index of the output connection [port].
   */
  public fun getConnectionOutputSlot(port: Long): Long {
    TransferContext.writeArguments(LONG to port)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_OUTPUT_SLOT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class Overlay(
    id: Long
  ) {
    /**
     * No overlay is shown.
     */
    OVERLAY_DISABLED(0),
    /**
     * Show overlay set in the [theme_item breakpoint] theme property.
     */
    OVERLAY_BREAKPOINT(1),
    /**
     * Show overlay set in the [theme_item position] theme property.
     */
    OVERLAY_POSITION(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}

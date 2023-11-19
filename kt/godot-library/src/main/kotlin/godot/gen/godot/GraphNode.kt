// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A container with connection ports, representing a node in a [godot.GraphEdit].
 *
 * [godot.GraphNode] allows to create nodes for a [godot.GraphEdit] graph with customizable content based on its child controls. [godot.GraphNode] is derived from [godot.Container] and it is responsible for placing its children on screen. This works similar to [godot.VBoxContainer]. Children, in turn, provide [godot.GraphNode] with so-called slots, each of which can have a connection port on either side.
 *
 * Each [godot.GraphNode] slot is defined by its index and can provide the node with up to two ports: one on the left, and one on the right. By convention the left port is also referred to as the **input port** and the right port is referred to as the **output port**. Each port can be enabled and configured individually, using different type and color. The type is an arbitrary value that you can define using your own considerations. The parent [godot.GraphEdit] will receive this information on each connect and disconnect request.
 *
 * Slots can be configured in the Inspector dock once you add at least one child [godot.Control]. The properties are grouped by each slot's index in the "Slot" section.
 *
 * **Note:** While GraphNode is set up using slots and slot indices, connections are made between the ports which are enabled. Because of that, [godot.GraphEdit] uses the port's index and not the slot's index. You can use [getConnectionInputSlot] and [getConnectionOutputSlot] to get the slot index from the port index.
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
      TransferContext.callMethod(rawPtr, MethodBindings.getTitlePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTitlePtr, NIL)
    }

  /**
   * The offset of the GraphNode, relative to the scroll offset of the [godot.GraphEdit].
   *
   * **Note:** You cannot use position offset directly, as [godot.GraphEdit] is a [godot.Container].
   */
  @CoreTypeLocalCopy
  public var positionOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionOffsetPtr, NIL)
    }

  /**
   * If `true`, the close button will be visible.
   *
   * **Note:** Pressing it will only emit the [closeRequest] signal, the GraphNode needs to be removed manually.
   */
  public var showClose: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCloseButtonVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShowCloseButtonPtr, NIL)
    }

  /**
   * If `true`, the user can resize the GraphNode.
   *
   * **Note:** Dragging the handle will only emit the [resizeRequest] signal, the GraphNode needs to be resized manually.
   */
  public var resizable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isResizablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setResizablePtr, NIL)
    }

  /**
   * If `true`, the user can drag the GraphNode.
   */
  public var draggable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDraggablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDraggablePtr, NIL)
    }

  /**
   * If `true`, the user can select the GraphNode.
   */
  public var selectable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSelectablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSelectablePtr, NIL)
    }

  /**
   * If `true`, the GraphNode is selected.
   */
  public var selected: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSelectedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSelectedPtr, NIL)
    }

  /**
   * If `true`, the GraphNode is a comment node.
   */
  public var comment: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCommentPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCommentPtr, NIL)
    }

  /**
   * Sets the overlay shown above the GraphNode. See [enum Overlay].
   */
  public var overlay: Overlay
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOverlayPtr, LONG)
      return GraphNode.Overlay.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setOverlayPtr, NIL)
    }

  /**
   * Base text writing direction.
   */
  public var textDirection: Control.TextDirection
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextDirectionPtr, LONG)
      return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextDirectionPtr, NIL)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLanguagePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLanguagePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GRAPHNODE, scriptIndex)
    return true
  }

  /**
   * The offset of the GraphNode, relative to the scroll offset of the [godot.GraphEdit].
   *
   * **Note:** You cannot use position offset directly, as [godot.GraphEdit] is a [godot.Container].
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = graphnode.positionOffset
   * //Your changes
   * graphnode.positionOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun positionOffsetMutate(block: Vector2.() -> Unit): Vector2 = positionOffset.apply{
      block(this)
      positionOffset = this
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
  @JvmOverloads
  public fun setSlot(
    slotIndex: Int,
    enableLeftPort: Boolean,
    typeLeft: Int,
    colorLeft: Color,
    enableRightPort: Boolean,
    typeRight: Int,
    colorRight: Color,
    customIconLeft: Texture2D? = null,
    customIconRight: Texture2D? = null,
    drawStylebox: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), BOOL to enableLeftPort, LONG to typeLeft.toLong(), COLOR to colorLeft, BOOL to enableRightPort, LONG to typeRight.toLong(), COLOR to colorRight, OBJECT to customIconLeft, OBJECT to customIconRight, BOOL to drawStylebox)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotPtr, NIL)
  }

  /**
   * Disables input and output slot whose index is [slotIndex].
   */
  public fun clearSlot(slotIndex: Int): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.clearSlotPtr, NIL)
  }

  /**
   * Disables all input and output slots of the GraphNode.
   */
  public fun clearAllSlots(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearAllSlotsPtr, NIL)
  }

  /**
   * Toggles the left (input) side of the slot [slotIndex]. If [enable] is `true`, a port will appear on the left side and the slot will be able to be connected from this side.
   */
  public fun setSlotEnabledLeft(slotIndex: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotEnabledLeftPtr, NIL)
  }

  /**
   * Returns `true` if left (input) side of the slot [slotIndex] is enabled.
   */
  public fun isSlotEnabledLeft(slotIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isSlotEnabledLeftPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the left (input) type of the slot [slotIndex] to [type]. If the value is negative, all connections will be disallowed to be created via user inputs.
   */
  public fun setSlotTypeLeft(slotIndex: Int, type: Int): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), LONG to type.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotTypeLeftPtr, NIL)
  }

  /**
   * Returns the left (input) type of the slot [slotIndex].
   */
  public fun getSlotTypeLeft(slotIndex: Int): Int {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSlotTypeLeftPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the [godot.core.Color] of the left (input) side of the slot [slotIndex] to [color].
   */
  public fun setSlotColorLeft(slotIndex: Int, color: Color): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotColorLeftPtr, NIL)
  }

  /**
   * Returns the left (input) [godot.core.Color] of the slot [slotIndex].
   */
  public fun getSlotColorLeft(slotIndex: Int): Color {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSlotColorLeftPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Toggles the right (output) side of the slot [slotIndex]. If [enable] is `true`, a port will appear on the right side and the slot will be able to be connected from this side.
   */
  public fun setSlotEnabledRight(slotIndex: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotEnabledRightPtr, NIL)
  }

  /**
   * Returns `true` if right (output) side of the slot [slotIndex] is enabled.
   */
  public fun isSlotEnabledRight(slotIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isSlotEnabledRightPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the right (output) type of the slot [slotIndex] to [type]. If the value is negative, all connections will be disallowed to be created via user inputs.
   */
  public fun setSlotTypeRight(slotIndex: Int, type: Int): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), LONG to type.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotTypeRightPtr, NIL)
  }

  /**
   * Returns the right (output) type of the slot [slotIndex].
   */
  public fun getSlotTypeRight(slotIndex: Int): Int {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSlotTypeRightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the [godot.core.Color] of the right (output) side of the slot [slotIndex] to [color].
   */
  public fun setSlotColorRight(slotIndex: Int, color: Color): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotColorRightPtr, NIL)
  }

  /**
   * Returns the right (output) [godot.core.Color] of the slot [slotIndex].
   */
  public fun getSlotColorRight(slotIndex: Int): Color {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSlotColorRightPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Returns true if the background [godot.StyleBox] of the slot [slotIndex] is drawn.
   */
  public fun isSlotDrawStylebox(slotIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isSlotDrawStyleboxPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Toggles the background [godot.StyleBox] of the slot [slotIndex].
   */
  public fun setSlotDrawStylebox(slotIndex: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotDrawStyleboxPtr, NIL)
  }

  /**
   * Returns the number of enabled input slots (connections) to the GraphNode.
   */
  public fun getConnectionInputCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionInputCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the height of the input connection [port].
   */
  public fun getConnectionInputHeight(port: Int): Int {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionInputHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the position of the input connection [port].
   */
  public fun getConnectionInputPosition(port: Int): Vector2 {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionInputPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the type of the input connection [port].
   */
  public fun getConnectionInputType(port: Int): Int {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionInputTypePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [godot.core.Color] of the input connection [port].
   */
  public fun getConnectionInputColor(port: Int): Color {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionInputColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Returns the corresponding slot index of the input connection [port].
   */
  public fun getConnectionInputSlot(port: Int): Int {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionInputSlotPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of enabled output slots (connections) of the GraphNode.
   */
  public fun getConnectionOutputCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionOutputCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the height of the output connection [port].
   */
  public fun getConnectionOutputHeight(port: Int): Int {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionOutputHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the position of the output connection [port].
   */
  public fun getConnectionOutputPosition(port: Int): Vector2 {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionOutputPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the type of the output connection [port].
   */
  public fun getConnectionOutputType(port: Int): Int {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionOutputTypePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [godot.core.Color] of the output connection [port].
   */
  public fun getConnectionOutputColor(port: Int): Color {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionOutputColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Returns the corresponding slot index of the output connection [port].
   */
  public fun getConnectionOutputSlot(port: Int): Int {
    TransferContext.writeArguments(LONG to port.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionOutputSlotPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public enum class Overlay(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setTitlePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "set_title")

    public val getTitlePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "get_title")

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_text_direction")

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_text_direction")

    public val setLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "set_language")

    public val getLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "get_language")

    public val setSlotPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "set_slot")

    public val clearSlotPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "clear_slot")

    public val clearAllSlotsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "clear_all_slots")

    public val setSlotEnabledLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_enabled_left")

    public val isSlotEnabledLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "is_slot_enabled_left")

    public val setSlotTypeLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_type_left")

    public val getSlotTypeLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_slot_type_left")

    public val setSlotColorLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_color_left")

    public val getSlotColorLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_slot_color_left")

    public val setSlotEnabledRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_enabled_right")

    public val isSlotEnabledRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "is_slot_enabled_right")

    public val setSlotTypeRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_type_right")

    public val getSlotTypeRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_slot_type_right")

    public val setSlotColorRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_color_right")

    public val getSlotColorRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_slot_color_right")

    public val isSlotDrawStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "is_slot_draw_stylebox")

    public val setSlotDrawStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_draw_stylebox")

    public val setPositionOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_position_offset")

    public val getPositionOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_position_offset")

    public val setCommentPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "set_comment")

    public val isCommentPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "is_comment")

    public val setResizablePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "set_resizable")

    public val isResizablePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "is_resizable")

    public val setDraggablePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "set_draggable")

    public val isDraggablePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "is_draggable")

    public val setSelectablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_selectable")

    public val isSelectablePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "is_selectable")

    public val setSelectedPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "set_selected")

    public val isSelectedPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "is_selected")

    public val getConnectionInputCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_input_count")

    public val getConnectionInputHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_input_height")

    public val getConnectionInputPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_input_position")

    public val getConnectionInputTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_input_type")

    public val getConnectionInputColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_input_color")

    public val getConnectionInputSlotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_input_slot")

    public val getConnectionOutputCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_output_count")

    public val getConnectionOutputHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_output_height")

    public val getConnectionOutputPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_output_position")

    public val getConnectionOutputTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_output_type")

    public val getConnectionOutputColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_output_color")

    public val getConnectionOutputSlotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_connection_output_slot")

    public val setShowCloseButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_show_close_button")

    public val isCloseButtonVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "is_close_button_visible")

    public val setOverlayPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "set_overlay")

    public val getOverlayPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "get_overlay")
  }
}

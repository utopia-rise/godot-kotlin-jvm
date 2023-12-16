// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

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
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.signals.Signal1
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
 * **Note:** While GraphNode is set up using slots and slot indices, connections are made between the ports which are enabled. Because of that [godot.GraphEdit] uses the port's index and not the slot's index. You can use [getInputPortSlot] and [getOutputPortSlot] to get the slot index from the port index.
 */
@GodotBaseType
public open class GraphNode : GraphElement() {
  /**
   * Emitted when any GraphNode's slot is updated.
   */
  public val slotUpdated: Signal1<Long> by signal("slotIndex")

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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GRAPHNODE, scriptIndex)
    return true
  }

  /**
   *
   */
  public open fun _drawPort(
    slotIndex: Int,
    position: Vector2i,
    left: Boolean,
    color: Color,
  ): Unit {
  }

  /**
   * Returns the [godot.HBoxContainer] used for the title bar, only containing a [godot.Label] for displaying the title by default. This can be used to add custom controls to the title bar such as option or close buttons.
   */
  public fun getTitlebarHbox(): HBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTitlebarHboxPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as HBoxContainer?)
  }

  /**
   * Sets properties of the slot with the given [slotIndex].
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
   * Disables the slot with the given [slotIndex]. This will remove the corresponding input and output port from the GraphNode.
   */
  public fun clearSlot(slotIndex: Int): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.clearSlotPtr, NIL)
  }

  /**
   * Disables all slots of the GraphNode. This will remove all input/output ports from the GraphNode.
   */
  public fun clearAllSlots(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearAllSlotsPtr, NIL)
  }

  /**
   * Returns `true` if left (input) side of the slot with the given [slotIndex] is enabled.
   */
  public fun isSlotEnabledLeft(slotIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isSlotEnabledLeftPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Toggles the left (input) side of the slot with the given [slotIndex]. If [enable] is `true`, a port will appear on the left side and the slot will be able to be connected from this side.
   */
  public fun setSlotEnabledLeft(slotIndex: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotEnabledLeftPtr, NIL)
  }

  /**
   * Sets the left (input) type of the slot with the given [slotIndex] to [type]. If the value is negative, all connections will be disallowed to be created via user inputs.
   */
  public fun setSlotTypeLeft(slotIndex: Int, type: Int): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), LONG to type.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotTypeLeftPtr, NIL)
  }

  /**
   * Returns the left (input) type of the slot with the given [slotIndex].
   */
  public fun getSlotTypeLeft(slotIndex: Int): Int {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSlotTypeLeftPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the [godot.core.Color] of the left (input) side of the slot with the given [slotIndex] to [color].
   */
  public fun setSlotColorLeft(slotIndex: Int, color: Color): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotColorLeftPtr, NIL)
  }

  /**
   * Returns the left (input) [godot.core.Color] of the slot with the given [slotIndex].
   */
  public fun getSlotColorLeft(slotIndex: Int): Color {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSlotColorLeftPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Returns `true` if right (output) side of the slot with the given [slotIndex] is enabled.
   */
  public fun isSlotEnabledRight(slotIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isSlotEnabledRightPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Toggles the right (output) side of the slot with the given [slotIndex]. If [enable] is `true`, a port will appear on the right side and the slot will be able to be connected from this side.
   */
  public fun setSlotEnabledRight(slotIndex: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotEnabledRightPtr, NIL)
  }

  /**
   * Sets the right (output) type of the slot with the given [slotIndex] to [type]. If the value is negative, all connections will be disallowed to be created via user inputs.
   */
  public fun setSlotTypeRight(slotIndex: Int, type: Int): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), LONG to type.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotTypeRightPtr, NIL)
  }

  /**
   * Returns the right (output) type of the slot with the given [slotIndex].
   */
  public fun getSlotTypeRight(slotIndex: Int): Int {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSlotTypeRightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the [godot.core.Color] of the right (output) side of the slot with the given [slotIndex] to [color].
   */
  public fun setSlotColorRight(slotIndex: Int, color: Color): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotColorRightPtr, NIL)
  }

  /**
   * Returns the right (output) [godot.core.Color] of the slot with the given [slotIndex].
   */
  public fun getSlotColorRight(slotIndex: Int): Color {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSlotColorRightPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Returns true if the background [godot.StyleBox] of the slot with the given [slotIndex] is drawn.
   */
  public fun isSlotDrawStylebox(slotIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isSlotDrawStyleboxPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Toggles the background [godot.StyleBox] of the slot with the given [slotIndex].
   */
  public fun setSlotDrawStylebox(slotIndex: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotDrawStyleboxPtr, NIL)
  }

  /**
   * Returns the number of slots with an enabled input port.
   */
  public fun getInputPortCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInputPortCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the position of the input port with the given [portIdx].
   */
  public fun getInputPortPosition(portIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to portIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInputPortPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the type of the input port with the given [portIdx].
   */
  public fun getInputPortType(portIdx: Int): Int {
    TransferContext.writeArguments(LONG to portIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInputPortTypePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [godot.core.Color] of the input port with the given [portIdx].
   */
  public fun getInputPortColor(portIdx: Int): Color {
    TransferContext.writeArguments(LONG to portIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInputPortColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Returns the corresponding slot index of the input port with the given [portIdx].
   */
  public fun getInputPortSlot(portIdx: Int): Int {
    TransferContext.writeArguments(LONG to portIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInputPortSlotPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of slots with an enabled output port.
   */
  public fun getOutputPortCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOutputPortCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the position of the output port with the given [portIdx].
   */
  public fun getOutputPortPosition(portIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to portIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOutputPortPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the type of the output port with the given [portIdx].
   */
  public fun getOutputPortType(portIdx: Int): Int {
    TransferContext.writeArguments(LONG to portIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOutputPortTypePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [godot.core.Color] of the output port with the given [portIdx].
   */
  public fun getOutputPortColor(portIdx: Int): Color {
    TransferContext.writeArguments(LONG to portIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOutputPortColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Returns the corresponding slot index of the output port with the given [portIdx].
   */
  public fun getOutputPortSlot(portIdx: Int): Int {
    TransferContext.writeArguments(LONG to portIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOutputPortSlotPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val _drawPortPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "_draw_port")

    public val setTitlePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "set_title")

    public val getTitlePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "get_title")

    public val getTitlebarHboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_titlebar_hbox")

    public val setSlotPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "set_slot")

    public val clearSlotPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphNode", "clear_slot")

    public val clearAllSlotsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "clear_all_slots")

    public val isSlotEnabledLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "is_slot_enabled_left")

    public val setSlotEnabledLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_enabled_left")

    public val setSlotTypeLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_type_left")

    public val getSlotTypeLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_slot_type_left")

    public val setSlotColorLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_color_left")

    public val getSlotColorLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_slot_color_left")

    public val isSlotEnabledRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "is_slot_enabled_right")

    public val setSlotEnabledRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_enabled_right")

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

    public val getInputPortCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_input_port_count")

    public val getInputPortPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_input_port_position")

    public val getInputPortTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_input_port_type")

    public val getInputPortColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_input_port_color")

    public val getInputPortSlotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_input_port_slot")

    public val getOutputPortCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_output_port_count")

    public val getOutputPortPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_output_port_position")

    public val getOutputPortTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_output_port_type")

    public val getOutputPortColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_output_port_color")

    public val getOutputPortSlotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_output_port_slot")
  }
}

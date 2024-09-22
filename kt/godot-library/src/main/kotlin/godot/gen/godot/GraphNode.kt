// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Signal1
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.core.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * [GraphNode] allows to create nodes for a [GraphEdit] graph with customizable content based on its
 * child controls. [GraphNode] is derived from [Container] and it is responsible for placing its
 * children on screen. This works similar to [VBoxContainer]. Children, in turn, provide [GraphNode]
 * with so-called slots, each of which can have a connection port on either side.
 * Each [GraphNode] slot is defined by its index and can provide the node with up to two ports: one
 * on the left, and one on the right. By convention the left port is also referred to as the **input
 * port** and the right port is referred to as the **output port**. Each port can be enabled and
 * configured individually, using different type and color. The type is an arbitrary value that you can
 * define using your own considerations. The parent [GraphEdit] will receive this information on each
 * connect and disconnect request.
 * Slots can be configured in the Inspector dock once you add at least one child [Control]. The
 * properties are grouped by each slot's index in the "Slot" section.
 * **Note:** While GraphNode is set up using slots and slot indices, connections are made between
 * the ports which are enabled. Because of that [GraphEdit] uses the port's index and not the slot's
 * index. You can use [getInputPortSlot] and [getOutputPortSlot] to get the slot index from the port
 * index.
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
  public final inline var title: String
    @JvmName("titleProperty")
    get() = getTitle()
    @JvmName("titleProperty")
    set(`value`) {
      setTitle(value)
    }

  /**
   * If `true`, you can connect ports with different types, even if the connection was not
   * explicitly allowed in the parent [GraphEdit].
   */
  public final inline var ignoreInvalidConnectionType: Boolean
    @JvmName("ignoreInvalidConnectionTypeProperty")
    get() = isIgnoringValidConnectionType()
    @JvmName("ignoreInvalidConnectionTypeProperty")
    set(`value`) {
      setIgnoreInvalidConnectionType(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GRAPHNODE, scriptIndex)
  }

  public open fun _drawPort(
    slotIndex: Int,
    position: Vector2i,
    left: Boolean,
    color: Color,
  ): Unit {
  }

  public final fun setTitle(title: String): Unit {
    TransferContext.writeArguments(STRING to title)
    TransferContext.callMethod(rawPtr, MethodBindings.setTitlePtr, NIL)
  }

  public final fun getTitle(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTitlePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the [HBoxContainer] used for the title bar, only containing a [Label] for displaying
   * the title by default. This can be used to add custom controls to the title bar such as option or
   * close buttons.
   */
  public final fun getTitlebarHbox(): HBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTitlebarHboxPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as HBoxContainer?)
  }

  /**
   * Sets properties of the slot with the given [slotIndex].
   * If [enableLeftPort]/[enableRightPort] is `true`, a port will appear and the slot will be able
   * to be connected from this side.
   * With [typeLeft]/[typeRight] an arbitrary type can be assigned to each port. Two ports can be
   * connected if they share the same type, or if the connection between their types is allowed in the
   * parent [GraphEdit] (see [GraphEdit.addValidConnectionType]). Keep in mind that the [GraphEdit] has
   * the final say in accepting the connection. Type compatibility simply allows the [signal
   * GraphEdit.connection_request] signal to be emitted.
   * Ports can be further customized using [colorLeft]/[colorRight] and
   * [customIconLeft]/[customIconRight]. The color parameter adds a tint to the icon. The custom icon
   * can be used to override the default port dot.
   * Additionally, [drawStylebox] can be used to enable or disable drawing of the background
   * stylebox for each slot. See [theme_item slot].
   * Individual properties can also be set using one of the `set_slot_*` methods.
   * **Note:** This method only sets properties of the slot. To create the slot itself, add a
   * [Control]-derived child to the GraphNode.
   */
  @JvmOverloads
  public final fun setSlot(
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
   * Disables the slot with the given [slotIndex]. This will remove the corresponding input and
   * output port from the GraphNode.
   */
  public final fun clearSlot(slotIndex: Int): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.clearSlotPtr, NIL)
  }

  /**
   * Disables all slots of the GraphNode. This will remove all input/output ports from the
   * GraphNode.
   */
  public final fun clearAllSlots(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearAllSlotsPtr, NIL)
  }

  /**
   * Returns `true` if left (input) side of the slot with the given [slotIndex] is enabled.
   */
  public final fun isSlotEnabledLeft(slotIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isSlotEnabledLeftPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Toggles the left (input) side of the slot with the given [slotIndex]. If [enable] is `true`, a
   * port will appear on the left side and the slot will be able to be connected from this side.
   */
  public final fun setSlotEnabledLeft(slotIndex: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotEnabledLeftPtr, NIL)
  }

  /**
   * Sets the left (input) type of the slot with the given [slotIndex] to [type]. If the value is
   * negative, all connections will be disallowed to be created via user inputs.
   */
  public final fun setSlotTypeLeft(slotIndex: Int, type: Int): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), LONG to type.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotTypeLeftPtr, NIL)
  }

  /**
   * Returns the left (input) type of the slot with the given [slotIndex].
   */
  public final fun getSlotTypeLeft(slotIndex: Int): Int {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSlotTypeLeftPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the [Color] of the left (input) side of the slot with the given [slotIndex] to [color].
   */
  public final fun setSlotColorLeft(slotIndex: Int, color: Color): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotColorLeftPtr, NIL)
  }

  /**
   * Returns the left (input) [Color] of the slot with the given [slotIndex].
   */
  public final fun getSlotColorLeft(slotIndex: Int): Color {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSlotColorLeftPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  /**
   * Sets the custom [Texture2D] of the left (input) side of the slot with the given [slotIndex] to
   * [customIcon].
   */
  public final fun setSlotCustomIconLeft(slotIndex: Int, customIcon: Texture2D?): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), OBJECT to customIcon)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotCustomIconLeftPtr, NIL)
  }

  /**
   * Returns the left (input) custom [Texture2D] of the slot with the given [slotIndex].
   */
  public final fun getSlotCustomIconLeft(slotIndex: Int): Texture2D? {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSlotCustomIconLeftPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Returns `true` if right (output) side of the slot with the given [slotIndex] is enabled.
   */
  public final fun isSlotEnabledRight(slotIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isSlotEnabledRightPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Toggles the right (output) side of the slot with the given [slotIndex]. If [enable] is `true`,
   * a port will appear on the right side and the slot will be able to be connected from this side.
   */
  public final fun setSlotEnabledRight(slotIndex: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotEnabledRightPtr, NIL)
  }

  /**
   * Sets the right (output) type of the slot with the given [slotIndex] to [type]. If the value is
   * negative, all connections will be disallowed to be created via user inputs.
   */
  public final fun setSlotTypeRight(slotIndex: Int, type: Int): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), LONG to type.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotTypeRightPtr, NIL)
  }

  /**
   * Returns the right (output) type of the slot with the given [slotIndex].
   */
  public final fun getSlotTypeRight(slotIndex: Int): Int {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSlotTypeRightPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the [Color] of the right (output) side of the slot with the given [slotIndex] to [color].
   */
  public final fun setSlotColorRight(slotIndex: Int, color: Color): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotColorRightPtr, NIL)
  }

  /**
   * Returns the right (output) [Color] of the slot with the given [slotIndex].
   */
  public final fun getSlotColorRight(slotIndex: Int): Color {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSlotColorRightPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  /**
   * Sets the custom [Texture2D] of the right (output) side of the slot with the given [slotIndex]
   * to [customIcon].
   */
  public final fun setSlotCustomIconRight(slotIndex: Int, customIcon: Texture2D?): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), OBJECT to customIcon)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotCustomIconRightPtr, NIL)
  }

  /**
   * Returns the right (output) custom [Texture2D] of the slot with the given [slotIndex].
   */
  public final fun getSlotCustomIconRight(slotIndex: Int): Texture2D? {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getSlotCustomIconRightPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Returns true if the background [StyleBox] of the slot with the given [slotIndex] is drawn.
   */
  public final fun isSlotDrawStylebox(slotIndex: Int): Boolean {
    TransferContext.writeArguments(LONG to slotIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isSlotDrawStyleboxPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Toggles the background [StyleBox] of the slot with the given [slotIndex].
   */
  public final fun setSlotDrawStylebox(slotIndex: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to slotIndex.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setSlotDrawStyleboxPtr, NIL)
  }

  public final fun setIgnoreInvalidConnectionType(ignore: Boolean): Unit {
    TransferContext.writeArguments(BOOL to ignore)
    TransferContext.callMethod(rawPtr, MethodBindings.setIgnoreInvalidConnectionTypePtr, NIL)
  }

  public final fun isIgnoringValidConnectionType(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isIgnoringValidConnectionTypePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the number of slots with an enabled input port.
   */
  public final fun getInputPortCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInputPortCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the position of the input port with the given [portIdx].
   */
  public final fun getInputPortPosition(portIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to portIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInputPortPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the type of the input port with the given [portIdx].
   */
  public final fun getInputPortType(portIdx: Int): Int {
    TransferContext.writeArguments(LONG to portIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInputPortTypePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the [Color] of the input port with the given [portIdx].
   */
  public final fun getInputPortColor(portIdx: Int): Color {
    TransferContext.writeArguments(LONG to portIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInputPortColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  /**
   * Returns the corresponding slot index of the input port with the given [portIdx].
   */
  public final fun getInputPortSlot(portIdx: Int): Int {
    TransferContext.writeArguments(LONG to portIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInputPortSlotPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of slots with an enabled output port.
   */
  public final fun getOutputPortCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOutputPortCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the position of the output port with the given [portIdx].
   */
  public final fun getOutputPortPosition(portIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to portIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOutputPortPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the type of the output port with the given [portIdx].
   */
  public final fun getOutputPortType(portIdx: Int): Int {
    TransferContext.writeArguments(LONG to portIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOutputPortTypePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the [Color] of the output port with the given [portIdx].
   */
  public final fun getOutputPortColor(portIdx: Int): Color {
    TransferContext.writeArguments(LONG to portIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOutputPortColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  /**
   * Returns the corresponding slot index of the output port with the given [portIdx].
   */
  public final fun getOutputPortSlot(portIdx: Int): Int {
    TransferContext.writeArguments(LONG to portIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getOutputPortSlotPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_title", 83702148)

    public val getTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_title", 201670096)

    public val getTitlebarHboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_titlebar_hbox", 3590609951)

    public val setSlotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot", 2873310869)

    public val clearSlotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "clear_slot", 1286410249)

    public val clearAllSlotsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "clear_all_slots", 3218959716)

    public val isSlotEnabledLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "is_slot_enabled_left", 1116898809)

    public val setSlotEnabledLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_enabled_left", 300928843)

    public val setSlotTypeLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_type_left", 3937882851)

    public val getSlotTypeLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_slot_type_left", 923996154)

    public val setSlotColorLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_color_left", 2878471219)

    public val getSlotColorLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_slot_color_left", 3457211756)

    public val setSlotCustomIconLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_custom_icon_left", 666127730)

    public val getSlotCustomIconLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_slot_custom_icon_left", 3536238170)

    public val isSlotEnabledRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "is_slot_enabled_right", 1116898809)

    public val setSlotEnabledRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_enabled_right", 300928843)

    public val setSlotTypeRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_type_right", 3937882851)

    public val getSlotTypeRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_slot_type_right", 923996154)

    public val setSlotColorRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_color_right", 2878471219)

    public val getSlotColorRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_slot_color_right", 3457211756)

    public val setSlotCustomIconRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_custom_icon_right", 666127730)

    public val getSlotCustomIconRightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_slot_custom_icon_right", 3536238170)

    public val isSlotDrawStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "is_slot_draw_stylebox", 1116898809)

    public val setSlotDrawStyleboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_slot_draw_stylebox", 300928843)

    public val setIgnoreInvalidConnectionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "set_ignore_invalid_connection_type", 2586408642)

    public val isIgnoringValidConnectionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "is_ignoring_valid_connection_type", 36873697)

    public val getInputPortCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_input_port_count", 2455072627)

    public val getInputPortPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_input_port_position", 3114997196)

    public val getInputPortTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_input_port_type", 3744713108)

    public val getInputPortColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_input_port_color", 2624840992)

    public val getInputPortSlotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_input_port_slot", 3744713108)

    public val getOutputPortCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_output_port_count", 2455072627)

    public val getOutputPortPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_output_port_position", 3114997196)

    public val getOutputPortTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_output_port_type", 3744713108)

    public val getOutputPortColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_output_port_color", 2624840992)

    public val getOutputPortSlotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphNode", "get_output_port_slot", 3744713108)
  }
}

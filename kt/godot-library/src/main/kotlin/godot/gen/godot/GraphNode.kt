// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
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
 * In the Inspector you can enable (show) or disable (hide) slots. By default, all slots are disabled so you may not see any slots on your GraphNode initially. You can assign a type to each slot. Only slots of the same type will be able to connect to each other. You can also assign colors to slots. A tuple of input and output slots is defined for each GUI element included in the GraphNode. Input connections are on the left and output connections are on the right side of GraphNode. Only enabled slots are counted as connections.
 */
@GodotBaseType
public open class GraphNode : Container() {
  /**
   * Emitted when the GraphNode is requested to be displayed over other ones. Happens on focusing (clicking into) the GraphNode.
   */
  public val raiseRequest: Signal0 by signal()

  /**
   * Emitted when the GraphNode is moved.
   */
  public val positionOffsetChanged: Signal0 by signal()

  /**
   * Emitted when the GraphNode is requested to be closed. Happens on clicking the close button (see [showClose]).
   */
  public val closeRequest: Signal0 by signal()

  /**
   * Emitted when the GraphNode is dragged.
   */
  public val dragged: Signal2<Vector2, Vector2> by signal("from", "to")

  /**
   * Emitted when any GraphNode's slot is updated.
   */
  public val slotUpdated: Signal1<Long> by signal("idx")

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
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_TITLE, STRING.ordinal)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_TITLE, NIL.ordinal)
    }

  /**
   * Base text writing direction.
   */
  public var textDirection: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_TEXT_DIRECTION,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_TEXT_DIRECTION,
          NIL.ordinal)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_LANGUAGE, STRING.ordinal)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_LANGUAGE, NIL.ordinal)
    }

  /**
   * The offset of the GraphNode, relative to the scroll offset of the [godot.GraphEdit].
   *
   * **Note:** You cannot use position offset directly, as [godot.GraphEdit] is a [godot.Container].
   */
  public var positionOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_POSITION_OFFSET,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_POSITION_OFFSET,
          NIL.ordinal)
    }

  /**
   * If `true`, the close button will be visible.
   *
   * **Note:** Pressing it will only emit the [closeRequest] signal, the GraphNode needs to be removed manually.
   */
  public var showClose: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_IS_CLOSE_BUTTON_VISIBLE,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SHOW_CLOSE_BUTTON,
          NIL.ordinal)
    }

  /**
   * If `true`, the user can resize the GraphNode.
   *
   * **Note:** Dragging the handle will only emit the [resizeRequest] signal, the GraphNode needs to be resized manually.
   */
  public var resizable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_IS_RESIZABLE, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_RESIZABLE, NIL.ordinal)
    }

  /**
   * If `true`, the GraphNode is selected.
   */
  public var selected: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_IS_SELECTED, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SELECTED, NIL.ordinal)
    }

  /**
   * If `true`, the GraphNode is a comment node.
   */
  public var comment: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_IS_COMMENT, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_COMMENT, NIL.ordinal)
    }

  /**
   * Sets the overlay shown above the GraphNode. See [enum Overlay].
   */
  public var overlay: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_OVERLAY, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_OVERLAY, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GRAPHNODE)
  }

  public fun setOpentypeFeature(tag: String, `value`: Long): Unit {
    TransferContext.writeArguments(STRING to tag, LONG to value)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_OPENTYPE_FEATURE,
        NIL.ordinal)
  }

  public fun getOpentypeFeature(tag: String): Long {
    TransferContext.writeArguments(STRING to tag)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_OPENTYPE_FEATURE,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun clearOpentypeFeatures(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_CLEAR_OPENTYPE_FEATURES,
        NIL.ordinal)
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
   *
   * Individual properties can be set using one of the `set_slot_*` methods. You must enable at least one side of the slot to do so.
   */
  public fun setSlot(
    idx: Long,
    enableLeft: Boolean,
    typeLeft: Long,
    colorLeft: Color,
    enableRight: Boolean,
    typeRight: Long,
    colorRight: Color,
    customLeft: Texture2D? = null,
    customRight: Texture2D? = null
  ): Unit {
    TransferContext.writeArguments(LONG to idx, BOOL to enableLeft, LONG to typeLeft, COLOR to colorLeft, BOOL to enableRight, LONG to typeRight, COLOR to colorRight, OBJECT to customLeft, OBJECT to customRight)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SLOT, NIL.ordinal)
  }

  /**
   * Disables input and output slot whose index is `idx`.
   */
  public fun clearSlot(idx: Long): Unit {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_CLEAR_SLOT, NIL.ordinal)
  }

  /**
   * Disables all input and output slots of the GraphNode.
   */
  public fun clearAllSlots(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_CLEAR_ALL_SLOTS, NIL.ordinal)
  }

  /**
   * Returns `true` if left (input) side of the slot `idx` is enabled.
   */
  public fun isSlotEnabledLeft(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_IS_SLOT_ENABLED_LEFT,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Toggles the left (input) side of the slot `idx`. If `enable_left` is `true`, a port will appear on the left side and the slot will be able to be connected from this side.
   */
  public fun setSlotEnabledLeft(idx: Long, enableLeft: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx, BOOL to enableLeft)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SLOT_ENABLED_LEFT,
        NIL.ordinal)
  }

  /**
   * Sets the left (input) type of the slot `idx` to `type_left`.
   */
  public fun setSlotTypeLeft(idx: Long, typeLeft: Long): Unit {
    TransferContext.writeArguments(LONG to idx, LONG to typeLeft)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SLOT_TYPE_LEFT,
        NIL.ordinal)
  }

  /**
   * Returns the left (input) type of the slot `idx`.
   */
  public fun getSlotTypeLeft(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_SLOT_TYPE_LEFT,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the [godot.core.Color] of the left (input) side of the slot `idx` to `color_left`.
   */
  public fun setSlotColorLeft(idx: Long, colorLeft: Color): Unit {
    TransferContext.writeArguments(LONG to idx, COLOR to colorLeft)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SLOT_COLOR_LEFT,
        NIL.ordinal)
  }

  /**
   * Returns the left (input) [godot.core.Color] of the slot `idx`.
   */
  public fun getSlotColorLeft(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_SLOT_COLOR_LEFT,
        COLOR.ordinal)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns `true` if right (output) side of the slot `idx` is enabled.
   */
  public fun isSlotEnabledRight(idx: Long): Boolean {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_IS_SLOT_ENABLED_RIGHT,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Toggles the right (output) side of the slot `idx`. If `enable_right` is `true`, a port will appear on the right side and the slot will be able to be connected from this side.
   */
  public fun setSlotEnabledRight(idx: Long, enableRight: Boolean): Unit {
    TransferContext.writeArguments(LONG to idx, BOOL to enableRight)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SLOT_ENABLED_RIGHT,
        NIL.ordinal)
  }

  /**
   * Sets the right (output) type of the slot `idx` to `type_right`.
   */
  public fun setSlotTypeRight(idx: Long, typeRight: Long): Unit {
    TransferContext.writeArguments(LONG to idx, LONG to typeRight)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SLOT_TYPE_RIGHT,
        NIL.ordinal)
  }

  /**
   * Returns the right (output) type of the slot `idx`.
   */
  public fun getSlotTypeRight(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_SLOT_TYPE_RIGHT,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the [godot.core.Color] of the right (output) side of the slot `idx` to `color_right`.
   */
  public fun setSlotColorRight(idx: Long, colorRight: Color): Unit {
    TransferContext.writeArguments(LONG to idx, COLOR to colorRight)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_SET_SLOT_COLOR_RIGHT,
        NIL.ordinal)
  }

  /**
   * Returns the right (output) [godot.core.Color] of the slot `idx`.
   */
  public fun getSlotColorRight(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_SLOT_COLOR_RIGHT,
        COLOR.ordinal)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the number of enabled output slots (connections) of the GraphNode.
   */
  public fun getConnectionOutputCount(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_OUTPUT_COUNT,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of enabled input slots (connections) to the GraphNode.
   */
  public fun getConnectionInputCount(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_INPUT_COUNT,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the position of the output connection `idx`.
   */
  public fun getConnectionOutputPosition(idx: Long): Vector2 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_OUTPUT_POSITION,
        VECTOR2.ordinal)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the type of the output connection `idx`.
   */
  public fun getConnectionOutputType(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_OUTPUT_TYPE,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [godot.core.Color] of the output connection `idx`.
   */
  public fun getConnectionOutputColor(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_OUTPUT_COLOR,
        COLOR.ordinal)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the position of the input connection `idx`.
   */
  public fun getConnectionInputPosition(idx: Long): Vector2 {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_INPUT_POSITION,
        VECTOR2.ordinal)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the type of the input connection `idx`.
   */
  public fun getConnectionInputType(idx: Long): Long {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_INPUT_TYPE,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [godot.core.Color] of the input connection `idx`.
   */
  public fun getConnectionInputColor(idx: Long): Color {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHNODE_GET_CONNECTION_INPUT_COLOR,
        COLOR.ordinal)
    return TransferContext.readReturnValue(COLOR, false) as Color
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

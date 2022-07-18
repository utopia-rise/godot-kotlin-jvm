// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedVector2Array
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal3
import godot.signals.Signal4
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * GraphEdit is an area capable of showing various GraphNodes. It manages connection events between them.
 *
 * GraphEdit manages the showing of GraphNodes it contains, as well as connections and disconnections between them. Signals are sent for each of these two events. Disconnection between GraphNode slots is disabled by default.
 *
 * It is greatly advised to enable low-processor usage mode (see [godot.OS.lowProcessorUsageMode]) when using GraphEdits.
 */
@GodotBaseType
public open class GraphEdit : Control() {
  /**
   * Emitted at the beginning of a connection drag.
   */
  public val connectionDragStarted: Signal3<String, String, Boolean> by signal("from", "slot",
      "isOutput")

  /**
   * Emitted when a GraphNode is attempted to be removed from the GraphEdit. Provides a list of node names to be removed (all selected nodes, excluding nodes without closing button).
   */
  public val deleteNodesRequest: Signal0 by signal()

  /**
   * Emitted when the user presses [kbd]Ctrl + C[/kbd].
   */
  public val copyNodesRequest: Signal0 by signal()

  /**
   * Emitted when a GraphNode is attempted to be duplicated in the GraphEdit.
   */
  public val duplicateNodesRequest: Signal0 by signal()

  /**
   * Emitted at the end of a connection drag.
   */
  public val connectionDragEnded: Signal0 by signal()

  /**
   * Emitted when a popup is requested. Happens on right-clicking in the GraphEdit. `position` is the position of the mouse pointer when the signal is sent.
   */
  public val popupRequest: Signal1<Vector2> by signal("position")

  /**
   * Emitted when the user presses [kbd]Ctrl + V[/kbd].
   */
  public val pasteNodesRequest: Signal0 by signal()

  /**
   * Emitted when the scroll offset is changed by the user. It will not be emitted when changed in code.
   */
  public val scrollOffsetChanged: Signal1<Vector2> by signal("ofs")

  /**
   * Emitted when a GraphNode is selected.
   */
  public val nodeSelected: Signal1<Node> by signal("node")

  /**
   *
   */
  public val nodeDeselected: Signal1<Node> by signal("node")

  /**
   * Emitted at the beginning of a GraphNode movement.
   */
  public val beginNodeMove: Signal0 by signal()

  /**
   * Emitted when user dragging connection from output port into empty space of the graph.
   */
  public val connectionToEmpty: Signal3<StringName, Long, Vector2> by signal("from", "fromSlot",
      "releasePosition")

  /**
   * Emitted to the GraphEdit when the connection between `from_slot` slot of `from` GraphNode and `to_slot` slot of `to` GraphNode is attempted to be removed.
   */
  public val disconnectionRequest: Signal4<StringName, Long, StringName, Long> by signal("from",
      "fromSlot", "to", "toSlot")

  /**
   * Emitted to the GraphEdit when the connection between the `from_slot` slot of the `from` GraphNode and the `to_slot` slot of the `to` GraphNode is attempted to be created.
   */
  public val connectionRequest: Signal4<StringName, Long, StringName, Long> by signal("from",
      "fromSlot", "to", "toSlot")

  /**
   * Emitted when user dragging connection from input port into empty space of the graph.
   */
  public val connectionFromEmpty: Signal3<StringName, Long, Vector2> by signal("to", "toSlot",
      "releasePosition")

  /**
   * Emitted at the end of a GraphNode movement.
   */
  public val endNodeMove: Signal0 by signal()

  /**
   * If `true`, enables disconnection of existing connections in the GraphEdit by dragging the right end.
   */
  public var rightDisconnects: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_IS_RIGHT_DISCONNECTS_ENABLED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_RIGHT_DISCONNECTS,
          NIL.ordinal)
    }

  /**
   * The scroll offset.
   */
  public var scrollOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_SCROLL_OFS,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_SCROLL_OFS, NIL.ordinal)
    }

  /**
   * The snapping distance in pixels.
   */
  public var snapDistance: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_SNAP, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_SNAP, NIL.ordinal)
    }

  /**
   * If `true`, enables snapping.
   */
  public var useSnap: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_IS_USING_SNAP, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_USE_SNAP, NIL.ordinal)
    }

  /**
   * Defines the control scheme for panning with mouse wheel.
   */
  public var panningScheme: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_PANNING_SCHEME,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_PANNING_SCHEME,
          NIL.ordinal)
    }

  /**
   * The thickness of the lines between the nodes.
   */
  public var connectionLinesThickness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_CONNECTION_LINES_THICKNESS, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_CONNECTION_LINES_THICKNESS, NIL.ordinal)
    }

  /**
   * If `true`, the lines between nodes will use antialiasing.
   */
  public var connectionLinesAntialiased: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_IS_CONNECTION_LINES_ANTIALIASED, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_CONNECTION_LINES_ANTIALIASED, NIL.ordinal)
    }

  /**
   * The current zoom value.
   */
  public var zoom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_ZOOM, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_ZOOM, NIL.ordinal)
    }

  /**
   * The lower zoom limit.
   */
  public var zoomMin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_ZOOM_MIN, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_ZOOM_MIN, NIL.ordinal)
    }

  /**
   * The upper zoom limit.
   */
  public var zoomMax: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_ZOOM_MAX, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_ZOOM_MAX, NIL.ordinal)
    }

  /**
   * The step of each zoom level.
   */
  public var zoomStep: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_ZOOM_STEP,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_ZOOM_STEP, NIL.ordinal)
    }

  /**
   * If `true`, makes a label with the current zoom level visible. The zoom value is displayed in percents.
   */
  public var showZoomLabel: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_IS_SHOWING_ZOOM_LABEL,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_SHOW_ZOOM_LABEL,
          NIL.ordinal)
    }

  /**
   * If `true`, the minimap is visible.
   */
  public var minimapEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_IS_MINIMAP_ENABLED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_MINIMAP_ENABLED,
          NIL.ordinal)
    }

  /**
   * The size of the minimap rectangle. The map itself is based on the size of the grid area and is scaled to fit this rectangle.
   */
  public var minimapSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_MINIMAP_SIZE,
          VECTOR2.ordinal)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_MINIMAP_SIZE,
          NIL.ordinal)
    }

  /**
   * The opacity of the minimap rectangle.
   */
  public var minimapOpacity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_MINIMAP_OPACITY,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_MINIMAP_OPACITY,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GRAPHEDIT)
  }

  /**
   * Returns whether the `mouse_position` is in the input hot zone.
   *
   * By default, a hot zone is a [godot.core.Rect2] positioned such that its center is at `graph_node`.[godot.GraphNode.getConnectionInputPosition](`slot_index`) (For output's case, call [godot.GraphNode.getConnectionOutputPosition] instead). The hot zone's width is twice the Theme Property `port_grab_distance_horizontal`, and its height is twice the `port_grab_distance_vertical`.
   *
   * Below is a sample code to help get started:
   *
   * ```
   * 				func _is_in_input_hotzone(graph_node, slot_index, mouse_position):
   * 				    var slot_size : Vector2 = Vector2(get_theme_constant("port_grab_distance_horizontal"), get_theme_constant("port_grab_distance_vertical"))
   * 				    var slot_pos : Vector2 = graph_node.get_position() + graph_node.get_connection_input_position(slot_index) - slot_size / 2
   * 				    var rect = Rect2(slot_pos, slot_size)
   *
   * 				    return rect.has_point(mouse_position)
   * 				```
   */
  public open fun _isInInputHotzone(
    graphNode: Object,
    slotIndex: Long,
    mousePosition: Vector2
  ): Boolean {
    throw NotImplementedError("_is_in_input_hotzone is not implemented for GraphEdit")
  }

  /**
   * Returns whether the `mouse_position` is in the output hot zone. For more information on hot zones, see [_isInInputHotzone].
   *
   * Below is a sample code to help get started:
   *
   * ```
   * 				func _is_in_output_hotzone(graph_node, slot_index, mouse_position):
   * 				    var slot_size : Vector2 = Vector2(get_theme_constant("port_grab_distance_horizontal"), get_theme_constant("port_grab_distance_vertical"))
   * 				    var slot_pos : Vector2 = graph_node.get_position() + graph_node.get_connection_output_position(slot_index) - slot_size / 2
   * 				    var rect = Rect2(slot_pos, slot_size)
   *
   * 				    return rect.has_point(mouse_position)
   * 				```
   */
  public open fun _isInOutputHotzone(
    graphNode: Object,
    slotIndex: Long,
    mousePosition: Vector2
  ): Boolean {
    throw NotImplementedError("_is_in_output_hotzone is not implemented for GraphEdit")
  }

  /**
   * Virtual method which can be overridden to customize how connections are drawn.
   */
  public open fun _getConnectionLine(from: Vector2, to: Vector2): PackedVector2Array {
    throw NotImplementedError("_get_connection_line is not implemented for GraphEdit")
  }

  /**
   * Create a connection between the `from_port` slot of the `from` GraphNode and the `to_port` slot of the `to` GraphNode. If the connection already exists, no connection is created.
   */
  public fun connectNode(
    from: StringName,
    fromPort: Long,
    to: StringName,
    toPort: Long
  ): GodotError {
    TransferContext.writeArguments(STRING_NAME to from, LONG to fromPort, STRING_NAME to to, LONG to toPort)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_CONNECT_NODE, LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns `true` if the `from_port` slot of the `from` GraphNode is connected to the `to_port` slot of the `to` GraphNode.
   */
  public fun isNodeConnected(
    from: StringName,
    fromPort: Long,
    to: StringName,
    toPort: Long
  ): Boolean {
    TransferContext.writeArguments(STRING_NAME to from, LONG to fromPort, STRING_NAME to to, LONG to toPort)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_IS_NODE_CONNECTED,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes the connection between the `from_port` slot of the `from` GraphNode and the `to_port` slot of the `to` GraphNode. If the connection does not exist, no connection is removed.
   */
  public fun disconnectNode(
    from: StringName,
    fromPort: Long,
    to: StringName,
    toPort: Long
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to from, LONG to fromPort, STRING_NAME to to, LONG to toPort)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_DISCONNECT_NODE, NIL.ordinal)
  }

  /**
   * Sets the coloration of the connection between `from`'s `from_port` and `to`'s `to_port` with the color provided in the [theme_item activity] theme property.
   */
  public fun setConnectionActivity(
    from: StringName,
    fromPort: Long,
    to: StringName,
    toPort: Long,
    amount: Double
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to from, LONG to fromPort, STRING_NAME to to, LONG to toPort, DOUBLE to amount)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_CONNECTION_ACTIVITY,
        NIL.ordinal)
  }

  /**
   * Returns an Array containing the list of connections. A connection consists in a structure of the form `{ from_port: 0, from: "GraphNode name 0", to_port: 1, to: "GraphNode name 1" }`.
   */
  public fun getConnectionList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_CONNECTION_LIST,
        ARRAY.ordinal)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Removes all connections between nodes.
   */
  public fun clearConnections(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_CLEAR_CONNECTIONS, NIL.ordinal)
  }

  /**
   * Ends the creation of the current connection. In other words, if you are dragging a connection you can use this method to abort the process and remove the line that followed your cursor.
   *
   * This is best used together with [connectionDragStarted] and [connectionDragEnded] to add custom behavior like node addition through shortcuts.
   *
   * **Note:** This method suppresses any other connection request signals apart from [connectionDragEnded].
   */
  public fun forceConnectionDragEnd(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_FORCE_CONNECTION_DRAG_END,
        NIL.ordinal)
  }

  /**
   * Makes possible to disconnect nodes when dragging from the slot at the right if it has the specified type.
   */
  public fun addValidRightDisconnectType(type: Long): Unit {
    TransferContext.writeArguments(LONG to type)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_ADD_VALID_RIGHT_DISCONNECT_TYPE, NIL.ordinal)
  }

  /**
   * Removes the possibility to disconnect nodes when dragging from the slot at the right if it has the specified type.
   */
  public fun removeValidRightDisconnectType(type: Long): Unit {
    TransferContext.writeArguments(LONG to type)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_REMOVE_VALID_RIGHT_DISCONNECT_TYPE, NIL.ordinal)
  }

  /**
   * Makes possible to disconnect nodes when dragging from the slot at the left if it has the specified type.
   */
  public fun addValidLeftDisconnectType(type: Long): Unit {
    TransferContext.writeArguments(LONG to type)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_ADD_VALID_LEFT_DISCONNECT_TYPE,
        NIL.ordinal)
  }

  /**
   * Removes the possibility to disconnect nodes when dragging from the slot at the left if it has the specified type.
   */
  public fun removeValidLeftDisconnectType(type: Long): Unit {
    TransferContext.writeArguments(LONG to type)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_REMOVE_VALID_LEFT_DISCONNECT_TYPE, NIL.ordinal)
  }

  /**
   * Makes possible the connection between two different slot types. The type is defined with the [godot.GraphNode.setSlot] method.
   */
  public fun addValidConnectionType(fromType: Long, toType: Long): Unit {
    TransferContext.writeArguments(LONG to fromType, LONG to toType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_ADD_VALID_CONNECTION_TYPE,
        NIL.ordinal)
  }

  /**
   * Makes it not possible to connect between two different slot types. The type is defined with the [godot.GraphNode.setSlot] method.
   */
  public fun removeValidConnectionType(fromType: Long, toType: Long): Unit {
    TransferContext.writeArguments(LONG to fromType, LONG to toType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_REMOVE_VALID_CONNECTION_TYPE,
        NIL.ordinal)
  }

  /**
   * Returns whether it's possible to connect slots of the specified types.
   */
  public fun isValidConnectionType(fromType: Long, toType: Long): Boolean {
    TransferContext.writeArguments(LONG to fromType, LONG to toType)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_IS_VALID_CONNECTION_TYPE,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the points which would make up a connection between `from` and `to`.
   */
  public fun getConnectionLine(from: Vector2, to: Vector2): PackedVector2Array {
    TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_CONNECTION_LINE,
        PACKED_VECTOR2_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
  }

  /**
   * Gets the [godot.HBoxContainer] that contains the zooming and grid snap controls in the top left of the graph. You can use this method to reposition the toolbar or to add your own custom controls to it.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public fun getZoomHbox(): HBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_ZOOM_HBOX, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as HBoxContainer?
  }

  /**
   * Rearranges selected nodes in a layout with minimum crossings between connections and uniform horizontal and vertical gap between nodes.
   */
  public fun arrangeNodes(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_ARRANGE_NODES, NIL.ordinal)
  }

  /**
   * Sets the specified `node` as the one selected.
   */
  public fun setSelected(node: Node): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_SELECTED, NIL.ordinal)
  }

  public enum class PanningScheme(
    id: Long
  ) {
    /**
     * [kbd]Mouse Wheel[/kbd] will zoom, [kbd]Ctrl + Mouse Wheel[/kbd] will move the view.
     */
    SCROLL_ZOOMS(0),
    /**
     * [kbd]Mouse Wheel[/kbd] will move the view, [kbd]Ctrl + Mouse Wheel[/kbd] will zoom.
     */
    SCROLL_PANS(1),
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

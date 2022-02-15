// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

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
   * Emitted when a GraphNode is attempted to be removed from the GraphEdit.
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
  public open var rightDisconnects: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_RIGHT_DISCONNECTS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_RIGHT_DISCONNECTS,
          NIL)
    }

  /**
   * The scroll offset.
   */
  public open var scrollOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_SCROLL_OFFSET,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_SCROLL_OFFSET, NIL)
    }

  /**
   * The snapping distance in pixels.
   */
  public open var snapDistance: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_SNAP_DISTANCE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_SNAP_DISTANCE, NIL)
    }

  /**
   * If `true`, enables snapping.
   */
  public open var useSnap: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_USE_SNAP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_USE_SNAP, NIL)
    }

  /**
   * Defines the control scheme for panning with mouse wheel.
   */
  public open var panningScheme: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_PANNING_SCHEME,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_PANNING_SCHEME, NIL)
    }

  /**
   * The thickness of the lines between the nodes.
   */
  public open var connectionLinesThickness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_CONNECTION_LINES_THICKNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_CONNECTION_LINES_THICKNESS, NIL)
    }

  /**
   * If `true`, the lines between nodes will use antialiasing.
   */
  public open var connectionLinesAntialiased: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_CONNECTION_LINES_ANTIALIASED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_CONNECTION_LINES_ANTIALIASED, NIL)
    }

  /**
   * The current zoom value.
   */
  public open var zoom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_ZOOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_ZOOM, NIL)
    }

  /**
   * The lower zoom limit.
   */
  public open var zoomMin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_ZOOM_MIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_ZOOM_MIN, NIL)
    }

  /**
   * The upper zoom limit.
   */
  public open var zoomMax: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_ZOOM_MAX, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_ZOOM_MAX, NIL)
    }

  /**
   * The step of each zoom level.
   */
  public open var zoomStep: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_ZOOM_STEP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_ZOOM_STEP, NIL)
    }

  /**
   * If `true`, makes a label with the current zoom level visible. The zoom value is displayed in percents.
   */
  public open var showZoomLabel: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_SHOW_ZOOM_LABEL,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_SHOW_ZOOM_LABEL,
          NIL)
    }

  /**
   * If `true`, the minimap is visible.
   */
  public open var minimapEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_MINIMAP_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_MINIMAP_ENABLED,
          NIL)
    }

  /**
   * The size of the minimap rectangle. The map itself is based on the size of the grid area and is scaled to fit this rectangle.
   */
  public open var minimapSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_MINIMAP_SIZE,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_MINIMAP_SIZE, NIL)
    }

  /**
   * The opacity of the minimap rectangle.
   */
  public open var minimapOpacity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_MINIMAP_OPACITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_MINIMAP_OPACITY,
          NIL)
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
  public open fun connectNode(
    from: StringName,
    fromPort: Long,
    to: StringName,
    toPort: Long
  ): GodotError {
    TransferContext.writeArguments(STRING_NAME to from, LONG to fromPort, STRING_NAME to to, LONG to
        toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_CONNECT_NODE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns `true` if the `from_port` slot of the `from` GraphNode is connected to the `to_port` slot of the `to` GraphNode.
   */
  public open fun isNodeConnected(
    from: StringName,
    fromPort: Long,
    to: StringName,
    toPort: Long
  ): Boolean {
    TransferContext.writeArguments(STRING_NAME to from, LONG to fromPort, STRING_NAME to to, LONG to
        toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_IS_NODE_CONNECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes the connection between the `from_port` slot of the `from` GraphNode and the `to_port` slot of the `to` GraphNode. If the connection does not exist, no connection is removed.
   */
  public open fun disconnectNode(
    from: StringName,
    fromPort: Long,
    to: StringName,
    toPort: Long
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to from, LONG to fromPort, STRING_NAME to to, LONG to
        toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_DISCONNECT_NODE, NIL)
  }

  /**
   * Sets the coloration of the connection between `from`'s `from_port` and `to`'s `to_port` with the color provided in the [theme_item activity] theme property.
   */
  public open fun setConnectionActivity(
    from: StringName,
    fromPort: Long,
    to: StringName,
    toPort: Long,
    amount: Double
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to from, LONG to fromPort, STRING_NAME to to, LONG to
        toPort, DOUBLE to amount)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_CONNECTION_ACTIVITY,
        NIL)
  }

  /**
   * Returns an Array containing the list of connections. A connection consists in a structure of the form `{ from_port: 0, from: "GraphNode name 0", to_port: 1, to: "GraphNode name 1" }`.
   */
  public open fun getConnectionList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_CONNECTION_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Removes all connections between nodes.
   */
  public open fun clearConnections(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_CLEAR_CONNECTIONS, NIL)
  }

  /**
   * Ends the creation of the current connection. In other words, if you are dragging a connection you can use this method to abort the process and remove the line that followed your cursor.
   *
   * This is best used together with [connectionDragStarted] and [connectionDragEnded] to add custom behavior like node addition through shortcuts.
   *
   * **Note:** This method suppresses any other connection request signals apart from [connectionDragEnded].
   */
  public open fun forceConnectionDragEnd(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_FORCE_CONNECTION_DRAG_END,
        NIL)
  }

  /**
   * Makes possible to disconnect nodes when dragging from the slot at the right if it has the specified type.
   */
  public open fun addValidRightDisconnectType(type: Long): Unit {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_ADD_VALID_RIGHT_DISCONNECT_TYPE, NIL)
  }

  /**
   * Removes the possibility to disconnect nodes when dragging from the slot at the right if it has the specified type.
   */
  public open fun removeValidRightDisconnectType(type: Long): Unit {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_REMOVE_VALID_RIGHT_DISCONNECT_TYPE, NIL)
  }

  /**
   * Makes possible to disconnect nodes when dragging from the slot at the left if it has the specified type.
   */
  public open fun addValidLeftDisconnectType(type: Long): Unit {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_ADD_VALID_LEFT_DISCONNECT_TYPE, NIL)
  }

  /**
   * Removes the possibility to disconnect nodes when dragging from the slot at the left if it has the specified type.
   */
  public open fun removeValidLeftDisconnectType(type: Long): Unit {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_REMOVE_VALID_LEFT_DISCONNECT_TYPE, NIL)
  }

  /**
   * Makes possible the connection between two different slot types. The type is defined with the [godot.GraphNode.setSlot] method.
   */
  public open fun addValidConnectionType(fromType: Long, toType: Long): Unit {
    TransferContext.writeArguments(LONG to fromType, LONG to toType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_ADD_VALID_CONNECTION_TYPE,
        NIL)
  }

  /**
   * Makes it not possible to connect between two different slot types. The type is defined with the [godot.GraphNode.setSlot] method.
   */
  public open fun removeValidConnectionType(fromType: Long, toType: Long): Unit {
    TransferContext.writeArguments(LONG to fromType, LONG to toType)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_REMOVE_VALID_CONNECTION_TYPE, NIL)
  }

  /**
   * Returns whether it's possible to connect slots of the specified types.
   */
  public open fun isValidConnectionType(fromType: Long, toType: Long): Boolean {
    TransferContext.writeArguments(LONG to fromType, LONG to toType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_IS_VALID_CONNECTION_TYPE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the points which would make up a connection between `from` and `to`.
   */
  public open fun getConnectionLine(from: Vector2, to: Vector2): PackedVector2Array {
    TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_CONNECTION_LINE,
        PACKED_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
  }

  /**
   * Gets the [godot.HBoxContainer] that contains the zooming and grid snap controls in the top left of the graph. You can use this method to reposition the toolbar or to add your own custom controls to it.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public open fun getZoomHbox(): HBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_ZOOM_HBOX, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as HBoxContainer?
  }

  /**
   * Rearranges selected nodes in a layout with minimum crossings between connections and uniform horizontal and vertical gap between nodes.
   */
  public open fun arrangeNodes(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_ARRANGE_NODES, NIL)
  }

  /**
   * Sets the specified `node` as the one selected.
   */
  public open fun setSelected(node: Node): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_SELECTED, NIL)
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

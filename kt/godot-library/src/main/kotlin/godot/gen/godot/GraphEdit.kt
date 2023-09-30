// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedVector2Array
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal3
import godot.signals.Signal4
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * An editor for graph-like structures, using [godot.GraphNode]s.
 *
 * [godot.GraphEdit] provides tools for creation, manipulation, and display of various graphs. Its main purpose in the engine is to power the visual programming systems, such as visual shaders, but it is also available for use in user projects.
 *
 * [godot.GraphEdit] by itself is only an empty container, representing an infinite grid where [godot.GraphNode]s can be placed. Each [godot.GraphNode] represents a node in the graph, a single unit of data in the connected scheme. [godot.GraphEdit], in turn, helps to control various interactions with nodes and between nodes. When the user attempts to connect, disconnect, or close a [godot.GraphNode], a signal is emitted in the [godot.GraphEdit], but no action is taken by default. It is the responsibility of the programmer utilizing this control to implement the necessary logic to determine how each request should be handled.
 *
 * **Performance:** It is greatly advised to enable low-processor usage mode (see [godot.OS.lowProcessorUsageMode]) when using GraphEdits.
 */
@GodotBaseType
public open class GraphEdit : Control() {
  /**
   * Emitted to the GraphEdit when the connection between the [fromPort] of the [fromNode] [godot.GraphNode] and the [toPort] of the [toNode] [godot.GraphNode] is attempted to be created.
   */
  public val connectionRequest: Signal4<StringName, Long, StringName, Long> by signal("fromNode",
      "fromPort", "toNode", "toPort")

  /**
   * Emitted to the GraphEdit when the connection between [fromPort] of [fromNode] [godot.GraphNode] and [toPort] of [toNode] [godot.GraphNode] is attempted to be removed.
   */
  public val disconnectionRequest: Signal4<StringName, Long, StringName, Long> by signal("fromNode",
      "fromPort", "toNode", "toPort")

  /**
   * Emitted when a popup is requested. Happens on right-clicking in the GraphEdit. [position] is the position of the mouse pointer when the signal is sent.
   */
  public val popupRequest: Signal1<Vector2> by signal("position")

  /**
   * Emitted when a GraphNode is attempted to be duplicated in the GraphEdit.
   */
  public val duplicateNodesRequest: Signal0 by signal()

  /**
   * Emitted when the user presses [kbd]Ctrl + C[/kbd].
   */
  public val copyNodesRequest: Signal0 by signal()

  /**
   * Emitted when the user presses [kbd]Ctrl + V[/kbd].
   */
  public val pasteNodesRequest: Signal0 by signal()

  /**
   * Emitted when a GraphNode is selected.
   */
  public val nodeSelected: Signal1<Node> by signal("node")

  /**
   *
   */
  public val nodeDeselected: Signal1<Node> by signal("node")

  /**
   * Emitted when user drags a connection from an output port into the empty space of the graph.
   */
  public val connectionToEmpty: Signal3<StringName, Long, Vector2> by signal("fromNode", "fromPort",
      "releasePosition")

  /**
   * Emitted when user drags a connection from an input port into the empty space of the graph.
   */
  public val connectionFromEmpty: Signal3<StringName, Long, Vector2> by signal("toNode", "toPort",
      "releasePosition")

  /**
   * Emitted when a GraphNode is attempted to be removed from the GraphEdit. Provides a list of node names to be removed (all selected nodes, excluding nodes without closing button).
   */
  public val deleteNodesRequest: Signal1<VariantArray<StringName>> by signal("nodes")

  /**
   * Emitted at the beginning of a GraphNode movement.
   */
  public val beginNodeMove: Signal0 by signal()

  /**
   * Emitted at the end of a GraphNode movement.
   */
  public val endNodeMove: Signal0 by signal()

  /**
   * Emitted when the scroll offset is changed by the user. It will not be emitted when changed in code.
   */
  public val scrollOffsetChanged: Signal1<Vector2> by signal("offset")

  /**
   * Emitted at the beginning of a connection drag.
   */
  public val connectionDragStarted: Signal3<StringName, Long, Boolean> by signal("fromNode",
      "fromPort", "isOutput")

  /**
   * Emitted at the end of a connection drag.
   */
  public val connectionDragEnded: Signal0 by signal()

  /**
   * If `true`, enables disconnection of existing connections in the GraphEdit by dragging the right end.
   */
  public var rightDisconnects: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_IS_RIGHT_DISCONNECTS_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_RIGHT_DISCONNECTS,
          NIL)
    }

  /**
   * The scroll offset.
   */
  public var scrollOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_SCROLL_OFS, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_SCROLL_OFS, NIL)
    }

  /**
   * The snapping distance in pixels.
   */
  public var snapDistance: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_SNAP, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_SNAP, NIL)
    }

  /**
   * If `true`, enables snapping.
   */
  public var useSnap: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_IS_USING_SNAP, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_USE_SNAP, NIL)
    }

  /**
   * Defines the control scheme for panning with mouse wheel.
   */
  public var panningScheme: PanningScheme
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_PANNING_SCHEME,
          LONG)
      return GraphEdit.PanningScheme.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_PANNING_SCHEME, NIL)
    }

  /**
   * The curvature of the lines between the nodes. 0 results in straight lines.
   */
  public var connectionLinesCurvature: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_CONNECTION_LINES_CURVATURE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_CONNECTION_LINES_CURVATURE, NIL)
    }

  /**
   * The thickness of the lines between the nodes.
   */
  public var connectionLinesThickness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_CONNECTION_LINES_THICKNESS, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_CONNECTION_LINES_THICKNESS, NIL)
    }

  /**
   * If `true`, the lines between nodes will use antialiasing.
   */
  public var connectionLinesAntialiased: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_IS_CONNECTION_LINES_ANTIALIASED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_CONNECTION_LINES_ANTIALIASED, NIL)
    }

  /**
   * The current zoom value.
   */
  public var zoom: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_ZOOM, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_ZOOM, NIL)
    }

  /**
   * The lower zoom limit.
   */
  public var zoomMin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_ZOOM_MIN, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_ZOOM_MIN, NIL)
    }

  /**
   * The upper zoom limit.
   */
  public var zoomMax: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_ZOOM_MAX, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_ZOOM_MAX, NIL)
    }

  /**
   * The step of each zoom level.
   */
  public var zoomStep: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_ZOOM_STEP, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_ZOOM_STEP, NIL)
    }

  /**
   * If `true`, makes a label with the current zoom level visible. The zoom value is displayed in percents.
   */
  public var showZoomLabel: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_IS_SHOWING_ZOOM_LABEL,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_SHOW_ZOOM_LABEL,
          NIL)
    }

  /**
   * If `true`, the minimap is visible.
   */
  public var minimapEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_IS_MINIMAP_ENABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_MINIMAP_ENABLED,
          NIL)
    }

  /**
   * The size of the minimap rectangle. The map itself is based on the size of the grid area and is scaled to fit this rectangle.
   */
  public var minimapSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_MINIMAP_SIZE,
          VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_MINIMAP_SIZE, NIL)
    }

  /**
   * The opacity of the minimap rectangle.
   */
  public var minimapOpacity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_MINIMAP_OPACITY,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_MINIMAP_OPACITY,
          NIL)
    }

  /**
   * If `true`, the Arrange Nodes button is hidden.
   */
  public var arrangeNodesButtonHidden: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_IS_ARRANGE_NODES_BUTTON_HIDDEN, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_ARRANGE_NODES_BUTTON_HIDDEN, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GRAPHEDIT, scriptIndex)
    return true
  }

  /**
   * Returns whether the [mousePosition] is in the input hot zone.
   *
   * By default, a hot zone is a [godot.core.Rect2] positioned such that its center is at [inNode].[godot.GraphNode.getConnectionInputPosition]([inPort]) (For output's case, call [godot.GraphNode.getConnectionOutputPosition] instead). The hot zone's width is twice the Theme Property `port_grab_distance_horizontal`, and its height is twice the `port_grab_distance_vertical`.
   *
   * Below is a sample code to help get started:
   *
   * ```
   * 				func _is_in_input_hotzone(in_node, in_port, mouse_position):
   * 				    var port_size: Vector2 = Vector2(get_theme_constant("port_grab_distance_horizontal"), get_theme_constant("port_grab_distance_vertical"))
   * 				    var port_pos: Vector2 = in_node.get_position() + in_node.get_connection_input_position(in_port) - port_size / 2
   * 				    var rect = Rect2(port_pos, port_size)
   *
   * 				    return rect.has_point(mouse_position)
   * 				```
   */
  public open fun _isInInputHotzone(
    inNode: Object,
    inPort: Int,
    mousePosition: Vector2,
  ): Boolean {
    throw NotImplementedError("_is_in_input_hotzone is not implemented for GraphEdit")
  }

  /**
   * Returns whether the [mousePosition] is in the output hot zone. For more information on hot zones, see [_isInInputHotzone].
   *
   * Below is a sample code to help get started:
   *
   * ```
   * 				func _is_in_output_hotzone(in_node, in_port, mouse_position):
   * 				    var port_size: Vector2 = Vector2(get_theme_constant("port_grab_distance_horizontal"), get_theme_constant("port_grab_distance_vertical"))
   * 				    var port_pos: Vector2 = in_node.get_position() + in_node.get_connection_output_position(in_port) - port_size / 2
   * 				    var rect = Rect2(port_pos, port_size)
   *
   * 				    return rect.has_point(mouse_position)
   * 				```
   */
  public open fun _isInOutputHotzone(
    inNode: Object,
    inPort: Int,
    mousePosition: Vector2,
  ): Boolean {
    throw NotImplementedError("_is_in_output_hotzone is not implemented for GraphEdit")
  }

  /**
   * Virtual method which can be overridden to customize how connections are drawn.
   */
  public open fun _getConnectionLine(fromPosition: Vector2, toPosition: Vector2):
      PackedVector2Array {
    throw NotImplementedError("_get_connection_line is not implemented for GraphEdit")
  }

  /**
   * This virtual method can be used to insert additional error detection while the user is dragging a connection over a valid port.
   *
   * Return `true` if the connection is indeed valid or return `false` if the connection is impossible. If the connection is impossible, no snapping to the port and thus no connection request to that port will happen.
   *
   * In this example a connection to same node is suppressed:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * func _is_node_hover_valid(from, from_port, to, to_port):
   *
   *     return from != to
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * public override bool _IsNodeHoverValid(StringName fromNode, int fromPort, StringName toNode, int toPort)
   *
   * {
   *
   *     return fromNode != toNode;
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public open fun _isNodeHoverValid(
    fromNode: StringName,
    fromPort: Int,
    toNode: StringName,
    toPort: Int,
  ): Boolean {
    throw NotImplementedError("_is_node_hover_valid is not implemented for GraphEdit")
  }

  /**
   * Create a connection between the [fromPort] of the [fromNode] [godot.GraphNode] and the [toPort] of the [toNode] [godot.GraphNode]. If the connection already exists, no connection is created.
   */
  public fun connectNode(
    fromNode: StringName,
    fromPort: Int,
    toNode: StringName,
    toPort: Int,
  ): GodotError {
    TransferContext.writeArguments(STRING_NAME to fromNode, LONG to fromPort.toLong(), STRING_NAME to toNode, LONG to toPort.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_CONNECT_NODE, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the [fromPort] of the [fromNode] [godot.GraphNode] is connected to the [toPort] of the [toNode] [godot.GraphNode].
   */
  public fun isNodeConnected(
    fromNode: StringName,
    fromPort: Int,
    toNode: StringName,
    toPort: Int,
  ): Boolean {
    TransferContext.writeArguments(STRING_NAME to fromNode, LONG to fromPort.toLong(), STRING_NAME to toNode, LONG to toPort.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_IS_NODE_CONNECTED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Removes the connection between the [fromPort] of the [fromNode] [godot.GraphNode] and the [toPort] of the [toNode] [godot.GraphNode]. If the connection does not exist, no connection is removed.
   */
  public fun disconnectNode(
    fromNode: StringName,
    fromPort: Int,
    toNode: StringName,
    toPort: Int,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to fromNode, LONG to fromPort.toLong(), STRING_NAME to toNode, LONG to toPort.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_DISCONNECT_NODE, NIL)
  }

  /**
   * Sets the coloration of the connection between [fromNode]'s [fromPort] and [toNode]'s [toPort] with the color provided in the [theme_item activity] theme property.
   */
  public fun setConnectionActivity(
    fromNode: StringName,
    fromPort: Int,
    toNode: StringName,
    toPort: Int,
    amount: Float,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to fromNode, LONG to fromPort.toLong(), STRING_NAME to toNode, LONG to toPort.toLong(), DOUBLE to amount.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_CONNECTION_ACTIVITY,
        NIL)
  }

  /**
   * Returns an Array containing the list of connections. A connection consists in a structure of the form `{ from_port: 0, from: "GraphNode name 0", to_port: 1, to: "GraphNode name 1" }`.
   */
  public fun getConnectionList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_CONNECTION_LIST,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Removes all connections between nodes.
   */
  public fun clearConnections(): Unit {
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
  public fun forceConnectionDragEnd(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_FORCE_CONNECTION_DRAG_END,
        NIL)
  }

  /**
   * Allows to disconnect nodes when dragging from the right port of the [godot.GraphNode]'s slot if it has the specified type. See also [removeValidRightDisconnectType].
   */
  public fun addValidRightDisconnectType(type: Int): Unit {
    TransferContext.writeArguments(LONG to type.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_ADD_VALID_RIGHT_DISCONNECT_TYPE, NIL)
  }

  /**
   * Disallows to disconnect nodes when dragging from the right port of the [godot.GraphNode]'s slot if it has the specified type. Use this to disable disconnection previously allowed with [addValidRightDisconnectType].
   */
  public fun removeValidRightDisconnectType(type: Int): Unit {
    TransferContext.writeArguments(LONG to type.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_REMOVE_VALID_RIGHT_DISCONNECT_TYPE, NIL)
  }

  /**
   * Allows to disconnect nodes when dragging from the left port of the [godot.GraphNode]'s slot if it has the specified type. See also [removeValidLeftDisconnectType].
   */
  public fun addValidLeftDisconnectType(type: Int): Unit {
    TransferContext.writeArguments(LONG to type.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_ADD_VALID_LEFT_DISCONNECT_TYPE, NIL)
  }

  /**
   * Disallows to disconnect nodes when dragging from the left port of the [godot.GraphNode]'s slot if it has the specified type. Use this to disable disconnection previously allowed with [addValidLeftDisconnectType].
   */
  public fun removeValidLeftDisconnectType(type: Int): Unit {
    TransferContext.writeArguments(LONG to type.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_REMOVE_VALID_LEFT_DISCONNECT_TYPE, NIL)
  }

  /**
   * Allows the connection between two different port types. The port type is defined individually for the left and the right port of each slot with the [godot.GraphNode.setSlot] method.
   *
   * See also [isValidConnectionType] and [removeValidConnectionType].
   */
  public fun addValidConnectionType(fromType: Int, toType: Int): Unit {
    TransferContext.writeArguments(LONG to fromType.toLong(), LONG to toType.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_ADD_VALID_CONNECTION_TYPE,
        NIL)
  }

  /**
   * Disallows the connection between two different port types previously allowed by [addValidConnectionType]. The port type is defined individually for the left and the right port of each slot with the [godot.GraphNode.setSlot] method.
   *
   * See also [isValidConnectionType].
   */
  public fun removeValidConnectionType(fromType: Int, toType: Int): Unit {
    TransferContext.writeArguments(LONG to fromType.toLong(), LONG to toType.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_REMOVE_VALID_CONNECTION_TYPE, NIL)
  }

  /**
   * Returns whether it's possible to make a connection between two different port types. The port type is defined individually for the left and the right port of each slot with the [godot.GraphNode.setSlot] method.
   *
   * See also [addValidConnectionType] and [removeValidConnectionType].
   */
  public fun isValidConnectionType(fromType: Int, toType: Int): Boolean {
    TransferContext.writeArguments(LONG to fromType.toLong(), LONG to toType.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_IS_VALID_CONNECTION_TYPE,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the points which would make up a connection between [fromNode] and [toNode].
   */
  public fun getConnectionLine(fromNode: Vector2, toNode: Vector2): PackedVector2Array {
    TransferContext.writeArguments(VECTOR2 to fromNode, VECTOR2 to toNode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_CONNECTION_LINE,
        PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * Gets the [godot.HBoxContainer] that contains the zooming and grid snap controls in the top left of the graph. You can use this method to reposition the toolbar or to add your own custom controls to it.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public fun getZoomHbox(): HBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_ZOOM_HBOX, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as HBoxContainer?)
  }

  /**
   * Rearranges selected nodes in a layout with minimum crossings between connections and uniform horizontal and vertical gap between nodes.
   */
  public fun arrangeNodes(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_ARRANGE_NODES, NIL)
  }

  /**
   * Sets the specified [node] as the one selected.
   */
  public fun setSelected(node: Node): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_SELECTED, NIL)
  }

  public enum class PanningScheme(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}

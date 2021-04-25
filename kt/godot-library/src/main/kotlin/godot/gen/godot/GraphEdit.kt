// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.CoreTypeHelper
import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
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
open class GraphEdit : Control() {
  /**
   * Emitted at the beginning of a GraphNode movement.
   */
  val _beginNodeMove: Signal0 by signal()

  /**
   * Emitted at the end of a GraphNode movement.
   */
  val _endNodeMove: Signal0 by signal()

  /**
   * Emitted when user dragging connection from input port into empty space of the graph.
   */
  val connectionFromEmpty: Signal3<String, Long, Vector2> by signal("to", "to_slot",
      "release_position")

  /**
   * Emitted to the GraphEdit when the connection between the `from_slot` slot of the `from` GraphNode and the `to_slot` slot of the `to` GraphNode is attempted to be created.
   */
  val connectionRequest: Signal4<String, Long, String, Long> by signal("from", "from_slot", "to",
      "to_slot")

  /**
   * Emitted when user dragging connection from output port into empty space of the graph.
   */
  val connectionToEmpty: Signal3<String, Long, Vector2> by signal("from", "from_slot",
      "release_position")

  /**
   * Emitted when the user presses `Ctrl + C`.
   */
  val copyNodesRequest: Signal0 by signal()

  /**
   * Emitted when a GraphNode is attempted to be removed from the GraphEdit.
   */
  val deleteNodesRequest: Signal0 by signal()

  /**
   * Emitted to the GraphEdit when the connection between `from_slot` slot of `from` GraphNode and `to_slot` slot of `to` GraphNode is attempted to be removed.
   */
  val disconnectionRequest: Signal4<String, Long, String, Long> by signal("from", "from_slot", "to",
      "to_slot")

  /**
   * Emitted when a GraphNode is attempted to be duplicated in the GraphEdit.
   */
  val duplicateNodesRequest: Signal0 by signal()

  /**
   * Emitted when a GraphNode is selected.
   */
  val nodeSelected: Signal1<Node> by signal("node")

  /**
   *
   */
  val nodeUnselected: Signal1<Node> by signal("node")

  /**
   * Emitted when the user presses `Ctrl + V`.
   */
  val pasteNodesRequest: Signal0 by signal()

  /**
   * Emitted when a popup is requested. Happens on right-clicking in the GraphEdit. `position` is the position of the mouse pointer when the signal is sent.
   */
  val popupRequest: Signal1<Vector2> by signal("position")

  /**
   * Emitted when the scroll offset is changed by the user. It will not be emitted when changed in code.
   */
  val scrollOffsetChanged: Signal1<Vector2> by signal("ofs")

  open var minimapEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_MINIMAP_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_MINIMAP_ENABLED,
          NIL)
    }

  open var minimapOpacity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_MINIMAP_OPACITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_MINIMAP_OPACITY,
          NIL)
    }

  open var minimapSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_MINIMAP_SIZE,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_MINIMAP_SIZE, NIL)
    }

  /**
   * If `true`, enables disconnection of existing connections in the GraphEdit by dragging the right end.
   */
  open var rightDisconnects: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_RIGHT_DISCONNECTS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_RIGHT_DISCONNECTS,
          NIL)
    }

  /**
   * The scroll offset.
   */
  open var scrollOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_SCROLL_OFFSET,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_SCROLL_OFFSET, NIL)
    }

  /**
   * The snapping distance in pixels.
   */
  open var snapDistance: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_SNAP_DISTANCE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_SNAP_DISTANCE, NIL)
    }

  /**
   * If `true`, enables snapping.
   */
  open var useSnap: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_USE_SNAP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_USE_SNAP, NIL)
    }

  /**
   * The current zoom value.
   */
  open var zoom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_ZOOM, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_ZOOM, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_GRAPHEDIT)
  }

  @CoreTypeHelper
  open fun minimapSize(schedule: Vector2.() -> Unit): Vector2 = minimapSize.apply{
      schedule(this)
      minimapSize = this
  }


  @CoreTypeHelper
  open fun scrollOffset(schedule: Vector2.() -> Unit): Vector2 = scrollOffset.apply{
      schedule(this)
      scrollOffset = this
  }


  open fun _connectionsLayerDraw() {
  }

  open fun _graphNodeMoved(arg0: Node) {
  }

  open fun _graphNodeRaised(arg0: Node) {
  }

  open fun _graphNodeSlotUpdated(arg0: Long, arg1: Node) {
  }

  override fun _guiInput(event: InputEvent) {
  }

  open fun _minimapDraw() {
  }

  open fun _minimapToggled() {
  }

  open fun _scrollMoved(arg0: Double) {
  }

  open fun _snapToggled() {
  }

  open fun _snapValueChanged(arg0: Double) {
  }

  open fun _topLayerDraw() {
  }

  open fun _topLayerInput(arg0: InputEvent) {
  }

  open fun _updateScrollOffset() {
  }

  open fun _zoomMinus() {
  }

  open fun _zoomPlus() {
  }

  open fun _zoomReset() {
  }

  /**
   * Makes possible the connection between two different slot types. The type is defined with the [godot.GraphNode.setSlot] method.
   */
  open fun addValidConnectionType(fromType: Long, toType: Long) {
    TransferContext.writeArguments(LONG to fromType, LONG to toType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_ADD_VALID_CONNECTION_TYPE,
        NIL)
  }

  /**
   * Makes possible to disconnect nodes when dragging from the slot at the left if it has the specified type.
   */
  open fun addValidLeftDisconnectType(type: Long) {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_ADD_VALID_LEFT_DISCONNECT_TYPE, NIL)
  }

  /**
   * Makes possible to disconnect nodes when dragging from the slot at the right if it has the specified type.
   */
  open fun addValidRightDisconnectType(type: Long) {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_ADD_VALID_RIGHT_DISCONNECT_TYPE, NIL)
  }

  /**
   * Removes all connections between nodes.
   */
  open fun clearConnections() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_CLEAR_CONNECTIONS, NIL)
  }

  /**
   * Create a connection between the `from_port` slot of the `from` GraphNode and the `to_port` slot of the `to` GraphNode. If the connection already exists, no connection is created.
   */
  open fun connectNode(
    from: String,
    fromPort: Long,
    to: String,
    toPort: Long
  ): GodotError {
    TransferContext.writeArguments(STRING to from, LONG to fromPort, STRING to to, LONG to toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_CONNECT_NODE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Removes the connection between the `from_port` slot of the `from` GraphNode and the `to_port` slot of the `to` GraphNode. If the connection does not exist, no connection is removed.
   */
  open fun disconnectNode(
    from: String,
    fromPort: Long,
    to: String,
    toPort: Long
  ) {
    TransferContext.writeArguments(STRING to from, LONG to fromPort, STRING to to, LONG to toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_DISCONNECT_NODE, NIL)
  }

  /**
   * Returns an Array containing the list of connections. A connection consists in a structure of the form `{ from_port: 0, from: "GraphNode name 0", to_port: 1, to: "GraphNode name 1" }`.
   */
  open fun getConnectionList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_CONNECTION_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Gets the [godot.HBoxContainer] that contains the zooming and grid snap controls in the top left of the graph.
   *
   * Warning: The intended usage of this function is to allow you to reposition or add your own custom controls to the container. This is an internal control and as such should not be freed. If you wish to hide this or any of it's children use their [godot.CanvasItem.visible] property instead.
   */
  open fun getZoomHbox(): HBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_ZOOM_HBOX, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as HBoxContainer?
  }

  /**
   * Returns `true` if the `from_port` slot of the `from` GraphNode is connected to the `to_port` slot of the `to` GraphNode.
   */
  open fun isNodeConnected(
    from: String,
    fromPort: Long,
    to: String,
    toPort: Long
  ): Boolean {
    TransferContext.writeArguments(STRING to from, LONG to fromPort, STRING to to, LONG to toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_IS_NODE_CONNECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether it's possible to connect slots of the specified types.
   */
  open fun isValidConnectionType(fromType: Long, toType: Long): Boolean {
    TransferContext.writeArguments(LONG to fromType, LONG to toType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_IS_VALID_CONNECTION_TYPE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Makes it not possible to connect between two different slot types. The type is defined with the [godot.GraphNode.setSlot] method.
   */
  open fun removeValidConnectionType(fromType: Long, toType: Long) {
    TransferContext.writeArguments(LONG to fromType, LONG to toType)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_REMOVE_VALID_CONNECTION_TYPE, NIL)
  }

  /**
   * Removes the possibility to disconnect nodes when dragging from the slot at the left if it has the specified type.
   */
  open fun removeValidLeftDisconnectType(type: Long) {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_REMOVE_VALID_LEFT_DISCONNECT_TYPE, NIL)
  }

  /**
   * Removes the possibility to disconnect nodes when dragging from the slot at the right if it has the specified type.
   */
  open fun removeValidRightDisconnectType(type: Long) {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_REMOVE_VALID_RIGHT_DISCONNECT_TYPE, NIL)
  }

  /**
   * Sets the coloration of the connection between `from`'s `from_port` and `to`'s `to_port` with the color provided in the `activity` theme property.
   */
  open fun setConnectionActivity(
    from: String,
    fromPort: Long,
    to: String,
    toPort: Long,
    amount: Double
  ) {
    TransferContext.writeArguments(STRING to from, LONG to fromPort, STRING to to, LONG to toPort,
        DOUBLE to amount)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_CONNECTION_ACTIVITY,
        NIL)
  }

  /**
   * Sets the specified `node` as the one selected.
   */
  open fun setSelected(node: Node) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_SELECTED, NIL)
  }
}

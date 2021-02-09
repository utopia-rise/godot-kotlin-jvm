// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class GraphEdit : Control() {
  val _beginNodeMove: Signal0 by signal()

  val _endNodeMove: Signal0 by signal()

  val connectionFromEmpty: Signal3<String, Long, Vector2> by signal("to", "to_slot",
      "release_position")

  val connectionRequest: Signal4<String, Long, String, Long> by signal("from", "from_slot", "to",
      "to_slot")

  val connectionToEmpty: Signal3<String, Long, Vector2> by signal("from", "from_slot",
      "release_position")

  val copyNodesRequest: Signal0 by signal()

  val deleteNodesRequest: Signal0 by signal()

  val disconnectionRequest: Signal4<String, Long, String, Long> by signal("from", "from_slot", "to",
      "to_slot")

  val duplicateNodesRequest: Signal0 by signal()

  val nodeSelected: Signal1<Node> by signal("node")

  val nodeUnselected: Signal1<Node> by signal("node")

  val pasteNodesRequest: Signal0 by signal()

  val popupRequest: Signal1<Vector2> by signal("position")

  val scrollOffsetChanged: Signal1<Vector2> by signal("ofs")

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

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_GRAPHEDIT)

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

  override fun _guiInput(event: InputEvent) {
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

  open fun addValidConnectionType(fromType: Long, toType: Long) {
    TransferContext.writeArguments(LONG to fromType, LONG to toType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_ADD_VALID_CONNECTION_TYPE,
        NIL)
  }

  open fun addValidLeftDisconnectType(type: Long) {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_ADD_VALID_LEFT_DISCONNECT_TYPE, NIL)
  }

  open fun addValidRightDisconnectType(type: Long) {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_ADD_VALID_RIGHT_DISCONNECT_TYPE, NIL)
  }

  open fun clearConnections() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_CLEAR_CONNECTIONS, NIL)
  }

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

  open fun disconnectNode(
    from: String,
    fromPort: Long,
    to: String,
    toPort: Long
  ) {
    TransferContext.writeArguments(STRING to from, LONG to fromPort, STRING to to, LONG to toPort)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_DISCONNECT_NODE, NIL)
  }

  open fun getConnectionList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_CONNECTION_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun getZoomHbox(): HBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_GET_ZOOM_HBOX, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as HBoxContainer?
  }

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

  open fun isValidConnectionType(fromType: Long, toType: Long): Boolean {
    TransferContext.writeArguments(LONG to fromType, LONG to toType)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_IS_VALID_CONNECTION_TYPE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun removeValidConnectionType(fromType: Long, toType: Long) {
    TransferContext.writeArguments(LONG to fromType, LONG to toType)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_REMOVE_VALID_CONNECTION_TYPE, NIL)
  }

  open fun removeValidLeftDisconnectType(type: Long) {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_REMOVE_VALID_LEFT_DISCONNECT_TYPE, NIL)
  }

  open fun removeValidRightDisconnectType(type: Long) {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_REMOVE_VALID_RIGHT_DISCONNECT_TYPE, NIL)
  }

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

  open fun setSelected(node: Node) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRAPHEDIT_SET_SELECTED, NIL)
  }
}

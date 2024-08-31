// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedVector2Array
import godot.core.Rect2
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.Signal3
import godot.signals.Signal4
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * [GraphEdit] provides tools for creation, manipulation, and display of various graphs. Its main
 * purpose in the engine is to power the visual programming systems, such as visual shaders, but it is
 * also available for use in user projects.
 * [GraphEdit] by itself is only an empty container, representing an infinite grid where
 * [GraphNode]s can be placed. Each [GraphNode] represents a node in the graph, a single unit of data
 * in the connected scheme. [GraphEdit], in turn, helps to control various interactions with nodes and
 * between nodes. When the user attempts to connect, disconnect, or delete a [GraphNode], a signal is
 * emitted in the [GraphEdit], but no action is taken by default. It is the responsibility of the
 * programmer utilizing this control to implement the necessary logic to determine how each request
 * should be handled.
 * **Performance:** It is greatly advised to enable low-processor usage mode (see
 * [OS.lowProcessorUsageMode]) when using GraphEdits.
 * **Note:** Keep in mind that [Node.getChildren] will also return the connection layer node named
 * `_connection_layer` due to technical limitations. This behavior may change in future releases.
 */
@GodotBaseType
public open class GraphEdit : Control() {
  /**
   * Emitted to the GraphEdit when the connection between the [fromPort] of the [fromNode]
   * [GraphNode] and the [toPort] of the [toNode] [GraphNode] is attempted to be created.
   */
  public val connectionRequest: Signal4<StringName, Long, StringName, Long> by signal("fromNode",
      "fromPort", "toNode", "toPort")

  /**
   * Emitted to the GraphEdit when the connection between [fromPort] of [fromNode] [GraphNode] and
   * [toPort] of [toNode] [GraphNode] is attempted to be removed.
   */
  public val disconnectionRequest: Signal4<StringName, Long, StringName, Long> by signal("fromNode",
      "fromPort", "toNode", "toPort")

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
   * Emitted at the beginning of a connection drag.
   */
  public val connectionDragStarted: Signal3<StringName, Long, Boolean> by signal("fromNode",
      "fromPort", "isOutput")

  /**
   * Emitted at the end of a connection drag.
   */
  public val connectionDragEnded: Signal0 by signal()

  /**
   * Emitted when this [GraphEdit] captures a `ui_copy` action ([kbd]Ctrl + C[/kbd] by default). In
   * general, this signal indicates that the selected [GraphElement]s should be copied.
   */
  public val copyNodesRequest: Signal0 by signal()

  /**
   * Emitted when this [GraphEdit] captures a `ui_paste` action ([kbd]Ctrl + V[/kbd] by default). In
   * general, this signal indicates that previously copied [GraphElement]s should be pasted.
   */
  public val pasteNodesRequest: Signal0 by signal()

  /**
   * Emitted when this [GraphEdit] captures a `ui_graph_duplicate` action ([kbd]Ctrl + D[/kbd] by
   * default). In general, this signal indicates that the selected [GraphElement]s should be
   * duplicated.
   */
  public val duplicateNodesRequest: Signal0 by signal()

  /**
   * Emitted when this [GraphEdit] captures a `ui_graph_delete` action ([kbd]Delete[/kbd] by
   * default).
   * [nodes] is an array of node names that should be removed. These usually include all selected
   * nodes.
   */
  public val deleteNodesRequest: Signal1<VariantArray<StringName>> by signal("nodes")

  /**
   * Emitted when the given [GraphElement] node is selected.
   */
  public val nodeSelected: Signal1<Node> by signal("node")

  /**
   * Emitted when the given [GraphElement] node is deselected.
   */
  public val nodeDeselected: Signal1<Node> by signal("node")

  /**
   * Emitted when the [GraphFrame] [frame] is resized to [newRect].
   */
  public val frameRectChanged: Signal2<GraphFrame, Vector2> by signal("frame", "newRect")

  /**
   * Emitted when a popup is requested. Happens on right-clicking in the GraphEdit. [atPosition] is
   * the position of the mouse pointer when the signal is sent.
   */
  public val popupRequest: Signal1<Vector2> by signal("atPosition")

  /**
   * Emitted at the beginning of a [GraphElement]'s movement.
   */
  public val beginNodeMove: Signal0 by signal()

  /**
   * Emitted at the end of a [GraphElement]'s movement.
   */
  public val endNodeMove: Signal0 by signal()

  /**
   * Emitted when one or more [GraphElement]s are dropped onto the [GraphFrame] named [frame], when
   * they were not previously attached to any other one.
   * [elements] is an array of [GraphElement]s to be attached.
   */
  public val graphElementsLinkedToFrameRequest: Signal2<VariantArray<Any?>, StringName> by
      signal("elements", "frame")

  /**
   * Emitted when the scroll offset is changed by the user. It will not be emitted when changed in
   * code.
   */
  public val scrollOffsetChanged: Signal1<Vector2> by signal("offset")

  /**
   * The scroll offset.
   */
  @CoreTypeLocalCopy
  public var scrollOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScrollOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScrollOffsetPtr, NIL)
    }

  /**
   * If `true`, the grid is visible.
   */
  public var showGrid: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShowingGridPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShowGridPtr, NIL)
    }

  /**
   * The pattern used for drawing the grid.
   */
  public var gridPattern: GridPattern
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGridPatternPtr, LONG)
      return GraphEdit.GridPattern.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setGridPatternPtr, NIL)
    }

  /**
   * If `true`, enables snapping.
   */
  public var snappingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSnappingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSnappingEnabledPtr, NIL)
    }

  /**
   * The snapping distance in pixels, also determines the grid line distance.
   */
  public var snappingDistance: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSnappingDistancePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSnappingDistancePtr, NIL)
    }

  /**
   * Defines the control scheme for panning with mouse wheel.
   */
  public var panningScheme: PanningScheme
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPanningSchemePtr, LONG)
      return GraphEdit.PanningScheme.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPanningSchemePtr, NIL)
    }

  /**
   * If `true`, enables disconnection of existing connections in the GraphEdit by dragging the right
   * end.
   */
  public var rightDisconnects: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRightDisconnectsEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRightDisconnectsPtr, NIL)
    }

  /**
   * The curvature of the lines between the nodes. 0 results in straight lines.
   */
  public var connectionLinesCurvature: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConnectionLinesCurvaturePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setConnectionLinesCurvaturePtr, NIL)
    }

  /**
   * The thickness of the lines between the nodes.
   */
  public var connectionLinesThickness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConnectionLinesThicknessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setConnectionLinesThicknessPtr, NIL)
    }

  /**
   * If `true`, the lines between nodes will use antialiasing.
   */
  public var connectionLinesAntialiased: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isConnectionLinesAntialiasedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setConnectionLinesAntialiasedPtr, NIL)
    }

  /**
   * The current zoom value.
   */
  public var zoom: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getZoomPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setZoomPtr, NIL)
    }

  /**
   * The lower zoom limit.
   */
  public var zoomMin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getZoomMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setZoomMinPtr, NIL)
    }

  /**
   * The upper zoom limit.
   */
  public var zoomMax: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getZoomMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setZoomMaxPtr, NIL)
    }

  /**
   * The step of each zoom level.
   */
  public var zoomStep: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getZoomStepPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setZoomStepPtr, NIL)
    }

  /**
   * If `true`, the minimap is visible.
   */
  public var minimapEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMinimapEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMinimapEnabledPtr, NIL)
    }

  /**
   * The size of the minimap rectangle. The map itself is based on the size of the grid area and is
   * scaled to fit this rectangle.
   */
  @CoreTypeLocalCopy
  public var minimapSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinimapSizePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMinimapSizePtr, NIL)
    }

  /**
   * The opacity of the minimap rectangle.
   */
  public var minimapOpacity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinimapOpacityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMinimapOpacityPtr, NIL)
    }

  /**
   * If `true`, the menu toolbar is visible.
   */
  public var showMenu: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShowingMenuPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShowMenuPtr, NIL)
    }

  /**
   * If `true`, the label with the current zoom level is visible. The zoom level is displayed in
   * percents.
   */
  public var showZoomLabel: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShowingZoomLabelPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShowZoomLabelPtr, NIL)
    }

  /**
   * If `true`, buttons that allow to change and reset the zoom level are visible.
   */
  public var showZoomButtons: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShowingZoomButtonsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShowZoomButtonsPtr, NIL)
    }

  /**
   * If `true`, buttons that allow to configure grid and snapping options are visible.
   */
  public var showGridButtons: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShowingGridButtonsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShowGridButtonsPtr, NIL)
    }

  /**
   * If `true`, the button to toggle the minimap is visible.
   */
  public var showMinimapButton: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShowingMinimapButtonPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShowMinimapButtonPtr, NIL)
    }

  /**
   * If `true`, the button to automatically arrange graph nodes is visible.
   */
  public var showArrangeButton: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShowingArrangeButtonPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShowArrangeButtonPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GRAPHEDIT, scriptIndex)
  }

  /**
   * The scroll offset.
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
   * val myCoreType = graphedit.scrollOffset
   * //Your changes
   * graphedit.scrollOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun scrollOffsetMutate(block: Vector2.() -> Unit): Vector2 = scrollOffset.apply{
      block(this)
      scrollOffset = this
  }


  /**
   * The size of the minimap rectangle. The map itself is based on the size of the grid area and is
   * scaled to fit this rectangle.
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
   * val myCoreType = graphedit.minimapSize
   * //Your changes
   * graphedit.minimapSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun minimapSizeMutate(block: Vector2.() -> Unit): Vector2 = minimapSize.apply{
      block(this)
      minimapSize = this
  }


  /**
   * Returns whether the [mousePosition] is in the input hot zone.
   * By default, a hot zone is a [Rect2] positioned such that its center is at
   * [inNode].[GraphNode.getInputPortPosition]([inPort]) (For output's case, call
   * [GraphNode.getOutputPortPosition] instead). The hot zone's width is twice the Theme Property
   * `port_grab_distance_horizontal`, and its height is twice the `port_grab_distance_vertical`.
   * Below is a sample code to help get started:
   * [codeblock]
   * func _is_in_input_hotzone(in_node, in_port, mouse_position):
   *     var port_size: Vector2 = Vector2(get_theme_constant("port_grab_distance_horizontal"),
   * get_theme_constant("port_grab_distance_vertical"))
   *     var port_pos: Vector2 = in_node.get_position() + in_node.get_input_port_position(in_port) -
   * port_size / 2
   *     var rect = Rect2(port_pos, port_size)
   *
   *     return rect.has_point(mouse_position)
   * [/codeblock]
   */
  public open fun _isInInputHotzone(
    inNode: Object,
    inPort: Int,
    mousePosition: Vector2,
  ): Boolean {
    throw NotImplementedError("_is_in_input_hotzone is not implemented for GraphEdit")
  }

  /**
   * Returns whether the [mousePosition] is in the output hot zone. For more information on hot
   * zones, see [_isInInputHotzone].
   * Below is a sample code to help get started:
   * [codeblock]
   * func _is_in_output_hotzone(in_node, in_port, mouse_position):
   *     var port_size: Vector2 = Vector2(get_theme_constant("port_grab_distance_horizontal"),
   * get_theme_constant("port_grab_distance_vertical"))
   *     var port_pos: Vector2 = in_node.get_position() +
   * in_node.get_output_port_position(in_port) - port_size / 2
   *     var rect = Rect2(port_pos, port_size)
   *
   *     return rect.has_point(mouse_position)
   * [/codeblock]
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
   * This virtual method can be used to insert additional error detection while the user is dragging
   * a connection over a valid port.
   * Return `true` if the connection is indeed valid or return `false` if the connection is
   * impossible. If the connection is impossible, no snapping to the port and thus no connection
   * request to that port will happen.
   * In this example a connection to same node is suppressed:
   *
   * gdscript:
   * ```gdscript
   * func _is_node_hover_valid(from, from_port, to, to_port):
   *     return from != to
   * ```
   * csharp:
   * ```csharp
   * public override bool _IsNodeHoverValid(StringName fromNode, int fromPort, StringName toNode,
   * int toPort)
   * {
   *     return fromNode != toNode;
   * }
   * ```
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
   * Create a connection between the [fromPort] of the [fromNode] [GraphNode] and the [toPort] of
   * the [toNode] [GraphNode]. If the connection already exists, no connection is created.
   */
  public fun connectNode(
    fromNode: StringName,
    fromPort: Int,
    toNode: StringName,
    toPort: Int,
  ): GodotError {
    TransferContext.writeArguments(STRING_NAME to fromNode, LONG to fromPort.toLong(), STRING_NAME to toNode, LONG to toPort.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.connectNodePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the [fromPort] of the [fromNode] [GraphNode] is connected to the [toPort] of
   * the [toNode] [GraphNode].
   */
  public fun isNodeConnected(
    fromNode: StringName,
    fromPort: Int,
    toNode: StringName,
    toPort: Int,
  ): Boolean {
    TransferContext.writeArguments(STRING_NAME to fromNode, LONG to fromPort.toLong(), STRING_NAME to toNode, LONG to toPort.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isNodeConnectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Removes the connection between the [fromPort] of the [fromNode] [GraphNode] and the [toPort] of
   * the [toNode] [GraphNode]. If the connection does not exist, no connection is removed.
   */
  public fun disconnectNode(
    fromNode: StringName,
    fromPort: Int,
    toNode: StringName,
    toPort: Int,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to fromNode, LONG to fromPort.toLong(), STRING_NAME to toNode, LONG to toPort.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.disconnectNodePtr, NIL)
  }

  /**
   * Sets the coloration of the connection between [fromNode]'s [fromPort] and [toNode]'s [toPort]
   * with the color provided in the [theme_item activity] theme property. The color is linearly
   * interpolated between the connection color and the activity color using [amount] as weight.
   */
  public fun setConnectionActivity(
    fromNode: StringName,
    fromPort: Int,
    toNode: StringName,
    toPort: Int,
    amount: Float,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to fromNode, LONG to fromPort.toLong(), STRING_NAME to toNode, LONG to toPort.toLong(), DOUBLE to amount.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setConnectionActivityPtr, NIL)
  }

  /**
   * Returns an [Array] containing the list of connections. A connection consists in a structure of
   * the form `{ from_port: 0, from_node: "GraphNode name 0", to_port: 1, to_node: "GraphNode name 1"
   * }`.
   */
  public fun getConnectionList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns the closest connection to the given point in screen space. If no connection is found
   * within [maxDistance] pixels, an empty [Dictionary] is returned.
   * A connection consists in a structure of the form `{ from_port: 0, from_node: "GraphNode name
   * 0", to_port: 1, to_node: "GraphNode name 1" }`.
   * For example, getting a connection at a given mouse position can be achieved like this:
   *
   * gdscript:
   * ```gdscript
   * var connection = get_closest_connection_at_point(mouse_event.get_position())
   * ```
   */
  @JvmOverloads
  public fun getClosestConnectionAtPoint(point: Vector2, maxDistance: Float = 4.0f):
      Dictionary<Any?, Any?> {
    TransferContext.writeArguments(VECTOR2 to point, DOUBLE to maxDistance.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestConnectionAtPointPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns an [Array] containing the list of connections that intersect with the given [Rect2]. A
   * connection consists in a structure of the form `{ from_port: 0, from_node: "GraphNode name 0",
   * to_port: 1, to_node: "GraphNode name 1" }`.
   */
  public fun getConnectionsIntersectingWithRect(rect: Rect2): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(RECT2 to rect)
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionsIntersectingWithRectPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Removes all connections between nodes.
   */
  public fun clearConnections(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearConnectionsPtr, NIL)
  }

  /**
   * Ends the creation of the current connection. In other words, if you are dragging a connection
   * you can use this method to abort the process and remove the line that followed your cursor.
   * This is best used together with [signal connection_drag_started] and [signal
   * connection_drag_ended] to add custom behavior like node addition through shortcuts.
   * **Note:** This method suppresses any other connection request signals apart from [signal
   * connection_drag_ended].
   */
  public fun forceConnectionDragEnd(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceConnectionDragEndPtr, NIL)
  }

  /**
   * Allows to disconnect nodes when dragging from the right port of the [GraphNode]'s slot if it
   * has the specified type. See also [removeValidRightDisconnectType].
   */
  public fun addValidRightDisconnectType(type: Int): Unit {
    TransferContext.writeArguments(LONG to type.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addValidRightDisconnectTypePtr, NIL)
  }

  /**
   * Disallows to disconnect nodes when dragging from the right port of the [GraphNode]'s slot if it
   * has the specified type. Use this to disable disconnection previously allowed with
   * [addValidRightDisconnectType].
   */
  public fun removeValidRightDisconnectType(type: Int): Unit {
    TransferContext.writeArguments(LONG to type.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeValidRightDisconnectTypePtr, NIL)
  }

  /**
   * Allows to disconnect nodes when dragging from the left port of the [GraphNode]'s slot if it has
   * the specified type. See also [removeValidLeftDisconnectType].
   */
  public fun addValidLeftDisconnectType(type: Int): Unit {
    TransferContext.writeArguments(LONG to type.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addValidLeftDisconnectTypePtr, NIL)
  }

  /**
   * Disallows to disconnect nodes when dragging from the left port of the [GraphNode]'s slot if it
   * has the specified type. Use this to disable disconnection previously allowed with
   * [addValidLeftDisconnectType].
   */
  public fun removeValidLeftDisconnectType(type: Int): Unit {
    TransferContext.writeArguments(LONG to type.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeValidLeftDisconnectTypePtr, NIL)
  }

  /**
   * Allows the connection between two different port types. The port type is defined individually
   * for the left and the right port of each slot with the [GraphNode.setSlot] method.
   * See also [isValidConnectionType] and [removeValidConnectionType].
   */
  public fun addValidConnectionType(fromType: Int, toType: Int): Unit {
    TransferContext.writeArguments(LONG to fromType.toLong(), LONG to toType.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addValidConnectionTypePtr, NIL)
  }

  /**
   * Disallows the connection between two different port types previously allowed by
   * [addValidConnectionType]. The port type is defined individually for the left and the right port of
   * each slot with the [GraphNode.setSlot] method.
   * See also [isValidConnectionType].
   */
  public fun removeValidConnectionType(fromType: Int, toType: Int): Unit {
    TransferContext.writeArguments(LONG to fromType.toLong(), LONG to toType.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeValidConnectionTypePtr, NIL)
  }

  /**
   * Returns whether it's possible to make a connection between two different port types. The port
   * type is defined individually for the left and the right port of each slot with the
   * [GraphNode.setSlot] method.
   * See also [addValidConnectionType] and [removeValidConnectionType].
   */
  public fun isValidConnectionType(fromType: Int, toType: Int): Boolean {
    TransferContext.writeArguments(LONG to fromType.toLong(), LONG to toType.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isValidConnectionTypePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the points which would make up a connection between [fromNode] and [toNode].
   */
  public fun getConnectionLine(fromNode: Vector2, toNode: Vector2): PackedVector2Array {
    TransferContext.writeArguments(VECTOR2 to fromNode, VECTOR2 to toNode)
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionLinePtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * Attaches the [element] [GraphElement] to the [frame] [GraphFrame].
   */
  public fun attachGraphElementToFrame(element: StringName, frame: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to element, STRING_NAME to frame)
    TransferContext.callMethod(rawPtr, MethodBindings.attachGraphElementToFramePtr, NIL)
  }

  /**
   * Detaches the [element] [GraphElement] from the [GraphFrame] it is currently attached to.
   */
  public fun detachGraphElementFromFrame(element: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to element)
    TransferContext.callMethod(rawPtr, MethodBindings.detachGraphElementFromFramePtr, NIL)
  }

  /**
   * Returns the [GraphFrame] that contains the [GraphElement] with the given name.
   */
  public fun getElementFrame(element: StringName): GraphFrame? {
    TransferContext.writeArguments(STRING_NAME to element)
    TransferContext.callMethod(rawPtr, MethodBindings.getElementFramePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as GraphFrame?)
  }

  /**
   * Returns an array of node names that are attached to the [GraphFrame] with the given name.
   */
  public fun getAttachedNodesOfFrame(frame: StringName): VariantArray<StringName> {
    TransferContext.writeArguments(STRING_NAME to frame)
    TransferContext.callMethod(rawPtr, MethodBindings.getAttachedNodesOfFramePtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<StringName>)
  }

  /**
   * Gets the [HBoxContainer] that contains the zooming and grid snap controls in the top left of
   * the graph. You can use this method to reposition the toolbar or to add your own custom controls to
   * it.
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [CanvasItem.visible] property.
   */
  public fun getMenuHbox(): HBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMenuHboxPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as HBoxContainer?)
  }

  /**
   * Rearranges selected nodes in a layout with minimum crossings between connections and uniform
   * horizontal and vertical gap between nodes.
   */
  public fun arrangeNodes(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.arrangeNodesPtr, NIL)
  }

  /**
   * Sets the specified [node] as the one selected.
   */
  public fun setSelected(node: Node): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.setSelectedPtr, NIL)
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
      public fun from(`value`: Long): PanningScheme = entries.single { it.id == `value` }
    }
  }

  public enum class GridPattern(
    id: Long,
  ) {
    /**
     * Draw the grid using solid lines.
     */
    GRID_PATTERN_LINES(0),
    /**
     * Draw the grid using dots.
     */
    GRID_PATTERN_DOTS(1),
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
    public val _isInInputHotzonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "_is_in_input_hotzone")

    public val _isInOutputHotzonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "_is_in_output_hotzone")

    public val _getConnectionLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "_get_connection_line")

    public val _isNodeHoverValidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "_is_node_hover_valid")

    public val connectNodePtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "connect_node")

    public val isNodeConnectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_node_connected")

    public val disconnectNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "disconnect_node")

    public val setConnectionActivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_connection_activity")

    public val getConnectionListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_connection_list")

    public val getClosestConnectionAtPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_closest_connection_at_point")

    public val getConnectionsIntersectingWithRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_connections_intersecting_with_rect")

    public val clearConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "clear_connections")

    public val forceConnectionDragEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "force_connection_drag_end")

    public val getScrollOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_scroll_offset")

    public val setScrollOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_scroll_offset")

    public val addValidRightDisconnectTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "add_valid_right_disconnect_type")

    public val removeValidRightDisconnectTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "remove_valid_right_disconnect_type")

    public val addValidLeftDisconnectTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "add_valid_left_disconnect_type")

    public val removeValidLeftDisconnectTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "remove_valid_left_disconnect_type")

    public val addValidConnectionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "add_valid_connection_type")

    public val removeValidConnectionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "remove_valid_connection_type")

    public val isValidConnectionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_valid_connection_type")

    public val getConnectionLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_connection_line")

    public val attachGraphElementToFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "attach_graph_element_to_frame")

    public val detachGraphElementFromFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "detach_graph_element_from_frame")

    public val getElementFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_element_frame")

    public val getAttachedNodesOfFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_attached_nodes_of_frame")

    public val setPanningSchemePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_panning_scheme")

    public val getPanningSchemePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_panning_scheme")

    public val setZoomPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "set_zoom")

    public val getZoomPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "get_zoom")

    public val setZoomMinPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "set_zoom_min")

    public val getZoomMinPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "get_zoom_min")

    public val setZoomMaxPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "set_zoom_max")

    public val getZoomMaxPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "get_zoom_max")

    public val setZoomStepPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "set_zoom_step")

    public val getZoomStepPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "get_zoom_step")

    public val setShowGridPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "set_show_grid")

    public val isShowingGridPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_showing_grid")

    public val setGridPatternPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_grid_pattern")

    public val getGridPatternPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_grid_pattern")

    public val setSnappingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_snapping_enabled")

    public val isSnappingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_snapping_enabled")

    public val setSnappingDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_snapping_distance")

    public val getSnappingDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_snapping_distance")

    public val setConnectionLinesCurvaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_connection_lines_curvature")

    public val getConnectionLinesCurvaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_connection_lines_curvature")

    public val setConnectionLinesThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_connection_lines_thickness")

    public val getConnectionLinesThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_connection_lines_thickness")

    public val setConnectionLinesAntialiasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_connection_lines_antialiased")

    public val isConnectionLinesAntialiasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_connection_lines_antialiased")

    public val setMinimapSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_minimap_size")

    public val getMinimapSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_minimap_size")

    public val setMinimapOpacityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_minimap_opacity")

    public val getMinimapOpacityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_minimap_opacity")

    public val setMinimapEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_minimap_enabled")

    public val isMinimapEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_minimap_enabled")

    public val setShowMenuPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "set_show_menu")

    public val isShowingMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_showing_menu")

    public val setShowZoomLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_show_zoom_label")

    public val isShowingZoomLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_showing_zoom_label")

    public val setShowGridButtonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_show_grid_buttons")

    public val isShowingGridButtonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_showing_grid_buttons")

    public val setShowZoomButtonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_show_zoom_buttons")

    public val isShowingZoomButtonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_showing_zoom_buttons")

    public val setShowMinimapButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_show_minimap_button")

    public val isShowingMinimapButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_showing_minimap_button")

    public val setShowArrangeButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_show_arrange_button")

    public val isShowingArrangeButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_showing_arrange_button")

    public val setRightDisconnectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_right_disconnects")

    public val isRightDisconnectsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_right_disconnects_enabled")

    public val getMenuHboxPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "get_menu_hbox")

    public val arrangeNodesPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "arrange_nodes")

    public val setSelectedPtr: VoidPtr = TypeManager.getMethodBindPtr("GraphEdit", "set_selected")
  }
}

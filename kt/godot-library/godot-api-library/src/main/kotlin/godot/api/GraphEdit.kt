// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Dictionary
import godot.core.Error
import godot.core.PackedVector2Array
import godot.core.Rect2
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal2
import godot.core.Signal3
import godot.core.Signal4
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.STRING_NAME
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.core.asCachedStringName
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * [GraphEdit] provides tools for creation, manipulation, and display of various graphs. Its main purpose in the engine is to power the visual programming systems, such as visual shaders, but it is also available for use in user projects.
 *
 * [GraphEdit] by itself is only an empty container, representing an infinite grid where [GraphNode]s can be placed. Each [GraphNode] represents a node in the graph, a single unit of data in the connected scheme. [GraphEdit], in turn, helps to control various interactions with nodes and between nodes. When the user attempts to connect, disconnect, or delete a [GraphNode], a signal is emitted in the [GraphEdit], but no action is taken by default. It is the responsibility of the programmer utilizing this control to implement the necessary logic to determine how each request should be handled.
 *
 * **Performance:** It is greatly advised to enable low-processor usage mode (see [OS.lowProcessorUsageMode]) when using GraphEdits.
 *
 * **Note:** Keep in mind that [Node.getChildren] will also return the connection layer node named `_connection_layer` due to technical limitations. This behavior may change in future releases.
 */
@GodotBaseType
public open class GraphEdit : Control() {
  /**
   * Emitted to the GraphEdit when the connection between the [fromPort] of the [fromNode] [GraphNode] and the [toPort] of the [toNode] [GraphNode] is attempted to be created.
   */
  public val connectionRequest: Signal4<StringName, Long, StringName, Long> by Signal4

  /**
   * Emitted to the GraphEdit when the connection between [fromPort] of [fromNode] [GraphNode] and [toPort] of [toNode] [GraphNode] is attempted to be removed.
   */
  public val disconnectionRequest: Signal4<StringName, Long, StringName, Long> by Signal4

  /**
   * Emitted when user drags a connection from an output port into the empty space of the graph.
   */
  public val connectionToEmpty: Signal3<StringName, Long, Vector2> by Signal3

  /**
   * Emitted when user drags a connection from an input port into the empty space of the graph.
   */
  public val connectionFromEmpty: Signal3<StringName, Long, Vector2> by Signal3

  /**
   * Emitted at the beginning of a connection drag.
   */
  public val connectionDragStarted: Signal3<StringName, Long, Boolean> by Signal3

  /**
   * Emitted at the end of a connection drag.
   */
  public val connectionDragEnded: Signal0 by Signal0

  /**
   * Emitted when this [GraphEdit] captures a `ui_copy` action ([kbd]Ctrl + C[/kbd] by default). In general, this signal indicates that the selected [GraphElement]s should be copied.
   */
  public val copyNodesRequest: Signal0 by Signal0

  /**
   * Emitted when this [GraphEdit] captures a `ui_cut` action ([kbd]Ctrl + X[/kbd] by default). In general, this signal indicates that the selected [GraphElement]s should be cut.
   */
  public val cutNodesRequest: Signal0 by Signal0

  /**
   * Emitted when this [GraphEdit] captures a `ui_paste` action ([kbd]Ctrl + V[/kbd] by default). In general, this signal indicates that previously copied [GraphElement]s should be pasted.
   */
  public val pasteNodesRequest: Signal0 by Signal0

  /**
   * Emitted when this [GraphEdit] captures a `ui_graph_duplicate` action ([kbd]Ctrl + D[/kbd] by default). In general, this signal indicates that the selected [GraphElement]s should be duplicated.
   */
  public val duplicateNodesRequest: Signal0 by Signal0

  /**
   * Emitted when this [GraphEdit] captures a `ui_graph_delete` action ([kbd]Delete[/kbd] by default).
   *
   * [nodes] is an array of node names that should be removed. These usually include all selected nodes.
   */
  public val deleteNodesRequest: Signal1<VariantArray<StringName>> by Signal1

  /**
   * Emitted when the given [GraphElement] node is selected.
   */
  public val nodeSelected: Signal1<Node> by Signal1

  /**
   * Emitted when the given [GraphElement] node is deselected.
   */
  public val nodeDeselected: Signal1<Node> by Signal1

  /**
   * Emitted when the [GraphFrame] [frame] is resized to [newRect].
   */
  public val frameRectChanged: Signal2<GraphFrame, Rect2> by Signal2

  /**
   * Emitted when a popup is requested. Happens on right-clicking in the GraphEdit. [atPosition] is the position of the mouse pointer when the signal is sent.
   */
  public val popupRequest: Signal1<Vector2> by Signal1

  /**
   * Emitted at the beginning of a [GraphElement]'s movement.
   */
  public val beginNodeMove: Signal0 by Signal0

  /**
   * Emitted at the end of a [GraphElement]'s movement.
   */
  public val endNodeMove: Signal0 by Signal0

  /**
   * Emitted when one or more [GraphElement]s are dropped onto the [GraphFrame] named [frame], when they were not previously attached to any other one.
   *
   * [elements] is an array of [GraphElement]s to be attached.
   */
  public val graphElementsLinkedToFrameRequest: Signal2<VariantArray<Any?>, StringName> by Signal2

  /**
   * Emitted when the scroll offset is changed by the user. It will not be emitted when changed in code.
   */
  public val scrollOffsetChanged: Signal1<Vector2> by Signal1

  /**
   * The scroll offset.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var scrollOffset: Vector2
    @JvmName("scrollOffsetProperty")
    get() = getScrollOffset()
    @JvmName("scrollOffsetProperty")
    set(`value`) {
      setScrollOffset(value)
    }

  /**
   * If `true`, the grid is visible.
   */
  public final inline var showGrid: Boolean
    @JvmName("showGridProperty")
    get() = isShowingGrid()
    @JvmName("showGridProperty")
    set(`value`) {
      setShowGrid(value)
    }

  /**
   * The pattern used for drawing the grid.
   */
  public final inline var gridPattern: GridPattern
    @JvmName("gridPatternProperty")
    get() = getGridPattern()
    @JvmName("gridPatternProperty")
    set(`value`) {
      setGridPattern(value)
    }

  /**
   * If `true`, enables snapping.
   */
  public final inline var snappingEnabled: Boolean
    @JvmName("snappingEnabledProperty")
    get() = isSnappingEnabled()
    @JvmName("snappingEnabledProperty")
    set(`value`) {
      setSnappingEnabled(value)
    }

  /**
   * The snapping distance in pixels, also determines the grid line distance.
   */
  public final inline var snappingDistance: Int
    @JvmName("snappingDistanceProperty")
    get() = getSnappingDistance()
    @JvmName("snappingDistanceProperty")
    set(`value`) {
      setSnappingDistance(value)
    }

  /**
   * Defines the control scheme for panning with mouse wheel.
   */
  public final inline var panningScheme: PanningScheme
    @JvmName("panningSchemeProperty")
    get() = getPanningScheme()
    @JvmName("panningSchemeProperty")
    set(`value`) {
      setPanningScheme(value)
    }

  /**
   * If `true`, enables disconnection of existing connections in the GraphEdit by dragging the right end.
   */
  public final inline var rightDisconnects: Boolean
    @JvmName("rightDisconnectsProperty")
    get() = isRightDisconnectsEnabled()
    @JvmName("rightDisconnectsProperty")
    set(`value`) {
      setRightDisconnects(value)
    }

  /**
   * The curvature of the lines between the nodes. 0 results in straight lines.
   */
  public final inline var connectionLinesCurvature: Float
    @JvmName("connectionLinesCurvatureProperty")
    get() = getConnectionLinesCurvature()
    @JvmName("connectionLinesCurvatureProperty")
    set(`value`) {
      setConnectionLinesCurvature(value)
    }

  /**
   * The thickness of the lines between the nodes.
   */
  public final inline var connectionLinesThickness: Float
    @JvmName("connectionLinesThicknessProperty")
    get() = getConnectionLinesThickness()
    @JvmName("connectionLinesThicknessProperty")
    set(`value`) {
      setConnectionLinesThickness(value)
    }

  /**
   * If `true`, the lines between nodes will use antialiasing.
   */
  public final inline var connectionLinesAntialiased: Boolean
    @JvmName("connectionLinesAntialiasedProperty")
    get() = isConnectionLinesAntialiased()
    @JvmName("connectionLinesAntialiasedProperty")
    set(`value`) {
      setConnectionLinesAntialiased(value)
    }

  /**
   * The connections between [GraphNode]s.
   *
   * A connection is represented as a [Dictionary] in the form of:
   *
   * ```
   * {
   *     from_node: StringName,
   *     from_port: int,
   *     to_node: StringName,
   *     to_port: int,
   *     keep_alive: bool
   * }
   * ```
   *
   * Connections with `keep_alive` set to `false` may be deleted automatically if invalid during a redraw.
   */
  public final inline var connections: VariantArray<Dictionary<Any?, Any?>>
    @JvmName("connectionsProperty")
    get() = getConnectionList()
    @JvmName("connectionsProperty")
    set(`value`) {
      setConnections(value)
    }

  /**
   * The current zoom value.
   */
  public final inline var zoom: Float
    @JvmName("zoomProperty")
    get() = getZoom()
    @JvmName("zoomProperty")
    set(`value`) {
      setZoom(value)
    }

  /**
   * The lower zoom limit.
   */
  public final inline var zoomMin: Float
    @JvmName("zoomMinProperty")
    get() = getZoomMin()
    @JvmName("zoomMinProperty")
    set(`value`) {
      setZoomMin(value)
    }

  /**
   * The upper zoom limit.
   */
  public final inline var zoomMax: Float
    @JvmName("zoomMaxProperty")
    get() = getZoomMax()
    @JvmName("zoomMaxProperty")
    set(`value`) {
      setZoomMax(value)
    }

  /**
   * The step of each zoom level.
   */
  public final inline var zoomStep: Float
    @JvmName("zoomStepProperty")
    get() = getZoomStep()
    @JvmName("zoomStepProperty")
    set(`value`) {
      setZoomStep(value)
    }

  /**
   * If `true`, the minimap is visible.
   */
  public final inline var minimapEnabled: Boolean
    @JvmName("minimapEnabledProperty")
    get() = isMinimapEnabled()
    @JvmName("minimapEnabledProperty")
    set(`value`) {
      setMinimapEnabled(value)
    }

  /**
   * The size of the minimap rectangle. The map itself is based on the size of the grid area and is scaled to fit this rectangle.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var minimapSize: Vector2
    @JvmName("minimapSizeProperty")
    get() = getMinimapSize()
    @JvmName("minimapSizeProperty")
    set(`value`) {
      setMinimapSize(value)
    }

  /**
   * The opacity of the minimap rectangle.
   */
  public final inline var minimapOpacity: Float
    @JvmName("minimapOpacityProperty")
    get() = getMinimapOpacity()
    @JvmName("minimapOpacityProperty")
    set(`value`) {
      setMinimapOpacity(value)
    }

  /**
   * If `true`, the menu toolbar is visible.
   */
  public final inline var showMenu: Boolean
    @JvmName("showMenuProperty")
    get() = isShowingMenu()
    @JvmName("showMenuProperty")
    set(`value`) {
      setShowMenu(value)
    }

  /**
   * If `true`, the label with the current zoom level is visible. The zoom level is displayed in percents.
   */
  public final inline var showZoomLabel: Boolean
    @JvmName("showZoomLabelProperty")
    get() = isShowingZoomLabel()
    @JvmName("showZoomLabelProperty")
    set(`value`) {
      setShowZoomLabel(value)
    }

  /**
   * If `true`, buttons that allow to change and reset the zoom level are visible.
   */
  public final inline var showZoomButtons: Boolean
    @JvmName("showZoomButtonsProperty")
    get() = isShowingZoomButtons()
    @JvmName("showZoomButtonsProperty")
    set(`value`) {
      setShowZoomButtons(value)
    }

  /**
   * If `true`, buttons that allow to configure grid and snapping options are visible.
   */
  public final inline var showGridButtons: Boolean
    @JvmName("showGridButtonsProperty")
    get() = isShowingGridButtons()
    @JvmName("showGridButtonsProperty")
    set(`value`) {
      setShowGridButtons(value)
    }

  /**
   * If `true`, the button to toggle the minimap is visible.
   */
  public final inline var showMinimapButton: Boolean
    @JvmName("showMinimapButtonProperty")
    get() = isShowingMinimapButton()
    @JvmName("showMinimapButtonProperty")
    set(`value`) {
      setShowMinimapButton(value)
    }

  /**
   * If `true`, the button to automatically arrange graph nodes is visible.
   */
  public final inline var showArrangeButton: Boolean
    @JvmName("showArrangeButtonProperty")
    get() = isShowingArrangeButton()
    @JvmName("showArrangeButtonProperty")
    set(`value`) {
      setShowArrangeButton(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(262, scriptIndex)
  }

  /**
   * This is a helper function for [scrollOffset] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = graphedit.scrollOffset
   * //Your changes
   * graphedit.scrollOffset = myCoreType
   * ``````
   *
   * The scroll offset.
   */
  @CoreTypeHelper
  public final fun scrollOffsetMutate(block: Vector2.() -> Unit): Vector2 = scrollOffset.apply {
     block(this)
     scrollOffset = this
  }

  /**
   * This is a helper function for [minimapSize] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = graphedit.minimapSize
   * //Your changes
   * graphedit.minimapSize = myCoreType
   * ``````
   *
   * The size of the minimap rectangle. The map itself is based on the size of the grid area and is scaled to fit this rectangle.
   */
  @CoreTypeHelper
  public final fun minimapSizeMutate(block: Vector2.() -> Unit): Vector2 = minimapSize.apply {
     block(this)
     minimapSize = this
  }

  /**
   * Returns whether the [mousePosition] is in the input hot zone.
   *
   * By default, a hot zone is a [Rect2] positioned such that its center is at [inNode].[GraphNode.getInputPortPosition]([inPort]) (For output's case, call [GraphNode.getOutputPortPosition] instead). The hot zone's width is twice the Theme Property `port_grab_distance_horizontal`, and its height is twice the `port_grab_distance_vertical`.
   *
   * Below is a sample code to help get started:
   *
   * ```
   * func _is_in_input_hotzone(in_node, in_port, mouse_position):
   *     var port_size = Vector2(get_theme_constant("port_grab_distance_horizontal"), get_theme_constant("port_grab_distance_vertical"))
   *     var port_pos = in_node.get_position() + in_node.get_input_port_position(in_port) - port_size / 2
   *     var rect = Rect2(port_pos, port_size)
   *
   *     return rect.has_point(mouse_position)
   * ```
   */
  public open fun _isInInputHotzone(
    inNode: Object?,
    inPort: Int,
    mousePosition: Vector2,
  ): Boolean {
    throw NotImplementedError("_isInInputHotzone is not implemented for GraphEdit")
  }

  /**
   * Returns whether the [mousePosition] is in the output hot zone. For more information on hot zones, see [_isInInputHotzone].
   *
   * Below is a sample code to help get started:
   *
   * ```
   * func _is_in_output_hotzone(in_node, in_port, mouse_position):
   *     var port_size = Vector2(get_theme_constant("port_grab_distance_horizontal"), get_theme_constant("port_grab_distance_vertical"))
   *     var port_pos = in_node.get_position() + in_node.get_output_port_position(in_port) - port_size / 2
   *     var rect = Rect2(port_pos, port_size)
   *
   *     return rect.has_point(mouse_position)
   * ```
   */
  public open fun _isInOutputHotzone(
    inNode: Object?,
    inPort: Int,
    mousePosition: Vector2,
  ): Boolean {
    throw NotImplementedError("_isInOutputHotzone is not implemented for GraphEdit")
  }

  /**
   * Virtual method which can be overridden to customize how connections are drawn.
   */
  public open fun _getConnectionLine(fromPosition: Vector2, toPosition: Vector2): PackedVector2Array {
    throw NotImplementedError("_getConnectionLine is not implemented for GraphEdit")
  }

  /**
   * This virtual method can be used to insert additional error detection while the user is dragging a connection over a valid port.
   *
   * Return `true` if the connection is indeed valid or return `false` if the connection is impossible. If the connection is impossible, no snapping to the port and thus no connection request to that port will happen.
   *
   * In this example a connection to same node is suppressed:
   *
   * ```gdscript
   * //gdscript
   * func _is_node_hover_valid(from, from_port, to, to_port):
   *     return from != to
   * ```
   *
   * ```csharp
   * //csharp
   * public override bool _IsNodeHoverValid(StringName fromNode, int fromPort, StringName toNode, int toPort)
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
    throw NotImplementedError("_isNodeHoverValid is not implemented for GraphEdit")
  }

  /**
   * Create a connection between the [fromPort] of the [fromNode] [GraphNode] and the [toPort] of the [toNode] [GraphNode]. If the connection already exists, no connection is created.
   *
   * Connections with [keepAlive] set to `false` may be deleted automatically if invalid during a redraw.
   */
  @JvmOverloads
  public final fun connectNode(
    fromNode: StringName,
    fromPort: Int,
    toNode: StringName,
    toPort: Int,
    keepAlive: Boolean = false,
  ): Error {
    TransferContext.writeArguments(STRING_NAME to fromNode, LONG to fromPort.toLong(), STRING_NAME to toNode, LONG to toPort.toLong(), BOOL to keepAlive)
    TransferContext.callMethod(ptr, MethodBindings.connectNodePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the [fromPort] of the [fromNode] [GraphNode] is connected to the [toPort] of the [toNode] [GraphNode].
   */
  public final fun isNodeConnected(
    fromNode: StringName,
    fromPort: Int,
    toNode: StringName,
    toPort: Int,
  ): Boolean {
    TransferContext.writeArguments(STRING_NAME to fromNode, LONG to fromPort.toLong(), STRING_NAME to toNode, LONG to toPort.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isNodeConnectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Removes the connection between the [fromPort] of the [fromNode] [GraphNode] and the [toPort] of the [toNode] [GraphNode]. If the connection does not exist, no connection is removed.
   */
  public final fun disconnectNode(
    fromNode: StringName,
    fromPort: Int,
    toNode: StringName,
    toPort: Int,
  ) {
    TransferContext.writeArguments(STRING_NAME to fromNode, LONG to fromPort.toLong(), STRING_NAME to toNode, LONG to toPort.toLong())
    TransferContext.callMethod(ptr, MethodBindings.disconnectNodePtr, NIL)
  }

  /**
   * Sets the coloration of the connection between [fromNode]'s [fromPort] and [toNode]'s [toPort] with the color provided in the [theme_item activity] theme property. The color is linearly interpolated between the connection color and the activity color using [amount] as weight.
   */
  public final fun setConnectionActivity(
    fromNode: StringName,
    fromPort: Int,
    toNode: StringName,
    toPort: Int,
    amount: Float,
  ) {
    TransferContext.writeArguments(STRING_NAME to fromNode, LONG to fromPort.toLong(), STRING_NAME to toNode, LONG to toPort.toLong(), DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setConnectionActivityPtr, NIL)
  }

  public final fun setConnections(connections: VariantArray<Dictionary<Any?, Any?>>) {
    TransferContext.writeArguments(ARRAY to connections)
    TransferContext.callMethod(ptr, MethodBindings.setConnectionsPtr, NIL)
  }

  public final fun getConnectionList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConnectionListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns the number of connections from [fromPort] of [fromNode].
   */
  public final fun getConnectionCount(fromNode: StringName, fromPort: Int): Int {
    TransferContext.writeArguments(STRING_NAME to fromNode, LONG to fromPort.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getConnectionCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the closest connection to the given point in screen space. If no connection is found within [maxDistance] pixels, an empty [Dictionary] is returned.
   *
   * A connection is represented as a [Dictionary] in the form of:
   *
   * ```
   * {
   *     from_node: StringName,
   *     from_port: int,
   *     to_node: StringName,
   *     to_port: int,
   *     keep_alive: bool
   * }
   * ```
   *
   * For example, getting a connection at a given mouse position can be achieved like this:
   *
   * ```gdscript
   * //gdscript
   * var connection = get_closest_connection_at_point(mouse_event.get_position())
   * ```
   */
  @JvmOverloads
  public final fun getClosestConnectionAtPoint(point: Vector2, maxDistance: Float = 4.0f): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(VECTOR2 to point, DOUBLE to maxDistance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.getClosestConnectionAtPointPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns an [Array] containing the list of connections that intersect with the given [Rect2].
   *
   * A connection is represented as a [Dictionary] in the form of:
   *
   * ```
   * {
   *     from_node: StringName,
   *     from_port: int,
   *     to_node: StringName,
   *     to_port: int,
   *     keep_alive: bool
   * }
   * ```
   */
  public final fun getConnectionsIntersectingWithRect(rect: Rect2): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(RECT2 to rect)
    TransferContext.callMethod(ptr, MethodBindings.getConnectionsIntersectingWithRectPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Removes all connections between nodes.
   */
  public final fun clearConnections() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearConnectionsPtr, NIL)
  }

  /**
   * Ends the creation of the current connection. In other words, if you are dragging a connection you can use this method to abort the process and remove the line that followed your cursor.
   *
   * This is best used together with [signal connection_drag_started] and [signal connection_drag_ended] to add custom behavior like node addition through shortcuts.
   *
   * **Note:** This method suppresses any other connection request signals apart from [signal connection_drag_ended].
   */
  public final fun forceConnectionDragEnd() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.forceConnectionDragEndPtr, NIL)
  }

  public final fun getScrollOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getScrollOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setScrollOffset(offset: Vector2) {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(ptr, MethodBindings.setScrollOffsetPtr, NIL)
  }

  /**
   * Allows to disconnect nodes when dragging from the right port of the [GraphNode]'s slot if it has the specified type. See also [removeValidRightDisconnectType].
   */
  public final fun addValidRightDisconnectType(type: Int) {
    TransferContext.writeArguments(LONG to type.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addValidRightDisconnectTypePtr, NIL)
  }

  /**
   * Disallows to disconnect nodes when dragging from the right port of the [GraphNode]'s slot if it has the specified type. Use this to disable disconnection previously allowed with [addValidRightDisconnectType].
   */
  public final fun removeValidRightDisconnectType(type: Int) {
    TransferContext.writeArguments(LONG to type.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeValidRightDisconnectTypePtr, NIL)
  }

  /**
   * Allows to disconnect nodes when dragging from the left port of the [GraphNode]'s slot if it has the specified type. See also [removeValidLeftDisconnectType].
   */
  public final fun addValidLeftDisconnectType(type: Int) {
    TransferContext.writeArguments(LONG to type.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addValidLeftDisconnectTypePtr, NIL)
  }

  /**
   * Disallows to disconnect nodes when dragging from the left port of the [GraphNode]'s slot if it has the specified type. Use this to disable disconnection previously allowed with [addValidLeftDisconnectType].
   */
  public final fun removeValidLeftDisconnectType(type: Int) {
    TransferContext.writeArguments(LONG to type.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeValidLeftDisconnectTypePtr, NIL)
  }

  /**
   * Allows the connection between two different port types. The port type is defined individually for the left and the right port of each slot with the [GraphNode.setSlot] method.
   *
   * See also [isValidConnectionType] and [removeValidConnectionType].
   */
  public final fun addValidConnectionType(fromType: Int, toType: Int) {
    TransferContext.writeArguments(LONG to fromType.toLong(), LONG to toType.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addValidConnectionTypePtr, NIL)
  }

  /**
   * Disallows the connection between two different port types previously allowed by [addValidConnectionType]. The port type is defined individually for the left and the right port of each slot with the [GraphNode.setSlot] method.
   *
   * See also [isValidConnectionType].
   */
  public final fun removeValidConnectionType(fromType: Int, toType: Int) {
    TransferContext.writeArguments(LONG to fromType.toLong(), LONG to toType.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeValidConnectionTypePtr, NIL)
  }

  /**
   * Returns whether it's possible to make a connection between two different port types. The port type is defined individually for the left and the right port of each slot with the [GraphNode.setSlot] method.
   *
   * See also [addValidConnectionType] and [removeValidConnectionType].
   */
  public final fun isValidConnectionType(fromType: Int, toType: Int): Boolean {
    TransferContext.writeArguments(LONG to fromType.toLong(), LONG to toType.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isValidConnectionTypePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the points which would make up a connection between [fromNode] and [toNode].
   */
  public final fun getConnectionLine(fromNode: Vector2, toNode: Vector2): PackedVector2Array {
    TransferContext.writeArguments(VECTOR2 to fromNode, VECTOR2 to toNode)
    TransferContext.callMethod(ptr, MethodBindings.getConnectionLinePtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * Attaches the [element] [GraphElement] to the [frame] [GraphFrame].
   */
  public final fun attachGraphElementToFrame(element: StringName, frame: StringName) {
    TransferContext.writeArguments(STRING_NAME to element, STRING_NAME to frame)
    TransferContext.callMethod(ptr, MethodBindings.attachGraphElementToFramePtr, NIL)
  }

  /**
   * Detaches the [element] [GraphElement] from the [GraphFrame] it is currently attached to.
   */
  public final fun detachGraphElementFromFrame(element: StringName) {
    TransferContext.writeArguments(STRING_NAME to element)
    TransferContext.callMethod(ptr, MethodBindings.detachGraphElementFromFramePtr, NIL)
  }

  /**
   * Returns the [GraphFrame] that contains the [GraphElement] with the given name.
   */
  public final fun getElementFrame(element: StringName): GraphFrame? {
    TransferContext.writeArguments(STRING_NAME to element)
    TransferContext.callMethod(ptr, MethodBindings.getElementFramePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as GraphFrame?)
  }

  /**
   * Returns an array of node names that are attached to the [GraphFrame] with the given name.
   */
  public final fun getAttachedNodesOfFrame(frame: StringName): VariantArray<StringName> {
    TransferContext.writeArguments(STRING_NAME to frame)
    TransferContext.callMethod(ptr, MethodBindings.getAttachedNodesOfFramePtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<StringName>)
  }

  public final fun setPanningScheme(scheme: PanningScheme) {
    TransferContext.writeArguments(LONG to scheme.id)
    TransferContext.callMethod(ptr, MethodBindings.setPanningSchemePtr, NIL)
  }

  public final fun getPanningScheme(): PanningScheme {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPanningSchemePtr, LONG)
    return PanningScheme.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setZoom(zoom: Float) {
    TransferContext.writeArguments(DOUBLE to zoom.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setZoomPtr, NIL)
  }

  public final fun getZoom(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getZoomPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setZoomMin(zoomMin: Float) {
    TransferContext.writeArguments(DOUBLE to zoomMin.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setZoomMinPtr, NIL)
  }

  public final fun getZoomMin(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getZoomMinPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setZoomMax(zoomMax: Float) {
    TransferContext.writeArguments(DOUBLE to zoomMax.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setZoomMaxPtr, NIL)
  }

  public final fun getZoomMax(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getZoomMaxPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setZoomStep(zoomStep: Float) {
    TransferContext.writeArguments(DOUBLE to zoomStep.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setZoomStepPtr, NIL)
  }

  public final fun getZoomStep(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getZoomStepPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setShowGrid(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setShowGridPtr, NIL)
  }

  public final fun isShowingGrid(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isShowingGridPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setGridPattern(pattern: GridPattern) {
    TransferContext.writeArguments(LONG to pattern.id)
    TransferContext.callMethod(ptr, MethodBindings.setGridPatternPtr, NIL)
  }

  public final fun getGridPattern(): GridPattern {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGridPatternPtr, LONG)
    return GridPattern.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSnappingEnabled(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setSnappingEnabledPtr, NIL)
  }

  public final fun isSnappingEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSnappingEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSnappingDistance(pixels: Int) {
    TransferContext.writeArguments(LONG to pixels.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSnappingDistancePtr, NIL)
  }

  public final fun getSnappingDistance(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSnappingDistancePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setConnectionLinesCurvature(curvature: Float) {
    TransferContext.writeArguments(DOUBLE to curvature.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setConnectionLinesCurvaturePtr, NIL)
  }

  public final fun getConnectionLinesCurvature(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConnectionLinesCurvaturePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setConnectionLinesThickness(pixels: Float) {
    TransferContext.writeArguments(DOUBLE to pixels.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setConnectionLinesThicknessPtr, NIL)
  }

  public final fun getConnectionLinesThickness(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConnectionLinesThicknessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setConnectionLinesAntialiased(pixels: Boolean) {
    TransferContext.writeArguments(BOOL to pixels)
    TransferContext.callMethod(ptr, MethodBindings.setConnectionLinesAntialiasedPtr, NIL)
  }

  public final fun isConnectionLinesAntialiased(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isConnectionLinesAntialiasedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMinimapSize(size: Vector2) {
    TransferContext.writeArguments(VECTOR2 to size)
    TransferContext.callMethod(ptr, MethodBindings.setMinimapSizePtr, NIL)
  }

  public final fun getMinimapSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMinimapSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setMinimapOpacity(opacity: Float) {
    TransferContext.writeArguments(DOUBLE to opacity.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMinimapOpacityPtr, NIL)
  }

  public final fun getMinimapOpacity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMinimapOpacityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMinimapEnabled(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setMinimapEnabledPtr, NIL)
  }

  public final fun isMinimapEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isMinimapEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setShowMenu(hidden: Boolean) {
    TransferContext.writeArguments(BOOL to hidden)
    TransferContext.callMethod(ptr, MethodBindings.setShowMenuPtr, NIL)
  }

  public final fun isShowingMenu(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isShowingMenuPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setShowZoomLabel(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setShowZoomLabelPtr, NIL)
  }

  public final fun isShowingZoomLabel(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isShowingZoomLabelPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setShowGridButtons(hidden: Boolean) {
    TransferContext.writeArguments(BOOL to hidden)
    TransferContext.callMethod(ptr, MethodBindings.setShowGridButtonsPtr, NIL)
  }

  public final fun isShowingGridButtons(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isShowingGridButtonsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setShowZoomButtons(hidden: Boolean) {
    TransferContext.writeArguments(BOOL to hidden)
    TransferContext.callMethod(ptr, MethodBindings.setShowZoomButtonsPtr, NIL)
  }

  public final fun isShowingZoomButtons(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isShowingZoomButtonsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setShowMinimapButton(hidden: Boolean) {
    TransferContext.writeArguments(BOOL to hidden)
    TransferContext.callMethod(ptr, MethodBindings.setShowMinimapButtonPtr, NIL)
  }

  public final fun isShowingMinimapButton(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isShowingMinimapButtonPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setShowArrangeButton(hidden: Boolean) {
    TransferContext.writeArguments(BOOL to hidden)
    TransferContext.callMethod(ptr, MethodBindings.setShowArrangeButtonPtr, NIL)
  }

  public final fun isShowingArrangeButton(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isShowingArrangeButtonPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setRightDisconnects(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setRightDisconnectsPtr, NIL)
  }

  public final fun isRightDisconnectsEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isRightDisconnectsEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Gets the [HBoxContainer] that contains the zooming and grid snap controls in the top left of the graph. You can use this method to reposition the toolbar or to add your own custom controls to it.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [CanvasItem.visible] property.
   */
  public final fun getMenuHbox(): HBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMenuHboxPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as HBoxContainer?)
  }

  /**
   * Rearranges selected nodes in a layout with minimum crossings between connections and uniform horizontal and vertical gap between nodes.
   */
  public final fun arrangeNodes() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.arrangeNodesPtr, NIL)
  }

  /**
   * Sets the specified [node] as the one selected.
   */
  public final fun setSelected(node: Node?) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(ptr, MethodBindings.setSelectedPtr, NIL)
  }

  /**
   * Create a connection between the [fromPort] of the [fromNode] [GraphNode] and the [toPort] of the [toNode] [GraphNode]. If the connection already exists, no connection is created.
   *
   * Connections with [keepAlive] set to `false` may be deleted automatically if invalid during a redraw.
   */
  @JvmOverloads
  public final fun connectNode(
    fromNode: String,
    fromPort: Int,
    toNode: String,
    toPort: Int,
    keepAlive: Boolean = false,
  ): Error = connectNode(fromNode.asCachedStringName(), fromPort, toNode.asCachedStringName(), toPort, keepAlive)

  /**
   * Returns `true` if the [fromPort] of the [fromNode] [GraphNode] is connected to the [toPort] of the [toNode] [GraphNode].
   */
  public final fun isNodeConnected(
    fromNode: String,
    fromPort: Int,
    toNode: String,
    toPort: Int,
  ): Boolean = isNodeConnected(fromNode.asCachedStringName(), fromPort, toNode.asCachedStringName(), toPort)

  /**
   * Removes the connection between the [fromPort] of the [fromNode] [GraphNode] and the [toPort] of the [toNode] [GraphNode]. If the connection does not exist, no connection is removed.
   */
  public final fun disconnectNode(
    fromNode: String,
    fromPort: Int,
    toNode: String,
    toPort: Int,
  ): Unit = disconnectNode(fromNode.asCachedStringName(), fromPort, toNode.asCachedStringName(), toPort)

  /**
   * Sets the coloration of the connection between [fromNode]'s [fromPort] and [toNode]'s [toPort] with the color provided in the [theme_item activity] theme property. The color is linearly interpolated between the connection color and the activity color using [amount] as weight.
   */
  public final fun setConnectionActivity(
    fromNode: String,
    fromPort: Int,
    toNode: String,
    toPort: Int,
    amount: Float,
  ): Unit = setConnectionActivity(fromNode.asCachedStringName(), fromPort, toNode.asCachedStringName(), toPort, amount)

  /**
   * Returns the number of connections from [fromPort] of [fromNode].
   */
  public final fun getConnectionCount(fromNode: String, fromPort: Int): Int = getConnectionCount(fromNode.asCachedStringName(), fromPort)

  /**
   * Attaches the [element] [GraphElement] to the [frame] [GraphFrame].
   */
  public final fun attachGraphElementToFrame(element: String, frame: String): Unit = attachGraphElementToFrame(element.asCachedStringName(), frame.asCachedStringName())

  /**
   * Detaches the [element] [GraphElement] from the [GraphFrame] it is currently attached to.
   */
  public final fun detachGraphElementFromFrame(element: String): Unit = detachGraphElementFromFrame(element.asCachedStringName())

  /**
   * Returns the [GraphFrame] that contains the [GraphElement] with the given name.
   */
  public final fun getElementFrame(element: String): GraphFrame? = getElementFrame(element.asCachedStringName())

  /**
   * Returns an array of node names that are attached to the [GraphFrame] with the given name.
   */
  public final fun getAttachedNodesOfFrame(frame: String): VariantArray<StringName> = getAttachedNodesOfFrame(frame.asCachedStringName())

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
    LINES(0),
    /**
     * Draw the grid using dots.
     */
    DOTS(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): GridPattern = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val connectNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "connect_node", 1_376_144_231)

    internal val isNodeConnectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_node_connected", 4_216_241_294)

    internal val disconnectNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "disconnect_node", 1_933_654_315)

    internal val setConnectionActivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_connection_activity", 1_141_899_943)

    internal val setConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_connections", 381_264_803)

    internal val getConnectionListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_connection_list", 3_995_934_104)

    internal val getConnectionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_connection_count", 861_718_734)

    internal val getClosestConnectionAtPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_closest_connection_at_point", 453_879_819)

    internal val getConnectionsIntersectingWithRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_connections_intersecting_with_rect", 2_709_748_719)

    internal val clearConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "clear_connections", 3_218_959_716)

    internal val forceConnectionDragEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "force_connection_drag_end", 3_218_959_716)

    internal val getScrollOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_scroll_offset", 3_341_600_327)

    internal val setScrollOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_scroll_offset", 743_155_724)

    internal val addValidRightDisconnectTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "add_valid_right_disconnect_type", 1_286_410_249)

    internal val removeValidRightDisconnectTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "remove_valid_right_disconnect_type", 1_286_410_249)

    internal val addValidLeftDisconnectTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "add_valid_left_disconnect_type", 1_286_410_249)

    internal val removeValidLeftDisconnectTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "remove_valid_left_disconnect_type", 1_286_410_249)

    internal val addValidConnectionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "add_valid_connection_type", 3_937_882_851)

    internal val removeValidConnectionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "remove_valid_connection_type", 3_937_882_851)

    internal val isValidConnectionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_valid_connection_type", 2_522_259_332)

    internal val getConnectionLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_connection_line", 3_932_192_302)

    internal val attachGraphElementToFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "attach_graph_element_to_frame", 3_740_211_285)

    internal val detachGraphElementFromFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "detach_graph_element_from_frame", 3_304_788_590)

    internal val getElementFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_element_frame", 988_084_372)

    internal val getAttachedNodesOfFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_attached_nodes_of_frame", 689_397_652)

    internal val setPanningSchemePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_panning_scheme", 18_893_313)

    internal val getPanningSchemePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_panning_scheme", 549_924_446)

    internal val setZoomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_zoom", 373_806_689)

    internal val getZoomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_zoom", 1_740_695_150)

    internal val setZoomMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_zoom_min", 373_806_689)

    internal val getZoomMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_zoom_min", 1_740_695_150)

    internal val setZoomMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_zoom_max", 373_806_689)

    internal val getZoomMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_zoom_max", 1_740_695_150)

    internal val setZoomStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_zoom_step", 373_806_689)

    internal val getZoomStepPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_zoom_step", 1_740_695_150)

    internal val setShowGridPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_show_grid", 2_586_408_642)

    internal val isShowingGridPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_showing_grid", 36_873_697)

    internal val setGridPatternPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_grid_pattern", 1_074_098_205)

    internal val getGridPatternPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_grid_pattern", 1_286_127_528)

    internal val setSnappingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_snapping_enabled", 2_586_408_642)

    internal val isSnappingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_snapping_enabled", 36_873_697)

    internal val setSnappingDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_snapping_distance", 1_286_410_249)

    internal val getSnappingDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_snapping_distance", 3_905_245_786)

    internal val setConnectionLinesCurvaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_connection_lines_curvature", 373_806_689)

    internal val getConnectionLinesCurvaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_connection_lines_curvature", 1_740_695_150)

    internal val setConnectionLinesThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_connection_lines_thickness", 373_806_689)

    internal val getConnectionLinesThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_connection_lines_thickness", 1_740_695_150)

    internal val setConnectionLinesAntialiasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_connection_lines_antialiased", 2_586_408_642)

    internal val isConnectionLinesAntialiasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_connection_lines_antialiased", 36_873_697)

    internal val setMinimapSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_minimap_size", 743_155_724)

    internal val getMinimapSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_minimap_size", 3_341_600_327)

    internal val setMinimapOpacityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_minimap_opacity", 373_806_689)

    internal val getMinimapOpacityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_minimap_opacity", 1_740_695_150)

    internal val setMinimapEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_minimap_enabled", 2_586_408_642)

    internal val isMinimapEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_minimap_enabled", 36_873_697)

    internal val setShowMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_show_menu", 2_586_408_642)

    internal val isShowingMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_showing_menu", 36_873_697)

    internal val setShowZoomLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_show_zoom_label", 2_586_408_642)

    internal val isShowingZoomLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_showing_zoom_label", 36_873_697)

    internal val setShowGridButtonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_show_grid_buttons", 2_586_408_642)

    internal val isShowingGridButtonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_showing_grid_buttons", 36_873_697)

    internal val setShowZoomButtonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_show_zoom_buttons", 2_586_408_642)

    internal val isShowingZoomButtonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_showing_zoom_buttons", 36_873_697)

    internal val setShowMinimapButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_show_minimap_button", 2_586_408_642)

    internal val isShowingMinimapButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_showing_minimap_button", 36_873_697)

    internal val setShowArrangeButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_show_arrange_button", 2_586_408_642)

    internal val isShowingArrangeButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_showing_arrange_button", 36_873_697)

    internal val setRightDisconnectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_right_disconnects", 2_586_408_642)

    internal val isRightDisconnectsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "is_right_disconnects_enabled", 36_873_697)

    internal val getMenuHboxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "get_menu_hbox", 3_590_609_951)

    internal val arrangeNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "arrange_nodes", 3_218_959_716)

    internal val setSelectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GraphEdit", "set_selected", 1_078_189_570)
  }
}

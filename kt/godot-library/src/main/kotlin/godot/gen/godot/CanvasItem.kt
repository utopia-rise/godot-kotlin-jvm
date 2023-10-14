// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedColorArray
import godot.core.PackedVector2Array
import godot.core.RID
import godot.core.Rect2
import godot.core.Transform2D
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_COLOR_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Abstract base class for everything in 2D space.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/528](https://godotengine.org/asset-library/asset/528)
 *
 * Abstract base class for everything in 2D space. Canvas items are laid out in a tree; children inherit and extend their parent's transform. [godot.CanvasItem] is extended by [godot.Control] for GUI-related nodes, and by [godot.Node2D] for 2D game objects.
 *
 * Any [godot.CanvasItem] can draw. For this, [queueRedraw] is called by the engine, then [NOTIFICATION_DRAW] will be received on idle time to request a redraw. Because of this, canvas items don't need to be redrawn on every frame, improving the performance significantly. Several functions for drawing on the [godot.CanvasItem] are provided (see `draw_*` functions). However, they can only be used inside [_draw], its corresponding [godot.Object.Notification] or methods connected to the [draw] signal.
 *
 * Canvas items are drawn in tree order. By default, children are on top of their parents, so a root [godot.CanvasItem] will be drawn behind everything. This behavior can be changed on a per-item basis.
 *
 * A [godot.CanvasItem] can be hidden, which will also hide its children. By adjusting various other properties of a [godot.CanvasItem], you can also modulate its color (via [modulate] or [selfModulate]), change its Z-index, blend mode, and more.
 */
@GodotBaseType
public open class CanvasItem internal constructor() : Node() {
  /**
   * Emitted when the [godot.CanvasItem] must redraw, *after* the related [NOTIFICATION_DRAW] notification, and *before* [_draw] is called.
   *
   * **Note:** Deferred connections do not allow drawing through the `draw_*` methods.
   */
  public val draw: Signal0 by signal()

  /**
   * Emitted when the visibility (hidden/visible) changes.
   */
  public val visibilityChanged: Signal0 by signal()

  /**
   * Emitted when becoming hidden.
   */
  public val hidden: Signal0 by signal()

  /**
   * Emitted when the item's [godot.core.Rect2] boundaries (position or size) have changed, or when an action is taking place that may have impacted these boundaries (e.g. changing [godot.Sprite2D.texture]).
   */
  public val itemRectChanged: Signal0 by signal()

  /**
   * If `true`, this [godot.CanvasItem] is drawn. The node is only visible if all of its ancestors are visible as well (in other words, [isVisibleInTree] must return `true`).
   *
   * **Note:** For controls that inherit [godot.Popup], the correct way to make them visible is to call one of the multiple `popup*()` functions instead.
   */
  public var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_IS_VISIBLE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_VISIBLE, NIL)
    }

  /**
   * The color applied to this [godot.CanvasItem]. This property does affect child [godot.CanvasItem]s, unlike [selfModulate] which only affects the node itself.
   */
  @CoreTypeLocalCopy
  public var modulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_MODULATE, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_MODULATE, NIL)
    }

  /**
   * The color applied to this [godot.CanvasItem]. This property does **not** affect child [godot.CanvasItem]s, unlike [modulate] which affects both the node itself and its children.
   *
   * **Note:** Internal children (e.g. sliders in [godot.ColorPicker] or tab bar in [godot.TabContainer]) are also not affected by this property (see `include_internal` parameter of [godot.Node.getChild] and other similar methods).
   */
  @CoreTypeLocalCopy
  public var selfModulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_SELF_MODULATE,
          COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_SELF_MODULATE, NIL)
    }

  /**
   * If `true`, the object draws behind its parent.
   */
  public var showBehindParent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEM_IS_DRAW_BEHIND_PARENT_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_DRAW_BEHIND_PARENT,
          NIL)
    }

  /**
   * If `true`, this [godot.CanvasItem] will *not* inherit its transform from parent [godot.CanvasItem]s. Its draw order will also be changed to make it draw on top of other [godot.CanvasItem]s that do not have [topLevel] set to `true`. The [godot.CanvasItem] will effectively act as if it was placed as a child of a bare [godot.Node].
   */
  public var topLevel: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_IS_SET_AS_TOP_LEVEL,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_AS_TOP_LEVEL, NIL)
    }

  /**
   * Allows the current node to clip children nodes, essentially acting as a mask.
   */
  public var clipChildren: ClipChildrenMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_CLIP_CHILDREN_MODE,
          LONG)
      return CanvasItem.ClipChildrenMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_CLIP_CHILDREN_MODE,
          NIL)
    }

  /**
   * The rendering layers in which this [godot.CanvasItem] responds to [godot.Light2D] nodes.
   */
  public var lightMask: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_LIGHT_MASK, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_LIGHT_MASK, NIL)
    }

  /**
   * The rendering layer in which this [godot.CanvasItem] is rendered by [godot.Viewport] nodes. A [godot.Viewport] will render a [godot.CanvasItem] if it and all its parents share a layer with the [godot.Viewport]'s canvas cull mask.
   */
  public var visibilityLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_VISIBILITY_LAYER,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_VISIBILITY_LAYER,
          NIL)
    }

  /**
   * Z index. Controls the order in which the nodes render. A node with a higher Z index will display in front of others. Must be between [godot.RenderingServer.CANVAS_ITEM_Z_MIN] and [godot.RenderingServer.CANVAS_ITEM_Z_MAX] (inclusive).
   *
   * **Note:** Changing the Z index of a [godot.Control] only affects the drawing order, not the order in which input events are handled. This can be useful to implement certain UI animations, e.g. a menu where hovered items are scaled and should overlap others.
   */
  public var zIndex: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_Z_INDEX, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_Z_INDEX, NIL)
    }

  /**
   * If `true`, the node's Z index is relative to its parent's Z index. If this node's Z index is 2 and its parent's effective Z index is 3, then this node's effective Z index will be 2 + 3 = 5.
   */
  public var zAsRelative: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_IS_Z_RELATIVE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_Z_AS_RELATIVE, NIL)
    }

  /**
   * If `true`, child nodes with the lowest Y position are drawn before those with a higher Y position. If `false`, Y-sorting is disabled. Y-sorting only affects children that inherit from [godot.CanvasItem].
   *
   * You can nest nodes with Y-sorting. Child Y-sorted nodes are sorted in the same space as the parent Y-sort. This feature allows you to organize a scene better or divide it into multiple ones without changing your scene tree.
   */
  public var ySortEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_IS_Y_SORT_ENABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_Y_SORT_ENABLED,
          NIL)
    }

  /**
   * The texture filtering mode to use on this [godot.CanvasItem].
   */
  public var textureFilter: TextureFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_TEXTURE_FILTER,
          LONG)
      return CanvasItem.TextureFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_TEXTURE_FILTER,
          NIL)
    }

  /**
   * The texture repeating mode to use on this [godot.CanvasItem].
   */
  public var textureRepeat: TextureRepeat
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_TEXTURE_REPEAT,
          LONG)
      return CanvasItem.TextureRepeat.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_TEXTURE_REPEAT,
          NIL)
    }

  /**
   * The material applied to this [godot.CanvasItem].
   */
  public var material: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_MATERIAL, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_MATERIAL, NIL)
    }

  /**
   * If `true`, the parent [godot.CanvasItem]'s [material] property is used as this one's material.
   */
  public var useParentMaterial: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_USE_PARENT_MATERIAL, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_USE_PARENT_MATERIAL, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CANVASITEM, scriptIndex)
    return true
  }

  /**
   * The color applied to this [godot.CanvasItem]. This property does affect child [godot.CanvasItem]s, unlike [selfModulate] which only affects the node itself.
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
   * val myCoreType = canvasitem.modulate
   * //Your changes
   * canvasitem.modulate = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun modulateMutate(block: Color.() -> Unit): Color = modulate.apply{
      block(this)
      modulate = this
  }


  /**
   * The color applied to this [godot.CanvasItem]. This property does **not** affect child [godot.CanvasItem]s, unlike [modulate] which affects both the node itself and its children.
   *
   * **Note:** Internal children (e.g. sliders in [godot.ColorPicker] or tab bar in [godot.TabContainer]) are also not affected by this property (see `include_internal` parameter of [godot.Node.getChild] and other similar methods).
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
   * val myCoreType = canvasitem.selfModulate
   * //Your changes
   * canvasitem.selfModulate = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun selfModulateMutate(block: Color.() -> Unit): Color = selfModulate.apply{
      block(this)
      selfModulate = this
  }


  /**
   * Called when [godot.CanvasItem] has been requested to redraw (after [queueRedraw] is called, either manually or by the engine).
   *
   * Corresponds to the [NOTIFICATION_DRAW] notification in [godot.Object.Notification].
   */
  public open fun _draw(): Unit {
  }

  /**
   * Returns the canvas item RID used by [godot.RenderingServer] for this item.
   */
  public fun getCanvasItem(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_CANVAS_ITEM, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns `true` if the node is present in the [godot.SceneTree], its [visible] property is `true` and all its ancestors are also visible. If any ancestor is hidden, this node will not be visible in the scene tree, and is consequently not drawn (see [_draw]).
   */
  public fun isVisibleInTree(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_IS_VISIBLE_IN_TREE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Show the [godot.CanvasItem] if it's currently hidden. This is equivalent to setting [visible] to `true`. For controls that inherit [godot.Popup], the correct way to make them visible is to call one of the multiple `popup*()` functions instead.
   */
  public fun show(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SHOW, NIL)
  }

  /**
   * Hide the [godot.CanvasItem] if it's currently visible. This is equivalent to setting [visible] to `false`.
   */
  public fun hide(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_HIDE, NIL)
  }

  /**
   * Queues the [godot.CanvasItem] to redraw. During idle time, if [godot.CanvasItem] is visible, [NOTIFICATION_DRAW] is sent and [_draw] is called. This only occurs **once** per frame, even if this method has been called multiple times.
   */
  public fun queueRedraw(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_QUEUE_REDRAW, NIL)
  }

  /**
   * Moves this node to display on top of its siblings.
   *
   * Internally, the node is moved to the bottom of parent's children list. The method has no effect on nodes without a parent.
   */
  public fun moveToFront(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_MOVE_TO_FRONT, NIL)
  }

  /**
   * Draws a line from a 2D point to another, with a given color and width. It can be optionally antialiased. See also [drawMultiline] and [drawPolyline].
   *
   * If [width] is negative, then a two-point primitive will be drawn instead of a four-point one. This means that when the CanvasItem is scaled, the line will remain thin. If this behavior is not desired, then pass a positive [width] like `1.0`.
   */
  @JvmOverloads
  public fun drawLine(
    from: Vector2,
    to: Vector2,
    color: Color,
    width: Float = -1.0f,
    antialiased: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to, COLOR to color, DOUBLE to width.toDouble(), BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_LINE, NIL)
  }

  /**
   * Draws a dashed line from a 2D point to another, with a given color and width. See also [drawMultiline] and [drawPolyline].
   *
   * If [width] is negative, then a two-point primitives will be drawn instead of a four-point ones. This means that when the CanvasItem is scaled, the line parts will remain thin. If this behavior is not desired, then pass a positive [width] like `1.0`.
   */
  @JvmOverloads
  public fun drawDashedLine(
    from: Vector2,
    to: Vector2,
    color: Color,
    width: Float = -1.0f,
    dash: Float = 2.0f,
    aligned: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to, COLOR to color, DOUBLE to width.toDouble(), DOUBLE to dash.toDouble(), BOOL to aligned)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_DASHED_LINE, NIL)
  }

  /**
   * Draws interconnected line segments with a uniform [color] and [width] and optional antialiasing (supported only for positive [width]). When drawing large amounts of lines, this is faster than using individual [drawLine] calls. To draw disconnected lines, use [drawMultiline] instead. See also [drawPolygon].
   *
   * If [width] is negative, the polyline is drawn using [godot.RenderingServer.PRIMITIVE_LINE_STRIP]. This means that when the CanvasItem is scaled, the polyline will remain thin. If this behavior is not desired, then pass a positive [width] like `1.0`.
   */
  @JvmOverloads
  public fun drawPolyline(
    points: PackedVector2Array,
    color: Color,
    width: Float = -1.0f,
    antialiased: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, COLOR to color, DOUBLE to width.toDouble(), BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_POLYLINE, NIL)
  }

  /**
   * Draws interconnected line segments with a uniform [width], point-by-point coloring, and optional antialiasing (supported only for positive [width]). Colors assigned to line points match by index between [points] and [colors], i.e. each line segment is filled with a gradient between the colors of the endpoints. When drawing large amounts of lines, this is faster than using individual [drawLine] calls. To draw disconnected lines, use [drawMultilineColors] instead. See also [drawPolygon].
   *
   * If [width] is negative, then the polyline is drawn using [godot.RenderingServer.PRIMITIVE_LINE_STRIP]. This means that when the CanvasItem is scaled, the polyline will remain thin. If this behavior is not desired, then pass a positive [width] like `1.0`.
   */
  @JvmOverloads
  public fun drawPolylineColors(
    points: PackedVector2Array,
    colors: PackedColorArray,
    width: Float = -1.0f,
    antialiased: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, DOUBLE to width.toDouble(), BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_POLYLINE_COLORS,
        NIL)
  }

  /**
   * Draws an unfilled arc between the given angles with a uniform [color] and [width] and optional antialiasing (supported only for positive [width]). The larger the value of [pointCount], the smoother the curve. See also [drawCircle].
   *
   * If [width] is negative, then the arc is drawn using [godot.RenderingServer.PRIMITIVE_LINE_STRIP]. This means that when the CanvasItem is scaled, the arc will remain thin. If this behavior is not desired, then pass a positive [width] like `1.0`.
   *
   * The arc is drawn from [startAngle] towards the value of [endAngle] so in clockwise direction if `start_angle < end_angle` and counter-clockwise otherwise. Passing the same angles but in reversed order will produce the same arc. If absolute difference of [startAngle] and [endAngle] is greater than [@GDScript.TAU] radians, then a full circle arc is drawn (i.e. arc will not overlap itself).
   */
  @JvmOverloads
  public fun drawArc(
    center: Vector2,
    radius: Float,
    startAngle: Float,
    endAngle: Float,
    pointCount: Int,
    color: Color,
    width: Float = -1.0f,
    antialiased: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(VECTOR2 to center, DOUBLE to radius.toDouble(), DOUBLE to startAngle.toDouble(), DOUBLE to endAngle.toDouble(), LONG to pointCount.toLong(), COLOR to color, DOUBLE to width.toDouble(), BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_ARC, NIL)
  }

  /**
   * Draws multiple disconnected lines with a uniform [width] and [color]. Each line is defined by two consecutive points from [points] array, i.e. i-th segment consists of `points[2 * i]`, `points[2 * i + 1]` endpoints. When drawing large amounts of lines, this is faster than using individual [drawLine] calls. To draw interconnected lines, use [drawPolyline] instead.
   *
   * If [width] is negative, then two-point primitives will be drawn instead of a four-point ones. This means that when the CanvasItem is scaled, the lines will remain thin. If this behavior is not desired, then pass a positive [width] like `1.0`.
   */
  @JvmOverloads
  public fun drawMultiline(
    points: PackedVector2Array,
    color: Color,
    width: Float = -1.0f,
  ): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, COLOR to color, DOUBLE to width.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_MULTILINE, NIL)
  }

  /**
   * Draws multiple disconnected lines with a uniform [width] and segment-by-segment coloring. Each segment is defined by two consecutive points from [points] array and a corresponding color from [colors] array, i.e. i-th segment consists of `points[2 * i]`, `points[2 * i + 1]` endpoints and has `colors*` color. When drawing large amounts of lines, this is faster than using individual [drawLine] calls. To draw interconnected lines, use [drawPolylineColors] instead.
   *
   * If [width] is negative, then two-point primitives will be drawn instead of a four-point ones. This means that when the CanvasItem is scaled, the lines will remain thin. If this behavior is not desired, then pass a positive [width] like `1.0`.
   */
  @JvmOverloads
  public fun drawMultilineColors(
    points: PackedVector2Array,
    colors: PackedColorArray,
    width: Float = -1.0f,
  ): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, DOUBLE to width.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_MULTILINE_COLORS,
        NIL)
  }

  /**
   * Draws a rectangle. If [filled] is `true`, the rectangle will be filled with the [color] specified. If [filled] is `false`, the rectangle will be drawn as a stroke with the [color] and [width] specified. See also [drawTextureRect].
   *
   * If [width] is negative, then two-point primitives will be drawn instead of a four-point ones. This means that when the CanvasItem is scaled, the lines will remain thin. If this behavior is not desired, then pass a positive [width] like `1.0`.
   *
   * **Note:** [width] is only effective if [filled] is `false`.
   *
   * **Note:** Unfilled rectangles drawn with a negative [width] may not display perfectly. For example, corners may be missing or brighter due to overlapping lines (for a translucent [color]).
   */
  @JvmOverloads
  public fun drawRect(
    rect: Rect2,
    color: Color,
    filled: Boolean = true,
    width: Float = -1.0f,
  ): Unit {
    TransferContext.writeArguments(RECT2 to rect, COLOR to color, BOOL to filled, DOUBLE to width.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_RECT, NIL)
  }

  /**
   * Draws a colored, filled circle. See also [drawArc], [drawPolyline] and [drawPolygon].
   */
  public fun drawCircle(
    position: Vector2,
    radius: Float,
    color: Color,
  ): Unit {
    TransferContext.writeArguments(VECTOR2 to position, DOUBLE to radius.toDouble(), COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_CIRCLE, NIL)
  }

  /**
   * Draws a texture at a given position.
   */
  @JvmOverloads
  public fun drawTexture(
    texture: Texture2D,
    position: Vector2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, VECTOR2 to position, COLOR to modulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_TEXTURE, NIL)
  }

  /**
   * Draws a textured rectangle at a given position, optionally modulated by a color. If [transpose] is `true`, the texture will have its X and Y coordinates swapped. See also [drawRect] and [drawTextureRectRegion].
   */
  @JvmOverloads
  public fun drawTextureRect(
    texture: Texture2D,
    rect: Rect2,
    tile: Boolean,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, RECT2 to rect, BOOL to tile, COLOR to modulate, BOOL to transpose)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_TEXTURE_RECT, NIL)
  }

  /**
   * Draws a textured rectangle from a texture's region (specified by [srcRect]) at a given position, optionally modulated by a color. If [transpose] is `true`, the texture will have its X and Y coordinates swapped. See also [drawTextureRect].
   */
  @JvmOverloads
  public fun drawTextureRectRegion(
    texture: Texture2D,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
    clipUv: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, RECT2 to rect, RECT2 to srcRect, COLOR to modulate, BOOL to transpose, BOOL to clipUv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_TEXTURE_RECT_REGION,
        NIL)
  }

  /**
   * Draws a textured rectangle region of the multi-channel signed distance field texture at a given position, optionally modulated by a color. See [godot.FontFile.multichannelSignedDistanceField] for more information and caveats about MSDF font rendering.
   *
   * If [outline] is positive, each alpha channel value of pixel in region is set to maximum value of true distance in the [outline] radius.
   *
   * Value of the [pixelRange] should the same that was used during distance field texture generation.
   */
  @JvmOverloads
  public fun drawMsdfTextureRectRegion(
    texture: Texture2D,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    outline: Double = 0.0,
    pixelRange: Double = 4.0,
    scale: Double = 1.0,
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, RECT2 to rect, RECT2 to srcRect, COLOR to modulate, DOUBLE to outline, DOUBLE to pixelRange, DOUBLE to scale)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_MSDF_TEXTURE_RECT_REGION, NIL)
  }

  /**
   * Draws a textured rectangle region of the font texture with LCD subpixel anti-aliasing at a given position, optionally modulated by a color.
   *
   * Texture is drawn using the following blend operation, blend mode of the [godot.CanvasItemMaterial] is ignored:
   *
   * ```
   * 				dst.r = texture.r * modulate.r * modulate.a + dst.r * (1.0 - texture.r * modulate.a);
   * 				dst.g = texture.g * modulate.g * modulate.a + dst.g * (1.0 - texture.g * modulate.a);
   * 				dst.b = texture.b * modulate.b * modulate.a + dst.b * (1.0 - texture.b * modulate.a);
   * 				dst.a = modulate.a + dst.a * (1.0 - modulate.a);
   * 				```
   */
  @JvmOverloads
  public fun drawLcdTextureRectRegion(
    texture: Texture2D,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, RECT2 to rect, RECT2 to srcRect, COLOR to modulate)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_LCD_TEXTURE_RECT_REGION, NIL)
  }

  /**
   * Draws a styled rectangle.
   */
  public fun drawStyleBox(styleBox: StyleBox, rect: Rect2): Unit {
    TransferContext.writeArguments(OBJECT to styleBox, RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_STYLE_BOX, NIL)
  }

  /**
   * Draws a custom primitive. 1 point for a point, 2 points for a line, 3 points for a triangle, and 4 points for a quad. If 0 points or more than 4 points are specified, nothing will be drawn and an error message will be printed. See also [drawLine], [drawPolyline], [drawPolygon], and [drawRect].
   */
  @JvmOverloads
  public fun drawPrimitive(
    points: PackedVector2Array,
    colors: PackedColorArray,
    uvs: PackedVector2Array,
    texture: Texture2D? = null,
  ): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, PACKED_VECTOR2_ARRAY to uvs, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_PRIMITIVE, NIL)
  }

  /**
   * Draws a solid polygon of any number of points, convex or concave. Unlike [drawColoredPolygon], each point's color can be changed individually. See also [drawPolyline] and [drawPolylineColors]. If you need more flexibility (such as being able to use bones), use [godot.RenderingServer.canvasItemAddTriangleArray] instead.
   */
  @JvmOverloads
  public fun drawPolygon(
    points: PackedVector2Array,
    colors: PackedColorArray,
    uvs: PackedVector2Array = PackedVector2Array(),
    texture: Texture2D? = null,
  ): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, PACKED_VECTOR2_ARRAY to uvs, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_POLYGON, NIL)
  }

  /**
   * Draws a colored polygon of any number of points, convex or concave. Unlike [drawPolygon], a single color must be specified for the whole polygon.
   */
  @JvmOverloads
  public fun drawColoredPolygon(
    points: PackedVector2Array,
    color: Color,
    uvs: PackedVector2Array = PackedVector2Array(),
    texture: Texture2D? = null,
  ): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, COLOR to color, PACKED_VECTOR2_ARRAY to uvs, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_COLORED_POLYGON,
        NIL)
  }

  /**
   * Draws [text] using the specified [font] at the [pos] (bottom-left corner using the baseline of the font). The text will have its color multiplied by [modulate]. If [width] is greater than or equal to 0, the text will be clipped if it exceeds the specified width.
   *
   * **Example using the default project font:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * # If using this method in a script that redraws constantly, move the
   *
   * # `default_font` declaration to a member variable assigned in `_ready()`
   *
   * # so the Control is only created once.
   *
   * var default_font = ThemeDB.fallback_font
   *
   * var default_font_size = ThemeDB.fallback_font_size
   *
   * draw_string(default_font, Vector2(64, 64), "Hello world", HORIZONTAL_ALIGNMENT_LEFT, -1, default_font_size)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * // If using this method in a script that redraws constantly, move the
   *
   * // `default_font` declaration to a member variable assigned in `_Ready()`
   *
   * // so the Control is only created once.
   *
   * Font defaultFont = ThemeDB.FallbackFont;
   *
   * int defaultFontSize = ThemeDB.FallbackFontSize;
   *
   * DrawString(defaultFont, new Vector2(64, 64), "Hello world", HORIZONTAL_ALIGNMENT_LEFT, -1, defaultFontSize);
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * See also [godot.Font.drawString].
   */
  @JvmOverloads
  public fun drawString(
    font: Font,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    justificationFlags: Long = 3,
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ): Unit {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), COLOR to modulate, LONG to justificationFlags, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_STRING, NIL)
  }

  /**
   * Breaks [text] into lines and draws it using the specified [font] at the [pos] (top-left corner). The text will have its color multiplied by [modulate]. If [width] is greater than or equal to 0, the text will be clipped if it exceeds the specified width.
   */
  @JvmOverloads
  public fun drawMultilineString(
    font: Font,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    maxLines: Int = -1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    brkFlags: Long = 3,
    justificationFlags: Long = 3,
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ): Unit {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), LONG to maxLines.toLong(), COLOR to modulate, LONG to brkFlags, LONG to justificationFlags, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_MULTILINE_STRING,
        NIL)
  }

  /**
   * Draws [text] outline using the specified [font] at the [pos] (bottom-left corner using the baseline of the font). The text will have its color multiplied by [modulate]. If [width] is greater than or equal to 0, the text will be clipped if it exceeds the specified width.
   */
  @JvmOverloads
  public fun drawStringOutline(
    font: Font,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    size: Int = 1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    justificationFlags: Long = 3,
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ): Unit {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), LONG to size.toLong(), COLOR to modulate, LONG to justificationFlags, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_STRING_OUTLINE, NIL)
  }

  /**
   * Breaks [text] to the lines and draws text outline using the specified [font] at the [pos] (top-left corner). The text will have its color multiplied by [modulate]. If [width] is greater than or equal to 0, the text will be clipped if it exceeds the specified width.
   */
  @JvmOverloads
  public fun drawMultilineStringOutline(
    font: Font,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.HORIZONTAL_ALIGNMENT_LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    maxLines: Int = -1,
    size: Int = 1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    brkFlags: Long = 3,
    justificationFlags: Long = 3,
    direction: TextServer.Direction = TextServer.Direction.DIRECTION_AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL,
  ): Unit {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to pos, STRING to text, LONG to alignment.id, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), LONG to maxLines.toLong(), LONG to size.toLong(), COLOR to modulate, LONG to brkFlags, LONG to justificationFlags, LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_MULTILINE_STRING_OUTLINE, NIL)
  }

  /**
   * Draws a string first character using a custom font.
   */
  @JvmOverloads
  public fun drawChar(
    font: Font,
    pos: Vector2,
    char: String,
    fontSize: Int = 16,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to pos, STRING to char, LONG to fontSize.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_CHAR, NIL)
  }

  /**
   * Draws a string first character outline using a custom font.
   */
  @JvmOverloads
  public fun drawCharOutline(
    font: Font,
    pos: Vector2,
    char: String,
    fontSize: Int = 16,
    size: Int = -1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to pos, STRING to char, LONG to fontSize.toLong(), LONG to size.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_CHAR_OUTLINE, NIL)
  }

  /**
   * Draws a [godot.Mesh] in 2D, using the provided texture. See [godot.MeshInstance2D] for related documentation.
   */
  @JvmOverloads
  public fun drawMesh(
    mesh: Mesh,
    texture: Texture2D,
    transform: Transform2D = Transform2D(),
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(OBJECT to mesh, OBJECT to texture, TRANSFORM2D to transform, COLOR to modulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_MESH, NIL)
  }

  /**
   * Draws a [godot.MultiMesh] in 2D with the provided texture. See [godot.MultiMeshInstance2D] for related documentation.
   */
  public fun drawMultimesh(multimesh: MultiMesh, texture: Texture2D): Unit {
    TransferContext.writeArguments(OBJECT to multimesh, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_MULTIMESH, NIL)
  }

  /**
   * Sets a custom transform for drawing via components. Anything drawn afterwards will be transformed by this.
   *
   * **Note:** [godot.FontFile.oversampling] does *not* take [scale] into account. This means that scaling up/down will cause bitmap fonts and rasterized (non-MSDF) dynamic fonts to appear blurry or pixelated. To ensure text remains crisp regardless of scale, you can enable MSDF font rendering by enabling [godot.ProjectSettings.gui/theme/defaultFontMultichannelSignedDistanceField] (applies to the default project font only), or enabling **Multichannel Signed Distance Field** in the import options of a DynamicFont for custom fonts. On system fonts, [godot.SystemFont.multichannelSignedDistanceField] can be enabled in the inspector.
   */
  @JvmOverloads
  public fun drawSetTransform(
    position: Vector2,
    rotation: Float = 0.0f,
    scale: Vector2 = Vector2(1, 1),
  ): Unit {
    TransferContext.writeArguments(VECTOR2 to position, DOUBLE to rotation.toDouble(), VECTOR2 to scale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_SET_TRANSFORM, NIL)
  }

  /**
   * Sets a custom transform for drawing via matrix. Anything drawn afterwards will be transformed by this.
   */
  public fun drawSetTransformMatrix(xform: Transform2D): Unit {
    TransferContext.writeArguments(TRANSFORM2D to xform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_SET_TRANSFORM_MATRIX, NIL)
  }

  /**
   * Subsequent drawing commands will be ignored unless they fall within the specified animation slice. This is a faster way to implement animations that loop on background rather than redrawing constantly.
   */
  @JvmOverloads
  public fun drawAnimationSlice(
    animationLength: Double,
    sliceBegin: Double,
    sliceEnd: Double,
    offset: Double = 0.0,
  ): Unit {
    TransferContext.writeArguments(DOUBLE to animationLength, DOUBLE to sliceBegin, DOUBLE to sliceEnd, DOUBLE to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_ANIMATION_SLICE,
        NIL)
  }

  /**
   * After submitting all animations slices via [drawAnimationSlice], this function can be used to revert drawing to its default state (all subsequent drawing commands will be visible). If you don't care about this particular use case, usage of this function after submitting the slices is not required.
   */
  public fun drawEndAnimation(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_END_ANIMATION, NIL)
  }

  /**
   * Returns the transform matrix of this item.
   */
  public fun getTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_TRANSFORM,
        TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  /**
   * Returns the global transform matrix of this item, i.e. the combined transform up to the topmost [godot.CanvasItem] node. The topmost item is a [godot.CanvasItem] that either has no parent, has non-[godot.CanvasItem] parent or it has [topLevel] enabled.
   */
  public fun getGlobalTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_GLOBAL_TRANSFORM,
        TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  /**
   * Returns the transform from the local coordinate system of this [godot.CanvasItem] to the [godot.Viewport]s coordinate system.
   */
  public fun getGlobalTransformWithCanvas(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_GLOBAL_TRANSFORM_WITH_CANVAS, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  /**
   * Returns the transform from the coordinate system of the canvas, this item is in, to the [godot.Viewport]s embedders coordinate system.
   */
  public fun getViewportTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_VIEWPORT_TRANSFORM,
        TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  /**
   * Returns the viewport's boundaries as a [godot.core.Rect2].
   */
  public fun getViewportRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_VIEWPORT_RECT, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Returns the transform from the coordinate system of the canvas, this item is in, to the [godot.Viewport]s coordinate system.
   */
  public fun getCanvasTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_CANVAS_TRANSFORM,
        TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  /**
   * Returns the transform of this [godot.CanvasItem] in global screen coordinates (i.e. taking window position into account). Mostly useful for editor plugins.
   *
   * Equals to [getGlobalTransform] if the window is embedded (see [godot.Viewport.guiEmbedSubwindows]).
   */
  public fun getScreenTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_SCREEN_TRANSFORM,
        TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  /**
   * Returns the mouse's position in this [godot.CanvasItem] using the local coordinate system of this [godot.CanvasItem].
   */
  public fun getLocalMousePosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_LOCAL_MOUSE_POSITION,
        VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the mouse's position in the [godot.CanvasLayer] that this [godot.CanvasItem] is in using the coordinate system of the [godot.CanvasLayer].
   *
   * **Note:** For screen-space coordinates (e.g. when using a non-embedded [godot.Popup]), you can use [godot.DisplayServer.mouseGetPosition].
   */
  public fun getGlobalMousePosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_GLOBAL_MOUSE_POSITION, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the [RID] of the [godot.World2D] canvas where this item is in.
   */
  public fun getCanvas(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_CANVAS, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the [godot.World2D] where this item is in.
   */
  public fun getWorld2d(): World2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_WORLD_2D, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as World2D?)
  }

  /**
   * If [enable] is `true`, this node will receive [NOTIFICATION_LOCAL_TRANSFORM_CHANGED] when its local transform changes.
   */
  public fun setNotifyLocalTransform(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_NOTIFY_LOCAL_TRANSFORM, NIL)
  }

  /**
   * Returns `true` if local transform notifications are communicated to children.
   */
  public fun isLocalTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_IS_LOCAL_TRANSFORM_NOTIFICATION_ENABLED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * If [enable] is `true`, this node will receive [NOTIFICATION_TRANSFORM_CHANGED] when its global transform changes.
   */
  public fun setNotifyTransform(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_NOTIFY_TRANSFORM,
        NIL)
  }

  /**
   * Returns `true` if global transform notifications are communicated to children.
   */
  public fun isTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_IS_TRANSFORM_NOTIFICATION_ENABLED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Forces the transform to update. Transform changes in physics are not instant for performance reasons. Transforms are accumulated and then set. Use this if you need an up-to-date transform when doing physics operations.
   */
  public fun forceUpdateTransform(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_FORCE_UPDATE_TRANSFORM,
        NIL)
  }

  /**
   * Assigns [screenPoint] as this node's new local transform.
   */
  public fun makeCanvasPositionLocal(screenPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to screenPoint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_MAKE_CANVAS_POSITION_LOCAL, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Transformations issued by [event]'s inputs are applied in local space instead of global space.
   */
  public fun makeInputLocal(event: InputEvent): InputEvent? {
    TransferContext.writeArguments(OBJECT to event)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_MAKE_INPUT_LOCAL, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as InputEvent?)
  }

  /**
   * Set/clear individual bits on the rendering visibility layer. This simplifies editing this [godot.CanvasItem]'s visibility layer.
   */
  public fun setVisibilityLayerBit(layer: Long, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to layer, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_VISIBILITY_LAYER_BIT,
        NIL)
  }

  /**
   * Returns an individual bit on the rendering visibility layer.
   */
  public fun getVisibilityLayerBit(layer: Long): Boolean {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_VISIBILITY_LAYER_BIT,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class TextureFilter(
    id: Long,
  ) {
    /**
     * The [godot.CanvasItem] will inherit the filter from its parent.
     */
    TEXTURE_FILTER_PARENT_NODE(0),
    /**
     * The texture filter reads from the nearest pixel only. The simplest and fastest method of filtering. Useful for pixel art.
     */
    TEXTURE_FILTER_NEAREST(1),
    /**
     * The texture filter blends between the nearest four pixels. Use this for most cases where you want to avoid a pixelated style.
     */
    TEXTURE_FILTER_LINEAR(2),
    /**
     * The texture filter reads from the nearest pixel in the nearest mipmap. This is the fastest way to read from textures with mipmaps.
     */
    TEXTURE_FILTER_NEAREST_WITH_MIPMAPS(3),
    /**
     * The texture filter blends between the nearest 4 pixels and between the nearest 2 mipmaps. Use this for non-pixel art textures that may be viewed at a low scale (e.g. due to [godot.Camera2D] zoom), as mipmaps are important to smooth out pixels that are smaller than on-screen pixels.
     */
    TEXTURE_FILTER_LINEAR_WITH_MIPMAPS(4),
    /**
     * The texture filter reads from the nearest pixel, but selects a mipmap based on the angle between the surface and the camera view. This reduces artifacts on surfaces that are almost in line with the camera. The anisotropic filtering level can be changed by adjusting [godot.ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     *
     * **Note:** This texture filter is rarely useful in 2D projects. [TEXTURE_FILTER_NEAREST_WITH_MIPMAPS] is usually more appropriate.
     */
    TEXTURE_FILTER_NEAREST_WITH_MIPMAPS_ANISOTROPIC(5),
    /**
     * The texture filter blends between the nearest 4 pixels and selects a mipmap based on the angle between the surface and the camera view. This reduces artifacts on surfaces that are almost in line with the camera. This is the slowest of the filtering options, but results in the highest quality texturing. The anisotropic filtering level can be changed by adjusting [godot.ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     *
     * **Note:** This texture filter is rarely useful in 2D projects. [TEXTURE_FILTER_LINEAR_WITH_MIPMAPS] is usually more appropriate.
     */
    TEXTURE_FILTER_LINEAR_WITH_MIPMAPS_ANISOTROPIC(6),
    /**
     * Represents the size of the [enum TextureFilter] enum.
     */
    TEXTURE_FILTER_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class TextureRepeat(
    id: Long,
  ) {
    /**
     * The [godot.CanvasItem] will inherit the filter from its parent.
     */
    TEXTURE_REPEAT_PARENT_NODE(0),
    /**
     * Texture will not repeat.
     */
    TEXTURE_REPEAT_DISABLED(1),
    /**
     * Texture will repeat normally.
     */
    TEXTURE_REPEAT_ENABLED(2),
    /**
     * Texture will repeat in a 2x2 tiled mode, where elements at even positions are mirrored.
     */
    TEXTURE_REPEAT_MIRROR(3),
    /**
     * Represents the size of the [enum TextureRepeat] enum.
     */
    TEXTURE_REPEAT_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ClipChildrenMode(
    id: Long,
  ) {
    /**
     * Child draws over parent and is not clipped.
     */
    CLIP_CHILDREN_DISABLED(0),
    /**
     * Parent is used for the purposes of clipping only. Child is clipped to the parent's visible area, parent is not drawn.
     */
    CLIP_CHILDREN_ONLY(1),
    /**
     * Parent is used for clipping child, but parent is also drawn underneath child as normal before clipping child to its visible area.
     */
    CLIP_CHILDREN_AND_DRAW(2),
    /**
     * Represents the size of the [enum ClipChildrenMode] enum.
     */
    CLIP_CHILDREN_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * The [godot.CanvasItem]'s global transform has changed. This notification is only received if enabled by [setNotifyTransform].
     */
    public final const val NOTIFICATION_TRANSFORM_CHANGED: Long = 2000

    /**
     * The [godot.CanvasItem]'s local transform has changed. This notification is only received if enabled by [setNotifyLocalTransform].
     */
    public final const val NOTIFICATION_LOCAL_TRANSFORM_CHANGED: Long = 35

    /**
     * The [godot.CanvasItem] is requested to draw (see [_draw]).
     */
    public final const val NOTIFICATION_DRAW: Long = 30

    /**
     * The [godot.CanvasItem]'s visibility has changed.
     */
    public final const val NOTIFICATION_VISIBILITY_CHANGED: Long = 31

    /**
     * The [godot.CanvasItem] has entered the canvas.
     */
    public final const val NOTIFICATION_ENTER_CANVAS: Long = 32

    /**
     * The [godot.CanvasItem] has exited the canvas.
     */
    public final const val NOTIFICATION_EXIT_CANVAS: Long = 33

    /**
     * The [godot.CanvasItem]'s active [godot.World2D] changed.
     */
    public final const val NOTIFICATION_WORLD_2D_CHANGED: Long = 36
  }
}

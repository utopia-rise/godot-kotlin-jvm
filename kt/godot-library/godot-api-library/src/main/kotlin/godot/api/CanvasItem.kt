// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.GodotEnum
import godot.core.HorizontalAlignment
import godot.core.PackedColorArray
import godot.core.PackedVector2Array
import godot.core.RID
import godot.core.Rect2
import godot.core.Signal0
import godot.core.StringName
import godot.core.Transform2D
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_COLOR_ARRAY
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.VariantParser.TRANSFORM2D
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser._RID
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
 * Abstract base class for everything in 2D space. Canvas items are laid out in a tree; children
 * inherit and extend their parent's transform. [CanvasItem] is extended by [Control] for GUI-related
 * nodes, and by [Node2D] for 2D game objects.
 *
 * Any [CanvasItem] can draw. For this, [queueRedraw] is called by the engine, then
 * [NOTIFICATION_DRAW] will be received on idle time to request a redraw. Because of this, canvas items
 * don't need to be redrawn on every frame, improving the performance significantly. Several functions
 * for drawing on the [CanvasItem] are provided (see `draw_*` functions). However, they can only be
 * used inside [_draw], its corresponding [Object.Notification] or methods connected to the [signal
 * draw] signal.
 *
 * Canvas items are drawn in tree order on their canvas layer. By default, children are on top of
 * their parents, so a root [CanvasItem] will be drawn behind everything. This behavior can be changed
 * on a per-item basis.
 *
 * A [CanvasItem] can be hidden, which will also hide its children. By adjusting various other
 * properties of a [CanvasItem], you can also modulate its color (via [modulate] or [selfModulate]),
 * change its Z-index, blend mode, and more.
 *
 * Note that properties like transform, modulation, and visibility are only propagated to *direct*
 * [CanvasItem] child nodes. If there is a non-[CanvasItem] node in between, like [Node] or
 * [AnimationPlayer], the [CanvasItem] nodes below will have an independent position and [modulate]
 * chain. See also [topLevel].
 */
@GodotBaseType
public open class CanvasItem internal constructor() : Node() {
  /**
   * Emitted when the [CanvasItem] must redraw, *after* the related [NOTIFICATION_DRAW]
   * notification, and *before* [_draw] is called.
   *
   * **Note:** Deferred connections do not allow drawing through the `draw_*` methods.
   */
  public val draw: Signal0 by Signal0

  /**
   * Emitted when the [CanvasItem]'s visibility changes, either because its own [visible] property
   * changed or because its visibility in the tree changed (see [isVisibleInTree]).
   */
  public val visibilityChanged: Signal0 by Signal0

  /**
   * Emitted when the [CanvasItem] is hidden, i.e. it's no longer visible in the tree (see
   * [isVisibleInTree]).
   */
  public val hidden: Signal0 by Signal0

  /**
   * Emitted when the [CanvasItem]'s boundaries (position or size) change, or when an action took
   * place that may have affected these boundaries (e.g. changing [Sprite2D.texture]).
   */
  public val itemRectChanged: Signal0 by Signal0

  /**
   * If `true`, this [CanvasItem] may be drawn. Whether this [CanvasItem] is actually drawn depends
   * on the visibility of all of its [CanvasItem] ancestors. In other words: this [CanvasItem] will be
   * drawn when [isVisibleInTree] returns `true` and all [CanvasItem] ancestors share at least one
   * [visibilityLayer] with this [CanvasItem].
   *
   * **Note:** For controls that inherit [Popup], the correct way to make them visible is to call
   * one of the multiple `popup*()` functions instead.
   */
  public final inline var visible: Boolean
    @JvmName("visibleProperty")
    get() = isVisible()
    @JvmName("visibleProperty")
    set(`value`) {
      setVisible(value)
    }

  /**
   * The color applied to this [CanvasItem]. This property does affect child [CanvasItem]s, unlike
   * [selfModulate] which only affects the node itself.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var modulate: Color
    @JvmName("modulateProperty")
    get() = getModulate()
    @JvmName("modulateProperty")
    set(`value`) {
      setModulate(value)
    }

  /**
   * The color applied to this [CanvasItem]. This property does **not** affect child [CanvasItem]s,
   * unlike [modulate] which affects both the node itself and its children.
   *
   * **Note:** Internal children (e.g. sliders in [ColorPicker] or tab bar in [TabContainer]) are
   * also not affected by this property (see `include_internal` parameter of [Node.getChild] and other
   * similar methods).
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var selfModulate: Color
    @JvmName("selfModulateProperty")
    get() = getSelfModulate()
    @JvmName("selfModulateProperty")
    set(`value`) {
      setSelfModulate(value)
    }

  /**
   * If `true`, the object draws behind its parent.
   */
  public final inline var showBehindParent: Boolean
    @JvmName("showBehindParentProperty")
    get() = isDrawBehindParentEnabled()
    @JvmName("showBehindParentProperty")
    set(`value`) {
      setDrawBehindParent(value)
    }

  /**
   * If `true`, this [CanvasItem] will *not* inherit its transform from parent [CanvasItem]s. Its
   * draw order will also be changed to make it draw on top of other [CanvasItem]s that do not have
   * [topLevel] set to `true`. The [CanvasItem] will effectively act as if it was placed as a child of
   * a bare [Node].
   */
  public final inline var topLevel: Boolean
    @JvmName("topLevelProperty")
    get() = isSetAsTopLevel()
    @JvmName("topLevelProperty")
    set(`value`) {
      setAsTopLevel(value)
    }

  /**
   * Allows the current node to clip child nodes, essentially acting as a mask.
   *
   * **Note:** Clipping nodes cannot be nested or placed within [CanvasGroup]s. If an ancestor of
   * this node clips its children or is a [CanvasGroup], then this node's clip mode should be set to
   * [CLIP_CHILDREN_DISABLED] to avoid unexpected behavior.
   */
  public final inline var clipChildren: ClipChildrenMode
    @JvmName("clipChildrenProperty")
    get() = getClipChildrenMode()
    @JvmName("clipChildrenProperty")
    set(`value`) {
      setClipChildrenMode(value)
    }

  /**
   * The rendering layers in which this [CanvasItem] responds to [Light2D] nodes.
   */
  public final inline var lightMask: Int
    @JvmName("lightMaskProperty")
    get() = getLightMask()
    @JvmName("lightMaskProperty")
    set(`value`) {
      setLightMask(value)
    }

  /**
   * The rendering layer in which this [CanvasItem] is rendered by [Viewport] nodes. A [Viewport]
   * will render a [CanvasItem] if it and all its parents share a layer with the [Viewport]'s canvas
   * cull mask.
   */
  public final inline var visibilityLayer: Long
    @JvmName("visibilityLayerProperty")
    get() = getVisibilityLayer()
    @JvmName("visibilityLayerProperty")
    set(`value`) {
      setVisibilityLayer(value)
    }

  /**
   * Controls the order in which the nodes render. A node with a higher Z index will display in
   * front of others. Must be between [RenderingServer.CANVAS_ITEM_Z_MIN] and
   * [RenderingServer.CANVAS_ITEM_Z_MAX] (inclusive).
   *
   * **Note:** Changing the Z index of a [Control] only affects the drawing order, not the order in
   * which input events are handled. This can be useful to implement certain UI animations, e.g. a menu
   * where hovered items are scaled and should overlap others.
   */
  public final inline var zIndex: Int
    @JvmName("zIndexProperty")
    get() = getZIndex()
    @JvmName("zIndexProperty")
    set(`value`) {
      setZIndex(value)
    }

  /**
   * If `true`, the node's Z index is relative to its parent's Z index. If this node's Z index is 2
   * and its parent's effective Z index is 3, then this node's effective Z index will be 2 + 3 = 5.
   */
  public final inline var zAsRelative: Boolean
    @JvmName("zAsRelativeProperty")
    get() = isZRelative()
    @JvmName("zAsRelativeProperty")
    set(`value`) {
      setZAsRelative(value)
    }

  /**
   * If `true`, this and child [CanvasItem] nodes with a higher Y position are rendered in front of
   * nodes with a lower Y position. If `false`, this and child [CanvasItem] nodes are rendered normally
   * in scene tree order.
   *
   * With Y-sorting enabled on a parent node ('A') but disabled on a child node ('B'), the child
   * node ('B') is sorted but its children ('C1', 'C2', etc.) render together on the same Y position as
   * the child node ('B'). This allows you to organize the render order of a scene without changing the
   * scene tree.
   *
   * Nodes sort relative to each other only if they are on the same [zIndex].
   */
  public final inline var ySortEnabled: Boolean
    @JvmName("ySortEnabledProperty")
    get() = isYSortEnabled()
    @JvmName("ySortEnabledProperty")
    set(`value`) {
      setYSortEnabled(value)
    }

  /**
   * The texture filtering mode to use on this [CanvasItem].
   */
  public final inline var textureFilter: TextureFilter
    @JvmName("textureFilterProperty")
    get() = getTextureFilter()
    @JvmName("textureFilterProperty")
    set(`value`) {
      setTextureFilter(value)
    }

  /**
   * The texture repeating mode to use on this [CanvasItem].
   */
  public final inline var textureRepeat: TextureRepeat
    @JvmName("textureRepeatProperty")
    get() = getTextureRepeat()
    @JvmName("textureRepeatProperty")
    set(`value`) {
      setTextureRepeat(value)
    }

  /**
   * The material applied to this [CanvasItem].
   */
  public final inline var material: Material?
    @JvmName("materialProperty")
    get() = getMaterial()
    @JvmName("materialProperty")
    set(`value`) {
      setMaterial(value)
    }

  /**
   * If `true`, the parent [CanvasItem]'s [material] property is used as this one's material.
   */
  public final inline var useParentMaterial: Boolean
    @JvmName("useParentMaterialProperty")
    get() = getUseParentMaterial()
    @JvmName("useParentMaterialProperty")
    set(`value`) {
      setUseParentMaterial(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(136, scriptIndex)
  }

  /**
   * This is a helper function for [modulate] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = canvasitem.modulate
   * //Your changes
   * canvasitem.modulate = myCoreType
   * ``````
   *
   * The color applied to this [CanvasItem]. This property does affect child [CanvasItem]s, unlike
   * [selfModulate] which only affects the node itself.
   */
  @CoreTypeHelper
  public final fun modulateMutate(block: Color.() -> Unit): Color = modulate.apply {
     block(this)
     modulate = this
  }

  /**
   * This is a helper function for [selfModulate] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = canvasitem.selfModulate
   * //Your changes
   * canvasitem.selfModulate = myCoreType
   * ``````
   *
   * The color applied to this [CanvasItem]. This property does **not** affect child [CanvasItem]s,
   * unlike [modulate] which affects both the node itself and its children.
   *
   * **Note:** Internal children (e.g. sliders in [ColorPicker] or tab bar in [TabContainer]) are
   * also not affected by this property (see `include_internal` parameter of [Node.getChild] and other
   * similar methods).
   */
  @CoreTypeHelper
  public final fun selfModulateMutate(block: Color.() -> Unit): Color = selfModulate.apply {
     block(this)
     selfModulate = this
  }

  /**
   * Called when [CanvasItem] has been requested to redraw (after [queueRedraw] is called, either
   * manually or by the engine).
   *
   * Corresponds to the [NOTIFICATION_DRAW] notification in [Object.Notification].
   */
  public open fun _draw(): Unit {
    throw NotImplementedError("CanvasItem::_draw is not implemented.")
  }

  /**
   * Returns the canvas item RID used by [RenderingServer] for this item.
   */
  public final fun getCanvasItem(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCanvasItemPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setVisible(visible: Boolean): Unit {
    TransferContext.writeArguments(BOOL to visible)
    TransferContext.callMethod(ptr, MethodBindings.setVisiblePtr, NIL)
  }

  public final fun isVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the node is present in the [SceneTree], its [visible] property is `true` and
   * all its ancestors are also visible. If any ancestor is hidden, this node will not be visible in
   * the scene tree, and is therefore not drawn (see [_draw]).
   *
   * Visibility is checked only in parent nodes that inherit from [CanvasItem], [CanvasLayer], and
   * [Window]. If the parent is of any other type (such as [Node], [AnimationPlayer], or [Node3D]), it
   * is assumed to be visible.
   *
   * **Note:** This method does not take [visibilityLayer] into account, so even if this method
   * returns `true`, the node might end up not being rendered.
   */
  public final fun isVisibleInTree(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isVisibleInTreePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Show the [CanvasItem] if it's currently hidden. This is equivalent to setting [visible] to
   * `true`. For controls that inherit [Popup], the correct way to make them visible is to call one of
   * the multiple `popup*()` functions instead.
   */
  public final fun show(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.showPtr, NIL)
  }

  /**
   * Hide the [CanvasItem] if it's currently visible. This is equivalent to setting [visible] to
   * `false`.
   */
  public final fun hide(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hidePtr, NIL)
  }

  /**
   * Queues the [CanvasItem] to redraw. During idle time, if [CanvasItem] is visible,
   * [NOTIFICATION_DRAW] is sent and [_draw] is called. This only occurs **once** per frame, even if
   * this method has been called multiple times.
   */
  public final fun queueRedraw(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.queueRedrawPtr, NIL)
  }

  /**
   * Moves this node to display on top of its siblings.
   *
   * Internally, the node is moved to the bottom of parent's child list. The method has no effect on
   * nodes without a parent.
   */
  public final fun moveToFront(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.moveToFrontPtr, NIL)
  }

  public final fun setAsTopLevel(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setAsTopLevelPtr, NIL)
  }

  public final fun isSetAsTopLevel(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSetAsTopLevelPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setLightMask(lightMask: Int): Unit {
    TransferContext.writeArguments(LONG to lightMask.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setLightMaskPtr, NIL)
  }

  public final fun getLightMask(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLightMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setModulate(modulate: Color): Unit {
    TransferContext.writeArguments(COLOR to modulate)
    TransferContext.callMethod(ptr, MethodBindings.setModulatePtr, NIL)
  }

  public final fun getModulate(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getModulatePtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setSelfModulate(selfModulate: Color): Unit {
    TransferContext.writeArguments(COLOR to selfModulate)
    TransferContext.callMethod(ptr, MethodBindings.setSelfModulatePtr, NIL)
  }

  public final fun getSelfModulate(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSelfModulatePtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setZIndex(zIndex: Int): Unit {
    TransferContext.writeArguments(LONG to zIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setZIndexPtr, NIL)
  }

  public final fun getZIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getZIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setZAsRelative(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setZAsRelativePtr, NIL)
  }

  public final fun isZRelative(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isZRelativePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setYSortEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setYSortEnabledPtr, NIL)
  }

  public final fun isYSortEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isYSortEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDrawBehindParent(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setDrawBehindParentPtr, NIL)
  }

  public final fun isDrawBehindParentEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDrawBehindParentEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Draws a line from a 2D point to another, with a given color and width. It can be optionally
   * antialiased. See also [drawDashedLine], [drawMultiline], and [drawPolyline].
   *
   * If [width] is negative, then a two-point primitive will be drawn instead of a four-point one.
   * This means that when the CanvasItem is scaled, the line will remain thin. If this behavior is not
   * desired, then pass a positive [width] like `1.0`.
   */
  @JvmOverloads
  public final fun drawLine(
    from: Vector2,
    to: Vector2,
    color: Color,
    width: Float = -1.0f,
    antialiased: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to, COLOR to color, DOUBLE to width.toDouble(), BOOL to antialiased)
    TransferContext.callMethod(ptr, MethodBindings.drawLinePtr, NIL)
  }

  /**
   * Draws a dashed line from a 2D point to another, with a given color and width. See also
   * [drawLine], [drawMultiline], and [drawPolyline].
   *
   * If [width] is negative, then a two-point primitives will be drawn instead of a four-point ones.
   * This means that when the CanvasItem is scaled, the line parts will remain thin. If this behavior
   * is not desired, then pass a positive [width] like `1.0`.
   *
   * [dash] is the length of each dash in pixels, with the gap between each dash being the same
   * length. If [aligned] is `true`, the length of the first and last dashes may be shortened or
   * lengthened to allow the line to begin and end at the precise points defined by [from] and [to].
   * Both ends are always symmetrical when [aligned] is `true`. If [aligned] is `false`, all dashes
   * will have the same length, but the line may appear incomplete at the end due to the dash length
   * not dividing evenly into the line length. Only full dashes are drawn when [aligned] is `false`.
   *
   * If [antialiased] is `true`, half transparent "feathers" will be attached to the boundary,
   * making outlines smooth.
   *
   * **Note:** [antialiased] is only effective if [width] is greater than `0.0`.
   */
  @JvmOverloads
  public final fun drawDashedLine(
    from: Vector2,
    to: Vector2,
    color: Color,
    width: Float = -1.0f,
    dash: Float = 2.0f,
    aligned: Boolean = true,
    antialiased: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to, COLOR to color, DOUBLE to width.toDouble(), DOUBLE to dash.toDouble(), BOOL to aligned, BOOL to antialiased)
    TransferContext.callMethod(ptr, MethodBindings.drawDashedLinePtr, NIL)
  }

  /**
   * Draws interconnected line segments with a uniform [color] and [width] and optional antialiasing
   * (supported only for positive [width]). When drawing large amounts of lines, this is faster than
   * using individual [drawLine] calls. To draw disconnected lines, use [drawMultiline] instead. See
   * also [drawPolygon].
   *
   * If [width] is negative, it will be ignored and the polyline will be drawn using
   * [RenderingServer.PRIMITIVE_LINE_STRIP]. This means that when the CanvasItem is scaled, the
   * polyline will remain thin. If this behavior is not desired, then pass a positive [width] like
   * `1.0`.
   */
  @JvmOverloads
  public final fun drawPolyline(
    points: PackedVector2Array,
    color: Color,
    width: Float = -1.0f,
    antialiased: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, COLOR to color, DOUBLE to width.toDouble(), BOOL to antialiased)
    TransferContext.callMethod(ptr, MethodBindings.drawPolylinePtr, NIL)
  }

  /**
   * Draws interconnected line segments with a uniform [width], point-by-point coloring, and
   * optional antialiasing (supported only for positive [width]). Colors assigned to line points match
   * by index between [points] and [colors], i.e. each line segment is filled with a gradient between
   * the colors of the endpoints. When drawing large amounts of lines, this is faster than using
   * individual [drawLine] calls. To draw disconnected lines, use [drawMultilineColors] instead. See
   * also [drawPolygon].
   *
   * If [width] is negative, it will be ignored and the polyline will be drawn using
   * [RenderingServer.PRIMITIVE_LINE_STRIP]. This means that when the CanvasItem is scaled, the
   * polyline will remain thin. If this behavior is not desired, then pass a positive [width] like
   * `1.0`.
   */
  @JvmOverloads
  public final fun drawPolylineColors(
    points: PackedVector2Array,
    colors: PackedColorArray,
    width: Float = -1.0f,
    antialiased: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, DOUBLE to width.toDouble(), BOOL to antialiased)
    TransferContext.callMethod(ptr, MethodBindings.drawPolylineColorsPtr, NIL)
  }

  /**
   * Draws an unfilled arc between the given angles with a uniform [color] and [width] and optional
   * antialiasing (supported only for positive [width]). The larger the value of [pointCount], the
   * smoother the curve. See also [drawCircle].
   *
   * If [width] is negative, it will be ignored and the arc will be drawn using
   * [RenderingServer.PRIMITIVE_LINE_STRIP]. This means that when the CanvasItem is scaled, the arc
   * will remain thin. If this behavior is not desired, then pass a positive [width] like `1.0`.
   *
   * The arc is drawn from [startAngle] towards the value of [endAngle] so in clockwise direction if
   * `start_angle < end_angle` and counter-clockwise otherwise. Passing the same angles but in reversed
   * order will produce the same arc. If absolute difference of [startAngle] and [endAngle] is greater
   * than [@GDScript.TAU] radians, then a full circle arc is drawn (i.e. arc will not overlap itself).
   */
  @JvmOverloads
  public final fun drawArc(
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
    TransferContext.callMethod(ptr, MethodBindings.drawArcPtr, NIL)
  }

  /**
   * Draws multiple disconnected lines with a uniform [width] and [color]. Each line is defined by
   * two consecutive points from [points] array, i.e. i-th segment consists of `points[2 * i]`,
   * `points[2 * i + 1]` endpoints. When drawing large amounts of lines, this is faster than using
   * individual [drawLine] calls. To draw interconnected lines, use [drawPolyline] instead.
   *
   * If [width] is negative, then two-point primitives will be drawn instead of a four-point ones.
   * This means that when the CanvasItem is scaled, the lines will remain thin. If this behavior is not
   * desired, then pass a positive [width] like `1.0`.
   *
   * **Note:** [antialiased] is only effective if [width] is greater than `0.0`.
   */
  @JvmOverloads
  public final fun drawMultiline(
    points: PackedVector2Array,
    color: Color,
    width: Float = -1.0f,
    antialiased: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, COLOR to color, DOUBLE to width.toDouble(), BOOL to antialiased)
    TransferContext.callMethod(ptr, MethodBindings.drawMultilinePtr, NIL)
  }

  /**
   * Draws multiple disconnected lines with a uniform [width] and segment-by-segment coloring. Each
   * segment is defined by two consecutive points from [points] array and a corresponding color from
   * [colors] array, i.e. i-th segment consists of `points[2 * i]`, `points[2 * i + 1]` endpoints and
   * has `colors[i]` color. When drawing large amounts of lines, this is faster than using individual
   * [drawLine] calls. To draw interconnected lines, use [drawPolylineColors] instead.
   *
   * If [width] is negative, then two-point primitives will be drawn instead of a four-point ones.
   * This means that when the CanvasItem is scaled, the lines will remain thin. If this behavior is not
   * desired, then pass a positive [width] like `1.0`.
   *
   * **Note:** [antialiased] is only effective if [width] is greater than `0.0`.
   */
  @JvmOverloads
  public final fun drawMultilineColors(
    points: PackedVector2Array,
    colors: PackedColorArray,
    width: Float = -1.0f,
    antialiased: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, DOUBLE to width.toDouble(), BOOL to antialiased)
    TransferContext.callMethod(ptr, MethodBindings.drawMultilineColorsPtr, NIL)
  }

  /**
   * Draws a rectangle. If [filled] is `true`, the rectangle will be filled with the [color]
   * specified. If [filled] is `false`, the rectangle will be drawn as a stroke with the [color] and
   * [width] specified. See also [drawTextureRect].
   *
   * If [width] is negative, then two-point primitives will be drawn instead of a four-point ones.
   * This means that when the CanvasItem is scaled, the lines will remain thin. If this behavior is not
   * desired, then pass a positive [width] like `1.0`.
   *
   * If [antialiased] is `true`, half transparent "feathers" will be attached to the boundary,
   * making outlines smooth.
   *
   * **Note:** [width] is only effective if [filled] is `false`.
   *
   * **Note:** Unfilled rectangles drawn with a negative [width] may not display perfectly. For
   * example, corners may be missing or brighter due to overlapping lines (for a translucent [color]).
   */
  @JvmOverloads
  public final fun drawRect(
    rect: Rect2,
    color: Color,
    filled: Boolean = true,
    width: Float = -1.0f,
    antialiased: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(RECT2 to rect, COLOR to color, BOOL to filled, DOUBLE to width.toDouble(), BOOL to antialiased)
    TransferContext.callMethod(ptr, MethodBindings.drawRectPtr, NIL)
  }

  /**
   * Draws a circle. See also [drawArc], [drawPolyline], and [drawPolygon].
   *
   * If [filled] is `true`, the circle will be filled with the [color] specified. If [filled] is
   * `false`, the circle will be drawn as a stroke with the [color] and [width] specified.
   *
   * If [width] is negative, then two-point primitives will be drawn instead of a four-point ones.
   * This means that when the CanvasItem is scaled, the lines will remain thin. If this behavior is not
   * desired, then pass a positive [width] like `1.0`.
   *
   * If [antialiased] is `true`, half transparent "feathers" will be attached to the boundary,
   * making outlines smooth.
   *
   * **Note:** [width] is only effective if [filled] is `false`.
   */
  @JvmOverloads
  public final fun drawCircle(
    position: Vector2,
    radius: Float,
    color: Color,
    filled: Boolean = true,
    width: Float = -1.0f,
    antialiased: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(VECTOR2 to position, DOUBLE to radius.toDouble(), COLOR to color, BOOL to filled, DOUBLE to width.toDouble(), BOOL to antialiased)
    TransferContext.callMethod(ptr, MethodBindings.drawCirclePtr, NIL)
  }

  /**
   * Draws a texture at a given position.
   */
  @JvmOverloads
  public final fun drawTexture(
    texture: Texture2D?,
    position: Vector2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, VECTOR2 to position, COLOR to modulate)
    TransferContext.callMethod(ptr, MethodBindings.drawTexturePtr, NIL)
  }

  /**
   * Draws a textured rectangle at a given position, optionally modulated by a color. If [transpose]
   * is `true`, the texture will have its X and Y coordinates swapped. See also [drawRect] and
   * [drawTextureRectRegion].
   */
  @JvmOverloads
  public final fun drawTextureRect(
    texture: Texture2D?,
    rect: Rect2,
    tile: Boolean,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, RECT2 to rect, BOOL to tile, COLOR to modulate, BOOL to transpose)
    TransferContext.callMethod(ptr, MethodBindings.drawTextureRectPtr, NIL)
  }

  /**
   * Draws a textured rectangle from a texture's region (specified by [srcRect]) at a given
   * position, optionally modulated by a color. If [transpose] is `true`, the texture will have its X
   * and Y coordinates swapped. See also [drawTextureRect].
   */
  @JvmOverloads
  public final fun drawTextureRectRegion(
    texture: Texture2D?,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    transpose: Boolean = false,
    clipUv: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, RECT2 to rect, RECT2 to srcRect, COLOR to modulate, BOOL to transpose, BOOL to clipUv)
    TransferContext.callMethod(ptr, MethodBindings.drawTextureRectRegionPtr, NIL)
  }

  /**
   * Draws a textured rectangle region of the multi-channel signed distance field texture at a given
   * position, optionally modulated by a color. See [FontFile.multichannelSignedDistanceField] for more
   * information and caveats about MSDF font rendering.
   *
   * If [outline] is positive, each alpha channel value of pixel in region is set to maximum value
   * of true distance in the [outline] radius.
   *
   * Value of the [pixelRange] should the same that was used during distance field texture
   * generation.
   */
  @JvmOverloads
  public final fun drawMsdfTextureRectRegion(
    texture: Texture2D?,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    outline: Double = 0.0,
    pixelRange: Double = 4.0,
    scale: Double = 1.0,
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, RECT2 to rect, RECT2 to srcRect, COLOR to modulate, DOUBLE to outline, DOUBLE to pixelRange, DOUBLE to scale)
    TransferContext.callMethod(ptr, MethodBindings.drawMsdfTextureRectRegionPtr, NIL)
  }

  /**
   * Draws a textured rectangle region of the font texture with LCD subpixel anti-aliasing at a
   * given position, optionally modulated by a color.
   *
   * Texture is drawn using the following blend operation, blend mode of the [CanvasItemMaterial] is
   * ignored:
   *
   * ```
   * dst.r = texture.r * modulate.r * modulate.a + dst.r * (1.0 - texture.r * modulate.a);
   * dst.g = texture.g * modulate.g * modulate.a + dst.g * (1.0 - texture.g * modulate.a);
   * dst.b = texture.b * modulate.b * modulate.a + dst.b * (1.0 - texture.b * modulate.a);
   * dst.a = modulate.a + dst.a * (1.0 - modulate.a);
   * ```
   */
  @JvmOverloads
  public final fun drawLcdTextureRectRegion(
    texture: Texture2D?,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, RECT2 to rect, RECT2 to srcRect, COLOR to modulate)
    TransferContext.callMethod(ptr, MethodBindings.drawLcdTextureRectRegionPtr, NIL)
  }

  /**
   * Draws a styled rectangle.
   */
  public final fun drawStyleBox(styleBox: StyleBox?, rect: Rect2): Unit {
    TransferContext.writeArguments(OBJECT to styleBox, RECT2 to rect)
    TransferContext.callMethod(ptr, MethodBindings.drawStyleBoxPtr, NIL)
  }

  /**
   * Draws a custom primitive. 1 point for a point, 2 points for a line, 3 points for a triangle,
   * and 4 points for a quad. If 0 points or more than 4 points are specified, nothing will be drawn
   * and an error message will be printed. See also [drawLine], [drawPolyline], [drawPolygon], and
   * [drawRect].
   */
  @JvmOverloads
  public final fun drawPrimitive(
    points: PackedVector2Array,
    colors: PackedColorArray,
    uvs: PackedVector2Array,
    texture: Texture2D? = null,
  ): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, PACKED_VECTOR2_ARRAY to uvs, OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.drawPrimitivePtr, NIL)
  }

  /**
   * Draws a solid polygon of any number of points, convex or concave. Unlike [drawColoredPolygon],
   * each point's color can be changed individually. See also [drawPolyline] and [drawPolylineColors].
   * If you need more flexibility (such as being able to use bones), use
   * [RenderingServer.canvasItemAddTriangleArray] instead.
   *
   * **Note:** If you frequently redraw the same polygon with a large number of vertices, consider
   * pre-calculating the triangulation with [Geometry2D.triangulatePolygon] and using [drawMesh],
   * [drawMultimesh], or [RenderingServer.canvasItemAddTriangleArray].
   */
  @JvmOverloads
  public final fun drawPolygon(
    points: PackedVector2Array,
    colors: PackedColorArray,
    uvs: PackedVector2Array = PackedVector2Array(),
    texture: Texture2D? = null,
  ): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, PACKED_COLOR_ARRAY to colors, PACKED_VECTOR2_ARRAY to uvs, OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.drawPolygonPtr, NIL)
  }

  /**
   * Draws a colored polygon of any number of points, convex or concave. Unlike [drawPolygon], a
   * single color must be specified for the whole polygon.
   *
   * **Note:** If you frequently redraw the same polygon with a large number of vertices, consider
   * pre-calculating the triangulation with [Geometry2D.triangulatePolygon] and using [drawMesh],
   * [drawMultimesh], or [RenderingServer.canvasItemAddTriangleArray].
   */
  @JvmOverloads
  public final fun drawColoredPolygon(
    points: PackedVector2Array,
    color: Color,
    uvs: PackedVector2Array = PackedVector2Array(),
    texture: Texture2D? = null,
  ): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to points, COLOR to color, PACKED_VECTOR2_ARRAY to uvs, OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.drawColoredPolygonPtr, NIL)
  }

  /**
   * Draws [text] using the specified [font] at the [pos] (bottom-left corner using the baseline of
   * the font). The text will have its color multiplied by [modulate]. If [width] is greater than or
   * equal to 0, the text will be clipped if it exceeds the specified width.
   *
   * **Example:** Draw "Hello world", using the project's default font:
   *
   * ```gdscript
   * //gdscript
   * # If using this method in a script that redraws constantly, move the
   * # `default_font` declaration to a member variable assigned in `_ready()`
   * # so the Control is only created once.
   * var default_font = ThemeDB.fallback_font
   * var default_font_size = ThemeDB.fallback_font_size
   * draw_string(default_font, Vector2(64, 64), "Hello world", HORIZONTAL_ALIGNMENT_LEFT, -1,
   * default_font_size)
   * ```
   *
   * ```csharp
   * //csharp
   * // If using this method in a script that redraws constantly, move the
   * // `default_font` declaration to a member variable assigned in `_Ready()`
   * // so the Control is only created once.
   * Font defaultFont = ThemeDB.FallbackFont;
   * int defaultFontSize = ThemeDB.FallbackFontSize;
   * DrawString(defaultFont, new Vector2(64, 64), "Hello world", HORIZONTAL_ALIGNMENT_LEFT, -1,
   * defaultFontSize);
   * ```
   *
   * See also [Font.drawString].
   */
  @JvmOverloads
  public final fun drawString(
    font: Font?,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlag(3),
    direction: TextServer.Direction = TextServer.Direction.AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.HORIZONTAL,
  ): Unit {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to pos, STRING to text, LONG to alignment.value, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), COLOR to modulate, LONG to justificationFlags.flag, LONG to direction.value, LONG to orientation.value)
    TransferContext.callMethod(ptr, MethodBindings.drawStringPtr, NIL)
  }

  /**
   * Breaks [text] into lines and draws it using the specified [font] at the [pos] (top-left
   * corner). The text will have its color multiplied by [modulate]. If [width] is greater than or
   * equal to 0, the text will be clipped if it exceeds the specified width.
   */
  @JvmOverloads
  public final fun drawMultilineString(
    font: Font?,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    maxLines: Int = -1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    brkFlags: TextServer.LineBreakFlag = TextServer.LineBreakFlag(3),
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlag(3),
    direction: TextServer.Direction = TextServer.Direction.AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.HORIZONTAL,
  ): Unit {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to pos, STRING to text, LONG to alignment.value, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), LONG to maxLines.toLong(), COLOR to modulate, LONG to brkFlags.flag, LONG to justificationFlags.flag, LONG to direction.value, LONG to orientation.value)
    TransferContext.callMethod(ptr, MethodBindings.drawMultilineStringPtr, NIL)
  }

  /**
   * Draws [text] outline using the specified [font] at the [pos] (bottom-left corner using the
   * baseline of the font). The text will have its color multiplied by [modulate]. If [width] is
   * greater than or equal to 0, the text will be clipped if it exceeds the specified width.
   */
  @JvmOverloads
  public final fun drawStringOutline(
    font: Font?,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    size: Int = 1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlag(3),
    direction: TextServer.Direction = TextServer.Direction.AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.HORIZONTAL,
  ): Unit {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to pos, STRING to text, LONG to alignment.value, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), LONG to size.toLong(), COLOR to modulate, LONG to justificationFlags.flag, LONG to direction.value, LONG to orientation.value)
    TransferContext.callMethod(ptr, MethodBindings.drawStringOutlinePtr, NIL)
  }

  /**
   * Breaks [text] to the lines and draws text outline using the specified [font] at the [pos]
   * (top-left corner). The text will have its color multiplied by [modulate]. If [width] is greater
   * than or equal to 0, the text will be clipped if it exceeds the specified width.
   */
  @JvmOverloads
  public final fun drawMultilineStringOutline(
    font: Font?,
    pos: Vector2,
    text: String,
    alignment: HorizontalAlignment = HorizontalAlignment.LEFT,
    width: Float = -1.0f,
    fontSize: Int = 16,
    maxLines: Int = -1,
    size: Int = 1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
    brkFlags: TextServer.LineBreakFlag = TextServer.LineBreakFlag(3),
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlag(3),
    direction: TextServer.Direction = TextServer.Direction.AUTO,
    orientation: TextServer.Orientation = TextServer.Orientation.HORIZONTAL,
  ): Unit {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to pos, STRING to text, LONG to alignment.value, DOUBLE to width.toDouble(), LONG to fontSize.toLong(), LONG to maxLines.toLong(), LONG to size.toLong(), COLOR to modulate, LONG to brkFlags.flag, LONG to justificationFlags.flag, LONG to direction.value, LONG to orientation.value)
    TransferContext.callMethod(ptr, MethodBindings.drawMultilineStringOutlinePtr, NIL)
  }

  /**
   * Draws a string first character using a custom font.
   */
  @JvmOverloads
  public final fun drawChar(
    font: Font?,
    pos: Vector2,
    char: String,
    fontSize: Int = 16,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to pos, STRING to char, LONG to fontSize.toLong(), COLOR to modulate)
    TransferContext.callMethod(ptr, MethodBindings.drawCharPtr, NIL)
  }

  /**
   * Draws a string first character outline using a custom font.
   */
  @JvmOverloads
  public final fun drawCharOutline(
    font: Font?,
    pos: Vector2,
    char: String,
    fontSize: Int = 16,
    size: Int = -1,
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to pos, STRING to char, LONG to fontSize.toLong(), LONG to size.toLong(), COLOR to modulate)
    TransferContext.callMethod(ptr, MethodBindings.drawCharOutlinePtr, NIL)
  }

  /**
   * Draws a [Mesh] in 2D, using the provided texture. See [MeshInstance2D] for related
   * documentation.
   */
  @JvmOverloads
  public final fun drawMesh(
    mesh: Mesh?,
    texture: Texture2D?,
    transform: Transform2D = Transform2D(),
    modulate: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(OBJECT to mesh, OBJECT to texture, TRANSFORM2D to transform, COLOR to modulate)
    TransferContext.callMethod(ptr, MethodBindings.drawMeshPtr, NIL)
  }

  /**
   * Draws a [MultiMesh] in 2D with the provided texture. See [MultiMeshInstance2D] for related
   * documentation.
   */
  public final fun drawMultimesh(multimesh: MultiMesh?, texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to multimesh, OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.drawMultimeshPtr, NIL)
  }

  /**
   * Sets a custom transform for drawing via components. Anything drawn afterwards will be
   * transformed by this.
   *
   * **Note:** [FontFile.oversampling] does *not* take [scale] into account. This means that scaling
   * up/down will cause bitmap fonts and rasterized (non-MSDF) dynamic fonts to appear blurry or
   * pixelated. To ensure text remains crisp regardless of scale, you can enable MSDF font rendering by
   * enabling [ProjectSettings.gui/theme/defaultFontMultichannelSignedDistanceField] (applies to the
   * default project font only), or enabling **Multichannel Signed Distance Field** in the import
   * options of a DynamicFont for custom fonts. On system fonts,
   * [SystemFont.multichannelSignedDistanceField] can be enabled in the inspector.
   */
  @JvmOverloads
  public final fun drawSetTransform(
    position: Vector2,
    rotation: Float = 0.0f,
    scale: Vector2 = Vector2(1, 1),
  ): Unit {
    TransferContext.writeArguments(VECTOR2 to position, DOUBLE to rotation.toDouble(), VECTOR2 to scale)
    TransferContext.callMethod(ptr, MethodBindings.drawSetTransformPtr, NIL)
  }

  /**
   * Sets a custom transform for drawing via matrix. Anything drawn afterwards will be transformed
   * by this.
   */
  public final fun drawSetTransformMatrix(xform: Transform2D): Unit {
    TransferContext.writeArguments(TRANSFORM2D to xform)
    TransferContext.callMethod(ptr, MethodBindings.drawSetTransformMatrixPtr, NIL)
  }

  /**
   * Subsequent drawing commands will be ignored unless they fall within the specified animation
   * slice. This is a faster way to implement animations that loop on background rather than redrawing
   * constantly.
   */
  @JvmOverloads
  public final fun drawAnimationSlice(
    animationLength: Double,
    sliceBegin: Double,
    sliceEnd: Double,
    offset: Double = 0.0,
  ): Unit {
    TransferContext.writeArguments(DOUBLE to animationLength, DOUBLE to sliceBegin, DOUBLE to sliceEnd, DOUBLE to offset)
    TransferContext.callMethod(ptr, MethodBindings.drawAnimationSlicePtr, NIL)
  }

  /**
   * After submitting all animations slices via [drawAnimationSlice], this function can be used to
   * revert drawing to its default state (all subsequent drawing commands will be visible). If you
   * don't care about this particular use case, usage of this function after submitting the slices is
   * not required.
   */
  public final fun drawEndAnimation(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.drawEndAnimationPtr, NIL)
  }

  /**
   * Returns the transform matrix of this item.
   */
  public final fun getTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  /**
   * Returns the global transform matrix of this item, i.e. the combined transform up to the topmost
   * [CanvasItem] node. The topmost item is a [CanvasItem] that either has no parent, has
   * non-[CanvasItem] parent or it has [topLevel] enabled.
   */
  public final fun getGlobalTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlobalTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  /**
   * Returns the transform from the local coordinate system of this [CanvasItem] to the [Viewport]s
   * coordinate system.
   */
  public final fun getGlobalTransformWithCanvas(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlobalTransformWithCanvasPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  /**
   * Returns the transform from the coordinate system of the canvas, this item is in, to the
   * [Viewport]s embedders coordinate system.
   */
  public final fun getViewportTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getViewportTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  /**
   * Returns the viewport's boundaries as a [Rect2].
   */
  public final fun getViewportRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getViewportRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  /**
   * Returns the transform from the coordinate system of the canvas, this item is in, to the
   * [Viewport]s coordinate system.
   */
  public final fun getCanvasTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCanvasTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  /**
   * Returns the transform of this [CanvasItem] in global screen coordinates (i.e. taking window
   * position into account). Mostly useful for editor plugins.
   *
   * Equals to [getGlobalTransform] if the window is embedded (see [Viewport.guiEmbedSubwindows]).
   */
  public final fun getScreenTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getScreenTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  /**
   * Returns the mouse's position in this [CanvasItem] using the local coordinate system of this
   * [CanvasItem].
   */
  public final fun getLocalMousePosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLocalMousePositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the mouse's position in the [CanvasLayer] that this [CanvasItem] is in using the
   * coordinate system of the [CanvasLayer].
   *
   * **Note:** For screen-space coordinates (e.g. when using a non-embedded [Popup]), you can use
   * [DisplayServer.mouseGetPosition].
   */
  public final fun getGlobalMousePosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlobalMousePositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the [RID] of the [World2D] canvas where this item is in.
   */
  public final fun getCanvas(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCanvasPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the [CanvasLayer] that contains this node, or `null` if the node is not in any
   * [CanvasLayer].
   */
  public final fun getCanvasLayerNode(): CanvasLayer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCanvasLayerNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as CanvasLayer?)
  }

  /**
   * Returns the [World2D] where this item is in.
   */
  public final fun getWorld2d(): World2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWorld2dPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as World2D?)
  }

  public final fun setMaterial(material: Material?): Unit {
    TransferContext.writeArguments(OBJECT to material)
    TransferContext.callMethod(ptr, MethodBindings.setMaterialPtr, NIL)
  }

  public final fun getMaterial(): Material? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaterialPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Material?)
  }

  /**
   * Set the value of a shader uniform for this instance only
   * ([url=$DOCS_URL/tutorials/shaders/shader_reference/shading_language.html#per-instance-uniforms]per-instance
   * uniform[/url]). See also [ShaderMaterial.setShaderParameter] to assign a uniform on all instances
   * using the same [ShaderMaterial].
   *
   * **Note:** For a shader uniform to be assignable on a per-instance basis, it *must* be defined
   * with `instance uniform ...` rather than `uniform ...` in the shader code.
   *
   * **Note:** [name] is case-sensitive and must match the name of the uniform in the code exactly
   * (not the capitalized name in the inspector).
   */
  public final fun setInstanceShaderParameter(name: StringName, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(ptr, MethodBindings.setInstanceShaderParameterPtr, NIL)
  }

  /**
   * Get the value of a shader parameter as set on this instance.
   */
  public final fun getInstanceShaderParameter(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.getInstanceShaderParameterPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  public final fun setUseParentMaterial(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setUseParentMaterialPtr, NIL)
  }

  public final fun getUseParentMaterial(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUseParentMaterialPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If [enable] is `true`, this node will receive [NOTIFICATION_LOCAL_TRANSFORM_CHANGED] when its
   * local transform changes.
   */
  public final fun setNotifyLocalTransform(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setNotifyLocalTransformPtr, NIL)
  }

  /**
   * Returns `true` if local transform notifications are communicated to children.
   */
  public final fun isLocalTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isLocalTransformNotificationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If [enable] is `true`, this node will receive [NOTIFICATION_TRANSFORM_CHANGED] when its global
   * transform changes.
   */
  public final fun setNotifyTransform(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setNotifyTransformPtr, NIL)
  }

  /**
   * Returns `true` if global transform notifications are communicated to children.
   */
  public final fun isTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isTransformNotificationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Forces the transform to update. Transform changes in physics are not instant for performance
   * reasons. Transforms are accumulated and then set. Use this if you need an up-to-date transform
   * when doing physics operations.
   */
  public final fun forceUpdateTransform(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.forceUpdateTransformPtr, NIL)
  }

  /**
   * Transforms [viewportPoint] from the viewport's coordinates to this node's local coordinates.
   *
   * For the opposite operation, use [getGlobalTransformWithCanvas].
   *
   * ```
   * var viewport_point = get_global_transform_with_canvas() * local_point
   * ```
   */
  public final fun makeCanvasPositionLocal(viewportPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to viewportPoint)
    TransferContext.callMethod(ptr, MethodBindings.makeCanvasPositionLocalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Transformations issued by [event]'s inputs are applied in local space instead of global space.
   */
  public final fun makeInputLocal(event: InputEvent?): InputEvent? {
    TransferContext.writeArguments(OBJECT to event)
    TransferContext.callMethod(ptr, MethodBindings.makeInputLocalPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as InputEvent?)
  }

  public final fun setVisibilityLayer(layer: Long): Unit {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(ptr, MethodBindings.setVisibilityLayerPtr, NIL)
  }

  public final fun getVisibilityLayer(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVisibilityLayerPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Set/clear individual bits on the rendering visibility layer. This simplifies editing this
   * [CanvasItem]'s visibility layer.
   */
  public final fun setVisibilityLayerBit(layer: Long, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to layer, BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setVisibilityLayerBitPtr, NIL)
  }

  /**
   * Returns an individual bit on the rendering visibility layer.
   */
  public final fun getVisibilityLayerBit(layer: Long): Boolean {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(ptr, MethodBindings.getVisibilityLayerBitPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTextureFilter(mode: TextureFilter): Unit {
    TransferContext.writeArguments(LONG to mode.value)
    TransferContext.callMethod(ptr, MethodBindings.setTextureFilterPtr, NIL)
  }

  public final fun getTextureFilter(): TextureFilter {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureFilterPtr, LONG)
    return TextureFilter.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTextureRepeat(mode: TextureRepeat): Unit {
    TransferContext.writeArguments(LONG to mode.value)
    TransferContext.callMethod(ptr, MethodBindings.setTextureRepeatPtr, NIL)
  }

  public final fun getTextureRepeat(): TextureRepeat {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureRepeatPtr, LONG)
    return TextureRepeat.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setClipChildrenMode(mode: ClipChildrenMode): Unit {
    TransferContext.writeArguments(LONG to mode.value)
    TransferContext.callMethod(ptr, MethodBindings.setClipChildrenModePtr, NIL)
  }

  public final fun getClipChildrenMode(): ClipChildrenMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getClipChildrenModePtr, LONG)
    return ClipChildrenMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Set the value of a shader uniform for this instance only
   * ([url=$DOCS_URL/tutorials/shaders/shader_reference/shading_language.html#per-instance-uniforms]per-instance
   * uniform[/url]). See also [ShaderMaterial.setShaderParameter] to assign a uniform on all instances
   * using the same [ShaderMaterial].
   *
   * **Note:** For a shader uniform to be assignable on a per-instance basis, it *must* be defined
   * with `instance uniform ...` rather than `uniform ...` in the shader code.
   *
   * **Note:** [name] is case-sensitive and must match the name of the uniform in the code exactly
   * (not the capitalized name in the inspector).
   */
  public final fun setInstanceShaderParameter(name: String, `value`: Any?) =
      setInstanceShaderParameter(name.asCachedStringName(), value)

  /**
   * Get the value of a shader parameter as set on this instance.
   */
  public final fun getInstanceShaderParameter(name: String): Any? =
      getInstanceShaderParameter(name.asCachedStringName())

  public enum class TextureFilter(
    `value`: Long,
  ) : GodotEnum {
    /**
     * The [CanvasItem] will inherit the filter from its parent.
     */
    PARENT_NODE(0),
    /**
     * The texture filter reads from the nearest pixel only. This makes the texture look pixelated
     * from up close, and grainy from a distance (due to mipmaps not being sampled).
     */
    NEAREST(1),
    /**
     * The texture filter blends between the nearest 4 pixels. This makes the texture look smooth
     * from up close, and grainy from a distance (due to mipmaps not being sampled).
     */
    LINEAR(2),
    /**
     * The texture filter reads from the nearest pixel and blends between the nearest 2 mipmaps (or
     * uses the nearest mipmap if
     * [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter] is `true`). This
     * makes the texture look pixelated from up close, and smooth from a distance.
     *
     * Use this for non-pixel art textures that may be viewed at a low scale (e.g. due to [Camera2D]
     * zoom or sprite scaling), as mipmaps are important to smooth out pixels that are smaller than
     * on-screen pixels.
     */
    NEAREST_WITH_MIPMAPS(3),
    /**
     * The texture filter blends between the nearest 4 pixels and between the nearest 2 mipmaps (or
     * uses the nearest mipmap if
     * [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter] is `true`). This
     * makes the texture look smooth from up close, and smooth from a distance.
     *
     * Use this for non-pixel art textures that may be viewed at a low scale (e.g. due to [Camera2D]
     * zoom or sprite scaling), as mipmaps are important to smooth out pixels that are smaller than
     * on-screen pixels.
     */
    LINEAR_WITH_MIPMAPS(4),
    /**
     * The texture filter reads from the nearest pixel and blends between 2 mipmaps (or uses the
     * nearest mipmap if [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter] is
     * `true`) based on the angle between the surface and the camera view. This makes the texture look
     * pixelated from up close, and smooth from a distance. Anisotropic filtering improves texture
     * quality on surfaces that are almost in line with the camera, but is slightly slower. The
     * anisotropic filtering level can be changed by adjusting
     * [ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     *
     * **Note:** This texture filter is rarely useful in 2D projects.
     * [TEXTURE_FILTER_NEAREST_WITH_MIPMAPS] is usually more appropriate in this case.
     */
    NEAREST_WITH_MIPMAPS_ANISOTROPIC(5),
    /**
     * The texture filter blends between the nearest 4 pixels and blends between 2 mipmaps (or uses
     * the nearest mipmap if [ProjectSettings.rendering/textures/defaultFilters/useNearestMipmapFilter]
     * is `true`) based on the angle between the surface and the camera view. This makes the texture
     * look smooth from up close, and smooth from a distance. Anisotropic filtering improves texture
     * quality on surfaces that are almost in line with the camera, but is slightly slower. The
     * anisotropic filtering level can be changed by adjusting
     * [ProjectSettings.rendering/textures/defaultFilters/anisotropicFilteringLevel].
     *
     * **Note:** This texture filter is rarely useful in 2D projects.
     * [TEXTURE_FILTER_LINEAR_WITH_MIPMAPS] is usually more appropriate in this case.
     */
    LINEAR_WITH_MIPMAPS_ANISOTROPIC(6),
    /**
     * Represents the size of the [TextureFilter] enum.
     */
    MAX(7),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): TextureFilter = entries.single { it.`value` == `value` }
    }
  }

  public enum class TextureRepeat(
    `value`: Long,
  ) : GodotEnum {
    /**
     * The [CanvasItem] will inherit the filter from its parent.
     */
    PARENT_NODE(0),
    /**
     * Texture will not repeat.
     */
    DISABLED(1),
    /**
     * Texture will repeat normally.
     */
    ENABLED(2),
    /**
     * Texture will repeat in a 2×2 tiled mode, where elements at even positions are mirrored.
     */
    MIRROR(3),
    /**
     * Represents the size of the [TextureRepeat] enum.
     */
    MAX(4),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): TextureRepeat = entries.single { it.`value` == `value` }
    }
  }

  public enum class ClipChildrenMode(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Child draws over parent and is not clipped.
     */
    DISABLED(0),
    /**
     * Parent is used for the purposes of clipping only. Child is clipped to the parent's visible
     * area, parent is not drawn.
     */
    ONLY(1),
    /**
     * Parent is used for clipping child, but parent is also drawn underneath child as normal before
     * clipping child to its visible area.
     */
    AND_DRAW(2),
    /**
     * Represents the size of the [ClipChildrenMode] enum.
     */
    MAX(3),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): ClipChildrenMode = entries.single { it.`value` == `value` }
    }
  }

  public companion object {
    /**
     * The [CanvasItem]'s global transform has changed. This notification is only received if
     * enabled by [setNotifyTransform].
     */
    public final const val NOTIFICATION_TRANSFORM_CHANGED: Long = 2000

    /**
     * The [CanvasItem]'s local transform has changed. This notification is only received if enabled
     * by [setNotifyLocalTransform].
     */
    public final const val NOTIFICATION_LOCAL_TRANSFORM_CHANGED: Long = 35

    /**
     * The [CanvasItem] is requested to draw (see [_draw]).
     */
    public final const val NOTIFICATION_DRAW: Long = 30

    /**
     * The [CanvasItem]'s visibility has changed.
     */
    public final const val NOTIFICATION_VISIBILITY_CHANGED: Long = 31

    /**
     * The [CanvasItem] has entered the canvas.
     */
    public final const val NOTIFICATION_ENTER_CANVAS: Long = 32

    /**
     * The [CanvasItem] has exited the canvas.
     */
    public final const val NOTIFICATION_EXIT_CANVAS: Long = 33

    /**
     * The [CanvasItem]'s active [World2D] changed.
     */
    public final const val NOTIFICATION_WORLD_2D_CHANGED: Long = 36
  }

  public object MethodBindings {
    internal val getCanvasItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_canvas_item", 2944877500)

    internal val setVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_visible", 2586408642)

    internal val isVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "is_visible", 36873697)

    internal val isVisibleInTreePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "is_visible_in_tree", 36873697)

    internal val showPtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "show", 3218959716)

    internal val hidePtr: VoidPtr = TypeManager.getMethodBindPtr("CanvasItem", "hide", 3218959716)

    internal val queueRedrawPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "queue_redraw", 3218959716)

    internal val moveToFrontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "move_to_front", 3218959716)

    internal val setAsTopLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_as_top_level", 2586408642)

    internal val isSetAsTopLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "is_set_as_top_level", 36873697)

    internal val setLightMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_light_mask", 1286410249)

    internal val getLightMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_light_mask", 3905245786)

    internal val setModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_modulate", 2920490490)

    internal val getModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_modulate", 3444240500)

    internal val setSelfModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_self_modulate", 2920490490)

    internal val getSelfModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_self_modulate", 3444240500)

    internal val setZIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_z_index", 1286410249)

    internal val getZIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_z_index", 3905245786)

    internal val setZAsRelativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_z_as_relative", 2586408642)

    internal val isZRelativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "is_z_relative", 36873697)

    internal val setYSortEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_y_sort_enabled", 2586408642)

    internal val isYSortEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "is_y_sort_enabled", 36873697)

    internal val setDrawBehindParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_draw_behind_parent", 2586408642)

    internal val isDrawBehindParentEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "is_draw_behind_parent_enabled", 36873697)

    internal val drawLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_line", 1562330099)

    internal val drawDashedLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_dashed_line", 3653831622)

    internal val drawPolylinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_polyline", 3797364428)

    internal val drawPolylineColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_polyline_colors", 2311979562)

    internal val drawArcPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_arc", 4140652635)

    internal val drawMultilinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_multiline", 3797364428)

    internal val drawMultilineColorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_multiline_colors", 2311979562)

    internal val drawRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_rect", 2773573813)

    internal val drawCirclePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_circle", 3153026596)

    internal val drawTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_texture", 520200117)

    internal val drawTextureRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_texture_rect", 3832805018)

    internal val drawTextureRectRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_texture_rect_region", 3883821411)

    internal val drawMsdfTextureRectRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_msdf_texture_rect_region", 4219163252)

    internal val drawLcdTextureRectRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_lcd_texture_rect_region", 3212350954)

    internal val drawStyleBoxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_style_box", 388176283)

    internal val drawPrimitivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_primitive", 3288481815)

    internal val drawPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_polygon", 974537912)

    internal val drawColoredPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_colored_polygon", 15245644)

    internal val drawStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_string", 728290553)

    internal val drawMultilineStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_multiline_string", 1927038192)

    internal val drawStringOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_string_outline", 340562381)

    internal val drawMultilineStringOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_multiline_string_outline", 1912318525)

    internal val drawCharPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_char", 3339793283)

    internal val drawCharOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_char_outline", 3302344391)

    internal val drawMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_mesh", 153818295)

    internal val drawMultimeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_multimesh", 937992368)

    internal val drawSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_set_transform", 288975085)

    internal val drawSetTransformMatrixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_set_transform_matrix", 2761652528)

    internal val drawAnimationSlicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_animation_slice", 3112831842)

    internal val drawEndAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "draw_end_animation", 3218959716)

    internal val getTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_transform", 3814499831)

    internal val getGlobalTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_global_transform", 3814499831)

    internal val getGlobalTransformWithCanvasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_global_transform_with_canvas", 3814499831)

    internal val getViewportTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_viewport_transform", 3814499831)

    internal val getViewportRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_viewport_rect", 1639390495)

    internal val getCanvasTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_canvas_transform", 3814499831)

    internal val getScreenTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_screen_transform", 3814499831)

    internal val getLocalMousePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_local_mouse_position", 3341600327)

    internal val getGlobalMousePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_global_mouse_position", 3341600327)

    internal val getCanvasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_canvas", 2944877500)

    internal val getCanvasLayerNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_canvas_layer_node", 2602762519)

    internal val getWorld2dPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_world_2d", 2339128592)

    internal val setMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_material", 2757459619)

    internal val getMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_material", 5934680)

    internal val setInstanceShaderParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_instance_shader_parameter", 3776071444)

    internal val getInstanceShaderParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_instance_shader_parameter", 2760726917)

    internal val setUseParentMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_use_parent_material", 2586408642)

    internal val getUseParentMaterialPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_use_parent_material", 36873697)

    internal val setNotifyLocalTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_notify_local_transform", 2586408642)

    internal val isLocalTransformNotificationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "is_local_transform_notification_enabled", 36873697)

    internal val setNotifyTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_notify_transform", 2586408642)

    internal val isTransformNotificationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "is_transform_notification_enabled", 36873697)

    internal val forceUpdateTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "force_update_transform", 3218959716)

    internal val makeCanvasPositionLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "make_canvas_position_local", 2656412154)

    internal val makeInputLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "make_input_local", 811130057)

    internal val setVisibilityLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_visibility_layer", 1286410249)

    internal val getVisibilityLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_visibility_layer", 3905245786)

    internal val setVisibilityLayerBitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_visibility_layer_bit", 300928843)

    internal val getVisibilityLayerBitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_visibility_layer_bit", 1116898809)

    internal val setTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_texture_filter", 1037999706)

    internal val getTextureFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_texture_filter", 121960042)

    internal val setTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_texture_repeat", 1716472974)

    internal val getTextureRepeatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_texture_repeat", 2667158319)

    internal val setClipChildrenModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "set_clip_children_mode", 1319393776)

    internal val getClipChildrenModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CanvasItem", "get_clip_children_mode", 3581808349)
  }
}

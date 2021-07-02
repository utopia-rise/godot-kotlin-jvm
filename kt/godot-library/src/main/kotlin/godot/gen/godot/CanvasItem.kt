// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.PoolColorArray
import godot.core.PoolVector2Array
import godot.core.RID
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_COLOR_ARRAY
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class of anything 2D.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/528](https://godotengine.org/asset-library/asset/528)
 *
 * Base class of anything 2D. Canvas items are laid out in a tree; children inherit and extend their parent's transform. [godot.CanvasItem] is extended by [godot.Control] for anything GUI-related, and by [godot.Node2D] for anything related to the 2D engine.
 *
 * Any [godot.CanvasItem] can draw. For this, [update] must be called, then [NOTIFICATION_DRAW] will be received on idle time to request redraw. Because of this, canvas items don't need to be redrawn on every frame, improving the performance significantly. Several functions for drawing on the [godot.CanvasItem] are provided (see `draw_*` functions). However, they can only be used inside the [godot.Object.Notification], signal or [_draw] virtual functions.
 *
 * Canvas items are drawn in tree order. By default, children are on top of their parents so a root [godot.CanvasItem] will be drawn behind everything. This behavior can be changed on a per-item basis.
 *
 * A [godot.CanvasItem] can also be hidden, which will also hide its children. It provides many ways to change parameters such as modulation (for itself and its children) and self modulation (only for itself), as well as its blend mode.
 *
 * Ultimately, a transform notification can be requested, which will notify the node that its global position changed in case the parent tree changed.
 *
 * **Note:** Unless otherwise specified, all methods that have angle parameters must have angles specified as *radians*. To convert degrees to radians, use [@GDScript.deg2rad].
 */
@GodotBaseType
public open class CanvasItem : Node() {
  /**
   * Emitted when the [godot.CanvasItem] must redraw. This can only be connected realtime, as deferred will not allow drawing.
   */
  public val draw: Signal0 by signal()

  /**
   * Emitted when becoming hidden.
   */
  public val hide: Signal0 by signal()

  /**
   * Emitted when the item's [godot.core.Rect2] boundaries (position or size) have changed, or when an action is taking place that may have impacted these boundaries (e.g. changing [godot.Sprite.texture]).
   */
  public val itemRectChanged: Signal0 by signal()

  /**
   * Emitted when the visibility (hidden/visible) changes.
   */
  public val visibilityChanged: Signal0 by signal()

  /**
   * The rendering layers in which this [godot.CanvasItem] responds to [godot.Light2D] nodes.
   */
  public open var lightMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_LIGHT_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_LIGHT_MASK, NIL)
    }

  /**
   * The material applied to textures on this [godot.CanvasItem].
   */
  public open var material: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_MATERIAL, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_MATERIAL, NIL)
    }

  /**
   * The color applied to textures on this [godot.CanvasItem].
   */
  public open var modulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_MODULATE, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_MODULATE, NIL)
    }

  /**
   * The color applied to textures on this [godot.CanvasItem]. This is not inherited by children [godot.CanvasItem]s.
   */
  public open var selfModulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_SELF_MODULATE,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_SELF_MODULATE, NIL)
    }

  /**
   * If `true`, the object draws behind its parent.
   */
  public open var showBehindParent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_SHOW_BEHIND_PARENT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_SHOW_BEHIND_PARENT,
          NIL)
    }

  /**
   * If `true`, the parent [godot.CanvasItem]'s [material] property is used as this one's material.
   */
  public open var useParentMaterial: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_USE_PARENT_MATERIAL, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_USE_PARENT_MATERIAL, NIL)
    }

  /**
   * If `true`, this [godot.CanvasItem] is drawn. The node is only visible if all of its antecedents are visible as well (in other words, [isVisibleInTree] must return `true`).
   *
   * **Note:** For controls that inherit [godot.Popup], the correct way to make them visible is to call one of the multiple `popup*()` functions instead.
   */
  public open var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_VISIBLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_VISIBLE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CANVASITEM)
  }

  @CoreTypeHelper
  public open fun modulate(schedule: Color.() -> Unit): Color = modulate.apply{
      schedule(this)
      modulate = this
  }


  @CoreTypeHelper
  public open fun selfModulate(schedule: Color.() -> Unit): Color = selfModulate.apply{
      schedule(this)
      selfModulate = this
  }


  /**
   * Overridable function called by the engine (if defined) to draw the canvas item.
   */
  public open fun _draw(): Unit {
  }

  public open fun _editGetPivot(): Vector2 {
    throw NotImplementedError("_edit_get_pivot is not implemented for CanvasItem")
  }

  public open fun _editGetPosition(): Vector2 {
    throw NotImplementedError("_edit_get_position is not implemented for CanvasItem")
  }

  public open fun _editGetRect(): Rect2 {
    throw NotImplementedError("_edit_get_rect is not implemented for CanvasItem")
  }

  public open fun _editGetRotation(): Double {
    throw NotImplementedError("_edit_get_rotation is not implemented for CanvasItem")
  }

  public open fun _editGetScale(): Vector2 {
    throw NotImplementedError("_edit_get_scale is not implemented for CanvasItem")
  }

  public open fun _editGetState(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_edit_get_state is not implemented for CanvasItem")
  }

  public open fun _editGetTransform(): Transform2D {
    throw NotImplementedError("_edit_get_transform is not implemented for CanvasItem")
  }

  public open fun _editSetPivot(pivot: Vector2): Unit {
  }

  public open fun _editSetPosition(position: Vector2): Unit {
  }

  public open fun _editSetRect(rect: Rect2): Unit {
  }

  public open fun _editSetRotation(degrees: Double): Unit {
  }

  public open fun _editSetScale(scale: Vector2): Unit {
  }

  public open fun _editSetState(state: Dictionary<Any?, Any?>): Unit {
  }

  public open fun _editUsePivot(): Boolean {
    throw NotImplementedError("_edit_use_pivot is not implemented for CanvasItem")
  }

  public open fun _editUseRect(): Boolean {
    throw NotImplementedError("_edit_use_rect is not implemented for CanvasItem")
  }

  public open fun _editUseRotation(): Boolean {
    throw NotImplementedError("_edit_use_rotation is not implemented for CanvasItem")
  }

  public open fun _isOnTop(): Boolean {
    throw NotImplementedError("_is_on_top is not implemented for CanvasItem")
  }

  public open fun _setOnTop(onTop: Boolean): Unit {
  }

  public open fun _toplevelRaiseSelf(): Unit {
  }

  public open fun _updateCallback(): Unit {
  }

  /**
   * Draws an arc between the given angles. The larger the value of `point_count`, the smoother the curve.
   */
  public open fun drawArc(
    center: Vector2,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    pointCount: Long,
    color: Color,
    width: Double = 1.0,
    antialiased: Boolean = false
  ): Unit {
    TransferContext.writeArguments(VECTOR2 to center, DOUBLE to radius, DOUBLE to startAngle, DOUBLE
        to endAngle, LONG to pointCount, COLOR to color, DOUBLE to width, BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_ARC, NIL)
  }

  /**
   * Draws a string character using a custom font. Returns the advance, depending on the character width and kerning with an optional next character.
   */
  public open fun drawChar(
    font: Font,
    position: Vector2,
    char: String,
    next: String,
    modulate: Color = Color(1,1,1,1)
  ): Double {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to position, STRING to char, STRING to
        next, COLOR to modulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_CHAR, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Draws a colored circle.
   */
  public open fun drawCircle(
    position: Vector2,
    radius: Double,
    color: Color
  ): Unit {
    TransferContext.writeArguments(VECTOR2 to position, DOUBLE to radius, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_CIRCLE, NIL)
  }

  /**
   * Draws a colored polygon of any amount of points, convex or concave.
   */
  public open fun drawColoredPolygon(
    points: PoolVector2Array,
    color: Color,
    uvs: PoolVector2Array = PoolVector2Array(),
    texture: Texture? = null,
    normalMap: Texture? = null,
    antialiased: Boolean = false
  ): Unit {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to points, COLOR to color, POOL_VECTOR2_ARRAY
        to uvs, OBJECT to texture, OBJECT to normalMap, BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_COLORED_POLYGON,
        NIL)
  }

  /**
   * Draws a line from a 2D point to another, with a given color and width. It can be optionally antialiased.
   */
  public open fun drawLine(
    from: Vector2,
    to: Vector2,
    color: Color,
    width: Double = 1.0,
    antialiased: Boolean = false
  ): Unit {
    TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to, COLOR to color, DOUBLE to width,
        BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_LINE, NIL)
  }

  /**
   * Draws a [godot.Mesh] in 2D, using the provided texture. See [godot.MeshInstance2D] for related documentation.
   */
  public open fun drawMesh(
    mesh: Mesh,
    texture: Texture,
    normalMap: Texture? = null,
    transform: Transform2D = Transform2D(),
    modulate: Color = Color(1,1,1,1)
  ): Unit {
    TransferContext.writeArguments(OBJECT to mesh, OBJECT to texture, OBJECT to normalMap,
        TRANSFORM2D to transform, COLOR to modulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_MESH, NIL)
  }

  /**
   * Draws multiple, parallel lines with a uniform `color`.
   *
   * **Note:** `width` and `antialiased` are currently not implemented and have no effect.
   */
  public open fun drawMultiline(
    points: PoolVector2Array,
    color: Color,
    width: Double = 1.0,
    antialiased: Boolean = false
  ): Unit {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to points, COLOR to color, DOUBLE to width,
        BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_MULTILINE, NIL)
  }

  /**
   * Draws multiple, parallel lines with a uniform `width` and segment-by-segment coloring. Colors assigned to line segments match by index between `points` and `colors`.
   *
   * **Note:** `width` and `antialiased` are currently not implemented and have no effect.
   */
  public open fun drawMultilineColors(
    points: PoolVector2Array,
    colors: PoolColorArray,
    width: Double = 1.0,
    antialiased: Boolean = false
  ): Unit {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to points, POOL_COLOR_ARRAY to colors, DOUBLE
        to width, BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_MULTILINE_COLORS,
        NIL)
  }

  /**
   * Draws a [godot.MultiMesh] in 2D with the provided texture. See [godot.MultiMeshInstance2D] for related documentation.
   */
  public open fun drawMultimesh(
    multimesh: MultiMesh,
    texture: Texture,
    normalMap: Texture? = null
  ): Unit {
    TransferContext.writeArguments(OBJECT to multimesh, OBJECT to texture, OBJECT to normalMap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_MULTIMESH, NIL)
  }

  /**
   * Draws a polygon of any amount of points, convex or concave.
   */
  public open fun drawPolygon(
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array = PoolVector2Array(),
    texture: Texture? = null,
    normalMap: Texture? = null,
    antialiased: Boolean = false
  ): Unit {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to points, POOL_COLOR_ARRAY to colors,
        POOL_VECTOR2_ARRAY to uvs, OBJECT to texture, OBJECT to normalMap, BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_POLYGON, NIL)
  }

  /**
   * Draws interconnected line segments with a uniform `color` and `width` and optional antialiasing.
   */
  public open fun drawPolyline(
    points: PoolVector2Array,
    color: Color,
    width: Double = 1.0,
    antialiased: Boolean = false
  ): Unit {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to points, COLOR to color, DOUBLE to width,
        BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_POLYLINE, NIL)
  }

  /**
   * Draws interconnected line segments with a uniform `width`, segment-by-segment coloring, and optional antialiasing. Colors assigned to line segments match by index between `points` and `colors`.
   */
  public open fun drawPolylineColors(
    points: PoolVector2Array,
    colors: PoolColorArray,
    width: Double = 1.0,
    antialiased: Boolean = false
  ): Unit {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to points, POOL_COLOR_ARRAY to colors, DOUBLE
        to width, BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_POLYLINE_COLORS,
        NIL)
  }

  /**
   * Draws a custom primitive. 1 point for a point, 2 points for a line, 3 points for a triangle and 4 points for a quad.
   */
  public open fun drawPrimitive(
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array,
    texture: Texture? = null,
    width: Double = 1.0,
    normalMap: Texture? = null
  ): Unit {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to points, POOL_COLOR_ARRAY to colors,
        POOL_VECTOR2_ARRAY to uvs, OBJECT to texture, DOUBLE to width, OBJECT to normalMap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_PRIMITIVE, NIL)
  }

  /**
   * Draws a rectangle. If `filled` is `true`, the rectangle will be filled with the `color` specified. If `filled` is `false`, the rectangle will be drawn as a stroke with the `color` and `width` specified. If `antialiased` is `true`, the lines will be antialiased.
   *
   * **Note:** `width` and `antialiased` are only effective if `filled` is `false`.
   */
  public open fun drawRect(
    rect: Rect2,
    color: Color,
    filled: Boolean = true,
    width: Double = 1.0,
    antialiased: Boolean = false
  ): Unit {
    TransferContext.writeArguments(RECT2 to rect, COLOR to color, BOOL to filled, DOUBLE to width,
        BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_RECT, NIL)
  }

  /**
   * Sets a custom transform for drawing via components. Anything drawn afterwards will be transformed by this.
   */
  public open fun drawSetTransform(
    position: Vector2,
    rotation: Double,
    scale: Vector2
  ): Unit {
    TransferContext.writeArguments(VECTOR2 to position, DOUBLE to rotation, VECTOR2 to scale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_SET_TRANSFORM, NIL)
  }

  /**
   * Sets a custom transform for drawing via matrix. Anything drawn afterwards will be transformed by this.
   */
  public open fun drawSetTransformMatrix(xform: Transform2D): Unit {
    TransferContext.writeArguments(TRANSFORM2D to xform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_SET_TRANSFORM_MATRIX, NIL)
  }

  /**
   * Draws `text` using the specified `font` at the `position` (bottom-left corner using the baseline of the font). The text will have its color multiplied by `modulate`. If `clip_w` is greater than or equal to 0, the text will be clipped if it exceeds the specified width.
   *
   * **Example using the default project font:**
   *
   * ```
   * 				# If using this method in a script that redraws constantly, move the
   * 				# `default_font` declaration to a member variable assigned in `_ready()`
   * 				# so the Control is only created once.
   * 				var default_font = Control.new().get_font("font")
   * 				draw_string(default_font, Vector2(64, 64), "Hello world")
   * 				```
   *
   * See also [godot.Font.draw].
   */
  public open fun drawString(
    font: Font,
    position: Vector2,
    text: String,
    modulate: Color = Color(1,1,1,1),
    clipW: Long = -1
  ): Unit {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to position, STRING to text, COLOR to
        modulate, LONG to clipW)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_STRING, NIL)
  }

  /**
   * Draws a styled rectangle.
   */
  public open fun drawStyleBox(styleBox: StyleBox, rect: Rect2): Unit {
    TransferContext.writeArguments(OBJECT to styleBox, RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_STYLE_BOX, NIL)
  }

  /**
   * Draws a texture at a given position.
   */
  public open fun drawTexture(
    texture: Texture,
    position: Vector2,
    modulate: Color = Color(1,1,1,1),
    normalMap: Texture? = null
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, VECTOR2 to position, COLOR to modulate, OBJECT
        to normalMap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_TEXTURE, NIL)
  }

  /**
   * Draws a textured rectangle at a given position, optionally modulated by a color. If `transpose` is `true`, the texture will have its X and Y coordinates swapped.
   */
  public open fun drawTextureRect(
    texture: Texture,
    rect: Rect2,
    tile: Boolean,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture? = null
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, RECT2 to rect, BOOL to tile, COLOR to
        modulate, BOOL to transpose, OBJECT to normalMap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_TEXTURE_RECT, NIL)
  }

  /**
   * Draws a textured rectangle region at a given position, optionally modulated by a color. If `transpose` is `true`, the texture will have its X and Y coordinates swapped.
   */
  public open fun drawTextureRectRegion(
    texture: Texture,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture? = null,
    clipUv: Boolean = true
  ): Unit {
    TransferContext.writeArguments(OBJECT to texture, RECT2 to rect, RECT2 to srcRect, COLOR to
        modulate, BOOL to transpose, OBJECT to normalMap, BOOL to clipUv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_TEXTURE_RECT_REGION,
        NIL)
  }

  /**
   * Forces the transform to update. Transform changes in physics are not instant for performance reasons. Transforms are accumulated and then set. Use this if you need an up-to-date transform when doing physics operations.
   */
  public open fun forceUpdateTransform(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_FORCE_UPDATE_TRANSFORM,
        NIL)
  }

  /**
   * Returns the [RID] of the [godot.World2D] canvas where this item is in.
   */
  public open fun getCanvas(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_CANVAS, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the canvas item RID used by [godot.VisualServer] for this item.
   */
  public open fun getCanvasItem(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_CANVAS_ITEM, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the transform matrix of this item's canvas.
   */
  public open fun getCanvasTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_CANVAS_TRANSFORM,
        TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Returns the global position of the mouse.
   */
  public open fun getGlobalMousePosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_GLOBAL_MOUSE_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the global transform matrix of this item.
   */
  public open fun getGlobalTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_GLOBAL_TRANSFORM,
        TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Returns the global transform matrix of this item in relation to the canvas.
   */
  public open fun getGlobalTransformWithCanvas(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_GLOBAL_TRANSFORM_WITH_CANVAS, TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Returns the mouse position relative to this item's position.
   */
  public open fun getLocalMousePosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_LOCAL_MOUSE_POSITION,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the transform matrix of this item.
   */
  public open fun getTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_TRANSFORM,
        TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Returns the viewport's boundaries as a [godot.core.Rect2].
   */
  public open fun getViewportRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_VIEWPORT_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns this item's transform in relation to the viewport.
   */
  public open fun getViewportTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_VIEWPORT_TRANSFORM,
        TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Returns the [godot.World2D] where this item is in.
   */
  public open fun getWorld2d(): World2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_WORLD_2D, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as World2D?
  }

  /**
   * Hide the [godot.CanvasItem] if it's currently visible.
   */
  public open fun hide(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_HIDE, NIL)
  }

  /**
   * Returns `true` if local transform notifications are communicated to children.
   */
  public open fun isLocalTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_IS_LOCAL_TRANSFORM_NOTIFICATION_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the node is set as top-level. See [setAsToplevel].
   */
  public open fun isSetAsToplevel(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_IS_SET_AS_TOPLEVEL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if global transform notifications are communicated to children.
   */
  public open fun isTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_IS_TRANSFORM_NOTIFICATION_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the node is present in the [godot.SceneTree], its [visible] property is `true` and all its antecedents are also visible. If any antecedent is hidden, this node will not be visible in the scene tree.
   */
  public open fun isVisibleInTree(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_IS_VISIBLE_IN_TREE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Assigns `screen_point` as this node's new local transform.
   */
  public open fun makeCanvasPositionLocal(screenPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to screenPoint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_MAKE_CANVAS_POSITION_LOCAL, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Transformations issued by `event`'s inputs are applied in local space instead of global space.
   */
  public open fun makeInputLocal(event: InputEvent): InputEvent? {
    TransferContext.writeArguments(OBJECT to event)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_MAKE_INPUT_LOCAL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as InputEvent?
  }

  /**
   * If `enable` is `true`, the node won't inherit its transform from parent canvas items.
   */
  public open fun setAsToplevel(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_AS_TOPLEVEL, NIL)
  }

  /**
   * If `enable` is `true`, children will be updated with local transform data.
   */
  public open fun setNotifyLocalTransform(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_NOTIFY_LOCAL_TRANSFORM, NIL)
  }

  /**
   * If `enable` is `true`, children will be updated with global transform data.
   */
  public open fun setNotifyTransform(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_NOTIFY_TRANSFORM,
        NIL)
  }

  /**
   * Show the [godot.CanvasItem] if it's currently hidden. For controls that inherit [godot.Popup], the correct way to make them visible is to call one of the multiple `popup*()` functions instead.
   */
  public open fun show(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SHOW, NIL)
  }

  /**
   * Queue the [godot.CanvasItem] for update. [NOTIFICATION_DRAW] will be called on idle time to request redraw.
   */
  public open fun update(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_UPDATE, NIL)
  }

  public enum class BlendMode(
    id: Long
  ) {
    /**
     * Mix blending mode. Colors are assumed to be independent of the alpha (opacity) value.
     */
    BLEND_MODE_MIX(0),
    /**
     * Additive blending mode.
     */
    BLEND_MODE_ADD(1),
    /**
     * Subtractive blending mode.
     */
    BLEND_MODE_SUB(2),
    /**
     * Multiplicative blending mode.
     */
    BLEND_MODE_MUL(3),
    /**
     * Mix blending mode. Colors are assumed to be premultiplied by the alpha (opacity) value.
     */
    BLEND_MODE_PREMULT_ALPHA(4),
    /**
     * Disables blending mode. Colors including alpha are written as-is. Only applicable for render targets with a transparent background. No lighting will be applied.
     */
    BLEND_MODE_DISABLED(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Additive blending mode.
     */
    public final const val BLEND_MODE_ADD: Long = 1

    /**
     * Disables blending mode. Colors including alpha are written as-is. Only applicable for render targets with a transparent background. No lighting will be applied.
     */
    public final const val BLEND_MODE_DISABLED: Long = 5

    /**
     * Mix blending mode. Colors are assumed to be independent of the alpha (opacity) value.
     */
    public final const val BLEND_MODE_MIX: Long = 0

    /**
     * Multiplicative blending mode.
     */
    public final const val BLEND_MODE_MUL: Long = 3

    /**
     * Mix blending mode. Colors are assumed to be premultiplied by the alpha (opacity) value.
     */
    public final const val BLEND_MODE_PREMULT_ALPHA: Long = 4

    /**
     * Subtractive blending mode.
     */
    public final const val BLEND_MODE_SUB: Long = 2

    /**
     * The [godot.CanvasItem] is requested to draw.
     */
    public final const val NOTIFICATION_DRAW: Long = 30

    /**
     * The [godot.CanvasItem] has entered the canvas.
     */
    public final const val NOTIFICATION_ENTER_CANVAS: Long = 32

    /**
     * The [godot.CanvasItem] has exited the canvas.
     */
    public final const val NOTIFICATION_EXIT_CANVAS: Long = 33

    /**
     * The [godot.CanvasItem]'s transform has changed. This notification is only received if enabled by [setNotifyTransform] or [setNotifyLocalTransform].
     */
    public final const val NOTIFICATION_TRANSFORM_CHANGED: Long = 2000

    /**
     * The [godot.CanvasItem]'s visibility has changed.
     */
    public final const val NOTIFICATION_VISIBILITY_CHANGED: Long = 31
  }
}

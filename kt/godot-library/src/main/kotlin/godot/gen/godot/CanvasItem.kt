// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class CanvasItem : Node() {
  val draw: Signal0 by signal()

  val hide: Signal0 by signal()

  val itemRectChanged: Signal0 by signal()

  val visibilityChanged: Signal0 by signal()

  open var lightMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_LIGHT_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_LIGHT_MASK, NIL)
    }

  open var material: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_MATERIAL, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_MATERIAL, NIL)
    }

  open var modulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_MODULATE, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_MODULATE, NIL)
    }

  open var selfModulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_SELF_MODULATE,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_SELF_MODULATE, NIL)
    }

  open var showBehindParent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_SHOW_BEHIND_PARENT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_SHOW_BEHIND_PARENT,
          NIL)
    }

  open var useParentMaterial: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_USE_PARENT_MATERIAL, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_USE_PARENT_MATERIAL, NIL)
    }

  open var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_VISIBLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_VISIBLE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_CANVASITEM)

  open fun modulate(schedule: Color.() -> Unit): Color = modulate.apply{
      schedule(this)
      modulate = this
  }


  open fun selfModulate(schedule: Color.() -> Unit): Color = selfModulate.apply{
      schedule(this)
      selfModulate = this
  }


  open fun _draw() {
  }

  open fun _editGetPivot(): Vector2 {
    throw NotImplementedError("_edit_get_pivot is not implemented for CanvasItem")
  }

  open fun _editGetPosition(): Vector2 {
    throw NotImplementedError("_edit_get_position is not implemented for CanvasItem")
  }

  open fun _editGetRect(): Rect2 {
    throw NotImplementedError("_edit_get_rect is not implemented for CanvasItem")
  }

  open fun _editGetRotation(): Double {
    throw NotImplementedError("_edit_get_rotation is not implemented for CanvasItem")
  }

  open fun _editGetScale(): Vector2 {
    throw NotImplementedError("_edit_get_scale is not implemented for CanvasItem")
  }

  open fun _editGetState(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_edit_get_state is not implemented for CanvasItem")
  }

  open fun _editGetTransform(): Transform2D {
    throw NotImplementedError("_edit_get_transform is not implemented for CanvasItem")
  }

  open fun _editSetPivot(pivot: Vector2) {
  }

  open fun _editSetPosition(position: Vector2) {
  }

  open fun _editSetRect(rect: Rect2) {
  }

  open fun _editSetRotation(degrees: Double) {
  }

  open fun _editSetScale(scale: Vector2) {
  }

  open fun _editSetState(state: Dictionary<Any?, Any?>) {
  }

  open fun _editUsePivot(): Boolean {
    throw NotImplementedError("_edit_use_pivot is not implemented for CanvasItem")
  }

  open fun _editUseRect(): Boolean {
    throw NotImplementedError("_edit_use_rect is not implemented for CanvasItem")
  }

  open fun _editUseRotation(): Boolean {
    throw NotImplementedError("_edit_use_rotation is not implemented for CanvasItem")
  }

  open fun _isOnTop(): Boolean {
    throw NotImplementedError("_is_on_top is not implemented for CanvasItem")
  }

  open fun _setOnTop(onTop: Boolean) {
  }

  open fun _toplevelRaiseSelf() {
  }

  open fun _updateCallback() {
  }

  open fun drawArc(
    center: Vector2,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    pointCount: Long,
    color: Color,
    width: Double = 1.0,
    antialiased: Boolean = false
  ) {
    TransferContext.writeArguments(VECTOR2 to center, DOUBLE to radius, DOUBLE to startAngle, DOUBLE
        to endAngle, LONG to pointCount, COLOR to color, DOUBLE to width, BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_ARC, NIL)
  }

  open fun drawChar(
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

  open fun drawCircle(
    position: Vector2,
    radius: Double,
    color: Color
  ) {
    TransferContext.writeArguments(VECTOR2 to position, DOUBLE to radius, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_CIRCLE, NIL)
  }

  open fun drawColoredPolygon(
    points: PoolVector2Array,
    color: Color,
    uvs: PoolVector2Array = PoolVector2Array(),
    texture: Texture? = null,
    normalMap: Texture? = null,
    antialiased: Boolean = false
  ) {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to points, COLOR to color, POOL_VECTOR2_ARRAY
        to uvs, OBJECT to texture, OBJECT to normalMap, BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_COLORED_POLYGON,
        NIL)
  }

  open fun drawLine(
    from: Vector2,
    to: Vector2,
    color: Color,
    width: Double = 1.0,
    antialiased: Boolean = false
  ) {
    TransferContext.writeArguments(VECTOR2 to from, VECTOR2 to to, COLOR to color, DOUBLE to width,
        BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_LINE, NIL)
  }

  open fun drawMesh(
    mesh: Mesh,
    texture: Texture,
    normalMap: Texture? = null,
    transform: Transform2D = Transform2D(),
    modulate: Color = Color(1,1,1,1)
  ) {
    TransferContext.writeArguments(OBJECT to mesh, OBJECT to texture, OBJECT to normalMap,
        TRANSFORM2D to transform, COLOR to modulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_MESH, NIL)
  }

  open fun drawMultiline(
    points: PoolVector2Array,
    color: Color,
    width: Double = 1.0,
    antialiased: Boolean = false
  ) {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to points, COLOR to color, DOUBLE to width,
        BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_MULTILINE, NIL)
  }

  open fun drawMultilineColors(
    points: PoolVector2Array,
    colors: PoolColorArray,
    width: Double = 1.0,
    antialiased: Boolean = false
  ) {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to points, POOL_COLOR_ARRAY to colors, DOUBLE
        to width, BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_MULTILINE_COLORS,
        NIL)
  }

  open fun drawMultimesh(
    multimesh: MultiMesh,
    texture: Texture,
    normalMap: Texture? = null
  ) {
    TransferContext.writeArguments(OBJECT to multimesh, OBJECT to texture, OBJECT to normalMap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_MULTIMESH, NIL)
  }

  open fun drawPolygon(
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array = PoolVector2Array(),
    texture: Texture? = null,
    normalMap: Texture? = null,
    antialiased: Boolean = false
  ) {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to points, POOL_COLOR_ARRAY to colors,
        POOL_VECTOR2_ARRAY to uvs, OBJECT to texture, OBJECT to normalMap, BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_POLYGON, NIL)
  }

  open fun drawPolyline(
    points: PoolVector2Array,
    color: Color,
    width: Double = 1.0,
    antialiased: Boolean = false
  ) {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to points, COLOR to color, DOUBLE to width,
        BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_POLYLINE, NIL)
  }

  open fun drawPolylineColors(
    points: PoolVector2Array,
    colors: PoolColorArray,
    width: Double = 1.0,
    antialiased: Boolean = false
  ) {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to points, POOL_COLOR_ARRAY to colors, DOUBLE
        to width, BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_POLYLINE_COLORS,
        NIL)
  }

  open fun drawPrimitive(
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array,
    texture: Texture? = null,
    width: Double = 1.0,
    normalMap: Texture? = null
  ) {
    TransferContext.writeArguments(POOL_VECTOR2_ARRAY to points, POOL_COLOR_ARRAY to colors,
        POOL_VECTOR2_ARRAY to uvs, OBJECT to texture, DOUBLE to width, OBJECT to normalMap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_PRIMITIVE, NIL)
  }

  open fun drawRect(
    rect: Rect2,
    color: Color,
    filled: Boolean = true,
    width: Double = 1.0,
    antialiased: Boolean = false
  ) {
    TransferContext.writeArguments(RECT2 to rect, COLOR to color, BOOL to filled, DOUBLE to width,
        BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_RECT, NIL)
  }

  open fun drawSetTransform(
    position: Vector2,
    rotation: Double,
    scale: Vector2
  ) {
    TransferContext.writeArguments(VECTOR2 to position, DOUBLE to rotation, VECTOR2 to scale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_SET_TRANSFORM, NIL)
  }

  open fun drawSetTransformMatrix(xform: Transform2D) {
    TransferContext.writeArguments(TRANSFORM2D to xform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_SET_TRANSFORM_MATRIX, NIL)
  }

  open fun drawString(
    font: Font,
    position: Vector2,
    text: String,
    modulate: Color = Color(1,1,1,1),
    clipW: Long = -1
  ) {
    TransferContext.writeArguments(OBJECT to font, VECTOR2 to position, STRING to text, COLOR to
        modulate, LONG to clipW)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_STRING, NIL)
  }

  open fun drawStyleBox(styleBox: StyleBox, rect: Rect2) {
    TransferContext.writeArguments(OBJECT to styleBox, RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_STYLE_BOX, NIL)
  }

  open fun drawTexture(
    texture: Texture,
    position: Vector2,
    modulate: Color = Color(1,1,1,1),
    normalMap: Texture? = null
  ) {
    TransferContext.writeArguments(OBJECT to texture, VECTOR2 to position, COLOR to modulate, OBJECT
        to normalMap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_TEXTURE, NIL)
  }

  open fun drawTextureRect(
    texture: Texture,
    rect: Rect2,
    tile: Boolean,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture? = null
  ) {
    TransferContext.writeArguments(OBJECT to texture, RECT2 to rect, BOOL to tile, COLOR to
        modulate, BOOL to transpose, OBJECT to normalMap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_TEXTURE_RECT, NIL)
  }

  open fun drawTextureRectRegion(
    texture: Texture,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture? = null,
    clipUv: Boolean = true
  ) {
    TransferContext.writeArguments(OBJECT to texture, RECT2 to rect, RECT2 to srcRect, COLOR to
        modulate, BOOL to transpose, OBJECT to normalMap, BOOL to clipUv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_DRAW_TEXTURE_RECT_REGION,
        NIL)
  }

  open fun forceUpdateTransform() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_FORCE_UPDATE_TRANSFORM,
        NIL)
  }

  open fun getCanvas(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_CANVAS, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  open fun getCanvasItem(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_CANVAS_ITEM, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  open fun getCanvasTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_CANVAS_TRANSFORM,
        TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  open fun getGlobalMousePosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_GLOBAL_MOUSE_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getCanvasItemGlobalTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_GLOBAL_TRANSFORM,
        TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  open fun getGlobalTransformWithCanvas(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_GLOBAL_TRANSFORM_WITH_CANVAS, TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  open fun getLocalMousePosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_LOCAL_MOUSE_POSITION,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getCanvasItemTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_TRANSFORM,
        TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  open fun getViewportRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_VIEWPORT_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  open fun getViewportTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_VIEWPORT_TRANSFORM,
        TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  open fun getWorld2d(): World2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_GET_WORLD_2D, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as World2D?
  }

  open fun hide() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_HIDE, NIL)
  }

  open fun isLocalTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_IS_LOCAL_TRANSFORM_NOTIFICATION_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isSetAsToplevel(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_IS_SET_AS_TOPLEVEL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isTransformNotificationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_IS_TRANSFORM_NOTIFICATION_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isVisibleInTree(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_IS_VISIBLE_IN_TREE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun makeCanvasPositionLocal(screenPoint: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to screenPoint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_MAKE_CANVAS_POSITION_LOCAL, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun makeInputLocal(event: InputEvent): InputEvent? {
    TransferContext.writeArguments(OBJECT to event)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_MAKE_INPUT_LOCAL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as InputEvent?
  }

  open fun setAsToplevel(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_AS_TOPLEVEL, NIL)
  }

  open fun setNotifyLocalTransform(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_NOTIFY_LOCAL_TRANSFORM, NIL)
  }

  open fun setNotifyTransform(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SET_NOTIFY_TRANSFORM,
        NIL)
  }

  open fun show() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_SHOW, NIL)
  }

  open fun update() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASITEM_UPDATE, NIL)
  }

  enum class BlendMode(
    id: Long
  ) {
    BLEND_MODE_MIX(0),

    BLEND_MODE_ADD(1),

    BLEND_MODE_SUB(2),

    BLEND_MODE_MUL(3),

    BLEND_MODE_PREMULT_ALPHA(4),

    BLEND_MODE_DISABLED(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val BLEND_MODE_ADD: Long = 1

    final const val BLEND_MODE_DISABLED: Long = 5

    final const val BLEND_MODE_MIX: Long = 0

    final const val BLEND_MODE_MUL: Long = 3

    final const val BLEND_MODE_PREMULT_ALPHA: Long = 4

    final const val BLEND_MODE_SUB: Long = 2

    final const val NOTIFICATION_DRAW: Long = 30

    final const val NOTIFICATION_ENTER_CANVAS: Long = 32

    final const val NOTIFICATION_EXIT_CANVAS: Long = 33

    final const val NOTIFICATION_TRANSFORM_CHANGED: Long = 2000

    final const val NOTIFICATION_VISIBILITY_CHANGED: Long = 31
  }
}

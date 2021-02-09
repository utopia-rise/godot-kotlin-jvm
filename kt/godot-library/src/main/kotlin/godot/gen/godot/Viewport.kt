// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.RID
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class Viewport : Node() {
  val guiFocusChanged: Signal1<Control> by signal("node")

  val sizeChanged: Signal0 by signal()

  open var arvr: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_ARVR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_ARVR, NIL)
    }

  open var audioListenerEnable2d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_AUDIO_LISTENER_ENABLE_2D, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_AUDIO_LISTENER_ENABLE_2D, NIL)
    }

  open var audioListenerEnable3d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_AUDIO_LISTENER_ENABLE_3D, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_AUDIO_LISTENER_ENABLE_3D, NIL)
    }

  open var canvasTransform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_CANVAS_TRANSFORM,
          TRANSFORM2D)
      return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
    }
    set(value) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_CANVAS_TRANSFORM,
          NIL)
    }

  open var debugDraw: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_DEBUG_DRAW, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_DEBUG_DRAW, NIL)
    }

  open var disable3d: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_DISABLE_3D, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_DISABLE_3D, NIL)
    }

  open var globalCanvasTransform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_GLOBAL_CANVAS_TRANSFORM, TRANSFORM2D)
      return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
    }
    set(value) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_GLOBAL_CANVAS_TRANSFORM, NIL)
    }

  open var guiDisableInput: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_GUI_DISABLE_INPUT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_GUI_DISABLE_INPUT,
          NIL)
    }

  open var guiSnapControlsToPixels: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_GUI_SNAP_CONTROLS_TO_PIXELS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_GUI_SNAP_CONTROLS_TO_PIXELS, NIL)
    }

  open var handleInputLocally: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_HANDLE_INPUT_LOCALLY,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_HANDLE_INPUT_LOCALLY,
          NIL)
    }

  open var hdr: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_HDR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_HDR, NIL)
    }

  open var keep3dLinear: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_KEEP_3D_LINEAR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_KEEP_3D_LINEAR, NIL)
    }

  open var msaa: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_MSAA, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_MSAA, NIL)
    }

  open var ownWorld: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_OWN_WORLD, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_OWN_WORLD, NIL)
    }

  open var physicsObjectPicking: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_PHYSICS_OBJECT_PICKING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_PHYSICS_OBJECT_PICKING, NIL)
    }

  open var renderDirectToScreen: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_RENDER_DIRECT_TO_SCREEN, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_RENDER_DIRECT_TO_SCREEN, NIL)
    }

  open var renderTargetClearMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_RENDER_TARGET_CLEAR_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_RENDER_TARGET_CLEAR_MODE, NIL)
    }

  open var renderTargetUpdateMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_RENDER_TARGET_UPDATE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_RENDER_TARGET_UPDATE_MODE, NIL)
    }

  open var renderTargetVFlip: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_RENDER_TARGET_V_FLIP,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_RENDER_TARGET_V_FLIP,
          NIL)
    }

  open var shadowAtlasQuad0: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SHADOW_ATLAS_QUAD_0,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SHADOW_ATLAS_QUAD_0,
          NIL)
    }

  open var shadowAtlasQuad1: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SHADOW_ATLAS_QUAD_1,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SHADOW_ATLAS_QUAD_1,
          NIL)
    }

  open var shadowAtlasQuad2: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SHADOW_ATLAS_QUAD_2,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SHADOW_ATLAS_QUAD_2,
          NIL)
    }

  open var shadowAtlasQuad3: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SHADOW_ATLAS_QUAD_3,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SHADOW_ATLAS_QUAD_3,
          NIL)
    }

  open var shadowAtlasSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SHADOW_ATLAS_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SHADOW_ATLAS_SIZE,
          NIL)
    }

  open var size: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SIZE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SIZE, NIL)
    }

  open var sizeOverrideStretch: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SIZE_OVERRIDE_STRETCH, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SIZE_OVERRIDE_STRETCH, NIL)
    }

  open var transparentBg: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_TRANSPARENT_BG, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_TRANSPARENT_BG, NIL)
    }

  open var usage: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_USAGE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_USAGE, NIL)
    }

  open var world: World?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_WORLD, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as World?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_WORLD, NIL)
    }

  open var world2d: World2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_WORLD_2D, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as World2D?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_WORLD_2D, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_VIEWPORT)

  open fun canvasTransform(schedule: Transform2D.() -> Unit): Transform2D = canvasTransform.apply{
      schedule(this)
      canvasTransform = this
  }


  open fun globalCanvasTransform(schedule: Transform2D.() -> Unit): Transform2D =
      globalCanvasTransform.apply{
      schedule(this)
      globalCanvasTransform = this
  }


  open fun size(schedule: Vector2.() -> Unit): Vector2 = size.apply{
      schedule(this)
      size = this
  }


  open fun _guiRemoveFocus() {
  }

  open fun _guiShowTooltip() {
  }

  open fun _ownWorldChanged() {
  }

  open fun _postGuiGrabClickFocus() {
  }

  open fun _subwindowVisibilityChanged() {
  }

  open fun _vpInput(arg0: InputEvent) {
  }

  open fun _vpInputText(text: String) {
  }

  open fun _vpUnhandledInput(arg0: InputEvent) {
  }

  open fun findWorld(): World? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_FIND_WORLD, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as World?
  }

  open fun findWorld2d(): World2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_FIND_WORLD_2D, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as World2D?
  }

  open fun getCamera(): Camera? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_CAMERA, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Camera?
  }

  open fun getFinalTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_FINAL_TRANSFORM,
        TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  open fun getModalStackTop(): Control? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_MODAL_STACK_TOP,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Control?
  }

  open fun getMousePosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_MOUSE_POSITION,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getRenderInfo(info: Long): Long {
    TransferContext.writeArguments(LONG to info)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_RENDER_INFO, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getSizeOverride(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_SIZE_OVERRIDE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getTexture(): ViewportTexture? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_TEXTURE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ViewportTexture?
  }

  open fun getViewportRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_VIEWPORT_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  open fun getVisibleRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GET_VISIBLE_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  open fun guiGetDragData(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GUI_GET_DRAG_DATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun guiHasModalStack(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GUI_HAS_MODAL_STACK, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun guiIsDragging(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_GUI_IS_DRAGGING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun input(localEvent: InputEvent) {
    TransferContext.writeArguments(OBJECT to localEvent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_INPUT, NIL)
  }

  open fun isInputHandled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_INPUT_HANDLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isSizeOverrideEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_IS_SIZE_OVERRIDE_ENABLED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun setAttachToScreenRect(rect: Rect2) {
    TransferContext.writeArguments(RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_ATTACH_TO_SCREEN_RECT,
        NIL)
  }

  open fun setInputAsHandled() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_INPUT_AS_HANDLED, NIL)
  }

  open fun setSizeOverride(
    enable: Boolean,
    size: Vector2 = Vector2(-1.0, -1.0),
    margin: Vector2 = Vector2(0.0, 0.0)
  ) {
    TransferContext.writeArguments(BOOL to enable, VECTOR2 to size, VECTOR2 to margin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_SET_SIZE_OVERRIDE, NIL)
  }

  open fun unhandledInput(localEvent: InputEvent) {
    TransferContext.writeArguments(OBJECT to localEvent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_UNHANDLED_INPUT, NIL)
  }

  open fun updateWorlds() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_UPDATE_WORLDS, NIL)
  }

  open fun warpMouse(toPosition: Vector2) {
    TransferContext.writeArguments(VECTOR2 to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIEWPORT_WARP_MOUSE, NIL)
  }

  enum class ClearMode(
    id: Long
  ) {
    CLEAR_MODE_ALWAYS(0),

    CLEAR_MODE_NEVER(1),

    CLEAR_MODE_ONLY_NEXT_FRAME(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class RenderInfo(
    id: Long
  ) {
    RENDER_INFO_OBJECTS_IN_FRAME(0),

    RENDER_INFO_VERTICES_IN_FRAME(1),

    RENDER_INFO_MATERIAL_CHANGES_IN_FRAME(2),

    RENDER_INFO_SHADER_CHANGES_IN_FRAME(3),

    RENDER_INFO_SURFACE_CHANGES_IN_FRAME(4),

    RENDER_INFO_DRAW_CALLS_IN_FRAME(5),

    RENDER_INFO_2D_ITEMS_IN_FRAME(6),

    RENDER_INFO_2D_DRAW_CALLS_IN_FRAME(7),

    RENDER_INFO_MAX(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Usage(
    id: Long
  ) {
    USAGE_2D(0),

    USAGE_2D_NO_SAMPLING(1),

    USAGE_3D(2),

    USAGE_3D_NO_EFFECTS(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DebugDraw(
    id: Long
  ) {
    DEBUG_DRAW_DISABLED(0),

    DEBUG_DRAW_UNSHADED(1),

    DEBUG_DRAW_OVERDRAW(2),

    DEBUG_DRAW_WIREFRAME(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ShadowAtlasQuadrantSubdiv(
    id: Long
  ) {
    SHADOW_ATLAS_QUADRANT_SUBDIV_DISABLED(0),

    SHADOW_ATLAS_QUADRANT_SUBDIV_1(1),

    SHADOW_ATLAS_QUADRANT_SUBDIV_4(2),

    SHADOW_ATLAS_QUADRANT_SUBDIV_16(3),

    SHADOW_ATLAS_QUADRANT_SUBDIV_64(4),

    SHADOW_ATLAS_QUADRANT_SUBDIV_256(5),

    SHADOW_ATLAS_QUADRANT_SUBDIV_1024(6),

    SHADOW_ATLAS_QUADRANT_SUBDIV_MAX(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class UpdateMode(
    id: Long
  ) {
    UPDATE_DISABLED(0),

    UPDATE_ONCE(1),

    UPDATE_WHEN_VISIBLE(2),

    UPDATE_ALWAYS(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class MSAA(
    id: Long
  ) {
    MSAA_DISABLED(0),

    MSAA_2X(1),

    MSAA_4X(2),

    MSAA_8X(3),

    MSAA_16X(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val CLEAR_MODE_ALWAYS: Long = 0

    final const val CLEAR_MODE_NEVER: Long = 1

    final const val CLEAR_MODE_ONLY_NEXT_FRAME: Long = 2

    final const val DEBUG_DRAW_DISABLED: Long = 0

    final const val DEBUG_DRAW_OVERDRAW: Long = 2

    final const val DEBUG_DRAW_UNSHADED: Long = 1

    final const val DEBUG_DRAW_WIREFRAME: Long = 3

    final const val MSAA_16X: Long = 4

    final const val MSAA_2X: Long = 1

    final const val MSAA_4X: Long = 2

    final const val MSAA_8X: Long = 3

    final const val MSAA_DISABLED: Long = 0

    final const val RENDER_INFO_2D_DRAW_CALLS_IN_FRAME: Long = 7

    final const val RENDER_INFO_2D_ITEMS_IN_FRAME: Long = 6

    final const val RENDER_INFO_DRAW_CALLS_IN_FRAME: Long = 5

    final const val RENDER_INFO_MATERIAL_CHANGES_IN_FRAME: Long = 2

    final const val RENDER_INFO_MAX: Long = 8

    final const val RENDER_INFO_OBJECTS_IN_FRAME: Long = 0

    final const val RENDER_INFO_SHADER_CHANGES_IN_FRAME: Long = 3

    final const val RENDER_INFO_SURFACE_CHANGES_IN_FRAME: Long = 4

    final const val RENDER_INFO_VERTICES_IN_FRAME: Long = 1

    final const val SHADOW_ATLAS_QUADRANT_SUBDIV_1: Long = 1

    final const val SHADOW_ATLAS_QUADRANT_SUBDIV_1024: Long = 6

    final const val SHADOW_ATLAS_QUADRANT_SUBDIV_16: Long = 3

    final const val SHADOW_ATLAS_QUADRANT_SUBDIV_256: Long = 5

    final const val SHADOW_ATLAS_QUADRANT_SUBDIV_4: Long = 2

    final const val SHADOW_ATLAS_QUADRANT_SUBDIV_64: Long = 4

    final const val SHADOW_ATLAS_QUADRANT_SUBDIV_DISABLED: Long = 0

    final const val SHADOW_ATLAS_QUADRANT_SUBDIV_MAX: Long = 7

    final const val UPDATE_ALWAYS: Long = 3

    final const val UPDATE_DISABLED: Long = 0

    final const val UPDATE_ONCE: Long = 1

    final const val UPDATE_WHEN_VISIBLE: Long = 2

    final const val USAGE_2D: Long = 0

    final const val USAGE_2D_NO_SAMPLING: Long = 1

    final const val USAGE_3D: Long = 2

    final const val USAGE_3D_NO_EFFECTS: Long = 3
  }
}

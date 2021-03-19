// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Camera node for 2D scenes.
 *
 * Camera node for 2D scenes. It forces the screen (current layer) to scroll following this node. This makes it easier (and faster) to program scrollable scenes than manually changing the position of [godot.CanvasItem]-based nodes.
 *
 * This node is intended to be a simple helper to get things going quickly and it may happen that more functionality is desired to change how the camera works. To make your own custom camera node, inherit from [godot.Node2D] and change the transform of the canvas by setting [godot.Viewport.canvasTransform] in [godot.Viewport] (you can obtain the current [godot.Viewport] by using [godot.Node.getViewport]).
 *
 * Note that the [godot.Camera2D] node's `position` doesn't represent the actual position of the screen, which may differ due to applied smoothing or limits. You can use [getCameraScreenCenter] to get the real position.
 */
@GodotBaseType
open class Camera2D : Node2D() {
  /**
   * The Camera2D's anchor point. See [enum AnchorMode] constants.
   */
  open var anchorMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_ANCHOR_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_ANCHOR_MODE, NIL)
    }

  /**
   * If `true`, the camera is the active camera for the current scene. Only one camera can be current, so setting a different camera `current` will disable this one.
   */
  open val current: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_CURRENT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  /**
   * The custom [godot.Viewport] node attached to the [godot.Camera2D]. If `null` or not a [godot.Viewport], uses the default viewport instead.
   */
  open var customViewport: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_CUSTOM_VIEWPORT,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Node?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_CUSTOM_VIEWPORT, NIL)
    }

  /**
   * Bottom margin needed to drag the camera. A value of `1` makes the camera move only when reaching the edge of the screen.
   */
  open var dragMarginBottom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_DRAG_MARGIN_BOTTOM,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_DRAG_MARGIN_BOTTOM,
          NIL)
    }

  /**
   * If `true`, the camera only moves when reaching the horizontal drag margins. If `false`, the camera moves horizontally regardless of margins.
   */
  open var dragMarginHEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_DRAG_MARGIN_H_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_DRAG_MARGIN_H_ENABLED, NIL)
    }

  /**
   * Left margin needed to drag the camera. A value of `1` makes the camera move only when reaching the edge of the screen.
   */
  open var dragMarginLeft: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_DRAG_MARGIN_LEFT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_DRAG_MARGIN_LEFT,
          NIL)
    }

  /**
   * Right margin needed to drag the camera. A value of `1` makes the camera move only when reaching the edge of the screen.
   */
  open var dragMarginRight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_DRAG_MARGIN_RIGHT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_DRAG_MARGIN_RIGHT,
          NIL)
    }

  /**
   * Top margin needed to drag the camera. A value of `1` makes the camera move only when reaching the edge of the screen.
   */
  open var dragMarginTop: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_DRAG_MARGIN_TOP,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_DRAG_MARGIN_TOP, NIL)
    }

  /**
   * If `true`, the camera only moves when reaching the vertical drag margins. If `false`, the camera moves vertically regardless of margins.
   */
  open var dragMarginVEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_DRAG_MARGIN_V_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_DRAG_MARGIN_V_ENABLED, NIL)
    }

  /**
   * If `true`, draws the camera's drag margin rectangle in the editor.
   */
  open var editorDrawDragMargin: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_EDITOR_DRAW_DRAG_MARGIN, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_EDITOR_DRAW_DRAG_MARGIN, NIL)
    }

  /**
   * If `true`, draws the camera's limits rectangle in the editor.
   */
  open var editorDrawLimits: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_EDITOR_DRAW_LIMITS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_EDITOR_DRAW_LIMITS,
          NIL)
    }

  /**
   * If `true`, draws the camera's screen rectangle in the editor.
   */
  open var editorDrawScreen: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_EDITOR_DRAW_SCREEN,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_EDITOR_DRAW_SCREEN,
          NIL)
    }

  /**
   * Bottom scroll limit in pixels. The camera stops moving when reaching this value.
   */
  open var limitBottom: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_LIMIT_BOTTOM, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_LIMIT_BOTTOM, NIL)
    }

  /**
   * Left scroll limit in pixels. The camera stops moving when reaching this value.
   */
  open var limitLeft: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_LIMIT_LEFT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_LIMIT_LEFT, NIL)
    }

  /**
   * Right scroll limit in pixels. The camera stops moving when reaching this value.
   */
  open var limitRight: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_LIMIT_RIGHT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_LIMIT_RIGHT, NIL)
    }

  /**
   * If `true`, the camera smoothly stops when reaches its limits.
   */
  open var limitSmoothed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_LIMIT_SMOOTHED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_LIMIT_SMOOTHED, NIL)
    }

  /**
   * Top scroll limit in pixels. The camera stops moving when reaching this value.
   */
  open var limitTop: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_LIMIT_TOP, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_LIMIT_TOP, NIL)
    }

  /**
   * The camera's offset, useful for looking around or camera shake animations.
   */
  open var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_OFFSET, NIL)
    }

  /**
   * The horizontal offset of the camera, relative to the drag margins.
   *
   * **Note:** Offset H is used only to force offset relative to margins. It's not updated in any way if drag margins are enabled and can be used to set initial offset.
   */
  open var offsetH: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_OFFSET_H, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_OFFSET_H, NIL)
    }

  /**
   * The vertical offset of the camera, relative to the drag margins.
   *
   * **Note:** Used the same as [offsetH].
   */
  open var offsetV: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_OFFSET_V, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_OFFSET_V, NIL)
    }

  /**
   * The camera's process callback. See [enum Camera2DProcessMode].
   */
  open var processMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_PROCESS_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_PROCESS_MODE, NIL)
    }

  /**
   * If `true`, the camera rotates with the target.
   */
  open var rotating: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_ROTATING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_ROTATING, NIL)
    }

  /**
   * If `true`, the camera smoothly moves towards the target at [smoothingSpeed].
   */
  open var smoothingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_SMOOTHING_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_SMOOTHING_ENABLED,
          NIL)
    }

  /**
   * Speed in pixels per second of the camera's smoothing effect when [smoothingEnabled] is `true`.
   */
  open var smoothingSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_SMOOTHING_SPEED,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_SMOOTHING_SPEED, NIL)
    }

  /**
   * The camera's zoom relative to the viewport. Values larger than `Vector2(1, 1)` zoom out and smaller values zoom in. For an example, use `Vector2(0.5, 0.5)` for a 2× zoom-in, and `Vector2(4, 4)` for a 4× zoom-out.
   */
  open var zoom: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_ZOOM, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_ZOOM, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_CAMERA2D)
  }

  open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  open fun zoom(schedule: Vector2.() -> Unit): Vector2 = zoom.apply{
      schedule(this)
      zoom = this
  }


  open fun _makeCurrent(arg0: Object) {
  }

  open fun _setCurrent(current: Boolean) {
  }

  open fun _setOldSmoothing(followSmoothing: Double) {
  }

  open fun _updateScroll() {
  }

  /**
   * Aligns the camera to the tracked node.
   */
  open fun align() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_ALIGN, NIL)
  }

  /**
   * Removes any [godot.Camera2D] from the ancestor [godot.Viewport]'s internal currently-assigned camera.
   */
  open fun clearCurrent() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_CLEAR_CURRENT, NIL)
  }

  /**
   * Forces the camera to update scroll immediately.
   */
  open fun forceUpdateScroll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_FORCE_UPDATE_SCROLL, NIL)
  }

  /**
   * Returns the camera position.
   */
  open fun getCameraPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_CAMERA_POSITION,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the location of the [godot.Camera2D]'s screen-center, relative to the origin.
   */
  open fun getCameraScreenCenter(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_CAMERA_SCREEN_CENTER,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Make this the current 2D camera for the scene (viewport and layer), in case there are many cameras in the scene.
   */
  open fun makeCurrent() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_MAKE_CURRENT, NIL)
  }

  /**
   * Sets the camera's position immediately to its current smoothing destination.
   *
   * This has no effect if smoothing is disabled.
   */
  open fun resetSmoothing() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_RESET_SMOOTHING, NIL)
  }

  enum class Camera2DProcessMode(
    id: Long
  ) {
    /**
     * The camera updates with the `_physics_process` callback.
     */
    CAMERA2D_PROCESS_PHYSICS(0),

    /**
     * The camera updates with the `_process` callback.
     */
    CAMERA2D_PROCESS_IDLE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class AnchorMode(
    id: Long
  ) {
    /**
     * The camera's position is fixed so that the top-left corner is always at the origin.
     */
    ANCHOR_MODE_FIXED_TOP_LEFT(0),

    /**
     * The camera's position takes into account vertical/horizontal offsets and the screen size.
     */
    ANCHOR_MODE_DRAG_CENTER(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * The camera's position takes into account vertical/horizontal offsets and the screen size.
     */
    final const val ANCHOR_MODE_DRAG_CENTER: Long = 1

    /**
     * The camera's position is fixed so that the top-left corner is always at the origin.
     */
    final const val ANCHOR_MODE_FIXED_TOP_LEFT: Long = 0

    /**
     * The camera updates with the `_process` callback.
     */
    final const val CAMERA2D_PROCESS_IDLE: Long = 1

    /**
     * The camera updates with the `_physics_process` callback.
     */
    final const val CAMERA2D_PROCESS_PHYSICS: Long = 0
  }
}

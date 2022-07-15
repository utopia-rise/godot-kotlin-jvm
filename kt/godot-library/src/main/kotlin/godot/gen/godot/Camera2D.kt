// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
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
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/110](https://godotengine.org/asset-library/asset/110)
 *
 * Camera node for 2D scenes. It forces the screen (current layer) to scroll following this node. This makes it easier (and faster) to program scrollable scenes than manually changing the position of [godot.CanvasItem]-based nodes.
 *
 * This node is intended to be a simple helper to get things going quickly, but more functionality may be desired to change how the camera works. To make your own custom camera node, inherit it from [godot.Node2D] and change the transform of the canvas by setting [godot.Viewport.canvasTransform] in [godot.Viewport] (you can obtain the current [godot.Viewport] by using [godot.Node.getViewport]).
 *
 * Note that the [godot.Camera2D] node's `position` doesn't represent the actual position of the screen, which may differ due to applied smoothing or limits. You can use [getCameraScreenCenter] to get the real position.
 */
@GodotBaseType
public open class Camera2D : Node2D() {
  /**
   * The Camera2D's anchor point. See [enum AnchorMode] constants.
   */
  public open var anchorMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_ANCHOR_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_ANCHOR_MODE, NIL)
    }

  /**
   * If `true`, the camera is the active camera for the current scene. Only one camera can be current, so setting a different camera `current` will disable this one.
   */
  public open val current: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_CURRENT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  /**
   * The custom [godot.Viewport] node attached to the [godot.Camera2D]. If `null` or not a [godot.Viewport], uses the default viewport instead.
   */
  public open var customViewport: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_CUSTOM_VIEWPORT,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Node?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_CUSTOM_VIEWPORT, NIL)
    }

  /**
   * Bottom margin needed to drag the camera. A value of `1` makes the camera move only when reaching the edge of the screen.
   */
  public open var dragMarginBottom: Double
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_DRAG_MARGIN_BOTTOM,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_DRAG_MARGIN_BOTTOM,
          NIL)
    }

  /**
   * If `true`, the camera only moves when reaching the horizontal drag margins. If `false`, the camera moves horizontally regardless of margins.
   */
  public open var dragMarginHEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_DRAG_MARGIN_H_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_DRAG_MARGIN_H_ENABLED, NIL)
    }

  /**
   * Left margin needed to drag the camera. A value of `1` makes the camera move only when reaching the edge of the screen.
   */
  public open var dragMarginLeft: Double
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_DRAG_MARGIN_LEFT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_DRAG_MARGIN_LEFT,
          NIL)
    }

  /**
   * Right margin needed to drag the camera. A value of `1` makes the camera move only when reaching the edge of the screen.
   */
  public open var dragMarginRight: Double
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_DRAG_MARGIN_RIGHT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_DRAG_MARGIN_RIGHT,
          NIL)
    }

  /**
   * Top margin needed to drag the camera. A value of `1` makes the camera move only when reaching the edge of the screen.
   */
  public open var dragMarginTop: Double
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_DRAG_MARGIN_TOP,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_DRAG_MARGIN_TOP, NIL)
    }

  /**
   * If `true`, the camera only moves when reaching the vertical drag margins. If `false`, the camera moves vertically regardless of margins.
   */
  public open var dragMarginVEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_DRAG_MARGIN_V_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_DRAG_MARGIN_V_ENABLED, NIL)
    }

  /**
   * If `true`, draws the camera's drag margin rectangle in the editor.
   */
  public open var editorDrawDragMargin: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_EDITOR_DRAW_DRAG_MARGIN, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_EDITOR_DRAW_DRAG_MARGIN, NIL)
    }

  /**
   * If `true`, draws the camera's limits rectangle in the editor.
   */
  public open var editorDrawLimits: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_EDITOR_DRAW_LIMITS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_EDITOR_DRAW_LIMITS,
          NIL)
    }

  /**
   * If `true`, draws the camera's screen rectangle in the editor.
   */
  public open var editorDrawScreen: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_EDITOR_DRAW_SCREEN,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_EDITOR_DRAW_SCREEN,
          NIL)
    }

  /**
   * Bottom scroll limit in pixels. The camera stops moving when reaching this value.
   */
  public open var limitBottom: Long
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_LIMIT_BOTTOM, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_LIMIT_BOTTOM, NIL)
    }

  /**
   * Left scroll limit in pixels. The camera stops moving when reaching this value.
   */
  public open var limitLeft: Long
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_LIMIT_LEFT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_LIMIT_LEFT, NIL)
    }

  /**
   * Right scroll limit in pixels. The camera stops moving when reaching this value.
   */
  public open var limitRight: Long
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_LIMIT_RIGHT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_LIMIT_RIGHT, NIL)
    }

  /**
   * If `true`, the camera smoothly stops when reaches its limits.
   *
   * This property has no effect if [smoothingEnabled] is `false`.
   *
   * **Note:** To immediately update the camera's position to be within limits without smoothing, even with this setting enabled, invoke [resetSmoothing].
   */
  public open var limitSmoothed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_LIMIT_SMOOTHED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_LIMIT_SMOOTHED, NIL)
    }

  /**
   * Top scroll limit in pixels. The camera stops moving when reaching this value.
   */
  public open var limitTop: Long
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_LIMIT_TOP, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_LIMIT_TOP, NIL)
    }

  /**
   * The camera's offset, useful for looking around or camera shake animations.
   */
  public open var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_OFFSET, NIL)
    }

  /**
   * The horizontal offset of the camera, relative to the drag margins.
   *
   * **Note:** Offset H is used only to force offset relative to margins. It's not updated in any way if drag margins are enabled and can be used to set initial offset.
   */
  public open var offsetH: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_OFFSET_H, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_OFFSET_H, NIL)
    }

  /**
   * The vertical offset of the camera, relative to the drag margins.
   *
   * **Note:** Used the same as [offsetH].
   */
  public open var offsetV: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_OFFSET_V, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_OFFSET_V, NIL)
    }

  /**
   * The camera's process callback. See [enum Camera2DProcessMode].
   */
  public open var processMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_PROCESS_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_PROCESS_MODE, NIL)
    }

  /**
   * If `true`, the camera view rotates with the target.
   */
  public open var rotating: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_ROTATING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_ROTATING, NIL)
    }

  /**
   * If `true`, the camera smoothly moves towards the target at [smoothingSpeed].
   */
  public open var smoothingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_SMOOTHING_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_SMOOTHING_ENABLED,
          NIL)
    }

  /**
   * Speed in pixels per second of the camera's smoothing effect when [smoothingEnabled] is `true`.
   */
  public open var smoothingSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_SMOOTHING_SPEED,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_SMOOTHING_SPEED, NIL)
    }

  /**
   * The camera's zoom relative to the viewport. Values larger than `Vector2(1, 1)` zoom out and smaller values zoom in. For an example, use `Vector2(0.5, 0.5)` for a 2× zoom-in, and `Vector2(4, 4)` for a 4× zoom-out.
   */
  public open var zoom: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_ZOOM, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_ZOOM, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CAMERA2D)
  }

  @CoreTypeHelper
  public open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }


  @CoreTypeHelper
  public open fun zoom(schedule: Vector2.() -> Unit): Vector2 = zoom.apply{
      schedule(this)
      zoom = this
  }


  public open fun _makeCurrent(arg0: Object): Unit {
  }

  public open fun _setCurrent(current: Boolean): Unit {
  }

  public open fun _updateScroll(): Unit {
  }

  /**
   * Aligns the camera to the tracked node.
   */
  public open fun align(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_ALIGN, NIL)
  }

  /**
   * Removes any [godot.Camera2D] from the ancestor [godot.Viewport]'s internal currently-assigned camera.
   */
  public open fun clearCurrent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_CLEAR_CURRENT, NIL)
  }

  /**
   * Forces the camera to update scroll immediately.
   */
  public open fun forceUpdateScroll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_FORCE_UPDATE_SCROLL, NIL)
  }

  /**
   * Returns the camera's `position` (the tracked point the camera attempts to follow), relative to the origin.
   *
   * **Note:** The returned value is not the same as [godot.Node2D.position] or [godot.Node2D.globalPosition], as it is affected by the `drag` properties.
   */
  public open fun getCameraPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_CAMERA_POSITION,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the location of the [godot.Camera2D]'s screen-center, relative to the origin.
   *
   * **Note:** The real `position` of the camera may be different, see [getCameraPosition].
   */
  public open fun getCameraScreenCenter(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_CAMERA_SCREEN_CENTER,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Make this the current 2D camera for the scene (viewport and layer), in case there are many cameras in the scene.
   */
  public open fun makeCurrent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_MAKE_CURRENT, NIL)
  }

  /**
   * Sets the camera's position immediately to its current smoothing destination.
   *
   * This method has no effect if [smoothingEnabled] is `false`.
   */
  public open fun resetSmoothing(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_RESET_SMOOTHING, NIL)
  }

  public enum class Camera2DProcessMode(
    id: Long
  ) {
    /**
     * The camera updates with the `_physics_process` callback.
     */
    CAMERA2D_PROCESS_PHYSICS(0),
    /**
     * The camera updates with the `_process` callback.
     */
    CAMERA2D_PROCESS_IDLE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class AnchorMode(
    id: Long
  ) {
    /**
     * The camera's position is fixed so that the top-left corner is always at the origin.
     */
    ANCHOR_MODE_FIXED_TOP_LEFT(0),
    /**
     * The camera's position takes into account vertical/horizontal offsets and the screen size.
     */
    ANCHOR_MODE_DRAG_CENTER(1),
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
     * The camera's position takes into account vertical/horizontal offsets and the screen size.
     */
    public final const val ANCHOR_MODE_DRAG_CENTER: Long = 1

    /**
     * The camera's position is fixed so that the top-left corner is always at the origin.
     */
    public final const val ANCHOR_MODE_FIXED_TOP_LEFT: Long = 0

    /**
     * The camera updates with the `_process` callback.
     */
    public final const val CAMERA2D_PROCESS_IDLE: Long = 1

    /**
     * The camera updates with the `_physics_process` callback.
     */
    public final const val CAMERA2D_PROCESS_PHYSICS: Long = 0
  }
}

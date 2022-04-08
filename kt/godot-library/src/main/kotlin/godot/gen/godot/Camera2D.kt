// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

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
 * Cameras register themselves in the nearest [godot.Viewport] node (when ascending the tree). Only one camera can be active per viewport. If no viewport is available ascending the tree, the camera will register in the global viewport.
 *
 * This node is intended to be a simple helper to get things going quickly, but more functionality may be desired to change how the camera works. To make your own custom camera node, inherit it from [godot.Node2D] and change the transform of the canvas by setting [godot.Viewport.canvasTransform] in [godot.Viewport] (you can obtain the current [godot.Viewport] by using [godot.Node.getViewport]).
 *
 * Note that the [godot.Camera2D] node's `position` doesn't represent the actual position of the screen, which may differ due to applied smoothing or limits. You can use [getCameraScreenCenter] to get the real position.
 */
@GodotBaseType
public open class Camera2D : Node2D() {
  /**
   * The camera's relative offset. Useful for looking around or camera shake animations. The offsetted camera can go past the limits defined in [limitTop], [limitBottom], [limitLeft] and [limitRight].
   */
  public var offset: Vector2
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
   * The Camera2D's anchor point. See [enum AnchorMode] constants.
   */
  public var anchorMode: Long
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
   * If `true`, the camera view rotates with the target.
   */
  public var rotating: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_IS_ROTATING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_ROTATING, NIL)
    }

  /**
   * If `true`, the camera acts as the active camera for its [godot.Viewport] ancestor. Only one camera can be current in a given viewport, so setting a different camera in the same viewport `current` will disable whatever camera was already active in that viewport.
   */
  public var current: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_IS_CURRENT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_CURRENT, NIL)
    }

  /**
   * The camera's zoom. A zoom of `Vector(2, 2)` doubles the size seen in the viewport. A zoom of `Vector(0.5, 0.5)` halves the size seen in the viewport.
   */
  public var zoom: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_ZOOM, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_ZOOM, NIL)
    }

  /**
   * The custom [godot.Viewport] node attached to the [godot.Camera2D]. If `null` or not a [godot.Viewport], uses the default viewport instead.
   */
  public var customViewport: Viewport?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_CUSTOM_VIEWPORT,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Viewport?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_CUSTOM_VIEWPORT, NIL)
    }

  /**
   * The camera's process callback. See [enum Camera2DProcessCallback].
   */
  public var processCallback: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_PROCESS_CALLBACK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_PROCESS_CALLBACK,
          NIL)
    }

  /**
   * If `true`, the camera smoothly stops when reaches its limits.
   *
   * This property has no effect if [smoothingEnabled] is `false`.
   *
   * **Note:** To immediately update the camera's position to be within limits without smoothing, even with this setting enabled, invoke [resetSmoothing].
   */
  public var limitSmoothed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_IS_LIMIT_SMOOTHING_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_LIMIT_SMOOTHING_ENABLED, NIL)
    }

  /**
   * If `true`, the camera smoothly moves towards the target at [smoothingSpeed].
   */
  public var smoothingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_IS_FOLLOW_SMOOTHING_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_ENABLE_FOLLOW_SMOOTHING, NIL)
    }

  /**
   * Speed in pixels per second of the camera's smoothing effect when [smoothingEnabled] is `true`.
   */
  public var smoothingSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_FOLLOW_SMOOTHING,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_FOLLOW_SMOOTHING,
          NIL)
    }

  /**
   * If `true`, the camera only moves when reaching the horizontal (left and right) drag margins. If `false`, the camera moves horizontally regardless of margins.
   */
  public var dragHorizontalEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_IS_DRAG_HORIZONTAL_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_DRAG_HORIZONTAL_ENABLED, NIL)
    }

  /**
   * If `true`, the camera only moves when reaching the vertical (top and bottom) drag margins. If `false`, the camera moves vertically regardless of the drag margins.
   */
  public var dragVerticalEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_IS_DRAG_VERTICAL_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_DRAG_VERTICAL_ENABLED, NIL)
    }

  /**
   * The relative horizontal drag offset of the camera between the right (`-1`) and left (`1`) drag margins.
   *
   * **Note:** Used to set the initial horizontal drag offset; determine the current offset; or force the current offset. It's not automatically updated when [dragHorizontalEnabled] is `true` or the drag margins are changed.
   */
  public var dragHorizontalOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_DRAG_HORIZONTAL_OFFSET, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_DRAG_HORIZONTAL_OFFSET, NIL)
    }

  /**
   * The relative vertical drag offset of the camera between the bottom (`-1`) and top (`1`) drag margins.
   *
   * **Note:** Used to set the initial vertical drag offset; determine the current offset; or force the current offset. It's not automatically updated when [dragVerticalEnabled] is `true` or the drag margins are changed.
   */
  public var dragVerticalOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_DRAG_VERTICAL_OFFSET,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_DRAG_VERTICAL_OFFSET,
          NIL)
    }

  /**
   * If `true`, draws the camera's screen rectangle in the editor.
   */
  public var editorDrawScreen: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_IS_SCREEN_DRAWING_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_SCREEN_DRAWING_ENABLED, NIL)
    }

  /**
   * If `true`, draws the camera's limits rectangle in the editor.
   */
  public var editorDrawLimits: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_IS_LIMIT_DRAWING_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_LIMIT_DRAWING_ENABLED, NIL)
    }

  /**
   * If `true`, draws the camera's drag margin rectangle in the editor.
   */
  public var editorDrawDragMargin: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_IS_MARGIN_DRAWING_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_MARGIN_DRAWING_ENABLED, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CAMERA2D)
  }

  /**
   * Sets the camera limit for the specified [enum Side]. See also [limitBottom], [limitTop], [limitLeft], and [limitRight].
   */
  public fun setLimit(margin: Side, limit: Long): Unit {
    TransferContext.writeArguments(LONG to margin.id, LONG to limit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_LIMIT, NIL)
  }

  /**
   * Returns the camera limit for the specified [enum Side]. See also [limitBottom], [limitTop], [limitLeft], and [limitRight].
   */
  public fun getLimit(margin: Side): Long {
    TransferContext.writeArguments(LONG to margin.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_LIMIT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the specified [enum Side]'s margin. See also [dragBottomMargin], [dragTopMargin], [dragLeftMargin], and [dragRightMargin].
   */
  public fun setDragMargin(margin: Side, dragMargin: Double): Unit {
    TransferContext.writeArguments(LONG to margin.id, DOUBLE to dragMargin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_SET_DRAG_MARGIN, NIL)
  }

  /**
   * Returns the specified [enum Side]'s margin. See also [dragBottomMargin], [dragTopMargin], [dragLeftMargin], and [dragRightMargin].
   */
  public fun getDragMargin(margin: Side): Double {
    TransferContext.writeArguments(LONG to margin.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_DRAG_MARGIN, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the camera's `position` (the tracked point the camera attempts to follow), relative to the origin.
   *
   * **Note:** The returned value is not the same as [godot.Node2D.position] or [godot.Node2D.globalPosition], as it is affected by the `drag` properties.
   */
  public fun getCameraPosition(): Vector2 {
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
  public fun getCameraScreenCenter(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_GET_CAMERA_SCREEN_CENTER,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Forces the camera to update scroll immediately.
   */
  public fun forceUpdateScroll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_FORCE_UPDATE_SCROLL, NIL)
  }

  /**
   * Sets the camera's position immediately to its current smoothing destination.
   *
   * This method has no effect if [smoothingEnabled] is `false`.
   */
  public fun resetSmoothing(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_RESET_SMOOTHING, NIL)
  }

  /**
   * Aligns the camera to the tracked node.
   */
  public fun align(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERA2D_ALIGN, NIL)
  }

  public enum class Camera2DProcessCallback(
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

  public companion object
}

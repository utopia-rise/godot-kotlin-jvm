// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Camera node for 2D scenes. It forces the screen (current layer) to scroll following this node.
 * This makes it easier (and faster) to program scrollable scenes than manually changing the position
 * of [CanvasItem]-based nodes.
 * Cameras register themselves in the nearest [Viewport] node (when ascending the tree). Only one
 * camera can be active per viewport. If no viewport is available ascending the tree, the camera will
 * register in the global viewport.
 * This node is intended to be a simple helper to get things going quickly, but more functionality
 * may be desired to change how the camera works. To make your own custom camera node, inherit it from
 * [Node2D] and change the transform of the canvas by setting [Viewport.canvasTransform] in [Viewport]
 * (you can obtain the current [Viewport] by using [Node.getViewport]).
 * Note that the [Camera2D] node's `position` doesn't represent the actual position of the screen,
 * which may differ due to applied smoothing or limits. You can use [getScreenCenterPosition] to get
 * the real position.
 */
@GodotBaseType
public open class Camera2D : Node2D() {
  /**
   * The camera's relative offset. Useful for looking around or camera shake animations. The
   * offsetted camera can go past the limits defined in [limitTop], [limitBottom], [limitLeft] and
   * [limitRight].
   */
  @CoreTypeLocalCopy
  public var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
    }

  /**
   * The Camera2D's anchor point. See [AnchorMode] constants.
   */
  public var anchorMode: AnchorMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAnchorModePtr, LONG)
      return Camera2D.AnchorMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAnchorModePtr, NIL)
    }

  /**
   * If `true`, the camera's rendered view is not affected by its [Node2D.rotation] and
   * [Node2D.globalRotation].
   */
  public var ignoreRotation: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isIgnoringRotationPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIgnoreRotationPtr, NIL)
    }

  /**
   * Controls whether the camera can be active or not. If `true`, the [Camera2D] will become the
   * main camera when it enters the scene tree and there is no active camera currently (see
   * [Viewport.getCamera2d]).
   * When the camera is currently active and [enabled] is set to `false`, the next enabled
   * [Camera2D] in the scene tree will become active.
   */
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnabledPtr, NIL)
    }

  /**
   * The camera's zoom. A zoom of `Vector(2, 2)` doubles the size seen in the viewport. A zoom of
   * `Vector(0.5, 0.5)` halves the size seen in the viewport.
   * **Note:** [FontFile.oversampling] does *not* take [Camera2D] zoom into account. This means that
   * zooming in/out will cause bitmap fonts and rasterized (non-MSDF) dynamic fonts to appear blurry or
   * pixelated unless the font is part of a [CanvasLayer] that makes it ignore camera zoom. To ensure
   * text remains crisp regardless of zoom, you can enable MSDF font rendering by enabling
   * [ProjectSettings.gui/theme/defaultFontMultichannelSignedDistanceField] (applies to the default
   * project font only), or enabling **Multichannel Signed Distance Field** in the import options of a
   * DynamicFont for custom fonts. On system fonts, [SystemFont.multichannelSignedDistanceField] can be
   * enabled in the inspector.
   */
  @CoreTypeLocalCopy
  public var zoom: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getZoomPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setZoomPtr, NIL)
    }

  /**
   * The custom [Viewport] node attached to the [Camera2D]. If `null` or not a [Viewport], uses the
   * default viewport instead.
   */
  public var customViewport: Node?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCustomViewportPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Node?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCustomViewportPtr, NIL)
    }

  /**
   * The camera's process callback. See [Camera2DProcessCallback].
   */
  public var processCallback: Camera2DProcessCallback
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProcessCallbackPtr, LONG)
      return Camera2D.Camera2DProcessCallback.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setProcessCallbackPtr, NIL)
    }

  /**
   * Left scroll limit in pixels. The camera stops moving when reaching this value, but [offset] can
   * push the view past the limit.
   */
  public var limitLeft: Int
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getLimitPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setLimitPtr, NIL)
    }

  /**
   * Top scroll limit in pixels. The camera stops moving when reaching this value, but [offset] can
   * push the view past the limit.
   */
  public var limitTop: Int
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getLimitPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setLimitPtr, NIL)
    }

  /**
   * Right scroll limit in pixels. The camera stops moving when reaching this value, but [offset]
   * can push the view past the limit.
   */
  public var limitRight: Int
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getLimitPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setLimitPtr, NIL)
    }

  /**
   * Bottom scroll limit in pixels. The camera stops moving when reaching this value, but [offset]
   * can push the view past the limit.
   */
  public var limitBottom: Int
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getLimitPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setLimitPtr, NIL)
    }

  /**
   * If `true`, the camera smoothly stops when reaches its limits.
   * This property has no effect if [positionSmoothingEnabled] is `false`.
   * **Note:** To immediately update the camera's position to be within limits without smoothing,
   * even with this setting enabled, invoke [resetSmoothing].
   */
  public var limitSmoothed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isLimitSmoothingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLimitSmoothingEnabledPtr, NIL)
    }

  /**
   * If `true`, the camera's view smoothly moves towards its target position at
   * [positionSmoothingSpeed].
   */
  public var positionSmoothingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPositionSmoothingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionSmoothingEnabledPtr, NIL)
    }

  /**
   * Speed in pixels per second of the camera's smoothing effect when [positionSmoothingEnabled] is
   * `true`.
   */
  public var positionSmoothingSpeed: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPositionSmoothingSpeedPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPositionSmoothingSpeedPtr, NIL)
    }

  /**
   * If `true`, the camera's view smoothly rotates, via asymptotic smoothing, to align with its
   * target rotation at [rotationSmoothingSpeed].
   * **Note:** This property has no effect if [ignoreRotation] is `true`.
   */
  public var rotationSmoothingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRotationSmoothingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationSmoothingEnabledPtr, NIL)
    }

  /**
   * The angular, asymptotic speed of the camera's rotation smoothing effect when
   * [rotationSmoothingEnabled] is `true`.
   */
  public var rotationSmoothingSpeed: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRotationSmoothingSpeedPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRotationSmoothingSpeedPtr, NIL)
    }

  /**
   * If `true`, the camera only moves when reaching the horizontal (left and right) drag margins. If
   * `false`, the camera moves horizontally regardless of margins.
   */
  public var dragHorizontalEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDragHorizontalEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDragHorizontalEnabledPtr, NIL)
    }

  /**
   * If `true`, the camera only moves when reaching the vertical (top and bottom) drag margins. If
   * `false`, the camera moves vertically regardless of the drag margins.
   */
  public var dragVerticalEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDragVerticalEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDragVerticalEnabledPtr, NIL)
    }

  /**
   * The relative horizontal drag offset of the camera between the right (`-1`) and left (`1`) drag
   * margins.
   * **Note:** Used to set the initial horizontal drag offset; determine the current offset; or
   * force the current offset. It's not automatically updated when [dragHorizontalEnabled] is `true` or
   * the drag margins are changed.
   */
  public var dragHorizontalOffset: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDragHorizontalOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDragHorizontalOffsetPtr, NIL)
    }

  /**
   * The relative vertical drag offset of the camera between the bottom (`-1`) and top (`1`) drag
   * margins.
   * **Note:** Used to set the initial vertical drag offset; determine the current offset; or force
   * the current offset. It's not automatically updated when [dragVerticalEnabled] is `true` or the
   * drag margins are changed.
   */
  public var dragVerticalOffset: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDragVerticalOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDragVerticalOffsetPtr, NIL)
    }

  /**
   * Left margin needed to drag the camera. A value of `1` makes the camera move only when reaching
   * the left edge of the screen.
   */
  public var dragLeftMargin: Float
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDragMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDragMarginPtr, NIL)
    }

  /**
   * Top margin needed to drag the camera. A value of `1` makes the camera move only when reaching
   * the top edge of the screen.
   */
  public var dragTopMargin: Float
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDragMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDragMarginPtr, NIL)
    }

  /**
   * Right margin needed to drag the camera. A value of `1` makes the camera move only when reaching
   * the right edge of the screen.
   */
  public var dragRightMargin: Float
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDragMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDragMarginPtr, NIL)
    }

  /**
   * Bottom margin needed to drag the camera. A value of `1` makes the camera move only when
   * reaching the bottom edge of the screen.
   */
  public var dragBottomMargin: Float
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, MethodBindings.getDragMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDragMarginPtr, NIL)
    }

  /**
   * If `true`, draws the camera's screen rectangle in the editor.
   */
  public var editorDrawScreen: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isScreenDrawingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScreenDrawingEnabledPtr, NIL)
    }

  /**
   * If `true`, draws the camera's limits rectangle in the editor.
   */
  public var editorDrawLimits: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isLimitDrawingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLimitDrawingEnabledPtr, NIL)
    }

  /**
   * If `true`, draws the camera's drag margin rectangle in the editor.
   */
  public var editorDrawDragMargin: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMarginDrawingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMarginDrawingEnabledPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CAMERA2D, scriptIndex)
  }

  /**
   * The camera's relative offset. Useful for looking around or camera shake animations. The
   * offsetted camera can go past the limits defined in [limitTop], [limitBottom], [limitLeft] and
   * [limitRight].
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
   * val myCoreType = camera2d.offset
   * //Your changes
   * camera2d.offset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
      block(this)
      offset = this
  }


  /**
   * The camera's zoom. A zoom of `Vector(2, 2)` doubles the size seen in the viewport. A zoom of
   * `Vector(0.5, 0.5)` halves the size seen in the viewport.
   * **Note:** [FontFile.oversampling] does *not* take [Camera2D] zoom into account. This means that
   * zooming in/out will cause bitmap fonts and rasterized (non-MSDF) dynamic fonts to appear blurry or
   * pixelated unless the font is part of a [CanvasLayer] that makes it ignore camera zoom. To ensure
   * text remains crisp regardless of zoom, you can enable MSDF font rendering by enabling
   * [ProjectSettings.gui/theme/defaultFontMultichannelSignedDistanceField] (applies to the default
   * project font only), or enabling **Multichannel Signed Distance Field** in the import options of a
   * DynamicFont for custom fonts. On system fonts, [SystemFont.multichannelSignedDistanceField] can be
   * enabled in the inspector.
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
   * val myCoreType = camera2d.zoom
   * //Your changes
   * camera2d.zoom = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun zoomMutate(block: Vector2.() -> Unit): Vector2 = zoom.apply{
      block(this)
      zoom = this
  }


  /**
   * Forces this [Camera2D] to become the current active one. [enabled] must be `true`.
   */
  public fun makeCurrent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.makeCurrentPtr, NIL)
  }

  /**
   * Returns `true` if this [Camera2D] is the active camera (see [Viewport.getCamera2d]).
   */
  public fun isCurrent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCurrentPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns this camera's target position, in global coordinates.
   * **Note:** The returned value is not the same as [Node2D.globalPosition], as it is affected by
   * the drag properties. It is also not the same as the current position if [positionSmoothingEnabled]
   * is `true` (see [getScreenCenterPosition]).
   */
  public fun getTargetPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTargetPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the center of the screen from this camera's point of view, in global coordinates.
   * **Note:** The exact targeted position of the camera may be different. See [getTargetPosition].
   */
  public fun getScreenCenterPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScreenCenterPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Forces the camera to update scroll immediately.
   */
  public fun forceUpdateScroll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceUpdateScrollPtr, NIL)
  }

  /**
   * Sets the camera's position immediately to its current smoothing destination.
   * This method has no effect if [positionSmoothingEnabled] is `false`.
   */
  public fun resetSmoothing(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.resetSmoothingPtr, NIL)
  }

  /**
   * Aligns the camera to the tracked node.
   */
  public fun align(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.alignPtr, NIL)
  }

  public enum class AnchorMode(
    id: Long,
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
      public fun from(`value`: Long): AnchorMode = entries.single { it.id == `value` }
    }
  }

  public enum class Camera2DProcessCallback(
    id: Long,
  ) {
    /**
     * The camera updates during physics frames (see [Node.NOTIFICATION_INTERNAL_PHYSICS_PROCESS]).
     */
    CAMERA2D_PROCESS_PHYSICS(0),
    /**
     * The camera updates during process frames (see [Node.NOTIFICATION_INTERNAL_PROCESS]).
     */
    CAMERA2D_PROCESS_IDLE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Camera2DProcessCallback = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_offset", 743155724)

    public val getOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_offset", 3341600327)

    public val setAnchorModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_anchor_mode", 2050398218)

    public val getAnchorModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_anchor_mode", 155978067)

    public val setIgnoreRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_ignore_rotation", 2586408642)

    public val isIgnoringRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "is_ignoring_rotation", 36873697)

    public val setProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_process_callback", 4201947462)

    public val getProcessCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_process_callback", 2325344499)

    public val setEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_enabled", 2586408642)

    public val isEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "is_enabled", 36873697)

    public val makeCurrentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "make_current", 3218959716)

    public val isCurrentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "is_current", 36873697)

    public val setLimitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_limit", 437707142)

    public val getLimitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_limit", 1983885014)

    public val setLimitSmoothingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_limit_smoothing_enabled", 2586408642)

    public val isLimitSmoothingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "is_limit_smoothing_enabled", 36873697)

    public val setDragVerticalEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_drag_vertical_enabled", 2586408642)

    public val isDragVerticalEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "is_drag_vertical_enabled", 36873697)

    public val setDragHorizontalEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_drag_horizontal_enabled", 2586408642)

    public val isDragHorizontalEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "is_drag_horizontal_enabled", 36873697)

    public val setDragVerticalOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_drag_vertical_offset", 373806689)

    public val getDragVerticalOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_drag_vertical_offset", 1740695150)

    public val setDragHorizontalOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_drag_horizontal_offset", 373806689)

    public val getDragHorizontalOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_drag_horizontal_offset", 1740695150)

    public val setDragMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_drag_margin", 4290182280)

    public val getDragMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_drag_margin", 2869120046)

    public val getTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_target_position", 3341600327)

    public val getScreenCenterPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_screen_center_position", 3341600327)

    public val setZoomPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera2D", "set_zoom", 743155724)

    public val getZoomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_zoom", 3341600327)

    public val setCustomViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_custom_viewport", 1078189570)

    public val getCustomViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_custom_viewport", 3160264692)

    public val setPositionSmoothingSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_position_smoothing_speed", 373806689)

    public val getPositionSmoothingSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_position_smoothing_speed", 1740695150)

    public val setPositionSmoothingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_position_smoothing_enabled", 2586408642)

    public val isPositionSmoothingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "is_position_smoothing_enabled", 36873697)

    public val setRotationSmoothingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_rotation_smoothing_enabled", 2586408642)

    public val isRotationSmoothingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "is_rotation_smoothing_enabled", 36873697)

    public val setRotationSmoothingSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_rotation_smoothing_speed", 373806689)

    public val getRotationSmoothingSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "get_rotation_smoothing_speed", 1740695150)

    public val forceUpdateScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "force_update_scroll", 3218959716)

    public val resetSmoothingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "reset_smoothing", 3218959716)

    public val alignPtr: VoidPtr = TypeManager.getMethodBindPtr("Camera2D", "align", 3218959716)

    public val setScreenDrawingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_screen_drawing_enabled", 2586408642)

    public val isScreenDrawingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "is_screen_drawing_enabled", 36873697)

    public val setLimitDrawingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_limit_drawing_enabled", 2586408642)

    public val isLimitDrawingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "is_limit_drawing_enabled", 36873697)

    public val setMarginDrawingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "set_margin_drawing_enabled", 2586408642)

    public val isMarginDrawingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Camera2D", "is_margin_drawing_enabled", 36873697)
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var offset: Vector2
    @JvmName("offsetProperty")
    get() = getOffset()
    @JvmName("offsetProperty")
    set(`value`) {
      setOffset(value)
    }

  /**
   * The Camera2D's anchor point. See [AnchorMode] constants.
   */
  public final inline var anchorMode: AnchorMode
    @JvmName("anchorModeProperty")
    get() = getAnchorMode()
    @JvmName("anchorModeProperty")
    set(`value`) {
      setAnchorMode(value)
    }

  /**
   * If `true`, the camera's rendered view is not affected by its [Node2D.rotation] and
   * [Node2D.globalRotation].
   */
  public final inline var ignoreRotation: Boolean
    @JvmName("ignoreRotationProperty")
    get() = isIgnoringRotation()
    @JvmName("ignoreRotationProperty")
    set(`value`) {
      setIgnoreRotation(value)
    }

  /**
   * Controls whether the camera can be active or not. If `true`, the [Camera2D] will become the
   * main camera when it enters the scene tree and there is no active camera currently (see
   * [Viewport.getCamera2d]).
   * When the camera is currently active and [enabled] is set to `false`, the next enabled
   * [Camera2D] in the scene tree will become active.
   */
  public final inline var enabled: Boolean
    @JvmName("enabledProperty")
    get() = isEnabled()
    @JvmName("enabledProperty")
    set(`value`) {
      setEnabled(value)
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
  public final inline var zoom: Vector2
    @JvmName("zoomProperty")
    get() = getZoom()
    @JvmName("zoomProperty")
    set(`value`) {
      setZoom(value)
    }

  /**
   * The custom [Viewport] node attached to the [Camera2D]. If `null` or not a [Viewport], uses the
   * default viewport instead.
   */
  public final inline var customViewport: Node?
    @JvmName("customViewportProperty")
    get() = getCustomViewport()
    @JvmName("customViewportProperty")
    set(`value`) {
      setCustomViewport(value)
    }

  /**
   * The camera's process callback. See [Camera2DProcessCallback].
   */
  public final inline var processCallback: Camera2DProcessCallback
    @JvmName("processCallbackProperty")
    get() = getProcessCallback()
    @JvmName("processCallbackProperty")
    set(`value`) {
      setProcessCallback(value)
    }

  /**
   * Left scroll limit in pixels. The camera stops moving when reaching this value, but [offset] can
   * push the view past the limit.
   */
  public final inline var limitLeft: Int
    @JvmName("limitLeftProperty")
    get() = getLimit(Side.SIDE_LEFT)
    @JvmName("limitLeftProperty")
    set(`value`) {
      setLimit(Side.SIDE_LEFT, value)
    }

  /**
   * Top scroll limit in pixels. The camera stops moving when reaching this value, but [offset] can
   * push the view past the limit.
   */
  public final inline var limitTop: Int
    @JvmName("limitTopProperty")
    get() = getLimit(Side.SIDE_TOP)
    @JvmName("limitTopProperty")
    set(`value`) {
      setLimit(Side.SIDE_TOP, value)
    }

  /**
   * Right scroll limit in pixels. The camera stops moving when reaching this value, but [offset]
   * can push the view past the limit.
   */
  public final inline var limitRight: Int
    @JvmName("limitRightProperty")
    get() = getLimit(Side.SIDE_RIGHT)
    @JvmName("limitRightProperty")
    set(`value`) {
      setLimit(Side.SIDE_RIGHT, value)
    }

  /**
   * Bottom scroll limit in pixels. The camera stops moving when reaching this value, but [offset]
   * can push the view past the limit.
   */
  public final inline var limitBottom: Int
    @JvmName("limitBottomProperty")
    get() = getLimit(Side.SIDE_BOTTOM)
    @JvmName("limitBottomProperty")
    set(`value`) {
      setLimit(Side.SIDE_BOTTOM, value)
    }

  /**
   * If `true`, the camera smoothly stops when reaches its limits.
   * This property has no effect if [positionSmoothingEnabled] is `false`.
   * **Note:** To immediately update the camera's position to be within limits without smoothing,
   * even with this setting enabled, invoke [resetSmoothing].
   */
  public final inline var limitSmoothed: Boolean
    @JvmName("limitSmoothedProperty")
    get() = isLimitSmoothingEnabled()
    @JvmName("limitSmoothedProperty")
    set(`value`) {
      setLimitSmoothingEnabled(value)
    }

  /**
   * If `true`, the camera's view smoothly moves towards its target position at
   * [positionSmoothingSpeed].
   */
  public final inline var positionSmoothingEnabled: Boolean
    @JvmName("positionSmoothingEnabledProperty")
    get() = isPositionSmoothingEnabled()
    @JvmName("positionSmoothingEnabledProperty")
    set(`value`) {
      setPositionSmoothingEnabled(value)
    }

  /**
   * Speed in pixels per second of the camera's smoothing effect when [positionSmoothingEnabled] is
   * `true`.
   */
  public final inline var positionSmoothingSpeed: Float
    @JvmName("positionSmoothingSpeedProperty")
    get() = getPositionSmoothingSpeed()
    @JvmName("positionSmoothingSpeedProperty")
    set(`value`) {
      setPositionSmoothingSpeed(value)
    }

  /**
   * If `true`, the camera's view smoothly rotates, via asymptotic smoothing, to align with its
   * target rotation at [rotationSmoothingSpeed].
   * **Note:** This property has no effect if [ignoreRotation] is `true`.
   */
  public final inline var rotationSmoothingEnabled: Boolean
    @JvmName("rotationSmoothingEnabledProperty")
    get() = isRotationSmoothingEnabled()
    @JvmName("rotationSmoothingEnabledProperty")
    set(`value`) {
      setRotationSmoothingEnabled(value)
    }

  /**
   * The angular, asymptotic speed of the camera's rotation smoothing effect when
   * [rotationSmoothingEnabled] is `true`.
   */
  public final inline var rotationSmoothingSpeed: Float
    @JvmName("rotationSmoothingSpeedProperty")
    get() = getRotationSmoothingSpeed()
    @JvmName("rotationSmoothingSpeedProperty")
    set(`value`) {
      setRotationSmoothingSpeed(value)
    }

  /**
   * If `true`, the camera only moves when reaching the horizontal (left and right) drag margins. If
   * `false`, the camera moves horizontally regardless of margins.
   */
  public final inline var dragHorizontalEnabled: Boolean
    @JvmName("dragHorizontalEnabledProperty")
    get() = isDragHorizontalEnabled()
    @JvmName("dragHorizontalEnabledProperty")
    set(`value`) {
      setDragHorizontalEnabled(value)
    }

  /**
   * If `true`, the camera only moves when reaching the vertical (top and bottom) drag margins. If
   * `false`, the camera moves vertically regardless of the drag margins.
   */
  public final inline var dragVerticalEnabled: Boolean
    @JvmName("dragVerticalEnabledProperty")
    get() = isDragVerticalEnabled()
    @JvmName("dragVerticalEnabledProperty")
    set(`value`) {
      setDragVerticalEnabled(value)
    }

  /**
   * The relative horizontal drag offset of the camera between the right (`-1`) and left (`1`) drag
   * margins.
   * **Note:** Used to set the initial horizontal drag offset; determine the current offset; or
   * force the current offset. It's not automatically updated when [dragHorizontalEnabled] is `true` or
   * the drag margins are changed.
   */
  public final inline var dragHorizontalOffset: Float
    @JvmName("dragHorizontalOffsetProperty")
    get() = getDragHorizontalOffset()
    @JvmName("dragHorizontalOffsetProperty")
    set(`value`) {
      setDragHorizontalOffset(value)
    }

  /**
   * The relative vertical drag offset of the camera between the bottom (`-1`) and top (`1`) drag
   * margins.
   * **Note:** Used to set the initial vertical drag offset; determine the current offset; or force
   * the current offset. It's not automatically updated when [dragVerticalEnabled] is `true` or the
   * drag margins are changed.
   */
  public final inline var dragVerticalOffset: Float
    @JvmName("dragVerticalOffsetProperty")
    get() = getDragVerticalOffset()
    @JvmName("dragVerticalOffsetProperty")
    set(`value`) {
      setDragVerticalOffset(value)
    }

  /**
   * Left margin needed to drag the camera. A value of `1` makes the camera move only when reaching
   * the left edge of the screen.
   */
  public final inline var dragLeftMargin: Float
    @JvmName("dragLeftMarginProperty")
    get() = getDragMargin(Side.SIDE_LEFT)
    @JvmName("dragLeftMarginProperty")
    set(`value`) {
      setDragMargin(Side.SIDE_LEFT, value)
    }

  /**
   * Top margin needed to drag the camera. A value of `1` makes the camera move only when reaching
   * the top edge of the screen.
   */
  public final inline var dragTopMargin: Float
    @JvmName("dragTopMarginProperty")
    get() = getDragMargin(Side.SIDE_TOP)
    @JvmName("dragTopMarginProperty")
    set(`value`) {
      setDragMargin(Side.SIDE_TOP, value)
    }

  /**
   * Right margin needed to drag the camera. A value of `1` makes the camera move only when reaching
   * the right edge of the screen.
   */
  public final inline var dragRightMargin: Float
    @JvmName("dragRightMarginProperty")
    get() = getDragMargin(Side.SIDE_RIGHT)
    @JvmName("dragRightMarginProperty")
    set(`value`) {
      setDragMargin(Side.SIDE_RIGHT, value)
    }

  /**
   * Bottom margin needed to drag the camera. A value of `1` makes the camera move only when
   * reaching the bottom edge of the screen.
   */
  public final inline var dragBottomMargin: Float
    @JvmName("dragBottomMarginProperty")
    get() = getDragMargin(Side.SIDE_BOTTOM)
    @JvmName("dragBottomMarginProperty")
    set(`value`) {
      setDragMargin(Side.SIDE_BOTTOM, value)
    }

  /**
   * If `true`, draws the camera's screen rectangle in the editor.
   */
  public final inline var editorDrawScreen: Boolean
    @JvmName("editorDrawScreenProperty")
    get() = isScreenDrawingEnabled()
    @JvmName("editorDrawScreenProperty")
    set(`value`) {
      setScreenDrawingEnabled(value)
    }

  /**
   * If `true`, draws the camera's limits rectangle in the editor.
   */
  public final inline var editorDrawLimits: Boolean
    @JvmName("editorDrawLimitsProperty")
    get() = isLimitDrawingEnabled()
    @JvmName("editorDrawLimitsProperty")
    set(`value`) {
      setLimitDrawingEnabled(value)
    }

  /**
   * If `true`, draws the camera's drag margin rectangle in the editor.
   */
  public final inline var editorDrawDragMargin: Boolean
    @JvmName("editorDrawDragMarginProperty")
    get() = isMarginDrawingEnabled()
    @JvmName("editorDrawDragMarginProperty")
    set(`value`) {
      setMarginDrawingEnabled(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_CAMERA2D, scriptIndex)
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
  public final fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
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
  public final fun zoomMutate(block: Vector2.() -> Unit): Vector2 = zoom.apply{
      block(this)
      zoom = this
  }


  public final fun setOffset(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(ptr, MethodBindings.setOffsetPtr, NIL)
  }

  public final fun getOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setAnchorMode(anchorMode: AnchorMode): Unit {
    TransferContext.writeArguments(LONG to anchorMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setAnchorModePtr, NIL)
  }

  public final fun getAnchorMode(): AnchorMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAnchorModePtr, LONG)
    return Camera2D.AnchorMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setIgnoreRotation(ignore: Boolean): Unit {
    TransferContext.writeArguments(BOOL to ignore)
    TransferContext.callMethod(ptr, MethodBindings.setIgnoreRotationPtr, NIL)
  }

  public final fun isIgnoringRotation(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isIgnoringRotationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setProcessCallback(mode: Camera2DProcessCallback): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setProcessCallbackPtr, NIL)
  }

  public final fun getProcessCallback(): Camera2DProcessCallback {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProcessCallbackPtr, LONG)
    return Camera2D.Camera2DProcessCallback.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setEnabledPtr, NIL)
  }

  public final fun isEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Forces this [Camera2D] to become the current active one. [enabled] must be `true`.
   */
  public final fun makeCurrent(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.makeCurrentPtr, NIL)
  }

  /**
   * Returns `true` if this [Camera2D] is the active camera (see [Viewport.getCamera2d]).
   */
  public final fun isCurrent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCurrentPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the camera limit for the specified [Side]. See also [limitBottom], [limitTop],
   * [limitLeft], and [limitRight].
   */
  public final fun setLimit(margin: Side, limit: Int): Unit {
    TransferContext.writeArguments(LONG to margin.id, LONG to limit.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setLimitPtr, NIL)
  }

  /**
   * Returns the camera limit for the specified [Side]. See also [limitBottom], [limitTop],
   * [limitLeft], and [limitRight].
   */
  public final fun getLimit(margin: Side): Int {
    TransferContext.writeArguments(LONG to margin.id)
    TransferContext.callMethod(ptr, MethodBindings.getLimitPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setLimitSmoothingEnabled(limitSmoothingEnabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to limitSmoothingEnabled)
    TransferContext.callMethod(ptr, MethodBindings.setLimitSmoothingEnabledPtr, NIL)
  }

  public final fun isLimitSmoothingEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isLimitSmoothingEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDragVerticalEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setDragVerticalEnabledPtr, NIL)
  }

  public final fun isDragVerticalEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDragVerticalEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDragHorizontalEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setDragHorizontalEnabledPtr, NIL)
  }

  public final fun isDragHorizontalEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDragHorizontalEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDragVerticalOffset(offset: Float): Unit {
    TransferContext.writeArguments(DOUBLE to offset.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDragVerticalOffsetPtr, NIL)
  }

  public final fun getDragVerticalOffset(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDragVerticalOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDragHorizontalOffset(offset: Float): Unit {
    TransferContext.writeArguments(DOUBLE to offset.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDragHorizontalOffsetPtr, NIL)
  }

  public final fun getDragHorizontalOffset(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDragHorizontalOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the specified [Side]'s margin. See also [dragBottomMargin], [dragTopMargin],
   * [dragLeftMargin], and [dragRightMargin].
   */
  public final fun setDragMargin(margin: Side, dragMargin: Float): Unit {
    TransferContext.writeArguments(LONG to margin.id, DOUBLE to dragMargin.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDragMarginPtr, NIL)
  }

  /**
   * Returns the specified [Side]'s margin. See also [dragBottomMargin], [dragTopMargin],
   * [dragLeftMargin], and [dragRightMargin].
   */
  public final fun getDragMargin(margin: Side): Float {
    TransferContext.writeArguments(LONG to margin.id)
    TransferContext.callMethod(ptr, MethodBindings.getDragMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns this camera's target position, in global coordinates.
   * **Note:** The returned value is not the same as [Node2D.globalPosition], as it is affected by
   * the drag properties. It is also not the same as the current position if [positionSmoothingEnabled]
   * is `true` (see [getScreenCenterPosition]).
   */
  public final fun getTargetPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTargetPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the center of the screen from this camera's point of view, in global coordinates.
   * **Note:** The exact targeted position of the camera may be different. See [getTargetPosition].
   */
  public final fun getScreenCenterPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getScreenCenterPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setZoom(zoom: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to zoom)
    TransferContext.callMethod(ptr, MethodBindings.setZoomPtr, NIL)
  }

  public final fun getZoom(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getZoomPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setCustomViewport(viewport: Node?): Unit {
    TransferContext.writeArguments(OBJECT to viewport)
    TransferContext.callMethod(ptr, MethodBindings.setCustomViewportPtr, NIL)
  }

  public final fun getCustomViewport(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCustomViewportPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Node?)
  }

  public final fun setPositionSmoothingSpeed(positionSmoothingSpeed: Float): Unit {
    TransferContext.writeArguments(DOUBLE to positionSmoothingSpeed.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPositionSmoothingSpeedPtr, NIL)
  }

  public final fun getPositionSmoothingSpeed(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPositionSmoothingSpeedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPositionSmoothingEnabled(positionSmoothingSpeed: Boolean): Unit {
    TransferContext.writeArguments(BOOL to positionSmoothingSpeed)
    TransferContext.callMethod(ptr, MethodBindings.setPositionSmoothingEnabledPtr, NIL)
  }

  public final fun isPositionSmoothingEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPositionSmoothingEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setRotationSmoothingEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setRotationSmoothingEnabledPtr, NIL)
  }

  public final fun isRotationSmoothingEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isRotationSmoothingEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setRotationSmoothingSpeed(speed: Float): Unit {
    TransferContext.writeArguments(DOUBLE to speed.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRotationSmoothingSpeedPtr, NIL)
  }

  public final fun getRotationSmoothingSpeed(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRotationSmoothingSpeedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Forces the camera to update scroll immediately.
   */
  public final fun forceUpdateScroll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.forceUpdateScrollPtr, NIL)
  }

  /**
   * Sets the camera's position immediately to its current smoothing destination.
   * This method has no effect if [positionSmoothingEnabled] is `false`.
   */
  public final fun resetSmoothing(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.resetSmoothingPtr, NIL)
  }

  /**
   * Aligns the camera to the tracked node.
   */
  public final fun align(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.alignPtr, NIL)
  }

  public final fun setScreenDrawingEnabled(screenDrawingEnabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to screenDrawingEnabled)
    TransferContext.callMethod(ptr, MethodBindings.setScreenDrawingEnabledPtr, NIL)
  }

  public final fun isScreenDrawingEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isScreenDrawingEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setLimitDrawingEnabled(limitDrawingEnabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to limitDrawingEnabled)
    TransferContext.callMethod(ptr, MethodBindings.setLimitDrawingEnabledPtr, NIL)
  }

  public final fun isLimitDrawingEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isLimitDrawingEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMarginDrawingEnabled(marginDrawingEnabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to marginDrawingEnabled)
    TransferContext.callMethod(ptr, MethodBindings.setMarginDrawingEnabledPtr, NIL)
  }

  public final fun isMarginDrawingEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isMarginDrawingEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
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

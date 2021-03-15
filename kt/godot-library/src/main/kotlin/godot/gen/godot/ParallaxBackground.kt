// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * A node used to create a parallax scrolling background.
 *
 * A ParallaxBackground uses one or more [godot.ParallaxLayer] child nodes to create a parallax effect. Each [godot.ParallaxLayer] can move at a different speed using [godot.ParallaxLayer.motionOffset]. This creates an illusion of depth in a 2D game. If not used with a [godot.Camera2D], you must manually calculate the [scrollOffset].
 */
@GodotBaseType
open class ParallaxBackground : CanvasLayer() {
  /**
   * The base position offset for all [godot.ParallaxLayer] children.
   */
  open var scrollBaseOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_GET_SCROLL_BASE_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_SET_SCROLL_BASE_OFFSET, NIL)
    }

  /**
   * The base motion scale for all [godot.ParallaxLayer] children.
   */
  open var scrollBaseScale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_GET_SCROLL_BASE_SCALE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_SET_SCROLL_BASE_SCALE, NIL)
    }

  /**
   * If `true`, elements in [godot.ParallaxLayer] child aren't affected by the zoom level of the camera.
   */
  open var scrollIgnoreCameraZoom: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_GET_SCROLL_IGNORE_CAMERA_ZOOM, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_SET_SCROLL_IGNORE_CAMERA_ZOOM, NIL)
    }

  /**
   * Top-left limits for scrolling to begin. If the camera is outside of this limit, the background will stop scrolling. Must be lower than [scrollLimitEnd] to work.
   */
  open var scrollLimitBegin: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_GET_SCROLL_LIMIT_BEGIN, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_SET_SCROLL_LIMIT_BEGIN, NIL)
    }

  /**
   * Bottom-right limits for scrolling to end. If the camera is outside of this limit, the background will stop scrolling. Must be higher than [scrollLimitBegin] to work.
   */
  open var scrollLimitEnd: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_GET_SCROLL_LIMIT_END, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_SET_SCROLL_LIMIT_END, NIL)
    }

  /**
   * The ParallaxBackground's scroll value. Calculated automatically when using a [godot.Camera2D], but can be used to manually manage scrolling when no camera is present.
   */
  open var scrollOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_GET_SCROLL_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_SET_SCROLL_OFFSET, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_PARALLAXBACKGROUND,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun scrollBaseOffset(schedule: Vector2.() -> Unit): Vector2 = scrollBaseOffset.apply{
      schedule(this)
      scrollBaseOffset = this
  }


  open fun scrollBaseScale(schedule: Vector2.() -> Unit): Vector2 = scrollBaseScale.apply{
      schedule(this)
      scrollBaseScale = this
  }


  open fun scrollLimitBegin(schedule: Vector2.() -> Unit): Vector2 = scrollLimitBegin.apply{
      schedule(this)
      scrollLimitBegin = this
  }


  open fun scrollLimitEnd(schedule: Vector2.() -> Unit): Vector2 = scrollLimitEnd.apply{
      schedule(this)
      scrollLimitEnd = this
  }


  open fun scrollOffset(schedule: Vector2.() -> Unit): Vector2 = scrollOffset.apply{
      schedule(this)
      scrollOffset = this
  }


  open fun _cameraMoved(arg0: Transform2D, arg1: Vector2) {
  }
}

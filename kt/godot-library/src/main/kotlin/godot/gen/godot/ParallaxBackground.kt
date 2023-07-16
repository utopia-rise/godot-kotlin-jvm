// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * A node used to create a parallax scrolling background.
 *
 * A ParallaxBackground uses one or more [godot.ParallaxLayer] child nodes to create a parallax effect. Each [godot.ParallaxLayer] can move at a different speed using [godot.ParallaxLayer.motionOffset]. This creates an illusion of depth in a 2D game. If not used with a [godot.Camera2D], you must manually calculate the [scrollOffset].
 *
 * **Note:** Each [godot.ParallaxBackground] is drawn on one specific [godot.Viewport] and cannot be shared between multiple [godot.Viewport]s, see [godot.CanvasLayer.customViewport]. When using multiple [godot.Viewport]s, for example in a split-screen game, you need create an individual [godot.ParallaxBackground] for each [godot.Viewport] you want it to be drawn on.
 */
@GodotBaseType
public open class ParallaxBackground : CanvasLayer() {
  /**
   * The ParallaxBackground's scroll value. Calculated automatically when using a [godot.Camera2D], but can be used to manually manage scrolling when no camera is present.
   */
  public var scrollOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_GET_SCROLL_OFFSET, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_SET_SCROLL_OFFSET, NIL)
    }

  /**
   * The base position offset for all [godot.ParallaxLayer] children.
   */
  public var scrollBaseOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_GET_SCROLL_BASE_OFFSET, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_SET_SCROLL_BASE_OFFSET, NIL)
    }

  /**
   * The base motion scale for all [godot.ParallaxLayer] children.
   */
  public var scrollBaseScale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_GET_SCROLL_BASE_SCALE, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_SET_SCROLL_BASE_SCALE, NIL)
    }

  /**
   * Top-left limits for scrolling to begin. If the camera is outside of this limit, the background will stop scrolling. Must be lower than [scrollLimitEnd] to work.
   */
  public var scrollLimitBegin: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_GET_LIMIT_BEGIN, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_SET_LIMIT_BEGIN, NIL)
    }

  /**
   * Bottom-right limits for scrolling to end. If the camera is outside of this limit, the background will stop scrolling. Must be higher than [scrollLimitBegin] to work.
   */
  public var scrollLimitEnd: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_GET_LIMIT_END,
          VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_SET_LIMIT_END,
          NIL)
    }

  /**
   * If `true`, elements in [godot.ParallaxLayer] child aren't affected by the zoom level of the camera.
   */
  public var scrollIgnoreCameraZoom: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_IS_IGNORE_CAMERA_ZOOM, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PARALLAXBACKGROUND_SET_IGNORE_CAMERA_ZOOM, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PARALLAXBACKGROUND, scriptIndex)
    return true
  }

  public companion object
}

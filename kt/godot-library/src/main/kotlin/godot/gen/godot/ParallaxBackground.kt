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
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A ParallaxBackground uses one or more [ParallaxLayer] child nodes to create a parallax effect.
 * Each [ParallaxLayer] can move at a different speed using [ParallaxLayer.motionOffset]. This creates
 * an illusion of depth in a 2D game. If not used with a [Camera2D], you must manually calculate the
 * [scrollOffset].
 * **Note:** Each [ParallaxBackground] is drawn on one specific [Viewport] and cannot be shared
 * between multiple [Viewport]s, see [CanvasLayer.customViewport]. When using multiple [Viewport]s, for
 * example in a split-screen game, you need create an individual [ParallaxBackground] for each
 * [Viewport] you want it to be drawn on.
 */
@GodotBaseType
public open class ParallaxBackground : CanvasLayer() {
  /**
   * The ParallaxBackground's scroll value. Calculated automatically when using a [Camera2D], but
   * can be used to manually manage scrolling when no camera is present.
   */
  @CoreTypeLocalCopy
  public var scrollOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScrollOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScrollOffsetPtr, NIL)
    }

  /**
   * The base position offset for all [ParallaxLayer] children.
   */
  @CoreTypeLocalCopy
  public var scrollBaseOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScrollBaseOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScrollBaseOffsetPtr, NIL)
    }

  /**
   * The base motion scale for all [ParallaxLayer] children.
   */
  @CoreTypeLocalCopy
  public var scrollBaseScale: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getScrollBaseScalePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScrollBaseScalePtr, NIL)
    }

  /**
   * Top-left limits for scrolling to begin. If the camera is outside of this limit, the background
   * will stop scrolling. Must be lower than [scrollLimitEnd] to work.
   */
  @CoreTypeLocalCopy
  public var scrollLimitBegin: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLimitBeginPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLimitBeginPtr, NIL)
    }

  /**
   * Bottom-right limits for scrolling to end. If the camera is outside of this limit, the
   * background will stop scrolling. Must be higher than [scrollLimitBegin] to work.
   */
  @CoreTypeLocalCopy
  public var scrollLimitEnd: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLimitEndPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLimitEndPtr, NIL)
    }

  /**
   * If `true`, elements in [ParallaxLayer] child aren't affected by the zoom level of the camera.
   */
  public var scrollIgnoreCameraZoom: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isIgnoreCameraZoomPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIgnoreCameraZoomPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PARALLAXBACKGROUND, scriptIndex)
  }

  /**
   * The ParallaxBackground's scroll value. Calculated automatically when using a [Camera2D], but
   * can be used to manually manage scrolling when no camera is present.
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
   * val myCoreType = parallaxbackground.scrollOffset
   * //Your changes
   * parallaxbackground.scrollOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun scrollOffsetMutate(block: Vector2.() -> Unit): Vector2 = scrollOffset.apply{
      block(this)
      scrollOffset = this
  }


  /**
   * The base position offset for all [ParallaxLayer] children.
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
   * val myCoreType = parallaxbackground.scrollBaseOffset
   * //Your changes
   * parallaxbackground.scrollBaseOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun scrollBaseOffsetMutate(block: Vector2.() -> Unit): Vector2 =
      scrollBaseOffset.apply{
      block(this)
      scrollBaseOffset = this
  }


  /**
   * The base motion scale for all [ParallaxLayer] children.
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
   * val myCoreType = parallaxbackground.scrollBaseScale
   * //Your changes
   * parallaxbackground.scrollBaseScale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun scrollBaseScaleMutate(block: Vector2.() -> Unit): Vector2 = scrollBaseScale.apply{
      block(this)
      scrollBaseScale = this
  }


  /**
   * Top-left limits for scrolling to begin. If the camera is outside of this limit, the background
   * will stop scrolling. Must be lower than [scrollLimitEnd] to work.
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
   * val myCoreType = parallaxbackground.scrollLimitBegin
   * //Your changes
   * parallaxbackground.scrollLimitBegin = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun scrollLimitBeginMutate(block: Vector2.() -> Unit): Vector2 =
      scrollLimitBegin.apply{
      block(this)
      scrollLimitBegin = this
  }


  /**
   * Bottom-right limits for scrolling to end. If the camera is outside of this limit, the
   * background will stop scrolling. Must be higher than [scrollLimitBegin] to work.
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
   * val myCoreType = parallaxbackground.scrollLimitEnd
   * //Your changes
   * parallaxbackground.scrollLimitEnd = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun scrollLimitEndMutate(block: Vector2.() -> Unit): Vector2 = scrollLimitEnd.apply{
      block(this)
      scrollLimitEnd = this
  }


  public companion object

  internal object MethodBindings {
    public val setScrollOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxBackground", "set_scroll_offset", 743155724)

    public val getScrollOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxBackground", "get_scroll_offset", 3341600327)

    public val setScrollBaseOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxBackground", "set_scroll_base_offset", 743155724)

    public val getScrollBaseOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxBackground", "get_scroll_base_offset", 3341600327)

    public val setScrollBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxBackground", "set_scroll_base_scale", 743155724)

    public val getScrollBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxBackground", "get_scroll_base_scale", 3341600327)

    public val setLimitBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxBackground", "set_limit_begin", 743155724)

    public val getLimitBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxBackground", "get_limit_begin", 3341600327)

    public val setLimitEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxBackground", "set_limit_end", 743155724)

    public val getLimitEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxBackground", "get_limit_end", 3341600327)

    public val setIgnoreCameraZoomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxBackground", "set_ignore_camera_zoom", 2586408642)

    public val isIgnoreCameraZoomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ParallaxBackground", "is_ignore_camera_zoom", 2240911060)
  }
}

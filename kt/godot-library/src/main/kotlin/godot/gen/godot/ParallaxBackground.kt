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
import kotlin.jvm.JvmName

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
  public final inline var scrollOffset: Vector2
    @JvmName("scrollOffsetProperty")
    get() = getScrollOffset()
    @JvmName("scrollOffsetProperty")
    set(`value`) {
      setScrollOffset(value)
    }

  /**
   * The base position offset for all [ParallaxLayer] children.
   */
  @CoreTypeLocalCopy
  public final inline var scrollBaseOffset: Vector2
    @JvmName("scrollBaseOffsetProperty")
    get() = getScrollBaseOffset()
    @JvmName("scrollBaseOffsetProperty")
    set(`value`) {
      setScrollBaseOffset(value)
    }

  /**
   * The base motion scale for all [ParallaxLayer] children.
   */
  @CoreTypeLocalCopy
  public final inline var scrollBaseScale: Vector2
    @JvmName("scrollBaseScaleProperty")
    get() = getScrollBaseScale()
    @JvmName("scrollBaseScaleProperty")
    set(`value`) {
      setScrollBaseScale(value)
    }

  /**
   * Top-left limits for scrolling to begin. If the camera is outside of this limit, the background
   * will stop scrolling. Must be lower than [scrollLimitEnd] to work.
   */
  @CoreTypeLocalCopy
  public final inline var scrollLimitBegin: Vector2
    @JvmName("scrollLimitBeginProperty")
    get() = getLimitBegin()
    @JvmName("scrollLimitBeginProperty")
    set(`value`) {
      setLimitBegin(value)
    }

  /**
   * Bottom-right limits for scrolling to end. If the camera is outside of this limit, the
   * background will stop scrolling. Must be higher than [scrollLimitBegin] to work.
   */
  @CoreTypeLocalCopy
  public final inline var scrollLimitEnd: Vector2
    @JvmName("scrollLimitEndProperty")
    get() = getLimitEnd()
    @JvmName("scrollLimitEndProperty")
    set(`value`) {
      setLimitEnd(value)
    }

  /**
   * If `true`, elements in [ParallaxLayer] child aren't affected by the zoom level of the camera.
   */
  public final inline var scrollIgnoreCameraZoom: Boolean
    @JvmName("scrollIgnoreCameraZoomProperty")
    get() = isIgnoreCameraZoom()
    @JvmName("scrollIgnoreCameraZoomProperty")
    set(`value`) {
      setIgnoreCameraZoom(value)
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
  public final fun scrollOffsetMutate(block: Vector2.() -> Unit): Vector2 = scrollOffset.apply{
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
  public final fun scrollBaseOffsetMutate(block: Vector2.() -> Unit): Vector2 =
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
  public final fun scrollBaseScaleMutate(block: Vector2.() -> Unit): Vector2 =
      scrollBaseScale.apply{
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
  public final fun scrollLimitBeginMutate(block: Vector2.() -> Unit): Vector2 =
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
  public final fun scrollLimitEndMutate(block: Vector2.() -> Unit): Vector2 = scrollLimitEnd.apply{
      block(this)
      scrollLimitEnd = this
  }


  public final fun setScrollOffset(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.setScrollOffsetPtr, NIL)
  }

  public final fun getScrollOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScrollOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setScrollBaseOffset(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.setScrollBaseOffsetPtr, NIL)
  }

  public final fun getScrollBaseOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScrollBaseOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setScrollBaseScale(scale: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to scale)
    TransferContext.callMethod(rawPtr, MethodBindings.setScrollBaseScalePtr, NIL)
  }

  public final fun getScrollBaseScale(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScrollBaseScalePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setLimitBegin(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.setLimitBeginPtr, NIL)
  }

  public final fun getLimitBegin(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLimitBeginPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setLimitEnd(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.setLimitEndPtr, NIL)
  }

  public final fun getLimitEnd(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLimitEndPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setIgnoreCameraZoom(ignore: Boolean): Unit {
    TransferContext.writeArguments(BOOL to ignore)
    TransferContext.callMethod(rawPtr, MethodBindings.setIgnoreCameraZoomPtr, NIL)
  }

  public final fun isIgnoreCameraZoom(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isIgnoreCameraZoomPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
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

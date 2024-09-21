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
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A [Parallax2D] is used to create a parallax effect. It can move at a different speed relative to
 * the camera movement using [scrollScale]. This creates an illusion of depth in a 2D game. If manual
 * scrolling is desired, the [Camera2D] position can be ignored with [ignoreCameraScroll].
 * **Note:** Any changes to this node's position made after it enters the scene tree will be
 * overridden if [ignoreCameraScroll] is `false` or [screenOffset] is modified.
 */
@GodotBaseType
public open class Parallax2D : Node2D() {
  /**
   * Multiplier to the final [Parallax2D]'s offset. Can be used to simulate distance from the
   * camera.
   * For example, a value of `1` scrolls at the same speed as the camera. A value greater than `1`
   * scrolls faster, making objects appear closer. Less than `1` scrolls slower, making objects appear
   * further, and a value of `0` stops the objects completely.
   */
  @CoreTypeLocalCopy
  public final inline var scrollScale: Vector2
    @JvmName("scrollScaleProperty")
    get() = getScrollScale()
    @JvmName("scrollScaleProperty")
    set(`value`) {
      setScrollScale(value)
    }

  /**
   * The [Parallax2D]'s offset. Similar to [screenOffset] and [Node2D.position], but will not be
   * overridden.
   * **Note:** Values will loop if [repeatSize] is set higher than `0`.
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
   * Repeats the [Texture2D] of each of this node's children and offsets them by this value. When
   * scrolling, the node's position loops, giving the illusion of an infinite scrolling background if
   * the values are larger than the screen size. If an axis is set to `0`, the [Texture2D] will not be
   * repeated.
   */
  @CoreTypeLocalCopy
  public final inline var repeatSize: Vector2
    @JvmName("repeatSizeProperty")
    get() = getRepeatSize()
    @JvmName("repeatSizeProperty")
    set(`value`) {
      setRepeatSize(value)
    }

  /**
   * Velocity at which the offset scrolls automatically, in pixels per second.
   */
  @CoreTypeLocalCopy
  public final inline var autoscroll: Vector2
    @JvmName("autoscrollProperty")
    get() = getAutoscroll()
    @JvmName("autoscrollProperty")
    set(`value`) {
      setAutoscroll(value)
    }

  /**
   * Overrides the amount of times the texture repeats. Each texture copy spreads evenly from the
   * original by [repeatSize]. Useful for when zooming out with a camera.
   */
  public final inline var repeatTimes: Int
    @JvmName("repeatTimesProperty")
    get() = getRepeatTimes()
    @JvmName("repeatTimesProperty")
    set(`value`) {
      setRepeatTimes(value)
    }

  /**
   * Top-left limits for scrolling to begin. If the camera is outside of this limit, the
   * [Parallax2D] stops scrolling. Must be lower than [limitEnd] minus the viewport size to work.
   */
  @CoreTypeLocalCopy
  public final inline var limitBegin: Vector2
    @JvmName("limitBeginProperty")
    get() = getLimitBegin()
    @JvmName("limitBeginProperty")
    set(`value`) {
      setLimitBegin(value)
    }

  /**
   * Bottom-right limits for scrolling to end. If the camera is outside of this limit, the
   * [Parallax2D] will stop scrolling. Must be higher than [limitBegin] and the viewport size combined
   * to work.
   */
  @CoreTypeLocalCopy
  public final inline var limitEnd: Vector2
    @JvmName("limitEndProperty")
    get() = getLimitEnd()
    @JvmName("limitEndProperty")
    set(`value`) {
      setLimitEnd(value)
    }

  /**
   * If `true`, this [Parallax2D] is offset by the current camera's position. If the [Parallax2D] is
   * in a [CanvasLayer] separate from the current camera, it may be desired to match the value with
   * [CanvasLayer.followViewportEnabled].
   */
  public final inline var followViewport: Boolean
    @JvmName("followViewportProperty")
    get() = getFollowViewport()
    @JvmName("followViewportProperty")
    set(`value`) {
      setFollowViewport(value)
    }

  /**
   * If `true`, [Parallax2D]'s position is not affected by the position of the camera.
   */
  public final inline var ignoreCameraScroll: Boolean
    @JvmName("ignoreCameraScrollProperty")
    get() = isIgnoreCameraScroll()
    @JvmName("ignoreCameraScrollProperty")
    set(`value`) {
      setIgnoreCameraScroll(value)
    }

  /**
   * Offset used to scroll this [Parallax2D]. This value is updated automatically unless
   * [ignoreCameraScroll] is `true`.
   */
  @CoreTypeLocalCopy
  public final inline var screenOffset: Vector2
    @JvmName("screenOffsetProperty")
    get() = getScreenOffset()
    @JvmName("screenOffsetProperty")
    set(`value`) {
      setScreenOffset(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PARALLAX2D, scriptIndex)
  }

  /**
   * Multiplier to the final [Parallax2D]'s offset. Can be used to simulate distance from the
   * camera.
   * For example, a value of `1` scrolls at the same speed as the camera. A value greater than `1`
   * scrolls faster, making objects appear closer. Less than `1` scrolls slower, making objects appear
   * further, and a value of `0` stops the objects completely.
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
   * val myCoreType = parallax2d.scrollScale
   * //Your changes
   * parallax2d.scrollScale = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun scrollScaleMutate(block: Vector2.() -> Unit): Vector2 = scrollScale.apply{
      block(this)
      scrollScale = this
  }


  /**
   * The [Parallax2D]'s offset. Similar to [screenOffset] and [Node2D.position], but will not be
   * overridden.
   * **Note:** Values will loop if [repeatSize] is set higher than `0`.
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
   * val myCoreType = parallax2d.scrollOffset
   * //Your changes
   * parallax2d.scrollOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun scrollOffsetMutate(block: Vector2.() -> Unit): Vector2 = scrollOffset.apply{
      block(this)
      scrollOffset = this
  }


  /**
   * Repeats the [Texture2D] of each of this node's children and offsets them by this value. When
   * scrolling, the node's position loops, giving the illusion of an infinite scrolling background if
   * the values are larger than the screen size. If an axis is set to `0`, the [Texture2D] will not be
   * repeated.
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
   * val myCoreType = parallax2d.repeatSize
   * //Your changes
   * parallax2d.repeatSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun repeatSizeMutate(block: Vector2.() -> Unit): Vector2 = repeatSize.apply{
      block(this)
      repeatSize = this
  }


  /**
   * Velocity at which the offset scrolls automatically, in pixels per second.
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
   * val myCoreType = parallax2d.autoscroll
   * //Your changes
   * parallax2d.autoscroll = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun autoscrollMutate(block: Vector2.() -> Unit): Vector2 = autoscroll.apply{
      block(this)
      autoscroll = this
  }


  /**
   * Top-left limits for scrolling to begin. If the camera is outside of this limit, the
   * [Parallax2D] stops scrolling. Must be lower than [limitEnd] minus the viewport size to work.
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
   * val myCoreType = parallax2d.limitBegin
   * //Your changes
   * parallax2d.limitBegin = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun limitBeginMutate(block: Vector2.() -> Unit): Vector2 = limitBegin.apply{
      block(this)
      limitBegin = this
  }


  /**
   * Bottom-right limits for scrolling to end. If the camera is outside of this limit, the
   * [Parallax2D] will stop scrolling. Must be higher than [limitBegin] and the viewport size combined
   * to work.
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
   * val myCoreType = parallax2d.limitEnd
   * //Your changes
   * parallax2d.limitEnd = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun limitEndMutate(block: Vector2.() -> Unit): Vector2 = limitEnd.apply{
      block(this)
      limitEnd = this
  }


  /**
   * Offset used to scroll this [Parallax2D]. This value is updated automatically unless
   * [ignoreCameraScroll] is `true`.
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
   * val myCoreType = parallax2d.screenOffset
   * //Your changes
   * parallax2d.screenOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun screenOffsetMutate(block: Vector2.() -> Unit): Vector2 = screenOffset.apply{
      block(this)
      screenOffset = this
  }


  public final fun setScrollScale(scale: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to scale)
    TransferContext.callMethod(rawPtr, MethodBindings.setScrollScalePtr, NIL)
  }

  public final fun getScrollScale(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScrollScalePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setRepeatSize(repeatSize: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to repeatSize)
    TransferContext.callMethod(rawPtr, MethodBindings.setRepeatSizePtr, NIL)
  }

  public final fun getRepeatSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRepeatSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setRepeatTimes(repeatTimes: Int): Unit {
    TransferContext.writeArguments(LONG to repeatTimes.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setRepeatTimesPtr, NIL)
  }

  public final fun getRepeatTimes(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRepeatTimesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setAutoscroll(autoscroll: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to autoscroll)
    TransferContext.callMethod(rawPtr, MethodBindings.setAutoscrollPtr, NIL)
  }

  public final fun getAutoscroll(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAutoscrollPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
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

  public final fun setScreenOffset(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.setScreenOffsetPtr, NIL)
  }

  public final fun getScreenOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getScreenOffsetPtr, VECTOR2)
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

  public final fun setFollowViewport(follow: Boolean): Unit {
    TransferContext.writeArguments(BOOL to follow)
    TransferContext.callMethod(rawPtr, MethodBindings.setFollowViewportPtr, NIL)
  }

  public final fun getFollowViewport(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFollowViewportPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setIgnoreCameraScroll(ignore: Boolean): Unit {
    TransferContext.writeArguments(BOOL to ignore)
    TransferContext.callMethod(rawPtr, MethodBindings.setIgnoreCameraScrollPtr, NIL)
  }

  public final fun isIgnoreCameraScroll(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isIgnoreCameraScrollPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setScrollScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Parallax2D", "set_scroll_scale", 743155724)

    public val getScrollScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Parallax2D", "get_scroll_scale", 3341600327)

    public val setRepeatSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Parallax2D", "set_repeat_size", 743155724)

    public val getRepeatSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Parallax2D", "get_repeat_size", 3341600327)

    public val setRepeatTimesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Parallax2D", "set_repeat_times", 1286410249)

    public val getRepeatTimesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Parallax2D", "get_repeat_times", 3905245786)

    public val setAutoscrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Parallax2D", "set_autoscroll", 743155724)

    public val getAutoscrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Parallax2D", "get_autoscroll", 3341600327)

    public val setScrollOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Parallax2D", "set_scroll_offset", 743155724)

    public val getScrollOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Parallax2D", "get_scroll_offset", 3341600327)

    public val setScreenOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Parallax2D", "set_screen_offset", 743155724)

    public val getScreenOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Parallax2D", "get_screen_offset", 3341600327)

    public val setLimitBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Parallax2D", "set_limit_begin", 743155724)

    public val getLimitBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Parallax2D", "get_limit_begin", 3341600327)

    public val setLimitEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Parallax2D", "set_limit_end", 743155724)

    public val getLimitEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Parallax2D", "get_limit_end", 3341600327)

    public val setFollowViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Parallax2D", "set_follow_viewport", 2586408642)

    public val getFollowViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Parallax2D", "get_follow_viewport", 2240911060)

    public val setIgnoreCameraScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Parallax2D", "set_ignore_camera_scroll", 2586408642)

    public val isIgnoreCameraScrollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Parallax2D", "is_ignore_camera_scroll", 2240911060)
  }
}

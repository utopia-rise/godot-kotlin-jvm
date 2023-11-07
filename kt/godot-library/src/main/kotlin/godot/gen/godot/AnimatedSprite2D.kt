// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * [AnimatedSprite2D] is similar to the [Sprite2D] node, except it carries multiple textures as
 * animation frames. Animations are created using a [SpriteFrames] resource, which allows you to import
 * image files (or a folder containing said files) to provide the animation frames for the sprite. The
 * [SpriteFrames] resource can be configured in the editor via the SpriteFrames bottom panel.
 */
@GodotBaseType
public open class AnimatedSprite2D : Node2D() {
  /**
   * Emitted when [spriteFrames] changes.
   */
  public val spriteFramesChanged: Signal0 by signal()

  /**
   * Emitted when [animation] changes.
   */
  public val animationChanged: Signal0 by signal()

  /**
   * Emitted when [frame] changes.
   */
  public val frameChanged: Signal0 by signal()

  /**
   * Emitted when the animation loops.
   */
  public val animationLooped: Signal0 by signal()

  /**
   * Emitted when the animation reaches the end, or the start if it is played in reverse. When the
   * animation finishes, it pauses the playback.
   */
  public val animationFinished: Signal0 by signal()

  /**
   * The [SpriteFrames] resource containing the animation(s). Allows you the option to load, edit,
   * clear, make unique and save the states of the [SpriteFrames] resource.
   */
  public var spriteFrames: SpriteFrames?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpriteFramesPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as SpriteFrames?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSpriteFramesPtr, NIL)
    }

  /**
   * The current animation from the [spriteFrames] resource. If this value is changed, the [frame]
   * counter and the [frameProgress] are reset.
   */
  public var animation: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAnimationPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAnimationPtr, NIL)
    }

  /**
   * The key of the animation to play when the scene loads.
   */
  public var autoplay: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoplayPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoplayPtr, NIL)
    }

  /**
   * The displayed animation frame's index. Setting this property also resets [frameProgress]. If
   * this is not desired, use [setFrameAndProgress].
   */
  public var frame: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFramePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFramePtr, NIL)
    }

  /**
   * The progress value between `0.0` and `1.0` until the current frame transitions to the next
   * frame. If the animation is playing backwards, the value transitions from `1.0` to `0.0`.
   */
  public var frameProgress: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrameProgressPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFrameProgressPtr, NIL)
    }

  /**
   * The speed scaling ratio. For example, if this value is `1`, then the animation plays at normal
   * speed. If it's `0.5`, then it plays at half speed. If it's `2`, then it plays at double speed.
   * If set to a negative value, the animation is played in reverse. If set to `0`, the animation
   * will not advance.
   */
  public var speedScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpeedScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSpeedScalePtr, NIL)
    }

  /**
   * If `true`, texture will be centered.
   */
  public var centered: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCenteredPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCenteredPtr, NIL)
    }

  /**
   * The texture's drawing offset.
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
   * If `true`, texture is flipped horizontally.
   */
  public var flipH: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFlippedHPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlipHPtr, NIL)
    }

  /**
   * If `true`, texture is flipped vertically.
   */
  public var flipV: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFlippedVPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlipVPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATEDSPRITE2D, scriptIndex)
    return true
  }

  /**
   * The texture's drawing offset.
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
   * val myCoreType = animatedsprite2d.offset
   * //Your changes
   * animatedsprite2d.offset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
      block(this)
      offset = this
  }


  /**
   * Returns `true` if an animation is currently playing (even if [speedScale] and/or `custom_speed`
   * are `0`).
   */
  public fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPlayingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Plays the animation with key [param name]. If [param custom_speed] is negative and [param
   * from_end] is `true`, the animation will play backwards (which is equivalent to calling
   * [playBackwards]).
   * If this method is called with that same animation [param name], or with no [param name]
   * parameter, the assigned animation will resume playing if it was paused.
   */
  @JvmOverloads
  public fun play(
    name: StringName = StringName(""),
    customSpeed: Float = 1.0f,
    fromEnd: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, DOUBLE to customSpeed.toDouble(), BOOL to fromEnd)
    TransferContext.callMethod(rawPtr, MethodBindings.playPtr, NIL)
  }

  /**
   * Plays the animation with key [param name] in reverse.
   * This method is a shorthand for [play] with `custom_speed = -1.0` and `from_end = true`, so see
   * its description for more information.
   */
  @JvmOverloads
  public fun playBackwards(name: StringName = StringName("")): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.playBackwardsPtr, NIL)
  }

  /**
   * Pauses the currently playing animation. The [frame] and [frameProgress] will be kept and
   * calling [play] or [playBackwards] without arguments will resume the animation from the current
   * playback position.
   * See also [stop].
   */
  public fun pause(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pausePtr, NIL)
  }

  /**
   * Stops the currently playing animation. The animation position is reset to `0` and the
   * `custom_speed` is reset to `1.0`. See also [pause].
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  /**
   * The setter of [frame] resets the [frameProgress] to `0.0` implicitly, but this method avoids
   * that.
   * This is useful when you want to carry over the current [frameProgress] to another [frame].
   * **Example:**
   *
   * gdscript:
   * ```gdscript
   * # Change the animation with keeping the frame index and progress.
   * var current_frame = animated_sprite.get_frame()
   * var current_progress = animated_sprite.get_frame_progress()
   * animated_sprite.play("walk_another_skin")
   * animated_sprite.set_frame_and_progress(current_frame, current_progress)
   * ```
   */
  public fun setFrameAndProgress(frame: Int, progress: Float): Unit {
    TransferContext.writeArguments(LONG to frame.toLong(), DOUBLE to progress.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setFrameAndProgressPtr, NIL)
  }

  /**
   * Returns the actual playing speed of current animation or `0` if not playing. This speed is the
   * [speedScale] property multiplied by `custom_speed` argument specified when calling the [play]
   * method.
   * Returns a negative value if the current animation is playing backwards.
   */
  public fun getPlayingSpeed(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlayingSpeedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setSpriteFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite2D", "set_sprite_frames")

    public val getSpriteFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite2D", "get_sprite_frames")

    public val setAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite2D", "set_animation")

    public val getAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite2D", "get_animation")

    public val setAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite2D", "set_autoplay")

    public val getAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite2D", "get_autoplay")

    public val isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite2D", "is_playing")

    public val playPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimatedSprite2D", "play")

    public val playBackwardsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite2D", "play_backwards")

    public val pausePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimatedSprite2D", "pause")

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimatedSprite2D", "stop")

    public val setCenteredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite2D", "set_centered")

    public val isCenteredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite2D", "is_centered")

    public val setOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite2D", "set_offset")

    public val getOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite2D", "get_offset")

    public val setFlipHPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimatedSprite2D", "set_flip_h")

    public val isFlippedHPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite2D", "is_flipped_h")

    public val setFlipVPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimatedSprite2D", "set_flip_v")

    public val isFlippedVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite2D", "is_flipped_v")

    public val setFramePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimatedSprite2D", "set_frame")

    public val getFramePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimatedSprite2D", "get_frame")

    public val setFrameProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite2D", "set_frame_progress")

    public val getFrameProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite2D", "get_frame_progress")

    public val setFrameAndProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite2D", "set_frame_and_progress")

    public val setSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite2D", "set_speed_scale")

    public val getSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite2D", "get_speed_scale")

    public val getPlayingSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite2D", "get_playing_speed")
  }
}

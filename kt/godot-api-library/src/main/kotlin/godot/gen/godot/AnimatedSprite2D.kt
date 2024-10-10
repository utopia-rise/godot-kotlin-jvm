// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Signal0
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_ANIMATEDSPRITE2D_INDEX: Int = 45

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
  public val spriteFramesChanged: Signal0 by Signal0

  /**
   * Emitted when [animation] changes.
   */
  public val animationChanged: Signal0 by Signal0

  /**
   * Emitted when [frame] changes.
   */
  public val frameChanged: Signal0 by Signal0

  /**
   * Emitted when the animation loops.
   */
  public val animationLooped: Signal0 by Signal0

  /**
   * Emitted when the animation reaches the end, or the start if it is played in reverse. When the
   * animation finishes, it pauses the playback.
   * **Note:** This signal is not emitted if an animation is looping.
   */
  public val animationFinished: Signal0 by Signal0

  /**
   * The [SpriteFrames] resource containing the animation(s). Allows you the option to load, edit,
   * clear, make unique and save the states of the [SpriteFrames] resource.
   */
  public final inline var spriteFrames: SpriteFrames?
    @JvmName("spriteFramesProperty")
    get() = getSpriteFrames()
    @JvmName("spriteFramesProperty")
    set(`value`) {
      setSpriteFrames(value)
    }

  /**
   * The current animation from the [spriteFrames] resource. If this value is changed, the [frame]
   * counter and the [frameProgress] are reset.
   */
  public final inline var animation: StringName
    @JvmName("animationProperty")
    get() = getAnimation()
    @JvmName("animationProperty")
    set(`value`) {
      setAnimation(value)
    }

  /**
   * The key of the animation to play when the scene loads.
   */
  public final inline var autoplay: String
    @JvmName("autoplayProperty")
    get() = getAutoplay()
    @JvmName("autoplayProperty")
    set(`value`) {
      setAutoplay(value)
    }

  /**
   * The displayed animation frame's index. Setting this property also resets [frameProgress]. If
   * this is not desired, use [setFrameAndProgress].
   */
  public final inline var frame: Int
    @JvmName("frameProperty")
    get() = getFrame()
    @JvmName("frameProperty")
    set(`value`) {
      setFrame(value)
    }

  /**
   * The progress value between `0.0` and `1.0` until the current frame transitions to the next
   * frame. If the animation is playing backwards, the value transitions from `1.0` to `0.0`.
   */
  public final inline var frameProgress: Float
    @JvmName("frameProgressProperty")
    get() = getFrameProgress()
    @JvmName("frameProgressProperty")
    set(`value`) {
      setFrameProgress(value)
    }

  /**
   * The speed scaling ratio. For example, if this value is `1`, then the animation plays at normal
   * speed. If it's `0.5`, then it plays at half speed. If it's `2`, then it plays at double speed.
   * If set to a negative value, the animation is played in reverse. If set to `0`, the animation
   * will not advance.
   */
  public final inline var speedScale: Float
    @JvmName("speedScaleProperty")
    get() = getSpeedScale()
    @JvmName("speedScaleProperty")
    set(`value`) {
      setSpeedScale(value)
    }

  /**
   * If `true`, texture will be centered.
   * **Note:** For games with a pixel art aesthetic, textures may appear deformed when centered.
   * This is caused by their position being between pixels. To prevent this, set this property to
   * `false`, or consider enabling [ProjectSettings.rendering/2d/snap/snap2dVerticesToPixel] and
   * [ProjectSettings.rendering/2d/snap/snap2dTransformsToPixel].
   */
  public final inline var centered: Boolean
    @JvmName("centeredProperty")
    get() = isCentered()
    @JvmName("centeredProperty")
    set(`value`) {
      setCentered(value)
    }

  /**
   * The texture's drawing offset.
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
   * If `true`, texture is flipped horizontally.
   */
  public final inline var flipH: Boolean
    @JvmName("flipHProperty")
    get() = isFlippedH()
    @JvmName("flipHProperty")
    set(`value`) {
      setFlipH(value)
    }

  /**
   * If `true`, texture is flipped vertically.
   */
  public final inline var flipV: Boolean
    @JvmName("flipVProperty")
    get() = isFlippedV()
    @JvmName("flipVProperty")
    set(`value`) {
      setFlipV(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_ANIMATEDSPRITE2D_INDEX, scriptIndex)
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
  public final fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
      block(this)
      offset = this
  }


  public final fun setSpriteFrames(spriteFrames: SpriteFrames?): Unit {
    Internals.writeArguments(OBJECT to spriteFrames)
    Internals.callMethod(rawPtr, MethodBindings.setSpriteFramesPtr, NIL)
  }

  public final fun getSpriteFrames(): SpriteFrames? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSpriteFramesPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as SpriteFrames?)
  }

  public final fun setAnimation(name: StringName): Unit {
    Internals.writeArguments(STRING_NAME to name)
    Internals.callMethod(rawPtr, MethodBindings.setAnimationPtr, NIL)
  }

  public final fun getAnimation(): StringName {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAnimationPtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setAutoplay(name: String): Unit {
    Internals.writeArguments(STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.setAutoplayPtr, NIL)
  }

  public final fun getAutoplay(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAutoplayPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if an animation is currently playing (even if [speedScale] and/or `custom_speed`
   * are `0`).
   */
  public final fun isPlaying(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isPlayingPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Plays the animation with key [name]. If [customSpeed] is negative and [fromEnd] is `true`, the
   * animation will play backwards (which is equivalent to calling [playBackwards]).
   * If this method is called with that same animation [name], or with no [name] parameter, the
   * assigned animation will resume playing if it was paused.
   */
  @JvmOverloads
  public final fun play(
    name: StringName = StringName(""),
    customSpeed: Float = 1.0f,
    fromEnd: Boolean = false,
  ): Unit {
    Internals.writeArguments(STRING_NAME to name, DOUBLE to customSpeed.toDouble(), BOOL to fromEnd)
    Internals.callMethod(rawPtr, MethodBindings.playPtr, NIL)
  }

  /**
   * Plays the animation with key [name] in reverse.
   * This method is a shorthand for [play] with `custom_speed = -1.0` and `from_end = true`, so see
   * its description for more information.
   */
  @JvmOverloads
  public final fun playBackwards(name: StringName = StringName("")): Unit {
    Internals.writeArguments(STRING_NAME to name)
    Internals.callMethod(rawPtr, MethodBindings.playBackwardsPtr, NIL)
  }

  /**
   * Pauses the currently playing animation. The [frame] and [frameProgress] will be kept and
   * calling [play] or [playBackwards] without arguments will resume the animation from the current
   * playback position.
   * See also [stop].
   */
  public final fun pause(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.pausePtr, NIL)
  }

  /**
   * Stops the currently playing animation. The animation position is reset to `0` and the
   * `custom_speed` is reset to `1.0`. See also [pause].
   */
  public final fun stop(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  public final fun setCentered(centered: Boolean): Unit {
    Internals.writeArguments(BOOL to centered)
    Internals.callMethod(rawPtr, MethodBindings.setCenteredPtr, NIL)
  }

  public final fun isCentered(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isCenteredPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setOffset(offset: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to offset)
    Internals.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
  }

  public final fun getOffset(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOffsetPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setFlipH(flipH: Boolean): Unit {
    Internals.writeArguments(BOOL to flipH)
    Internals.callMethod(rawPtr, MethodBindings.setFlipHPtr, NIL)
  }

  public final fun isFlippedH(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isFlippedHPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFlipV(flipV: Boolean): Unit {
    Internals.writeArguments(BOOL to flipV)
    Internals.callMethod(rawPtr, MethodBindings.setFlipVPtr, NIL)
  }

  public final fun isFlippedV(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isFlippedVPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFrame(frame: Int): Unit {
    Internals.writeArguments(LONG to frame.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setFramePtr, NIL)
  }

  public final fun getFrame(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFramePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setFrameProgress(progress: Float): Unit {
    Internals.writeArguments(DOUBLE to progress.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setFrameProgressPtr, NIL)
  }

  public final fun getFrameProgress(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFrameProgressPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
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
  public final fun setFrameAndProgress(frame: Int, progress: Float): Unit {
    Internals.writeArguments(LONG to frame.toLong(), DOUBLE to progress.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setFrameAndProgressPtr, NIL)
  }

  public final fun setSpeedScale(speedScale: Float): Unit {
    Internals.writeArguments(DOUBLE to speedScale.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setSpeedScalePtr, NIL)
  }

  public final fun getSpeedScale(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSpeedScalePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the actual playing speed of current animation or `0` if not playing. This speed is the
   * [speedScale] property multiplied by `custom_speed` argument specified when calling the [play]
   * method.
   * Returns a negative value if the current animation is playing backwards.
   */
  public final fun getPlayingSpeed(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPlayingSpeedPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setSpriteFramesPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "set_sprite_frames", 905781144)

    public val getSpriteFramesPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "get_sprite_frames", 3804851214)

    public val setAnimationPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "set_animation", 3304788590)

    public val getAnimationPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "get_animation", 2002593661)

    public val setAutoplayPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "set_autoplay", 83702148)

    public val getAutoplayPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "get_autoplay", 201670096)

    public val isPlayingPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "is_playing", 36873697)

    public val playPtr: VoidPtr = Internals.getMethodBindPtr("AnimatedSprite2D", "play", 2372066587)

    public val playBackwardsPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "play_backwards", 1421762485)

    public val pausePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "pause", 3218959716)

    public val stopPtr: VoidPtr = Internals.getMethodBindPtr("AnimatedSprite2D", "stop", 3218959716)

    public val setCenteredPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "set_centered", 2586408642)

    public val isCenteredPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "is_centered", 36873697)

    public val setOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "set_offset", 743155724)

    public val getOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "get_offset", 3341600327)

    public val setFlipHPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "set_flip_h", 2586408642)

    public val isFlippedHPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "is_flipped_h", 36873697)

    public val setFlipVPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "set_flip_v", 2586408642)

    public val isFlippedVPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "is_flipped_v", 36873697)

    public val setFramePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "set_frame", 1286410249)

    public val getFramePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "get_frame", 3905245786)

    public val setFrameProgressPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "set_frame_progress", 373806689)

    public val getFrameProgressPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "get_frame_progress", 1740695150)

    public val setFrameAndProgressPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "set_frame_and_progress", 1602489585)

    public val setSpeedScalePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "set_speed_scale", 373806689)

    public val getSpeedScalePtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "get_speed_scale", 1740695150)

    public val getPlayingSpeedPtr: VoidPtr =
        Internals.getMethodBindPtr("AnimatedSprite2D", "get_playing_speed", 1740695150)
  }
}

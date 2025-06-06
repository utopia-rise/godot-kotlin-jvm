// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Signal0
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedStringName
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

/**
 * [AnimatedSprite3D] is similar to the [Sprite3D] node, except it carries multiple textures as
 * animation [spriteFrames]. Animations are created using a [SpriteFrames] resource, which allows you
 * to import image files (or a folder containing said files) to provide the animation frames for the
 * sprite. The [SpriteFrames] resource can be configured in the editor via the SpriteFrames bottom
 * panel.
 */
@GodotBaseType
public open class AnimatedSprite3D : SpriteBase3D() {
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
   *
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
   *
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

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(10, scriptIndex)
  }

  public final fun setSpriteFrames(spriteFrames: SpriteFrames?): Unit {
    TransferContext.writeArguments(OBJECT to spriteFrames)
    TransferContext.callMethod(ptr, MethodBindings.setSpriteFramesPtr, NIL)
  }

  public final fun getSpriteFrames(): SpriteFrames? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpriteFramesPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as SpriteFrames?)
  }

  public final fun setAnimation(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.setAnimationPtr, NIL)
  }

  public final fun getAnimation(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAnimationPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setAutoplay(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.setAutoplayPtr, NIL)
  }

  public final fun getAutoplay(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAutoplayPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if an animation is currently playing (even if [speedScale] and/or `custom_speed`
   * are `0`).
   */
  public final fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPlayingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Plays the animation with key [name]. If [customSpeed] is negative and [fromEnd] is `true`, the
   * animation will play backwards (which is equivalent to calling [playBackwards]).
   *
   * If this method is called with that same animation [name], or with no [name] parameter, the
   * assigned animation will resume playing if it was paused.
   */
  @JvmOverloads
  public final fun play(
    name: StringName = StringName(""),
    customSpeed: Float = 1.0f,
    fromEnd: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, DOUBLE to customSpeed.toDouble(), BOOL to fromEnd)
    TransferContext.callMethod(ptr, MethodBindings.playPtr, NIL)
  }

  /**
   * Plays the animation with key [name] in reverse.
   *
   * This method is a shorthand for [play] with `custom_speed = -1.0` and `from_end = true`, so see
   * its description for more information.
   */
  public final fun playBackwards(name: StringName = StringName("")): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.playBackwardsPtr, NIL)
  }

  /**
   * Pauses the currently playing animation. The [frame] and [frameProgress] will be kept and
   * calling [play] or [playBackwards] without arguments will resume the animation from the current
   * playback position.
   *
   * See also [stop].
   */
  public final fun pause(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.pausePtr, NIL)
  }

  /**
   * Stops the currently playing animation. The animation position is reset to `0` and the
   * `custom_speed` is reset to `1.0`. See also [pause].
   */
  public final fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.stopPtr, NIL)
  }

  public final fun setFrame(frame: Int): Unit {
    TransferContext.writeArguments(LONG to frame.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setFramePtr, NIL)
  }

  public final fun getFrame(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFramePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setFrameProgress(progress: Float): Unit {
    TransferContext.writeArguments(DOUBLE to progress.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFrameProgressPtr, NIL)
  }

  public final fun getFrameProgress(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFrameProgressPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets [frame] the [frameProgress] to the given values. Unlike setting [frame], this method does
   * not reset the [frameProgress] to `0.0` implicitly.
   *
   * **Example:** Change the animation while keeping the same [frame] and [frameProgress]:
   *
   * ```gdscript
   * //gdscript
   * var current_frame = animated_sprite.get_frame()
   * var current_progress = animated_sprite.get_frame_progress()
   * animated_sprite.play("walk_another_skin")
   * animated_sprite.set_frame_and_progress(current_frame, current_progress)
   * ```
   */
  public final fun setFrameAndProgress(frame: Int, progress: Float): Unit {
    TransferContext.writeArguments(LONG to frame.toLong(), DOUBLE to progress.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFrameAndProgressPtr, NIL)
  }

  public final fun setSpeedScale(speedScale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to speedScale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSpeedScalePtr, NIL)
  }

  public final fun getSpeedScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpeedScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the actual playing speed of current animation or `0` if not playing. This speed is the
   * [speedScale] property multiplied by `custom_speed` argument specified when calling the [play]
   * method.
   *
   * Returns a negative value if the current animation is playing backwards.
   */
  public final fun getPlayingSpeed(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPlayingSpeedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAnimation(name: String) = setAnimation(name.asCachedStringName())

  /**
   * Plays the animation with key [name]. If [customSpeed] is negative and [fromEnd] is `true`, the
   * animation will play backwards (which is equivalent to calling [playBackwards]).
   *
   * If this method is called with that same animation [name], or with no [name] parameter, the
   * assigned animation will resume playing if it was paused.
   */
  @JvmOverloads
  public final fun play(
    name: String,
    customSpeed: Float = 1.0f,
    fromEnd: Boolean = false,
  ) = play(name.asCachedStringName(), customSpeed, fromEnd)

  /**
   * Plays the animation with key [name] in reverse.
   *
   * This method is a shorthand for [play] with `custom_speed = -1.0` and `from_end = true`, so see
   * its description for more information.
   */
  public final fun playBackwards(name: String) = playBackwards(name.asCachedStringName())

  public companion object

  public object MethodBindings {
    internal val setSpriteFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "set_sprite_frames", 905781144)

    internal val getSpriteFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "get_sprite_frames", 3804851214)

    internal val setAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "set_animation", 3304788590)

    internal val getAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "get_animation", 2002593661)

    internal val setAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "set_autoplay", 83702148)

    internal val getAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "get_autoplay", 201670096)

    internal val isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "is_playing", 36873697)

    internal val playPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "play", 3269405555)

    internal val playBackwardsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "play_backwards", 3323268493)

    internal val pausePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "pause", 3218959716)

    internal val stopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "stop", 3218959716)

    internal val setFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "set_frame", 1286410249)

    internal val getFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "get_frame", 3905245786)

    internal val setFrameProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "set_frame_progress", 373806689)

    internal val getFrameProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "get_frame_progress", 1740695150)

    internal val setFrameAndProgressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "set_frame_and_progress", 1602489585)

    internal val setSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "set_speed_scale", 373806689)

    internal val getSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "get_speed_scale", 1740695150)

    internal val getPlayingSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedSprite3D", "get_playing_speed", 1740695150)
  }
}

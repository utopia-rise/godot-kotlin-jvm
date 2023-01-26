// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * 2D sprite node in 3D world, that can use multiple 2D textures for animation.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/2d/2d_sprite_animation.html]($DOCS_URL/tutorials/2d/2d_sprite_animation.html)
 *
 * [godot.AnimatedSprite3D] is similar to the [godot.Sprite3D] node, except it carries multiple textures as animation [spriteFrames]. Animations are created using a [godot.SpriteFrames] resource, which allows you to import image files (or a folder containing said files) to provide the animation frames for the sprite. The [godot.SpriteFrames] resource can be configured in the editor via the SpriteFrames bottom panel.
 */
@GodotBaseType
public open class AnimatedSprite3D : SpriteBase3D() {
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
   * Emitted when the animation reaches the end, or the start if it is played in reverse. When the animation finishes, it pauses the playback.
   */
  public val animationFinished: Signal0 by signal()

  /**
   * The [godot.SpriteFrames] resource containing the animation(s). Allows you the option to load, edit, clear, make unique and save the states of the [godot.SpriteFrames] resource.
   */
  public var spriteFrames: SpriteFrames?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_GET_SPRITE_FRAMES, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as SpriteFrames?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_SET_SPRITE_FRAMES, NIL)
    }

  /**
   * The current animation from the [spriteFrames] resource. If this value is changed, the [frame] counter and the [frameProgress] are reset.
   */
  public var animation: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_GET_ANIMATION,
          STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_SET_ANIMATION,
          NIL)
    }

  /**
   * The key of the animation to play when the scene loads.
   */
  public var autoplay: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_GET_AUTOPLAY,
          STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_SET_AUTOPLAY,
          NIL)
    }

  /**
   * The displayed animation frame's index. Setting this property also resets [frameProgress]. If this is not desired, use [setFrameAndProgress].
   */
  public var frame: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_GET_FRAME, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_SET_FRAME, NIL)
    }

  /**
   * The progress value between `0.0` and `1.0` until the current frame transitions to the next frame. If the animation is playing backwards, the value transitions from `1.0` to `0.0`.
   */
  public var frameProgress: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_GET_FRAME_PROGRESS, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_SET_FRAME_PROGRESS, NIL)
    }

  /**
   * The speed scaling ratio. For example, if this value is `1`, then the animation plays at normal speed. If it's `0.5`, then it plays at half speed. If it's `2`, then it plays at double speed.
   *
   * If set to a negative value, the animation is played in reverse. If set to `0`, the animation will not advance.
   */
  public var speedScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_GET_SPEED_SCALE,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_SET_SPEED_SCALE,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATEDSPRITE3D, scriptIndex)
    return true
  }

  /**
   * Returns `true` if an animation is currently playing (even if [speedScale] and/or `custom_speed` are `0`).
   */
  public fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_IS_PLAYING, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Plays the animation with key [name]. If [customSpeed] is negative and [fromEnd] is `true`, the animation will play backwards (which is equivalent to calling [playBackwards]).
   *
   * If this method is called with that same animation [name], or with no [name] parameter, the assigned animation will resume playing if it was paused.
   */
  public fun play(
    name: StringName = StringName(""),
    customSpeed: Float = 1.0f,
    fromEnd: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, DOUBLE to customSpeed.toDouble(), BOOL to fromEnd)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_PLAY, NIL)
  }

  /**
   * Plays the animation with key [name] in reverse.
   *
   * This method is a shorthand for [play] with `custom_speed = -1.0` and `from_end = true`, so see its description for more information.
   */
  public fun playBackwards(name: StringName = StringName("")): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_PLAY_BACKWARDS,
        NIL)
  }

  /**
   * Pauses the currently playing animation. The [frame] and [frameProgress] will be kept and calling [play] or [playBackwards] without arguments will resume the animation from the current playback position.
   *
   * See also [stop].
   */
  public fun pause(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_PAUSE, NIL)
  }

  /**
   * Stops the currently playing animation. The animation position is reset to `0` and the `custom_speed` is reset to `1.0`. See also [pause].
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_STOP, NIL)
  }

  /**
   * The setter of [frame] resets the [frameProgress] to `0.0` implicitly, but this method avoids that.
   *
   * This is useful when you want to carry over the current [frameProgress] to another [frame].
   *
   * **Example:**
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * # Change the animation with keeping the frame index and progress.
   *
   * var current_frame = animated_sprite.get_frame()
   *
   * var current_progress = animated_sprite.get_frame_progress()
   *
   * animated_sprite.play("walk_another_skin")
   *
   * animated_sprite.set_frame_and_progress(current_frame, current_progress)
   *
   * [/gdscript]
   *
   * [/codeblocks]
   */
  public fun setFrameAndProgress(frame: Int, progress: Float): Unit {
    TransferContext.writeArguments(LONG to frame.toLong(), DOUBLE to progress.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_SET_FRAME_AND_PROGRESS, NIL)
  }

  /**
   * Returns the actual playing speed of current animation or `0` if not playing. This speed is the [speedScale] property multiplied by `custom_speed` argument specified when calling the [play] method.
   *
   * Returns a negative value if the current animation is playing backwards.
   */
  public fun getPlayingSpeed(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_GET_PLAYING_SPEED,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public companion object
}

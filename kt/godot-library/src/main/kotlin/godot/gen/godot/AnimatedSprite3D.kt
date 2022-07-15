// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * 2D sprite node in 3D world, that can use multiple 2D textures for animation.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/2d/2d_sprite_animation.html]($DOCS_URL/tutorials/2d/2d_sprite_animation.html)
 *
 * Animations are created using a [godot.SpriteFrames] resource, which can be configured in the editor via the SpriteFrames panel.
 */
@GodotBaseType
public open class AnimatedSprite3D : SpriteBase3D() {
  /**
   * Emitted when the animation is finished (when it plays the last frame). If the animation is looping, this signal is emitted every time the last frame is drawn.
   */
  public val animationFinished: Signal0 by signal()

  /**
   * Emitted when [frame] changed.
   */
  public val frameChanged: Signal0 by signal()

  /**
   * The current animation from the `frames` resource. If this value changes, the `frame` counter is reset.
   */
  public open var animation: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_GET_ANIMATION,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_SET_ANIMATION,
          NIL)
    }

  /**
   * The displayed animation frame's index.
   */
  public open var frame: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_GET_FRAME, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_SET_FRAME, NIL)
    }

  /**
   * The [godot.SpriteFrames] resource containing the animation(s).
   */
  public open var frames: SpriteFrames?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_GET_FRAMES,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as SpriteFrames?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_SET_FRAMES, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATEDSPRITE3D)
  }

  public open fun _isPlaying(): Boolean {
    throw NotImplementedError("_is_playing is not implemented for AnimatedSprite3D")
  }

  public open fun _resChanged(): Unit {
  }

  public open fun _setPlaying(playing: Boolean): Unit {
  }

  /**
   * Returns `true` if an animation is currently being played.
   */
  public open fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_IS_PLAYING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Plays the animation named `anim`. If no `anim` is provided, the current animation is played.
   */
  public open fun play(anim: String = ""): Unit {
    TransferContext.writeArguments(STRING to anim)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_PLAY, NIL)
  }

  /**
   * Stops the current animation (does not reset the frame counter).
   */
  public open fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE3D_STOP, NIL)
  }
}

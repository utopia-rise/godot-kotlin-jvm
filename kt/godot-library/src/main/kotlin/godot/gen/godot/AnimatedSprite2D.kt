// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Sprite node that can use multiple textures for animation.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/515](https://godotengine.org/asset-library/asset/515)
 *
 * Animations are created using a [godot.SpriteFrames] resource, which can be configured in the editor via the SpriteFrames panel.
 *
 * **Note:** You can associate a set of normal or specular maps by creating additional [godot.SpriteFrames] resources with a `_normal` or `_specular` suffix. For example, having 3 [godot.SpriteFrames] resources `run`, `run_normal`, and `run_specular` will make it so the `run` animation uses normal and specular maps.
 */
@GodotBaseType
public open class AnimatedSprite2D : Node2D() {
  /**
   * Emitted when [frame] changed.
   */
  public val frameChanged: Signal0 by signal()

  /**
   * Emitted when the animation is finished (when it plays the last frame). If the animation is looping, this signal is emitted every time the last frame is drawn.
   */
  public val animationFinished: Signal0 by signal()

  /**
   * The [godot.SpriteFrames] resource containing the animation(s).
   */
  public var frames: SpriteFrames?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE2D_GET_SPRITE_FRAMES, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as SpriteFrames?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE2D_SET_SPRITE_FRAMES, NIL)
    }

  /**
   * The current animation from the `frames` resource. If this value changes, the `frame` counter is reset.
   */
  public var animation: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE2D_GET_ANIMATION,
          STRING_NAME)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE2D_SET_ANIMATION,
          NIL)
    }

  /**
   * The displayed animation frame's index.
   */
  public var frame: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE2D_GET_FRAME, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE2D_SET_FRAME, NIL)
    }

  /**
   * The animation speed is multiplied by this value.
   */
  public var speedScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE2D_GET_SPEED_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE2D_SET_SPEED_SCALE,
          NIL)
    }

  /**
   * If `true`, the [animation] is currently playing.
   */
  public var playing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE2D_IS_PLAYING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE2D_SET_PLAYING, NIL)
    }

  /**
   * If `true`, texture will be centered.
   */
  public var centered: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE2D_IS_CENTERED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE2D_SET_CENTERED,
          NIL)
    }

  /**
   * The texture's drawing offset.
   */
  public var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE2D_GET_OFFSET,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE2D_SET_OFFSET, NIL)
    }

  /**
   * If `true`, texture is flipped horizontally.
   */
  public var flipH: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE2D_IS_FLIPPED_H,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE2D_SET_FLIP_H, NIL)
    }

  /**
   * If `true`, texture is flipped vertically.
   */
  public var flipV: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE2D_IS_FLIPPED_V,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE2D_SET_FLIP_V, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATEDSPRITE2D)
  }

  /**
   * Plays the animation named `anim`. If no `anim` is provided, the current animation is played. If `backwards` is `true`, the animation will be played in reverse.
   */
  public fun play(anim: StringName = StringName(""), backwards: Boolean = false): Unit {
    TransferContext.writeArguments(STRING_NAME to anim, BOOL to backwards)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE2D_PLAY, NIL)
  }

  /**
   * Stops the current animation (does not reset the frame counter).
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDSPRITE2D_STOP, NIL)
  }

  public companion object
}

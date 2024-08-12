// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * [AnimatedTexture] is a resource format for frame-based animations, where multiple textures can be
 * chained automatically with a predefined delay for each frame. Unlike [AnimationPlayer] or
 * [AnimatedSprite2D], it isn't a [Node], but has the advantage of being usable anywhere a [Texture2D]
 * resource can be used, e.g. in a [TileSet].
 * The playback of the animation is controlled by the [speedScale] property, as well as each frame's
 * duration (see [setFrameDuration]). The animation loops, i.e. it will restart at frame 0
 * automatically after playing the last frame.
 * [AnimatedTexture] currently requires all frame textures to have the same size, otherwise the
 * bigger ones will be cropped to match the smallest one.
 * **Note:** AnimatedTexture doesn't support using [AtlasTexture]s. Each frame needs to be a
 * separate [Texture2D].
 * **Warning:** The current implementation is not efficient for the modern renderers.
 * *Deprecated.* This class is deprecated, and might be removed in a future release.
 */
@GodotBaseType
public open class AnimatedTexture : Texture2D() {
  /**
   * Number of frames to use in the animation. While you can create the frames independently with
   * [setFrameTexture], you need to set this value for the animation to take new frames into account.
   * The maximum number of frames is [MAX_FRAMES].
   */
  public var frames: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFramesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFramesPtr, NIL)
    }

  /**
   * Sets the currently visible frame of the texture. Setting this frame while playing resets the
   * current frame time, so the newly selected frame plays for its whole configured frame duration.
   */
  public var currentFrame: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurrentFramePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCurrentFramePtr, NIL)
    }

  /**
   * If `true`, the animation will pause where it currently is (i.e. at [currentFrame]). The
   * animation will continue from where it was paused when changing this property to `false`.
   */
  public var pause: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPausePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPausePtr, NIL)
    }

  /**
   * If `true`, the animation will only play once and will not loop back to the first frame after
   * reaching the end. Note that reaching the end will not set [pause] to `true`.
   */
  public var oneShot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOneShotPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOneShotPtr, NIL)
    }

  /**
   * The animation speed is multiplied by this value. If set to a negative value, the animation is
   * played in reverse.
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATEDTEXTURE, scriptIndex)
    return true
  }

  /**
   * Assigns a [Texture2D] to the given frame. Frame IDs start at 0, so the first frame has ID 0,
   * and the last frame of the animation has ID [frames] - 1.
   * You can define any number of textures up to [MAX_FRAMES], but keep in mind that only frames
   * from 0 to [frames] - 1 will be part of the animation.
   */
  public fun setFrameTexture(frame: Int, texture: Texture2D): Unit {
    TransferContext.writeArguments(LONG to frame.toLong(), OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setFrameTexturePtr, NIL)
  }

  /**
   * Returns the given frame's [Texture2D].
   */
  public fun getFrameTexture(frame: Int): Texture2D? {
    TransferContext.writeArguments(LONG to frame.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFrameTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * Sets the duration of any given [frame]. The final duration is affected by the [speedScale]. If
   * set to `0`, the frame is skipped during playback.
   */
  public fun setFrameDuration(frame: Int, duration: Float): Unit {
    TransferContext.writeArguments(LONG to frame.toLong(), DOUBLE to duration.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setFrameDurationPtr, NIL)
  }

  /**
   * Returns the given [frame]'s duration, in seconds.
   */
  public fun getFrameDuration(frame: Int): Float {
    TransferContext.writeArguments(LONG to frame.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFrameDurationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public companion object {
    /**
     * The maximum number of frames supported by [AnimatedTexture]. If you need more frames in your
     * animation, use [AnimationPlayer] or [AnimatedSprite2D].
     */
    public final const val MAX_FRAMES: Long = 256
  }

  internal object MethodBindings {
    public val setFramesPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimatedTexture", "set_frames")

    public val getFramesPtr: VoidPtr = TypeManager.getMethodBindPtr("AnimatedTexture", "get_frames")

    public val setCurrentFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "set_current_frame")

    public val getCurrentFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "get_current_frame")

    public val setPausePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimatedTexture", "set_pause")

    public val getPausePtr: VoidPtr = TypeManager.getMethodBindPtr("AnimatedTexture", "get_pause")

    public val setOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "set_one_shot")

    public val getOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "get_one_shot")

    public val setSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "set_speed_scale")

    public val getSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "get_speed_scale")

    public val setFrameTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "set_frame_texture")

    public val getFrameTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "get_frame_texture")

    public val setFrameDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "set_frame_duration")

    public val getFrameDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "get_frame_duration")
  }
}

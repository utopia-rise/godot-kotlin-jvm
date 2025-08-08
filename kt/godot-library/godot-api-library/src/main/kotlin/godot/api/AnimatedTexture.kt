// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * [AnimatedTexture] is a resource format for frame-based animations, where multiple textures can be chained automatically with a predefined delay for each frame. Unlike [AnimationPlayer] or [AnimatedSprite2D], it isn't a [Node], but has the advantage of being usable anywhere a [Texture2D] resource can be used, e.g. in a [TileSet].
 *
 * The playback of the animation is controlled by the [speedScale] property, as well as each frame's duration (see [setFrameDuration]). The animation loops, i.e. it will restart at frame 0 automatically after playing the last frame.
 *
 * [AnimatedTexture] currently requires all frame textures to have the same size, otherwise the bigger ones will be cropped to match the smallest one.
 *
 * **Note:** AnimatedTexture doesn't support using [AtlasTexture]s. Each frame needs to be a separate [Texture2D].
 *
 * **Warning:** The current implementation is not efficient for the modern renderers.
 */
@GodotBaseType
public open class AnimatedTexture : Texture2D() {
  /**
   * Number of frames to use in the animation. While you can create the frames independently with [setFrameTexture], you need to set this value for the animation to take new frames into account. The maximum number of frames is [MAX_FRAMES].
   */
  public final inline var frames: Int
    @JvmName("framesProperty")
    get() = getFrames()
    @JvmName("framesProperty")
    set(`value`) {
      setFrames(value)
    }

  /**
   * Sets the currently visible frame of the texture. Setting this frame while playing resets the current frame time, so the newly selected frame plays for its whole configured frame duration.
   */
  public final inline var currentFrame: Int
    @JvmName("currentFrameProperty")
    get() = getCurrentFrame()
    @JvmName("currentFrameProperty")
    set(`value`) {
      setCurrentFrame(value)
    }

  /**
   * If `true`, the animation will pause where it currently is (i.e. at [currentFrame]). The animation will continue from where it was paused when changing this property to `false`.
   */
  public final inline var pause: Boolean
    @JvmName("pauseProperty")
    get() = getPause()
    @JvmName("pauseProperty")
    set(`value`) {
      setPause(value)
    }

  /**
   * If `true`, the animation will only play once and will not loop back to the first frame after reaching the end. Note that reaching the end will not set [pause] to `true`.
   */
  public final inline var oneShot: Boolean
    @JvmName("oneShotProperty")
    get() = getOneShot()
    @JvmName("oneShotProperty")
    set(`value`) {
      setOneShot(value)
    }

  /**
   * The animation speed is multiplied by this value. If set to a negative value, the animation is played in reverse.
   */
  public final inline var speedScale: Float
    @JvmName("speedScaleProperty")
    get() = getSpeedScale()
    @JvmName("speedScaleProperty")
    set(`value`) {
      setSpeedScale(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(11, scriptIndex)
  }

  public final fun setFrames(frames: Int) {
    TransferContext.writeArguments(LONG to frames.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setFramesPtr, NIL)
  }

  public final fun getFrames(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFramesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setCurrentFrame(frame: Int) {
    TransferContext.writeArguments(LONG to frame.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setCurrentFramePtr, NIL)
  }

  public final fun getCurrentFrame(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCurrentFramePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setPause(pause: Boolean) {
    TransferContext.writeArguments(BOOL to pause)
    TransferContext.callMethod(ptr, MethodBindings.setPausePtr, NIL)
  }

  public final fun getPause(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPausePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setOneShot(oneShot: Boolean) {
    TransferContext.writeArguments(BOOL to oneShot)
    TransferContext.callMethod(ptr, MethodBindings.setOneShotPtr, NIL)
  }

  public final fun getOneShot(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOneShotPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSpeedScale(scale: Float) {
    TransferContext.writeArguments(DOUBLE to scale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSpeedScalePtr, NIL)
  }

  public final fun getSpeedScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpeedScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Assigns a [Texture2D] to the given frame. Frame IDs start at 0, so the first frame has ID 0, and the last frame of the animation has ID [frames] - 1.
   *
   * You can define any number of textures up to [MAX_FRAMES], but keep in mind that only frames from 0 to [frames] - 1 will be part of the animation.
   */
  public final fun setFrameTexture(frame: Int, texture: Texture2D?) {
    TransferContext.writeArguments(LONG to frame.toLong(), OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setFrameTexturePtr, NIL)
  }

  /**
   * Returns the given frame's [Texture2D].
   */
  public final fun getFrameTexture(frame: Int): Texture2D? {
    TransferContext.writeArguments(LONG to frame.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getFrameTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Sets the duration of any given [frame]. The final duration is affected by the [speedScale]. If set to `0`, the frame is skipped during playback.
   */
  public final fun setFrameDuration(frame: Int, duration: Float) {
    TransferContext.writeArguments(LONG to frame.toLong(), DOUBLE to duration.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFrameDurationPtr, NIL)
  }

  /**
   * Returns the given [frame]'s duration, in seconds.
   */
  public final fun getFrameDuration(frame: Int): Float {
    TransferContext.writeArguments(LONG to frame.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getFrameDurationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getWidth(): Int {
    throw NotImplementedError("AnimatedTexture::_getWidth can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getHeight(): Int {
    throw NotImplementedError("AnimatedTexture::_getHeight can't be called from the JVM.")
  }

  public companion object {
    /**
     * The maximum number of frames supported by [AnimatedTexture]. If you need more frames in your animation, use [AnimationPlayer] or [AnimatedSprite2D].
     */
    public final const val MAX_FRAMES: Long = 256
  }

  public object MethodBindings {
    internal val setFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "set_frames", 1_286_410_249)

    internal val getFramesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "get_frames", 3_905_245_786)

    internal val setCurrentFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "set_current_frame", 1_286_410_249)

    internal val getCurrentFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "get_current_frame", 3_905_245_786)

    internal val setPausePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "set_pause", 2_586_408_642)

    internal val getPausePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "get_pause", 36_873_697)

    internal val setOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "set_one_shot", 2_586_408_642)

    internal val getOneShotPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "get_one_shot", 36_873_697)

    internal val setSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "set_speed_scale", 373_806_689)

    internal val getSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "get_speed_scale", 1_740_695_150)

    internal val setFrameTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "set_frame_texture", 666_127_730)

    internal val getFrameTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "get_frame_texture", 3_536_238_170)

    internal val setFrameDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "set_frame_duration", 1_602_489_585)

    internal val getFrameDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimatedTexture", "get_frame_duration", 2_339_986_948)
  }
}

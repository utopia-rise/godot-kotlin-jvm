// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Proxy texture for simple frame-based animations.
 *
 * [godot.AnimatedTexture] is a resource format for frame-based animations, where multiple textures can be chained automatically with a predefined delay for each frame. Unlike [godot.AnimationPlayer] or [godot.AnimatedSprite2D], it isn't a [godot.Node], but has the advantage of being usable anywhere a [godot.Texture2D] resource can be used, e.g. in a [godot.TileSet].
 *
 * The playback of the animation is controlled by the [fps] property as well as each frame's optional delay (see [setFrameDelay]). The animation loops, i.e. it will restart at frame 0 automatically after playing the last frame.
 *
 * [godot.AnimatedTexture] currently requires all frame textures to have the same size, otherwise the bigger ones will be cropped to match the smallest one.
 *
 * **Note:** AnimatedTexture doesn't support using [godot.AtlasTexture]s. Each frame needs to be a separate [godot.Texture2D].
 */
@GodotBaseType
public open class AnimatedTexture : Texture2D() {
  /**
   * Number of frames to use in the animation. While you can create the frames independently with [setFrameTexture], you need to set this value for the animation to take new frames into account. The maximum number of frames is [MAX_FRAMES].
   */
  public var frames: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAMES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAMES, NIL)
    }

  /**
   * Sets the currently visible frame of the texture.
   */
  public var currentFrame: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_CURRENT_FRAME,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_CURRENT_FRAME,
          NIL)
    }

  /**
   * If `true`, the animation will pause where it currently is (i.e. at [currentFrame]). The animation will continue from where it was paused when changing this property to `false`.
   */
  public var pause: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_PAUSE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_PAUSE, NIL)
    }

  /**
   * If `true`, the animation will only play once and will not loop back to the first frame after reaching the end. Note that reaching the end will not set [pause] to `true`.
   */
  public var oneshot: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_ONESHOT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_ONESHOT, NIL)
    }

  /**
   * Animation speed in frames per second. This value defines the default time interval between two frames of the animation, and thus the overall duration of the animation loop based on the [frames] property. A value of 0 means no predefined number of frames per second, the animation will play according to each frame's frame delay (see [setFrameDelay]).
   *
   * For example, an animation with 8 frames, no frame delay and a `fps` value of 2 will run for 4 seconds, with each frame lasting 0.5 seconds.
   */
  public var fps: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FPS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FPS, NIL)
    }

  public val frame0_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame0_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame1_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame1_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame2_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame2_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame3_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame3_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame4_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame4_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame5_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame5_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame6_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame6_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame7_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame7_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame8_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame8_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame9_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame9_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame10_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame10_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame11_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame11_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame12_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame12_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame13_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame13_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame14_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame14_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame15_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame15_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame16_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame16_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame17_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame17_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame18_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame18_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame19_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame19_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame20_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame20_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame21_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame21_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame22_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame22_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame23_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame23_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame24_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame24_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame25_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame25_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame26_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame26_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame27_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame27_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame28_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame28_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame29_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame29_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame30_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame30_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame31_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame31_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame32_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame32_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame33_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame33_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame34_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame34_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame35_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame35_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame36_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame36_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame37_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame37_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame38_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame38_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame39_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame39_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame40_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame40_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame41_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame41_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame42_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame42_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame43_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame43_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame44_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame44_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame45_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame45_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame46_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame46_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame47_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame47_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame48_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame48_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame49_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame49_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame50_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame50_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame51_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame51_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame52_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame52_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame53_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame53_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame54_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame54_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame55_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame55_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame56_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame56_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame57_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame57_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame58_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame58_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame59_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame59_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame60_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame60_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame61_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame61_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame62_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame62_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame63_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame63_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame64_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame64_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame65_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame65_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame66_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame66_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame67_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame67_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame68_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame68_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame69_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame69_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame70_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame70_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame71_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame71_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame72_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame72_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame73_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame73_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame74_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame74_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame75_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame75_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame76_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame76_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame77_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame77_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame78_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame78_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame79_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame79_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame80_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame80_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame81_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame81_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame82_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame82_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame83_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame83_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame84_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame84_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame85_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame85_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame86_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame86_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame87_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame87_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame88_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame88_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame89_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame89_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame90_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame90_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame91_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame91_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame92_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame92_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame93_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame93_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame94_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame94_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame95_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame95_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame96_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame96_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame97_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame97_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame98_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame98_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame99_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame99_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame100_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame100_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame101_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame101_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame102_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame102_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame103_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame103_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame104_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame104_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame105_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame105_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame106_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame106_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame107_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame107_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame108_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame108_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame109_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame109_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame110_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame110_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame111_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame111_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame112_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame112_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame113_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame113_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame114_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame114_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame115_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame115_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame116_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame116_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame117_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame117_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame118_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame118_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame119_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame119_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame120_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame120_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame121_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame121_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame122_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame122_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame123_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame123_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame124_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame124_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame125_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame125_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame126_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame126_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame127_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame127_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame128_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame128_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame129_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame129_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame130_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame130_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame131_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame131_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame132_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame132_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame133_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame133_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame134_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame134_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame135_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame135_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame136_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame136_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame137_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame137_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame138_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame138_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame139_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame139_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame140_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame140_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame141_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame141_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame142_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame142_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame143_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame143_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame144_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame144_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame145_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame145_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame146_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame146_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame147_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame147_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame148_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame148_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame149_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame149_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame150_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame150_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame151_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame151_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame152_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame152_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame153_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame153_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame154_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame154_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame155_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame155_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame156_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame156_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame157_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame157_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame158_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame158_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame159_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame159_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame160_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame160_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame161_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame161_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame162_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame162_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame163_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame163_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame164_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame164_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame165_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame165_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame166_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame166_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame167_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame167_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame168_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame168_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame169_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame169_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame170_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame170_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame171_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame171_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame172_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame172_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame173_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame173_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame174_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame174_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame175_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame175_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame176_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame176_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame177_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame177_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame178_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame178_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame179_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame179_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame180_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame180_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame181_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame181_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame182_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame182_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame183_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame183_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame184_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame184_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame185_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame185_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame186_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame186_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame187_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame187_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame188_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame188_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame189_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame189_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame190_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame190_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame191_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame191_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame192_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame192_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame193_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame193_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame194_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame194_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame195_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame195_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame196_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame196_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame197_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame197_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame198_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame198_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame199_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame199_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame200_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame200_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame201_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame201_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame202_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame202_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame203_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame203_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame204_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame204_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame205_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame205_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame206_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame206_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame207_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame207_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame208_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame208_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame209_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame209_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame210_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame210_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame211_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame211_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame212_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame212_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame213_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame213_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame214_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame214_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame215_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame215_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame216_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame216_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame217_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame217_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame218_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame218_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame219_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame219_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame220_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame220_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame221_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame221_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame222_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame222_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame223_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame223_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame224_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame224_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame225_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame225_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame226_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame226_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame227_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame227_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame228_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame228_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame229_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame229_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame230_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame230_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame231_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame231_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame232_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame232_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame233_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame233_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame234_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame234_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame235_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame235_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame236_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame236_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame237_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame237_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame238_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame238_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame239_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame239_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame240_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame240_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame241_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame241_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame242_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame242_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame243_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame243_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame244_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame244_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame245_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame245_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame246_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame246_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame247_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame247_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame248_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame248_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame249_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame249_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame250_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame250_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame251_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame251_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame252_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame252_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame253_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame253_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame254_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame254_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame255_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame255_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATEDTEXTURE)
  }

  /**
   * Assigns a [godot.Texture2D] to the given frame. Frame IDs start at 0, so the first frame has ID 0, and the last frame of the animation has ID [frames] - 1.
   *
   * You can define any number of textures up to [MAX_FRAMES], but keep in mind that only frames from 0 to [frames] - 1 will be part of the animation.
   */
  public fun setFrameTexture(frame: Long, texture: Texture2D): Unit {
    TransferContext.writeArguments(LONG to frame, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_TEXTURE,
        NIL)
  }

  /**
   * Sets an additional delay (in seconds) between this frame and the next one, that will be added to the time interval defined by [fps]. By default, frames have no delay defined. If a delay value is defined, the final time interval between this frame and the next will be `1.0 / fps + delay`.
   *
   * For example, for an animation with 3 frames, 2 FPS and a frame delay on the second frame of 1.2, the resulting playback will be:
   *
   * ```
   * 				Frame 0: 0.5 s (1 / fps)
   * 				Frame 1: 1.7 s (1 / fps + 1.2)
   * 				Frame 2: 0.5 s (1 / fps)
   * 				Total duration: 2.7 s
   * 				```
   */
  public fun setFrameDelay(frame: Long, delay: Double): Unit {
    TransferContext.writeArguments(LONG to frame, DOUBLE to delay)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_DELAY,
        NIL)
  }

  public companion object {
    /**
     * The maximum number of frames supported by [godot.AnimatedTexture]. If you need more frames in your animation, use [godot.AnimationPlayer] or [godot.AnimatedSprite2D].
     */
    public final const val MAX_FRAMES: Long = 256
  }
}

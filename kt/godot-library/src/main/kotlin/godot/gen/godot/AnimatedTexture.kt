// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

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
  public open var frames: Long
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
  public open var currentFrame: Long
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
  public open var pause: Boolean
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
  public open var oneshot: Boolean
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
  public open var fps: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FPS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FPS, NIL)
    }

  public open val frame0_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_0_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame0_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_0_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame1_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_1_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame1_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_1_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame2_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_2_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame2_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_2_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame3_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_3_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame3_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_3_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame4_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_4_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame4_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_4_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame5_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_5_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame5_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_5_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame6_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_6_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame6_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_6_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame7_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_7_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame7_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_7_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame8_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_8_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame8_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_8_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame9_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_9_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame9_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_9_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame10_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_10_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame10_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_10_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame11_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_11_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame11_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_11_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame12_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_12_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame12_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_12_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame13_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_13_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame13_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_13_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame14_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_14_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame14_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_14_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame15_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_15_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame15_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_15_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame16_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_16_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame16_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_16_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame17_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_17_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame17_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_17_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame18_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_18_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame18_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_18_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame19_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_19_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame19_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_19_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame20_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_20_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame20_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_20_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame21_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_21_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame21_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_21_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame22_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_22_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame22_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_22_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame23_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_23_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame23_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_23_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame24_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_24_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame24_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_24_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame25_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_25_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame25_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_25_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame26_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_26_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame26_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_26_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame27_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_27_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame27_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_27_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame28_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_28_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame28_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_28_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame29_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_29_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame29_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_29_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame30_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_30_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame30_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_30_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame31_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_31_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame31_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_31_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame32_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_32_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame32_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_32_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame33_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_33_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame33_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_33_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame34_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_34_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame34_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_34_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame35_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_35_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame35_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_35_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame36_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_36_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame36_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_36_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame37_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_37_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame37_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_37_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame38_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_38_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame38_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_38_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame39_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_39_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame39_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_39_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame40_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_40_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame40_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_40_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame41_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_41_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame41_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_41_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame42_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_42_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame42_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_42_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame43_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_43_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame43_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_43_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame44_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_44_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame44_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_44_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame45_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_45_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame45_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_45_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame46_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_46_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame46_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_46_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame47_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_47_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame47_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_47_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame48_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_48_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame48_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_48_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame49_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_49_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame49_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_49_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame50_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_50_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame50_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_50_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame51_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_51_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame51_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_51_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame52_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_52_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame52_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_52_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame53_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_53_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame53_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_53_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame54_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_54_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame54_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_54_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame55_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_55_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame55_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_55_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame56_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_56_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame56_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_56_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame57_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_57_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame57_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_57_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame58_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_58_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame58_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_58_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame59_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_59_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame59_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_59_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame60_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_60_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame60_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_60_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame61_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_61_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame61_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_61_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame62_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_62_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame62_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_62_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame63_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_63_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame63_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_63_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame64_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_64_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame64_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_64_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame65_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_65_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame65_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_65_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame66_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_66_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame66_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_66_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame67_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_67_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame67_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_67_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame68_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_68_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame68_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_68_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame69_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_69_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame69_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_69_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame70_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_70_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame70_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_70_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame71_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_71_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame71_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_71_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame72_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_72_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame72_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_72_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame73_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_73_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame73_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_73_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame74_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_74_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame74_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_74_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame75_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_75_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame75_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_75_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame76_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_76_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame76_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_76_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame77_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_77_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame77_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_77_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame78_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_78_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame78_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_78_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame79_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_79_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame79_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_79_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame80_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_80_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame80_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_80_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame81_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_81_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame81_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_81_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame82_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_82_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame82_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_82_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame83_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_83_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame83_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_83_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame84_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_84_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame84_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_84_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame85_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_85_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame85_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_85_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame86_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_86_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame86_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_86_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame87_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_87_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame87_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_87_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame88_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_88_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame88_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_88_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame89_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_89_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame89_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_89_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame90_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_90_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame90_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_90_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame91_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_91_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame91_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_91_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame92_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_92_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame92_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_92_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame93_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_93_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame93_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_93_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame94_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_94_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame94_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_94_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame95_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_95_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame95_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_95_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame96_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_96_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame96_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_96_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame97_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_97_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame97_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_97_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame98_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_98_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame98_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_98_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame99_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_99_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame99_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_99_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame100_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_100_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame100_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_100_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame101_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_101_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame101_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_101_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame102_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_102_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame102_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_102_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame103_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_103_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame103_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_103_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame104_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_104_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame104_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_104_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame105_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_105_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame105_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_105_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame106_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_106_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame106_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_106_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame107_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_107_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame107_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_107_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame108_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_108_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame108_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_108_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame109_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_109_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame109_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_109_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame110_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_110_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame110_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_110_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame111_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_111_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame111_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_111_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame112_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_112_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame112_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_112_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame113_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_113_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame113_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_113_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame114_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_114_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame114_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_114_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame115_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_115_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame115_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_115_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame116_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_116_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame116_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_116_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame117_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_117_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame117_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_117_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame118_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_118_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame118_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_118_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame119_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_119_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame119_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_119_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame120_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_120_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame120_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_120_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame121_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_121_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame121_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_121_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame122_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_122_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame122_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_122_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame123_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_123_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame123_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_123_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame124_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_124_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame124_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_124_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame125_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_125_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame125_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_125_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame126_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_126_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame126_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_126_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame127_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_127_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame127_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_127_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame128_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_128_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame128_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_128_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame129_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_129_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame129_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_129_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame130_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_130_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame130_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_130_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame131_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_131_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame131_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_131_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame132_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_132_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame132_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_132_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame133_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_133_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame133_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_133_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame134_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_134_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame134_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_134_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame135_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_135_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame135_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_135_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame136_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_136_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame136_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_136_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame137_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_137_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame137_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_137_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame138_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_138_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame138_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_138_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame139_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_139_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame139_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_139_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame140_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_140_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame140_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_140_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame141_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_141_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame141_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_141_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame142_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_142_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame142_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_142_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame143_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_143_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame143_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_143_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame144_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_144_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame144_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_144_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame145_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_145_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame145_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_145_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame146_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_146_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame146_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_146_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame147_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_147_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame147_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_147_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame148_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_148_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame148_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_148_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame149_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_149_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame149_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_149_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame150_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_150_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame150_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_150_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame151_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_151_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame151_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_151_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame152_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_152_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame152_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_152_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame153_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_153_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame153_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_153_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame154_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_154_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame154_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_154_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame155_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_155_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame155_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_155_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame156_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_156_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame156_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_156_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame157_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_157_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame157_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_157_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame158_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_158_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame158_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_158_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame159_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_159_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame159_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_159_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame160_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_160_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame160_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_160_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame161_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_161_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame161_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_161_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame162_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_162_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame162_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_162_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame163_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_163_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame163_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_163_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame164_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_164_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame164_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_164_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame165_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_165_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame165_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_165_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame166_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_166_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame166_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_166_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame167_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_167_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame167_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_167_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame168_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_168_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame168_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_168_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame169_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_169_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame169_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_169_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame170_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_170_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame170_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_170_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame171_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_171_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame171_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_171_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame172_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_172_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame172_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_172_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame173_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_173_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame173_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_173_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame174_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_174_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame174_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_174_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame175_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_175_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame175_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_175_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame176_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_176_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame176_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_176_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame177_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_177_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame177_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_177_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame178_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_178_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame178_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_178_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame179_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_179_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame179_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_179_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame180_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_180_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame180_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_180_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame181_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_181_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame181_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_181_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame182_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_182_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame182_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_182_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame183_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_183_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame183_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_183_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame184_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_184_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame184_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_184_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame185_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_185_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame185_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_185_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame186_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_186_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame186_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_186_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame187_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_187_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame187_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_187_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame188_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_188_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame188_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_188_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame189_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_189_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame189_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_189_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame190_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_190_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame190_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_190_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame191_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_191_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame191_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_191_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame192_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_192_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame192_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_192_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame193_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_193_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame193_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_193_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame194_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_194_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame194_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_194_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame195_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_195_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame195_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_195_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame196_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_196_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame196_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_196_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame197_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_197_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame197_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_197_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame198_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_198_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame198_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_198_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame199_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_199_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame199_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_199_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame200_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_200_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame200_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_200_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame201_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_201_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame201_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_201_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame202_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_202_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame202_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_202_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame203_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_203_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame203_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_203_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame204_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_204_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame204_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_204_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame205_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_205_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame205_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_205_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame206_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_206_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame206_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_206_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame207_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_207_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame207_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_207_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame208_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_208_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame208_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_208_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame209_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_209_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame209_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_209_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame210_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_210_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame210_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_210_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame211_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_211_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame211_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_211_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame212_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_212_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame212_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_212_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame213_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_213_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame213_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_213_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame214_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_214_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame214_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_214_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame215_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_215_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame215_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_215_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame216_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_216_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame216_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_216_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame217_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_217_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame217_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_217_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame218_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_218_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame218_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_218_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame219_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_219_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame219_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_219_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame220_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_220_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame220_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_220_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame221_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_221_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame221_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_221_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame222_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_222_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame222_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_222_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame223_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_223_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame223_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_223_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame224_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_224_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame224_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_224_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame225_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_225_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame225_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_225_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame226_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_226_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame226_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_226_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame227_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_227_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame227_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_227_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame228_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_228_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame228_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_228_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame229_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_229_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame229_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_229_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame230_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_230_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame230_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_230_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame231_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_231_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame231_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_231_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame232_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_232_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame232_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_232_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame233_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_233_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame233_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_233_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame234_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_234_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame234_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_234_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame235_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_235_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame235_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_235_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame236_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_236_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame236_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_236_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame237_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_237_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame237_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_237_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame238_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_238_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame238_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_238_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame239_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_239_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame239_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_239_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame240_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_240_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame240_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_240_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame241_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_241_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame241_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_241_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame242_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_242_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame242_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_242_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame243_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_243_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame243_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_243_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame244_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_244_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame244_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_244_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame245_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_245_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame245_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_245_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame246_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_246_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame246_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_246_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame247_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_247_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame247_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_247_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame248_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_248_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame248_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_248_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame249_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_249_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame249_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_249_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame250_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_250_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame250_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_250_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame251_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_251_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame251_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_251_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame252_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_252_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame252_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_252_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame253_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_253_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame253_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_253_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame254_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_254_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame254_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_254_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public open val frame255_texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_255_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public open val frame255_delaySec: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_255_DELAY_SEC, DOUBLE)
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
  public open fun setFrameTexture(frame: Long, texture: Texture2D): Unit {
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
  public open fun setFrameDelay(frame: Long, delay: Double): Unit {
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

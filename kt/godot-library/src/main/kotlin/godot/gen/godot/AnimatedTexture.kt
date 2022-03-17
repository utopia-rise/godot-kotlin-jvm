// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

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
 * [godot.AnimatedTexture] is a resource format for frame-based animations, where multiple textures can be chained automatically with a predefined delay for each frame. Unlike [godot.AnimationPlayer] or [godot.AnimatedSprite], it isn't a [godot.Node], but has the advantage of being usable anywhere a [godot.Texture] resource can be used, e.g. in a [godot.TileSet].
 *
 * The playback of the animation is controlled by the [fps] property as well as each frame's optional delay (see [setFrameDelay]). The animation loops, i.e. it will restart at frame 0 automatically after playing the last frame.
 *
 * [godot.AnimatedTexture] currently requires all frame textures to have the same size, otherwise the bigger ones will be cropped to match the smallest one.
 *
 * **Note:** AnimatedTexture doesn't support using [godot.AtlasTexture]s. Each frame needs to be a separate [godot.Texture].
 */
@GodotBaseType
public open class AnimatedTexture : Texture() {
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

  public open var frame0_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_0_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_0_DELAY_SEC, NIL)
    }

  public open var frame0_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_0_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_0_TEXTURE, NIL)
    }

  public open var frame1_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_1_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_1_DELAY_SEC, NIL)
    }

  public open var frame1_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_1_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_1_TEXTURE, NIL)
    }

  public open var frame10_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_10_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_10_DELAY_SEC, NIL)
    }

  public open var frame10_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 10L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_10_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 10L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_10_TEXTURE, NIL)
    }

  public open var frame100_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 100L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_100_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 100L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_100_DELAY_SEC, NIL)
    }

  public open var frame100_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 100L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_100_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 100L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_100_TEXTURE, NIL)
    }

  public open var frame101_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 101L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_101_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 101L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_101_DELAY_SEC, NIL)
    }

  public open var frame101_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 101L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_101_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 101L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_101_TEXTURE, NIL)
    }

  public open var frame102_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 102L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_102_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 102L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_102_DELAY_SEC, NIL)
    }

  public open var frame102_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 102L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_102_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 102L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_102_TEXTURE, NIL)
    }

  public open var frame103_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 103L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_103_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 103L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_103_DELAY_SEC, NIL)
    }

  public open var frame103_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 103L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_103_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 103L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_103_TEXTURE, NIL)
    }

  public open var frame104_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 104L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_104_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 104L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_104_DELAY_SEC, NIL)
    }

  public open var frame104_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 104L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_104_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 104L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_104_TEXTURE, NIL)
    }

  public open var frame105_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 105L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_105_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 105L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_105_DELAY_SEC, NIL)
    }

  public open var frame105_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 105L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_105_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 105L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_105_TEXTURE, NIL)
    }

  public open var frame106_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 106L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_106_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 106L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_106_DELAY_SEC, NIL)
    }

  public open var frame106_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 106L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_106_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 106L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_106_TEXTURE, NIL)
    }

  public open var frame107_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 107L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_107_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 107L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_107_DELAY_SEC, NIL)
    }

  public open var frame107_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 107L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_107_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 107L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_107_TEXTURE, NIL)
    }

  public open var frame108_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 108L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_108_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 108L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_108_DELAY_SEC, NIL)
    }

  public open var frame108_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 108L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_108_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 108L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_108_TEXTURE, NIL)
    }

  public open var frame109_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 109L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_109_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 109L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_109_DELAY_SEC, NIL)
    }

  public open var frame109_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 109L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_109_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 109L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_109_TEXTURE, NIL)
    }

  public open var frame11_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_11_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_11_DELAY_SEC, NIL)
    }

  public open var frame11_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 11L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_11_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 11L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_11_TEXTURE, NIL)
    }

  public open var frame110_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 110L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_110_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 110L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_110_DELAY_SEC, NIL)
    }

  public open var frame110_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 110L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_110_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 110L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_110_TEXTURE, NIL)
    }

  public open var frame111_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 111L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_111_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 111L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_111_DELAY_SEC, NIL)
    }

  public open var frame111_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 111L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_111_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 111L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_111_TEXTURE, NIL)
    }

  public open var frame112_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 112L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_112_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 112L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_112_DELAY_SEC, NIL)
    }

  public open var frame112_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 112L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_112_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 112L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_112_TEXTURE, NIL)
    }

  public open var frame113_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 113L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_113_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 113L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_113_DELAY_SEC, NIL)
    }

  public open var frame113_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 113L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_113_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 113L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_113_TEXTURE, NIL)
    }

  public open var frame114_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 114L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_114_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 114L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_114_DELAY_SEC, NIL)
    }

  public open var frame114_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 114L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_114_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 114L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_114_TEXTURE, NIL)
    }

  public open var frame115_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 115L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_115_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 115L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_115_DELAY_SEC, NIL)
    }

  public open var frame115_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 115L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_115_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 115L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_115_TEXTURE, NIL)
    }

  public open var frame116_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 116L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_116_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 116L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_116_DELAY_SEC, NIL)
    }

  public open var frame116_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 116L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_116_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 116L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_116_TEXTURE, NIL)
    }

  public open var frame117_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 117L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_117_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 117L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_117_DELAY_SEC, NIL)
    }

  public open var frame117_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 117L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_117_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 117L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_117_TEXTURE, NIL)
    }

  public open var frame118_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 118L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_118_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 118L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_118_DELAY_SEC, NIL)
    }

  public open var frame118_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 118L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_118_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 118L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_118_TEXTURE, NIL)
    }

  public open var frame119_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 119L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_119_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 119L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_119_DELAY_SEC, NIL)
    }

  public open var frame119_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 119L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_119_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 119L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_119_TEXTURE, NIL)
    }

  public open var frame12_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 12L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_12_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 12L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_12_DELAY_SEC, NIL)
    }

  public open var frame12_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 12L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_12_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 12L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_12_TEXTURE, NIL)
    }

  public open var frame120_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 120L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_120_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 120L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_120_DELAY_SEC, NIL)
    }

  public open var frame120_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 120L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_120_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 120L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_120_TEXTURE, NIL)
    }

  public open var frame121_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 121L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_121_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 121L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_121_DELAY_SEC, NIL)
    }

  public open var frame121_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 121L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_121_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 121L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_121_TEXTURE, NIL)
    }

  public open var frame122_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 122L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_122_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 122L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_122_DELAY_SEC, NIL)
    }

  public open var frame122_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 122L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_122_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 122L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_122_TEXTURE, NIL)
    }

  public open var frame123_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 123L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_123_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 123L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_123_DELAY_SEC, NIL)
    }

  public open var frame123_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 123L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_123_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 123L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_123_TEXTURE, NIL)
    }

  public open var frame124_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 124L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_124_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 124L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_124_DELAY_SEC, NIL)
    }

  public open var frame124_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 124L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_124_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 124L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_124_TEXTURE, NIL)
    }

  public open var frame125_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 125L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_125_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 125L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_125_DELAY_SEC, NIL)
    }

  public open var frame125_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 125L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_125_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 125L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_125_TEXTURE, NIL)
    }

  public open var frame126_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 126L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_126_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 126L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_126_DELAY_SEC, NIL)
    }

  public open var frame126_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 126L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_126_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 126L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_126_TEXTURE, NIL)
    }

  public open var frame127_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 127L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_127_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 127L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_127_DELAY_SEC, NIL)
    }

  public open var frame127_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 127L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_127_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 127L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_127_TEXTURE, NIL)
    }

  public open var frame128_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 128L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_128_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 128L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_128_DELAY_SEC, NIL)
    }

  public open var frame128_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 128L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_128_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 128L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_128_TEXTURE, NIL)
    }

  public open var frame129_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 129L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_129_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 129L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_129_DELAY_SEC, NIL)
    }

  public open var frame129_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 129L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_129_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 129L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_129_TEXTURE, NIL)
    }

  public open var frame13_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 13L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_13_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 13L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_13_DELAY_SEC, NIL)
    }

  public open var frame13_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 13L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_13_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 13L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_13_TEXTURE, NIL)
    }

  public open var frame130_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 130L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_130_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 130L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_130_DELAY_SEC, NIL)
    }

  public open var frame130_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 130L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_130_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 130L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_130_TEXTURE, NIL)
    }

  public open var frame131_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 131L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_131_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 131L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_131_DELAY_SEC, NIL)
    }

  public open var frame131_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 131L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_131_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 131L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_131_TEXTURE, NIL)
    }

  public open var frame132_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 132L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_132_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 132L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_132_DELAY_SEC, NIL)
    }

  public open var frame132_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 132L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_132_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 132L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_132_TEXTURE, NIL)
    }

  public open var frame133_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 133L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_133_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 133L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_133_DELAY_SEC, NIL)
    }

  public open var frame133_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 133L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_133_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 133L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_133_TEXTURE, NIL)
    }

  public open var frame134_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 134L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_134_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 134L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_134_DELAY_SEC, NIL)
    }

  public open var frame134_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 134L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_134_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 134L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_134_TEXTURE, NIL)
    }

  public open var frame135_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 135L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_135_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 135L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_135_DELAY_SEC, NIL)
    }

  public open var frame135_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 135L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_135_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 135L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_135_TEXTURE, NIL)
    }

  public open var frame136_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 136L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_136_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 136L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_136_DELAY_SEC, NIL)
    }

  public open var frame136_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 136L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_136_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 136L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_136_TEXTURE, NIL)
    }

  public open var frame137_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 137L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_137_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 137L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_137_DELAY_SEC, NIL)
    }

  public open var frame137_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 137L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_137_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 137L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_137_TEXTURE, NIL)
    }

  public open var frame138_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 138L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_138_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 138L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_138_DELAY_SEC, NIL)
    }

  public open var frame138_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 138L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_138_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 138L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_138_TEXTURE, NIL)
    }

  public open var frame139_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 139L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_139_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 139L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_139_DELAY_SEC, NIL)
    }

  public open var frame139_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 139L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_139_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 139L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_139_TEXTURE, NIL)
    }

  public open var frame14_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 14L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_14_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 14L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_14_DELAY_SEC, NIL)
    }

  public open var frame14_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 14L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_14_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 14L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_14_TEXTURE, NIL)
    }

  public open var frame140_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 140L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_140_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 140L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_140_DELAY_SEC, NIL)
    }

  public open var frame140_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 140L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_140_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 140L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_140_TEXTURE, NIL)
    }

  public open var frame141_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 141L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_141_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 141L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_141_DELAY_SEC, NIL)
    }

  public open var frame141_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 141L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_141_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 141L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_141_TEXTURE, NIL)
    }

  public open var frame142_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 142L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_142_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 142L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_142_DELAY_SEC, NIL)
    }

  public open var frame142_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 142L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_142_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 142L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_142_TEXTURE, NIL)
    }

  public open var frame143_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 143L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_143_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 143L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_143_DELAY_SEC, NIL)
    }

  public open var frame143_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 143L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_143_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 143L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_143_TEXTURE, NIL)
    }

  public open var frame144_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 144L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_144_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 144L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_144_DELAY_SEC, NIL)
    }

  public open var frame144_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 144L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_144_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 144L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_144_TEXTURE, NIL)
    }

  public open var frame145_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 145L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_145_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 145L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_145_DELAY_SEC, NIL)
    }

  public open var frame145_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 145L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_145_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 145L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_145_TEXTURE, NIL)
    }

  public open var frame146_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 146L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_146_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 146L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_146_DELAY_SEC, NIL)
    }

  public open var frame146_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 146L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_146_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 146L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_146_TEXTURE, NIL)
    }

  public open var frame147_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 147L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_147_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 147L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_147_DELAY_SEC, NIL)
    }

  public open var frame147_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 147L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_147_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 147L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_147_TEXTURE, NIL)
    }

  public open var frame148_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 148L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_148_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 148L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_148_DELAY_SEC, NIL)
    }

  public open var frame148_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 148L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_148_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 148L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_148_TEXTURE, NIL)
    }

  public open var frame149_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 149L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_149_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 149L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_149_DELAY_SEC, NIL)
    }

  public open var frame149_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 149L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_149_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 149L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_149_TEXTURE, NIL)
    }

  public open var frame15_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 15L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_15_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 15L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_15_DELAY_SEC, NIL)
    }

  public open var frame15_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 15L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_15_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 15L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_15_TEXTURE, NIL)
    }

  public open var frame150_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 150L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_150_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 150L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_150_DELAY_SEC, NIL)
    }

  public open var frame150_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 150L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_150_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 150L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_150_TEXTURE, NIL)
    }

  public open var frame151_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 151L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_151_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 151L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_151_DELAY_SEC, NIL)
    }

  public open var frame151_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 151L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_151_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 151L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_151_TEXTURE, NIL)
    }

  public open var frame152_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 152L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_152_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 152L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_152_DELAY_SEC, NIL)
    }

  public open var frame152_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 152L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_152_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 152L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_152_TEXTURE, NIL)
    }

  public open var frame153_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 153L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_153_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 153L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_153_DELAY_SEC, NIL)
    }

  public open var frame153_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 153L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_153_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 153L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_153_TEXTURE, NIL)
    }

  public open var frame154_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 154L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_154_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 154L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_154_DELAY_SEC, NIL)
    }

  public open var frame154_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 154L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_154_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 154L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_154_TEXTURE, NIL)
    }

  public open var frame155_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 155L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_155_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 155L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_155_DELAY_SEC, NIL)
    }

  public open var frame155_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 155L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_155_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 155L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_155_TEXTURE, NIL)
    }

  public open var frame156_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 156L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_156_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 156L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_156_DELAY_SEC, NIL)
    }

  public open var frame156_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 156L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_156_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 156L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_156_TEXTURE, NIL)
    }

  public open var frame157_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 157L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_157_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 157L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_157_DELAY_SEC, NIL)
    }

  public open var frame157_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 157L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_157_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 157L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_157_TEXTURE, NIL)
    }

  public open var frame158_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 158L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_158_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 158L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_158_DELAY_SEC, NIL)
    }

  public open var frame158_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 158L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_158_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 158L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_158_TEXTURE, NIL)
    }

  public open var frame159_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 159L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_159_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 159L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_159_DELAY_SEC, NIL)
    }

  public open var frame159_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 159L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_159_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 159L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_159_TEXTURE, NIL)
    }

  public open var frame16_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 16L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_16_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 16L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_16_DELAY_SEC, NIL)
    }

  public open var frame16_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 16L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_16_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 16L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_16_TEXTURE, NIL)
    }

  public open var frame160_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 160L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_160_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 160L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_160_DELAY_SEC, NIL)
    }

  public open var frame160_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 160L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_160_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 160L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_160_TEXTURE, NIL)
    }

  public open var frame161_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 161L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_161_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 161L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_161_DELAY_SEC, NIL)
    }

  public open var frame161_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 161L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_161_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 161L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_161_TEXTURE, NIL)
    }

  public open var frame162_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 162L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_162_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 162L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_162_DELAY_SEC, NIL)
    }

  public open var frame162_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 162L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_162_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 162L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_162_TEXTURE, NIL)
    }

  public open var frame163_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 163L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_163_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 163L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_163_DELAY_SEC, NIL)
    }

  public open var frame163_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 163L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_163_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 163L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_163_TEXTURE, NIL)
    }

  public open var frame164_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 164L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_164_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 164L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_164_DELAY_SEC, NIL)
    }

  public open var frame164_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 164L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_164_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 164L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_164_TEXTURE, NIL)
    }

  public open var frame165_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 165L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_165_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 165L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_165_DELAY_SEC, NIL)
    }

  public open var frame165_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 165L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_165_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 165L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_165_TEXTURE, NIL)
    }

  public open var frame166_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 166L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_166_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 166L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_166_DELAY_SEC, NIL)
    }

  public open var frame166_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 166L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_166_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 166L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_166_TEXTURE, NIL)
    }

  public open var frame167_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 167L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_167_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 167L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_167_DELAY_SEC, NIL)
    }

  public open var frame167_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 167L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_167_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 167L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_167_TEXTURE, NIL)
    }

  public open var frame168_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 168L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_168_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 168L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_168_DELAY_SEC, NIL)
    }

  public open var frame168_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 168L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_168_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 168L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_168_TEXTURE, NIL)
    }

  public open var frame169_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 169L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_169_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 169L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_169_DELAY_SEC, NIL)
    }

  public open var frame169_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 169L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_169_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 169L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_169_TEXTURE, NIL)
    }

  public open var frame17_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 17L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_17_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 17L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_17_DELAY_SEC, NIL)
    }

  public open var frame17_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 17L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_17_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 17L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_17_TEXTURE, NIL)
    }

  public open var frame170_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 170L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_170_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 170L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_170_DELAY_SEC, NIL)
    }

  public open var frame170_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 170L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_170_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 170L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_170_TEXTURE, NIL)
    }

  public open var frame171_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 171L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_171_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 171L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_171_DELAY_SEC, NIL)
    }

  public open var frame171_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 171L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_171_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 171L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_171_TEXTURE, NIL)
    }

  public open var frame172_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 172L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_172_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 172L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_172_DELAY_SEC, NIL)
    }

  public open var frame172_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 172L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_172_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 172L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_172_TEXTURE, NIL)
    }

  public open var frame173_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 173L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_173_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 173L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_173_DELAY_SEC, NIL)
    }

  public open var frame173_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 173L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_173_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 173L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_173_TEXTURE, NIL)
    }

  public open var frame174_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 174L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_174_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 174L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_174_DELAY_SEC, NIL)
    }

  public open var frame174_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 174L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_174_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 174L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_174_TEXTURE, NIL)
    }

  public open var frame175_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 175L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_175_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 175L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_175_DELAY_SEC, NIL)
    }

  public open var frame175_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 175L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_175_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 175L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_175_TEXTURE, NIL)
    }

  public open var frame176_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 176L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_176_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 176L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_176_DELAY_SEC, NIL)
    }

  public open var frame176_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 176L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_176_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 176L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_176_TEXTURE, NIL)
    }

  public open var frame177_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 177L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_177_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 177L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_177_DELAY_SEC, NIL)
    }

  public open var frame177_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 177L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_177_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 177L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_177_TEXTURE, NIL)
    }

  public open var frame178_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 178L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_178_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 178L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_178_DELAY_SEC, NIL)
    }

  public open var frame178_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 178L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_178_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 178L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_178_TEXTURE, NIL)
    }

  public open var frame179_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 179L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_179_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 179L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_179_DELAY_SEC, NIL)
    }

  public open var frame179_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 179L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_179_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 179L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_179_TEXTURE, NIL)
    }

  public open var frame18_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 18L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_18_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 18L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_18_DELAY_SEC, NIL)
    }

  public open var frame18_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 18L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_18_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 18L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_18_TEXTURE, NIL)
    }

  public open var frame180_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 180L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_180_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 180L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_180_DELAY_SEC, NIL)
    }

  public open var frame180_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 180L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_180_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 180L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_180_TEXTURE, NIL)
    }

  public open var frame181_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 181L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_181_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 181L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_181_DELAY_SEC, NIL)
    }

  public open var frame181_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 181L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_181_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 181L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_181_TEXTURE, NIL)
    }

  public open var frame182_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 182L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_182_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 182L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_182_DELAY_SEC, NIL)
    }

  public open var frame182_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 182L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_182_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 182L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_182_TEXTURE, NIL)
    }

  public open var frame183_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 183L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_183_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 183L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_183_DELAY_SEC, NIL)
    }

  public open var frame183_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 183L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_183_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 183L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_183_TEXTURE, NIL)
    }

  public open var frame184_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 184L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_184_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 184L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_184_DELAY_SEC, NIL)
    }

  public open var frame184_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 184L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_184_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 184L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_184_TEXTURE, NIL)
    }

  public open var frame185_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 185L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_185_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 185L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_185_DELAY_SEC, NIL)
    }

  public open var frame185_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 185L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_185_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 185L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_185_TEXTURE, NIL)
    }

  public open var frame186_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 186L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_186_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 186L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_186_DELAY_SEC, NIL)
    }

  public open var frame186_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 186L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_186_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 186L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_186_TEXTURE, NIL)
    }

  public open var frame187_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 187L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_187_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 187L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_187_DELAY_SEC, NIL)
    }

  public open var frame187_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 187L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_187_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 187L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_187_TEXTURE, NIL)
    }

  public open var frame188_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 188L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_188_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 188L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_188_DELAY_SEC, NIL)
    }

  public open var frame188_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 188L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_188_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 188L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_188_TEXTURE, NIL)
    }

  public open var frame189_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 189L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_189_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 189L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_189_DELAY_SEC, NIL)
    }

  public open var frame189_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 189L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_189_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 189L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_189_TEXTURE, NIL)
    }

  public open var frame19_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 19L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_19_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 19L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_19_DELAY_SEC, NIL)
    }

  public open var frame19_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 19L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_19_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 19L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_19_TEXTURE, NIL)
    }

  public open var frame190_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 190L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_190_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 190L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_190_DELAY_SEC, NIL)
    }

  public open var frame190_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 190L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_190_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 190L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_190_TEXTURE, NIL)
    }

  public open var frame191_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 191L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_191_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 191L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_191_DELAY_SEC, NIL)
    }

  public open var frame191_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 191L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_191_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 191L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_191_TEXTURE, NIL)
    }

  public open var frame192_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 192L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_192_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 192L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_192_DELAY_SEC, NIL)
    }

  public open var frame192_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 192L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_192_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 192L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_192_TEXTURE, NIL)
    }

  public open var frame193_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 193L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_193_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 193L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_193_DELAY_SEC, NIL)
    }

  public open var frame193_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 193L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_193_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 193L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_193_TEXTURE, NIL)
    }

  public open var frame194_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 194L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_194_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 194L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_194_DELAY_SEC, NIL)
    }

  public open var frame194_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 194L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_194_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 194L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_194_TEXTURE, NIL)
    }

  public open var frame195_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 195L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_195_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 195L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_195_DELAY_SEC, NIL)
    }

  public open var frame195_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 195L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_195_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 195L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_195_TEXTURE, NIL)
    }

  public open var frame196_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 196L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_196_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 196L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_196_DELAY_SEC, NIL)
    }

  public open var frame196_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 196L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_196_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 196L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_196_TEXTURE, NIL)
    }

  public open var frame197_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 197L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_197_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 197L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_197_DELAY_SEC, NIL)
    }

  public open var frame197_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 197L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_197_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 197L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_197_TEXTURE, NIL)
    }

  public open var frame198_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 198L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_198_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 198L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_198_DELAY_SEC, NIL)
    }

  public open var frame198_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 198L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_198_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 198L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_198_TEXTURE, NIL)
    }

  public open var frame199_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 199L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_199_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 199L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_199_DELAY_SEC, NIL)
    }

  public open var frame199_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 199L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_199_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 199L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_199_TEXTURE, NIL)
    }

  public open var frame2_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_2_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_2_DELAY_SEC, NIL)
    }

  public open var frame2_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_2_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_2_TEXTURE, NIL)
    }

  public open var frame20_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 20L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_20_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 20L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_20_DELAY_SEC, NIL)
    }

  public open var frame20_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 20L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_20_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 20L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_20_TEXTURE, NIL)
    }

  public open var frame200_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 200L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_200_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 200L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_200_DELAY_SEC, NIL)
    }

  public open var frame200_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 200L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_200_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 200L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_200_TEXTURE, NIL)
    }

  public open var frame201_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 201L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_201_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 201L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_201_DELAY_SEC, NIL)
    }

  public open var frame201_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 201L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_201_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 201L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_201_TEXTURE, NIL)
    }

  public open var frame202_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 202L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_202_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 202L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_202_DELAY_SEC, NIL)
    }

  public open var frame202_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 202L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_202_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 202L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_202_TEXTURE, NIL)
    }

  public open var frame203_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 203L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_203_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 203L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_203_DELAY_SEC, NIL)
    }

  public open var frame203_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 203L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_203_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 203L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_203_TEXTURE, NIL)
    }

  public open var frame204_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 204L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_204_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 204L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_204_DELAY_SEC, NIL)
    }

  public open var frame204_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 204L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_204_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 204L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_204_TEXTURE, NIL)
    }

  public open var frame205_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 205L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_205_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 205L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_205_DELAY_SEC, NIL)
    }

  public open var frame205_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 205L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_205_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 205L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_205_TEXTURE, NIL)
    }

  public open var frame206_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 206L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_206_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 206L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_206_DELAY_SEC, NIL)
    }

  public open var frame206_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 206L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_206_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 206L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_206_TEXTURE, NIL)
    }

  public open var frame207_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 207L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_207_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 207L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_207_DELAY_SEC, NIL)
    }

  public open var frame207_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 207L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_207_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 207L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_207_TEXTURE, NIL)
    }

  public open var frame208_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 208L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_208_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 208L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_208_DELAY_SEC, NIL)
    }

  public open var frame208_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 208L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_208_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 208L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_208_TEXTURE, NIL)
    }

  public open var frame209_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 209L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_209_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 209L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_209_DELAY_SEC, NIL)
    }

  public open var frame209_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 209L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_209_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 209L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_209_TEXTURE, NIL)
    }

  public open var frame21_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 21L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_21_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 21L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_21_DELAY_SEC, NIL)
    }

  public open var frame21_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 21L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_21_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 21L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_21_TEXTURE, NIL)
    }

  public open var frame210_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 210L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_210_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 210L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_210_DELAY_SEC, NIL)
    }

  public open var frame210_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 210L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_210_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 210L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_210_TEXTURE, NIL)
    }

  public open var frame211_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 211L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_211_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 211L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_211_DELAY_SEC, NIL)
    }

  public open var frame211_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 211L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_211_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 211L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_211_TEXTURE, NIL)
    }

  public open var frame212_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 212L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_212_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 212L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_212_DELAY_SEC, NIL)
    }

  public open var frame212_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 212L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_212_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 212L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_212_TEXTURE, NIL)
    }

  public open var frame213_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 213L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_213_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 213L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_213_DELAY_SEC, NIL)
    }

  public open var frame213_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 213L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_213_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 213L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_213_TEXTURE, NIL)
    }

  public open var frame214_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 214L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_214_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 214L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_214_DELAY_SEC, NIL)
    }

  public open var frame214_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 214L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_214_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 214L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_214_TEXTURE, NIL)
    }

  public open var frame215_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 215L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_215_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 215L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_215_DELAY_SEC, NIL)
    }

  public open var frame215_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 215L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_215_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 215L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_215_TEXTURE, NIL)
    }

  public open var frame216_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 216L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_216_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 216L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_216_DELAY_SEC, NIL)
    }

  public open var frame216_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 216L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_216_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 216L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_216_TEXTURE, NIL)
    }

  public open var frame217_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 217L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_217_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 217L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_217_DELAY_SEC, NIL)
    }

  public open var frame217_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 217L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_217_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 217L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_217_TEXTURE, NIL)
    }

  public open var frame218_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 218L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_218_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 218L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_218_DELAY_SEC, NIL)
    }

  public open var frame218_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 218L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_218_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 218L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_218_TEXTURE, NIL)
    }

  public open var frame219_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 219L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_219_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 219L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_219_DELAY_SEC, NIL)
    }

  public open var frame219_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 219L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_219_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 219L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_219_TEXTURE, NIL)
    }

  public open var frame22_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 22L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_22_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 22L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_22_DELAY_SEC, NIL)
    }

  public open var frame22_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 22L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_22_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 22L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_22_TEXTURE, NIL)
    }

  public open var frame220_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 220L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_220_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 220L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_220_DELAY_SEC, NIL)
    }

  public open var frame220_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 220L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_220_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 220L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_220_TEXTURE, NIL)
    }

  public open var frame221_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 221L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_221_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 221L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_221_DELAY_SEC, NIL)
    }

  public open var frame221_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 221L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_221_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 221L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_221_TEXTURE, NIL)
    }

  public open var frame222_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 222L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_222_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 222L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_222_DELAY_SEC, NIL)
    }

  public open var frame222_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 222L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_222_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 222L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_222_TEXTURE, NIL)
    }

  public open var frame223_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 223L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_223_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 223L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_223_DELAY_SEC, NIL)
    }

  public open var frame223_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 223L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_223_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 223L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_223_TEXTURE, NIL)
    }

  public open var frame224_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 224L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_224_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 224L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_224_DELAY_SEC, NIL)
    }

  public open var frame224_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 224L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_224_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 224L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_224_TEXTURE, NIL)
    }

  public open var frame225_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 225L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_225_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 225L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_225_DELAY_SEC, NIL)
    }

  public open var frame225_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 225L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_225_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 225L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_225_TEXTURE, NIL)
    }

  public open var frame226_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 226L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_226_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 226L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_226_DELAY_SEC, NIL)
    }

  public open var frame226_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 226L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_226_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 226L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_226_TEXTURE, NIL)
    }

  public open var frame227_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 227L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_227_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 227L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_227_DELAY_SEC, NIL)
    }

  public open var frame227_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 227L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_227_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 227L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_227_TEXTURE, NIL)
    }

  public open var frame228_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 228L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_228_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 228L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_228_DELAY_SEC, NIL)
    }

  public open var frame228_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 228L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_228_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 228L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_228_TEXTURE, NIL)
    }

  public open var frame229_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 229L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_229_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 229L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_229_DELAY_SEC, NIL)
    }

  public open var frame229_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 229L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_229_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 229L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_229_TEXTURE, NIL)
    }

  public open var frame23_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 23L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_23_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 23L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_23_DELAY_SEC, NIL)
    }

  public open var frame23_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 23L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_23_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 23L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_23_TEXTURE, NIL)
    }

  public open var frame230_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 230L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_230_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 230L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_230_DELAY_SEC, NIL)
    }

  public open var frame230_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 230L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_230_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 230L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_230_TEXTURE, NIL)
    }

  public open var frame231_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 231L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_231_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 231L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_231_DELAY_SEC, NIL)
    }

  public open var frame231_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 231L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_231_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 231L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_231_TEXTURE, NIL)
    }

  public open var frame232_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 232L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_232_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 232L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_232_DELAY_SEC, NIL)
    }

  public open var frame232_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 232L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_232_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 232L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_232_TEXTURE, NIL)
    }

  public open var frame233_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 233L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_233_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 233L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_233_DELAY_SEC, NIL)
    }

  public open var frame233_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 233L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_233_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 233L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_233_TEXTURE, NIL)
    }

  public open var frame234_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 234L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_234_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 234L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_234_DELAY_SEC, NIL)
    }

  public open var frame234_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 234L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_234_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 234L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_234_TEXTURE, NIL)
    }

  public open var frame235_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 235L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_235_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 235L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_235_DELAY_SEC, NIL)
    }

  public open var frame235_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 235L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_235_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 235L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_235_TEXTURE, NIL)
    }

  public open var frame236_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 236L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_236_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 236L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_236_DELAY_SEC, NIL)
    }

  public open var frame236_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 236L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_236_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 236L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_236_TEXTURE, NIL)
    }

  public open var frame237_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 237L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_237_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 237L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_237_DELAY_SEC, NIL)
    }

  public open var frame237_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 237L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_237_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 237L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_237_TEXTURE, NIL)
    }

  public open var frame238_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 238L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_238_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 238L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_238_DELAY_SEC, NIL)
    }

  public open var frame238_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 238L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_238_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 238L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_238_TEXTURE, NIL)
    }

  public open var frame239_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 239L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_239_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 239L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_239_DELAY_SEC, NIL)
    }

  public open var frame239_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 239L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_239_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 239L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_239_TEXTURE, NIL)
    }

  public open var frame24_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 24L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_24_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 24L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_24_DELAY_SEC, NIL)
    }

  public open var frame24_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 24L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_24_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 24L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_24_TEXTURE, NIL)
    }

  public open var frame240_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 240L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_240_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 240L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_240_DELAY_SEC, NIL)
    }

  public open var frame240_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 240L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_240_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 240L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_240_TEXTURE, NIL)
    }

  public open var frame241_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 241L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_241_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 241L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_241_DELAY_SEC, NIL)
    }

  public open var frame241_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 241L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_241_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 241L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_241_TEXTURE, NIL)
    }

  public open var frame242_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 242L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_242_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 242L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_242_DELAY_SEC, NIL)
    }

  public open var frame242_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 242L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_242_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 242L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_242_TEXTURE, NIL)
    }

  public open var frame243_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 243L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_243_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 243L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_243_DELAY_SEC, NIL)
    }

  public open var frame243_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 243L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_243_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 243L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_243_TEXTURE, NIL)
    }

  public open var frame244_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 244L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_244_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 244L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_244_DELAY_SEC, NIL)
    }

  public open var frame244_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 244L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_244_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 244L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_244_TEXTURE, NIL)
    }

  public open var frame245_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 245L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_245_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 245L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_245_DELAY_SEC, NIL)
    }

  public open var frame245_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 245L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_245_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 245L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_245_TEXTURE, NIL)
    }

  public open var frame246_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 246L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_246_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 246L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_246_DELAY_SEC, NIL)
    }

  public open var frame246_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 246L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_246_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 246L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_246_TEXTURE, NIL)
    }

  public open var frame247_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 247L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_247_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 247L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_247_DELAY_SEC, NIL)
    }

  public open var frame247_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 247L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_247_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 247L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_247_TEXTURE, NIL)
    }

  public open var frame248_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 248L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_248_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 248L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_248_DELAY_SEC, NIL)
    }

  public open var frame248_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 248L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_248_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 248L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_248_TEXTURE, NIL)
    }

  public open var frame249_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 249L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_249_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 249L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_249_DELAY_SEC, NIL)
    }

  public open var frame249_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 249L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_249_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 249L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_249_TEXTURE, NIL)
    }

  public open var frame25_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 25L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_25_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 25L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_25_DELAY_SEC, NIL)
    }

  public open var frame25_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 25L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_25_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 25L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_25_TEXTURE, NIL)
    }

  public open var frame250_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 250L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_250_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 250L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_250_DELAY_SEC, NIL)
    }

  public open var frame250_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 250L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_250_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 250L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_250_TEXTURE, NIL)
    }

  public open var frame251_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 251L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_251_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 251L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_251_DELAY_SEC, NIL)
    }

  public open var frame251_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 251L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_251_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 251L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_251_TEXTURE, NIL)
    }

  public open var frame252_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 252L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_252_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 252L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_252_DELAY_SEC, NIL)
    }

  public open var frame252_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 252L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_252_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 252L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_252_TEXTURE, NIL)
    }

  public open var frame253_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 253L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_253_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 253L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_253_DELAY_SEC, NIL)
    }

  public open var frame253_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 253L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_253_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 253L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_253_TEXTURE, NIL)
    }

  public open var frame254_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 254L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_254_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 254L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_254_DELAY_SEC, NIL)
    }

  public open var frame254_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 254L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_254_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 254L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_254_TEXTURE, NIL)
    }

  public open var frame255_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 255L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_255_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 255L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_255_DELAY_SEC, NIL)
    }

  public open var frame255_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 255L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_255_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 255L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_255_TEXTURE, NIL)
    }

  public open var frame26_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 26L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_26_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 26L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_26_DELAY_SEC, NIL)
    }

  public open var frame26_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 26L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_26_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 26L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_26_TEXTURE, NIL)
    }

  public open var frame27_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 27L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_27_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 27L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_27_DELAY_SEC, NIL)
    }

  public open var frame27_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 27L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_27_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 27L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_27_TEXTURE, NIL)
    }

  public open var frame28_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 28L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_28_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 28L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_28_DELAY_SEC, NIL)
    }

  public open var frame28_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 28L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_28_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 28L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_28_TEXTURE, NIL)
    }

  public open var frame29_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 29L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_29_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 29L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_29_DELAY_SEC, NIL)
    }

  public open var frame29_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 29L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_29_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 29L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_29_TEXTURE, NIL)
    }

  public open var frame3_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_3_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_3_DELAY_SEC, NIL)
    }

  public open var frame3_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_3_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_3_TEXTURE, NIL)
    }

  public open var frame30_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 30L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_30_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 30L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_30_DELAY_SEC, NIL)
    }

  public open var frame30_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 30L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_30_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 30L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_30_TEXTURE, NIL)
    }

  public open var frame31_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 31L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_31_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 31L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_31_DELAY_SEC, NIL)
    }

  public open var frame31_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 31L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_31_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 31L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_31_TEXTURE, NIL)
    }

  public open var frame32_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 32L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_32_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 32L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_32_DELAY_SEC, NIL)
    }

  public open var frame32_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 32L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_32_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 32L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_32_TEXTURE, NIL)
    }

  public open var frame33_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 33L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_33_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 33L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_33_DELAY_SEC, NIL)
    }

  public open var frame33_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 33L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_33_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 33L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_33_TEXTURE, NIL)
    }

  public open var frame34_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 34L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_34_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 34L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_34_DELAY_SEC, NIL)
    }

  public open var frame34_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 34L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_34_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 34L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_34_TEXTURE, NIL)
    }

  public open var frame35_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 35L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_35_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 35L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_35_DELAY_SEC, NIL)
    }

  public open var frame35_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 35L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_35_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 35L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_35_TEXTURE, NIL)
    }

  public open var frame36_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 36L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_36_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 36L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_36_DELAY_SEC, NIL)
    }

  public open var frame36_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 36L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_36_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 36L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_36_TEXTURE, NIL)
    }

  public open var frame37_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 37L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_37_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 37L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_37_DELAY_SEC, NIL)
    }

  public open var frame37_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 37L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_37_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 37L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_37_TEXTURE, NIL)
    }

  public open var frame38_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 38L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_38_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 38L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_38_DELAY_SEC, NIL)
    }

  public open var frame38_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 38L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_38_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 38L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_38_TEXTURE, NIL)
    }

  public open var frame39_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 39L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_39_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 39L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_39_DELAY_SEC, NIL)
    }

  public open var frame39_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 39L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_39_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 39L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_39_TEXTURE, NIL)
    }

  public open var frame4_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_4_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_4_DELAY_SEC, NIL)
    }

  public open var frame4_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_4_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_4_TEXTURE, NIL)
    }

  public open var frame40_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 40L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_40_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 40L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_40_DELAY_SEC, NIL)
    }

  public open var frame40_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 40L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_40_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 40L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_40_TEXTURE, NIL)
    }

  public open var frame41_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 41L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_41_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 41L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_41_DELAY_SEC, NIL)
    }

  public open var frame41_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 41L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_41_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 41L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_41_TEXTURE, NIL)
    }

  public open var frame42_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 42L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_42_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 42L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_42_DELAY_SEC, NIL)
    }

  public open var frame42_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 42L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_42_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 42L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_42_TEXTURE, NIL)
    }

  public open var frame43_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 43L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_43_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 43L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_43_DELAY_SEC, NIL)
    }

  public open var frame43_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 43L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_43_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 43L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_43_TEXTURE, NIL)
    }

  public open var frame44_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 44L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_44_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 44L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_44_DELAY_SEC, NIL)
    }

  public open var frame44_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 44L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_44_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 44L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_44_TEXTURE, NIL)
    }

  public open var frame45_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 45L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_45_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 45L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_45_DELAY_SEC, NIL)
    }

  public open var frame45_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 45L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_45_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 45L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_45_TEXTURE, NIL)
    }

  public open var frame46_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 46L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_46_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 46L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_46_DELAY_SEC, NIL)
    }

  public open var frame46_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 46L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_46_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 46L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_46_TEXTURE, NIL)
    }

  public open var frame47_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 47L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_47_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 47L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_47_DELAY_SEC, NIL)
    }

  public open var frame47_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 47L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_47_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 47L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_47_TEXTURE, NIL)
    }

  public open var frame48_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 48L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_48_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 48L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_48_DELAY_SEC, NIL)
    }

  public open var frame48_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 48L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_48_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 48L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_48_TEXTURE, NIL)
    }

  public open var frame49_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 49L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_49_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 49L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_49_DELAY_SEC, NIL)
    }

  public open var frame49_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 49L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_49_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 49L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_49_TEXTURE, NIL)
    }

  public open var frame5_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_5_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_5_DELAY_SEC, NIL)
    }

  public open var frame5_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_5_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_5_TEXTURE, NIL)
    }

  public open var frame50_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 50L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_50_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 50L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_50_DELAY_SEC, NIL)
    }

  public open var frame50_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 50L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_50_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 50L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_50_TEXTURE, NIL)
    }

  public open var frame51_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 51L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_51_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 51L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_51_DELAY_SEC, NIL)
    }

  public open var frame51_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 51L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_51_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 51L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_51_TEXTURE, NIL)
    }

  public open var frame52_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 52L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_52_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 52L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_52_DELAY_SEC, NIL)
    }

  public open var frame52_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 52L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_52_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 52L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_52_TEXTURE, NIL)
    }

  public open var frame53_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 53L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_53_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 53L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_53_DELAY_SEC, NIL)
    }

  public open var frame53_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 53L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_53_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 53L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_53_TEXTURE, NIL)
    }

  public open var frame54_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 54L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_54_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 54L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_54_DELAY_SEC, NIL)
    }

  public open var frame54_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 54L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_54_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 54L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_54_TEXTURE, NIL)
    }

  public open var frame55_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 55L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_55_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 55L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_55_DELAY_SEC, NIL)
    }

  public open var frame55_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 55L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_55_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 55L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_55_TEXTURE, NIL)
    }

  public open var frame56_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 56L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_56_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 56L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_56_DELAY_SEC, NIL)
    }

  public open var frame56_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 56L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_56_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 56L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_56_TEXTURE, NIL)
    }

  public open var frame57_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 57L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_57_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 57L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_57_DELAY_SEC, NIL)
    }

  public open var frame57_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 57L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_57_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 57L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_57_TEXTURE, NIL)
    }

  public open var frame58_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 58L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_58_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 58L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_58_DELAY_SEC, NIL)
    }

  public open var frame58_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 58L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_58_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 58L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_58_TEXTURE, NIL)
    }

  public open var frame59_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 59L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_59_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 59L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_59_DELAY_SEC, NIL)
    }

  public open var frame59_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 59L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_59_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 59L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_59_TEXTURE, NIL)
    }

  public open var frame6_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_6_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_6_DELAY_SEC, NIL)
    }

  public open var frame6_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_6_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_6_TEXTURE, NIL)
    }

  public open var frame60_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 60L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_60_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 60L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_60_DELAY_SEC, NIL)
    }

  public open var frame60_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 60L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_60_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 60L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_60_TEXTURE, NIL)
    }

  public open var frame61_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 61L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_61_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 61L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_61_DELAY_SEC, NIL)
    }

  public open var frame61_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 61L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_61_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 61L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_61_TEXTURE, NIL)
    }

  public open var frame62_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 62L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_62_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 62L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_62_DELAY_SEC, NIL)
    }

  public open var frame62_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 62L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_62_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 62L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_62_TEXTURE, NIL)
    }

  public open var frame63_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 63L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_63_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 63L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_63_DELAY_SEC, NIL)
    }

  public open var frame63_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 63L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_63_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 63L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_63_TEXTURE, NIL)
    }

  public open var frame64_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 64L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_64_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 64L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_64_DELAY_SEC, NIL)
    }

  public open var frame64_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 64L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_64_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 64L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_64_TEXTURE, NIL)
    }

  public open var frame65_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 65L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_65_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 65L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_65_DELAY_SEC, NIL)
    }

  public open var frame65_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 65L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_65_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 65L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_65_TEXTURE, NIL)
    }

  public open var frame66_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 66L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_66_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 66L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_66_DELAY_SEC, NIL)
    }

  public open var frame66_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 66L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_66_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 66L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_66_TEXTURE, NIL)
    }

  public open var frame67_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 67L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_67_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 67L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_67_DELAY_SEC, NIL)
    }

  public open var frame67_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 67L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_67_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 67L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_67_TEXTURE, NIL)
    }

  public open var frame68_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 68L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_68_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 68L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_68_DELAY_SEC, NIL)
    }

  public open var frame68_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 68L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_68_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 68L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_68_TEXTURE, NIL)
    }

  public open var frame69_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 69L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_69_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 69L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_69_DELAY_SEC, NIL)
    }

  public open var frame69_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 69L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_69_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 69L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_69_TEXTURE, NIL)
    }

  public open var frame7_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_7_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_7_DELAY_SEC, NIL)
    }

  public open var frame7_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 7L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_7_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 7L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_7_TEXTURE, NIL)
    }

  public open var frame70_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 70L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_70_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 70L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_70_DELAY_SEC, NIL)
    }

  public open var frame70_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 70L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_70_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 70L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_70_TEXTURE, NIL)
    }

  public open var frame71_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 71L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_71_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 71L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_71_DELAY_SEC, NIL)
    }

  public open var frame71_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 71L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_71_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 71L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_71_TEXTURE, NIL)
    }

  public open var frame72_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 72L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_72_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 72L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_72_DELAY_SEC, NIL)
    }

  public open var frame72_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 72L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_72_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 72L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_72_TEXTURE, NIL)
    }

  public open var frame73_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 73L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_73_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 73L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_73_DELAY_SEC, NIL)
    }

  public open var frame73_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 73L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_73_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 73L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_73_TEXTURE, NIL)
    }

  public open var frame74_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 74L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_74_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 74L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_74_DELAY_SEC, NIL)
    }

  public open var frame74_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 74L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_74_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 74L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_74_TEXTURE, NIL)
    }

  public open var frame75_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 75L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_75_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 75L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_75_DELAY_SEC, NIL)
    }

  public open var frame75_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 75L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_75_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 75L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_75_TEXTURE, NIL)
    }

  public open var frame76_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 76L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_76_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 76L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_76_DELAY_SEC, NIL)
    }

  public open var frame76_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 76L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_76_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 76L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_76_TEXTURE, NIL)
    }

  public open var frame77_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 77L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_77_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 77L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_77_DELAY_SEC, NIL)
    }

  public open var frame77_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 77L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_77_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 77L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_77_TEXTURE, NIL)
    }

  public open var frame78_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 78L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_78_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 78L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_78_DELAY_SEC, NIL)
    }

  public open var frame78_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 78L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_78_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 78L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_78_TEXTURE, NIL)
    }

  public open var frame79_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 79L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_79_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 79L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_79_DELAY_SEC, NIL)
    }

  public open var frame79_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 79L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_79_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 79L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_79_TEXTURE, NIL)
    }

  public open var frame8_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_8_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_8_DELAY_SEC, NIL)
    }

  public open var frame8_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 8L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_8_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 8L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_8_TEXTURE, NIL)
    }

  public open var frame80_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 80L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_80_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 80L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_80_DELAY_SEC, NIL)
    }

  public open var frame80_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 80L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_80_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 80L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_80_TEXTURE, NIL)
    }

  public open var frame81_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 81L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_81_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 81L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_81_DELAY_SEC, NIL)
    }

  public open var frame81_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 81L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_81_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 81L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_81_TEXTURE, NIL)
    }

  public open var frame82_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 82L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_82_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 82L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_82_DELAY_SEC, NIL)
    }

  public open var frame82_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 82L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_82_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 82L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_82_TEXTURE, NIL)
    }

  public open var frame83_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 83L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_83_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 83L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_83_DELAY_SEC, NIL)
    }

  public open var frame83_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 83L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_83_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 83L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_83_TEXTURE, NIL)
    }

  public open var frame84_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 84L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_84_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 84L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_84_DELAY_SEC, NIL)
    }

  public open var frame84_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 84L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_84_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 84L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_84_TEXTURE, NIL)
    }

  public open var frame85_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 85L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_85_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 85L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_85_DELAY_SEC, NIL)
    }

  public open var frame85_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 85L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_85_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 85L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_85_TEXTURE, NIL)
    }

  public open var frame86_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 86L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_86_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 86L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_86_DELAY_SEC, NIL)
    }

  public open var frame86_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 86L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_86_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 86L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_86_TEXTURE, NIL)
    }

  public open var frame87_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 87L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_87_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 87L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_87_DELAY_SEC, NIL)
    }

  public open var frame87_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 87L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_87_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 87L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_87_TEXTURE, NIL)
    }

  public open var frame88_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 88L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_88_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 88L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_88_DELAY_SEC, NIL)
    }

  public open var frame88_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 88L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_88_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 88L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_88_TEXTURE, NIL)
    }

  public open var frame89_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 89L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_89_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 89L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_89_DELAY_SEC, NIL)
    }

  public open var frame89_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 89L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_89_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 89L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_89_TEXTURE, NIL)
    }

  public open var frame9_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_9_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_9_DELAY_SEC, NIL)
    }

  public open var frame9_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 9L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_9_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 9L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_9_TEXTURE, NIL)
    }

  public open var frame90_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 90L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_90_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 90L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_90_DELAY_SEC, NIL)
    }

  public open var frame90_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 90L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_90_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 90L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_90_TEXTURE, NIL)
    }

  public open var frame91_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 91L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_91_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 91L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_91_DELAY_SEC, NIL)
    }

  public open var frame91_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 91L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_91_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 91L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_91_TEXTURE, NIL)
    }

  public open var frame92_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 92L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_92_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 92L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_92_DELAY_SEC, NIL)
    }

  public open var frame92_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 92L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_92_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 92L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_92_TEXTURE, NIL)
    }

  public open var frame93_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 93L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_93_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 93L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_93_DELAY_SEC, NIL)
    }

  public open var frame93_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 93L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_93_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 93L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_93_TEXTURE, NIL)
    }

  public open var frame94_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 94L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_94_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 94L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_94_DELAY_SEC, NIL)
    }

  public open var frame94_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 94L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_94_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 94L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_94_TEXTURE, NIL)
    }

  public open var frame95_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 95L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_95_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 95L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_95_DELAY_SEC, NIL)
    }

  public open var frame95_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 95L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_95_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 95L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_95_TEXTURE, NIL)
    }

  public open var frame96_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 96L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_96_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 96L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_96_DELAY_SEC, NIL)
    }

  public open var frame96_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 96L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_96_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 96L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_96_TEXTURE, NIL)
    }

  public open var frame97_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 97L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_97_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 97L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_97_DELAY_SEC, NIL)
    }

  public open var frame97_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 97L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_97_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 97L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_97_TEXTURE, NIL)
    }

  public open var frame98_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 98L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_98_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 98L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_98_DELAY_SEC, NIL)
    }

  public open var frame98_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 98L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_98_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 98L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_98_TEXTURE, NIL)
    }

  public open var frame99_delaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 99L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_99_DELAY_SEC, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 99L, DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_99_DELAY_SEC, NIL)
    }

  public open var frame99_texture: Texture?
    get() {
      TransferContext.writeArguments(LONG to 99L)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_99_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 99L, OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_SET_FRAME_99_TEXTURE, NIL)
    }

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

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ANIMATEDTEXTURE)
  }

  public open fun _updateProxy(): Unit {
  }

  public companion object {
    /**
     * The maximum number of frames supported by [godot.AnimatedTexture]. If you need more frames in your animation, use [godot.AnimationPlayer] or [godot.AnimatedSprite].
     */
    public final const val MAX_FRAMES: Long = 256
  }
}

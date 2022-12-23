// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Proxy texture for simple frame-based animations.
 *
 * [godot.AnimatedTexture] is a resource format for frame-based animations, where multiple textures can be chained automatically with a predefined delay for each frame. Unlike [godot.AnimationPlayer] or [godot.AnimatedSprite2D], it isn't a [godot.Node], but has the advantage of being usable anywhere a [godot.Texture2D] resource can be used, e.g. in a [godot.TileSet].
 *
 * The playback of the animation is controlled by the [speedScale] property, as well as each frame's duration (see [setFrameDuration]). The animation loops, i.e. it will restart at frame 0 automatically after playing the last frame.
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

  public val frame0Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 0)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame0DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 0)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame1Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 1)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame1DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 1)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame2Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 2)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame2DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 2)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame3Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 3)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame3DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 3)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame4Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 4)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame4DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 4)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame5Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 5)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame5DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 5)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame6Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 6)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame6DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 6)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame7Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 7)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame7DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 7)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame8Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 8)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame8DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 8)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame9Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 9)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame9DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 9)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame10Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 10)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame10DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 10)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame11Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 11)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame11DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 11)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame12Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 12)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame12DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 12)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame13Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 13)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame13DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 13)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame14Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 14)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame14DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 14)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame15Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 15)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame15DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 15)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame16Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 16)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame16DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 16)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame17Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 17)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame17DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 17)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame18Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 18)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame18DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 18)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame19Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 19)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame19DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 19)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame20Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 20)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame20DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 20)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame21Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 21)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame21DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 21)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame22Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 22)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame22DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 22)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame23Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 23)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame23DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 23)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame24Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 24)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame24DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 24)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame25Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 25)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame25DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 25)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame26Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 26)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame26DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 26)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame27Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 27)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame27DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 27)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame28Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 28)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame28DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 28)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame29Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 29)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame29DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 29)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame30Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 30)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame30DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 30)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame31Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 31)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame31DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 31)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame32Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 32)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame32DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 32)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame33Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 33)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame33DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 33)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame34Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 34)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame34DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 34)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame35Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 35)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame35DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 35)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame36Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 36)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame36DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 36)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame37Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 37)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame37DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 37)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame38Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 38)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame38DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 38)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame39Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 39)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame39DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 39)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame40Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 40)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame40DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 40)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame41Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 41)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame41DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 41)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame42Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 42)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame42DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 42)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame43Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 43)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame43DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 43)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame44Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 44)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame44DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 44)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame45Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 45)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame45DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 45)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame46Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 46)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame46DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 46)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame47Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 47)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame47DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 47)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame48Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 48)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame48DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 48)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame49Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 49)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame49DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 49)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame50Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 50)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame50DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 50)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame51Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 51)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame51DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 51)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame52Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 52)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame52DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 52)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame53Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 53)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame53DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 53)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame54Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 54)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame54DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 54)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame55Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 55)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame55DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 55)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame56Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 56)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame56DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 56)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame57Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 57)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame57DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 57)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame58Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 58)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame58DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 58)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame59Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 59)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame59DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 59)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame60Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 60)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame60DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 60)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame61Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 61)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame61DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 61)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame62Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 62)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame62DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 62)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame63Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 63)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame63DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 63)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame64Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 64)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame64DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 64)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame65Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 65)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame65DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 65)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame66Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 66)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame66DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 66)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame67Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 67)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame67DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 67)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame68Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 68)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame68DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 68)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame69Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 69)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame69DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 69)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame70Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 70)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame70DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 70)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame71Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 71)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame71DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 71)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame72Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 72)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame72DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 72)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame73Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 73)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame73DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 73)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame74Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 74)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame74DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 74)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame75Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 75)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame75DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 75)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame76Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 76)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame76DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 76)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame77Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 77)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame77DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 77)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame78Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 78)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame78DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 78)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame79Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 79)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame79DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 79)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame80Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 80)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame80DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 80)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame81Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 81)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame81DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 81)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame82Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 82)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame82DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 82)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame83Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 83)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame83DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 83)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame84Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 84)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame84DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 84)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame85Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 85)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame85DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 85)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame86Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 86)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame86DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 86)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame87Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 87)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame87DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 87)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame88Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 88)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame88DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 88)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame89Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 89)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame89DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 89)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame90Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 90)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame90DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 90)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame91Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 91)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame91DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 91)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame92Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 92)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame92DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 92)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame93Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 93)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame93DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 93)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame94Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 94)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame94DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 94)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame95Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 95)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame95DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 95)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame96Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 96)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame96DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 96)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame97Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 97)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame97DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 97)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame98Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 98)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame98DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 98)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame99Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 99)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame99DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 99)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame100Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 100)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame100DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 100)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame101Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 101)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame101DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 101)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame102Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 102)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame102DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 102)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame103Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 103)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame103DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 103)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame104Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 104)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame104DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 104)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame105Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 105)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame105DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 105)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame106Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 106)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame106DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 106)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame107Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 107)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame107DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 107)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame108Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 108)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame108DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 108)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame109Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 109)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame109DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 109)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame110Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 110)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame110DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 110)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame111Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 111)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame111DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 111)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame112Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 112)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame112DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 112)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame113Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 113)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame113DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 113)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame114Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 114)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame114DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 114)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame115Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 115)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame115DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 115)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame116Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 116)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame116DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 116)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame117Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 117)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame117DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 117)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame118Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 118)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame118DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 118)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame119Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 119)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame119DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 119)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame120Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 120)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame120DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 120)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame121Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 121)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame121DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 121)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame122Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 122)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame122DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 122)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame123Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 123)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame123DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 123)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame124Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 124)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame124DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 124)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame125Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 125)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame125DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 125)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame126Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 126)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame126DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 126)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame127Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 127)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame127DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 127)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame128Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 128)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame128DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 128)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame129Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 129)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame129DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 129)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame130Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 130)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame130DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 130)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame131Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 131)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame131DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 131)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame132Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 132)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame132DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 132)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame133Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 133)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame133DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 133)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame134Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 134)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame134DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 134)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame135Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 135)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame135DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 135)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame136Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 136)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame136DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 136)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame137Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 137)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame137DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 137)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame138Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 138)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame138DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 138)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame139Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 139)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame139DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 139)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame140Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 140)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame140DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 140)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame141Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 141)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame141DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 141)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame142Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 142)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame142DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 142)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame143Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 143)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame143DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 143)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame144Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 144)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame144DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 144)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame145Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 145)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame145DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 145)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame146Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 146)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame146DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 146)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame147Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 147)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame147DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 147)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame148Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 148)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame148DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 148)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame149Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 149)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame149DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 149)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame150Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 150)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame150DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 150)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame151Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 151)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame151DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 151)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame152Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 152)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame152DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 152)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame153Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 153)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame153DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 153)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame154Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 154)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame154DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 154)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame155Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 155)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame155DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 155)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame156Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 156)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame156DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 156)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame157Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 157)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame157DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 157)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame158Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 158)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame158DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 158)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame159Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 159)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame159DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 159)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame160Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 160)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame160DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 160)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame161Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 161)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame161DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 161)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame162Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 162)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame162DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 162)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame163Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 163)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame163DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 163)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame164Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 164)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame164DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 164)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame165Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 165)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame165DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 165)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame166Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 166)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame166DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 166)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame167Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 167)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame167DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 167)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame168Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 168)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame168DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 168)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame169Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 169)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame169DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 169)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame170Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 170)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame170DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 170)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame171Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 171)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame171DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 171)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame172Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 172)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame172DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 172)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame173Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 173)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame173DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 173)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame174Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 174)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame174DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 174)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame175Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 175)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame175DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 175)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame176Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 176)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame176DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 176)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame177Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 177)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame177DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 177)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame178Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 178)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame178DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 178)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame179Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 179)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame179DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 179)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame180Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 180)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame180DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 180)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame181Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 181)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame181DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 181)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame182Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 182)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame182DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 182)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame183Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 183)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame183DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 183)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame184Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 184)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame184DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 184)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame185Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 185)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame185DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 185)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame186Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 186)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame186DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 186)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame187Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 187)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame187DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 187)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame188Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 188)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame188DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 188)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame189Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 189)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame189DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 189)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame190Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 190)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame190DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 190)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame191Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 191)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame191DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 191)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame192Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 192)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame192DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 192)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame193Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 193)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame193DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 193)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame194Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 194)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame194DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 194)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame195Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 195)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame195DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 195)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame196Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 196)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame196DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 196)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame197Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 197)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame197DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 197)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame198Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 198)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame198DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 198)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame199Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 199)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame199DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 199)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame200Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 200)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame200DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 200)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame201Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 201)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame201DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 201)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame202Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 202)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame202DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 202)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame203Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 203)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame203DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 203)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame204Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 204)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame204DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 204)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame205Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 205)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame205DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 205)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame206Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 206)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame206DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 206)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame207Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 207)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame207DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 207)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame208Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 208)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame208DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 208)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame209Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 209)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame209DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 209)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame210Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 210)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame210DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 210)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame211Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 211)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame211DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 211)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame212Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 212)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame212DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 212)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame213Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 213)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame213DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 213)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame214Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 214)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame214DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 214)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame215Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 215)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame215DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 215)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame216Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 216)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame216DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 216)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame217Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 217)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame217DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 217)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame218Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 218)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame218DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 218)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame219Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 219)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame219DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 219)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame220Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 220)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame220DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 220)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame221Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 221)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame221DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 221)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame222Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 222)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame222DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 222)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame223Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 223)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame223DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 223)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame224Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 224)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame224DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 224)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame225Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 225)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame225DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 225)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame226Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 226)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame226DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 226)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame227Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 227)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame227DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 227)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame228Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 228)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame228DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 228)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame229Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 229)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame229DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 229)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame230Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 230)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame230DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 230)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame231Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 231)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame231DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 231)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame232Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 232)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame232DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 232)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame233Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 233)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame233DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 233)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame234Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 234)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame234DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 234)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame235Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 235)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame235DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 235)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame236Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 236)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame236DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 236)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame237Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 237)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame237DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 237)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame238Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 238)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame238DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 238)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame239Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 239)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame239DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 239)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame240Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 240)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame240DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 240)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame241Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 241)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame241DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 241)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame242Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 242)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame242DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 242)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame243Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 243)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame243DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 243)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame244Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 244)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame244DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 244)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame245Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 245)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame245DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 245)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame246Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 246)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame246DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 246)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame247Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 247)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame247DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 247)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame248Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 248)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame248DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 248)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame249Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 249)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame249DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 249)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame250Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 250)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame250DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 250)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame251Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 251)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame251DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 251)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame252Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 252)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame252DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 252)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame253Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 253)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame253DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 253)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame254Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 254)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame254DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 254)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public val frame255Texture: Texture2D?
    get() {
      TransferContext.writeArguments(LONG to 255)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }

  public val frame255DelaySec: Double
    get() {
      TransferContext.writeArguments(LONG to 255)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATEDTEXTURE_GET_FRAME_DELAY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATEDTEXTURE, scriptIndex)
    return true
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

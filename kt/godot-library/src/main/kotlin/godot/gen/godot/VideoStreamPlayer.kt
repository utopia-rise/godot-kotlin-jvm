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
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A control used for video playback.
 *
 * A control used for playback of [godot.VideoStream] resources.
 *
 * Supported video formats are [godot.Ogg Theora](https://www.theora.org/) (`.ogv`, [godot.VideoStreamTheora]) and any format exposed via a GDExtension plugin.
 *
 * **Note:** Due to a bug, VideoStreamPlayer does not support localization remapping yet.
 *
 * **Warning:** On Web, video playback *will* perform poorly due to missing architecture-specific assembly optimizations.
 */
@GodotBaseType
public open class VideoStreamPlayer : Control() {
  /**
   * Emitted when playback is finished.
   */
  public val finished: Signal0 by signal()

  /**
   * The embedded audio track to play.
   */
  public var audioTrack: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_GET_AUDIO_TRACK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_SET_AUDIO_TRACK,
          NIL)
    }

  /**
   * The assigned video stream. See description for supported formats.
   */
  public var stream: VideoStream?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_GET_STREAM,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as VideoStream?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_SET_STREAM, NIL)
    }

  /**
   * Audio volume in dB.
   */
  public var volumeDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_GET_VOLUME_DB,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_SET_VOLUME_DB,
          NIL)
    }

  /**
   * Audio volume as a linear value.
   */
  public var volume: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_GET_VOLUME,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_SET_VOLUME, NIL)
    }

  /**
   * If `true`, playback starts when the scene loads.
   */
  public var autoplay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_HAS_AUTOPLAY,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_SET_AUTOPLAY,
          NIL)
    }

  /**
   * If `true`, the video is paused.
   */
  public var paused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_IS_PAUSED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_SET_PAUSED, NIL)
    }

  /**
   * If `true`, the video scales to the control size. Otherwise, the control minimum size will be automatically adjusted to match the video stream's dimensions.
   */
  public var expand: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_HAS_EXPAND,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_SET_EXPAND, NIL)
    }

  /**
   * Amount of time in milliseconds to store in buffer while playing.
   */
  public var bufferingMsec: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_GET_BUFFERING_MSEC, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_SET_BUFFERING_MSEC, NIL)
    }

  /**
   * The current position of the stream, in seconds.
   *
   * **Note:** Changing this value won't have any effect as seeking is not implemented yet, except in video formats implemented by a GDExtension add-on.
   */
  public var streamPosition: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_GET_STREAM_POSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_SET_STREAM_POSITION, NIL)
    }

  /**
   * Audio bus to use for sound playback.
   */
  public var bus: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_GET_BUS,
          STRING_NAME)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_SET_BUS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VIDEOSTREAMPLAYER, scriptIndex)
    return true
  }

  /**
   * Starts the video playback from the beginning. If the video is paused, this will not unpause the video.
   */
  public fun play(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_PLAY, NIL)
  }

  /**
   * Stops the video playback and sets the stream position to 0.
   *
   * **Note:** Although the stream position will be set to 0, the first frame of the video stream won't become the current frame.
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_STOP, NIL)
  }

  /**
   * Returns `true` if the video is playing.
   *
   * **Note:** The video is still considered playing if paused during playback.
   */
  public fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_IS_PLAYING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the video stream's name, or `"<No Stream>"` if no video stream is assigned.
   */
  public fun getStreamName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_GET_STREAM_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the current frame as a [godot.Texture2D].
   */
  public fun getVideoTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAMPLAYER_GET_VIDEO_TEXTURE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  public companion object
}

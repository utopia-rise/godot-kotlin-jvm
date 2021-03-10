// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Control for playing video streams.
 *
 * Control node for playing video streams using [godot.VideoStream] resources.
 *
 * Supported video formats are [godot.WebM](https://www.webmproject.org/) ([godot.VideoStreamWebm]), [godot.Ogg Theora](https://www.theora.org/) ([godot.VideoStreamTheora]), and any format exposed via a GDNative plugin using [godot.VideoStreamGDNative].
 */
@GodotBaseType
open class VideoPlayer : Control() {
  /**
   * Emitted when playback is finished.
   */
  val finished: Signal0 by signal()

  /**
   * The embedded audio track to play.
   */
  open var audioTrack: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_GET_AUDIO_TRACK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_SET_AUDIO_TRACK, NIL)
    }

  /**
   * If `true`, playback starts when the scene loads.
   */
  open var autoplay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_GET_AUTOPLAY, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_SET_AUTOPLAY, NIL)
    }

  /**
   * Amount of time in milliseconds to store in buffer while playing.
   */
  open var bufferingMsec: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_GET_BUFFERING_MSEC,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_SET_BUFFERING_MSEC,
          NIL)
    }

  /**
   * Audio bus to use for sound playback.
   */
  open var bus: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_GET_BUS, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_SET_BUS, NIL)
    }

  /**
   * If `true`, the video scales to the control size. Otherwise, the control minimum size will be automatically adjusted to match the video stream's dimensions.
   */
  open var expand: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_GET_EXPAND, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_SET_EXPAND, NIL)
    }

  /**
   * If `true`, the video is paused.
   */
  open var paused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_GET_PAUSED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_SET_PAUSED, NIL)
    }

  /**
   * The assigned video stream. See description for supported formats.
   */
  open var stream: VideoStream?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_GET_STREAM, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as VideoStream?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_SET_STREAM, NIL)
    }

  /**
   * The current position of the stream, in seconds.
   */
  open var streamPosition: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_GET_STREAM_POSITION,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_SET_STREAM_POSITION,
          NIL)
    }

  /**
   * Audio volume as a linear value.
   */
  open var volume: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_GET_VOLUME, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_SET_VOLUME, NIL)
    }

  /**
   * Audio volume in dB.
   */
  open var volumeDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_GET_VOLUME_DB, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_SET_VOLUME_DB, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VIDEOPLAYER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  /**
   * Returns the video stream's name, or `"<No Stream>"` if no video stream is assigned.
   */
  open fun getStreamName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_GET_STREAM_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the current frame as a [godot.Texture].
   */
  open fun getVideoTexture(): Texture? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_GET_VIDEO_TEXTURE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  /**
   * Returns `true` if the video is playing.
   *
   * **Note:** The video is still considered playing if paused during playback.
   */
  open fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_IS_PLAYING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Starts the video playback from the beginning. If the video is paused, this will not unpause the video.
   */
  open fun play() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_PLAY, NIL)
  }

  /**
   * Stops the video playback and sets the stream position to 0.
   *
   * **Note:** Although the stream position will be set to 0, the first frame of the video stream won't become the current frame.
   */
  open fun stop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOPLAYER_STOP, NIL)
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A control used for playback of [VideoStream] resources.
 * Supported video formats are [url=https://www.theora.org/]Ogg Theora[/url] (`.ogv`,
 * [VideoStreamTheora]) and any format exposed via a GDExtension plugin.
 * **Warning:** On Web, video playback *will* perform poorly due to missing architecture-specific
 * assembly optimizations.
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
  public var audioTrack: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAudioTrackPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setAudioTrackPtr, NIL)
    }

  /**
   * The assigned video stream. See description for supported formats.
   */
  public var stream: VideoStream?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as VideoStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStreamPtr, NIL)
    }

  /**
   * Audio volume in dB.
   */
  public var volumeDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumeDbPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumeDbPtr, NIL)
    }

  /**
   * Audio volume as a linear value.
   */
  public var volume: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumePtr, NIL)
    }

  /**
   * If `true`, playback starts when the scene loads.
   */
  public var autoplay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.hasAutoplayPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoplayPtr, NIL)
    }

  /**
   * If `true`, the video is paused.
   */
  public var paused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPausedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPausedPtr, NIL)
    }

  /**
   * If `true`, the video scales to the control size. Otherwise, the control minimum size will be
   * automatically adjusted to match the video stream's dimensions.
   */
  public var expand: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.hasExpandPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExpandPtr, NIL)
    }

  /**
   * If `true`, the video restarts when it reaches its end.
   */
  public var loop: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.hasLoopPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLoopPtr, NIL)
    }

  /**
   * Amount of time in milliseconds to store in buffer while playing.
   */
  public var bufferingMsec: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBufferingMsecPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBufferingMsecPtr, NIL)
    }

  /**
   * The current position of the stream, in seconds.
   * **Note:** Changing this value won't have any effect as seeking is not implemented yet, except
   * in video formats implemented by a GDExtension add-on.
   */
  public var streamPosition: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStreamPositionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStreamPositionPtr, NIL)
    }

  /**
   * Audio bus to use for sound playback.
   */
  public var bus: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBusPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBusPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VIDEOSTREAMPLAYER, scriptIndex)
  }

  /**
   * Starts the video playback from the beginning. If the video is paused, this will not unpause the
   * video.
   */
  public fun play(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.playPtr, NIL)
  }

  /**
   * Stops the video playback and sets the stream position to 0.
   * **Note:** Although the stream position will be set to 0, the first frame of the video stream
   * won't become the current frame.
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  /**
   * Returns `true` if the video is playing.
   * **Note:** The video is still considered playing if paused during playback.
   */
  public fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPlayingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the video stream's name, or `"<No Stream>"` if no video stream is assigned.
   */
  public fun getStreamName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStreamNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * The length of the current stream, in seconds.
   * **Note:** For [VideoStreamTheora] streams (the built-in format supported by Godot), this value
   * will always be zero, as getting the stream length is not implemented yet. The feature may be
   * supported by video formats implemented by a GDExtension add-on.
   */
  public fun getStreamLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStreamLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns the current frame as a [Texture2D].
   */
  public fun getVideoTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVideoTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  public companion object

  internal object MethodBindings {
    public val setStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_stream", 2317102564)

    public val getStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_stream", 438621487)

    public val playPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "play", 3218959716)

    public val stopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "stop", 3218959716)

    public val isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "is_playing", 36873697)

    public val setPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_paused", 2586408642)

    public val isPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "is_paused", 36873697)

    public val setLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_loop", 2586408642)

    public val hasLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "has_loop", 36873697)

    public val setVolumePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_volume", 373806689)

    public val getVolumePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_volume", 1740695150)

    public val setVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_volume_db", 373806689)

    public val getVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_volume_db", 1740695150)

    public val setAudioTrackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_audio_track", 1286410249)

    public val getAudioTrackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_audio_track", 3905245786)

    public val getStreamNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_stream_name", 201670096)

    public val getStreamLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_stream_length", 1740695150)

    public val setStreamPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_stream_position", 373806689)

    public val getStreamPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_stream_position", 1740695150)

    public val setAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_autoplay", 2586408642)

    public val hasAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "has_autoplay", 36873697)

    public val setExpandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_expand", 2586408642)

    public val hasExpandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "has_expand", 36873697)

    public val setBufferingMsecPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_buffering_msec", 1286410249)

    public val getBufferingMsecPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_buffering_msec", 3905245786)

    public val setBusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_bus", 3304788590)

    public val getBusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_bus", 2002593661)

    public val getVideoTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_video_texture", 3635182373)
  }
}

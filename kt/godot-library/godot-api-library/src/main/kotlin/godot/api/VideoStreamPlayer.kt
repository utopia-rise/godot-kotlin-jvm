// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Signal0
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public val finished: Signal0 by Signal0

  /**
   * The embedded audio track to play.
   */
  public final inline var audioTrack: Int
    @JvmName("audioTrackProperty")
    get() = getAudioTrack()
    @JvmName("audioTrackProperty")
    set(`value`) {
      setAudioTrack(value)
    }

  /**
   * The assigned video stream. See description for supported formats.
   */
  public final inline var stream: VideoStream?
    @JvmName("streamProperty")
    get() = getStream()
    @JvmName("streamProperty")
    set(`value`) {
      setStream(value)
    }

  /**
   * Audio volume in dB.
   */
  public final inline var volumeDb: Float
    @JvmName("volumeDbProperty")
    get() = getVolumeDb()
    @JvmName("volumeDbProperty")
    set(`value`) {
      setVolumeDb(value)
    }

  /**
   * Audio volume as a linear value.
   */
  public final inline var volume: Float
    @JvmName("volumeProperty")
    get() = getVolume()
    @JvmName("volumeProperty")
    set(`value`) {
      setVolume(value)
    }

  /**
   * If `true`, playback starts when the scene loads.
   */
  public final inline var autoplay: Boolean
    @JvmName("autoplayProperty")
    get() = hasAutoplay()
    @JvmName("autoplayProperty")
    set(`value`) {
      setAutoplay(value)
    }

  /**
   * If `true`, the video is paused.
   */
  public final inline var paused: Boolean
    @JvmName("pausedProperty")
    get() = isPaused()
    @JvmName("pausedProperty")
    set(`value`) {
      setPaused(value)
    }

  /**
   * If `true`, the video scales to the control size. Otherwise, the control minimum size will be
   * automatically adjusted to match the video stream's dimensions.
   */
  public final inline var expand: Boolean
    @JvmName("expandProperty")
    get() = hasExpand()
    @JvmName("expandProperty")
    set(`value`) {
      setExpand(value)
    }

  /**
   * If `true`, the video restarts when it reaches its end.
   */
  public final inline var loop: Boolean
    @JvmName("loopProperty")
    get() = hasLoop()
    @JvmName("loopProperty")
    set(`value`) {
      setLoop(value)
    }

  /**
   * Amount of time in milliseconds to store in buffer while playing.
   */
  public final inline var bufferingMsec: Int
    @JvmName("bufferingMsecProperty")
    get() = getBufferingMsec()
    @JvmName("bufferingMsecProperty")
    set(`value`) {
      setBufferingMsec(value)
    }

  /**
   * The current position of the stream, in seconds.
   * **Note:** Changing this value won't have any effect as seeking is not implemented yet, except
   * in video formats implemented by a GDExtension add-on.
   */
  public final inline var streamPosition: Double
    @JvmName("streamPositionProperty")
    get() = getStreamPosition()
    @JvmName("streamPositionProperty")
    set(`value`) {
      setStreamPosition(value)
    }

  /**
   * Audio bus to use for sound playback.
   */
  public final inline var bus: StringName
    @JvmName("busProperty")
    get() = getBus()
    @JvmName("busProperty")
    set(`value`) {
      setBus(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(696, scriptIndex)
  }

  public final fun setStream(stream: VideoStream?): Unit {
    TransferContext.writeArguments(OBJECT to stream)
    TransferContext.callMethod(ptr, MethodBindings.setStreamPtr, NIL)
  }

  public final fun getStream(): VideoStream? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStreamPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as VideoStream?)
  }

  /**
   * Starts the video playback from the beginning. If the video is paused, this will not unpause the
   * video.
   */
  public final fun play(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.playPtr, NIL)
  }

  /**
   * Stops the video playback and sets the stream position to 0.
   * **Note:** Although the stream position will be set to 0, the first frame of the video stream
   * won't become the current frame.
   */
  public final fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.stopPtr, NIL)
  }

  /**
   * Returns `true` if the video is playing.
   * **Note:** The video is still considered playing if paused during playback.
   */
  public final fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPlayingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPaused(paused: Boolean): Unit {
    TransferContext.writeArguments(BOOL to paused)
    TransferContext.callMethod(ptr, MethodBindings.setPausedPtr, NIL)
  }

  public final fun isPaused(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPausedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setLoop(loop: Boolean): Unit {
    TransferContext.writeArguments(BOOL to loop)
    TransferContext.callMethod(ptr, MethodBindings.setLoopPtr, NIL)
  }

  public final fun hasLoop(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasLoopPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setVolume(volume: Float): Unit {
    TransferContext.writeArguments(DOUBLE to volume.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVolumePtr, NIL)
  }

  public final fun getVolume(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVolumePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVolumeDb(db: Float): Unit {
    TransferContext.writeArguments(DOUBLE to db.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVolumeDbPtr, NIL)
  }

  public final fun getVolumeDb(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVolumeDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAudioTrack(track: Int): Unit {
    TransferContext.writeArguments(LONG to track.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setAudioTrackPtr, NIL)
  }

  public final fun getAudioTrack(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAudioTrackPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the video stream's name, or `"<No Stream>"` if no video stream is assigned.
   */
  public final fun getStreamName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStreamNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * The length of the current stream, in seconds.
   * **Note:** For [VideoStreamTheora] streams (the built-in format supported by Godot), this value
   * will always be zero, as getting the stream length is not implemented yet. The feature may be
   * supported by video formats implemented by a GDExtension add-on.
   */
  public final fun getStreamLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStreamLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setStreamPosition(position: Double): Unit {
    TransferContext.writeArguments(DOUBLE to position)
    TransferContext.callMethod(ptr, MethodBindings.setStreamPositionPtr, NIL)
  }

  public final fun getStreamPosition(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStreamPositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setAutoplay(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setAutoplayPtr, NIL)
  }

  public final fun hasAutoplay(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasAutoplayPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setExpand(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setExpandPtr, NIL)
  }

  public final fun hasExpand(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasExpandPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setBufferingMsec(msec: Int): Unit {
    TransferContext.writeArguments(LONG to msec.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setBufferingMsecPtr, NIL)
  }

  public final fun getBufferingMsec(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBufferingMsecPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setBus(bus: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to bus)
    TransferContext.callMethod(ptr, MethodBindings.setBusPtr, NIL)
  }

  public final fun getBus(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBusPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Returns the current frame as a [Texture2D].
   */
  public final fun getVideoTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVideoTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public companion object

  public object MethodBindings {
    internal val setStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_stream", 2317102564)

    internal val getStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_stream", 438621487)

    internal val playPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "play", 3218959716)

    internal val stopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "stop", 3218959716)

    internal val isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "is_playing", 36873697)

    internal val setPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_paused", 2586408642)

    internal val isPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "is_paused", 36873697)

    internal val setLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_loop", 2586408642)

    internal val hasLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "has_loop", 36873697)

    internal val setVolumePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_volume", 373806689)

    internal val getVolumePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_volume", 1740695150)

    internal val setVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_volume_db", 373806689)

    internal val getVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_volume_db", 1740695150)

    internal val setAudioTrackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_audio_track", 1286410249)

    internal val getAudioTrackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_audio_track", 3905245786)

    internal val getStreamNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_stream_name", 201670096)

    internal val getStreamLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_stream_length", 1740695150)

    internal val setStreamPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_stream_position", 373806689)

    internal val getStreamPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_stream_position", 1740695150)

    internal val setAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_autoplay", 2586408642)

    internal val hasAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "has_autoplay", 36873697)

    internal val setExpandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_expand", 2586408642)

    internal val hasExpandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "has_expand", 36873697)

    internal val setBufferingMsecPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_buffering_msec", 1286410249)

    internal val getBufferingMsecPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_buffering_msec", 3905245786)

    internal val setBusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "set_bus", 3304788590)

    internal val getBusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_bus", 2002593661)

    internal val getVideoTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStreamPlayer", "get_video_texture", 3635182373)
  }
}

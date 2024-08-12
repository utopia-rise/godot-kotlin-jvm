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
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Plays an audio stream non-positionally.
 * To play audio positionally, use [AudioStreamPlayer2D] or [AudioStreamPlayer3D] instead of
 * [AudioStreamPlayer].
 */
@GodotBaseType
public open class AudioStreamPlayer : Node() {
  /**
   * Emitted when the audio stops playing.
   */
  public val finished: Signal0 by signal()

  /**
   * The [AudioStream] object to be played.
   */
  public var stream: AudioStream?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStreamPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStreamPtr, NIL)
    }

  /**
   * Volume of sound, in dB.
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
   * The pitch and the tempo of the audio, as a multiplier of the audio sample's sample rate.
   */
  public var pitchScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPitchScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPitchScalePtr, NIL)
    }

  /**
   * If `true`, audio is playing.
   */
  public val playing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isPlayingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }

  /**
   * If `true`, audio plays when added to scene tree.
   */
  public var autoplay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAutoplayEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoplayPtr, NIL)
    }

  /**
   * If `true`, the playback is paused. You can resume it by setting [streamPaused] to `false`.
   */
  public var streamPaused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStreamPausedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStreamPausedPtr, NIL)
    }

  /**
   * If the audio configuration has more than two speakers, this sets the target channels. See
   * [MixTarget] constants.
   */
  public var mixTarget: MixTarget
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMixTargetPtr, LONG)
      return AudioStreamPlayer.MixTarget.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMixTargetPtr, NIL)
    }

  /**
   * The maximum number of sounds this node can play at the same time. Playing additional sounds
   * after this value is reached will cut off the oldest sounds.
   */
  public var maxPolyphony: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxPolyphonyPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxPolyphonyPtr, NIL)
    }

  /**
   * Bus on which this audio is playing.
   * **Note:** When setting this property, keep in mind that no validation is performed to see if
   * the given name matches an existing bus. This is because audio bus layouts might be loaded after
   * this property is set. If this given name can't be resolved at runtime, it will fall back to
   * `"Master"`.
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOSTREAMPLAYER, scriptIndex)
    return true
  }

  /**
   * Plays the audio from the given [fromPosition], in seconds.
   */
  @JvmOverloads
  public fun play(fromPosition: Float = 0.0f): Unit {
    TransferContext.writeArguments(DOUBLE to fromPosition.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.playPtr, NIL)
  }

  /**
   * Sets the position from which audio will be played, in seconds.
   */
  public fun seek(toPosition: Float): Unit {
    TransferContext.writeArguments(DOUBLE to toPosition.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.seekPtr, NIL)
  }

  /**
   * Stops the audio.
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  /**
   * Returns the position in the [AudioStream] in seconds.
   */
  public fun getPlaybackPosition(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlaybackPositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns whether the [AudioStreamPlayer] can return the [AudioStreamPlayback] object or not.
   */
  public fun hasStreamPlayback(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasStreamPlaybackPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the [AudioStreamPlayback] object associated with this [AudioStreamPlayer].
   */
  public fun getStreamPlayback(): AudioStreamPlayback? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStreamPlaybackPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AudioStreamPlayback?)
  }

  public enum class MixTarget(
    id: Long,
  ) {
    /**
     * The audio will be played only on the first channel.
     */
    MIX_TARGET_STEREO(0),
    /**
     * The audio will be played on all surround channels.
     */
    MIX_TARGET_SURROUND(1),
    /**
     * The audio will be played on the second channel, which is usually the center.
     */
    MIX_TARGET_CENTER(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_stream")

    public val getStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_stream")

    public val setVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_volume_db")

    public val getVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_volume_db")

    public val setPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_pitch_scale")

    public val getPitchScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_pitch_scale")

    public val playPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer", "play")

    public val seekPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer", "seek")

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer", "stop")

    public val isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "is_playing")

    public val getPlaybackPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_playback_position")

    public val setBusPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_bus")

    public val getBusPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_bus")

    public val setAutoplayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_autoplay")

    public val isAutoplayEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "is_autoplay_enabled")

    public val setMixTargetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_mix_target")

    public val getMixTargetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_mix_target")

    public val setStreamPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_stream_paused")

    public val getStreamPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_stream_paused")

    public val setMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "set_max_polyphony")

    public val getMaxPolyphonyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_max_polyphony")

    public val hasStreamPlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "has_stream_playback")

    public val getStreamPlaybackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamPlayer", "get_stream_playback")
  }
}

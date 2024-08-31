// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal3
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
import kotlin.jvm.JvmOverloads

/**
 * [AudioServer] is a low-level server interface for audio access. It is in charge of creating
 * sample data (playable audio) as well as its playback via a voice interface.
 */
@GodotBaseType
public object AudioServer : Object() {
  /**
   * Emitted when an audio bus is added, deleted, or moved.
   */
  public val busLayoutChanged: Signal0 by signal()

  /**
   * Emitted when the audio bus at [busIndex] is renamed from [oldName] to [newName].
   */
  public val busRenamed: Signal3<Long, StringName, StringName> by signal("busIndex", "oldName",
      "newName")

  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_AUDIOSERVER)
    return false
  }

  public fun setBusCount(amount: Int): Unit {
    TransferContext.writeArguments(LONG to amount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setBusCountPtr, NIL)
  }

  public fun getBusCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBusCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes the bus at index [index].
   */
  public fun removeBus(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeBusPtr, NIL)
  }

  /**
   * Adds a bus at [atPosition].
   */
  @JvmOverloads
  public fun addBus(atPosition: Int = -1): Unit {
    TransferContext.writeArguments(LONG to atPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addBusPtr, NIL)
  }

  /**
   * Moves the bus from index [index] to index [toIndex].
   */
  public fun moveBus(index: Int, toIndex: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to toIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveBusPtr, NIL)
  }

  /**
   * Sets the name of the bus at index [busIdx] to [name].
   */
  public fun setBusName(busIdx: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setBusNamePtr, NIL)
  }

  /**
   * Returns the name of the bus with the index [busIdx].
   */
  public fun getBusName(busIdx: Int): String {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBusNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the index of the bus with the name [busName]. Returns `-1` if no bus with the specified
   * name exist.
   */
  public fun getBusIndex(busName: StringName): Int {
    TransferContext.writeArguments(STRING_NAME to busName)
    TransferContext.callMethod(rawPtr, MethodBindings.getBusIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of channels of the bus at index [busIdx].
   */
  public fun getBusChannels(busIdx: Int): Int {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBusChannelsPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the volume of the bus at index [busIdx] to [volumeDb].
   */
  public fun setBusVolumeDb(busIdx: Int, volumeDb: Float): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), DOUBLE to volumeDb.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setBusVolumeDbPtr, NIL)
  }

  /**
   * Returns the volume of the bus at index [busIdx] in dB.
   */
  public fun getBusVolumeDb(busIdx: Int): Float {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBusVolumeDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Connects the output of the bus at [busIdx] to the bus named [send].
   */
  public fun setBusSend(busIdx: Int, send: StringName): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), STRING_NAME to send)
    TransferContext.callMethod(rawPtr, MethodBindings.setBusSendPtr, NIL)
  }

  /**
   * Returns the name of the bus that the bus at index [busIdx] sends to.
   */
  public fun getBusSend(busIdx: Int): StringName {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBusSendPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * If `true`, the bus at index [busIdx] is in solo mode.
   */
  public fun setBusSolo(busIdx: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setBusSoloPtr, NIL)
  }

  /**
   * If `true`, the bus at index [busIdx] is in solo mode.
   */
  public fun isBusSolo(busIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isBusSoloPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * If `true`, the bus at index [busIdx] is muted.
   */
  public fun setBusMute(busIdx: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setBusMutePtr, NIL)
  }

  /**
   * If `true`, the bus at index [busIdx] is muted.
   */
  public fun isBusMute(busIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isBusMutePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * If `true`, the bus at index [busIdx] is bypassing effects.
   */
  public fun setBusBypassEffects(busIdx: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setBusBypassEffectsPtr, NIL)
  }

  /**
   * If `true`, the bus at index [busIdx] is bypassing effects.
   */
  public fun isBusBypassingEffects(busIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isBusBypassingEffectsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds an [AudioEffect] effect to the bus [busIdx] at [atPosition].
   */
  @JvmOverloads
  public fun addBusEffect(
    busIdx: Int,
    effect: AudioEffect,
    atPosition: Int = -1,
  ): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), OBJECT to effect, LONG to atPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addBusEffectPtr, NIL)
  }

  /**
   * Removes the effect at index [effectIdx] from the bus at index [busIdx].
   */
  public fun removeBusEffect(busIdx: Int, effectIdx: Int): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeBusEffectPtr, NIL)
  }

  /**
   * Returns the number of effects on the bus at [busIdx].
   */
  public fun getBusEffectCount(busIdx: Int): Int {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBusEffectCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [AudioEffect] at position [effectIdx] in bus [busIdx].
   */
  public fun getBusEffect(busIdx: Int, effectIdx: Int): AudioEffect? {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBusEffectPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AudioEffect?)
  }

  /**
   * Returns the [AudioEffectInstance] assigned to the given bus and effect indices (and optionally
   * channel).
   */
  @JvmOverloads
  public fun getBusEffectInstance(
    busIdx: Int,
    effectIdx: Int,
    channel: Int = 0,
  ): AudioEffectInstance? {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong(), LONG to channel.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBusEffectInstancePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AudioEffectInstance?)
  }

  /**
   * Swaps the position of two effects in bus [busIdx].
   */
  public fun swapBusEffects(
    busIdx: Int,
    effectIdx: Int,
    byEffectIdx: Int,
  ): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong(), LONG to byEffectIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.swapBusEffectsPtr, NIL)
  }

  /**
   * If `true`, the effect at index [effectIdx] on the bus at index [busIdx] is enabled.
   */
  public fun setBusEffectEnabled(
    busIdx: Int,
    effectIdx: Int,
    enabled: Boolean,
  ): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong(), BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setBusEffectEnabledPtr, NIL)
  }

  /**
   * If `true`, the effect at index [effectIdx] on the bus at index [busIdx] is enabled.
   */
  public fun isBusEffectEnabled(busIdx: Int, effectIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isBusEffectEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the peak volume of the left speaker at bus index [busIdx] and channel index [channel].
   */
  public fun getBusPeakVolumeLeftDb(busIdx: Int, channel: Int): Float {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to channel.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBusPeakVolumeLeftDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the peak volume of the right speaker at bus index [busIdx] and channel index [channel].
   */
  public fun getBusPeakVolumeRightDb(busIdx: Int, channel: Int): Float {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to channel.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBusPeakVolumeRightDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setPlaybackSpeedScale(scale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPlaybackSpeedScalePtr, NIL)
  }

  public fun getPlaybackSpeedScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlaybackSpeedScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Locks the audio driver's main loop.
   * **Note:** Remember to unlock it afterwards.
   */
  public fun lock(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.lockPtr, NIL)
  }

  /**
   * Unlocks the audio driver's main loop. (After locking it, you should always unlock it.)
   */
  public fun unlock(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.unlockPtr, NIL)
  }

  /**
   * Returns the speaker configuration.
   */
  public fun getSpeakerMode(): SpeakerMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSpeakerModePtr, LONG)
    return AudioServer.SpeakerMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the sample rate at the output of the [AudioServer].
   */
  public fun getMixRate(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMixRatePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the names of all audio output devices detected on the system.
   */
  public fun getOutputDeviceList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOutputDeviceListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getOutputDevice(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOutputDevicePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setOutputDevice(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setOutputDevicePtr, NIL)
  }

  /**
   * Returns the relative time until the next mix occurs.
   */
  public fun getTimeToNextMix(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTimeToNextMixPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns the relative time since the last mix occurred.
   */
  public fun getTimeSinceLastMix(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTimeSinceLastMixPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns the audio driver's effective output latency. This is based on
   * [ProjectSettings.audio/driver/outputLatency], but the exact returned value will differ depending
   * on the operating system and audio driver.
   * **Note:** This can be expensive; it is not recommended to call [getOutputLatency] every frame.
   */
  public fun getOutputLatency(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOutputLatencyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns the names of all audio input devices detected on the system.
   * **Note:** [ProjectSettings.audio/driver/enableInput] must be `true` for audio input to work.
   * See also that setting's description for caveats related to permissions and operating system
   * privacy settings.
   */
  public fun getInputDeviceList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInputDeviceListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getInputDevice(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInputDevicePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setInputDevice(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setInputDevicePtr, NIL)
  }

  /**
   * Overwrites the currently used [AudioBusLayout].
   */
  public fun setBusLayout(busLayout: AudioBusLayout): Unit {
    TransferContext.writeArguments(OBJECT to busLayout)
    TransferContext.callMethod(rawPtr, MethodBindings.setBusLayoutPtr, NIL)
  }

  /**
   * Generates an [AudioBusLayout] using the available buses and effects.
   */
  public fun generateBusLayout(): AudioBusLayout? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.generateBusLayoutPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AudioBusLayout?)
  }

  /**
   * If set to `true`, all instances of [AudioStreamPlayback] will call
   * [AudioStreamPlayback.TagUsedStreams] every mix step.
   * **Note:** This is enabled by default in the editor, as it is used by editor plugins for the
   * audio stream previews.
   */
  public fun setEnableTaggingUsedAudioStreams(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setEnableTaggingUsedAudioStreamsPtr, NIL)
  }

  /**
   * If `true`, the stream is registered as a sample. The engine will not have to register it before
   * playing the sample.
   * If `false`, the stream will have to be registered before playing it. To prevent lag spikes,
   * register the stream as sample with [registerStreamAsSample].
   */
  public fun isStreamRegisteredAsSample(stream: AudioStream): Boolean {
    TransferContext.writeArguments(OBJECT to stream)
    TransferContext.callMethod(rawPtr, MethodBindings.isStreamRegisteredAsSamplePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Forces the registration of a stream as a sample.
   * **Note:** Lag spikes may occur when calling this method, especially on single-threaded builds.
   * It is suggested to call this method while loading assets, where the lag spike could be masked,
   * instead of registering the sample right before it needs to be played.
   */
  public fun registerStreamAsSample(stream: AudioStream): Unit {
    TransferContext.writeArguments(OBJECT to stream)
    TransferContext.callMethod(rawPtr, MethodBindings.registerStreamAsSamplePtr, NIL)
  }

  public enum class SpeakerMode(
    id: Long,
  ) {
    /**
     * Two or fewer speakers were detected.
     */
    SPEAKER_MODE_STEREO(0),
    /**
     * A 3.1 channel surround setup was detected.
     */
    SPEAKER_SURROUND_31(1),
    /**
     * A 5.1 channel surround setup was detected.
     */
    SPEAKER_SURROUND_51(2),
    /**
     * A 7.1 channel surround setup was detected.
     */
    SPEAKER_SURROUND_71(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SpeakerMode = entries.single { it.id == `value` }
    }
  }

  public enum class PlaybackType(
    id: Long,
  ) {
    /**
     * The playback will be considered of the type declared at
     * [ProjectSettings.audio/general/defaultPlaybackType].
     */
    PLAYBACK_TYPE_DEFAULT(0),
    /**
     * Force the playback to be considered as a stream.
     */
    PLAYBACK_TYPE_STREAM(1),
    /**
     * Force the playback to be considered as a sample. This can provide lower latency and more
     * stable playback (with less risk of audio crackling), at the cost of having less flexibility.
     * **Note:** Only currently supported on the web platform.
     * **Note:** [AudioEffect]s are not supported when playback is considered as a sample.
     */
    PLAYBACK_TYPE_SAMPLE(2),
    /**
     * Represents the size of the [PlaybackType] enum.
     */
    PLAYBACK_TYPE_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PlaybackType = entries.single { it.id == `value` }
    }
  }

  internal object MethodBindings {
    public val setBusCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_bus_count")

    public val getBusCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_count")

    public val removeBusPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "remove_bus")

    public val addBusPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "add_bus")

    public val moveBusPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "move_bus")

    public val setBusNamePtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "set_bus_name")

    public val getBusNamePtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "get_bus_name")

    public val getBusIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_index")

    public val getBusChannelsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_channels")

    public val setBusVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_bus_volume_db")

    public val getBusVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_volume_db")

    public val setBusSendPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "set_bus_send")

    public val getBusSendPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "get_bus_send")

    public val setBusSoloPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "set_bus_solo")

    public val isBusSoloPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "is_bus_solo")

    public val setBusMutePtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "set_bus_mute")

    public val isBusMutePtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "is_bus_mute")

    public val setBusBypassEffectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_bus_bypass_effects")

    public val isBusBypassingEffectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "is_bus_bypassing_effects")

    public val addBusEffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "add_bus_effect")

    public val removeBusEffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "remove_bus_effect")

    public val getBusEffectCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_effect_count")

    public val getBusEffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_effect")

    public val getBusEffectInstancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_effect_instance")

    public val swapBusEffectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "swap_bus_effects")

    public val setBusEffectEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_bus_effect_enabled")

    public val isBusEffectEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "is_bus_effect_enabled")

    public val getBusPeakVolumeLeftDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_peak_volume_left_db")

    public val getBusPeakVolumeRightDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_peak_volume_right_db")

    public val setPlaybackSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_playback_speed_scale")

    public val getPlaybackSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_playback_speed_scale")

    public val lockPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "lock")

    public val unlockPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "unlock")

    public val getSpeakerModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_speaker_mode")

    public val getMixRatePtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "get_mix_rate")

    public val getOutputDeviceListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_output_device_list")

    public val getOutputDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_output_device")

    public val setOutputDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_output_device")

    public val getTimeToNextMixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_time_to_next_mix")

    public val getTimeSinceLastMixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_time_since_last_mix")

    public val getOutputLatencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_output_latency")

    public val getInputDeviceListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_input_device_list")

    public val getInputDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_input_device")

    public val setInputDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_input_device")

    public val setBusLayoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_bus_layout")

    public val generateBusLayoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "generate_bus_layout")

    public val setEnableTaggingUsedAudioStreamsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_enable_tagging_used_audio_streams")

    public val isStreamRegisteredAsSamplePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "is_stream_registered_as_sample")

    public val registerStreamAsSamplePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "register_stream_as_sample")
  }
}

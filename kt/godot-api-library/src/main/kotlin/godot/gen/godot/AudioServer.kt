// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.Signal0
import godot.core.Signal3
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.util.Internals
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
import kotlin.jvm.JvmStatic

private const val ENGINE_CLASS_AUDIOSERVER_INDEX: Int = 28

/**
 * [AudioServer] is a low-level server interface for audio access. It is in charge of creating
 * sample data (playable audio) as well as its playback via a voice interface.
 */
@GodotBaseType
public object AudioServer : Object() {
  /**
   * Emitted when an audio bus is added, deleted, or moved.
   */
  @JvmStatic
  public val busLayoutChanged: Signal0 by Signal0

  /**
   * Emitted when the audio bus at [busIndex] is renamed from [oldName] to [newName].
   */
  @JvmStatic
  public val busRenamed: Signal3<Long, StringName, StringName> by Signal3

  public override fun new(scriptIndex: Int): Unit {
    Internals.getSingleton(this, ENGINE_CLASS_AUDIOSERVER_INDEX)
  }

  @JvmStatic
  public final fun setBusCount(amount: Int): Unit {
    Internals.writeArguments(LONG to amount.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setBusCountPtr, NIL)
  }

  @JvmStatic
  public final fun getBusCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBusCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Removes the bus at index [index].
   */
  @JvmStatic
  public final fun removeBus(index: Int): Unit {
    Internals.writeArguments(LONG to index.toLong())
    Internals.callMethod(rawPtr, MethodBindings.removeBusPtr, NIL)
  }

  /**
   * Adds a bus at [atPosition].
   */
  @JvmOverloads
  @JvmStatic
  public final fun addBus(atPosition: Int = -1): Unit {
    Internals.writeArguments(LONG to atPosition.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addBusPtr, NIL)
  }

  /**
   * Moves the bus from index [index] to index [toIndex].
   */
  @JvmStatic
  public final fun moveBus(index: Int, toIndex: Int): Unit {
    Internals.writeArguments(LONG to index.toLong(), LONG to toIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.moveBusPtr, NIL)
  }

  /**
   * Sets the name of the bus at index [busIdx] to [name].
   */
  @JvmStatic
  public final fun setBusName(busIdx: Int, name: String): Unit {
    Internals.writeArguments(LONG to busIdx.toLong(), STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.setBusNamePtr, NIL)
  }

  /**
   * Returns the name of the bus with the index [busIdx].
   */
  @JvmStatic
  public final fun getBusName(busIdx: Int): String {
    Internals.writeArguments(LONG to busIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBusNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the index of the bus with the name [busName]. Returns `-1` if no bus with the specified
   * name exist.
   */
  @JvmStatic
  public final fun getBusIndex(busName: StringName): Int {
    Internals.writeArguments(STRING_NAME to busName)
    Internals.callMethod(rawPtr, MethodBindings.getBusIndexPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of channels of the bus at index [busIdx].
   */
  @JvmStatic
  public final fun getBusChannels(busIdx: Int): Int {
    Internals.writeArguments(LONG to busIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBusChannelsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the volume of the bus at index [busIdx] to [volumeDb].
   */
  @JvmStatic
  public final fun setBusVolumeDb(busIdx: Int, volumeDb: Float): Unit {
    Internals.writeArguments(LONG to busIdx.toLong(), DOUBLE to volumeDb.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setBusVolumeDbPtr, NIL)
  }

  /**
   * Returns the volume of the bus at index [busIdx] in dB.
   */
  @JvmStatic
  public final fun getBusVolumeDb(busIdx: Int): Float {
    Internals.writeArguments(LONG to busIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBusVolumeDbPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Connects the output of the bus at [busIdx] to the bus named [send].
   */
  @JvmStatic
  public final fun setBusSend(busIdx: Int, send: StringName): Unit {
    Internals.writeArguments(LONG to busIdx.toLong(), STRING_NAME to send)
    Internals.callMethod(rawPtr, MethodBindings.setBusSendPtr, NIL)
  }

  /**
   * Returns the name of the bus that the bus at index [busIdx] sends to.
   */
  @JvmStatic
  public final fun getBusSend(busIdx: Int): StringName {
    Internals.writeArguments(LONG to busIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBusSendPtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * If `true`, the bus at index [busIdx] is in solo mode.
   */
  @JvmStatic
  public final fun setBusSolo(busIdx: Int, enable: Boolean): Unit {
    Internals.writeArguments(LONG to busIdx.toLong(), BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setBusSoloPtr, NIL)
  }

  /**
   * If `true`, the bus at index [busIdx] is in solo mode.
   */
  @JvmStatic
  public final fun isBusSolo(busIdx: Int): Boolean {
    Internals.writeArguments(LONG to busIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isBusSoloPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If `true`, the bus at index [busIdx] is muted.
   */
  @JvmStatic
  public final fun setBusMute(busIdx: Int, enable: Boolean): Unit {
    Internals.writeArguments(LONG to busIdx.toLong(), BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setBusMutePtr, NIL)
  }

  /**
   * If `true`, the bus at index [busIdx] is muted.
   */
  @JvmStatic
  public final fun isBusMute(busIdx: Int): Boolean {
    Internals.writeArguments(LONG to busIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isBusMutePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If `true`, the bus at index [busIdx] is bypassing effects.
   */
  @JvmStatic
  public final fun setBusBypassEffects(busIdx: Int, enable: Boolean): Unit {
    Internals.writeArguments(LONG to busIdx.toLong(), BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setBusBypassEffectsPtr, NIL)
  }

  /**
   * If `true`, the bus at index [busIdx] is bypassing effects.
   */
  @JvmStatic
  public final fun isBusBypassingEffects(busIdx: Int): Boolean {
    Internals.writeArguments(LONG to busIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isBusBypassingEffectsPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds an [AudioEffect] effect to the bus [busIdx] at [atPosition].
   */
  @JvmOverloads
  @JvmStatic
  public final fun addBusEffect(
    busIdx: Int,
    effect: AudioEffect?,
    atPosition: Int = -1,
  ): Unit {
    Internals.writeArguments(LONG to busIdx.toLong(), OBJECT to effect, LONG to atPosition.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addBusEffectPtr, NIL)
  }

  /**
   * Removes the effect at index [effectIdx] from the bus at index [busIdx].
   */
  @JvmStatic
  public final fun removeBusEffect(busIdx: Int, effectIdx: Int): Unit {
    Internals.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.removeBusEffectPtr, NIL)
  }

  /**
   * Returns the number of effects on the bus at [busIdx].
   */
  @JvmStatic
  public final fun getBusEffectCount(busIdx: Int): Int {
    Internals.writeArguments(LONG to busIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBusEffectCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the [AudioEffect] at position [effectIdx] in bus [busIdx].
   */
  @JvmStatic
  public final fun getBusEffect(busIdx: Int, effectIdx: Int): AudioEffect? {
    Internals.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBusEffectPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as AudioEffect?)
  }

  /**
   * Returns the [AudioEffectInstance] assigned to the given bus and effect indices (and optionally
   * channel).
   */
  @JvmOverloads
  @JvmStatic
  public final fun getBusEffectInstance(
    busIdx: Int,
    effectIdx: Int,
    channel: Int = 0,
  ): AudioEffectInstance? {
    Internals.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong(), LONG to channel.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBusEffectInstancePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as AudioEffectInstance?)
  }

  /**
   * Swaps the position of two effects in bus [busIdx].
   */
  @JvmStatic
  public final fun swapBusEffects(
    busIdx: Int,
    effectIdx: Int,
    byEffectIdx: Int,
  ): Unit {
    Internals.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong(), LONG to byEffectIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.swapBusEffectsPtr, NIL)
  }

  /**
   * If `true`, the effect at index [effectIdx] on the bus at index [busIdx] is enabled.
   */
  @JvmStatic
  public final fun setBusEffectEnabled(
    busIdx: Int,
    effectIdx: Int,
    enabled: Boolean,
  ): Unit {
    Internals.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong(), BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setBusEffectEnabledPtr, NIL)
  }

  /**
   * If `true`, the effect at index [effectIdx] on the bus at index [busIdx] is enabled.
   */
  @JvmStatic
  public final fun isBusEffectEnabled(busIdx: Int, effectIdx: Int): Boolean {
    Internals.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.isBusEffectEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the peak volume of the left speaker at bus index [busIdx] and channel index [channel].
   */
  @JvmStatic
  public final fun getBusPeakVolumeLeftDb(busIdx: Int, channel: Int): Float {
    Internals.writeArguments(LONG to busIdx.toLong(), LONG to channel.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBusPeakVolumeLeftDbPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the peak volume of the right speaker at bus index [busIdx] and channel index [channel].
   */
  @JvmStatic
  public final fun getBusPeakVolumeRightDb(busIdx: Int, channel: Int): Float {
    Internals.writeArguments(LONG to busIdx.toLong(), LONG to channel.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getBusPeakVolumeRightDbPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  @JvmStatic
  public final fun setPlaybackSpeedScale(scale: Float): Unit {
    Internals.writeArguments(DOUBLE to scale.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setPlaybackSpeedScalePtr, NIL)
  }

  @JvmStatic
  public final fun getPlaybackSpeedScale(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPlaybackSpeedScalePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Locks the audio driver's main loop.
   * **Note:** Remember to unlock it afterwards.
   */
  @JvmStatic
  public final fun lock(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.lockPtr, NIL)
  }

  /**
   * Unlocks the audio driver's main loop. (After locking it, you should always unlock it.)
   */
  @JvmStatic
  public final fun unlock(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.unlockPtr, NIL)
  }

  /**
   * Returns the speaker configuration.
   */
  @JvmStatic
  public final fun getSpeakerMode(): SpeakerMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSpeakerModePtr, LONG)
    return AudioServer.SpeakerMode.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the sample rate at the output of the [AudioServer].
   */
  @JvmStatic
  public final fun getMixRate(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMixRatePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the names of all audio output devices detected on the system.
   */
  @JvmStatic
  public final fun getOutputDeviceList(): PackedStringArray {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOutputDeviceListPtr, PACKED_STRING_ARRAY)
    return (Internals.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  @JvmStatic
  public final fun getOutputDevice(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOutputDevicePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  @JvmStatic
  public final fun setOutputDevice(name: String): Unit {
    Internals.writeArguments(STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.setOutputDevicePtr, NIL)
  }

  /**
   * Returns the relative time until the next mix occurs.
   */
  @JvmStatic
  public final fun getTimeToNextMix(): Double {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTimeToNextMixPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns the relative time since the last mix occurred.
   */
  @JvmStatic
  public final fun getTimeSinceLastMix(): Double {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTimeSinceLastMixPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns the audio driver's effective output latency. This is based on
   * [ProjectSettings.audio/driver/outputLatency], but the exact returned value will differ depending
   * on the operating system and audio driver.
   * **Note:** This can be expensive; it is not recommended to call [getOutputLatency] every frame.
   */
  @JvmStatic
  public final fun getOutputLatency(): Double {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOutputLatencyPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns the names of all audio input devices detected on the system.
   * **Note:** [ProjectSettings.audio/driver/enableInput] must be `true` for audio input to work.
   * See also that setting's description for caveats related to permissions and operating system
   * privacy settings.
   */
  @JvmStatic
  public final fun getInputDeviceList(): PackedStringArray {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInputDeviceListPtr, PACKED_STRING_ARRAY)
    return (Internals.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  @JvmStatic
  public final fun getInputDevice(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInputDevicePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  @JvmStatic
  public final fun setInputDevice(name: String): Unit {
    Internals.writeArguments(STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.setInputDevicePtr, NIL)
  }

  /**
   * Overwrites the currently used [AudioBusLayout].
   */
  @JvmStatic
  public final fun setBusLayout(busLayout: AudioBusLayout?): Unit {
    Internals.writeArguments(OBJECT to busLayout)
    Internals.callMethod(rawPtr, MethodBindings.setBusLayoutPtr, NIL)
  }

  /**
   * Generates an [AudioBusLayout] using the available buses and effects.
   */
  @JvmStatic
  public final fun generateBusLayout(): AudioBusLayout? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.generateBusLayoutPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as AudioBusLayout?)
  }

  /**
   * If set to `true`, all instances of [AudioStreamPlayback] will call
   * [AudioStreamPlayback.TagUsedStreams] every mix step.
   * **Note:** This is enabled by default in the editor, as it is used by editor plugins for the
   * audio stream previews.
   */
  @JvmStatic
  public final fun setEnableTaggingUsedAudioStreams(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setEnableTaggingUsedAudioStreamsPtr, NIL)
  }

  /**
   * If `true`, the stream is registered as a sample. The engine will not have to register it before
   * playing the sample.
   * If `false`, the stream will have to be registered before playing it. To prevent lag spikes,
   * register the stream as sample with [registerStreamAsSample].
   */
  @JvmStatic
  public final fun isStreamRegisteredAsSample(stream: AudioStream?): Boolean {
    Internals.writeArguments(OBJECT to stream)
    Internals.callMethod(rawPtr, MethodBindings.isStreamRegisteredAsSamplePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Forces the registration of a stream as a sample.
   * **Note:** Lag spikes may occur when calling this method, especially on single-threaded builds.
   * It is suggested to call this method while loading assets, where the lag spike could be masked,
   * instead of registering the sample right before it needs to be played.
   */
  @JvmStatic
  public final fun registerStreamAsSample(stream: AudioStream?): Unit {
    Internals.writeArguments(OBJECT to stream)
    Internals.callMethod(rawPtr, MethodBindings.registerStreamAsSamplePtr, NIL)
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
        Internals.getMethodBindPtr("AudioServer", "set_bus_count", 1286410249)

    public val getBusCountPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_bus_count", 3905245786)

    public val removeBusPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "remove_bus", 1286410249)

    public val addBusPtr: VoidPtr = Internals.getMethodBindPtr("AudioServer", "add_bus", 1025054187)

    public val moveBusPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "move_bus", 3937882851)

    public val setBusNamePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "set_bus_name", 501894301)

    public val getBusNamePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_bus_name", 844755477)

    public val getBusIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_bus_index", 2458036349)

    public val getBusChannelsPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_bus_channels", 923996154)

    public val setBusVolumeDbPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "set_bus_volume_db", 1602489585)

    public val getBusVolumeDbPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_bus_volume_db", 2339986948)

    public val setBusSendPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "set_bus_send", 3780747571)

    public val getBusSendPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_bus_send", 659327637)

    public val setBusSoloPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "set_bus_solo", 300928843)

    public val isBusSoloPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "is_bus_solo", 1116898809)

    public val setBusMutePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "set_bus_mute", 300928843)

    public val isBusMutePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "is_bus_mute", 1116898809)

    public val setBusBypassEffectsPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "set_bus_bypass_effects", 300928843)

    public val isBusBypassingEffectsPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "is_bus_bypassing_effects", 1116898809)

    public val addBusEffectPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "add_bus_effect", 4068819785)

    public val removeBusEffectPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "remove_bus_effect", 3937882851)

    public val getBusEffectCountPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_bus_effect_count", 3744713108)

    public val getBusEffectPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_bus_effect", 726064442)

    public val getBusEffectInstancePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_bus_effect_instance", 1829771234)

    public val swapBusEffectsPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "swap_bus_effects", 1649997291)

    public val setBusEffectEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "set_bus_effect_enabled", 1383440665)

    public val isBusEffectEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "is_bus_effect_enabled", 2522259332)

    public val getBusPeakVolumeLeftDbPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_bus_peak_volume_left_db", 3085491603)

    public val getBusPeakVolumeRightDbPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_bus_peak_volume_right_db", 3085491603)

    public val setPlaybackSpeedScalePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "set_playback_speed_scale", 373806689)

    public val getPlaybackSpeedScalePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_playback_speed_scale", 1740695150)

    public val lockPtr: VoidPtr = Internals.getMethodBindPtr("AudioServer", "lock", 3218959716)

    public val unlockPtr: VoidPtr = Internals.getMethodBindPtr("AudioServer", "unlock", 3218959716)

    public val getSpeakerModePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_speaker_mode", 2549190337)

    public val getMixRatePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_mix_rate", 1740695150)

    public val getOutputDeviceListPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_output_device_list", 2981934095)

    public val getOutputDevicePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_output_device", 2841200299)

    public val setOutputDevicePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "set_output_device", 83702148)

    public val getTimeToNextMixPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_time_to_next_mix", 1740695150)

    public val getTimeSinceLastMixPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_time_since_last_mix", 1740695150)

    public val getOutputLatencyPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_output_latency", 1740695150)

    public val getInputDeviceListPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_input_device_list", 2981934095)

    public val getInputDevicePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "get_input_device", 2841200299)

    public val setInputDevicePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "set_input_device", 83702148)

    public val setBusLayoutPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "set_bus_layout", 3319058824)

    public val generateBusLayoutPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "generate_bus_layout", 3769973890)

    public val setEnableTaggingUsedAudioStreamsPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "set_enable_tagging_used_audio_streams", 2586408642)

    public val isStreamRegisteredAsSamplePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "is_stream_registered_as_sample", 500225754)

    public val registerStreamAsSamplePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioServer", "register_stream_as_sample", 2210767741)
  }
}

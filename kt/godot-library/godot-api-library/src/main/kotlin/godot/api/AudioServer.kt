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
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

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

  /**
   * Number of available audio buses.
   */
  @JvmStatic
  public final inline var busCount: Int
    @JvmName("busCountProperty")
    get() = getBusCount()
    @JvmName("busCountProperty")
    set(`value`) {
      setBusCount(value)
    }

  /**
   * Name of the current device for audio output (see [getOutputDeviceList]). On systems with
   * multiple audio outputs (such as analog, USB and HDMI audio), this can be used to select the audio
   * output device. The value `"Default"` will play audio on the system-wide default audio output. If
   * an invalid device name is set, the value will be reverted back to `"Default"`.
   */
  @JvmStatic
  public final inline var outputDevice: String
    @JvmName("outputDeviceProperty")
    get() = getOutputDevice()
    @JvmName("outputDeviceProperty")
    set(`value`) {
      setOutputDevice(value)
    }

  /**
   * Name of the current device for audio input (see [getInputDeviceList]). On systems with multiple
   * audio inputs (such as analog, USB and HDMI audio), this can be used to select the audio input
   * device. The value `"Default"` will record audio on the system-wide default audio input. If an
   * invalid device name is set, the value will be reverted back to `"Default"`.
   * **Note:** [ProjectSettings.audio/driver/enableInput] must be `true` for audio input to work.
   * See also that setting's description for caveats related to permissions and operating system
   * privacy settings.
   */
  @JvmStatic
  public final inline var inputDevice: String
    @JvmName("inputDeviceProperty")
    get() = getInputDevice()
    @JvmName("inputDeviceProperty")
    set(`value`) {
      setInputDevice(value)
    }

  /**
   * Scales the rate at which audio is played (i.e. setting it to `0.5` will make the audio be
   * played at half its speed). See also [Engine.timeScale] to affect the general simulation speed,
   * which is independent from [AudioServer.playbackSpeedScale].
   */
  @JvmStatic
  public final inline var playbackSpeedScale: Float
    @JvmName("playbackSpeedScaleProperty")
    get() = getPlaybackSpeedScale()
    @JvmName("playbackSpeedScaleProperty")
    set(`value`) {
      setPlaybackSpeedScale(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    getSingleton(0)
  }

  @JvmStatic
  public final fun setBusCount(amount: Int): Unit {
    TransferContext.writeArguments(LONG to amount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setBusCountPtr, NIL)
  }

  @JvmStatic
  public final fun getBusCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBusCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Removes the bus at index [index].
   */
  @JvmStatic
  public final fun removeBus(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeBusPtr, NIL)
  }

  /**
   * Adds a bus at [atPosition].
   */
  @JvmOverloads
  @JvmStatic
  public final fun addBus(atPosition: Int = -1): Unit {
    TransferContext.writeArguments(LONG to atPosition.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addBusPtr, NIL)
  }

  /**
   * Moves the bus from index [index] to index [toIndex].
   */
  @JvmStatic
  public final fun moveBus(index: Int, toIndex: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to toIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.moveBusPtr, NIL)
  }

  /**
   * Sets the name of the bus at index [busIdx] to [name].
   */
  @JvmStatic
  public final fun setBusName(busIdx: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.setBusNamePtr, NIL)
  }

  /**
   * Returns the name of the bus with the index [busIdx].
   */
  @JvmStatic
  public final fun getBusName(busIdx: Int): String {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBusNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the index of the bus with the name [busName]. Returns `-1` if no bus with the specified
   * name exist.
   */
  @JvmStatic
  public final fun getBusIndex(busName: StringName): Int {
    TransferContext.writeArguments(STRING_NAME to busName)
    TransferContext.callMethod(ptr, MethodBindings.getBusIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of channels of the bus at index [busIdx].
   */
  @JvmStatic
  public final fun getBusChannels(busIdx: Int): Int {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBusChannelsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the volume in decibels of the bus at index [busIdx] to [volumeDb].
   */
  @JvmStatic
  public final fun setBusVolumeDb(busIdx: Int, volumeDb: Float): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), DOUBLE to volumeDb.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setBusVolumeDbPtr, NIL)
  }

  /**
   * Returns the volume of the bus at index [busIdx] in dB.
   */
  @JvmStatic
  public final fun getBusVolumeDb(busIdx: Int): Float {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBusVolumeDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the volume as a linear value of the bus at index [busIdx] to [volumeLinear].
   * **Note:** Using this method is equivalent to calling [setBusVolumeDb] with the result of
   * [@GlobalScope.linearToDb] on a value.
   */
  @JvmStatic
  public final fun setBusVolumeLinear(busIdx: Int, volumeLinear: Float): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), DOUBLE to volumeLinear.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setBusVolumeLinearPtr, NIL)
  }

  /**
   * Returns the volume of the bus at index [busIdx] as a linear value.
   * **Note:** The returned value is equivalent to the result of [@GlobalScope.dbToLinear] on the
   * result of [getBusVolumeDb].
   */
  @JvmStatic
  public final fun getBusVolumeLinear(busIdx: Int): Float {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBusVolumeLinearPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Connects the output of the bus at [busIdx] to the bus named [send].
   */
  @JvmStatic
  public final fun setBusSend(busIdx: Int, send: StringName): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), STRING_NAME to send)
    TransferContext.callMethod(ptr, MethodBindings.setBusSendPtr, NIL)
  }

  /**
   * Returns the name of the bus that the bus at index [busIdx] sends to.
   */
  @JvmStatic
  public final fun getBusSend(busIdx: Int): StringName {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBusSendPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * If `true`, the bus at index [busIdx] is in solo mode.
   */
  @JvmStatic
  public final fun setBusSolo(busIdx: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setBusSoloPtr, NIL)
  }

  /**
   * If `true`, the bus at index [busIdx] is in solo mode.
   */
  @JvmStatic
  public final fun isBusSolo(busIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isBusSoloPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If `true`, the bus at index [busIdx] is muted.
   */
  @JvmStatic
  public final fun setBusMute(busIdx: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setBusMutePtr, NIL)
  }

  /**
   * If `true`, the bus at index [busIdx] is muted.
   */
  @JvmStatic
  public final fun isBusMute(busIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isBusMutePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If `true`, the bus at index [busIdx] is bypassing effects.
   */
  @JvmStatic
  public final fun setBusBypassEffects(busIdx: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setBusBypassEffectsPtr, NIL)
  }

  /**
   * If `true`, the bus at index [busIdx] is bypassing effects.
   */
  @JvmStatic
  public final fun isBusBypassingEffects(busIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isBusBypassingEffectsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
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
    TransferContext.writeArguments(LONG to busIdx.toLong(), OBJECT to effect, LONG to atPosition.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addBusEffectPtr, NIL)
  }

  /**
   * Removes the effect at index [effectIdx] from the bus at index [busIdx].
   */
  @JvmStatic
  public final fun removeBusEffect(busIdx: Int, effectIdx: Int): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeBusEffectPtr, NIL)
  }

  /**
   * Returns the number of effects on the bus at [busIdx].
   */
  @JvmStatic
  public final fun getBusEffectCount(busIdx: Int): Int {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBusEffectCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the [AudioEffect] at position [effectIdx] in bus [busIdx].
   */
  @JvmStatic
  public final fun getBusEffect(busIdx: Int, effectIdx: Int): AudioEffect? {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBusEffectPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as AudioEffect?)
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
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong(), LONG to channel.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBusEffectInstancePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as AudioEffectInstance?)
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
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong(), LONG to byEffectIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.swapBusEffectsPtr, NIL)
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
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setBusEffectEnabledPtr, NIL)
  }

  /**
   * If `true`, the effect at index [effectIdx] on the bus at index [busIdx] is enabled.
   */
  @JvmStatic
  public final fun isBusEffectEnabled(busIdx: Int, effectIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isBusEffectEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the peak volume of the left speaker at bus index [busIdx] and channel index [channel].
   */
  @JvmStatic
  public final fun getBusPeakVolumeLeftDb(busIdx: Int, channel: Int): Float {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to channel.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBusPeakVolumeLeftDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the peak volume of the right speaker at bus index [busIdx] and channel index [channel].
   */
  @JvmStatic
  public final fun getBusPeakVolumeRightDb(busIdx: Int, channel: Int): Float {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to channel.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getBusPeakVolumeRightDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  @JvmStatic
  public final fun setPlaybackSpeedScale(scale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to scale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPlaybackSpeedScalePtr, NIL)
  }

  @JvmStatic
  public final fun getPlaybackSpeedScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPlaybackSpeedScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Locks the audio driver's main loop.
   * **Note:** Remember to unlock it afterwards.
   */
  @JvmStatic
  public final fun lock(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.lockPtr, NIL)
  }

  /**
   * Unlocks the audio driver's main loop. (After locking it, you should always unlock it.)
   */
  @JvmStatic
  public final fun unlock(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.unlockPtr, NIL)
  }

  /**
   * Returns the speaker configuration.
   */
  @JvmStatic
  public final fun getSpeakerMode(): SpeakerMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpeakerModePtr, LONG)
    return AudioServer.SpeakerMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the sample rate at the output of the [AudioServer].
   */
  @JvmStatic
  public final fun getMixRate(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMixRatePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the sample rate at the input of the [AudioServer].
   */
  @JvmStatic
  public final fun getInputMixRate(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInputMixRatePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the name of the current audio driver. The default usually depends on the operating
   * system, but may be overridden via the `--audio-driver`
   * [url=$DOCS_URL/tutorials/editor/command_line_tutorial.html]command line argument[/url].
   * `--headless` also automatically sets the audio driver to `Dummy`. See also
   * [ProjectSettings.audio/driver/driver].
   */
  @JvmStatic
  public final fun getDriverName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDriverNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the names of all audio output devices detected on the system.
   */
  @JvmStatic
  public final fun getOutputDeviceList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOutputDeviceListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  @JvmStatic
  public final fun getOutputDevice(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOutputDevicePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  @JvmStatic
  public final fun setOutputDevice(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.setOutputDevicePtr, NIL)
  }

  /**
   * Returns the relative time until the next mix occurs.
   */
  @JvmStatic
  public final fun getTimeToNextMix(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTimeToNextMixPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns the relative time since the last mix occurred.
   */
  @JvmStatic
  public final fun getTimeSinceLastMix(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTimeSinceLastMixPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns the audio driver's effective output latency. This is based on
   * [ProjectSettings.audio/driver/outputLatency], but the exact returned value will differ depending
   * on the operating system and audio driver.
   * **Note:** This can be expensive; it is not recommended to call [getOutputLatency] every frame.
   */
  @JvmStatic
  public final fun getOutputLatency(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOutputLatencyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns the names of all audio input devices detected on the system.
   * **Note:** [ProjectSettings.audio/driver/enableInput] must be `true` for audio input to work.
   * See also that setting's description for caveats related to permissions and operating system
   * privacy settings.
   */
  @JvmStatic
  public final fun getInputDeviceList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInputDeviceListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  @JvmStatic
  public final fun getInputDevice(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInputDevicePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  @JvmStatic
  public final fun setInputDevice(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.setInputDevicePtr, NIL)
  }

  /**
   * Overwrites the currently used [AudioBusLayout].
   */
  @JvmStatic
  public final fun setBusLayout(busLayout: AudioBusLayout?): Unit {
    TransferContext.writeArguments(OBJECT to busLayout)
    TransferContext.callMethod(ptr, MethodBindings.setBusLayoutPtr, NIL)
  }

  /**
   * Generates an [AudioBusLayout] using the available buses and effects.
   */
  @JvmStatic
  public final fun generateBusLayout(): AudioBusLayout? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.generateBusLayoutPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as AudioBusLayout?)
  }

  /**
   * If set to `true`, all instances of [AudioStreamPlayback] will call
   * [AudioStreamPlayback.TagUsedStreams] every mix step.
   * **Note:** This is enabled by default in the editor, as it is used by editor plugins for the
   * audio stream previews.
   */
  @JvmStatic
  public final fun setEnableTaggingUsedAudioStreams(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setEnableTaggingUsedAudioStreamsPtr, NIL)
  }

  /**
   * If `true`, the stream is registered as a sample. The engine will not have to register it before
   * playing the sample.
   * If `false`, the stream will have to be registered before playing it. To prevent lag spikes,
   * register the stream as sample with [registerStreamAsSample].
   */
  @JvmStatic
  public final fun isStreamRegisteredAsSample(stream: AudioStream?): Boolean {
    TransferContext.writeArguments(OBJECT to stream)
    TransferContext.callMethod(ptr, MethodBindings.isStreamRegisteredAsSamplePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Forces the registration of a stream as a sample.
   * **Note:** Lag spikes may occur when calling this method, especially on single-threaded builds.
   * It is suggested to call this method while loading assets, where the lag spike could be masked,
   * instead of registering the sample right before it needs to be played.
   */
  @JvmStatic
  public final fun registerStreamAsSample(stream: AudioStream?): Unit {
    TransferContext.writeArguments(OBJECT to stream)
    TransferContext.callMethod(ptr, MethodBindings.registerStreamAsSamplePtr, NIL)
  }

  public enum class SpeakerMode(
    id: Long,
  ) {
    /**
     * Two or fewer speakers were detected.
     */
    STEREO(0),
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
    DEFAULT(0),
    /**
     * Force the playback to be considered as a stream.
     */
    STREAM(1),
    /**
     * Force the playback to be considered as a sample. This can provide lower latency and more
     * stable playback (with less risk of audio crackling), at the cost of having less flexibility.
     * **Note:** Only currently supported on the web platform.
     * **Note:** [AudioEffect]s are not supported when playback is considered as a sample.
     */
    SAMPLE(2),
    /**
     * Represents the size of the [PlaybackType] enum.
     */
    MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PlaybackType = entries.single { it.id == `value` }
    }
  }

  public object MethodBindings {
    internal val setBusCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_bus_count", 1286410249)

    internal val getBusCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_count", 3905245786)

    internal val removeBusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "remove_bus", 1286410249)

    internal val addBusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "add_bus", 1025054187)

    internal val moveBusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "move_bus", 3937882851)

    internal val setBusNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_bus_name", 501894301)

    internal val getBusNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_name", 844755477)

    internal val getBusIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_index", 2458036349)

    internal val getBusChannelsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_channels", 923996154)

    internal val setBusVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_bus_volume_db", 1602489585)

    internal val getBusVolumeDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_volume_db", 2339986948)

    internal val setBusVolumeLinearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_bus_volume_linear", 1602489585)

    internal val getBusVolumeLinearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_volume_linear", 2339986948)

    internal val setBusSendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_bus_send", 3780747571)

    internal val getBusSendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_send", 659327637)

    internal val setBusSoloPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_bus_solo", 300928843)

    internal val isBusSoloPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "is_bus_solo", 1116898809)

    internal val setBusMutePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_bus_mute", 300928843)

    internal val isBusMutePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "is_bus_mute", 1116898809)

    internal val setBusBypassEffectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_bus_bypass_effects", 300928843)

    internal val isBusBypassingEffectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "is_bus_bypassing_effects", 1116898809)

    internal val addBusEffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "add_bus_effect", 4068819785)

    internal val removeBusEffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "remove_bus_effect", 3937882851)

    internal val getBusEffectCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_effect_count", 3744713108)

    internal val getBusEffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_effect", 726064442)

    internal val getBusEffectInstancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_effect_instance", 1829771234)

    internal val swapBusEffectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "swap_bus_effects", 1649997291)

    internal val setBusEffectEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_bus_effect_enabled", 1383440665)

    internal val isBusEffectEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "is_bus_effect_enabled", 2522259332)

    internal val getBusPeakVolumeLeftDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_peak_volume_left_db", 3085491603)

    internal val getBusPeakVolumeRightDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_bus_peak_volume_right_db", 3085491603)

    internal val setPlaybackSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_playback_speed_scale", 373806689)

    internal val getPlaybackSpeedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_playback_speed_scale", 1740695150)

    internal val lockPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioServer", "lock", 3218959716)

    internal val unlockPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "unlock", 3218959716)

    internal val getSpeakerModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_speaker_mode", 2549190337)

    internal val getMixRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_mix_rate", 1740695150)

    internal val getInputMixRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_input_mix_rate", 1740695150)

    internal val getDriverNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_driver_name", 201670096)

    internal val getOutputDeviceListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_output_device_list", 2981934095)

    internal val getOutputDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_output_device", 2841200299)

    internal val setOutputDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_output_device", 83702148)

    internal val getTimeToNextMixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_time_to_next_mix", 1740695150)

    internal val getTimeSinceLastMixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_time_since_last_mix", 1740695150)

    internal val getOutputLatencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_output_latency", 1740695150)

    internal val getInputDeviceListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_input_device_list", 2981934095)

    internal val getInputDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "get_input_device", 2841200299)

    internal val setInputDevicePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_input_device", 83702148)

    internal val setBusLayoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_bus_layout", 3319058824)

    internal val generateBusLayoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "generate_bus_layout", 3769973890)

    internal val setEnableTaggingUsedAudioStreamsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "set_enable_tagging_used_audio_streams", 2586408642)

    internal val isStreamRegisteredAsSamplePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "is_stream_registered_as_sample", 500225754)

    internal val registerStreamAsSamplePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioServer", "register_stream_as_sample", 2210767741)
  }
}

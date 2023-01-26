// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.StringName
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
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Server interface for low-level audio access.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/528](https://godotengine.org/asset-library/asset/528)
 *
 * [godot.AudioServer] is a low-level server interface for audio access. It is in charge of creating sample data (playable audio) as well as its playback via a voice interface.
 */
@GodotBaseType
public object AudioServer : Object() {
  /**
   * Emitted when the [godot.AudioBusLayout] changes.
   */
  public val busLayoutChanged: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_AUDIOSERVER)
    return false
  }

  public fun setBusCount(amount: Int): Unit {
    TransferContext.writeArguments(LONG to amount.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_BUS_COUNT, NIL)
  }

  public fun getBusCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes the bus at index [index].
   */
  public fun removeBus(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_REMOVE_BUS, NIL)
  }

  /**
   * Adds a bus at [atPosition].
   */
  public fun addBus(atPosition: Int = -1): Unit {
    TransferContext.writeArguments(LONG to atPosition.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_ADD_BUS, NIL)
  }

  /**
   * Moves the bus from index [index] to index [toIndex].
   */
  public fun moveBus(index: Int, toIndex: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to toIndex.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_MOVE_BUS, NIL)
  }

  /**
   * Sets the name of the bus at index [busIdx] to [name].
   */
  public fun setBusName(busIdx: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_BUS_NAME, NIL)
  }

  /**
   * Returns the name of the bus with the index [busIdx].
   */
  public fun getBusName(busIdx: Int): String {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_NAME, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the index of the bus with the name [busName].
   */
  public fun getBusIndex(busName: StringName): Int {
    TransferContext.writeArguments(STRING_NAME to busName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_INDEX, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of channels of the bus at index [busIdx].
   */
  public fun getBusChannels(busIdx: Int): Int {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_CHANNELS, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the volume of the bus at index [busIdx] to [volumeDb].
   */
  public fun setBusVolumeDb(busIdx: Int, volumeDb: Float): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), DOUBLE to volumeDb.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_BUS_VOLUME_DB, NIL)
  }

  /**
   * Returns the volume of the bus at index [busIdx] in dB.
   */
  public fun getBusVolumeDb(busIdx: Int): Float {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_VOLUME_DB,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Connects the output of the bus at [busIdx] to the bus named [send].
   */
  public fun setBusSend(busIdx: Int, send: StringName): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), STRING_NAME to send)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_BUS_SEND, NIL)
  }

  /**
   * Returns the name of the bus that the bus at index [busIdx] sends to.
   */
  public fun getBusSend(busIdx: Int): StringName {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_SEND,
        STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * If `true`, the bus at index [busIdx] is in solo mode.
   */
  public fun setBusSolo(busIdx: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_BUS_SOLO, NIL)
  }

  /**
   * If `true`, the bus at index [busIdx] is in solo mode.
   */
  public fun isBusSolo(busIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_IS_BUS_SOLO, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * If `true`, the bus at index [busIdx] is muted.
   */
  public fun setBusMute(busIdx: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_BUS_MUTE, NIL)
  }

  /**
   * If `true`, the bus at index [busIdx] is muted.
   */
  public fun isBusMute(busIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_IS_BUS_MUTE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * If `true`, the bus at index [busIdx] is bypassing effects.
   */
  public fun setBusBypassEffects(busIdx: Int, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_BUS_BYPASS_EFFECTS,
        NIL)
  }

  /**
   * If `true`, the bus at index [busIdx] is bypassing effects.
   */
  public fun isBusBypassingEffects(busIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_IS_BUS_BYPASSING_EFFECTS, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds an [godot.AudioEffect] effect to the bus [busIdx] at [atPosition].
   */
  public fun addBusEffect(
    busIdx: Int,
    effect: AudioEffect,
    atPosition: Int = -1,
  ): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), OBJECT to effect, LONG to atPosition.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_ADD_BUS_EFFECT, NIL)
  }

  /**
   * Removes the effect at index [effectIdx] from the bus at index [busIdx].
   */
  public fun removeBusEffect(busIdx: Int, effectIdx: Int): Unit {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_REMOVE_BUS_EFFECT, NIL)
  }

  /**
   * Returns the number of effects on the bus at [busIdx].
   */
  public fun getBusEffectCount(busIdx: Int): Int {
    TransferContext.writeArguments(LONG to busIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_EFFECT_COUNT,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [godot.AudioEffect] at position [effectIdx] in bus [busIdx].
   */
  public fun getBusEffect(busIdx: Int, effectIdx: Int): AudioEffect? {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_EFFECT, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AudioEffect?)
  }

  /**
   * Returns the [godot.AudioEffectInstance] assigned to the given bus and effect indices (and optionally channel).
   */
  public fun getBusEffectInstance(
    busIdx: Int,
    effectIdx: Int,
    channel: Int = 0,
  ): AudioEffectInstance? {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong(), LONG to channel.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_EFFECT_INSTANCE,
        OBJECT)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SWAP_BUS_EFFECTS, NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_BUS_EFFECT_ENABLED,
        NIL)
  }

  /**
   * If `true`, the effect at index [effectIdx] on the bus at index [busIdx] is enabled.
   */
  public fun isBusEffectEnabled(busIdx: Int, effectIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to effectIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_IS_BUS_EFFECT_ENABLED,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the peak volume of the left speaker at bus index [busIdx] and channel index [channel].
   */
  public fun getBusPeakVolumeLeftDb(busIdx: Int, channel: Int): Float {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to channel.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_PEAK_VOLUME_LEFT_DB, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the peak volume of the right speaker at bus index [busIdx] and channel index [channel].
   */
  public fun getBusPeakVolumeRightDb(busIdx: Int, channel: Int): Float {
    TransferContext.writeArguments(LONG to busIdx.toLong(), LONG to channel.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_PEAK_VOLUME_RIGHT_DB, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setPlaybackSpeedScale(scale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_PLAYBACK_SPEED_SCALE, NIL)
  }

  public fun getPlaybackSpeedScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_PLAYBACK_SPEED_SCALE, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Locks the audio driver's main loop.
   *
   * **Note:** Remember to unlock it afterwards.
   */
  public fun lock(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_LOCK, NIL)
  }

  /**
   * Unlocks the audio driver's main loop. (After locking it, you should always unlock it.)
   */
  public fun unlock(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_UNLOCK, NIL)
  }

  /**
   * Returns the speaker configuration.
   */
  public fun getSpeakerMode(): SpeakerMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_SPEAKER_MODE, LONG)
    return AudioServer.SpeakerMode.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Returns the sample rate at the output of the [godot.AudioServer].
   */
  public fun getMixRate(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_MIX_RATE, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the names of all audio output devices detected on the system.
   */
  public fun getOutputDeviceList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_OUTPUT_DEVICE_LIST,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getOutputDevice(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_OUTPUT_DEVICE,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setOutputDevice(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_OUTPUT_DEVICE, NIL)
  }

  /**
   * Returns the relative time until the next mix occurs.
   */
  public fun getTimeToNextMix(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_TIME_TO_NEXT_MIX,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns the relative time since the last mix occurred.
   */
  public fun getTimeSinceLastMix(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_TIME_SINCE_LAST_MIX,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns the audio driver's output latency.
   */
  public fun getOutputLatency(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_OUTPUT_LATENCY,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns the names of all audio input devices detected on the system.
   *
   * **Note:** [godot.ProjectSettings.audio/driver/enableInput] must be `true` for audio input to work. See also that setting's description for caveats related to permissions and operating system privacy settings.
   */
  public fun getInputDeviceList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_INPUT_DEVICE_LIST,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  public fun getInputDevice(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_INPUT_DEVICE,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setInputDevice(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_INPUT_DEVICE, NIL)
  }

  /**
   * Overwrites the currently used [godot.AudioBusLayout].
   */
  public fun setBusLayout(busLayout: AudioBusLayout): Unit {
    TransferContext.writeArguments(OBJECT to busLayout)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_BUS_LAYOUT, NIL)
  }

  /**
   * Generates an [godot.AudioBusLayout] using the available buses and effects.
   */
  public fun generateBusLayout(): AudioBusLayout? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GENERATE_BUS_LAYOUT,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AudioBusLayout?)
  }

  /**
   *
   */
  public fun setEnableTaggingUsedAudioStreams(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_ENABLE_TAGGING_USED_AUDIO_STREAMS, NIL)
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }
}

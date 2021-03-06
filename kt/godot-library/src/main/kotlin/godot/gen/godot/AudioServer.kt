// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.AudioServer
import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Server interface for low-level audio access.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/audio/audio_buses.html](https://docs.godotengine.org/en/latest/tutorials/audio/audio_buses.html)
 *
 * [godot.AudioServer] is a low-level server interface for audio access. It is in charge of creating sample data (playable audio) as well as its playback via a voice interface.
 */
@GodotBaseType
object AudioServer : Object() {
  /**
   * Two or fewer speakers were detected.
   */
  final const val SPEAKER_MODE_STEREO: Long = 0

  /**
   * A 3.1 channel surround setup was detected.
   */
  final const val SPEAKER_SURROUND_31: Long = 1

  /**
   * A 5.1 channel surround setup was detected.
   */
  final const val SPEAKER_SURROUND_51: Long = 2

  /**
   * A 7.1 channel surround setup was detected.
   */
  final const val SPEAKER_SURROUND_71: Long = 3

  /**
   * Emitted when the [godot.AudioBusLayout] changes.
   */
  val busLayoutChanged: Signal0 by signal()

  /**
   * Number of available audio buses.
   */
  var busCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_COUNT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_BUS_COUNT, NIL)
    }

  /**
   * Name of the current device for audio output (see [getDeviceList]).
   */
  var device: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_DEVICE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_DEVICE, NIL)
    }

  /**
   * Scales the rate at which audio is played (i.e. setting it to `0.5` will make the audio be played twice as fast).
   */
  var globalRateScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_GLOBAL_RATE_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_GLOBAL_RATE_SCALE,
          NIL)
    }

  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINESINGLETON_AUDIOSERVER)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Adds a bus at `at_position`.
   */
  fun addBus(atPosition: Long = -1) {
    TransferContext.writeArguments(LONG to atPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_ADD_BUS, NIL)
  }

  /**
   * Adds an [godot.AudioEffect] effect to the bus `bus_idx` at `at_position`.
   */
  fun addBusEffect(
    busIdx: Long,
    effect: AudioEffect,
    atPosition: Long = -1
  ) {
    TransferContext.writeArguments(LONG to busIdx, OBJECT to effect, LONG to atPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_ADD_BUS_EFFECT, NIL)
  }

  /**
   * Name of the current device for audio input (see [captureGetDeviceList]).
   */
  fun captureGetDevice(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_CAPTURE_GET_DEVICE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the names of all audio input devices detected on the system.
   */
  fun captureGetDeviceList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_CAPTURE_GET_DEVICE_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Sets which audio input device is used for audio capture.
   */
  fun captureSetDevice(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_CAPTURE_SET_DEVICE, NIL)
  }

  /**
   * Generates an [godot.AudioBusLayout] using the available buses and effects.
   */
  fun generateBusLayout(): AudioBusLayout? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GENERATE_BUS_LAYOUT,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AudioBusLayout?
  }

  /**
   * Returns the amount of channels of the bus at index `bus_idx`.
   */
  fun getBusChannels(busIdx: Long): Long {
    TransferContext.writeArguments(LONG to busIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_CHANNELS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [godot.AudioEffect] at position `effect_idx` in bus `bus_idx`.
   */
  fun getBusEffect(busIdx: Long, effectIdx: Long): AudioEffect? {
    TransferContext.writeArguments(LONG to busIdx, LONG to effectIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_EFFECT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AudioEffect?
  }

  /**
   * Returns the number of effects on the bus at `bus_idx`.
   */
  fun getBusEffectCount(busIdx: Long): Long {
    TransferContext.writeArguments(LONG to busIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_EFFECT_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [godot.AudioEffectInstance] assigned to the given bus and effect indices (and optionally channel).
   */
  fun getBusEffectInstance(
    busIdx: Long,
    effectIdx: Long,
    channel: Long = 0
  ): AudioEffectInstance? {
    TransferContext.writeArguments(LONG to busIdx, LONG to effectIdx, LONG to channel)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_EFFECT_INSTANCE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AudioEffectInstance?
  }

  /**
   * Returns the index of the bus with the name `bus_name`.
   */
  fun getBusIndex(busName: String): Long {
    TransferContext.writeArguments(STRING to busName)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the name of the bus with the index `bus_idx`.
   */
  fun getBusName(busIdx: Long): String {
    TransferContext.writeArguments(LONG to busIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the peak volume of the left speaker at bus index `bus_idx` and channel index `channel`.
   */
  fun getBusPeakVolumeLeftDb(busIdx: Long, channel: Long): Double {
    TransferContext.writeArguments(LONG to busIdx, LONG to channel)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_PEAK_VOLUME_LEFT_DB, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the peak volume of the right speaker at bus index `bus_idx` and channel index `channel`.
   */
  fun getBusPeakVolumeRightDb(busIdx: Long, channel: Long): Double {
    TransferContext.writeArguments(LONG to busIdx, LONG to channel)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_PEAK_VOLUME_RIGHT_DB, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the name of the bus that the bus at index `bus_idx` sends to.
   */
  fun getBusSend(busIdx: Long): String {
    TransferContext.writeArguments(LONG to busIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_SEND, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the volume of the bus at index `bus_idx` in dB.
   */
  fun getBusVolumeDb(busIdx: Long): Double {
    TransferContext.writeArguments(LONG to busIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_BUS_VOLUME_DB,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the names of all audio devices detected on the system.
   */
  fun getDeviceList(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_DEVICE_LIST, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the sample rate at the output of the [godot.AudioServer].
   */
  fun getMixRate(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_MIX_RATE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the audio driver's output latency.
   */
  fun getOutputLatency(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_OUTPUT_LATENCY,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the speaker configuration.
   */
  fun getSpeakerMode(): AudioServer.SpeakerMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_SPEAKER_MODE, LONG)
    return AudioServer.SpeakerMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the relative time since the last mix occurred.
   */
  fun getTimeSinceLastMix(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_TIME_SINCE_LAST_MIX,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the relative time until the next mix occurs.
   */
  fun getTimeToNextMix(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_GET_TIME_TO_NEXT_MIX,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * If `true`, the bus at index `bus_idx` is bypassing effects.
   */
  fun isBusBypassingEffects(busIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to busIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_IS_BUS_BYPASSING_EFFECTS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If `true`, the effect at index `effect_idx` on the bus at index `bus_idx` is enabled.
   */
  fun isBusEffectEnabled(busIdx: Long, effectIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to busIdx, LONG to effectIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_IS_BUS_EFFECT_ENABLED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If `true`, the bus at index `bus_idx` is muted.
   */
  fun isBusMute(busIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to busIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_IS_BUS_MUTE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If `true`, the bus at index `bus_idx` is in solo mode.
   */
  fun isBusSolo(busIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to busIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_IS_BUS_SOLO, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Locks the audio driver's main loop.
   *
   * **Note:** Remember to unlock it afterwards.
   */
  fun lock() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_LOCK, NIL)
  }

  /**
   * Moves the bus from index `index` to index `to_index`.
   */
  fun moveBus(index: Long, toIndex: Long) {
    TransferContext.writeArguments(LONG to index, LONG to toIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_MOVE_BUS, NIL)
  }

  /**
   * Removes the bus at index `index`.
   */
  fun removeBus(index: Long) {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_REMOVE_BUS, NIL)
  }

  /**
   * Removes the effect at index `effect_idx` from the bus at index `bus_idx`.
   */
  fun removeBusEffect(busIdx: Long, effectIdx: Long) {
    TransferContext.writeArguments(LONG to busIdx, LONG to effectIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_REMOVE_BUS_EFFECT, NIL)
  }

  /**
   * If `true`, the bus at index `bus_idx` is bypassing effects.
   */
  fun setBusBypassEffects(busIdx: Long, enable: Boolean) {
    TransferContext.writeArguments(LONG to busIdx, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_BUS_BYPASS_EFFECTS,
        NIL)
  }

  /**
   * If `true`, the effect at index `effect_idx` on the bus at index `bus_idx` is enabled.
   */
  fun setBusEffectEnabled(
    busIdx: Long,
    effectIdx: Long,
    enabled: Boolean
  ) {
    TransferContext.writeArguments(LONG to busIdx, LONG to effectIdx, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_BUS_EFFECT_ENABLED,
        NIL)
  }

  /**
   * Overwrites the currently used [godot.AudioBusLayout].
   */
  fun setBusLayout(busLayout: AudioBusLayout) {
    TransferContext.writeArguments(OBJECT to busLayout)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_BUS_LAYOUT, NIL)
  }

  /**
   * If `true`, the bus at index `bus_idx` is muted.
   */
  fun setBusMute(busIdx: Long, enable: Boolean) {
    TransferContext.writeArguments(LONG to busIdx, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_BUS_MUTE, NIL)
  }

  /**
   * Sets the name of the bus at index `bus_idx` to `name`.
   */
  fun setBusName(busIdx: Long, name: String) {
    TransferContext.writeArguments(LONG to busIdx, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_BUS_NAME, NIL)
  }

  /**
   * Connects the output of the bus at `bus_idx` to the bus named `send`.
   */
  fun setBusSend(busIdx: Long, send: String) {
    TransferContext.writeArguments(LONG to busIdx, STRING to send)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_BUS_SEND, NIL)
  }

  /**
   * If `true`, the bus at index `bus_idx` is in solo mode.
   */
  fun setBusSolo(busIdx: Long, enable: Boolean) {
    TransferContext.writeArguments(LONG to busIdx, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_BUS_SOLO, NIL)
  }

  /**
   * Sets the volume of the bus at index `bus_idx` to `volume_db`.
   */
  fun setBusVolumeDb(busIdx: Long, volumeDb: Double) {
    TransferContext.writeArguments(LONG to busIdx, DOUBLE to volumeDb)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SET_BUS_VOLUME_DB, NIL)
  }

  /**
   * Swaps the position of two effects in bus `bus_idx`.
   */
  fun swapBusEffects(
    busIdx: Long,
    effectIdx: Long,
    byEffectIdx: Long
  ) {
    TransferContext.writeArguments(LONG to busIdx, LONG to effectIdx, LONG to byEffectIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_SWAP_BUS_EFFECTS, NIL)
  }

  /**
   * Unlocks the audio driver's main loop. (After locking it, you should always unlock it.)
   */
  fun unlock() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSERVER_UNLOCK, NIL)
  }

  enum class SpeakerMode(
    id: Long
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
    SPEAKER_SURROUND_71(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}

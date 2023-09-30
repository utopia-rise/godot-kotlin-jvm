// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Wraps a pool of audio streams with pitch and volume shifting.
 *
 * Picks a random AudioStream from the pool, depending on the playback mode, and applies random pitch shifting and volume shifting during playback.
 */
@GodotBaseType
public open class AudioStreamRandomizer : AudioStream() {
  /**
   * The number of streams in the stream pool.
   */
  public var streamsCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMRANDOMIZER_GET_STREAMS_COUNT, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMRANDOMIZER_SET_STREAMS_COUNT, NIL)
    }

  /**
   * Controls how this AudioStreamRandomizer picks which AudioStream to play next.
   */
  public var playbackMode: PlaybackMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMRANDOMIZER_GET_PLAYBACK_MODE, LONG)
      return AudioStreamRandomizer.PlaybackMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMRANDOMIZER_SET_PLAYBACK_MODE, NIL)
    }

  /**
   * The intensity of random pitch variation. A value of 1 means no variation.
   */
  public var randomPitch: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMRANDOMIZER_GET_RANDOM_PITCH, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMRANDOMIZER_SET_RANDOM_PITCH, NIL)
    }

  /**
   * The intensity of random volume variation. A value of 0 means no variation.
   */
  public var randomVolumeOffsetDb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMRANDOMIZER_GET_RANDOM_VOLUME_OFFSET_DB, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMRANDOMIZER_SET_RANDOM_VOLUME_OFFSET_DB, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOSTREAMRANDOMIZER, scriptIndex)
    return true
  }

  /**
   * Insert a stream at the specified index. If the index is less than zero, the insertion occurs at the end of the underlying pool.
   */
  @JvmOverloads
  public fun addStream(
    index: Int,
    stream: AudioStream,
    weight: Float = 1.0f,
  ): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), OBJECT to stream, DOUBLE to weight.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMRANDOMIZER_ADD_STREAM,
        NIL)
  }

  /**
   * Move a stream from one index to another.
   */
  public fun moveStream(indexFrom: Int, indexTo: Int): Unit {
    TransferContext.writeArguments(LONG to indexFrom.toLong(), LONG to indexTo.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMRANDOMIZER_MOVE_STREAM,
        NIL)
  }

  /**
   * Remove the stream at the specified index.
   */
  public fun removeStream(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMRANDOMIZER_REMOVE_STREAM,
        NIL)
  }

  /**
   * Set the AudioStream at the specified index.
   */
  public fun setStream(index: Int, stream: AudioStream): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), OBJECT to stream)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMRANDOMIZER_SET_STREAM,
        NIL)
  }

  /**
   * Returns the stream at the specified index.
   */
  public fun getStream(index: Int): AudioStream? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMRANDOMIZER_GET_STREAM,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as AudioStream?)
  }

  /**
   * Set the probability weight of the stream at the specified index. The higher this value, the more likely that the randomizer will choose this stream during random playback modes.
   */
  public fun setStreamProbabilityWeight(index: Int, weight: Float): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to weight.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMRANDOMIZER_SET_STREAM_PROBABILITY_WEIGHT, NIL)
  }

  /**
   * Returns the probability weight associated with the stream at the given index.
   */
  public fun getStreamProbabilityWeight(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMRANDOMIZER_GET_STREAM_PROBABILITY_WEIGHT, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public enum class PlaybackMode(
    id: Long,
  ) {
    /**
     * Pick a stream at random according to the probability weights chosen for each stream, but avoid playing the same stream twice in a row whenever possible. If only 1 sound is present in the pool, the same sound will always play, effectively allowing repeats to occur.
     */
    PLAYBACK_RANDOM_NO_REPEATS(0),
    /**
     * Pick a stream at random according to the probability weights chosen for each stream. If only 1 sound is present in the pool, the same sound will always play.
     */
    PLAYBACK_RANDOM(1),
    /**
     * Play streams in the order they appear in the stream pool. If only 1 sound is present in the pool, the same sound will always play.
     */
    PLAYBACK_SEQUENTIAL(2),
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
}

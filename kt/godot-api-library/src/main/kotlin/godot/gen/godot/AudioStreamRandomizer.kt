// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_AUDIOSTREAMRANDOMIZER_INDEX: Int = 126

/**
 * Picks a random AudioStream from the pool, depending on the playback mode, and applies random
 * pitch shifting and volume shifting during playback.
 */
@GodotBaseType
public open class AudioStreamRandomizer : AudioStream() {
  /**
   * Controls how this AudioStreamRandomizer picks which AudioStream to play next.
   */
  public final inline var playbackMode: PlaybackMode
    @JvmName("playbackModeProperty")
    get() = getPlaybackMode()
    @JvmName("playbackModeProperty")
    set(`value`) {
      setPlaybackMode(value)
    }

  /**
   * The intensity of random pitch variation. A value of 1 means no variation.
   */
  public final inline var randomPitch: Float
    @JvmName("randomPitchProperty")
    get() = getRandomPitch()
    @JvmName("randomPitchProperty")
    set(`value`) {
      setRandomPitch(value)
    }

  /**
   * The intensity of random volume variation. A value of 0 means no variation.
   */
  public final inline var randomVolumeOffsetDb: Float
    @JvmName("randomVolumeOffsetDbProperty")
    get() = getRandomVolumeOffsetDb()
    @JvmName("randomVolumeOffsetDbProperty")
    set(`value`) {
      setRandomVolumeOffsetDb(value)
    }

  /**
   * The number of streams in the stream pool.
   */
  public final inline var streamsCount: Int
    @JvmName("streamsCountProperty")
    get() = getStreamsCount()
    @JvmName("streamsCountProperty")
    set(`value`) {
      setStreamsCount(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_AUDIOSTREAMRANDOMIZER_INDEX, scriptIndex)
  }

  /**
   * Insert a stream at the specified index. If the index is less than zero, the insertion occurs at
   * the end of the underlying pool.
   */
  @JvmOverloads
  public final fun addStream(
    index: Int,
    stream: AudioStream?,
    weight: Float = 1.0f,
  ): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), OBJECT to stream, DOUBLE to weight.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.addStreamPtr, NIL)
  }

  /**
   * Move a stream from one index to another.
   */
  public final fun moveStream(indexFrom: Int, indexTo: Int): Unit {
    TransferContext.writeArguments(LONG to indexFrom.toLong(), LONG to indexTo.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveStreamPtr, NIL)
  }

  /**
   * Remove the stream at the specified index.
   */
  public final fun removeStream(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeStreamPtr, NIL)
  }

  /**
   * Set the AudioStream at the specified index.
   */
  public final fun setStream(index: Int, stream: AudioStream?): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), OBJECT to stream)
    TransferContext.callMethod(rawPtr, MethodBindings.setStreamPtr, NIL)
  }

  /**
   * Returns the stream at the specified index.
   */
  public final fun getStream(index: Int): AudioStream? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getStreamPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as AudioStream?)
  }

  /**
   * Set the probability weight of the stream at the specified index. The higher this value, the
   * more likely that the randomizer will choose this stream during random playback modes.
   */
  public final fun setStreamProbabilityWeight(index: Int, weight: Float): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to weight.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setStreamProbabilityWeightPtr, NIL)
  }

  /**
   * Returns the probability weight associated with the stream at the given index.
   */
  public final fun getStreamProbabilityWeight(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getStreamProbabilityWeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setStreamsCount(count: Int): Unit {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setStreamsCountPtr, NIL)
  }

  public final fun getStreamsCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStreamsCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setRandomPitch(scale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setRandomPitchPtr, NIL)
  }

  public final fun getRandomPitch(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRandomPitchPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRandomVolumeOffsetDb(dbOffset: Float): Unit {
    TransferContext.writeArguments(DOUBLE to dbOffset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setRandomVolumeOffsetDbPtr, NIL)
  }

  public final fun getRandomVolumeOffsetDb(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRandomVolumeOffsetDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPlaybackMode(mode: PlaybackMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setPlaybackModePtr, NIL)
  }

  public final fun getPlaybackMode(): PlaybackMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPlaybackModePtr, LONG)
    return AudioStreamRandomizer.PlaybackMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class PlaybackMode(
    id: Long,
  ) {
    /**
     * Pick a stream at random according to the probability weights chosen for each stream, but
     * avoid playing the same stream twice in a row whenever possible. If only 1 sound is present in
     * the pool, the same sound will always play, effectively allowing repeats to occur.
     */
    PLAYBACK_RANDOM_NO_REPEATS(0),
    /**
     * Pick a stream at random according to the probability weights chosen for each stream. If only
     * 1 sound is present in the pool, the same sound will always play.
     */
    PLAYBACK_RANDOM(1),
    /**
     * Play streams in the order they appear in the stream pool. If only 1 sound is present in the
     * pool, the same sound will always play.
     */
    PLAYBACK_SEQUENTIAL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PlaybackMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val addStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "add_stream", 1892018854)

    public val moveStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "move_stream", 3937882851)

    public val removeStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "remove_stream", 1286410249)

    public val setStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "set_stream", 111075094)

    public val getStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "get_stream", 2739380747)

    public val setStreamProbabilityWeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "set_stream_probability_weight", 1602489585)

    public val getStreamProbabilityWeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "get_stream_probability_weight", 2339986948)

    public val setStreamsCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "set_streams_count", 1286410249)

    public val getStreamsCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "get_streams_count", 3905245786)

    public val setRandomPitchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "set_random_pitch", 373806689)

    public val getRandomPitchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "get_random_pitch", 1740695150)

    public val setRandomVolumeOffsetDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "set_random_volume_offset_db", 373806689)

    public val getRandomVolumeOffsetDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "get_random_volume_offset_db", 1740695150)

    public val setPlaybackModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "set_playback_mode", 3950967023)

    public val getPlaybackModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "get_playback_mode", 3943055077)
  }
}

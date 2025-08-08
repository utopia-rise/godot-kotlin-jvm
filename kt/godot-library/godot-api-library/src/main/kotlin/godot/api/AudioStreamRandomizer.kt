// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * Picks a random AudioStream from the pool, depending on the playback mode, and applies random pitch shifting and volume shifting during playback.
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

  override fun new(scriptIndex: Int) {
    createNativeObject(99, scriptIndex)
  }

  /**
   * Insert a stream at the specified index. If the index is less than zero, the insertion occurs at the end of the underlying pool.
   */
  @JvmOverloads
  public final fun addStream(
    index: Int,
    stream: AudioStream?,
    weight: Float = 1.0f,
  ) {
    TransferContext.writeArguments(LONG to index.toLong(), OBJECT to stream, DOUBLE to weight.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.addStreamPtr, NIL)
  }

  /**
   * Move a stream from one index to another.
   */
  public final fun moveStream(indexFrom: Int, indexTo: Int) {
    TransferContext.writeArguments(LONG to indexFrom.toLong(), LONG to indexTo.toLong())
    TransferContext.callMethod(ptr, MethodBindings.moveStreamPtr, NIL)
  }

  /**
   * Remove the stream at the specified index.
   */
  public final fun removeStream(index: Int) {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeStreamPtr, NIL)
  }

  /**
   * Set the AudioStream at the specified index.
   */
  public final fun setStream(index: Int, stream: AudioStream?) {
    TransferContext.writeArguments(LONG to index.toLong(), OBJECT to stream)
    TransferContext.callMethod(ptr, MethodBindings.setStreamPtr, NIL)
  }

  /**
   * Returns the stream at the specified index.
   */
  public final fun getStream(index: Int): AudioStream? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getStreamPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as AudioStream?)
  }

  /**
   * Set the probability weight of the stream at the specified index. The higher this value, the more likely that the randomizer will choose this stream during random playback modes.
   */
  public final fun setStreamProbabilityWeight(index: Int, weight: Float) {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to weight.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setStreamProbabilityWeightPtr, NIL)
  }

  /**
   * Returns the probability weight associated with the stream at the given index.
   */
  public final fun getStreamProbabilityWeight(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getStreamProbabilityWeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setStreamsCount(count: Int) {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setStreamsCountPtr, NIL)
  }

  public final fun getStreamsCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStreamsCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setRandomPitch(scale: Float) {
    TransferContext.writeArguments(DOUBLE to scale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRandomPitchPtr, NIL)
  }

  public final fun getRandomPitch(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRandomPitchPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRandomVolumeOffsetDb(dbOffset: Float) {
    TransferContext.writeArguments(DOUBLE to dbOffset.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRandomVolumeOffsetDbPtr, NIL)
  }

  public final fun getRandomVolumeOffsetDb(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRandomVolumeOffsetDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPlaybackMode(mode: PlaybackMode) {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setPlaybackModePtr, NIL)
  }

  public final fun getPlaybackMode(): PlaybackMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPlaybackModePtr, LONG)
    return PlaybackMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class PlaybackMode(
    id: Long,
  ) {
    /**
     * Pick a stream at random according to the probability weights chosen for each stream, but avoid playing the same stream twice in a row whenever possible. If only 1 sound is present in the pool, the same sound will always play, effectively allowing repeats to occur.
     */
    RANDOM_NO_REPEATS(0),
    /**
     * Pick a stream at random according to the probability weights chosen for each stream. If only 1 sound is present in the pool, the same sound will always play.
     */
    RANDOM(1),
    /**
     * Play streams in the order they appear in the stream pool. If only 1 sound is present in the pool, the same sound will always play.
     */
    SEQUENTIAL(2),
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

  public object MethodBindings {
    internal val addStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "add_stream", 1_892_018_854)

    internal val moveStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "move_stream", 3_937_882_851)

    internal val removeStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "remove_stream", 1_286_410_249)

    internal val setStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "set_stream", 111_075_094)

    internal val getStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "get_stream", 2_739_380_747)

    internal val setStreamProbabilityWeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "set_stream_probability_weight", 1_602_489_585)

    internal val getStreamProbabilityWeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "get_stream_probability_weight", 2_339_986_948)

    internal val setStreamsCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "set_streams_count", 1_286_410_249)

    internal val getStreamsCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "get_streams_count", 3_905_245_786)

    internal val setRandomPitchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "set_random_pitch", 373_806_689)

    internal val getRandomPitchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "get_random_pitch", 1_740_695_150)

    internal val setRandomVolumeOffsetDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "set_random_volume_offset_db", 373_806_689)

    internal val getRandomVolumeOffsetDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "get_random_volume_offset_db", 1_740_695_150)

    internal val setPlaybackModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "set_playback_mode", 3_950_967_023)

    internal val getPlaybackModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamRandomizer", "get_playback_mode", 3_943_055_077)
  }
}

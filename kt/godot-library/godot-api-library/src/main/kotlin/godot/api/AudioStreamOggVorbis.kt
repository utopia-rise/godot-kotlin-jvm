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
import godot.core.Dictionary
import godot.core.PackedByteArray
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmStatic

/**
 * The AudioStreamOggVorbis class is a specialized [AudioStream] for handling Ogg Vorbis file
 * formats. It offers functionality for loading and playing back Ogg Vorbis files, as well as managing
 * looping and other playback properties. This class is part of the audio stream system, which also
 * supports WAV files through the [AudioStreamWAV] class.
 */
@GodotBaseType
public open class AudioStreamOggVorbis : AudioStream() {
  /**
   * Contains the raw Ogg data for this stream.
   */
  public final inline var packetSequence: OggPacketSequence?
    @JvmName("packetSequenceProperty")
    get() = getPacketSequence()
    @JvmName("packetSequenceProperty")
    set(`value`) {
      setPacketSequence(value)
    }

  public final inline var bpm: Double
    @JvmName("bpmProperty")
    get() = getBpm()
    @JvmName("bpmProperty")
    set(`value`) {
      setBpm(value)
    }

  public final inline var beatCount: Int
    @JvmName("beatCountProperty")
    get() = getBeatCount()
    @JvmName("beatCountProperty")
    set(`value`) {
      setBeatCount(value)
    }

  public final inline var barBeats: Int
    @JvmName("barBeatsProperty")
    get() = getBarBeats()
    @JvmName("barBeatsProperty")
    set(`value`) {
      setBarBeats(value)
    }

  /**
   * Contains user-defined tags if found in the Ogg Vorbis data.
   *
   * Commonly used tags include `title`, `artist`, `album`, `tracknumber`, and `date` (`date` does
   * not have a standard date format).
   *
   * **Note:** No tag is *guaranteed* to be present in every file, so make sure to account for the
   * keys not always existing.
   */
  public final inline var tags: Dictionary<Any?, Any?>
    @JvmName("tagsProperty")
    get() = getTags()
    @JvmName("tagsProperty")
    set(`value`) {
      setTags(value)
    }

  /**
   * If `true`, the audio will play again from the specified [loopOffset] once it is done playing.
   * Useful for ambient sounds and background music.
   */
  public final inline var loop: Boolean
    @JvmName("loopProperty")
    get() = hasLoop()
    @JvmName("loopProperty")
    set(`value`) {
      setLoop(value)
    }

  /**
   * Time in seconds at which the stream starts after being looped.
   */
  public final inline var loopOffset: Double
    @JvmName("loopOffsetProperty")
    get() = getLoopOffset()
    @JvmName("loopOffsetProperty")
    set(`value`) {
      setLoopOffset(value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(87, scriptPtr)
  }

  public final fun setPacketSequence(packetSequence: OggPacketSequence?): Unit {
    TransferContext.writeArguments(OBJECT to packetSequence)
    TransferContext.callMethod(ptr, MethodBindings.setPacketSequencePtr, NIL)
  }

  public final fun getPacketSequence(): OggPacketSequence? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPacketSequencePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OggPacketSequence?)
  }

  public final fun setLoop(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setLoopPtr, NIL)
  }

  public final fun hasLoop(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasLoopPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setLoopOffset(seconds: Double): Unit {
    TransferContext.writeArguments(DOUBLE to seconds)
    TransferContext.callMethod(ptr, MethodBindings.setLoopOffsetPtr, NIL)
  }

  public final fun getLoopOffset(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLoopOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setBpm(bpm: Double): Unit {
    TransferContext.writeArguments(DOUBLE to bpm)
    TransferContext.callMethod(ptr, MethodBindings.setBpmPtr, NIL)
  }

  public final fun getBpm(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBpmPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setBeatCount(count: Int): Unit {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setBeatCountPtr, NIL)
  }

  public final fun getBeatCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBeatCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setBarBeats(count: Int): Unit {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setBarBeatsPtr, NIL)
  }

  public final fun getBarBeats(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBarBeatsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setTags(tags: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to tags)
    TransferContext.callMethod(ptr, MethodBindings.setTagsPtr, NIL)
  }

  public final fun getTags(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTagsPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public companion object {
    /**
     * Creates a new [AudioStreamOggVorbis] instance from the given buffer. The buffer must contain
     * Ogg Vorbis data.
     */
    @JvmStatic
    public final fun loadFromBuffer(streamData: PackedByteArray): AudioStreamOggVorbis? {
      TransferContext.writeArguments(PACKED_BYTE_ARRAY to streamData)
      TransferContext.callMethod(0, MethodBindings.loadFromBufferPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as AudioStreamOggVorbis?)
    }

    /**
     * Creates a new [AudioStreamOggVorbis] instance from the given file path. The file must be in
     * Ogg Vorbis format.
     */
    @JvmStatic
    public final fun loadFromFile(path: String): AudioStreamOggVorbis? {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.loadFromFilePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT) as AudioStreamOggVorbis?)
    }
  }

  public object MethodBindings {
    internal val loadFromBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "load_from_buffer", 354904730)

    internal val loadFromFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "load_from_file", 797568536)

    internal val setPacketSequencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "set_packet_sequence", 438882457)

    internal val getPacketSequencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "get_packet_sequence", 2801636033)

    internal val setLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "set_loop", 2586408642)

    internal val hasLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "has_loop", 36873697)

    internal val setLoopOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "set_loop_offset", 373806689)

    internal val getLoopOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "get_loop_offset", 1740695150)

    internal val setBpmPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "set_bpm", 373806689)

    internal val getBpmPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "get_bpm", 1740695150)

    internal val setBeatCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "set_beat_count", 1286410249)

    internal val getBeatCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "get_beat_count", 3905245786)

    internal val setBarBeatsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "set_bar_beats", 1286410249)

    internal val getBarBeatsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "get_bar_beats", 3905245786)

    internal val setTagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "set_tags", 4155329257)

    internal val getTagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "get_tags", 3102165223)
  }
}

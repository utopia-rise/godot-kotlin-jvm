// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_AUDIOSTREAMOGGVORBIS_INDEX: Int = 120

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

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_AUDIOSTREAMOGGVORBIS_INDEX, scriptIndex)
  }

  public final fun setPacketSequence(packetSequence: OggPacketSequence?): Unit {
    Internals.writeArguments(OBJECT to packetSequence)
    Internals.callMethod(rawPtr, MethodBindings.setPacketSequencePtr, NIL)
  }

  public final fun getPacketSequence(): OggPacketSequence? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPacketSequencePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as OggPacketSequence?)
  }

  public final fun setLoop(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setLoopPtr, NIL)
  }

  public final fun hasLoop(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.hasLoopPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setLoopOffset(seconds: Double): Unit {
    Internals.writeArguments(DOUBLE to seconds)
    Internals.callMethod(rawPtr, MethodBindings.setLoopOffsetPtr, NIL)
  }

  public final fun getLoopOffset(): Double {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLoopOffsetPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double)
  }

  public final fun setBpm(bpm: Double): Unit {
    Internals.writeArguments(DOUBLE to bpm)
    Internals.callMethod(rawPtr, MethodBindings.setBpmPtr, NIL)
  }

  public final fun getBpm(): Double {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBpmPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double)
  }

  public final fun setBeatCount(count: Int): Unit {
    Internals.writeArguments(LONG to count.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setBeatCountPtr, NIL)
  }

  public final fun getBeatCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBeatCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setBarBeats(count: Int): Unit {
    Internals.writeArguments(LONG to count.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setBarBeatsPtr, NIL)
  }

  public final fun getBarBeats(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBarBeatsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public companion object {
    /**
     * Creates a new AudioStreamOggVorbis instance from the given buffer. The buffer must contain
     * Ogg Vorbis data.
     */
    public final fun loadFromBuffer(buffer: PackedByteArray): AudioStreamOggVorbis? {
      Internals.writeArguments(PACKED_BYTE_ARRAY to buffer)
      Internals.callMethod(0, MethodBindings.loadFromBufferPtr, OBJECT)
      return (Internals.readReturnValue(OBJECT) as AudioStreamOggVorbis?)
    }

    /**
     * Creates a new AudioStreamOggVorbis instance from the given file path. The file must be in Ogg
     * Vorbis format.
     */
    public final fun loadFromFile(path: String): AudioStreamOggVorbis? {
      Internals.writeArguments(STRING to path)
      Internals.callMethod(0, MethodBindings.loadFromFilePtr, OBJECT)
      return (Internals.readReturnValue(OBJECT) as AudioStreamOggVorbis?)
    }
  }

  public object MethodBindings {
    internal val loadFromBufferPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamOggVorbis", "load_from_buffer", 354904730)

    internal val loadFromFilePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamOggVorbis", "load_from_file", 797568536)

    internal val setPacketSequencePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamOggVorbis", "set_packet_sequence", 438882457)

    internal val getPacketSequencePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamOggVorbis", "get_packet_sequence", 2801636033)

    internal val setLoopPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamOggVorbis", "set_loop", 2586408642)

    internal val hasLoopPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamOggVorbis", "has_loop", 36873697)

    internal val setLoopOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamOggVorbis", "set_loop_offset", 373806689)

    internal val getLoopOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamOggVorbis", "get_loop_offset", 1740695150)

    internal val setBpmPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamOggVorbis", "set_bpm", 373806689)

    internal val getBpmPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamOggVorbis", "get_bpm", 1740695150)

    internal val setBeatCountPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamOggVorbis", "set_beat_count", 1286410249)

    internal val getBeatCountPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamOggVorbis", "get_beat_count", 3905245786)

    internal val setBarBeatsPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamOggVorbis", "set_bar_beats", 1286410249)

    internal val getBarBeatsPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioStreamOggVorbis", "get_bar_beats", 3905245786)
  }
}

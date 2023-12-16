// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class AudioStreamOggVorbis : AudioStream() {
  public var packetSequence: OggPacketSequence?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPacketSequencePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as OggPacketSequence?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPacketSequencePtr, NIL)
    }

  public var bpm: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBpmPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBpmPtr, NIL)
    }

  public var beatCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBeatCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBeatCountPtr, NIL)
    }

  public var barBeats: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBarBeatsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBarBeatsPtr, NIL)
    }

  public var loop: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.hasLoopPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLoopPtr, NIL)
    }

  public var loopOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLoopOffsetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLoopOffsetPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOSTREAMOGGVORBIS, scriptIndex)
    return true
  }

  public companion object {
    public fun loadFromBuffer(buffer: PackedByteArray): AudioStreamOggVorbis? {
      TransferContext.writeArguments(PACKED_BYTE_ARRAY to buffer)
      TransferContext.callMethod(0, MethodBindings.loadFromBufferPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStreamOggVorbis?)
    }

    public fun loadFromFile(path: String): AudioStreamOggVorbis? {
      TransferContext.writeArguments(STRING to path)
      TransferContext.callMethod(0, MethodBindings.loadFromFilePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as AudioStreamOggVorbis?)
    }
  }

  internal object MethodBindings {
    public val loadFromBufferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "load_from_buffer")

    public val loadFromFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "load_from_file")

    public val setPacketSequencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "set_packet_sequence")

    public val getPacketSequencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "get_packet_sequence")

    public val setLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "set_loop")

    public val hasLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "has_loop")

    public val setLoopOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "set_loop_offset")

    public val getLoopOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "get_loop_offset")

    public val setBpmPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "set_bpm")

    public val getBpmPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "get_bpm")

    public val setBeatCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "set_beat_count")

    public val getBeatCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "get_beat_count")

    public val setBarBeatsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "set_bar_beats")

    public val getBarBeatsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamOggVorbis", "get_bar_beats")
  }
}

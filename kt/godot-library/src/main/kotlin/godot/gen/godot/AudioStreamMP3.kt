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
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * MP3 audio stream driver. See [data] if you want to load an MP3 file at run-time.
 */
@GodotBaseType
public open class AudioStreamMP3 : AudioStream() {
  /**
   * Contains the audio data in bytes.
   * You can load a file without having to import it beforehand using the code snippet below. Keep
   * in mind that this snippet loads the whole file into memory and may not be ideal for huge files
   * (hundreds of megabytes or more).
   *
   * gdscript:
   * ```gdscript
   * func load_mp3(path):
   *     var file = FileAccess.open(path, FileAccess.READ)
   *     var sound = AudioStreamMP3.new()
   *     sound.data = file.get_buffer(file.get_length())
   *     return sound
   * ```
   * csharp:
   * ```csharp
   * public AudioStreamMP3 LoadMP3(string path)
   * {
   *     using var file = FileAccess.Open(path, FileAccess.ModeFlags.Read);
   *     var sound = new AudioStreamMP3();
   *     sound.Data = file.GetBuffer(file.GetLength());
   *     return sound;
   * }
   * ```
   */
  public var `data`: PackedByteArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDataPtr, PACKED_BYTE_ARRAY)
      return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_BYTE_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDataPtr, NIL)
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

  /**
   * If `true`, the stream will automatically loop when it reaches the end.
   */
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

  /**
   * Time in seconds at which the stream starts after being looped.
   */
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

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMMP3, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamMP3", "set_data", 2971499966)

    public val getDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamMP3", "get_data", 2362200018)

    public val setLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamMP3", "set_loop", 2586408642)

    public val hasLoopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamMP3", "has_loop", 36873697)

    public val setLoopOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamMP3", "set_loop_offset", 373806689)

    public val getLoopOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamMP3", "get_loop_offset", 1740695150)

    public val setBpmPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamMP3", "set_bpm", 373806689)

    public val getBpmPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamMP3", "get_bpm", 1740695150)

    public val setBeatCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamMP3", "set_beat_count", 1286410249)

    public val getBeatCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamMP3", "get_beat_count", 3905245786)

    public val setBarBeatsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamMP3", "set_bar_beats", 1286410249)

    public val getBarBeatsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamMP3", "get_bar_beats", 3905245786)
  }
}

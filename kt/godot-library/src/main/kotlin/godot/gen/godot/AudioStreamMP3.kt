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

@GodotBaseType
public open class AudioStreamMP3 : AudioStream() {
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
    callConstructor(ENGINECLASS_AUDIOSTREAMMP3, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setDataPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamMP3", "set_data")

    public val getDataPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamMP3", "get_data")

    public val setLoopPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamMP3", "set_loop")

    public val hasLoopPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamMP3", "has_loop")

    public val setLoopOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamMP3", "set_loop_offset")

    public val getLoopOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamMP3", "get_loop_offset")

    public val setBpmPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamMP3", "set_bpm")

    public val getBpmPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioStreamMP3", "get_bpm")

    public val setBeatCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamMP3", "set_beat_count")

    public val getBeatCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamMP3", "get_beat_count")

    public val setBarBeatsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamMP3", "set_bar_beats")

    public val getBarBeatsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamMP3", "get_bar_beats")
  }
}

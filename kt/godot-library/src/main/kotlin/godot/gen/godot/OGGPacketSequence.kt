// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Suppress

@GodotBaseType
public open class OGGPacketSequence : Resource() {
  public var packetData: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OGGPACKETSEQUENCE_GET_PACKET_DATA,
          ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OGGPACKETSEQUENCE_SET_PACKET_DATA,
          NIL)
    }

  public var granulePositions: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OGGPACKETSEQUENCE_GET_PACKET_GRANULE_POSITIONS, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OGGPACKETSEQUENCE_SET_PACKET_GRANULE_POSITIONS, NIL)
    }

  public var samplingRate: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OGGPACKETSEQUENCE_GET_SAMPLING_RATE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_OGGPACKETSEQUENCE_SET_SAMPLING_RATE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OGGPACKETSEQUENCE, scriptIndex)
    return true
  }

  public fun getLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OGGPACKETSEQUENCE_GET_LENGTH,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public companion object
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt64Array
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_INT_64_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A sequence of Ogg packets.
 */
@GodotBaseType
public open class OggPacketSequence : Resource() {
  /**
   * Contains the raw packets that make up this OggPacketSequence.
   */
  public var packetData: VariantArray<VariantArray<Any?>>
    @JvmName("packetDataProperty")
    get() = getPacketData()
    @JvmName("packetDataProperty")
    set(`value`) {
      setPacketData(value)
    }

  /**
   * Contains the granule positions for each page in this packet sequence.
   */
  public var granulePositions: PackedInt64Array
    @JvmName("granulePositionsProperty")
    get() = getPacketGranulePositions()
    @JvmName("granulePositionsProperty")
    set(`value`) {
      setPacketGranulePositions(value)
    }

  /**
   * Holds sample rate information about this sequence. Must be set by another class that actually
   * understands the codec.
   */
  public var samplingRate: Float
    @JvmName("samplingRateProperty")
    get() = getSamplingRate()
    @JvmName("samplingRateProperty")
    set(`value`) {
      setSamplingRate(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_OGGPACKETSEQUENCE, scriptIndex)
  }

  public fun setPacketData(packetData: VariantArray<VariantArray<Any?>>): Unit {
    TransferContext.writeArguments(ARRAY to packetData)
    TransferContext.callMethod(rawPtr, MethodBindings.setPacketDataPtr, NIL)
  }

  public fun getPacketData(): VariantArray<VariantArray<Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPacketDataPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<VariantArray<Any?>>)
  }

  public fun setPacketGranulePositions(granulePositions: PackedInt64Array): Unit {
    TransferContext.writeArguments(PACKED_INT_64_ARRAY to granulePositions)
    TransferContext.callMethod(rawPtr, MethodBindings.setPacketGranulePositionsPtr, NIL)
  }

  public fun getPacketGranulePositions(): PackedInt64Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPacketGranulePositionsPtr,
        PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY, false) as PackedInt64Array)
  }

  public fun setSamplingRate(samplingRate: Float): Unit {
    TransferContext.writeArguments(DOUBLE to samplingRate.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setSamplingRatePtr, NIL)
  }

  public fun getSamplingRate(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSamplingRatePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * The length of this stream, in seconds.
   */
  public fun getLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setPacketDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OggPacketSequence", "set_packet_data", 381264803)

    public val getPacketDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OggPacketSequence", "get_packet_data", 3995934104)

    public val setPacketGranulePositionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OggPacketSequence", "set_packet_granule_positions", 3709968205)

    public val getPacketGranulePositionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OggPacketSequence", "get_packet_granule_positions", 235988956)

    public val setSamplingRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OggPacketSequence", "set_sampling_rate", 373806689)

    public val getSamplingRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OggPacketSequence", "get_sampling_rate", 1740695150)

    public val getLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OggPacketSequence", "get_length", 1740695150)
  }
}

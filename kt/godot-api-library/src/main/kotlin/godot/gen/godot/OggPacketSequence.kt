// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt64Array
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_INT_64_ARRAY
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_OGGPACKETSEQUENCE_INDEX: Int = 417

/**
 * A sequence of Ogg packets.
 */
@GodotBaseType
public open class OggPacketSequence : Resource() {
  /**
   * Contains the raw packets that make up this OggPacketSequence.
   */
  public final inline var packetData: VariantArray<VariantArray<Any?>>
    @JvmName("packetDataProperty")
    get() = getPacketData()
    @JvmName("packetDataProperty")
    set(`value`) {
      setPacketData(value)
    }

  /**
   * Contains the granule positions for each page in this packet sequence.
   */
  public final inline var granulePositions: PackedInt64Array
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
  public final inline var samplingRate: Float
    @JvmName("samplingRateProperty")
    get() = getSamplingRate()
    @JvmName("samplingRateProperty")
    set(`value`) {
      setSamplingRate(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_OGGPACKETSEQUENCE_INDEX, scriptIndex)
  }

  public final fun setPacketData(packetData: VariantArray<VariantArray<Any?>>): Unit {
    Internals.writeArguments(ARRAY to packetData)
    Internals.callMethod(rawPtr, MethodBindings.setPacketDataPtr, NIL)
  }

  public final fun getPacketData(): VariantArray<VariantArray<Any?>> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPacketDataPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<VariantArray<Any?>>)
  }

  public final fun setPacketGranulePositions(granulePositions: PackedInt64Array): Unit {
    Internals.writeArguments(PACKED_INT_64_ARRAY to granulePositions)
    Internals.callMethod(rawPtr, MethodBindings.setPacketGranulePositionsPtr, NIL)
  }

  public final fun getPacketGranulePositions(): PackedInt64Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPacketGranulePositionsPtr, PACKED_INT_64_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_64_ARRAY) as PackedInt64Array)
  }

  public final fun setSamplingRate(samplingRate: Float): Unit {
    Internals.writeArguments(DOUBLE to samplingRate.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setSamplingRatePtr, NIL)
  }

  public final fun getSamplingRate(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSamplingRatePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * The length of this stream, in seconds.
   */
  public final fun getLength(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLengthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setPacketDataPtr: VoidPtr =
        Internals.getMethodBindPtr("OggPacketSequence", "set_packet_data", 381264803)

    public val getPacketDataPtr: VoidPtr =
        Internals.getMethodBindPtr("OggPacketSequence", "get_packet_data", 3995934104)

    public val setPacketGranulePositionsPtr: VoidPtr =
        Internals.getMethodBindPtr("OggPacketSequence", "set_packet_granule_positions", 3709968205)

    public val getPacketGranulePositionsPtr: VoidPtr =
        Internals.getMethodBindPtr("OggPacketSequence", "get_packet_granule_positions", 235988956)

    public val setSamplingRatePtr: VoidPtr =
        Internals.getMethodBindPtr("OggPacketSequence", "set_sampling_rate", 373806689)

    public val getSamplingRatePtr: VoidPtr =
        Internals.getMethodBindPtr("OggPacketSequence", "get_sampling_rate", 1740695150)

    public val getLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("OggPacketSequence", "get_length", 1740695150)
  }
}

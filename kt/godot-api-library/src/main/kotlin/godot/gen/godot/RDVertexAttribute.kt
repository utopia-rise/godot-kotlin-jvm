// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_RDVERTEXATTRIBUTE_INDEX: Int = 524

/**
 * This object is used by [RenderingDevice].
 */
@GodotBaseType
public open class RDVertexAttribute : RefCounted() {
  public final inline var location: Long
    @JvmName("locationProperty")
    get() = getLocation()
    @JvmName("locationProperty")
    set(`value`) {
      setLocation(value)
    }

  public final inline var offset: Long
    @JvmName("offsetProperty")
    get() = getOffset()
    @JvmName("offsetProperty")
    set(`value`) {
      setOffset(value)
    }

  public final inline var format: RenderingDevice.DataFormat
    @JvmName("formatProperty")
    get() = getFormat()
    @JvmName("formatProperty")
    set(`value`) {
      setFormat(value)
    }

  public final inline var stride: Long
    @JvmName("strideProperty")
    get() = getStride()
    @JvmName("strideProperty")
    set(`value`) {
      setStride(value)
    }

  public final inline var frequency: RenderingDevice.VertexFrequency
    @JvmName("frequencyProperty")
    get() = getFrequency()
    @JvmName("frequencyProperty")
    set(`value`) {
      setFrequency(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_RDVERTEXATTRIBUTE_INDEX, scriptIndex)
  }

  public final fun setLocation(pMember: Long): Unit {
    Internals.writeArguments(LONG to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setLocationPtr, NIL)
  }

  public final fun getLocation(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLocationPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setOffset(pMember: Long): Unit {
    Internals.writeArguments(LONG to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
  }

  public final fun getOffset(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOffsetPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setFormat(pMember: RenderingDevice.DataFormat): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setFormatPtr, NIL)
  }

  public final fun getFormat(): RenderingDevice.DataFormat {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
    return RenderingDevice.DataFormat.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setStride(pMember: Long): Unit {
    Internals.writeArguments(LONG to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setStridePtr, NIL)
  }

  public final fun getStride(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getStridePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setFrequency(pMember: RenderingDevice.VertexFrequency): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setFrequencyPtr, NIL)
  }

  public final fun getFrequency(): RenderingDevice.VertexFrequency {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFrequencyPtr, LONG)
    return RenderingDevice.VertexFrequency.from(Internals.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val setLocationPtr: VoidPtr =
        Internals.getMethodBindPtr("RDVertexAttribute", "set_location", 1286410249)

    public val getLocationPtr: VoidPtr =
        Internals.getMethodBindPtr("RDVertexAttribute", "get_location", 3905245786)

    public val setOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("RDVertexAttribute", "set_offset", 1286410249)

    public val getOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("RDVertexAttribute", "get_offset", 3905245786)

    public val setFormatPtr: VoidPtr =
        Internals.getMethodBindPtr("RDVertexAttribute", "set_format", 565531219)

    public val getFormatPtr: VoidPtr =
        Internals.getMethodBindPtr("RDVertexAttribute", "get_format", 2235804183)

    public val setStridePtr: VoidPtr =
        Internals.getMethodBindPtr("RDVertexAttribute", "set_stride", 1286410249)

    public val getStridePtr: VoidPtr =
        Internals.getMethodBindPtr("RDVertexAttribute", "get_stride", 3905245786)

    public val setFrequencyPtr: VoidPtr =
        Internals.getMethodBindPtr("RDVertexAttribute", "set_frequency", 522141836)

    public val getFrequencyPtr: VoidPtr =
        Internals.getMethodBindPtr("RDVertexAttribute", "get_frequency", 4154106413)
  }
}

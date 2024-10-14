// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.internal.reflection.TypeManager
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.internal.memory.TransferContext
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    callConstructor(ENGINECLASS_RDVERTEXATTRIBUTE, scriptIndex)
  }

  public final fun setLocation(pMember: Long): Unit {
    TransferContext.writeArguments(LONG to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setLocationPtr, NIL)
  }

  public final fun getLocation(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLocationPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setOffset(pMember: Long): Unit {
    TransferContext.writeArguments(LONG to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setOffsetPtr, NIL)
  }

  public final fun getOffset(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setFormat(pMember: RenderingDevice.DataFormat): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setFormatPtr, NIL)
  }

  public final fun getFormat(): RenderingDevice.DataFormat {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFormatPtr, LONG)
    return RenderingDevice.DataFormat.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setStride(pMember: Long): Unit {
    TransferContext.writeArguments(LONG to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setStridePtr, NIL)
  }

  public final fun getStride(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStridePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setFrequency(pMember: RenderingDevice.VertexFrequency): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setFrequencyPtr, NIL)
  }

  public final fun getFrequency(): RenderingDevice.VertexFrequency {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFrequencyPtr, LONG)
    return RenderingDevice.VertexFrequency.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val setLocationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "set_location", 1286410249)

    public val getLocationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "get_location", 3905245786)

    public val setOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "set_offset", 1286410249)

    public val getOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "get_offset", 3905245786)

    public val setFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "set_format", 565531219)

    public val getFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "get_format", 2235804183)

    public val setStridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "set_stride", 1286410249)

    public val getStridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "get_stride", 3905245786)

    public val setFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "set_frequency", 522141836)

    public val getFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "get_frequency", 4154106413)
  }
}

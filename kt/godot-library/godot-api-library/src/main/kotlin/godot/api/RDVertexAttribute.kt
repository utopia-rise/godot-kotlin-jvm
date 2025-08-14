// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * This object is used by [RenderingDevice].
 */
@GodotBaseType
public open class RDVertexAttribute : RefCounted() {
  /**
   * The location in the shader that this attribute is bound to.
   */
  public final inline var location: Long
    @JvmName("locationProperty")
    get() = getLocation()
    @JvmName("locationProperty")
    set(`value`) {
      setLocation(value)
    }

  /**
   * The number of bytes between the start of the vertex buffer and the first instance of this attribute.
   */
  public final inline var offset: Long
    @JvmName("offsetProperty")
    get() = getOffset()
    @JvmName("offsetProperty")
    set(`value`) {
      setOffset(value)
    }

  /**
   * The way that this attribute's data is interpreted when sent to a shader.
   */
  public final inline var format: RenderingDevice.DataFormat
    @JvmName("formatProperty")
    get() = getFormat()
    @JvmName("formatProperty")
    set(`value`) {
      setFormat(value)
    }

  /**
   * The number of bytes between the starts of consecutive instances of this attribute.
   */
  public final inline var stride: Long
    @JvmName("strideProperty")
    get() = getStride()
    @JvmName("strideProperty")
    set(`value`) {
      setStride(value)
    }

  /**
   * The rate at which this attribute is pulled from its vertex buffer.
   */
  public final inline var frequency: RenderingDevice.VertexFrequency
    @JvmName("frequencyProperty")
    get() = getFrequency()
    @JvmName("frequencyProperty")
    set(`value`) {
      setFrequency(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(528, scriptIndex)
  }

  public final fun setLocation(pMember: Long) {
    TransferContext.writeArguments(LONG to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setLocationPtr, NIL)
  }

  public final fun getLocation(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLocationPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setOffset(pMember: Long) {
    TransferContext.writeArguments(LONG to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setOffsetPtr, NIL)
  }

  public final fun getOffset(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setFormat(pMember: RenderingDevice.DataFormat) {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setFormatPtr, NIL)
  }

  public final fun getFormat(): RenderingDevice.DataFormat {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFormatPtr, LONG)
    return RenderingDevice.DataFormat.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setStride(pMember: Long) {
    TransferContext.writeArguments(LONG to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setStridePtr, NIL)
  }

  public final fun getStride(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStridePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setFrequency(pMember: RenderingDevice.VertexFrequency) {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setFrequencyPtr, NIL)
  }

  public final fun getFrequency(): RenderingDevice.VertexFrequency {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFrequencyPtr, LONG)
    return RenderingDevice.VertexFrequency.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  public object MethodBindings {
    internal val setLocationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "set_location", 1_286_410_249)

    internal val getLocationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "get_location", 3_905_245_786)

    internal val setOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "set_offset", 1_286_410_249)

    internal val getOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "get_offset", 3_905_245_786)

    internal val setFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "set_format", 565_531_219)

    internal val getFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "get_format", 2_235_804_183)

    internal val setStridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "set_stride", 1_286_410_249)

    internal val getStridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "get_stride", 3_905_245_786)

    internal val setFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "set_frequency", 522_141_836)

    internal val getFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "get_frequency", 4_154_106_413)
  }
}

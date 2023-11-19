// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Vertex attribute (used by [godot.RenderingDevice]).
 *
 * This object is used by [godot.RenderingDevice].
 */
@GodotBaseType
public open class RDVertexAttribute : RefCounted() {
  /**
   *
   */
  public var location: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLocationPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLocationPtr, NIL)
    }

  /**
   *
   */
  public var offset: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
    }

  /**
   *
   */
  public var format: RenderingDevice.DataFormat
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
      return RenderingDevice.DataFormat.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFormatPtr, NIL)
    }

  /**
   *
   */
  public var stride: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStridePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStridePtr, NIL)
    }

  /**
   *
   */
  public var frequency: RenderingDevice.VertexFrequency
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrequencyPtr, LONG)
      return RenderingDevice.VertexFrequency.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFrequencyPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDVERTEXATTRIBUTE, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setLocationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "set_location")

    public val getLocationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "get_location")

    public val setOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "set_offset")

    public val getOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "get_offset")

    public val setFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "set_format")

    public val getFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "get_format")

    public val setStridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "set_stride")

    public val getStridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "get_stride")

    public val setFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "set_frequency")

    public val getFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDVertexAttribute", "get_frequency")
  }
}

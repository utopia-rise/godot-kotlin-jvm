// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class GLTFBufferView : Resource() {
  public var buffer: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBufferPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBufferPtr, NIL)
    }

  public var byteOffset: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getByteOffsetPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setByteOffsetPtr, NIL)
    }

  public var byteLength: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getByteLengthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setByteLengthPtr, NIL)
    }

  public var byteStride: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getByteStridePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setByteStridePtr, NIL)
    }

  public var indices: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIndicesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setIndicesPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GLTFBUFFERVIEW, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val getBufferPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFBufferView", "get_buffer")

    public val setBufferPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFBufferView", "set_buffer")

    public val getByteOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFBufferView", "get_byte_offset")

    public val setByteOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFBufferView", "set_byte_offset")

    public val getByteLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFBufferView", "get_byte_length")

    public val setByteLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFBufferView", "set_byte_length")

    public val getByteStridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFBufferView", "get_byte_stride")

    public val setByteStridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFBufferView", "set_byte_stride")

    public val getIndicesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFBufferView", "get_indices")

    public val setIndicesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFBufferView", "set_indices")
  }
}

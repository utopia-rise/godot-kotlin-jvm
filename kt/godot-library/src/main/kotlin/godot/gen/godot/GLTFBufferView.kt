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
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * GLTFBufferView is a data structure representing GLTF a `bufferView` that would be found in the
 * `"bufferViews"` array. A buffer is a blob of binary data. A buffer view is a slice of a buffer that
 * can be used to identify and extract data from the buffer.
 * Most custom uses of buffers only need to use the [buffer], [byteLength], and [byteOffset]. The
 * [byteStride] and [indices] properties are for more advanced use cases such as interleaved mesh data
 * encoded for the GPU.
 */
@GodotBaseType
public open class GLTFBufferView : Resource() {
  /**
   * The index of the buffer this buffer view is referencing. If `-1`, this buffer view is not
   * referencing any buffer.
   */
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

  /**
   * The offset, in bytes, from the start of the buffer to the start of this buffer view.
   */
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

  /**
   * The length, in bytes, of this buffer view. If `0`, this buffer view is empty.
   */
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

  /**
   * The stride, in bytes, between interleaved data. If `-1`, this buffer view is not interleaved.
   */
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

  /**
   * True if the GLTFBufferView's OpenGL GPU buffer type is an `ELEMENT_ARRAY_BUFFER` used for
   * vertex indices (integer constant `34963`). False if the buffer type is any other value. See
   * [url=https://github.com/KhronosGroup/glTF-Tutorials/blob/master/gltfTutorial/gltfTutorial_005_BuffersBufferViewsAccessors.md]Buffers,
   * BufferViews, and Accessors[/url] for possible values. This property is set on import and used on
   * export.
   */
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

  /**
   * True if the GLTFBufferView's OpenGL GPU buffer type is an `ARRAY_BUFFER` used for vertex
   * attributes (integer constant `34962`). False if the buffer type is any other value. See
   * [url=https://github.com/KhronosGroup/glTF-Tutorials/blob/master/gltfTutorial/gltfTutorial_005_BuffersBufferViewsAccessors.md]Buffers,
   * BufferViews, and Accessors[/url] for possible values. This property is set on import and used on
   * export.
   */
  public var vertexAttributes: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVertexAttributesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVertexAttributesPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GLTFBUFFERVIEW, scriptIndex)
    return true
  }

  /**
   * Loads the buffer view data from the buffer referenced by this buffer view in the given
   * [GLTFState]. Interleaved data with a byte stride is not yet supported by this method. The data is
   * returned as a [PackedByteArray].
   */
  public fun loadBufferViewData(state: GLTFState): PackedByteArray {
    TransferContext.writeArguments(OBJECT to state)
    TransferContext.callMethod(rawPtr, MethodBindings.loadBufferViewDataPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray)
  }

  public companion object

  internal object MethodBindings {
    public val loadBufferViewDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFBufferView", "load_buffer_view_data")

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

    public val getVertexAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFBufferView", "get_vertex_attributes")

    public val setVertexAttributesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFBufferView", "set_vertex_attributes")
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_GLTFBUFFERVIEW_INDEX: Int = 252

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
  public final inline var buffer: Int
    @JvmName("bufferProperty")
    get() = getBuffer()
    @JvmName("bufferProperty")
    set(`value`) {
      setBuffer(value)
    }

  /**
   * The offset, in bytes, from the start of the buffer to the start of this buffer view.
   */
  public final inline var byteOffset: Int
    @JvmName("byteOffsetProperty")
    get() = getByteOffset()
    @JvmName("byteOffsetProperty")
    set(`value`) {
      setByteOffset(value)
    }

  /**
   * The length, in bytes, of this buffer view. If `0`, this buffer view is empty.
   */
  public final inline var byteLength: Int
    @JvmName("byteLengthProperty")
    get() = getByteLength()
    @JvmName("byteLengthProperty")
    set(`value`) {
      setByteLength(value)
    }

  /**
   * The stride, in bytes, between interleaved data. If `-1`, this buffer view is not interleaved.
   */
  public final inline var byteStride: Int
    @JvmName("byteStrideProperty")
    get() = getByteStride()
    @JvmName("byteStrideProperty")
    set(`value`) {
      setByteStride(value)
    }

  /**
   * True if the GLTFBufferView's OpenGL GPU buffer type is an `ELEMENT_ARRAY_BUFFER` used for
   * vertex indices (integer constant `34963`). False if the buffer type is any other value. See
   * [url=https://github.com/KhronosGroup/glTF-Tutorials/blob/master/gltfTutorial/gltfTutorial_005_BuffersBufferViewsAccessors.md]Buffers,
   * BufferViews, and Accessors[/url] for possible values. This property is set on import and used on
   * export.
   */
  public final inline var indices: Boolean
    @JvmName("indicesProperty")
    get() = getIndices()
    @JvmName("indicesProperty")
    set(`value`) {
      setIndices(value)
    }

  /**
   * True if the GLTFBufferView's OpenGL GPU buffer type is an `ARRAY_BUFFER` used for vertex
   * attributes (integer constant `34962`). False if the buffer type is any other value. See
   * [url=https://github.com/KhronosGroup/glTF-Tutorials/blob/master/gltfTutorial/gltfTutorial_005_BuffersBufferViewsAccessors.md]Buffers,
   * BufferViews, and Accessors[/url] for possible values. This property is set on import and used on
   * export.
   */
  public final inline var vertexAttributes: Boolean
    @JvmName("vertexAttributesProperty")
    get() = getVertexAttributes()
    @JvmName("vertexAttributesProperty")
    set(`value`) {
      setVertexAttributes(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_GLTFBUFFERVIEW_INDEX, scriptIndex)
  }

  /**
   * Loads the buffer view data from the buffer referenced by this buffer view in the given
   * [GLTFState]. Interleaved data with a byte stride is not yet supported by this method. The data is
   * returned as a [PackedByteArray].
   */
  public final fun loadBufferViewData(state: GLTFState?): PackedByteArray {
    Internals.writeArguments(OBJECT to state)
    Internals.callMethod(rawPtr, MethodBindings.loadBufferViewDataPtr, PACKED_BYTE_ARRAY)
    return (Internals.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  public final fun getBuffer(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBufferPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setBuffer(buffer: Int): Unit {
    Internals.writeArguments(LONG to buffer.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setBufferPtr, NIL)
  }

  public final fun getByteOffset(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getByteOffsetPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setByteOffset(byteOffset: Int): Unit {
    Internals.writeArguments(LONG to byteOffset.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setByteOffsetPtr, NIL)
  }

  public final fun getByteLength(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getByteLengthPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setByteLength(byteLength: Int): Unit {
    Internals.writeArguments(LONG to byteLength.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setByteLengthPtr, NIL)
  }

  public final fun getByteStride(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getByteStridePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setByteStride(byteStride: Int): Unit {
    Internals.writeArguments(LONG to byteStride.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setByteStridePtr, NIL)
  }

  public final fun getIndices(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getIndicesPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setIndices(indices: Boolean): Unit {
    Internals.writeArguments(BOOL to indices)
    Internals.callMethod(rawPtr, MethodBindings.setIndicesPtr, NIL)
  }

  public final fun getVertexAttributes(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVertexAttributesPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setVertexAttributes(isAttributes: Boolean): Unit {
    Internals.writeArguments(BOOL to isAttributes)
    Internals.callMethod(rawPtr, MethodBindings.setVertexAttributesPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val loadBufferViewDataPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFBufferView", "load_buffer_view_data", 3945446907)

    public val getBufferPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFBufferView", "get_buffer", 3905245786)

    public val setBufferPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFBufferView", "set_buffer", 1286410249)

    public val getByteOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFBufferView", "get_byte_offset", 3905245786)

    public val setByteOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFBufferView", "set_byte_offset", 1286410249)

    public val getByteLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFBufferView", "get_byte_length", 3905245786)

    public val setByteLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFBufferView", "set_byte_length", 1286410249)

    public val getByteStridePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFBufferView", "get_byte_stride", 3905245786)

    public val setByteStridePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFBufferView", "set_byte_stride", 1286410249)

    public val getIndicesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFBufferView", "get_indices", 36873697)

    public val setIndicesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFBufferView", "set_indices", 2586408642)

    public val getVertexAttributesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFBufferView", "get_vertex_attributes", 36873697)

    public val setVertexAttributesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFBufferView", "set_vertex_attributes", 2586408642)
  }
}

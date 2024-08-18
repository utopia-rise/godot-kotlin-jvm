// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat64Array
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_FLOAT_64_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * GLTFAccessor is a data structure representing GLTF a `accessor` that would be found in the
 * `"accessors"` array. A buffer is a blob of binary data. A buffer view is a slice of a buffer. An
 * accessor is a typed interpretation of the data in a buffer view.
 * Most custom data stored in GLTF does not need accessors, only buffer views (see
 * [GLTFBufferView]). Accessors are for more advanced use cases such as interleaved mesh data encoded
 * for the GPU.
 */
@GodotBaseType
public open class GLTFAccessor : Resource() {
  /**
   * The index of the buffer view this accessor is referencing. If `-1`, this accessor is not
   * referencing any buffer view.
   */
  public var bufferView: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBufferViewPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBufferViewPtr, NIL)
    }

  /**
   * The offset relative to the start of the buffer view in bytes.
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
   * The GLTF component type as an enum. Possible values are 5120 for "BYTE", 5121 for
   * "UNSIGNED_BYTE", 5122 for "SHORT", 5123 for "UNSIGNED_SHORT", 5125 for "UNSIGNED_INT", and 5126
   * for "FLOAT". A value of 5125 or "UNSIGNED_INT" must not be used for any accessor that is not
   * referenced by mesh.primitive.indices.
   */
  public var componentType: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getComponentTypePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setComponentTypePtr, NIL)
    }

  /**
   * Specifies whether integer data values are normalized before usage.
   */
  public var normalized: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNormalizedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNormalizedPtr, NIL)
    }

  /**
   * The number of elements referenced by this accessor.
   */
  public var count: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCountPtr, NIL)
    }

  /**
   * The GLTF accessor type as an enum. Possible values are 0 for "SCALAR", 1 for "VEC2", 2 for
   * "VEC3", 3 for "VEC4", 4 for "MAT2", 5 for "MAT3", and 6 for "MAT4".
   */
  public var accessorType: GLTFAccessorType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAccessorTypePtr, LONG)
      return GLTFAccessor.GLTFAccessorType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAccessorTypePtr, NIL)
    }

  /**
   * The GLTF accessor type as an enum. Use [accessorType] instead.
   */
  public var type: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTypePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setTypePtr, NIL)
    }

  /**
   * Minimum value of each component in this accessor.
   */
  public var min: PackedFloat64Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinPtr, PACKED_FLOAT_64_ARRAY)
      return (TransferContext.readReturnValue(PACKED_FLOAT_64_ARRAY, false) as PackedFloat64Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_FLOAT_64_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMinPtr, NIL)
    }

  /**
   * Maximum value of each component in this accessor.
   */
  public var max: PackedFloat64Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxPtr, PACKED_FLOAT_64_ARRAY)
      return (TransferContext.readReturnValue(PACKED_FLOAT_64_ARRAY, false) as PackedFloat64Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_FLOAT_64_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxPtr, NIL)
    }

  /**
   * Number of deviating accessor values stored in the sparse array.
   */
  public var sparseCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSparseCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSparseCountPtr, NIL)
    }

  /**
   * The index of the buffer view with sparse indices. The referenced buffer view MUST NOT have its
   * target or byteStride properties defined. The buffer view and the optional byteOffset MUST be
   * aligned to the componentType byte length.
   */
  public var sparseIndicesBufferView: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSparseIndicesBufferViewPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSparseIndicesBufferViewPtr, NIL)
    }

  /**
   * The offset relative to the start of the buffer view in bytes.
   */
  public var sparseIndicesByteOffset: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSparseIndicesByteOffsetPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSparseIndicesByteOffsetPtr, NIL)
    }

  /**
   * The indices component data type as an enum. Possible values are 5121 for "UNSIGNED_BYTE", 5123
   * for "UNSIGNED_SHORT", and 5125 for "UNSIGNED_INT".
   */
  public var sparseIndicesComponentType: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSparseIndicesComponentTypePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSparseIndicesComponentTypePtr, NIL)
    }

  /**
   * The index of the bufferView with sparse values. The referenced buffer view MUST NOT have its
   * target or byteStride properties defined.
   */
  public var sparseValuesBufferView: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSparseValuesBufferViewPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSparseValuesBufferViewPtr, NIL)
    }

  /**
   * The offset relative to the start of the bufferView in bytes.
   */
  public var sparseValuesByteOffset: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSparseValuesByteOffsetPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSparseValuesByteOffsetPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_GLTFACCESSOR, scriptIndex)
  }

  public enum class GLTFAccessorType(
    id: Long,
  ) {
    /**
     * Accessor type "SCALAR". For the glTF object model, this can be used to map to a single float,
     * int, or bool value, or a float array.
     */
    TYPE_SCALAR(0),
    /**
     * Accessor type "VEC2". For the glTF object model, this maps to "float2", represented in the
     * glTF JSON as an array of two floats.
     */
    TYPE_VEC2(1),
    /**
     * Accessor type "VEC3". For the glTF object model, this maps to "float3", represented in the
     * glTF JSON as an array of three floats.
     */
    TYPE_VEC3(2),
    /**
     * Accessor type "VEC4". For the glTF object model, this maps to "float4", represented in the
     * glTF JSON as an array of four floats.
     */
    TYPE_VEC4(3),
    /**
     * Accessor type "MAT2". For the glTF object model, this maps to "float2x2", represented in the
     * glTF JSON as an array of four floats.
     */
    TYPE_MAT2(4),
    /**
     * Accessor type "MAT3". For the glTF object model, this maps to "float3x3", represented in the
     * glTF JSON as an array of nine floats.
     */
    TYPE_MAT3(5),
    /**
     * Accessor type "MAT4". For the glTF object model, this maps to "float4x4", represented in the
     * glTF JSON as an array of sixteen floats.
     */
    TYPE_MAT4(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getBufferViewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_buffer_view")

    public val setBufferViewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_buffer_view")

    public val getByteOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_byte_offset")

    public val setByteOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_byte_offset")

    public val getComponentTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_component_type")

    public val setComponentTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_component_type")

    public val getNormalizedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_normalized")

    public val setNormalizedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_normalized")

    public val getCountPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFAccessor", "get_count")

    public val setCountPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFAccessor", "set_count")

    public val getAccessorTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_accessor_type")

    public val setAccessorTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_accessor_type")

    public val getTypePtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFAccessor", "get_type")

    public val setTypePtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFAccessor", "set_type")

    public val getMinPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFAccessor", "get_min")

    public val setMinPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFAccessor", "set_min")

    public val getMaxPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFAccessor", "get_max")

    public val setMaxPtr: VoidPtr = TypeManager.getMethodBindPtr("GLTFAccessor", "set_max")

    public val getSparseCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_sparse_count")

    public val setSparseCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_sparse_count")

    public val getSparseIndicesBufferViewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_sparse_indices_buffer_view")

    public val setSparseIndicesBufferViewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_sparse_indices_buffer_view")

    public val getSparseIndicesByteOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_sparse_indices_byte_offset")

    public val setSparseIndicesByteOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_sparse_indices_byte_offset")

    public val getSparseIndicesComponentTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_sparse_indices_component_type")

    public val setSparseIndicesComponentTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_sparse_indices_component_type")

    public val getSparseValuesBufferViewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_sparse_values_buffer_view")

    public val setSparseValuesBufferViewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_sparse_values_buffer_view")

    public val getSparseValuesByteOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_sparse_values_byte_offset")

    public val setSparseValuesByteOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_sparse_values_byte_offset")
  }
}

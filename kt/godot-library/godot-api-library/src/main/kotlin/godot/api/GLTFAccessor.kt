// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.PackedFloat64Array
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_FLOAT_64_ARRAY
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * GLTFAccessor is a data structure representing a glTF `accessor` that would be found in the
 * `"accessors"` array. A buffer is a blob of binary data. A buffer view is a slice of a buffer. An
 * accessor is a typed interpretation of the data in a buffer view.
 * Most custom data stored in glTF does not need accessors, only buffer views (see
 * [GLTFBufferView]). Accessors are for more advanced use cases such as interleaved mesh data encoded
 * for the GPU.
 */
@GodotBaseType
public open class GLTFAccessor : Resource() {
  /**
   * The index of the buffer view this accessor is referencing. If `-1`, this accessor is not
   * referencing any buffer view.
   */
  public final inline var bufferView: Int
    @JvmName("bufferViewProperty")
    get() = getBufferView()
    @JvmName("bufferViewProperty")
    set(`value`) {
      setBufferView(value)
    }

  /**
   * The offset relative to the start of the buffer view in bytes.
   */
  public final inline var byteOffset: Int
    @JvmName("byteOffsetProperty")
    get() = getByteOffset()
    @JvmName("byteOffsetProperty")
    set(`value`) {
      setByteOffset(value)
    }

  /**
   * The glTF component type as an enum. See [GLTFComponentType] for possible values. Within the
   * core glTF specification, a value of 5125 or "UNSIGNED_INT" must not be used for any accessor that
   * is not referenced by mesh.primitive.indices.
   */
  public final inline var componentType: Int
    @JvmName("componentTypeProperty")
    get() = getComponentType()
    @JvmName("componentTypeProperty")
    set(`value`) {
      setComponentType(value)
    }

  /**
   * Specifies whether integer data values are normalized before usage.
   */
  public final inline var normalized: Boolean
    @JvmName("normalizedProperty")
    get() = getNormalized()
    @JvmName("normalizedProperty")
    set(`value`) {
      setNormalized(value)
    }

  /**
   * The number of elements referenced by this accessor.
   */
  public final inline var count: Int
    @JvmName("countProperty")
    get() = getCount()
    @JvmName("countProperty")
    set(`value`) {
      setCount(value)
    }

  /**
   * The glTF accessor type as an enum. Possible values are 0 for "SCALAR", 1 for "VEC2", 2 for
   * "VEC3", 3 for "VEC4", 4 for "MAT2", 5 for "MAT3", and 6 for "MAT4".
   */
  public final inline var accessorType: GLTFAccessorType
    @JvmName("accessorTypeProperty")
    get() = getAccessorType()
    @JvmName("accessorTypeProperty")
    set(`value`) {
      setAccessorType(value)
    }

  /**
   * The glTF accessor type as an enum. Use [accessorType] instead.
   */
  public final inline var type: Int
    @JvmName("typeProperty")
    get() = getType()
    @JvmName("typeProperty")
    set(`value`) {
      setType(value)
    }

  /**
   * Minimum value of each component in this accessor.
   */
  public final inline var min: PackedFloat64Array
    @JvmName("minProperty")
    get() = getMin()
    @JvmName("minProperty")
    set(`value`) {
      setMin(value)
    }

  /**
   * Maximum value of each component in this accessor.
   */
  public final inline var max: PackedFloat64Array
    @JvmName("maxProperty")
    get() = getMax()
    @JvmName("maxProperty")
    set(`value`) {
      setMax(value)
    }

  /**
   * Number of deviating accessor values stored in the sparse array.
   */
  public final inline var sparseCount: Int
    @JvmName("sparseCountProperty")
    get() = getSparseCount()
    @JvmName("sparseCountProperty")
    set(`value`) {
      setSparseCount(value)
    }

  /**
   * The index of the buffer view with sparse indices. The referenced buffer view MUST NOT have its
   * target or byteStride properties defined. The buffer view and the optional byteOffset MUST be
   * aligned to the componentType byte length.
   */
  public final inline var sparseIndicesBufferView: Int
    @JvmName("sparseIndicesBufferViewProperty")
    get() = getSparseIndicesBufferView()
    @JvmName("sparseIndicesBufferViewProperty")
    set(`value`) {
      setSparseIndicesBufferView(value)
    }

  /**
   * The offset relative to the start of the buffer view in bytes.
   */
  public final inline var sparseIndicesByteOffset: Int
    @JvmName("sparseIndicesByteOffsetProperty")
    get() = getSparseIndicesByteOffset()
    @JvmName("sparseIndicesByteOffsetProperty")
    set(`value`) {
      setSparseIndicesByteOffset(value)
    }

  /**
   * The indices component data type as an enum. Possible values are 5121 for "UNSIGNED_BYTE", 5123
   * for "UNSIGNED_SHORT", and 5125 for "UNSIGNED_INT".
   */
  public final inline var sparseIndicesComponentType: Int
    @JvmName("sparseIndicesComponentTypeProperty")
    get() = getSparseIndicesComponentType()
    @JvmName("sparseIndicesComponentTypeProperty")
    set(`value`) {
      setSparseIndicesComponentType(value)
    }

  /**
   * The index of the bufferView with sparse values. The referenced buffer view MUST NOT have its
   * target or byteStride properties defined.
   */
  public final inline var sparseValuesBufferView: Int
    @JvmName("sparseValuesBufferViewProperty")
    get() = getSparseValuesBufferView()
    @JvmName("sparseValuesBufferViewProperty")
    set(`value`) {
      setSparseValuesBufferView(value)
    }

  /**
   * The offset relative to the start of the bufferView in bytes.
   */
  public final inline var sparseValuesByteOffset: Int
    @JvmName("sparseValuesByteOffsetProperty")
    get() = getSparseValuesByteOffset()
    @JvmName("sparseValuesByteOffsetProperty")
    set(`value`) {
      setSparseValuesByteOffset(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(253, scriptIndex)
  }

  public final fun getBufferView(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBufferViewPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setBufferView(bufferView: Int): Unit {
    TransferContext.writeArguments(LONG to bufferView.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setBufferViewPtr, NIL)
  }

  public final fun getByteOffset(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getByteOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setByteOffset(byteOffset: Int): Unit {
    TransferContext.writeArguments(LONG to byteOffset.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setByteOffsetPtr, NIL)
  }

  public final fun getComponentType(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getComponentTypePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setComponentType(componentType: Int): Unit {
    TransferContext.writeArguments(LONG to componentType.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setComponentTypePtr, NIL)
  }

  public final fun getNormalized(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNormalizedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setNormalized(normalized: Boolean): Unit {
    TransferContext.writeArguments(BOOL to normalized)
    TransferContext.callMethod(ptr, MethodBindings.setNormalizedPtr, NIL)
  }

  public final fun getCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setCount(count: Int): Unit {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setCountPtr, NIL)
  }

  public final fun getAccessorType(): GLTFAccessorType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAccessorTypePtr, LONG)
    return GLTFAccessor.GLTFAccessorType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAccessorType(accessorType: GLTFAccessorType): Unit {
    TransferContext.writeArguments(LONG to accessorType.id)
    TransferContext.callMethod(ptr, MethodBindings.setAccessorTypePtr, NIL)
  }

  public final fun getType(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTypePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setType(type: Int): Unit {
    TransferContext.writeArguments(LONG to type.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setTypePtr, NIL)
  }

  public final fun getMin(): PackedFloat64Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMinPtr, PACKED_FLOAT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_FLOAT_64_ARRAY) as PackedFloat64Array)
  }

  public final fun setMin(min: PackedFloat64Array): Unit {
    TransferContext.writeArguments(PACKED_FLOAT_64_ARRAY to min)
    TransferContext.callMethod(ptr, MethodBindings.setMinPtr, NIL)
  }

  public final fun getMax(): PackedFloat64Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxPtr, PACKED_FLOAT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_FLOAT_64_ARRAY) as PackedFloat64Array)
  }

  public final fun setMax(max: PackedFloat64Array): Unit {
    TransferContext.writeArguments(PACKED_FLOAT_64_ARRAY to max)
    TransferContext.callMethod(ptr, MethodBindings.setMaxPtr, NIL)
  }

  public final fun getSparseCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSparseCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSparseCount(sparseCount: Int): Unit {
    TransferContext.writeArguments(LONG to sparseCount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSparseCountPtr, NIL)
  }

  public final fun getSparseIndicesBufferView(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSparseIndicesBufferViewPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSparseIndicesBufferView(sparseIndicesBufferView: Int): Unit {
    TransferContext.writeArguments(LONG to sparseIndicesBufferView.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSparseIndicesBufferViewPtr, NIL)
  }

  public final fun getSparseIndicesByteOffset(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSparseIndicesByteOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSparseIndicesByteOffset(sparseIndicesByteOffset: Int): Unit {
    TransferContext.writeArguments(LONG to sparseIndicesByteOffset.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSparseIndicesByteOffsetPtr, NIL)
  }

  public final fun getSparseIndicesComponentType(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSparseIndicesComponentTypePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSparseIndicesComponentType(sparseIndicesComponentType: Int): Unit {
    TransferContext.writeArguments(LONG to sparseIndicesComponentType.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSparseIndicesComponentTypePtr, NIL)
  }

  public final fun getSparseValuesBufferView(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSparseValuesBufferViewPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSparseValuesBufferView(sparseValuesBufferView: Int): Unit {
    TransferContext.writeArguments(LONG to sparseValuesBufferView.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSparseValuesBufferViewPtr, NIL)
  }

  public final fun getSparseValuesByteOffset(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSparseValuesByteOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSparseValuesByteOffset(sparseValuesByteOffset: Int): Unit {
    TransferContext.writeArguments(LONG to sparseValuesByteOffset.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSparseValuesByteOffsetPtr, NIL)
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
      public fun from(`value`: Long): GLTFAccessorType = entries.single { it.id == `value` }
    }
  }

  public enum class GLTFComponentType(
    id: Long,
  ) {
    /**
     * Component type "NONE". This is not a valid component type, and is used to indicate that the
     * component type is not set.
     */
    COMPONENT_TYPE_NONE(0),
    /**
     * Component type "BYTE". The value is `0x1400` which comes from OpenGL. This indicates data is
     * stored in 1-byte or 8-bit signed integers. This is a core part of the glTF specification.
     */
    COMPONENT_TYPE_SIGNED_BYTE(5120),
    /**
     * Component type "UNSIGNED_BYTE". The value is `0x1401` which comes from OpenGL. This indicates
     * data is stored in 1-byte or 8-bit unsigned integers. This is a core part of the glTF
     * specification.
     */
    COMPONENT_TYPE_UNSIGNED_BYTE(5121),
    /**
     * Component type "SHORT". The value is `0x1402` which comes from OpenGL. This indicates data is
     * stored in 2-byte or 16-bit signed integers. This is a core part of the glTF specification.
     */
    COMPONENT_TYPE_SIGNED_SHORT(5122),
    /**
     * Component type "UNSIGNED_SHORT". The value is `0x1403` which comes from OpenGL. This
     * indicates data is stored in 2-byte or 16-bit unsigned integers. This is a core part of the glTF
     * specification.
     */
    COMPONENT_TYPE_UNSIGNED_SHORT(5123),
    /**
     * Component type "INT". The value is `0x1404` which comes from OpenGL. This indicates data is
     * stored in 4-byte or 32-bit signed integers. This is NOT a core part of the glTF specification,
     * and may not be supported by all glTF importers. May be used by some extensions including
     * `KHR_interactivity`.
     */
    COMPONENT_TYPE_SIGNED_INT(5124),
    /**
     * Component type "UNSIGNED_INT". The value is `0x1405` which comes from OpenGL. This indicates
     * data is stored in 4-byte or 32-bit unsigned integers. This is a core part of the glTF
     * specification.
     */
    COMPONENT_TYPE_UNSIGNED_INT(5125),
    /**
     * Component type "FLOAT". The value is `0x1406` which comes from OpenGL. This indicates data is
     * stored in 4-byte or 32-bit floating-point numbers. This is a core part of the glTF
     * specification.
     */
    COMPONENT_TYPE_SINGLE_FLOAT(5126),
    /**
     * Component type "DOUBLE". The value is `0x140A` which comes from OpenGL. This indicates data
     * is stored in 8-byte or 64-bit floating-point numbers. This is NOT a core part of the glTF
     * specification, and may not be supported by all glTF importers. May be used by some extensions
     * including `KHR_interactivity`.
     */
    COMPONENT_TYPE_DOUBLE_FLOAT(5130),
    /**
     * Component type "HALF_FLOAT". The value is `0x140B` which comes from OpenGL. This indicates
     * data is stored in 2-byte or 16-bit floating-point numbers. This is NOT a core part of the glTF
     * specification, and may not be supported by all glTF importers. May be used by some extensions
     * including `KHR_interactivity`.
     */
    COMPONENT_TYPE_HALF_FLOAT(5131),
    /**
     * Component type "LONG". The value is `0x140E` which comes from OpenGL. This indicates data is
     * stored in 8-byte or 64-bit signed integers. This is NOT a core part of the glTF specification,
     * and may not be supported by all glTF importers. May be used by some extensions including
     * `KHR_interactivity`.
     */
    COMPONENT_TYPE_SIGNED_LONG(5134),
    /**
     * Component type "UNSIGNED_LONG". The value is `0x140F` which comes from OpenGL. This indicates
     * data is stored in 8-byte or 64-bit unsigned integers. This is NOT a core part of the glTF
     * specification, and may not be supported by all glTF importers. May be used by some extensions
     * including `KHR_interactivity`.
     */
    COMPONENT_TYPE_UNSIGNED_LONG(5135),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): GLTFComponentType = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val getBufferViewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_buffer_view", 2455072627)

    internal val setBufferViewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_buffer_view", 1286410249)

    internal val getByteOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_byte_offset", 2455072627)

    internal val setByteOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_byte_offset", 1286410249)

    internal val getComponentTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_component_type", 2455072627)

    internal val setComponentTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_component_type", 1286410249)

    internal val getNormalizedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_normalized", 2240911060)

    internal val setNormalizedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_normalized", 2586408642)

    internal val getCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_count", 2455072627)

    internal val setCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_count", 1286410249)

    internal val getAccessorTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_accessor_type", 679305214)

    internal val setAccessorTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_accessor_type", 2347728198)

    internal val getTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_type", 2455072627)

    internal val setTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_type", 1286410249)

    internal val getMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_min", 148677866)

    internal val setMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_min", 2576592201)

    internal val getMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_max", 148677866)

    internal val setMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_max", 2576592201)

    internal val getSparseCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_sparse_count", 2455072627)

    internal val setSparseCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_sparse_count", 1286410249)

    internal val getSparseIndicesBufferViewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_sparse_indices_buffer_view", 2455072627)

    internal val setSparseIndicesBufferViewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_sparse_indices_buffer_view", 1286410249)

    internal val getSparseIndicesByteOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_sparse_indices_byte_offset", 2455072627)

    internal val setSparseIndicesByteOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_sparse_indices_byte_offset", 1286410249)

    internal val getSparseIndicesComponentTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_sparse_indices_component_type", 2455072627)

    internal val setSparseIndicesComponentTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_sparse_indices_component_type", 1286410249)

    internal val getSparseValuesBufferViewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_sparse_values_buffer_view", 2455072627)

    internal val setSparseValuesBufferViewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_sparse_values_buffer_view", 1286410249)

    internal val getSparseValuesByteOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "get_sparse_values_byte_offset", 2455072627)

    internal val setSparseValuesByteOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFAccessor", "set_sparse_values_byte_offset", 1286410249)
  }
}

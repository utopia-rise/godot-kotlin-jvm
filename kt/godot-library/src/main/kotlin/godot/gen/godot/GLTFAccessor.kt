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

@GodotBaseType
public open class GLTFAccessor : Resource() {
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_GLTFACCESSOR, scriptIndex)
    return true
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

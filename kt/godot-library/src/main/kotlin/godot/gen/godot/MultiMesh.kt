// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.AABB
import godot.core.Color
import godot.core.PoolColorArray
import godot.core.PoolRealArray
import godot.core.PoolVector2Array
import godot.core.PoolVector3Array
import godot.core.TransferContext
import godot.core.Transform
import godot.core.Transform2D
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_REAL_ARRAY
import godot.core.VariantType.TRANSFORM
import godot.core.VariantType.TRANSFORM2D
import godot.util.VoidPtr
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
open class MultiMesh : Resource() {
  open var colorFormat: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_COLOR_FORMAT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_COLOR_FORMAT, NIL)
    }

  open var customDataFormat: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_CUSTOM_DATA_FORMAT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_CUSTOM_DATA_FORMAT,
          NIL)
    }

  open var instanceCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_INSTANCE_COUNT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_INSTANCE_COUNT, NIL)
    }

  open var mesh: Mesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_MESH, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Mesh?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_MESH, NIL)
    }

  open var transformFormat: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_TRANSFORM_FORMAT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_TRANSFORM_FORMAT,
          NIL)
    }

  open var visibleInstanceCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_VISIBLE_INSTANCE_COUNT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_VISIBLE_INSTANCE_COUNT, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_MULTIMESH)

  open fun _getColorArray(): PoolColorArray {
    throw NotImplementedError("_get_color_array is not implemented for MultiMesh")
  }

  open fun _getCustomDataArray(): PoolColorArray {
    throw NotImplementedError("_get_custom_data_array is not implemented for MultiMesh")
  }

  open fun _getTransform2dArray(): PoolVector2Array {
    throw NotImplementedError("_get_transform_2d_array is not implemented for MultiMesh")
  }

  open fun _getTransformArray(): PoolVector3Array {
    throw NotImplementedError("_get_transform_array is not implemented for MultiMesh")
  }

  open fun _setColorArray(arg0: PoolColorArray) {
  }

  open fun _setCustomDataArray(arg0: PoolColorArray) {
  }

  open fun _setTransform2dArray(arg0: PoolVector2Array) {
  }

  open fun _setTransformArray(arg0: PoolVector3Array) {
  }

  open fun getAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_AABB,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  open fun getInstanceColor(instance: Long): Color {
    TransferContext.writeArguments(LONG to instance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_INSTANCE_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  open fun getInstanceCustomData(instance: Long): Color {
    TransferContext.writeArguments(LONG to instance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_INSTANCE_CUSTOM_DATA,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  open fun getInstanceTransform(instance: Long): Transform {
    TransferContext.writeArguments(LONG to instance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_INSTANCE_TRANSFORM,
        TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  open fun getInstanceTransform2d(instance: Long): Transform2D {
    TransferContext.writeArguments(LONG to instance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_GET_INSTANCE_TRANSFORM_2D,
        TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  open fun setAsBulkArray(array: PoolRealArray) {
    TransferContext.writeArguments(POOL_REAL_ARRAY to array)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_AS_BULK_ARRAY, NIL)
  }

  open fun setInstanceColor(instance: Long, color: Color) {
    TransferContext.writeArguments(LONG to instance, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_INSTANCE_COLOR, NIL)
  }

  open fun setInstanceCustomData(instance: Long, customData: Color) {
    TransferContext.writeArguments(LONG to instance, COLOR to customData)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_INSTANCE_CUSTOM_DATA,
        NIL)
  }

  open fun setInstanceTransform(instance: Long, transform: Transform) {
    TransferContext.writeArguments(LONG to instance, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_INSTANCE_TRANSFORM,
        NIL)
  }

  open fun setInstanceTransform2d(instance: Long, transform: Transform2D) {
    TransferContext.writeArguments(LONG to instance, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MULTIMESH_SET_INSTANCE_TRANSFORM_2D,
        NIL)
  }

  enum class TransformFormat(
    id: Long
  ) {
    TRANSFORM_2D(0),

    TRANSFORM_3D(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CustomDataFormat(
    id: Long
  ) {
    CUSTOM_DATA_NONE(0),

    CUSTOM_DATA_8BIT(1),

    CUSTOM_DATA_FLOAT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ColorFormat(
    id: Long
  ) {
    COLOR_NONE(0),

    COLOR_8BIT(1),

    COLOR_FLOAT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val COLOR_8BIT: Long = 1

    final const val COLOR_FLOAT: Long = 2

    final const val COLOR_NONE: Long = 0

    final const val CUSTOM_DATA_8BIT: Long = 1

    final const val CUSTOM_DATA_FLOAT: Long = 2

    final const val CUSTOM_DATA_NONE: Long = 0

    final const val TRANSFORM_2D: Long = 0

    final const val TRANSFORM_3D: Long = 1
  }
}

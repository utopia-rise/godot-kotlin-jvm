// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class CSGShape : GeometryInstance() {
  open var calculateTangents: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE_GET_CALCULATE_TANGENTS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE_SET_CALCULATE_TANGENTS,
          NIL)
    }

  open var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE_GET_COLLISION_LAYER,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE_SET_COLLISION_LAYER, NIL)
    }

  open var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE_GET_COLLISION_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE_SET_COLLISION_MASK, NIL)
    }

  open var operation: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE_GET_OPERATION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE_SET_OPERATION, NIL)
    }

  open var snap: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE_GET_SNAP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE_SET_SNAP, NIL)
    }

  open var useCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE_GET_USE_COLLISION, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE_SET_USE_COLLISION, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_CSGSHAPE)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _updateShape() {
  }

  open fun getCollisionLayerBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE_GET_COLLISION_LAYER_BIT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getCollisionMaskBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE_GET_COLLISION_MASK_BIT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getMeshes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE_GET_MESHES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun isRootShape(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE_IS_ROOT_SHAPE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun setCollisionLayerBit(bit: Long, value: Boolean) {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE_SET_COLLISION_LAYER_BIT,
        NIL)
  }

  open fun setCollisionMaskBit(bit: Long, value: Boolean) {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE_SET_COLLISION_MASK_BIT,
        NIL)
  }

  enum class Operation(
    id: Long
  ) {
    OPERATION_UNION(0),

    OPERATION_INTERSECTION(1),

    OPERATION_SUBTRACTION(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val OPERATION_INTERSECTION: Long = 1

    final const val OPERATION_SUBTRACTION: Long = 2

    final const val OPERATION_UNION: Long = 0
  }
}

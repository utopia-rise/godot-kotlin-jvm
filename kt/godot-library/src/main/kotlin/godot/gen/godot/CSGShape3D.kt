// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
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
import kotlin.Unit

@GodotBaseType
public open class CSGShape3D internal constructor() : GeometryInstance3D() {
  public var operation: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE3D_GET_OPERATION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE3D_SET_OPERATION, NIL)
    }

  public var snap: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE3D_GET_SNAP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE3D_SET_SNAP, NIL)
    }

  public var calculateTangents: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CSGSHAPE3D_IS_CALCULATING_TANGENTS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE3D_SET_CALCULATE_TANGENTS,
          NIL)
    }

  public var useCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE3D_IS_USING_COLLISION,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE3D_SET_USE_COLLISION, NIL)
    }

  public var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE3D_GET_COLLISION_LAYER,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE3D_SET_COLLISION_LAYER,
          NIL)
    }

  public var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE3D_GET_COLLISION_MASK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE3D_SET_COLLISION_MASK,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CSGSHAPE3D)
  }

  public fun isRootShape(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE3D_IS_ROOT_SHAPE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun setCollisionMaskValue(layerNumber: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber, BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE3D_SET_COLLISION_MASK_VALUE,
        NIL)
  }

  public fun getCollisionMaskValue(layerNumber: Long): Boolean {
    TransferContext.writeArguments(LONG to layerNumber)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE3D_GET_COLLISION_MASK_VALUE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun setCollisionLayerValue(layerNumber: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber, BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CSGSHAPE3D_SET_COLLISION_LAYER_VALUE, NIL)
  }

  public fun getCollisionLayerValue(layerNumber: Long): Boolean {
    TransferContext.writeArguments(LONG to layerNumber)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CSGSHAPE3D_GET_COLLISION_LAYER_VALUE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun getMeshes(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CSGSHAPE3D_GET_MESHES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public enum class Operation(
    id: Long
  ) {
    OPERATION_UNION(0),
    OPERATION_INTERSECTION(1),
    OPERATION_SUBTRACTION(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}

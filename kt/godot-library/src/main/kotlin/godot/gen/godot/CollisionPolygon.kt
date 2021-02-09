// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolVector2Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
open class CollisionPolygon : Spatial() {
  open var depth: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON_GET_DEPTH,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON_SET_DEPTH, NIL)
    }

  open var disabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON_GET_DISABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON_SET_DISABLED,
          NIL)
    }

  open var polygon: PoolVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON_GET_POLYGON,
          POOL_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
    }
    set(value) {
      TransferContext.writeArguments(POOL_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONPOLYGON_SET_POLYGON, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_COLLISIONPOLYGON)

  open fun _isEditable3dPolygon(): Boolean {
    throw NotImplementedError("_is_editable_3d_polygon is not implemented for CollisionPolygon")
  }
}

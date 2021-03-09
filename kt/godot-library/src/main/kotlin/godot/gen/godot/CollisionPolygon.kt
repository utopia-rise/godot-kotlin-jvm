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
import kotlin.Boolean
import kotlin.Double
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * Editor-only class for defining a collision polygon in 3D space.
 *
 * Allows editing a collision polygon's vertices on a selected plane. Can also set a depth perpendicular to that plane. This class is only available in the editor. It will not appear in the scene tree at run-time. Creates a [godot.Shape] for gameplay. Properties modified during gameplay will have no effect.
 */
@GodotBaseType
open class CollisionPolygon : Spatial() {
  /**
   * Length that the resulting collision extends in either direction perpendicular to its polygon.
   */
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

  /**
   * If `true`, no collision will be produced.
   */
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

  /**
   * Array of vertices which define the polygon.
   *
   * **Note:** The returned value is a copy of the original. Methods which mutate the size or properties of the return value will not impact the original polygon. To change properties of the polygon, assign it to a temporary variable and make changes before reassigning the `polygon` member.
   */
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

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_COLLISIONPOLYGON)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _isEditable3dPolygon(): Boolean {
    throw NotImplementedError("_is_editable_3d_polygon is not implemented for CollisionPolygon")
  }
}

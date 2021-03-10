// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress

/**
 * Ray shape for 3D collisions.
 *
 * Ray shape for 3D collisions, which can be set into a [godot.PhysicsBody] or [godot.Area]. A ray is not really a collision body; instead, it tries to separate itself from whatever is touching its far endpoint. It's often useful for characters.
 */
@GodotBaseType
open class RayShape : Shape() {
  /**
   * The ray's length.
   */
  open var length: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYSHAPE_GET_LENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYSHAPE_SET_LENGTH, NIL)
    }

  /**
   * If `true`, allow the shape to return the correct normal.
   */
  open var slipsOnSlope: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYSHAPE_GET_SLIPS_ON_SLOPE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RAYSHAPE_SET_SLIPS_ON_SLOPE, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_RAYSHAPE)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Suppress

/**
 * Circular shape for 2D collisions.
 *
 * Circular shape for 2D collisions. This shape is useful for modeling balls or small characters and its collision detection with everything else is very fast.
 */
@GodotBaseType
open class CircleShape2D : Shape2D() {
  /**
   * The circle's radius.
   */
  open var radius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CIRCLESHAPE2D_GET_RADIUS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CIRCLESHAPE2D_SET_RADIUS, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_CIRCLESHAPE2D)
  }
}

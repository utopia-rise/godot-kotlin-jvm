// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Suppress

/**
 * Base class for all 3D shape resources.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/physics/physics_introduction.html](https://docs.godotengine.org/en/latest/tutorials/physics/physics_introduction.html)
 *
 * Base class for all 3D shape resources. Nodes that inherit from this can be used as shapes for a [godot.PhysicsBody] or [godot.Area] objects.
 */
@GodotBaseType
open class Shape : Resource() {
  /**
   * The collision margin for the shape.
   */
  open var margin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPE_GET_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHAPE_SET_MARGIN, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_SHAPE)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }
}

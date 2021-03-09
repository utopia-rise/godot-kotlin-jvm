// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Suppress
import kotlin.Unit

/**
 * Rectangle shape for 2D collisions.
 *
 * Rectangle shape for 2D collisions. This shape is useful for modeling box-like 2D objects.
 */
@GodotBaseType
open class RectangleShape2D : Shape2D() {
  /**
   * The rectangle's half extents. The width and height of this shape is twice the half extents.
   */
  open var extents: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RECTANGLESHAPE2D_GET_EXTENTS,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RECTANGLESHAPE2D_SET_EXTENTS, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_RECTANGLESHAPE2D)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun extents(schedule: Vector2.() -> Unit): Vector2 = extents.apply{
      schedule(this)
      extents = this
  }

}

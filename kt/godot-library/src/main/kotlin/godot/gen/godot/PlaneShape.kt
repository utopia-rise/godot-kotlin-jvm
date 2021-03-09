// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Plane
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.PLANE
import kotlin.Suppress
import kotlin.Unit

/**
 * Infinite plane shape for 3D collisions.
 *
 * An infinite plane shape for 3D collisions. Note that the [godot.core.Plane]'s normal matters; anything "below" the plane will collide with it. If the [godot.PlaneShape] is used in a [godot.PhysicsBody], it will cause colliding objects placed "below" it to teleport "above" the plane.
 */
@GodotBaseType
open class PlaneShape : Shape() {
  /**
   * The [godot.core.Plane] used by the [godot.PlaneShape] for collision.
   */
  open var plane: Plane
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PLANESHAPE_GET_PLANE, PLANE)
      return TransferContext.readReturnValue(PLANE, false) as Plane
    }
    set(value) {
      TransferContext.writeArguments(PLANE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PLANESHAPE_SET_PLANE, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_PLANESHAPE)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun plane(schedule: Plane.() -> Unit): Plane = plane.apply{
      schedule(this)
      plane = this
  }

}

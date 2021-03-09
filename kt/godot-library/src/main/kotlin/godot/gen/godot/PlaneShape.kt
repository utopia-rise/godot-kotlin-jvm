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

@GodotBaseType
open class PlaneShape : Shape() {
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

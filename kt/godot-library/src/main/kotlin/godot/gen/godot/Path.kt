// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Suppress

@GodotBaseType
open class Path : Spatial() {
  val curveChanged: Signal0 by signal()

  open var curve: Curve3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATH_GET_CURVE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Curve3D?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PATH_SET_CURVE, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_PATH)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _curveChanged() {
  }
}

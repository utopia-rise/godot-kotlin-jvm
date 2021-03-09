// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Double
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
open class Position2D : Node2D() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_POSITION2D)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _getGizmoExtents(): Double {
    throw NotImplementedError("_get_gizmo_extents is not implemented for Position2D")
  }

  open fun _setGizmoExtents(extents: Double) {
  }
}

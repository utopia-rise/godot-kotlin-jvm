// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
open class Position2D : Node2D() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_POSITION2D)

  open fun _get_gizmo_extents(): Double {
    throw NotImplementedError("_get_gizmo_extents is not implemented for Position2D")
  }

  open fun _set_gizmo_extents(extents: Double) {
  }

  companion object
}

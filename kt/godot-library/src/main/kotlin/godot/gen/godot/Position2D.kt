// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import kotlin.Double
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * Generic 2D position hint for editing.
 *
 * Generic 2D position hint for editing. It's just like a plain [godot.Node2D], but it displays as a cross in the 2D editor at all times. You can set cross' visual size by using the gizmo in the 2D editor while the node is selected.
 */
@GodotBaseType
open class Position2D : Node2D() {
  override fun __new() {
    callConstructor(ENGINECLASS_POSITION2D)
  }

  open fun _getGizmoExtents(): Double {
    throw NotImplementedError("_get_gizmo_extents is not implemented for Position2D")
  }

  open fun _setGizmoExtents(extents: Double) {
  }
}

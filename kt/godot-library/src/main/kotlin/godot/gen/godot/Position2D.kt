// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * Generic 2D position hint for editing.
 *
 * Generic 2D position hint for editing. It's just like a plain [godot.Node2D], but it displays as a cross in the 2D editor at all times. You can set cross' visual size by using the gizmo in the 2D editor while the node is selected.
 */
@GodotBaseType
public open class Position2D : Node2D() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_POSITION2D)
  }

  public companion object
}

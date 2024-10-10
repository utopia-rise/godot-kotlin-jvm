// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.util.Internals
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_VBOXCONTAINER_INDEX: Int = 686

/**
 * A variant of [BoxContainer] that can only arrange its child controls vertically. Child controls
 * are rearranged automatically when their minimum size changes.
 */
@GodotBaseType
public open class VBoxContainer : BoxContainer() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VBOXCONTAINER_INDEX, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}

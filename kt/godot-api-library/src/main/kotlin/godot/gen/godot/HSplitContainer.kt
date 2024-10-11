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

private const val ENGINE_CLASS_HSPLITCONTAINER_INDEX: Int = 298

/**
 * A container that accepts only two child controls, then arranges them horizontally and creates a
 * divisor between them. The divisor can be dragged around to change the size relation between the
 * child controls.
 */
@GodotBaseType
public open class HSplitContainer : SplitContainer() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_HSPLITCONTAINER_INDEX, scriptIndex)
  }

  public companion object

  public object MethodBindings
}

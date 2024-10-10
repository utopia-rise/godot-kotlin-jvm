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

private const val ENGINE_CLASS_VFLOWCONTAINER_INDEX: Int = 687

/**
 * A variant of [FlowContainer] that can only arrange its child controls vertically, wrapping them
 * around at the borders. This is similar to how text in a book wraps around when no more words can fit
 * on a line, except vertically.
 */
@GodotBaseType
public open class VFlowContainer : FlowContainer() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VFLOWCONTAINER_INDEX, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}

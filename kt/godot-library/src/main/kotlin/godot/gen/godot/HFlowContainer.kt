// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * A variant of [FlowContainer] that can only arrange its child controls horizontally, wrapping them
 * around at the borders. This is similar to how text in a book wraps around when no more words can fit
 * on a line.
 */
@GodotBaseType
public open class HFlowContainer : FlowContainer() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_HFLOWCONTAINER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}

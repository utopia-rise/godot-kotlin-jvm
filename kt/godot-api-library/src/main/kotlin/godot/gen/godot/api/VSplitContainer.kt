// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A container that accepts only two child controls, then arranges them vertically and creates a
 * divisor between them. The divisor can be dragged around to change the size relation between the
 * child controls.
 */
@GodotBaseType
public open class VSplitContainer : SplitContainer() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_VSPLITCONTAINER, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}

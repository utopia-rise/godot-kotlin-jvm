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
 * A vertical line used for separating other controls.
 *
 * A vertical separator used for separating other controls that are arranged **horizontally**. [godot.VSeparator] is purely visual and normally drawn as a [godot.StyleBoxLine].
 */
@GodotBaseType
public open class VSeparator : Separator() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VSEPARATOR, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}

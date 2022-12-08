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
 * Horizontal scroll bar.
 *
 * Horizontal version of [godot.ScrollBar], which goes from left (min) to right (max).
 */
@GodotBaseType
public open class HScrollBar : ScrollBar() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_HSCROLLBAR, scriptIndex)
    return true
  }

  public companion object
}

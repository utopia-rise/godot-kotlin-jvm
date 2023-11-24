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
 * A vertical scrollbar that goes from top (min) to bottom (max).
 *
 * A vertical scrollbar, typically used to navigate through content that extends beyond the visible height of a control. It is a [godot.Range]-based control and goes from top (min) to bottom (max). Note that this direction is the opposite of [godot.VSlider]'s.
 */
@GodotBaseType
public open class VScrollBar : ScrollBar() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VSCROLLBAR, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}

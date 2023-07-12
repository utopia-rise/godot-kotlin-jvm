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
 * A vertical slider that goes from bottom (min) to top (max).
 *
 * A vertical slider, used to adjust a value by moving a grabber along a vertical axis. It is a [godot.Range]-based control and goes from bottom (min) to top (max). Note that this direction is the opposite of [godot.VScrollBar]'s.
 */
@GodotBaseType
public open class VSlider : Slider() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VSLIDER, scriptIndex)
    return true
  }

  public companion object
}

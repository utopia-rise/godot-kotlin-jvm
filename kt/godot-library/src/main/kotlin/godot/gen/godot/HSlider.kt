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
 * A horizontal slider, used to adjust a value by moving a grabber along a horizontal axis. It is a
 * [Range]-based control and goes from left (min) to right (max).
 */
@GodotBaseType
public open class HSlider : Slider() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_HSLIDER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * Horizontal slider.
 *
 * Horizontal slider. See [godot.Slider]. This one goes from left (min) to right (max).
 *
 * **Note:** The [godot.Range.changed] and [godot.Range.valueChanged] signals are part of the [godot.Range] class which this class inherits from.
 */
@GodotBaseType
public open class HSlider : Slider() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_HSLIDER)
  }

  public companion object
}

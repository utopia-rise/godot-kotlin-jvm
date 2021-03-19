// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import kotlin.Suppress

/**
 * Horizontal slider.
 * 
 * Horizontal slider. See [godot.Slider]. This one goes from left (min) to right (max).
 *
 * **Note:** The [godot.Range.changed] and [godot.Range.valueChanged] signals are part of the [godot.Range] class which this class inherits from.
 */
@GodotBaseType
open class HSlider : Slider() {
  override fun __new() {
    callConstructor(ENGINECLASS_HSLIDER)
  }
}

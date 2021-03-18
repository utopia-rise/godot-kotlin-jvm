// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.util.VoidPtr
import kotlin.Suppress

/**
 * Vertical slider.
 *
 * Vertical slider. See [godot.Slider]. This one goes from bottom (min) to top (max).
 *
 * **Note:** The [godot.Range.changed] and [godot.Range.valueChanged] signals are part of the [godot.Range] class which this class inherits from.
 */
@GodotBaseType
open class VSlider : Slider() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_VSLIDER)
}

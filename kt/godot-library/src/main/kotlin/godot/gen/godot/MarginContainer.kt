// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import kotlin.Suppress

/**
 * Simple margin container.
 *
 * Adds a top, left, bottom, and right margin to all [godot.Control] nodes that are direct children of the container. To control the [godot.MarginContainer]'s margin, use the `margin_*` theme properties listed below.
 *
 * **Note:** Be careful, [godot.Control] margin values are different than the constant margin values. If you want to change the custom margin values of the [godot.MarginContainer] by code, you should use the following examples:
 *
 * ```
 * 		# This code sample assumes the current script is extending MarginContainer.
 * 		var margin_value = 100
 * 		add_constant_override("margin_top", margin_value)
 * 		add_constant_override("margin_left", margin_value)
 * 		add_constant_override("margin_bottom", margin_value)
 * 		add_constant_override("margin_right", margin_value)
 * 		```
 */
@GodotBaseType
open class MarginContainer : Container() {
  override fun __new() {
    callConstructor(ENGINECLASS_MARGINCONTAINER)
  }
}

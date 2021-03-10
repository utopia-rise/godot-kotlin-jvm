// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Simple margin container.
 *
 * Adds a top, left, bottom, and right margin to all [godot.Control] nodes that are direct children of the container. To control the [godot.MarginContainer]'s margin, use the `margin_*` theme properties listed below.
 *
 * **Note:** Be careful, [godot.Control] margin values are different than the constant margin values. If you want to change the custom margin values of the [godot.MarginContainer] by code, you should use the following examples:
 *
 * ```
 * 		var margin_value = 100
 * 		set("custom_constants/margin_top", margin_value)
 * 		set("custom_constants/margin_left", margin_value)
 * 		set("custom_constants/margin_bottom", margin_value)
 * 		set("custom_constants/margin_right", margin_value)
 * 		```
 */
@GodotBaseType
open class MarginContainer : Container() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_MARGINCONTAINER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}

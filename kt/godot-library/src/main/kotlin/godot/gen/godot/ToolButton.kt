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
 * Flat button helper class.
 *
 * This is a helper class to generate a flat [godot.Button] (see [godot.Button.flat]), creating a [godot.ToolButton] is equivalent to:
 *
 * ```
 * 		var btn = Button.new()
 * 		btn.flat = true
 * 		```
 */
@GodotBaseType
open class ToolButton : Button() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_TOOLBUTTON)
}

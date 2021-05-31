// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

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
public open class ToolButton : Button() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TOOLBUTTON)
  }
}

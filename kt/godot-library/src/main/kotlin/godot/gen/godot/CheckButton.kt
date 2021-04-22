// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import kotlin.Suppress

/**
 * Checkable button. See also [godot.CheckBox].
 *
 * CheckButton is a toggle button displayed as a check field. It's similar to [godot.CheckBox] in functionality, but it has a different appearance. To follow established UX patterns, it's recommended to use CheckButton when toggling it has an **immediate** effect on something. For instance, it should be used if toggling it enables/disables a setting without requiring the user to press a confirmation button.
 *
 * See also [godot.BaseButton] which contains common properties and methods associated with this node.
 */
@GodotBaseType
open class CheckButton : Button() {
  override fun __new() {
    callConstructor(ENGINECLASS_CHECKBUTTON)
  }
}

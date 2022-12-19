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
 * Checkable button. See also [godot.CheckBox].
 *
 * CheckButton is a toggle button displayed as a check field. It's similar to [godot.CheckBox] in functionality, but it has a different appearance. To follow established UX patterns, it's recommended to use CheckButton when toggling it has an **immediate** effect on something. For example, it could be used if toggling it enables/disables a setting without requiring the user to press a confirmation button.
 *
 * See also [godot.BaseButton] which contains common properties and methods associated with this node.
 */
@GodotBaseType
public open class CheckButton : Button() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CHECKBUTTON, scriptIndex)
    return true
  }

  public companion object
}

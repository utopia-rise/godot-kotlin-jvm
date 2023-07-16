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
 * A button that represents a binary choice.
 *
 * [godot.CheckButton] is a toggle button displayed as a check field. It's similar to [godot.CheckBox] in functionality, but it has a different appearance. To follow established UX patterns, it's recommended to use [godot.CheckButton] when toggling it has an **immediate** effect on something. For example, it can be used when pressing it shows or hides advanced settings, without asking the user to confirm this action.
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

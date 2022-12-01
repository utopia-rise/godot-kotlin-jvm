// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Binary choice user interface widget. See also [godot.CheckButton].
 *
 * A checkbox allows the user to make a binary choice (choosing only one of two possible options). It's similar to [godot.CheckButton] in functionality, but it has a different appearance. To follow established UX patterns, it's recommended to use CheckBox when toggling it has **no** immediate effect on something. For example, it could be used when toggling it will only do something once a confirmation button is pressed.
 *
 * See also [godot.BaseButton] which contains common properties and methods associated with this node.
 */
@GodotBaseType
public open class CheckBox : Button() {
  public override fun __new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CHECKBOX, scriptIndex)
  }

  public companion object
}

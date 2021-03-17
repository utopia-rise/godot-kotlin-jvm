// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import kotlin.Suppress

/**
 * Binary choice user interface widget. See also [godot.CheckButton].
 *
 * A checkbox allows the user to make a binary choice (choosing only one of two possible options). It's similar to [godot.CheckButton] in functionality, but it has a different apperance. To follow established UX patterns, it's recommended to use CheckBox when toggling it has **no** immediate effect on something. For instance, it should be used when toggling it will only do something once a confirmation button is pressed.
 */
@GodotBaseType
open class CheckBox : Button() {
  override fun __new() {
    callConstructor(ENGINECLASS_CHECKBOX)
  }
}

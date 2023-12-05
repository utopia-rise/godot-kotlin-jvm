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
 * A container that keeps a margin around its child controls.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/ui/gui_containers.html]($DOCS_URL/tutorials/ui/gui_containers.html)
 *
 * [godot.MarginContainer] adds an adjustable margin on each side of its child controls. The margins are added around all children, not around each individual one. To control the [godot.MarginContainer]'s margins, use the `margin_*` theme properties listed below.
 *
 * **Note:** The margin sizes are theme overrides, not normal properties. This is an example of how to change them in code:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * # This code sample assumes the current script is extending MarginContainer.
 *
 * var margin_value = 100
 *
 * add_theme_constant_override("margin_top", margin_value)
 *
 * add_theme_constant_override("margin_left", margin_value)
 *
 * add_theme_constant_override("margin_bottom", margin_value)
 *
 * add_theme_constant_override("margin_right", margin_value)
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * // This code sample assumes the current script is extending MarginContainer.
 *
 * int marginValue = 100;
 *
 * AddThemeConstantOverride("margin_top", marginValue);
 *
 * AddThemeConstantOverride("margin_left", marginValue);
 *
 * AddThemeConstantOverride("margin_bottom", marginValue);
 *
 * AddThemeConstantOverride("margin_right", marginValue);
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class MarginContainer : Container() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MARGINCONTAINER, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}

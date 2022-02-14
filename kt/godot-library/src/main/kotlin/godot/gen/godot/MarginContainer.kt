// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * Simple margin container.
 *
 * Adds a top, left, bottom, and right margin to all [godot.Control] nodes that are direct children of the container. To control the [godot.MarginContainer]'s margin, use the `margin_*` theme properties listed below.
 *
 * **Note:** Be careful, [godot.Control] margin values are different from the constant margin values. If you want to change the custom margin values of the [godot.MarginContainer] by code, you should use the following examples:
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
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_MARGINCONTAINER)
  }

  public companion object
}

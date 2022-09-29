// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * Class for displaying popups with a panel background.
 *
 * Class for displaying popups with a panel background. In some cases it might be simpler to use than [godot.Popup], since it provides a configurable background. If you are making windows, better check [godot.WindowDialog].
 *
 * If any [godot.Control] node is added as a child of this [godot.PopupPanel], it will be stretched to fit the panel's size (similar to how [godot.PanelContainer] works).
 */
@GodotBaseType
public open class PopupPanel : Popup() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_POPUPPANEL)
  }
}

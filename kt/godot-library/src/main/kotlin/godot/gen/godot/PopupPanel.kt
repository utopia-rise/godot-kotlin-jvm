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
 * Class for displaying popups with a panel background.
 *
 * Class for displaying popups with a panel background. In some cases it might be simpler to use than [godot.Popup], since it provides a configurable background. If you are making windows, better check [godot.Window].
 *
 * If any [godot.Control] node is added as a child of this [godot.PopupPanel], it will be stretched to fit the panel's size (similar to how [godot.PanelContainer] works).
 */
@GodotBaseType
public open class PopupPanel : Popup() {
  public override fun __new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_POPUPPANEL, scriptIndex)
  }

  public companion object
}

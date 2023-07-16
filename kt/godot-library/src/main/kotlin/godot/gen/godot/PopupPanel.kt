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
 * A popup with a panel background.
 *
 * A popup with a configurable panel background. Any child controls added to this node will be stretched to fit the panel's size (similar to how [godot.PanelContainer] works). If you are making windows, see [godot.Window].
 */
@GodotBaseType
public open class PopupPanel : Popup() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_POPUPPANEL, scriptIndex)
    return true
  }

  public companion object
}

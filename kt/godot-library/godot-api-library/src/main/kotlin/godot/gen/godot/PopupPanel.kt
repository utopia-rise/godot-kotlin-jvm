// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.util.Internals
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_POPUPPANEL_INDEX: Int = 500

/**
 * A popup with a configurable panel background. Any child controls added to this node will be
 * stretched to fit the panel's size (similar to how [PanelContainer] works). If you are making
 * windows, see [Window].
 */
@GodotBaseType
public open class PopupPanel : Popup() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_POPUPPANEL_INDEX, scriptIndex)
  }

  public companion object

  public object MethodBindings
}

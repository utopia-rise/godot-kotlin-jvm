// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import godot.core.Signal0
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * [Popup] is a base class for contextual windows and panels with fixed position. It's a modal by
 * default (see [Window.popupWindow]) and provides methods for implementing custom popup behavior.
 */
@GodotBaseType
public open class Popup : Window() {
  /**
   * Emitted when the popup is hidden.
   */
  public val popupHide: Signal0 by Signal0

  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_POPUP, this, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}

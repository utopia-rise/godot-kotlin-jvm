// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Base class for contextual windows and panels with fixed position.
 *
 * [godot.Popup] is a base class for contextual windows and panels with fixed position. It's a modal by default (see [godot.Window.popupWindow]) and provides methods for implementing custom popup behavior.
 */
@GodotBaseType
public open class Popup : Window() {
  /**
   * Emitted when the popup is hidden.
   */
  public val popupHide: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_POPUP, scriptIndex)
    return true
  }

  public companion object
}

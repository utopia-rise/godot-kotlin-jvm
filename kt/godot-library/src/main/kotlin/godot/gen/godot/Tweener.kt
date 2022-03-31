// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Suppress
import kotlin.Unit

/**
 * Abstract class for all Tweeners used by [godot.Tween].
 *
 * Tweeners are objects that perform a specific animating task, e.g. interpolating a property or calling a method at a given time. A [godot.Tweener] can't be created manually, you need to use a dedicated method from [godot.Tween] or [godot.Node].
 */
@GodotBaseType
public open class Tweener internal constructor() : RefCounted() {
  /**
   * Emitted when the [godot.Tweener] has just finished its job.
   */
  public val finished: Signal0 by signal()

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TWEENER)
  }

  public companion object
}

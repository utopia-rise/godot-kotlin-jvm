// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Signal0
import godot.util.Internals
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_TWEENER_INDEX: Int = 680

/**
 * Tweeners are objects that perform a specific animating task, e.g. interpolating a property or
 * calling a method at a given time. A [Tweener] can't be created manually, you need to use a dedicated
 * method from [Tween].
 */
@GodotBaseType
public open class Tweener internal constructor() : RefCounted() {
  /**
   * Emitted when the [Tweener] has just finished its job.
   */
  public val finished: Signal0 by Signal0

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_TWEENER_INDEX, scriptIndex)
  }

  public companion object

  public object MethodBindings
}

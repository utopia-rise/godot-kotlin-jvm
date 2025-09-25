// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.Signal0
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Tweeners are objects that perform a specific animating task, e.g. interpolating a property or
 * calling a method at a given time. A [Tweener] can't be created manually, you need to use a dedicated
 * method from [Tween].
 */
@GodotBaseType
public abstract class Tweener : RefCounted() {
  /**
   * Emitted when the [Tweener] has just finished its job or became invalid (e.g. due to a freed
   * object).
   */
  public val finished: Signal0 by Signal0

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(717, scriptIndex)
  }

  public companion object

  public object MethodBindings
}

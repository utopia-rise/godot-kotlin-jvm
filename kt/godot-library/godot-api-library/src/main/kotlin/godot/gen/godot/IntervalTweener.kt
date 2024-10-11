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

private const val ENGINE_CLASS_INTERVALTWEENER_INDEX: Int = 331

/**
 * [IntervalTweener] is used to make delays in a tweening sequence. See [Tween.tweenInterval] for
 * more usage information.
 * **Note:** [Tween.tweenInterval] is the only correct way to create [IntervalTweener]. Any
 * [IntervalTweener] created manually will not function correctly.
 */
@GodotBaseType
public open class IntervalTweener : Tweener() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_INTERVALTWEENER_INDEX, scriptIndex)
  }

  public companion object

  public object MethodBindings
}

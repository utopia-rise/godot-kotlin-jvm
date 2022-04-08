// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * Creates an idle interval in a [godot.Tween] animation.
 *
 * [godot.IntervalTweener] is used to make delays in a tweening sequence. See [godot.Tween.tweenInterval] for more usage information.
 *
 * **Note:** [godot.Tween.tweenInterval] is the only correct way to create [godot.IntervalTweener]. Any [godot.IntervalTweener] created manually will not function correctly.
 */
@GodotBaseType
public open class IntervalTweener : Tweener() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_INTERVALTWEENER)
  }

  public companion object
}

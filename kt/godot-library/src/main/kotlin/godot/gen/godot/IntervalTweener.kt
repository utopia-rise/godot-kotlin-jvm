// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * Creates an idle interval in a [godot.SceneTreeTween] animation.
 *
 * [godot.IntervalTweener] is used to make delays in a tweening sequence. See [godot.SceneTreeTween.tweenInterval] for more usage information.
 *
 * **Note:** [godot.SceneTreeTween.tweenInterval] is the only correct way to create [godot.IntervalTweener]. Any [godot.IntervalTweener] created manually will not function correctly.
 */
@GodotBaseType
public open class IntervalTweener : Tweener() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_INTERVALTWEENER)
  }
}

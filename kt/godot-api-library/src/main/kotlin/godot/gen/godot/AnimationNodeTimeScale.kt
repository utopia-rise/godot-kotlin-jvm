// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_ANIMATIONNODETIMESCALE_INDEX: Int = 66

/**
 * Allows to scale the speed of the animation (or reverse it) in any child [AnimationNode]s. Setting
 * it to `0.0` will pause the animation.
 */
@GodotBaseType
public open class AnimationNodeTimeScale : AnimationNode() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_ANIMATIONNODETIMESCALE_INDEX, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}

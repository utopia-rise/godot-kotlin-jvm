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

/**
 * A resource to add to an [AnimationNodeBlendTree]. Blends two animations out of three additively
 * out of three based on the amount value.
 * This animation node has three inputs:
 * - The base animation to add to
 * - A "-add" animation to blend with when the blend amount is negative
 * - A "+add" animation to blend with when the blend amount is positive
 * If the absolute value of the amount is greater than `1.0`, the animation connected to "in" port
 * is blended with the amplified animation connected to "-add"/"+add" port.
 */
@GodotBaseType
public open class AnimationNodeAdd3 : AnimationNodeSync() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_ANIMATIONNODEADD3, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}

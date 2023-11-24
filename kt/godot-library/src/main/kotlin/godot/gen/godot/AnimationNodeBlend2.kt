// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Blends two animations linearly inside of an [godot.AnimationNodeBlendTree].
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * A resource to add to an [godot.AnimationNodeBlendTree]. Blends two animations linearly based on the amount value.
 *
 * In general, the blend value should be in the `[0.0, 1.0]` range. Values outside of this range can blend amplified or inverted animations, however, [godot.AnimationNodeAdd2] works better for this purpose.
 */
@GodotBaseType
public open class AnimationNodeBlend2 : AnimationNodeSync() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODEBLEND2, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings
}

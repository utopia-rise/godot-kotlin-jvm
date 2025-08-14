// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress

/**
 * A resource to add to an [AnimationNodeBlendTree]. Blends two animations linearly based on the amount value.
 *
 * In general, the blend value should be in the `[0.0, 1.0]` range. Values outside of this range can blend amplified or inverted animations, however, [AnimationNodeAdd2] works better for this purpose.
 */
@GodotBaseType
public open class AnimationNodeBlend2 : AnimationNodeSync() {
  override fun new(scriptIndex: Int) {
    createNativeObject(19, scriptIndex)
  }

  public companion object

  public object MethodBindings
}

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
 * A humanoid [godot.SkeletonProfile] preset.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/assets_pipeline/retargeting_3d_skeletons.html]($DOCS_URL/tutorials/assets_pipeline/retargeting_3d_skeletons.html)
 *
 * A [godot.SkeletonProfile] as a preset that is optimized for the human form. This exists for standardization, so all parameters are read-only.
 */
@GodotBaseType
public open class SkeletonProfileHumanoid : SkeletonProfile() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONPROFILEHUMANOID, scriptIndex)
    return true
  }

  public companion object
}

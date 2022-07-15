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
 * Decomposes a [godot.core.Vector2], [godot.core.Vector3] or 4D vector (represented as a [godot.Quaternion]) into scalars within the visual shader graph.
 *
 * Takes a `vec2`, `vec3` or `vec4` and decomposes it into scalar values that can be used as separate outputs.
 */
@GodotBaseType
public open class VisualShaderNodeVectorDecompose : VisualShaderNodeVectorBase() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEVECTORDECOMPOSE)
  }

  public companion object
}

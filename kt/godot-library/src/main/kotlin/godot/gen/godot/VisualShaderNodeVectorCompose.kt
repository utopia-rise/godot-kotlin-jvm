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
 * Composes a [godot.core.Vector2], [godot.core.Vector3] or 4D vector (represented as a [godot.Quaternion]) from scalars within the visual shader graph.
 *
 * Creates a `vec2`, `vec3` or `vec4` using scalar values that can be provided from separate inputs.
 */
@GodotBaseType
public open class VisualShaderNodeVectorCompose : VisualShaderNodeVectorBase() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEVECTORCOMPOSE, scriptIndex)
    return true
  }

  public companion object
}

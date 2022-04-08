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
 * Decomposes a [godot.Transform3D] into four [godot.core.Vector3]s within the visual shader graph.
 *
 * Takes a 4x4 transform matrix and decomposes it into four `vec3` values, one from each row of the matrix.
 */
@GodotBaseType
public open class VisualShaderNodeTransformDecompose : VisualShaderNode() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODETRANSFORMDECOMPOSE)
  }

  public companion object
}

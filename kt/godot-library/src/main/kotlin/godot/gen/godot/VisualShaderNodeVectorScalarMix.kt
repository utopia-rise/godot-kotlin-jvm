// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * Linearly interpolates between two vectors using a scalar. For use within the visual shader graph.
 *
 * Translates to `mix(a, b, weight)` in the shader language, where `a` and `b` are vectors and `weight` is a scalar.
 */
@GodotBaseType
public open class VisualShaderNodeVectorScalarMix : VisualShaderNode() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEVECTORSCALARMIX)
  }
}

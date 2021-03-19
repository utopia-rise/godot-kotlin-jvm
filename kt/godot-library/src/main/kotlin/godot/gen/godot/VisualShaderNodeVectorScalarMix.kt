// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import kotlin.Suppress

/**
 * Linearly interpolates between two vectors using a scalar. For use within the visual shader graph.
 * 
 * Translates to `mix(a, b, weight)` in the shader language, where `a` and `b` are vectors and `weight` is a scalar.
 */
@GodotBaseType
open class VisualShaderNodeVectorScalarMix : VisualShaderNode() {
  override fun __new() {
    callConstructor(ENGINECLASS_VISUALSHADERNODEVECTORSCALARMIX)
  }
}

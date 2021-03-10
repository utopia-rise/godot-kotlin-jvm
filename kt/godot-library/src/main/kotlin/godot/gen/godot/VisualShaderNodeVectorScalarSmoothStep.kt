// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Calculates a vector SmoothStep function using scalar within the visual shader graph.
 *
 * Translates to `smoothstep(edge0, edge1, x)` in the shader language, where `x` is a scalar.
 *
 * Returns `0.0` if `x` is smaller than `edge0` and `1.0` if `x` is larger than `edge1`. Otherwise the return value is interpolated between `0.0` and `1.0` using Hermite polynomials.
 */
@GodotBaseType
open class VisualShaderNodeVectorScalarSmoothStep : VisualShaderNode() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODEVECTORSCALARSMOOTHSTEP)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}

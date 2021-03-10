// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Calculates a vector Step function within the visual shader graph.
 *
 * Translates to `step(edge, x)` in the shader language.
 *
 * Returns `0.0` if `x` is smaller than `edge` and `1.0` otherwise.
 */
@GodotBaseType
open class VisualShaderNodeVectorScalarStep : VisualShaderNode() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODEVECTORSCALARSTEP)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Linearly interpolates between two scalars within the visual shader graph.
 *
 * Translates to `mix(a, b, weight)` in the shader language.
 */
@GodotBaseType
open class VisualShaderNodeScalarInterp : VisualShaderNode() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODESCALARINTERP)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}

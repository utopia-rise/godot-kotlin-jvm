// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Composes a [godot.core.Transform] from four [godot.core.Vector3]s within the visual shader graph.
 *
 * Creates a 4x4 transform matrix using four vectors of type `vec3`. Each vector is one row in the matrix and the last column is a `vec4(0, 0, 0, 1)`.
 */
@GodotBaseType
open class VisualShaderNodeTransformCompose : VisualShaderNode() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODETRANSFORMCOMPOSE)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }
}

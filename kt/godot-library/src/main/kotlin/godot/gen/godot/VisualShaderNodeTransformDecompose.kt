// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.util.VoidPtr
import kotlin.Suppress

/**
 * Decomposes a [godot.core.Transform] into four [godot.core.Vector3]s within the visual shader graph.
 *
 * Takes a 4x4 transform matrix and decomposes it into four `vec3` values, one from each row of the matrix.
 */
@GodotBaseType
open class VisualShaderNodeTransformDecompose : VisualShaderNode() {
  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODETRANSFORMDECOMPOSE)
}

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
 * Returns the distance between two points. To be used within the visual shader graph.
 *
 * Calculates distance from point represented by vector `p0` to vector `p1`.
 *
 * Translated to `distance(p0, p1)` in the shader language.
 */
@GodotBaseType
open class VisualShaderNodeVectorDistance : VisualShaderNode() {
  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODEVECTORDISTANCE)
}

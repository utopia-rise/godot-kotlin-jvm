// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import kotlin.Suppress

/**
 * Linearly interpolates between two vectors within the visual shader graph.
 *
 * Translates to `mix(a, b, weight)` in the shader language, where `weight` is a [godot.core.Vector3] with weights for each component.
 */
@GodotBaseType
open class VisualShaderNodeVectorInterp : VisualShaderNode() {
  override fun __new() {
    callConstructor(ENGINECLASS_VISUALSHADERNODEVECTORINTERP)
  }
}

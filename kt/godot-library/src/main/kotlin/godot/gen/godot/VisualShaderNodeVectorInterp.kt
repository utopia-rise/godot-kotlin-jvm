// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * Linearly interpolates between two vectors within the visual shader graph.
 *
 * Translates to `mix(a, b, weight)` in the shader language, where `weight` is a [godot.core.Vector3] with weights for each component.
 */
@GodotBaseType
public open class VisualShaderNodeVectorInterp : VisualShaderNode() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEVECTORINTERP)
  }
}

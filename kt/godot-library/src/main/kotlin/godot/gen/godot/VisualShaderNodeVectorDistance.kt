// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * Returns the distance between two points. To be used within the visual shader graph.
 *
 * Calculates distance from point represented by vector `p0` to vector `p1`.
 *
 * Translated to `distance(p0, p1)` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeVectorDistance : VisualShaderNodeVectorBase() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEVECTORDISTANCE)
  }

  public companion object
}

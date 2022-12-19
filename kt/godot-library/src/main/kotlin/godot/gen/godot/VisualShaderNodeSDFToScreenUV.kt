// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * A function to convert an SDF (signed-distance field) to screen UV, to be used within the visual shader graph.
 *
 * Translates to `sdf_to_screen_uv(sdf_pos)` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeSDFToScreenUV : VisualShaderNode() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODESDFTOSCREENUV, scriptIndex)
    return true
  }

  public companion object
}

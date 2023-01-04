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
 * A [godot.Cubemap] parameter node to be used within the visual shader graph.
 *
 * Translated to `uniform samplerCube` in the shader language. The output value can be used as port for [godot.VisualShaderNodeCubemap].
 */
@GodotBaseType
public open class VisualShaderNodeCubemapParameter : VisualShaderNodeTextureParameter() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODECUBEMAPPARAMETER, scriptIndex)
    return true
  }

  public companion object
}

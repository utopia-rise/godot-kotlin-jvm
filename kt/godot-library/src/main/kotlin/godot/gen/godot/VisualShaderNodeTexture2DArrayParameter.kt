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
 * A visual shader node for shader parameter (uniform) of type [godot.Texture2DArray].
 *
 * This parameter allows to provide a collection of textures for the shader. You can use [godot.VisualShaderNodeTexture2DArray] to extract the textures from array.
 */
@GodotBaseType
public open class VisualShaderNodeTexture2DArrayParameter : VisualShaderNodeTextureParameter() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODETEXTURE2DARRAYPARAMETER, scriptIndex)
    return true
  }

  public companion object
}

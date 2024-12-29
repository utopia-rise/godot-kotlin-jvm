// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * This parameter allows to provide a collection of textures for the shader. You can use
 * [VisualShaderNodeTexture2DArray] to extract the textures from array.
 */
@GodotBaseType
public open class VisualShaderNodeTexture2DArrayParameter : VisualShaderNodeTextureParameter() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_VISUALSHADERNODETEXTURE2DARRAYPARAMETER, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}

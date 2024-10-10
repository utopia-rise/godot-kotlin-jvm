// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.util.Internals
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_VISUALSHADERNODETEXTURE2DARRAYPARAMETER_INDEX: Int = 778

/**
 * This parameter allows to provide a collection of textures for the shader. You can use
 * [VisualShaderNodeTexture2DArray] to extract the textures from array.
 */
@GodotBaseType
public open class VisualShaderNodeTexture2DArrayParameter : VisualShaderNodeTextureParameter() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODETEXTURE2DARRAYPARAMETER_INDEX,
        scriptIndex)
  }

  public companion object

  internal object MethodBindings
}

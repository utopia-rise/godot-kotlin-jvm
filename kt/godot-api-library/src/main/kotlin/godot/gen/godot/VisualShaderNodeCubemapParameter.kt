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

private const val ENGINE_CLASS_VISUALSHADERNODECUBEMAPPARAMETER_INDEX: Int = 719

/**
 * Translated to `uniform samplerCube` in the shader language. The output value can be used as port
 * for [VisualShaderNodeCubemap].
 */
@GodotBaseType
public open class VisualShaderNodeCubemapParameter : VisualShaderNodeTextureParameter() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODECUBEMAPPARAMETER_INDEX,
        scriptIndex)
  }

  public companion object

  internal object MethodBindings
}

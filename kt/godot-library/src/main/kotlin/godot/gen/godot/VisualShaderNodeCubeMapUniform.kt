// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * A [godot.CubeMap] uniform node to be used within the visual shader graph.
 *
 * Translated to `uniform samplerCube` in the shader language. The output value can be used as port for [godot.VisualShaderNodeCubeMap].
 */
@GodotBaseType
public open class VisualShaderNodeCubeMapUniform : VisualShaderNodeTextureUniform() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODECUBEMAPUNIFORM)
  }
}

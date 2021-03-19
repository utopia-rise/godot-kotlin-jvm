// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import kotlin.Suppress

/**
 * A [godot.CubeMap] uniform node to be used within the visual shader graph.
 *
 * Translated to `uniform samplerCube` in the shader language. The output value can be used as port for [godot.VisualShaderNodeCubeMap].
 */
@GodotBaseType
open class VisualShaderNodeCubeMapUniform : VisualShaderNodeTextureUniform() {
  override fun __new() {
    callConstructor(ENGINECLASS_VISUALSHADERNODECUBEMAPUNIFORM)
  }
}

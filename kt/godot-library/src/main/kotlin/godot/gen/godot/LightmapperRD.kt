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
 * The built-in GPU-based lightmapper for use with [godot.LightmapGI].
 *
 * LightmapperRD ("RD" stands for [godot.RenderingDevice]) is the built-in GPU-based lightmapper for use with [godot.LightmapGI]. On most dedicated GPUs, it can bake lightmaps much faster than most CPU-based lightmappers. LightmapperRD uses compute shaders to bake lightmaps, so it does not require CUDA or OpenCL libraries to be installed to be usable.
 *
 * **Note:** Only usable when using the Vulkan backend (Forward+ or Mobile), not OpenGL.
 */
@GodotBaseType
public open class LightmapperRD : Lightmapper() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_LIGHTMAPPERRD, scriptIndex)
    return true
  }

  public companion object
}

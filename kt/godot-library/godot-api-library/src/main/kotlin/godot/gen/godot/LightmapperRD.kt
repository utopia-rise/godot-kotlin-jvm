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

private const val ENGINE_CLASS_LIGHTMAPPERRD_INDEX: Int = 355

/**
 * LightmapperRD ("RD" stands for [RenderingDevice]) is the built-in GPU-based lightmapper for use
 * with [LightmapGI]. On most dedicated GPUs, it can bake lightmaps much faster than most CPU-based
 * lightmappers. LightmapperRD uses compute shaders to bake lightmaps, so it does not require CUDA or
 * OpenCL libraries to be installed to be usable.
 * **Note:** Only usable when using the Vulkan backend (Forward+ or Mobile), not OpenGL.
 */
@GodotBaseType
public open class LightmapperRD : Lightmapper() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_LIGHTMAPPERRD_INDEX, scriptIndex)
  }

  public companion object

  public object MethodBindings
}

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
 * Abstract class extended by lightmappers, for use in [godot.LightmapGI].
 *
 * This class should be extended by custom lightmapper classes. Lightmappers can then be used with [godot.LightmapGI] to provide fast baked global illumination in 3D.
 *
 * Godot contains a built-in GPU-based lightmapper [godot.LightmapperRD] that uses compute shaders, but custom lightmappers can be implemented by C++ modules.
 */
@GodotBaseType
public open class Lightmapper internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_LIGHTMAPPER, scriptIndex)
    return true
  }

  public companion object
}

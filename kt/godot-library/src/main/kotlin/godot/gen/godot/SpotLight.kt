// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * A spotlight, such as a reflector spotlight or a lantern.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * A Spotlight is a type of [godot.Light] node that emits lights in a specific direction, in the shape of a cone. The light is attenuated through the distance. This attenuation can be configured by changing the energy, radius and attenuation parameters of [godot.Light].
 *
 * **Note:** By default, only 32 SpotLights may affect a single mesh *resource* at once. Consider splitting your level into several meshes to decrease the likelihood that more than 32 lights will affect the same mesh resource. Splitting the level mesh will also improve frustum culling effectiveness, leading to greater performance. If you need to use more lights per mesh, you can increase [godot.ProjectSettings.rendering/limits/rendering/maxLightsPerObject] at the cost of shader compilation times.
 */
@GodotBaseType
public open class SpotLight : Light() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SPOTLIGHT)
  }
}

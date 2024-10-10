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

private const val ENGINE_CLASS_SPOTLIGHT3D_INDEX: Int = 544

/**
 * A Spotlight is a type of [Light3D] node that emits lights in a specific direction, in the shape
 * of a cone. The light is attenuated through the distance. This attenuation can be configured by
 * changing the energy, radius and attenuation parameters of [Light3D].
 * **Note:** When using the Mobile rendering method, only 8 spot lights can be displayed on each
 * mesh resource. Attempting to display more than 8 spot lights on a single mesh resource will result
 * in spot lights flickering in and out as the camera moves. When using the Compatibility rendering
 * method, only 8 spot lights can be displayed on each mesh resource by default, but this can be
 * increased by adjusting [ProjectSettings.rendering/limits/opengl/maxLightsPerObject].
 * **Note:** When using the Mobile or Compatibility rendering methods, spot lights will only
 * correctly affect meshes whose visibility AABB intersects with the light's AABB. If using a shader to
 * deform the mesh in a way that makes it go outside its AABB, [GeometryInstance3D.extraCullMargin]
 * must be increased on the mesh. Otherwise, the light may not be visible on the mesh.
 */
@GodotBaseType
public open class SpotLight3D : Light3D() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_SPOTLIGHT3D_INDEX, scriptIndex)
  }

  public companion object

  internal object MethodBindings
}

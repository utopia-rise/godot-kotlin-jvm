// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Omnidirectional light, such as a light bulb or a candle.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/3d/lights_and_shadows.html]($DOCS_URL/tutorials/3d/lights_and_shadows.html)
 *
 * An Omnidirectional light is a type of [godot.Light3D] that emits light in all directions. The light is attenuated by distance and this attenuation can be configured by changing its energy, radius, and attenuation parameters.
 *
 * **Note:** When using the Mobile rendering method, only 8 omni lights can be displayed on each mesh resource. Attempting to display more than 8 omni lights on a single mesh resource will result in omni lights flickering in and out as the camera moves. When using the Compatibility rendering method, only 8 omni lights can be displayed on each mesh resource by default, but this can be increased by adjusting [godot.ProjectSettings.rendering/limits/opengl/maxLightsPerObject].
 *
 * **Note:** When using the Mobile or Compatibility rendering methods, omni lights will only correctly affect meshes whose visibility AABB intersects with the light's AABB. If using a shader to deform the mesh in a way that makes it go outside its AABB, [godot.GeometryInstance3D.extraCullMargin] must be increased on the mesh. Otherwise, the light may not be visible on the mesh.
 */
@GodotBaseType
public open class OmniLight3D : Light3D() {
  /**
   * See [enum ShadowMode].
   */
  public var omniShadowMode: ShadowMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OMNILIGHT3D_GET_SHADOW_MODE, LONG)
      return OmniLight3D.ShadowMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OMNILIGHT3D_SET_SHADOW_MODE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OMNILIGHT3D, scriptIndex)
    return true
  }

  public enum class ShadowMode(
    id: Long,
  ) {
    /**
     * Shadows are rendered to a dual-paraboloid texture. Faster than [SHADOW_CUBE], but lower-quality.
     */
    SHADOW_DUAL_PARABOLOID(0),
    /**
     * Shadows are rendered to a cubemap. Slower than [SHADOW_DUAL_PARABOLOID], but higher-quality.
     */
    SHADOW_CUBE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}

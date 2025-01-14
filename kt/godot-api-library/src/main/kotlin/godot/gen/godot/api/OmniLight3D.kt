// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * An Omnidirectional light is a type of [Light3D] that emits light in all directions. The light is
 * attenuated by distance and this attenuation can be configured by changing its energy, radius, and
 * attenuation parameters.
 * **Note:** When using the Mobile rendering method, only 8 omni lights can be displayed on each
 * mesh resource. Attempting to display more than 8 omni lights on a single mesh resource will result
 * in omni lights flickering in and out as the camera moves. When using the Compatibility rendering
 * method, only 8 omni lights can be displayed on each mesh resource by default, but this can be
 * increased by adjusting [ProjectSettings.rendering/limits/opengl/maxLightsPerObject].
 * **Note:** When using the Mobile or Compatibility rendering methods, omni lights will only
 * correctly affect meshes whose visibility AABB intersects with the light's AABB. If using a shader to
 * deform the mesh in a way that makes it go outside its AABB, [GeometryInstance3D.extraCullMargin]
 * must be increased on the mesh. Otherwise, the light may not be visible on the mesh.
 */
@GodotBaseType
public open class OmniLight3D : Light3D() {
  /**
   * See [ShadowMode].
   */
  public final inline var omniShadowMode: ShadowMode
    @JvmName("omniShadowModeProperty")
    get() = getShadowMode()
    @JvmName("omniShadowModeProperty")
    set(`value`) {
      setShadowMode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_OMNILIGHT3D, scriptIndex)
  }

  public final fun setShadowMode(mode: ShadowMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setShadowModePtr, NIL)
  }

  public final fun getShadowMode(): ShadowMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getShadowModePtr, LONG)
    return OmniLight3D.ShadowMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class ShadowMode(
    id: Long,
  ) {
    /**
     * Shadows are rendered to a dual-paraboloid texture. Faster than [SHADOW_CUBE], but
     * lower-quality.
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
      public fun from(`value`: Long): ShadowMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setShadowModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OmniLight3D", "set_shadow_mode", 121862228)

    public val getShadowModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OmniLight3D", "get_shadow_mode", 4181586331)
  }
}

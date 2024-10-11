// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_DIRECTIONALLIGHT3D_INDEX: Int = 228

/**
 * A directional light is a type of [Light3D] node that models an infinite number of parallel rays
 * covering the entire scene. It is used for lights with strong intensity that are located far away
 * from the scene to model sunlight or moonlight. The worldspace location of the DirectionalLight3D
 * transform (origin) is ignored. Only the basis is used to determine light direction.
 */
@GodotBaseType
public open class DirectionalLight3D : Light3D() {
  /**
   * The light's shadow rendering algorithm. See [ShadowMode].
   */
  public final inline var directionalShadowMode: ShadowMode
    @JvmName("directionalShadowModeProperty")
    get() = getShadowMode()
    @JvmName("directionalShadowModeProperty")
    set(`value`) {
      setShadowMode(value)
    }

  /**
   * If `true`, shadow detail is sacrificed in exchange for smoother transitions between splits.
   * Enabling shadow blend splitting also has a moderate performance cost. This is ignored when
   * [directionalShadowMode] is [SHADOW_ORTHOGONAL].
   */
  public final inline var directionalShadowBlendSplits: Boolean
    @JvmName("directionalShadowBlendSplitsProperty")
    get() = isBlendSplitsEnabled()
    @JvmName("directionalShadowBlendSplitsProperty")
    set(`value`) {
      setBlendSplits(value)
    }

  /**
   * Set whether this [DirectionalLight3D] is visible in the sky, in the scene, or both in the sky
   * and in the scene. See [SkyMode] for options.
   */
  public final inline var skyMode: SkyMode
    @JvmName("skyModeProperty")
    get() = getSkyMode()
    @JvmName("skyModeProperty")
    set(`value`) {
      setSkyMode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_DIRECTIONALLIGHT3D_INDEX, scriptIndex)
  }

  public final fun setShadowMode(mode: ShadowMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setShadowModePtr, NIL)
  }

  public final fun getShadowMode(): ShadowMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getShadowModePtr, LONG)
    return DirectionalLight3D.ShadowMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setBlendSplits(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setBlendSplitsPtr, NIL)
  }

  public final fun isBlendSplitsEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isBlendSplitsEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSkyMode(mode: SkyMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setSkyModePtr, NIL)
  }

  public final fun getSkyMode(): SkyMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSkyModePtr, LONG)
    return DirectionalLight3D.SkyMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public enum class ShadowMode(
    id: Long,
  ) {
    /**
     * Renders the entire scene's shadow map from an orthogonal point of view. This is the fastest
     * directional shadow mode. May result in blurrier shadows on close objects.
     */
    SHADOW_ORTHOGONAL(0),
    /**
     * Splits the view frustum in 2 areas, each with its own shadow map. This shadow mode is a
     * compromise between [SHADOW_ORTHOGONAL] and [SHADOW_PARALLEL_4_SPLITS] in terms of performance.
     */
    SHADOW_PARALLEL_2_SPLITS(1),
    /**
     * Splits the view frustum in 4 areas, each with its own shadow map. This is the slowest
     * directional shadow mode.
     */
    SHADOW_PARALLEL_4_SPLITS(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ShadowMode = entries.single { it.id == `value` }
    }
  }

  public enum class SkyMode(
    id: Long,
  ) {
    /**
     * Makes the light visible in both scene lighting and sky rendering.
     */
    SKY_MODE_LIGHT_AND_SKY(0),
    /**
     * Makes the light visible in scene lighting only (including direct lighting and global
     * illumination). When using this mode, the light will not be visible from sky shaders.
     */
    SKY_MODE_LIGHT_ONLY(1),
    /**
     * Makes the light visible to sky shaders only. When using this mode the light will not cast
     * light into the scene (either through direct lighting or through global illumination), but can be
     * accessed through sky shaders. This can be useful, for example, when you want to control sky
     * effects without illuminating the scene (during a night cycle, for example).
     */
    SKY_MODE_SKY_ONLY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SkyMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setShadowModePtr: VoidPtr =
        Internals.getMethodBindPtr("DirectionalLight3D", "set_shadow_mode", 1261211726)

    internal val getShadowModePtr: VoidPtr =
        Internals.getMethodBindPtr("DirectionalLight3D", "get_shadow_mode", 2765228544)

    internal val setBlendSplitsPtr: VoidPtr =
        Internals.getMethodBindPtr("DirectionalLight3D", "set_blend_splits", 2586408642)

    internal val isBlendSplitsEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("DirectionalLight3D", "is_blend_splits_enabled", 36873697)

    internal val setSkyModePtr: VoidPtr =
        Internals.getMethodBindPtr("DirectionalLight3D", "set_sky_mode", 2691194817)

    internal val getSkyModePtr: VoidPtr =
        Internals.getMethodBindPtr("DirectionalLight3D", "get_sky_mode", 3819982774)
  }
}

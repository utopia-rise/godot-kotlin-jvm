// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.GodotEnum
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
   * The distance from camera to shadow split 1. Relative to [directionalShadowMaxDistance]. Only
   * used when [directionalShadowMode] is [SHADOW_PARALLEL_2_SPLITS] or [SHADOW_PARALLEL_4_SPLITS].
   */
  public final inline var directionalShadowSplit1: Float
    @JvmName("directionalShadowSplit1Property")
    get() = getParam(Light3D.Param.SHADOW_SPLIT_1_OFFSET)
    @JvmName("directionalShadowSplit1Property")
    set(`value`) {
      setParam(Light3D.Param.SHADOW_SPLIT_1_OFFSET, value)
    }

  /**
   * The distance from shadow split 1 to split 2. Relative to [directionalShadowMaxDistance]. Only
   * used when [directionalShadowMode] is [SHADOW_PARALLEL_4_SPLITS].
   */
  public final inline var directionalShadowSplit2: Float
    @JvmName("directionalShadowSplit2Property")
    get() = getParam(Light3D.Param.SHADOW_SPLIT_2_OFFSET)
    @JvmName("directionalShadowSplit2Property")
    set(`value`) {
      setParam(Light3D.Param.SHADOW_SPLIT_2_OFFSET, value)
    }

  /**
   * The distance from shadow split 2 to split 3. Relative to [directionalShadowMaxDistance]. Only
   * used when [directionalShadowMode] is [SHADOW_PARALLEL_4_SPLITS].
   */
  public final inline var directionalShadowSplit3: Float
    @JvmName("directionalShadowSplit3Property")
    get() = getParam(Light3D.Param.SHADOW_SPLIT_3_OFFSET)
    @JvmName("directionalShadowSplit3Property")
    set(`value`) {
      setParam(Light3D.Param.SHADOW_SPLIT_3_OFFSET, value)
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
   * Proportion of [directionalShadowMaxDistance] at which point the shadow starts to fade. At
   * [directionalShadowMaxDistance], the shadow will disappear. The default value is a balance between
   * smooth fading and distant shadow visibility. If the camera moves fast and the
   * [directionalShadowMaxDistance] is low, consider lowering [directionalShadowFadeStart] below `0.8`
   * to make shadow transitions less noticeable. On the other hand, if you tuned
   * [directionalShadowMaxDistance] to cover the entire scene, you can set [directionalShadowFadeStart]
   * to `1.0` to prevent the shadow from fading in the distance (it will suddenly cut off instead).
   */
  public final inline var directionalShadowFadeStart: Float
    @JvmName("directionalShadowFadeStartProperty")
    get() = getParam(Light3D.Param.SHADOW_FADE_START)
    @JvmName("directionalShadowFadeStartProperty")
    set(`value`) {
      setParam(Light3D.Param.SHADOW_FADE_START, value)
    }

  /**
   * The maximum distance for shadow splits. Increasing this value will make directional shadows
   * visible from further away, at the cost of lower overall shadow detail and performance (since more
   * objects need to be included in the directional shadow rendering).
   */
  public final inline var directionalShadowMaxDistance: Float
    @JvmName("directionalShadowMaxDistanceProperty")
    get() = getParam(Light3D.Param.SHADOW_MAX_DISTANCE)
    @JvmName("directionalShadowMaxDistanceProperty")
    set(`value`) {
      setParam(Light3D.Param.SHADOW_MAX_DISTANCE, value)
    }

  /**
   * Sets the size of the directional shadow pancake. The pancake offsets the start of the shadow's
   * camera frustum to provide a higher effective depth resolution for the shadow. However, a high
   * pancake size can cause artifacts in the shadows of large objects that are close to the edge of the
   * frustum. Reducing the pancake size can help. Setting the size to `0` turns off the pancaking
   * effect.
   */
  public final inline var directionalShadowPancakeSize: Float
    @JvmName("directionalShadowPancakeSizeProperty")
    get() = getParam(Light3D.Param.SHADOW_PANCAKE_SIZE)
    @JvmName("directionalShadowPancakeSizeProperty")
    set(`value`) {
      setParam(Light3D.Param.SHADOW_PANCAKE_SIZE, value)
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
    createNativeObject(197, scriptIndex)
  }

  public final fun setShadowMode(mode: ShadowMode): Unit {
    TransferContext.writeArguments(LONG to mode.value)
    TransferContext.callMethod(ptr, MethodBindings.setShadowModePtr, NIL)
  }

  public final fun getShadowMode(): ShadowMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getShadowModePtr, LONG)
    return ShadowMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setBlendSplits(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setBlendSplitsPtr, NIL)
  }

  public final fun isBlendSplitsEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isBlendSplitsEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSkyMode(mode: SkyMode): Unit {
    TransferContext.writeArguments(LONG to mode.value)
    TransferContext.callMethod(ptr, MethodBindings.setSkyModePtr, NIL)
  }

  public final fun getSkyMode(): SkyMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkyModePtr, LONG)
    return SkyMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class ShadowMode(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Renders the entire scene's shadow map from an orthogonal point of view. This is the fastest
     * directional shadow mode. May result in blurrier shadows on close objects.
     */
    ORTHOGONAL(0),
    /**
     * Splits the view frustum in 2 areas, each with its own shadow map. This shadow mode is a
     * compromise between [SHADOW_ORTHOGONAL] and [SHADOW_PARALLEL_4_SPLITS] in terms of performance.
     */
    PARALLEL_2_SPLITS(1),
    /**
     * Splits the view frustum in 4 areas, each with its own shadow map. This is the slowest
     * directional shadow mode.
     */
    PARALLEL_4_SPLITS(2),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): ShadowMode = entries.single { it.`value` == `value` }
    }
  }

  public enum class SkyMode(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Makes the light visible in both scene lighting and sky rendering.
     */
    LIGHT_AND_SKY(0),
    /**
     * Makes the light visible in scene lighting only (including direct lighting and global
     * illumination). When using this mode, the light will not be visible from sky shaders.
     */
    LIGHT_ONLY(1),
    /**
     * Makes the light visible to sky shaders only. When using this mode the light will not cast
     * light into the scene (either through direct lighting or through global illumination), but can be
     * accessed through sky shaders. This can be useful, for example, when you want to control sky
     * effects without illuminating the scene (during a night cycle, for example).
     */
    SKY_ONLY(2),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): SkyMode = entries.single { it.`value` == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setShadowModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirectionalLight3D", "set_shadow_mode", 1261211726)

    internal val getShadowModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirectionalLight3D", "get_shadow_mode", 2765228544)

    internal val setBlendSplitsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirectionalLight3D", "set_blend_splits", 2586408642)

    internal val isBlendSplitsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirectionalLight3D", "is_blend_splits_enabled", 36873697)

    internal val setSkyModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirectionalLight3D", "set_sky_mode", 2691194817)

    internal val getSkyModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("DirectionalLight3D", "get_sky_mode", 3819982774)
  }
}

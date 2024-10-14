// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Light3D is the *abstract* base class for light nodes. As it can't be instantiated, it shouldn't
 * be used directly. Other types of light nodes inherit from it. Light3D contains the common variables
 * and parameters used for lighting.
 */
@GodotBaseType
public open class Light3D internal constructor() : VisualInstance3D() {
  /**
   * Used by positional lights ([OmniLight3D] and [SpotLight3D]) when
   * [ProjectSettings.rendering/lightsAndShadows/usePhysicalLightUnits] is `true`. Sets the intensity
   * of the light source measured in Lumens. Lumens are a measure of luminous flux, which is the total
   * amount of visible light emitted by a light source per unit of time.
   * For [SpotLight3D]s, we assume that the area outside the visible cone is surrounded by a perfect
   * light absorbing material. Accordingly, the apparent brightness of the cone area does not change as
   * the cone increases and decreases in size.
   * A typical household lightbulb can range from around 600 lumens to 1,200 lumens, a candle is
   * about 13 lumens, while a streetlight can be approximately 60,000 lumens.
   */
  public final inline var lightIntensityLumens: Float
    @JvmName("lightIntensityLumensProperty")
    get() = getParam(Light3D.Param.PARAM_INTENSITY)
    @JvmName("lightIntensityLumensProperty")
    set(`value`) {
      setParam(Light3D.Param.PARAM_INTENSITY, value)
    }

  /**
   * Used by [DirectionalLight3D]s when
   * [ProjectSettings.rendering/lightsAndShadows/usePhysicalLightUnits] is `true`. Sets the intensity
   * of the light source measured in Lux. Lux is a measure of luminous flux per unit area, it is equal
   * to one lumen per square meter. Lux is the measure of how much light hits a surface at a given
   * time.
   * On a clear sunny day a surface in direct sunlight may be approximately 100,000 lux, a typical
   * room in a home may be approximately 50 lux, while the moonlit ground may be approximately 0.1 lux.
   */
  public final inline var lightIntensityLux: Float
    @JvmName("lightIntensityLuxProperty")
    get() = getParam(Light3D.Param.PARAM_INTENSITY)
    @JvmName("lightIntensityLuxProperty")
    set(`value`) {
      setParam(Light3D.Param.PARAM_INTENSITY, value)
    }

  /**
   * Sets the color temperature of the light source, measured in Kelvin. This is used to calculate a
   * correlated color temperature which tints the [lightColor].
   * The sun on a cloudy day is approximately 6500 Kelvin, on a clear day it is between 5500 to 6000
   * Kelvin, and on a clear day at sunrise or sunset it ranges to around 1850 Kelvin.
   */
  public final inline var lightTemperature: Float
    @JvmName("lightTemperatureProperty")
    get() = getTemperature()
    @JvmName("lightTemperatureProperty")
    set(`value`) {
      setTemperature(value)
    }

  /**
   * The light's color. An *overbright* color can be used to achieve a result equivalent to
   * increasing the light's [lightEnergy].
   */
  @CoreTypeLocalCopy
  public final inline var lightColor: Color
    @JvmName("lightColorProperty")
    get() = getColor()
    @JvmName("lightColorProperty")
    set(`value`) {
      setColor(value)
    }

  /**
   * The light's strength multiplier (this is not a physical unit). For [OmniLight3D] and
   * [SpotLight3D], changing this value will only change the light color's intensity, not the light's
   * radius.
   */
  public final inline var lightEnergy: Float
    @JvmName("lightEnergyProperty")
    get() = getParam(Light3D.Param.PARAM_ENERGY)
    @JvmName("lightEnergyProperty")
    set(`value`) {
      setParam(Light3D.Param.PARAM_ENERGY, value)
    }

  /**
   * Secondary multiplier used with indirect light (light bounces). Used with [VoxelGI] and SDFGI
   * (see [Environment.sdfgiEnabled]).
   * **Note:** This property is ignored if [lightEnergy] is equal to `0.0`, as the light won't be
   * present at all in the GI shader.
   */
  public final inline var lightIndirectEnergy: Float
    @JvmName("lightIndirectEnergyProperty")
    get() = getParam(Light3D.Param.PARAM_INDIRECT_ENERGY)
    @JvmName("lightIndirectEnergyProperty")
    set(`value`) {
      setParam(Light3D.Param.PARAM_INDIRECT_ENERGY, value)
    }

  /**
   * Secondary multiplier multiplied with [lightEnergy] then used with the [Environment]'s
   * volumetric fog (if enabled). If set to `0.0`, computing volumetric fog will be skipped for this
   * light, which can improve performance for large amounts of lights when volumetric fog is enabled.
   * **Note:** To prevent short-lived dynamic light effects from poorly interacting with volumetric
   * fog, lights used in those effects should have [lightVolumetricFogEnergy] set to `0.0` unless
   * [Environment.volumetricFogTemporalReprojectionEnabled] is disabled (or unless the reprojection
   * amount is significantly lowered).
   */
  public final inline var lightVolumetricFogEnergy: Float
    @JvmName("lightVolumetricFogEnergyProperty")
    get() = getParam(Light3D.Param.PARAM_VOLUMETRIC_FOG_ENERGY)
    @JvmName("lightVolumetricFogEnergyProperty")
    set(`value`) {
      setParam(Light3D.Param.PARAM_VOLUMETRIC_FOG_ENERGY, value)
    }

  /**
   * [Texture2D] projected by light. [shadowEnabled] must be on for the projector to work. Light
   * projectors make the light appear as if it is shining through a colored but transparent object,
   * almost like light shining through stained-glass.
   * **Note:** Unlike [BaseMaterial3D] whose filter mode can be adjusted on a per-material basis,
   * the filter mode for light projector textures is set globally with
   * [ProjectSettings.rendering/textures/lightProjectors/filter].
   * **Note:** Light projector textures are only supported in the Forward+ and Mobile rendering
   * methods, not Compatibility.
   */
  public final inline var lightProjector: Texture2D?
    @JvmName("lightProjectorProperty")
    get() = getProjector()
    @JvmName("lightProjectorProperty")
    set(`value`) {
      setProjector(value)
    }

  /**
   * The size of the light in Godot units. Only available for [OmniLight3D]s and [SpotLight3D]s.
   * Increasing this value will make the light fade out slower and shadows appear blurrier (also called
   * percentage-closer soft shadows, or PCSS). This can be used to simulate area lights to an extent.
   * Increasing this value above `0.0` for lights with shadows enabled will have a noticeable
   * performance cost due to PCSS.
   * **Note:** [lightSize] is not affected by [Node3D.scale] (the light's scale or its parent's
   * scale).
   * **Note:** PCSS for positional lights is only supported in the Forward+ and Mobile rendering
   * methods, not Compatibility.
   */
  public final inline var lightSize: Float
    @JvmName("lightSizeProperty")
    get() = getParam(Light3D.Param.PARAM_SIZE)
    @JvmName("lightSizeProperty")
    set(`value`) {
      setParam(Light3D.Param.PARAM_SIZE, value)
    }

  /**
   * The light's angular size in degrees. Increasing this will make shadows softer at greater
   * distances (also called percentage-closer soft shadows, or PCSS). Only available for
   * [DirectionalLight3D]s. For reference, the Sun from the Earth is approximately `0.5`. Increasing
   * this value above `0.0` for lights with shadows enabled will have a noticeable performance cost due
   * to PCSS.
   * **Note:** [lightAngularDistance] is not affected by [Node3D.scale] (the light's scale or its
   * parent's scale).
   * **Note:** PCSS for directional lights is only supported in the Forward+ rendering method, not
   * Mobile or Compatibility.
   */
  public final inline var lightAngularDistance: Float
    @JvmName("lightAngularDistanceProperty")
    get() = getParam(Light3D.Param.PARAM_SIZE)
    @JvmName("lightAngularDistanceProperty")
    set(`value`) {
      setParam(Light3D.Param.PARAM_SIZE, value)
    }

  /**
   * If `true`, the light's effect is reversed, darkening areas and casting bright shadows.
   */
  public final inline var lightNegative: Boolean
    @JvmName("lightNegativeProperty")
    get() = isNegative()
    @JvmName("lightNegativeProperty")
    set(`value`) {
      setNegative(value)
    }

  /**
   * The intensity of the specular blob in objects affected by the light. At `0`, the light becomes
   * a pure diffuse light. When not baking emission, this can be used to avoid unrealistic reflections
   * when placing lights above an emissive surface.
   */
  public final inline var lightSpecular: Float
    @JvmName("lightSpecularProperty")
    get() = getParam(Light3D.Param.PARAM_SPECULAR)
    @JvmName("lightSpecularProperty")
    set(`value`) {
      setParam(Light3D.Param.PARAM_SPECULAR, value)
    }

  /**
   * The light's bake mode. This will affect the global illumination techniques that have an effect
   * on the light's rendering. See [BakeMode].
   * **Note:** Meshes' global illumination mode will also affect the global illumination rendering.
   * See [GeometryInstance3D.giMode].
   */
  public final inline var lightBakeMode: BakeMode
    @JvmName("lightBakeModeProperty")
    get() = getBakeMode()
    @JvmName("lightBakeModeProperty")
    set(`value`) {
      setBakeMode(value)
    }

  /**
   * The light will affect objects in the selected layers.
   */
  public final inline var lightCullMask: Long
    @JvmName("lightCullMaskProperty")
    get() = getCullMask()
    @JvmName("lightCullMaskProperty")
    set(`value`) {
      setCullMask(value)
    }

  /**
   * If `true`, the light will cast real-time shadows. This has a significant performance cost. Only
   * enable shadow rendering when it makes a noticeable difference in the scene's appearance, and
   * consider using [distanceFadeEnabled] to hide the light when far away from the [Camera3D].
   */
  public final inline var shadowEnabled: Boolean
    @JvmName("shadowEnabledProperty")
    get() = hasShadow()
    @JvmName("shadowEnabledProperty")
    set(`value`) {
      setShadow(value)
    }

  /**
   * Used to adjust shadow appearance. Too small a value results in self-shadowing ("shadow acne"),
   * while too large a value causes shadows to separate from casters ("peter-panning"). Adjust as
   * needed.
   */
  public final inline var shadowBias: Float
    @JvmName("shadowBiasProperty")
    get() = getParam(Light3D.Param.PARAM_SHADOW_BIAS)
    @JvmName("shadowBiasProperty")
    set(`value`) {
      setParam(Light3D.Param.PARAM_SHADOW_BIAS, value)
    }

  /**
   * Offsets the lookup into the shadow map by the object's normal. This can be used to reduce
   * self-shadowing artifacts without using [shadowBias]. In practice, this value should be tweaked
   * along with [shadowBias] to reduce artifacts as much as possible.
   */
  public final inline var shadowNormalBias: Float
    @JvmName("shadowNormalBiasProperty")
    get() = getParam(Light3D.Param.PARAM_SHADOW_NORMAL_BIAS)
    @JvmName("shadowNormalBiasProperty")
    set(`value`) {
      setParam(Light3D.Param.PARAM_SHADOW_NORMAL_BIAS, value)
    }

  /**
   * If `true`, reverses the backface culling of the mesh. This can be useful when you have a flat
   * mesh that has a light behind it. If you need to cast a shadow on both sides of the mesh, set the
   * mesh to use double-sided shadows with [GeometryInstance3D.SHADOW_CASTING_SETTING_DOUBLE_SIDED].
   */
  public final inline var shadowReverseCullFace: Boolean
    @JvmName("shadowReverseCullFaceProperty")
    get() = getShadowReverseCullFace()
    @JvmName("shadowReverseCullFaceProperty")
    set(`value`) {
      setShadowReverseCullFace(value)
    }

  public final inline var shadowTransmittanceBias: Float
    @JvmName("shadowTransmittanceBiasProperty")
    get() = getParam(Light3D.Param.PARAM_TRANSMITTANCE_BIAS)
    @JvmName("shadowTransmittanceBiasProperty")
    set(`value`) {
      setParam(Light3D.Param.PARAM_TRANSMITTANCE_BIAS, value)
    }

  /**
   * The opacity to use when rendering the light's shadow map. Values lower than `1.0` make the
   * light appear through shadows. This can be used to fake global illumination at a low performance
   * cost.
   */
  public final inline var shadowOpacity: Float
    @JvmName("shadowOpacityProperty")
    get() = getParam(Light3D.Param.PARAM_SHADOW_OPACITY)
    @JvmName("shadowOpacityProperty")
    set(`value`) {
      setParam(Light3D.Param.PARAM_SHADOW_OPACITY, value)
    }

  /**
   * Blurs the edges of the shadow. Can be used to hide pixel artifacts in low-resolution shadow
   * maps. A high value can impact performance, make shadows appear grainy and can cause other unwanted
   * artifacts. Try to keep as near default as possible.
   */
  public final inline var shadowBlur: Float
    @JvmName("shadowBlurProperty")
    get() = getParam(Light3D.Param.PARAM_SHADOW_BLUR)
    @JvmName("shadowBlurProperty")
    set(`value`) {
      setParam(Light3D.Param.PARAM_SHADOW_BLUR, value)
    }

  /**
   * If `true`, the light will smoothly fade away when far from the active [Camera3D] starting at
   * [distanceFadeBegin]. This acts as a form of level of detail (LOD). The light will fade out over
   * [distanceFadeBegin] + [distanceFadeLength], after which it will be culled and not sent to the
   * shader at all. Use this to reduce the number of active lights in a scene and thus improve
   * performance.
   * **Note:** Only effective for [OmniLight3D] and [SpotLight3D].
   */
  public final inline var distanceFadeEnabled: Boolean
    @JvmName("distanceFadeEnabledProperty")
    get() = isDistanceFadeEnabled()
    @JvmName("distanceFadeEnabledProperty")
    set(`value`) {
      setEnableDistanceFade(value)
    }

  /**
   * The distance from the camera at which the light begins to fade away (in 3D units).
   * **Note:** Only effective for [OmniLight3D] and [SpotLight3D].
   */
  public final inline var distanceFadeBegin: Float
    @JvmName("distanceFadeBeginProperty")
    get() = getDistanceFadeBegin()
    @JvmName("distanceFadeBeginProperty")
    set(`value`) {
      setDistanceFadeBegin(value)
    }

  /**
   * The distance from the camera at which the light's shadow cuts off (in 3D units). Set this to a
   * value lower than [distanceFadeBegin] + [distanceFadeLength] to further improve performance, as
   * shadow rendering is often more expensive than light rendering itself.
   * **Note:** Only effective for [OmniLight3D] and [SpotLight3D], and only when [shadowEnabled] is
   * `true`.
   */
  public final inline var distanceFadeShadow: Float
    @JvmName("distanceFadeShadowProperty")
    get() = getDistanceFadeShadow()
    @JvmName("distanceFadeShadowProperty")
    set(`value`) {
      setDistanceFadeShadow(value)
    }

  /**
   * Distance over which the light and its shadow fades. The light's energy and shadow's opacity is
   * progressively reduced over this distance and is completely invisible at the end.
   * **Note:** Only effective for [OmniLight3D] and [SpotLight3D].
   */
  public final inline var distanceFadeLength: Float
    @JvmName("distanceFadeLengthProperty")
    get() = getDistanceFadeLength()
    @JvmName("distanceFadeLengthProperty")
    set(`value`) {
      setDistanceFadeLength(value)
    }

  /**
   * If `true`, the light only appears in the editor and will not be visible at runtime. If `true`,
   * the light will never be baked in [LightmapGI] regardless of its [lightBakeMode].
   */
  public final inline var editorOnly: Boolean
    @JvmName("editorOnlyProperty")
    get() = isEditorOnly()
    @JvmName("editorOnlyProperty")
    set(`value`) {
      setEditorOnly(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_LIGHT3D, scriptIndex)
  }

  /**
   * The light's color. An *overbright* color can be used to achieve a result equivalent to
   * increasing the light's [lightEnergy].
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = light3d.lightColor
   * //Your changes
   * light3d.lightColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun lightColorMutate(block: Color.() -> Unit): Color = lightColor.apply{
      block(this)
      lightColor = this
  }


  public final fun setEditorOnly(editorOnly: Boolean): Unit {
    TransferContext.writeArguments(BOOL to editorOnly)
    TransferContext.callMethod(ptr, MethodBindings.setEditorOnlyPtr, NIL)
  }

  public final fun isEditorOnly(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEditorOnlyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the value of the specified [Light3D.Param] parameter.
   */
  public final fun setParam(`param`: Param, `value`: Float): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setParamPtr, NIL)
  }

  /**
   * Returns the value of the specified [Light3D.Param] parameter.
   */
  public final fun getParam(`param`: Param): Float {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(ptr, MethodBindings.getParamPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setShadow(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setShadowPtr, NIL)
  }

  public final fun hasShadow(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasShadowPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setNegative(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setNegativePtr, NIL)
  }

  public final fun isNegative(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isNegativePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCullMask(cullMask: Long): Unit {
    TransferContext.writeArguments(LONG to cullMask)
    TransferContext.callMethod(ptr, MethodBindings.setCullMaskPtr, NIL)
  }

  public final fun getCullMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCullMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setEnableDistanceFade(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setEnableDistanceFadePtr, NIL)
  }

  public final fun isDistanceFadeEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDistanceFadeEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDistanceFadeBegin(distance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to distance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDistanceFadeBeginPtr, NIL)
  }

  public final fun getDistanceFadeBegin(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDistanceFadeBeginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDistanceFadeShadow(distance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to distance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDistanceFadeShadowPtr, NIL)
  }

  public final fun getDistanceFadeShadow(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDistanceFadeShadowPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDistanceFadeLength(distance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to distance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDistanceFadeLengthPtr, NIL)
  }

  public final fun getDistanceFadeLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDistanceFadeLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setColorPtr, NIL)
  }

  public final fun getColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setShadowReverseCullFace(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setShadowReverseCullFacePtr, NIL)
  }

  public final fun getShadowReverseCullFace(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getShadowReverseCullFacePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setBakeMode(bakeMode: BakeMode): Unit {
    TransferContext.writeArguments(LONG to bakeMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setBakeModePtr, NIL)
  }

  public final fun getBakeMode(): BakeMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBakeModePtr, LONG)
    return Light3D.BakeMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setProjector(projector: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to projector)
    TransferContext.callMethod(ptr, MethodBindings.setProjectorPtr, NIL)
  }

  public final fun getProjector(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProjectorPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setTemperature(temperature: Float): Unit {
    TransferContext.writeArguments(DOUBLE to temperature.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTemperaturePtr, NIL)
  }

  public final fun getTemperature(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTemperaturePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the [Color] of an idealized blackbody at the given [lightTemperature]. This value is
   * calculated internally based on the [lightTemperature]. This [Color] is multiplied by [lightColor]
   * before being sent to the [RenderingServer].
   */
  public final fun getCorrelatedColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCorrelatedColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public enum class Param(
    id: Long,
  ) {
    /**
     * Constant for accessing [lightEnergy].
     */
    PARAM_ENERGY(0),
    /**
     * Constant for accessing [lightIndirectEnergy].
     */
    PARAM_INDIRECT_ENERGY(1),
    /**
     * Constant for accessing [lightVolumetricFogEnergy].
     */
    PARAM_VOLUMETRIC_FOG_ENERGY(2),
    /**
     * Constant for accessing [lightSpecular].
     */
    PARAM_SPECULAR(3),
    /**
     * Constant for accessing [OmniLight3D.omniRange] or [SpotLight3D.spotRange].
     */
    PARAM_RANGE(4),
    /**
     * Constant for accessing [lightSize].
     */
    PARAM_SIZE(5),
    /**
     * Constant for accessing [OmniLight3D.omniAttenuation] or [SpotLight3D.spotAttenuation].
     */
    PARAM_ATTENUATION(6),
    /**
     * Constant for accessing [SpotLight3D.spotAngle].
     */
    PARAM_SPOT_ANGLE(7),
    /**
     * Constant for accessing [SpotLight3D.spotAngleAttenuation].
     */
    PARAM_SPOT_ATTENUATION(8),
    /**
     * Constant for accessing [DirectionalLight3D.directionalShadowMaxDistance].
     */
    PARAM_SHADOW_MAX_DISTANCE(9),
    /**
     * Constant for accessing [DirectionalLight3D.directionalShadowSplit1].
     */
    PARAM_SHADOW_SPLIT_1_OFFSET(10),
    /**
     * Constant for accessing [DirectionalLight3D.directionalShadowSplit2].
     */
    PARAM_SHADOW_SPLIT_2_OFFSET(11),
    /**
     * Constant for accessing [DirectionalLight3D.directionalShadowSplit3].
     */
    PARAM_SHADOW_SPLIT_3_OFFSET(12),
    /**
     * Constant for accessing [DirectionalLight3D.directionalShadowFadeStart].
     */
    PARAM_SHADOW_FADE_START(13),
    /**
     * Constant for accessing [shadowNormalBias].
     */
    PARAM_SHADOW_NORMAL_BIAS(14),
    /**
     * Constant for accessing [shadowBias].
     */
    PARAM_SHADOW_BIAS(15),
    /**
     * Constant for accessing [DirectionalLight3D.directionalShadowPancakeSize].
     */
    PARAM_SHADOW_PANCAKE_SIZE(16),
    /**
     * Constant for accessing [shadowOpacity].
     */
    PARAM_SHADOW_OPACITY(17),
    /**
     * Constant for accessing [shadowBlur].
     */
    PARAM_SHADOW_BLUR(18),
    /**
     * Constant for accessing [shadowTransmittanceBias].
     */
    PARAM_TRANSMITTANCE_BIAS(19),
    /**
     * Constant for accessing [lightIntensityLumens] and [lightIntensityLux]. Only used when
     * [ProjectSettings.rendering/lightsAndShadows/usePhysicalLightUnits] is `true`.
     */
    PARAM_INTENSITY(20),
    /**
     * Represents the size of the [Param] enum.
     */
    PARAM_MAX(21),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Param = entries.single { it.id == `value` }
    }
  }

  public enum class BakeMode(
    id: Long,
  ) {
    /**
     * Light is ignored when baking. This is the fastest mode, but the light will be taken into
     * account when baking global illumination. This mode should generally be used for dynamic lights
     * that change quickly, as the effect of global illumination is less noticeable on those lights.
     * **Note:** Hiding a light does *not* affect baking [LightmapGI]. Hiding a light will still
     * affect baking [VoxelGI] and SDFGI (see [Environment.sdfgiEnabled]).
     */
    BAKE_DISABLED(0),
    /**
     * Light is taken into account in static baking ([VoxelGI], [LightmapGI], SDFGI
     * ([Environment.sdfgiEnabled])). The light can be moved around or modified, but its global
     * illumination will not update in real-time. This is suitable for subtle changes (such as
     * flickering torches), but generally not large changes such as toggling a light on and off.
     * **Note:** The light is not baked in [LightmapGI] if [editorOnly] is `true`.
     */
    BAKE_STATIC(1),
    /**
     * Light is taken into account in dynamic baking ([VoxelGI] and SDFGI
     * ([Environment.sdfgiEnabled]) only). The light can be moved around or modified with global
     * illumination updating in real-time. The light's global illumination appearance will be slightly
     * different compared to [BAKE_STATIC]. This has a greater performance cost compared to
     * [BAKE_STATIC]. When using SDFGI, the update speed of dynamic lights is affected by
     * [ProjectSettings.rendering/globalIllumination/sdfgi/framesToUpdateLights].
     */
    BAKE_DYNAMIC(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BakeMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setEditorOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_editor_only", 2586408642)

    public val isEditorOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "is_editor_only", 36873697)

    public val setParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_param", 1722734213)

    public val getParamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "get_param", 1844084987)

    public val setShadowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_shadow", 2586408642)

    public val hasShadowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "has_shadow", 36873697)

    public val setNegativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_negative", 2586408642)

    public val isNegativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "is_negative", 36873697)

    public val setCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_cull_mask", 1286410249)

    public val getCullMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "get_cull_mask", 3905245786)

    public val setEnableDistanceFadePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_enable_distance_fade", 2586408642)

    public val isDistanceFadeEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "is_distance_fade_enabled", 36873697)

    public val setDistanceFadeBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_distance_fade_begin", 373806689)

    public val getDistanceFadeBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "get_distance_fade_begin", 1740695150)

    public val setDistanceFadeShadowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_distance_fade_shadow", 373806689)

    public val getDistanceFadeShadowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "get_distance_fade_shadow", 1740695150)

    public val setDistanceFadeLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_distance_fade_length", 373806689)

    public val getDistanceFadeLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "get_distance_fade_length", 1740695150)

    public val setColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_color", 2920490490)

    public val getColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "get_color", 3444240500)

    public val setShadowReverseCullFacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_shadow_reverse_cull_face", 2586408642)

    public val getShadowReverseCullFacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "get_shadow_reverse_cull_face", 36873697)

    public val setBakeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_bake_mode", 37739303)

    public val getBakeModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "get_bake_mode", 371737608)

    public val setProjectorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_projector", 4051416890)

    public val getProjectorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "get_projector", 3635182373)

    public val setTemperaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "set_temperature", 373806689)

    public val getTemperaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "get_temperature", 1740695150)

    public val getCorrelatedColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Light3D", "get_correlated_color", 3444240500)
  }
}

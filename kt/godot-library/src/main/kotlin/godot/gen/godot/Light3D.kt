// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Provides a base class for different kinds of light nodes.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * Light3D is the *abstract* base class for light nodes. As it can't be instantiated, it shouldn't be used directly. Other types of light nodes inherit from it. Light3D contains the common variables and parameters used for lighting.
 */
@GodotBaseType
public open class Light3D internal constructor() : VisualInstance3D() {
  /**
   * Used by positional lights ([godot.OmniLight3D] and [godot.SpotLight3D]) when [godot.ProjectSettings.rendering/lightsAndShadows/usePhysicalLightUnits] is `true`. Sets the intensity of the light source measured in Lumens. Lumens are a measure of luminous flux, which is the total amount of visible light emitted by a light source per unit of time.
   *
   * For [godot.SpotLight3D]s, we assume that the area outside the visible cone is surrounded by a perfect light absorbing material. Accordingly, the apparent brightness of the cone area does not change as the cone increases and decreases in size.
   *
   * A typical household lightbulb can range from around 600 lumens to 1,200 lumens, a candle is about 13 lumens, while a streetlight can be approximately 60,000 lumens.
   */
  public var lightIntensityLumens: Float
    get() {
      TransferContext.writeArguments(LONG to 20)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_PARAM, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 20, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_PARAM, NIL)
    }

  /**
   * Used by [godot.DirectionalLight3D]s when [godot.ProjectSettings.rendering/lightsAndShadows/usePhysicalLightUnits] is `true`. Sets the intensity of the light source measured in Lux. Lux is a measure of luminous flux per unit area, it is equal to one lumen per square meter. Lux is the measure of how much light hits a surface at a given time.
   *
   * On a clear sunny day a surface in direct sunlight may be approximately 100,000 lux, a typical room in a home may be approximately 50 lux, while the moonlit ground may be approximately 0.1 lux.
   */
  public var lightIntensityLux: Float
    get() {
      TransferContext.writeArguments(LONG to 20)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_PARAM, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 20, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_PARAM, NIL)
    }

  /**
   * Sets the color temperature of the light source, measured in Kelvin. This is used to calculate a correlated color temperature which tints the [lightColor].
   *
   * The sun on a cloudy day is approximately 6500 Kelvin, on a clear day it is between 5500 to 6000 Kelvin, and on a clear day at sunrise or sunset it ranges to around 1850 Kelvin.
   */
  public var lightTemperature: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_TEMPERATURE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_TEMPERATURE, NIL)
    }

  /**
   * The light's color. An *overbright* color can be used to achieve a result equivalent to increasing the light's [lightEnergy].
   */
  @CoreTypeLocalCopy
  public var lightColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_COLOR, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_COLOR, NIL)
    }

  /**
   * The light's strength multiplier (this is not a physical unit). For [godot.OmniLight3D] and [godot.SpotLight3D], changing this value will only change the light color's intensity, not the light's radius.
   */
  public var lightEnergy: Float
    get() {
      TransferContext.writeArguments(LONG to 0)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_PARAM, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_PARAM, NIL)
    }

  /**
   * Secondary multiplier used with indirect light (light bounces). Used with [godot.VoxelGI] and SDFGI (see [godot.Environment.sdfgiEnabled]).
   *
   * **Note:** This property is ignored if [lightEnergy] is equal to `0.0`, as the light won't be present at all in the GI shader.
   */
  public var lightIndirectEnergy: Float
    get() {
      TransferContext.writeArguments(LONG to 1)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_PARAM, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_PARAM, NIL)
    }

  /**
   * Secondary multiplier multiplied with [lightEnergy] then used with the [godot.Environment]'s volumetric fog (if enabled). If set to `0.0`, computing volumetric fog will be skipped for this light, which can improve performance for large amounts of lights when volumetric fog is enabled.
   *
   * **Note:** To prevent short-lived dynamic light effects from poorly interacting with volumetric fog, lights used in those effects should have [lightVolumetricFogEnergy] set to `0.0` unless [godot.Environment.volumetricFogTemporalReprojectionEnabled] is disabled (or unless the reprojection amount is significantly lowered).
   */
  public var lightVolumetricFogEnergy: Float
    get() {
      TransferContext.writeArguments(LONG to 2)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_PARAM, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_PARAM, NIL)
    }

  /**
   * [godot.Texture2D] projected by light. [shadowEnabled] must be on for the projector to work. Light projectors make the light appear as if it is shining through a colored but transparent object, almost like light shining through stained-glass.
   *
   * **Note:** Unlike [godot.BaseMaterial3D] whose filter mode can be adjusted on a per-material basis, the filter mode for light projector textures is set globally with [godot.ProjectSettings.rendering/textures/lightProjectors/filter].
   *
   * **Note:** Light projector textures are only supported in the Forward+ and Mobile rendering methods, not Compatibility.
   */
  public var lightProjector: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_PROJECTOR, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_PROJECTOR, NIL)
    }

  /**
   * The size of the light in Godot units. Only available for [godot.OmniLight3D]s and [godot.SpotLight3D]s. Increasing this value will make the light fade out slower and shadows appear blurrier (also called percentage-closer soft shadows, or PCSS). This can be used to simulate area lights to an extent. Increasing this value above `0.0` for lights with shadows enabled will have a noticeable performance cost due to PCSS.
   *
   * **Note:** [lightSize] is not affected by [godot.Node3D.scale] (the light's scale or its parent's scale).
   *
   * **Note:** PCSS for positional lights is only supported in the Forward+ and Mobile rendering methods, not Compatibility.
   */
  public var lightSize: Float
    get() {
      TransferContext.writeArguments(LONG to 5)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_PARAM, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_PARAM, NIL)
    }

  /**
   * The light's angular size in degrees. Increasing this will make shadows softer at greater distances (also called percentage-closer soft shadows, or PCSS). Only available for [godot.DirectionalLight3D]s. For reference, the Sun from the Earth is approximately `0.5`. Increasing this value above `0.0` for lights with shadows enabled will have a noticeable performance cost due to PCSS.
   *
   * **Note:** [lightAngularDistance] is not affected by [godot.Node3D.scale] (the light's scale or its parent's scale).
   *
   * **Note:** PCSS for directional lights is only supported in the Forward+ rendering method, not Mobile or Compatibility.
   */
  public var lightAngularDistance: Float
    get() {
      TransferContext.writeArguments(LONG to 5)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_PARAM, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_PARAM, NIL)
    }

  /**
   * If `true`, the light's effect is reversed, darkening areas and casting bright shadows.
   */
  public var lightNegative: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_IS_NEGATIVE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_NEGATIVE, NIL)
    }

  /**
   * The intensity of the specular blob in objects affected by the light. At `0`, the light becomes a pure diffuse light. When not baking emission, this can be used to avoid unrealistic reflections when placing lights above an emissive surface.
   */
  public var lightSpecular: Float
    get() {
      TransferContext.writeArguments(LONG to 3)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_PARAM, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_PARAM, NIL)
    }

  /**
   * The light's bake mode. This will affect the global illumination techniques that have an effect on the light's rendering. See [enum BakeMode].
   *
   * **Note:** Meshes' global illumination mode will also affect the global illumination rendering. See [godot.GeometryInstance3D.giMode].
   */
  public var lightBakeMode: BakeMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_BAKE_MODE, LONG)
      return Light3D.BakeMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_BAKE_MODE, NIL)
    }

  /**
   * The light will affect objects in the selected layers.
   */
  public var lightCullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_CULL_MASK, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_CULL_MASK, NIL)
    }

  /**
   * If `true`, the light will cast real-time shadows. This has a significant performance cost. Only enable shadow rendering when it makes a noticeable difference in the scene's appearance, and consider using [distanceFadeEnabled] to hide the light when far away from the [godot.Camera3D].
   */
  public var shadowEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_HAS_SHADOW, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_SHADOW, NIL)
    }

  /**
   * Used to adjust shadow appearance. Too small a value results in self-shadowing ("shadow acne"), while too large a value causes shadows to separate from casters ("peter-panning"). Adjust as needed.
   */
  public var shadowBias: Float
    get() {
      TransferContext.writeArguments(LONG to 15)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_PARAM, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 15, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_PARAM, NIL)
    }

  /**
   * Offsets the lookup into the shadow map by the object's normal. This can be used to reduce self-shadowing artifacts without using [shadowBias]. In practice, this value should be tweaked along with [shadowBias] to reduce artifacts as much as possible.
   */
  public var shadowNormalBias: Float
    get() {
      TransferContext.writeArguments(LONG to 14)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_PARAM, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 14, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_PARAM, NIL)
    }

  /**
   * If `true`, reverses the backface culling of the mesh. This can be useful when you have a flat mesh that has a light behind it. If you need to cast a shadow on both sides of the mesh, set the mesh to use double-sided shadows with [godot.GeometryInstance3D.SHADOW_CASTING_SETTING_DOUBLE_SIDED].
   */
  public var shadowReverseCullFace: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_SHADOW_REVERSE_CULL_FACE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_SHADOW_REVERSE_CULL_FACE, NIL)
    }

  /**
   *
   */
  public var shadowTransmittanceBias: Float
    get() {
      TransferContext.writeArguments(LONG to 19)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_PARAM, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 19, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_PARAM, NIL)
    }

  /**
   * The opacity to use when rendering the light's shadow map. Values lower than `1.0` make the light appear through shadows. This can be used to fake global illumination at a low performance cost.
   */
  public var shadowOpacity: Float
    get() {
      TransferContext.writeArguments(LONG to 17)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_PARAM, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 17, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_PARAM, NIL)
    }

  /**
   * Blurs the edges of the shadow. Can be used to hide pixel artifacts in low-resolution shadow maps. A high value can impact performance, make shadows appear grainy and can cause other unwanted artifacts. Try to keep as near default as possible.
   */
  public var shadowBlur: Float
    get() {
      TransferContext.writeArguments(LONG to 18)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_PARAM, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 18, DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_PARAM, NIL)
    }

  /**
   * If `true`, the light will smoothly fade away when far from the active [godot.Camera3D] starting at [distanceFadeBegin]. This acts as a form of level of detail (LOD). The light will fade out over [distanceFadeBegin] + [distanceFadeLength], after which it will be culled and not sent to the shader at all. Use this to reduce the number of active lights in a scene and thus improve performance.
   *
   * **Note:** Only effective for [godot.OmniLight3D] and [godot.SpotLight3D].
   */
  public var distanceFadeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_IS_DISTANCE_FADE_ENABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_ENABLE_DISTANCE_FADE,
          NIL)
    }

  /**
   * The distance from the camera at which the light begins to fade away (in 3D units).
   *
   * **Note:** Only effective for [godot.OmniLight3D] and [godot.SpotLight3D].
   */
  public var distanceFadeBegin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_DISTANCE_FADE_BEGIN,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_DISTANCE_FADE_BEGIN,
          NIL)
    }

  /**
   * The distance from the camera at which the light's shadow cuts off (in 3D units). Set this to a value lower than [distanceFadeBegin] + [distanceFadeLength] to further improve performance, as shadow rendering is often more expensive than light rendering itself.
   *
   * **Note:** Only effective for [godot.OmniLight3D] and [godot.SpotLight3D], and only when [shadowEnabled] is `true`.
   */
  public var distanceFadeShadow: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_DISTANCE_FADE_SHADOW,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_DISTANCE_FADE_SHADOW,
          NIL)
    }

  /**
   * Distance over which the light and its shadow fades. The light's energy and shadow's opacity is progressively reduced over this distance and is completely invisible at the end.
   *
   * **Note:** Only effective for [godot.OmniLight3D] and [godot.SpotLight3D].
   */
  public var distanceFadeLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_DISTANCE_FADE_LENGTH,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_DISTANCE_FADE_LENGTH,
          NIL)
    }

  /**
   * If `true`, the light only appears in the editor and will not be visible at runtime.
   */
  public var editorOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_IS_EDITOR_ONLY, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_EDITOR_ONLY, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_LIGHT3D, scriptIndex)
    return true
  }

  /**
   * The light's color. An *overbright* color can be used to achieve a result equivalent to increasing the light's [lightEnergy].
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
  public open fun lightColorMutate(block: Color.() -> Unit): Color = lightColor.apply{
      block(this)
      lightColor = this
  }


  /**
   * Returns the [godot.core.Color] of an idealized blackbody at the given [lightTemperature]. This value is calculated internally based on the [lightTemperature]. This [godot.core.Color] is multiplied by [lightColor] before being sent to the [godot.RenderingServer].
   */
  public fun getCorrelatedColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_CORRELATED_COLOR, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
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
     * Constant for accessing [godot.OmniLight3D.omniRange] or [godot.SpotLight3D.spotRange].
     */
    PARAM_RANGE(4),
    /**
     * Constant for accessing [lightSize].
     */
    PARAM_SIZE(5),
    /**
     * Constant for accessing [godot.OmniLight3D.omniAttenuation] or [godot.SpotLight3D.spotAttenuation].
     */
    PARAM_ATTENUATION(6),
    /**
     * Constant for accessing [godot.SpotLight3D.spotAngle].
     */
    PARAM_SPOT_ANGLE(7),
    /**
     * Constant for accessing [godot.SpotLight3D.spotAngleAttenuation].
     */
    PARAM_SPOT_ATTENUATION(8),
    /**
     * Constant for accessing [godot.DirectionalLight3D.directionalShadowMaxDistance].
     */
    PARAM_SHADOW_MAX_DISTANCE(9),
    /**
     * Constant for accessing [godot.DirectionalLight3D.directionalShadowSplit1].
     */
    PARAM_SHADOW_SPLIT_1_OFFSET(10),
    /**
     * Constant for accessing [godot.DirectionalLight3D.directionalShadowSplit2].
     */
    PARAM_SHADOW_SPLIT_2_OFFSET(11),
    /**
     * Constant for accessing [godot.DirectionalLight3D.directionalShadowSplit3].
     */
    PARAM_SHADOW_SPLIT_3_OFFSET(12),
    /**
     * Constant for accessing [godot.DirectionalLight3D.directionalShadowFadeStart].
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
     * Constant for accessing [godot.DirectionalLight3D.directionalShadowPancakeSize].
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
     * Constant for accessing [lightIntensityLumens] and [lightIntensityLux]. Only used when [godot.ProjectSettings.rendering/lightsAndShadows/usePhysicalLightUnits] is `true`.
     */
    PARAM_INTENSITY(20),
    /**
     * Represents the size of the [enum Param] enum.
     */
    PARAM_MAX(21),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class BakeMode(
    id: Long,
  ) {
    /**
     * Light is ignored when baking. This is the fastest mode, but the light will be taken into account when baking global illumination. This mode should generally be used for dynamic lights that change quickly, as the effect of global illumination is less noticeable on those lights.
     *
     * **Note:** Hiding a light does *not* affect baking [godot.LightmapGI]. Hiding a light will still affect baking [godot.VoxelGI] and SDFGI (see [member Environment.sdfgi_enabled).
     */
    BAKE_DISABLED(0),
    /**
     * Light is taken into account in static baking ([godot.VoxelGI], [godot.LightmapGI], SDFGI ([godot.Environment.sdfgiEnabled])). The light can be moved around or modified, but its global illumination will not update in real-time. This is suitable for subtle changes (such as flickering torches), but generally not large changes such as toggling a light on and off.
     */
    BAKE_STATIC(1),
    /**
     * Light is taken into account in dynamic baking ([godot.VoxelGI] and SDFGI ([godot.Environment.sdfgiEnabled]) only). The light can be moved around or modified with global illumination updating in real-time. The light's global illumination appearance will be slightly different compared to [BAKE_STATIC]. This has a greater performance cost compared to [BAKE_STATIC]. When using SDFGI, the update speed of dynamic lights is affected by [godot.ProjectSettings.rendering/globalIllumination/sdfgi/framesToUpdateLights].
     */
    BAKE_DYNAMIC(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}

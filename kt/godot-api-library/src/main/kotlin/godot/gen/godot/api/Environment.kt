// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Resource for environment nodes (like [WorldEnvironment]) that define multiple environment
 * operations (such as background [Sky] or [Color], ambient light, fog, depth-of-field...). These
 * parameters affect the final render of the scene. The order of these operations is:
 * - Depth of Field Blur
 * - Glow
 * - Tonemap (Auto Exposure)
 * - Adjustments
 */
@GodotBaseType
public open class Environment : Resource() {
  /**
   * The background mode. See [BGMode] for possible values.
   */
  public final inline var backgroundMode: BGMode
    @JvmName("backgroundModeProperty")
    get() = getBackground()
    @JvmName("backgroundModeProperty")
    set(`value`) {
      setBackground(value)
    }

  /**
   * The [Color] displayed for clear areas of the scene. Only effective when using the [BG_COLOR]
   * background mode.
   */
  @CoreTypeLocalCopy
  public final inline var backgroundColor: Color
    @JvmName("backgroundColorProperty")
    get() = getBgColor()
    @JvmName("backgroundColorProperty")
    set(`value`) {
      setBgColor(value)
    }

  /**
   * Multiplier for background energy. Increase to make background brighter, decrease to make
   * background dimmer.
   */
  public final inline var backgroundEnergyMultiplier: Float
    @JvmName("backgroundEnergyMultiplierProperty")
    get() = getBgEnergyMultiplier()
    @JvmName("backgroundEnergyMultiplierProperty")
    set(`value`) {
      setBgEnergyMultiplier(value)
    }

  /**
   * Luminance of background measured in nits (candela per square meter). Only used when
   * [ProjectSettings.rendering/lightsAndShadows/usePhysicalLightUnits] is enabled. The default value
   * is roughly equivalent to the sky at midday.
   */
  public final inline var backgroundIntensity: Float
    @JvmName("backgroundIntensityProperty")
    get() = getBgIntensity()
    @JvmName("backgroundIntensityProperty")
    set(`value`) {
      setBgIntensity(value)
    }

  /**
   * The maximum layer ID to display. Only effective when using the [BG_CANVAS] background mode.
   */
  public final inline var backgroundCanvasMaxLayer: Int
    @JvmName("backgroundCanvasMaxLayerProperty")
    get() = getCanvasMaxLayer()
    @JvmName("backgroundCanvasMaxLayerProperty")
    set(`value`) {
      setCanvasMaxLayer(value)
    }

  /**
   * The ID of the camera feed to show in the background.
   */
  public final inline var backgroundCameraFeedId: Int
    @JvmName("backgroundCameraFeedIdProperty")
    get() = getCameraFeedId()
    @JvmName("backgroundCameraFeedIdProperty")
    set(`value`) {
      setCameraFeedId(value)
    }

  /**
   * The [Sky] resource used for this [Environment].
   */
  public final inline var sky: Sky?
    @JvmName("skyProperty")
    get() = getSky()
    @JvmName("skyProperty")
    set(`value`) {
      setSky(value)
    }

  /**
   * If set to a value greater than `0.0`, overrides the field of view to use for sky rendering. If
   * set to `0.0`, the same FOV as the current [Camera3D] is used for sky rendering.
   */
  public final inline var skyCustomFov: Float
    @JvmName("skyCustomFovProperty")
    get() = getSkyCustomFov()
    @JvmName("skyCustomFovProperty")
    set(`value`) {
      setSkyCustomFov(value)
    }

  /**
   * The rotation to use for sky rendering.
   */
  @CoreTypeLocalCopy
  public final inline var skyRotation: Vector3
    @JvmName("skyRotationProperty")
    get() = getSkyRotation()
    @JvmName("skyRotationProperty")
    set(`value`) {
      setSkyRotation(value)
    }

  /**
   * The ambient light source to use for rendering materials and global illumination.
   */
  public final inline var ambientLightSource: AmbientSource
    @JvmName("ambientLightSourceProperty")
    get() = getAmbientSource()
    @JvmName("ambientLightSourceProperty")
    set(`value`) {
      setAmbientSource(value)
    }

  /**
   * The ambient light's [Color]. Only effective if [ambientLightSkyContribution] is lower than
   * `1.0` (exclusive).
   */
  @CoreTypeLocalCopy
  public final inline var ambientLightColor: Color
    @JvmName("ambientLightColorProperty")
    get() = getAmbientLightColor()
    @JvmName("ambientLightColorProperty")
    set(`value`) {
      setAmbientLightColor(value)
    }

  /**
   * Defines the amount of light that the sky brings on the scene. A value of `0.0` means that the
   * sky's light emission has no effect on the scene illumination, thus all ambient illumination is
   * provided by the ambient light. On the contrary, a value of `1.0` means that *all* the light that
   * affects the scene is provided by the sky, thus the ambient light parameter has no effect on the
   * scene.
   * **Note:** [ambientLightSkyContribution] is internally clamped between `0.0` and `1.0`
   * (inclusive).
   */
  public final inline var ambientLightSkyContribution: Float
    @JvmName("ambientLightSkyContributionProperty")
    get() = getAmbientLightSkyContribution()
    @JvmName("ambientLightSkyContributionProperty")
    set(`value`) {
      setAmbientLightSkyContribution(value)
    }

  /**
   * The ambient light's energy. The higher the value, the stronger the light. Only effective if
   * [ambientLightSkyContribution] is lower than `1.0` (exclusive).
   */
  public final inline var ambientLightEnergy: Float
    @JvmName("ambientLightEnergyProperty")
    get() = getAmbientLightEnergy()
    @JvmName("ambientLightEnergyProperty")
    set(`value`) {
      setAmbientLightEnergy(value)
    }

  /**
   * The reflected (specular) light source.
   */
  public final inline var reflectedLightSource: ReflectionSource
    @JvmName("reflectedLightSourceProperty")
    get() = getReflectionSource()
    @JvmName("reflectedLightSourceProperty")
    set(`value`) {
      setReflectionSource(value)
    }

  /**
   * The tonemapping mode to use. Tonemapping is the process that "converts" HDR values to be
   * suitable for rendering on an LDR display. (Godot doesn't support rendering on HDR displays yet.)
   */
  public final inline var tonemapMode: ToneMapper
    @JvmName("tonemapModeProperty")
    get() = getTonemapper()
    @JvmName("tonemapModeProperty")
    set(`value`) {
      setTonemapper(value)
    }

  /**
   * The default exposure used for tonemapping. Higher values result in a brighter image. See also
   * [tonemapWhite].
   */
  public final inline var tonemapExposure: Float
    @JvmName("tonemapExposureProperty")
    get() = getTonemapExposure()
    @JvmName("tonemapExposureProperty")
    set(`value`) {
      setTonemapExposure(value)
    }

  /**
   * The white reference value for tonemapping (also called "whitepoint"). Higher values can make
   * highlights look less blown out, and will also slightly darken the whole scene as a result. Only
   * effective if the [tonemapMode] isn't set to [TONE_MAPPER_LINEAR]. See also [tonemapExposure].
   */
  public final inline var tonemapWhite: Float
    @JvmName("tonemapWhiteProperty")
    get() = getTonemapWhite()
    @JvmName("tonemapWhiteProperty")
    set(`value`) {
      setTonemapWhite(value)
    }

  /**
   * If `true`, screen-space reflections are enabled. Screen-space reflections are more accurate
   * than reflections from [VoxelGI]s or [ReflectionProbe]s, but are slower and can't reflect surfaces
   * occluded by others.
   * **Note:** SSR is only supported in the Forward+ rendering method, not Mobile or Compatibility.
   */
  public final inline var ssrEnabled: Boolean
    @JvmName("ssrEnabledProperty")
    get() = isSsrEnabled()
    @JvmName("ssrEnabledProperty")
    set(`value`) {
      setSsrEnabled(value)
    }

  /**
   * The maximum number of steps for screen-space reflections. Higher values are slower.
   */
  public final inline var ssrMaxSteps: Int
    @JvmName("ssrMaxStepsProperty")
    get() = getSsrMaxSteps()
    @JvmName("ssrMaxStepsProperty")
    set(`value`) {
      setSsrMaxSteps(value)
    }

  /**
   * The fade-in distance for screen-space reflections. Affects the area from the reflected material
   * to the screen-space reflection. Only positive values are valid (negative values will be clamped to
   * `0.0`).
   */
  public final inline var ssrFadeIn: Float
    @JvmName("ssrFadeInProperty")
    get() = getSsrFadeIn()
    @JvmName("ssrFadeInProperty")
    set(`value`) {
      setSsrFadeIn(value)
    }

  /**
   * The fade-out distance for screen-space reflections. Affects the area from the screen-space
   * reflection to the "global" reflection. Only positive values are valid (negative values will be
   * clamped to `0.0`).
   */
  public final inline var ssrFadeOut: Float
    @JvmName("ssrFadeOutProperty")
    get() = getSsrFadeOut()
    @JvmName("ssrFadeOutProperty")
    set(`value`) {
      setSsrFadeOut(value)
    }

  /**
   * The depth tolerance for screen-space reflections.
   */
  public final inline var ssrDepthTolerance: Float
    @JvmName("ssrDepthToleranceProperty")
    get() = getSsrDepthTolerance()
    @JvmName("ssrDepthToleranceProperty")
    set(`value`) {
      setSsrDepthTolerance(value)
    }

  /**
   * If `true`, the screen-space ambient occlusion effect is enabled. This darkens objects' corners
   * and cavities to simulate ambient light not reaching the entire object as in real life. This works
   * well for small, dynamic objects, but baked lighting or ambient occlusion textures will do a better
   * job at displaying ambient occlusion on large static objects. Godot uses a form of SSAO called
   * Adaptive Screen Space Ambient Occlusion which is itself a form of Horizon Based Ambient Occlusion.
   * **Note:** SSAO is only supported in the Forward+ rendering method, not Mobile or Compatibility.
   */
  public final inline var ssaoEnabled: Boolean
    @JvmName("ssaoEnabledProperty")
    get() = isSsaoEnabled()
    @JvmName("ssaoEnabledProperty")
    set(`value`) {
      setSsaoEnabled(value)
    }

  /**
   * The distance at which objects can occlude each other when calculating screen-space ambient
   * occlusion. Higher values will result in occlusion over a greater distance at the cost of
   * performance and quality.
   */
  public final inline var ssaoRadius: Float
    @JvmName("ssaoRadiusProperty")
    get() = getSsaoRadius()
    @JvmName("ssaoRadiusProperty")
    set(`value`) {
      setSsaoRadius(value)
    }

  /**
   * The primary screen-space ambient occlusion intensity. Acts as a multiplier for the screen-space
   * ambient occlusion effect. A higher value results in darker occlusion.
   */
  public final inline var ssaoIntensity: Float
    @JvmName("ssaoIntensityProperty")
    get() = getSsaoIntensity()
    @JvmName("ssaoIntensityProperty")
    set(`value`) {
      setSsaoIntensity(value)
    }

  /**
   * The distribution of occlusion. A higher value results in darker occlusion, similar to
   * [ssaoIntensity], but with a sharper falloff.
   */
  public final inline var ssaoPower: Float
    @JvmName("ssaoPowerProperty")
    get() = getSsaoPower()
    @JvmName("ssaoPowerProperty")
    set(`value`) {
      setSsaoPower(value)
    }

  /**
   * Sets the strength of the additional level of detail for the screen-space ambient occlusion
   * effect. A high value makes the detail pass more prominent, but it may contribute to aliasing in
   * your final image.
   */
  public final inline var ssaoDetail: Float
    @JvmName("ssaoDetailProperty")
    get() = getSsaoDetail()
    @JvmName("ssaoDetailProperty")
    set(`value`) {
      setSsaoDetail(value)
    }

  /**
   * The threshold for considering whether a given point on a surface is occluded or not represented
   * as an angle from the horizon mapped into the `0.0-1.0` range. A value of `1.0` results in no
   * occlusion.
   */
  public final inline var ssaoHorizon: Float
    @JvmName("ssaoHorizonProperty")
    get() = getSsaoHorizon()
    @JvmName("ssaoHorizonProperty")
    set(`value`) {
      setSsaoHorizon(value)
    }

  /**
   * The amount that the screen-space ambient occlusion effect is allowed to blur over the edges of
   * objects. Setting too high will result in aliasing around the edges of objects. Setting too low
   * will make object edges appear blurry.
   */
  public final inline var ssaoSharpness: Float
    @JvmName("ssaoSharpnessProperty")
    get() = getSsaoSharpness()
    @JvmName("ssaoSharpnessProperty")
    set(`value`) {
      setSsaoSharpness(value)
    }

  /**
   * The screen-space ambient occlusion intensity in direct light. In real life, ambient occlusion
   * only applies to indirect light, which means its effects can't be seen in direct light. Values
   * higher than `0` will make the SSAO effect visible in direct light.
   */
  public final inline var ssaoLightAffect: Float
    @JvmName("ssaoLightAffectProperty")
    get() = getSsaoDirectLightAffect()
    @JvmName("ssaoLightAffectProperty")
    set(`value`) {
      setSsaoDirectLightAffect(value)
    }

  /**
   * The screen-space ambient occlusion intensity on materials that have an AO texture defined.
   * Values higher than `0` will make the SSAO effect visible in areas darkened by AO textures.
   */
  public final inline var ssaoAoChannelAffect: Float
    @JvmName("ssaoAoChannelAffectProperty")
    get() = getSsaoAoChannelAffect()
    @JvmName("ssaoAoChannelAffectProperty")
    set(`value`) {
      setSsaoAoChannelAffect(value)
    }

  /**
   * If `true`, the screen-space indirect lighting effect is enabled. Screen space indirect lighting
   * is a form of indirect lighting that allows diffuse light to bounce between nearby objects.
   * Screen-space indirect lighting works very similarly to screen-space ambient occlusion, in that it
   * only affects a limited range. It is intended to be used along with a form of proper global
   * illumination like SDFGI or [VoxelGI]. Screen-space indirect lighting is not affected by individual
   * light's [Light3D.lightIndirectEnergy].
   * **Note:** SSIL is only supported in the Forward+ rendering method, not Mobile or Compatibility.
   */
  public final inline var ssilEnabled: Boolean
    @JvmName("ssilEnabledProperty")
    get() = isSsilEnabled()
    @JvmName("ssilEnabledProperty")
    set(`value`) {
      setSsilEnabled(value)
    }

  /**
   * The distance that bounced lighting can travel when using the screen space indirect lighting
   * effect. A larger value will result in light bouncing further in a scene, but may result in
   * under-sampling artifacts which look like long spikes surrounding light sources.
   */
  public final inline var ssilRadius: Float
    @JvmName("ssilRadiusProperty")
    get() = getSsilRadius()
    @JvmName("ssilRadiusProperty")
    set(`value`) {
      setSsilRadius(value)
    }

  /**
   * The brightness multiplier for the screen-space indirect lighting effect. A higher value will
   * result in brighter light.
   */
  public final inline var ssilIntensity: Float
    @JvmName("ssilIntensityProperty")
    get() = getSsilIntensity()
    @JvmName("ssilIntensityProperty")
    set(`value`) {
      setSsilIntensity(value)
    }

  /**
   * The amount that the screen-space indirect lighting effect is allowed to blur over the edges of
   * objects. Setting too high will result in aliasing around the edges of objects. Setting too low
   * will make object edges appear blurry.
   */
  public final inline var ssilSharpness: Float
    @JvmName("ssilSharpnessProperty")
    get() = getSsilSharpness()
    @JvmName("ssilSharpnessProperty")
    set(`value`) {
      setSsilSharpness(value)
    }

  /**
   * Amount of normal rejection used when calculating screen-space indirect lighting. Normal
   * rejection uses the normal of a given sample point to reject samples that are facing away from the
   * current pixel. Normal rejection is necessary to avoid light leaking when only one side of an
   * object is illuminated. However, normal rejection can be disabled if light leaking is desirable,
   * such as when the scene mostly contains emissive objects that emit light from faces that cannot be
   * seen from the camera.
   */
  public final inline var ssilNormalRejection: Float
    @JvmName("ssilNormalRejectionProperty")
    get() = getSsilNormalRejection()
    @JvmName("ssilNormalRejectionProperty")
    set(`value`) {
      setSsilNormalRejection(value)
    }

  /**
   * If `true`, enables signed distance field global illumination for meshes that have their
   * [GeometryInstance3D.giMode] set to [GeometryInstance3D.GI_MODE_STATIC]. SDFGI is a real-time
   * global illumination technique that works well with procedurally generated and user-built levels,
   * including in situations where geometry is created during gameplay. The signed distance field is
   * automatically generated around the camera as it moves. Dynamic lights are supported, but dynamic
   * occluders and emissive surfaces are not.
   * **Note:** SDFGI is only supported in the Forward+ rendering method, not Mobile or
   * Compatibility.
   * **Performance:** SDFGI is relatively demanding on the GPU and is not suited to low-end hardware
   * such as integrated graphics (consider [LightmapGI] instead). To improve SDFGI performance, enable
   * [ProjectSettings.rendering/globalIllumination/gi/useHalfResolution] in the Project Settings.
   * **Note:** Meshes should have sufficiently thick walls to avoid light leaks (avoid one-sided
   * walls). For interior levels, enclose your level geometry in a sufficiently large box and bridge
   * the loops to close the mesh.
   */
  public final inline var sdfgiEnabled: Boolean
    @JvmName("sdfgiEnabledProperty")
    get() = isSdfgiEnabled()
    @JvmName("sdfgiEnabledProperty")
    set(`value`) {
      setSdfgiEnabled(value)
    }

  /**
   * If `true`, SDFGI uses an occlusion detection approach to reduce light leaking. Occlusion may
   * however introduce dark blotches in certain spots, which may be undesired in mostly outdoor scenes.
   * [sdfgiUseOcclusion] has a performance impact and should only be enabled when needed.
   */
  public final inline var sdfgiUseOcclusion: Boolean
    @JvmName("sdfgiUseOcclusionProperty")
    get() = isSdfgiUsingOcclusion()
    @JvmName("sdfgiUseOcclusionProperty")
    set(`value`) {
      setSdfgiUseOcclusion(value)
    }

  /**
   * If `true`, SDFGI takes the environment lighting into account. This should be set to `false` for
   * interior scenes.
   */
  public final inline var sdfgiReadSkyLight: Boolean
    @JvmName("sdfgiReadSkyLightProperty")
    get() = isSdfgiReadingSkyLight()
    @JvmName("sdfgiReadSkyLightProperty")
    set(`value`) {
      setSdfgiReadSkyLight(value)
    }

  /**
   * The energy multiplier applied to light every time it bounces from a surface when using SDFGI.
   * Values greater than `0.0` will simulate multiple bounces, resulting in a more realistic
   * appearance. Increasing [sdfgiBounceFeedback] generally has no performance impact. See also
   * [sdfgiEnergy].
   * **Note:** Values greater than `0.5` can cause infinite feedback loops and should be avoided in
   * scenes with bright materials.
   * **Note:** If [sdfgiBounceFeedback] is `0.0`, indirect lighting will not be represented in
   * reflections as light will only bounce one time.
   */
  public final inline var sdfgiBounceFeedback: Float
    @JvmName("sdfgiBounceFeedbackProperty")
    get() = getSdfgiBounceFeedback()
    @JvmName("sdfgiBounceFeedbackProperty")
    set(`value`) {
      setSdfgiBounceFeedback(value)
    }

  /**
   * The number of cascades to use for SDFGI (between 1 and 8). A higher number of cascades allows
   * displaying SDFGI further away while preserving detail up close, at the cost of performance. When
   * using SDFGI on small-scale levels, [sdfgiCascades] can often be decreased between `1` and `4` to
   * improve performance.
   */
  public final inline var sdfgiCascades: Int
    @JvmName("sdfgiCascadesProperty")
    get() = getSdfgiCascades()
    @JvmName("sdfgiCascadesProperty")
    set(`value`) {
      setSdfgiCascades(value)
    }

  /**
   * The cell size to use for the closest SDFGI cascade (in 3D units). Lower values allow SDFGI to
   * be more precise up close, at the cost of making SDFGI updates more demanding. This can cause
   * stuttering when the camera moves fast. Higher values allow SDFGI to cover more ground, while also
   * reducing the performance impact of SDFGI updates.
   * **Note:** This property is linked to [sdfgiMaxDistance] and [sdfgiCascade0Distance]. Changing
   * its value will automatically change those properties as well.
   */
  public final inline var sdfgiMinCellSize: Float
    @JvmName("sdfgiMinCellSizeProperty")
    get() = getSdfgiMinCellSize()
    @JvmName("sdfgiMinCellSizeProperty")
    set(`value`) {
      setSdfgiMinCellSize(value)
    }

  /**
   * **Note:** This property is linked to [sdfgiMinCellSize] and [sdfgiMaxDistance]. Changing its
   * value will automatically change those properties as well.
   */
  public final inline var sdfgiCascade0Distance: Float
    @JvmName("sdfgiCascade0DistanceProperty")
    get() = getSdfgiCascade0Distance()
    @JvmName("sdfgiCascade0DistanceProperty")
    set(`value`) {
      setSdfgiCascade0Distance(value)
    }

  /**
   * The maximum distance at which SDFGI is visible. Beyond this distance, environment lighting or
   * other sources of GI such as [ReflectionProbe] will be used as a fallback.
   * **Note:** This property is linked to [sdfgiMinCellSize] and [sdfgiCascade0Distance]. Changing
   * its value will automatically change those properties as well.
   */
  public final inline var sdfgiMaxDistance: Float
    @JvmName("sdfgiMaxDistanceProperty")
    get() = getSdfgiMaxDistance()
    @JvmName("sdfgiMaxDistanceProperty")
    set(`value`) {
      setSdfgiMaxDistance(value)
    }

  /**
   * The Y scale to use for SDFGI cells. Lower values will result in SDFGI cells being packed
   * together more closely on the Y axis. This is used to balance between quality and covering a lot of
   * vertical ground. [sdfgiYScale] should be set depending on how vertical your scene is (and how fast
   * your camera may move on the Y axis).
   */
  public final inline var sdfgiYScale: SDFGIYScale
    @JvmName("sdfgiYScaleProperty")
    get() = getSdfgiYScale()
    @JvmName("sdfgiYScaleProperty")
    set(`value`) {
      setSdfgiYScale(value)
    }

  /**
   * The energy multiplier to use for SDFGI. Higher values will result in brighter indirect lighting
   * and reflections. See also [sdfgiBounceFeedback].
   */
  public final inline var sdfgiEnergy: Float
    @JvmName("sdfgiEnergyProperty")
    get() = getSdfgiEnergy()
    @JvmName("sdfgiEnergyProperty")
    set(`value`) {
      setSdfgiEnergy(value)
    }

  /**
   * The normal bias to use for SDFGI probes. Increasing this value can reduce visible streaking
   * artifacts on sloped surfaces, at the cost of increased light leaking.
   */
  public final inline var sdfgiNormalBias: Float
    @JvmName("sdfgiNormalBiasProperty")
    get() = getSdfgiNormalBias()
    @JvmName("sdfgiNormalBiasProperty")
    set(`value`) {
      setSdfgiNormalBias(value)
    }

  /**
   * The constant bias to use for SDFGI probes. Increasing this value can reduce visible streaking
   * artifacts on sloped surfaces, at the cost of increased light leaking.
   */
  public final inline var sdfgiProbeBias: Float
    @JvmName("sdfgiProbeBiasProperty")
    get() = getSdfgiProbeBias()
    @JvmName("sdfgiProbeBiasProperty")
    set(`value`) {
      setSdfgiProbeBias(value)
    }

  /**
   * If `true`, the glow effect is enabled. This simulates real world eye/camera behavior where
   * bright pixels bleed onto surrounding pixels.
   * **Note:** When using the Mobile rendering method, glow looks different due to the lower dynamic
   * range available in the Mobile rendering method.
   * **Note:** When using the Compatibility rendering method, glow uses a different implementation
   * with some properties being unavailable and hidden from the inspector: `glow_levels&#47;*`,
   * [glowNormalized], [glowStrength], [glowBlendMode], [glowMix], [glowMap], and [glowMapStrength].
   * This implementation is optimized to run on low-end devices and is less flexible as a result.
   */
  public final inline var glowEnabled: Boolean
    @JvmName("glowEnabledProperty")
    get() = isGlowEnabled()
    @JvmName("glowEnabledProperty")
    set(`value`) {
      setGlowEnabled(value)
    }

  /**
   * If `true`, glow levels will be normalized so that summed together their intensities equal
   * `1.0`.
   * **Note:** [glowNormalized] has no effect when using the Compatibility rendering method, due to
   * this rendering method using a simpler glow implementation optimized for low-end devices.
   */
  public final inline var glowNormalized: Boolean
    @JvmName("glowNormalizedProperty")
    get() = isGlowNormalized()
    @JvmName("glowNormalizedProperty")
    set(`value`) {
      setGlowNormalized(value)
    }

  /**
   * The overall brightness multiplier of the glow effect. When using the Mobile rendering method
   * (which only supports a lower dynamic range up to `2.0`), this should be increased to `1.5` to
   * compensate.
   */
  public final inline var glowIntensity: Float
    @JvmName("glowIntensityProperty")
    get() = getGlowIntensity()
    @JvmName("glowIntensityProperty")
    set(`value`) {
      setGlowIntensity(value)
    }

  /**
   * The strength of the glow effect. This applies as the glow is blurred across the screen and
   * increases the distance and intensity of the blur. When using the Mobile rendering method, this
   * should be increased to compensate for the lower dynamic range.
   * **Note:** [glowStrength] has no effect when using the Compatibility rendering method, due to
   * this rendering method using a simpler glow implementation optimized for low-end devices.
   */
  public final inline var glowStrength: Float
    @JvmName("glowStrengthProperty")
    get() = getGlowStrength()
    @JvmName("glowStrengthProperty")
    set(`value`) {
      setGlowStrength(value)
    }

  /**
   * When using the [GLOW_BLEND_MODE_MIX] [glowBlendMode], this controls how much the source image
   * is blended with the glow layer. A value of `0.0` makes the glow rendering invisible, while a value
   * of `1.0` is equivalent to [GLOW_BLEND_MODE_REPLACE].
   * **Note:** [glowMix] has no effect when using the Compatibility rendering method, due to this
   * rendering method using a simpler glow implementation optimized for low-end devices.
   */
  public final inline var glowMix: Float
    @JvmName("glowMixProperty")
    get() = getGlowMix()
    @JvmName("glowMixProperty")
    set(`value`) {
      setGlowMix(value)
    }

  /**
   * The bloom's intensity. If set to a value higher than `0`, this will make glow visible in areas
   * darker than the [glowHdrThreshold].
   */
  public final inline var glowBloom: Float
    @JvmName("glowBloomProperty")
    get() = getGlowBloom()
    @JvmName("glowBloomProperty")
    set(`value`) {
      setGlowBloom(value)
    }

  /**
   * The glow blending mode.
   * **Note:** [glowBlendMode] has no effect when using the Compatibility rendering method, due to
   * this rendering method using a simpler glow implementation optimized for low-end devices.
   */
  public final inline var glowBlendMode: GlowBlendMode
    @JvmName("glowBlendModeProperty")
    get() = getGlowBlendMode()
    @JvmName("glowBlendModeProperty")
    set(`value`) {
      setGlowBlendMode(value)
    }

  /**
   * The lower threshold of the HDR glow. When using the Mobile rendering method (which only
   * supports a lower dynamic range up to `2.0`), this may need to be below `1.0` for glow to be
   * visible. A value of `0.9` works well in this case. This value also needs to be decreased below
   * `1.0` when using glow in 2D, as 2D rendering is performed in SDR.
   */
  public final inline var glowHdrThreshold: Float
    @JvmName("glowHdrThresholdProperty")
    get() = getGlowHdrBleedThreshold()
    @JvmName("glowHdrThresholdProperty")
    set(`value`) {
      setGlowHdrBleedThreshold(value)
    }

  /**
   * The bleed scale of the HDR glow.
   */
  public final inline var glowHdrScale: Float
    @JvmName("glowHdrScaleProperty")
    get() = getGlowHdrBleedScale()
    @JvmName("glowHdrScaleProperty")
    set(`value`) {
      setGlowHdrBleedScale(value)
    }

  /**
   * The higher threshold of the HDR glow. Areas brighter than this threshold will be clamped for
   * the purposes of the glow effect.
   */
  public final inline var glowHdrLuminanceCap: Float
    @JvmName("glowHdrLuminanceCapProperty")
    get() = getGlowHdrLuminanceCap()
    @JvmName("glowHdrLuminanceCapProperty")
    set(`value`) {
      setGlowHdrLuminanceCap(value)
    }

  /**
   * How strong of an impact the [glowMap] should have on the overall glow effect. A strength of
   * `0.0` means the glow map has no effect on the overall glow effect. A strength of `1.0` means the
   * glow has a full effect on the overall glow effect (and can turn off glow entirely in specific
   * areas of the screen if the glow map has black areas).
   * **Note:** [glowMapStrength] has no effect when using the Compatibility rendering method, due to
   * this rendering method using a simpler glow implementation optimized for low-end devices.
   */
  public final inline var glowMapStrength: Float
    @JvmName("glowMapStrengthProperty")
    get() = getGlowMapStrength()
    @JvmName("glowMapStrengthProperty")
    set(`value`) {
      setGlowMapStrength(value)
    }

  /**
   * The texture that should be used as a glow map to *multiply* the resulting glow color according
   * to [glowMapStrength]. This can be used to create a "lens dirt" effect. The texture's RGB color
   * channels are used for modulation, but the alpha channel is ignored.
   * **Note:** The texture will be stretched to fit the screen. Therefore, it's recommended to use a
   * texture with an aspect ratio that matches your project's base aspect ratio (typically 16:9).
   * **Note:** [glowMap] has no effect when using the Compatibility rendering method, due to this
   * rendering method using a simpler glow implementation optimized for low-end devices.
   */
  public final inline var glowMap: Texture?
    @JvmName("glowMapProperty")
    get() = getGlowMap()
    @JvmName("glowMapProperty")
    set(`value`) {
      setGlowMap(value)
    }

  /**
   * If `true`, fog effects are enabled.
   */
  public final inline var fogEnabled: Boolean
    @JvmName("fogEnabledProperty")
    get() = isFogEnabled()
    @JvmName("fogEnabledProperty")
    set(`value`) {
      setFogEnabled(value)
    }

  /**
   * The fog mode. See [FogMode] for possible values.
   */
  public final inline var fogMode: FogMode
    @JvmName("fogModeProperty")
    get() = getFogMode()
    @JvmName("fogModeProperty")
    set(`value`) {
      setFogMode(value)
    }

  /**
   * The fog's color.
   */
  @CoreTypeLocalCopy
  public final inline var fogLightColor: Color
    @JvmName("fogLightColorProperty")
    get() = getFogLightColor()
    @JvmName("fogLightColorProperty")
    set(`value`) {
      setFogLightColor(value)
    }

  /**
   * The fog's brightness. Higher values result in brighter fog.
   */
  public final inline var fogLightEnergy: Float
    @JvmName("fogLightEnergyProperty")
    get() = getFogLightEnergy()
    @JvmName("fogLightEnergyProperty")
    set(`value`) {
      setFogLightEnergy(value)
    }

  /**
   * If set above `0.0`, renders the scene's directional light(s) in the fog color depending on the
   * view angle. This can be used to give the impression that the sun is "piercing" through the fog.
   */
  public final inline var fogSunScatter: Float
    @JvmName("fogSunScatterProperty")
    get() = getFogSunScatter()
    @JvmName("fogSunScatterProperty")
    set(`value`) {
      setFogSunScatter(value)
    }

  /**
   * The fog density to be used. This is demonstrated in different ways depending on the [fogMode]
   * mode chosen:
   * **Exponential Fog Mode:** Higher values result in denser fog. The fog rendering is exponential
   * like in real life.
   * **Depth Fog mode:** The maximum intensity of the deep fog, effect will appear in the distance
   * (relative to the camera). At `1.0` the fog will fully obscure the scene, at `0.0` the fog will not
   * be visible.
   */
  public final inline var fogDensity: Float
    @JvmName("fogDensityProperty")
    get() = getFogDensity()
    @JvmName("fogDensityProperty")
    set(`value`) {
      setFogDensity(value)
    }

  /**
   * If set above `0.0` (exclusive), blends between the fog's color and the color of the background
   * [Sky]. This has a small performance cost when set above `0.0`. Must have [backgroundMode] set to
   * [BG_SKY].
   * This is useful to simulate [url=https://en.wikipedia.org/wiki/Aerial_perspective]aerial
   * perspective[/url] in large scenes with low density fog. However, it is not very useful for
   * high-density fog, as the sky will shine through. When set to `1.0`, the fog color comes completely
   * from the [Sky]. If set to `0.0`, aerial perspective is disabled.
   */
  public final inline var fogAerialPerspective: Float
    @JvmName("fogAerialPerspectiveProperty")
    get() = getFogAerialPerspective()
    @JvmName("fogAerialPerspectiveProperty")
    set(`value`) {
      setFogAerialPerspective(value)
    }

  /**
   * The factor to use when affecting the sky with non-volumetric fog. `1.0` means that fog can
   * fully obscure the sky. Lower values reduce the impact of fog on sky rendering, with `0.0` not
   * affecting sky rendering at all.
   * **Note:** [fogSkyAffect] has no visual effect if [fogAerialPerspective] is `1.0`.
   */
  public final inline var fogSkyAffect: Float
    @JvmName("fogSkyAffectProperty")
    get() = getFogSkyAffect()
    @JvmName("fogSkyAffectProperty")
    set(`value`) {
      setFogSkyAffect(value)
    }

  /**
   * The height at which the height fog effect begins.
   */
  public final inline var fogHeight: Float
    @JvmName("fogHeightProperty")
    get() = getFogHeight()
    @JvmName("fogHeightProperty")
    set(`value`) {
      setFogHeight(value)
    }

  /**
   * The density used to increase fog as height decreases. To make fog increase as height increases,
   * use a negative value.
   */
  public final inline var fogHeightDensity: Float
    @JvmName("fogHeightDensityProperty")
    get() = getFogHeightDensity()
    @JvmName("fogHeightDensityProperty")
    set(`value`) {
      setFogHeightDensity(value)
    }

  /**
   * The fog depth's intensity curve. A number of presets are available in the Inspector by
   * right-clicking the curve. Only available when [fogMode] is set to [FOG_MODE_DEPTH].
   */
  public final inline var fogDepthCurve: Float
    @JvmName("fogDepthCurveProperty")
    get() = getFogDepthCurve()
    @JvmName("fogDepthCurveProperty")
    set(`value`) {
      setFogDepthCurve(value)
    }

  /**
   * The fog's depth starting distance from the camera. Only available when [fogMode] is set to
   * [FOG_MODE_DEPTH].
   */
  public final inline var fogDepthBegin: Float
    @JvmName("fogDepthBeginProperty")
    get() = getFogDepthBegin()
    @JvmName("fogDepthBeginProperty")
    set(`value`) {
      setFogDepthBegin(value)
    }

  /**
   * The fog's depth end distance from the camera. If this value is set to `0`, it will be equal to
   * the current camera's [Camera3D.far] value. Only available when [fogMode] is set to
   * [FOG_MODE_DEPTH].
   */
  public final inline var fogDepthEnd: Float
    @JvmName("fogDepthEndProperty")
    get() = getFogDepthEnd()
    @JvmName("fogDepthEndProperty")
    set(`value`) {
      setFogDepthEnd(value)
    }

  /**
   * Enables the volumetric fog effect. Volumetric fog uses a screen-aligned froxel buffer to
   * calculate accurate volumetric scattering in the short to medium range. Volumetric fog interacts
   * with [FogVolume]s and lights to calculate localized and global fog. Volumetric fog uses a PBR
   * single-scattering model based on extinction, scattering, and emission which it exposes to users as
   * density, albedo, and emission.
   * **Note:** Volumetric fog is only supported in the Forward+ rendering method, not Mobile or
   * Compatibility.
   */
  public final inline var volumetricFogEnabled: Boolean
    @JvmName("volumetricFogEnabledProperty")
    get() = isVolumetricFogEnabled()
    @JvmName("volumetricFogEnabledProperty")
    set(`value`) {
      setVolumetricFogEnabled(value)
    }

  /**
   * The base *exponential* density of the volumetric fog. Set this to the lowest density you want
   * to have globally. [FogVolume]s can be used to add to or subtract from this density in specific
   * areas. Fog rendering is exponential as in real life.
   * A value of `0.0` disables global volumetric fog while allowing [FogVolume]s to display
   * volumetric fog in specific areas.
   * To make volumetric fog work as a volumetric *lighting* solution, set [volumetricFogDensity] to
   * the lowest non-zero value (`0.0001`) then increase lights' [Light3D.lightVolumetricFogEnergy] to
   * values between `10000` and `100000` to compensate for the very low density.
   */
  public final inline var volumetricFogDensity: Float
    @JvmName("volumetricFogDensityProperty")
    get() = getVolumetricFogDensity()
    @JvmName("volumetricFogDensityProperty")
    set(`value`) {
      setVolumetricFogDensity(value)
    }

  /**
   * The [Color] of the volumetric fog when interacting with lights. Mist and fog have an albedo
   * close to `Color(1, 1, 1, 1)` while smoke has a darker albedo.
   */
  @CoreTypeLocalCopy
  public final inline var volumetricFogAlbedo: Color
    @JvmName("volumetricFogAlbedoProperty")
    get() = getVolumetricFogAlbedo()
    @JvmName("volumetricFogAlbedoProperty")
    set(`value`) {
      setVolumetricFogAlbedo(value)
    }

  /**
   * The emitted light from the volumetric fog. Even with emission, volumetric fog will not cast
   * light onto other surfaces. Emission is useful to establish an ambient color. As the volumetric fog
   * effect uses single-scattering only, fog tends to need a little bit of emission to soften the harsh
   * shadows.
   */
  @CoreTypeLocalCopy
  public final inline var volumetricFogEmission: Color
    @JvmName("volumetricFogEmissionProperty")
    get() = getVolumetricFogEmission()
    @JvmName("volumetricFogEmissionProperty")
    set(`value`) {
      setVolumetricFogEmission(value)
    }

  /**
   * The brightness of the emitted light from the volumetric fog.
   */
  public final inline var volumetricFogEmissionEnergy: Float
    @JvmName("volumetricFogEmissionEnergyProperty")
    get() = getVolumetricFogEmissionEnergy()
    @JvmName("volumetricFogEmissionEnergyProperty")
    set(`value`) {
      setVolumetricFogEmissionEnergy(value)
    }

  /**
   * Scales the strength of Global Illumination used in the volumetric fog's albedo color. A value
   * of `0.0` means that Global Illumination will not impact the volumetric fog.
   * [volumetricFogGiInject] has a small performance cost when set above `0.0`.
   * **Note:** This has no visible effect if [volumetricFogDensity] is `0.0` or if
   * [volumetricFogAlbedo] is a fully black color.
   * **Note:** Only [VoxelGI] and SDFGI ([Environment.sdfgiEnabled]) are taken into account when
   * using [volumetricFogGiInject]. Global illumination from [LightmapGI], [ReflectionProbe] and SSIL
   * (see [ssilEnabled]) will be ignored by volumetric fog.
   */
  public final inline var volumetricFogGiInject: Float
    @JvmName("volumetricFogGiInjectProperty")
    get() = getVolumetricFogGiInject()
    @JvmName("volumetricFogGiInjectProperty")
    set(`value`) {
      setVolumetricFogGiInject(value)
    }

  /**
   * The direction of scattered light as it goes through the volumetric fog. A value close to `1.0`
   * means almost all light is scattered forward. A value close to `0.0` means light is scattered
   * equally in all directions. A value close to `-1.0` means light is scattered mostly backward. Fog
   * and mist scatter light slightly forward, while smoke scatters light equally in all directions.
   */
  public final inline var volumetricFogAnisotropy: Float
    @JvmName("volumetricFogAnisotropyProperty")
    get() = getVolumetricFogAnisotropy()
    @JvmName("volumetricFogAnisotropyProperty")
    set(`value`) {
      setVolumetricFogAnisotropy(value)
    }

  /**
   * The distance over which the volumetric fog is computed. Increase to compute fog over a greater
   * range, decrease to add more detail when a long range is not needed. For best quality fog, keep
   * this as low as possible. See also
   * [ProjectSettings.rendering/environment/volumetricFog/volumeDepth].
   */
  public final inline var volumetricFogLength: Float
    @JvmName("volumetricFogLengthProperty")
    get() = getVolumetricFogLength()
    @JvmName("volumetricFogLengthProperty")
    set(`value`) {
      setVolumetricFogLength(value)
    }

  /**
   * The distribution of size down the length of the froxel buffer. A higher value compresses the
   * froxels closer to the camera and places more detail closer to the camera.
   */
  public final inline var volumetricFogDetailSpread: Float
    @JvmName("volumetricFogDetailSpreadProperty")
    get() = getVolumetricFogDetailSpread()
    @JvmName("volumetricFogDetailSpreadProperty")
    set(`value`) {
      setVolumetricFogDetailSpread(value)
    }

  /**
   * Scales the strength of ambient light used in the volumetric fog. A value of `0.0` means that
   * ambient light will not impact the volumetric fog. [volumetricFogAmbientInject] has a small
   * performance cost when set above `0.0`.
   * **Note:** This has no visible effect if [volumetricFogDensity] is `0.0` or if
   * [volumetricFogAlbedo] is a fully black color.
   */
  public final inline var volumetricFogAmbientInject: Float
    @JvmName("volumetricFogAmbientInjectProperty")
    get() = getVolumetricFogAmbientInject()
    @JvmName("volumetricFogAmbientInjectProperty")
    set(`value`) {
      setVolumetricFogAmbientInject(value)
    }

  /**
   * The factor to use when affecting the sky with volumetric fog. `1.0` means that volumetric fog
   * can fully obscure the sky. Lower values reduce the impact of volumetric fog on sky rendering, with
   * `0.0` not affecting sky rendering at all.
   * **Note:** [volumetricFogSkyAffect] also affects [FogVolume]s, even if [volumetricFogDensity] is
   * `0.0`. If you notice [FogVolume]s are disappearing when looking towards the sky, set
   * [volumetricFogSkyAffect] to `1.0`.
   */
  public final inline var volumetricFogSkyAffect: Float
    @JvmName("volumetricFogSkyAffectProperty")
    get() = getVolumetricFogSkyAffect()
    @JvmName("volumetricFogSkyAffectProperty")
    set(`value`) {
      setVolumetricFogSkyAffect(value)
    }

  /**
   * Enables temporal reprojection in the volumetric fog. Temporal reprojection blends the current
   * frame's volumetric fog with the last frame's volumetric fog to smooth out jagged edges. The
   * performance cost is minimal; however, it leads to moving [FogVolume]s and [Light3D]s "ghosting"
   * and leaving a trail behind them. When temporal reprojection is enabled, try to avoid moving
   * [FogVolume]s or [Light3D]s too fast. Short-lived dynamic lighting effects should have
   * [Light3D.lightVolumetricFogEnergy] set to `0.0` to avoid ghosting.
   */
  public final inline var volumetricFogTemporalReprojectionEnabled: Boolean
    @JvmName("volumetricFogTemporalReprojectionEnabledProperty")
    get() = isVolumetricFogTemporalReprojectionEnabled()
    @JvmName("volumetricFogTemporalReprojectionEnabledProperty")
    set(`value`) {
      setVolumetricFogTemporalReprojectionEnabled(value)
    }

  /**
   * The amount by which to blend the last frame with the current frame. A higher number results in
   * smoother volumetric fog, but makes "ghosting" much worse. A lower value reduces ghosting but can
   * result in the per-frame temporal jitter becoming visible.
   */
  public final inline var volumetricFogTemporalReprojectionAmount: Float
    @JvmName("volumetricFogTemporalReprojectionAmountProperty")
    get() = getVolumetricFogTemporalReprojectionAmount()
    @JvmName("volumetricFogTemporalReprojectionAmountProperty")
    set(`value`) {
      setVolumetricFogTemporalReprojectionAmount(value)
    }

  /**
   * If `true`, enables the `adjustment_*` properties provided by this resource. If `false`,
   * modifications to the `adjustment_*` properties will have no effect on the rendered scene.
   */
  public final inline var adjustmentEnabled: Boolean
    @JvmName("adjustmentEnabledProperty")
    get() = isAdjustmentEnabled()
    @JvmName("adjustmentEnabledProperty")
    set(`value`) {
      setAdjustmentEnabled(value)
    }

  /**
   * The global brightness value of the rendered scene. Effective only if [adjustmentEnabled] is
   * `true`.
   */
  public final inline var adjustmentBrightness: Float
    @JvmName("adjustmentBrightnessProperty")
    get() = getAdjustmentBrightness()
    @JvmName("adjustmentBrightnessProperty")
    set(`value`) {
      setAdjustmentBrightness(value)
    }

  /**
   * The global contrast value of the rendered scene (default value is 1). Effective only if
   * [adjustmentEnabled] is `true`.
   */
  public final inline var adjustmentContrast: Float
    @JvmName("adjustmentContrastProperty")
    get() = getAdjustmentContrast()
    @JvmName("adjustmentContrastProperty")
    set(`value`) {
      setAdjustmentContrast(value)
    }

  /**
   * The global color saturation value of the rendered scene (default value is 1). Effective only if
   * [adjustmentEnabled] is `true`.
   */
  public final inline var adjustmentSaturation: Float
    @JvmName("adjustmentSaturationProperty")
    get() = getAdjustmentSaturation()
    @JvmName("adjustmentSaturationProperty")
    set(`value`) {
      setAdjustmentSaturation(value)
    }

  /**
   * The [Texture2D] or [Texture3D] lookup table (LUT) to use for the built-in post-process color
   * grading. Can use a [GradientTexture1D] for a 1-dimensional LUT, or a [Texture3D] for a more
   * complex LUT. Effective only if [adjustmentEnabled] is `true`.
   */
  public final inline var adjustmentColorCorrection: Texture?
    @JvmName("adjustmentColorCorrectionProperty")
    get() = getAdjustmentColorCorrection()
    @JvmName("adjustmentColorCorrectionProperty")
    set(`value`) {
      setAdjustmentColorCorrection(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_ENVIRONMENT, scriptIndex)
  }

  /**
   * The [Color] displayed for clear areas of the scene. Only effective when using the [BG_COLOR]
   * background mode.
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
   * val myCoreType = environment.backgroundColor
   * //Your changes
   * environment.backgroundColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun backgroundColorMutate(block: Color.() -> Unit): Color = backgroundColor.apply{
      block(this)
      backgroundColor = this
  }


  /**
   * The rotation to use for sky rendering.
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
   * val myCoreType = environment.skyRotation
   * //Your changes
   * environment.skyRotation = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun skyRotationMutate(block: Vector3.() -> Unit): Vector3 = skyRotation.apply{
      block(this)
      skyRotation = this
  }


  /**
   * The ambient light's [Color]. Only effective if [ambientLightSkyContribution] is lower than
   * `1.0` (exclusive).
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
   * val myCoreType = environment.ambientLightColor
   * //Your changes
   * environment.ambientLightColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun ambientLightColorMutate(block: Color.() -> Unit): Color =
      ambientLightColor.apply{
      block(this)
      ambientLightColor = this
  }


  /**
   * The fog's color.
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
   * val myCoreType = environment.fogLightColor
   * //Your changes
   * environment.fogLightColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun fogLightColorMutate(block: Color.() -> Unit): Color = fogLightColor.apply{
      block(this)
      fogLightColor = this
  }


  /**
   * The [Color] of the volumetric fog when interacting with lights. Mist and fog have an albedo
   * close to `Color(1, 1, 1, 1)` while smoke has a darker albedo.
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
   * val myCoreType = environment.volumetricFogAlbedo
   * //Your changes
   * environment.volumetricFogAlbedo = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun volumetricFogAlbedoMutate(block: Color.() -> Unit): Color =
      volumetricFogAlbedo.apply{
      block(this)
      volumetricFogAlbedo = this
  }


  /**
   * The emitted light from the volumetric fog. Even with emission, volumetric fog will not cast
   * light onto other surfaces. Emission is useful to establish an ambient color. As the volumetric fog
   * effect uses single-scattering only, fog tends to need a little bit of emission to soften the harsh
   * shadows.
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
   * val myCoreType = environment.volumetricFogEmission
   * //Your changes
   * environment.volumetricFogEmission = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun volumetricFogEmissionMutate(block: Color.() -> Unit): Color =
      volumetricFogEmission.apply{
      block(this)
      volumetricFogEmission = this
  }


  public final fun setBackground(mode: BGMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setBackgroundPtr, NIL)
  }

  public final fun getBackground(): BGMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBackgroundPtr, LONG)
    return Environment.BGMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSky(sky: Sky?): Unit {
    TransferContext.writeArguments(OBJECT to sky)
    TransferContext.callMethod(ptr, MethodBindings.setSkyPtr, NIL)
  }

  public final fun getSky(): Sky? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkyPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Sky?)
  }

  public final fun setSkyCustomFov(scale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to scale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSkyCustomFovPtr, NIL)
  }

  public final fun getSkyCustomFov(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkyCustomFovPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSkyRotation(eulerRadians: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to eulerRadians)
    TransferContext.callMethod(ptr, MethodBindings.setSkyRotationPtr, NIL)
  }

  public final fun getSkyRotation(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkyRotationPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setBgColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setBgColorPtr, NIL)
  }

  public final fun getBgColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBgColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setBgEnergyMultiplier(energy: Float): Unit {
    TransferContext.writeArguments(DOUBLE to energy.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setBgEnergyMultiplierPtr, NIL)
  }

  public final fun getBgEnergyMultiplier(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBgEnergyMultiplierPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBgIntensity(energy: Float): Unit {
    TransferContext.writeArguments(DOUBLE to energy.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setBgIntensityPtr, NIL)
  }

  public final fun getBgIntensity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBgIntensityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setCanvasMaxLayer(layer: Int): Unit {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setCanvasMaxLayerPtr, NIL)
  }

  public final fun getCanvasMaxLayer(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCanvasMaxLayerPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setCameraFeedId(id: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setCameraFeedIdPtr, NIL)
  }

  public final fun getCameraFeedId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCameraFeedIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setAmbientLightColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setAmbientLightColorPtr, NIL)
  }

  public final fun getAmbientLightColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAmbientLightColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setAmbientSource(source: AmbientSource): Unit {
    TransferContext.writeArguments(LONG to source.id)
    TransferContext.callMethod(ptr, MethodBindings.setAmbientSourcePtr, NIL)
  }

  public final fun getAmbientSource(): AmbientSource {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAmbientSourcePtr, LONG)
    return Environment.AmbientSource.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAmbientLightEnergy(energy: Float): Unit {
    TransferContext.writeArguments(DOUBLE to energy.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAmbientLightEnergyPtr, NIL)
  }

  public final fun getAmbientLightEnergy(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAmbientLightEnergyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAmbientLightSkyContribution(ratio: Float): Unit {
    TransferContext.writeArguments(DOUBLE to ratio.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAmbientLightSkyContributionPtr, NIL)
  }

  public final fun getAmbientLightSkyContribution(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAmbientLightSkyContributionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setReflectionSource(source: ReflectionSource): Unit {
    TransferContext.writeArguments(LONG to source.id)
    TransferContext.callMethod(ptr, MethodBindings.setReflectionSourcePtr, NIL)
  }

  public final fun getReflectionSource(): ReflectionSource {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getReflectionSourcePtr, LONG)
    return Environment.ReflectionSource.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTonemapper(mode: ToneMapper): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setTonemapperPtr, NIL)
  }

  public final fun getTonemapper(): ToneMapper {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTonemapperPtr, LONG)
    return Environment.ToneMapper.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTonemapExposure(exposure: Float): Unit {
    TransferContext.writeArguments(DOUBLE to exposure.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTonemapExposurePtr, NIL)
  }

  public final fun getTonemapExposure(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTonemapExposurePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTonemapWhite(white: Float): Unit {
    TransferContext.writeArguments(DOUBLE to white.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTonemapWhitePtr, NIL)
  }

  public final fun getTonemapWhite(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTonemapWhitePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSsrEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setSsrEnabledPtr, NIL)
  }

  public final fun isSsrEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSsrEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSsrMaxSteps(maxSteps: Int): Unit {
    TransferContext.writeArguments(LONG to maxSteps.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSsrMaxStepsPtr, NIL)
  }

  public final fun getSsrMaxSteps(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSsrMaxStepsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSsrFadeIn(fadeIn: Float): Unit {
    TransferContext.writeArguments(DOUBLE to fadeIn.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSsrFadeInPtr, NIL)
  }

  public final fun getSsrFadeIn(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSsrFadeInPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSsrFadeOut(fadeOut: Float): Unit {
    TransferContext.writeArguments(DOUBLE to fadeOut.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSsrFadeOutPtr, NIL)
  }

  public final fun getSsrFadeOut(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSsrFadeOutPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSsrDepthTolerance(depthTolerance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to depthTolerance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSsrDepthTolerancePtr, NIL)
  }

  public final fun getSsrDepthTolerance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSsrDepthTolerancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSsaoEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setSsaoEnabledPtr, NIL)
  }

  public final fun isSsaoEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSsaoEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSsaoRadius(radius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSsaoRadiusPtr, NIL)
  }

  public final fun getSsaoRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSsaoRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSsaoIntensity(intensity: Float): Unit {
    TransferContext.writeArguments(DOUBLE to intensity.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSsaoIntensityPtr, NIL)
  }

  public final fun getSsaoIntensity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSsaoIntensityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSsaoPower(power: Float): Unit {
    TransferContext.writeArguments(DOUBLE to power.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSsaoPowerPtr, NIL)
  }

  public final fun getSsaoPower(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSsaoPowerPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSsaoDetail(detail: Float): Unit {
    TransferContext.writeArguments(DOUBLE to detail.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSsaoDetailPtr, NIL)
  }

  public final fun getSsaoDetail(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSsaoDetailPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSsaoHorizon(horizon: Float): Unit {
    TransferContext.writeArguments(DOUBLE to horizon.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSsaoHorizonPtr, NIL)
  }

  public final fun getSsaoHorizon(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSsaoHorizonPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSsaoSharpness(sharpness: Float): Unit {
    TransferContext.writeArguments(DOUBLE to sharpness.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSsaoSharpnessPtr, NIL)
  }

  public final fun getSsaoSharpness(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSsaoSharpnessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSsaoDirectLightAffect(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSsaoDirectLightAffectPtr, NIL)
  }

  public final fun getSsaoDirectLightAffect(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSsaoDirectLightAffectPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSsaoAoChannelAffect(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSsaoAoChannelAffectPtr, NIL)
  }

  public final fun getSsaoAoChannelAffect(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSsaoAoChannelAffectPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSsilEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setSsilEnabledPtr, NIL)
  }

  public final fun isSsilEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSsilEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSsilRadius(radius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSsilRadiusPtr, NIL)
  }

  public final fun getSsilRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSsilRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSsilIntensity(intensity: Float): Unit {
    TransferContext.writeArguments(DOUBLE to intensity.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSsilIntensityPtr, NIL)
  }

  public final fun getSsilIntensity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSsilIntensityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSsilSharpness(sharpness: Float): Unit {
    TransferContext.writeArguments(DOUBLE to sharpness.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSsilSharpnessPtr, NIL)
  }

  public final fun getSsilSharpness(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSsilSharpnessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSsilNormalRejection(normalRejection: Float): Unit {
    TransferContext.writeArguments(DOUBLE to normalRejection.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSsilNormalRejectionPtr, NIL)
  }

  public final fun getSsilNormalRejection(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSsilNormalRejectionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSdfgiEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setSdfgiEnabledPtr, NIL)
  }

  public final fun isSdfgiEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSdfgiEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSdfgiCascades(amount: Int): Unit {
    TransferContext.writeArguments(LONG to amount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSdfgiCascadesPtr, NIL)
  }

  public final fun getSdfgiCascades(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSdfgiCascadesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setSdfgiMinCellSize(size: Float): Unit {
    TransferContext.writeArguments(DOUBLE to size.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSdfgiMinCellSizePtr, NIL)
  }

  public final fun getSdfgiMinCellSize(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSdfgiMinCellSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSdfgiMaxDistance(distance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to distance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSdfgiMaxDistancePtr, NIL)
  }

  public final fun getSdfgiMaxDistance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSdfgiMaxDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSdfgiCascade0Distance(distance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to distance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSdfgiCascade0DistancePtr, NIL)
  }

  public final fun getSdfgiCascade0Distance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSdfgiCascade0DistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSdfgiYScale(scale: SDFGIYScale): Unit {
    TransferContext.writeArguments(LONG to scale.id)
    TransferContext.callMethod(ptr, MethodBindings.setSdfgiYScalePtr, NIL)
  }

  public final fun getSdfgiYScale(): SDFGIYScale {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSdfgiYScalePtr, LONG)
    return Environment.SDFGIYScale.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSdfgiUseOcclusion(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setSdfgiUseOcclusionPtr, NIL)
  }

  public final fun isSdfgiUsingOcclusion(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSdfgiUsingOcclusionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSdfgiBounceFeedback(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSdfgiBounceFeedbackPtr, NIL)
  }

  public final fun getSdfgiBounceFeedback(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSdfgiBounceFeedbackPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSdfgiReadSkyLight(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setSdfgiReadSkyLightPtr, NIL)
  }

  public final fun isSdfgiReadingSkyLight(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSdfgiReadingSkyLightPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSdfgiEnergy(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSdfgiEnergyPtr, NIL)
  }

  public final fun getSdfgiEnergy(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSdfgiEnergyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSdfgiNormalBias(bias: Float): Unit {
    TransferContext.writeArguments(DOUBLE to bias.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSdfgiNormalBiasPtr, NIL)
  }

  public final fun getSdfgiNormalBias(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSdfgiNormalBiasPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSdfgiProbeBias(bias: Float): Unit {
    TransferContext.writeArguments(DOUBLE to bias.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSdfgiProbeBiasPtr, NIL)
  }

  public final fun getSdfgiProbeBias(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSdfgiProbeBiasPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGlowEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setGlowEnabledPtr, NIL)
  }

  public final fun isGlowEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isGlowEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the intensity of the glow level [idx]. A value above `0.0` enables the level. Each level
   * relies on the previous level. This means that enabling higher glow levels will slow down the glow
   * effect rendering, even if previous levels aren't enabled.
   */
  public final fun setGlowLevel(idx: Int, intensity: Float): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), DOUBLE to intensity.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGlowLevelPtr, NIL)
  }

  /**
   * Returns the intensity of the glow level [idx].
   */
  public final fun getGlowLevel(idx: Int): Float {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getGlowLevelPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGlowNormalized(normalize: Boolean): Unit {
    TransferContext.writeArguments(BOOL to normalize)
    TransferContext.callMethod(ptr, MethodBindings.setGlowNormalizedPtr, NIL)
  }

  public final fun isGlowNormalized(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isGlowNormalizedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setGlowIntensity(intensity: Float): Unit {
    TransferContext.writeArguments(DOUBLE to intensity.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGlowIntensityPtr, NIL)
  }

  public final fun getGlowIntensity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlowIntensityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGlowStrength(strength: Float): Unit {
    TransferContext.writeArguments(DOUBLE to strength.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGlowStrengthPtr, NIL)
  }

  public final fun getGlowStrength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlowStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGlowMix(mix: Float): Unit {
    TransferContext.writeArguments(DOUBLE to mix.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGlowMixPtr, NIL)
  }

  public final fun getGlowMix(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlowMixPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGlowBloom(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGlowBloomPtr, NIL)
  }

  public final fun getGlowBloom(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlowBloomPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGlowBlendMode(mode: GlowBlendMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setGlowBlendModePtr, NIL)
  }

  public final fun getGlowBlendMode(): GlowBlendMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlowBlendModePtr, LONG)
    return Environment.GlowBlendMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setGlowHdrBleedThreshold(threshold: Float): Unit {
    TransferContext.writeArguments(DOUBLE to threshold.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGlowHdrBleedThresholdPtr, NIL)
  }

  public final fun getGlowHdrBleedThreshold(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlowHdrBleedThresholdPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGlowHdrBleedScale(scale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to scale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGlowHdrBleedScalePtr, NIL)
  }

  public final fun getGlowHdrBleedScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlowHdrBleedScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGlowHdrLuminanceCap(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGlowHdrLuminanceCapPtr, NIL)
  }

  public final fun getGlowHdrLuminanceCap(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlowHdrLuminanceCapPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGlowMapStrength(strength: Float): Unit {
    TransferContext.writeArguments(DOUBLE to strength.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGlowMapStrengthPtr, NIL)
  }

  public final fun getGlowMapStrength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlowMapStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGlowMap(mode: Texture?): Unit {
    TransferContext.writeArguments(OBJECT to mode)
    TransferContext.callMethod(ptr, MethodBindings.setGlowMapPtr, NIL)
  }

  public final fun getGlowMap(): Texture? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlowMapPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture?)
  }

  public final fun setFogEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setFogEnabledPtr, NIL)
  }

  public final fun isFogEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isFogEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFogMode(mode: FogMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setFogModePtr, NIL)
  }

  public final fun getFogMode(): FogMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFogModePtr, LONG)
    return Environment.FogMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setFogLightColor(lightColor: Color): Unit {
    TransferContext.writeArguments(COLOR to lightColor)
    TransferContext.callMethod(ptr, MethodBindings.setFogLightColorPtr, NIL)
  }

  public final fun getFogLightColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFogLightColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setFogLightEnergy(lightEnergy: Float): Unit {
    TransferContext.writeArguments(DOUBLE to lightEnergy.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFogLightEnergyPtr, NIL)
  }

  public final fun getFogLightEnergy(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFogLightEnergyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFogSunScatter(sunScatter: Float): Unit {
    TransferContext.writeArguments(DOUBLE to sunScatter.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFogSunScatterPtr, NIL)
  }

  public final fun getFogSunScatter(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFogSunScatterPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFogDensity(density: Float): Unit {
    TransferContext.writeArguments(DOUBLE to density.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFogDensityPtr, NIL)
  }

  public final fun getFogDensity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFogDensityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFogHeight(height: Float): Unit {
    TransferContext.writeArguments(DOUBLE to height.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFogHeightPtr, NIL)
  }

  public final fun getFogHeight(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFogHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFogHeightDensity(heightDensity: Float): Unit {
    TransferContext.writeArguments(DOUBLE to heightDensity.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFogHeightDensityPtr, NIL)
  }

  public final fun getFogHeightDensity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFogHeightDensityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFogAerialPerspective(aerialPerspective: Float): Unit {
    TransferContext.writeArguments(DOUBLE to aerialPerspective.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFogAerialPerspectivePtr, NIL)
  }

  public final fun getFogAerialPerspective(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFogAerialPerspectivePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFogSkyAffect(skyAffect: Float): Unit {
    TransferContext.writeArguments(DOUBLE to skyAffect.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFogSkyAffectPtr, NIL)
  }

  public final fun getFogSkyAffect(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFogSkyAffectPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFogDepthCurve(curve: Float): Unit {
    TransferContext.writeArguments(DOUBLE to curve.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFogDepthCurvePtr, NIL)
  }

  public final fun getFogDepthCurve(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFogDepthCurvePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFogDepthBegin(begin: Float): Unit {
    TransferContext.writeArguments(DOUBLE to begin.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFogDepthBeginPtr, NIL)
  }

  public final fun getFogDepthBegin(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFogDepthBeginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFogDepthEnd(end: Float): Unit {
    TransferContext.writeArguments(DOUBLE to end.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFogDepthEndPtr, NIL)
  }

  public final fun getFogDepthEnd(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFogDepthEndPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVolumetricFogEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setVolumetricFogEnabledPtr, NIL)
  }

  public final fun isVolumetricFogEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isVolumetricFogEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setVolumetricFogEmission(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setVolumetricFogEmissionPtr, NIL)
  }

  public final fun getVolumetricFogEmission(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVolumetricFogEmissionPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setVolumetricFogAlbedo(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setVolumetricFogAlbedoPtr, NIL)
  }

  public final fun getVolumetricFogAlbedo(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVolumetricFogAlbedoPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setVolumetricFogDensity(density: Float): Unit {
    TransferContext.writeArguments(DOUBLE to density.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVolumetricFogDensityPtr, NIL)
  }

  public final fun getVolumetricFogDensity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVolumetricFogDensityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVolumetricFogEmissionEnergy(begin: Float): Unit {
    TransferContext.writeArguments(DOUBLE to begin.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVolumetricFogEmissionEnergyPtr, NIL)
  }

  public final fun getVolumetricFogEmissionEnergy(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVolumetricFogEmissionEnergyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVolumetricFogAnisotropy(anisotropy: Float): Unit {
    TransferContext.writeArguments(DOUBLE to anisotropy.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVolumetricFogAnisotropyPtr, NIL)
  }

  public final fun getVolumetricFogAnisotropy(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVolumetricFogAnisotropyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVolumetricFogLength(length: Float): Unit {
    TransferContext.writeArguments(DOUBLE to length.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVolumetricFogLengthPtr, NIL)
  }

  public final fun getVolumetricFogLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVolumetricFogLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVolumetricFogDetailSpread(detailSpread: Float): Unit {
    TransferContext.writeArguments(DOUBLE to detailSpread.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVolumetricFogDetailSpreadPtr, NIL)
  }

  public final fun getVolumetricFogDetailSpread(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVolumetricFogDetailSpreadPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVolumetricFogGiInject(giInject: Float): Unit {
    TransferContext.writeArguments(DOUBLE to giInject.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVolumetricFogGiInjectPtr, NIL)
  }

  public final fun getVolumetricFogGiInject(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVolumetricFogGiInjectPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVolumetricFogAmbientInject(enabled: Float): Unit {
    TransferContext.writeArguments(DOUBLE to enabled.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVolumetricFogAmbientInjectPtr, NIL)
  }

  public final fun getVolumetricFogAmbientInject(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVolumetricFogAmbientInjectPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVolumetricFogSkyAffect(skyAffect: Float): Unit {
    TransferContext.writeArguments(DOUBLE to skyAffect.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVolumetricFogSkyAffectPtr, NIL)
  }

  public final fun getVolumetricFogSkyAffect(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVolumetricFogSkyAffectPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVolumetricFogTemporalReprojectionEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setVolumetricFogTemporalReprojectionEnabledPtr,
        NIL)
  }

  public final fun isVolumetricFogTemporalReprojectionEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isVolumetricFogTemporalReprojectionEnabledPtr,
        BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setVolumetricFogTemporalReprojectionAmount(temporalReprojectionAmount: Float):
      Unit {
    TransferContext.writeArguments(DOUBLE to temporalReprojectionAmount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVolumetricFogTemporalReprojectionAmountPtr,
        NIL)
  }

  public final fun getVolumetricFogTemporalReprojectionAmount(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVolumetricFogTemporalReprojectionAmountPtr,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAdjustmentEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setAdjustmentEnabledPtr, NIL)
  }

  public final fun isAdjustmentEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isAdjustmentEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAdjustmentBrightness(brightness: Float): Unit {
    TransferContext.writeArguments(DOUBLE to brightness.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAdjustmentBrightnessPtr, NIL)
  }

  public final fun getAdjustmentBrightness(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAdjustmentBrightnessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAdjustmentContrast(contrast: Float): Unit {
    TransferContext.writeArguments(DOUBLE to contrast.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAdjustmentContrastPtr, NIL)
  }

  public final fun getAdjustmentContrast(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAdjustmentContrastPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAdjustmentSaturation(saturation: Float): Unit {
    TransferContext.writeArguments(DOUBLE to saturation.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAdjustmentSaturationPtr, NIL)
  }

  public final fun getAdjustmentSaturation(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAdjustmentSaturationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAdjustmentColorCorrection(colorCorrection: Texture?): Unit {
    TransferContext.writeArguments(OBJECT to colorCorrection)
    TransferContext.callMethod(ptr, MethodBindings.setAdjustmentColorCorrectionPtr, NIL)
  }

  public final fun getAdjustmentColorCorrection(): Texture? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAdjustmentColorCorrectionPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture?)
  }

  public enum class BGMode(
    id: Long,
  ) {
    /**
     * Clears the background using the clear color defined in
     * [ProjectSettings.rendering/environment/defaults/defaultClearColor].
     */
    BG_CLEAR_COLOR(0),
    /**
     * Clears the background using a custom clear color.
     */
    BG_COLOR(1),
    /**
     * Displays a user-defined sky in the background.
     */
    BG_SKY(2),
    /**
     * Displays a [CanvasLayer] in the background.
     */
    BG_CANVAS(3),
    /**
     * Keeps on screen every pixel drawn in the background. This is the fastest background mode, but
     * it can only be safely used in fully-interior scenes (no visible sky or sky reflections). If
     * enabled in a scene where the background is visible, "ghost trail" artifacts will be visible when
     * moving the camera.
     */
    BG_KEEP(4),
    /**
     * Displays a camera feed in the background.
     */
    BG_CAMERA_FEED(5),
    /**
     * Represents the size of the [BGMode] enum.
     */
    BG_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BGMode = entries.single { it.id == `value` }
    }
  }

  public enum class AmbientSource(
    id: Long,
  ) {
    /**
     * Gather ambient light from whichever source is specified as the background.
     */
    AMBIENT_SOURCE_BG(0),
    /**
     * Disable ambient light. This provides a slight performance boost over [AMBIENT_SOURCE_SKY].
     */
    AMBIENT_SOURCE_DISABLED(1),
    /**
     * Specify a specific [Color] for ambient light. This provides a slight performance boost over
     * [AMBIENT_SOURCE_SKY].
     */
    AMBIENT_SOURCE_COLOR(2),
    /**
     * Gather ambient light from the [Sky] regardless of what the background is.
     */
    AMBIENT_SOURCE_SKY(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AmbientSource = entries.single { it.id == `value` }
    }
  }

  public enum class ReflectionSource(
    id: Long,
  ) {
    /**
     * Use the background for reflections.
     */
    REFLECTION_SOURCE_BG(0),
    /**
     * Disable reflections. This provides a slight performance boost over other options.
     */
    REFLECTION_SOURCE_DISABLED(1),
    /**
     * Use the [Sky] for reflections regardless of what the background is.
     */
    REFLECTION_SOURCE_SKY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ReflectionSource = entries.single { it.id == `value` }
    }
  }

  public enum class ToneMapper(
    id: Long,
  ) {
    /**
     * Linear tonemapper operator. Reads the linear data and passes it on unmodified. This can cause
     * bright lighting to look blown out, with noticeable clipping in the output colors.
     */
    TONE_MAPPER_LINEAR(0),
    /**
     * Reinhardt tonemapper operator. Performs a variation on rendered pixels' colors by this
     * formula: `color = color / (1 + color)`. This avoids clipping bright highlights, but the
     * resulting image can look a bit dull.
     */
    TONE_MAPPER_REINHARDT(1),
    /**
     * Filmic tonemapper operator. This avoids clipping bright highlights, with a resulting image
     * that usually looks more vivid than [TONE_MAPPER_REINHARDT].
     */
    TONE_MAPPER_FILMIC(2),
    /**
     * Use the Academy Color Encoding System tonemapper. ACES is slightly more expensive than other
     * options, but it handles bright lighting in a more realistic fashion by desaturating it as it
     * becomes brighter. ACES typically has a more contrasted output compared to
     * [TONE_MAPPER_REINHARDT] and [TONE_MAPPER_FILMIC].
     * **Note:** This tonemapping operator is called "ACES Fitted" in Godot 3.x.
     */
    TONE_MAPPER_ACES(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ToneMapper = entries.single { it.id == `value` }
    }
  }

  public enum class GlowBlendMode(
    id: Long,
  ) {
    /**
     * Additive glow blending mode. Mostly used for particles, glows (bloom), lens flare, bright
     * sources.
     */
    GLOW_BLEND_MODE_ADDITIVE(0),
    /**
     * Screen glow blending mode. Increases brightness, used frequently with bloom.
     */
    GLOW_BLEND_MODE_SCREEN(1),
    /**
     * Soft light glow blending mode. Modifies contrast, exposes shadows and highlights (vivid
     * bloom).
     */
    GLOW_BLEND_MODE_SOFTLIGHT(2),
    /**
     * Replace glow blending mode. Replaces all pixels' color by the glow value. This can be used to
     * simulate a full-screen blur effect by tweaking the glow parameters to match the original image's
     * brightness.
     */
    GLOW_BLEND_MODE_REPLACE(3),
    /**
     * Mixes the glow with the underlying color to avoid increasing brightness as much while still
     * maintaining a glow effect.
     */
    GLOW_BLEND_MODE_MIX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): GlowBlendMode = entries.single { it.id == `value` }
    }
  }

  public enum class FogMode(
    id: Long,
  ) {
    /**
     * Use a physically-based fog model defined primarily by fog density.
     */
    FOG_MODE_EXPONENTIAL(0),
    /**
     * Use a simple fog model defined by start and end positions and a custom curve. While not
     * physically accurate, this model can be useful when you need more artistic control.
     */
    FOG_MODE_DEPTH(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FogMode = entries.single { it.id == `value` }
    }
  }

  public enum class SDFGIYScale(
    id: Long,
  ) {
    /**
     * Use 50&#37; scale for SDFGI on the Y (vertical) axis. SDFGI cells will be twice as short as
     * they are wide. This allows providing increased GI detail and reduced light leaking with thin
     * floors and ceilings. This is usually the best choice for scenes that don't feature much
     * verticality.
     */
    SDFGI_Y_SCALE_50_PERCENT(0),
    /**
     * Use 75&#37; scale for SDFGI on the Y (vertical) axis. This is a balance between the 50&#37;
     * and 100&#37; SDFGI Y scales.
     */
    SDFGI_Y_SCALE_75_PERCENT(1),
    /**
     * Use 100&#37; scale for SDFGI on the Y (vertical) axis. SDFGI cells will be as tall as they
     * are wide. This is usually the best choice for highly vertical scenes. The downside is that light
     * leaking may become more noticeable with thin floors and ceilings.
     */
    SDFGI_Y_SCALE_100_PERCENT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SDFGIYScale = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setBackgroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_background", 4071623990)

    public val getBackgroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_background", 1843210413)

    public val setSkyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sky", 3336722921)

    public val getSkyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sky", 1177136966)

    public val setSkyCustomFovPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sky_custom_fov", 373806689)

    public val getSkyCustomFovPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sky_custom_fov", 1740695150)

    public val setSkyRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sky_rotation", 3460891852)

    public val getSkyRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sky_rotation", 3360562783)

    public val setBgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_bg_color", 2920490490)

    public val getBgColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_bg_color", 3444240500)

    public val setBgEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_bg_energy_multiplier", 373806689)

    public val getBgEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_bg_energy_multiplier", 1740695150)

    public val setBgIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_bg_intensity", 373806689)

    public val getBgIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_bg_intensity", 1740695150)

    public val setCanvasMaxLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_canvas_max_layer", 1286410249)

    public val getCanvasMaxLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_canvas_max_layer", 3905245786)

    public val setCameraFeedIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_camera_feed_id", 1286410249)

    public val getCameraFeedIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_camera_feed_id", 3905245786)

    public val setAmbientLightColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ambient_light_color", 2920490490)

    public val getAmbientLightColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ambient_light_color", 3444240500)

    public val setAmbientSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ambient_source", 2607780160)

    public val getAmbientSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ambient_source", 67453933)

    public val setAmbientLightEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ambient_light_energy", 373806689)

    public val getAmbientLightEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ambient_light_energy", 1740695150)

    public val setAmbientLightSkyContributionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ambient_light_sky_contribution", 373806689)

    public val getAmbientLightSkyContributionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ambient_light_sky_contribution", 1740695150)

    public val setReflectionSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_reflection_source", 299673197)

    public val getReflectionSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_reflection_source", 777700713)

    public val setTonemapperPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_tonemapper", 1509116664)

    public val getTonemapperPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_tonemapper", 2908408137)

    public val setTonemapExposurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_tonemap_exposure", 373806689)

    public val getTonemapExposurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_tonemap_exposure", 1740695150)

    public val setTonemapWhitePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_tonemap_white", 373806689)

    public val getTonemapWhitePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_tonemap_white", 1740695150)

    public val setSsrEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssr_enabled", 2586408642)

    public val isSsrEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_ssr_enabled", 36873697)

    public val setSsrMaxStepsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssr_max_steps", 1286410249)

    public val getSsrMaxStepsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssr_max_steps", 3905245786)

    public val setSsrFadeInPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssr_fade_in", 373806689)

    public val getSsrFadeInPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssr_fade_in", 1740695150)

    public val setSsrFadeOutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssr_fade_out", 373806689)

    public val getSsrFadeOutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssr_fade_out", 1740695150)

    public val setSsrDepthTolerancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssr_depth_tolerance", 373806689)

    public val getSsrDepthTolerancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssr_depth_tolerance", 1740695150)

    public val setSsaoEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_enabled", 2586408642)

    public val isSsaoEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_ssao_enabled", 36873697)

    public val setSsaoRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_radius", 373806689)

    public val getSsaoRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_radius", 1740695150)

    public val setSsaoIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_intensity", 373806689)

    public val getSsaoIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_intensity", 1740695150)

    public val setSsaoPowerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_power", 373806689)

    public val getSsaoPowerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_power", 1740695150)

    public val setSsaoDetailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_detail", 373806689)

    public val getSsaoDetailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_detail", 1740695150)

    public val setSsaoHorizonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_horizon", 373806689)

    public val getSsaoHorizonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_horizon", 1740695150)

    public val setSsaoSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_sharpness", 373806689)

    public val getSsaoSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_sharpness", 1740695150)

    public val setSsaoDirectLightAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_direct_light_affect", 373806689)

    public val getSsaoDirectLightAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_direct_light_affect", 1740695150)

    public val setSsaoAoChannelAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_ao_channel_affect", 373806689)

    public val getSsaoAoChannelAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_ao_channel_affect", 1740695150)

    public val setSsilEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssil_enabled", 2586408642)

    public val isSsilEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_ssil_enabled", 36873697)

    public val setSsilRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssil_radius", 373806689)

    public val getSsilRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssil_radius", 1740695150)

    public val setSsilIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssil_intensity", 373806689)

    public val getSsilIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssil_intensity", 1740695150)

    public val setSsilSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssil_sharpness", 373806689)

    public val getSsilSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssil_sharpness", 1740695150)

    public val setSsilNormalRejectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssil_normal_rejection", 373806689)

    public val getSsilNormalRejectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssil_normal_rejection", 1740695150)

    public val setSdfgiEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_enabled", 2586408642)

    public val isSdfgiEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_sdfgi_enabled", 36873697)

    public val setSdfgiCascadesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_cascades", 1286410249)

    public val getSdfgiCascadesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_cascades", 3905245786)

    public val setSdfgiMinCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_min_cell_size", 373806689)

    public val getSdfgiMinCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_min_cell_size", 1740695150)

    public val setSdfgiMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_max_distance", 373806689)

    public val getSdfgiMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_max_distance", 1740695150)

    public val setSdfgiCascade0DistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_cascade0_distance", 373806689)

    public val getSdfgiCascade0DistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_cascade0_distance", 1740695150)

    public val setSdfgiYScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_y_scale", 3608608372)

    public val getSdfgiYScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_y_scale", 2568002245)

    public val setSdfgiUseOcclusionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_use_occlusion", 2586408642)

    public val isSdfgiUsingOcclusionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_sdfgi_using_occlusion", 36873697)

    public val setSdfgiBounceFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_bounce_feedback", 373806689)

    public val getSdfgiBounceFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_bounce_feedback", 1740695150)

    public val setSdfgiReadSkyLightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_read_sky_light", 2586408642)

    public val isSdfgiReadingSkyLightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_sdfgi_reading_sky_light", 36873697)

    public val setSdfgiEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_energy", 373806689)

    public val getSdfgiEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_energy", 1740695150)

    public val setSdfgiNormalBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_normal_bias", 373806689)

    public val getSdfgiNormalBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_normal_bias", 1740695150)

    public val setSdfgiProbeBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_probe_bias", 373806689)

    public val getSdfgiProbeBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_probe_bias", 1740695150)

    public val setGlowEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_enabled", 2586408642)

    public val isGlowEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_glow_enabled", 36873697)

    public val setGlowLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_level", 1602489585)

    public val getGlowLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_level", 2339986948)

    public val setGlowNormalizedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_normalized", 2586408642)

    public val isGlowNormalizedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_glow_normalized", 36873697)

    public val setGlowIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_intensity", 373806689)

    public val getGlowIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_intensity", 1740695150)

    public val setGlowStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_strength", 373806689)

    public val getGlowStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_strength", 1740695150)

    public val setGlowMixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_mix", 373806689)

    public val getGlowMixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_mix", 1740695150)

    public val setGlowBloomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_bloom", 373806689)

    public val getGlowBloomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_bloom", 1740695150)

    public val setGlowBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_blend_mode", 2561587761)

    public val getGlowBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_blend_mode", 1529667332)

    public val setGlowHdrBleedThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_hdr_bleed_threshold", 373806689)

    public val getGlowHdrBleedThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_hdr_bleed_threshold", 1740695150)

    public val setGlowHdrBleedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_hdr_bleed_scale", 373806689)

    public val getGlowHdrBleedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_hdr_bleed_scale", 1740695150)

    public val setGlowHdrLuminanceCapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_hdr_luminance_cap", 373806689)

    public val getGlowHdrLuminanceCapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_hdr_luminance_cap", 1740695150)

    public val setGlowMapStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_map_strength", 373806689)

    public val getGlowMapStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_map_strength", 1740695150)

    public val setGlowMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_map", 1790811099)

    public val getGlowMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_map", 4037048985)

    public val setFogEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_enabled", 2586408642)

    public val isFogEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_fog_enabled", 36873697)

    public val setFogModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_mode", 3059806579)

    public val getFogModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_mode", 2456062483)

    public val setFogLightColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_light_color", 2920490490)

    public val getFogLightColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_light_color", 3444240500)

    public val setFogLightEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_light_energy", 373806689)

    public val getFogLightEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_light_energy", 1740695150)

    public val setFogSunScatterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_sun_scatter", 373806689)

    public val getFogSunScatterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_sun_scatter", 1740695150)

    public val setFogDensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_density", 373806689)

    public val getFogDensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_density", 1740695150)

    public val setFogHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_height", 373806689)

    public val getFogHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_height", 1740695150)

    public val setFogHeightDensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_height_density", 373806689)

    public val getFogHeightDensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_height_density", 1740695150)

    public val setFogAerialPerspectivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_aerial_perspective", 373806689)

    public val getFogAerialPerspectivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_aerial_perspective", 1740695150)

    public val setFogSkyAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_sky_affect", 373806689)

    public val getFogSkyAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_sky_affect", 1740695150)

    public val setFogDepthCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_depth_curve", 373806689)

    public val getFogDepthCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_depth_curve", 1740695150)

    public val setFogDepthBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_depth_begin", 373806689)

    public val getFogDepthBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_depth_begin", 1740695150)

    public val setFogDepthEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_depth_end", 373806689)

    public val getFogDepthEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_depth_end", 1740695150)

    public val setVolumetricFogEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_enabled", 2586408642)

    public val isVolumetricFogEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_volumetric_fog_enabled", 36873697)

    public val setVolumetricFogEmissionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_emission", 2920490490)

    public val getVolumetricFogEmissionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_emission", 3444240500)

    public val setVolumetricFogAlbedoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_albedo", 2920490490)

    public val getVolumetricFogAlbedoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_albedo", 3444240500)

    public val setVolumetricFogDensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_density", 373806689)

    public val getVolumetricFogDensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_density", 1740695150)

    public val setVolumetricFogEmissionEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_emission_energy", 373806689)

    public val getVolumetricFogEmissionEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_emission_energy", 1740695150)

    public val setVolumetricFogAnisotropyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_anisotropy", 373806689)

    public val getVolumetricFogAnisotropyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_anisotropy", 1740695150)

    public val setVolumetricFogLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_length", 373806689)

    public val getVolumetricFogLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_length", 1740695150)

    public val setVolumetricFogDetailSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_detail_spread", 373806689)

    public val getVolumetricFogDetailSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_detail_spread", 1740695150)

    public val setVolumetricFogGiInjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_gi_inject", 373806689)

    public val getVolumetricFogGiInjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_gi_inject", 1740695150)

    public val setVolumetricFogAmbientInjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_ambient_inject", 373806689)

    public val getVolumetricFogAmbientInjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_ambient_inject", 1740695150)

    public val setVolumetricFogSkyAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_sky_affect", 373806689)

    public val getVolumetricFogSkyAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_sky_affect", 1740695150)

    public val setVolumetricFogTemporalReprojectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_temporal_reprojection_enabled", 2586408642)

    public val isVolumetricFogTemporalReprojectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_volumetric_fog_temporal_reprojection_enabled", 36873697)

    public val setVolumetricFogTemporalReprojectionAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_temporal_reprojection_amount", 373806689)

    public val getVolumetricFogTemporalReprojectionAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_temporal_reprojection_amount", 1740695150)

    public val setAdjustmentEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_adjustment_enabled", 2586408642)

    public val isAdjustmentEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_adjustment_enabled", 36873697)

    public val setAdjustmentBrightnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_adjustment_brightness", 373806689)

    public val getAdjustmentBrightnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_adjustment_brightness", 1740695150)

    public val setAdjustmentContrastPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_adjustment_contrast", 373806689)

    public val getAdjustmentContrastPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_adjustment_contrast", 1740695150)

    public val setAdjustmentSaturationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_adjustment_saturation", 373806689)

    public val getAdjustmentSaturationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_adjustment_saturation", 1740695150)

    public val setAdjustmentColorCorrectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_adjustment_color_correction", 1790811099)

    public val getAdjustmentColorCorrectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_adjustment_color_correction", 4037048985)
  }
}

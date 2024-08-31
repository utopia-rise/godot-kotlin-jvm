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
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

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
  public var backgroundMode: BGMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBackgroundPtr, LONG)
      return Environment.BGMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBackgroundPtr, NIL)
    }

  /**
   * The [Color] displayed for clear areas of the scene. Only effective when using the [BG_COLOR]
   * background mode.
   */
  @CoreTypeLocalCopy
  public var backgroundColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBgColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBgColorPtr, NIL)
    }

  /**
   * Multiplier for background energy. Increase to make background brighter, decrease to make
   * background dimmer.
   */
  public var backgroundEnergyMultiplier: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBgEnergyMultiplierPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setBgEnergyMultiplierPtr, NIL)
    }

  /**
   * Luminance of background measured in nits (candela per square meter). Only used when
   * [ProjectSettings.rendering/lightsAndShadows/usePhysicalLightUnits] is enabled. The default value
   * is roughly equivalent to the sky at midday.
   */
  public var backgroundIntensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBgIntensityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setBgIntensityPtr, NIL)
    }

  /**
   * The maximum layer ID to display. Only effective when using the [BG_CANVAS] background mode.
   */
  public var backgroundCanvasMaxLayer: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCanvasMaxLayerPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCanvasMaxLayerPtr, NIL)
    }

  /**
   * The ID of the camera feed to show in the background.
   */
  public var backgroundCameraFeedId: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCameraFeedIdPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCameraFeedIdPtr, NIL)
    }

  /**
   * The [Sky] resource used for this [Environment].
   */
  public var sky: Sky?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkyPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Sky?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSkyPtr, NIL)
    }

  /**
   * If set to a value greater than `0.0`, overrides the field of view to use for sky rendering. If
   * set to `0.0`, the same FOV as the current [Camera3D] is used for sky rendering.
   */
  public var skyCustomFov: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkyCustomFovPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSkyCustomFovPtr, NIL)
    }

  /**
   * The rotation to use for sky rendering.
   */
  @CoreTypeLocalCopy
  public var skyRotation: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkyRotationPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSkyRotationPtr, NIL)
    }

  /**
   * The ambient light source to use for rendering materials and global illumination.
   */
  public var ambientLightSource: AmbientSource
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAmbientSourcePtr, LONG)
      return Environment.AmbientSource.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAmbientSourcePtr, NIL)
    }

  /**
   * The ambient light's [Color]. Only effective if [ambientLightSkyContribution] is lower than
   * `1.0` (exclusive).
   */
  @CoreTypeLocalCopy
  public var ambientLightColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAmbientLightColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAmbientLightColorPtr, NIL)
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
  public var ambientLightSkyContribution: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAmbientLightSkyContributionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAmbientLightSkyContributionPtr, NIL)
    }

  /**
   * The ambient light's energy. The higher the value, the stronger the light. Only effective if
   * [ambientLightSkyContribution] is lower than `1.0` (exclusive).
   */
  public var ambientLightEnergy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAmbientLightEnergyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAmbientLightEnergyPtr, NIL)
    }

  /**
   * The reflected (specular) light source.
   */
  public var reflectedLightSource: ReflectionSource
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getReflectionSourcePtr, LONG)
      return Environment.ReflectionSource.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setReflectionSourcePtr, NIL)
    }

  /**
   * The tonemapping mode to use. Tonemapping is the process that "converts" HDR values to be
   * suitable for rendering on an LDR display. (Godot doesn't support rendering on HDR displays yet.)
   */
  public var tonemapMode: ToneMapper
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTonemapperPtr, LONG)
      return Environment.ToneMapper.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTonemapperPtr, NIL)
    }

  /**
   * The default exposure used for tonemapping. Higher values result in a brighter image. See also
   * [tonemapWhite].
   */
  public var tonemapExposure: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTonemapExposurePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTonemapExposurePtr, NIL)
    }

  /**
   * The white reference value for tonemapping (also called "whitepoint"). Higher values can make
   * highlights look less blown out, and will also slightly darken the whole scene as a result. Only
   * effective if the [tonemapMode] isn't set to [TONE_MAPPER_LINEAR]. See also [tonemapExposure].
   */
  public var tonemapWhite: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTonemapWhitePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTonemapWhitePtr, NIL)
    }

  /**
   * If `true`, screen-space reflections are enabled. Screen-space reflections are more accurate
   * than reflections from [VoxelGI]s or [ReflectionProbe]s, but are slower and can't reflect surfaces
   * occluded by others.
   * **Note:** SSR is only supported in the Forward+ rendering method, not Mobile or Compatibility.
   */
  public var ssrEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSsrEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSsrEnabledPtr, NIL)
    }

  /**
   * The maximum number of steps for screen-space reflections. Higher values are slower.
   */
  public var ssrMaxSteps: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsrMaxStepsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsrMaxStepsPtr, NIL)
    }

  /**
   * The fade-in distance for screen-space reflections. Affects the area from the reflected material
   * to the screen-space reflection. Only positive values are valid (negative values will be clamped to
   * `0.0`).
   */
  public var ssrFadeIn: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsrFadeInPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsrFadeInPtr, NIL)
    }

  /**
   * The fade-out distance for screen-space reflections. Affects the area from the screen-space
   * reflection to the "global" reflection. Only positive values are valid (negative values will be
   * clamped to `0.0`).
   */
  public var ssrFadeOut: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsrFadeOutPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsrFadeOutPtr, NIL)
    }

  /**
   * The depth tolerance for screen-space reflections.
   */
  public var ssrDepthTolerance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsrDepthTolerancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsrDepthTolerancePtr, NIL)
    }

  /**
   * If `true`, the screen-space ambient occlusion effect is enabled. This darkens objects' corners
   * and cavities to simulate ambient light not reaching the entire object as in real life. This works
   * well for small, dynamic objects, but baked lighting or ambient occlusion textures will do a better
   * job at displaying ambient occlusion on large static objects. Godot uses a form of SSAO called
   * Adaptive Screen Space Ambient Occlusion which is itself a form of Horizon Based Ambient Occlusion.
   * **Note:** SSAO is only supported in the Forward+ rendering method, not Mobile or Compatibility.
   */
  public var ssaoEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSsaoEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSsaoEnabledPtr, NIL)
    }

  /**
   * The distance at which objects can occlude each other when calculating screen-space ambient
   * occlusion. Higher values will result in occlusion over a greater distance at the cost of
   * performance and quality.
   */
  public var ssaoRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsaoRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsaoRadiusPtr, NIL)
    }

  /**
   * The primary screen-space ambient occlusion intensity. Acts as a multiplier for the screen-space
   * ambient occlusion effect. A higher value results in darker occlusion.
   */
  public var ssaoIntensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsaoIntensityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsaoIntensityPtr, NIL)
    }

  /**
   * The distribution of occlusion. A higher value results in darker occlusion, similar to
   * [ssaoIntensity], but with a sharper falloff.
   */
  public var ssaoPower: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsaoPowerPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsaoPowerPtr, NIL)
    }

  /**
   * Sets the strength of the additional level of detail for the screen-space ambient occlusion
   * effect. A high value makes the detail pass more prominent, but it may contribute to aliasing in
   * your final image.
   */
  public var ssaoDetail: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsaoDetailPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsaoDetailPtr, NIL)
    }

  /**
   * The threshold for considering whether a given point on a surface is occluded or not represented
   * as an angle from the horizon mapped into the `0.0-1.0` range. A value of `1.0` results in no
   * occlusion.
   */
  public var ssaoHorizon: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsaoHorizonPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsaoHorizonPtr, NIL)
    }

  /**
   * The amount that the screen-space ambient occlusion effect is allowed to blur over the edges of
   * objects. Setting too high will result in aliasing around the edges of objects. Setting too low
   * will make object edges appear blurry.
   */
  public var ssaoSharpness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsaoSharpnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsaoSharpnessPtr, NIL)
    }

  /**
   * The screen-space ambient occlusion intensity in direct light. In real life, ambient occlusion
   * only applies to indirect light, which means its effects can't be seen in direct light. Values
   * higher than `0` will make the SSAO effect visible in direct light.
   */
  public var ssaoLightAffect: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsaoDirectLightAffectPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsaoDirectLightAffectPtr, NIL)
    }

  /**
   * The screen-space ambient occlusion intensity on materials that have an AO texture defined.
   * Values higher than `0` will make the SSAO effect visible in areas darkened by AO textures.
   */
  public var ssaoAoChannelAffect: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsaoAoChannelAffectPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsaoAoChannelAffectPtr, NIL)
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
  public var ssilEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSsilEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSsilEnabledPtr, NIL)
    }

  /**
   * The distance that bounced lighting can travel when using the screen space indirect lighting
   * effect. A larger value will result in light bouncing further in a scene, but may result in
   * under-sampling artifacts which look like long spikes surrounding light sources.
   */
  public var ssilRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsilRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsilRadiusPtr, NIL)
    }

  /**
   * The brightness multiplier for the screen-space indirect lighting effect. A higher value will
   * result in brighter light.
   */
  public var ssilIntensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsilIntensityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsilIntensityPtr, NIL)
    }

  /**
   * The amount that the screen-space indirect lighting effect is allowed to blur over the edges of
   * objects. Setting too high will result in aliasing around the edges of objects. Setting too low
   * will make object edges appear blurry.
   */
  public var ssilSharpness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsilSharpnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsilSharpnessPtr, NIL)
    }

  /**
   * Amount of normal rejection used when calculating screen-space indirect lighting. Normal
   * rejection uses the normal of a given sample point to reject samples that are facing away from the
   * current pixel. Normal rejection is necessary to avoid light leaking when only one side of an
   * object is illuminated. However, normal rejection can be disabled if light leaking is desirable,
   * such as when the scene mostly contains emissive objects that emit light from faces that cannot be
   * seen from the camera.
   */
  public var ssilNormalRejection: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSsilNormalRejectionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSsilNormalRejectionPtr, NIL)
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
  public var sdfgiEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSdfgiEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiEnabledPtr, NIL)
    }

  /**
   * If `true`, SDFGI uses an occlusion detection approach to reduce light leaking. Occlusion may
   * however introduce dark blotches in certain spots, which may be undesired in mostly outdoor scenes.
   * [sdfgiUseOcclusion] has a performance impact and should only be enabled when needed.
   */
  public var sdfgiUseOcclusion: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSdfgiUsingOcclusionPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiUseOcclusionPtr, NIL)
    }

  /**
   * If `true`, SDFGI takes the environment lighting into account. This should be set to `false` for
   * interior scenes.
   */
  public var sdfgiReadSkyLight: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSdfgiReadingSkyLightPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiReadSkyLightPtr, NIL)
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
  public var sdfgiBounceFeedback: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfgiBounceFeedbackPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiBounceFeedbackPtr, NIL)
    }

  /**
   * The number of cascades to use for SDFGI (between 1 and 8). A higher number of cascades allows
   * displaying SDFGI further away while preserving detail up close, at the cost of performance. When
   * using SDFGI on small-scale levels, [sdfgiCascades] can often be decreased between `1` and `4` to
   * improve performance.
   */
  public var sdfgiCascades: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfgiCascadesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiCascadesPtr, NIL)
    }

  /**
   * The cell size to use for the closest SDFGI cascade (in 3D units). Lower values allow SDFGI to
   * be more precise up close, at the cost of making SDFGI updates more demanding. This can cause
   * stuttering when the camera moves fast. Higher values allow SDFGI to cover more ground, while also
   * reducing the performance impact of SDFGI updates.
   * **Note:** This property is linked to [sdfgiMaxDistance] and [sdfgiCascade0Distance]. Changing
   * its value will automatically change those properties as well.
   */
  public var sdfgiMinCellSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfgiMinCellSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiMinCellSizePtr, NIL)
    }

  /**
   * **Note:** This property is linked to [sdfgiMinCellSize] and [sdfgiMaxDistance]. Changing its
   * value will automatically change those properties as well.
   */
  public var sdfgiCascade0Distance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfgiCascade0DistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiCascade0DistancePtr, NIL)
    }

  /**
   * The maximum distance at which SDFGI is visible. Beyond this distance, environment lighting or
   * other sources of GI such as [ReflectionProbe] will be used as a fallback.
   * **Note:** This property is linked to [sdfgiMinCellSize] and [sdfgiCascade0Distance]. Changing
   * its value will automatically change those properties as well.
   */
  public var sdfgiMaxDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfgiMaxDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiMaxDistancePtr, NIL)
    }

  /**
   * The Y scale to use for SDFGI cells. Lower values will result in SDFGI cells being packed
   * together more closely on the Y axis. This is used to balance between quality and covering a lot of
   * vertical ground. [sdfgiYScale] should be set depending on how vertical your scene is (and how fast
   * your camera may move on the Y axis).
   */
  public var sdfgiYScale: SDFGIYScale
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfgiYScalePtr, LONG)
      return Environment.SDFGIYScale.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiYScalePtr, NIL)
    }

  /**
   * The energy multiplier to use for SDFGI. Higher values will result in brighter indirect lighting
   * and reflections. See also [sdfgiBounceFeedback].
   */
  public var sdfgiEnergy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfgiEnergyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiEnergyPtr, NIL)
    }

  /**
   * The normal bias to use for SDFGI probes. Increasing this value can reduce visible streaking
   * artifacts on sloped surfaces, at the cost of increased light leaking.
   */
  public var sdfgiNormalBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfgiNormalBiasPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiNormalBiasPtr, NIL)
    }

  /**
   * The constant bias to use for SDFGI probes. Increasing this value can reduce visible streaking
   * artifacts on sloped surfaces, at the cost of increased light leaking.
   */
  public var sdfgiProbeBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSdfgiProbeBiasPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSdfgiProbeBiasPtr, NIL)
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
  public var glowEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isGlowEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowEnabledPtr, NIL)
    }

  /**
   * If `true`, glow levels will be normalized so that summed together their intensities equal
   * `1.0`.
   * **Note:** [glowNormalized] has no effect when using the Compatibility rendering method, due to
   * this rendering method using a simpler glow implementation optimized for low-end devices.
   */
  public var glowNormalized: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isGlowNormalizedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowNormalizedPtr, NIL)
    }

  /**
   * The overall brightness multiplier of the glow effect. When using the Mobile rendering method
   * (which only supports a lower dynamic range up to `2.0`), this should be increased to `1.5` to
   * compensate.
   */
  public var glowIntensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlowIntensityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowIntensityPtr, NIL)
    }

  /**
   * The strength of the glow effect. This applies as the glow is blurred across the screen and
   * increases the distance and intensity of the blur. When using the Mobile rendering method, this
   * should be increased to compensate for the lower dynamic range.
   * **Note:** [glowStrength] has no effect when using the Compatibility rendering method, due to
   * this rendering method using a simpler glow implementation optimized for low-end devices.
   */
  public var glowStrength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlowStrengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowStrengthPtr, NIL)
    }

  /**
   * When using the [GLOW_BLEND_MODE_MIX] [glowBlendMode], this controls how much the source image
   * is blended with the glow layer. A value of `0.0` makes the glow rendering invisible, while a value
   * of `1.0` is equivalent to [GLOW_BLEND_MODE_REPLACE].
   * **Note:** [glowMix] has no effect when using the Compatibility rendering method, due to this
   * rendering method using a simpler glow implementation optimized for low-end devices.
   */
  public var glowMix: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlowMixPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowMixPtr, NIL)
    }

  /**
   * The bloom's intensity. If set to a value higher than `0`, this will make glow visible in areas
   * darker than the [glowHdrThreshold].
   */
  public var glowBloom: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlowBloomPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowBloomPtr, NIL)
    }

  /**
   * The glow blending mode.
   * **Note:** [glowBlendMode] has no effect when using the Compatibility rendering method, due to
   * this rendering method using a simpler glow implementation optimized for low-end devices.
   */
  public var glowBlendMode: GlowBlendMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlowBlendModePtr, LONG)
      return Environment.GlowBlendMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowBlendModePtr, NIL)
    }

  /**
   * The lower threshold of the HDR glow. When using the Mobile rendering method (which only
   * supports a lower dynamic range up to `2.0`), this may need to be below `1.0` for glow to be
   * visible. A value of `0.9` works well in this case. This value also needs to be decreased below
   * `1.0` when using glow in 2D, as 2D rendering is performed in SDR.
   */
  public var glowHdrThreshold: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlowHdrBleedThresholdPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowHdrBleedThresholdPtr, NIL)
    }

  /**
   * The bleed scale of the HDR glow.
   */
  public var glowHdrScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlowHdrBleedScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowHdrBleedScalePtr, NIL)
    }

  /**
   * The higher threshold of the HDR glow. Areas brighter than this threshold will be clamped for
   * the purposes of the glow effect.
   */
  public var glowHdrLuminanceCap: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlowHdrLuminanceCapPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowHdrLuminanceCapPtr, NIL)
    }

  /**
   * How strong of an impact the [glowMap] should have on the overall glow effect. A strength of
   * `0.0` means the glow map has no effect on the overall glow effect. A strength of `1.0` means the
   * glow has a full effect on the overall glow effect (and can turn off glow entirely in specific
   * areas of the screen if the glow map has black areas).
   * **Note:** [glowMapStrength] has no effect when using the Compatibility rendering method, due to
   * this rendering method using a simpler glow implementation optimized for low-end devices.
   */
  public var glowMapStrength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlowMapStrengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowMapStrengthPtr, NIL)
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
  public var glowMap: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlowMapPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlowMapPtr, NIL)
    }

  /**
   * If `true`, fog effects are enabled.
   */
  public var fogEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFogEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFogEnabledPtr, NIL)
    }

  /**
   * The fog mode. See [FogMode] for possible values.
   */
  public var fogMode: FogMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFogModePtr, LONG)
      return Environment.FogMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFogModePtr, NIL)
    }

  /**
   * The fog's color.
   */
  @CoreTypeLocalCopy
  public var fogLightColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFogLightColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFogLightColorPtr, NIL)
    }

  /**
   * The fog's brightness. Higher values result in brighter fog.
   */
  public var fogLightEnergy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFogLightEnergyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFogLightEnergyPtr, NIL)
    }

  /**
   * If set above `0.0`, renders the scene's directional light(s) in the fog color depending on the
   * view angle. This can be used to give the impression that the sun is "piercing" through the fog.
   */
  public var fogSunScatter: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFogSunScatterPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFogSunScatterPtr, NIL)
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
  public var fogDensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFogDensityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFogDensityPtr, NIL)
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
  public var fogAerialPerspective: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFogAerialPerspectivePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFogAerialPerspectivePtr, NIL)
    }

  /**
   * The factor to use when affecting the sky with non-volumetric fog. `1.0` means that fog can
   * fully obscure the sky. Lower values reduce the impact of fog on sky rendering, with `0.0` not
   * affecting sky rendering at all.
   * **Note:** [fogSkyAffect] has no visual effect if [fogAerialPerspective] is `1.0`.
   */
  public var fogSkyAffect: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFogSkyAffectPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFogSkyAffectPtr, NIL)
    }

  /**
   * The height at which the height fog effect begins.
   */
  public var fogHeight: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFogHeightPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFogHeightPtr, NIL)
    }

  /**
   * The density used to increase fog as height decreases. To make fog increase as height increases,
   * use a negative value.
   */
  public var fogHeightDensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFogHeightDensityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFogHeightDensityPtr, NIL)
    }

  /**
   * The fog depth's intensity curve. A number of presets are available in the Inspector by
   * right-clicking the curve. Only available when [fogMode] is set to [FOG_MODE_DEPTH].
   */
  public var fogDepthCurve: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFogDepthCurvePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFogDepthCurvePtr, NIL)
    }

  /**
   * The fog's depth starting distance from the camera. Only available when [fogMode] is set to
   * [FOG_MODE_DEPTH].
   */
  public var fogDepthBegin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFogDepthBeginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFogDepthBeginPtr, NIL)
    }

  /**
   * The fog's depth end distance from the camera. If this value is set to `0`, it will be equal to
   * the current camera's [Camera3D.far] value. Only available when [fogMode] is set to
   * [FOG_MODE_DEPTH].
   */
  public var fogDepthEnd: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFogDepthEndPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFogDepthEndPtr, NIL)
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
  public var volumetricFogEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isVolumetricFogEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogEnabledPtr, NIL)
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
  public var volumetricFogDensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumetricFogDensityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogDensityPtr, NIL)
    }

  /**
   * The [Color] of the volumetric fog when interacting with lights. Mist and fog have an albedo
   * close to `Color(1, 1, 1, 1)` while smoke has a darker albedo.
   */
  @CoreTypeLocalCopy
  public var volumetricFogAlbedo: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumetricFogAlbedoPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogAlbedoPtr, NIL)
    }

  /**
   * The emitted light from the volumetric fog. Even with emission, volumetric fog will not cast
   * light onto other surfaces. Emission is useful to establish an ambient color. As the volumetric fog
   * effect uses single-scattering only, fog tends to need a little bit of emission to soften the harsh
   * shadows.
   */
  @CoreTypeLocalCopy
  public var volumetricFogEmission: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumetricFogEmissionPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogEmissionPtr, NIL)
    }

  /**
   * The brightness of the emitted light from the volumetric fog.
   */
  public var volumetricFogEmissionEnergy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumetricFogEmissionEnergyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogEmissionEnergyPtr, NIL)
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
  public var volumetricFogGiInject: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumetricFogGiInjectPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogGiInjectPtr, NIL)
    }

  /**
   * The direction of scattered light as it goes through the volumetric fog. A value close to `1.0`
   * means almost all light is scattered forward. A value close to `0.0` means light is scattered
   * equally in all directions. A value close to `-1.0` means light is scattered mostly backward. Fog
   * and mist scatter light slightly forward, while smoke scatters light equally in all directions.
   */
  public var volumetricFogAnisotropy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumetricFogAnisotropyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogAnisotropyPtr, NIL)
    }

  /**
   * The distance over which the volumetric fog is computed. Increase to compute fog over a greater
   * range, decrease to add more detail when a long range is not needed. For best quality fog, keep
   * this as low as possible. See also
   * [ProjectSettings.rendering/environment/volumetricFog/volumeDepth].
   */
  public var volumetricFogLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumetricFogLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogLengthPtr, NIL)
    }

  /**
   * The distribution of size down the length of the froxel buffer. A higher value compresses the
   * froxels closer to the camera and places more detail closer to the camera.
   */
  public var volumetricFogDetailSpread: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumetricFogDetailSpreadPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogDetailSpreadPtr, NIL)
    }

  /**
   * Scales the strength of ambient light used in the volumetric fog. A value of `0.0` means that
   * ambient light will not impact the volumetric fog. [volumetricFogAmbientInject] has a small
   * performance cost when set above `0.0`.
   * **Note:** This has no visible effect if [volumetricFogDensity] is `0.0` or if
   * [volumetricFogAlbedo] is a fully black color.
   */
  public var volumetricFogAmbientInject: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumetricFogAmbientInjectPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogAmbientInjectPtr, NIL)
    }

  /**
   * The factor to use when affecting the sky with volumetric fog. `1.0` means that volumetric fog
   * can fully obscure the sky. Lower values reduce the impact of volumetric fog on sky rendering, with
   * `0.0` not affecting sky rendering at all.
   * **Note:** [volumetricFogSkyAffect] also affects [FogVolume]s, even if [volumetricFogDensity] is
   * `0.0`. If you notice [FogVolume]s are disappearing when looking towards the sky, set
   * [volumetricFogSkyAffect] to `1.0`.
   */
  public var volumetricFogSkyAffect: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVolumetricFogSkyAffectPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVolumetricFogSkyAffectPtr, NIL)
    }

  /**
   * Enables temporal reprojection in the volumetric fog. Temporal reprojection blends the current
   * frame's volumetric fog with the last frame's volumetric fog to smooth out jagged edges. The
   * performance cost is minimal; however, it leads to moving [FogVolume]s and [Light3D]s "ghosting"
   * and leaving a trail behind them. When temporal reprojection is enabled, try to avoid moving
   * [FogVolume]s or [Light3D]s too fast. Short-lived dynamic lighting effects should have
   * [Light3D.lightVolumetricFogEnergy] set to `0.0` to avoid ghosting.
   */
  public var volumetricFogTemporalReprojectionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          MethodBindings.isVolumetricFogTemporalReprojectionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          MethodBindings.setVolumetricFogTemporalReprojectionEnabledPtr, NIL)
    }

  /**
   * The amount by which to blend the last frame with the current frame. A higher number results in
   * smoother volumetric fog, but makes "ghosting" much worse. A lower value reduces ghosting but can
   * result in the per-frame temporal jitter becoming visible.
   */
  public var volumetricFogTemporalReprojectionAmount: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          MethodBindings.getVolumetricFogTemporalReprojectionAmountPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          MethodBindings.setVolumetricFogTemporalReprojectionAmountPtr, NIL)
    }

  /**
   * If `true`, enables the `adjustment_*` properties provided by this resource. If `false`,
   * modifications to the `adjustment_*` properties will have no effect on the rendered scene.
   */
  public var adjustmentEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAdjustmentEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAdjustmentEnabledPtr, NIL)
    }

  /**
   * The global brightness value of the rendered scene. Effective only if [adjustmentEnabled] is
   * `true`.
   */
  public var adjustmentBrightness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAdjustmentBrightnessPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAdjustmentBrightnessPtr, NIL)
    }

  /**
   * The global contrast value of the rendered scene (default value is 1). Effective only if
   * [adjustmentEnabled] is `true`.
   */
  public var adjustmentContrast: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAdjustmentContrastPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAdjustmentContrastPtr, NIL)
    }

  /**
   * The global color saturation value of the rendered scene (default value is 1). Effective only if
   * [adjustmentEnabled] is `true`.
   */
  public var adjustmentSaturation: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAdjustmentSaturationPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAdjustmentSaturationPtr, NIL)
    }

  /**
   * The [Texture2D] or [Texture3D] lookup table (LUT) to use for the built-in post-process color
   * grading. Can use a [GradientTexture1D] for a 1-dimensional LUT, or a [Texture3D] for a more
   * complex LUT. Effective only if [adjustmentEnabled] is `true`.
   */
  public var adjustmentColorCorrection: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAdjustmentColorCorrectionPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAdjustmentColorCorrectionPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_ENVIRONMENT, scriptIndex)
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
  public open fun backgroundColorMutate(block: Color.() -> Unit): Color = backgroundColor.apply{
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
  public open fun skyRotationMutate(block: Vector3.() -> Unit): Vector3 = skyRotation.apply{
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
  public open fun ambientLightColorMutate(block: Color.() -> Unit): Color = ambientLightColor.apply{
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
  public open fun fogLightColorMutate(block: Color.() -> Unit): Color = fogLightColor.apply{
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
  public open fun volumetricFogAlbedoMutate(block: Color.() -> Unit): Color =
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
  public open fun volumetricFogEmissionMutate(block: Color.() -> Unit): Color =
      volumetricFogEmission.apply{
      block(this)
      volumetricFogEmission = this
  }


  /**
   * Sets the intensity of the glow level [idx]. A value above `0.0` enables the level. Each level
   * relies on the previous level. This means that enabling higher glow levels will slow down the glow
   * effect rendering, even if previous levels aren't enabled.
   */
  public fun setGlowLevel(idx: Int, intensity: Float): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), DOUBLE to intensity.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setGlowLevelPtr, NIL)
  }

  /**
   * Returns the intensity of the glow level [idx].
   */
  public fun getGlowLevel(idx: Int): Float {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getGlowLevelPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
        TypeManager.getMethodBindPtr("Environment", "set_background")

    public val getBackgroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_background")

    public val setSkyPtr: VoidPtr = TypeManager.getMethodBindPtr("Environment", "set_sky")

    public val getSkyPtr: VoidPtr = TypeManager.getMethodBindPtr("Environment", "get_sky")

    public val setSkyCustomFovPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sky_custom_fov")

    public val getSkyCustomFovPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sky_custom_fov")

    public val setSkyRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sky_rotation")

    public val getSkyRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sky_rotation")

    public val setBgColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Environment", "set_bg_color")

    public val getBgColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Environment", "get_bg_color")

    public val setBgEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_bg_energy_multiplier")

    public val getBgEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_bg_energy_multiplier")

    public val setBgIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_bg_intensity")

    public val getBgIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_bg_intensity")

    public val setCanvasMaxLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_canvas_max_layer")

    public val getCanvasMaxLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_canvas_max_layer")

    public val setCameraFeedIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_camera_feed_id")

    public val getCameraFeedIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_camera_feed_id")

    public val setAmbientLightColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ambient_light_color")

    public val getAmbientLightColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ambient_light_color")

    public val setAmbientSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ambient_source")

    public val getAmbientSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ambient_source")

    public val setAmbientLightEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ambient_light_energy")

    public val getAmbientLightEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ambient_light_energy")

    public val setAmbientLightSkyContributionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ambient_light_sky_contribution")

    public val getAmbientLightSkyContributionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ambient_light_sky_contribution")

    public val setReflectionSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_reflection_source")

    public val getReflectionSourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_reflection_source")

    public val setTonemapperPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_tonemapper")

    public val getTonemapperPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_tonemapper")

    public val setTonemapExposurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_tonemap_exposure")

    public val getTonemapExposurePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_tonemap_exposure")

    public val setTonemapWhitePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_tonemap_white")

    public val getTonemapWhitePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_tonemap_white")

    public val setSsrEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssr_enabled")

    public val isSsrEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_ssr_enabled")

    public val setSsrMaxStepsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssr_max_steps")

    public val getSsrMaxStepsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssr_max_steps")

    public val setSsrFadeInPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssr_fade_in")

    public val getSsrFadeInPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssr_fade_in")

    public val setSsrFadeOutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssr_fade_out")

    public val getSsrFadeOutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssr_fade_out")

    public val setSsrDepthTolerancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssr_depth_tolerance")

    public val getSsrDepthTolerancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssr_depth_tolerance")

    public val setSsaoEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_enabled")

    public val isSsaoEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_ssao_enabled")

    public val setSsaoRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_radius")

    public val getSsaoRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_radius")

    public val setSsaoIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_intensity")

    public val getSsaoIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_intensity")

    public val setSsaoPowerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_power")

    public val getSsaoPowerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_power")

    public val setSsaoDetailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_detail")

    public val getSsaoDetailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_detail")

    public val setSsaoHorizonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_horizon")

    public val getSsaoHorizonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_horizon")

    public val setSsaoSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_sharpness")

    public val getSsaoSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_sharpness")

    public val setSsaoDirectLightAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_direct_light_affect")

    public val getSsaoDirectLightAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_direct_light_affect")

    public val setSsaoAoChannelAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssao_ao_channel_affect")

    public val getSsaoAoChannelAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssao_ao_channel_affect")

    public val setSsilEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssil_enabled")

    public val isSsilEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_ssil_enabled")

    public val setSsilRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssil_radius")

    public val getSsilRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssil_radius")

    public val setSsilIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssil_intensity")

    public val getSsilIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssil_intensity")

    public val setSsilSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssil_sharpness")

    public val getSsilSharpnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssil_sharpness")

    public val setSsilNormalRejectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_ssil_normal_rejection")

    public val getSsilNormalRejectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_ssil_normal_rejection")

    public val setSdfgiEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_enabled")

    public val isSdfgiEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_sdfgi_enabled")

    public val setSdfgiCascadesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_cascades")

    public val getSdfgiCascadesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_cascades")

    public val setSdfgiMinCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_min_cell_size")

    public val getSdfgiMinCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_min_cell_size")

    public val setSdfgiMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_max_distance")

    public val getSdfgiMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_max_distance")

    public val setSdfgiCascade0DistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_cascade0_distance")

    public val getSdfgiCascade0DistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_cascade0_distance")

    public val setSdfgiYScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_y_scale")

    public val getSdfgiYScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_y_scale")

    public val setSdfgiUseOcclusionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_use_occlusion")

    public val isSdfgiUsingOcclusionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_sdfgi_using_occlusion")

    public val setSdfgiBounceFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_bounce_feedback")

    public val getSdfgiBounceFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_bounce_feedback")

    public val setSdfgiReadSkyLightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_read_sky_light")

    public val isSdfgiReadingSkyLightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_sdfgi_reading_sky_light")

    public val setSdfgiEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_energy")

    public val getSdfgiEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_energy")

    public val setSdfgiNormalBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_normal_bias")

    public val getSdfgiNormalBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_normal_bias")

    public val setSdfgiProbeBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_sdfgi_probe_bias")

    public val getSdfgiProbeBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_sdfgi_probe_bias")

    public val setGlowEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_enabled")

    public val isGlowEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_glow_enabled")

    public val setGlowLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_level")

    public val getGlowLevelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_level")

    public val setGlowNormalizedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_normalized")

    public val isGlowNormalizedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_glow_normalized")

    public val setGlowIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_intensity")

    public val getGlowIntensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_intensity")

    public val setGlowStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_strength")

    public val getGlowStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_strength")

    public val setGlowMixPtr: VoidPtr = TypeManager.getMethodBindPtr("Environment", "set_glow_mix")

    public val getGlowMixPtr: VoidPtr = TypeManager.getMethodBindPtr("Environment", "get_glow_mix")

    public val setGlowBloomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_bloom")

    public val getGlowBloomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_bloom")

    public val setGlowBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_blend_mode")

    public val getGlowBlendModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_blend_mode")

    public val setGlowHdrBleedThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_hdr_bleed_threshold")

    public val getGlowHdrBleedThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_hdr_bleed_threshold")

    public val setGlowHdrBleedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_hdr_bleed_scale")

    public val getGlowHdrBleedScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_hdr_bleed_scale")

    public val setGlowHdrLuminanceCapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_hdr_luminance_cap")

    public val getGlowHdrLuminanceCapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_hdr_luminance_cap")

    public val setGlowMapStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_glow_map_strength")

    public val getGlowMapStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_glow_map_strength")

    public val setGlowMapPtr: VoidPtr = TypeManager.getMethodBindPtr("Environment", "set_glow_map")

    public val getGlowMapPtr: VoidPtr = TypeManager.getMethodBindPtr("Environment", "get_glow_map")

    public val setFogEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_enabled")

    public val isFogEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_fog_enabled")

    public val setFogModePtr: VoidPtr = TypeManager.getMethodBindPtr("Environment", "set_fog_mode")

    public val getFogModePtr: VoidPtr = TypeManager.getMethodBindPtr("Environment", "get_fog_mode")

    public val setFogLightColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_light_color")

    public val getFogLightColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_light_color")

    public val setFogLightEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_light_energy")

    public val getFogLightEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_light_energy")

    public val setFogSunScatterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_sun_scatter")

    public val getFogSunScatterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_sun_scatter")

    public val setFogDensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_density")

    public val getFogDensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_density")

    public val setFogHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_height")

    public val getFogHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_height")

    public val setFogHeightDensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_height_density")

    public val getFogHeightDensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_height_density")

    public val setFogAerialPerspectivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_aerial_perspective")

    public val getFogAerialPerspectivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_aerial_perspective")

    public val setFogSkyAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_sky_affect")

    public val getFogSkyAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_sky_affect")

    public val setFogDepthCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_depth_curve")

    public val getFogDepthCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_depth_curve")

    public val setFogDepthBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_depth_begin")

    public val getFogDepthBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_depth_begin")

    public val setFogDepthEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_fog_depth_end")

    public val getFogDepthEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_fog_depth_end")

    public val setVolumetricFogEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_enabled")

    public val isVolumetricFogEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_volumetric_fog_enabled")

    public val setVolumetricFogEmissionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_emission")

    public val getVolumetricFogEmissionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_emission")

    public val setVolumetricFogAlbedoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_albedo")

    public val getVolumetricFogAlbedoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_albedo")

    public val setVolumetricFogDensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_density")

    public val getVolumetricFogDensityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_density")

    public val setVolumetricFogEmissionEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_emission_energy")

    public val getVolumetricFogEmissionEnergyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_emission_energy")

    public val setVolumetricFogAnisotropyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_anisotropy")

    public val getVolumetricFogAnisotropyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_anisotropy")

    public val setVolumetricFogLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_length")

    public val getVolumetricFogLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_length")

    public val setVolumetricFogDetailSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_detail_spread")

    public val getVolumetricFogDetailSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_detail_spread")

    public val setVolumetricFogGiInjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_gi_inject")

    public val getVolumetricFogGiInjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_gi_inject")

    public val setVolumetricFogAmbientInjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_ambient_inject")

    public val getVolumetricFogAmbientInjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_ambient_inject")

    public val setVolumetricFogSkyAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_sky_affect")

    public val getVolumetricFogSkyAffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_sky_affect")

    public val setVolumetricFogTemporalReprojectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_temporal_reprojection_enabled")

    public val isVolumetricFogTemporalReprojectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_volumetric_fog_temporal_reprojection_enabled")

    public val setVolumetricFogTemporalReprojectionAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_volumetric_fog_temporal_reprojection_amount")

    public val getVolumetricFogTemporalReprojectionAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_volumetric_fog_temporal_reprojection_amount")

    public val setAdjustmentEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_adjustment_enabled")

    public val isAdjustmentEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "is_adjustment_enabled")

    public val setAdjustmentBrightnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_adjustment_brightness")

    public val getAdjustmentBrightnessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_adjustment_brightness")

    public val setAdjustmentContrastPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_adjustment_contrast")

    public val getAdjustmentContrastPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_adjustment_contrast")

    public val setAdjustmentSaturationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_adjustment_saturation")

    public val getAdjustmentSaturationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_adjustment_saturation")

    public val setAdjustmentColorCorrectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "set_adjustment_color_correction")

    public val getAdjustmentColorCorrectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Environment", "get_adjustment_color_correction")
  }
}

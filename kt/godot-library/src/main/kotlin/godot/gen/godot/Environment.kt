// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Resource for environment nodes (like [godot.WorldEnvironment]) that define multiple rendering options.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * Resource for environment nodes (like [godot.WorldEnvironment]) that define multiple environment operations (such as background [godot.Sky] or [godot.core.Color], ambient light, fog, depth-of-field...). These parameters affect the final render of the scene. The order of these operations is:
 *
 * - Depth of Field Blur
 *
 * - Glow
 *
 * - Tonemap (Auto Exposure)
 *
 * - Adjustments
 */
@GodotBaseType
public open class Environment : Resource() {
  /**
   * The background mode. See [enum BGMode] for possible values.
   */
  public open var backgroundMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND, NIL)
    }

  /**
   * The [godot.core.Color] displayed for clear areas of the scene. Only effective when using the [BG_COLOR] background mode.
   */
  public open var backgroundColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BG_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BG_COLOR, NIL)
    }

  /**
   * The power of the light emitted by the background.
   */
  public open var backgroundEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BG_ENERGY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BG_ENERGY, NIL)
    }

  /**
   * The maximum layer ID to display. Only effective when using the [BG_CANVAS] background mode.
   */
  public open var backgroundCanvasMaxLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_CANVAS_MAX_LAYER,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_CANVAS_MAX_LAYER,
          NIL)
    }

  /**
   * The ID of the camera feed to show in the background.
   */
  public open var backgroundCameraFeedId: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_CAMERA_FEED_ID,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_CAMERA_FEED_ID,
          NIL)
    }

  /**
   * The [godot.Sky] resource used for this [godot.Environment].
   */
  public open var sky: Sky?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SKY, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Sky?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SKY, NIL)
    }

  /**
   *
   */
  public open var skyCustomFov: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SKY_CUSTOM_FOV,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SKY_CUSTOM_FOV,
          NIL)
    }

  /**
   *
   */
  public open var skyRotation: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SKY_ROTATION,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SKY_ROTATION, NIL)
    }

  /**
   *
   */
  public open var ambientLightSource: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AMBIENT_SOURCE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_AMBIENT_SOURCE,
          NIL)
    }

  /**
   * The ambient light's [godot.core.Color].
   */
  public open var ambientLightColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AMBIENT_LIGHT_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_AMBIENT_LIGHT_COLOR, NIL)
    }

  /**
   * Defines the amount of light that the sky brings on the scene. A value of `0.0` means that the sky's light emission has no effect on the scene illumination, thus all ambient illumination is provided by the ambient light. On the contrary, a value of `1.0` means that *all* the light that affects the scene is provided by the sky, thus the ambient light parameter has no effect on the scene.
   *
   * **Note:** [ambientLightSkyContribution] is internally clamped between `0.0` and `1.0` (inclusive).
   */
  public open var ambientLightSkyContribution: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AMBIENT_LIGHT_SKY_CONTRIBUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_AMBIENT_LIGHT_SKY_CONTRIBUTION, NIL)
    }

  /**
   * The ambient light's energy. The higher the value, the stronger the light.
   */
  public open var ambientLightEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AMBIENT_LIGHT_ENERGY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_AMBIENT_LIGHT_ENERGY, NIL)
    }

  /**
   *
   */
  public open var reflectedLightSource: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_REFLECTION_SOURCE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_REFLECTION_SOURCE,
          NIL)
    }

  /**
   * The tonemapping mode to use. Tonemapping is the process that "converts" HDR values to be suitable for rendering on a LDR display. (Godot doesn't support rendering on HDR displays yet.)
   */
  public open var tonemapMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_TONEMAPPER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_TONEMAPPER, NIL)
    }

  /**
   * The default exposure used for tonemapping.
   */
  public open var tonemapExposure: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_TONEMAP_EXPOSURE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_TONEMAP_EXPOSURE,
          NIL)
    }

  /**
   * The white reference value for tonemapping. Only effective if the [tonemapMode] isn't set to [TONE_MAPPER_LINEAR].
   */
  public open var tonemapWhite: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_TONEMAP_WHITE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_TONEMAP_WHITE,
          NIL)
    }

  /**
   * If `true`, enables the tonemapping auto exposure mode of the scene renderer. If `true`, the renderer will automatically determine the exposure setting to adapt to the scene's illumination and the observed light.
   */
  public open var autoExposureEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_TONEMAP_AUTO_EXPOSURE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_TONEMAP_AUTO_EXPOSURE_ENABLED, NIL)
    }

  /**
   * The scale of the auto exposure effect. Affects the intensity of auto exposure.
   */
  public open var autoExposureScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_TONEMAP_AUTO_EXPOSURE_GREY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_TONEMAP_AUTO_EXPOSURE_GREY, NIL)
    }

  /**
   * The minimum luminance value for the auto exposure.
   */
  public open var autoExposureMinLuma: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_TONEMAP_AUTO_EXPOSURE_MIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_TONEMAP_AUTO_EXPOSURE_MIN, NIL)
    }

  /**
   * The maximum luminance value for the auto exposure.
   */
  public open var autoExposureMaxLuma: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_TONEMAP_AUTO_EXPOSURE_MAX, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_TONEMAP_AUTO_EXPOSURE_MAX, NIL)
    }

  /**
   * The speed of the auto exposure effect. Affects the time needed for the camera to perform auto exposure.
   */
  public open var autoExposureSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_TONEMAP_AUTO_EXPOSURE_SPEED, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_TONEMAP_AUTO_EXPOSURE_SPEED, NIL)
    }

  /**
   * If `true`, screen-space reflections are enabled. Screen-space reflections are more accurate than reflections from [godot.VoxelGI]s or [godot.ReflectionProbe]s, but are slower and can't reflect surfaces occluded by others.
   */
  public open var ssrEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_SSR_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSR_ENABLED, NIL)
    }

  /**
   * The maximum number of steps for screen-space reflections. Higher values are slower.
   */
  public open var ssrMaxSteps: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSR_MAX_STEPS,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSR_MAX_STEPS,
          NIL)
    }

  /**
   * The fade-in distance for screen-space reflections. Affects the area from the reflected material to the screen-space reflection). Only positive values are valid (negative values will be clamped to `0.0`).
   */
  public open var ssrFadeIn: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSR_FADE_IN,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSR_FADE_IN, NIL)
    }

  /**
   * The fade-out distance for screen-space reflections. Affects the area from the screen-space reflection to the "global" reflection. Only positive values are valid (negative values will be clamped to `0.0`).
   */
  public open var ssrFadeOut: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSR_FADE_OUT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSR_FADE_OUT, NIL)
    }

  /**
   * The depth tolerance for screen-space reflections.
   */
  public open var ssrDepthTolerance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSR_DEPTH_TOLERANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSR_DEPTH_TOLERANCE, NIL)
    }

  /**
   * If `true`, the screen-space ambient occlusion effect is enabled. This darkens objects' corners and cavities to simulate ambient light not reaching the entire object as in real life. This works well for small, dynamic objects, but baked lighting or ambient occlusion textures will do a better job at displaying ambient occlusion on large static objects. Godot uses a form of SSAO called Adaptive Screen Space Ambient Occlusion which is itself a form of Horizon Based Ambient Occlusion.
   */
  public open var ssaoEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_SSAO_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_ENABLED, NIL)
    }

  /**
   * The distance at which objects can occlude each other when calculating screen-space ambient occlusion. Higher values will result in occlusion over a greater distance at the cost of performance and quality.
   */
  public open var ssaoRadius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_RADIUS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_RADIUS, NIL)
    }

  /**
   * The primary screen-space ambient occlusion intensity. Acts as a multiplier for the screen-space ambient occlusion effect. A higher value results in darker occlusion.
   */
  public open var ssaoIntensity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_INTENSITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_INTENSITY,
          NIL)
    }

  /**
   * The distribution of occlusion. A higher value results in darker occlusion, similar to [ssaoIntensity], but with a sharper falloff.
   */
  public open var ssaoPower: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_POWER,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_POWER, NIL)
    }

  /**
   * Sets the strength of the additional level of detail for the screen-space ambient occlusion effect. A high value makes the detail pass more prominent, but it may contribute to aliasing in your final image.
   */
  public open var ssaoDetail: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_DETAIL,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_DETAIL, NIL)
    }

  /**
   * The threshold for considering whether a given point on a surface is occluded or not represented as an angle from the horizon mapped into the `0.0-1.0` range. A value of `1.0` results in no occlusion.
   */
  public open var ssaoHorizon: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_HORIZON,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_HORIZON, NIL)
    }

  /**
   * The amount that the screen-space ambient occlusion effect is allowed to blur over the edges of objects. Setting too high will result in aliasing around the edges of objects. Setting too low will make object edges appear blurry.
   */
  public open var ssaoSharpness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_SHARPNESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_SHARPNESS,
          NIL)
    }

  /**
   * The screen-space ambient occlusion intensity in direct light. In real life, ambient occlusion only applies to indirect light, which means its effects can't be seen in direct light. Values higher than `0` will make the SSAO effect visible in direct light.
   */
  public open var ssaoLightAffect: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_DIRECT_LIGHT_AFFECT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_DIRECT_LIGHT_AFFECT, NIL)
    }

  /**
   * The screen-space ambient occlusion intensity on materials that have an AO texture defined. Values higher than `0` will make the SSAO effect visible in areas darkened by AO textures.
   */
  public open var ssaoAoChannelAffect: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_AO_CHANNEL_AFFECT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_AO_CHANNEL_AFFECT, NIL)
    }

  /**
   * If `true`, the screen-space indirect lighting effect is enabled. Screen space indirect lighting is a form of indirect lighting that allows diffuse light to bounce between nearby objects. Screen-space indirect lighting works very similarly to screen-space ambient occlusion, in that it only affects a limited range. It is intended to be used along with a form of proper global illumination like SDFGI or [godot.VoxelGI]. Screen-space indirect lighting is not affected by individual light's [godot.Light3D.lightIndirectEnergy].
   */
  public open var ssilEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_SSIL_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSIL_ENABLED, NIL)
    }

  /**
   * The distance that bounced lighting can travel when using the screen space indirect lighting effect. A larger value will result in light bouncing further in a scene, but may result in under-sampling artifacts which look like long spikes surrounding light sources.
   */
  public open var ssilRadius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSIL_RADIUS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSIL_RADIUS, NIL)
    }

  /**
   * The brightness multiplier for the screen-space indirect lighting effect. A higher value will result in brighter light.
   */
  public open var ssilIntensity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSIL_INTENSITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSIL_INTENSITY,
          NIL)
    }

  /**
   * The amount that the screen-space indirect lighting effect is allowed to blur over the edges of objects. Setting too high will result in aliasing around the edges of objects. Setting too low will make object edges appear blurry.
   */
  public open var ssilSharpness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSIL_SHARPNESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSIL_SHARPNESS,
          NIL)
    }

  /**
   * Amount of normal rejection used when calculating screen-space indirect lighting. Normal rejection uses the normal of a given sample point to reject samples that are facing away from the current pixel. Normal rejection is necessary to avoid light leaking when only one side of an object is illuminated. However, normal rejection can be disabled if light leaking is desirable, such as when the scene mostly contains emissive objects that emit light from faces that cannot be seen from the camera.
   */
  public open var ssilNormalRejection: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSIL_NORMAL_REJECTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSIL_NORMAL_REJECTION, NIL)
    }

  /**
   * If `true`, enables signed distance field global illumination for meshes that have their [godot.GeometryInstance3D.giMode] set to [godot.GeometryInstance3D.GI_MODE_STATIC]. SDFGI is a real-time global illumination technique that works well with procedurally generated and user-built levels, including in situations where geometry is created during gameplay. The signed distance field is automatically generated around the camera as it moves. Dynamic lights are supported, but dynamic occluders and emissive surfaces are not.
   *
   * **Performance:** SDFGI is relatively demanding on the GPU and is not suited to low-end hardware such as integrated graphics (consider [godot.LightmapGI] instead). To improve SDFGI performance, enable [godot.ProjectSettings.rendering/globalIllumination/gi/useHalfResolution] in the Project Settings.
   *
   * **Note:** Meshes should have sufficiently thick walls to avoid light leaks (avoid one-sided walls). For interior levels, enclose your level geometry in a sufficiently large box and bridge the loops to close the mesh.
   */
  public open var sdfgiEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_SDFGI_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_ENABLED,
          NIL)
    }

  /**
   *
   */
  public open var sdfgiUseOcclusion: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_SDFGI_USING_OCCLUSION, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_USE_OCCLUSION, NIL)
    }

  /**
   *
   */
  public open var sdfgiReadSkyLight: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_SDFGI_READING_SKY_LIGHT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_READ_SKY_LIGHT, NIL)
    }

  /**
   *
   */
  public open var sdfgiBounceFeedback: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SDFGI_BOUNCE_FEEDBACK, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_BOUNCE_FEEDBACK, NIL)
    }

  /**
   * The number of cascades to use for SDFGI (between 1 and 8). A higher number of cascades allows displaying SDFGI further away while preserving detail up close, at the cost of performance. When using SDFGI on small-scale levels, [sdfgiCascades] can often be decreased between `1` and `4` to improve performance.
   */
  public open var sdfgiCascades: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SDFGI_CASCADES,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_CASCADES,
          NIL)
    }

  /**
   *
   */
  public open var sdfgiMinCellSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SDFGI_MIN_CELL_SIZE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_MIN_CELL_SIZE, NIL)
    }

  /**
   *
   */
  public open var sdfgiCascade0Distance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SDFGI_CASCADE0_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_CASCADE0_DISTANCE, NIL)
    }

  /**
   *
   */
  public open var sdfgiMaxDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SDFGI_MAX_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_MAX_DISTANCE, NIL)
    }

  /**
   *
   */
  public open var sdfgiYScale: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SDFGI_Y_SCALE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_Y_SCALE,
          NIL)
    }

  /**
   *
   */
  public open var sdfgiEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SDFGI_ENERGY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_ENERGY, NIL)
    }

  /**
   *
   */
  public open var sdfgiNormalBias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SDFGI_NORMAL_BIAS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_NORMAL_BIAS,
          NIL)
    }

  /**
   *
   */
  public open var sdfgiProbeBias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SDFGI_PROBE_BIAS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_PROBE_BIAS,
          NIL)
    }

  /**
   * If `true`, the glow effect is enabled.
   */
  public open var glowEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_GLOW_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_ENABLED, NIL)
    }

  /**
   * The intensity of the 1st level of glow. This is the most "local" level (least blurry).
   */
  public open val glowLevels_1: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVEL,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The intensity of the 2nd level of glow.
   */
  public open val glowLevels_2: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVEL,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The intensity of the 3rd level of glow.
   */
  public open val glowLevels_3: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVEL,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The intensity of the 4th level of glow.
   */
  public open val glowLevels_4: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVEL,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The intensity of the 5th level of glow.
   */
  public open val glowLevels_5: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVEL,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The intensity of the 6th level of glow.
   */
  public open val glowLevels_6: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVEL,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * The intensity of the 7th level of glow. This is the most "global" level (blurriest).
   */
  public open val glowLevels_7: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVEL,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }

  /**
   * If `true`, glow levels will be normalized so that summed together their intensities equal `1.0`.
   */
  public open var glowNormalized: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_GLOW_NORMALIZED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_NORMALIZED,
          NIL)
    }

  /**
   * The overall brightness multiplier of the glow effect. When using the OpenGL renderer, this should be increased to 1.5 to compensate for the lack of HDR rendering.
   */
  public open var glowIntensity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_INTENSITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_INTENSITY,
          NIL)
    }

  /**
   * The strength of the glow effect. This applies as the glow is blurred across the screen and increases the distance and intensity of the blur. When using the OpenGL renderer, this should be increased to 1.3 to compensate for the lack of HDR rendering.
   */
  public open var glowStrength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_STRENGTH,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_STRENGTH,
          NIL)
    }

  /**
   *
   */
  public open var glowMix: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_MIX, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_MIX, NIL)
    }

  /**
   * The bloom's intensity. If set to a value higher than `0`, this will make glow visible in areas darker than the [glowHdrThreshold].
   */
  public open var glowBloom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_BLOOM,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_BLOOM, NIL)
    }

  /**
   * The glow blending mode.
   */
  public open var glowBlendMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_BLEND_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_BLEND_MODE,
          NIL)
    }

  /**
   * The lower threshold of the HDR glow. When using the OpenGL renderer (which doesn't support HDR), this needs to be below `1.0` for glow to be visible. A value of `0.9` works well in this case.
   */
  public open var glowHdrThreshold: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_HDR_BLEED_THRESHOLD, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_HDR_BLEED_THRESHOLD, NIL)
    }

  /**
   * The bleed scale of the HDR glow.
   */
  public open var glowHdrScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_HDR_BLEED_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_HDR_BLEED_SCALE, NIL)
    }

  /**
   * The higher threshold of the HDR glow. Areas brighter than this threshold will be clamped for the purposes of the glow effect.
   */
  public open var glowHdrLuminanceCap: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_HDR_LUMINANCE_CAP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_HDR_LUMINANCE_CAP, NIL)
    }

  /**
   * How strong of an impact the [glowMap] should have on the overall glow effect. A strength of `0.0` means the glow map has no effect on the overall glow effect. A strength of `1.0` means the glow has a full effect on the overall glow effect (and can turn off glow entirely in specific areas of the screen if the glow map has black areas).
   */
  public open var glowMapStrength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_MAP_STRENGTH,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_MAP_STRENGTH,
          NIL)
    }

  /**
   * The texture that should be used as a glow map to *multiply* the resulting glow color according to [glowMapStrength]. This can be used to create a "lens dirt" effect. The texture's RGB color channels are used for modulation, but the alpha channel is ignored.
   *
   * **Note:** The texture will be stretched to fit the screen. Therefore, it's recommended to use a texture with an aspect ratio that matches your project's base aspect ratio (typically 16:9).
   */
  public open var glowMap: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_MAP, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_MAP, NIL)
    }

  /**
   * If `true`, fog effects are enabled.
   */
  public open var fogEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_FOG_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_ENABLED, NIL)
    }

  /**
   *
   */
  public open var fogLightColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_LIGHT_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_LIGHT_COLOR,
          NIL)
    }

  /**
   *
   */
  public open var fogLightEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_LIGHT_ENERGY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_LIGHT_ENERGY,
          NIL)
    }

  /**
   *
   */
  public open var fogSunScatter: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_SUN_SCATTER,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_SUN_SCATTER,
          NIL)
    }

  /**
   *
   */
  public open var fogDensity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_DENSITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_DENSITY, NIL)
    }

  /**
   * Blend factor between the fog's color and the color of the background [godot.Sky]. Must have [backgroundMode] set to [BG_SKY].
   *
   * This is useful to simulate [aerial perspective](https://en.wikipedia.org/wiki/Aerial_perspective) in large scenes with low density fog. However, it is not very useful for high-density fog, as the sky will shine through. When set to `1.0`, the fog color comes completely from the [godot.Sky]. If set to `0.0`, aerial perspective is disabled.
   */
  public open var fogAerialPerspective: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_AERIAL_PERSPECTIVE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_AERIAL_PERSPECTIVE, NIL)
    }

  /**
   * The height at which the height fog effect begins.
   */
  public open var fogHeight: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_HEIGHT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_HEIGHT, NIL)
    }

  /**
   * The density used to increase fog as height decreases. To make fog increase as height increases, use a negative value.
   */
  public open var fogHeightDensity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_HEIGHT_DENSITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_HEIGHT_DENSITY, NIL)
    }

  /**
   * Enables the volumetric fog effect. Volumetric fog uses a screen-aligned froxel buffer to calculate accurate volumetric scattering in the short to medium range. Volumetric fog interacts with [godot.FogVolume]s and lights to calculate localized and global fog. Volumetric fog uses a PBR single-scattering model based on extinction, scattering, and emission which it exposes to users as density, albedo, and emission.
   */
  public open var volumetricFogEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_VOLUMETRIC_FOG_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_ENABLED, NIL)
    }

  /**
   * The base density of the volumetric fog. Set this to the lowest density you want to have globally.
   */
  public open var volumetricFogDensity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_DENSITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_DENSITY, NIL)
    }

  /**
   * The [godot.core.Color] of the volumetric fog when interacting with lights. Mist and fog have an albedo close to `Color(1, 1, 1, 1)` while smoke has a darker albedo.
   */
  public open var volumetricFogAlbedo: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_ALBEDO, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_ALBEDO, NIL)
    }

  /**
   * The emitted light from the volumetric fog. Even with emission, volumetric fog will not cast light onto other surfaces. Emission is useful to establish an ambient color. As the volumetric fog effect uses single-scattering only, fog tends to need a little bit of emission to soften the harsh shadows.
   */
  public open var volumetricFogEmission: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_EMISSION, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_EMISSION, NIL)
    }

  /**
   * The brightness of the emitted light from the volumetric fog.
   */
  public open var volumetricFogEmissionEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_EMISSION_ENERGY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_EMISSION_ENERGY, NIL)
    }

  /**
   * Scales the strength of Global Illumination used in the volumetric fog. A value of `0` means that Global Illumination will not impact the volumetric fog.
   */
  public open var volumetricFogGiInject: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_GI_INJECT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_GI_INJECT, NIL)
    }

  /**
   * The direction of scattered light as it goes through the volumetric fog. A value close `1` means almost all light is scattered forward. A value close to `0` means light is scattered equally in all directions. A value close to `-1` means light is scattered mostly backward. Fog and mist scatter light slightly forward, while smoke scatters light equally in all directions.
   */
  public open var volumetricFogAnisotropy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_ANISOTROPY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_ANISOTROPY, NIL)
    }

  /**
   * The distance over which the volumetric fog is computed. Increase to compute fog over a greater range, decrease to add more detail when a long range is not needed. For best quality fog, keep this as low as possible.
   */
  public open var volumetricFogLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_LENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_LENGTH, NIL)
    }

  /**
   * The distribution of size down the length of the froxel buffer. A higher value compresses the froxels closer to the camera and places more detail closer to the camera.
   */
  public open var volumetricFogDetailSpread: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_DETAIL_SPREAD, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_DETAIL_SPREAD, NIL)
    }

  /**
   * Scales the strength of ambient light used in the volumetric fog. A value of `0` means that ambient light will not impact the volumetric fog.
   */
  public open var volumetricFogAmbientInject: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_AMBIENT_INJECT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_AMBIENT_INJECT, NIL)
    }

  /**
   * Enables temporal reprojection in the volumetric fog. Temporal reprojection blends the current frame's volumetric fog with the last frame's volumetric fog to smooth out jagged edges. The performance cost is minimal, however it does lead to moving [godot.FogVolume]s and [godot.Light3D]s "ghosting" and leaving a trail behind them. When temporal reprojection is enabled, try to avoid moving [godot.FogVolume]s or [godot.Light3D]s too fast.
   */
  public open var volumetricFogTemporalReprojectionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_VOLUMETRIC_FOG_TEMPORAL_REPROJECTION_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_TEMPORAL_REPROJECTION_ENABLED,
          NIL)
    }

  /**
   * The amount by which to blend the last frame with the current frame. A higher number results in smoother volumetric fog, but makes "ghosting" much worse. A lower value reduces ghosting but can result in the per-frame temporal jitter becoming visible.
   */
  public open var volumetricFogTemporalReprojectionAmount: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_TEMPORAL_REPROJECTION_AMOUNT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_TEMPORAL_REPROJECTION_AMOUNT, NIL)
    }

  /**
   * If `true`, enables the `adjustment_*` properties provided by this resource. If `false`, modifications to the `adjustment_*` properties will have no effect on the rendered scene.
   */
  public open var adjustmentEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_ADJUSTMENT_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_ADJUSTMENT_ENABLED, NIL)
    }

  /**
   * The global brightness value of the rendered scene. Effective only if `adjustment_enabled` is `true`.
   */
  public open var adjustmentBrightness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_ADJUSTMENT_BRIGHTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_ADJUSTMENT_BRIGHTNESS, NIL)
    }

  /**
   * The global contrast value of the rendered scene (default value is 1). Effective only if `adjustment_enabled` is `true`.
   */
  public open var adjustmentContrast: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_ADJUSTMENT_CONTRAST, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_ADJUSTMENT_CONTRAST, NIL)
    }

  /**
   * The global color saturation value of the rendered scene (default value is 1). Effective only if `adjustment_enabled` is `true`.
   */
  public open var adjustmentSaturation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_ADJUSTMENT_SATURATION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_ADJUSTMENT_SATURATION, NIL)
    }

  /**
   * The [godot.Texture2D] or [godot.Texture3D] lookup table (LUT) to use for the built-in post-process color grading. Can use a [godot.GradientTexture1D] for a 1-dimensional LUT, or a [godot.Texture3D] for a more complex LUT. Effective only if `adjustment_enabled` is `true`.
   */
  public open var adjustmentColorCorrection: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_ADJUSTMENT_COLOR_CORRECTION, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Material?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_ADJUSTMENT_COLOR_CORRECTION, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ENVIRONMENT)
  }

  /**
   * Sets the intensity of the glow level `idx`. A value above `0.0` enables the level. Each level relies on the previous level. This means that enabling higher glow levels will slow down the glow effect rendering, even if previous levels aren't enabled.
   */
  public open fun setGlowLevel(idx: Long, intensity: Double): Unit {
    TransferContext.writeArguments(LONG to idx, DOUBLE to intensity)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_LEVEL, NIL)
  }

  public enum class GlowBlendMode(
    id: Long
  ) {
    /**
     * Additive glow blending mode. Mostly used for particles, glows (bloom), lens flare, bright sources.
     */
    GLOW_BLEND_MODE_ADDITIVE(0),
    /**
     * Screen glow blending mode. Increases brightness, used frequently with bloom.
     */
    GLOW_BLEND_MODE_SCREEN(1),
    /**
     * Soft light glow blending mode. Modifies contrast, exposes shadows and highlights (vivid bloom).
     */
    GLOW_BLEND_MODE_SOFTLIGHT(2),
    /**
     * Replace glow blending mode. Replaces all pixels' color by the glow value. This can be used to simulate a full-screen blur effect by tweaking the glow parameters to match the original image's brightness.
     */
    GLOW_BLEND_MODE_REPLACE(3),
    /**
     * Mixes the glow with the underlying color to avoid increasing brightness as much while still maintaining a glow effect.
     */
    GLOW_BLEND_MODE_MIX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ToneMapper(
    id: Long
  ) {
    /**
     * Linear tonemapper operator. Reads the linear data and passes it on unmodified.
     */
    TONE_MAPPER_LINEAR(0),
    /**
     * Reinhardt tonemapper operator. Performs a variation on rendered pixels' colors by this formula: `color = color / (1 + color)`.
     */
    TONE_MAPPER_REINHARDT(1),
    /**
     * Filmic tonemapper operator.
     */
    TONE_MAPPER_FILMIC(2),
    /**
     * Academy Color Encoding System tonemapper operator.
     */
    TONE_MAPPER_ACES(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ReflectionSource(
    id: Long
  ) {
    /**
     * Use the background for reflections.
     */
    REFLECTION_SOURCE_BG(0),
    /**
     * Disable reflections.
     */
    REFLECTION_SOURCE_DISABLED(1),
    /**
     * Use the [godot.Sky] for reflections regardless of what the background is.
     */
    REFLECTION_SOURCE_SKY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class SDFGIYScale(
    id: Long
  ) {
    /**
     *
     */
    SDFGI_Y_SCALE_50_PERCENT(0),
    /**
     *
     */
    SDFGI_Y_SCALE_75_PERCENT(1),
    /**
     *
     */
    SDFGI_Y_SCALE_100_PERCENT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class BGMode(
    id: Long
  ) {
    /**
     * Clears the background using the clear color defined in [godot.ProjectSettings.rendering/environment/defaults/defaultClearColor].
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
     * Displays a [godot.CanvasLayer] in the background.
     */
    BG_CANVAS(3),
    /**
     * Keeps on screen every pixel drawn in the background. This is the fastest background mode, but it can only be safely used in fully-interior scenes (no visible sky or sky reflections). If enabled in a scene where the background is visible, "ghost trail" artifacts will be visible when moving the camera.
     */
    BG_KEEP(4),
    /**
     * Displays a camera feed in the background.
     */
    BG_CAMERA_FEED(5),
    /**
     * Represents the size of the [enum BGMode] enum.
     */
    BG_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class AmbientSource(
    id: Long
  ) {
    /**
     * Gather ambient light from whichever source is specified as the background.
     */
    AMBIENT_SOURCE_BG(0),
    /**
     * Disable ambient light.
     */
    AMBIENT_SOURCE_DISABLED(1),
    /**
     * Specify a specific [godot.core.Color] for ambient light.
     */
    AMBIENT_SOURCE_COLOR(2),
    /**
     * Gather ambient light from the [godot.Sky] regardless of what the background is.
     */
    AMBIENT_SOURCE_SKY(3),
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

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
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
  public var backgroundMode: BGMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND, LONG)
      return Environment.BGMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND, NIL)
    }

  /**
   * The [godot.core.Color] displayed for clear areas of the scene. Only effective when using the [BG_COLOR] background mode.
   */
  public var backgroundColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BG_COLOR, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BG_COLOR, NIL)
    }

  /**
   * Multiplier for background energy. Increase to make background brighter, decrease to make background dimmer.
   */
  public var backgroundEnergyMultiplier: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BG_ENERGY_MULTIPLIER, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BG_ENERGY_MULTIPLIER, NIL)
    }

  /**
   * Luminance of background measured in nits (candela per square meter). Only used when [godot.ProjectSettings.rendering/lightsAndShadows/usePhysicalLightUnits] is enabled. The default value is roughly equivalent to the sky at midday.
   */
  public var backgroundIntensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BG_INTENSITY,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BG_INTENSITY, NIL)
    }

  /**
   * The maximum layer ID to display. Only effective when using the [BG_CANVAS] background mode.
   */
  public var backgroundCanvasMaxLayer: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_CANVAS_MAX_LAYER,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_CANVAS_MAX_LAYER,
          NIL)
    }

  /**
   * The ID of the camera feed to show in the background.
   */
  public var backgroundCameraFeedId: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_CAMERA_FEED_ID,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_CAMERA_FEED_ID,
          NIL)
    }

  /**
   * The [godot.Sky] resource used for this [godot.Environment].
   */
  public var sky: Sky?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SKY, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Sky?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SKY, NIL)
    }

  /**
   * If set to a value greater than `0.0`, overrides the field of view to use for sky rendering. If set to `0.0`, the same FOV as the current [godot.Camera3D] is used for sky rendering.
   */
  public var skyCustomFov: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SKY_CUSTOM_FOV,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SKY_CUSTOM_FOV,
          NIL)
    }

  /**
   * The rotation to use for sky rendering.
   */
  public var skyRotation: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SKY_ROTATION,
          VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SKY_ROTATION, NIL)
    }

  /**
   * The ambient light source to use for rendering materials and global illumination.
   */
  public var ambientLightSource: AmbientSource
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AMBIENT_SOURCE,
          LONG)
      return Environment.AmbientSource.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_AMBIENT_SOURCE,
          NIL)
    }

  /**
   * The ambient light's [godot.core.Color]. Only effective if [ambientLightSkyContribution] is lower than `1.0` (exclusive).
   */
  public var ambientLightColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AMBIENT_LIGHT_COLOR, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
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
  public var ambientLightSkyContribution: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AMBIENT_LIGHT_SKY_CONTRIBUTION, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_AMBIENT_LIGHT_SKY_CONTRIBUTION, NIL)
    }

  /**
   * The ambient light's energy. The higher the value, the stronger the light. Only effective if [ambientLightSkyContribution] is lower than `1.0` (exclusive).
   */
  public var ambientLightEnergy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AMBIENT_LIGHT_ENERGY, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_AMBIENT_LIGHT_ENERGY, NIL)
    }

  /**
   * The reflected (specular) light source.
   */
  public var reflectedLightSource: ReflectionSource
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_REFLECTION_SOURCE,
          LONG)
      return Environment.ReflectionSource.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_REFLECTION_SOURCE,
          NIL)
    }

  /**
   * The tonemapping mode to use. Tonemapping is the process that "converts" HDR values to be suitable for rendering on a LDR display. (Godot doesn't support rendering on HDR displays yet.)
   */
  public var tonemapMode: ToneMapper
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_TONEMAPPER, LONG)
      return Environment.ToneMapper.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_TONEMAPPER, NIL)
    }

  /**
   * The default exposure used for tonemapping. Higher values result in a brighter image. See also [tonemapWhite].
   */
  public var tonemapExposure: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_TONEMAP_EXPOSURE,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_TONEMAP_EXPOSURE,
          NIL)
    }

  /**
   * The white reference value for tonemapping (also called "whitepoint"). Higher values can make highlights look less blown out, and will also slightly darken the whole scene as a result. Only effective if the [tonemapMode] isn't set to [TONE_MAPPER_LINEAR]. See also [tonemapExposure].
   */
  public var tonemapWhite: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_TONEMAP_WHITE,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_TONEMAP_WHITE,
          NIL)
    }

  /**
   * If `true`, screen-space reflections are enabled. Screen-space reflections are more accurate than reflections from [godot.VoxelGI]s or [godot.ReflectionProbe]s, but are slower and can't reflect surfaces occluded by others.
   *
   * **Note:** SSR is only supported in the Forward+ rendering method, not Mobile or Compatibility.
   */
  public var ssrEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_SSR_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSR_ENABLED, NIL)
    }

  /**
   * The maximum number of steps for screen-space reflections. Higher values are slower.
   */
  public var ssrMaxSteps: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSR_MAX_STEPS,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSR_MAX_STEPS,
          NIL)
    }

  /**
   * The fade-in distance for screen-space reflections. Affects the area from the reflected material to the screen-space reflection. Only positive values are valid (negative values will be clamped to `0.0`).
   */
  public var ssrFadeIn: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSR_FADE_IN,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSR_FADE_IN, NIL)
    }

  /**
   * The fade-out distance for screen-space reflections. Affects the area from the screen-space reflection to the "global" reflection. Only positive values are valid (negative values will be clamped to `0.0`).
   */
  public var ssrFadeOut: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSR_FADE_OUT,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSR_FADE_OUT, NIL)
    }

  /**
   * The depth tolerance for screen-space reflections.
   */
  public var ssrDepthTolerance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSR_DEPTH_TOLERANCE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSR_DEPTH_TOLERANCE, NIL)
    }

  /**
   * If `true`, the screen-space ambient occlusion effect is enabled. This darkens objects' corners and cavities to simulate ambient light not reaching the entire object as in real life. This works well for small, dynamic objects, but baked lighting or ambient occlusion textures will do a better job at displaying ambient occlusion on large static objects. Godot uses a form of SSAO called Adaptive Screen Space Ambient Occlusion which is itself a form of Horizon Based Ambient Occlusion.
   *
   * **Note:** SSAO is only supported in the Forward+ rendering method, not Mobile or Compatibility.
   */
  public var ssaoEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_SSAO_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_ENABLED, NIL)
    }

  /**
   * The distance at which objects can occlude each other when calculating screen-space ambient occlusion. Higher values will result in occlusion over a greater distance at the cost of performance and quality.
   */
  public var ssaoRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_RADIUS,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_RADIUS, NIL)
    }

  /**
   * The primary screen-space ambient occlusion intensity. Acts as a multiplier for the screen-space ambient occlusion effect. A higher value results in darker occlusion.
   */
  public var ssaoIntensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_INTENSITY,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_INTENSITY,
          NIL)
    }

  /**
   * The distribution of occlusion. A higher value results in darker occlusion, similar to [ssaoIntensity], but with a sharper falloff.
   */
  public var ssaoPower: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_POWER,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_POWER, NIL)
    }

  /**
   * Sets the strength of the additional level of detail for the screen-space ambient occlusion effect. A high value makes the detail pass more prominent, but it may contribute to aliasing in your final image.
   */
  public var ssaoDetail: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_DETAIL,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_DETAIL, NIL)
    }

  /**
   * The threshold for considering whether a given point on a surface is occluded or not represented as an angle from the horizon mapped into the `0.0-1.0` range. A value of `1.0` results in no occlusion.
   */
  public var ssaoHorizon: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_HORIZON,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_HORIZON, NIL)
    }

  /**
   * The amount that the screen-space ambient occlusion effect is allowed to blur over the edges of objects. Setting too high will result in aliasing around the edges of objects. Setting too low will make object edges appear blurry.
   */
  public var ssaoSharpness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_SHARPNESS,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_SHARPNESS,
          NIL)
    }

  /**
   * The screen-space ambient occlusion intensity in direct light. In real life, ambient occlusion only applies to indirect light, which means its effects can't be seen in direct light. Values higher than `0` will make the SSAO effect visible in direct light.
   */
  public var ssaoLightAffect: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_DIRECT_LIGHT_AFFECT, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_DIRECT_LIGHT_AFFECT, NIL)
    }

  /**
   * The screen-space ambient occlusion intensity on materials that have an AO texture defined. Values higher than `0` will make the SSAO effect visible in areas darkened by AO textures.
   */
  public var ssaoAoChannelAffect: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_AO_CHANNEL_AFFECT, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_AO_CHANNEL_AFFECT, NIL)
    }

  /**
   * If `true`, the screen-space indirect lighting effect is enabled. Screen space indirect lighting is a form of indirect lighting that allows diffuse light to bounce between nearby objects. Screen-space indirect lighting works very similarly to screen-space ambient occlusion, in that it only affects a limited range. It is intended to be used along with a form of proper global illumination like SDFGI or [godot.VoxelGI]. Screen-space indirect lighting is not affected by individual light's [godot.Light3D.lightIndirectEnergy].
   *
   * **Note:** SSIL is only supported in the Forward+ rendering method, not Mobile or Compatibility.
   */
  public var ssilEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_SSIL_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSIL_ENABLED, NIL)
    }

  /**
   * The distance that bounced lighting can travel when using the screen space indirect lighting effect. A larger value will result in light bouncing further in a scene, but may result in under-sampling artifacts which look like long spikes surrounding light sources.
   */
  public var ssilRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSIL_RADIUS,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSIL_RADIUS, NIL)
    }

  /**
   * The brightness multiplier for the screen-space indirect lighting effect. A higher value will result in brighter light.
   */
  public var ssilIntensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSIL_INTENSITY,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSIL_INTENSITY,
          NIL)
    }

  /**
   * The amount that the screen-space indirect lighting effect is allowed to blur over the edges of objects. Setting too high will result in aliasing around the edges of objects. Setting too low will make object edges appear blurry.
   */
  public var ssilSharpness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSIL_SHARPNESS,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSIL_SHARPNESS,
          NIL)
    }

  /**
   * Amount of normal rejection used when calculating screen-space indirect lighting. Normal rejection uses the normal of a given sample point to reject samples that are facing away from the current pixel. Normal rejection is necessary to avoid light leaking when only one side of an object is illuminated. However, normal rejection can be disabled if light leaking is desirable, such as when the scene mostly contains emissive objects that emit light from faces that cannot be seen from the camera.
   */
  public var ssilNormalRejection: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSIL_NORMAL_REJECTION, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSIL_NORMAL_REJECTION, NIL)
    }

  /**
   * If `true`, enables signed distance field global illumination for meshes that have their [godot.GeometryInstance3D.giMode] set to [godot.GeometryInstance3D.GI_MODE_STATIC]. SDFGI is a real-time global illumination technique that works well with procedurally generated and user-built levels, including in situations where geometry is created during gameplay. The signed distance field is automatically generated around the camera as it moves. Dynamic lights are supported, but dynamic occluders and emissive surfaces are not.
   *
   * **Note:** SDFGI is only supported in the Forward+ rendering method, not Mobile or Compatibility.
   *
   * **Performance:** SDFGI is relatively demanding on the GPU and is not suited to low-end hardware such as integrated graphics (consider [godot.LightmapGI] instead). To improve SDFGI performance, enable [godot.ProjectSettings.rendering/globalIllumination/gi/useHalfResolution] in the Project Settings.
   *
   * **Note:** Meshes should have sufficiently thick walls to avoid light leaks (avoid one-sided walls). For interior levels, enclose your level geometry in a sufficiently large box and bridge the loops to close the mesh.
   */
  public var sdfgiEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_SDFGI_ENABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_ENABLED,
          NIL)
    }

  /**
   * If `true`, SDFGI uses an occlusion detection approach to reduce light leaking. Occlusion may however introduce dark blotches in certain spots, which may be undesired in mostly outdoor scenes. [sdfgiUseOcclusion] has a performance impact and should only be enabled when needed.
   */
  public var sdfgiUseOcclusion: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_SDFGI_USING_OCCLUSION, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_USE_OCCLUSION, NIL)
    }

  /**
   * If `true`, SDFGI takes the environment lighting into account. This should be set to `false` for interior scenes.
   */
  public var sdfgiReadSkyLight: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_SDFGI_READING_SKY_LIGHT, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_READ_SKY_LIGHT, NIL)
    }

  /**
   * The energy multiplier applied to light every time it bounces from a surface when using SDFGI. Values greater than `0.0` will simulate multiple bounces, resulting in a more realistic appearance. Increasing [sdfgiBounceFeedback] generally has no performance impact. See also [sdfgiEnergy].
   *
   * **Note:** Values greater than `0.5` can cause infinite feedback loops and should be avoided in scenes with bright materials.
   *
   * **Note:** If [sdfgiBounceFeedback] is `0.0`, indirect lighting will not be represented in reflections as light will only bounce one time.
   */
  public var sdfgiBounceFeedback: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SDFGI_BOUNCE_FEEDBACK, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_BOUNCE_FEEDBACK, NIL)
    }

  /**
   * The number of cascades to use for SDFGI (between 1 and 8). A higher number of cascades allows displaying SDFGI further away while preserving detail up close, at the cost of performance. When using SDFGI on small-scale levels, [sdfgiCascades] can often be decreased between `1` and `4` to improve performance.
   */
  public var sdfgiCascades: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SDFGI_CASCADES,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_CASCADES,
          NIL)
    }

  /**
   * The cell size to use for the closest SDFGI cascade (in 3D units). Lower values allow SDFGI to be more precise up close, at the cost of making SDFGI updates more demanding. This can cause stuttering when the camera moves fast. Higher values allow SDFGI to cover more ground, while also reducing the performance impact of SDFGI updates.
   *
   * **Note:** This property is linked to [sdfgiMaxDistance] and [sdfgiCascade0Distance]. Changing its value will automatically change those properties as well.
   */
  public var sdfgiMinCellSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SDFGI_MIN_CELL_SIZE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_MIN_CELL_SIZE, NIL)
    }

  /**
   * **Note:** This property is linked to [sdfgiMinCellSize] and [sdfgiMaxDistance]. Changing its value will automatically change those properties as well.
   */
  public var sdfgiCascade0Distance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SDFGI_CASCADE0_DISTANCE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_CASCADE0_DISTANCE, NIL)
    }

  /**
   * The maximum distance at which SDFGI is visible. Beyond this distance, environment lighting or other sources of GI such as [godot.ReflectionProbe] will be used as a fallback.
   *
   * **Note:** This property is linked to [sdfgiMinCellSize] and [sdfgiCascade0Distance]. Changing its value will automatically change those properties as well.
   */
  public var sdfgiMaxDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SDFGI_MAX_DISTANCE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_MAX_DISTANCE, NIL)
    }

  /**
   * The Y scale to use for SDFGI cells. Lower values will result in SDFGI cells being packed together more closely on the Y axis. This is used to balance between quality and covering a lot of vertical ground. [sdfgiYScale] should be set depending on how vertical your scene is (and how fast your camera may move on the Y axis).
   */
  public var sdfgiYScale: SDFGIYScale
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SDFGI_Y_SCALE,
          LONG)
      return Environment.SDFGIYScale.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_Y_SCALE,
          NIL)
    }

  /**
   * The energy multiplier to use for SDFGI. Higher values will result in brighter indirect lighting and reflections. See also [sdfgiBounceFeedback].
   */
  public var sdfgiEnergy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SDFGI_ENERGY,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_ENERGY, NIL)
    }

  /**
   * The normal bias to use for SDFGI probes. Increasing this value can reduce visible streaking artifacts on sloped surfaces, at the cost of increased light leaking.
   */
  public var sdfgiNormalBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SDFGI_NORMAL_BIAS,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_NORMAL_BIAS,
          NIL)
    }

  /**
   * The constant bias to use for SDFGI probes. Increasing this value can reduce visible streaking artifacts on sloped surfaces, at the cost of increased light leaking.
   */
  public var sdfgiProbeBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SDFGI_PROBE_BIAS,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SDFGI_PROBE_BIAS,
          NIL)
    }

  /**
   * If `true`, the glow effect is enabled.
   *
   * **Note:** Glow is only supported in the Forward+ and Mobile rendering methods, not Compatibility. When using the Mobile rendering method, glow will look different due to the lower dynamic range available in the Mobile rendering method.
   */
  public var glowEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_GLOW_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_ENABLED, NIL)
    }

  /**
   * If `true`, glow levels will be normalized so that summed together their intensities equal `1.0`.
   */
  public var glowNormalized: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_GLOW_NORMALIZED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_NORMALIZED,
          NIL)
    }

  /**
   * The overall brightness multiplier of the glow effect. When using the Mobile rendering method (which only supports a lower dynamic range up to `2.0`), this should be increased to `1.5` to compensate.
   */
  public var glowIntensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_INTENSITY,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_INTENSITY,
          NIL)
    }

  /**
   * The strength of the glow effect. This applies as the glow is blurred across the screen and increases the distance and intensity of the blur. When using the Mobile rendering method, this should be increased to compensate for the lower dynamic range.
   */
  public var glowStrength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_STRENGTH,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_STRENGTH,
          NIL)
    }

  /**
   * When using the [GLOW_BLEND_MODE_MIX] [glowBlendMode], this controls how much the source image is blended with the glow layer. A value of `0.0` makes the glow rendering invisible, while a value of `1.0` is equivalent to [GLOW_BLEND_MODE_REPLACE].
   */
  public var glowMix: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_MIX, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_MIX, NIL)
    }

  /**
   * The bloom's intensity. If set to a value higher than `0`, this will make glow visible in areas darker than the [glowHdrThreshold].
   */
  public var glowBloom: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_BLOOM,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_BLOOM, NIL)
    }

  /**
   * The glow blending mode.
   */
  public var glowBlendMode: GlowBlendMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_BLEND_MODE,
          LONG)
      return Environment.GlowBlendMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_BLEND_MODE,
          NIL)
    }

  /**
   * The lower threshold of the HDR glow. When using the Mobile rendering method (which only supports a lower dynamic range up to `2.0`), this may need to be below `1.0` for glow to be visible. A value of `0.9` works well in this case. This value also needs to be decreased below `1.0` when using glow in 2D, as 2D rendering is performed in SDR.
   */
  public var glowHdrThreshold: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_HDR_BLEED_THRESHOLD, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_HDR_BLEED_THRESHOLD, NIL)
    }

  /**
   * The bleed scale of the HDR glow.
   */
  public var glowHdrScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_HDR_BLEED_SCALE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_HDR_BLEED_SCALE, NIL)
    }

  /**
   * The higher threshold of the HDR glow. Areas brighter than this threshold will be clamped for the purposes of the glow effect.
   */
  public var glowHdrLuminanceCap: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_HDR_LUMINANCE_CAP, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_HDR_LUMINANCE_CAP, NIL)
    }

  /**
   * How strong of an impact the [glowMap] should have on the overall glow effect. A strength of `0.0` means the glow map has no effect on the overall glow effect. A strength of `1.0` means the glow has a full effect on the overall glow effect (and can turn off glow entirely in specific areas of the screen if the glow map has black areas).
   */
  public var glowMapStrength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_MAP_STRENGTH,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_MAP_STRENGTH,
          NIL)
    }

  /**
   * The texture that should be used as a glow map to *multiply* the resulting glow color according to [glowMapStrength]. This can be used to create a "lens dirt" effect. The texture's RGB color channels are used for modulation, but the alpha channel is ignored.
   *
   * **Note:** The texture will be stretched to fit the screen. Therefore, it's recommended to use a texture with an aspect ratio that matches your project's base aspect ratio (typically 16:9).
   */
  public var glowMap: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_MAP, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_MAP, NIL)
    }

  /**
   * If `true`, fog effects are enabled.
   */
  public var fogEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_FOG_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_ENABLED, NIL)
    }

  /**
   * The fog's color.
   */
  public var fogLightColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_LIGHT_COLOR,
          COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_LIGHT_COLOR,
          NIL)
    }

  /**
   * The fog's brightness. Higher values result in brighter fog.
   */
  public var fogLightEnergy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_LIGHT_ENERGY,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_LIGHT_ENERGY,
          NIL)
    }

  /**
   * If set above `0.0`, renders the scene's directional light(s) in the fog color depending on the view angle. This can be used to give the impression that the sun is "piercing" through the fog.
   */
  public var fogSunScatter: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_SUN_SCATTER,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_SUN_SCATTER,
          NIL)
    }

  /**
   * The *exponential* fog density to use. Higher values result in a more dense fog. Fog rendering is exponential as in real life.
   */
  public var fogDensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_DENSITY,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_DENSITY, NIL)
    }

  /**
   * If set above `0.0` (exclusive), blends between the fog's color and the color of the background [godot.Sky]. This has a small performance cost when set above `0.0`. Must have [backgroundMode] set to [BG_SKY].
   *
   * This is useful to simulate [aerial perspective](https://en.wikipedia.org/wiki/Aerial_perspective) in large scenes with low density fog. However, it is not very useful for high-density fog, as the sky will shine through. When set to `1.0`, the fog color comes completely from the [godot.Sky]. If set to `0.0`, aerial perspective is disabled.
   */
  public var fogAerialPerspective: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_AERIAL_PERSPECTIVE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_AERIAL_PERSPECTIVE, NIL)
    }

  /**
   * The factor to use when affecting the sky with non-volumetric fog. `1.0` means that fog can fully obscure the sky. Lower values reduce the impact of fog on sky rendering, with `0.0` not affecting sky rendering at all.
   *
   * **Note:** [fogSkyAffect] has no visual effect if [fogAerialPerspective] is `1.0`.
   */
  public var fogSkyAffect: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_SKY_AFFECT,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_SKY_AFFECT,
          NIL)
    }

  /**
   * The height at which the height fog effect begins.
   */
  public var fogHeight: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_HEIGHT,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_HEIGHT, NIL)
    }

  /**
   * The density used to increase fog as height decreases. To make fog increase as height increases, use a negative value.
   */
  public var fogHeightDensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_HEIGHT_DENSITY, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_HEIGHT_DENSITY, NIL)
    }

  /**
   * Enables the volumetric fog effect. Volumetric fog uses a screen-aligned froxel buffer to calculate accurate volumetric scattering in the short to medium range. Volumetric fog interacts with [godot.FogVolume]s and lights to calculate localized and global fog. Volumetric fog uses a PBR single-scattering model based on extinction, scattering, and emission which it exposes to users as density, albedo, and emission.
   *
   * **Note:** Volumetric fog is only supported in the Forward+ rendering method, not Mobile or Compatibility.
   */
  public var volumetricFogEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_VOLUMETRIC_FOG_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_ENABLED, NIL)
    }

  /**
   * The base *exponential* density of the volumetric fog. Set this to the lowest density you want to have globally. [godot.FogVolume]s can be used to add to or subtract from this density in specific areas. Fog rendering is exponential as in real life.
   *
   * A value of `0.0` disables global volumetric fog while allowing [godot.FogVolume]s to display volumetric fog in specific areas.
   *
   * To make volumetric fog work as a volumetric *lighting* solution, set [volumetricFogDensity] to the lowest non-zero value (`0.0001`) then increase lights' [godot.Light3D.lightVolumetricFogEnergy] to values between `10000` and `100000` to compensate for the very low density.
   */
  public var volumetricFogDensity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_DENSITY, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_DENSITY, NIL)
    }

  /**
   * The [godot.core.Color] of the volumetric fog when interacting with lights. Mist and fog have an albedo close to `Color(1, 1, 1, 1)` while smoke has a darker albedo.
   */
  public var volumetricFogAlbedo: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_ALBEDO, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_ALBEDO, NIL)
    }

  /**
   * The emitted light from the volumetric fog. Even with emission, volumetric fog will not cast light onto other surfaces. Emission is useful to establish an ambient color. As the volumetric fog effect uses single-scattering only, fog tends to need a little bit of emission to soften the harsh shadows.
   */
  public var volumetricFogEmission: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_EMISSION, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_EMISSION, NIL)
    }

  /**
   * The brightness of the emitted light from the volumetric fog.
   */
  public var volumetricFogEmissionEnergy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_EMISSION_ENERGY, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_EMISSION_ENERGY, NIL)
    }

  /**
   * Scales the strength of Global Illumination used in the volumetric fog's albedo color. A value of `0.0` means that Global Illumination will not impact the volumetric fog. [volumetricFogGiInject] has a small performance cost when set above `0.0`.
   *
   * **Note:** This has no visible effect if [volumetricFogDensity] is `0.0` or if [volumetricFogAlbedo] is a fully black color.
   *
   * **Note:** Only [godot.VoxelGI] and SDFGI ([godot.Environment.sdfgiEnabled]) are taken into account when using [volumetricFogGiInject]. Global illumination from [godot.LightmapGI], [godot.ReflectionProbe] and SSIL (see [ssilEnabled]) will be ignored by volumetric fog.
   */
  public var volumetricFogGiInject: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_GI_INJECT, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_GI_INJECT, NIL)
    }

  /**
   * The direction of scattered light as it goes through the volumetric fog. A value close to `1.0` means almost all light is scattered forward. A value close to `0.0` means light is scattered equally in all directions. A value close to `-1.0` means light is scattered mostly backward. Fog and mist scatter light slightly forward, while smoke scatters light equally in all directions.
   */
  public var volumetricFogAnisotropy: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_ANISOTROPY, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_ANISOTROPY, NIL)
    }

  /**
   * The distance over which the volumetric fog is computed. Increase to compute fog over a greater range, decrease to add more detail when a long range is not needed. For best quality fog, keep this as low as possible. See also [godot.ProjectSettings.rendering/environment/volumetricFog/volumeDepth].
   */
  public var volumetricFogLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_LENGTH, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_LENGTH, NIL)
    }

  /**
   * The distribution of size down the length of the froxel buffer. A higher value compresses the froxels closer to the camera and places more detail closer to the camera.
   */
  public var volumetricFogDetailSpread: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_DETAIL_SPREAD, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_DETAIL_SPREAD, NIL)
    }

  /**
   * Scales the strength of ambient light used in the volumetric fog. A value of `0.0` means that ambient light will not impact the volumetric fog. [volumetricFogAmbientInject] has a small performance cost when set above `0.0`.
   *
   * **Note:** This has no visible effect if [volumetricFogDensity] is `0.0` or if [volumetricFogAlbedo] is a fully black color.
   */
  public var volumetricFogAmbientInject: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_AMBIENT_INJECT, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_AMBIENT_INJECT, NIL)
    }

  /**
   * The factor to use when affecting the sky with volumetric fog. `1.0` means that volumetric fog can fully obscure the sky. Lower values reduce the impact of volumetric fog on sky rendering, with `0.0` not affecting sky rendering at all.
   *
   * **Note:** [volumetricFogSkyAffect] also affects [godot.FogVolume]s, even if [volumetricFogDensity] is `0.0`. If you notice [godot.FogVolume]s are disappearing when looking towards the sky, set [volumetricFogSkyAffect] to `1.0`.
   */
  public var volumetricFogSkyAffect: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_SKY_AFFECT, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_SKY_AFFECT, NIL)
    }

  /**
   * Enables temporal reprojection in the volumetric fog. Temporal reprojection blends the current frame's volumetric fog with the last frame's volumetric fog to smooth out jagged edges. The performance cost is minimal; however, it leads to moving [godot.FogVolume]s and [godot.Light3D]s "ghosting" and leaving a trail behind them. When temporal reprojection is enabled, try to avoid moving [godot.FogVolume]s or [godot.Light3D]s too fast. Short-lived dynamic lighting effects should have [godot.Light3D.lightVolumetricFogEnergy] set to `0.0` to avoid ghosting.
   */
  public var volumetricFogTemporalReprojectionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_VOLUMETRIC_FOG_TEMPORAL_REPROJECTION_ENABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
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
  public var volumetricFogTemporalReprojectionAmount: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_VOLUMETRIC_FOG_TEMPORAL_REPROJECTION_AMOUNT,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_VOLUMETRIC_FOG_TEMPORAL_REPROJECTION_AMOUNT, NIL)
    }

  /**
   * If `true`, enables the `adjustment_*` properties provided by this resource. If `false`, modifications to the `adjustment_*` properties will have no effect on the rendered scene.
   *
   * **Note:** Adjustments are only supported in the Forward+ and Mobile rendering methods, not Compatibility.
   */
  public var adjustmentEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_IS_ADJUSTMENT_ENABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_ADJUSTMENT_ENABLED, NIL)
    }

  /**
   * The global brightness value of the rendered scene. Effective only if `adjustment_enabled` is `true`.
   */
  public var adjustmentBrightness: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_ADJUSTMENT_BRIGHTNESS, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_ADJUSTMENT_BRIGHTNESS, NIL)
    }

  /**
   * The global contrast value of the rendered scene (default value is 1). Effective only if `adjustment_enabled` is `true`.
   */
  public var adjustmentContrast: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_ADJUSTMENT_CONTRAST, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_ADJUSTMENT_CONTRAST, NIL)
    }

  /**
   * The global color saturation value of the rendered scene (default value is 1). Effective only if `adjustment_enabled` is `true`.
   */
  public var adjustmentSaturation: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_ADJUSTMENT_SATURATION, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_ADJUSTMENT_SATURATION, NIL)
    }

  /**
   * The [godot.Texture2D] or [godot.Texture3D] lookup table (LUT) to use for the built-in post-process color grading. Can use a [godot.GradientTexture1D] for a 1-dimensional LUT, or a [godot.Texture3D] for a more complex LUT. Effective only if `adjustment_enabled` is `true`.
   */
  public var adjustmentColorCorrection: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_ADJUSTMENT_COLOR_CORRECTION, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_ADJUSTMENT_COLOR_CORRECTION, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ENVIRONMENT, scriptIndex)
    return true
  }

  /**
   * The [godot.core.Color] displayed for clear areas of the scene. Only effective when using the [BG_COLOR] background mode.
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
  public open fun backgroundColor(block: Color.() -> Unit): Color = backgroundColor.apply{
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
  public open fun skyRotation(block: Vector3.() -> Unit): Vector3 = skyRotation.apply{
      block(this)
      skyRotation = this
  }


  /**
   * The ambient light's [godot.core.Color]. Only effective if [ambientLightSkyContribution] is lower than `1.0` (exclusive).
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
  public open fun ambientLightColor(block: Color.() -> Unit): Color = ambientLightColor.apply{
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
  public open fun fogLightColor(block: Color.() -> Unit): Color = fogLightColor.apply{
      block(this)
      fogLightColor = this
  }


  /**
   * The [godot.core.Color] of the volumetric fog when interacting with lights. Mist and fog have an albedo close to `Color(1, 1, 1, 1)` while smoke has a darker albedo.
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
  public open fun volumetricFogAlbedo(block: Color.() -> Unit): Color = volumetricFogAlbedo.apply{
      block(this)
      volumetricFogAlbedo = this
  }


  /**
   * The emitted light from the volumetric fog. Even with emission, volumetric fog will not cast light onto other surfaces. Emission is useful to establish an ambient color. As the volumetric fog effect uses single-scattering only, fog tends to need a little bit of emission to soften the harsh shadows.
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
  public open fun volumetricFogEmission(block: Color.() -> Unit): Color =
      volumetricFogEmission.apply{
      block(this)
      volumetricFogEmission = this
  }


  /**
   * Sets the intensity of the glow level [idx]. A value above `0.0` enables the level. Each level relies on the previous level. This means that enabling higher glow levels will slow down the glow effect rendering, even if previous levels aren't enabled.
   */
  public fun setGlowLevel(idx: Int, intensity: Float): Unit {
    TransferContext.writeArguments(LONG to idx.toLong(), DOUBLE to intensity.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_LEVEL, NIL)
  }

  /**
   * Returns the intensity of the glow level [idx].
   */
  public fun getGlowLevel(idx: Int): Float {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVEL, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public enum class BGMode(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
     * Specify a specific [godot.core.Color] for ambient light. This provides a slight performance boost over [AMBIENT_SOURCE_SKY].
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
     * Use the [godot.Sky] for reflections regardless of what the background is.
     */
    REFLECTION_SOURCE_SKY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ToneMapper(
    id: Long,
  ) {
    /**
     * Linear tonemapper operator. Reads the linear data and passes it on unmodified. This can cause bright lighting to look blown out, with noticeable clipping in the output colors.
     */
    TONE_MAPPER_LINEAR(0),
    /**
     * Reinhardt tonemapper operator. Performs a variation on rendered pixels' colors by this formula: `color = color / (1 + color)`. This avoids clipping bright highlights, but the resulting image can look a bit dull.
     */
    TONE_MAPPER_REINHARDT(1),
    /**
     * Filmic tonemapper operator. This avoids clipping bright highlights, with a resulting image that usually looks more vivid than [TONE_MAPPER_REINHARDT].
     */
    TONE_MAPPER_FILMIC(2),
    /**
     * Use the Academy Color Encoding System tonemapper. ACES is slightly more expensive than other options, but it handles bright lighting in a more realistic fashion by desaturating it as it becomes brighter. ACES typically has a more contrasted output compared to [TONE_MAPPER_REINHARDT] and [TONE_MAPPER_FILMIC].
     *
     * **Note:** This tonemapping operator is called "ACES Fitted" in Godot 3.x.
     */
    TONE_MAPPER_ACES(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class GlowBlendMode(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class SDFGIYScale(
    id: Long,
  ) {
    /**
     * Use 50% scale for SDFGI on the Y (vertical) axis. SDFGI cells will be twice as short as they are wide. This allows providing increased GI detail and reduced light leaking with thin floors and ceilings. This is usually the best choice for scenes that don't feature much verticality.
     */
    SDFGI_Y_SCALE_50_PERCENT(0),
    /**
     * Use 75% scale for SDFGI on the Y (vertical) axis. This is a balance between the 50% and 100% SDFGI Y scales.
     */
    SDFGI_Y_SCALE_75_PERCENT(1),
    /**
     * Use 100% scale for SDFGI on the Y (vertical) axis. SDFGI cells will be as tall as they are wide. This is usually the best choice for highly vertical scenes. The downside is that light leaking may become more noticeable with thin floors and ceilings.
     */
    SDFGI_Y_SCALE_100_PERCENT(2),
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

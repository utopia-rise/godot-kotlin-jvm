// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Basis
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.BASIS
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
 *
 * If the target [godot.Viewport] is set to "2D Without Sampling", all post-processing effects will be unavailable. With "3D Without Effects", the following options will be unavailable:
 *
 * - Ssao
 *
 * - Ss Reflections
 *
 * This can be configured for the root Viewport with [godot.ProjectSettings.rendering/quality/intendedUsage/framebufferAllocation], or for specific Viewports via the [godot.Viewport.usage] property.
 *
 * Note that [godot.ProjectSettings.rendering/quality/intendedUsage/framebufferAllocation] has a mobile platform override to use "3D Without Effects" by default. It improves the performance on mobile devices, but at the same time affects the screen display on mobile devices.
 */
@GodotBaseType
public open class Environment : Resource() {
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
   * Applies the provided [godot.Texture] resource to affect the global color aspect of the rendered scene. Effective only if `adjustment_enabled` is `true`.
   */
  public open var adjustmentColorCorrection: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_ADJUSTMENT_COLOR_CORRECTION, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_ADJUSTMENT_COLOR_CORRECTION, NIL)
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
   * If `true`, enables the `adjustment_*` properties provided by this resource. If `false`, modifications to the `adjustment_*` properties will have no effect on the rendered scene.
   */
  public open var adjustmentEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_ADJUSTMENT_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_ADJUSTMENT_ENABLED, NIL)
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
   * If `true`, enables the tonemapping auto exposure mode of the scene renderer. If `true`, the renderer will automatically determine the exposure setting to adapt to the scene's illumination and the observed light.
   */
  public open var autoExposureEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AUTO_EXPOSURE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_AUTO_EXPOSURE_ENABLED, NIL)
    }

  /**
   * The maximum luminance value for the auto exposure.
   */
  public open var autoExposureMaxLuma: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AUTO_EXPOSURE_MAX_LUMA, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_AUTO_EXPOSURE_MAX_LUMA, NIL)
    }

  /**
   * The minimum luminance value for the auto exposure.
   */
  public open var autoExposureMinLuma: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AUTO_EXPOSURE_MIN_LUMA, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_AUTO_EXPOSURE_MIN_LUMA, NIL)
    }

  /**
   * The scale of the auto exposure effect. Affects the intensity of auto exposure.
   */
  public open var autoExposureScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AUTO_EXPOSURE_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_AUTO_EXPOSURE_SCALE, NIL)
    }

  /**
   * The speed of the auto exposure effect. Affects the time needed for the camera to perform auto exposure.
   */
  public open var autoExposureSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AUTO_EXPOSURE_SPEED, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_AUTO_EXPOSURE_SPEED, NIL)
    }

  /**
   * The ID of the camera feed to show in the background.
   */
  public open var backgroundCameraFeedId: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND_CAMERA_FEED_ID, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND_CAMERA_FEED_ID, NIL)
    }

  /**
   * The maximum layer ID to display. Only effective when using the [BG_CANVAS] background mode.
   */
  public open var backgroundCanvasMaxLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND_CANVAS_MAX_LAYER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND_CANVAS_MAX_LAYER, NIL)
    }

  /**
   * The [godot.core.Color] displayed for clear areas of the scene. Only effective when using the [BG_COLOR] or [BG_COLOR_SKY] background modes).
   */
  public open var backgroundColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND_COLOR,
          NIL)
    }

  /**
   * The power of the light emitted by the background.
   */
  public open var backgroundEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND_ENERGY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND_ENERGY,
          NIL)
    }

  /**
   * The background mode. See [enum BGMode] for possible values.
   */
  public open var backgroundMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND_MODE,
          NIL)
    }

  /**
   * The [godot.Sky] resource defined as background.
   */
  public open var backgroundSky: Sky?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND_SKY,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Sky?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND_SKY,
          NIL)
    }

  /**
   * The [godot.Sky] resource's custom field of view.
   */
  public open var backgroundSkyCustomFov: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND_SKY_CUSTOM_FOV, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND_SKY_CUSTOM_FOV, NIL)
    }

  /**
   * The [godot.Sky] resource's rotation expressed as a [godot.core.Basis].
   */
  public open var backgroundSkyOrientation: Basis
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND_SKY_ORIENTATION, BASIS)
      return TransferContext.readReturnValue(BASIS, false) as Basis
    }
    set(`value`) {
      TransferContext.writeArguments(BASIS to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND_SKY_ORIENTATION, NIL)
    }

  /**
   * The [godot.Sky] resource's rotation expressed as Euler angles in radians.
   */
  public open var backgroundSkyRotation: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND_SKY_ROTATION, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND_SKY_ROTATION, NIL)
    }

  /**
   * The [godot.Sky] resource's rotation expressed as Euler angles in degrees.
   */
  public open var backgroundSkyRotationDegrees: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND_SKY_ROTATION_DEGREES, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND_SKY_ROTATION_DEGREES, NIL)
    }

  /**
   * The amount of far blur for the depth-of-field effect.
   */
  public open var dofBlurFarAmount: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_DOF_BLUR_FAR_AMOUNT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_DOF_BLUR_FAR_AMOUNT, NIL)
    }

  /**
   * The distance from the camera where the far blur effect affects the rendering.
   */
  public open var dofBlurFarDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_DOF_BLUR_FAR_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_DOF_BLUR_FAR_DISTANCE, NIL)
    }

  /**
   * If `true`, enables the depth-of-field far blur effect.
   */
  public open var dofBlurFarEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_DOF_BLUR_FAR_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_DOF_BLUR_FAR_ENABLED, NIL)
    }

  /**
   * The depth-of-field far blur's quality. Higher values can mitigate the visible banding effect seen at higher strengths, but are much slower.
   */
  public open var dofBlurFarQuality: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_DOF_BLUR_FAR_QUALITY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_DOF_BLUR_FAR_QUALITY, NIL)
    }

  /**
   * The length of the transition between the no-blur area and far blur.
   */
  public open var dofBlurFarTransition: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_DOF_BLUR_FAR_TRANSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_DOF_BLUR_FAR_TRANSITION, NIL)
    }

  /**
   * The amount of near blur for the depth-of-field effect.
   */
  public open var dofBlurNearAmount: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_DOF_BLUR_NEAR_AMOUNT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_DOF_BLUR_NEAR_AMOUNT, NIL)
    }

  /**
   * Distance from the camera where the near blur effect affects the rendering.
   */
  public open var dofBlurNearDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_DOF_BLUR_NEAR_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_DOF_BLUR_NEAR_DISTANCE, NIL)
    }

  /**
   * If `true`, enables the depth-of-field near blur effect.
   */
  public open var dofBlurNearEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_DOF_BLUR_NEAR_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_DOF_BLUR_NEAR_ENABLED, NIL)
    }

  /**
   * The depth-of-field near blur's quality. Higher values can mitigate the visible banding effect seen at higher strengths, but are much slower.
   */
  public open var dofBlurNearQuality: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_DOF_BLUR_NEAR_QUALITY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_DOF_BLUR_NEAR_QUALITY, NIL)
    }

  /**
   * The length of the transition between the near blur and no-blur area.
   */
  public open var dofBlurNearTransition: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_DOF_BLUR_NEAR_TRANSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_DOF_BLUR_NEAR_TRANSITION, NIL)
    }

  /**
   * The fog's [godot.core.Color].
   */
  public open var fogColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_COLOR, NIL)
    }

  /**
   * The fog's depth starting distance from the camera.
   */
  public open var fogDepthBegin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_DEPTH_BEGIN,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_DEPTH_BEGIN,
          NIL)
    }

  /**
   * The fog depth's intensity curve. A number of presets are available in the **Inspector** by right-clicking the curve.
   */
  public open var fogDepthCurve: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_DEPTH_CURVE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_DEPTH_CURVE,
          NIL)
    }

  /**
   * If `true`, the depth fog effect is enabled. When enabled, fog will appear in the distance (relative to the camera).
   */
  public open var fogDepthEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_DEPTH_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_DEPTH_ENABLED,
          NIL)
    }

  /**
   * The fog's depth end distance from the camera. If this value is set to 0, it will be equal to the current camera's [godot.Camera.far] value.
   */
  public open var fogDepthEnd: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_DEPTH_END,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_DEPTH_END,
          NIL)
    }

  /**
   * If `true`, fog effects are enabled. [fogHeightEnabled] and/or [fogDepthEnabled] must be set to `true` to actually display fog.
   */
  public open var fogEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_ENABLED, NIL)
    }

  /**
   * The height fog's intensity. A number of presets are available in the **Inspector** by right-clicking the curve.
   */
  public open var fogHeightCurve: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_HEIGHT_CURVE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_HEIGHT_CURVE,
          NIL)
    }

  /**
   * If `true`, the height fog effect is enabled. When enabled, fog will appear in a defined height range, regardless of the distance from the camera. This can be used to simulate "deep water" effects with a lower performance cost compared to a dedicated shader.
   */
  public open var fogHeightEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_HEIGHT_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_HEIGHT_ENABLED, NIL)
    }

  /**
   * The Y coordinate where the height fog will be the most intense. If this value is greater than [fogHeightMin], fog will be displayed from bottom to top. Otherwise, it will be displayed from top to bottom.
   */
  public open var fogHeightMax: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_HEIGHT_MAX,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_HEIGHT_MAX,
          NIL)
    }

  /**
   * The Y coordinate where the height fog will be the least intense. If this value is greater than [fogHeightMax], fog will be displayed from top to bottom. Otherwise, it will be displayed from bottom to top.
   */
  public open var fogHeightMin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_HEIGHT_MIN,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_HEIGHT_MIN,
          NIL)
    }

  /**
   * The intensity of the depth fog color transition when looking towards the sun. The sun's direction is determined automatically using the DirectionalLight node in the scene.
   */
  public open var fogSunAmount: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_SUN_AMOUNT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_SUN_AMOUNT,
          NIL)
    }

  /**
   * The depth fog's [godot.core.Color] when looking towards the sun.
   */
  public open var fogSunColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_SUN_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_SUN_COLOR,
          NIL)
    }

  /**
   * The intensity of the fog light transmittance effect. Amount of light that the fog transmits.
   */
  public open var fogTransmitCurve: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_TRANSMIT_CURVE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_TRANSMIT_CURVE, NIL)
    }

  /**
   * Enables fog's light transmission effect. If `true`, light will be more visible in the fog to simulate light scattering as in real life.
   */
  public open var fogTransmitEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_TRANSMIT_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_TRANSMIT_ENABLED, NIL)
    }

  /**
   * Smooths out the blockiness created by sampling higher levels, at the cost of performance.
   *
   * **Note:** When using the GLES2 renderer, this is only available if the GPU supports the `GL_EXT_gpu_shader4` extension.
   */
  public open var glowBicubicUpscale: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_BICUBIC_UPSCALE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_BICUBIC_UPSCALE, NIL)
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
   * If `true`, the glow effect is enabled.
   *
   * **Note:** Only effective if [godot.ProjectSettings.rendering/quality/intendedUsage/framebufferAllocation] is **3D** (*not* **3D Without Effects**). On mobile, [godot.ProjectSettings.rendering/quality/intendedUsage/framebufferAllocation] defaults to **3D Without Effects** by default, so its `.mobile` override needs to be changed to **3D**.
   *
   * **Note:** When using GLES3 on mobile, HDR rendering is disabled by default for performance reasons. This means glow will only be visible if [glowHdrThreshold] is decreased below `1.0` or if [glowBloom] is increased above `0.0`. Also consider increasing [glowIntensity] to `1.5`. If you want glow to behave on mobile like it does on desktop (at a performance cost), enable [godot.ProjectSettings.rendering/quality/depth/hdr]'s `.mobile` override.
   */
  public open var glowEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_ENABLED, NIL)
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
   * The bleed scale of the HDR glow.
   */
  public open var glowHdrScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_HDR_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_HDR_SCALE,
          NIL)
    }

  /**
   * The lower threshold of the HDR glow. When using the GLES2 renderer (which doesn't support HDR), this needs to be below `1.0` for glow to be visible. A value of `0.9` works well in this case.
   */
  public open var glowHdrThreshold: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_HDR_THRESHOLD, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_HDR_THRESHOLD, NIL)
    }

  /**
   * Takes more samples during downsample pass of glow. This ensures that single pixels are captured by glow which makes the glow look smoother and more stable during movement. However, it is very expensive and makes the glow post process take twice as long.
   */
  public open var glowHighQuality: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_HIGH_QUALITY,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_HIGH_QUALITY,
          NIL)
    }

  /**
   * The glow intensity. When using the GLES2 renderer, this should be increased to 1.5 to compensate for the lack of HDR rendering.
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

  public open var glowLevels_1: Boolean
    get() {
      TransferContext.writeArguments(LONG to 0L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVELS_1,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_LEVELS_1,
          NIL)
    }

  public open var glowLevels_2: Boolean
    get() {
      TransferContext.writeArguments(LONG to 1L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVELS_2,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_LEVELS_2,
          NIL)
    }

  public open var glowLevels_3: Boolean
    get() {
      TransferContext.writeArguments(LONG to 2L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVELS_3,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_LEVELS_3,
          NIL)
    }

  public open var glowLevels_4: Boolean
    get() {
      TransferContext.writeArguments(LONG to 3L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVELS_4,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_LEVELS_4,
          NIL)
    }

  public open var glowLevels_5: Boolean
    get() {
      TransferContext.writeArguments(LONG to 4L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVELS_5,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 4L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_LEVELS_5,
          NIL)
    }

  public open var glowLevels_6: Boolean
    get() {
      TransferContext.writeArguments(LONG to 5L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVELS_6,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 5L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_LEVELS_6,
          NIL)
    }

  public open var glowLevels_7: Boolean
    get() {
      TransferContext.writeArguments(LONG to 6L)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVELS_7,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 6L, BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_LEVELS_7,
          NIL)
    }

  /**
   * The glow strength. When using the GLES2 renderer, this should be increased to 1.3 to compensate for the lack of HDR rendering.
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
   * The depth tolerance for screen-space reflections.
   */
  public open var ssReflectionsDepthTolerance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SS_REFLECTIONS_DEPTH_TOLERANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SS_REFLECTIONS_DEPTH_TOLERANCE, NIL)
    }

  /**
   * If `true`, screen-space reflections are enabled. Screen-space reflections are more accurate than reflections from [godot.GIProbe]s or [godot.ReflectionProbe]s, but are slower and can't reflect surfaces occluded by others.
   */
  public open var ssReflectionsEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SS_REFLECTIONS_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SS_REFLECTIONS_ENABLED, NIL)
    }

  /**
   * The fade-in distance for screen-space reflections. Affects the area from the reflected material to the screen-space reflection).
   */
  public open var ssReflectionsFadeIn: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SS_REFLECTIONS_FADE_IN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SS_REFLECTIONS_FADE_IN, NIL)
    }

  /**
   * The fade-out distance for screen-space reflections. Affects the area from the screen-space reflection to the "global" reflection.
   */
  public open var ssReflectionsFadeOut: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SS_REFLECTIONS_FADE_OUT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SS_REFLECTIONS_FADE_OUT, NIL)
    }

  /**
   * The maximum number of steps for screen-space reflections. Higher values are slower.
   */
  public open var ssReflectionsMaxSteps: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SS_REFLECTIONS_MAX_STEPS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SS_REFLECTIONS_MAX_STEPS, NIL)
    }

  /**
   * If `true`, screen-space reflections will take the material roughness into account.
   */
  public open var ssReflectionsRoughness: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SS_REFLECTIONS_ROUGHNESS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SS_REFLECTIONS_ROUGHNESS, NIL)
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
   * The screen-space ambient occlusion bias. This should be kept high enough to prevent "smooth" curves from being affected by ambient occlusion.
   */
  public open var ssaoBias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_BIAS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_BIAS, NIL)
    }

  /**
   * The screen-space ambient occlusion blur quality. See [enum SSAOBlur] for possible values.
   */
  public open var ssaoBlur: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_BLUR, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_BLUR, NIL)
    }

  /**
   * The screen-space ambient occlusion color.
   */
  public open var ssaoColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_COLOR, NIL)
    }

  /**
   * The screen-space ambient occlusion edge sharpness.
   */
  public open var ssaoEdgeSharpness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_EDGE_SHARPNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_EDGE_SHARPNESS, NIL)
    }

  /**
   * If `true`, the screen-space ambient occlusion effect is enabled. This darkens objects' corners and cavities to simulate ambient light not reaching the entire object as in real life. This works well for small, dynamic objects, but baked lighting or ambient occlusion textures will do a better job at displaying ambient occlusion on large static objects. This is a costly effect and should be disabled first when running into performance issues.
   */
  public open var ssaoEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_ENABLED, NIL)
    }

  /**
   * The primary screen-space ambient occlusion intensity. See also [ssaoRadius].
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
   * The secondary screen-space ambient occlusion intensity. See also [ssaoRadius2].
   */
  public open var ssaoIntensity2: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_INTENSITY2,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_INTENSITY2,
          NIL)
    }

  /**
   * The screen-space ambient occlusion intensity in direct light. In real life, ambient occlusion only applies to indirect light, which means its effects can't be seen in direct light. Values higher than `0` will make the SSAO effect visible in direct light.
   */
  public open var ssaoLightAffect: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_LIGHT_AFFECT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_LIGHT_AFFECT,
          NIL)
    }

  /**
   * The screen-space ambient occlusion quality. Higher qualities will make better use of small objects for ambient occlusion, but are slower.
   */
  public open var ssaoQuality: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_QUALITY,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_QUALITY, NIL)
    }

  /**
   * The primary screen-space ambient occlusion radius.
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
   * The secondary screen-space ambient occlusion radius. If set to a value higher than `0`, enables the secondary screen-space ambient occlusion effect which can be used to improve the effect's appearance (at the cost of performance).
   */
  public open var ssaoRadius2: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_RADIUS2,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_RADIUS2, NIL)
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
   * The tonemapping mode to use. Tonemapping is the process that "converts" HDR values to be suitable for rendering on a SDR display. (Godot doesn't support rendering on HDR displays yet.)
   */
  public open var tonemapMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_TONEMAP_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_TONEMAP_MODE, NIL)
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

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ENVIRONMENT)
  }

  @CoreTypeHelper
  public open fun ambientLightColor(schedule: Color.() -> Unit): Color = ambientLightColor.apply{
      schedule(this)
      ambientLightColor = this
  }


  @CoreTypeHelper
  public open fun backgroundColor(schedule: Color.() -> Unit): Color = backgroundColor.apply{
      schedule(this)
      backgroundColor = this
  }


  @CoreTypeHelper
  public open fun backgroundSkyOrientation(schedule: Basis.() -> Unit): Basis =
      backgroundSkyOrientation.apply{
      schedule(this)
      backgroundSkyOrientation = this
  }


  @CoreTypeHelper
  public open fun backgroundSkyRotation(schedule: Vector3.() -> Unit): Vector3 =
      backgroundSkyRotation.apply{
      schedule(this)
      backgroundSkyRotation = this
  }


  @CoreTypeHelper
  public open fun backgroundSkyRotationDegrees(schedule: Vector3.() -> Unit): Vector3 =
      backgroundSkyRotationDegrees.apply{
      schedule(this)
      backgroundSkyRotationDegrees = this
  }


  @CoreTypeHelper
  public open fun fogColor(schedule: Color.() -> Unit): Color = fogColor.apply{
      schedule(this)
      fogColor = this
  }


  @CoreTypeHelper
  public open fun fogSunColor(schedule: Color.() -> Unit): Color = fogSunColor.apply{
      schedule(this)
      fogSunColor = this
  }


  @CoreTypeHelper
  public open fun ssaoColor(schedule: Color.() -> Unit): Color = ssaoColor.apply{
      schedule(this)
      ssaoColor = this
  }


  public enum class SSAOBlur(
    id: Long
  ) {
    /**
     * No blur for the screen-space ambient occlusion effect (fastest).
     */
    SSAO_BLUR_DISABLED(0),
    /**
     * 1×1 blur for the screen-space ambient occlusion effect.
     */
    SSAO_BLUR_1x1(1),
    /**
     * 2×2 blur for the screen-space ambient occlusion effect.
     */
    SSAO_BLUR_2x2(2),
    /**
     * 3×3 blur for the screen-space ambient occlusion effect (slowest).
     */
    SSAO_BLUR_3x3(3),
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
     * Use the legacy Godot version of the Academy Color Encoding System tonemapper. Unlike [TONE_MAPPER_ACES_FITTED], this version of ACES does not handle bright lighting in a physically accurate way. ACES typically has a more contrasted output compared to [TONE_MAPPER_REINHARDT] and [TONE_MAPPER_FILMIC].
     *
     * **Note:** This tonemapping operator will be removed in Godot 4.0 in favor of the more accurate [TONE_MAPPER_ACES_FITTED].
     */
    TONE_MAPPER_ACES(3),
    /**
     * Use the Academy Color Encoding System tonemapper. ACES is slightly more expensive than other options, but it handles bright lighting in a more realistic fashion by desaturating it as it becomes brighter. ACES typically has a more contrasted output compared to [TONE_MAPPER_REINHARDT] and [TONE_MAPPER_FILMIC].
     */
    TONE_MAPPER_ACES_FITTED(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
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
     * Clears the background using the clear color defined in [godot.ProjectSettings.rendering/environment/defaultClearColor].
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
     * Clears the background using a custom clear color and allows defining a sky for shading and reflection. This mode is slightly faster than [BG_SKY] and should be preferred in scenes where reflections can be visible, but the sky itself never is (e.g. top-down camera).
     */
    BG_COLOR_SKY(3),
    /**
     * Displays a [godot.CanvasLayer] in the background.
     */
    BG_CANVAS(4),
    /**
     * Keeps on screen every pixel drawn in the background. Only select this mode if you really need to keep the old data. On modern GPUs it will generally not be faster than clearing the background, and can be significantly slower, particularly on mobile.
     *
     * It can only be safely used in fully-interior scenes (no visible sky or sky reflections). If enabled in a scene where the background is visible, "ghost trail" artifacts will be visible when moving the camera.
     */
    BG_KEEP(5),
    /**
     * Displays a camera feed in the background.
     */
    BG_CAMERA_FEED(6),
    /**
     * Represents the size of the [enum BGMode] enum.
     */
    BG_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class SSAOQuality(
    id: Long
  ) {
    /**
     * Low quality for the screen-space ambient occlusion effect (fastest).
     */
    SSAO_QUALITY_LOW(0),
    /**
     * Medium quality for the screen-space ambient occlusion effect.
     */
    SSAO_QUALITY_MEDIUM(1),
    /**
     * High quality for the screen-space ambient occlusion effect (slowest).
     */
    SSAO_QUALITY_HIGH(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DOFBlurQuality(
    id: Long
  ) {
    /**
     * Low depth-of-field blur quality (fastest).
     */
    DOF_BLUR_QUALITY_LOW(0),
    /**
     * Medium depth-of-field blur quality.
     */
    DOF_BLUR_QUALITY_MEDIUM(1),
    /**
     * High depth-of-field blur quality (slowest).
     */
    DOF_BLUR_QUALITY_HIGH(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Displays a camera feed in the background.
     */
    public final const val BG_CAMERA_FEED: Long = 6

    /**
     * Displays a [godot.CanvasLayer] in the background.
     */
    public final const val BG_CANVAS: Long = 4

    /**
     * Clears the background using the clear color defined in [godot.ProjectSettings.rendering/environment/defaultClearColor].
     */
    public final const val BG_CLEAR_COLOR: Long = 0

    /**
     * Clears the background using a custom clear color.
     */
    public final const val BG_COLOR: Long = 1

    /**
     * Clears the background using a custom clear color and allows defining a sky for shading and reflection. This mode is slightly faster than [BG_SKY] and should be preferred in scenes where reflections can be visible, but the sky itself never is (e.g. top-down camera).
     */
    public final const val BG_COLOR_SKY: Long = 3

    /**
     * Keeps on screen every pixel drawn in the background. Only select this mode if you really need to keep the old data. On modern GPUs it will generally not be faster than clearing the background, and can be significantly slower, particularly on mobile.
     *
     * It can only be safely used in fully-interior scenes (no visible sky or sky reflections). If enabled in a scene where the background is visible, "ghost trail" artifacts will be visible when moving the camera.
     */
    public final const val BG_KEEP: Long = 5

    /**
     * Represents the size of the [enum BGMode] enum.
     */
    public final const val BG_MAX: Long = 7

    /**
     * Displays a user-defined sky in the background.
     */
    public final const val BG_SKY: Long = 2

    /**
     * High depth-of-field blur quality (slowest).
     */
    public final const val DOF_BLUR_QUALITY_HIGH: Long = 2

    /**
     * Low depth-of-field blur quality (fastest).
     */
    public final const val DOF_BLUR_QUALITY_LOW: Long = 0

    /**
     * Medium depth-of-field blur quality.
     */
    public final const val DOF_BLUR_QUALITY_MEDIUM: Long = 1

    /**
     * Additive glow blending mode. Mostly used for particles, glows (bloom), lens flare, bright sources.
     */
    public final const val GLOW_BLEND_MODE_ADDITIVE: Long = 0

    /**
     * Replace glow blending mode. Replaces all pixels' color by the glow value. This can be used to simulate a full-screen blur effect by tweaking the glow parameters to match the original image's brightness.
     */
    public final const val GLOW_BLEND_MODE_REPLACE: Long = 3

    /**
     * Screen glow blending mode. Increases brightness, used frequently with bloom.
     */
    public final const val GLOW_BLEND_MODE_SCREEN: Long = 1

    /**
     * Soft light glow blending mode. Modifies contrast, exposes shadows and highlights (vivid bloom).
     */
    public final const val GLOW_BLEND_MODE_SOFTLIGHT: Long = 2

    /**
     * 1×1 blur for the screen-space ambient occlusion effect.
     */
    public final const val SSAO_BLUR_1x1: Long = 1

    /**
     * 2×2 blur for the screen-space ambient occlusion effect.
     */
    public final const val SSAO_BLUR_2x2: Long = 2

    /**
     * 3×3 blur for the screen-space ambient occlusion effect (slowest).
     */
    public final const val SSAO_BLUR_3x3: Long = 3

    /**
     * No blur for the screen-space ambient occlusion effect (fastest).
     */
    public final const val SSAO_BLUR_DISABLED: Long = 0

    /**
     * High quality for the screen-space ambient occlusion effect (slowest).
     */
    public final const val SSAO_QUALITY_HIGH: Long = 2

    /**
     * Low quality for the screen-space ambient occlusion effect (fastest).
     */
    public final const val SSAO_QUALITY_LOW: Long = 0

    /**
     * Medium quality for the screen-space ambient occlusion effect.
     */
    public final const val SSAO_QUALITY_MEDIUM: Long = 1

    /**
     * Use the legacy Godot version of the Academy Color Encoding System tonemapper. Unlike [TONE_MAPPER_ACES_FITTED], this version of ACES does not handle bright lighting in a physically accurate way. ACES typically has a more contrasted output compared to [TONE_MAPPER_REINHARDT] and [TONE_MAPPER_FILMIC].
     *
     * **Note:** This tonemapping operator will be removed in Godot 4.0 in favor of the more accurate [TONE_MAPPER_ACES_FITTED].
     */
    public final const val TONE_MAPPER_ACES: Long = 3

    /**
     * Use the Academy Color Encoding System tonemapper. ACES is slightly more expensive than other options, but it handles bright lighting in a more realistic fashion by desaturating it as it becomes brighter. ACES typically has a more contrasted output compared to [TONE_MAPPER_REINHARDT] and [TONE_MAPPER_FILMIC].
     */
    public final const val TONE_MAPPER_ACES_FITTED: Long = 4

    /**
     * Filmic tonemapper operator. This avoids clipping bright highlights, with a resulting image that usually looks more vivid than [TONE_MAPPER_REINHARDT].
     */
    public final const val TONE_MAPPER_FILMIC: Long = 2

    /**
     * Linear tonemapper operator. Reads the linear data and passes it on unmodified. This can cause bright lighting to look blown out, with noticeable clipping in the output colors.
     */
    public final const val TONE_MAPPER_LINEAR: Long = 0

    /**
     * Reinhardt tonemapper operator. Performs a variation on rendered pixels' colors by this formula: `color = color / (1 + color)`. This avoids clipping bright highlights, but the resulting image can look a bit dull.
     */
    public final const val TONE_MAPPER_REINHARDT: Long = 1
  }
}

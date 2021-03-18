// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Resource for environment nodes (like [godot.WorldEnvironment]) that define multiple rendering options.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/3d/environment_and_post_processing.html](https://docs.godotengine.org/en/latest/tutorials/3d/environment_and_post_processing.html)
 * [https://docs.godotengine.org/en/latest/tutorials/3d/high_dynamic_range.html](https://docs.godotengine.org/en/latest/tutorials/3d/high_dynamic_range.html)
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
 * These effects will only apply when the [godot.Viewport]'s intended usage is "3D" or "3D Without Effects". This can be configured for the root Viewport with [godot.ProjectSettings.rendering/quality/intendedUsage/framebufferAllocation], or for specific Viewports via the [godot.Viewport.usage] property.
 */
@GodotBaseType
open class Environment : Resource() {
  /**
   * The global brightness value of the rendered scene. Effective only if `adjustment_enabled` is `true`.
   */
  open var adjustmentBrightness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_ADJUSTMENT_BRIGHTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_ADJUSTMENT_BRIGHTNESS, NIL)
    }

  /**
   * Applies the provided [godot.Texture] resource to affect the global color aspect of the rendered scene. Effective only if `adjustment_enabled` is `true`.
   */
  open var adjustmentColorCorrection: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_ADJUSTMENT_COLOR_CORRECTION, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_ADJUSTMENT_COLOR_CORRECTION, NIL)
    }

  /**
   * The global contrast value of the rendered scene (default value is 1). Effective only if `adjustment_enabled` is `true`.
   */
  open var adjustmentContrast: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_ADJUSTMENT_CONTRAST, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_ADJUSTMENT_CONTRAST, NIL)
    }

  /**
   * If `true`, enables the `adjustment_*` properties provided by this resource. If `false`, modifications to the `adjustment_*` properties will have no effect on the rendered scene.
   */
  open var adjustmentEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_ADJUSTMENT_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_ADJUSTMENT_ENABLED, NIL)
    }

  /**
   * The global color saturation value of the rendered scene (default value is 1). Effective only if `adjustment_enabled` is `true`.
   */
  open var adjustmentSaturation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_ADJUSTMENT_SATURATION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_ADJUSTMENT_SATURATION, NIL)
    }

  /**
   * The ambient light's [godot.core.Color].
   */
  open var ambientLightColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AMBIENT_LIGHT_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_AMBIENT_LIGHT_COLOR, NIL)
    }

  /**
   * The ambient light's energy. The higher the value, the stronger the light.
   */
  open var ambientLightEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AMBIENT_LIGHT_ENERGY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_AMBIENT_LIGHT_ENERGY, NIL)
    }

  /**
   * Defines the amount of light that the sky brings on the scene. A value of 0 means that the sky's light emission has no effect on the scene illumination, thus all ambient illumination is provided by the ambient light. On the contrary, a value of 1 means that all the light that affects the scene is provided by the sky, thus the ambient light parameter has no effect on the scene.
   */
  open var ambientLightSkyContribution: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AMBIENT_LIGHT_SKY_CONTRIBUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_AMBIENT_LIGHT_SKY_CONTRIBUTION, NIL)
    }

  /**
   * If `true`, enables the tonemapping auto exposure mode of the scene renderer. If `true`, the renderer will automatically determine the exposure setting to adapt to the scene's illumination and the observed light.
   */
  open var autoExposureEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AUTO_EXPOSURE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_AUTO_EXPOSURE_ENABLED, NIL)
    }

  /**
   * The maximum luminance value for the auto exposure.
   */
  open var autoExposureMaxLuma: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AUTO_EXPOSURE_MAX_LUMA, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_AUTO_EXPOSURE_MAX_LUMA, NIL)
    }

  /**
   * The minimum luminance value for the auto exposure.
   */
  open var autoExposureMinLuma: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AUTO_EXPOSURE_MIN_LUMA, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_AUTO_EXPOSURE_MIN_LUMA, NIL)
    }

  /**
   * The scale of the auto exposure effect. Affects the intensity of auto exposure.
   */
  open var autoExposureScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AUTO_EXPOSURE_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_AUTO_EXPOSURE_SCALE, NIL)
    }

  /**
   * The speed of the auto exposure effect. Affects the time needed for the camera to perform auto exposure.
   */
  open var autoExposureSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_AUTO_EXPOSURE_SPEED, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_AUTO_EXPOSURE_SPEED, NIL)
    }

  /**
   * The ID of the camera feed to show in the background.
   */
  open var backgroundCameraFeedId: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND_CAMERA_FEED_ID, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND_CAMERA_FEED_ID, NIL)
    }

  /**
   * The maximum layer ID to display. Only effective when using the [BG_CANVAS] background mode.
   */
  open var backgroundCanvasMaxLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND_CANVAS_MAX_LAYER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND_CANVAS_MAX_LAYER, NIL)
    }

  /**
   * The [godot.core.Color] displayed for clear areas of the scene. Only effective when using the [BG_COLOR] or [BG_COLOR_SKY] background modes).
   */
  open var backgroundColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND_COLOR,
          NIL)
    }

  /**
   * The power of the light emitted by the background.
   */
  open var backgroundEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND_ENERGY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND_ENERGY,
          NIL)
    }

  /**
   * The background mode. See [enum BGMode] for possible values.
   */
  open var backgroundMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND_MODE,
          NIL)
    }

  /**
   * The [godot.Sky] resource defined as background.
   */
  open var backgroundSky: Sky?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND_SKY,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Sky?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND_SKY,
          NIL)
    }

  /**
   * The [godot.Sky] resource's custom field of view.
   */
  open var backgroundSkyCustomFov: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND_SKY_CUSTOM_FOV, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND_SKY_CUSTOM_FOV, NIL)
    }

  /**
   * The [godot.Sky] resource's rotation expressed as a [godot.core.Basis].
   */
  open var backgroundSkyOrientation: Basis
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND_SKY_ORIENTATION, BASIS)
      return TransferContext.readReturnValue(BASIS, false) as Basis
    }
    set(value) {
      TransferContext.writeArguments(BASIS to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND_SKY_ORIENTATION, NIL)
    }

  /**
   * The [godot.Sky] resource's rotation expressed as Euler angles in radians.
   */
  open var backgroundSkyRotation: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND_SKY_ROTATION, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND_SKY_ROTATION, NIL)
    }

  /**
   * The [godot.Sky] resource's rotation expressed as Euler angles in degrees.
   */
  open var backgroundSkyRotationDegrees: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_BACKGROUND_SKY_ROTATION_DEGREES, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(value) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_BACKGROUND_SKY_ROTATION_DEGREES, NIL)
    }

  /**
   * The amount of far blur for the depth-of-field effect.
   */
  open var dofBlurFarAmount: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_DOF_BLUR_FAR_AMOUNT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_DOF_BLUR_FAR_AMOUNT, NIL)
    }

  /**
   * The distance from the camera where the far blur effect affects the rendering.
   */
  open var dofBlurFarDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_DOF_BLUR_FAR_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_DOF_BLUR_FAR_DISTANCE, NIL)
    }

  /**
   * If `true`, enables the depth-of-field far blur effect.
   */
  open var dofBlurFarEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_DOF_BLUR_FAR_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_DOF_BLUR_FAR_ENABLED, NIL)
    }

  /**
   * The depth-of-field far blur's quality. Higher values can mitigate the visible banding effect seen at higher strengths, but are much slower.
   */
  open var dofBlurFarQuality: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_DOF_BLUR_FAR_QUALITY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_DOF_BLUR_FAR_QUALITY, NIL)
    }

  /**
   * The length of the transition between the no-blur area and far blur.
   */
  open var dofBlurFarTransition: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_DOF_BLUR_FAR_TRANSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_DOF_BLUR_FAR_TRANSITION, NIL)
    }

  /**
   * The amount of near blur for the depth-of-field effect.
   */
  open var dofBlurNearAmount: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_DOF_BLUR_NEAR_AMOUNT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_DOF_BLUR_NEAR_AMOUNT, NIL)
    }

  /**
   * Distance from the camera where the near blur effect affects the rendering.
   */
  open var dofBlurNearDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_DOF_BLUR_NEAR_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_DOF_BLUR_NEAR_DISTANCE, NIL)
    }

  /**
   * If `true`, enables the depth-of-field near blur effect.
   */
  open var dofBlurNearEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_DOF_BLUR_NEAR_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_DOF_BLUR_NEAR_ENABLED, NIL)
    }

  /**
   * The depth-of-field near blur's quality. Higher values can mitigate the visible banding effect seen at higher strengths, but are much slower.
   */
  open var dofBlurNearQuality: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_DOF_BLUR_NEAR_QUALITY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_DOF_BLUR_NEAR_QUALITY, NIL)
    }

  /**
   * The length of the transition between the near blur and no-blur area.
   */
  open var dofBlurNearTransition: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_DOF_BLUR_NEAR_TRANSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_DOF_BLUR_NEAR_TRANSITION, NIL)
    }

  /**
   * The fog's [godot.core.Color].
   */
  open var fogColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_COLOR, NIL)
    }

  /**
   * The fog's depth starting distance from the camera.
   */
  open var fogDepthBegin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_DEPTH_BEGIN,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_DEPTH_BEGIN,
          NIL)
    }

  /**
   * The fog depth's intensity curve. A number of presets are available in the **Inspector** by right-clicking the curve.
   */
  open var fogDepthCurve: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_DEPTH_CURVE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_DEPTH_CURVE,
          NIL)
    }

  /**
   * If `true`, the depth fog effect is enabled. When enabled, fog will appear in the distance (relative to the camera).
   */
  open var fogDepthEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_DEPTH_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_DEPTH_ENABLED,
          NIL)
    }

  /**
   * The fog's depth end distance from the camera. If this value is set to 0, it will be equal to the current camera's [godot.Camera.far] value.
   */
  open var fogDepthEnd: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_DEPTH_END,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_DEPTH_END,
          NIL)
    }

  /**
   * If `true`, fog effects are enabled. [fogHeightEnabled] and/or [fogDepthEnabled] must be set to `true` to actually display fog.
   */
  open var fogEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_ENABLED, NIL)
    }

  /**
   * The height fog's intensity. A number of presets are available in the **Inspector** by right-clicking the curve.
   */
  open var fogHeightCurve: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_HEIGHT_CURVE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_HEIGHT_CURVE,
          NIL)
    }

  /**
   * If `true`, the height fog effect is enabled. When enabled, fog will appear in a defined height range, regardless of the distance from the camera. This can be used to simulate "deep water" effects with a lower performance cost compared to a dedicated shader.
   */
  open var fogHeightEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_HEIGHT_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_HEIGHT_ENABLED, NIL)
    }

  /**
   * The Y coordinate where the height fog will be the most intense. If this value is greater than [fogHeightMin], fog will be displayed from bottom to top. Otherwise, it will be displayed from top to bottom.
   */
  open var fogHeightMax: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_HEIGHT_MAX,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_HEIGHT_MAX,
          NIL)
    }

  /**
   * The Y coordinate where the height fog will be the least intense. If this value is greater than [fogHeightMax], fog will be displayed from top to bottom. Otherwise, it will be displayed from bottom to top.
   */
  open var fogHeightMin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_HEIGHT_MIN,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_HEIGHT_MIN,
          NIL)
    }

  /**
   * The intensity of the depth fog color transition when looking towards the sun. The sun's direction is determined automatically using the DirectionalLight node in the scene.
   */
  open var fogSunAmount: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_SUN_AMOUNT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_SUN_AMOUNT,
          NIL)
    }

  /**
   * The depth fog's [godot.core.Color] when looking towards the sun.
   */
  open var fogSunColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_SUN_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_SUN_COLOR,
          NIL)
    }

  /**
   * The intensity of the fog light transmittance effect. Amount of light that the fog transmits.
   */
  open var fogTransmitCurve: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_TRANSMIT_CURVE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_TRANSMIT_CURVE, NIL)
    }

  /**
   * Enables fog's light transmission effect. If `true`, light will be more visible in the fog to simulate light scattering as in real life.
   */
  open var fogTransmitEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_FOG_TRANSMIT_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_FOG_TRANSMIT_ENABLED, NIL)
    }

  /**
   * Smooths out the blockiness created by sampling higher levels, at the cost of performance.
   *
   * **Note:** When using the GLES2 renderer, this is only available if the GPU supports the `GL_EXT_gpu_shader4` extension.
   */
  open var glowBicubicUpscale: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_BICUBIC_UPSCALE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_BICUBIC_UPSCALE, NIL)
    }

  /**
   * The glow blending mode.
   */
  open var glowBlendMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_BLEND_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_BLEND_MODE,
          NIL)
    }

  /**
   * The bloom's intensity. If set to a value higher than `0`, this will make glow visible in areas darker than the [glowHdrThreshold].
   */
  open var glowBloom: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_BLOOM,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_BLOOM, NIL)
    }

  /**
   * If `true`, the glow effect is enabled.
   */
  open var glowEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_ENABLED, NIL)
    }

  /**
   * The higher threshold of the HDR glow. Areas brighter than this threshold will be clamped for the purposes of the glow effect.
   */
  open var glowHdrLuminanceCap: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_HDR_LUMINANCE_CAP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_HDR_LUMINANCE_CAP, NIL)
    }

  /**
   * The bleed scale of the HDR glow.
   */
  open var glowHdrScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_HDR_SCALE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_HDR_SCALE,
          NIL)
    }

  /**
   * The lower threshold of the HDR glow. When using the GLES2 renderer (which doesn't support HDR), this needs to be below `1.0` for glow to be visible. A value of `0.9` works well in this case.
   */
  open var glowHdrThreshold: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_HDR_THRESHOLD, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_HDR_THRESHOLD, NIL)
    }

  /**
   * The glow intensity. When using the GLES2 renderer, this should be increased to 1.5 to compensate for the lack of HDR rendering.
   */
  open var glowIntensity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_INTENSITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_INTENSITY,
          NIL)
    }

  open var glowLevels_1: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVELS_1,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_LEVELS_1,
          NIL)
    }

  open var glowLevels_2: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVELS_2,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_LEVELS_2,
          NIL)
    }

  open var glowLevels_3: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVELS_3,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_LEVELS_3,
          NIL)
    }

  open var glowLevels_4: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVELS_4,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_LEVELS_4,
          NIL)
    }

  open var glowLevels_5: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVELS_5,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_LEVELS_5,
          NIL)
    }

  open var glowLevels_6: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVELS_6,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_LEVELS_6,
          NIL)
    }

  open var glowLevels_7: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_LEVELS_7,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_LEVELS_7,
          NIL)
    }

  /**
   * The glow strength. When using the GLES2 renderer, this should be increased to 1.3 to compensate for the lack of HDR rendering.
   */
  open var glowStrength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_GLOW_STRENGTH,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_GLOW_STRENGTH,
          NIL)
    }

  /**
   * The depth tolerance for screen-space reflections.
   */
  open var ssReflectionsDepthTolerance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SS_REFLECTIONS_DEPTH_TOLERANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SS_REFLECTIONS_DEPTH_TOLERANCE, NIL)
    }

  /**
   * If `true`, screen-space reflections are enabled. Screen-space reflections are more accurate than reflections from [godot.GIProbe]s or [godot.ReflectionProbe]s, but are slower and can't reflect surfaces occluded by others.
   */
  open var ssReflectionsEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SS_REFLECTIONS_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SS_REFLECTIONS_ENABLED, NIL)
    }

  /**
   * The fade-in distance for screen-space reflections. Affects the area from the reflected material to the screen-space reflection).
   */
  open var ssReflectionsFadeIn: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SS_REFLECTIONS_FADE_IN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SS_REFLECTIONS_FADE_IN, NIL)
    }

  /**
   * The fade-out distance for screen-space reflections. Affects the area from the screen-space reflection to the "global" reflection.
   */
  open var ssReflectionsFadeOut: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SS_REFLECTIONS_FADE_OUT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SS_REFLECTIONS_FADE_OUT, NIL)
    }

  /**
   * The maximum number of steps for screen-space reflections. Higher values are slower.
   */
  open var ssReflectionsMaxSteps: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SS_REFLECTIONS_MAX_STEPS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SS_REFLECTIONS_MAX_STEPS, NIL)
    }

  /**
   * If `true`, screen-space reflections will take the material roughness into account.
   */
  open var ssReflectionsRoughness: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SS_REFLECTIONS_ROUGHNESS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SS_REFLECTIONS_ROUGHNESS, NIL)
    }

  /**
   * The screen-space ambient occlusion intensity on materials that have an AO texture defined. Values higher than `0` will make the SSAO effect visible in areas darkened by AO textures.
   */
  open var ssaoAoChannelAffect: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_AO_CHANNEL_AFFECT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_AO_CHANNEL_AFFECT, NIL)
    }

  /**
   * The screen-space ambient occlusion bias. This should be kept high enough to prevent "smooth" curves from being affected by ambient occlusion.
   */
  open var ssaoBias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_BIAS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_BIAS, NIL)
    }

  /**
   * The screen-space ambient occlusion blur quality. See [enum SSAOBlur] for possible values.
   */
  open var ssaoBlur: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_BLUR, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_BLUR, NIL)
    }

  /**
   * The screen-space ambient occlusion color.
   */
  open var ssaoColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_COLOR, NIL)
    }

  /**
   * The screen-space ambient occlusion edge sharpness.
   */
  open var ssaoEdgeSharpness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_EDGE_SHARPNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_EDGE_SHARPNESS, NIL)
    }

  /**
   * If `true`, the screen-space ambient occlusion effect is enabled. This darkens objects' corners and cavities to simulate ambient light not reaching the entire object as in real life. This works well for small, dynamic objects, but baked lighting or ambient occlusion textures will do a better job at displaying ambient occlusion on large static objects. This is a costly effect and should be disabled first when running into performance issues.
   */
  open var ssaoEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_ENABLED, NIL)
    }

  /**
   * The primary screen-space ambient occlusion intensity. See also [ssaoRadius].
   */
  open var ssaoIntensity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_INTENSITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_INTENSITY,
          NIL)
    }

  /**
   * The secondary screen-space ambient occlusion intensity. See also [ssaoRadius2].
   */
  open var ssaoIntensity2: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_INTENSITY2,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_INTENSITY2,
          NIL)
    }

  /**
   * The screen-space ambient occlusion intensity in direct light. In real life, ambient occlusion only applies to indirect light, which means its effects can't be seen in direct light. Values higher than `0` will make the SSAO effect visible in direct light.
   */
  open var ssaoLightAffect: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_LIGHT_AFFECT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_LIGHT_AFFECT,
          NIL)
    }

  /**
   * The screen-space ambient occlusion quality. Higher qualities will make better use of small objects for ambient occlusion, but are slower.
   */
  open var ssaoQuality: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_QUALITY,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_QUALITY, NIL)
    }

  /**
   * The primary screen-space ambient occlusion radius.
   */
  open var ssaoRadius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_RADIUS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_RADIUS, NIL)
    }

  /**
   * The secondary screen-space ambient occlusion radius. If set to a value higher than `0`, enables the secondary screen-space ambient occlusion effect which can be used to improve the effect's appearance (at the cost of performance).
   */
  open var ssaoRadius2: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_SSAO_RADIUS2,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_SSAO_RADIUS2, NIL)
    }

  /**
   * The default exposure used for tonemapping.
   */
  open var tonemapExposure: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_TONEMAP_EXPOSURE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_TONEMAP_EXPOSURE,
          NIL)
    }

  /**
   * The tonemapping mode to use. Tonemapping is the process that "converts" HDR values to be suitable for rendering on a LDR display. (Godot doesn't support rendering on HDR displays yet.)
   */
  open var tonemapMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_TONEMAP_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_TONEMAP_MODE, NIL)
    }

  /**
   * The white reference value for tonemapping. Only effective if the [tonemapMode] isn't set to [TONE_MAPPER_LINEAR].
   */
  open var tonemapWhite: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_GET_TONEMAP_WHITE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENVIRONMENT_SET_TONEMAP_WHITE,
          NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_ENVIRONMENT)

  open fun ambientLightColor(schedule: Color.() -> Unit): Color = ambientLightColor.apply{
      schedule(this)
      ambientLightColor = this
  }


  open fun backgroundColor(schedule: Color.() -> Unit): Color = backgroundColor.apply{
      schedule(this)
      backgroundColor = this
  }


  open fun backgroundSkyOrientation(schedule: Basis.() -> Unit): Basis =
      backgroundSkyOrientation.apply{
      schedule(this)
      backgroundSkyOrientation = this
  }


  open fun backgroundSkyRotation(schedule: Vector3.() -> Unit): Vector3 =
      backgroundSkyRotation.apply{
      schedule(this)
      backgroundSkyRotation = this
  }


  open fun backgroundSkyRotationDegrees(schedule: Vector3.() -> Unit): Vector3 =
      backgroundSkyRotationDegrees.apply{
      schedule(this)
      backgroundSkyRotationDegrees = this
  }


  open fun fogColor(schedule: Color.() -> Unit): Color = fogColor.apply{
      schedule(this)
      fogColor = this
  }


  open fun fogSunColor(schedule: Color.() -> Unit): Color = fogSunColor.apply{
      schedule(this)
      fogSunColor = this
  }


  open fun ssaoColor(schedule: Color.() -> Unit): Color = ssaoColor.apply{
      schedule(this)
      ssaoColor = this
  }


  enum class SSAOBlur(
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
    SSAO_BLUR_3x3(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ToneMapper(
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
    TONE_MAPPER_ACES(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class GlowBlendMode(
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
    GLOW_BLEND_MODE_REPLACE(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BGMode(
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
     * Keeps on screen every pixel drawn in the background. This is the fastest background mode, but it can only be safely used in fully-interior scenes (no visible sky or sky reflections). If enabled in a scene where the background is visible, "ghost trail" artifacts will be visible when moving the camera.
     */
    BG_KEEP(5),

    /**
     * Displays a camera feed in the background.
     */
    BG_CAMERA_FEED(6),

    /**
     * Represents the size of the [enum BGMode] enum.
     */
    BG_MAX(7);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class SSAOQuality(
    id: Long
  ) {
    /**
     * Low quality for the screen-space ambient occlusion effect (fastest).
     */
    SSAO_QUALITY_LOW(0),

    /**
     * Low quality for the screen-space ambient occlusion effect.
     */
    SSAO_QUALITY_MEDIUM(1),

    /**
     * Low quality for the screen-space ambient occlusion effect (slowest).
     */
    SSAO_QUALITY_HIGH(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class DOFBlurQuality(
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
    DOF_BLUR_QUALITY_HIGH(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Displays a camera feed in the background.
     */
    final const val BG_CAMERA_FEED: Long = 6

    /**
     * Displays a [godot.CanvasLayer] in the background.
     */
    final const val BG_CANVAS: Long = 4

    /**
     * Clears the background using the clear color defined in [godot.ProjectSettings.rendering/environment/defaultClearColor].
     */
    final const val BG_CLEAR_COLOR: Long = 0

    /**
     * Clears the background using a custom clear color.
     */
    final const val BG_COLOR: Long = 1

    /**
     * Clears the background using a custom clear color and allows defining a sky for shading and reflection. This mode is slightly faster than [BG_SKY] and should be preferred in scenes where reflections can be visible, but the sky itself never is (e.g. top-down camera).
     */
    final const val BG_COLOR_SKY: Long = 3

    /**
     * Keeps on screen every pixel drawn in the background. This is the fastest background mode, but it can only be safely used in fully-interior scenes (no visible sky or sky reflections). If enabled in a scene where the background is visible, "ghost trail" artifacts will be visible when moving the camera.
     */
    final const val BG_KEEP: Long = 5

    /**
     * Represents the size of the [enum BGMode] enum.
     */
    final const val BG_MAX: Long = 7

    /**
     * Displays a user-defined sky in the background.
     */
    final const val BG_SKY: Long = 2

    /**
     * High depth-of-field blur quality (slowest).
     */
    final const val DOF_BLUR_QUALITY_HIGH: Long = 2

    /**
     * Low depth-of-field blur quality (fastest).
     */
    final const val DOF_BLUR_QUALITY_LOW: Long = 0

    /**
     * Medium depth-of-field blur quality.
     */
    final const val DOF_BLUR_QUALITY_MEDIUM: Long = 1

    /**
     * Additive glow blending mode. Mostly used for particles, glows (bloom), lens flare, bright sources.
     */
    final const val GLOW_BLEND_MODE_ADDITIVE: Long = 0

    /**
     * Replace glow blending mode. Replaces all pixels' color by the glow value. This can be used to simulate a full-screen blur effect by tweaking the glow parameters to match the original image's brightness.
     */
    final const val GLOW_BLEND_MODE_REPLACE: Long = 3

    /**
     * Screen glow blending mode. Increases brightness, used frequently with bloom.
     */
    final const val GLOW_BLEND_MODE_SCREEN: Long = 1

    /**
     * Soft light glow blending mode. Modifies contrast, exposes shadows and highlights (vivid bloom).
     */
    final const val GLOW_BLEND_MODE_SOFTLIGHT: Long = 2

    /**
     * 1×1 blur for the screen-space ambient occlusion effect.
     */
    final const val SSAO_BLUR_1x1: Long = 1

    /**
     * 2×2 blur for the screen-space ambient occlusion effect.
     */
    final const val SSAO_BLUR_2x2: Long = 2

    /**
     * 3×3 blur for the screen-space ambient occlusion effect (slowest).
     */
    final const val SSAO_BLUR_3x3: Long = 3

    /**
     * No blur for the screen-space ambient occlusion effect (fastest).
     */
    final const val SSAO_BLUR_DISABLED: Long = 0

    /**
     * Low quality for the screen-space ambient occlusion effect (slowest).
     */
    final const val SSAO_QUALITY_HIGH: Long = 2

    /**
     * Low quality for the screen-space ambient occlusion effect (fastest).
     */
    final const val SSAO_QUALITY_LOW: Long = 0

    /**
     * Low quality for the screen-space ambient occlusion effect.
     */
    final const val SSAO_QUALITY_MEDIUM: Long = 1

    /**
     * Academy Color Encoding System tonemapper operator.
     */
    final const val TONE_MAPPER_ACES: Long = 3

    /**
     * Filmic tonemapper operator.
     */
    final const val TONE_MAPPER_FILMIC: Long = 2

    /**
     * Linear tonemapper operator. Reads the linear data and passes it on unmodified.
     */
    final const val TONE_MAPPER_LINEAR: Long = 0

    /**
     * Reinhardt tonemapper operator. Performs a variation on rendered pixels' colors by this formula: `color = color / (1 + color)`.
     */
    final const val TONE_MAPPER_REINHARDT: Long = 1
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

/**
 * Physically-based camera settings.
 *
 * [godot.CameraAttributesPhysical] is used to set rendering settings based on a physically-based camera's settings. It is responsible for exposure, auto-exposure, and depth of field.
 *
 * When used in a [godot.WorldEnvironment] it provides default settings for exposure, auto-exposure, and depth of field that will be used by all cameras without their own [godot.CameraAttributes], including the editor camera. When used in a [godot.Camera3D] it will override any [godot.CameraAttributes] set in the [godot.WorldEnvironment] and will override the [godot.Camera3D]s [godot.Camera3D.far], [godot.Camera3D.near], [godot.Camera3D.fov], and [godot.Camera3D.keepAspect] properties. When used in [godot.VoxelGI] or [godot.LightmapGI], only the exposure settings will be used.
 *
 * The default settings are intended for use in an outdoor environment, tips for settings for use in an indoor environment can be found in each setting's documentation.
 *
 * **Note:** Depth of field blur is only supported in the Forward+ and Mobile rendering methods, not Compatibility.
 */
@GodotBaseType
public open class CameraAttributesPhysical : CameraAttributes() {
  /**
   * Distance from camera of object that will be in focus, measured in meters. Internally this will be clamped to be at least 1 millimeter larger than [frustumFocalLength].
   */
  public var frustumFocusDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPHYSICAL_GET_FOCUS_DISTANCE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPHYSICAL_SET_FOCUS_DISTANCE, NIL)
    }

  /**
   * Distance between camera lens and camera aperture, measured in millimeters. Controls field of view and depth of field. A larger focal length will result in a smaller field of view and a narrower depth of field meaning fewer objects will be in focus. A smaller focal length will result in a wider field of view and a larger depth of field meaning more objects will be in focus. When attached to a [godot.Camera3D] as its [godot.Camera3D.attributes], it will override the [godot.Camera3D.fov] property and the [godot.Camera3D.keepAspect] property.
   */
  public var frustumFocalLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPHYSICAL_GET_FOCAL_LENGTH, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPHYSICAL_SET_FOCAL_LENGTH, NIL)
    }

  /**
   * Override value for [godot.Camera3D.near]. Used internally when calculating depth of field. When attached to a [godot.Camera3D] as its [godot.Camera3D.attributes], it will override the [godot.Camera3D.near] property.
   */
  public var frustumNear: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPHYSICAL_GET_NEAR,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPHYSICAL_SET_NEAR,
          NIL)
    }

  /**
   * Override value for [godot.Camera3D.far]. Used internally when calculating depth of field. When attached to a [godot.Camera3D] as its [godot.Camera3D.attributes], it will override the [godot.Camera3D.far] property.
   */
  public var frustumFar: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPHYSICAL_GET_FAR,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPHYSICAL_SET_FAR,
          NIL)
    }

  /**
   * Size of the aperture of the camera, measured in f-stops. An f-stop is a unitless ratio between the focal length of the camera and the diameter of the aperture. A high aperture setting will result in a smaller aperture which leads to a dimmer image and sharper focus. A low aperture results in a wide aperture which lets in more light resulting in a brighter, less-focused image. Default is appropriate for outdoors at daytime (i.e. for use with a default [godot.DirectionalLight3D]), for indoor lighting, a value between 2 and 4 is more appropriate.
   *
   * Only available when [godot.ProjectSettings.rendering/lightsAndShadows/usePhysicalLightUnits] is enabled.
   */
  public var exposureAperture: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPHYSICAL_GET_APERTURE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPHYSICAL_SET_APERTURE, NIL)
    }

  /**
   * Time for shutter to open and close, measured in seconds. A higher value will let in more light leading to a brighter image, while a lower amount will let in less light leading to a darker image.
   *
   * Only available when [godot.ProjectSettings.rendering/lightsAndShadows/usePhysicalLightUnits] is enabled.
   */
  public var exposureShutterSpeed: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPHYSICAL_GET_SHUTTER_SPEED, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPHYSICAL_SET_SHUTTER_SPEED, NIL)
    }

  /**
   * The minimum luminance luminance (in EV100) used when calculating auto exposure. When calculating scene average luminance, color values will be clamped to at least this value. This limits the auto-exposure from exposing above a certain brightness, resulting in a cut off point where the scene will remain dark.
   */
  public var autoExposureMinExposureValue: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPHYSICAL_GET_AUTO_EXPOSURE_MIN_EXPOSURE_VALUE,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPHYSICAL_SET_AUTO_EXPOSURE_MIN_EXPOSURE_VALUE,
          NIL)
    }

  /**
   * The maximum luminance (in EV100) used when calculating auto exposure. When calculating scene average luminance, color values will be clamped to at least this value. This limits the auto-exposure from exposing below a certain brightness, resulting in a cut off point where the scene will remain bright.
   */
  public var autoExposureMaxExposureValue: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPHYSICAL_GET_AUTO_EXPOSURE_MAX_EXPOSURE_VALUE,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPHYSICAL_SET_AUTO_EXPOSURE_MAX_EXPOSURE_VALUE,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CAMERAATTRIBUTESPHYSICAL, scriptIndex)
    return true
  }

  /**
   * Returns the vertical field of view that corresponds to the [frustumFocalLength]. This value is calculated internally whenever [frustumFocalLength] is changed.
   */
  public fun getFov(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPHYSICAL_GET_FOV,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public companion object
}

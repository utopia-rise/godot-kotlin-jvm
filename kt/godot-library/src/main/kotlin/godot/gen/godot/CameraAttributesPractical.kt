// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Suppress

/**
 * Camera settings in an easy to use format.
 *
 * Controls camera-specific attributes such as auto-exposure, depth of field, and exposure override.
 *
 * When used in a [godot.WorldEnvironment] it provides default settings for exposure, auto-exposure, and depth of field that will be used by all cameras without their own [godot.CameraAttributes], including the editor camera. When used in a [godot.Camera3D] it will override any [godot.CameraAttributes] set in the [godot.WorldEnvironment]. When used in [godot.VoxelGI] or [godot.LightmapGI], only the exposure settings will be used.
 */
@GodotBaseType
public open class CameraAttributesPractical : CameraAttributes() {
  /**
   * Enables depth of field blur for objects further than [dofBlurFarDistance]. Strength of blur is controlled by [dofBlurAmount] and modulated by [dofBlurFarTransition].
   */
  public var dofBlurFarEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPRACTICAL_IS_DOF_BLUR_FAR_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPRACTICAL_SET_DOF_BLUR_FAR_ENABLED, NIL)
    }

  /**
   * Objects further from the [godot.Camera3D] by this amount will be blurred by the depth of field effect. Measured in meters.
   */
  public var dofBlurFarDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPRACTICAL_GET_DOF_BLUR_FAR_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPRACTICAL_SET_DOF_BLUR_FAR_DISTANCE, NIL)
    }

  /**
   * When positive, distance over which (starting from [dofBlurFarDistance]) blur effect will scale from 0 to [dofBlurAmount]. When negative, uses physically-based scaling so depth of field effect will scale from 0 at [dofBlurFarDistance] and will increase in a physically accurate way as objects get further from the [godot.Camera3D].
   */
  public var dofBlurFarTransition: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPRACTICAL_GET_DOF_BLUR_FAR_TRANSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPRACTICAL_SET_DOF_BLUR_FAR_TRANSITION, NIL)
    }

  /**
   * Enables depth of field blur for objects closer than [dofBlurNearDistance]. Strength of blur is controlled by [dofBlurAmount] and modulated by [dofBlurNearTransition].
   */
  public var dofBlurNearEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPRACTICAL_IS_DOF_BLUR_NEAR_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPRACTICAL_SET_DOF_BLUR_NEAR_ENABLED, NIL)
    }

  /**
   * Objects closer from the [godot.Camera3D] by this amount will be blurred by the depth of field effect. Measured in meters.
   */
  public var dofBlurNearDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPRACTICAL_GET_DOF_BLUR_NEAR_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPRACTICAL_SET_DOF_BLUR_NEAR_DISTANCE, NIL)
    }

  /**
   * When positive, distance over which blur effect will scale from 0 to [dofBlurAmount], ending at [dofBlurNearDistance]. When negative, uses physically-based scaling so depth of field effect will scale from 0 at [dofBlurNearDistance] and will increase in a physically accurate way as objects get closer to the [godot.Camera3D].
   */
  public var dofBlurNearTransition: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPRACTICAL_GET_DOF_BLUR_NEAR_TRANSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPRACTICAL_SET_DOF_BLUR_NEAR_TRANSITION, NIL)
    }

  /**
   * Sets the maximum amount of blur. When using physically-based blur amounts, will instead act as a multiplier. High values lead to an increased amount of bluriness, but can be much more expensive to calculate. It is best to keep this as low as possible for a given art style.
   */
  public var dofBlurAmount: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPRACTICAL_GET_DOF_BLUR_AMOUNT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPRACTICAL_SET_DOF_BLUR_AMOUNT, NIL)
    }

  /**
   * The minimum sensitivity (in ISO) used when calculating auto exposure. When calculating scene average luminance, color values will be clamped to at least this value. This limits the auto-exposure from exposing above a certain brightness, resulting in a cut off point where the scene will remain dark.
   */
  public var autoExposureMinSensitivity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPRACTICAL_GET_AUTO_EXPOSURE_MIN_SENSITIVITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPRACTICAL_SET_AUTO_EXPOSURE_MIN_SENSITIVITY, NIL)
    }

  /**
   * The maximum sensitivity (in ISO) used when calculating auto exposure. When calculating scene average luminance, color values will be clamped to at least this value. This limits the auto-exposure from exposing below a certain brightness, resulting in a cut off point where the scene will remain bright.
   */
  public var autoExposureMaxSensitivity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPRACTICAL_GET_AUTO_EXPOSURE_MAX_SENSITIVITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAATTRIBUTESPRACTICAL_SET_AUTO_EXPOSURE_MAX_SENSITIVITY, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CAMERAATTRIBUTESPRACTICAL, scriptIndex)
    return true
  }

  public companion object
}

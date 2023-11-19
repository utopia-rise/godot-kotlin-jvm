// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
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
   *
   * **Note:** Depth of field blur is only supported in the Forward+ and Mobile rendering methods, not Compatibility.
   */
  public var dofBlurFarEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDofBlurFarEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurFarEnabledPtr, NIL)
    }

  /**
   * Objects further from the [godot.Camera3D] by this amount will be blurred by the depth of field effect. Measured in meters.
   */
  public var dofBlurFarDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDofBlurFarDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurFarDistancePtr, NIL)
    }

  /**
   * When positive, distance over which (starting from [dofBlurFarDistance]) blur effect will scale from 0 to [dofBlurAmount]. When negative, uses physically-based scaling so depth of field effect will scale from 0 at [dofBlurFarDistance] and will increase in a physically accurate way as objects get further from the [godot.Camera3D].
   */
  public var dofBlurFarTransition: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDofBlurFarTransitionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurFarTransitionPtr, NIL)
    }

  /**
   * Enables depth of field blur for objects closer than [dofBlurNearDistance]. Strength of blur is controlled by [dofBlurAmount] and modulated by [dofBlurNearTransition].
   *
   * **Note:** Depth of field blur is only supported in the Forward+ and Mobile rendering methods, not Compatibility.
   */
  public var dofBlurNearEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDofBlurNearEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurNearEnabledPtr, NIL)
    }

  /**
   * Objects closer from the [godot.Camera3D] by this amount will be blurred by the depth of field effect. Measured in meters.
   */
  public var dofBlurNearDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDofBlurNearDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurNearDistancePtr, NIL)
    }

  /**
   * When positive, distance over which blur effect will scale from 0 to [dofBlurAmount], ending at [dofBlurNearDistance]. When negative, uses physically-based scaling so depth of field effect will scale from 0 at [dofBlurNearDistance] and will increase in a physically accurate way as objects get closer to the [godot.Camera3D].
   */
  public var dofBlurNearTransition: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDofBlurNearTransitionPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurNearTransitionPtr, NIL)
    }

  /**
   * Sets the maximum amount of blur. When using physically-based blur amounts, will instead act as a multiplier. High values lead to an increased amount of bluriness, but can be much more expensive to calculate. It is best to keep this as low as possible for a given art style.
   */
  public var dofBlurAmount: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDofBlurAmountPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurAmountPtr, NIL)
    }

  /**
   * The minimum sensitivity (in ISO) used when calculating auto exposure. When calculating scene average luminance, color values will be clamped to at least this value. This limits the auto-exposure from exposing above a certain brightness, resulting in a cut off point where the scene will remain dark.
   */
  public var autoExposureMinSensitivity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoExposureMinSensitivityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoExposureMinSensitivityPtr, NIL)
    }

  /**
   * The maximum sensitivity (in ISO) used when calculating auto exposure. When calculating scene average luminance, color values will be clamped to at least this value. This limits the auto-exposure from exposing below a certain brightness, resulting in a cut off point where the scene will remain bright.
   */
  public var autoExposureMaxSensitivity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoExposureMaxSensitivityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoExposureMaxSensitivityPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CAMERAATTRIBUTESPRACTICAL, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setDofBlurFarEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_far_enabled")

    public val isDofBlurFarEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "is_dof_blur_far_enabled")

    public val setDofBlurFarDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_far_distance")

    public val getDofBlurFarDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_dof_blur_far_distance")

    public val setDofBlurFarTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_far_transition")

    public val getDofBlurFarTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_dof_blur_far_transition")

    public val setDofBlurNearEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_near_enabled")

    public val isDofBlurNearEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "is_dof_blur_near_enabled")

    public val setDofBlurNearDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_near_distance")

    public val getDofBlurNearDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_dof_blur_near_distance")

    public val setDofBlurNearTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_near_transition")

    public val getDofBlurNearTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_dof_blur_near_transition")

    public val setDofBlurAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_amount")

    public val getDofBlurAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_dof_blur_amount")

    public val setAutoExposureMaxSensitivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_auto_exposure_max_sensitivity")

    public val getAutoExposureMaxSensitivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_auto_exposure_max_sensitivity")

    public val setAutoExposureMinSensitivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_auto_exposure_min_sensitivity")

    public val getAutoExposureMinSensitivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_auto_exposure_min_sensitivity")
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Contains camera-specific effects such as depth of field and exposure override.
 *
 * Contains camera-specific effects such as depth of field and exposure override.
 *
 * See also [godot.Environment] for general 3D environment settings.
 */
@GodotBaseType
public open class CameraEffects : Resource() {
  /**
   * If `true`, enables the depth-of-field far blur effect. This has a significant performance cost. Consider disabling it in scenes where there are no far away objects.
   */
  public open var dofBlurFarEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAEFFECTS_GET_DOF_BLUR_FAR_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAEFFECTS_SET_DOF_BLUR_FAR_ENABLED, NIL)
    }

  /**
   * The distance from the camera where the far blur effect affects the rendering.
   */
  public open var dofBlurFarDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAEFFECTS_GET_DOF_BLUR_FAR_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAEFFECTS_SET_DOF_BLUR_FAR_DISTANCE, NIL)
    }

  /**
   * The length of the transition between the no-blur area and far blur.
   */
  public open var dofBlurFarTransition: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAEFFECTS_GET_DOF_BLUR_FAR_TRANSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAEFFECTS_SET_DOF_BLUR_FAR_TRANSITION, NIL)
    }

  /**
   * If `true`, enables the depth-of-field near blur effect. This has a significant performance cost. Consider disabling it in scenes where there are no nearby objects.
   */
  public open var dofBlurNearEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAEFFECTS_GET_DOF_BLUR_NEAR_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAEFFECTS_SET_DOF_BLUR_NEAR_ENABLED, NIL)
    }

  /**
   * Distance from the camera where the near blur effect affects the rendering.
   */
  public open var dofBlurNearDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAEFFECTS_GET_DOF_BLUR_NEAR_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAEFFECTS_SET_DOF_BLUR_NEAR_DISTANCE, NIL)
    }

  /**
   * The length of the transition between the near blur and no-blur area.
   */
  public open var dofBlurNearTransition: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAEFFECTS_GET_DOF_BLUR_NEAR_TRANSITION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAEFFECTS_SET_DOF_BLUR_NEAR_TRANSITION, NIL)
    }

  /**
   * The amount of blur for both near and far depth-of-field effects. The amount of blur increases the radius of the blur effect, making the affected area blurrier. However, If the amount is too high, you might start to see lines appearing, especially when using a low quality blur.
   */
  public open var dofBlurAmount: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERAEFFECTS_GET_DOF_BLUR_AMOUNT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERAEFFECTS_SET_DOF_BLUR_AMOUNT,
          NIL)
    }

  /**
   * If `true`, overrides the manual or automatic exposure defined in the [godot.Environment] with the value in [overrideExposure].
   */
  public open var overrideExposureEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAEFFECTS_GET_OVERRIDE_EXPOSURE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAEFFECTS_SET_OVERRIDE_EXPOSURE_ENABLED, NIL)
    }

  /**
   * The exposure override value to use. Higher values will result in a brighter scene. Only effective if [overrideExposureEnabled] is `true`.
   */
  public open var overrideExposure: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAEFFECTS_GET_OVERRIDE_EXPOSURE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CAMERAEFFECTS_SET_OVERRIDE_EXPOSURE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CAMERAEFFECTS)
  }

  public companion object
}

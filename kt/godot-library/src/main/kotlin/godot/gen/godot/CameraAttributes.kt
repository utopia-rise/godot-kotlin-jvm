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
 * Parent class for camera settings.
 *
 * Controls camera-specific attributes such as depth of field and exposure override.
 *
 * When used in a [godot.WorldEnvironment] it provides default settings for exposure, auto-exposure, and depth of field that will be used by all cameras without their own [godot.CameraAttributes], including the editor camera. When used in a [godot.Camera3D] it will override any [godot.CameraAttributes] set in the [godot.WorldEnvironment]. When used in [godot.VoxelGI] or [godot.LightmapGI], only the exposure settings will be used.
 *
 * See also [godot.Environment] for general 3D environment settings.
 *
 * This is a pure virtual class that is inherited by [godot.CameraAttributesPhysical] and [godot.CameraAttributesPractical].
 */
@GodotBaseType
public open class CameraAttributes : Resource() {
  /**
   * Sensitivity of camera sensors, measured in ISO. A higher sensitivity results in a brighter image. Only available when [godot.ProjectSettings.rendering/lightsAndShadows/usePhysicalLightUnits] is enabled. When [autoExposureEnabled] this can be used as a method of exposure compensation, doubling the value will increase the exposure value (measured in EV100) by 1 stop.
   */
  public var exposureSensitivity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExposureSensitivityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setExposureSensitivityPtr, NIL)
    }

  /**
   * Multiplier for the exposure amount. A higher value results in a brighter image.
   */
  public var exposureMultiplier: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExposureMultiplierPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setExposureMultiplierPtr, NIL)
    }

  /**
   * If `true`, enables the tonemapping auto exposure mode of the scene renderer. If `true`, the renderer will automatically determine the exposure setting to adapt to the scene's illumination and the observed light.
   */
  public var autoExposureEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAutoExposureEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoExposureEnabledPtr, NIL)
    }

  /**
   * The scale of the auto exposure effect. Affects the intensity of auto exposure.
   */
  public var autoExposureScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoExposureScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoExposureScalePtr, NIL)
    }

  /**
   * The speed of the auto exposure effect. Affects the time needed for the camera to perform auto exposure.
   */
  public var autoExposureSpeed: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutoExposureSpeedPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAutoExposureSpeedPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CAMERAATTRIBUTES, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setExposureMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "set_exposure_multiplier")

    public val getExposureMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "get_exposure_multiplier")

    public val setExposureSensitivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "set_exposure_sensitivity")

    public val getExposureSensitivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "get_exposure_sensitivity")

    public val setAutoExposureEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "set_auto_exposure_enabled")

    public val isAutoExposureEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "is_auto_exposure_enabled")

    public val setAutoExposureSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "set_auto_exposure_speed")

    public val getAutoExposureSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "get_auto_exposure_speed")

    public val setAutoExposureScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "set_auto_exposure_scale")

    public val getAutoExposureScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "get_auto_exposure_scale")
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Controls camera-specific attributes such as depth of field and exposure override.
 *
 * When used in a [WorldEnvironment] it provides default settings for exposure, auto-exposure, and
 * depth of field that will be used by all cameras without their own [CameraAttributes], including the
 * editor camera. When used in a [Camera3D] it will override any [CameraAttributes] set in the
 * [WorldEnvironment]. When used in [VoxelGI] or [LightmapGI], only the exposure settings will be used.
 *
 * See also [Environment] for general 3D environment settings.
 *
 * This is a pure virtual class that is inherited by [CameraAttributesPhysical] and
 * [CameraAttributesPractical].
 */
@GodotBaseType
public open class CameraAttributes : Resource() {
  /**
   * Sensitivity of camera sensors, measured in ISO. A higher sensitivity results in a brighter
   * image.
   *
   * If [autoExposureEnabled] is `true`, this can be used as a method of exposure compensation,
   * doubling the value will increase the exposure value (measured in EV100) by 1 stop.
   *
   * **Note:** Only available when
   * [ProjectSettings.rendering/lightsAndShadows/usePhysicalLightUnits] is enabled.
   */
  public final inline var exposureSensitivity: Float
    @JvmName("exposureSensitivityProperty")
    get() = getExposureSensitivity()
    @JvmName("exposureSensitivityProperty")
    set(`value`) {
      setExposureSensitivity(value)
    }

  /**
   * Multiplier for the exposure amount. A higher value results in a brighter image.
   */
  public final inline var exposureMultiplier: Float
    @JvmName("exposureMultiplierProperty")
    get() = getExposureMultiplier()
    @JvmName("exposureMultiplierProperty")
    set(`value`) {
      setExposureMultiplier(value)
    }

  /**
   * If `true`, enables the tonemapping auto exposure mode of the scene renderer. If `true`, the
   * renderer will automatically determine the exposure setting to adapt to the scene's illumination
   * and the observed light.
   */
  public final inline var autoExposureEnabled: Boolean
    @JvmName("autoExposureEnabledProperty")
    get() = isAutoExposureEnabled()
    @JvmName("autoExposureEnabledProperty")
    set(`value`) {
      setAutoExposureEnabled(value)
    }

  /**
   * The scale of the auto exposure effect. Affects the intensity of auto exposure.
   */
  public final inline var autoExposureScale: Float
    @JvmName("autoExposureScaleProperty")
    get() = getAutoExposureScale()
    @JvmName("autoExposureScaleProperty")
    set(`value`) {
      setAutoExposureScale(value)
    }

  /**
   * The speed of the auto exposure effect. Affects the time needed for the camera to perform auto
   * exposure.
   */
  public final inline var autoExposureSpeed: Float
    @JvmName("autoExposureSpeedProperty")
    get() = getAutoExposureSpeed()
    @JvmName("autoExposureSpeedProperty")
    set(`value`) {
      setAutoExposureSpeed(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(132, scriptIndex)
  }

  public final fun setExposureMultiplier(multiplier: Float): Unit {
    TransferContext.writeArguments(DOUBLE to multiplier.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setExposureMultiplierPtr, NIL)
  }

  public final fun getExposureMultiplier(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getExposureMultiplierPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setExposureSensitivity(sensitivity: Float): Unit {
    TransferContext.writeArguments(DOUBLE to sensitivity.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setExposureSensitivityPtr, NIL)
  }

  public final fun getExposureSensitivity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getExposureSensitivityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAutoExposureEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setAutoExposureEnabledPtr, NIL)
  }

  public final fun isAutoExposureEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isAutoExposureEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAutoExposureSpeed(exposureSpeed: Float): Unit {
    TransferContext.writeArguments(DOUBLE to exposureSpeed.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAutoExposureSpeedPtr, NIL)
  }

  public final fun getAutoExposureSpeed(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAutoExposureSpeedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAutoExposureScale(exposureGrey: Float): Unit {
    TransferContext.writeArguments(DOUBLE to exposureGrey.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAutoExposureScalePtr, NIL)
  }

  public final fun getAutoExposureScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAutoExposureScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val setExposureMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "set_exposure_multiplier", 373806689)

    internal val getExposureMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "get_exposure_multiplier", 1740695150)

    internal val setExposureSensitivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "set_exposure_sensitivity", 373806689)

    internal val getExposureSensitivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "get_exposure_sensitivity", 1740695150)

    internal val setAutoExposureEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "set_auto_exposure_enabled", 2586408642)

    internal val isAutoExposureEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "is_auto_exposure_enabled", 36873697)

    internal val setAutoExposureSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "set_auto_exposure_speed", 373806689)

    internal val getAutoExposureSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "get_auto_exposure_speed", 1740695150)

    internal val setAutoExposureScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "set_auto_exposure_scale", 373806689)

    internal val getAutoExposureScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributes", "get_auto_exposure_scale", 1740695150)
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_CAMERAATTRIBUTESPRACTICAL_INDEX: Int = 155

/**
 * Controls camera-specific attributes such as auto-exposure, depth of field, and exposure override.
 * When used in a [WorldEnvironment] it provides default settings for exposure, auto-exposure, and
 * depth of field that will be used by all cameras without their own [CameraAttributes], including the
 * editor camera. When used in a [Camera3D] it will override any [CameraAttributes] set in the
 * [WorldEnvironment]. When used in [VoxelGI] or [LightmapGI], only the exposure settings will be used.
 */
@GodotBaseType
public open class CameraAttributesPractical : CameraAttributes() {
  /**
   * Enables depth of field blur for objects further than [dofBlurFarDistance]. Strength of blur is
   * controlled by [dofBlurAmount] and modulated by [dofBlurFarTransition].
   * **Note:** Depth of field blur is only supported in the Forward+ and Mobile rendering methods,
   * not Compatibility.
   */
  public final inline var dofBlurFarEnabled: Boolean
    @JvmName("dofBlurFarEnabledProperty")
    get() = isDofBlurFarEnabled()
    @JvmName("dofBlurFarEnabledProperty")
    set(`value`) {
      setDofBlurFarEnabled(value)
    }

  /**
   * Objects further from the [Camera3D] by this amount will be blurred by the depth of field
   * effect. Measured in meters.
   */
  public final inline var dofBlurFarDistance: Float
    @JvmName("dofBlurFarDistanceProperty")
    get() = getDofBlurFarDistance()
    @JvmName("dofBlurFarDistanceProperty")
    set(`value`) {
      setDofBlurFarDistance(value)
    }

  /**
   * When positive, distance over which (starting from [dofBlurFarDistance]) blur effect will scale
   * from 0 to [dofBlurAmount]. When negative, uses physically-based scaling so depth of field effect
   * will scale from 0 at [dofBlurFarDistance] and will increase in a physically accurate way as
   * objects get further from the [Camera3D].
   */
  public final inline var dofBlurFarTransition: Float
    @JvmName("dofBlurFarTransitionProperty")
    get() = getDofBlurFarTransition()
    @JvmName("dofBlurFarTransitionProperty")
    set(`value`) {
      setDofBlurFarTransition(value)
    }

  /**
   * Enables depth of field blur for objects closer than [dofBlurNearDistance]. Strength of blur is
   * controlled by [dofBlurAmount] and modulated by [dofBlurNearTransition].
   * **Note:** Depth of field blur is only supported in the Forward+ and Mobile rendering methods,
   * not Compatibility.
   */
  public final inline var dofBlurNearEnabled: Boolean
    @JvmName("dofBlurNearEnabledProperty")
    get() = isDofBlurNearEnabled()
    @JvmName("dofBlurNearEnabledProperty")
    set(`value`) {
      setDofBlurNearEnabled(value)
    }

  /**
   * Objects closer from the [Camera3D] by this amount will be blurred by the depth of field effect.
   * Measured in meters.
   */
  public final inline var dofBlurNearDistance: Float
    @JvmName("dofBlurNearDistanceProperty")
    get() = getDofBlurNearDistance()
    @JvmName("dofBlurNearDistanceProperty")
    set(`value`) {
      setDofBlurNearDistance(value)
    }

  /**
   * When positive, distance over which blur effect will scale from 0 to [dofBlurAmount], ending at
   * [dofBlurNearDistance]. When negative, uses physically-based scaling so depth of field effect will
   * scale from 0 at [dofBlurNearDistance] and will increase in a physically accurate way as objects
   * get closer to the [Camera3D].
   */
  public final inline var dofBlurNearTransition: Float
    @JvmName("dofBlurNearTransitionProperty")
    get() = getDofBlurNearTransition()
    @JvmName("dofBlurNearTransitionProperty")
    set(`value`) {
      setDofBlurNearTransition(value)
    }

  /**
   * Sets the maximum amount of blur. When using physically-based blur amounts, will instead act as
   * a multiplier. High values lead to an increased amount of blurriness, but can be much more
   * expensive to calculate. It is best to keep this as low as possible for a given art style.
   */
  public final inline var dofBlurAmount: Float
    @JvmName("dofBlurAmountProperty")
    get() = getDofBlurAmount()
    @JvmName("dofBlurAmountProperty")
    set(`value`) {
      setDofBlurAmount(value)
    }

  /**
   * The minimum sensitivity (in ISO) used when calculating auto exposure. When calculating scene
   * average luminance, color values will be clamped to at least this value. This limits the
   * auto-exposure from exposing above a certain brightness, resulting in a cut off point where the
   * scene will remain dark.
   */
  public final inline var autoExposureMinSensitivity: Float
    @JvmName("autoExposureMinSensitivityProperty")
    get() = getAutoExposureMinSensitivity()
    @JvmName("autoExposureMinSensitivityProperty")
    set(`value`) {
      setAutoExposureMinSensitivity(value)
    }

  /**
   * The maximum sensitivity (in ISO) used when calculating auto exposure. When calculating scene
   * average luminance, color values will be clamped to at least this value. This limits the
   * auto-exposure from exposing below a certain brightness, resulting in a cut off point where the
   * scene will remain bright.
   */
  public final inline var autoExposureMaxSensitivity: Float
    @JvmName("autoExposureMaxSensitivityProperty")
    get() = getAutoExposureMaxSensitivity()
    @JvmName("autoExposureMaxSensitivityProperty")
    set(`value`) {
      setAutoExposureMaxSensitivity(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_CAMERAATTRIBUTESPRACTICAL_INDEX, scriptIndex)
  }

  public final fun setDofBlurFarEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurFarEnabledPtr, NIL)
  }

  public final fun isDofBlurFarEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDofBlurFarEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDofBlurFarDistance(distance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to distance.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurFarDistancePtr, NIL)
  }

  public final fun getDofBlurFarDistance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDofBlurFarDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDofBlurFarTransition(distance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to distance.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurFarTransitionPtr, NIL)
  }

  public final fun getDofBlurFarTransition(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDofBlurFarTransitionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDofBlurNearEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurNearEnabledPtr, NIL)
  }

  public final fun isDofBlurNearEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDofBlurNearEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDofBlurNearDistance(distance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to distance.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurNearDistancePtr, NIL)
  }

  public final fun getDofBlurNearDistance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDofBlurNearDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDofBlurNearTransition(distance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to distance.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurNearTransitionPtr, NIL)
  }

  public final fun getDofBlurNearTransition(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDofBlurNearTransitionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDofBlurAmount(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setDofBlurAmountPtr, NIL)
  }

  public final fun getDofBlurAmount(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDofBlurAmountPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAutoExposureMaxSensitivity(maxSensitivity: Float): Unit {
    TransferContext.writeArguments(DOUBLE to maxSensitivity.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setAutoExposureMaxSensitivityPtr, NIL)
  }

  public final fun getAutoExposureMaxSensitivity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAutoExposureMaxSensitivityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAutoExposureMinSensitivity(minSensitivity: Float): Unit {
    TransferContext.writeArguments(DOUBLE to minSensitivity.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setAutoExposureMinSensitivityPtr, NIL)
  }

  public final fun getAutoExposureMinSensitivity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAutoExposureMinSensitivityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setDofBlurFarEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_far_enabled", 2586408642)

    public val isDofBlurFarEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "is_dof_blur_far_enabled", 36873697)

    public val setDofBlurFarDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_far_distance", 373806689)

    public val getDofBlurFarDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_dof_blur_far_distance", 1740695150)

    public val setDofBlurFarTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_far_transition", 373806689)

    public val getDofBlurFarTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_dof_blur_far_transition", 1740695150)

    public val setDofBlurNearEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_near_enabled", 2586408642)

    public val isDofBlurNearEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "is_dof_blur_near_enabled", 36873697)

    public val setDofBlurNearDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_near_distance", 373806689)

    public val getDofBlurNearDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_dof_blur_near_distance", 1740695150)

    public val setDofBlurNearTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_near_transition", 373806689)

    public val getDofBlurNearTransitionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_dof_blur_near_transition", 1740695150)

    public val setDofBlurAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_dof_blur_amount", 373806689)

    public val getDofBlurAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_dof_blur_amount", 1740695150)

    public val setAutoExposureMaxSensitivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_auto_exposure_max_sensitivity", 373806689)

    public val getAutoExposureMaxSensitivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_auto_exposure_max_sensitivity", 1740695150)

    public val setAutoExposureMinSensitivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "set_auto_exposure_min_sensitivity", 373806689)

    public val getAutoExposureMinSensitivityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraAttributesPractical", "get_auto_exposure_min_sensitivity", 1740695150)
  }
}

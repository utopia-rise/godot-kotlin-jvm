// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Sampler state (used by [godot.RenderingDevice]).
 *
 * This object is used by [godot.RenderingDevice].
 */
@GodotBaseType
public open class RDSamplerState : RefCounted() {
  /**
   * The sampler's magnification filter.
   */
  public var magFilter: RenderingDevice.SamplerFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_MAG_FILTER,
          LONG)
      return RenderingDevice.SamplerFilter.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_MAG_FILTER,
          NIL)
    }

  /**
   *
   */
  public var minFilter: RenderingDevice.SamplerFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_MIN_FILTER,
          LONG)
      return RenderingDevice.SamplerFilter.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_MIN_FILTER,
          NIL)
    }

  /**
   * The filtering method to use for mipmaps.
   */
  public var mipFilter: RenderingDevice.SamplerFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_MIP_FILTER,
          LONG)
      return RenderingDevice.SamplerFilter.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_MIP_FILTER,
          NIL)
    }

  /**
   * The repeat mode to use along the U axis of UV coordinates. This affects the returned values if sampling outside the UV bounds.
   */
  public var repeatU: RenderingDevice.SamplerRepeatMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_REPEAT_U, LONG)
      return RenderingDevice.SamplerRepeatMode.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_REPEAT_U, NIL)
    }

  /**
   * The repeat mode to use along the V axis of UV coordinates. This affects the returned values if sampling outside the UV bounds.
   */
  public var repeatV: RenderingDevice.SamplerRepeatMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_REPEAT_V, LONG)
      return RenderingDevice.SamplerRepeatMode.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_REPEAT_V, NIL)
    }

  /**
   * The repeat mode to use along the W axis of UV coordinates. This affects the returned values if sampling outside the UV bounds. Only effective for 3D samplers.
   */
  public var repeatW: RenderingDevice.SamplerRepeatMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_REPEAT_W, LONG)
      return RenderingDevice.SamplerRepeatMode.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_REPEAT_W, NIL)
    }

  /**
   * The mipmap LOD bias to use. Positive values will make the sampler blurrier at a given distance, while negative values will make the sampler sharper at a given distance (at the risk of looking grainy). Recommended values are between `-0.5` and `0.0`. Only effective if the sampler has mipmaps available.
   */
  public var lodBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_LOD_BIAS,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_LOD_BIAS, NIL)
    }

  /**
   * If `true`, perform anisotropic sampling. See [anisotropyMax].
   */
  public var useAnisotropy: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_USE_ANISOTROPY,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_USE_ANISOTROPY,
          NIL)
    }

  /**
   * Maximum anisotropy that can be used when sampling. Only effective if [useAnisotropy] is `true`. Higher values result in a sharper sampler at oblique angles, at the cost of performance (due to memory bandwidth). This value may be limited by the graphics hardware in use. Most graphics hardware only supports values up to `16.0`.
   *
   * If [anisotropyMax] is `1.0`, forcibly disables anisotropy even if [useAnisotropy] is `true`.
   */
  public var anisotropyMax: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_ANISOTROPY_MAX,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_ANISOTROPY_MAX,
          NIL)
    }

  /**
   * If `true`, returned values will be based on the comparison operation defined in [compareOp]. This is a hardware-based approach and is therefore faster than performing this manually in a shader. For example, compare operations are used for shadow map rendering by comparing depth values from a shadow sampler.
   */
  public var enableCompare: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_ENABLE_COMPARE,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_ENABLE_COMPARE,
          NIL)
    }

  /**
   * The compare operation to use. Only effective if [enableCompare] is `true`.
   */
  public var compareOp: RenderingDevice.CompareOperator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_COMPARE_OP,
          LONG)
      return RenderingDevice.CompareOperator.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_COMPARE_OP,
          NIL)
    }

  /**
   * The minimum mipmap LOD bias to display (highest resolution). Only effective if the sampler has mipmaps available.
   */
  public var minLod: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_MIN_LOD,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_MIN_LOD, NIL)
    }

  /**
   * The maximum mipmap LOD bias to display (lowest resolution). Only effective if the sampler has mipmaps available.
   */
  public var maxLod: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_MAX_LOD,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_MAX_LOD, NIL)
    }

  /**
   * The border color that will be returned when sampling outside the sampler's bounds and the [repeatU], [repeatV] or [repeatW] modes have repeating disabled.
   */
  public var borderColor: RenderingDevice.SamplerBorderColor
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_BORDER_COLOR,
          LONG)
      return RenderingDevice.SamplerBorderColor.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_BORDER_COLOR,
          NIL)
    }

  /**
   *
   */
  public var unnormalizedUvw: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_GET_UNNORMALIZED_UVW, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDSAMPLERSTATE_SET_UNNORMALIZED_UVW, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDSAMPLERSTATE, scriptIndex)
    return true
  }

  public companion object
}

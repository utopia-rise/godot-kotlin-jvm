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
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * This object is used by [RenderingDevice].
 */
@GodotBaseType
public open class RDSamplerState : RefCounted() {
  /**
   * The sampler's magnification filter. It is the filtering method used when sampling texels that
   * appear bigger than on-screen pixels.
   */
  public var magFilter: RenderingDevice.SamplerFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMagFilterPtr, LONG)
      return RenderingDevice.SamplerFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMagFilterPtr, NIL)
    }

  /**
   * The sampler's minification filter. It is the filtering method used when sampling texels that
   * appear smaller than on-screen pixels.
   */
  public var minFilter: RenderingDevice.SamplerFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinFilterPtr, LONG)
      return RenderingDevice.SamplerFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMinFilterPtr, NIL)
    }

  /**
   * The filtering method to use for mipmaps.
   */
  public var mipFilter: RenderingDevice.SamplerFilter
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMipFilterPtr, LONG)
      return RenderingDevice.SamplerFilter.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setMipFilterPtr, NIL)
    }

  /**
   * The repeat mode to use along the U axis of UV coordinates. This affects the returned values if
   * sampling outside the UV bounds.
   */
  public var repeatU: RenderingDevice.SamplerRepeatMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRepeatUPtr, LONG)
      return RenderingDevice.SamplerRepeatMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setRepeatUPtr, NIL)
    }

  /**
   * The repeat mode to use along the V axis of UV coordinates. This affects the returned values if
   * sampling outside the UV bounds.
   */
  public var repeatV: RenderingDevice.SamplerRepeatMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRepeatVPtr, LONG)
      return RenderingDevice.SamplerRepeatMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setRepeatVPtr, NIL)
    }

  /**
   * The repeat mode to use along the W axis of UV coordinates. This affects the returned values if
   * sampling outside the UV bounds. Only effective for 3D samplers.
   */
  public var repeatW: RenderingDevice.SamplerRepeatMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRepeatWPtr, LONG)
      return RenderingDevice.SamplerRepeatMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setRepeatWPtr, NIL)
    }

  /**
   * The mipmap LOD bias to use. Positive values will make the sampler blurrier at a given distance,
   * while negative values will make the sampler sharper at a given distance (at the risk of looking
   * grainy). Recommended values are between `-0.5` and `0.0`. Only effective if the sampler has
   * mipmaps available.
   */
  public var lodBias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLodBiasPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLodBiasPtr, NIL)
    }

  /**
   * If `true`, perform anisotropic sampling. See [anisotropyMax].
   */
  public var useAnisotropy: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUseAnisotropyPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseAnisotropyPtr, NIL)
    }

  /**
   * Maximum anisotropy that can be used when sampling. Only effective if [useAnisotropy] is `true`.
   * Higher values result in a sharper sampler at oblique angles, at the cost of performance (due to
   * memory bandwidth). This value may be limited by the graphics hardware in use. Most graphics
   * hardware only supports values up to `16.0`.
   * If [anisotropyMax] is `1.0`, forcibly disables anisotropy even if [useAnisotropy] is `true`.
   */
  public var anisotropyMax: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAnisotropyMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAnisotropyMaxPtr, NIL)
    }

  /**
   * If `true`, returned values will be based on the comparison operation defined in [compareOp].
   * This is a hardware-based approach and is therefore faster than performing this manually in a
   * shader. For example, compare operations are used for shadow map rendering by comparing depth
   * values from a shadow sampler.
   */
  public var enableCompare: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnableComparePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableComparePtr, NIL)
    }

  /**
   * The compare operation to use. Only effective if [enableCompare] is `true`.
   */
  public var compareOp: RenderingDevice.CompareOperator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCompareOpPtr, LONG)
      return RenderingDevice.CompareOperator.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCompareOpPtr, NIL)
    }

  /**
   * The minimum mipmap LOD bias to display (highest resolution). Only effective if the sampler has
   * mipmaps available.
   */
  public var minLod: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinLodPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMinLodPtr, NIL)
    }

  /**
   * The maximum mipmap LOD bias to display (lowest resolution). Only effective if the sampler has
   * mipmaps available.
   */
  public var maxLod: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxLodPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxLodPtr, NIL)
    }

  /**
   * The border color that will be returned when sampling outside the sampler's bounds and the
   * [repeatU], [repeatV] or [repeatW] modes have repeating disabled.
   */
  public var borderColor: RenderingDevice.SamplerBorderColor
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBorderColorPtr, LONG)
      return RenderingDevice.SamplerBorderColor.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBorderColorPtr, NIL)
    }

  /**
   * If `true`, the texture will be sampled with coordinates ranging from 0 to the texture's
   * resolution. Otherwise, the coordinates will be normalized and range from 0 to 1.
   */
  public var unnormalizedUvw: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUnnormalizedUvwPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUnnormalizedUvwPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDSAMPLERSTATE, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setMagFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_mag_filter")

    public val getMagFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_mag_filter")

    public val setMinFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_min_filter")

    public val getMinFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_min_filter")

    public val setMipFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_mip_filter")

    public val getMipFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_mip_filter")

    public val setRepeatUPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_repeat_u")

    public val getRepeatUPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_repeat_u")

    public val setRepeatVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_repeat_v")

    public val getRepeatVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_repeat_v")

    public val setRepeatWPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_repeat_w")

    public val getRepeatWPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_repeat_w")

    public val setLodBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_lod_bias")

    public val getLodBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_lod_bias")

    public val setUseAnisotropyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_use_anisotropy")

    public val getUseAnisotropyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_use_anisotropy")

    public val setAnisotropyMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_anisotropy_max")

    public val getAnisotropyMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_anisotropy_max")

    public val setEnableComparePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_enable_compare")

    public val getEnableComparePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_enable_compare")

    public val setCompareOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_compare_op")

    public val getCompareOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_compare_op")

    public val setMinLodPtr: VoidPtr = TypeManager.getMethodBindPtr("RDSamplerState", "set_min_lod")

    public val getMinLodPtr: VoidPtr = TypeManager.getMethodBindPtr("RDSamplerState", "get_min_lod")

    public val setMaxLodPtr: VoidPtr = TypeManager.getMethodBindPtr("RDSamplerState", "set_max_lod")

    public val getMaxLodPtr: VoidPtr = TypeManager.getMethodBindPtr("RDSamplerState", "get_max_lod")

    public val setBorderColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_border_color")

    public val getBorderColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_border_color")

    public val setUnnormalizedUvwPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_unnormalized_uvw")

    public val getUnnormalizedUvwPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_unnormalized_uvw")
  }
}

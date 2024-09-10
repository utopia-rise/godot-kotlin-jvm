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
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This object is used by [RenderingDevice].
 */
@GodotBaseType
public open class RDSamplerState : RefCounted() {
  /**
   * The sampler's magnification filter. It is the filtering method used when sampling texels that
   * appear bigger than on-screen pixels.
   */
  public final inline var magFilter: RenderingDevice.SamplerFilter
    @JvmName("magFilterProperty")
    get() = getMagFilter()
    @JvmName("magFilterProperty")
    set(`value`) {
      setMagFilter(value)
    }

  /**
   * The sampler's minification filter. It is the filtering method used when sampling texels that
   * appear smaller than on-screen pixels.
   */
  public final inline var minFilter: RenderingDevice.SamplerFilter
    @JvmName("minFilterProperty")
    get() = getMinFilter()
    @JvmName("minFilterProperty")
    set(`value`) {
      setMinFilter(value)
    }

  /**
   * The filtering method to use for mipmaps.
   */
  public final inline var mipFilter: RenderingDevice.SamplerFilter
    @JvmName("mipFilterProperty")
    get() = getMipFilter()
    @JvmName("mipFilterProperty")
    set(`value`) {
      setMipFilter(value)
    }

  /**
   * The repeat mode to use along the U axis of UV coordinates. This affects the returned values if
   * sampling outside the UV bounds.
   */
  public final inline var repeatU: RenderingDevice.SamplerRepeatMode
    @JvmName("repeatUProperty")
    get() = getRepeatU()
    @JvmName("repeatUProperty")
    set(`value`) {
      setRepeatU(value)
    }

  /**
   * The repeat mode to use along the V axis of UV coordinates. This affects the returned values if
   * sampling outside the UV bounds.
   */
  public final inline var repeatV: RenderingDevice.SamplerRepeatMode
    @JvmName("repeatVProperty")
    get() = getRepeatV()
    @JvmName("repeatVProperty")
    set(`value`) {
      setRepeatV(value)
    }

  /**
   * The repeat mode to use along the W axis of UV coordinates. This affects the returned values if
   * sampling outside the UV bounds. Only effective for 3D samplers.
   */
  public final inline var repeatW: RenderingDevice.SamplerRepeatMode
    @JvmName("repeatWProperty")
    get() = getRepeatW()
    @JvmName("repeatWProperty")
    set(`value`) {
      setRepeatW(value)
    }

  /**
   * The mipmap LOD bias to use. Positive values will make the sampler blurrier at a given distance,
   * while negative values will make the sampler sharper at a given distance (at the risk of looking
   * grainy). Recommended values are between `-0.5` and `0.0`. Only effective if the sampler has
   * mipmaps available.
   */
  public final inline var lodBias: Float
    @JvmName("lodBiasProperty")
    get() = getLodBias()
    @JvmName("lodBiasProperty")
    set(`value`) {
      setLodBias(value)
    }

  /**
   * If `true`, perform anisotropic sampling. See [anisotropyMax].
   */
  public final inline var useAnisotropy: Boolean
    @JvmName("useAnisotropyProperty")
    get() = getUseAnisotropy()
    @JvmName("useAnisotropyProperty")
    set(`value`) {
      setUseAnisotropy(value)
    }

  /**
   * Maximum anisotropy that can be used when sampling. Only effective if [useAnisotropy] is `true`.
   * Higher values result in a sharper sampler at oblique angles, at the cost of performance (due to
   * memory bandwidth). This value may be limited by the graphics hardware in use. Most graphics
   * hardware only supports values up to `16.0`.
   * If [anisotropyMax] is `1.0`, forcibly disables anisotropy even if [useAnisotropy] is `true`.
   */
  public final inline var anisotropyMax: Float
    @JvmName("anisotropyMaxProperty")
    get() = getAnisotropyMax()
    @JvmName("anisotropyMaxProperty")
    set(`value`) {
      setAnisotropyMax(value)
    }

  /**
   * If `true`, returned values will be based on the comparison operation defined in [compareOp].
   * This is a hardware-based approach and is therefore faster than performing this manually in a
   * shader. For example, compare operations are used for shadow map rendering by comparing depth
   * values from a shadow sampler.
   */
  public final inline var enableCompare: Boolean
    @JvmName("enableCompareProperty")
    get() = getEnableCompare()
    @JvmName("enableCompareProperty")
    set(`value`) {
      setEnableCompare(value)
    }

  /**
   * The compare operation to use. Only effective if [enableCompare] is `true`.
   */
  public final inline var compareOp: RenderingDevice.CompareOperator
    @JvmName("compareOpProperty")
    get() = getCompareOp()
    @JvmName("compareOpProperty")
    set(`value`) {
      setCompareOp(value)
    }

  /**
   * The minimum mipmap LOD bias to display (highest resolution). Only effective if the sampler has
   * mipmaps available.
   */
  public final inline var minLod: Float
    @JvmName("minLodProperty")
    get() = getMinLod()
    @JvmName("minLodProperty")
    set(`value`) {
      setMinLod(value)
    }

  /**
   * The maximum mipmap LOD bias to display (lowest resolution). Only effective if the sampler has
   * mipmaps available.
   */
  public final inline var maxLod: Float
    @JvmName("maxLodProperty")
    get() = getMaxLod()
    @JvmName("maxLodProperty")
    set(`value`) {
      setMaxLod(value)
    }

  /**
   * The border color that will be returned when sampling outside the sampler's bounds and the
   * [repeatU], [repeatV] or [repeatW] modes have repeating disabled.
   */
  public final inline var borderColor: RenderingDevice.SamplerBorderColor
    @JvmName("borderColorProperty")
    get() = getBorderColor()
    @JvmName("borderColorProperty")
    set(`value`) {
      setBorderColor(value)
    }

  /**
   * If `true`, the texture will be sampled with coordinates ranging from 0 to the texture's
   * resolution. Otherwise, the coordinates will be normalized and range from 0 to 1.
   */
  public final inline var unnormalizedUvw: Boolean
    @JvmName("unnormalizedUvwProperty")
    get() = getUnnormalizedUvw()
    @JvmName("unnormalizedUvwProperty")
    set(`value`) {
      setUnnormalizedUvw(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_RDSAMPLERSTATE, scriptIndex)
  }

  public final fun setMagFilter(pMember: RenderingDevice.SamplerFilter): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setMagFilterPtr, NIL)
  }

  public final fun getMagFilter(): RenderingDevice.SamplerFilter {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMagFilterPtr, LONG)
    return RenderingDevice.SamplerFilter.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMinFilter(pMember: RenderingDevice.SamplerFilter): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setMinFilterPtr, NIL)
  }

  public final fun getMinFilter(): RenderingDevice.SamplerFilter {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMinFilterPtr, LONG)
    return RenderingDevice.SamplerFilter.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMipFilter(pMember: RenderingDevice.SamplerFilter): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setMipFilterPtr, NIL)
  }

  public final fun getMipFilter(): RenderingDevice.SamplerFilter {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMipFilterPtr, LONG)
    return RenderingDevice.SamplerFilter.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setRepeatU(pMember: RenderingDevice.SamplerRepeatMode): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setRepeatUPtr, NIL)
  }

  public final fun getRepeatU(): RenderingDevice.SamplerRepeatMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRepeatUPtr, LONG)
    return RenderingDevice.SamplerRepeatMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setRepeatV(pMember: RenderingDevice.SamplerRepeatMode): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setRepeatVPtr, NIL)
  }

  public final fun getRepeatV(): RenderingDevice.SamplerRepeatMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRepeatVPtr, LONG)
    return RenderingDevice.SamplerRepeatMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setRepeatW(pMember: RenderingDevice.SamplerRepeatMode): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setRepeatWPtr, NIL)
  }

  public final fun getRepeatW(): RenderingDevice.SamplerRepeatMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRepeatWPtr, LONG)
    return RenderingDevice.SamplerRepeatMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setLodBias(pMember: Float): Unit {
    TransferContext.writeArguments(DOUBLE to pMember.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setLodBiasPtr, NIL)
  }

  public final fun getLodBias(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLodBiasPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public final fun setUseAnisotropy(pMember: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pMember)
    TransferContext.callMethod(rawPtr, MethodBindings.setUseAnisotropyPtr, NIL)
  }

  public final fun getUseAnisotropy(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUseAnisotropyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setAnisotropyMax(pMember: Float): Unit {
    TransferContext.writeArguments(DOUBLE to pMember.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setAnisotropyMaxPtr, NIL)
  }

  public final fun getAnisotropyMax(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAnisotropyMaxPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public final fun setEnableCompare(pMember: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pMember)
    TransferContext.callMethod(rawPtr, MethodBindings.setEnableComparePtr, NIL)
  }

  public final fun getEnableCompare(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEnableComparePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public final fun setCompareOp(pMember: RenderingDevice.CompareOperator): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setCompareOpPtr, NIL)
  }

  public final fun getCompareOp(): RenderingDevice.CompareOperator {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCompareOpPtr, LONG)
    return RenderingDevice.CompareOperator.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMinLod(pMember: Float): Unit {
    TransferContext.writeArguments(DOUBLE to pMember.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setMinLodPtr, NIL)
  }

  public final fun getMinLod(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMinLodPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public final fun setMaxLod(pMember: Float): Unit {
    TransferContext.writeArguments(DOUBLE to pMember.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setMaxLodPtr, NIL)
  }

  public final fun getMaxLod(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaxLodPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public final fun setBorderColor(pMember: RenderingDevice.SamplerBorderColor): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setBorderColorPtr, NIL)
  }

  public final fun getBorderColor(): RenderingDevice.SamplerBorderColor {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBorderColorPtr, LONG)
    return RenderingDevice.SamplerBorderColor.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setUnnormalizedUvw(pMember: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pMember)
    TransferContext.callMethod(rawPtr, MethodBindings.setUnnormalizedUvwPtr, NIL)
  }

  public final fun getUnnormalizedUvw(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUnnormalizedUvwPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setMagFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_mag_filter", 1493420382)

    public val getMagFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_mag_filter", 2209202801)

    public val setMinFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_min_filter", 1493420382)

    public val getMinFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_min_filter", 2209202801)

    public val setMipFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_mip_filter", 1493420382)

    public val getMipFilterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_mip_filter", 2209202801)

    public val setRepeatUPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_repeat_u", 246127626)

    public val getRepeatUPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_repeat_u", 3227895872)

    public val setRepeatVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_repeat_v", 246127626)

    public val getRepeatVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_repeat_v", 3227895872)

    public val setRepeatWPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_repeat_w", 246127626)

    public val getRepeatWPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_repeat_w", 3227895872)

    public val setLodBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_lod_bias", 373806689)

    public val getLodBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_lod_bias", 1740695150)

    public val setUseAnisotropyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_use_anisotropy", 2586408642)

    public val getUseAnisotropyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_use_anisotropy", 36873697)

    public val setAnisotropyMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_anisotropy_max", 373806689)

    public val getAnisotropyMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_anisotropy_max", 1740695150)

    public val setEnableComparePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_enable_compare", 2586408642)

    public val getEnableComparePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_enable_compare", 36873697)

    public val setCompareOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_compare_op", 2573711505)

    public val getCompareOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_compare_op", 269730778)

    public val setMinLodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_min_lod", 373806689)

    public val getMinLodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_min_lod", 1740695150)

    public val setMaxLodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_max_lod", 373806689)

    public val getMaxLodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_max_lod", 1740695150)

    public val setBorderColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_border_color", 1115869595)

    public val getBorderColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_border_color", 3514246478)

    public val setUnnormalizedUvwPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "set_unnormalized_uvw", 2586408642)

    public val getUnnormalizedUvwPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDSamplerState", "get_unnormalized_uvw", 36873697)
  }
}

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
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_RDPIPELINEMULTISAMPLESTATE: Int = 514

/**
 * [RDPipelineMultisampleState] is used to control how multisample or supersample antialiasing is
 * being performed when rendering using [RenderingDevice].
 */
@GodotBaseType
public open class RDPipelineMultisampleState : RefCounted() {
  /**
   * The number of MSAA samples (or SSAA samples if [enableSampleShading] is `true`) to perform.
   * Higher values result in better antialiasing, at the cost of performance.
   */
  public final inline var sampleCount: RenderingDevice.TextureSamples
    @JvmName("sampleCountProperty")
    get() = getSampleCount()
    @JvmName("sampleCountProperty")
    set(`value`) {
      setSampleCount(value)
    }

  /**
   * If `true`, enables per-sample shading which replaces MSAA by SSAA. This provides higher quality
   * antialiasing that works with transparent (alpha scissor) edges. This has a very high performance
   * cost. See also [minSampleShading]. See the
   * [url=https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-sampleshading]per-sample
   * shading Vulkan documentation[/url] for more details.
   */
  public final inline var enableSampleShading: Boolean
    @JvmName("enableSampleShadingProperty")
    get() = getEnableSampleShading()
    @JvmName("enableSampleShadingProperty")
    set(`value`) {
      setEnableSampleShading(value)
    }

  /**
   * The multiplier of [sampleCount] that determines how many samples are performed for each
   * fragment. Must be between `0.0` and `1.0` (inclusive). Only effective if [enableSampleShading] is
   * `true`. If [minSampleShading] is `1.0`, fragment invocation must only read from the coverage index
   * sample. Tile image access must not be used if [enableSampleShading] is *not* `1.0`.
   */
  public final inline var minSampleShading: Float
    @JvmName("minSampleShadingProperty")
    get() = getMinSampleShading()
    @JvmName("minSampleShadingProperty")
    set(`value`) {
      setMinSampleShading(value)
    }

  /**
   * If `true`, alpha to coverage is enabled. This generates a temporary coverage value based on the
   * alpha component of the fragment's first color output. This allows alpha transparency to make use
   * of multisample antialiasing.
   */
  public final inline var enableAlphaToCoverage: Boolean
    @JvmName("enableAlphaToCoverageProperty")
    get() = getEnableAlphaToCoverage()
    @JvmName("enableAlphaToCoverageProperty")
    set(`value`) {
      setEnableAlphaToCoverage(value)
    }

  /**
   * If `true`, alpha is forced to either `0.0` or `1.0`. This allows hardening the edges of
   * antialiased alpha transparencies. Only relevant if [enableAlphaToCoverage] is `true`.
   */
  public final inline var enableAlphaToOne: Boolean
    @JvmName("enableAlphaToOneProperty")
    get() = getEnableAlphaToOne()
    @JvmName("enableAlphaToOneProperty")
    set(`value`) {
      setEnableAlphaToOne(value)
    }

  /**
   * The sample mask array. See the
   * [url=https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-samplemask]sample
   * mask Vulkan documentation[/url] for more details.
   */
  public final inline var sampleMasks: VariantArray<Long>
    @JvmName("sampleMasksProperty")
    get() = getSampleMasks()
    @JvmName("sampleMasksProperty")
    set(`value`) {
      setSampleMasks(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_RDPIPELINEMULTISAMPLESTATE, scriptIndex)
  }

  public final fun setSampleCount(pMember: RenderingDevice.TextureSamples): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setSampleCountPtr, NIL)
  }

  public final fun getSampleCount(): RenderingDevice.TextureSamples {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSampleCountPtr, LONG)
    return RenderingDevice.TextureSamples.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setEnableSampleShading(pMember: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setEnableSampleShadingPtr, NIL)
  }

  public final fun getEnableSampleShading(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnableSampleShadingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMinSampleShading(pMember: Float): Unit {
    TransferContext.writeArguments(DOUBLE to pMember.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMinSampleShadingPtr, NIL)
  }

  public final fun getMinSampleShading(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMinSampleShadingPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEnableAlphaToCoverage(pMember: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setEnableAlphaToCoveragePtr, NIL)
  }

  public final fun getEnableAlphaToCoverage(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnableAlphaToCoveragePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEnableAlphaToOne(pMember: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setEnableAlphaToOnePtr, NIL)
  }

  public final fun getEnableAlphaToOne(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnableAlphaToOnePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSampleMasks(masks: VariantArray<Long>): Unit {
    TransferContext.writeArguments(ARRAY to masks)
    TransferContext.callMethod(ptr, MethodBindings.setSampleMasksPtr, NIL)
  }

  public final fun getSampleMasks(): VariantArray<Long> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSampleMasksPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Long>)
  }

  public companion object

  public object MethodBindings {
    internal val setSampleCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "set_sample_count", 3774171498)

    internal val getSampleCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "get_sample_count", 407791724)

    internal val setEnableSampleShadingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "set_enable_sample_shading", 2586408642)

    internal val getEnableSampleShadingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "get_enable_sample_shading", 36873697)

    internal val setMinSampleShadingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "set_min_sample_shading", 373806689)

    internal val getMinSampleShadingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "get_min_sample_shading", 1740695150)

    internal val setEnableAlphaToCoveragePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "set_enable_alpha_to_coverage", 2586408642)

    internal val getEnableAlphaToCoveragePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "get_enable_alpha_to_coverage", 36873697)

    internal val setEnableAlphaToOnePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "set_enable_alpha_to_one", 2586408642)

    internal val getEnableAlphaToOnePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "get_enable_alpha_to_one", 36873697)

    internal val setSampleMasksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "set_sample_masks", 381264803)

    internal val getSampleMasksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "get_sample_masks", 3995934104)
  }
}

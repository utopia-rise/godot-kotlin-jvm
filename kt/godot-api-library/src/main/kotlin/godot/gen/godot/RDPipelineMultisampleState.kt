// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_RDPIPELINEMULTISAMPLESTATE_INDEX: Int = 514

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
    Internals.callConstructor(this, ENGINE_CLASS_RDPIPELINEMULTISAMPLESTATE_INDEX, scriptIndex)
  }

  public final fun setSampleCount(pMember: RenderingDevice.TextureSamples): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setSampleCountPtr, NIL)
  }

  public final fun getSampleCount(): RenderingDevice.TextureSamples {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSampleCountPtr, LONG)
    return RenderingDevice.TextureSamples.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setEnableSampleShading(pMember: Boolean): Unit {
    Internals.writeArguments(BOOL to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setEnableSampleShadingPtr, NIL)
  }

  public final fun getEnableSampleShading(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnableSampleShadingPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setMinSampleShading(pMember: Float): Unit {
    Internals.writeArguments(DOUBLE to pMember.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMinSampleShadingPtr, NIL)
  }

  public final fun getMinSampleShading(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMinSampleShadingPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEnableAlphaToCoverage(pMember: Boolean): Unit {
    Internals.writeArguments(BOOL to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setEnableAlphaToCoveragePtr, NIL)
  }

  public final fun getEnableAlphaToCoverage(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnableAlphaToCoveragePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEnableAlphaToOne(pMember: Boolean): Unit {
    Internals.writeArguments(BOOL to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setEnableAlphaToOnePtr, NIL)
  }

  public final fun getEnableAlphaToOne(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnableAlphaToOnePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSampleMasks(masks: VariantArray<Long>): Unit {
    Internals.writeArguments(ARRAY to masks)
    Internals.callMethod(rawPtr, MethodBindings.setSampleMasksPtr, NIL)
  }

  public final fun getSampleMasks(): VariantArray<Long> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSampleMasksPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Long>)
  }

  public companion object

  public object MethodBindings {
    internal val setSampleCountPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineMultisampleState", "set_sample_count", 3774171498)

    internal val getSampleCountPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineMultisampleState", "get_sample_count", 407791724)

    internal val setEnableSampleShadingPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineMultisampleState", "set_enable_sample_shading", 2586408642)

    internal val getEnableSampleShadingPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineMultisampleState", "get_enable_sample_shading", 36873697)

    internal val setMinSampleShadingPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineMultisampleState", "set_min_sample_shading", 373806689)

    internal val getMinSampleShadingPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineMultisampleState", "get_min_sample_shading", 1740695150)

    internal val setEnableAlphaToCoveragePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineMultisampleState", "set_enable_alpha_to_coverage", 2586408642)

    internal val getEnableAlphaToCoveragePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineMultisampleState", "get_enable_alpha_to_coverage", 36873697)

    internal val setEnableAlphaToOnePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineMultisampleState", "set_enable_alpha_to_one", 2586408642)

    internal val getEnableAlphaToOnePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineMultisampleState", "get_enable_alpha_to_one", 36873697)

    internal val setSampleMasksPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineMultisampleState", "set_sample_masks", 381264803)

    internal val getSampleMasksPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineMultisampleState", "get_sample_masks", 3995934104)
  }
}

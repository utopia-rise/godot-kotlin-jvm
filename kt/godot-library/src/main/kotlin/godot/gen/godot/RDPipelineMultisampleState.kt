// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
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
 * [RDPipelineMultisampleState] is used to control how multisample or supersample antialiasing is
 * being performed when rendering using [RenderingDevice].
 */
@GodotBaseType
public open class RDPipelineMultisampleState : RefCounted() {
  /**
   * The number of MSAA samples (or SSAA samples if [enableSampleShading] is `true`) to perform.
   * Higher values result in better antialiasing, at the cost of performance.
   */
  public var sampleCount: RenderingDevice.TextureSamples
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSampleCountPtr, LONG)
      return RenderingDevice.TextureSamples.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSampleCountPtr, NIL)
    }

  /**
   * If `true`, enables per-sample shading which replaces MSAA by SSAA. This provides higher quality
   * antialiasing that works with transparent (alpha scissor) edges. This has a very high performance
   * cost. See also [minSampleShading]. See the
   * [url=https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-sampleshading]per-sample
   * shading Vulkan documentation[/url] for more details.
   */
  public var enableSampleShading: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnableSampleShadingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableSampleShadingPtr, NIL)
    }

  /**
   * The multiplier of [sampleCount] that determines how many samples are performed for each
   * fragment. Must be between `0.0` and `1.0` (inclusive). Only effective if [enableSampleShading] is
   * `true`. If [minSampleShading] is `1.0`, fragment invocation must only read from the coverage index
   * sample. Tile image access must not be used if [enableSampleShading] is *not* `1.0`.
   */
  public var minSampleShading: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinSampleShadingPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMinSampleShadingPtr, NIL)
    }

  /**
   * If `true`, alpha to coverage is enabled. This generates a temporary coverage value based on the
   * alpha component of the fragment's first color output. This allows alpha transparency to make use
   * of multisample antialiasing.
   */
  public var enableAlphaToCoverage: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnableAlphaToCoveragePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableAlphaToCoveragePtr, NIL)
    }

  /**
   * If `true`, alpha is forced to either `0.0` or `1.0`. This allows hardening the edges of
   * antialiased alpha transparencies. Only relevant if [enableAlphaToCoverage] is `true`.
   */
  public var enableAlphaToOne: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnableAlphaToOnePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableAlphaToOnePtr, NIL)
    }

  /**
   * The sample mask array. See the
   * [url=https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-samplemask]sample
   * mask Vulkan documentation[/url] for more details.
   */
  public var sampleMasks: VariantArray<Long>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSampleMasksPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Long>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSampleMasksPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDPIPELINEMULTISAMPLESTATE, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setSampleCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "set_sample_count")

    public val getSampleCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "get_sample_count")

    public val setEnableSampleShadingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "set_enable_sample_shading")

    public val getEnableSampleShadingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "get_enable_sample_shading")

    public val setMinSampleShadingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "set_min_sample_shading")

    public val getMinSampleShadingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "get_min_sample_shading")

    public val setEnableAlphaToCoveragePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "set_enable_alpha_to_coverage")

    public val getEnableAlphaToCoveragePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "get_enable_alpha_to_coverage")

    public val setEnableAlphaToOnePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "set_enable_alpha_to_one")

    public val getEnableAlphaToOnePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "get_enable_alpha_to_one")

    public val setSampleMasksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "set_sample_masks")

    public val getSampleMasksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineMultisampleState", "get_sample_masks")
  }
}

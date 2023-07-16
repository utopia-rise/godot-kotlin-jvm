// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
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
 * Pipeline multisample state (used by [godot.RenderingDevice]).
 *
 * [godot.RDPipelineMultisampleState] is used to control how multisample or supersample antialiasing is being performed when rendering using [godot.RenderingDevice].
 */
@GodotBaseType
public open class RDPipelineMultisampleState : RefCounted() {
  /**
   * The number of MSAA samples (or SSAA samples if [enableSampleShading] is `true`) to perform. Higher values result in better antialiasing, at the cost of performance.
   */
  public var sampleCount: RenderingDevice.TextureSamples
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_GET_SAMPLE_COUNT, LONG)
      return RenderingDevice.TextureSamples.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_SET_SAMPLE_COUNT, NIL)
    }

  /**
   * If `true`, enables per-sample shading which replaces MSAA by SSAA. This provides higher quality antialiasing that works with transparent (alpha scissor) edges. This has a very high performance cost. See also [minSampleShading]. See the [per-sample shading Vulkan documentation](https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-sampleshading) for more details.
   */
  public var enableSampleShading: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_GET_ENABLE_SAMPLE_SHADING, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_SET_ENABLE_SAMPLE_SHADING, NIL)
    }

  /**
   * The multiplier of [sampleCount] that determines how many samples are performed for each fragment. Must be between `0.0` and `1.0` (inclusive). Only effective if [enableSampleShading] is `true`. If [minSampleShading] is `1.0`, fragment invocation must only read from the coverage index sample. Tile image access must not be used if [enableSampleShading] is *not* `1.0`.
   */
  public var minSampleShading: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_GET_MIN_SAMPLE_SHADING, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_SET_MIN_SAMPLE_SHADING, NIL)
    }

  /**
   * If `true`, alpha to coverage is enabled. This generates a temporary coverage value based on the alpha component of the fragment's first color output. This allows alpha transparency to make use of multisample antialiasing.
   */
  public var enableAlphaToCoverage: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_GET_ENABLE_ALPHA_TO_COVERAGE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_SET_ENABLE_ALPHA_TO_COVERAGE, NIL)
    }

  /**
   * If `true`, alpha is forced to either `0.0` or `1.0`. This allows hardening the edges of antialiased alpha transparencies. Only relevant if [enableAlphaToCoverage] is `true`.
   */
  public var enableAlphaToOne: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_GET_ENABLE_ALPHA_TO_ONE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_SET_ENABLE_ALPHA_TO_ONE, NIL)
    }

  /**
   * The sampleSee the [sample mask Vulkan documentation](https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-samplemask) for more details.
   */
  public var sampleMasks: VariantArray<Long>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_GET_SAMPLE_MASKS, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Long>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEMULTISAMPLESTATE_SET_SAMPLE_MASKS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDPIPELINEMULTISAMPLESTATE, scriptIndex)
    return true
  }

  public companion object
}

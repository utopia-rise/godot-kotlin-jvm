// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Pipeline color blend state attachment (used by [godot.RenderingDevice]).
 *
 * Controls how blending between source and destination fragments is performed when using [godot.RenderingDevice].
 *
 * For reference, this is how common user-facing blend modes are implemented in Godot's 2D renderer:
 *
 * **Mix:**
 *
 * ```
 * 		var attachment = RDPipelineColorBlendStateAttachment.new()
 * 		attachment.enable_blend = true
 * 		attachment.color_blend_op = RenderingDevice.BLEND_OP_ADD
 * 		attachment.src_color_blend_factor = RenderingDevice.BLEND_FACTOR_SRC_ALPHA
 * 		attachment.dst_color_blend_factor = RenderingDevice.BLEND_FACTOR_ONE_MINUS_SRC_ALPHA
 * 		attachment.alpha_blend_op = RenderingDevice.BLEND_OP_ADD
 * 		attachment.src_alpha_blend_factor = RenderingDevice.BLEND_FACTOR_ONE
 * 		attachment.dst_alpha_blend_factor = RenderingDevice.BLEND_FACTOR_ONE_MINUS_SRC_ALPHA
 * 		```
 *
 * **Add:**
 *
 * ```
 * 		var attachment = RDPipelineColorBlendStateAttachment.new()
 * 		attachment.enable_blend = true
 * 		attachment.alpha_blend_op = RenderingDevice.BLEND_OP_ADD
 * 		attachment.color_blend_op = RenderingDevice.BLEND_OP_ADD
 * 		attachment.src_color_blend_factor = RenderingDevice.BLEND_FACTOR_SRC_ALPHA
 * 		attachment.dst_color_blend_factor = RenderingDevice.BLEND_FACTOR_ONE
 * 		attachment.src_alpha_blend_factor = RenderingDevice.BLEND_FACTOR_SRC_ALPHA
 * 		attachment.dst_alpha_blend_factor = RenderingDevice.BLEND_FACTOR_ONE
 * 		```
 *
 * **Subtract:**
 *
 * ```
 * 		var attachment = RDPipelineColorBlendStateAttachment.new()
 * 		attachment.enable_blend = true
 * 		attachment.alpha_blend_op = RenderingDevice.BLEND_OP_REVERSE_SUBTRACT
 * 		attachment.color_blend_op = RenderingDevice.BLEND_OP_REVERSE_SUBTRACT
 * 		attachment.src_color_blend_factor = RenderingDevice.BLEND_FACTOR_SRC_ALPHA
 * 		attachment.dst_color_blend_factor = RenderingDevice.BLEND_FACTOR_ONE
 * 		attachment.src_alpha_blend_factor = RenderingDevice.BLEND_FACTOR_SRC_ALPHA
 * 		attachment.dst_alpha_blend_factor = RenderingDevice.BLEND_FACTOR_ONE
 * 		```
 *
 * **Multiply:**
 *
 * ```
 * 		var attachment = RDPipelineColorBlendStateAttachment.new()
 * 		attachment.enable_blend = true
 * 		attachment.alpha_blend_op = RenderingDevice.BLEND_OP_ADD
 * 		attachment.color_blend_op = RenderingDevice.BLEND_OP_ADD
 * 		attachment.src_color_blend_factor = RenderingDevice.BLEND_FACTOR_DST_COLOR
 * 		attachment.dst_color_blend_factor = RenderingDevice.BLEND_FACTOR_ZERO
 * 		attachment.src_alpha_blend_factor = RenderingDevice.BLEND_FACTOR_DST_ALPHA
 * 		attachment.dst_alpha_blend_factor = RenderingDevice.BLEND_FACTOR_ZERO
 * 		```
 *
 * **Pre-multiplied alpha:**
 *
 * ```
 * 		var attachment = RDPipelineColorBlendStateAttachment.new()
 * 		attachment.enable_blend = true
 * 		attachment.alpha_blend_op = RenderingDevice.BLEND_OP_ADD
 * 		attachment.color_blend_op = RenderingDevice.BLEND_OP_ADD
 * 		attachment.src_color_blend_factor = RenderingDevice.BLEND_FACTOR_ONE
 * 		attachment.dst_color_blend_factor = RenderingDevice.BLEND_FACTOR_ONE_MINUS_SRC_ALPHA
 * 		attachment.src_alpha_blend_factor = RenderingDevice.BLEND_FACTOR_ONE
 * 		attachment.dst_alpha_blend_factor = RenderingDevice.BLEND_FACTOR_ONE_MINUS_SRC_ALPHA
 * 		```
 */
@GodotBaseType
public open class RDPipelineColorBlendStateAttachment : RefCounted() {
  /**
   * If `true`, performs blending between the source and destination according to the factors defined in [srcColorBlendFactor], [dstColorBlendFactor], [srcAlphaBlendFactor] and [dstAlphaBlendFactor]. The blend modes [colorBlendOp] and [alphaBlendOp] are also taken into account, with [writeR], [writeG], [writeB] and [writeA] controlling the output.
   */
  public var enableBlend: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnableBlendPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableBlendPtr, NIL)
    }

  /**
   * Controls how the blend factor for the color channels is determined based on the source's fragments.
   */
  public var srcColorBlendFactor: RenderingDevice.BlendFactor
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSrcColorBlendFactorPtr, LONG)
      return RenderingDevice.BlendFactor.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSrcColorBlendFactorPtr, NIL)
    }

  /**
   * Controls how the blend factor for the color channels is determined based on the destination's fragments.
   */
  public var dstColorBlendFactor: RenderingDevice.BlendFactor
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDstColorBlendFactorPtr, LONG)
      return RenderingDevice.BlendFactor.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDstColorBlendFactorPtr, NIL)
    }

  /**
   * The blend mode to use for the red/green/blue color channels.
   */
  public var colorBlendOp: RenderingDevice.BlendOperation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorBlendOpPtr, LONG)
      return RenderingDevice.BlendOperation.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorBlendOpPtr, NIL)
    }

  /**
   * Controls how the blend factor for the alpha channel is determined based on the source's fragments.
   */
  public var srcAlphaBlendFactor: RenderingDevice.BlendFactor
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSrcAlphaBlendFactorPtr, LONG)
      return RenderingDevice.BlendFactor.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSrcAlphaBlendFactorPtr, NIL)
    }

  /**
   * Controls how the blend factor for the alpha channel is determined based on the destination's fragments.
   */
  public var dstAlphaBlendFactor: RenderingDevice.BlendFactor
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDstAlphaBlendFactorPtr, LONG)
      return RenderingDevice.BlendFactor.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDstAlphaBlendFactorPtr, NIL)
    }

  /**
   * The blend mode to use for the alpha channel.
   */
  public var alphaBlendOp: RenderingDevice.BlendOperation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlphaBlendOpPtr, LONG)
      return RenderingDevice.BlendOperation.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAlphaBlendOpPtr, NIL)
    }

  /**
   * If `true`, writes the new red color channel to the final result.
   */
  public var writeR: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWriteRPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setWriteRPtr, NIL)
    }

  /**
   * If `true`, writes the new green color channel to the final result.
   */
  public var writeG: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWriteGPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setWriteGPtr, NIL)
    }

  /**
   * If `true`, writes the new blue color channel to the final result.
   */
  public var writeB: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWriteBPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setWriteBPtr, NIL)
    }

  /**
   * If `true`, writes the new alpha channel to the final result.
   */
  public var writeA: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWriteAPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setWriteAPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT, scriptIndex)
    return true
  }

  /**
   * Convenience method to perform standard mix blending with straight (non-premultiplied) alpha. This sets [enableBlend] to `true`, [srcColorBlendFactor] to [godot.RenderingDevice.BLEND_FACTOR_SRC_ALPHA], [dstColorBlendFactor] to [godot.RenderingDevice.BLEND_FACTOR_ONE_MINUS_SRC_ALPHA], [srcAlphaBlendFactor] to [godot.RenderingDevice.BLEND_FACTOR_SRC_ALPHA] and [dstAlphaBlendFactor] to [godot.RenderingDevice.BLEND_FACTOR_ONE_MINUS_SRC_ALPHA].
   */
  public fun setAsMix(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.setAsMixPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setAsMixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_as_mix")

    public val setEnableBlendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_enable_blend")

    public val getEnableBlendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_enable_blend")

    public val setSrcColorBlendFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_src_color_blend_factor")

    public val getSrcColorBlendFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_src_color_blend_factor")

    public val setDstColorBlendFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_dst_color_blend_factor")

    public val getDstColorBlendFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_dst_color_blend_factor")

    public val setColorBlendOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_color_blend_op")

    public val getColorBlendOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_color_blend_op")

    public val setSrcAlphaBlendFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_src_alpha_blend_factor")

    public val getSrcAlphaBlendFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_src_alpha_blend_factor")

    public val setDstAlphaBlendFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_dst_alpha_blend_factor")

    public val getDstAlphaBlendFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_dst_alpha_blend_factor")

    public val setAlphaBlendOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_alpha_blend_op")

    public val getAlphaBlendOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_alpha_blend_op")

    public val setWriteRPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_write_r")

    public val getWriteRPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_write_r")

    public val setWriteGPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_write_g")

    public val getWriteGPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_write_g")

    public val setWriteBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_write_b")

    public val getWriteBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_write_b")

    public val setWriteAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_write_a")

    public val getWriteAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_write_a")
  }
}

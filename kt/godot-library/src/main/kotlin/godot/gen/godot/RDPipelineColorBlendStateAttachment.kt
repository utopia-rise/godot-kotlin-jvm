// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
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
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_ENABLE_BLEND, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_ENABLE_BLEND, NIL)
    }

  /**
   * Controls how the blend factor for the color channels is determined based on the source's fragments.
   */
  public var srcColorBlendFactor: RenderingDevice.BlendFactor
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_SRC_COLOR_BLEND_FACTOR,
          LONG)
      return RenderingDevice.BlendFactor.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_SRC_COLOR_BLEND_FACTOR,
          NIL)
    }

  /**
   * Controls how the blend factor for the color channels is determined based on the destination's fragments.
   */
  public var dstColorBlendFactor: RenderingDevice.BlendFactor
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_DST_COLOR_BLEND_FACTOR,
          LONG)
      return RenderingDevice.BlendFactor.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_DST_COLOR_BLEND_FACTOR,
          NIL)
    }

  /**
   * The blend mode to use for the red/green/blue color channels.
   */
  public var colorBlendOp: RenderingDevice.BlendOperation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_COLOR_BLEND_OP, LONG)
      return RenderingDevice.BlendOperation.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_COLOR_BLEND_OP, NIL)
    }

  /**
   * Controls how the blend factor for the alpha channel is determined based on the source's fragments.
   */
  public var srcAlphaBlendFactor: RenderingDevice.BlendFactor
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_SRC_ALPHA_BLEND_FACTOR,
          LONG)
      return RenderingDevice.BlendFactor.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_SRC_ALPHA_BLEND_FACTOR,
          NIL)
    }

  /**
   * Controls how the blend factor for the alpha channel is determined based on the destination's fragments.
   */
  public var dstAlphaBlendFactor: RenderingDevice.BlendFactor
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_DST_ALPHA_BLEND_FACTOR,
          LONG)
      return RenderingDevice.BlendFactor.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_DST_ALPHA_BLEND_FACTOR,
          NIL)
    }

  /**
   * The blend mode to use for the alpha channel.
   */
  public var alphaBlendOp: RenderingDevice.BlendOperation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_ALPHA_BLEND_OP, LONG)
      return RenderingDevice.BlendOperation.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_ALPHA_BLEND_OP, NIL)
    }

  /**
   * If `true`, writes the new red color channel to the final result.
   */
  public var writeR: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_WRITE_R, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_WRITE_R, NIL)
    }

  /**
   * If `true`, writes the new green color channel to the final result.
   */
  public var writeG: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_WRITE_G, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_WRITE_G, NIL)
    }

  /**
   * If `true`, writes the new blue color channel to the final result.
   */
  public var writeB: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_WRITE_B, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_WRITE_B, NIL)
    }

  /**
   * If `true`, writes the new alpha channel to the final result.
   */
  public var writeA: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_WRITE_A, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_WRITE_A, NIL)
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
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_AS_MIX, NIL)
  }

  public companion object
}

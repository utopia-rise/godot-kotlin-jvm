// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Controls how blending between source and destination fragments is performed when using
 * [RenderingDevice].
 * For reference, this is how common user-facing blend modes are implemented in Godot's 2D renderer:
 * **Mix:**
 * [codeblock]
 * var attachment = RDPipelineColorBlendStateAttachment.new()
 * attachment.enable_blend = true
 * attachment.color_blend_op = RenderingDevice.BLEND_OP_ADD
 * attachment.src_color_blend_factor = RenderingDevice.BLEND_FACTOR_SRC_ALPHA
 * attachment.dst_color_blend_factor = RenderingDevice.BLEND_FACTOR_ONE_MINUS_SRC_ALPHA
 * attachment.alpha_blend_op = RenderingDevice.BLEND_OP_ADD
 * attachment.src_alpha_blend_factor = RenderingDevice.BLEND_FACTOR_ONE
 * attachment.dst_alpha_blend_factor = RenderingDevice.BLEND_FACTOR_ONE_MINUS_SRC_ALPHA
 * [/codeblock]
 * **Add:**
 * [codeblock]
 * var attachment = RDPipelineColorBlendStateAttachment.new()
 * attachment.enable_blend = true
 * attachment.alpha_blend_op = RenderingDevice.BLEND_OP_ADD
 * attachment.color_blend_op = RenderingDevice.BLEND_OP_ADD
 * attachment.src_color_blend_factor = RenderingDevice.BLEND_FACTOR_SRC_ALPHA
 * attachment.dst_color_blend_factor = RenderingDevice.BLEND_FACTOR_ONE
 * attachment.src_alpha_blend_factor = RenderingDevice.BLEND_FACTOR_SRC_ALPHA
 * attachment.dst_alpha_blend_factor = RenderingDevice.BLEND_FACTOR_ONE
 * [/codeblock]
 * **Subtract:**
 * [codeblock]
 * var attachment = RDPipelineColorBlendStateAttachment.new()
 * attachment.enable_blend = true
 * attachment.alpha_blend_op = RenderingDevice.BLEND_OP_REVERSE_SUBTRACT
 * attachment.color_blend_op = RenderingDevice.BLEND_OP_REVERSE_SUBTRACT
 * attachment.src_color_blend_factor = RenderingDevice.BLEND_FACTOR_SRC_ALPHA
 * attachment.dst_color_blend_factor = RenderingDevice.BLEND_FACTOR_ONE
 * attachment.src_alpha_blend_factor = RenderingDevice.BLEND_FACTOR_SRC_ALPHA
 * attachment.dst_alpha_blend_factor = RenderingDevice.BLEND_FACTOR_ONE
 * [/codeblock]
 * **Multiply:**
 * [codeblock]
 * var attachment = RDPipelineColorBlendStateAttachment.new()
 * attachment.enable_blend = true
 * attachment.alpha_blend_op = RenderingDevice.BLEND_OP_ADD
 * attachment.color_blend_op = RenderingDevice.BLEND_OP_ADD
 * attachment.src_color_blend_factor = RenderingDevice.BLEND_FACTOR_DST_COLOR
 * attachment.dst_color_blend_factor = RenderingDevice.BLEND_FACTOR_ZERO
 * attachment.src_alpha_blend_factor = RenderingDevice.BLEND_FACTOR_DST_ALPHA
 * attachment.dst_alpha_blend_factor = RenderingDevice.BLEND_FACTOR_ZERO
 * [/codeblock]
 * **Pre-multiplied alpha:**
 * [codeblock]
 * var attachment = RDPipelineColorBlendStateAttachment.new()
 * attachment.enable_blend = true
 * attachment.alpha_blend_op = RenderingDevice.BLEND_OP_ADD
 * attachment.color_blend_op = RenderingDevice.BLEND_OP_ADD
 * attachment.src_color_blend_factor = RenderingDevice.BLEND_FACTOR_ONE
 * attachment.dst_color_blend_factor = RenderingDevice.BLEND_FACTOR_ONE_MINUS_SRC_ALPHA
 * attachment.src_alpha_blend_factor = RenderingDevice.BLEND_FACTOR_ONE
 * attachment.dst_alpha_blend_factor = RenderingDevice.BLEND_FACTOR_ONE_MINUS_SRC_ALPHA
 * [/codeblock]
 */
@GodotBaseType
public open class RDPipelineColorBlendStateAttachment : RefCounted() {
  /**
   * If `true`, performs blending between the source and destination according to the factors
   * defined in [srcColorBlendFactor], [dstColorBlendFactor], [srcAlphaBlendFactor] and
   * [dstAlphaBlendFactor]. The blend modes [colorBlendOp] and [alphaBlendOp] are also taken into
   * account, with [writeR], [writeG], [writeB] and [writeA] controlling the output.
   */
  public final inline var enableBlend: Boolean
    @JvmName("enableBlendProperty")
    get() = getEnableBlend()
    @JvmName("enableBlendProperty")
    set(`value`) {
      setEnableBlend(value)
    }

  /**
   * Controls how the blend factor for the color channels is determined based on the source's
   * fragments.
   */
  public final inline var srcColorBlendFactor: RenderingDevice.BlendFactor
    @JvmName("srcColorBlendFactorProperty")
    get() = getSrcColorBlendFactor()
    @JvmName("srcColorBlendFactorProperty")
    set(`value`) {
      setSrcColorBlendFactor(value)
    }

  /**
   * Controls how the blend factor for the color channels is determined based on the destination's
   * fragments.
   */
  public final inline var dstColorBlendFactor: RenderingDevice.BlendFactor
    @JvmName("dstColorBlendFactorProperty")
    get() = getDstColorBlendFactor()
    @JvmName("dstColorBlendFactorProperty")
    set(`value`) {
      setDstColorBlendFactor(value)
    }

  /**
   * The blend mode to use for the red/green/blue color channels.
   */
  public final inline var colorBlendOp: RenderingDevice.BlendOperation
    @JvmName("colorBlendOpProperty")
    get() = getColorBlendOp()
    @JvmName("colorBlendOpProperty")
    set(`value`) {
      setColorBlendOp(value)
    }

  /**
   * Controls how the blend factor for the alpha channel is determined based on the source's
   * fragments.
   */
  public final inline var srcAlphaBlendFactor: RenderingDevice.BlendFactor
    @JvmName("srcAlphaBlendFactorProperty")
    get() = getSrcAlphaBlendFactor()
    @JvmName("srcAlphaBlendFactorProperty")
    set(`value`) {
      setSrcAlphaBlendFactor(value)
    }

  /**
   * Controls how the blend factor for the alpha channel is determined based on the destination's
   * fragments.
   */
  public final inline var dstAlphaBlendFactor: RenderingDevice.BlendFactor
    @JvmName("dstAlphaBlendFactorProperty")
    get() = getDstAlphaBlendFactor()
    @JvmName("dstAlphaBlendFactorProperty")
    set(`value`) {
      setDstAlphaBlendFactor(value)
    }

  /**
   * The blend mode to use for the alpha channel.
   */
  public final inline var alphaBlendOp: RenderingDevice.BlendOperation
    @JvmName("alphaBlendOpProperty")
    get() = getAlphaBlendOp()
    @JvmName("alphaBlendOpProperty")
    set(`value`) {
      setAlphaBlendOp(value)
    }

  /**
   * If `true`, writes the new red color channel to the final result.
   */
  public final inline var writeR: Boolean
    @JvmName("writeRProperty")
    get() = getWriteR()
    @JvmName("writeRProperty")
    set(`value`) {
      setWriteR(value)
    }

  /**
   * If `true`, writes the new green color channel to the final result.
   */
  public final inline var writeG: Boolean
    @JvmName("writeGProperty")
    get() = getWriteG()
    @JvmName("writeGProperty")
    set(`value`) {
      setWriteG(value)
    }

  /**
   * If `true`, writes the new blue color channel to the final result.
   */
  public final inline var writeB: Boolean
    @JvmName("writeBProperty")
    get() = getWriteB()
    @JvmName("writeBProperty")
    set(`value`) {
      setWriteB(value)
    }

  /**
   * If `true`, writes the new alpha channel to the final result.
   */
  public final inline var writeA: Boolean
    @JvmName("writeAProperty")
    get() = getWriteA()
    @JvmName("writeAProperty")
    set(`value`) {
      setWriteA(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT, scriptIndex)
  }

  /**
   * Convenience method to perform standard mix blending with straight (non-premultiplied) alpha.
   * This sets [enableBlend] to `true`, [srcColorBlendFactor] to
   * [RenderingDevice.BLEND_FACTOR_SRC_ALPHA], [dstColorBlendFactor] to
   * [RenderingDevice.BLEND_FACTOR_ONE_MINUS_SRC_ALPHA], [srcAlphaBlendFactor] to
   * [RenderingDevice.BLEND_FACTOR_SRC_ALPHA] and [dstAlphaBlendFactor] to
   * [RenderingDevice.BLEND_FACTOR_ONE_MINUS_SRC_ALPHA].
   */
  public final fun setAsMix(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.setAsMixPtr, NIL)
  }

  public final fun setEnableBlend(pMember: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setEnableBlendPtr, NIL)
  }

  public final fun getEnableBlend(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnableBlendPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSrcColorBlendFactor(pMember: RenderingDevice.BlendFactor): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setSrcColorBlendFactorPtr, NIL)
  }

  public final fun getSrcColorBlendFactor(): RenderingDevice.BlendFactor {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSrcColorBlendFactorPtr, LONG)
    return RenderingDevice.BlendFactor.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setDstColorBlendFactor(pMember: RenderingDevice.BlendFactor): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setDstColorBlendFactorPtr, NIL)
  }

  public final fun getDstColorBlendFactor(): RenderingDevice.BlendFactor {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDstColorBlendFactorPtr, LONG)
    return RenderingDevice.BlendFactor.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setColorBlendOp(pMember: RenderingDevice.BlendOperation): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setColorBlendOpPtr, NIL)
  }

  public final fun getColorBlendOp(): RenderingDevice.BlendOperation {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColorBlendOpPtr, LONG)
    return RenderingDevice.BlendOperation.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSrcAlphaBlendFactor(pMember: RenderingDevice.BlendFactor): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setSrcAlphaBlendFactorPtr, NIL)
  }

  public final fun getSrcAlphaBlendFactor(): RenderingDevice.BlendFactor {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSrcAlphaBlendFactorPtr, LONG)
    return RenderingDevice.BlendFactor.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setDstAlphaBlendFactor(pMember: RenderingDevice.BlendFactor): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setDstAlphaBlendFactorPtr, NIL)
  }

  public final fun getDstAlphaBlendFactor(): RenderingDevice.BlendFactor {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDstAlphaBlendFactorPtr, LONG)
    return RenderingDevice.BlendFactor.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAlphaBlendOp(pMember: RenderingDevice.BlendOperation): Unit {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setAlphaBlendOpPtr, NIL)
  }

  public final fun getAlphaBlendOp(): RenderingDevice.BlendOperation {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAlphaBlendOpPtr, LONG)
    return RenderingDevice.BlendOperation.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setWriteR(pMember: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setWriteRPtr, NIL)
  }

  public final fun getWriteR(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWriteRPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setWriteG(pMember: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setWriteGPtr, NIL)
  }

  public final fun getWriteG(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWriteGPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setWriteB(pMember: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setWriteBPtr, NIL)
  }

  public final fun getWriteB(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWriteBPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setWriteA(pMember: Boolean): Unit {
    TransferContext.writeArguments(BOOL to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setWriteAPtr, NIL)
  }

  public final fun getWriteA(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWriteAPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setAsMixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_as_mix", 3218959716)

    public val setEnableBlendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_enable_blend", 2586408642)

    public val getEnableBlendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_enable_blend", 36873697)

    public val setSrcColorBlendFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_src_color_blend_factor", 2251019273)

    public val getSrcColorBlendFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_src_color_blend_factor", 3691288359)

    public val setDstColorBlendFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_dst_color_blend_factor", 2251019273)

    public val getDstColorBlendFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_dst_color_blend_factor", 3691288359)

    public val setColorBlendOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_color_blend_op", 3073022720)

    public val getColorBlendOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_color_blend_op", 1385093561)

    public val setSrcAlphaBlendFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_src_alpha_blend_factor", 2251019273)

    public val getSrcAlphaBlendFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_src_alpha_blend_factor", 3691288359)

    public val setDstAlphaBlendFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_dst_alpha_blend_factor", 2251019273)

    public val getDstAlphaBlendFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_dst_alpha_blend_factor", 3691288359)

    public val setAlphaBlendOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_alpha_blend_op", 3073022720)

    public val getAlphaBlendOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_alpha_blend_op", 1385093561)

    public val setWriteRPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_write_r", 2586408642)

    public val getWriteRPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_write_r", 36873697)

    public val setWriteGPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_write_g", 2586408642)

    public val getWriteGPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_write_g", 36873697)

    public val setWriteBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_write_b", 2586408642)

    public val getWriteBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_write_b", 36873697)

    public val setWriteAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "set_write_a", 2586408642)

    public val getWriteAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendStateAttachment", "get_write_a", 36873697)
  }
}

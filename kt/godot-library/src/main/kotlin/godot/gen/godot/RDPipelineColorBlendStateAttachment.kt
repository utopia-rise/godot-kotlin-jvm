// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class RDPipelineColorBlendStateAttachment : RefCounted() {
  /**
   *
   */
  public open var enableBlend: Boolean
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
   *
   */
  public open var srcColorBlendFactor: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_SRC_COLOR_BLEND_FACTOR,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_SRC_COLOR_BLEND_FACTOR,
          NIL)
    }

  /**
   *
   */
  public open var dstColorBlendFactor: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_DST_COLOR_BLEND_FACTOR,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_DST_COLOR_BLEND_FACTOR,
          NIL)
    }

  /**
   *
   */
  public open var colorBlendOp: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_COLOR_BLEND_OP, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_COLOR_BLEND_OP, NIL)
    }

  /**
   *
   */
  public open var srcAlphaBlendFactor: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_SRC_ALPHA_BLEND_FACTOR,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_SRC_ALPHA_BLEND_FACTOR,
          NIL)
    }

  /**
   *
   */
  public open var dstAlphaBlendFactor: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_DST_ALPHA_BLEND_FACTOR,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_DST_ALPHA_BLEND_FACTOR,
          NIL)
    }

  /**
   *
   */
  public open var alphaBlendOp: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_ALPHA_BLEND_OP, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_ALPHA_BLEND_OP, NIL)
    }

  /**
   *
   */
  public open var writeR: Boolean
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
   *
   */
  public open var writeG: Boolean
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
   *
   */
  public open var writeB: Boolean
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
   *
   */
  public open var writeA: Boolean
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

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT)
  }

  /**
   *
   */
  public open fun setAsMix(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_AS_MIX, NIL)
  }

  public companion object
}

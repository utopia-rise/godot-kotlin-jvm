// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
  public var enableBlend: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_ENABLE_BLEND,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_ENABLE_BLEND,
          NIL.ordinal)
    }

  /**
   *
   */
  public var srcColorBlendFactor: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_SRC_COLOR_BLEND_FACTOR,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_SRC_COLOR_BLEND_FACTOR,
          NIL.ordinal)
    }

  /**
   *
   */
  public var dstColorBlendFactor: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_DST_COLOR_BLEND_FACTOR,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_DST_COLOR_BLEND_FACTOR,
          NIL.ordinal)
    }

  /**
   *
   */
  public var colorBlendOp: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_COLOR_BLEND_OP,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_COLOR_BLEND_OP,
          NIL.ordinal)
    }

  /**
   *
   */
  public var srcAlphaBlendFactor: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_SRC_ALPHA_BLEND_FACTOR,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_SRC_ALPHA_BLEND_FACTOR,
          NIL.ordinal)
    }

  /**
   *
   */
  public var dstAlphaBlendFactor: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_DST_ALPHA_BLEND_FACTOR,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_DST_ALPHA_BLEND_FACTOR,
          NIL.ordinal)
    }

  /**
   *
   */
  public var alphaBlendOp: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_ALPHA_BLEND_OP,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_ALPHA_BLEND_OP,
          NIL.ordinal)
    }

  /**
   *
   */
  public var writeR: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_WRITE_R, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_WRITE_R, NIL.ordinal)
    }

  /**
   *
   */
  public var writeG: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_WRITE_G, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_WRITE_G, NIL.ordinal)
    }

  /**
   *
   */
  public var writeB: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_WRITE_B, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_WRITE_B, NIL.ordinal)
    }

  /**
   *
   */
  public var writeA: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_GET_WRITE_A, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_WRITE_A, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT)
  }

  /**
   *
   */
  public fun setAsMix(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_AS_MIX, NIL.ordinal)
  }

  public companion object
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
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
  public var srcColorBlendFactor: Long
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
  public var dstColorBlendFactor: Long
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
  public var colorBlendOp: Long
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
  public var srcAlphaBlendFactor: Long
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
  public var dstAlphaBlendFactor: Long
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
  public var alphaBlendOp: Long
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
   *
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
   *
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
   *
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
   *
   */
  public fun setAsMix(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATEATTACHMENT_SET_AS_MIX, NIL)
  }

  public companion object
}

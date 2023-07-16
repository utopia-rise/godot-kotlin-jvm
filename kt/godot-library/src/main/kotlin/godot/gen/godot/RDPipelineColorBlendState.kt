// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Pipeline color blend state (used by [godot.RenderingDevice]).
 *
 * This object is used by [godot.RenderingDevice].
 */
@GodotBaseType
public open class RDPipelineColorBlendState : RefCounted() {
  /**
   * If `true`, performs the logic operation defined in [logicOp].
   */
  public var enableLogicOp: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATE_GET_ENABLE_LOGIC_OP, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATE_SET_ENABLE_LOGIC_OP, NIL)
    }

  /**
   * The logic operation to perform for blending. Only effective if [enableLogicOp] is `true`.
   */
  public var logicOp: RenderingDevice.LogicOperation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATE_GET_LOGIC_OP, LONG)
      return RenderingDevice.LogicOperation.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATE_SET_LOGIC_OP, NIL)
    }

  /**
   * The constant color to blend with. See also [godot.RenderingDevice.drawListSetBlendConstants].
   */
  public var blendConstant: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATE_GET_BLEND_CONSTANT, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATE_SET_BLEND_CONSTANT, NIL)
    }

  /**
   * The attachments that are blended together.
   */
  public var attachments: VariantArray<RDPipelineColorBlendStateAttachment>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATE_GET_ATTACHMENTS, ARRAY)
      return (TransferContext.readReturnValue(ARRAY,
          false) as VariantArray<RDPipelineColorBlendStateAttachment>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINECOLORBLENDSTATE_SET_ATTACHMENTS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDPIPELINECOLORBLENDSTATE, scriptIndex)
    return true
  }

  public companion object
}

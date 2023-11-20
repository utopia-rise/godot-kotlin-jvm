// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
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
      TransferContext.callMethod(rawPtr, MethodBindings.getEnableLogicOpPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableLogicOpPtr, NIL)
    }

  /**
   * The logic operation to perform for blending. Only effective if [enableLogicOp] is `true`.
   */
  public var logicOp: RenderingDevice.LogicOperation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLogicOpPtr, LONG)
      return RenderingDevice.LogicOperation.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLogicOpPtr, NIL)
    }

  /**
   * The constant color to blend with. See also [godot.RenderingDevice.drawListSetBlendConstants].
   */
  @CoreTypeLocalCopy
  public var blendConstant: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBlendConstantPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBlendConstantPtr, NIL)
    }

  /**
   * The attachments that are blended together.
   */
  public var attachments: VariantArray<RDPipelineColorBlendStateAttachment>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAttachmentsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY,
          false) as VariantArray<RDPipelineColorBlendStateAttachment>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAttachmentsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDPIPELINECOLORBLENDSTATE, scriptIndex)
    return true
  }

  /**
   * The constant color to blend with. See also [godot.RenderingDevice.drawListSetBlendConstants].
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = rdpipelinecolorblendstate.blendConstant
   * //Your changes
   * rdpipelinecolorblendstate.blendConstant = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun blendConstantMutate(block: Color.() -> Unit): Color = blendConstant.apply{
      block(this)
      blendConstant = this
  }


  public companion object

  internal object MethodBindings {
    public val setEnableLogicOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendState", "set_enable_logic_op")

    public val getEnableLogicOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendState", "get_enable_logic_op")

    public val setLogicOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendState", "set_logic_op")

    public val getLogicOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendState", "get_logic_op")

    public val setBlendConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendState", "set_blend_constant")

    public val getBlendConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendState", "get_blend_constant")

    public val setAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendState", "set_attachments")

    public val getAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendState", "get_attachments")
  }
}

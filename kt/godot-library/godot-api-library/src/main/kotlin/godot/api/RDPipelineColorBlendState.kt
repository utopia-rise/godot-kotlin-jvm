// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This object is used by [RenderingDevice].
 */
@GodotBaseType
public open class RDPipelineColorBlendState : RefCounted() {
  /**
   * If `true`, performs the logic operation defined in [logicOp].
   */
  public final inline var enableLogicOp: Boolean
    @JvmName("enableLogicOpProperty")
    get() = getEnableLogicOp()
    @JvmName("enableLogicOpProperty")
    set(`value`) {
      setEnableLogicOp(value)
    }

  /**
   * The logic operation to perform for blending. Only effective if [enableLogicOp] is `true`.
   */
  public final inline var logicOp: RenderingDevice.LogicOperation
    @JvmName("logicOpProperty")
    get() = getLogicOp()
    @JvmName("logicOpProperty")
    set(`value`) {
      setLogicOp(value)
    }

  /**
   * The constant color to blend with. See also [RenderingDevice.drawListSetBlendConstants].
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var blendConstant: Color
    @JvmName("blendConstantProperty")
    get() = getBlendConstant()
    @JvmName("blendConstantProperty")
    set(`value`) {
      setBlendConstant(value)
    }

  /**
   * The attachments that are blended together.
   */
  public final inline var attachments: VariantArray<RDPipelineColorBlendStateAttachment>
    @JvmName("attachmentsProperty")
    get() = getAttachments()
    @JvmName("attachmentsProperty")
    set(`value`) {
      setAttachments(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(515, scriptIndex)
  }

  /**
   * This is a helper function for [blendConstant] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = rdpipelinecolorblendstate.blendConstant
   * //Your changes
   * rdpipelinecolorblendstate.blendConstant = myCoreType
   * ``````
   *
   * The constant color to blend with. See also [RenderingDevice.drawListSetBlendConstants].
   */
  @CoreTypeHelper
  public final fun blendConstantMutate(block: Color.() -> Unit): Color = blendConstant.apply {
     block(this)
     blendConstant = this
  }

  public final fun setEnableLogicOp(pMember: Boolean) {
    TransferContext.writeArguments(BOOL to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setEnableLogicOpPtr, NIL)
  }

  public final fun getEnableLogicOp(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnableLogicOpPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setLogicOp(pMember: RenderingDevice.LogicOperation) {
    TransferContext.writeArguments(LONG to pMember.id)
    TransferContext.callMethod(ptr, MethodBindings.setLogicOpPtr, NIL)
  }

  public final fun getLogicOp(): RenderingDevice.LogicOperation {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLogicOpPtr, LONG)
    return RenderingDevice.LogicOperation.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setBlendConstant(pMember: Color) {
    TransferContext.writeArguments(COLOR to pMember)
    TransferContext.callMethod(ptr, MethodBindings.setBlendConstantPtr, NIL)
  }

  public final fun getBlendConstant(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBlendConstantPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setAttachments(attachments: VariantArray<RDPipelineColorBlendStateAttachment>) {
    TransferContext.writeArguments(ARRAY to attachments)
    TransferContext.callMethod(ptr, MethodBindings.setAttachmentsPtr, NIL)
  }

  public final fun getAttachments(): VariantArray<RDPipelineColorBlendStateAttachment> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAttachmentsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<RDPipelineColorBlendStateAttachment>)
  }

  public companion object

  public object MethodBindings {
    internal val setEnableLogicOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendState", "set_enable_logic_op", 2_586_408_642)

    internal val getEnableLogicOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendState", "get_enable_logic_op", 36_873_697)

    internal val setLogicOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendState", "set_logic_op", 3_610_841_058)

    internal val getLogicOpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendState", "get_logic_op", 988_254_690)

    internal val setBlendConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendState", "set_blend_constant", 2_920_490_490)

    internal val getBlendConstantPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendState", "get_blend_constant", 3_444_240_500)

    internal val setAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendState", "set_attachments", 381_264_803)

    internal val getAttachmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineColorBlendState", "get_attachments", 3_995_934_104)
  }
}

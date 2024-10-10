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
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_RDPIPELINECOLORBLENDSTATE_INDEX: Int = 461

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

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_RDPIPELINECOLORBLENDSTATE_INDEX, scriptIndex)
  }

  /**
   * The constant color to blend with. See also [RenderingDevice.drawListSetBlendConstants].
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
  public final fun blendConstantMutate(block: Color.() -> Unit): Color = blendConstant.apply{
      block(this)
      blendConstant = this
  }


  public final fun setEnableLogicOp(pMember: Boolean): Unit {
    Internals.writeArguments(BOOL to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setEnableLogicOpPtr, NIL)
  }

  public final fun getEnableLogicOp(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnableLogicOpPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setLogicOp(pMember: RenderingDevice.LogicOperation): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setLogicOpPtr, NIL)
  }

  public final fun getLogicOp(): RenderingDevice.LogicOperation {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLogicOpPtr, LONG)
    return RenderingDevice.LogicOperation.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setBlendConstant(pMember: Color): Unit {
    Internals.writeArguments(COLOR to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setBlendConstantPtr, NIL)
  }

  public final fun getBlendConstant(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBlendConstantPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setAttachments(attachments: VariantArray<RDPipelineColorBlendStateAttachment>):
      Unit {
    Internals.writeArguments(ARRAY to attachments)
    Internals.callMethod(rawPtr, MethodBindings.setAttachmentsPtr, NIL)
  }

  public final fun getAttachments(): VariantArray<RDPipelineColorBlendStateAttachment> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAttachmentsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<RDPipelineColorBlendStateAttachment>)
  }

  public companion object

  internal object MethodBindings {
    public val setEnableLogicOpPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineColorBlendState", "set_enable_logic_op", 2586408642)

    public val getEnableLogicOpPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineColorBlendState", "get_enable_logic_op", 36873697)

    public val setLogicOpPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineColorBlendState", "set_logic_op", 3610841058)

    public val getLogicOpPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineColorBlendState", "get_logic_op", 988254690)

    public val setBlendConstantPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineColorBlendState", "set_blend_constant", 2920490490)

    public val getBlendConstantPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineColorBlendState", "get_blend_constant", 3444240500)

    public val setAttachmentsPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineColorBlendState", "set_attachments", 381264803)

    public val getAttachmentsPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineColorBlendState", "get_attachments", 3995934104)
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Pipeline depth/stencil state (used by [godot.RenderingDevice]).
 *
 * [godot.RDPipelineDepthStencilState] controls the way depth and stencil comparisons are performed when sampling those values using [godot.RenderingDevice].
 */
@GodotBaseType
public open class RDPipelineDepthStencilState : RefCounted() {
  /**
   * If `true`, enables depth testing which allows objects to be automatically occluded by other objects based on their depth. This also allows objects to be partially occluded by other objects. If `false`, objects will appear in the order they were drawn (like in Godot's 2D renderer).
   */
  public var enableDepthTest: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnableDepthTestPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableDepthTestPtr, NIL)
    }

  /**
   *
   */
  public var enableDepthWrite: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnableDepthWritePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableDepthWritePtr, NIL)
    }

  /**
   *
   */
  public var depthCompareOperator: RenderingDevice.CompareOperator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDepthCompareOperatorPtr, LONG)
      return RenderingDevice.CompareOperator.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDepthCompareOperatorPtr, NIL)
    }

  /**
   *
   */
  public var enableDepthRange: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnableDepthRangePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableDepthRangePtr, NIL)
    }

  /**
   *
   */
  public var depthRangeMin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDepthRangeMinPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDepthRangeMinPtr, NIL)
    }

  /**
   *
   */
  public var depthRangeMax: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDepthRangeMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDepthRangeMaxPtr, NIL)
    }

  /**
   *
   */
  public var enableStencil: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnableStencilPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableStencilPtr, NIL)
    }

  /**
   *
   */
  public var frontOpFail: RenderingDevice.StencilOperation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrontOpFailPtr, LONG)
      return RenderingDevice.StencilOperation.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFrontOpFailPtr, NIL)
    }

  /**
   *
   */
  public var frontOpPass: RenderingDevice.StencilOperation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrontOpPassPtr, LONG)
      return RenderingDevice.StencilOperation.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFrontOpPassPtr, NIL)
    }

  /**
   *
   */
  public var frontOpDepthFail: RenderingDevice.StencilOperation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrontOpDepthFailPtr, LONG)
      return RenderingDevice.StencilOperation.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFrontOpDepthFailPtr, NIL)
    }

  /**
   *
   */
  public var frontOpCompare: RenderingDevice.CompareOperator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrontOpComparePtr, LONG)
      return RenderingDevice.CompareOperator.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFrontOpComparePtr, NIL)
    }

  /**
   *
   */
  public var frontOpCompareMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrontOpCompareMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFrontOpCompareMaskPtr, NIL)
    }

  /**
   *
   */
  public var frontOpWriteMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrontOpWriteMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFrontOpWriteMaskPtr, NIL)
    }

  /**
   *
   */
  public var frontOpReference: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrontOpReferencePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFrontOpReferencePtr, NIL)
    }

  /**
   *
   */
  public var backOpFail: RenderingDevice.StencilOperation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBackOpFailPtr, LONG)
      return RenderingDevice.StencilOperation.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBackOpFailPtr, NIL)
    }

  /**
   *
   */
  public var backOpPass: RenderingDevice.StencilOperation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBackOpPassPtr, LONG)
      return RenderingDevice.StencilOperation.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBackOpPassPtr, NIL)
    }

  /**
   *
   */
  public var backOpDepthFail: RenderingDevice.StencilOperation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBackOpDepthFailPtr, LONG)
      return RenderingDevice.StencilOperation.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBackOpDepthFailPtr, NIL)
    }

  /**
   *
   */
  public var backOpCompare: RenderingDevice.CompareOperator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBackOpComparePtr, LONG)
      return RenderingDevice.CompareOperator.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setBackOpComparePtr, NIL)
    }

  /**
   *
   */
  public var backOpCompareMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBackOpCompareMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBackOpCompareMaskPtr, NIL)
    }

  /**
   *
   */
  public var backOpWriteMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBackOpWriteMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBackOpWriteMaskPtr, NIL)
    }

  /**
   *
   */
  public var backOpReference: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBackOpReferencePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBackOpReferencePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setEnableDepthTestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_enable_depth_test")

    public val getEnableDepthTestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_enable_depth_test")

    public val setEnableDepthWritePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_enable_depth_write")

    public val getEnableDepthWritePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_enable_depth_write")

    public val setDepthCompareOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_depth_compare_operator")

    public val getDepthCompareOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_depth_compare_operator")

    public val setEnableDepthRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_enable_depth_range")

    public val getEnableDepthRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_enable_depth_range")

    public val setDepthRangeMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_depth_range_min")

    public val getDepthRangeMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_depth_range_min")

    public val setDepthRangeMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_depth_range_max")

    public val getDepthRangeMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_depth_range_max")

    public val setEnableStencilPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_enable_stencil")

    public val getEnableStencilPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_enable_stencil")

    public val setFrontOpFailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_fail")

    public val getFrontOpFailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_fail")

    public val setFrontOpPassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_pass")

    public val getFrontOpPassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_pass")

    public val setFrontOpDepthFailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_depth_fail")

    public val getFrontOpDepthFailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_depth_fail")

    public val setFrontOpComparePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_compare")

    public val getFrontOpComparePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_compare")

    public val setFrontOpCompareMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_compare_mask")

    public val getFrontOpCompareMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_compare_mask")

    public val setFrontOpWriteMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_write_mask")

    public val getFrontOpWriteMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_write_mask")

    public val setFrontOpReferencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_reference")

    public val getFrontOpReferencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_reference")

    public val setBackOpFailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_fail")

    public val getBackOpFailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_fail")

    public val setBackOpPassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_pass")

    public val getBackOpPassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_pass")

    public val setBackOpDepthFailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_depth_fail")

    public val getBackOpDepthFailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_depth_fail")

    public val setBackOpComparePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_compare")

    public val getBackOpComparePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_compare")

    public val setBackOpCompareMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_compare_mask")

    public val getBackOpCompareMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_compare_mask")

    public val setBackOpWriteMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_write_mask")

    public val getBackOpWriteMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_write_mask")

    public val setBackOpReferencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_reference")

    public val getBackOpReferencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_reference")
  }
}

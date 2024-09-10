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
import kotlin.Unit

/**
 * [RDPipelineDepthStencilState] controls the way depth and stencil comparisons are performed when
 * sampling those values using [RenderingDevice].
 */
@GodotBaseType
public open class RDPipelineDepthStencilState : RefCounted() {
  /**
   * If `true`, enables depth testing which allows objects to be automatically occluded by other
   * objects based on their depth. This also allows objects to be partially occluded by other objects.
   * If `false`, objects will appear in the order they were drawn (like in Godot's 2D renderer).
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
   * If `true`, writes to the depth buffer whenever the depth test returns true. Only works when
   * enable_depth_test is also true.
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
   * The method used for comparing the previous and current depth values.
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
   * If `true`, each depth value will be tested to see if it is between [depthRangeMin] and
   * [depthRangeMax]. If it is outside of these values, it is discarded.
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
   * The minimum depth that returns true for [enableDepthRange].
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
   * The maximum depth that returns true for [enableDepthRange].
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
   * If `true`, enables stencil testing. There are separate stencil buffers for front-facing
   * triangles and back-facing triangles. See properties that begin with "front_op" and properties with
   * "back_op" for each.
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
   * The operation to perform on the stencil buffer for front pixels that fail the stencil test.
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
   * The operation to perform on the stencil buffer for front pixels that pass the stencil test.
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
   * The operation to perform on the stencil buffer for front pixels that pass the stencil test but
   * fail the depth test.
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
   * The method used for comparing the previous front stencil value and [frontOpReference].
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
   * Selects which bits from the front stencil value will be compared.
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
   * Selects which bits from the front stencil value will be changed.
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
   * The value the previous front stencil value will be compared to.
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
   * The operation to perform on the stencil buffer for back pixels that fail the stencil test
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
   * The operation to perform on the stencil buffer for back pixels that pass the stencil test.
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
   * The operation to perform on the stencil buffer for back pixels that pass the stencil test but
   * fail the depth test.
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
   * The method used for comparing the previous back stencil value and [backOpReference].
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
   * Selects which bits from the back stencil value will be compared.
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
   * Selects which bits from the back stencil value will be changed.
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
   * The value the previous back stencil value will be compared to.
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

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setEnableDepthTestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_enable_depth_test", 2586408642)

    public val getEnableDepthTestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_enable_depth_test", 36873697)

    public val setEnableDepthWritePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_enable_depth_write", 2586408642)

    public val getEnableDepthWritePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_enable_depth_write", 36873697)

    public val setDepthCompareOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_depth_compare_operator", 2573711505)

    public val getDepthCompareOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_depth_compare_operator", 269730778)

    public val setEnableDepthRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_enable_depth_range", 2586408642)

    public val getEnableDepthRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_enable_depth_range", 36873697)

    public val setDepthRangeMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_depth_range_min", 373806689)

    public val getDepthRangeMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_depth_range_min", 1740695150)

    public val setDepthRangeMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_depth_range_max", 373806689)

    public val getDepthRangeMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_depth_range_max", 1740695150)

    public val setEnableStencilPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_enable_stencil", 2586408642)

    public val getEnableStencilPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_enable_stencil", 36873697)

    public val setFrontOpFailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_fail", 2092799566)

    public val getFrontOpFailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_fail", 1714732389)

    public val setFrontOpPassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_pass", 2092799566)

    public val getFrontOpPassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_pass", 1714732389)

    public val setFrontOpDepthFailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_depth_fail", 2092799566)

    public val getFrontOpDepthFailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_depth_fail", 1714732389)

    public val setFrontOpComparePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_compare", 2573711505)

    public val getFrontOpComparePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_compare", 269730778)

    public val setFrontOpCompareMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_compare_mask", 1286410249)

    public val getFrontOpCompareMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_compare_mask", 3905245786)

    public val setFrontOpWriteMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_write_mask", 1286410249)

    public val getFrontOpWriteMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_write_mask", 3905245786)

    public val setFrontOpReferencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_reference", 1286410249)

    public val getFrontOpReferencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_reference", 3905245786)

    public val setBackOpFailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_fail", 2092799566)

    public val getBackOpFailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_fail", 1714732389)

    public val setBackOpPassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_pass", 2092799566)

    public val getBackOpPassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_pass", 1714732389)

    public val setBackOpDepthFailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_depth_fail", 2092799566)

    public val getBackOpDepthFailPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_depth_fail", 1714732389)

    public val setBackOpComparePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_compare", 2573711505)

    public val getBackOpComparePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_compare", 269730778)

    public val setBackOpCompareMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_compare_mask", 1286410249)

    public val getBackOpCompareMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_compare_mask", 3905245786)

    public val setBackOpWriteMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_write_mask", 1286410249)

    public val getBackOpWriteMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_write_mask", 3905245786)

    public val setBackOpReferencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_reference", 1286410249)

    public val getBackOpReferencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_reference", 3905245786)
  }
}

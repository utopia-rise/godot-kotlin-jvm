// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 *
 */
@GodotBaseType
public open class RDPipelineDepthStencilState : RefCounted() {
  /**
   *
   */
  public var enableDepthTest: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_ENABLE_DEPTH_TEST, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_ENABLE_DEPTH_TEST, NIL)
    }

  /**
   *
   */
  public var enableDepthWrite: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_ENABLE_DEPTH_WRITE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_ENABLE_DEPTH_WRITE, NIL)
    }

  /**
   *
   */
  public var depthCompareOperator: RenderingDevice.CompareOperator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_DEPTH_COMPARE_OPERATOR, LONG)
      return RenderingDevice.CompareOperator.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_DEPTH_COMPARE_OPERATOR, NIL)
    }

  /**
   *
   */
  public var enableDepthRange: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_ENABLE_DEPTH_RANGE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_ENABLE_DEPTH_RANGE, NIL)
    }

  /**
   *
   */
  public var depthRangeMin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_DEPTH_RANGE_MIN, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_DEPTH_RANGE_MIN, NIL)
    }

  /**
   *
   */
  public var depthRangeMax: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_DEPTH_RANGE_MAX, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_DEPTH_RANGE_MAX, NIL)
    }

  /**
   *
   */
  public var enableStencil: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_ENABLE_STENCIL, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_ENABLE_STENCIL, NIL)
    }

  /**
   *
   */
  public var frontOpFail: RenderingDevice.StencilOperation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_FRONT_OP_FAIL, LONG)
      return RenderingDevice.StencilOperation.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_FRONT_OP_FAIL, NIL)
    }

  /**
   *
   */
  public var frontOpPass: RenderingDevice.StencilOperation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_FRONT_OP_PASS, LONG)
      return RenderingDevice.StencilOperation.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_FRONT_OP_PASS, NIL)
    }

  /**
   *
   */
  public var frontOpDepthFail: RenderingDevice.StencilOperation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_FRONT_OP_DEPTH_FAIL, LONG)
      return RenderingDevice.StencilOperation.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_FRONT_OP_DEPTH_FAIL, NIL)
    }

  /**
   *
   */
  public var frontOpCompare: RenderingDevice.CompareOperator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_FRONT_OP_COMPARE, LONG)
      return RenderingDevice.CompareOperator.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_FRONT_OP_COMPARE, NIL)
    }

  /**
   *
   */
  public var frontOpCompareMask: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_FRONT_OP_COMPARE_MASK, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_FRONT_OP_COMPARE_MASK, NIL)
    }

  /**
   *
   */
  public var frontOpWriteMask: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_FRONT_OP_WRITE_MASK, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_FRONT_OP_WRITE_MASK, NIL)
    }

  /**
   *
   */
  public var frontOpReference: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_FRONT_OP_REFERENCE, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_FRONT_OP_REFERENCE, NIL)
    }

  /**
   *
   */
  public var backOpFail: RenderingDevice.StencilOperation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_BACK_OP_FAIL, LONG)
      return RenderingDevice.StencilOperation.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_BACK_OP_FAIL, NIL)
    }

  /**
   *
   */
  public var backOpPass: RenderingDevice.StencilOperation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_BACK_OP_PASS, LONG)
      return RenderingDevice.StencilOperation.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_BACK_OP_PASS, NIL)
    }

  /**
   *
   */
  public var backOpDepthFail: RenderingDevice.StencilOperation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_BACK_OP_DEPTH_FAIL, LONG)
      return RenderingDevice.StencilOperation.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_BACK_OP_DEPTH_FAIL, NIL)
    }

  /**
   *
   */
  public var backOpCompare: RenderingDevice.CompareOperator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_BACK_OP_COMPARE, LONG)
      return RenderingDevice.CompareOperator.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_BACK_OP_COMPARE, NIL)
    }

  /**
   *
   */
  public var backOpCompareMask: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_BACK_OP_COMPARE_MASK, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_BACK_OP_COMPARE_MASK, NIL)
    }

  /**
   *
   */
  public var backOpWriteMask: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_BACK_OP_WRITE_MASK, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_BACK_OP_WRITE_MASK, NIL)
    }

  /**
   *
   */
  public var backOpReference: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_BACK_OP_REFERENCE, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_BACK_OP_REFERENCE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE, scriptIndex)
    return true
  }

  public companion object
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class RDPipelineDepthStencilState : RefCounted() {
  /**
   *
   */
  public open var enableDepthTest: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_ENABLE_DEPTH_TEST, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_ENABLE_DEPTH_TEST, NIL)
    }

  /**
   *
   */
  public open var enableDepthWrite: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_ENABLE_DEPTH_WRITE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_ENABLE_DEPTH_WRITE, NIL)
    }

  /**
   *
   */
  public open var depthCompareOperator: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_DEPTH_COMPARE_OPERATOR, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_DEPTH_COMPARE_OPERATOR, NIL)
    }

  /**
   *
   */
  public open var enableDepthRange: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_ENABLE_DEPTH_RANGE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_ENABLE_DEPTH_RANGE, NIL)
    }

  /**
   *
   */
  public open var depthRangeMin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_DEPTH_RANGE_MIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_DEPTH_RANGE_MIN, NIL)
    }

  /**
   *
   */
  public open var depthRangeMax: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_DEPTH_RANGE_MAX, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_DEPTH_RANGE_MAX, NIL)
    }

  /**
   *
   */
  public open var enableStencil: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_ENABLE_STENCIL, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_ENABLE_STENCIL, NIL)
    }

  /**
   *
   */
  public open var frontOpFail: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_FRONT_OP_FAIL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_FRONT_OP_FAIL, NIL)
    }

  /**
   *
   */
  public open var frontOpPass: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_FRONT_OP_PASS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_FRONT_OP_PASS, NIL)
    }

  /**
   *
   */
  public open var frontOpDepthFail: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_FRONT_OP_DEPTH_FAIL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_FRONT_OP_DEPTH_FAIL, NIL)
    }

  /**
   *
   */
  public open var frontOpCompare: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_FRONT_OP_COMPARE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_FRONT_OP_COMPARE, NIL)
    }

  /**
   *
   */
  public open var frontOpCompareMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_FRONT_OP_COMPARE_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_FRONT_OP_COMPARE_MASK, NIL)
    }

  /**
   *
   */
  public open var frontOpWriteMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_FRONT_OP_WRITE_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_FRONT_OP_WRITE_MASK, NIL)
    }

  /**
   *
   */
  public open var frontOpReference: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_FRONT_OP_REFERENCE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_FRONT_OP_REFERENCE, NIL)
    }

  /**
   *
   */
  public open var backOpFail: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_BACK_OP_FAIL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_BACK_OP_FAIL, NIL)
    }

  /**
   *
   */
  public open var backOpPass: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_BACK_OP_PASS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_BACK_OP_PASS, NIL)
    }

  /**
   *
   */
  public open var backOpDepthFail: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_BACK_OP_DEPTH_FAIL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_BACK_OP_DEPTH_FAIL, NIL)
    }

  /**
   *
   */
  public open var backOpCompare: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_BACK_OP_COMPARE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_BACK_OP_COMPARE, NIL)
    }

  /**
   *
   */
  public open var backOpCompareMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_BACK_OP_COMPARE_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_BACK_OP_COMPARE_MASK, NIL)
    }

  /**
   *
   */
  public open var backOpWriteMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_BACK_OP_WRITE_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_BACK_OP_WRITE_MASK, NIL)
    }

  /**
   *
   */
  public open var backOpReference: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_GET_BACK_OP_REFERENCE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE_SET_BACK_OP_REFERENCE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RDPIPELINEDEPTHSTENCILSTATE)
  }

  public companion object
}

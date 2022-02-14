// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

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
public open class RDPipelineRasterizationState : RefCounted() {
  /**
   *
   */
  public open var enableDepthClamp: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_ENABLE_DEPTH_CLAMP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_ENABLE_DEPTH_CLAMP, NIL)
    }

  /**
   *
   */
  public open var discardPrimitives: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_DISCARD_PRIMITIVES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_DISCARD_PRIMITIVES, NIL)
    }

  /**
   *
   */
  public open var wireframe: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_WIREFRAME, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_WIREFRAME, NIL)
    }

  /**
   *
   */
  public open var cullMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_CULL_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_CULL_MODE, NIL)
    }

  /**
   *
   */
  public open var frontFace: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_FRONT_FACE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_FRONT_FACE, NIL)
    }

  /**
   *
   */
  public open var depthBiasEnable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_DEPTH_BIAS_ENABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_DEPTH_BIAS_ENABLE, NIL)
    }

  /**
   *
   */
  public open var depthBiasConstantFactor: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_DEPTH_BIAS_CONSTANT_FACTOR,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_DEPTH_BIAS_CONSTANT_FACTOR, NIL)
    }

  /**
   *
   */
  public open var depthBiasClamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_DEPTH_BIAS_CLAMP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_DEPTH_BIAS_CLAMP, NIL)
    }

  /**
   *
   */
  public open var depthBiasSlopeFactor: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_DEPTH_BIAS_SLOPE_FACTOR, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_DEPTH_BIAS_SLOPE_FACTOR, NIL)
    }

  /**
   *
   */
  public open var lineWidth: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_LINE_WIDTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_LINE_WIDTH, NIL)
    }

  /**
   *
   */
  public open var patchControlPoints: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_PATCH_CONTROL_POINTS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_PATCH_CONTROL_POINTS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RDPIPELINERASTERIZATIONSTATE)
  }

  public companion object
}

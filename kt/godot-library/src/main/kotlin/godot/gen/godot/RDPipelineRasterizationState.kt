// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
  public var enableDepthClamp: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_ENABLE_DEPTH_CLAMP,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_ENABLE_DEPTH_CLAMP, NIL.ordinal)
    }

  /**
   *
   */
  public var discardPrimitives: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_DISCARD_PRIMITIVES,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_DISCARD_PRIMITIVES, NIL.ordinal)
    }

  /**
   *
   */
  public var wireframe: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_WIREFRAME, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_WIREFRAME, NIL.ordinal)
    }

  /**
   *
   */
  public var cullMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_CULL_MODE, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_CULL_MODE, NIL.ordinal)
    }

  /**
   *
   */
  public var frontFace: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_FRONT_FACE, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_FRONT_FACE, NIL.ordinal)
    }

  /**
   *
   */
  public var depthBiasEnable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_DEPTH_BIAS_ENABLE, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_DEPTH_BIAS_ENABLE, NIL.ordinal)
    }

  /**
   *
   */
  public var depthBiasConstantFactor: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_DEPTH_BIAS_CONSTANT_FACTOR,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_DEPTH_BIAS_CONSTANT_FACTOR,
          NIL.ordinal)
    }

  /**
   *
   */
  public var depthBiasClamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_DEPTH_BIAS_CLAMP,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_DEPTH_BIAS_CLAMP, NIL.ordinal)
    }

  /**
   *
   */
  public var depthBiasSlopeFactor: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_DEPTH_BIAS_SLOPE_FACTOR,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_DEPTH_BIAS_SLOPE_FACTOR,
          NIL.ordinal)
    }

  /**
   *
   */
  public var lineWidth: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_LINE_WIDTH, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_LINE_WIDTH, NIL.ordinal)
    }

  /**
   *
   */
  public var patchControlPoints: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_PATCH_CONTROL_POINTS,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_PATCH_CONTROL_POINTS,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RDPIPELINERASTERIZATIONSTATE)
  }

  public companion object
}

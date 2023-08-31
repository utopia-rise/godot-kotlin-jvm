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
 * Pipeline rasterization state (used by [godot.RenderingDevice]).
 *
 * This object is used by [godot.RenderingDevice].
 */
@GodotBaseType
public open class RDPipelineRasterizationState : RefCounted() {
  /**
   *
   */
  public var enableDepthClamp: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_ENABLE_DEPTH_CLAMP, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_ENABLE_DEPTH_CLAMP, NIL)
    }

  /**
   * If `true`, primitives are discarded immediately before the rasterization stage.
   */
  public var discardPrimitives: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_DISCARD_PRIMITIVES, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_DISCARD_PRIMITIVES, NIL)
    }

  /**
   * If `true`, performs wireframe rendering for triangles instead of flat or textured rendering.
   */
  public var wireframe: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_WIREFRAME, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_WIREFRAME, NIL)
    }

  /**
   * The cull mode to use when drawing polygons, which determines whether front faces or backfaces are hidden.
   */
  public var cullMode: RenderingDevice.PolygonCullMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_CULL_MODE, LONG)
      return RenderingDevice.PolygonCullMode.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_CULL_MODE, NIL)
    }

  /**
   * The winding order to use to determine which face of a triangle is considered its front face.
   */
  public var frontFace: RenderingDevice.PolygonFrontFace
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_FRONT_FACE, LONG)
      return RenderingDevice.PolygonFrontFace.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_FRONT_FACE, NIL)
    }

  /**
   *
   */
  public var depthBiasEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_DEPTH_BIAS_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_DEPTH_BIAS_ENABLED, NIL)
    }

  /**
   *
   */
  public var depthBiasConstantFactor: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_DEPTH_BIAS_CONSTANT_FACTOR,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_DEPTH_BIAS_CONSTANT_FACTOR, NIL)
    }

  /**
   *
   */
  public var depthBiasClamp: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_DEPTH_BIAS_CLAMP, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_DEPTH_BIAS_CLAMP, NIL)
    }

  /**
   *
   */
  public var depthBiasSlopeFactor: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_DEPTH_BIAS_SLOPE_FACTOR, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_DEPTH_BIAS_SLOPE_FACTOR, NIL)
    }

  /**
   * THe line width to use when drawing lines (in pixels). Thick lines may not be supported on all hardware.
   */
  public var lineWidth: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_LINE_WIDTH, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_LINE_WIDTH, NIL)
    }

  /**
   * The number of control points to use when drawing a patch with tessellation enabled. Higher values result in higher quality at the cost of performance.
   */
  public var patchControlPoints: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_GET_PATCH_CONTROL_POINTS, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RDPIPELINERASTERIZATIONSTATE_SET_PATCH_CONTROL_POINTS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDPIPELINERASTERIZATIONSTATE, scriptIndex)
    return true
  }

  public companion object
}

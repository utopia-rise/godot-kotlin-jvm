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
      TransferContext.callMethod(rawPtr, MethodBindings.getEnableDepthClampPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableDepthClampPtr, NIL)
    }

  /**
   * If `true`, primitives are discarded immediately before the rasterization stage.
   */
  public var discardPrimitives: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDiscardPrimitivesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDiscardPrimitivesPtr, NIL)
    }

  /**
   * If `true`, performs wireframe rendering for triangles instead of flat or textured rendering.
   */
  public var wireframe: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWireframePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setWireframePtr, NIL)
    }

  /**
   * The cull mode to use when drawing polygons, which determines whether front faces or backfaces are hidden.
   */
  public var cullMode: RenderingDevice.PolygonCullMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCullModePtr, LONG)
      return RenderingDevice.PolygonCullMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCullModePtr, NIL)
    }

  /**
   * The winding order to use to determine which face of a triangle is considered its front face.
   */
  public var frontFace: RenderingDevice.PolygonFrontFace
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrontFacePtr, LONG)
      return RenderingDevice.PolygonFrontFace.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFrontFacePtr, NIL)
    }

  /**
   *
   */
  public var depthBiasEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDepthBiasEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDepthBiasEnabledPtr, NIL)
    }

  /**
   *
   */
  public var depthBiasConstantFactor: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDepthBiasConstantFactorPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDepthBiasConstantFactorPtr, NIL)
    }

  /**
   *
   */
  public var depthBiasClamp: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDepthBiasClampPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDepthBiasClampPtr, NIL)
    }

  /**
   *
   */
  public var depthBiasSlopeFactor: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDepthBiasSlopeFactorPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDepthBiasSlopeFactorPtr, NIL)
    }

  /**
   * THe line width to use when drawing lines (in pixels). Thick lines may not be supported on all hardware.
   */
  public var lineWidth: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLineWidthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLineWidthPtr, NIL)
    }

  /**
   * The number of control points to use when drawing a patch with tessellation enabled. Higher values result in higher quality at the cost of performance.
   */
  public var patchControlPoints: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPatchControlPointsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPatchControlPointsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RDPIPELINERASTERIZATIONSTATE, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setEnableDepthClampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "set_enable_depth_clamp")

    public val getEnableDepthClampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "get_enable_depth_clamp")

    public val setDiscardPrimitivesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "set_discard_primitives")

    public val getDiscardPrimitivesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "get_discard_primitives")

    public val setWireframePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "set_wireframe")

    public val getWireframePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "get_wireframe")

    public val setCullModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "set_cull_mode")

    public val getCullModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "get_cull_mode")

    public val setFrontFacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "set_front_face")

    public val getFrontFacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "get_front_face")

    public val setDepthBiasEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "set_depth_bias_enabled")

    public val getDepthBiasEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "get_depth_bias_enabled")

    public val setDepthBiasConstantFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "set_depth_bias_constant_factor")

    public val getDepthBiasConstantFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "get_depth_bias_constant_factor")

    public val setDepthBiasClampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "set_depth_bias_clamp")

    public val getDepthBiasClampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "get_depth_bias_clamp")

    public val setDepthBiasSlopeFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "set_depth_bias_slope_factor")

    public val getDepthBiasSlopeFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "get_depth_bias_slope_factor")

    public val setLineWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "set_line_width")

    public val getLineWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "get_line_width")

    public val setPatchControlPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "set_patch_control_points")

    public val getPatchControlPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RDPipelineRasterizationState", "get_patch_control_points")
  }
}

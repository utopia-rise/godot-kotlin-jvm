// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_RDPIPELINERASTERIZATIONSTATE_INDEX: Int = 515

/**
 * This object is used by [RenderingDevice].
 */
@GodotBaseType
public open class RDPipelineRasterizationState : RefCounted() {
  /**
   * If `true`, clamps depth values according to the minimum and maximum depth of the associated
   * viewport.
   */
  public final inline var enableDepthClamp: Boolean
    @JvmName("enableDepthClampProperty")
    get() = getEnableDepthClamp()
    @JvmName("enableDepthClampProperty")
    set(`value`) {
      setEnableDepthClamp(value)
    }

  /**
   * If `true`, primitives are discarded immediately before the rasterization stage.
   */
  public final inline var discardPrimitives: Boolean
    @JvmName("discardPrimitivesProperty")
    get() = getDiscardPrimitives()
    @JvmName("discardPrimitivesProperty")
    set(`value`) {
      setDiscardPrimitives(value)
    }

  /**
   * If `true`, performs wireframe rendering for triangles instead of flat or textured rendering.
   */
  public final inline var wireframe: Boolean
    @JvmName("wireframeProperty")
    get() = getWireframe()
    @JvmName("wireframeProperty")
    set(`value`) {
      setWireframe(value)
    }

  /**
   * The cull mode to use when drawing polygons, which determines whether front faces or backfaces
   * are hidden.
   */
  public final inline var cullMode: RenderingDevice.PolygonCullMode
    @JvmName("cullModeProperty")
    get() = getCullMode()
    @JvmName("cullModeProperty")
    set(`value`) {
      setCullMode(value)
    }

  /**
   * The winding order to use to determine which face of a triangle is considered its front face.
   */
  public final inline var frontFace: RenderingDevice.PolygonFrontFace
    @JvmName("frontFaceProperty")
    get() = getFrontFace()
    @JvmName("frontFaceProperty")
    set(`value`) {
      setFrontFace(value)
    }

  /**
   * If `true`, each generated depth value will by offset by some amount. The specific amount is
   * generated per polygon based on the values of [depthBiasSlopeFactor] and [depthBiasConstantFactor].
   */
  public final inline var depthBiasEnabled: Boolean
    @JvmName("depthBiasEnabledProperty")
    get() = getDepthBiasEnabled()
    @JvmName("depthBiasEnabledProperty")
    set(`value`) {
      setDepthBiasEnabled(value)
    }

  /**
   * A constant offset added to each depth value. Applied after [depthBiasSlopeFactor].
   */
  public final inline var depthBiasConstantFactor: Float
    @JvmName("depthBiasConstantFactorProperty")
    get() = getDepthBiasConstantFactor()
    @JvmName("depthBiasConstantFactorProperty")
    set(`value`) {
      setDepthBiasConstantFactor(value)
    }

  /**
   * A limit for how much each depth value can be offset. If negative, it serves as a minimum value,
   * but if positive, it serves as a maximum value.
   */
  public final inline var depthBiasClamp: Float
    @JvmName("depthBiasClampProperty")
    get() = getDepthBiasClamp()
    @JvmName("depthBiasClampProperty")
    set(`value`) {
      setDepthBiasClamp(value)
    }

  /**
   * A constant scale applied to the slope of each polygons' depth. Applied before
   * [depthBiasConstantFactor].
   */
  public final inline var depthBiasSlopeFactor: Float
    @JvmName("depthBiasSlopeFactorProperty")
    get() = getDepthBiasSlopeFactor()
    @JvmName("depthBiasSlopeFactorProperty")
    set(`value`) {
      setDepthBiasSlopeFactor(value)
    }

  /**
   * The line width to use when drawing lines (in pixels). Thick lines may not be supported on all
   * hardware.
   */
  public final inline var lineWidth: Float
    @JvmName("lineWidthProperty")
    get() = getLineWidth()
    @JvmName("lineWidthProperty")
    set(`value`) {
      setLineWidth(value)
    }

  /**
   * The number of control points to use when drawing a patch with tessellation enabled. Higher
   * values result in higher quality at the cost of performance.
   */
  public final inline var patchControlPoints: Long
    @JvmName("patchControlPointsProperty")
    get() = getPatchControlPoints()
    @JvmName("patchControlPointsProperty")
    set(`value`) {
      setPatchControlPoints(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_RDPIPELINERASTERIZATIONSTATE_INDEX, scriptIndex)
  }

  public final fun setEnableDepthClamp(pMember: Boolean): Unit {
    Internals.writeArguments(BOOL to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setEnableDepthClampPtr, NIL)
  }

  public final fun getEnableDepthClamp(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnableDepthClampPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDiscardPrimitives(pMember: Boolean): Unit {
    Internals.writeArguments(BOOL to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setDiscardPrimitivesPtr, NIL)
  }

  public final fun getDiscardPrimitives(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDiscardPrimitivesPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setWireframe(pMember: Boolean): Unit {
    Internals.writeArguments(BOOL to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setWireframePtr, NIL)
  }

  public final fun getWireframe(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getWireframePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCullMode(pMember: RenderingDevice.PolygonCullMode): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setCullModePtr, NIL)
  }

  public final fun getCullMode(): RenderingDevice.PolygonCullMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCullModePtr, LONG)
    return RenderingDevice.PolygonCullMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setFrontFace(pMember: RenderingDevice.PolygonFrontFace): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setFrontFacePtr, NIL)
  }

  public final fun getFrontFace(): RenderingDevice.PolygonFrontFace {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFrontFacePtr, LONG)
    return RenderingDevice.PolygonFrontFace.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setDepthBiasEnabled(pMember: Boolean): Unit {
    Internals.writeArguments(BOOL to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setDepthBiasEnabledPtr, NIL)
  }

  public final fun getDepthBiasEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDepthBiasEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDepthBiasConstantFactor(pMember: Float): Unit {
    Internals.writeArguments(DOUBLE to pMember.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDepthBiasConstantFactorPtr, NIL)
  }

  public final fun getDepthBiasConstantFactor(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDepthBiasConstantFactorPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDepthBiasClamp(pMember: Float): Unit {
    Internals.writeArguments(DOUBLE to pMember.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDepthBiasClampPtr, NIL)
  }

  public final fun getDepthBiasClamp(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDepthBiasClampPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDepthBiasSlopeFactor(pMember: Float): Unit {
    Internals.writeArguments(DOUBLE to pMember.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDepthBiasSlopeFactorPtr, NIL)
  }

  public final fun getDepthBiasSlopeFactor(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDepthBiasSlopeFactorPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setLineWidth(pMember: Float): Unit {
    Internals.writeArguments(DOUBLE to pMember.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setLineWidthPtr, NIL)
  }

  public final fun getLineWidth(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLineWidthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPatchControlPoints(pMember: Long): Unit {
    Internals.writeArguments(LONG to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setPatchControlPointsPtr, NIL)
  }

  public final fun getPatchControlPoints(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPatchControlPointsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public companion object

  public object MethodBindings {
    internal val setEnableDepthClampPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "set_enable_depth_clamp", 2586408642)

    internal val getEnableDepthClampPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "get_enable_depth_clamp", 36873697)

    internal val setDiscardPrimitivesPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "set_discard_primitives", 2586408642)

    internal val getDiscardPrimitivesPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "get_discard_primitives", 36873697)

    internal val setWireframePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "set_wireframe", 2586408642)

    internal val getWireframePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "get_wireframe", 36873697)

    internal val setCullModePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "set_cull_mode", 2662586502)

    internal val getCullModePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "get_cull_mode", 2192484313)

    internal val setFrontFacePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "set_front_face", 2637251213)

    internal val getFrontFacePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "get_front_face", 708793786)

    internal val setDepthBiasEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "set_depth_bias_enabled", 2586408642)

    internal val getDepthBiasEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "get_depth_bias_enabled", 36873697)

    internal val setDepthBiasConstantFactorPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "set_depth_bias_constant_factor", 373806689)

    internal val getDepthBiasConstantFactorPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "get_depth_bias_constant_factor", 1740695150)

    internal val setDepthBiasClampPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "set_depth_bias_clamp", 373806689)

    internal val getDepthBiasClampPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "get_depth_bias_clamp", 1740695150)

    internal val setDepthBiasSlopeFactorPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "set_depth_bias_slope_factor", 373806689)

    internal val getDepthBiasSlopeFactorPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "get_depth_bias_slope_factor", 1740695150)

    internal val setLineWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "set_line_width", 373806689)

    internal val getLineWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "get_line_width", 1740695150)

    internal val setPatchControlPointsPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "set_patch_control_points", 1286410249)

    internal val getPatchControlPointsPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineRasterizationState", "get_patch_control_points", 3905245786)
  }
}

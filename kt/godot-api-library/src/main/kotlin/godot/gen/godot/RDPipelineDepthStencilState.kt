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

private const val ENGINE_CLASS_RDPIPELINEDEPTHSTENCILSTATE_INDEX: Int = 513

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
  public final inline var enableDepthTest: Boolean
    @JvmName("enableDepthTestProperty")
    get() = getEnableDepthTest()
    @JvmName("enableDepthTestProperty")
    set(`value`) {
      setEnableDepthTest(value)
    }

  /**
   * If `true`, writes to the depth buffer whenever the depth test returns true. Only works when
   * enable_depth_test is also true.
   */
  public final inline var enableDepthWrite: Boolean
    @JvmName("enableDepthWriteProperty")
    get() = getEnableDepthWrite()
    @JvmName("enableDepthWriteProperty")
    set(`value`) {
      setEnableDepthWrite(value)
    }

  /**
   * The method used for comparing the previous and current depth values.
   */
  public final inline var depthCompareOperator: RenderingDevice.CompareOperator
    @JvmName("depthCompareOperatorProperty")
    get() = getDepthCompareOperator()
    @JvmName("depthCompareOperatorProperty")
    set(`value`) {
      setDepthCompareOperator(value)
    }

  /**
   * If `true`, each depth value will be tested to see if it is between [depthRangeMin] and
   * [depthRangeMax]. If it is outside of these values, it is discarded.
   */
  public final inline var enableDepthRange: Boolean
    @JvmName("enableDepthRangeProperty")
    get() = getEnableDepthRange()
    @JvmName("enableDepthRangeProperty")
    set(`value`) {
      setEnableDepthRange(value)
    }

  /**
   * The minimum depth that returns true for [enableDepthRange].
   */
  public final inline var depthRangeMin: Float
    @JvmName("depthRangeMinProperty")
    get() = getDepthRangeMin()
    @JvmName("depthRangeMinProperty")
    set(`value`) {
      setDepthRangeMin(value)
    }

  /**
   * The maximum depth that returns true for [enableDepthRange].
   */
  public final inline var depthRangeMax: Float
    @JvmName("depthRangeMaxProperty")
    get() = getDepthRangeMax()
    @JvmName("depthRangeMaxProperty")
    set(`value`) {
      setDepthRangeMax(value)
    }

  /**
   * If `true`, enables stencil testing. There are separate stencil buffers for front-facing
   * triangles and back-facing triangles. See properties that begin with "front_op" and properties with
   * "back_op" for each.
   */
  public final inline var enableStencil: Boolean
    @JvmName("enableStencilProperty")
    get() = getEnableStencil()
    @JvmName("enableStencilProperty")
    set(`value`) {
      setEnableStencil(value)
    }

  /**
   * The operation to perform on the stencil buffer for front pixels that fail the stencil test.
   */
  public final inline var frontOpFail: RenderingDevice.StencilOperation
    @JvmName("frontOpFailProperty")
    get() = getFrontOpFail()
    @JvmName("frontOpFailProperty")
    set(`value`) {
      setFrontOpFail(value)
    }

  /**
   * The operation to perform on the stencil buffer for front pixels that pass the stencil test.
   */
  public final inline var frontOpPass: RenderingDevice.StencilOperation
    @JvmName("frontOpPassProperty")
    get() = getFrontOpPass()
    @JvmName("frontOpPassProperty")
    set(`value`) {
      setFrontOpPass(value)
    }

  /**
   * The operation to perform on the stencil buffer for front pixels that pass the stencil test but
   * fail the depth test.
   */
  public final inline var frontOpDepthFail: RenderingDevice.StencilOperation
    @JvmName("frontOpDepthFailProperty")
    get() = getFrontOpDepthFail()
    @JvmName("frontOpDepthFailProperty")
    set(`value`) {
      setFrontOpDepthFail(value)
    }

  /**
   * The method used for comparing the previous front stencil value and [frontOpReference].
   */
  public final inline var frontOpCompare: RenderingDevice.CompareOperator
    @JvmName("frontOpCompareProperty")
    get() = getFrontOpCompare()
    @JvmName("frontOpCompareProperty")
    set(`value`) {
      setFrontOpCompare(value)
    }

  /**
   * Selects which bits from the front stencil value will be compared.
   */
  public final inline var frontOpCompareMask: Long
    @JvmName("frontOpCompareMaskProperty")
    get() = getFrontOpCompareMask()
    @JvmName("frontOpCompareMaskProperty")
    set(`value`) {
      setFrontOpCompareMask(value)
    }

  /**
   * Selects which bits from the front stencil value will be changed.
   */
  public final inline var frontOpWriteMask: Long
    @JvmName("frontOpWriteMaskProperty")
    get() = getFrontOpWriteMask()
    @JvmName("frontOpWriteMaskProperty")
    set(`value`) {
      setFrontOpWriteMask(value)
    }

  /**
   * The value the previous front stencil value will be compared to.
   */
  public final inline var frontOpReference: Long
    @JvmName("frontOpReferenceProperty")
    get() = getFrontOpReference()
    @JvmName("frontOpReferenceProperty")
    set(`value`) {
      setFrontOpReference(value)
    }

  /**
   * The operation to perform on the stencil buffer for back pixels that fail the stencil test
   */
  public final inline var backOpFail: RenderingDevice.StencilOperation
    @JvmName("backOpFailProperty")
    get() = getBackOpFail()
    @JvmName("backOpFailProperty")
    set(`value`) {
      setBackOpFail(value)
    }

  /**
   * The operation to perform on the stencil buffer for back pixels that pass the stencil test.
   */
  public final inline var backOpPass: RenderingDevice.StencilOperation
    @JvmName("backOpPassProperty")
    get() = getBackOpPass()
    @JvmName("backOpPassProperty")
    set(`value`) {
      setBackOpPass(value)
    }

  /**
   * The operation to perform on the stencil buffer for back pixels that pass the stencil test but
   * fail the depth test.
   */
  public final inline var backOpDepthFail: RenderingDevice.StencilOperation
    @JvmName("backOpDepthFailProperty")
    get() = getBackOpDepthFail()
    @JvmName("backOpDepthFailProperty")
    set(`value`) {
      setBackOpDepthFail(value)
    }

  /**
   * The method used for comparing the previous back stencil value and [backOpReference].
   */
  public final inline var backOpCompare: RenderingDevice.CompareOperator
    @JvmName("backOpCompareProperty")
    get() = getBackOpCompare()
    @JvmName("backOpCompareProperty")
    set(`value`) {
      setBackOpCompare(value)
    }

  /**
   * Selects which bits from the back stencil value will be compared.
   */
  public final inline var backOpCompareMask: Long
    @JvmName("backOpCompareMaskProperty")
    get() = getBackOpCompareMask()
    @JvmName("backOpCompareMaskProperty")
    set(`value`) {
      setBackOpCompareMask(value)
    }

  /**
   * Selects which bits from the back stencil value will be changed.
   */
  public final inline var backOpWriteMask: Long
    @JvmName("backOpWriteMaskProperty")
    get() = getBackOpWriteMask()
    @JvmName("backOpWriteMaskProperty")
    set(`value`) {
      setBackOpWriteMask(value)
    }

  /**
   * The value the previous back stencil value will be compared to.
   */
  public final inline var backOpReference: Long
    @JvmName("backOpReferenceProperty")
    get() = getBackOpReference()
    @JvmName("backOpReferenceProperty")
    set(`value`) {
      setBackOpReference(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_RDPIPELINEDEPTHSTENCILSTATE_INDEX, scriptIndex)
  }

  public final fun setEnableDepthTest(pMember: Boolean): Unit {
    Internals.writeArguments(BOOL to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setEnableDepthTestPtr, NIL)
  }

  public final fun getEnableDepthTest(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnableDepthTestPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEnableDepthWrite(pMember: Boolean): Unit {
    Internals.writeArguments(BOOL to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setEnableDepthWritePtr, NIL)
  }

  public final fun getEnableDepthWrite(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnableDepthWritePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDepthCompareOperator(pMember: RenderingDevice.CompareOperator): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setDepthCompareOperatorPtr, NIL)
  }

  public final fun getDepthCompareOperator(): RenderingDevice.CompareOperator {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDepthCompareOperatorPtr, LONG)
    return RenderingDevice.CompareOperator.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setEnableDepthRange(pMember: Boolean): Unit {
    Internals.writeArguments(BOOL to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setEnableDepthRangePtr, NIL)
  }

  public final fun getEnableDepthRange(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnableDepthRangePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDepthRangeMin(pMember: Float): Unit {
    Internals.writeArguments(DOUBLE to pMember.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDepthRangeMinPtr, NIL)
  }

  public final fun getDepthRangeMin(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDepthRangeMinPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDepthRangeMax(pMember: Float): Unit {
    Internals.writeArguments(DOUBLE to pMember.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDepthRangeMaxPtr, NIL)
  }

  public final fun getDepthRangeMax(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDepthRangeMaxPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEnableStencil(pMember: Boolean): Unit {
    Internals.writeArguments(BOOL to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setEnableStencilPtr, NIL)
  }

  public final fun getEnableStencil(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnableStencilPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFrontOpFail(pMember: RenderingDevice.StencilOperation): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setFrontOpFailPtr, NIL)
  }

  public final fun getFrontOpFail(): RenderingDevice.StencilOperation {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFrontOpFailPtr, LONG)
    return RenderingDevice.StencilOperation.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setFrontOpPass(pMember: RenderingDevice.StencilOperation): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setFrontOpPassPtr, NIL)
  }

  public final fun getFrontOpPass(): RenderingDevice.StencilOperation {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFrontOpPassPtr, LONG)
    return RenderingDevice.StencilOperation.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setFrontOpDepthFail(pMember: RenderingDevice.StencilOperation): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setFrontOpDepthFailPtr, NIL)
  }

  public final fun getFrontOpDepthFail(): RenderingDevice.StencilOperation {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFrontOpDepthFailPtr, LONG)
    return RenderingDevice.StencilOperation.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setFrontOpCompare(pMember: RenderingDevice.CompareOperator): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setFrontOpComparePtr, NIL)
  }

  public final fun getFrontOpCompare(): RenderingDevice.CompareOperator {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFrontOpComparePtr, LONG)
    return RenderingDevice.CompareOperator.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setFrontOpCompareMask(pMember: Long): Unit {
    Internals.writeArguments(LONG to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setFrontOpCompareMaskPtr, NIL)
  }

  public final fun getFrontOpCompareMask(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFrontOpCompareMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setFrontOpWriteMask(pMember: Long): Unit {
    Internals.writeArguments(LONG to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setFrontOpWriteMaskPtr, NIL)
  }

  public final fun getFrontOpWriteMask(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFrontOpWriteMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setFrontOpReference(pMember: Long): Unit {
    Internals.writeArguments(LONG to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setFrontOpReferencePtr, NIL)
  }

  public final fun getFrontOpReference(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFrontOpReferencePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setBackOpFail(pMember: RenderingDevice.StencilOperation): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setBackOpFailPtr, NIL)
  }

  public final fun getBackOpFail(): RenderingDevice.StencilOperation {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBackOpFailPtr, LONG)
    return RenderingDevice.StencilOperation.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setBackOpPass(pMember: RenderingDevice.StencilOperation): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setBackOpPassPtr, NIL)
  }

  public final fun getBackOpPass(): RenderingDevice.StencilOperation {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBackOpPassPtr, LONG)
    return RenderingDevice.StencilOperation.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setBackOpDepthFail(pMember: RenderingDevice.StencilOperation): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setBackOpDepthFailPtr, NIL)
  }

  public final fun getBackOpDepthFail(): RenderingDevice.StencilOperation {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBackOpDepthFailPtr, LONG)
    return RenderingDevice.StencilOperation.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setBackOpCompare(pMember: RenderingDevice.CompareOperator): Unit {
    Internals.writeArguments(LONG to pMember.id)
    Internals.callMethod(rawPtr, MethodBindings.setBackOpComparePtr, NIL)
  }

  public final fun getBackOpCompare(): RenderingDevice.CompareOperator {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBackOpComparePtr, LONG)
    return RenderingDevice.CompareOperator.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setBackOpCompareMask(pMember: Long): Unit {
    Internals.writeArguments(LONG to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setBackOpCompareMaskPtr, NIL)
  }

  public final fun getBackOpCompareMask(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBackOpCompareMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setBackOpWriteMask(pMember: Long): Unit {
    Internals.writeArguments(LONG to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setBackOpWriteMaskPtr, NIL)
  }

  public final fun getBackOpWriteMask(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBackOpWriteMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setBackOpReference(pMember: Long): Unit {
    Internals.writeArguments(LONG to pMember)
    Internals.callMethod(rawPtr, MethodBindings.setBackOpReferencePtr, NIL)
  }

  public final fun getBackOpReference(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBackOpReferencePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val setEnableDepthTestPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_enable_depth_test", 2586408642)

    public val getEnableDepthTestPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_enable_depth_test", 36873697)

    public val setEnableDepthWritePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_enable_depth_write", 2586408642)

    public val getEnableDepthWritePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_enable_depth_write", 36873697)

    public val setDepthCompareOperatorPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_depth_compare_operator", 2573711505)

    public val getDepthCompareOperatorPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_depth_compare_operator", 269730778)

    public val setEnableDepthRangePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_enable_depth_range", 2586408642)

    public val getEnableDepthRangePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_enable_depth_range", 36873697)

    public val setDepthRangeMinPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_depth_range_min", 373806689)

    public val getDepthRangeMinPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_depth_range_min", 1740695150)

    public val setDepthRangeMaxPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_depth_range_max", 373806689)

    public val getDepthRangeMaxPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_depth_range_max", 1740695150)

    public val setEnableStencilPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_enable_stencil", 2586408642)

    public val getEnableStencilPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_enable_stencil", 36873697)

    public val setFrontOpFailPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_fail", 2092799566)

    public val getFrontOpFailPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_fail", 1714732389)

    public val setFrontOpPassPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_pass", 2092799566)

    public val getFrontOpPassPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_pass", 1714732389)

    public val setFrontOpDepthFailPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_depth_fail", 2092799566)

    public val getFrontOpDepthFailPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_depth_fail", 1714732389)

    public val setFrontOpComparePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_compare", 2573711505)

    public val getFrontOpComparePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_compare", 269730778)

    public val setFrontOpCompareMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_compare_mask", 1286410249)

    public val getFrontOpCompareMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_compare_mask", 3905245786)

    public val setFrontOpWriteMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_write_mask", 1286410249)

    public val getFrontOpWriteMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_write_mask", 3905245786)

    public val setFrontOpReferencePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_front_op_reference", 1286410249)

    public val getFrontOpReferencePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_front_op_reference", 3905245786)

    public val setBackOpFailPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_fail", 2092799566)

    public val getBackOpFailPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_fail", 1714732389)

    public val setBackOpPassPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_pass", 2092799566)

    public val getBackOpPassPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_pass", 1714732389)

    public val setBackOpDepthFailPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_depth_fail", 2092799566)

    public val getBackOpDepthFailPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_depth_fail", 1714732389)

    public val setBackOpComparePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_compare", 2573711505)

    public val getBackOpComparePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_compare", 269730778)

    public val setBackOpCompareMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_compare_mask", 1286410249)

    public val getBackOpCompareMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_compare_mask", 3905245786)

    public val setBackOpWriteMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_write_mask", 1286410249)

    public val getBackOpWriteMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_write_mask", 3905245786)

    public val setBackOpReferencePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "set_back_op_reference", 1286410249)

    public val getBackOpReferencePtr: VoidPtr =
        Internals.getMethodBindPtr("RDPipelineDepthStencilState", "get_back_op_reference", 3905245786)
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODEDERIVATIVEFUNC_INDEX: Int = 723

/**
 * This node is only available in `Fragment` and `Light` visual shaders.
 */
@GodotBaseType
public open class VisualShaderNodeDerivativeFunc : VisualShaderNode() {
  /**
   * A type of operands and returned value. See [OpType] for options.
   */
  public final inline var opType: OpType
    @JvmName("opTypeProperty")
    get() = getOpType()
    @JvmName("opTypeProperty")
    set(`value`) {
      setOpType(value)
    }

  /**
   * A derivative function type. See [Function] for options.
   */
  public final inline var function: Function
    @JvmName("functionProperty")
    get() = getFunction()
    @JvmName("functionProperty")
    set(`value`) {
      setFunction(value)
    }

  /**
   * Sets the level of precision to use for the derivative function. See [Precision] for options.
   * When using the GL Compatibility renderer, this setting has no effect.
   */
  public final inline var precision: Precision
    @JvmName("precisionProperty")
    get() = getPrecision()
    @JvmName("precisionProperty")
    set(`value`) {
      setPrecision(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODEDERIVATIVEFUNC_INDEX, scriptIndex)
  }

  public final fun setOpType(type: OpType): Unit {
    Internals.writeArguments(LONG to type.id)
    Internals.callMethod(rawPtr, MethodBindings.setOpTypePtr, NIL)
  }

  public final fun getOpType(): OpType {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOpTypePtr, LONG)
    return VisualShaderNodeDerivativeFunc.OpType.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setFunction(func: Function): Unit {
    Internals.writeArguments(LONG to func.id)
    Internals.callMethod(rawPtr, MethodBindings.setFunctionPtr, NIL)
  }

  public final fun getFunction(): Function {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFunctionPtr, LONG)
    return VisualShaderNodeDerivativeFunc.Function.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setPrecision(precision: Precision): Unit {
    Internals.writeArguments(LONG to precision.id)
    Internals.callMethod(rawPtr, MethodBindings.setPrecisionPtr, NIL)
  }

  public final fun getPrecision(): Precision {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPrecisionPtr, LONG)
    return VisualShaderNodeDerivativeFunc.Precision.from(Internals.readReturnValue(LONG) as Long)
  }

  public enum class OpType(
    id: Long,
  ) {
    /**
     * A floating-point scalar.
     */
    OP_TYPE_SCALAR(0),
    /**
     * A 2D vector type.
     */
    OP_TYPE_VECTOR_2D(1),
    /**
     * A 3D vector type.
     */
    OP_TYPE_VECTOR_3D(2),
    /**
     * A 4D vector type.
     */
    OP_TYPE_VECTOR_4D(3),
    /**
     * Represents the size of the [OpType] enum.
     */
    OP_TYPE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): OpType = entries.single { it.id == `value` }
    }
  }

  public enum class Function(
    id: Long,
  ) {
    /**
     * Sum of absolute derivative in `x` and `y`.
     */
    FUNC_SUM(0),
    /**
     * Derivative in `x` using local differencing.
     */
    FUNC_X(1),
    /**
     * Derivative in `y` using local differencing.
     */
    FUNC_Y(2),
    /**
     * Represents the size of the [Function] enum.
     */
    FUNC_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Function = entries.single { it.id == `value` }
    }
  }

  public enum class Precision(
    id: Long,
  ) {
    /**
     * No precision is specified, the GPU driver is allowed to use whatever level of precision it
     * chooses. This is the default option and is equivalent to using `dFdx()` or `dFdy()` in text
     * shaders.
     */
    PRECISION_NONE(0),
    /**
     * The derivative will be calculated using the current fragment's neighbors (which may not
     * include the current fragment). This tends to be faster than using [PRECISION_FINE], but may not
     * be suitable when more precision is needed. This is equivalent to using `dFdxCoarse()` or
     * `dFdyCoarse()` in text shaders.
     */
    PRECISION_COARSE(1),
    /**
     * The derivative will be calculated using the current fragment and its immediate neighbors.
     * This tends to be slower than using [PRECISION_COARSE], but may be necessary when more precision
     * is needed. This is equivalent to using `dFdxFine()` or `dFdyFine()` in text shaders.
     */
    PRECISION_FINE(2),
    /**
     * Represents the size of the [Precision] enum.
     */
    PRECISION_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Precision = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setOpTypePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeDerivativeFunc", "set_op_type", 377800221)

    internal val getOpTypePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeDerivativeFunc", "get_op_type", 3997800514)

    internal val setFunctionPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeDerivativeFunc", "set_function", 1944704156)

    internal val getFunctionPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeDerivativeFunc", "get_function", 2389093396)

    internal val setPrecisionPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeDerivativeFunc", "set_precision", 797270566)

    internal val getPrecisionPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeDerivativeFunc", "get_precision", 3822547323)
  }
}

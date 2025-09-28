// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.GodotEnum
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This node is only available in `Fragment` and `Light` visual shaders.
 */
@GodotBaseType
public open class VisualShaderNodeDerivativeFunc : VisualShaderNode() {
  /**
   * A type of operands and returned value.
   */
  public final inline var opType: OpType
    @JvmName("opTypeProperty")
    get() = getOpType()
    @JvmName("opTypeProperty")
    set(`value`) {
      setOpType(value)
    }

  /**
   * A derivative function type.
   */
  public final inline var function: Function
    @JvmName("functionProperty")
    get() = getFunction()
    @JvmName("functionProperty")
    set(`value`) {
      setFunction(value)
    }

  /**
   * Sets the level of precision to use for the derivative function. When using the Compatibility
   * renderer, this setting has no effect.
   */
  public final inline var precision: Precision
    @JvmName("precisionProperty")
    get() = getPrecision()
    @JvmName("precisionProperty")
    set(`value`) {
      setPrecision(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(760, scriptIndex)
  }

  public final fun setOpType(type: OpType): Unit {
    TransferContext.writeArguments(LONG to type.value)
    TransferContext.callMethod(ptr, MethodBindings.setOpTypePtr, NIL)
  }

  public final fun getOpType(): OpType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOpTypePtr, LONG)
    return OpType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setFunction(func: Function): Unit {
    TransferContext.writeArguments(LONG to func.value)
    TransferContext.callMethod(ptr, MethodBindings.setFunctionPtr, NIL)
  }

  public final fun getFunction(): Function {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFunctionPtr, LONG)
    return Function.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setPrecision(precision: Precision): Unit {
    TransferContext.writeArguments(LONG to precision.value)
    TransferContext.callMethod(ptr, MethodBindings.setPrecisionPtr, NIL)
  }

  public final fun getPrecision(): Precision {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPrecisionPtr, LONG)
    return Precision.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class OpType(
    `value`: Long,
  ) : GodotEnum {
    /**
     * A floating-point scalar.
     */
    SCALAR(0),
    /**
     * A 2D vector type.
     */
    VECTOR_2D(1),
    /**
     * A 3D vector type.
     */
    VECTOR_3D(2),
    /**
     * A 4D vector type.
     */
    VECTOR_4D(3),
    /**
     * Represents the size of the [OpType] enum.
     */
    MAX(4),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): OpType = entries.single { it.`value` == `value` }
    }
  }

  public enum class Function(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Sum of absolute derivative in `x` and `y`.
     */
    SUM(0),
    /**
     * Derivative in `x` using local differencing.
     */
    X(1),
    /**
     * Derivative in `y` using local differencing.
     */
    Y(2),
    /**
     * Represents the size of the [Function] enum.
     */
    MAX(3),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): Function = entries.single { it.`value` == `value` }
    }
  }

  public enum class Precision(
    `value`: Long,
  ) : GodotEnum {
    /**
     * No precision is specified, the GPU driver is allowed to use whatever level of precision it
     * chooses. This is the default option and is equivalent to using `dFdx()` or `dFdy()` in text
     * shaders.
     */
    NONE(0),
    /**
     * The derivative will be calculated using the current fragment's neighbors (which may not
     * include the current fragment). This tends to be faster than using [PRECISION_FINE], but may not
     * be suitable when more precision is needed. This is equivalent to using `dFdxCoarse()` or
     * `dFdyCoarse()` in text shaders.
     */
    COARSE(1),
    /**
     * The derivative will be calculated using the current fragment and its immediate neighbors.
     * This tends to be slower than using [PRECISION_COARSE], but may be necessary when more precision
     * is needed. This is equivalent to using `dFdxFine()` or `dFdyFine()` in text shaders.
     */
    FINE(2),
    /**
     * Represents the size of the [Precision] enum.
     */
    MAX(3),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): Precision = entries.single { it.`value` == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setOpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeDerivativeFunc", "set_op_type", 377800221)

    internal val getOpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeDerivativeFunc", "get_op_type", 3997800514)

    internal val setFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeDerivativeFunc", "set_function", 1944704156)

    internal val getFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeDerivativeFunc", "get_function", 2389093396)

    internal val setPrecisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeDerivativeFunc", "set_precision", 797270566)

    internal val getPrecisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeDerivativeFunc", "get_precision", 3822547323)
  }
}

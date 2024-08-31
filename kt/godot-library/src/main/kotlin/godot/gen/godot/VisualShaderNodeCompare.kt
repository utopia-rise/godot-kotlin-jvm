// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Compares `a` and `b` of [type] by [function]. Returns a boolean scalar. Translates to `if`
 * instruction in shader code.
 */
@GodotBaseType
public open class VisualShaderNodeCompare : VisualShaderNode() {
  /**
   * The type to be used in the comparison. See [ComparisonType] for options.
   */
  public var type: ComparisonType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getComparisonTypePtr, LONG)
      return VisualShaderNodeCompare.ComparisonType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setComparisonTypePtr, NIL)
    }

  /**
   * A comparison function. See [Function] for options.
   */
  public var function: Function
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFunctionPtr, LONG)
      return VisualShaderNodeCompare.Function.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFunctionPtr, NIL)
    }

  /**
   * Extra condition which is applied if [type] is set to [CTYPE_VECTOR_3D].
   */
  public var condition: Condition
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getConditionPtr, LONG)
      return VisualShaderNodeCompare.Condition.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setConditionPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODECOMPARE, scriptIndex)
  }

  public enum class ComparisonType(
    id: Long,
  ) {
    /**
     * A floating-point scalar.
     */
    CTYPE_SCALAR(0),
    /**
     * An integer scalar.
     */
    CTYPE_SCALAR_INT(1),
    /**
     * An unsigned integer scalar.
     */
    CTYPE_SCALAR_UINT(2),
    /**
     * A 2D vector type.
     */
    CTYPE_VECTOR_2D(3),
    /**
     * A 3D vector type.
     */
    CTYPE_VECTOR_3D(4),
    /**
     * A 4D vector type.
     */
    CTYPE_VECTOR_4D(5),
    /**
     * A boolean type.
     */
    CTYPE_BOOLEAN(6),
    /**
     * A transform (`mat4`) type.
     */
    CTYPE_TRANSFORM(7),
    /**
     * Represents the size of the [ComparisonType] enum.
     */
    CTYPE_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ComparisonType = entries.single { it.id == `value` }
    }
  }

  public enum class Function(
    id: Long,
  ) {
    /**
     * Comparison for equality (`a == b`).
     */
    FUNC_EQUAL(0),
    /**
     * Comparison for inequality (`a != b`).
     */
    FUNC_NOT_EQUAL(1),
    /**
     * Comparison for greater than (`a > b`). Cannot be used if [type] set to [CTYPE_BOOLEAN] or
     * [CTYPE_TRANSFORM].
     */
    FUNC_GREATER_THAN(2),
    /**
     * Comparison for greater than or equal (`a >= b`). Cannot be used if [type] set to
     * [CTYPE_BOOLEAN] or [CTYPE_TRANSFORM].
     */
    FUNC_GREATER_THAN_EQUAL(3),
    /**
     * Comparison for less than (`a < b`). Cannot be used if [type] set to [CTYPE_BOOLEAN] or
     * [CTYPE_TRANSFORM].
     */
    FUNC_LESS_THAN(4),
    /**
     * Comparison for less than or equal (`a <= b`). Cannot be used if [type] set to [CTYPE_BOOLEAN]
     * or [CTYPE_TRANSFORM].
     */
    FUNC_LESS_THAN_EQUAL(5),
    /**
     * Represents the size of the [Function] enum.
     */
    FUNC_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Function = entries.single { it.id == `value` }
    }
  }

  public enum class Condition(
    id: Long,
  ) {
    /**
     * The result will be true if all of component in vector satisfy the comparison condition.
     */
    COND_ALL(0),
    /**
     * The result will be true if any of component in vector satisfy the comparison condition.
     */
    COND_ANY(1),
    /**
     * Represents the size of the [Condition] enum.
     */
    COND_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Condition = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setComparisonTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCompare", "set_comparison_type")

    public val getComparisonTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCompare", "get_comparison_type")

    public val setFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCompare", "set_function")

    public val getFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCompare", "get_function")

    public val setConditionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCompare", "set_condition")

    public val getConditionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCompare", "get_condition")
  }
}

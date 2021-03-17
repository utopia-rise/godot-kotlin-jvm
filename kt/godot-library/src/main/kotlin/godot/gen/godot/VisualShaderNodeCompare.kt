// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Long
import kotlin.Suppress

/**
 * A comparison function for common types within the visual shader graph.
 *
 * Compares `a` and `b` of [type] by [function]. Returns a boolean scalar. Translates to `if` instruction in shader code.
 */
@GodotBaseType
open class VisualShaderNodeCompare : VisualShaderNode() {
  /**
   * Extra condition which is applied if [type] is set to [CTYPE_VECTOR].
   */
  open var condition: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECOMPARE_GET_CONDITION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECOMPARE_SET_CONDITION, NIL)
    }

  /**
   * A comparison function. See [enum Function] for options.
   */
  open var function: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECOMPARE_GET_FUNCTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECOMPARE_SET_FUNCTION, NIL)
    }

  /**
   * The type to be used in the comparison. See [enum ComparisonType] for options.
   */
  open var type: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECOMPARE_GET_TYPE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECOMPARE_SET_TYPE,
          NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_VISUALSHADERNODECOMPARE)
  }

  enum class ComparisonType(
    id: Long
  ) {
    /**
     * A floating-point scalar.
     */
    CTYPE_SCALAR(0),

    /**
     * A 3D vector type.
     */
    CTYPE_VECTOR(1),

    /**
     * A boolean type.
     */
    CTYPE_BOOLEAN(2),

    /**
     * A transform (`mat4`) type.
     */
    CTYPE_TRANSFORM(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Function(
    id: Long
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
     * Comparison for greater than (`a > b`). Cannot be used if [type] set to [CTYPE_BOOLEAN] or [CTYPE_TRANSFORM].
     */
    FUNC_GREATER_THAN(2),

    /**
     * Comparison for greater than or equal (`a >= b`). Cannot be used if [type] set to [CTYPE_BOOLEAN] or [CTYPE_TRANSFORM].
     */
    FUNC_GREATER_THAN_EQUAL(3),

    /**
     * Comparison for less than (`a < b`). Cannot be used if [type] set to [CTYPE_BOOLEAN] or [CTYPE_TRANSFORM].
     */
    FUNC_LESS_THAN(4),

    /**
     * Comparison for less than or equal (`a < b`). Cannot be used if [type] set to [CTYPE_BOOLEAN] or [CTYPE_TRANSFORM].
     */
    FUNC_LESS_THAN_EQUAL(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Condition(
    id: Long
  ) {
    /**
     * The result will be true if all of component in vector satisfy the comparison condition.
     */
    COND_ALL(0),

    /**
     * The result will be true if any of component in vector satisfy the comparison condition.
     */
    COND_ANY(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * The result will be true if all of component in vector satisfy the comparison condition.
     */
    final const val COND_ALL: Long = 0

    /**
     * The result will be true if any of component in vector satisfy the comparison condition.
     */
    final const val COND_ANY: Long = 1

    /**
     * A boolean type.
     */
    final const val CTYPE_BOOLEAN: Long = 2

    /**
     * A floating-point scalar.
     */
    final const val CTYPE_SCALAR: Long = 0

    /**
     * A transform (`mat4`) type.
     */
    final const val CTYPE_TRANSFORM: Long = 3

    /**
     * A 3D vector type.
     */
    final const val CTYPE_VECTOR: Long = 1

    /**
     * Comparison for equality (`a == b`).
     */
    final const val FUNC_EQUAL: Long = 0

    /**
     * Comparison for greater than (`a > b`). Cannot be used if [type] set to [CTYPE_BOOLEAN] or [CTYPE_TRANSFORM].
     */
    final const val FUNC_GREATER_THAN: Long = 2

    /**
     * Comparison for greater than or equal (`a >= b`). Cannot be used if [type] set to [CTYPE_BOOLEAN] or [CTYPE_TRANSFORM].
     */
    final const val FUNC_GREATER_THAN_EQUAL: Long = 3

    /**
     * Comparison for less than (`a < b`). Cannot be used if [type] set to [CTYPE_BOOLEAN] or [CTYPE_TRANSFORM].
     */
    final const val FUNC_LESS_THAN: Long = 4

    /**
     * Comparison for less than or equal (`a < b`). Cannot be used if [type] set to [CTYPE_BOOLEAN] or [CTYPE_TRANSFORM].
     */
    final const val FUNC_LESS_THAN_EQUAL: Long = 5

    /**
     * Comparison for inequality (`a != b`).
     */
    final const val FUNC_NOT_EQUAL: Long = 1
  }
}

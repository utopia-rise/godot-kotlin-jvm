// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class VariantOperator(
  id: Long
) {
  OP_EQUAL(0),
  OP_NOT_EQUAL(1),
  OP_LESS(2),
  OP_LESS_EQUAL(3),
  OP_GREATER(4),
  OP_GREATER_EQUAL(5),
  OP_ADD(6),
  OP_SUBTRACT(7),
  OP_MULTIPLY(8),
  OP_DIVIDE(9),
  OP_NEGATE(10),
  OP_POSITIVE(11),
  OP_MODULE(12),
  OP_SHIFT_LEFT(13),
  OP_SHIFT_RIGHT(14),
  OP_BIT_AND(15),
  OP_BIT_OR(16),
  OP_BIT_XOR(17),
  OP_BIT_NEGATE(18),
  OP_AND(19),
  OP_OR(20),
  OP_XOR(21),
  OP_NOT(22),
  OP_IN(23),
  OP_MAX(24),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = values().single { it.id == `value` }
  }
}

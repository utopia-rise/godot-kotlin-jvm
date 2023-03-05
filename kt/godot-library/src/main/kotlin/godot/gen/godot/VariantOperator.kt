// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class VariantOperator(
  id: Long,
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
  OP_POWER(13),
  OP_SHIFT_LEFT(14),
  OP_SHIFT_RIGHT(15),
  OP_BIT_AND(16),
  OP_BIT_OR(17),
  OP_BIT_XOR(18),
  OP_BIT_NEGATE(19),
  OP_AND(20),
  OP_OR(21),
  OP_XOR(22),
  OP_NOT(23),
  OP_IN(24),
  OP_MAX(25),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = values().single { it.id == `value` }
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot.core

import kotlin.Long

public enum class EulerOrder(
  id: Long,
) {
  /**
   * Specifies that Euler angles should be in XYZ order. When composing, the order is X, Y, Z. When
   * decomposing, the order is reversed, first Z, then Y, and X last.
   */
  EULER_ORDER_XYZ(0),
  /**
   * Specifies that Euler angles should be in XZY order. When composing, the order is X, Z, Y. When
   * decomposing, the order is reversed, first Y, then Z, and X last.
   */
  EULER_ORDER_XZY(1),
  /**
   * Specifies that Euler angles should be in YXZ order. When composing, the order is Y, X, Z. When
   * decomposing, the order is reversed, first Z, then X, and Y last.
   */
  EULER_ORDER_YXZ(2),
  /**
   * Specifies that Euler angles should be in YZX order. When composing, the order is Y, Z, X. When
   * decomposing, the order is reversed, first X, then Z, and Y last.
   */
  EULER_ORDER_YZX(3),
  /**
   * Specifies that Euler angles should be in ZXY order. When composing, the order is Z, X, Y. When
   * decomposing, the order is reversed, first Y, then X, and Z last.
   */
  EULER_ORDER_ZXY(4),
  /**
   * Specifies that Euler angles should be in ZYX order. When composing, the order is Z, Y, X. When
   * decomposing, the order is reversed, first X, then Y, and Z last.
   */
  EULER_ORDER_ZYX(5),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long): EulerOrder = entries.single { it.id == `value` }
  }
}

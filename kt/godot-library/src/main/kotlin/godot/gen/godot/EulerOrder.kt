// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class EulerOrder(
  id: Long
) {
  EULER_ORDER_XYZ(0),
  EULER_ORDER_XZY(1),
  EULER_ORDER_YXZ(2),
  EULER_ORDER_YZX(3),
  EULER_ORDER_ZXY(4),
  EULER_ORDER_ZYX(5),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = values().single { it.id == `value` }
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class Side(
  id: Long,
) {
  SIDE_LEFT(0),
  SIDE_TOP(1),
  SIDE_RIGHT(2),
  SIDE_BOTTOM(3),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = values().single { it.id == `value` }
  }
}

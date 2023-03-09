// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class Corner(
  id: Long,
) {
  CORNER_TOP_LEFT(0),
  CORNER_TOP_RIGHT(1),
  CORNER_BOTTOM_RIGHT(2),
  CORNER_BOTTOM_LEFT(3),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = values().single { it.id == `value` }
  }
}

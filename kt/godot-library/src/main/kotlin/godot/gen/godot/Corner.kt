// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class Corner(
  id: Long,
) {
  /**
   * Top-left corner.
   */
  CORNER_TOP_LEFT(0),
  /**
   * Top-right corner.
   */
  CORNER_TOP_RIGHT(1),
  /**
   * Bottom-right corner.
   */
  CORNER_BOTTOM_RIGHT(2),
  /**
   * Bottom-left corner.
   */
  CORNER_BOTTOM_LEFT(3),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = entries.single { it.id == `value` }
  }
}

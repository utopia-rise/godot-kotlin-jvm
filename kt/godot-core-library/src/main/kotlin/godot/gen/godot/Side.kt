// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class Side(
  id: Long,
) {
  /**
   * Left side, usually used for [Control] or [StyleBox]-derived classes.
   */
  SIDE_LEFT(0),
  /**
   * Top side, usually used for [Control] or [StyleBox]-derived classes.
   */
  SIDE_TOP(1),
  /**
   * Right side, usually used for [Control] or [StyleBox]-derived classes.
   */
  SIDE_RIGHT(2),
  /**
   * Bottom side, usually used for [Control] or [StyleBox]-derived classes.
   */
  SIDE_BOTTOM(3),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long): Side = entries.single { it.id == `value` }
  }
}

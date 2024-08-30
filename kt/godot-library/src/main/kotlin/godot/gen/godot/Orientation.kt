// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class Orientation(
  id: Long,
) {
  /**
   * General vertical alignment, usually used for [Separator], [ScrollBar], [Slider], etc.
   */
  VERTICAL(1),
  /**
   * General horizontal alignment, usually used for [Separator], [ScrollBar], [Slider], etc.
   */
  HORIZONTAL(0),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long): Orientation = entries.single { it.id == `value` }
  }
}

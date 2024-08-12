// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class VerticalAlignment(
  id: Long,
) {
  /**
   * Vertical top alignment, usually for text-derived classes.
   */
  VERTICAL_ALIGNMENT_TOP(0),
  /**
   * Vertical center alignment, usually for text-derived classes.
   */
  VERTICAL_ALIGNMENT_CENTER(1),
  /**
   * Vertical bottom alignment, usually for text-derived classes.
   */
  VERTICAL_ALIGNMENT_BOTTOM(2),
  /**
   * Expand rows to fit height, usually for text-derived classes.
   */
  VERTICAL_ALIGNMENT_FILL(3),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = entries.single { it.id == `value` }
  }
}

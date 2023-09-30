// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class HorizontalAlignment(
  id: Long,
) {
  HORIZONTAL_ALIGNMENT_LEFT(0),
  HORIZONTAL_ALIGNMENT_CENTER(1),
  HORIZONTAL_ALIGNMENT_RIGHT(2),
  HORIZONTAL_ALIGNMENT_FILL(3),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = entries.single { it.id == `value` }
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class VerticalAlignment(
  id: Long
) {
  VERTICAL_ALIGNMENT_TOP(0),
  VERTICAL_ALIGNMENT_CENTER(1),
  VERTICAL_ALIGNMENT_BOTTOM(2),
  VERTICAL_ALIGNMENT_FILL(3),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = values().single { it.id == `value` }
  }
}

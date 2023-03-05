// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class InlineAlignment(
  id: Long,
) {
  INLINE_ALIGNMENT_TOP_TO(0),
  INLINE_ALIGNMENT_CENTER_TO(1),
  INLINE_ALIGNMENT_BASELINE_TO(3),
  INLINE_ALIGNMENT_BOTTOM_TO(2),
  INLINE_ALIGNMENT_TO_TOP(0),
  INLINE_ALIGNMENT_TO_CENTER(4),
  INLINE_ALIGNMENT_TO_BASELINE(8),
  INLINE_ALIGNMENT_TO_BOTTOM(12),
  INLINE_ALIGNMENT_TOP(0),
  INLINE_ALIGNMENT_CENTER(5),
  INLINE_ALIGNMENT_BOTTOM(14),
  INLINE_ALIGNMENT_IMAGE_MASK(3),
  INLINE_ALIGNMENT_TEXT_MASK(12),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = values().single { it.id == `value` }
  }
}

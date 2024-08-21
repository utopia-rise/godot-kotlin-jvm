// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class InlineAlignment(
  id: Long,
) {
  /**
   * Aligns the top of the inline object (e.g. image, table) to the position of the text specified
   * by `INLINE_ALIGNMENT_TO_*` constant.
   */
  INLINE_ALIGNMENT_TOP_TO(0),
  /**
   * Aligns the center of the inline object (e.g. image, table) to the position of the text
   * specified by `INLINE_ALIGNMENT_TO_*` constant.
   */
  INLINE_ALIGNMENT_CENTER_TO(1),
  /**
   * Aligns the baseline (user defined) of the inline object (e.g. image, table) to the position of
   * the text specified by `INLINE_ALIGNMENT_TO_*` constant.
   */
  INLINE_ALIGNMENT_BASELINE_TO(3),
  /**
   * Aligns the bottom of the inline object (e.g. image, table) to the position of the text
   * specified by `INLINE_ALIGNMENT_TO_*` constant.
   */
  INLINE_ALIGNMENT_BOTTOM_TO(2),
  /**
   * Aligns the position of the inline object (e.g. image, table) specified by
   * `INLINE_ALIGNMENT_*_TO` constant to the top of the text.
   */
  INLINE_ALIGNMENT_TO_TOP(0),
  /**
   * Aligns the position of the inline object (e.g. image, table) specified by
   * `INLINE_ALIGNMENT_*_TO` constant to the center of the text.
   */
  INLINE_ALIGNMENT_TO_CENTER(4),
  /**
   * Aligns the position of the inline object (e.g. image, table) specified by
   * `INLINE_ALIGNMENT_*_TO` constant to the baseline of the text.
   */
  INLINE_ALIGNMENT_TO_BASELINE(8),
  /**
   * Aligns inline object (e.g. image, table) to the bottom of the text.
   */
  INLINE_ALIGNMENT_TO_BOTTOM(12),
  /**
   * Aligns top of the inline object (e.g. image, table) to the top of the text. Equivalent to
   * `INLINE_ALIGNMENT_TOP_TO | INLINE_ALIGNMENT_TO_TOP`.
   */
  INLINE_ALIGNMENT_TOP(0),
  /**
   * Aligns center of the inline object (e.g. image, table) to the center of the text. Equivalent to
   * `INLINE_ALIGNMENT_CENTER_TO | INLINE_ALIGNMENT_TO_CENTER`.
   */
  INLINE_ALIGNMENT_CENTER(5),
  /**
   * Aligns bottom of the inline object (e.g. image, table) to the bottom of the text. Equivalent to
   * `INLINE_ALIGNMENT_BOTTOM_TO | INLINE_ALIGNMENT_TO_BOTTOM`.
   */
  INLINE_ALIGNMENT_BOTTOM(14),
  /**
   * A bit mask for `INLINE_ALIGNMENT_*_TO` alignment constants.
   */
  INLINE_ALIGNMENT_IMAGE_MASK(3),
  /**
   * A bit mask for `INLINE_ALIGNMENT_TO_*` alignment constants.
   */
  INLINE_ALIGNMENT_TEXT_MASK(12),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long): InlineAlignment = entries.single { it.id == `value` }
  }
}

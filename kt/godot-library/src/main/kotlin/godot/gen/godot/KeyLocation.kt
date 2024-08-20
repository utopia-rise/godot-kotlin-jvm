// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class KeyLocation(
  id: Long,
) {
  /**
   * Used for keys which only appear once, or when a comparison doesn't need to differentiate the
   * `LEFT` and `RIGHT` versions.
   * For example, when using [InputEvent.isMatch], an event which has [KEY_LOCATION_UNSPECIFIED]
   * will match any [KeyLocation] on the passed event.
   */
  KEY_LOCATION_UNSPECIFIED(0),
  /**
   * A key which is to the left of its twin.
   */
  KEY_LOCATION_LEFT(1),
  /**
   * A key which is to the right of its twin.
   */
  KEY_LOCATION_RIGHT(2),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = entries.single { it.id == `value` }
  }
}

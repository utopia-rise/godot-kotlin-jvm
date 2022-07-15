// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class TransferMode(
  id: Long
) {
  TRANSFER_MODE_UNRELIABLE(0),
  TRANSFER_MODE_UNRELIABLE_ORDERED(1),
  TRANSFER_MODE_RELIABLE(2),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = values().single { it.id == `value` }
  }
}

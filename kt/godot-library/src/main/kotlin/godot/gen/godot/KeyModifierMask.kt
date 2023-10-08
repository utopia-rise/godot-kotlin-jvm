// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class KeyModifierMask(
  id: Long,
) {
  KEY_CODE_MASK(8388607),
  KEY_MODIFIER_MASK(532676608),
  KEY_MASK_CMD_OR_CTRL(16777216),
  KEY_MASK_SHIFT(33554432),
  KEY_MASK_ALT(67108864),
  KEY_MASK_META(134217728),
  KEY_MASK_CTRL(268435456),
  KEY_MASK_KPAD(536870912),
  KEY_MASK_GROUP_SWITCH(1073741824),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = entries.single { it.id == `value` }
  }
}

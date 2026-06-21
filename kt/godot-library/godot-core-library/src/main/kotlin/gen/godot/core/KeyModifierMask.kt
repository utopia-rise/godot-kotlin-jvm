// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.core

import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmField

public infix fun Long.or(other: KeyModifierMask): Long = this.or(other.flag)

public infix fun Long.xor(other: KeyModifierMask): Long = this.xor(other.flag)

public infix fun Long.and(other: KeyModifierMask): Long = this.and(other.flag)

public class KeyModifierMask(
  flag: Long,
) : BitFieldBase<KeyModifierMask>(flag) {
  protected override fun wrap(flag: Long): KeyModifierMask = KeyModifierMask(flag)

  public companion object {
    /**
     * Bit mask with all bits enabled except for modifier keys. Apply it to remove modifiers.
     *
     * ```
     * var keycode = KEY_A | KEY_MASK_SHIFT
     * keycode = keycode & KEY_CODE_MASK
     * print(keycode) # KEY_A
     * ```
     */
    @JvmField
    public val CODE: KeyModifierMask = KeyModifierMask(8388607)

    /**
     * Bit mask with all modifier bits enabled. Apply it to isolate modifiers.
     *
     * ```
     * var keycode = KEY_A | KEY_MASK_SHIFT
     * keycode = keycode & KEY_MODIFIER_MASK
     * print(keycode) # KEY_MASK_SHIFT
     * ```
     */
    @JvmField
    public val KEY_MODIFIER_MASK: KeyModifierMask = KeyModifierMask(2130706432)

    /**
     * Automatically remapped to [KEY_META] on macOS and [KEY_CTRL] on other platforms, this mask is
     * never set in the actual events, and should be used for key mapping only.
     */
    @JvmField
    public val MASK_CMD_OR_CTRL: KeyModifierMask = KeyModifierMask(16777216)

    /**
     * Shift key mask.
     */
    @JvmField
    public val MASK_SHIFT: KeyModifierMask = KeyModifierMask(33554432)

    /**
     * Alt or Option (on macOS) key mask.
     */
    @JvmField
    public val MASK_ALT: KeyModifierMask = KeyModifierMask(67108864)

    /**
     * Command (on macOS) or Meta/Windows key mask.
     */
    @JvmField
    public val MASK_META: KeyModifierMask = KeyModifierMask(134217728)

    /**
     * Control key mask.
     */
    @JvmField
    public val MASK_CTRL: KeyModifierMask = KeyModifierMask(268435456)

    /**
     * Keypad key mask.
     */
    @JvmField
    public val MASK_KPAD: KeyModifierMask = KeyModifierMask(536870912)

    /**
     * Group Switch key mask.
     */
    @JvmField
    public val MASK_GROUP_SWITCH: KeyModifierMask = KeyModifierMask(1073741824)
  }
}

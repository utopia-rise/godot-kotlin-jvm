// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.core

import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmField

public infix fun Long.or(other: KeyModifierMask): Long = this.or(other.flag)

public infix fun Long.xor(other: KeyModifierMask): Long = this.xor(other.flag)

public infix fun Long.and(other: KeyModifierMask): Long = this.and(other.flag)

public class KeyModifierMask(
  public val flag: Long,
) {
  public infix fun or(other: KeyModifierMask): KeyModifierMask = KeyModifierMask(flag.or(other.flag))

  public infix fun or(other: Long): KeyModifierMask = KeyModifierMask(flag.or(other))

  public infix fun xor(other: KeyModifierMask): KeyModifierMask = KeyModifierMask(flag.xor(other.flag))

  public infix fun xor(other: Long): KeyModifierMask = KeyModifierMask(flag.xor(other))

  public infix fun and(other: KeyModifierMask): KeyModifierMask = KeyModifierMask(flag.and(other.flag))

  public infix fun and(other: Long): KeyModifierMask = KeyModifierMask(flag.and(other))

  public fun unaryPlus(): KeyModifierMask = KeyModifierMask(flag.unaryPlus())

  public fun unaryMinus(): KeyModifierMask = KeyModifierMask(flag.unaryMinus())

  public fun inv(): KeyModifierMask = KeyModifierMask(flag.inv())

  public infix fun shl(bits: Int): KeyModifierMask = KeyModifierMask(flag shl bits)

  public infix fun shr(bits: Int): KeyModifierMask = KeyModifierMask(flag shr bits)

  public infix fun ushr(bits: Int): KeyModifierMask = KeyModifierMask(flag ushr bits)

  public companion object {
    /**
     * Key Code mask.
     */
    @JvmField
    public val CODE: KeyModifierMask = KeyModifierMask(8_388_607)

    /**
     * Modifier key mask.
     */
    @JvmField
    public val KEY_MODIFIER_MASK: KeyModifierMask = KeyModifierMask(2_130_706_432)

    /**
     * Automatically remapped to [KEY_META] on macOS and [KEY_CTRL] on other platforms, this mask is never set in the actual events, and should be used for key mapping only.
     */
    @JvmField
    public val MASK_CMD_OR_CTRL: KeyModifierMask = KeyModifierMask(16_777_216)

    /**
     * Shift key mask.
     */
    @JvmField
    public val MASK_SHIFT: KeyModifierMask = KeyModifierMask(33_554_432)

    /**
     * Alt or Option (on macOS) key mask.
     */
    @JvmField
    public val MASK_ALT: KeyModifierMask = KeyModifierMask(67_108_864)

    /**
     * Command (on macOS) or Meta/Windows key mask.
     */
    @JvmField
    public val MASK_META: KeyModifierMask = KeyModifierMask(134_217_728)

    /**
     * Control key mask.
     */
    @JvmField
    public val MASK_CTRL: KeyModifierMask = KeyModifierMask(268_435_456)

    /**
     * Keypad key mask.
     */
    @JvmField
    public val MASK_KPAD: KeyModifierMask = KeyModifierMask(536_870_912)

    /**
     * Group Switch key mask.
     */
    @JvmField
    public val MASK_GROUP_SWITCH: KeyModifierMask = KeyModifierMask(1_073_741_824)
  }
}

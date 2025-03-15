// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.core

import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmInline

public infix fun Long.or(other: KeyModifierMask): Long = this.or(other.flag)

public infix fun Long.xor(other: KeyModifierMask): Long = this.xor(other.flag)

public infix fun Long.and(other: KeyModifierMask): Long = this.and(other.flag)

@JvmInline
public value class KeyModifierMask(
  public val flag: Long,
) {
  public infix fun or(other: KeyModifierMask): KeyModifierMask =
      KeyModifierMask(flag.or(other.flag))

  public infix fun or(other: Long): KeyModifierMask = KeyModifierMask(flag.or(other))

  public infix fun xor(other: KeyModifierMask): KeyModifierMask =
      KeyModifierMask(flag.xor(other.flag))

  public infix fun xor(other: Long): KeyModifierMask = KeyModifierMask(flag.xor(other))

  public infix fun and(other: KeyModifierMask): KeyModifierMask =
      KeyModifierMask(flag.and(other.flag))

  public infix fun and(other: Long): KeyModifierMask = KeyModifierMask(flag.and(other))

  public fun unaryPlus(): KeyModifierMask = KeyModifierMask(flag.unaryPlus())

  public fun unaryMinus(): KeyModifierMask = KeyModifierMask(flag.unaryMinus())

  public fun inv(): KeyModifierMask = KeyModifierMask(flag.inv())

  public infix fun shl(bits: Int): KeyModifierMask = KeyModifierMask(flag shl bits)

  public infix fun shr(bits: Int): KeyModifierMask = KeyModifierMask(flag shr bits)

  public infix fun ushr(bits: Int): KeyModifierMask = KeyModifierMask(flag ushr bits)

  public companion object {
    public val CODE: KeyModifierMask = KeyModifierMask(8388607)

    public val KEY_MODIFIER_MASK: KeyModifierMask = KeyModifierMask(2130706432)

    public val MASK_CMD_OR_CTRL: KeyModifierMask = KeyModifierMask(16777216)

    public val MASK_SHIFT: KeyModifierMask = KeyModifierMask(33554432)

    public val MASK_ALT: KeyModifierMask = KeyModifierMask(67108864)

    public val MASK_META: KeyModifierMask = KeyModifierMask(134217728)

    public val MASK_CTRL: KeyModifierMask = KeyModifierMask(268435456)

    public val MASK_KPAD: KeyModifierMask = KeyModifierMask(536870912)

    public val MASK_GROUP_SWITCH: KeyModifierMask = KeyModifierMask(1073741824)
  }
}

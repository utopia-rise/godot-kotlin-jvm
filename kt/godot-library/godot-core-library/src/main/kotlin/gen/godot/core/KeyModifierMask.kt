// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot.core

import kotlin.Int
import kotlin.Long
import kotlin.jvm.JvmInline

public sealed interface KeyModifierMask {
  public val flag: Long

  public infix fun or(other: KeyModifierMask): KeyModifierMask =
      KeyModifierMaskValue(flag.or(other.flag))

  public infix fun or(other: Long): KeyModifierMask = KeyModifierMaskValue(flag.or(other))

  public infix fun xor(other: KeyModifierMask): KeyModifierMask =
      KeyModifierMaskValue(flag.xor(other.flag))

  public infix fun xor(other: Long): KeyModifierMask = KeyModifierMaskValue(flag.xor(other))

  public infix fun and(other: KeyModifierMask): KeyModifierMask =
      KeyModifierMaskValue(flag.and(other.flag))

  public infix fun and(other: Long): KeyModifierMask = KeyModifierMaskValue(flag.and(other))

  public operator fun plus(other: KeyModifierMask): KeyModifierMask =
      KeyModifierMaskValue(flag.plus(other.flag))

  public operator fun plus(other: Long): KeyModifierMask = KeyModifierMaskValue(flag.plus(other))

  public operator fun minus(other: KeyModifierMask): KeyModifierMask =
      KeyModifierMaskValue(flag.minus(other.flag))

  public operator fun minus(other: Long): KeyModifierMask = KeyModifierMaskValue(flag.minus(other))

  public operator fun times(other: KeyModifierMask): KeyModifierMask =
      KeyModifierMaskValue(flag.times(other.flag))

  public operator fun times(other: Long): KeyModifierMask = KeyModifierMaskValue(flag.times(other))

  public operator fun div(other: KeyModifierMask): KeyModifierMask =
      KeyModifierMaskValue(flag.div(other.flag))

  public operator fun div(other: Long): KeyModifierMask = KeyModifierMaskValue(flag.div(other))

  public operator fun rem(other: KeyModifierMask): KeyModifierMask =
      KeyModifierMaskValue(flag.rem(other.flag))

  public operator fun rem(other: Long): KeyModifierMask = KeyModifierMaskValue(flag.rem(other))

  public fun unaryPlus(): KeyModifierMask = KeyModifierMaskValue(flag.unaryPlus())

  public fun unaryMinus(): KeyModifierMask = KeyModifierMaskValue(flag.unaryMinus())

  public fun inv(): KeyModifierMask = KeyModifierMaskValue(flag.inv())

  public infix fun shl(bits: Int): KeyModifierMask = KeyModifierMaskValue(flag shl bits)

  public infix fun shr(bits: Int): KeyModifierMask = KeyModifierMaskValue(flag shr bits)

  public infix fun ushr(bits: Int): KeyModifierMask = KeyModifierMaskValue(flag ushr bits)

  public companion object {
    public val KEY_CODE_MASK: KeyModifierMask = KeyModifierMaskValue(8388607)

    public val KEY_MODIFIER_MASK: KeyModifierMask = KeyModifierMaskValue(532676608)

    public val KEY_MASK_CMD_OR_CTRL: KeyModifierMask = KeyModifierMaskValue(16777216)

    public val KEY_MASK_SHIFT: KeyModifierMask = KeyModifierMaskValue(33554432)

    public val KEY_MASK_ALT: KeyModifierMask = KeyModifierMaskValue(67108864)

    public val KEY_MASK_META: KeyModifierMask = KeyModifierMaskValue(134217728)

    public val KEY_MASK_CTRL: KeyModifierMask = KeyModifierMaskValue(268435456)

    public val KEY_MASK_KPAD: KeyModifierMask = KeyModifierMaskValue(536870912)

    public val KEY_MASK_GROUP_SWITCH: KeyModifierMask = KeyModifierMaskValue(1073741824)
  }
}

@JvmInline
public value class KeyModifierMaskValue(
  public override val flag: Long,
) : KeyModifierMask

public infix fun Long.or(other: KeyModifierMask): Long = this.or(other.flag)

public infix fun Long.xor(other: KeyModifierMask): Long = this.xor(other.flag)

public infix fun Long.and(other: KeyModifierMask): Long = this.and(other.flag)

public operator fun Long.plus(other: KeyModifierMask): Long = this.plus(other.flag)

public operator fun Long.minus(other: KeyModifierMask): Long = this.minus(other.flag)

public operator fun Long.times(other: KeyModifierMask): Long = this.times(other.flag)

public operator fun Long.div(other: KeyModifierMask): Long = this.div(other.flag)

public operator fun Long.rem(other: KeyModifierMask): Long = this.rem(other.flag)

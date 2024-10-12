// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Int
import kotlin.Long
import kotlin.jvm.JvmInline

public sealed interface MouseButtonMask {
  public val flag: Long

  public infix fun or(other: MouseButtonMask): MouseButtonMask =
      MouseButtonMaskValue(flag.or(other.flag))

  public infix fun or(other: Long): MouseButtonMask = MouseButtonMaskValue(flag.or(other))

  public infix fun xor(other: MouseButtonMask): MouseButtonMask =
      MouseButtonMaskValue(flag.xor(other.flag))

  public infix fun xor(other: Long): MouseButtonMask = MouseButtonMaskValue(flag.xor(other))

  public infix fun and(other: MouseButtonMask): MouseButtonMask =
      MouseButtonMaskValue(flag.and(other.flag))

  public infix fun and(other: Long): MouseButtonMask = MouseButtonMaskValue(flag.and(other))

  public operator fun plus(other: MouseButtonMask): MouseButtonMask =
      MouseButtonMaskValue(flag.plus(other.flag))

  public operator fun plus(other: Long): MouseButtonMask = MouseButtonMaskValue(flag.plus(other))

  public operator fun minus(other: MouseButtonMask): MouseButtonMask =
      MouseButtonMaskValue(flag.minus(other.flag))

  public operator fun minus(other: Long): MouseButtonMask = MouseButtonMaskValue(flag.minus(other))

  public operator fun times(other: MouseButtonMask): MouseButtonMask =
      MouseButtonMaskValue(flag.times(other.flag))

  public operator fun times(other: Long): MouseButtonMask = MouseButtonMaskValue(flag.times(other))

  public operator fun div(other: MouseButtonMask): MouseButtonMask =
      MouseButtonMaskValue(flag.div(other.flag))

  public operator fun div(other: Long): MouseButtonMask = MouseButtonMaskValue(flag.div(other))

  public operator fun rem(other: MouseButtonMask): MouseButtonMask =
      MouseButtonMaskValue(flag.rem(other.flag))

  public operator fun rem(other: Long): MouseButtonMask = MouseButtonMaskValue(flag.rem(other))

  public fun unaryPlus(): MouseButtonMask = MouseButtonMaskValue(flag.unaryPlus())

  public fun unaryMinus(): MouseButtonMask = MouseButtonMaskValue(flag.unaryMinus())

  public fun inv(): MouseButtonMask = MouseButtonMaskValue(flag.inv())

  public infix fun shl(bits: Int): MouseButtonMask = MouseButtonMaskValue(flag shl bits)

  public infix fun shr(bits: Int): MouseButtonMask = MouseButtonMaskValue(flag shr bits)

  public infix fun ushr(bits: Int): MouseButtonMask = MouseButtonMaskValue(flag ushr bits)

  public companion object {
    public val MOUSE_BUTTON_MASK_LEFT: MouseButtonMask = MouseButtonMaskValue(1)

    public val MOUSE_BUTTON_MASK_RIGHT: MouseButtonMask = MouseButtonMaskValue(2)

    public val MOUSE_BUTTON_MASK_MIDDLE: MouseButtonMask = MouseButtonMaskValue(4)

    public val MOUSE_BUTTON_MASK_MB_XBUTTON1: MouseButtonMask = MouseButtonMaskValue(128)

    public val MOUSE_BUTTON_MASK_MB_XBUTTON2: MouseButtonMask = MouseButtonMaskValue(256)
  }
}

@JvmInline
public value class MouseButtonMaskValue(
  public override val flag: Long,
) : MouseButtonMask

public infix fun Long.or(other: MouseButtonMask): Long = this.or(other.flag)

public infix fun Long.xor(other: MouseButtonMask): Long = this.xor(other.flag)

public infix fun Long.and(other: MouseButtonMask): Long = this.and(other.flag)

public operator fun Long.plus(other: MouseButtonMask): Long = this.plus(other.flag)

public operator fun Long.minus(other: MouseButtonMask): Long = this.minus(other.flag)

public operator fun Long.times(other: MouseButtonMask): Long = this.times(other.flag)

public operator fun Long.div(other: MouseButtonMask): Long = this.div(other.flag)

public operator fun Long.rem(other: MouseButtonMask): Long = this.rem(other.flag)

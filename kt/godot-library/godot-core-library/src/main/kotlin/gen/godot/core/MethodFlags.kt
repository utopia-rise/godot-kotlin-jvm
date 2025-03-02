// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot.core

import kotlin.Int
import kotlin.Long
import kotlin.jvm.JvmInline

public sealed interface MethodFlags {
  public val flag: Long

  public infix fun or(other: MethodFlags): MethodFlags = MethodFlagsValue(flag.or(other.flag))

  public infix fun or(other: Long): MethodFlags = MethodFlagsValue(flag.or(other))

  public infix fun xor(other: MethodFlags): MethodFlags = MethodFlagsValue(flag.xor(other.flag))

  public infix fun xor(other: Long): MethodFlags = MethodFlagsValue(flag.xor(other))

  public infix fun and(other: MethodFlags): MethodFlags = MethodFlagsValue(flag.and(other.flag))

  public infix fun and(other: Long): MethodFlags = MethodFlagsValue(flag.and(other))

  public operator fun plus(other: MethodFlags): MethodFlags =
      MethodFlagsValue(flag.plus(other.flag))

  public operator fun plus(other: Long): MethodFlags = MethodFlagsValue(flag.plus(other))

  public operator fun minus(other: MethodFlags): MethodFlags =
      MethodFlagsValue(flag.minus(other.flag))

  public operator fun minus(other: Long): MethodFlags = MethodFlagsValue(flag.minus(other))

  public operator fun times(other: MethodFlags): MethodFlags =
      MethodFlagsValue(flag.times(other.flag))

  public operator fun times(other: Long): MethodFlags = MethodFlagsValue(flag.times(other))

  public operator fun div(other: MethodFlags): MethodFlags = MethodFlagsValue(flag.div(other.flag))

  public operator fun div(other: Long): MethodFlags = MethodFlagsValue(flag.div(other))

  public operator fun rem(other: MethodFlags): MethodFlags = MethodFlagsValue(flag.rem(other.flag))

  public operator fun rem(other: Long): MethodFlags = MethodFlagsValue(flag.rem(other))

  public fun unaryPlus(): MethodFlags = MethodFlagsValue(flag.unaryPlus())

  public fun unaryMinus(): MethodFlags = MethodFlagsValue(flag.unaryMinus())

  public fun inv(): MethodFlags = MethodFlagsValue(flag.inv())

  public infix fun shl(bits: Int): MethodFlags = MethodFlagsValue(flag shl bits)

  public infix fun shr(bits: Int): MethodFlags = MethodFlagsValue(flag shr bits)

  public infix fun ushr(bits: Int): MethodFlags = MethodFlagsValue(flag ushr bits)

  public companion object {
    public val METHOD_FLAG_NORMAL: MethodFlags = MethodFlagsValue(1)

    public val METHOD_FLAG_EDITOR: MethodFlags = MethodFlagsValue(2)

    public val METHOD_FLAG_CONST: MethodFlags = MethodFlagsValue(4)

    public val METHOD_FLAG_VIRTUAL: MethodFlags = MethodFlagsValue(8)

    public val METHOD_FLAG_VARARG: MethodFlags = MethodFlagsValue(16)

    public val METHOD_FLAG_STATIC: MethodFlags = MethodFlagsValue(32)

    public val METHOD_FLAG_OBJECT_CORE: MethodFlags = MethodFlagsValue(64)

    public val METHOD_FLAG_VIRTUAL_REQUIRED: MethodFlags = MethodFlagsValue(128)

    public val METHOD_FLAGS_DEFAULT: MethodFlags = MethodFlagsValue(1)
  }
}

@JvmInline
public value class MethodFlagsValue(
  public override val flag: Long,
) : MethodFlags

public infix fun Long.or(other: MethodFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: MethodFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: MethodFlags): Long = this.and(other.flag)

public operator fun Long.plus(other: MethodFlags): Long = this.plus(other.flag)

public operator fun Long.minus(other: MethodFlags): Long = this.minus(other.flag)

public operator fun Long.times(other: MethodFlags): Long = this.times(other.flag)

public operator fun Long.div(other: MethodFlags): Long = this.div(other.flag)

public operator fun Long.rem(other: MethodFlags): Long = this.rem(other.flag)

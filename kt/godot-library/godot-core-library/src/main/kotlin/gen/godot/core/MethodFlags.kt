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

public infix fun Long.or(other: MethodFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: MethodFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: MethodFlags): Long = this.and(other.flag)

@JvmInline
public value class MethodFlags(
  public val flag: Long,
) {
  public infix fun or(other: MethodFlags): MethodFlags = MethodFlags(flag.or(other.flag))

  public infix fun or(other: Long): MethodFlags = MethodFlags(flag.or(other))

  public infix fun xor(other: MethodFlags): MethodFlags = MethodFlags(flag.xor(other.flag))

  public infix fun xor(other: Long): MethodFlags = MethodFlags(flag.xor(other))

  public infix fun and(other: MethodFlags): MethodFlags = MethodFlags(flag.and(other.flag))

  public infix fun and(other: Long): MethodFlags = MethodFlags(flag.and(other))

  public fun unaryPlus(): MethodFlags = MethodFlags(flag.unaryPlus())

  public fun unaryMinus(): MethodFlags = MethodFlags(flag.unaryMinus())

  public fun inv(): MethodFlags = MethodFlags(flag.inv())

  public infix fun shl(bits: Int): MethodFlags = MethodFlags(flag shl bits)

  public infix fun shr(bits: Int): MethodFlags = MethodFlags(flag shr bits)

  public infix fun ushr(bits: Int): MethodFlags = MethodFlags(flag ushr bits)

  public companion object {
    public val METHOD_FLAG_NORMAL: MethodFlags = MethodFlags(1)

    public val METHOD_FLAG_EDITOR: MethodFlags = MethodFlags(2)

    public val METHOD_FLAG_CONST: MethodFlags = MethodFlags(4)

    public val METHOD_FLAG_VIRTUAL: MethodFlags = MethodFlags(8)

    public val METHOD_FLAG_VARARG: MethodFlags = MethodFlags(16)

    public val METHOD_FLAG_STATIC: MethodFlags = MethodFlags(32)

    public val METHOD_FLAG_OBJECT_CORE: MethodFlags = MethodFlags(64)

    public val METHOD_FLAG_VIRTUAL_REQUIRED: MethodFlags = MethodFlags(128)

    public val DEFAULT: MethodFlags = MethodFlags(1)
  }
}

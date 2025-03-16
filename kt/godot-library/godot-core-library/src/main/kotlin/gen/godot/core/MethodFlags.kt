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
    /**
     * Flag for a normal method.
     */
    public val NORMAL: MethodFlags = MethodFlags(1)

    /**
     * Flag for an editor method.
     */
    public val EDITOR: MethodFlags = MethodFlags(2)

    /**
     * Flag for a constant method.
     */
    public val CONST: MethodFlags = MethodFlags(4)

    /**
     * Flag for a virtual method.
     */
    public val VIRTUAL: MethodFlags = MethodFlags(8)

    /**
     * Flag for a method with a variable number of arguments.
     */
    public val VARARG: MethodFlags = MethodFlags(16)

    /**
     * Flag for a static method.
     */
    public val STATIC: MethodFlags = MethodFlags(32)

    /**
     * Used internally. Allows to not dump core virtual methods (such as [Object.Notification]) to
     * the JSON API.
     */
    public val OBJECT_CORE: MethodFlags = MethodFlags(64)

    /**
     * Flag for a virtual method that is required.
     */
    public val VIRTUAL_REQUIRED: MethodFlags = MethodFlags(128)

    /**
     * Default method flags (normal).
     */
    public val DEFAULT: MethodFlags = MethodFlags(1)
  }
}

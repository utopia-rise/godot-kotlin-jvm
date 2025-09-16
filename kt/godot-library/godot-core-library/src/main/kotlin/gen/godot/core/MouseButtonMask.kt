// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.core

import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmField

public infix fun Long.or(other: MouseButtonMask): Long = this.or(other.flag)

public infix fun Long.xor(other: MouseButtonMask): Long = this.xor(other.flag)

public infix fun Long.and(other: MouseButtonMask): Long = this.and(other.flag)

public class MouseButtonMask(
  public val flag: Long,
) {
  public infix fun or(other: MouseButtonMask): MouseButtonMask = MouseButtonMask(flag.or(other.flag))

  public infix fun or(other: Long): MouseButtonMask = MouseButtonMask(flag.or(other))

  public infix fun xor(other: MouseButtonMask): MouseButtonMask = MouseButtonMask(flag.xor(other.flag))

  public infix fun xor(other: Long): MouseButtonMask = MouseButtonMask(flag.xor(other))

  public infix fun and(other: MouseButtonMask): MouseButtonMask = MouseButtonMask(flag.and(other.flag))

  public infix fun and(other: Long): MouseButtonMask = MouseButtonMask(flag.and(other))

  public fun unaryPlus(): MouseButtonMask = MouseButtonMask(flag.unaryPlus())

  public fun unaryMinus(): MouseButtonMask = MouseButtonMask(flag.unaryMinus())

  public fun inv(): MouseButtonMask = MouseButtonMask(flag.inv())

  public infix fun shl(bits: Int): MouseButtonMask = MouseButtonMask(flag shl bits)

  public infix fun shr(bits: Int): MouseButtonMask = MouseButtonMask(flag shr bits)

  public infix fun ushr(bits: Int): MouseButtonMask = MouseButtonMask(flag ushr bits)

  public companion object {
    /**
     * Primary mouse button mask, usually for the left button.
     */
    @JvmField
    public val LEFT: MouseButtonMask = MouseButtonMask(1)

    /**
     * Secondary mouse button mask, usually for the right button.
     */
    @JvmField
    public val RIGHT: MouseButtonMask = MouseButtonMask(2)

    /**
     * Middle mouse button mask.
     */
    @JvmField
    public val MIDDLE: MouseButtonMask = MouseButtonMask(4)

    /**
     * Extra mouse button 1 mask.
     */
    @JvmField
    public val MB_XBUTTON1: MouseButtonMask = MouseButtonMask(128)

    /**
     * Extra mouse button 2 mask.
     */
    @JvmField
    public val MB_XBUTTON2: MouseButtonMask = MouseButtonMask(256)
  }
}

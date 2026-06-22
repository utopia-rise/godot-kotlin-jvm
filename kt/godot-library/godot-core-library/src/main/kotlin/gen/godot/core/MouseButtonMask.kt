// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.core

import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmField

public infix fun Long.or(other: MouseButtonMask): Long = this.or(other.flag)

public infix fun Long.xor(other: MouseButtonMask): Long = this.xor(other.flag)

public infix fun Long.and(other: MouseButtonMask): Long = this.and(other.flag)

public class MouseButtonMask(
  flag: Long,
) : BitFieldBase<MouseButtonMask>(flag) {
  protected override fun wrap(flag: Long): MouseButtonMask = MouseButtonMask(flag)

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

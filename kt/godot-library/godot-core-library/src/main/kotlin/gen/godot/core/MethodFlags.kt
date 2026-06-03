// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.core

import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmField

public infix fun Long.or(other: MethodFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: MethodFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: MethodFlags): Long = this.and(other.flag)

public class MethodFlags(
  flag: Long,
) : BitFieldBase<MethodFlags>(flag) {
  protected override fun wrap(flag: Long): MethodFlags = MethodFlags(flag)

  public companion object {
    /**
     * Flag for a normal method.
     */
    @JvmField
    public val NORMAL: MethodFlags = MethodFlags(1)

    /**
     * Flag for an editor method.
     */
    @JvmField
    public val EDITOR: MethodFlags = MethodFlags(2)

    /**
     * Flag for a constant method.
     */
    @JvmField
    public val CONST: MethodFlags = MethodFlags(4)

    /**
     * Flag for a virtual method.
     */
    @JvmField
    public val VIRTUAL: MethodFlags = MethodFlags(8)

    /**
     * Flag for a method with a variable number of arguments.
     */
    @JvmField
    public val VARARG: MethodFlags = MethodFlags(16)

    /**
     * Flag for a static method.
     */
    @JvmField
    public val STATIC: MethodFlags = MethodFlags(32)

    /**
     * Used internally. Allows to not dump core virtual methods (such as [Object.Notification]) to
     * the JSON API.
     */
    @JvmField
    public val OBJECT_CORE: MethodFlags = MethodFlags(64)

    /**
     * Flag for a virtual method that is required. In GDScript, this flag is set for abstract
     * functions.
     */
    @JvmField
    public val VIRTUAL_REQUIRED: MethodFlags = MethodFlags(128)

    /**
     * Default method flags (normal).
     */
    @JvmField
    public val DEFAULT: MethodFlags = MethodFlags(1)
  }
}

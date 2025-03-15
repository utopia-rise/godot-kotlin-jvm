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

public infix fun Long.or(other: PropertyUsageFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: PropertyUsageFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: PropertyUsageFlags): Long = this.and(other.flag)

@JvmInline
public value class PropertyUsageFlags(
  public val flag: Long,
) {
  public infix fun or(other: PropertyUsageFlags): PropertyUsageFlags =
      PropertyUsageFlags(flag.or(other.flag))

  public infix fun or(other: Long): PropertyUsageFlags = PropertyUsageFlags(flag.or(other))

  public infix fun xor(other: PropertyUsageFlags): PropertyUsageFlags =
      PropertyUsageFlags(flag.xor(other.flag))

  public infix fun xor(other: Long): PropertyUsageFlags = PropertyUsageFlags(flag.xor(other))

  public infix fun and(other: PropertyUsageFlags): PropertyUsageFlags =
      PropertyUsageFlags(flag.and(other.flag))

  public infix fun and(other: Long): PropertyUsageFlags = PropertyUsageFlags(flag.and(other))

  public fun unaryPlus(): PropertyUsageFlags = PropertyUsageFlags(flag.unaryPlus())

  public fun unaryMinus(): PropertyUsageFlags = PropertyUsageFlags(flag.unaryMinus())

  public fun inv(): PropertyUsageFlags = PropertyUsageFlags(flag.inv())

  public infix fun shl(bits: Int): PropertyUsageFlags = PropertyUsageFlags(flag shl bits)

  public infix fun shr(bits: Int): PropertyUsageFlags = PropertyUsageFlags(flag shr bits)

  public infix fun ushr(bits: Int): PropertyUsageFlags = PropertyUsageFlags(flag ushr bits)

  public companion object {
    public val NONE: PropertyUsageFlags = PropertyUsageFlags(0)

    public val STORAGE: PropertyUsageFlags = PropertyUsageFlags(2)

    public val EDITOR: PropertyUsageFlags = PropertyUsageFlags(4)

    public val INTERNAL: PropertyUsageFlags = PropertyUsageFlags(8)

    public val CHECKABLE: PropertyUsageFlags = PropertyUsageFlags(16)

    public val CHECKED: PropertyUsageFlags = PropertyUsageFlags(32)

    public val GROUP: PropertyUsageFlags = PropertyUsageFlags(64)

    public val CATEGORY: PropertyUsageFlags = PropertyUsageFlags(128)

    public val SUBGROUP: PropertyUsageFlags = PropertyUsageFlags(256)

    public val CLASS_IS_BITFIELD: PropertyUsageFlags = PropertyUsageFlags(512)

    public val NO_INSTANCE_STATE: PropertyUsageFlags = PropertyUsageFlags(1024)

    public val RESTART_IF_CHANGED: PropertyUsageFlags = PropertyUsageFlags(2048)

    public val SCRIPT_VARIABLE: PropertyUsageFlags = PropertyUsageFlags(4096)

    public val STORE_IF_NULL: PropertyUsageFlags = PropertyUsageFlags(8192)

    public val UPDATE_ALL_IF_MODIFIED: PropertyUsageFlags = PropertyUsageFlags(16384)

    public val SCRIPT_DEFAULT_VALUE: PropertyUsageFlags = PropertyUsageFlags(32768)

    public val CLASS_IS_ENUM: PropertyUsageFlags = PropertyUsageFlags(65536)

    public val NIL_IS_VARIANT: PropertyUsageFlags = PropertyUsageFlags(131072)

    public val ARRAY: PropertyUsageFlags = PropertyUsageFlags(262144)

    public val ALWAYS_DUPLICATE: PropertyUsageFlags = PropertyUsageFlags(524288)

    public val NEVER_DUPLICATE: PropertyUsageFlags = PropertyUsageFlags(1048576)

    public val HIGH_END_GFX: PropertyUsageFlags = PropertyUsageFlags(2097152)

    public val NODE_PATH_FROM_SCENE_ROOT: PropertyUsageFlags = PropertyUsageFlags(4194304)

    public val RESOURCE_NOT_PERSISTENT: PropertyUsageFlags = PropertyUsageFlags(8388608)

    public val KEYING_INCREMENTS: PropertyUsageFlags = PropertyUsageFlags(16777216)

    public val DEFERRED_SET_RESOURCE: PropertyUsageFlags = PropertyUsageFlags(33554432)

    public val EDITOR_INSTANTIATE_OBJECT: PropertyUsageFlags = PropertyUsageFlags(67108864)

    public val EDITOR_BASIC_SETTING: PropertyUsageFlags = PropertyUsageFlags(134217728)

    public val READ_ONLY: PropertyUsageFlags = PropertyUsageFlags(268435456)

    public val SECRET: PropertyUsageFlags = PropertyUsageFlags(536870912)

    public val DEFAULT: PropertyUsageFlags = PropertyUsageFlags(6)

    public val NO_EDITOR: PropertyUsageFlags = PropertyUsageFlags(2)
  }
}

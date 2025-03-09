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
    public val PROPERTY_USAGE_NONE: PropertyUsageFlags = PropertyUsageFlags(0)

    public val PROPERTY_USAGE_STORAGE: PropertyUsageFlags = PropertyUsageFlags(2)

    public val PROPERTY_USAGE_EDITOR: PropertyUsageFlags = PropertyUsageFlags(4)

    public val PROPERTY_USAGE_INTERNAL: PropertyUsageFlags = PropertyUsageFlags(8)

    public val PROPERTY_USAGE_CHECKABLE: PropertyUsageFlags = PropertyUsageFlags(16)

    public val PROPERTY_USAGE_CHECKED: PropertyUsageFlags = PropertyUsageFlags(32)

    public val PROPERTY_USAGE_GROUP: PropertyUsageFlags = PropertyUsageFlags(64)

    public val PROPERTY_USAGE_CATEGORY: PropertyUsageFlags = PropertyUsageFlags(128)

    public val PROPERTY_USAGE_SUBGROUP: PropertyUsageFlags = PropertyUsageFlags(256)

    public val PROPERTY_USAGE_CLASS_IS_BITFIELD: PropertyUsageFlags = PropertyUsageFlags(512)

    public val PROPERTY_USAGE_NO_INSTANCE_STATE: PropertyUsageFlags = PropertyUsageFlags(1024)

    public val PROPERTY_USAGE_RESTART_IF_CHANGED: PropertyUsageFlags = PropertyUsageFlags(2048)

    public val PROPERTY_USAGE_SCRIPT_VARIABLE: PropertyUsageFlags = PropertyUsageFlags(4096)

    public val PROPERTY_USAGE_STORE_IF_NULL: PropertyUsageFlags = PropertyUsageFlags(8192)

    public val PROPERTY_USAGE_UPDATE_ALL_IF_MODIFIED: PropertyUsageFlags = PropertyUsageFlags(16384)

    public val PROPERTY_USAGE_SCRIPT_DEFAULT_VALUE: PropertyUsageFlags = PropertyUsageFlags(32768)

    public val PROPERTY_USAGE_CLASS_IS_ENUM: PropertyUsageFlags = PropertyUsageFlags(65536)

    public val PROPERTY_USAGE_NIL_IS_VARIANT: PropertyUsageFlags = PropertyUsageFlags(131072)

    public val PROPERTY_USAGE_ARRAY: PropertyUsageFlags = PropertyUsageFlags(262144)

    public val PROPERTY_USAGE_ALWAYS_DUPLICATE: PropertyUsageFlags = PropertyUsageFlags(524288)

    public val PROPERTY_USAGE_NEVER_DUPLICATE: PropertyUsageFlags = PropertyUsageFlags(1048576)

    public val PROPERTY_USAGE_HIGH_END_GFX: PropertyUsageFlags = PropertyUsageFlags(2097152)

    public val PROPERTY_USAGE_NODE_PATH_FROM_SCENE_ROOT: PropertyUsageFlags =
        PropertyUsageFlags(4194304)

    public val PROPERTY_USAGE_RESOURCE_NOT_PERSISTENT: PropertyUsageFlags =
        PropertyUsageFlags(8388608)

    public val PROPERTY_USAGE_KEYING_INCREMENTS: PropertyUsageFlags = PropertyUsageFlags(16777216)

    public val PROPERTY_USAGE_DEFERRED_SET_RESOURCE: PropertyUsageFlags =
        PropertyUsageFlags(33554432)

    public val PROPERTY_USAGE_EDITOR_INSTANTIATE_OBJECT: PropertyUsageFlags =
        PropertyUsageFlags(67108864)

    public val PROPERTY_USAGE_EDITOR_BASIC_SETTING: PropertyUsageFlags =
        PropertyUsageFlags(134217728)

    public val PROPERTY_USAGE_READ_ONLY: PropertyUsageFlags = PropertyUsageFlags(268435456)

    public val PROPERTY_USAGE_SECRET: PropertyUsageFlags = PropertyUsageFlags(536870912)

    public val PROPERTY_USAGE_DEFAULT: PropertyUsageFlags = PropertyUsageFlags(6)

    public val PROPERTY_USAGE_NO_EDITOR: PropertyUsageFlags = PropertyUsageFlags(2)
  }
}

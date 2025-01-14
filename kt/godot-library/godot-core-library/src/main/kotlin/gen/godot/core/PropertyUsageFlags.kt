// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot.core

import kotlin.Int
import kotlin.Long
import kotlin.jvm.JvmInline

public sealed interface PropertyUsageFlags {
  public val flag: Long

  public infix fun or(other: PropertyUsageFlags): PropertyUsageFlags =
      PropertyUsageFlagsValue(flag.or(other.flag))

  public infix fun or(other: Long): PropertyUsageFlags = PropertyUsageFlagsValue(flag.or(other))

  public infix fun xor(other: PropertyUsageFlags): PropertyUsageFlags =
      PropertyUsageFlagsValue(flag.xor(other.flag))

  public infix fun xor(other: Long): PropertyUsageFlags = PropertyUsageFlagsValue(flag.xor(other))

  public infix fun and(other: PropertyUsageFlags): PropertyUsageFlags =
      PropertyUsageFlagsValue(flag.and(other.flag))

  public infix fun and(other: Long): PropertyUsageFlags = PropertyUsageFlagsValue(flag.and(other))

  public operator fun plus(other: PropertyUsageFlags): PropertyUsageFlags =
      PropertyUsageFlagsValue(flag.plus(other.flag))

  public operator fun plus(other: Long): PropertyUsageFlags =
      PropertyUsageFlagsValue(flag.plus(other))

  public operator fun minus(other: PropertyUsageFlags): PropertyUsageFlags =
      PropertyUsageFlagsValue(flag.minus(other.flag))

  public operator fun minus(other: Long): PropertyUsageFlags =
      PropertyUsageFlagsValue(flag.minus(other))

  public operator fun times(other: PropertyUsageFlags): PropertyUsageFlags =
      PropertyUsageFlagsValue(flag.times(other.flag))

  public operator fun times(other: Long): PropertyUsageFlags =
      PropertyUsageFlagsValue(flag.times(other))

  public operator fun div(other: PropertyUsageFlags): PropertyUsageFlags =
      PropertyUsageFlagsValue(flag.div(other.flag))

  public operator fun div(other: Long): PropertyUsageFlags =
      PropertyUsageFlagsValue(flag.div(other))

  public operator fun rem(other: PropertyUsageFlags): PropertyUsageFlags =
      PropertyUsageFlagsValue(flag.rem(other.flag))

  public operator fun rem(other: Long): PropertyUsageFlags =
      PropertyUsageFlagsValue(flag.rem(other))

  public fun unaryPlus(): PropertyUsageFlags = PropertyUsageFlagsValue(flag.unaryPlus())

  public fun unaryMinus(): PropertyUsageFlags = PropertyUsageFlagsValue(flag.unaryMinus())

  public fun inv(): PropertyUsageFlags = PropertyUsageFlagsValue(flag.inv())

  public infix fun shl(bits: Int): PropertyUsageFlags = PropertyUsageFlagsValue(flag shl bits)

  public infix fun shr(bits: Int): PropertyUsageFlags = PropertyUsageFlagsValue(flag shr bits)

  public infix fun ushr(bits: Int): PropertyUsageFlags = PropertyUsageFlagsValue(flag ushr bits)

  public companion object {
    public val PROPERTY_USAGE_NONE: PropertyUsageFlags = PropertyUsageFlagsValue(0)

    public val PROPERTY_USAGE_STORAGE: PropertyUsageFlags = PropertyUsageFlagsValue(2)

    public val PROPERTY_USAGE_EDITOR: PropertyUsageFlags = PropertyUsageFlagsValue(4)

    public val PROPERTY_USAGE_INTERNAL: PropertyUsageFlags = PropertyUsageFlagsValue(8)

    public val PROPERTY_USAGE_CHECKABLE: PropertyUsageFlags = PropertyUsageFlagsValue(16)

    public val PROPERTY_USAGE_CHECKED: PropertyUsageFlags = PropertyUsageFlagsValue(32)

    public val PROPERTY_USAGE_GROUP: PropertyUsageFlags = PropertyUsageFlagsValue(64)

    public val PROPERTY_USAGE_CATEGORY: PropertyUsageFlags = PropertyUsageFlagsValue(128)

    public val PROPERTY_USAGE_SUBGROUP: PropertyUsageFlags = PropertyUsageFlagsValue(256)

    public val PROPERTY_USAGE_CLASS_IS_BITFIELD: PropertyUsageFlags = PropertyUsageFlagsValue(512)

    public val PROPERTY_USAGE_NO_INSTANCE_STATE: PropertyUsageFlags = PropertyUsageFlagsValue(1024)

    public val PROPERTY_USAGE_RESTART_IF_CHANGED: PropertyUsageFlags = PropertyUsageFlagsValue(2048)

    public val PROPERTY_USAGE_SCRIPT_VARIABLE: PropertyUsageFlags = PropertyUsageFlagsValue(4096)

    public val PROPERTY_USAGE_STORE_IF_NULL: PropertyUsageFlags = PropertyUsageFlagsValue(8192)

    public val PROPERTY_USAGE_UPDATE_ALL_IF_MODIFIED: PropertyUsageFlags =
        PropertyUsageFlagsValue(16384)

    public val PROPERTY_USAGE_SCRIPT_DEFAULT_VALUE: PropertyUsageFlags =
        PropertyUsageFlagsValue(32768)

    public val PROPERTY_USAGE_CLASS_IS_ENUM: PropertyUsageFlags = PropertyUsageFlagsValue(65536)

    public val PROPERTY_USAGE_NIL_IS_VARIANT: PropertyUsageFlags = PropertyUsageFlagsValue(131072)

    public val PROPERTY_USAGE_ARRAY: PropertyUsageFlags = PropertyUsageFlagsValue(262144)

    public val PROPERTY_USAGE_ALWAYS_DUPLICATE: PropertyUsageFlags = PropertyUsageFlagsValue(524288)

    public val PROPERTY_USAGE_NEVER_DUPLICATE: PropertyUsageFlags = PropertyUsageFlagsValue(1048576)

    public val PROPERTY_USAGE_HIGH_END_GFX: PropertyUsageFlags = PropertyUsageFlagsValue(2097152)

    public val PROPERTY_USAGE_NODE_PATH_FROM_SCENE_ROOT: PropertyUsageFlags =
        PropertyUsageFlagsValue(4194304)

    public val PROPERTY_USAGE_RESOURCE_NOT_PERSISTENT: PropertyUsageFlags =
        PropertyUsageFlagsValue(8388608)

    public val PROPERTY_USAGE_KEYING_INCREMENTS: PropertyUsageFlags =
        PropertyUsageFlagsValue(16777216)

    public val PROPERTY_USAGE_DEFERRED_SET_RESOURCE: PropertyUsageFlags =
        PropertyUsageFlagsValue(33554432)

    public val PROPERTY_USAGE_EDITOR_INSTANTIATE_OBJECT: PropertyUsageFlags =
        PropertyUsageFlagsValue(67108864)

    public val PROPERTY_USAGE_EDITOR_BASIC_SETTING: PropertyUsageFlags =
        PropertyUsageFlagsValue(134217728)

    public val PROPERTY_USAGE_READ_ONLY: PropertyUsageFlags = PropertyUsageFlagsValue(268435456)

    public val PROPERTY_USAGE_SECRET: PropertyUsageFlags = PropertyUsageFlagsValue(536870912)

    public val PROPERTY_USAGE_DEFAULT: PropertyUsageFlags = PropertyUsageFlagsValue(6)

    public val PROPERTY_USAGE_NO_EDITOR: PropertyUsageFlags = PropertyUsageFlagsValue(2)
  }
}

@JvmInline
public value class PropertyUsageFlagsValue(
  public override val flag: Long,
) : PropertyUsageFlags

public infix fun Long.or(other: PropertyUsageFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: PropertyUsageFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: PropertyUsageFlags): Long = this.and(other.flag)

public operator fun Long.plus(other: PropertyUsageFlags): Long = this.plus(other.flag)

public operator fun Long.minus(other: PropertyUsageFlags): Long = this.minus(other.flag)

public operator fun Long.times(other: PropertyUsageFlags): Long = this.times(other.flag)

public operator fun Long.div(other: PropertyUsageFlags): Long = this.div(other.flag)

public operator fun Long.rem(other: PropertyUsageFlags): Long = this.rem(other.flag)

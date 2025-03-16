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
    /**
     * The property is not stored, and does not display in the editor. This is the default for
     * non-exported properties.
     */
    public val PROPERTY_USAGE_NONE: PropertyUsageFlags = PropertyUsageFlags(0)

    /**
     * The property is serialized and saved in the scene file (default for exported properties).
     */
    public val PROPERTY_USAGE_STORAGE: PropertyUsageFlags = PropertyUsageFlags(2)

    /**
     * The property is shown in the [EditorInspector] (default for exported properties).
     */
    public val PROPERTY_USAGE_EDITOR: PropertyUsageFlags = PropertyUsageFlags(4)

    /**
     * The property is excluded from the class reference.
     */
    public val PROPERTY_USAGE_INTERNAL: PropertyUsageFlags = PropertyUsageFlags(8)

    /**
     * The property can be checked in the [EditorInspector].
     */
    public val PROPERTY_USAGE_CHECKABLE: PropertyUsageFlags = PropertyUsageFlags(16)

    /**
     * The property is checked in the [EditorInspector].
     */
    public val PROPERTY_USAGE_CHECKED: PropertyUsageFlags = PropertyUsageFlags(32)

    /**
     * Used to group properties together in the editor. See [EditorInspector].
     */
    public val PROPERTY_USAGE_GROUP: PropertyUsageFlags = PropertyUsageFlags(64)

    /**
     * Used to categorize properties together in the editor.
     */
    public val PROPERTY_USAGE_CATEGORY: PropertyUsageFlags = PropertyUsageFlags(128)

    /**
     * Used to group properties together in the editor in a subgroup (under a group). See
     * [EditorInspector].
     */
    public val PROPERTY_USAGE_SUBGROUP: PropertyUsageFlags = PropertyUsageFlags(256)

    /**
     * The property is a bitfield, i.e. it contains multiple flags represented as bits.
     */
    public val PROPERTY_USAGE_CLASS_IS_BITFIELD: PropertyUsageFlags = PropertyUsageFlags(512)

    /**
     * The property does not save its state in [PackedScene].
     */
    public val PROPERTY_USAGE_NO_INSTANCE_STATE: PropertyUsageFlags = PropertyUsageFlags(1024)

    /**
     * Editing the property prompts the user for restarting the editor.
     */
    public val PROPERTY_USAGE_RESTART_IF_CHANGED: PropertyUsageFlags = PropertyUsageFlags(2048)

    /**
     * The property is a script variable. [PROPERTY_USAGE_SCRIPT_VARIABLE] can be used to
     * distinguish between exported script variables from built-in variables (which don't have this
     * usage flag). By default, [PROPERTY_USAGE_SCRIPT_VARIABLE] is **not** applied to variables that
     * are created by overriding [Object.GetPropertyList] in a script.
     */
    public val PROPERTY_USAGE_SCRIPT_VARIABLE: PropertyUsageFlags = PropertyUsageFlags(4096)

    /**
     * The property value of type [Object] will be stored even if its value is `null`.
     */
    public val PROPERTY_USAGE_STORE_IF_NULL: PropertyUsageFlags = PropertyUsageFlags(8192)

    /**
     * If this property is modified, all inspector fields will be refreshed.
     */
    public val PROPERTY_USAGE_UPDATE_ALL_IF_MODIFIED: PropertyUsageFlags = PropertyUsageFlags(16384)

    public val PROPERTY_USAGE_SCRIPT_DEFAULT_VALUE: PropertyUsageFlags = PropertyUsageFlags(32768)

    /**
     * The property is a variable of enum type, i.e. it only takes named integer constants from its
     * associated enumeration.
     */
    public val PROPERTY_USAGE_CLASS_IS_ENUM: PropertyUsageFlags = PropertyUsageFlags(65536)

    /**
     * If property has `nil` as default value, its type will be [Variant].
     */
    public val PROPERTY_USAGE_NIL_IS_VARIANT: PropertyUsageFlags = PropertyUsageFlags(131072)

    /**
     * The property is an array.
     */
    public val PROPERTY_USAGE_ARRAY: PropertyUsageFlags = PropertyUsageFlags(262144)

    /**
     * When duplicating a resource with [Resource.duplicate], and this flag is set on a property of
     * that resource, the property should always be duplicated, regardless of the `subresources` bool
     * parameter.
     */
    public val PROPERTY_USAGE_ALWAYS_DUPLICATE: PropertyUsageFlags = PropertyUsageFlags(524288)

    /**
     * When duplicating a resource with [Resource.duplicate], and this flag is set on a property of
     * that resource, the property should never be duplicated, regardless of the `subresources` bool
     * parameter.
     */
    public val PROPERTY_USAGE_NEVER_DUPLICATE: PropertyUsageFlags = PropertyUsageFlags(1048576)

    /**
     * The property is only shown in the editor if modern renderers are supported (the Compatibility
     * rendering method is excluded).
     */
    public val PROPERTY_USAGE_HIGH_END_GFX: PropertyUsageFlags = PropertyUsageFlags(2097152)

    /**
     * The [NodePath] property will always be relative to the scene's root. Mostly useful for local
     * resources.
     */
    public val PROPERTY_USAGE_NODE_PATH_FROM_SCENE_ROOT: PropertyUsageFlags =
        PropertyUsageFlags(4194304)

    /**
     * Use when a resource is created on the fly, i.e. the getter will always return a different
     * instance. [ResourceSaver] needs this information to properly save such resources.
     */
    public val PROPERTY_USAGE_RESOURCE_NOT_PERSISTENT: PropertyUsageFlags =
        PropertyUsageFlags(8388608)

    /**
     * Inserting an animation key frame of this property will automatically increment the value,
     * allowing to easily keyframe multiple values in a row.
     */
    public val PROPERTY_USAGE_KEYING_INCREMENTS: PropertyUsageFlags = PropertyUsageFlags(16777216)

    public val PROPERTY_USAGE_DEFERRED_SET_RESOURCE: PropertyUsageFlags =
        PropertyUsageFlags(33554432)

    /**
     * When this property is a [Resource] and base object is a [Node], a resource instance will be
     * automatically created whenever the node is created in the editor.
     */
    public val PROPERTY_USAGE_EDITOR_INSTANTIATE_OBJECT: PropertyUsageFlags =
        PropertyUsageFlags(67108864)

    /**
     * The property is considered a basic setting and will appear even when advanced mode is
     * disabled. Used for project settings.
     */
    public val PROPERTY_USAGE_EDITOR_BASIC_SETTING: PropertyUsageFlags =
        PropertyUsageFlags(134217728)

    /**
     * The property is read-only in the [EditorInspector].
     */
    public val PROPERTY_USAGE_READ_ONLY: PropertyUsageFlags = PropertyUsageFlags(268435456)

    /**
     * An export preset property with this flag contains confidential information and is stored
     * separately from the rest of the export preset configuration.
     */
    public val PROPERTY_USAGE_SECRET: PropertyUsageFlags = PropertyUsageFlags(536870912)

    /**
     * Default usage (storage and editor).
     */
    public val PROPERTY_USAGE_DEFAULT: PropertyUsageFlags = PropertyUsageFlags(6)

    /**
     * Default usage but without showing the property in the editor (storage).
     */
    public val PROPERTY_USAGE_NO_EDITOR: PropertyUsageFlags = PropertyUsageFlags(2)
  }
}

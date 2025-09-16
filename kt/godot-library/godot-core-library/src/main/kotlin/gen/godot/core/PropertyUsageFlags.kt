// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.core

import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmField

public infix fun Long.or(other: PropertyUsageFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: PropertyUsageFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: PropertyUsageFlags): Long = this.and(other.flag)

public class PropertyUsageFlags(
  public val flag: Long,
) {
  public infix fun or(other: PropertyUsageFlags): PropertyUsageFlags = PropertyUsageFlags(flag.or(other.flag))

  public infix fun or(other: Long): PropertyUsageFlags = PropertyUsageFlags(flag.or(other))

  public infix fun xor(other: PropertyUsageFlags): PropertyUsageFlags = PropertyUsageFlags(flag.xor(other.flag))

  public infix fun xor(other: Long): PropertyUsageFlags = PropertyUsageFlags(flag.xor(other))

  public infix fun and(other: PropertyUsageFlags): PropertyUsageFlags = PropertyUsageFlags(flag.and(other.flag))

  public infix fun and(other: Long): PropertyUsageFlags = PropertyUsageFlags(flag.and(other))

  public fun unaryPlus(): PropertyUsageFlags = PropertyUsageFlags(flag.unaryPlus())

  public fun unaryMinus(): PropertyUsageFlags = PropertyUsageFlags(flag.unaryMinus())

  public fun inv(): PropertyUsageFlags = PropertyUsageFlags(flag.inv())

  public infix fun shl(bits: Int): PropertyUsageFlags = PropertyUsageFlags(flag shl bits)

  public infix fun shr(bits: Int): PropertyUsageFlags = PropertyUsageFlags(flag shr bits)

  public infix fun ushr(bits: Int): PropertyUsageFlags = PropertyUsageFlags(flag ushr bits)

  public companion object {
    /**
     * The property is not stored, and does not display in the editor. This is the default for non-exported properties.
     */
    @JvmField
    public val NONE: PropertyUsageFlags = PropertyUsageFlags(0)

    /**
     * The property is serialized and saved in the scene file (default for exported properties).
     */
    @JvmField
    public val STORAGE: PropertyUsageFlags = PropertyUsageFlags(2)

    /**
     * The property is shown in the [EditorInspector] (default for exported properties).
     */
    @JvmField
    public val EDITOR: PropertyUsageFlags = PropertyUsageFlags(4)

    /**
     * The property is excluded from the class reference.
     */
    @JvmField
    public val INTERNAL: PropertyUsageFlags = PropertyUsageFlags(8)

    /**
     * The property can be checked in the [EditorInspector].
     */
    @JvmField
    public val CHECKABLE: PropertyUsageFlags = PropertyUsageFlags(16)

    /**
     * The property is checked in the [EditorInspector].
     */
    @JvmField
    public val CHECKED: PropertyUsageFlags = PropertyUsageFlags(32)

    /**
     * Used to group properties together in the editor. See [EditorInspector].
     */
    @JvmField
    public val GROUP: PropertyUsageFlags = PropertyUsageFlags(64)

    /**
     * Used to categorize properties together in the editor.
     */
    @JvmField
    public val CATEGORY: PropertyUsageFlags = PropertyUsageFlags(128)

    /**
     * Used to group properties together in the editor in a subgroup (under a group). See [EditorInspector].
     */
    @JvmField
    public val SUBGROUP: PropertyUsageFlags = PropertyUsageFlags(256)

    /**
     * The property is a bitfield, i.e. it contains multiple flags represented as bits.
     */
    @JvmField
    public val CLASS_IS_BITFIELD: PropertyUsageFlags = PropertyUsageFlags(512)

    /**
     * The property does not save its state in [PackedScene].
     */
    @JvmField
    public val NO_INSTANCE_STATE: PropertyUsageFlags = PropertyUsageFlags(1_024)

    /**
     * Editing the property prompts the user for restarting the editor.
     */
    @JvmField
    public val RESTART_IF_CHANGED: PropertyUsageFlags = PropertyUsageFlags(2_048)

    /**
     * The property is a script variable. [PROPERTY_USAGE_SCRIPT_VARIABLE] can be used to distinguish between exported script variables from built-in variables (which don't have this usage flag). By default, [PROPERTY_USAGE_SCRIPT_VARIABLE] is **not** applied to variables that are created by overriding [Object.GetPropertyList] in a script.
     */
    @JvmField
    public val SCRIPT_VARIABLE: PropertyUsageFlags = PropertyUsageFlags(4_096)

    /**
     * The property value of type [Object] will be stored even if its value is `null`.
     */
    @JvmField
    public val STORE_IF_NULL: PropertyUsageFlags = PropertyUsageFlags(8_192)

    /**
     * If this property is modified, all inspector fields will be refreshed.
     */
    @JvmField
    public val UPDATE_ALL_IF_MODIFIED: PropertyUsageFlags = PropertyUsageFlags(16_384)

    @JvmField
    public val SCRIPT_DEFAULT_VALUE: PropertyUsageFlags = PropertyUsageFlags(32_768)

    /**
     * The property is a variable of enum type, i.e. it only takes named integer constants from its associated enumeration.
     */
    @JvmField
    public val CLASS_IS_ENUM: PropertyUsageFlags = PropertyUsageFlags(65_536)

    /**
     * If property has `nil` as default value, its type will be [Variant].
     */
    @JvmField
    public val NIL_IS_VARIANT: PropertyUsageFlags = PropertyUsageFlags(131_072)

    /**
     * The property is an array.
     */
    @JvmField
    public val ARRAY: PropertyUsageFlags = PropertyUsageFlags(262_144)

    /**
     * When duplicating a resource with [Resource.duplicate], and this flag is set on a property of that resource, the property should always be duplicated, regardless of the `subresources` bool parameter.
     */
    @JvmField
    public val ALWAYS_DUPLICATE: PropertyUsageFlags = PropertyUsageFlags(524_288)

    /**
     * When duplicating a resource with [Resource.duplicate], and this flag is set on a property of that resource, the property should never be duplicated, regardless of the `subresources` bool parameter.
     */
    @JvmField
    public val NEVER_DUPLICATE: PropertyUsageFlags = PropertyUsageFlags(1_048_576)

    /**
     * The property is only shown in the editor if modern renderers are supported (the Compatibility rendering method is excluded).
     */
    @JvmField
    public val HIGH_END_GFX: PropertyUsageFlags = PropertyUsageFlags(2_097_152)

    /**
     * The [NodePath] property will always be relative to the scene's root. Mostly useful for local resources.
     */
    @JvmField
    public val NODE_PATH_FROM_SCENE_ROOT: PropertyUsageFlags = PropertyUsageFlags(4_194_304)

    /**
     * Use when a resource is created on the fly, i.e. the getter will always return a different instance. [ResourceSaver] needs this information to properly save such resources.
     */
    @JvmField
    public val RESOURCE_NOT_PERSISTENT: PropertyUsageFlags = PropertyUsageFlags(8_388_608)

    /**
     * Inserting an animation key frame of this property will automatically increment the value, allowing to easily keyframe multiple values in a row.
     */
    @JvmField
    public val KEYING_INCREMENTS: PropertyUsageFlags = PropertyUsageFlags(16_777_216)

    @JvmField
    public val DEFERRED_SET_RESOURCE: PropertyUsageFlags = PropertyUsageFlags(33_554_432)

    /**
     * When this property is a [Resource] and base object is a [Node], a resource instance will be automatically created whenever the node is created in the editor.
     */
    @JvmField
    public val EDITOR_INSTANTIATE_OBJECT: PropertyUsageFlags = PropertyUsageFlags(67_108_864)

    /**
     * The property is considered a basic setting and will appear even when advanced mode is disabled. Used for project settings.
     */
    @JvmField
    public val EDITOR_BASIC_SETTING: PropertyUsageFlags = PropertyUsageFlags(134_217_728)

    /**
     * The property is read-only in the [EditorInspector].
     */
    @JvmField
    public val READ_ONLY: PropertyUsageFlags = PropertyUsageFlags(268_435_456)

    /**
     * An export preset property with this flag contains confidential information and is stored separately from the rest of the export preset configuration.
     */
    @JvmField
    public val SECRET: PropertyUsageFlags = PropertyUsageFlags(536_870_912)

    /**
     * Default usage (storage and editor).
     */
    @JvmField
    public val DEFAULT: PropertyUsageFlags = PropertyUsageFlags(6)

    /**
     * Default usage but without showing the property in the editor (storage).
     */
    @JvmField
    public val NO_EDITOR: PropertyUsageFlags = PropertyUsageFlags(2)
  }
}

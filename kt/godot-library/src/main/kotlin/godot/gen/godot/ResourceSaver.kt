// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmOverloads

/**
 * A singleton for saving [godot.Resource]s to the filesystem.
 *
 * A singleton for saving resource types to the filesystem.
 *
 * It uses the many [godot.ResourceFormatSaver] classes registered in the engine (either built-in or from a plugin) to save resource data to text-based (e.g. `.tres` or `.tscn`) or binary files (e.g. `.res` or `.scn`).
 */
@GodotBaseType
public object ResourceSaver : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_RESOURCESAVER)
    return false
  }

  /**
   * Saves a resource to disk to the given path, using a [godot.ResourceFormatSaver] that recognizes the resource object. If [path] is empty, [godot.ResourceSaver] will try to use [godot.Resource.resourcePath].
   *
   * The [flags] bitmask can be specified to customize the save behavior using [enum SaverFlags] flags.
   *
   * Returns [OK] on success.
   *
   * **Note:** When the project is running, any generated UID associated with the resource will not be saved as the required code is only executed in editor mode.
   */
  @JvmOverloads
  public fun save(
    resource: Resource,
    path: String = "",
    flags: SaverFlags = ResourceSaver.SaverFlags.FLAG_NONE,
  ): GodotError {
    TransferContext.writeArguments(OBJECT to resource, STRING to path, LONG to flags.flag)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCESAVER_SAVE, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the list of extensions available for saving a resource of a given type.
   */
  public fun getRecognizedExtensions(type: Resource): PackedStringArray {
    TransferContext.writeArguments(OBJECT to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RESOURCESAVER_GET_RECOGNIZED_EXTENSIONS, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Registers a new [godot.ResourceFormatSaver]. The ResourceSaver will use the ResourceFormatSaver as described in [save].
   *
   * This method is performed implicitly for ResourceFormatSavers written in GDScript (see [godot.ResourceFormatSaver] for more information).
   */
  @JvmOverloads
  public fun addResourceFormatSaver(formatSaver: ResourceFormatSaver, atFront: Boolean = false):
      Unit {
    TransferContext.writeArguments(OBJECT to formatSaver, BOOL to atFront)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RESOURCESAVER_ADD_RESOURCE_FORMAT_SAVER, NIL)
  }

  /**
   * Unregisters the given [godot.ResourceFormatSaver].
   */
  public fun removeResourceFormatSaver(formatSaver: ResourceFormatSaver): Unit {
    TransferContext.writeArguments(OBJECT to formatSaver)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RESOURCESAVER_REMOVE_RESOURCE_FORMAT_SAVER, NIL)
  }

  public sealed interface SaverFlags {
    public val flag: Long

    public infix fun or(other: SaverFlags): SaverFlags = SaverFlagsValue(flag.or(other.flag))

    public infix fun or(other: Long): SaverFlags = SaverFlagsValue(flag.or(other))

    public infix fun xor(other: SaverFlags): SaverFlags = SaverFlagsValue(flag.xor(other.flag))

    public infix fun xor(other: Long): SaverFlags = SaverFlagsValue(flag.xor(other))

    public infix fun and(other: SaverFlags): SaverFlags = SaverFlagsValue(flag.and(other.flag))

    public infix fun and(other: Long): SaverFlags = SaverFlagsValue(flag.and(other))

    public operator fun plus(other: SaverFlags): SaverFlags = SaverFlagsValue(flag.plus(other.flag))

    public operator fun plus(other: Long): SaverFlags = SaverFlagsValue(flag.plus(other))

    public operator fun minus(other: SaverFlags): SaverFlags =
        SaverFlagsValue(flag.minus(other.flag))

    public operator fun minus(other: Long): SaverFlags = SaverFlagsValue(flag.minus(other))

    public operator fun times(other: SaverFlags): SaverFlags =
        SaverFlagsValue(flag.times(other.flag))

    public operator fun times(other: Long): SaverFlags = SaverFlagsValue(flag.times(other))

    public operator fun div(other: SaverFlags): SaverFlags = SaverFlagsValue(flag.div(other.flag))

    public operator fun div(other: Long): SaverFlags = SaverFlagsValue(flag.div(other))

    public operator fun rem(other: SaverFlags): SaverFlags = SaverFlagsValue(flag.rem(other.flag))

    public operator fun rem(other: Long): SaverFlags = SaverFlagsValue(flag.rem(other))

    public fun unaryPlus(): SaverFlags = SaverFlagsValue(flag.unaryPlus())

    public fun unaryMinus(): SaverFlags = SaverFlagsValue(flag.unaryMinus())

    public fun inv(): SaverFlags = SaverFlagsValue(flag.inv())

    public infix fun shl(bits: Int): SaverFlags = SaverFlagsValue(flag shl bits)

    public infix fun shr(bits: Int): SaverFlags = SaverFlagsValue(flag shr bits)

    public infix fun ushr(bits: Int): SaverFlags = SaverFlagsValue(flag ushr bits)

    public companion object {
      public val FLAG_NONE: SaverFlags = SaverFlagsValue(0)

      public val FLAG_RELATIVE_PATHS: SaverFlags = SaverFlagsValue(1)

      public val FLAG_BUNDLE_RESOURCES: SaverFlags = SaverFlagsValue(2)

      public val FLAG_CHANGE_PATH: SaverFlags = SaverFlagsValue(4)

      public val FLAG_OMIT_EDITOR_PROPERTIES: SaverFlags = SaverFlagsValue(8)

      public val FLAG_SAVE_BIG_ENDIAN: SaverFlags = SaverFlagsValue(16)

      public val FLAG_COMPRESS: SaverFlags = SaverFlagsValue(32)

      public val FLAG_REPLACE_SUBRESOURCE_PATHS: SaverFlags = SaverFlagsValue(64)
    }
  }

  @JvmInline
  internal value class SaverFlagsValue internal constructor(
    public override val flag: Long,
  ) : SaverFlags
}

public infix fun Long.or(other: godot.ResourceSaver.SaverFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: godot.ResourceSaver.SaverFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: godot.ResourceSaver.SaverFlags): Long = this.and(other.flag)

public operator fun Long.plus(other: godot.ResourceSaver.SaverFlags): Long = this.plus(other.flag)

public operator fun Long.minus(other: godot.ResourceSaver.SaverFlags): Long = this.minus(other.flag)

public operator fun Long.times(other: godot.ResourceSaver.SaverFlags): Long = this.times(other.flag)

public operator fun Long.div(other: godot.ResourceSaver.SaverFlags): Long = this.div(other.flag)

public operator fun Long.rem(other: godot.ResourceSaver.SaverFlags): Long = this.rem(other.flag)

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Error
import godot.core.PackedStringArray
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

public infix fun Long.or(other: godot.api.ResourceSaver.SaverFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: godot.api.ResourceSaver.SaverFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: godot.api.ResourceSaver.SaverFlags): Long = this.and(other.flag)

public operator fun Long.plus(other: godot.api.ResourceSaver.SaverFlags): Long =
    this.plus(other.flag)

public operator fun Long.minus(other: godot.api.ResourceSaver.SaverFlags): Long =
    this.minus(other.flag)

public operator fun Long.times(other: godot.api.ResourceSaver.SaverFlags): Long =
    this.times(other.flag)

public operator fun Long.div(other: godot.api.ResourceSaver.SaverFlags): Long = this.div(other.flag)

public operator fun Long.rem(other: godot.api.ResourceSaver.SaverFlags): Long = this.rem(other.flag)

/**
 * A singleton for saving resource types to the filesystem.
 * It uses the many [ResourceFormatSaver] classes registered in the engine (either built-in or from
 * a plugin) to save resource data to text-based (e.g. `.tres` or `.tscn`) or binary files (e.g. `.res`
 * or `.scn`).
 */
@GodotBaseType
public object ResourceSaver : Object() {
  public override fun new(scriptIndex: Int): Unit {
    getSingleton(13)
  }

  /**
   * Saves a resource to disk to the given path, using a [ResourceFormatSaver] that recognizes the
   * resource object. If [path] is empty, [ResourceSaver] will try to use [Resource.resourcePath].
   * The [flags] bitmask can be specified to customize the save behavior using [SaverFlags] flags.
   * Returns [OK] on success.
   * **Note:** When the project is running, any generated UID associated with the resource will not
   * be saved as the required code is only executed in editor mode.
   */
  @JvmOverloads
  @JvmStatic
  public final fun save(
    resource: Resource?,
    path: String = "",
    flags: SaverFlags = ResourceSaver.SaverFlags.FLAG_NONE,
  ): Error {
    TransferContext.writeArguments(OBJECT to resource, STRING to path, LONG to flags.flag)
    TransferContext.callMethod(ptr, MethodBindings.savePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the list of extensions available for saving a resource of a given type.
   */
  @JvmStatic
  public final fun getRecognizedExtensions(type: Resource?): PackedStringArray {
    TransferContext.writeArguments(OBJECT to type)
    TransferContext.callMethod(ptr, MethodBindings.getRecognizedExtensionsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Registers a new [ResourceFormatSaver]. The ResourceSaver will use the ResourceFormatSaver as
   * described in [save].
   * This method is performed implicitly for ResourceFormatSavers written in GDScript (see
   * [ResourceFormatSaver] for more information).
   */
  @JvmOverloads
  @JvmStatic
  public final fun addResourceFormatSaver(formatSaver: ResourceFormatSaver?, atFront: Boolean =
      false): Unit {
    TransferContext.writeArguments(OBJECT to formatSaver, BOOL to atFront)
    TransferContext.callMethod(ptr, MethodBindings.addResourceFormatSaverPtr, NIL)
  }

  /**
   * Unregisters the given [ResourceFormatSaver].
   */
  @JvmStatic
  public final fun removeResourceFormatSaver(formatSaver: ResourceFormatSaver?): Unit {
    TransferContext.writeArguments(OBJECT to formatSaver)
    TransferContext.callMethod(ptr, MethodBindings.removeResourceFormatSaverPtr, NIL)
  }

  /**
   * Returns the resource ID for the given path. If [generate] is `true`, a new resource ID will be
   * generated if one for the path is not found. If [generate] is `false` and the path is not found,
   * [ResourceUID.INVALID_ID] is returned.
   */
  @JvmOverloads
  @JvmStatic
  public final fun getResourceIdForPath(path: String, generate: Boolean = false): Long {
    TransferContext.writeArguments(STRING to path, BOOL to generate)
    TransferContext.callMethod(ptr, MethodBindings.getResourceIdForPathPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
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
  public value class SaverFlagsValue(
    public override val flag: Long,
  ) : SaverFlags

  public object MethodBindings {
    internal val savePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceSaver", "save", 2983274697)

    internal val getRecognizedExtensionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceSaver", "get_recognized_extensions", 4223597960)

    internal val addResourceFormatSaverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceSaver", "add_resource_format_saver", 362894272)

    internal val removeResourceFormatSaverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceSaver", "remove_resource_format_saver", 3373026878)

    internal val getResourceIdForPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceSaver", "get_resource_id_for_path", 150756522)
  }
}

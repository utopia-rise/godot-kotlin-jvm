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
import kotlin.jvm.JvmField
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

public infix fun Long.or(other: ResourceSaver.SaverFlags): Long = this.or(other.flag)

public infix fun Long.xor(other: ResourceSaver.SaverFlags): Long = this.xor(other.flag)

public infix fun Long.and(other: ResourceSaver.SaverFlags): Long = this.and(other.flag)

/**
 * A singleton for saving resource types to the filesystem.
 *
 * It uses the many [ResourceFormatSaver] classes registered in the engine (either built-in or from
 * a plugin) to save resource data to text-based (e.g. `.tres` or `.tscn`) or binary files (e.g. `.res`
 * or `.scn`).
 */
@GodotBaseType
public object ResourceSaver : Object() {
  public override fun new(scriptIndex: Int): Unit {
    getSingleton(28)
  }

  /**
   * Saves a resource to disk to the given path, using a [ResourceFormatSaver] that recognizes the
   * resource object. If [path] is empty, [ResourceSaver] will try to use [Resource.resourcePath].
   *
   * The [flags] bitmask can be specified to customize the save behavior.
   *
   * Returns [OK] on success.
   *
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
   * Sets the UID of the given [resource] path to [uid]. You can generate a new UID using
   * [ResourceUID.createId].
   *
   * Since resources will normally get a UID automatically, this method is only useful in very
   * specific cases.
   */
  @JvmStatic
  public final fun setUid(resource: String, uid: Long): Error {
    TransferContext.writeArguments(STRING to resource, LONG to uid)
    TransferContext.callMethod(ptr, MethodBindings.setUidPtr, LONG)
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
   *
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

  public class SaverFlags(
    public val flag: Long,
  ) {
    public infix fun or(other: SaverFlags): SaverFlags = SaverFlags(flag.or(other.flag))

    public infix fun or(other: Long): SaverFlags = SaverFlags(flag.or(other))

    public infix fun xor(other: SaverFlags): SaverFlags = SaverFlags(flag.xor(other.flag))

    public infix fun xor(other: Long): SaverFlags = SaverFlags(flag.xor(other))

    public infix fun and(other: SaverFlags): SaverFlags = SaverFlags(flag.and(other.flag))

    public infix fun and(other: Long): SaverFlags = SaverFlags(flag.and(other))

    public fun unaryPlus(): SaverFlags = SaverFlags(flag.unaryPlus())

    public fun unaryMinus(): SaverFlags = SaverFlags(flag.unaryMinus())

    public fun inv(): SaverFlags = SaverFlags(flag.inv())

    public infix fun shl(bits: Int): SaverFlags = SaverFlags(flag shl bits)

    public infix fun shr(bits: Int): SaverFlags = SaverFlags(flag shr bits)

    public infix fun ushr(bits: Int): SaverFlags = SaverFlags(flag ushr bits)

    public companion object {
      /**
       * No resource saving option.
       */
      @JvmField
      public val FLAG_NONE: SaverFlags = SaverFlags(0)

      /**
       * Save the resource with a path relative to the scene which uses it.
       */
      @JvmField
      public val FLAG_RELATIVE_PATHS: SaverFlags = SaverFlags(1)

      /**
       * Bundles external resources.
       */
      @JvmField
      public val FLAG_BUNDLE_RESOURCES: SaverFlags = SaverFlags(2)

      /**
       * Changes the [Resource.resourcePath] of the saved resource to match its new location.
       */
      @JvmField
      public val FLAG_CHANGE_PATH: SaverFlags = SaverFlags(4)

      /**
       * Do not save editor-specific metadata (identified by their `__editor` prefix).
       */
      @JvmField
      public val FLAG_OMIT_EDITOR_PROPERTIES: SaverFlags = SaverFlags(8)

      /**
       * Save as big endian (see [FileAccess.bigEndian]).
       */
      @JvmField
      public val FLAG_SAVE_BIG_ENDIAN: SaverFlags = SaverFlags(16)

      /**
       * Compress the resource on save using [FileAccess.COMPRESSION_ZSTD]. Only available for
       * binary resource types.
       */
      @JvmField
      public val FLAG_COMPRESS: SaverFlags = SaverFlags(32)

      /**
       * Take over the paths of the saved subresources (see [Resource.takeOverPath]).
       */
      @JvmField
      public val FLAG_REPLACE_SUBRESOURCE_PATHS: SaverFlags = SaverFlags(64)
    }
  }

  public object MethodBindings {
    internal val savePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceSaver", "save", 2983274697)

    internal val setUidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceSaver", "set_uid", 993915709)

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

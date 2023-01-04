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
import godot.core.VariantType.JVM_INT
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

/**
 * Singleton for saving Godot-specific resource types.
 *
 * Singleton for saving Godot-specific resource types to the filesystem.
 *
 * It uses the many [godot.ResourceFormatSaver] classes registered in the engine (either built-in or from a plugin) to save engine-specific resource data to text-based (e.g. `.tres` or `.tscn`) or binary files (e.g. `.res` or `.scn`).
 */
@GodotBaseType
public object ResourceSaver : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_RESOURCESAVER)
    return false
  }

  /**
   * Saves a resource to disk to the given path, using a [godot.ResourceFormatSaver] that recognizes the resource object. If [path] is empty, [godot.ResourceSaver] will try to use [godot.Resource.resourcePath].
   *
   * The [flags] bitmask can be specified to customize the save behavior using [enum SaverFlags] flags.
   *
   * Returns [OK] on success.
   */
  public fun save(
    resource: Resource,
    path: String = "",
    flags: Long = 0
  ): GodotError {
    TransferContext.writeArguments(OBJECT to resource, STRING to path, OBJECT to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCESAVER_SAVE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the list of extensions available for saving a resource of a given type.
   */
  public fun getRecognizedExtensions(type: Resource): PackedStringArray {
    TransferContext.writeArguments(OBJECT to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RESOURCESAVER_GET_RECOGNIZED_EXTENSIONS, PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Registers a new [godot.ResourceFormatSaver]. The ResourceSaver will use the ResourceFormatSaver as described in [save].
   *
   * This method is performed implicitly for ResourceFormatSavers written in GDScript (see [godot.ResourceFormatSaver] for more information).
   */
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

  public enum class SaverFlags(
    id: Long
  ) {
    /**
     * No resource saving option.
     */
    FLAG_NONE(0),
    /**
     * Save the resource with a path relative to the scene which uses it.
     */
    FLAG_RELATIVE_PATHS(1),
    /**
     * Bundles external resources.
     */
    FLAG_BUNDLE_RESOURCES(2),
    /**
     * Changes the [godot.Resource.resourcePath] of the saved resource to match its new location.
     */
    FLAG_CHANGE_PATH(4),
    /**
     * Do not save editor-specific metadata (identified by their `__editor` prefix).
     */
    FLAG_OMIT_EDITOR_PROPERTIES(8),
    /**
     * Save as big endian (see [godot.FileAccess.bigEndian]).
     */
    FLAG_SAVE_BIG_ENDIAN(16),
    /**
     * Compress the resource on save using [godot.FileAccess.COMPRESSION_ZSTD]. Only available for binary resource types.
     */
    FLAG_COMPRESS(32),
    /**
     * Take over the paths of the saved subresources (see [godot.Resource.takeOverPath]).
     */
    FLAG_REPLACE_SUBRESOURCE_PATHS(64),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }
}

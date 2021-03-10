// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Singleton for saving Godot-specific resource types.
 *
 * Singleton for saving Godot-specific resource types to the filesystem.
 *
 * It uses the many [godot.ResourceFormatSaver] classes registered in the engine (either built-in or from a plugin) to save engine-specific resource data to text-based (e.g. `.tres` or `.tscn`) or binary files (e.g. `.res` or `.scn`).
 */
@GodotBaseType
object ResourceSaver : Object() {
  /**
   * Bundles external resources.
   */
  final const val FLAG_BUNDLE_RESOURCES: Long = 2

  /**
   * Changes the [godot.Resource.resourcePath] of the saved resource to match its new location.
   */
  final const val FLAG_CHANGE_PATH: Long = 4

  /**
   * Compress the resource on save using [godot.File.COMPRESSION_ZSTD]. Only available for binary resource types.
   */
  final const val FLAG_COMPRESS: Long = 32

  /**
   * Do not save editor-specific metadata (identified by their `__editor` prefix).
   */
  final const val FLAG_OMIT_EDITOR_PROPERTIES: Long = 8

  /**
   * Save the resource with a path relative to the scene which uses it.
   */
  final const val FLAG_RELATIVE_PATHS: Long = 1

  /**
   * Take over the paths of the saved subresources (see [godot.Resource.takeOverPath]).
   */
  final const val FLAG_REPLACE_SUBRESOURCE_PATHS: Long = 64

  /**
   * Save as big endian (see [godot.File.endianSwap]).
   */
  final const val FLAG_SAVE_BIG_ENDIAN: Long = 16

  override fun __new() {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_RESOURCESAVER)
  }

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Returns the list of extensions available for saving a resource of a given type.
   */
  fun getRecognizedExtensions(type: Resource): PoolStringArray {
    TransferContext.writeArguments(OBJECT to type)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS__RESOURCESAVER_GET_RECOGNIZED_EXTENSIONS, POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Saves a resource to disk to the given path, using a [godot.ResourceFormatSaver] that recognizes the resource object.
   *
   * The `flags` bitmask can be specified to customize the save behavior.
   *
   * Returns [OK] on success.
   */
  fun save(
    path: String,
    resource: Resource,
    flags: Long = 0
  ): GodotError {
    TransferContext.writeArguments(STRING to path, OBJECT to resource, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__RESOURCESAVER_SAVE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  enum class SaverFlags(
    id: Long
  ) {
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
     * Save as big endian (see [godot.File.endianSwap]).
     */
    FLAG_SAVE_BIG_ENDIAN(16),

    /**
     * Compress the resource on save using [godot.File.COMPRESSION_ZSTD]. Only available for binary resource types.
     */
    FLAG_COMPRESS(32),

    /**
     * Take over the paths of the saved subresources (see [godot.Resource.takeOverPath]).
     */
    FLAG_REPLACE_SUBRESOURCE_PATHS(64);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 * Loads a specific resource type from a file.
 *
 * Godot loads resources in the editor or in exported games using ResourceFormatLoaders. They are queried automatically via the [godot.ResourceLoader] singleton, or when a resource with internal dependencies is loaded. Each file type may load as a different resource type, so multiple ResourceFormatLoaders are registered in the engine.
 *
 * Extending this class allows you to define your own loader. Be sure to respect the documented return types and values. You should give it a global class name with `class_name` for it to be registered. Like built-in ResourceFormatLoaders, it will be called automatically when loading resources of its handled type(s). You may also implement a [godot.ResourceFormatSaver].
 *
 * **Note:** You can also extend [godot.EditorImportPlugin] if the resource type you need exists but Godot is unable to load its format. Choosing one way over another depends on if the format is suitable or not for the final exported game. For example, it's better to import `.png` textures as `.ctex` ([godot.CompressedTexture2D]) first, so they can be loaded with better efficiency on the graphics card.
 */
@GodotBaseType
public open class ResourceFormatLoader : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCEFORMATLOADER, scriptIndex)
    return true
  }

  /**
   * Gets the list of extensions for files this loader is able to read.
   */
  public open fun _getRecognizedExtensions(): PackedStringArray {
    throw NotImplementedError("_get_recognized_extensions is not implemented for ResourceFormatLoader")
  }

  /**
   * Tells whether or not this loader should load a resource from its resource path for a given type.
   *
   * If it is not implemented, the default behavior returns whether the path's extension is within the ones provided by [_getRecognizedExtensions], and if the type is within the ones provided by [_getResourceType].
   */
  public open fun _recognizePath(path: String, type: StringName): Boolean {
    throw NotImplementedError("_recognize_path is not implemented for ResourceFormatLoader")
  }

  /**
   * Tells which resource class this loader can load.
   *
   * **Note:** Custom resource types defined by scripts aren't known by the [godot.ClassDB], so you might just handle `"Resource"` for them.
   */
  public open fun _handlesType(type: StringName): Boolean {
    throw NotImplementedError("_handles_type is not implemented for ResourceFormatLoader")
  }

  /**
   * Gets the class name of the resource associated with the given path. If the loader cannot handle it, it should return `""`.
   *
   * **Note:** Custom resource types defined by scripts aren't known by the [godot.ClassDB], so you might just return `"Resource"` for them.
   */
  public open fun _getResourceType(path: String): String {
    throw NotImplementedError("_get_resource_type is not implemented for ResourceFormatLoader")
  }

  /**
   * Returns the script class name associated with the [godot.Resource] under the given [path]. If the resource has no script or the script isn't a named class, it should return `""`.
   */
  public open fun _getResourceScriptClass(path: String): String {
    throw NotImplementedError("_get_resource_script_class is not implemented for ResourceFormatLoader")
  }

  /**
   *
   */
  public open fun _getResourceUid(path: String): Long {
    throw NotImplementedError("_get_resource_uid is not implemented for ResourceFormatLoader")
  }

  /**
   * If implemented, gets the dependencies of a given resource. If [addTypes] is `true`, paths should be appended `::TypeName`, where `TypeName` is the class name of the dependency.
   *
   * **Note:** Custom resource types defined by scripts aren't known by the [godot.ClassDB], so you might just return `"Resource"` for them.
   */
  public open fun _getDependencies(path: String, addTypes: Boolean): PackedStringArray {
    throw NotImplementedError("_get_dependencies is not implemented for ResourceFormatLoader")
  }

  /**
   * If implemented, renames dependencies within the given resource and saves it. [renames] is a dictionary `{ String => String }` mapping old dependency paths to new paths.
   *
   * Returns [OK] on success, or an [enum Error] constant in case of failure.
   */
  public open fun _renameDependencies(path: String, renames: Dictionary<Any?, Any?>): GodotError {
    throw NotImplementedError("_rename_dependencies is not implemented for ResourceFormatLoader")
  }

  /**
   *
   */
  public open fun _exists(path: String): Boolean {
    throw NotImplementedError("_exists is not implemented for ResourceFormatLoader")
  }

  /**
   *
   */
  public open fun _getClassesUsed(path: String): PackedStringArray {
    throw NotImplementedError("_get_classes_used is not implemented for ResourceFormatLoader")
  }

  /**
   * Loads a resource when the engine finds this loader to be compatible. If the loaded resource is the result of an import, [originalPath] will target the source file. Returns a [godot.Resource] object on success, or an [enum Error] constant in case of failure.
   *
   * The [cacheMode] property defines whether and how the cache should be used or updated when loading the resource. See [enum CacheMode] for details.
   */
  public open fun _load(
    path: String,
    originalPath: String,
    useSubThreads: Boolean,
    cacheMode: Int,
  ): Any? {
    throw NotImplementedError("_load is not implemented for ResourceFormatLoader")
  }

  public enum class CacheMode(
    id: Long,
  ) {
    /**
     *
     */
    CACHE_MODE_IGNORE(0),
    /**
     *
     */
    CACHE_MODE_REUSE(1),
    /**
     *
     */
    CACHE_MODE_REPLACE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val _getRecognizedExtensionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatLoader", "_get_recognized_extensions")

    public val _recognizePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatLoader", "_recognize_path")

    public val _handlesTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatLoader", "_handles_type")

    public val _getResourceTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatLoader", "_get_resource_type")

    public val _getResourceScriptClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatLoader", "_get_resource_script_class")

    public val _getResourceUidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatLoader", "_get_resource_uid")

    public val _getDependenciesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatLoader", "_get_dependencies")

    public val _renameDependenciesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatLoader", "_rename_dependencies")

    public val _existsPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceFormatLoader", "_exists")

    public val _getClassesUsedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourceFormatLoader", "_get_classes_used")

    public val _loadPtr: VoidPtr = TypeManager.getMethodBindPtr("ResourceFormatLoader", "_load")
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import kotlin.Any
import kotlin.Boolean
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
 * **Note:** You can also extend [godot.EditorImportPlugin] if the resource type you need exists but Godot is unable to load its format. Choosing one way over another depends on if the format is suitable or not for the final exported game. For example, it's better to import `.png` textures as `.stex` ([godot.StreamTexture]) first, so they can be loaded with better efficiency on the graphics card.
 */
@GodotBaseType
open class ResourceFormatLoader : Reference() {
  override fun __new() {
    callConstructor(ENGINECLASS_RESOURCEFORMATLOADER)
  }

  /**
   * If implemented, gets the dependencies of a given resource. If `add_types` is `true`, paths should be appended `::TypeName`, where `TypeName` is the class name of the dependency.
   *
   * **Note:** Custom resource types defined by scripts aren't known by the [godot.ClassDB], so you might just return `"Resource"` for them.
   */
  open fun _getDependencies(path: String, addTypes: String) {
  }

  /**
   * Gets the list of extensions for files this loader is able to read.
   */
  open fun _getRecognizedExtensions(): PoolStringArray {
    throw
        NotImplementedError("get_recognized_extensions is not implemented for ResourceFormatLoader")
  }

  /**
   * Gets the class name of the resource associated with the given path. If the loader cannot handle it, it should return `""`.
   *
   * **Note:** Custom resource types defined by scripts aren't known by the [godot.ClassDB], so you might just return `"Resource"` for them.
   */
  open fun _getResourceType(path: String): String {
    throw NotImplementedError("get_resource_type is not implemented for ResourceFormatLoader")
  }

  /**
   * Tells which resource class this loader can load.
   *
   * **Note:** Custom resource types defined by scripts aren't known by the [godot.ClassDB], so you might just handle `"Resource"` for them.
   */
  open fun _handlesType(typename: String): Boolean {
    throw NotImplementedError("handles_type is not implemented for ResourceFormatLoader")
  }

  /**
   * Loads a resource when the engine finds this loader to be compatible. If the loaded resource is the result of an import, `original_path` will target the source file. Returns a [godot.Resource] object on success, or an [enum Error] constant in case of failure.
   */
  open fun _load(path: String, originalPath: String): Any? {
    throw NotImplementedError("load is not implemented for ResourceFormatLoader")
  }

  /**
   * If implemented, renames dependencies within the given resource and saves it. `renames` is a dictionary `{ String => String }` mapping old dependency paths to new paths.
   *
   * Returns [OK] on success, or an [enum Error] constant in case of failure.
   */
  open fun _renameDependencies(path: String, renames: String): Long {
    throw NotImplementedError("rename_dependencies is not implemented for ResourceFormatLoader")
  }
}

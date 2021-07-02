// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolStringArray
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Saves a specific resource type to a file.
 *
 * The engine can save resources when you do it from the editor, or when you use the [godot.ResourceSaver] singleton. This is accomplished thanks to multiple [godot.ResourceFormatSaver]s, each handling its own format and called automatically by the engine.
 *
 * By default, Godot saves resources as `.tres` (text-based), `.res` (binary) or another built-in format, but you can choose to create your own format by extending this class. Be sure to respect the documented return types and values. You should give it a global class name with `class_name` for it to be registered. Like built-in ResourceFormatSavers, it will be called automatically when saving resources of its recognized type(s). You may also implement a [godot.ResourceFormatLoader].
 */
@GodotBaseType
public open class ResourceFormatSaver : Reference() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RESOURCEFORMATSAVER)
  }

  /**
   * Returns the list of extensions available for saving the resource object, provided it is recognized (see [recognize]).
   */
  public open fun _getRecognizedExtensions(resource: Resource): PoolStringArray {
    throw
        NotImplementedError("get_recognized_extensions is not implemented for ResourceFormatSaver")
  }

  /**
   * Returns whether the given resource object can be saved by this saver.
   */
  public open fun _recognize(resource: Resource): Boolean {
    throw NotImplementedError("recognize is not implemented for ResourceFormatSaver")
  }

  /**
   * Saves the given resource object to a file at the target `path`. `flags` is a bitmask composed with [enum ResourceSaver.SaverFlags] constants.
   *
   * Returns [OK] on success, or an [enum Error] constant in case of failure.
   */
  public open fun _save(
    path: String,
    resource: Resource,
    flags: Long
  ): Long {
    throw NotImplementedError("save is not implemented for ResourceFormatSaver")
  }
}

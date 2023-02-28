// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 * Saves a specific resource type to a file.
 *
 * The engine can save resources when you do it from the editor, or when you use the [godot.ResourceSaver] singleton. This is accomplished thanks to multiple [godot.ResourceFormatSaver]s, each handling its own format and called automatically by the engine.
 *
 * By default, Godot saves resources as `.tres` (text-based), `.res` (binary) or another built-in format, but you can choose to create your own format by extending this class. Be sure to respect the documented return types and values. You should give it a global class name with `class_name` for it to be registered. Like built-in ResourceFormatSavers, it will be called automatically when saving resources of its recognized type(s). You may also implement a [godot.ResourceFormatLoader].
 */
@GodotBaseType
public open class ResourceFormatSaver : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RESOURCEFORMATSAVER, scriptIndex)
    return true
  }

  /**
   * Saves the given resource object to a file at the target [path]. [flags] is a bitmask composed with [enum ResourceSaver.SaverFlags] constants.
   *
   * Returns [OK] on success, or an [enum Error] constant in case of failure.
   */
  public open fun _save(
    resource: Resource,
    path: String,
    flags: Long
  ): GodotError {
    throw NotImplementedError("_save is not implemented for ResourceFormatSaver")
  }

  /**
   * Sets a new UID for the resource at the given [path]. Returns [OK] on success, or an [enum Error] constant in case of failure.
   */
  public open fun _setUid(path: String, uid: Long): GodotError {
    throw NotImplementedError("_set_uid is not implemented for ResourceFormatSaver")
  }

  /**
   * Returns whether the given resource object can be saved by this saver.
   */
  public open fun _recognize(resource: Resource): Boolean {
    throw NotImplementedError("_recognize is not implemented for ResourceFormatSaver")
  }

  /**
   * Returns the list of extensions available for saving the resource object, provided it is recognized (see [_recognize]).
   */
  public open fun _getRecognizedExtensions(resource: Resource): PackedStringArray {
    throw NotImplementedError("_get_recognized_extensions is not implemented for ResourceFormatSaver")
  }

  /**
   * Returns `true` if this saver handles a given save path and `false` otherwise.
   *
   * If this method is not implemented, the default behavior returns whether the path's extension is within the ones provided by [_getRecognizedExtensions].
   */
  public open fun _recognizePath(resource: Resource, path: String): Boolean {
    throw NotImplementedError("_recognize_path is not implemented for ResourceFormatSaver")
  }

  public companion object
}

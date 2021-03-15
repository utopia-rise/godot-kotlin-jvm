// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import kotlin.Boolean
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
open class ResourceFormatSaver : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_RESOURCEFORMATSAVER,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  /**
   * Returns the list of extensions available for saving the resource object, provided it is recognized (see [recognize]).
   */
  open fun _getRecognizedExtensions(resource: Resource): PoolStringArray {
    throw
        NotImplementedError("get_recognized_extensions is not implemented for ResourceFormatSaver")
  }

  /**
   * Returns whether the given resource object can be saved by this saver.
   */
  open fun _recognize(resource: Resource): Boolean {
    throw NotImplementedError("recognize is not implemented for ResourceFormatSaver")
  }

  /**
   * Saves the given resource object to a file at the target `path`. `flags` is a bitmask composed with [enum ResourceSaver.SaverFlags] constants.
   *
   * Returns [OK] on success, or an [enum Error] constant in case of failure.
   */
  open fun _save(
    path: String,
    resource: Resource,
    flags: Long
  ): Long {
    throw NotImplementedError("save is not implemented for ResourceFormatSaver")
  }
}

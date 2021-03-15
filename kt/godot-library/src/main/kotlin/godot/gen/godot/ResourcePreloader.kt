// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 * Resource Preloader Node.
 *
 * This node is used to preload sub-resources inside a scene, so when the scene is loaded, all the resources are ready to use and can be retrieved from the preloader.
 *
 * GDScript has a simplified [@GDScript.preload] built-in method which can be used in most situations, leaving the use of [godot.ResourcePreloader] for more advanced scenarios.
 */
@GodotBaseType
open class ResourcePreloader : Node() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_RESOURCEPRELOADER,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _getResources(): VariantArray<Any?> {
    throw NotImplementedError("_get_resources is not implemented for ResourcePreloader")
  }

  open fun _setResources(arg0: VariantArray<Any?>) {
  }

  /**
   * Adds a resource to the preloader with the given `name`. If a resource with the given `name` already exists, the new resource will be renamed to "`name` N" where N is an incrementing number starting from 2.
   */
  open fun addResource(name: String, resource: Resource) {
    TransferContext.writeArguments(STRING to name, OBJECT to resource)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEPRELOADER_ADD_RESOURCE, NIL)
  }

  /**
   * Returns the resource associated to `name`.
   */
  open fun getResource(name: String): Resource? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEPRELOADER_GET_RESOURCE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Resource?
  }

  /**
   * Returns the list of resources inside the preloader.
   */
  open fun getResourceList(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEPRELOADER_GET_RESOURCE_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns `true` if the preloader contains a resource associated to `name`.
   */
  open fun hasResource(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEPRELOADER_HAS_RESOURCE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes the resource associated to `name` from the preloader.
   */
  open fun removeResource(name: String) {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEPRELOADER_REMOVE_RESOURCE,
        NIL)
  }

  /**
   * Renames a resource inside the preloader from `name` to `newname`.
   */
  open fun renameResource(name: String, newname: String) {
    TransferContext.writeArguments(STRING to name, STRING to newname)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEPRELOADER_RENAME_RESOURCE,
        NIL)
  }
}

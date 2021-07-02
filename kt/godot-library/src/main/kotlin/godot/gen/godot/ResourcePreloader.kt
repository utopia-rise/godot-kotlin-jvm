// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
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
import kotlin.Unit

/**
 * Resource Preloader Node.
 *
 * This node is used to preload sub-resources inside a scene, so when the scene is loaded, all the resources are ready to use and can be retrieved from the preloader.
 *
 * GDScript has a simplified [@GDScript.preload] built-in method which can be used in most situations, leaving the use of [godot.ResourcePreloader] for more advanced scenarios.
 */
@GodotBaseType
public open class ResourcePreloader : Node() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RESOURCEPRELOADER)
  }

  public open fun _getResources(): VariantArray<Any?> {
    throw NotImplementedError("_get_resources is not implemented for ResourcePreloader")
  }

  public open fun _setResources(arg0: VariantArray<Any?>): Unit {
  }

  /**
   * Adds a resource to the preloader with the given `name`. If a resource with the given `name` already exists, the new resource will be renamed to "`name` N" where N is an incrementing number starting from 2.
   */
  public open fun addResource(name: String, resource: Resource): Unit {
    TransferContext.writeArguments(STRING to name, OBJECT to resource)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEPRELOADER_ADD_RESOURCE, NIL)
  }

  /**
   * Returns the resource associated to `name`.
   */
  public open fun getResource(name: String): Resource? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEPRELOADER_GET_RESOURCE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Resource?
  }

  /**
   * Returns the list of resources inside the preloader.
   */
  public open fun getResourceList(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEPRELOADER_GET_RESOURCE_LIST,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  /**
   * Returns `true` if the preloader contains a resource associated to `name`.
   */
  public open fun hasResource(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEPRELOADER_HAS_RESOURCE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes the resource associated to `name` from the preloader.
   */
  public open fun removeResource(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEPRELOADER_REMOVE_RESOURCE,
        NIL)
  }

  /**
   * Renames a resource inside the preloader from `name` to `newname`.
   */
  public open fun renameResource(name: String, newname: String): Unit {
    TransferContext.writeArguments(STRING to name, STRING to newname)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCEPRELOADER_RENAME_RESOURCE,
        NIL)
  }
}

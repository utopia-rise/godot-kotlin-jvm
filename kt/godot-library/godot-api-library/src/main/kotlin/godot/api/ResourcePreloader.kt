// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedStringName
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * This node is used to preload sub-resources inside a scene, so when the scene is loaded, all the resources are ready to use and can be retrieved from the preloader. You can add the resources using the ResourcePreloader tab when the node is selected.
 *
 * GDScript has a simplified [@GDScript.preload] built-in method which can be used in most situations, leaving the use of [ResourcePreloader] for more advanced scenarios.
 */
@GodotBaseType
public open class ResourcePreloader : Node() {
  override fun new(scriptIndex: Int) {
    createNativeObject(557, scriptIndex)
  }

  /**
   * Adds a resource to the preloader with the given [name]. If a resource with the given [name] already exists, the new resource will be renamed to "[name] N" where N is an incrementing number starting from 2.
   */
  public final fun addResource(name: StringName, resource: Resource?) {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to resource)
    TransferContext.callMethod(ptr, MethodBindings.addResourcePtr, NIL)
  }

  /**
   * Removes the resource associated to [name] from the preloader.
   */
  public final fun removeResource(name: StringName) {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.removeResourcePtr, NIL)
  }

  /**
   * Renames a resource inside the preloader from [name] to [newname].
   */
  public final fun renameResource(name: StringName, newname: StringName) {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to newname)
    TransferContext.callMethod(ptr, MethodBindings.renameResourcePtr, NIL)
  }

  /**
   * Returns `true` if the preloader contains a resource associated to [name].
   */
  public final fun hasResource(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.hasResourcePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the resource associated to [name].
   */
  public final fun getResource(name: StringName): Resource? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.getResourcePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Resource?)
  }

  /**
   * Returns the list of resources inside the preloader.
   */
  public final fun getResourceList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getResourceListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Adds a resource to the preloader with the given [name]. If a resource with the given [name] already exists, the new resource will be renamed to "[name] N" where N is an incrementing number starting from 2.
   */
  public final fun addResource(name: String, resource: Resource?): Unit = addResource(name.asCachedStringName(), resource)

  /**
   * Removes the resource associated to [name] from the preloader.
   */
  public final fun removeResource(name: String): Unit = removeResource(name.asCachedStringName())

  /**
   * Renames a resource inside the preloader from [name] to [newname].
   */
  public final fun renameResource(name: String, newname: String): Unit = renameResource(name.asCachedStringName(), newname.asCachedStringName())

  /**
   * Returns `true` if the preloader contains a resource associated to [name].
   */
  public final fun hasResource(name: String): Boolean = hasResource(name.asCachedStringName())

  /**
   * Returns the resource associated to [name].
   */
  public final fun getResource(name: String): Resource? = getResource(name.asCachedStringName())

  public companion object

  public object MethodBindings {
    internal val addResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourcePreloader", "add_resource", 1_168_801_743)

    internal val removeResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourcePreloader", "remove_resource", 3_304_788_590)

    internal val renameResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourcePreloader", "rename_resource", 3_740_211_285)

    internal val hasResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourcePreloader", "has_resource", 2_619_796_661)

    internal val getResourcePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourcePreloader", "get_resource", 3_742_749_261)

    internal val getResourceListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ResourcePreloader", "get_resource_list", 1_139_954_409)
  }
}

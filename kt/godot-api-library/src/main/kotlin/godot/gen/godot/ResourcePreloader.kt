// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING_NAME
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_RESOURCEPRELOADER_INDEX: Int = 551

/**
 * This node is used to preload sub-resources inside a scene, so when the scene is loaded, all the
 * resources are ready to use and can be retrieved from the preloader. You can add the resources using
 * the ResourcePreloader tab when the node is selected.
 * GDScript has a simplified [@GDScript.preload] built-in method which can be used in most
 * situations, leaving the use of [ResourcePreloader] for more advanced scenarios.
 */
@GodotBaseType
public open class ResourcePreloader : Node() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_RESOURCEPRELOADER_INDEX, scriptIndex)
  }

  /**
   * Adds a resource to the preloader with the given [name]. If a resource with the given [name]
   * already exists, the new resource will be renamed to "[name] N" where N is an incrementing number
   * starting from 2.
   */
  public final fun addResource(name: StringName, resource: Resource?): Unit {
    Internals.writeArguments(STRING_NAME to name, OBJECT to resource)
    Internals.callMethod(rawPtr, MethodBindings.addResourcePtr, NIL)
  }

  /**
   * Removes the resource associated to [name] from the preloader.
   */
  public final fun removeResource(name: StringName): Unit {
    Internals.writeArguments(STRING_NAME to name)
    Internals.callMethod(rawPtr, MethodBindings.removeResourcePtr, NIL)
  }

  /**
   * Renames a resource inside the preloader from [name] to [newname].
   */
  public final fun renameResource(name: StringName, newname: StringName): Unit {
    Internals.writeArguments(STRING_NAME to name, STRING_NAME to newname)
    Internals.callMethod(rawPtr, MethodBindings.renameResourcePtr, NIL)
  }

  /**
   * Returns `true` if the preloader contains a resource associated to [name].
   */
  public final fun hasResource(name: StringName): Boolean {
    Internals.writeArguments(STRING_NAME to name)
    Internals.callMethod(rawPtr, MethodBindings.hasResourcePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the resource associated to [name].
   */
  public final fun getResource(name: StringName): Resource? {
    Internals.writeArguments(STRING_NAME to name)
    Internals.callMethod(rawPtr, MethodBindings.getResourcePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Resource?)
  }

  /**
   * Returns the list of resources inside the preloader.
   */
  public final fun getResourceList(): PackedStringArray {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getResourceListPtr, PACKED_STRING_ARRAY)
    return (Internals.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  public companion object

  internal object MethodBindings {
    public val addResourcePtr: VoidPtr =
        Internals.getMethodBindPtr("ResourcePreloader", "add_resource", 1168801743)

    public val removeResourcePtr: VoidPtr =
        Internals.getMethodBindPtr("ResourcePreloader", "remove_resource", 3304788590)

    public val renameResourcePtr: VoidPtr =
        Internals.getMethodBindPtr("ResourcePreloader", "rename_resource", 3740211285)

    public val hasResourcePtr: VoidPtr =
        Internals.getMethodBindPtr("ResourcePreloader", "has_resource", 2619796661)

    public val getResourcePtr: VoidPtr =
        Internals.getMethodBindPtr("ResourcePreloader", "get_resource", 3742749261)

    public val getResourceListPtr: VoidPtr =
        Internals.getMethodBindPtr("ResourcePreloader", "get_resource_list", 1139954409)
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.STRING
import godot.core.VariantParser.TRANSFORM3D
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_MESHLIBRARY_INDEX: Int = 371

/**
 * A library of meshes. Contains a list of [Mesh] resources, each with a name and ID. Each item can
 * also include collision and navigation shapes. This resource is used in [GridMap].
 */
@GodotBaseType
public open class MeshLibrary : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_MESHLIBRARY_INDEX, scriptIndex)
  }

  /**
   * Creates a new item in the library with the given ID.
   * You can get an unused ID from [getLastUnusedItemId].
   */
  public final fun createItem(id: Int): Unit {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.createItemPtr, NIL)
  }

  /**
   * Sets the item's name.
   * This name is shown in the editor. It can also be used to look up the item later using
   * [findItemByName].
   */
  public final fun setItemName(id: Int, name: String): Unit {
    Internals.writeArguments(LONG to id.toLong(), STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.setItemNamePtr, NIL)
  }

  /**
   * Sets the item's mesh.
   */
  public final fun setItemMesh(id: Int, mesh: Mesh?): Unit {
    Internals.writeArguments(LONG to id.toLong(), OBJECT to mesh)
    Internals.callMethod(rawPtr, MethodBindings.setItemMeshPtr, NIL)
  }

  /**
   * Sets the transform to apply to the item's mesh.
   */
  public final fun setItemMeshTransform(id: Int, meshTransform: Transform3D): Unit {
    Internals.writeArguments(LONG to id.toLong(), TRANSFORM3D to meshTransform)
    Internals.callMethod(rawPtr, MethodBindings.setItemMeshTransformPtr, NIL)
  }

  /**
   * Sets the item's navigation mesh.
   */
  public final fun setItemNavigationMesh(id: Int, navigationMesh: NavigationMesh?): Unit {
    Internals.writeArguments(LONG to id.toLong(), OBJECT to navigationMesh)
    Internals.callMethod(rawPtr, MethodBindings.setItemNavigationMeshPtr, NIL)
  }

  /**
   * Sets the transform to apply to the item's navigation mesh.
   */
  public final fun setItemNavigationMeshTransform(id: Int, navigationMesh: Transform3D): Unit {
    Internals.writeArguments(LONG to id.toLong(), TRANSFORM3D to navigationMesh)
    Internals.callMethod(rawPtr, MethodBindings.setItemNavigationMeshTransformPtr, NIL)
  }

  /**
   * Sets the item's navigation layers bitmask.
   */
  public final fun setItemNavigationLayers(id: Int, navigationLayers: Long): Unit {
    Internals.writeArguments(LONG to id.toLong(), LONG to navigationLayers)
    Internals.callMethod(rawPtr, MethodBindings.setItemNavigationLayersPtr, NIL)
  }

  /**
   * Sets an item's collision shapes.
   * The array should consist of [Shape3D] objects, each followed by a [Transform3D] that will be
   * applied to it. For shapes that should not have a transform, use [Transform3D.IDENTITY].
   */
  public final fun setItemShapes(id: Int, shapes: VariantArray<Any?>): Unit {
    Internals.writeArguments(LONG to id.toLong(), ARRAY to shapes)
    Internals.callMethod(rawPtr, MethodBindings.setItemShapesPtr, NIL)
  }

  /**
   * Sets a texture to use as the item's preview icon in the editor.
   */
  public final fun setItemPreview(id: Int, texture: Texture2D?): Unit {
    Internals.writeArguments(LONG to id.toLong(), OBJECT to texture)
    Internals.callMethod(rawPtr, MethodBindings.setItemPreviewPtr, NIL)
  }

  /**
   * Returns the item's name.
   */
  public final fun getItemName(id: Int): String {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the item's mesh.
   */
  public final fun getItemMesh(id: Int): Mesh? {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemMeshPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Mesh?)
  }

  /**
   * Returns the transform applied to the item's mesh.
   */
  public final fun getItemMeshTransform(id: Int): Transform3D {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemMeshTransformPtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Returns the item's navigation mesh.
   */
  public final fun getItemNavigationMesh(id: Int): NavigationMesh? {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemNavigationMeshPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as NavigationMesh?)
  }

  /**
   * Returns the transform applied to the item's navigation mesh.
   */
  public final fun getItemNavigationMeshTransform(id: Int): Transform3D {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemNavigationMeshTransformPtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Returns the item's navigation layers bitmask.
   */
  public final fun getItemNavigationLayers(id: Int): Long {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemNavigationLayersPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns an item's collision shapes.
   * The array consists of each [Shape3D] followed by its [Transform3D].
   */
  public final fun getItemShapes(id: Int): VariantArray<Any?> {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemShapesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * When running in the editor, returns a generated item preview (a 3D rendering in isometric
   * perspective). When used in a running project, returns the manually-defined item preview which can
   * be set using [setItemPreview]. Returns an empty [Texture2D] if no preview was manually set in a
   * running project.
   */
  public final fun getItemPreview(id: Int): Texture2D? {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getItemPreviewPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Removes the item.
   */
  public final fun removeItem(id: Int): Unit {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.removeItemPtr, NIL)
  }

  /**
   * Returns the first item with the given name, or `-1` if no item is found.
   */
  public final fun findItemByName(name: String): Int {
    Internals.writeArguments(STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.findItemByNamePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Clears the library.
   */
  public final fun clear(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns the list of item IDs in use.
   */
  public final fun getItemList(): PackedInt32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getItemListPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Gets an unused ID for a new item.
   */
  public final fun getLastUnusedItemId(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLastUnusedItemIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val createItemPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "create_item", 1286410249)

    public val setItemNamePtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "set_item_name", 501894301)

    public val setItemMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "set_item_mesh", 969122797)

    public val setItemMeshTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "set_item_mesh_transform", 3616898986)

    public val setItemNavigationMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "set_item_navigation_mesh", 3483353960)

    public val setItemNavigationMeshTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "set_item_navigation_mesh_transform", 3616898986)

    public val setItemNavigationLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "set_item_navigation_layers", 3937882851)

    public val setItemShapesPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "set_item_shapes", 537221740)

    public val setItemPreviewPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "set_item_preview", 666127730)

    public val getItemNamePtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "get_item_name", 844755477)

    public val getItemMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "get_item_mesh", 1576363275)

    public val getItemMeshTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "get_item_mesh_transform", 1965739696)

    public val getItemNavigationMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "get_item_navigation_mesh", 2729647406)

    public val getItemNavigationMeshTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "get_item_navigation_mesh_transform", 1965739696)

    public val getItemNavigationLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "get_item_navigation_layers", 923996154)

    public val getItemShapesPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "get_item_shapes", 663333327)

    public val getItemPreviewPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "get_item_preview", 3536238170)

    public val removeItemPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "remove_item", 1286410249)

    public val findItemByNamePtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "find_item_by_name", 1321353865)

    public val clearPtr: VoidPtr = Internals.getMethodBindPtr("MeshLibrary", "clear", 3218959716)

    public val getItemListPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "get_item_list", 1930428628)

    public val getLastUnusedItemIdPtr: VoidPtr =
        Internals.getMethodBindPtr("MeshLibrary", "get_last_unused_item_id", 3905245786)
  }
}

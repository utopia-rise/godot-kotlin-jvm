// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.TransferContext
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM3D
import kotlin.Any
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Library of meshes.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/125](https://godotengine.org/asset-library/asset/125)
 *
 * A library of meshes. Contains a list of [godot.Mesh] resources, each with a name and ID. Each item can also include collision and navigation shapes. This resource is used in [godot.GridMap].
 */
@GodotBaseType
public open class MeshLibrary : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_MESHLIBRARY)
  }

  /**
   * Creates a new item in the library with the given ID.
   *
   * You can get an unused ID from [getLastUnusedItemId].
   */
  public open fun createItem(id: Long): Unit {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_CREATE_ITEM, NIL)
  }

  /**
   * Sets the item's name.
   *
   * This name is shown in the editor. It can also be used to look up the item later using [findItemByName].
   */
  public open fun setItemName(id: Long, name: String): Unit {
    TransferContext.writeArguments(LONG to id, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_NAME, NIL)
  }

  /**
   * Sets the item's mesh.
   */
  public open fun setItemMesh(id: Long, mesh: Mesh): Unit {
    TransferContext.writeArguments(LONG to id, OBJECT to mesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_MESH, NIL)
  }

  /**
   * Sets the transform to apply to the item's mesh.
   */
  public open fun setItemMeshTransform(id: Long, meshTransform: Transform3D): Unit {
    TransferContext.writeArguments(LONG to id, TRANSFORM3D to meshTransform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_MESH_TRANSFORM,
        NIL)
  }

  /**
   * Sets the item's navigation mesh.
   */
  public open fun setItemNavmesh(id: Long, navmesh: NavigationMesh): Unit {
    TransferContext.writeArguments(LONG to id, OBJECT to navmesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_NAVMESH, NIL)
  }

  /**
   * Sets the transform to apply to the item's navigation mesh.
   */
  public open fun setItemNavmeshTransform(id: Long, navmesh: Transform3D): Unit {
    TransferContext.writeArguments(LONG to id, TRANSFORM3D to navmesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_NAVMESH_TRANSFORM, NIL)
  }

  /**
   * Sets an item's collision shapes.
   *
   * The array should consist of [godot.Shape3D] objects, each followed by a [godot.Transform3D] that will be applied to it. For shapes that should not have a transform, use [godot.Transform3D.IDENTITY].
   */
  public open fun setItemShapes(id: Long, shapes: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(LONG to id, ARRAY to shapes)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_SHAPES, NIL)
  }

  /**
   * Sets a texture to use as the item's preview icon in the editor.
   */
  public open fun setItemPreview(id: Long, texture: Texture2D): Unit {
    TransferContext.writeArguments(LONG to id, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_PREVIEW, NIL)
  }

  /**
   * Returns the item's name.
   */
  public open fun getItemName(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the item's mesh.
   */
  public open fun getItemMesh(id: Long): Mesh? {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_MESH, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Mesh?
  }

  /**
   * Returns the transform applied to the item's mesh.
   */
  public open fun getItemMeshTransform(id: Long): Transform3D {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_MESH_TRANSFORM,
        TRANSFORM3D)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   * Returns the item's navigation mesh.
   */
  public open fun getItemNavmesh(id: Long): NavigationMesh? {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_NAVMESH,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as NavigationMesh?
  }

  /**
   * Returns the transform applied to the item's navigation mesh.
   */
  public open fun getItemNavmeshTransform(id: Long): Transform3D {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_NAVMESH_TRANSFORM, TRANSFORM3D)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   * Returns an item's collision shapes.
   *
   * The array consists of each [godot.Shape3D] followed by its [godot.Transform3D].
   */
  public open fun getItemShapes(id: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_SHAPES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * When running in the editor, returns a generated item preview (a 3D rendering in isometric perspective). When used in a running project, returns the manually-defined item preview which can be set using [setItemPreview]. Returns an empty [godot.Texture2D] if no preview was manually set in a running project.
   */
  public open fun getItemPreview(id: Long): Texture2D? {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_PREVIEW,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * Removes the item.
   */
  public open fun removeItem(id: Long): Unit {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_REMOVE_ITEM, NIL)
  }

  /**
   * Returns the first item with the given name.
   */
  public open fun findItemByName(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_FIND_ITEM_BY_NAME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Clears the library.
   */
  public open fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_CLEAR, NIL)
  }

  /**
   * Returns the list of item IDs in use.
   */
  public open fun getItemList(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_LIST,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Gets an unused ID for a new item.
   */
  public open fun getLastUnusedItemId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_LAST_UNUSED_ITEM_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public companion object
}

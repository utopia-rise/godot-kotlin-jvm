// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolIntArray
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_INT_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM
import kotlin.Any
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Library of meshes.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/125](https://godotengine.org/asset-library/asset/125)
 *
 * A library of meshes. Contains a list of [godot.Mesh] resources, each with a name and ID. Each item can also include collision and navigation shapes. This resource is used in [godot.GridMap].
 */
@GodotBaseType
open class MeshLibrary : Resource() {
  override fun __new() {
    callConstructor(ENGINECLASS_MESHLIBRARY)
  }

  /**
   * Clears the library.
   */
  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_CLEAR, NIL)
  }

  /**
   * Creates a new item in the library with the given ID.
   *
   * You can get an unused ID from [getLastUnusedItemId].
   */
  open fun createItem(id: Long) {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_CREATE_ITEM, NIL)
  }

  /**
   * Returns the first item with the given name.
   */
  open fun findItemByName(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_FIND_ITEM_BY_NAME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the list of item IDs in use.
   */
  open fun getItemList(): PoolIntArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_LIST,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  /**
   * Returns the item's mesh.
   */
  open fun getItemMesh(id: Long): Mesh? {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_MESH, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Mesh?
  }

  /**
   * Returns the item's name.
   */
  open fun getItemName(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the item's navigation mesh.
   */
  open fun getItemNavmesh(id: Long): NavigationMesh? {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_NAVMESH,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as NavigationMesh?
  }

  /**
   * Returns the transform applied to the item's navigation mesh.
   */
  open fun getItemNavmeshTransform(id: Long): Transform {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_NAVMESH_TRANSFORM, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * When running in the editor, returns a generated item preview (a 3D rendering in isometric perspective). When used in a running project, returns the manually-defined item preview which can be set using [setItemPreview]. Returns an empty [godot.Texture] if no preview was manually set in a running project.
   */
  open fun getItemPreview(id: Long): Texture? {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_PREVIEW,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  /**
   * Returns an item's collision shapes.
   *
   * The array consists of each [godot.Shape] followed by its [godot.core.Transform].
   */
  open fun getItemShapes(id: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_SHAPES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Gets an unused ID for a new item.
   */
  open fun getLastUnusedItemId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_LAST_UNUSED_ITEM_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes the item.
   */
  open fun removeItem(id: Long) {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_REMOVE_ITEM, NIL)
  }

  /**
   * Sets the item's mesh.
   */
  open fun setItemMesh(id: Long, mesh: Mesh) {
    TransferContext.writeArguments(LONG to id, OBJECT to mesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_MESH, NIL)
  }

  /**
   * Sets the item's name.
   *
   * This name is shown in the editor. It can also be used to look up the item later using [findItemByName].
   */
  open fun setItemName(id: Long, name: String) {
    TransferContext.writeArguments(LONG to id, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_NAME, NIL)
  }

  /**
   * Sets the item's navigation mesh.
   */
  open fun setItemNavmesh(id: Long, navmesh: NavigationMesh) {
    TransferContext.writeArguments(LONG to id, OBJECT to navmesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_NAVMESH, NIL)
  }

  /**
   * Sets the transform to apply to the item's navigation mesh.
   */
  open fun setItemNavmeshTransform(id: Long, navmesh: Transform) {
    TransferContext.writeArguments(LONG to id, TRANSFORM to navmesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_NAVMESH_TRANSFORM, NIL)
  }

  /**
   * Sets a texture to use as the item's preview icon in the editor.
   */
  open fun setItemPreview(id: Long, texture: Texture) {
    TransferContext.writeArguments(LONG to id, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_PREVIEW, NIL)
  }

  /**
   * Sets an item's collision shapes.
   *
   * The array should consist of [godot.Shape] objects, each followed by a [godot.core.Transform] that will be applied to it. For shapes that should not have a transform, use [godot.Transform.IDENTITY].
   */
  open fun setItemShapes(id: Long, shapes: VariantArray<Any?>) {
    TransferContext.writeArguments(LONG to id, ARRAY to shapes)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_SHAPES, NIL)
  }
}

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
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM3D
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
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
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MESHLIBRARY, scriptIndex)
    return true
  }

  /**
   * Creates a new item in the library with the given ID.
   *
   * You can get an unused ID from [getLastUnusedItemId].
   */
  public fun createItem(id: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_CREATE_ITEM, NIL)
  }

  /**
   * Sets the item's name.
   *
   * This name is shown in the editor. It can also be used to look up the item later using [findItemByName].
   */
  public fun setItemName(id: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_NAME, NIL)
  }

  /**
   * Sets the item's mesh.
   */
  public fun setItemMesh(id: Int, mesh: Mesh): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), OBJECT to mesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_MESH, NIL)
  }

  /**
   * Sets the transform to apply to the item's mesh.
   */
  public fun setItemMeshTransform(id: Int, meshTransform: Transform3D): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), TRANSFORM3D to meshTransform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_MESH_TRANSFORM,
        NIL)
  }

  /**
   * Sets the item's navigation mesh.
   */
  public fun setItemNavigationMesh(id: Int, navigationMesh: NavigationMesh): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), OBJECT to navigationMesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_NAVIGATION_MESH, NIL)
  }

  /**
   * Sets the transform to apply to the item's navigation mesh.
   */
  public fun setItemNavigationMeshTransform(id: Int, navigationMesh: Transform3D): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), TRANSFORM3D to navigationMesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_NAVIGATION_MESH_TRANSFORM, NIL)
  }

  /**
   * Sets the item's navigation layers bitmask.
   */
  public fun setItemNavigationLayers(id: Int, navigationLayers: Long): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), LONG to navigationLayers)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_NAVIGATION_LAYERS, NIL)
  }

  /**
   * Sets an item's collision shapes.
   *
   * The array should consist of [godot.Shape3D] objects, each followed by a [godot.Transform3D] that will be applied to it. For shapes that should not have a transform, use [godot.Transform3D.IDENTITY].
   */
  public fun setItemShapes(id: Int, shapes: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), ARRAY to shapes)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_SHAPES, NIL)
  }

  /**
   * Sets a texture to use as the item's preview icon in the editor.
   */
  public fun setItemPreview(id: Int, texture: Texture2D): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_PREVIEW, NIL)
  }

  /**
   * Returns the item's name.
   */
  public fun getItemName(id: Int): String {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_NAME, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the item's mesh.
   */
  public fun getItemMesh(id: Int): Mesh? {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_MESH, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Mesh?)
  }

  /**
   * Returns the transform applied to the item's mesh.
   */
  public fun getItemMeshTransform(id: Int): Transform3D {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_MESH_TRANSFORM,
        TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Returns the item's navigation mesh.
   */
  public fun getItemNavigationMesh(id: Int): NavigationMesh? {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_NAVIGATION_MESH, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as NavigationMesh?)
  }

  /**
   * Returns the transform applied to the item's navigation mesh.
   */
  public fun getItemNavigationMeshTransform(id: Int): Transform3D {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_NAVIGATION_MESH_TRANSFORM, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Returns the item's navigation layers bitmask.
   */
  public fun getItemNavigationLayers(id: Int): Long {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_NAVIGATION_LAYERS, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns an item's collision shapes.
   *
   * The array consists of each [godot.Shape3D] followed by its [godot.Transform3D].
   */
  public fun getItemShapes(id: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_SHAPES, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * When running in the editor, returns a generated item preview (a 3D rendering in isometric perspective). When used in a running project, returns the manually-defined item preview which can be set using [setItemPreview]. Returns an empty [godot.Texture2D] if no preview was manually set in a running project.
   */
  public fun getItemPreview(id: Int): Texture2D? {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_PREVIEW,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * Removes the item.
   */
  public fun removeItem(id: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_REMOVE_ITEM, NIL)
  }

  /**
   * Returns the first item with the given name.
   */
  public fun findItemByName(name: String): Int {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_FIND_ITEM_BY_NAME, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Clears the library.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_CLEAR, NIL)
  }

  /**
   * Returns the list of item IDs in use.
   */
  public fun getItemList(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_LIST,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Gets an unused ID for a new item.
   */
  public fun getLastUnusedItemId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_LAST_UNUSED_ITEM_ID,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object
}

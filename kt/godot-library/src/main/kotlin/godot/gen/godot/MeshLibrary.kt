// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class MeshLibrary : Resource() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_MESHLIBRARY)

  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_CLEAR, NIL)
  }

  open fun createItem(id: Long) {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_CREATE_ITEM, NIL)
  }

  open fun findItemByName(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_FIND_ITEM_BY_NAME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getItemList(): PoolIntArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_LIST,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  open fun getItemMesh(id: Long): Mesh? {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_MESH, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Mesh?
  }

  open fun getItemName(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getItemNavmesh(id: Long): NavigationMesh? {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_NAVMESH,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as NavigationMesh?
  }

  open fun getItemNavmeshTransform(id: Long): Transform {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_NAVMESH_TRANSFORM, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  open fun getItemPreview(id: Long): Texture? {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_PREVIEW,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  open fun getItemShapes(id: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_ITEM_SHAPES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun getLastUnusedItemId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_GET_LAST_UNUSED_ITEM_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun removeItem(id: Long) {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_REMOVE_ITEM, NIL)
  }

  open fun setItemMesh(id: Long, mesh: Mesh) {
    TransferContext.writeArguments(LONG to id, OBJECT to mesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_MESH, NIL)
  }

  open fun setItemName(id: Long, name: String) {
    TransferContext.writeArguments(LONG to id, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_NAME, NIL)
  }

  open fun setItemNavmesh(id: Long, navmesh: NavigationMesh) {
    TransferContext.writeArguments(LONG to id, OBJECT to navmesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_NAVMESH, NIL)
  }

  open fun setItemNavmeshTransform(id: Long, navmesh: Transform) {
    TransferContext.writeArguments(LONG to id, TRANSFORM to navmesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_NAVMESH_TRANSFORM, NIL)
  }

  open fun setItemPreview(id: Long, texture: Texture) {
    TransferContext.writeArguments(LONG to id, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_PREVIEW, NIL)
  }

  open fun setItemShapes(id: Long, shapes: VariantArray<Any?>) {
    TransferContext.writeArguments(LONG to id, ARRAY to shapes)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESHLIBRARY_SET_ITEM_SHAPES, NIL)
  }
}

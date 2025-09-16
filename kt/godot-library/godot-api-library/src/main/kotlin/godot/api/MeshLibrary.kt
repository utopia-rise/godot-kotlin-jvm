// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
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
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * A library of meshes. Contains a list of [Mesh] resources, each with a name and ID. Each item can also include collision and navigation shapes. This resource is used in [GridMap].
 */
@GodotBaseType
public open class MeshLibrary : Resource() {
  override fun new(scriptIndex: Int) {
    createNativeObject(356, scriptIndex)
  }

  /**
   * Creates a new item in the library with the given ID.
   *
   * You can get an unused ID from [getLastUnusedItemId].
   */
  public final fun createItem(id: Int) {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.createItemPtr, NIL)
  }

  /**
   * Sets the item's name.
   *
   * This name is shown in the editor. It can also be used to look up the item later using [findItemByName].
   */
  public final fun setItemName(id: Int, name: String) {
    TransferContext.writeArguments(LONG to id.toLong(), STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.setItemNamePtr, NIL)
  }

  /**
   * Sets the item's mesh.
   */
  public final fun setItemMesh(id: Int, mesh: Mesh?) {
    TransferContext.writeArguments(LONG to id.toLong(), OBJECT to mesh)
    TransferContext.callMethod(ptr, MethodBindings.setItemMeshPtr, NIL)
  }

  /**
   * Sets the transform to apply to the item's mesh.
   */
  public final fun setItemMeshTransform(id: Int, meshTransform: Transform3D) {
    TransferContext.writeArguments(LONG to id.toLong(), TRANSFORM3D to meshTransform)
    TransferContext.callMethod(ptr, MethodBindings.setItemMeshTransformPtr, NIL)
  }

  /**
   * Sets the item's shadow casting mode. See [RenderingServer.ShadowCastingSetting] for possible values.
   */
  public final fun setItemMeshCastShadow(id: Int, shadowCastingSetting: RenderingServer.ShadowCastingSetting) {
    TransferContext.writeArguments(LONG to id.toLong(), LONG to shadowCastingSetting.id)
    TransferContext.callMethod(ptr, MethodBindings.setItemMeshCastShadowPtr, NIL)
  }

  /**
   * Sets the item's navigation mesh.
   */
  public final fun setItemNavigationMesh(id: Int, navigationMesh: NavigationMesh?) {
    TransferContext.writeArguments(LONG to id.toLong(), OBJECT to navigationMesh)
    TransferContext.callMethod(ptr, MethodBindings.setItemNavigationMeshPtr, NIL)
  }

  /**
   * Sets the transform to apply to the item's navigation mesh.
   */
  public final fun setItemNavigationMeshTransform(id: Int, navigationMesh: Transform3D) {
    TransferContext.writeArguments(LONG to id.toLong(), TRANSFORM3D to navigationMesh)
    TransferContext.callMethod(ptr, MethodBindings.setItemNavigationMeshTransformPtr, NIL)
  }

  /**
   * Sets the item's navigation layers bitmask.
   */
  public final fun setItemNavigationLayers(id: Int, navigationLayers: Long) {
    TransferContext.writeArguments(LONG to id.toLong(), LONG to navigationLayers)
    TransferContext.callMethod(ptr, MethodBindings.setItemNavigationLayersPtr, NIL)
  }

  /**
   * Sets an item's collision shapes.
   *
   * The array should consist of [Shape3D] objects, each followed by a [Transform3D] that will be applied to it. For shapes that should not have a transform, use [Transform3D.IDENTITY].
   */
  public final fun setItemShapes(id: Int, shapes: VariantArray<Any?>) {
    TransferContext.writeArguments(LONG to id.toLong(), ARRAY to shapes)
    TransferContext.callMethod(ptr, MethodBindings.setItemShapesPtr, NIL)
  }

  /**
   * Sets a texture to use as the item's preview icon in the editor.
   */
  public final fun setItemPreview(id: Int, texture: Texture2D?) {
    TransferContext.writeArguments(LONG to id.toLong(), OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setItemPreviewPtr, NIL)
  }

  /**
   * Returns the item's name.
   */
  public final fun getItemName(id: Int): String {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the item's mesh.
   */
  public final fun getItemMesh(id: Int): Mesh? {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Mesh?)
  }

  /**
   * Returns the transform applied to the item's mesh.
   */
  public final fun getItemMeshTransform(id: Int): Transform3D {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemMeshTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Returns the item's shadow casting mode. See [RenderingServer.ShadowCastingSetting] for possible values.
   */
  public final fun getItemMeshCastShadow(id: Int): RenderingServer.ShadowCastingSetting {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemMeshCastShadowPtr, LONG)
    return RenderingServer.ShadowCastingSetting.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the item's navigation mesh.
   */
  public final fun getItemNavigationMesh(id: Int): NavigationMesh? {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemNavigationMeshPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as NavigationMesh?)
  }

  /**
   * Returns the transform applied to the item's navigation mesh.
   */
  public final fun getItemNavigationMeshTransform(id: Int): Transform3D {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemNavigationMeshTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Returns the item's navigation layers bitmask.
   */
  public final fun getItemNavigationLayers(id: Int): Long {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemNavigationLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns an item's collision shapes.
   *
   * The array consists of each [Shape3D] followed by its [Transform3D].
   */
  public final fun getItemShapes(id: Int): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemShapesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * When running in the editor, returns a generated item preview (a 3D rendering in isometric perspective). When used in a running project, returns the manually-defined item preview which can be set using [setItemPreview]. Returns an empty [Texture2D] if no preview was manually set in a running project.
   */
  public final fun getItemPreview(id: Int): Texture2D? {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getItemPreviewPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Removes the item.
   */
  public final fun removeItem(id: Int) {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeItemPtr, NIL)
  }

  /**
   * Returns the first item with the given name, or `-1` if no item is found.
   */
  public final fun findItemByName(name: String): Int {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.findItemByNamePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Clears the library.
   */
  public final fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns the list of item IDs in use.
   */
  public final fun getItemList(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getItemListPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Gets an unused ID for a new item.
   */
  public final fun getLastUnusedItemId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLastUnusedItemIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  public object MethodBindings {
    internal val createItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "create_item", 1_286_410_249)

    internal val setItemNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "set_item_name", 501_894_301)

    internal val setItemMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "set_item_mesh", 969_122_797)

    internal val setItemMeshTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "set_item_mesh_transform", 3_616_898_986)

    internal val setItemMeshCastShadowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "set_item_mesh_cast_shadow", 3_923_400_443)

    internal val setItemNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "set_item_navigation_mesh", 3_483_353_960)

    internal val setItemNavigationMeshTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "set_item_navigation_mesh_transform", 3_616_898_986)

    internal val setItemNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "set_item_navigation_layers", 3_937_882_851)

    internal val setItemShapesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "set_item_shapes", 537_221_740)

    internal val setItemPreviewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "set_item_preview", 666_127_730)

    internal val getItemNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_item_name", 844_755_477)

    internal val getItemMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_item_mesh", 1_576_363_275)

    internal val getItemMeshTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_item_mesh_transform", 1_965_739_696)

    internal val getItemMeshCastShadowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_item_mesh_cast_shadow", 1_841_766_007)

    internal val getItemNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_item_navigation_mesh", 2_729_647_406)

    internal val getItemNavigationMeshTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_item_navigation_mesh_transform", 1_965_739_696)

    internal val getItemNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_item_navigation_layers", 923_996_154)

    internal val getItemShapesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_item_shapes", 663_333_327)

    internal val getItemPreviewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_item_preview", 3_536_238_170)

    internal val removeItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "remove_item", 1_286_410_249)

    internal val findItemByNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "find_item_by_name", 1_321_353_865)

    internal val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "clear", 3_218_959_716)

    internal val getItemListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_item_list", 1_930_428_628)

    internal val getLastUnusedItemIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MeshLibrary", "get_last_unused_item_id", 3_905_245_786)
  }
}

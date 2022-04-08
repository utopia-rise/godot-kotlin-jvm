// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Exposes a set of scenes as tiles for a [godot.TileSet] resource.
 *
 * When placed on a [godot.TileMap], tiles from [godot.TileSetScenesCollectionSource] will automatically instantiate an associated scene at the cell's position in the TileMap.
 *
 * Scenes are instantiated as children of the [godot.TileMap] when it enters the tree. If you add/remove a scene tile in the [godot.TileMap] that is already inside the tree, the [godot.TileMap] will automatically instantiate/free the scene accordingly.
 */
@GodotBaseType
public open class TileSetScenesCollectionSource : TileSetSource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE)
  }

  /**
   * Returns the number or scene tiles this TileSet source has.
   */
  public fun getSceneTilesCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_GET_SCENE_TILES_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the scene tile ID of the scene tile at index `index`.
   */
  public fun getSceneTileId(index: Long): Long {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_GET_SCENE_TILE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns whether this TileSet source has a scene tile with id `id`.
   */
  public fun hasSceneTileId(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_HAS_SCENE_TILE_ID, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Creates a scene-based tile out of the given scene.
   *
   * Returns a newly generated unique ID.
   */
  public fun createSceneTile(packedScene: PackedScene, idOverride: Long = -1): Long {
    TransferContext.writeArguments(OBJECT to packedScene, LONG to idOverride)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_CREATE_SCENE_TILE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Changes a scene tile's ID from `id` to `new_id`. This will fail if there is already a tile with a ID equal to `new_id`.
   */
  public fun setSceneTileId(id: Long, newId: Long): Unit {
    TransferContext.writeArguments(LONG to id, LONG to newId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_SET_SCENE_TILE_ID, NIL)
  }

  /**
   * Assigns a [godot.PackedScene] resource to the scene tile with id `id`. This will fail if the scene does not extend CanvasItem, as positioning properties are needed to place the scene on the TileMap.
   */
  public fun setSceneTileScene(id: Long, packedScene: PackedScene): Unit {
    TransferContext.writeArguments(LONG to id, OBJECT to packedScene)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_SET_SCENE_TILE_SCENE, NIL)
  }

  /**
   * Returns the [godot.PackedScene] resource of scene tile with id `id`.
   */
  public fun getSceneTileScene(id: Long): PackedScene? {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_GET_SCENE_TILE_SCENE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PackedScene?
  }

  /**
   * Sets whether or not the scene tile with id `id` should display a placeholder in the editor. This might be useful for scenes that are not visible.
   */
  public fun setSceneTileDisplayPlaceholder(id: Long, displayPlaceholder: Boolean): Unit {
    TransferContext.writeArguments(LONG to id, BOOL to displayPlaceholder)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_SET_SCENE_TILE_DISPLAY_PLACEHOLDER,
        NIL)
  }

  /**
   * Returns whether the scene tile with id `id` displays a placeholder in the editor.
   */
  public fun getSceneTileDisplayPlaceholder(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_GET_SCENE_TILE_DISPLAY_PLACEHOLDER,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Remove the scene tile with id `id`.
   */
  public fun removeSceneTile(id: Long): Unit {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_REMOVE_SCENE_TILE, NIL)
  }

  /**
   * Returns the scene ID a following call to [createSceneTile] would return.
   */
  public fun getNextSceneTileId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_GET_NEXT_SCENE_TILE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public companion object
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Exposes a set of scenes as tiles for a [godot.TileSet] resource.
 *
 * When placed on a [godot.TileMap], tiles from [godot.TileSetScenesCollectionSource] will automatically instantiate an associated scene at the cell's position in the TileMap.
 *
 * Scenes are instantiated as children of the [godot.TileMap] when it enters the tree. If you add/remove a scene tile in the [godot.TileMap] that is already inside the tree, the [godot.TileMap] will automatically instantiate/free the scene accordingly.
 */
@GodotBaseType
public open class TileSetScenesCollectionSource : TileSetSource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE, scriptIndex)
    return true
  }

  /**
   * Returns the number or scene tiles this TileSet source has.
   */
  public fun getSceneTilesCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_GET_SCENE_TILES_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the scene tile ID of the scene tile at [index].
   */
  public fun getSceneTileId(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_GET_SCENE_TILE_ID, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns whether this TileSet source has a scene tile with [id].
   */
  public fun hasSceneTileId(id: Int): Boolean {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_HAS_SCENE_TILE_ID, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Creates a scene-based tile out of the given scene.
   *
   * Returns a newly generated unique ID.
   */
  @JvmOverloads
  public fun createSceneTile(packedScene: PackedScene, idOverride: Int = -1): Int {
    TransferContext.writeArguments(OBJECT to packedScene, LONG to idOverride.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_CREATE_SCENE_TILE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Changes a scene tile's ID from [id] to [newId]. This will fail if there is already a tile with an ID equal to [newId].
   */
  public fun setSceneTileId(id: Int, newId: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), LONG to newId.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_SET_SCENE_TILE_ID, NIL)
  }

  /**
   * Assigns a [godot.PackedScene] resource to the scene tile with [id]. This will fail if the scene does not extend CanvasItem, as positioning properties are needed to place the scene on the TileMap.
   */
  public fun setSceneTileScene(id: Int, packedScene: PackedScene): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), OBJECT to packedScene)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_SET_SCENE_TILE_SCENE, NIL)
  }

  /**
   * Returns the [godot.PackedScene] resource of scene tile with [id].
   */
  public fun getSceneTileScene(id: Int): PackedScene? {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_GET_SCENE_TILE_SCENE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PackedScene?)
  }

  /**
   * Sets whether or not the scene tile with [id] should display a placeholder in the editor. This might be useful for scenes that are not visible.
   */
  public fun setSceneTileDisplayPlaceholder(id: Int, displayPlaceholder: Boolean): Unit {
    TransferContext.writeArguments(LONG to id.toLong(), BOOL to displayPlaceholder)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_SET_SCENE_TILE_DISPLAY_PLACEHOLDER,
        NIL)
  }

  /**
   * Returns whether the scene tile with [id] displays a placeholder in the editor.
   */
  public fun getSceneTileDisplayPlaceholder(id: Int): Boolean {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_GET_SCENE_TILE_DISPLAY_PLACEHOLDER,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Remove the scene tile with [id].
   */
  public fun removeSceneTile(id: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_REMOVE_SCENE_TILE, NIL)
  }

  /**
   * Returns the scene ID a following call to [createSceneTile] would return.
   */
  public fun getNextSceneTileId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSCENESCOLLECTIONSOURCE_GET_NEXT_SCENE_TILE_ID, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object
}

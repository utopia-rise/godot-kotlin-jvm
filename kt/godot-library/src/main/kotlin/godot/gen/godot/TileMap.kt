// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.RID
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.Vector2i
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Node for 2D tile-based maps.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/113](https://godotengine.org/asset-library/asset/113)
 *
 * Node for 2D tile-based maps. Tilemaps use a [godot.TileSet] which contain a list of tiles which are used to create grid-based maps. A TileMap may have several layers, layouting tiles on top of each other.
 */
@GodotBaseType
public open class TileMap : Node2D() {
  /**
   * Emitted when the [godot.TileSet] of this TileMap changes.
   */
  public val changed: Signal0 by signal()

  /**
   * The assigned [godot.TileSet].
   */
  public var tileSet: TileSet?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_TILESET, OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as TileSet?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_TILESET, NIL.ordinal)
    }

  /**
   * The TileMap's quadrant size. Optimizes drawing by batching, using chunks of this size.
   */
  public var cellQuadrantSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_QUADRANT_SIZE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_QUADRANT_SIZE, NIL.ordinal)
    }

  /**
   * If enabled, the TileMap will see its collisions synced to the physics tick and change its collision type from static to kinematic. This is required to create TileMap-based moving platform.
   *
   * **Note:** Enabling `collision_animatable` may have a small performance impact, only do it if the TileMap is moving and has colliding tiles.
   */
  public var collisionAnimatable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_IS_COLLISION_ANIMATABLE,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_COLLISION_ANIMATABLE,
          NIL.ordinal)
    }

  /**
   * Show or hide the TileMap's collision shapes. If set to [VISIBILITY_MODE_DEFAULT], this depends on the show collision debug settings.
   */
  public var collisionVisibilityMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_COLLISION_VISIBILITY_MODE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_COLLISION_VISIBILITY_MODE,
          NIL.ordinal)
    }

  /**
   * Show or hide the TileMap's collision shapes. If set to [VISIBILITY_MODE_DEFAULT], this depends on the show navigation debug settings.
   */
  public var navigationVisibilityMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_NAVIGATION_VISIBILITY_MODE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_NAVIGATION_VISIBILITY_MODE,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TILEMAP)
  }

  /**
   * Should return `true` if the tile at coordinates `coords[/coords] on layer `layer` requires a runtime update.
   *
   * **Warning:** Make sure this function only return `true` when needed. Any tile processed at runtime without a need for it will imply a significant performance penalty.
   */
  public open fun _useTileDataRuntimeUpdate(layer: Long, coords: Vector2i): Boolean {
    throw NotImplementedError("_use_tile_data_runtime_update is not implemented for TileMap")
  }

  /**
   * Called with a TileData object about to be used internally by the TileMap, allowing its modification at runtime.
   *
   * This method is only called if [_useTileDataRuntimeUpdate] is implemented and returns `true` for the given tile `coords[/coords] and `layer`.
   *
   * **Warning:** The `tile_data` object's sub-resources are the same as the one in the TileSet. Modifying them might impact the whole TileSet. Instead, make sure to duplicate those resources.
   *
   * **Note:** If the properties of `tile_data` object should change over time, use [forceUpdate] to trigger a TileMap update.
   */
  public open fun _tileDataRuntimeUpdate(
    layer: Long,
    coords: Vector2i,
    tileData: TileData
  ): Unit {
  }

  /**
   *
   */
  public fun getLayersCount(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_LAYERS_COUNT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a layer at the given position `to_position` in the array. If `to_position` is -1, adds it at the end of the array.
   */
  public fun addLayer(toPosition: Long): Unit {
    TransferContext.writeArguments(LONG to toPosition)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_ADD_LAYER, NIL.ordinal)
  }

  /**
   * Moves the layer at index `layer_index` to the given position `to_position` in the array.
   */
  public fun moveLayer(layer: Long, toPosition: Long): Unit {
    TransferContext.writeArguments(LONG to layer, LONG to toPosition)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_MOVE_LAYER, NIL.ordinal)
  }

  /**
   * Removes the layer at index `layer`.
   */
  public fun removeLayer(layer: Long): Unit {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_REMOVE_LAYER, NIL.ordinal)
  }

  /**
   * Sets a layer's name. This is mostly useful in the editor.
   */
  public fun setLayerName(layer: Long, name: String): Unit {
    TransferContext.writeArguments(LONG to layer, STRING to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_LAYER_NAME, NIL.ordinal)
  }

  /**
   * Returns a TileMap layer's name.
   */
  public fun getLayerName(layer: Long): String {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_LAYER_NAME, STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Enables or disables the layer `layer`. A disabled layer is not processed at all (no rendering, no physics, etc...).
   */
  public fun setLayerEnabled(layer: Long, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to layer, BOOL to enabled)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_LAYER_ENABLED, NIL.ordinal)
  }

  /**
   * Returns if a layer is enabled.
   */
  public fun isLayerEnabled(layer: Long): Boolean {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_IS_LAYER_ENABLED, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets a layer's color. It will be multiplied by tile's color and TileMap's modulate.
   */
  public fun setLayerModulate(layer: Long, enabled: Color): Unit {
    TransferContext.writeArguments(LONG to layer, COLOR to enabled)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_LAYER_MODULATE, NIL.ordinal)
  }

  /**
   * Returns a TileMap layer's modulate.
   */
  public fun getLayerModulate(layer: Long): Color {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_LAYER_MODULATE,
        COLOR.ordinal)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Enables or disables a layer's Y-sorting. If a layer is Y-sorted, the layer will behave as a CanvasItem node where each of its tile gets Y-sorted.
   *
   * Y-sorted layers should usually be on different Z-index values than not Y-sorted layers, otherwise, each of those layer will be Y-sorted as whole with the Y-sorted one. This is usually an undesired behvaior.
   */
  public fun setLayerYSortEnabled(layer: Long, ySortEnabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to layer, BOOL to ySortEnabled)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_LAYER_Y_SORT_ENABLED,
        NIL.ordinal)
  }

  /**
   * Returns if a layer Y-sorts its tiles.
   */
  public fun isLayerYSortEnabled(layer: Long): Boolean {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_IS_LAYER_Y_SORT_ENABLED,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets a layer's Y-sort origin value. This Y-sort origin value is added to each tile's Y-sort origin value.
   *
   * This allows, for example, to fake a different height level on each layer. This can be useful for top-down view games.
   */
  public fun setLayerYSortOrigin(layer: Long, ySortOrigin: Long): Unit {
    TransferContext.writeArguments(LONG to layer, LONG to ySortOrigin)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_LAYER_Y_SORT_ORIGIN,
        NIL.ordinal)
  }

  /**
   * Returns a TileMap layer's Y sort origin.
   */
  public fun getLayerYSortOrigin(layer: Long): Long {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_LAYER_Y_SORT_ORIGIN,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets a layers Z-index value. This Z-index is added to each tile's Z-index value.
   */
  public fun setLayerZIndex(layer: Long, zIndex: Long): Unit {
    TransferContext.writeArguments(LONG to layer, LONG to zIndex)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_LAYER_Z_INDEX, NIL.ordinal)
  }

  /**
   * Returns a TileMap layer's Z-index value.
   */
  public fun getLayerZIndex(layer: Long): Long {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_LAYER_Z_INDEX, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the tile indentifiers for the cell on layer `layer` at coordinates `coords`. Each tile of the [godot.TileSet] is identified using three parts:
   *
   * - The source identifier `source_id` identifies a [godot.TileSetSource] identifier. See [godot.TileSet.setSourceId],
   *
   * - The atlas coordinates identifier `atlas_coords` identifies a tile coordinates in the atlas (if the source is a [godot.TileSetAtlasSource]. For [godot.TileSetScenesCollectionSource] it should be 0),
   *
   * - The alternative tile identifier `alternative_tile` identifies a tile alternative the source is a [godot.TileSetAtlasSource], and the scene for a [godot.TileSetScenesCollectionSource].
   */
  public fun setCell(
    layer: Long,
    coords: Vector2i,
    sourceId: Long = -1,
    atlasCoords: Vector2i = Vector2i(-1, -1),
    alternativeTile: Long = 0
  ): Unit {
    TransferContext.writeArguments(LONG to layer, VECTOR2I to coords, LONG to sourceId, VECTOR2I to atlasCoords, LONG to alternativeTile)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_CELL, NIL.ordinal)
  }

  /**
   * Erases the cell on layer `layer` at coordinates `coords`.
   */
  public fun eraseCell(layer: Long, coords: Vector2i): Unit {
    TransferContext.writeArguments(LONG to layer, VECTOR2I to coords)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_ERASE_CELL, NIL.ordinal)
  }

  /**
   * Returns the tile source ID of the cell on layer `layer` at coordinates `coords`. If `use_proxies` is `false`, ignores the [godot.TileSet]'s tile proxies, returning the raw alternative identifier. See [godot.TileSet.mapTileProxy].
   */
  public fun getCellSourceId(
    layer: Long,
    coords: Vector2i,
    useProxies: Boolean
  ): Long {
    TransferContext.writeArguments(LONG to layer, VECTOR2I to coords, BOOL to useProxies)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_CELL_SOURCE_ID, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the tile atlas coordinates ID of the cell on layer `layer` at coordinates `coords`. If `use_proxies` is `false`, ignores the [godot.TileSet]'s tile proxies, returning the raw alternative identifier. See [godot.TileSet.mapTileProxy].
   */
  public fun getCellAtlasCoords(
    layer: Long,
    coords: Vector2i,
    useProxies: Boolean
  ): Vector2i {
    TransferContext.writeArguments(LONG to layer, VECTOR2I to coords, BOOL to useProxies)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_CELL_ATLAS_COORDS,
        VECTOR2I.ordinal)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Returns the tile alternative ID of the cell on layer `layer` at `coords`. If `use_proxies` is `false`, ignores the [godot.TileSet]'s tile proxies, returning the raw alternative identifier. See [godot.TileSet.mapTileProxy].
   */
  public fun getCellAlternativeTile(
    layer: Long,
    coords: Vector2i,
    useProxies: Boolean
  ): Long {
    TransferContext.writeArguments(LONG to layer, VECTOR2I to coords, BOOL to useProxies)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_CELL_ALTERNATIVE_TILE,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the coordinates of the tile for given physics body RID. Such RID can be retrieved from [godot.KinematicCollision2D.getColliderRid], when colliding with a tile.
   */
  public fun getCoordsForBodyRid(body: RID): Vector2i {
    TransferContext.writeArguments(_RID to body)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_COORDS_FOR_BODY_RID,
        VECTOR2I.ordinal)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Creates a new [godot.TileMapPattern] from the given layer and set of cells.
   */
  public fun getPattern(layer: Long, coordsArray: VariantArray<Any?>): TileMapPattern? {
    TransferContext.writeArguments(LONG to layer, ARRAY to coordsArray)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_PATTERN, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as TileMapPattern?
  }

  /**
   * Returns for the given coordinate `coords_in_pattern` in a [godot.TileMapPattern] the corresponding cell coordinates if the pattern was pasted at the `position_in_tilemap` coordinates (see [setPattern]). This mapping is required as in half-offset tile shapes, the mapping might not work by calculating `position_in_tile_map + coords_in_pattern`
   */
  public fun mapPattern(
    positionInTilemap: Vector2i,
    coordsInPattern: Vector2i,
    pattern: TileMapPattern
  ): Vector2i {
    TransferContext.writeArguments(VECTOR2I to positionInTilemap, VECTOR2I to coordsInPattern, OBJECT to pattern)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_MAP_PATTERN, VECTOR2I.ordinal)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Paste the given [godot.TileMapPattern] at the given `position` and `layer` in the tile map.
   */
  public fun setPattern(
    layer: Long,
    position: Vector2i,
    pattern: TileMapPattern
  ): Unit {
    TransferContext.writeArguments(LONG to layer, VECTOR2I to position, OBJECT to pattern)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_PATTERN, NIL.ordinal)
  }

  public fun setCellsFromSurroundingTerrains(
    layer: Long,
    cells: VariantArray<Any?>,
    terrainSet: Long,
    ignoreEmptyTerrains: Boolean = true
  ): Unit {
    TransferContext.writeArguments(LONG to layer, ARRAY to cells, LONG to terrainSet, BOOL to ignoreEmptyTerrains)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_CELLS_FROM_SURROUNDING_TERRAINS, NIL.ordinal)
  }

  /**
   * Clears cells that do not exist in the tileset.
   */
  public fun fixInvalidTiles(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_FIX_INVALID_TILES, NIL.ordinal)
  }

  /**
   * Clears all cells on the given layer.
   */
  public fun clearLayer(layer: Long): Unit {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_CLEAR_LAYER, NIL.ordinal)
  }

  /**
   * Clears all cells.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_CLEAR, NIL.ordinal)
  }

  /**
   * Triggers an update of the TileMap. If `layer` is provided, only updates the given layer.
   *
   * **Note:** The TileMap node updates automatically when one of its properties is modified. A manual update is only needed if runtime modifications (implemented in [_tileDataRuntimeUpdate]) need to be applied.
   *
   * **Warning:** Updating the TileMap is a performance demanding task. Limit occurrences of those updates to the minimum and limit the amount tiles they impact (by segregating tiles updated often to a dedicated layer for example).
   */
  public fun forceUpdate(layer: Long = -1): Unit {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_FORCE_UPDATE, NIL.ordinal)
  }

  /**
   * Returns the list of all neighbourings cells to the one at `coords`
   */
  public fun getSurroundingTiles(coords: Vector2i): VariantArray<Any?> {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_SURROUNDING_TILES,
        ARRAY.ordinal)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns a [godot.core.Vector2] array with the positions of all cells containing a tile in the given layer. A cell is considered empty if its source identifier equals -1, its atlas coordinates identifiers is `Vector2(-1, -1)` and its alternative identifier is -1.
   */
  public fun getUsedCells(layer: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_USED_CELLS, ARRAY.ordinal)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns a rectangle enclosing the used (non-empty) tiles of the map, including all layers.
   */
  public fun getUsedRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_USED_RECT, RECT2.ordinal)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns a local position of the center of the cell at the given tilemap (grid-based) coordinates.
   *
   * **Note:** This doesn't correspond to the visual position of the tile, i.e. it ignores the [godot.TileData.textureOffset] property of individual tiles.
   */
  public fun mapToWorld(mapPosition: Vector2i): Vector2 {
    TransferContext.writeArguments(VECTOR2I to mapPosition)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_MAP_TO_WORLD, VECTOR2.ordinal)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the tilemap (grid-based) coordinates corresponding to the given local position.
   */
  public fun worldToMap(worldPosition: Vector2): Vector2i {
    TransferContext.writeArguments(VECTOR2 to worldPosition)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_WORLD_TO_MAP, VECTOR2I.ordinal)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Returns the neighboring cell to the one at coordinates `coords`, identified by the `neighbor` direction. This method takes into account the different layouts a TileMap can take.
   */
  public fun getNeighborCell(coords: Vector2i, neighbor: TileSet.CellNeighbor): Vector2i {
    TransferContext.writeArguments(VECTOR2I to coords, LONG to neighbor.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_NEIGHBOR_CELL,
        VECTOR2I.ordinal)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  public enum class VisibilityMode(
    id: Long
  ) {
    /**
     * Use the debug settings to determine visibility.
     */
    VISIBILITY_MODE_DEFAULT(0),
    /**
     * Always hide.
     */
    VISIBILITY_MODE_FORCE_HIDE(2),
    /**
     * Always show.
     */
    VISIBILITY_MODE_FORCE_SHOW(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}

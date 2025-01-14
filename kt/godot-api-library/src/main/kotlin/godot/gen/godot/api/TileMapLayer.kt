// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.PackedByteArray
import godot.core.RID
import godot.core.Rect2i
import godot.core.Signal0
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.RECT2I
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR2I
import godot.core.VariantParser._RID
import godot.core.Vector2
import godot.core.Vector2i
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * Node for 2D tile-based maps. A [TileMapLayer] uses a [TileSet] which contain a list of tiles
 * which are used to create grid-based maps. Unlike the [TileMap] node, which is deprecated,
 * [TileMapLayer] has only one layer of tiles. You can use several [TileMapLayer] to achieve the same
 * result as a [TileMap] node.
 * For performance reasons, all TileMap updates are batched at the end of a frame. Notably, this
 * means that scene tiles from a [TileSetScenesCollectionSource] may be initialized after their parent.
 * This is only queued when inside the scene tree.
 * To force an update earlier on, call [updateInternals].
 */
@GodotBaseType
public open class TileMapLayer : Node2D() {
  /**
   * Emitted when this [TileMapLayer]'s properties changes. This includes modified cells,
   * properties, or changes made to its assigned [TileSet].
   * **Note:** This signal may be emitted very often when batch-modifying a [TileMapLayer]. Avoid
   * executing complex processing in a connected function, and consider delaying it to the end of the
   * frame instead (i.e. calling [Object.callDeferred]).
   */
  public val changed: Signal0 by Signal0

  /**
   * The raw tile map data as a byte array.
   */
  public final inline var tileMapData: PackedByteArray
    @JvmName("tileMapDataProperty")
    get() = getTileMapDataAsArray()
    @JvmName("tileMapDataProperty")
    set(`value`) {
      setTileMapDataFromArray(value)
    }

  /**
   * If `false`, disables this [TileMapLayer] completely (rendering, collision, navigation, scene
   * tiles, etc.)
   */
  public final inline var enabled: Boolean
    @JvmName("enabledProperty")
    get() = isEnabled()
    @JvmName("enabledProperty")
    set(`value`) {
      setEnabled(value)
    }

  /**
   * The [TileSet] used by this layer. The textures, collisions, and additional behavior of all
   * available tiles are stored here.
   */
  public final inline var tileSet: TileSet?
    @JvmName("tileSetProperty")
    get() = getTileSet()
    @JvmName("tileSetProperty")
    set(`value`) {
      setTileSet(value)
    }

  /**
   * This Y-sort origin value is added to each tile's Y-sort origin value. This allows, for example,
   * to fake a different height level. This can be useful for top-down view games.
   */
  public final inline var ySortOrigin: Int
    @JvmName("ySortOriginProperty")
    get() = getYSortOrigin()
    @JvmName("ySortOriginProperty")
    set(`value`) {
      setYSortOrigin(value)
    }

  /**
   * If [CanvasItem.ySortEnabled] is enabled, setting this to `true` will reverse the order the
   * tiles are drawn on the X-axis.
   */
  public final inline var xDrawOrderReversed: Boolean
    @JvmName("xDrawOrderReversedProperty")
    get() = isXDrawOrderReversed()
    @JvmName("xDrawOrderReversedProperty")
    set(`value`) {
      setXDrawOrderReversed(value)
    }

  /**
   * The [TileMapLayer]'s quadrant size. A quadrant is a group of tiles to be drawn together on a
   * single canvas item, for optimization purposes. [renderingQuadrantSize] defines the length of a
   * square's side, in the map's coordinate system, that forms the quadrant. Thus, the default quadrant
   * size groups together `16 * 16 = 256` tiles.
   * The quadrant size does not apply on a Y-sorted [TileMapLayer], as tiles are grouped by Y
   * position instead in that case.
   * **Note:** As quadrants are created according to the map's coordinate system, the quadrant's
   * "square shape" might not look like square in the [TileMapLayer]'s local coordinate system.
   */
  public final inline var renderingQuadrantSize: Int
    @JvmName("renderingQuadrantSizeProperty")
    get() = getRenderingQuadrantSize()
    @JvmName("renderingQuadrantSizeProperty")
    set(`value`) {
      setRenderingQuadrantSize(value)
    }

  /**
   * Enable or disable collisions.
   */
  public final inline var collisionEnabled: Boolean
    @JvmName("collisionEnabledProperty")
    get() = isCollisionEnabled()
    @JvmName("collisionEnabledProperty")
    set(`value`) {
      setCollisionEnabled(value)
    }

  /**
   * If `true`, this [TileMapLayer] collision shapes will be instantiated as kinematic bodies. This
   * can be needed for moving [TileMapLayer] nodes (i.e. moving platforms).
   */
  public final inline var useKinematicBodies: Boolean
    @JvmName("useKinematicBodiesProperty")
    get() = isUsingKinematicBodies()
    @JvmName("useKinematicBodiesProperty")
    set(`value`) {
      setUseKinematicBodies(value)
    }

  /**
   * Show or hide the [TileMapLayer]'s collision shapes. If set to [DEBUG_VISIBILITY_MODE_DEFAULT],
   * this depends on the show collision debug settings.
   */
  public final inline var collisionVisibilityMode: DebugVisibilityMode
    @JvmName("collisionVisibilityModeProperty")
    get() = getCollisionVisibilityMode()
    @JvmName("collisionVisibilityModeProperty")
    set(`value`) {
      setCollisionVisibilityMode(value)
    }

  /**
   * If `true`, navigation regions are enabled.
   */
  public final inline var navigationEnabled: Boolean
    @JvmName("navigationEnabledProperty")
    get() = isNavigationEnabled()
    @JvmName("navigationEnabledProperty")
    set(`value`) {
      setNavigationEnabled(value)
    }

  /**
   * Show or hide the [TileMapLayer]'s navigation meshes. If set to [DEBUG_VISIBILITY_MODE_DEFAULT],
   * this depends on the show navigation debug settings.
   */
  public final inline var navigationVisibilityMode: DebugVisibilityMode
    @JvmName("navigationVisibilityModeProperty")
    get() = getNavigationVisibilityMode()
    @JvmName("navigationVisibilityModeProperty")
    set(`value`) {
      setNavigationVisibilityMode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_TILEMAPLAYER, scriptIndex)
  }

  /**
   * Should return `true` if the tile at coordinates [coords] requires a runtime update.
   * **Warning:** Make sure this function only returns `true` when needed. Any tile processed at
   * runtime without a need for it will imply a significant performance penalty.
   * **Note:** If the result of this function should change, use [notifyRuntimeTileDataUpdate] to
   * notify the [TileMapLayer] it needs an update.
   */
  public open fun _useTileDataRuntimeUpdate(coords: Vector2i): Boolean {
    throw NotImplementedError("_use_tile_data_runtime_update is not implemented for TileMapLayer")
  }

  /**
   * Called with a [TileData] object about to be used internally by the [TileMapLayer], allowing its
   * modification at runtime.
   * This method is only called if [_useTileDataRuntimeUpdate] is implemented and returns `true` for
   * the given tile [coords].
   * **Warning:** The [tileData] object's sub-resources are the same as the one in the TileSet.
   * Modifying them might impact the whole TileSet. Instead, make sure to duplicate those resources.
   * **Note:** If the properties of [tileData] object should change over time, use
   * [notifyRuntimeTileDataUpdate] to notify the [TileMapLayer] it needs an update.
   */
  public open fun _tileDataRuntimeUpdate(coords: Vector2i, tileData: TileData?): Unit {
  }

  /**
   * Sets the tile identifiers for the cell at coordinates [coords]. Each tile of the [TileSet] is
   * identified using three parts:
   * - The source identifier [sourceId] identifies a [TileSetSource] identifier. See
   * [TileSet.setSourceId],
   * - The atlas coordinate identifier [atlasCoords] identifies a tile coordinates in the atlas (if
   * the source is a [TileSetAtlasSource]). For [TileSetScenesCollectionSource] it should always be
   * `Vector2i(0, 0)`,
   * - The alternative tile identifier [alternativeTile] identifies a tile alternative in the atlas
   * (if the source is a [TileSetAtlasSource]), and the scene for a [TileSetScenesCollectionSource].
   * If [sourceId] is set to `-1`, [atlasCoords] to `Vector2i(-1, -1)`, or [alternativeTile] to
   * `-1`, the cell will be erased. An erased cell gets **all** its identifiers automatically set to
   * their respective invalid values, namely `-1`, `Vector2i(-1, -1)` and `-1`.
   */
  @JvmOverloads
  public final fun setCell(
    coords: Vector2i,
    sourceId: Int = -1,
    atlasCoords: Vector2i = Vector2i(-1, -1),
    alternativeTile: Int = 0,
  ): Unit {
    TransferContext.writeArguments(VECTOR2I to coords, LONG to sourceId.toLong(), VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setCellPtr, NIL)
  }

  /**
   * Erases the cell at coordinates [coords].
   */
  public final fun eraseCell(coords: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(ptr, MethodBindings.eraseCellPtr, NIL)
  }

  /**
   * Clears cells containing tiles that do not exist in the [tileSet].
   */
  public final fun fixInvalidTiles(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.fixInvalidTilesPtr, NIL)
  }

  /**
   * Clears all cells.
   */
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns the tile source ID of the cell at coordinates [coords]. Returns `-1` if the cell does
   * not exist.
   */
  public final fun getCellSourceId(coords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(ptr, MethodBindings.getCellSourceIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the tile atlas coordinates ID of the cell at coordinates [coords]. Returns
   * `Vector2i(-1, -1)` if the cell does not exist.
   */
  public final fun getCellAtlasCoords(coords: Vector2i): Vector2i {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(ptr, MethodBindings.getCellAtlasCoordsPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the tile alternative ID of the cell at coordinates [coords].
   */
  public final fun getCellAlternativeTile(coords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(ptr, MethodBindings.getCellAlternativeTilePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the [TileData] object associated with the given cell, or `null` if the cell does not
   * exist or is not a [TileSetAtlasSource].
   * [codeblock]
   * func get_clicked_tile_power():
   *     var clicked_cell = tile_map_layer.local_to_map(tile_map_layer.get_local_mouse_position())
   *     var data = tile_map_layer.get_cell_tile_data(clicked_cell)
   *     if data:
   *         return data.get_custom_data("power")
   *     else:
   *         return 0
   * [/codeblock]
   */
  public final fun getCellTileData(coords: Vector2i): TileData? {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(ptr, MethodBindings.getCellTileDataPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TileData?)
  }

  /**
   * Returns a [Vector2i] array with the positions of all cells containing a tile. A cell is
   * considered empty if its source identifier equals `-1`, its atlas coordinate identifier is
   * `Vector2(-1, -1)` and its alternative identifier is `-1`.
   */
  public final fun getUsedCells(): VariantArray<Vector2i> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUsedCellsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Vector2i>)
  }

  /**
   * Returns a [Vector2i] array with the positions of all cells containing a tile. Tiles may be
   * filtered according to their source ([sourceId]), their atlas coordinates ([atlasCoords]), or
   * alternative id ([alternativeTile]).
   * If a parameter has its value set to the default one, this parameter is not used to filter a
   * cell. Thus, if all parameters have their respective default values, this method returns the same
   * result as [getUsedCells].
   * A cell is considered empty if its source identifier equals `-1`, its atlas coordinate
   * identifier is `Vector2(-1, -1)` and its alternative identifier is `-1`.
   */
  @JvmOverloads
  public final fun getUsedCellsById(
    sourceId: Int = -1,
    atlasCoords: Vector2i = Vector2i(-1, -1),
    alternativeTile: Int = -1,
  ): VariantArray<Vector2i> {
    TransferContext.writeArguments(LONG to sourceId.toLong(), VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getUsedCellsByIdPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Vector2i>)
  }

  /**
   * Returns a rectangle enclosing the used (non-empty) tiles of the map.
   */
  public final fun getUsedRect(): Rect2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUsedRectPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I) as Rect2i)
  }

  /**
   * Creates and returns a new [TileMapPattern] from the given array of cells. See also
   * [setPattern].
   */
  public final fun getPattern(coordsArray: VariantArray<Vector2i>): TileMapPattern? {
    TransferContext.writeArguments(ARRAY to coordsArray)
    TransferContext.callMethod(ptr, MethodBindings.getPatternPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TileMapPattern?)
  }

  /**
   * Pastes the [TileMapPattern] at the given [position] in the tile map. See also [getPattern].
   */
  public final fun setPattern(position: Vector2i, pattern: TileMapPattern?): Unit {
    TransferContext.writeArguments(VECTOR2I to position, OBJECT to pattern)
    TransferContext.callMethod(ptr, MethodBindings.setPatternPtr, NIL)
  }

  /**
   * Update all the cells in the [cells] coordinates array so that they use the given [terrain] for
   * the given [terrainSet]. If an updated cell has the same terrain as one of its neighboring cells,
   * this function tries to join the two. This function might update neighboring tiles if needed to
   * create correct terrain transitions.
   * If [ignoreEmptyTerrains] is true, empty terrains will be ignored when trying to find the best
   * fitting tile for the given terrain constraints.
   * **Note:** To work correctly, this method requires the [TileMapLayer]'s TileSet to have terrains
   * set up with all required terrain combinations. Otherwise, it may produce unexpected results.
   */
  @JvmOverloads
  public final fun setCellsTerrainConnect(
    cells: VariantArray<Vector2i>,
    terrainSet: Int,
    terrain: Int,
    ignoreEmptyTerrains: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(ARRAY to cells, LONG to terrainSet.toLong(), LONG to terrain.toLong(), BOOL to ignoreEmptyTerrains)
    TransferContext.callMethod(ptr, MethodBindings.setCellsTerrainConnectPtr, NIL)
  }

  /**
   * Update all the cells in the [path] coordinates array so that they use the given [terrain] for
   * the given [terrainSet]. The function will also connect two successive cell in the path with the
   * same terrain. This function might update neighboring tiles if needed to create correct terrain
   * transitions.
   * If [ignoreEmptyTerrains] is true, empty terrains will be ignored when trying to find the best
   * fitting tile for the given terrain constraints.
   * **Note:** To work correctly, this method requires the [TileMapLayer]'s TileSet to have terrains
   * set up with all required terrain combinations. Otherwise, it may produce unexpected results.
   */
  @JvmOverloads
  public final fun setCellsTerrainPath(
    path: VariantArray<Vector2i>,
    terrainSet: Int,
    terrain: Int,
    ignoreEmptyTerrains: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(ARRAY to path, LONG to terrainSet.toLong(), LONG to terrain.toLong(), BOOL to ignoreEmptyTerrains)
    TransferContext.callMethod(ptr, MethodBindings.setCellsTerrainPathPtr, NIL)
  }

  /**
   * Returns whether the provided [body] [RID] belongs to one of this [TileMapLayer]'s cells.
   */
  public final fun hasBodyRid(body: RID): Boolean {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(ptr, MethodBindings.hasBodyRidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the coordinates of the tile for given physics body [RID]. Such an [RID] can be
   * retrieved from [KinematicCollision2D.getColliderRid], when colliding with a tile.
   */
  public final fun getCoordsForBodyRid(body: RID): Vector2i {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(ptr, MethodBindings.getCoordsForBodyRidPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Triggers a direct update of the [TileMapLayer]. Usually, calling this function is not needed,
   * as [TileMapLayer] node updates automatically when one of its properties or cells is modified.
   * However, for performance reasons, those updates are batched and delayed to the end of the
   * frame. Calling this function will force the [TileMapLayer] to update right away instead.
   * **Warning:** Updating the [TileMapLayer] is computationally expensive and may impact
   * performance. Try to limit the number of updates and how many tiles they impact.
   */
  public final fun updateInternals(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.updateInternalsPtr, NIL)
  }

  /**
   * Notifies the [TileMapLayer] node that calls to [_useTileDataRuntimeUpdate] or
   * [_tileDataRuntimeUpdate] will lead to different results. This will thus trigger a [TileMapLayer]
   * update.
   * **Warning:** Updating the [TileMapLayer] is computationally expensive and may impact
   * performance. Try to limit the number of calls to this function to avoid unnecessary update.
   * **Note:** This does not trigger a direct update of the [TileMapLayer], the update will be done
   * at the end of the frame as usual (unless you call [updateInternals]).
   */
  public final fun notifyRuntimeTileDataUpdate(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.notifyRuntimeTileDataUpdatePtr, NIL)
  }

  /**
   * Returns for the given coordinates [coordsInPattern] in a [TileMapPattern] the corresponding
   * cell coordinates if the pattern was pasted at the [positionInTilemap] coordinates (see
   * [setPattern]). This mapping is required as in half-offset tile shapes, the mapping might not work
   * by calculating `position_in_tile_map + coords_in_pattern`.
   */
  public final fun mapPattern(
    positionInTilemap: Vector2i,
    coordsInPattern: Vector2i,
    pattern: TileMapPattern?,
  ): Vector2i {
    TransferContext.writeArguments(VECTOR2I to positionInTilemap, VECTOR2I to coordsInPattern, OBJECT to pattern)
    TransferContext.callMethod(ptr, MethodBindings.mapPatternPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the list of all neighboring cells to the one at [coords].
   */
  public final fun getSurroundingCells(coords: Vector2i): VariantArray<Vector2i> {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(ptr, MethodBindings.getSurroundingCellsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Vector2i>)
  }

  /**
   * Returns the neighboring cell to the one at coordinates [coords], identified by the [neighbor]
   * direction. This method takes into account the different layouts a TileMap can take.
   */
  public final fun getNeighborCell(coords: Vector2i, neighbor: TileSet.CellNeighbor): Vector2i {
    TransferContext.writeArguments(VECTOR2I to coords, LONG to neighbor.id)
    TransferContext.callMethod(ptr, MethodBindings.getNeighborCellPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the centered position of a cell in the [TileMapLayer]'s local coordinate space. To
   * convert the returned value into global coordinates, use [Node2D.toGlobal]. See also [localToMap].
   * **Note:** This may not correspond to the visual position of the tile, i.e. it ignores the
   * [TileData.textureOrigin] property of individual tiles.
   */
  public final fun mapToLocal(mapPosition: Vector2i): Vector2 {
    TransferContext.writeArguments(VECTOR2I to mapPosition)
    TransferContext.callMethod(ptr, MethodBindings.mapToLocalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the map coordinates of the cell containing the given [localPosition]. If
   * [localPosition] is in global coordinates, consider using [Node2D.toLocal] before passing it to
   * this method. See also [mapToLocal].
   */
  public final fun localToMap(localPosition: Vector2): Vector2i {
    TransferContext.writeArguments(VECTOR2 to localPosition)
    TransferContext.callMethod(ptr, MethodBindings.localToMapPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  public final fun setTileMapDataFromArray(tileMapLayerData: PackedByteArray): Unit {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to tileMapLayerData)
    TransferContext.callMethod(ptr, MethodBindings.setTileMapDataFromArrayPtr, NIL)
  }

  public final fun getTileMapDataAsArray(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTileMapDataAsArrayPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  public final fun setEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setEnabledPtr, NIL)
  }

  public final fun isEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTileSet(tileSet: TileSet?): Unit {
    TransferContext.writeArguments(OBJECT to tileSet)
    TransferContext.callMethod(ptr, MethodBindings.setTileSetPtr, NIL)
  }

  public final fun getTileSet(): TileSet? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTileSetPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TileSet?)
  }

  public final fun setYSortOrigin(ySortOrigin: Int): Unit {
    TransferContext.writeArguments(LONG to ySortOrigin.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setYSortOriginPtr, NIL)
  }

  public final fun getYSortOrigin(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getYSortOriginPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setXDrawOrderReversed(xDrawOrderReversed: Boolean): Unit {
    TransferContext.writeArguments(BOOL to xDrawOrderReversed)
    TransferContext.callMethod(ptr, MethodBindings.setXDrawOrderReversedPtr, NIL)
  }

  public final fun isXDrawOrderReversed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isXDrawOrderReversedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setRenderingQuadrantSize(size: Int): Unit {
    TransferContext.writeArguments(LONG to size.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setRenderingQuadrantSizePtr, NIL)
  }

  public final fun getRenderingQuadrantSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRenderingQuadrantSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setCollisionEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionEnabledPtr, NIL)
  }

  public final fun isCollisionEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCollisionEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUseKinematicBodies(useKinematicBodies: Boolean): Unit {
    TransferContext.writeArguments(BOOL to useKinematicBodies)
    TransferContext.callMethod(ptr, MethodBindings.setUseKinematicBodiesPtr, NIL)
  }

  public final fun isUsingKinematicBodies(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingKinematicBodiesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCollisionVisibilityMode(visibilityMode: DebugVisibilityMode): Unit {
    TransferContext.writeArguments(LONG to visibilityMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionVisibilityModePtr, NIL)
  }

  public final fun getCollisionVisibilityMode(): DebugVisibilityMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionVisibilityModePtr, LONG)
    return TileMapLayer.DebugVisibilityMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setNavigationEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setNavigationEnabledPtr, NIL)
  }

  public final fun isNavigationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isNavigationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets a custom [map] as a [NavigationServer2D] navigation map. If not set, uses the default
   * [World2D] navigation map instead.
   */
  public final fun setNavigationMap(map: RID): Unit {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(ptr, MethodBindings.setNavigationMapPtr, NIL)
  }

  /**
   * Returns the [RID] of the [NavigationServer2D] navigation used by this [TileMapLayer].
   * By default this returns the default [World2D] navigation map, unless a custom map was provided
   * using [setNavigationMap].
   */
  public final fun getNavigationMap(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNavigationMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setNavigationVisibilityMode(showNavigation: DebugVisibilityMode): Unit {
    TransferContext.writeArguments(LONG to showNavigation.id)
    TransferContext.callMethod(ptr, MethodBindings.setNavigationVisibilityModePtr, NIL)
  }

  public final fun getNavigationVisibilityMode(): DebugVisibilityMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNavigationVisibilityModePtr, LONG)
    return TileMapLayer.DebugVisibilityMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class DebugVisibilityMode(
    id: Long,
  ) {
    /**
     * Hide the collisions or navigation debug shapes in the editor, and use the debug settings to
     * determine their visibility in game (i.e. [SceneTree.debugCollisionsHint] or
     * [SceneTree.debugNavigationHint]).
     */
    DEBUG_VISIBILITY_MODE_DEFAULT(0),
    /**
     * Always hide the collisions or navigation debug shapes.
     */
    DEBUG_VISIBILITY_MODE_FORCE_HIDE(2),
    /**
     * Always show the collisions or navigation debug shapes.
     */
    DEBUG_VISIBILITY_MODE_FORCE_SHOW(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DebugVisibilityMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setCellPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "set_cell", 2428518503)

    public val eraseCellPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "erase_cell", 1130785943)

    public val fixInvalidTilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "fix_invalid_tiles", 3218959716)

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMapLayer", "clear", 3218959716)

    public val getCellSourceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "get_cell_source_id", 2485466453)

    public val getCellAtlasCoordsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "get_cell_atlas_coords", 3050897911)

    public val getCellAlternativeTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "get_cell_alternative_tile", 2485466453)

    public val getCellTileDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "get_cell_tile_data", 205084707)

    public val getUsedCellsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "get_used_cells", 3995934104)

    public val getUsedCellsByIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "get_used_cells_by_id", 4175304538)

    public val getUsedRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "get_used_rect", 410525958)

    public val getPatternPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "get_pattern", 3820813253)

    public val setPatternPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "set_pattern", 1491151770)

    public val setCellsTerrainConnectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "set_cells_terrain_connect", 748968311)

    public val setCellsTerrainPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "set_cells_terrain_path", 748968311)

    public val hasBodyRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "has_body_rid", 4155700596)

    public val getCoordsForBodyRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "get_coords_for_body_rid", 733700038)

    public val updateInternalsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "update_internals", 3218959716)

    public val notifyRuntimeTileDataUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "notify_runtime_tile_data_update", 2275361663)

    public val mapPatternPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "map_pattern", 1864516957)

    public val getSurroundingCellsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "get_surrounding_cells", 2673526557)

    public val getNeighborCellPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "get_neighbor_cell", 986575103)

    public val mapToLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "map_to_local", 108438297)

    public val localToMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "local_to_map", 837806996)

    public val setTileMapDataFromArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "set_tile_map_data_from_array", 2971499966)

    public val getTileMapDataAsArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "get_tile_map_data_as_array", 2362200018)

    public val setEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "set_enabled", 2586408642)

    public val isEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "is_enabled", 36873697)

    public val setTileSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "set_tile_set", 774531446)

    public val getTileSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "get_tile_set", 2678226422)

    public val setYSortOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "set_y_sort_origin", 1286410249)

    public val getYSortOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "get_y_sort_origin", 3905245786)

    public val setXDrawOrderReversedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "set_x_draw_order_reversed", 2586408642)

    public val isXDrawOrderReversedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "is_x_draw_order_reversed", 36873697)

    public val setRenderingQuadrantSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "set_rendering_quadrant_size", 1286410249)

    public val getRenderingQuadrantSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "get_rendering_quadrant_size", 3905245786)

    public val setCollisionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "set_collision_enabled", 2586408642)

    public val isCollisionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "is_collision_enabled", 36873697)

    public val setUseKinematicBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "set_use_kinematic_bodies", 2586408642)

    public val isUsingKinematicBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "is_using_kinematic_bodies", 36873697)

    public val setCollisionVisibilityModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "set_collision_visibility_mode", 3508099847)

    public val getCollisionVisibilityModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "get_collision_visibility_mode", 338220793)

    public val setNavigationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "set_navigation_enabled", 2586408642)

    public val isNavigationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "is_navigation_enabled", 36873697)

    public val setNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "set_navigation_map", 2722037293)

    public val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "get_navigation_map", 2944877500)

    public val setNavigationVisibilityModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "set_navigation_visibility_mode", 3508099847)

    public val getNavigationVisibilityModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapLayer", "get_navigation_visibility_mode", 338220793)
  }
}

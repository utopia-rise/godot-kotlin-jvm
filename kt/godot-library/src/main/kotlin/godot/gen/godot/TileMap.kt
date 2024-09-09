// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.RID
import godot.core.Rect2i
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2I
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Node for 2D tile-based maps. Tilemaps use a [TileSet] which contain a list of tiles which are
 * used to create grid-based maps. A TileMap may have several layers, layouting tiles on top of each
 * other.
 * For performance reasons, all TileMap updates are batched at the end of a frame. Notably, this
 * means that scene tiles from a [TileSetScenesCollectionSource] may be initialized after their parent.
 * This is only queued when inside the scene tree.
 * To force an update earlier on, call [updateInternals].
 */
@GodotBaseType
public open class TileMap : Node2D() {
  /**
   * Emitted when the [TileSet] of this TileMap changes.
   */
  public val changed: Signal0 by signal()

  /**
   * The [TileSet] used by this [TileMap]. The textures, collisions, and additional behavior of all
   * available tiles are stored here.
   */
  public var tileSet: TileSet?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTilesetPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as TileSet?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTilesetPtr, NIL)
    }

  /**
   * The TileMap's quadrant size. A quadrant is a group of tiles to be drawn together on a single
   * canvas item, for optimization purposes. [renderingQuadrantSize] defines the length of a square's
   * side, in the map's coordinate system, that forms the quadrant. Thus, the default quadrant size
   * groups together `16 * 16 = 256` tiles.
   * The quadrant size does not apply on Y-sorted layers, as tiles are grouped by Y position instead
   * in that case.
   * **Note:** As quadrants are created according to the map's coordinate system, the quadrant's
   * "square shape" might not look like square in the TileMap's local coordinate system.
   */
  public var renderingQuadrantSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRenderingQuadrantSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setRenderingQuadrantSizePtr, NIL)
    }

  /**
   * If enabled, the TileMap will see its collisions synced to the physics tick and change its
   * collision type from static to kinematic. This is required to create TileMap-based moving platform.
   * **Note:** Enabling [collisionAnimatable] may have a small performance impact, only do it if the
   * TileMap is moving and has colliding tiles.
   */
  public var collisionAnimatable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCollisionAnimatablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionAnimatablePtr, NIL)
    }

  /**
   * Show or hide the TileMap's collision shapes. If set to [VISIBILITY_MODE_DEFAULT], this depends
   * on the show collision debug settings.
   */
  public var collisionVisibilityMode: VisibilityMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionVisibilityModePtr, LONG)
      return TileMap.VisibilityMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionVisibilityModePtr, NIL)
    }

  /**
   * Show or hide the TileMap's navigation meshes. If set to [VISIBILITY_MODE_DEFAULT], this depends
   * on the show navigation debug settings.
   */
  public var navigationVisibilityMode: VisibilityMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNavigationVisibilityModePtr, LONG)
      return TileMap.VisibilityMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setNavigationVisibilityModePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_TILEMAP, scriptIndex)
  }

  /**
   * Should return `true` if the tile at coordinates [coords] on layer [layer] requires a runtime
   * update.
   * **Warning:** Make sure this function only return `true` when needed. Any tile processed at
   * runtime without a need for it will imply a significant performance penalty.
   * **Note:** If the result of this function should changed, use [notifyRuntimeTileDataUpdate] to
   * notify the TileMap it needs an update.
   */
  public open fun _useTileDataRuntimeUpdate(layer: Int, coords: Vector2i): Boolean {
    throw NotImplementedError("_use_tile_data_runtime_update is not implemented for TileMap")
  }

  /**
   * Called with a TileData object about to be used internally by the TileMap, allowing its
   * modification at runtime.
   * This method is only called if [_useTileDataRuntimeUpdate] is implemented and returns `true` for
   * the given tile [coords] and [layer].
   * **Warning:** The [tileData] object's sub-resources are the same as the one in the TileSet.
   * Modifying them might impact the whole TileSet. Instead, make sure to duplicate those resources.
   * **Note:** If the properties of [tileData] object should change over time, use
   * [notifyRuntimeTileDataUpdate] to notify the TileMap it needs an update.
   */
  public open fun _tileDataRuntimeUpdate(
    layer: Int,
    coords: Vector2i,
    tileData: TileData,
  ): Unit {
  }

  /**
   * Assigns [map] as a [NavigationServer2D] navigation map for the specified TileMap layer [layer].
   */
  public fun setNavigationMap(layer: Int, map: RID): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), _RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.setNavigationMapPtr, NIL)
  }

  /**
   * Returns the [RID] of the [NavigationServer2D] navigation map assigned to the specified TileMap
   * layer [layer].
   */
  public fun getNavigationMap(layer: Int): RID {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Forces the TileMap and the layer [layer] to update.
   */
  @JvmOverloads
  public fun forceUpdate(layer: Int = -1): Unit {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.forceUpdatePtr, NIL)
  }

  /**
   * Returns the number of layers in the TileMap.
   */
  public fun getLayersCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLayersCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a layer at the given position [toPosition] in the array. If [toPosition] is negative, the
   * position is counted from the end, with `-1` adding the layer at the end of the array.
   */
  public fun addLayer(toPosition: Int): Unit {
    TransferContext.writeArguments(LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addLayerPtr, NIL)
  }

  /**
   * Moves the layer at index [layer] to the given position [toPosition] in the array.
   */
  public fun moveLayer(layer: Int, toPosition: Int): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), LONG to toPosition.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.moveLayerPtr, NIL)
  }

  /**
   * Removes the layer at index [layer].
   */
  public fun removeLayer(layer: Int): Unit {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeLayerPtr, NIL)
  }

  /**
   * Sets a layer's name. This is mostly useful in the editor.
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public fun setLayerName(layer: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setLayerNamePtr, NIL)
  }

  /**
   * Returns a TileMap layer's name.
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public fun getLayerName(layer: Int): String {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLayerNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Enables or disables the layer [layer]. A disabled layer is not processed at all (no rendering,
   * no physics, etc.).
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public fun setLayerEnabled(layer: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setLayerEnabledPtr, NIL)
  }

  /**
   * Returns if a layer is enabled.
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public fun isLayerEnabled(layer: Int): Boolean {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isLayerEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets a layer's color. It will be multiplied by tile's color and TileMap's modulate.
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public fun setLayerModulate(layer: Int, modulate: Color): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), COLOR to modulate)
    TransferContext.callMethod(rawPtr, MethodBindings.setLayerModulatePtr, NIL)
  }

  /**
   * Returns a TileMap layer's modulate.
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public fun getLayerModulate(layer: Int): Color {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLayerModulatePtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Enables or disables a layer's Y-sorting. If a layer is Y-sorted, the layer will behave as a
   * CanvasItem node where each of its tile gets Y-sorted.
   * Y-sorted layers should usually be on different Z-index values than not Y-sorted layers,
   * otherwise, each of those layer will be Y-sorted as whole with the Y-sorted one. This is usually an
   * undesired behavior.
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public fun setLayerYSortEnabled(layer: Int, ySortEnabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), BOOL to ySortEnabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setLayerYSortEnabledPtr, NIL)
  }

  /**
   * Returns if a layer Y-sorts its tiles.
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public fun isLayerYSortEnabled(layer: Int): Boolean {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isLayerYSortEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets a layer's Y-sort origin value. This Y-sort origin value is added to each tile's Y-sort
   * origin value.
   * This allows, for example, to fake a different height level on each layer. This can be useful
   * for top-down view games.
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public fun setLayerYSortOrigin(layer: Int, ySortOrigin: Int): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), LONG to ySortOrigin.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setLayerYSortOriginPtr, NIL)
  }

  /**
   * Returns a TileMap layer's Y sort origin.
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public fun getLayerYSortOrigin(layer: Int): Int {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLayerYSortOriginPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets a layers Z-index value. This Z-index is added to each tile's Z-index value.
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public fun setLayerZIndex(layer: Int, zIndex: Int): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), LONG to zIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setLayerZIndexPtr, NIL)
  }

  /**
   * Returns a TileMap layer's Z-index value.
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public fun getLayerZIndex(layer: Int): Int {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLayerZIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Enables or disables a layer's built-in navigation regions generation. Disable this if you need
   * to bake navigation regions from a TileMap using a [NavigationRegion2D] node.
   */
  public fun setLayerNavigationEnabled(layer: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setLayerNavigationEnabledPtr, NIL)
  }

  /**
   * Returns if a layer's built-in navigation regions generation is enabled.
   */
  public fun isLayerNavigationEnabled(layer: Int): Boolean {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isLayerNavigationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Assigns [map] as a [NavigationServer2D] navigation map for the specified TileMap layer [layer].
   * By default the TileMap uses the default [World2D] navigation map for the first TileMap layer.
   * For each additional TileMap layer a new navigation map is created for the additional layer.
   * In order to make [NavigationAgent2D] switch between TileMap layer navigation maps use
   * [NavigationAgent2D.setNavigationMap] with the navigation map received from
   * [getLayerNavigationMap].
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public fun setLayerNavigationMap(layer: Int, map: RID): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), _RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.setLayerNavigationMapPtr, NIL)
  }

  /**
   * Returns the [RID] of the [NavigationServer2D] navigation map assigned to the specified TileMap
   * layer [layer].
   * By default the TileMap uses the default [World2D] navigation map for the first TileMap layer.
   * For each additional TileMap layer a new navigation map is created for the additional layer.
   * In order to make [NavigationAgent2D] switch between TileMap layer navigation maps use
   * [NavigationAgent2D.setNavigationMap] with the navigation map received from
   * [getLayerNavigationMap].
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public fun getLayerNavigationMap(layer: Int): RID {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLayerNavigationMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the tile identifiers for the cell on layer [layer] at coordinates [coords]. Each tile of
   * the [TileSet] is identified using three parts:
   * - The source identifier [sourceId] identifies a [TileSetSource] identifier. See
   * [TileSet.setSourceId],
   * - The atlas coordinates identifier [atlasCoords] identifies a tile coordinates in the atlas (if
   * the source is a [TileSetAtlasSource]). For [TileSetScenesCollectionSource] it should always be
   * `Vector2i(0, 0)`),
   * - The alternative tile identifier [alternativeTile] identifies a tile alternative in the atlas
   * (if the source is a [TileSetAtlasSource]), and the scene for a [TileSetScenesCollectionSource].
   * If [sourceId] is set to `-1`, [atlasCoords] to `Vector2i(-1, -1)` or [alternativeTile] to `-1`,
   * the cell will be erased. An erased cell gets **all** its identifiers automatically set to their
   * respective invalid values, namely `-1`, `Vector2i(-1, -1)` and `-1`.
   * If [layer] is negative, the layers are accessed from the last one.
   */
  @JvmOverloads
  public fun setCell(
    layer: Int,
    coords: Vector2i,
    sourceId: Int = -1,
    atlasCoords: Vector2i = Vector2i(-1, -1),
    alternativeTile: Int = 0,
  ): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords, LONG to sourceId.toLong(), VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCellPtr, NIL)
  }

  /**
   * Erases the cell on layer [layer] at coordinates [coords].
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public fun eraseCell(layer: Int, coords: Vector2i): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords)
    TransferContext.callMethod(rawPtr, MethodBindings.eraseCellPtr, NIL)
  }

  /**
   * Returns the tile source ID of the cell on layer [layer] at coordinates [coords]. Returns `-1`
   * if the cell does not exist.
   * If [useProxies] is `false`, ignores the [TileSet]'s tile proxies, returning the raw source
   * identifier. See [TileSet.mapTileProxy].
   * If [layer] is negative, the layers are accessed from the last one.
   */
  @JvmOverloads
  public fun getCellSourceId(
    layer: Int,
    coords: Vector2i,
    useProxies: Boolean = false,
  ): Int {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords, BOOL to useProxies)
    TransferContext.callMethod(rawPtr, MethodBindings.getCellSourceIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the tile atlas coordinates ID of the cell on layer [layer] at coordinates [coords].
   * Returns `Vector2i(-1, -1)` if the cell does not exist.
   * If [useProxies] is `false`, ignores the [TileSet]'s tile proxies, returning the raw atlas
   * coordinate identifier. See [TileSet.mapTileProxy].
   * If [layer] is negative, the layers are accessed from the last one.
   */
  @JvmOverloads
  public fun getCellAtlasCoords(
    layer: Int,
    coords: Vector2i,
    useProxies: Boolean = false,
  ): Vector2i {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords, BOOL to useProxies)
    TransferContext.callMethod(rawPtr, MethodBindings.getCellAtlasCoordsPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Returns the tile alternative ID of the cell on layer [layer] at [coords].
   * If [useProxies] is `false`, ignores the [TileSet]'s tile proxies, returning the raw alternative
   * identifier. See [TileSet.mapTileProxy].
   * If [layer] is negative, the layers are accessed from the last one.
   */
  @JvmOverloads
  public fun getCellAlternativeTile(
    layer: Int,
    coords: Vector2i,
    useProxies: Boolean = false,
  ): Int {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords, BOOL to useProxies)
    TransferContext.callMethod(rawPtr, MethodBindings.getCellAlternativeTilePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [TileData] object associated with the given cell, or `null` if the cell does not
   * exist or is not a [TileSetAtlasSource].
   * If [layer] is negative, the layers are accessed from the last one.
   * [codeblock]
   * func get_clicked_tile_power():
   *     var clicked_cell = tile_map.local_to_map(tile_map.get_local_mouse_position())
   *     var data = tile_map.get_cell_tile_data(0, clicked_cell)
   *     if data:
   *         return data.get_custom_data("power")
   *     else:
   *         return 0
   * [/codeblock]
   * If [useProxies] is `false`, ignores the [TileSet]'s tile proxies. See [TileSet.mapTileProxy].
   */
  @JvmOverloads
  public fun getCellTileData(
    layer: Int,
    coords: Vector2i,
    useProxies: Boolean = false,
  ): TileData? {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords, BOOL to useProxies)
    TransferContext.callMethod(rawPtr, MethodBindings.getCellTileDataPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TileData?)
  }

  /**
   * Returns the coordinates of the tile for given physics body RID. Such RID can be retrieved from
   * [KinematicCollision2D.getColliderRid], when colliding with a tile.
   */
  public fun getCoordsForBodyRid(body: RID): Vector2i {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.getCoordsForBodyRidPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Returns the tilemap layer of the tile for given physics body RID. Such RID can be retrieved
   * from [KinematicCollision2D.getColliderRid], when colliding with a tile.
   */
  public fun getLayerForBodyRid(body: RID): Int {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, MethodBindings.getLayerForBodyRidPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Creates a new [TileMapPattern] from the given layer and set of cells.
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public fun getPattern(layer: Int, coordsArray: VariantArray<Vector2i>): TileMapPattern? {
    TransferContext.writeArguments(LONG to layer.toLong(), ARRAY to coordsArray)
    TransferContext.callMethod(rawPtr, MethodBindings.getPatternPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TileMapPattern?)
  }

  /**
   * Returns for the given coordinate [coordsInPattern] in a [TileMapPattern] the corresponding cell
   * coordinates if the pattern was pasted at the [positionInTilemap] coordinates (see [setPattern]).
   * This mapping is required as in half-offset tile shapes, the mapping might not work by calculating
   * `position_in_tile_map + coords_in_pattern`.
   */
  public fun mapPattern(
    positionInTilemap: Vector2i,
    coordsInPattern: Vector2i,
    pattern: TileMapPattern,
  ): Vector2i {
    TransferContext.writeArguments(VECTOR2I to positionInTilemap, VECTOR2I to coordsInPattern, OBJECT to pattern)
    TransferContext.callMethod(rawPtr, MethodBindings.mapPatternPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Paste the given [TileMapPattern] at the given [position] and [layer] in the tile map.
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public fun setPattern(
    layer: Int,
    position: Vector2i,
    pattern: TileMapPattern,
  ): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to position, OBJECT to pattern)
    TransferContext.callMethod(rawPtr, MethodBindings.setPatternPtr, NIL)
  }

  /**
   * Update all the cells in the [cells] coordinates array so that they use the given [terrain] for
   * the given [terrainSet]. If an updated cell has the same terrain as one of its neighboring cells,
   * this function tries to join the two. This function might update neighboring tiles if needed to
   * create correct terrain transitions.
   * If [ignoreEmptyTerrains] is true, empty terrains will be ignored when trying to find the best
   * fitting tile for the given terrain constraints.
   * If [layer] is negative, the layers are accessed from the last one.
   * **Note:** To work correctly, this method requires the TileMap's TileSet to have terrains set up
   * with all required terrain combinations. Otherwise, it may produce unexpected results.
   */
  @JvmOverloads
  public fun setCellsTerrainConnect(
    layer: Int,
    cells: VariantArray<Vector2i>,
    terrainSet: Int,
    terrain: Int,
    ignoreEmptyTerrains: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), ARRAY to cells, LONG to terrainSet.toLong(), LONG to terrain.toLong(), BOOL to ignoreEmptyTerrains)
    TransferContext.callMethod(rawPtr, MethodBindings.setCellsTerrainConnectPtr, NIL)
  }

  /**
   * Update all the cells in the [path] coordinates array so that they use the given [terrain] for
   * the given [terrainSet]. The function will also connect two successive cell in the path with the
   * same terrain. This function might update neighboring tiles if needed to create correct terrain
   * transitions.
   * If [ignoreEmptyTerrains] is true, empty terrains will be ignored when trying to find the best
   * fitting tile for the given terrain constraints.
   * If [layer] is negative, the layers are accessed from the last one.
   * **Note:** To work correctly, this method requires the TileMap's TileSet to have terrains set up
   * with all required terrain combinations. Otherwise, it may produce unexpected results.
   */
  @JvmOverloads
  public fun setCellsTerrainPath(
    layer: Int,
    path: VariantArray<Vector2i>,
    terrainSet: Int,
    terrain: Int,
    ignoreEmptyTerrains: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), ARRAY to path, LONG to terrainSet.toLong(), LONG to terrain.toLong(), BOOL to ignoreEmptyTerrains)
    TransferContext.callMethod(rawPtr, MethodBindings.setCellsTerrainPathPtr, NIL)
  }

  /**
   * Clears cells that do not exist in the tileset.
   */
  public fun fixInvalidTiles(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.fixInvalidTilesPtr, NIL)
  }

  /**
   * Clears all cells on the given layer.
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public fun clearLayer(layer: Int): Unit {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.clearLayerPtr, NIL)
  }

  /**
   * Clears all cells.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Triggers a direct update of the TileMap. Usually, calling this function is not needed, as
   * TileMap node updates automatically when one of its properties or cells is modified.
   * However, for performance reasons, those updates are batched and delayed to the end of the
   * frame. Calling this function will force the TileMap to update right away instead.
   * **Warning:** Updating the TileMap is computationally expensive and may impact performance. Try
   * to limit the number of updates and how many tiles they impact.
   */
  public fun updateInternals(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.updateInternalsPtr, NIL)
  }

  /**
   * Notifies the TileMap node that calls to [_useTileDataRuntimeUpdate] or [_tileDataRuntimeUpdate]
   * will lead to different results. This will thus trigger a TileMap update.
   * If [layer] is provided, only notifies changes for the given layer. Providing the [layer]
   * argument (when applicable) is usually preferred for performance reasons.
   * **Warning:** Updating the TileMap is computationally expensive and may impact performance. Try
   * to limit the number of calls to this function to avoid unnecessary update.
   * **Note:** This does not trigger a direct update of the TileMap, the update will be done at the
   * end of the frame as usual (unless you call [updateInternals]).
   */
  @JvmOverloads
  public fun notifyRuntimeTileDataUpdate(layer: Int = -1): Unit {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.notifyRuntimeTileDataUpdatePtr, NIL)
  }

  /**
   * Returns the list of all neighbourings cells to the one at [coords].
   */
  public fun getSurroundingCells(coords: Vector2i): VariantArray<Vector2i> {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(rawPtr, MethodBindings.getSurroundingCellsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector2i>)
  }

  /**
   * Returns a [Vector2i] array with the positions of all cells containing a tile in the given
   * layer. A cell is considered empty if its source identifier equals -1, its atlas coordinates
   * identifiers is `Vector2(-1, -1)` and its alternative identifier is -1.
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public fun getUsedCells(layer: Int): VariantArray<Vector2i> {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getUsedCellsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector2i>)
  }

  /**
   * Returns a [Vector2i] array with the positions of all cells containing a tile in the given
   * layer. Tiles may be filtered according to their source ([sourceId]), their atlas coordinates
   * ([atlasCoords]) or alternative id ([alternativeTile]).
   * If a parameter has its value set to the default one, this parameter is not used to filter a
   * cell. Thus, if all parameters have their respective default value, this method returns the same
   * result as [getUsedCells].
   * A cell is considered empty if its source identifier equals -1, its atlas coordinates
   * identifiers is `Vector2(-1, -1)` and its alternative identifier is -1.
   * If [layer] is negative, the layers are accessed from the last one.
   */
  @JvmOverloads
  public fun getUsedCellsById(
    layer: Int,
    sourceId: Int = -1,
    atlasCoords: Vector2i = Vector2i(-1, -1),
    alternativeTile: Int = -1,
  ): VariantArray<Vector2i> {
    TransferContext.writeArguments(LONG to layer.toLong(), LONG to sourceId.toLong(), VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getUsedCellsByIdPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector2i>)
  }

  /**
   * Returns a rectangle enclosing the used (non-empty) tiles of the map, including all layers.
   */
  public fun getUsedRect(): Rect2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUsedRectPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I, false) as Rect2i)
  }

  /**
   * Returns the centered position of a cell in the TileMap's local coordinate space. To convert the
   * returned value into global coordinates, use [Node2D.toGlobal]. See also [localToMap].
   * **Note:** This may not correspond to the visual position of the tile, i.e. it ignores the
   * [TileData.textureOrigin] property of individual tiles.
   */
  public fun mapToLocal(mapPosition: Vector2i): Vector2 {
    TransferContext.writeArguments(VECTOR2I to mapPosition)
    TransferContext.callMethod(rawPtr, MethodBindings.mapToLocalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the map coordinates of the cell containing the given [localPosition]. If
   * [localPosition] is in global coordinates, consider using [Node2D.toLocal] before passing it to
   * this method. See also [mapToLocal].
   */
  public fun localToMap(localPosition: Vector2): Vector2i {
    TransferContext.writeArguments(VECTOR2 to localPosition)
    TransferContext.callMethod(rawPtr, MethodBindings.localToMapPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Returns the neighboring cell to the one at coordinates [coords], identified by the [neighbor]
   * direction. This method takes into account the different layouts a TileMap can take.
   */
  public fun getNeighborCell(coords: Vector2i, neighbor: TileSet.CellNeighbor): Vector2i {
    TransferContext.writeArguments(VECTOR2I to coords, LONG to neighbor.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getNeighborCellPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  public enum class VisibilityMode(
    id: Long,
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
      public fun from(`value`: Long): VisibilityMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_navigation_map")

    public val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_navigation_map")

    public val forceUpdatePtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "force_update")

    public val setTilesetPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "set_tileset")

    public val getTilesetPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "get_tileset")

    public val setRenderingQuadrantSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_rendering_quadrant_size")

    public val getRenderingQuadrantSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_rendering_quadrant_size")

    public val getLayersCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_layers_count")

    public val addLayerPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "add_layer")

    public val moveLayerPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "move_layer")

    public val removeLayerPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "remove_layer")

    public val setLayerNamePtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "set_layer_name")

    public val getLayerNamePtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "get_layer_name")

    public val setLayerEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_layer_enabled")

    public val isLayerEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "is_layer_enabled")

    public val setLayerModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_layer_modulate")

    public val getLayerModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_layer_modulate")

    public val setLayerYSortEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_layer_y_sort_enabled")

    public val isLayerYSortEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "is_layer_y_sort_enabled")

    public val setLayerYSortOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_layer_y_sort_origin")

    public val getLayerYSortOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_layer_y_sort_origin")

    public val setLayerZIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_layer_z_index")

    public val getLayerZIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_layer_z_index")

    public val setLayerNavigationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_layer_navigation_enabled")

    public val isLayerNavigationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "is_layer_navigation_enabled")

    public val setLayerNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_layer_navigation_map")

    public val getLayerNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_layer_navigation_map")

    public val setCollisionAnimatablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_collision_animatable")

    public val isCollisionAnimatablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "is_collision_animatable")

    public val setCollisionVisibilityModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_collision_visibility_mode")

    public val getCollisionVisibilityModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_collision_visibility_mode")

    public val setNavigationVisibilityModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_navigation_visibility_mode")

    public val getNavigationVisibilityModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_navigation_visibility_mode")

    public val setCellPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "set_cell")

    public val eraseCellPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "erase_cell")

    public val getCellSourceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_cell_source_id")

    public val getCellAtlasCoordsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_cell_atlas_coords")

    public val getCellAlternativeTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_cell_alternative_tile")

    public val getCellTileDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_cell_tile_data")

    public val getCoordsForBodyRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_coords_for_body_rid")

    public val getLayerForBodyRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_layer_for_body_rid")

    public val getPatternPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "get_pattern")

    public val mapPatternPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "map_pattern")

    public val setPatternPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "set_pattern")

    public val setCellsTerrainConnectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_cells_terrain_connect")

    public val setCellsTerrainPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_cells_terrain_path")

    public val fixInvalidTilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "fix_invalid_tiles")

    public val clearLayerPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "clear_layer")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "clear")

    public val updateInternalsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "update_internals")

    public val notifyRuntimeTileDataUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "notify_runtime_tile_data_update")

    public val getSurroundingCellsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_surrounding_cells")

    public val getUsedCellsPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "get_used_cells")

    public val getUsedCellsByIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_used_cells_by_id")

    public val getUsedRectPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "get_used_rect")

    public val mapToLocalPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "map_to_local")

    public val localToMapPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "local_to_map")

    public val getNeighborCellPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_neighbor_cell")
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.MethodStringName0
import godot.core.MethodStringName1
import godot.core.MethodStringName2
import godot.core.MethodStringName3
import godot.core.MethodStringName4
import godot.core.MethodStringName5
import godot.core.RID
import godot.core.Rect2i
import godot.core.Signal0
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.RECT2I
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR2I
import godot.core.VariantParser._RID
import godot.core.Vector2
import godot.core.Vector2i
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Node for 2D tile-based maps. Tilemaps use a [TileSet] which contain a list of tiles which are
 * used to create grid-based maps. A TileMap may have several layers, layouting tiles on top of each
 * other.
 *
 * For performance reasons, all TileMap updates are batched at the end of a frame. Notably, this
 * means that scene tiles from a [TileSetScenesCollectionSource] may be initialized after their parent.
 * This is only queued when inside the scene tree.
 *
 * To force an update earlier on, call [updateInternals].
 *
 * **Note:** For performance and compatibility reasons, the coordinates serialized by [TileMap] are
 * limited to 16-bit signed integers, i.e. the range for X and Y coordinates is from `-32768` to
 * `32767`. When saving tile data, tiles outside this range are wrapped.
 */
@GodotBaseType
public open class TileMap : Node2D() {
  /**
   * Emitted when the [TileSet] of this TileMap changes.
   */
  public val changed: Signal0 by Signal0

  /**
   * The [TileSet] used by this [TileMap]. The textures, collisions, and additional behavior of all
   * available tiles are stored here.
   */
  public final inline var tileSet: TileSet?
    @JvmName("tileSetProperty")
    get() = getTileset()
    @JvmName("tileSetProperty")
    set(`value`) {
      setTileset(value)
    }

  /**
   * The TileMap's quadrant size. A quadrant is a group of tiles to be drawn together on a single
   * canvas item, for optimization purposes. [renderingQuadrantSize] defines the length of a square's
   * side, in the map's coordinate system, that forms the quadrant. Thus, the default quadrant size
   * groups together `16 * 16 = 256` tiles.
   *
   * The quadrant size does not apply on Y-sorted layers, as tiles are grouped by Y position instead
   * in that case.
   *
   * **Note:** As quadrants are created according to the map's coordinate system, the quadrant's
   * "square shape" might not look like square in the TileMap's local coordinate system.
   */
  public final inline var renderingQuadrantSize: Int
    @JvmName("renderingQuadrantSizeProperty")
    get() = getRenderingQuadrantSize()
    @JvmName("renderingQuadrantSizeProperty")
    set(`value`) {
      setRenderingQuadrantSize(value)
    }

  /**
   * If enabled, the TileMap will see its collisions synced to the physics tick and change its
   * collision type from static to kinematic. This is required to create TileMap-based moving platform.
   *
   * **Note:** Enabling [collisionAnimatable] may have a small performance impact, only do it if the
   * TileMap is moving and has colliding tiles.
   */
  public final inline var collisionAnimatable: Boolean
    @JvmName("collisionAnimatableProperty")
    get() = isCollisionAnimatable()
    @JvmName("collisionAnimatableProperty")
    set(`value`) {
      setCollisionAnimatable(value)
    }

  /**
   * Show or hide the TileMap's collision shapes. If set to [VISIBILITY_MODE_DEFAULT], this depends
   * on the show collision debug settings.
   */
  public final inline var collisionVisibilityMode: VisibilityMode
    @JvmName("collisionVisibilityModeProperty")
    get() = getCollisionVisibilityMode()
    @JvmName("collisionVisibilityModeProperty")
    set(`value`) {
      setCollisionVisibilityMode(value)
    }

  /**
   * Show or hide the TileMap's navigation meshes. If set to [VISIBILITY_MODE_DEFAULT], this depends
   * on the show navigation debug settings.
   */
  public final inline var navigationVisibilityMode: VisibilityMode
    @JvmName("navigationVisibilityModeProperty")
    get() = getNavigationVisibilityMode()
    @JvmName("navigationVisibilityModeProperty")
    set(`value`) {
      setNavigationVisibilityMode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(682, scriptIndex)
  }

  /**
   * Should return `true` if the tile at coordinates [coords] on layer [layer] requires a runtime
   * update.
   *
   * **Warning:** Make sure this function only return `true` when needed. Any tile processed at
   * runtime without a need for it will imply a significant performance penalty.
   *
   * **Note:** If the result of this function should changed, use [notifyRuntimeTileDataUpdate] to
   * notify the TileMap it needs an update.
   */
  public open fun _useTileDataRuntimeUpdate(layer: Int, coords: Vector2i): Boolean {
    throw NotImplementedError("_useTileDataRuntimeUpdate is not implemented for TileMap")
  }

  /**
   * Called with a TileData object about to be used internally by the TileMap, allowing its
   * modification at runtime.
   *
   * This method is only called if [_useTileDataRuntimeUpdate] is implemented and returns `true` for
   * the given tile [coords] and [layer].
   *
   * **Warning:** The [tileData] object's sub-resources are the same as the one in the TileSet.
   * Modifying them might impact the whole TileSet. Instead, make sure to duplicate those resources.
   *
   * **Note:** If the properties of [tileData] object should change over time, use
   * [notifyRuntimeTileDataUpdate] to notify the TileMap it needs an update.
   */
  public open fun _tileDataRuntimeUpdate(
    layer: Int,
    coords: Vector2i,
    tileData: TileData?,
  ): Unit {
    throw NotImplementedError("_tileDataRuntimeUpdate is not implemented for TileMap")
  }

  /**
   * Assigns [map] as a [NavigationServer2D] navigation map for the specified TileMap layer [layer].
   */
  public final fun setNavigationMap(layer: Int, map: RID): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), _RID to map)
    TransferContext.callMethod(ptr, MethodBindings.setNavigationMapPtr, NIL)
  }

  /**
   * Returns the [RID] of the [NavigationServer2D] navigation map assigned to the specified TileMap
   * layer [layer].
   */
  public final fun getNavigationMap(layer: Int): RID {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getNavigationMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Forces the TileMap and the layer [layer] to update.
   */
  @JvmOverloads
  public final fun forceUpdate(layer: Int = -1): Unit {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.forceUpdatePtr, NIL)
  }

  public final fun setTileset(tileset: TileSet?): Unit {
    TransferContext.writeArguments(OBJECT to tileset)
    TransferContext.callMethod(ptr, MethodBindings.setTilesetPtr, NIL)
  }

  public final fun getTileset(): TileSet? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTilesetPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TileSet?)
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

  /**
   * Returns the number of layers in the TileMap.
   */
  public final fun getLayersCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLayersCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds a layer at the given position [toPosition] in the array. If [toPosition] is negative, the
   * position is counted from the end, with `-1` adding the layer at the end of the array.
   */
  public final fun addLayer(toPosition: Int): Unit {
    TransferContext.writeArguments(LONG to toPosition.toLong())
    TransferContext.callMethod(ptr, MethodBindings.addLayerPtr, NIL)
  }

  /**
   * Moves the layer at index [layer] to the given position [toPosition] in the array.
   */
  public final fun moveLayer(layer: Int, toPosition: Int): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), LONG to toPosition.toLong())
    TransferContext.callMethod(ptr, MethodBindings.moveLayerPtr, NIL)
  }

  /**
   * Removes the layer at index [layer].
   */
  public final fun removeLayer(layer: Int): Unit {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeLayerPtr, NIL)
  }

  /**
   * Sets a layer's name. This is mostly useful in the editor.
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public final fun setLayerName(layer: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.setLayerNamePtr, NIL)
  }

  /**
   * Returns a TileMap layer's name.
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public final fun getLayerName(layer: Int): String {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLayerNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Enables or disables the layer [layer]. A disabled layer is not processed at all (no rendering,
   * no physics, etc.).
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public final fun setLayerEnabled(layer: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setLayerEnabledPtr, NIL)
  }

  /**
   * Returns if a layer is enabled.
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public final fun isLayerEnabled(layer: Int): Boolean {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isLayerEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets a layer's color. It will be multiplied by tile's color and TileMap's modulate.
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public final fun setLayerModulate(layer: Int, modulate: Color): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), COLOR to modulate)
    TransferContext.callMethod(ptr, MethodBindings.setLayerModulatePtr, NIL)
  }

  /**
   * Returns a TileMap layer's modulate.
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public final fun getLayerModulate(layer: Int): Color {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLayerModulatePtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  /**
   * Enables or disables a layer's Y-sorting. If a layer is Y-sorted, the layer will behave as a
   * CanvasItem node where each of its tile gets Y-sorted.
   *
   * Y-sorted layers should usually be on different Z-index values than not Y-sorted layers,
   * otherwise, each of those layer will be Y-sorted as whole with the Y-sorted one. This is usually an
   * undesired behavior.
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public final fun setLayerYSortEnabled(layer: Int, ySortEnabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), BOOL to ySortEnabled)
    TransferContext.callMethod(ptr, MethodBindings.setLayerYSortEnabledPtr, NIL)
  }

  /**
   * Returns if a layer Y-sorts its tiles.
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public final fun isLayerYSortEnabled(layer: Int): Boolean {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isLayerYSortEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets a layer's Y-sort origin value. This Y-sort origin value is added to each tile's Y-sort
   * origin value.
   *
   * This allows, for example, to fake a different height level on each layer. This can be useful
   * for top-down view games.
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public final fun setLayerYSortOrigin(layer: Int, ySortOrigin: Int): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), LONG to ySortOrigin.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setLayerYSortOriginPtr, NIL)
  }

  /**
   * Returns a TileMap layer's Y sort origin.
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public final fun getLayerYSortOrigin(layer: Int): Int {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLayerYSortOriginPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets a layers Z-index value. This Z-index is added to each tile's Z-index value.
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public final fun setLayerZIndex(layer: Int, zIndex: Int): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), LONG to zIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setLayerZIndexPtr, NIL)
  }

  /**
   * Returns a TileMap layer's Z-index value.
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public final fun getLayerZIndex(layer: Int): Int {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLayerZIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Enables or disables a layer's built-in navigation regions generation. Disable this if you need
   * to bake navigation regions from a TileMap using a [NavigationRegion2D] node.
   */
  public final fun setLayerNavigationEnabled(layer: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setLayerNavigationEnabledPtr, NIL)
  }

  /**
   * Returns if a layer's built-in navigation regions generation is enabled.
   */
  public final fun isLayerNavigationEnabled(layer: Int): Boolean {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isLayerNavigationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Assigns [map] as a [NavigationServer2D] navigation map for the specified TileMap layer [layer].
   *
   * By default the TileMap uses the default [World2D] navigation map for the first TileMap layer.
   * For each additional TileMap layer a new navigation map is created for the additional layer.
   *
   * In order to make [NavigationAgent2D] switch between TileMap layer navigation maps use
   * [NavigationAgent2D.setNavigationMap] with the navigation map received from
   * [getLayerNavigationMap].
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public final fun setLayerNavigationMap(layer: Int, map: RID): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), _RID to map)
    TransferContext.callMethod(ptr, MethodBindings.setLayerNavigationMapPtr, NIL)
  }

  /**
   * Returns the [RID] of the [NavigationServer2D] navigation map assigned to the specified TileMap
   * layer [layer].
   *
   * By default the TileMap uses the default [World2D] navigation map for the first TileMap layer.
   * For each additional TileMap layer a new navigation map is created for the additional layer.
   *
   * In order to make [NavigationAgent2D] switch between TileMap layer navigation maps use
   * [NavigationAgent2D.setNavigationMap] with the navigation map received from
   * [getLayerNavigationMap].
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public final fun getLayerNavigationMap(layer: Int): RID {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLayerNavigationMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setCollisionAnimatable(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionAnimatablePtr, NIL)
  }

  public final fun isCollisionAnimatable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isCollisionAnimatablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCollisionVisibilityMode(collisionVisibilityMode: VisibilityMode): Unit {
    TransferContext.writeArguments(LONG to collisionVisibilityMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionVisibilityModePtr, NIL)
  }

  public final fun getCollisionVisibilityMode(): VisibilityMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionVisibilityModePtr, LONG)
    return VisibilityMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setNavigationVisibilityMode(navigationVisibilityMode: VisibilityMode): Unit {
    TransferContext.writeArguments(LONG to navigationVisibilityMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setNavigationVisibilityModePtr, NIL)
  }

  public final fun getNavigationVisibilityMode(): VisibilityMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNavigationVisibilityModePtr, LONG)
    return VisibilityMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the tile identifiers for the cell on layer [layer] at coordinates [coords]. Each tile of
   * the [TileSet] is identified using three parts:
   *
   * - The source identifier [sourceId] identifies a [TileSetSource] identifier. See
   * [TileSet.setSourceId],
   *
   * - The atlas coordinates identifier [atlasCoords] identifies a tile coordinates in the atlas (if
   * the source is a [TileSetAtlasSource]). For [TileSetScenesCollectionSource] it should always be
   * `Vector2i(0, 0)`),
   *
   * - The alternative tile identifier [alternativeTile] identifies a tile alternative in the atlas
   * (if the source is a [TileSetAtlasSource]), and the scene for a [TileSetScenesCollectionSource].
   *
   * If [sourceId] is set to `-1`, [atlasCoords] to `Vector2i(-1, -1)` or [alternativeTile] to `-1`,
   * the cell will be erased. An erased cell gets **all** its identifiers automatically set to their
   * respective invalid values, namely `-1`, `Vector2i(-1, -1)` and `-1`.
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  @JvmOverloads
  public final fun setCell(
    layer: Int,
    coords: Vector2i,
    sourceId: Int = -1,
    atlasCoords: Vector2i = Vector2i(-1, -1),
    alternativeTile: Int = 0,
  ): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords, LONG to sourceId.toLong(), VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setCellPtr, NIL)
  }

  /**
   * Erases the cell on layer [layer] at coordinates [coords].
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public final fun eraseCell(layer: Int, coords: Vector2i): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords)
    TransferContext.callMethod(ptr, MethodBindings.eraseCellPtr, NIL)
  }

  /**
   * Returns the tile source ID of the cell on layer [layer] at coordinates [coords]. Returns `-1`
   * if the cell does not exist.
   *
   * If [useProxies] is `false`, ignores the [TileSet]'s tile proxies, returning the raw source
   * identifier. See [TileSet.mapTileProxy].
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  @JvmOverloads
  public final fun getCellSourceId(
    layer: Int,
    coords: Vector2i,
    useProxies: Boolean = false,
  ): Int {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords, BOOL to useProxies)
    TransferContext.callMethod(ptr, MethodBindings.getCellSourceIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the tile atlas coordinates ID of the cell on layer [layer] at coordinates [coords].
   * Returns `Vector2i(-1, -1)` if the cell does not exist.
   *
   * If [useProxies] is `false`, ignores the [TileSet]'s tile proxies, returning the raw atlas
   * coordinate identifier. See [TileSet.mapTileProxy].
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  @JvmOverloads
  public final fun getCellAtlasCoords(
    layer: Int,
    coords: Vector2i,
    useProxies: Boolean = false,
  ): Vector2i {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords, BOOL to useProxies)
    TransferContext.callMethod(ptr, MethodBindings.getCellAtlasCoordsPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the tile alternative ID of the cell on layer [layer] at [coords].
   *
   * If [useProxies] is `false`, ignores the [TileSet]'s tile proxies, returning the raw alternative
   * identifier. See [TileSet.mapTileProxy].
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  @JvmOverloads
  public final fun getCellAlternativeTile(
    layer: Int,
    coords: Vector2i,
    useProxies: Boolean = false,
  ): Int {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords, BOOL to useProxies)
    TransferContext.callMethod(ptr, MethodBindings.getCellAlternativeTilePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the [TileData] object associated with the given cell, or `null` if the cell does not
   * exist or is not a [TileSetAtlasSource].
   *
   * If [layer] is negative, the layers are accessed from the last one.
   *
   * ```
   * func get_clicked_tile_power():
   *     var clicked_cell = tile_map.local_to_map(tile_map.get_local_mouse_position())
   *     var data = tile_map.get_cell_tile_data(0, clicked_cell)
   *     if data:
   *         return data.get_custom_data("power")
   *     else:
   *         return 0
   * ```
   *
   * If [useProxies] is `false`, ignores the [TileSet]'s tile proxies. See [TileSet.mapTileProxy].
   */
  @JvmOverloads
  public final fun getCellTileData(
    layer: Int,
    coords: Vector2i,
    useProxies: Boolean = false,
  ): TileData? {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords, BOOL to useProxies)
    TransferContext.callMethod(ptr, MethodBindings.getCellTileDataPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TileData?)
  }

  /**
   * Returns `true` if the cell on layer [layer] at coordinates [coords] is flipped horizontally.
   * The result is valid only for atlas sources.
   */
  @JvmOverloads
  public final fun isCellFlippedH(
    layer: Int,
    coords: Vector2i,
    useProxies: Boolean = false,
  ): Boolean {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords, BOOL to useProxies)
    TransferContext.callMethod(ptr, MethodBindings.isCellFlippedHPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the cell on layer [layer] at coordinates [coords] is flipped vertically. The
   * result is valid only for atlas sources.
   */
  @JvmOverloads
  public final fun isCellFlippedV(
    layer: Int,
    coords: Vector2i,
    useProxies: Boolean = false,
  ): Boolean {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords, BOOL to useProxies)
    TransferContext.callMethod(ptr, MethodBindings.isCellFlippedVPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the cell on layer [layer] at coordinates [coords] is transposed. The result
   * is valid only for atlas sources.
   */
  @JvmOverloads
  public final fun isCellTransposed(
    layer: Int,
    coords: Vector2i,
    useProxies: Boolean = false,
  ): Boolean {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to coords, BOOL to useProxies)
    TransferContext.callMethod(ptr, MethodBindings.isCellTransposedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the coordinates of the tile for given physics body RID. Such RID can be retrieved from
   * [KinematicCollision2D.getColliderRid], when colliding with a tile.
   */
  public final fun getCoordsForBodyRid(body: RID): Vector2i {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(ptr, MethodBindings.getCoordsForBodyRidPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the tilemap layer of the tile for given physics body RID. Such RID can be retrieved
   * from [KinematicCollision2D.getColliderRid], when colliding with a tile.
   */
  public final fun getLayerForBodyRid(body: RID): Int {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(ptr, MethodBindings.getLayerForBodyRidPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Creates a new [TileMapPattern] from the given layer and set of cells.
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public final fun getPattern(layer: Int, coordsArray: VariantArray<Vector2i>): TileMapPattern? {
    TransferContext.writeArguments(LONG to layer.toLong(), ARRAY to coordsArray)
    TransferContext.callMethod(ptr, MethodBindings.getPatternPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TileMapPattern?)
  }

  /**
   * Returns for the given coordinate [coordsInPattern] in a [TileMapPattern] the corresponding cell
   * coordinates if the pattern was pasted at the [positionInTilemap] coordinates (see [setPattern]).
   * This mapping is required as in half-offset tile shapes, the mapping might not work by calculating
   * `position_in_tile_map + coords_in_pattern`.
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
   * Paste the given [TileMapPattern] at the given [position] and [layer] in the tile map.
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public final fun setPattern(
    layer: Int,
    position: Vector2i,
    pattern: TileMapPattern?,
  ): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), VECTOR2I to position, OBJECT to pattern)
    TransferContext.callMethod(ptr, MethodBindings.setPatternPtr, NIL)
  }

  /**
   * Update all the cells in the [cells] coordinates array so that they use the given [terrain] for
   * the given [terrainSet]. If an updated cell has the same terrain as one of its neighboring cells,
   * this function tries to join the two. This function might update neighboring tiles if needed to
   * create correct terrain transitions.
   *
   * If [ignoreEmptyTerrains] is `true`, empty terrains will be ignored when trying to find the best
   * fitting tile for the given terrain constraints.
   *
   * If [layer] is negative, the layers are accessed from the last one.
   *
   * **Note:** To work correctly, this method requires the TileMap's TileSet to have terrains set up
   * with all required terrain combinations. Otherwise, it may produce unexpected results.
   */
  @JvmOverloads
  public final fun setCellsTerrainConnect(
    layer: Int,
    cells: VariantArray<Vector2i>,
    terrainSet: Int,
    terrain: Int,
    ignoreEmptyTerrains: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), ARRAY to cells, LONG to terrainSet.toLong(), LONG to terrain.toLong(), BOOL to ignoreEmptyTerrains)
    TransferContext.callMethod(ptr, MethodBindings.setCellsTerrainConnectPtr, NIL)
  }

  /**
   * Update all the cells in the [path] coordinates array so that they use the given [terrain] for
   * the given [terrainSet]. The function will also connect two successive cell in the path with the
   * same terrain. This function might update neighboring tiles if needed to create correct terrain
   * transitions.
   *
   * If [ignoreEmptyTerrains] is `true`, empty terrains will be ignored when trying to find the best
   * fitting tile for the given terrain constraints.
   *
   * If [layer] is negative, the layers are accessed from the last one.
   *
   * **Note:** To work correctly, this method requires the TileMap's TileSet to have terrains set up
   * with all required terrain combinations. Otherwise, it may produce unexpected results.
   */
  @JvmOverloads
  public final fun setCellsTerrainPath(
    layer: Int,
    path: VariantArray<Vector2i>,
    terrainSet: Int,
    terrain: Int,
    ignoreEmptyTerrains: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(LONG to layer.toLong(), ARRAY to path, LONG to terrainSet.toLong(), LONG to terrain.toLong(), BOOL to ignoreEmptyTerrains)
    TransferContext.callMethod(ptr, MethodBindings.setCellsTerrainPathPtr, NIL)
  }

  /**
   * Clears cells that do not exist in the tileset.
   */
  public final fun fixInvalidTiles(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.fixInvalidTilesPtr, NIL)
  }

  /**
   * Clears all cells on the given layer.
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public final fun clearLayer(layer: Int): Unit {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.clearLayerPtr, NIL)
  }

  /**
   * Clears all cells.
   */
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Triggers a direct update of the TileMap. Usually, calling this function is not needed, as
   * TileMap node updates automatically when one of its properties or cells is modified.
   *
   * However, for performance reasons, those updates are batched and delayed to the end of the
   * frame. Calling this function will force the TileMap to update right away instead.
   *
   * **Warning:** Updating the TileMap is computationally expensive and may impact performance. Try
   * to limit the number of updates and how many tiles they impact.
   */
  public final fun updateInternals(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.updateInternalsPtr, NIL)
  }

  /**
   * Notifies the TileMap node that calls to [_useTileDataRuntimeUpdate] or [_tileDataRuntimeUpdate]
   * will lead to different results. This will thus trigger a TileMap update.
   *
   * If [layer] is provided, only notifies changes for the given layer. Providing the [layer]
   * argument (when applicable) is usually preferred for performance reasons.
   *
   * **Warning:** Updating the TileMap is computationally expensive and may impact performance. Try
   * to limit the number of calls to this function to avoid unnecessary update.
   *
   * **Note:** This does not trigger a direct update of the TileMap, the update will be done at the
   * end of the frame as usual (unless you call [updateInternals]).
   */
  @JvmOverloads
  public final fun notifyRuntimeTileDataUpdate(layer: Int = -1): Unit {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.notifyRuntimeTileDataUpdatePtr, NIL)
  }

  /**
   * Returns the list of all neighbourings cells to the one at [coords].
   */
  public final fun getSurroundingCells(coords: Vector2i): VariantArray<Vector2i> {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(ptr, MethodBindings.getSurroundingCellsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Vector2i>)
  }

  /**
   * Returns a [Vector2i] array with the positions of all cells containing a tile in the given
   * layer. A cell is considered empty if its source identifier equals -1, its atlas coordinates
   * identifiers is `Vector2(-1, -1)` and its alternative identifier is -1.
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  public final fun getUsedCells(layer: Int): VariantArray<Vector2i> {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getUsedCellsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Vector2i>)
  }

  /**
   * Returns a [Vector2i] array with the positions of all cells containing a tile in the given
   * layer. Tiles may be filtered according to their source ([sourceId]), their atlas coordinates
   * ([atlasCoords]) or alternative id ([alternativeTile]).
   *
   * If a parameter has its value set to the default one, this parameter is not used to filter a
   * cell. Thus, if all parameters have their respective default value, this method returns the same
   * result as [getUsedCells].
   *
   * A cell is considered empty if its source identifier equals -1, its atlas coordinates
   * identifiers is `Vector2(-1, -1)` and its alternative identifier is -1.
   *
   * If [layer] is negative, the layers are accessed from the last one.
   */
  @JvmOverloads
  public final fun getUsedCellsById(
    layer: Int,
    sourceId: Int = -1,
    atlasCoords: Vector2i = Vector2i(-1, -1),
    alternativeTile: Int = -1,
  ): VariantArray<Vector2i> {
    TransferContext.writeArguments(LONG to layer.toLong(), LONG to sourceId.toLong(), VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getUsedCellsByIdPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Vector2i>)
  }

  /**
   * Returns a rectangle enclosing the used (non-empty) tiles of the map, including all layers.
   */
  public final fun getUsedRect(): Rect2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUsedRectPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I) as Rect2i)
  }

  /**
   * Returns the centered position of a cell in the TileMap's local coordinate space. To convert the
   * returned value into global coordinates, use [Node2D.toGlobal]. See also [localToMap].
   *
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

  /**
   * Returns the neighboring cell to the one at coordinates [coords], identified by the [neighbor]
   * direction. This method takes into account the different layouts a TileMap can take.
   */
  public final fun getNeighborCell(coords: Vector2i, neighbor: TileSet.CellNeighbor): Vector2i {
    TransferContext.writeArguments(VECTOR2I to coords, LONG to neighbor.id)
    TransferContext.callMethod(ptr, MethodBindings.getNeighborCellPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  public enum class VisibilityMode(
    id: Long,
  ) {
    /**
     * Use the debug settings to determine visibility.
     */
    DEFAULT(0),
    /**
     * Always hide.
     */
    FORCE_HIDE(2),
    /**
     * Always show.
     */
    FORCE_SHOW(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): VisibilityMode = entries.single { it.id == `value` }
    }
  }

  public companion object {
    @JvmStatic
    public val setNavigationMapName: MethodStringName2<TileMap, Unit, Int, RID> =
        MethodStringName2<TileMap, Unit, Int, RID>("set_navigation_map")

    @JvmStatic
    public val getNavigationMapName: MethodStringName1<TileMap, RID, Int> =
        MethodStringName1<TileMap, RID, Int>("get_navigation_map")

    @JvmStatic
    public val forceUpdateName: MethodStringName1<TileMap, Unit, Int> =
        MethodStringName1<TileMap, Unit, Int>("force_update")

    @JvmStatic
    public val setTilesetName: MethodStringName1<TileMap, Unit, TileSet?> =
        MethodStringName1<TileMap, Unit, TileSet?>("set_tileset")

    @JvmStatic
    public val getTilesetName: MethodStringName0<TileMap, TileSet?> =
        MethodStringName0<TileMap, TileSet?>("get_tileset")

    @JvmStatic
    public val setRenderingQuadrantSizeName: MethodStringName1<TileMap, Unit, Int> =
        MethodStringName1<TileMap, Unit, Int>("set_rendering_quadrant_size")

    @JvmStatic
    public val getRenderingQuadrantSizeName: MethodStringName0<TileMap, Int> =
        MethodStringName0<TileMap, Int>("get_rendering_quadrant_size")

    @JvmStatic
    public val getLayersCountName: MethodStringName0<TileMap, Int> =
        MethodStringName0<TileMap, Int>("get_layers_count")

    @JvmStatic
    public val addLayerName: MethodStringName1<TileMap, Unit, Int> =
        MethodStringName1<TileMap, Unit, Int>("add_layer")

    @JvmStatic
    public val moveLayerName: MethodStringName2<TileMap, Unit, Int, Int> =
        MethodStringName2<TileMap, Unit, Int, Int>("move_layer")

    @JvmStatic
    public val removeLayerName: MethodStringName1<TileMap, Unit, Int> =
        MethodStringName1<TileMap, Unit, Int>("remove_layer")

    @JvmStatic
    public val setLayerNameName: MethodStringName2<TileMap, Unit, Int, String> =
        MethodStringName2<TileMap, Unit, Int, String>("set_layer_name")

    @JvmStatic
    public val getLayerNameName: MethodStringName1<TileMap, String, Int> =
        MethodStringName1<TileMap, String, Int>("get_layer_name")

    @JvmStatic
    public val setLayerEnabledName: MethodStringName2<TileMap, Unit, Int, Boolean> =
        MethodStringName2<TileMap, Unit, Int, Boolean>("set_layer_enabled")

    @JvmStatic
    public val isLayerEnabledName: MethodStringName1<TileMap, Boolean, Int> =
        MethodStringName1<TileMap, Boolean, Int>("is_layer_enabled")

    @JvmStatic
    public val setLayerModulateName: MethodStringName2<TileMap, Unit, Int, Color> =
        MethodStringName2<TileMap, Unit, Int, Color>("set_layer_modulate")

    @JvmStatic
    public val getLayerModulateName: MethodStringName1<TileMap, Color, Int> =
        MethodStringName1<TileMap, Color, Int>("get_layer_modulate")

    @JvmStatic
    public val setLayerYSortEnabledName: MethodStringName2<TileMap, Unit, Int, Boolean> =
        MethodStringName2<TileMap, Unit, Int, Boolean>("set_layer_y_sort_enabled")

    @JvmStatic
    public val isLayerYSortEnabledName: MethodStringName1<TileMap, Boolean, Int> =
        MethodStringName1<TileMap, Boolean, Int>("is_layer_y_sort_enabled")

    @JvmStatic
    public val setLayerYSortOriginName: MethodStringName2<TileMap, Unit, Int, Int> =
        MethodStringName2<TileMap, Unit, Int, Int>("set_layer_y_sort_origin")

    @JvmStatic
    public val getLayerYSortOriginName: MethodStringName1<TileMap, Int, Int> =
        MethodStringName1<TileMap, Int, Int>("get_layer_y_sort_origin")

    @JvmStatic
    public val setLayerZIndexName: MethodStringName2<TileMap, Unit, Int, Int> =
        MethodStringName2<TileMap, Unit, Int, Int>("set_layer_z_index")

    @JvmStatic
    public val getLayerZIndexName: MethodStringName1<TileMap, Int, Int> =
        MethodStringName1<TileMap, Int, Int>("get_layer_z_index")

    @JvmStatic
    public val setLayerNavigationEnabledName: MethodStringName2<TileMap, Unit, Int, Boolean> =
        MethodStringName2<TileMap, Unit, Int, Boolean>("set_layer_navigation_enabled")

    @JvmStatic
    public val isLayerNavigationEnabledName: MethodStringName1<TileMap, Boolean, Int> =
        MethodStringName1<TileMap, Boolean, Int>("is_layer_navigation_enabled")

    @JvmStatic
    public val setLayerNavigationMapName: MethodStringName2<TileMap, Unit, Int, RID> =
        MethodStringName2<TileMap, Unit, Int, RID>("set_layer_navigation_map")

    @JvmStatic
    public val getLayerNavigationMapName: MethodStringName1<TileMap, RID, Int> =
        MethodStringName1<TileMap, RID, Int>("get_layer_navigation_map")

    @JvmStatic
    public val setCollisionAnimatableName: MethodStringName1<TileMap, Unit, Boolean> =
        MethodStringName1<TileMap, Unit, Boolean>("set_collision_animatable")

    @JvmStatic
    public val isCollisionAnimatableName: MethodStringName0<TileMap, Boolean> =
        MethodStringName0<TileMap, Boolean>("is_collision_animatable")

    @JvmStatic
    public val setCollisionVisibilityModeName: MethodStringName1<TileMap, Unit, VisibilityMode> =
        MethodStringName1<TileMap, Unit, VisibilityMode>("set_collision_visibility_mode")

    @JvmStatic
    public val getCollisionVisibilityModeName: MethodStringName0<TileMap, VisibilityMode> =
        MethodStringName0<TileMap, VisibilityMode>("get_collision_visibility_mode")

    @JvmStatic
    public val setNavigationVisibilityModeName: MethodStringName1<TileMap, Unit, VisibilityMode> =
        MethodStringName1<TileMap, Unit, VisibilityMode>("set_navigation_visibility_mode")

    @JvmStatic
    public val getNavigationVisibilityModeName: MethodStringName0<TileMap, VisibilityMode> =
        MethodStringName0<TileMap, VisibilityMode>("get_navigation_visibility_mode")

    @JvmStatic
    public val setCellName: MethodStringName5<TileMap, Unit, Int, Vector2i, Int, Vector2i, Int> =
        MethodStringName5<TileMap, Unit, Int, Vector2i, Int, Vector2i, Int>("set_cell")

    @JvmStatic
    public val eraseCellName: MethodStringName2<TileMap, Unit, Int, Vector2i> =
        MethodStringName2<TileMap, Unit, Int, Vector2i>("erase_cell")

    @JvmStatic
    public val getCellSourceIdName: MethodStringName3<TileMap, Int, Int, Vector2i, Boolean> =
        MethodStringName3<TileMap, Int, Int, Vector2i, Boolean>("get_cell_source_id")

    @JvmStatic
    public val getCellAtlasCoordsName: MethodStringName3<TileMap, Vector2i, Int, Vector2i, Boolean>
        = MethodStringName3<TileMap, Vector2i, Int, Vector2i, Boolean>("get_cell_atlas_coords")

    @JvmStatic
    public val getCellAlternativeTileName: MethodStringName3<TileMap, Int, Int, Vector2i, Boolean> =
        MethodStringName3<TileMap, Int, Int, Vector2i, Boolean>("get_cell_alternative_tile")

    @JvmStatic
    public val getCellTileDataName: MethodStringName3<TileMap, TileData?, Int, Vector2i, Boolean> =
        MethodStringName3<TileMap, TileData?, Int, Vector2i, Boolean>("get_cell_tile_data")

    @JvmStatic
    public val isCellFlippedHName: MethodStringName3<TileMap, Boolean, Int, Vector2i, Boolean> =
        MethodStringName3<TileMap, Boolean, Int, Vector2i, Boolean>("is_cell_flipped_h")

    @JvmStatic
    public val isCellFlippedVName: MethodStringName3<TileMap, Boolean, Int, Vector2i, Boolean> =
        MethodStringName3<TileMap, Boolean, Int, Vector2i, Boolean>("is_cell_flipped_v")

    @JvmStatic
    public val isCellTransposedName: MethodStringName3<TileMap, Boolean, Int, Vector2i, Boolean> =
        MethodStringName3<TileMap, Boolean, Int, Vector2i, Boolean>("is_cell_transposed")

    @JvmStatic
    public val getCoordsForBodyRidName: MethodStringName1<TileMap, Vector2i, RID> =
        MethodStringName1<TileMap, Vector2i, RID>("get_coords_for_body_rid")

    @JvmStatic
    public val getLayerForBodyRidName: MethodStringName1<TileMap, Int, RID> =
        MethodStringName1<TileMap, Int, RID>("get_layer_for_body_rid")

    @JvmStatic
    public val getPatternName:
        MethodStringName2<TileMap, TileMapPattern?, Int, VariantArray<Vector2i>> =
        MethodStringName2<TileMap, TileMapPattern?, Int, VariantArray<Vector2i>>("get_pattern")

    @JvmStatic
    public val mapPatternName:
        MethodStringName3<TileMap, Vector2i, Vector2i, Vector2i, TileMapPattern?> =
        MethodStringName3<TileMap, Vector2i, Vector2i, Vector2i, TileMapPattern?>("map_pattern")

    @JvmStatic
    public val setPatternName: MethodStringName3<TileMap, Unit, Int, Vector2i, TileMapPattern?> =
        MethodStringName3<TileMap, Unit, Int, Vector2i, TileMapPattern?>("set_pattern")

    @JvmStatic
    public val setCellsTerrainConnectName:
        MethodStringName5<TileMap, Unit, Int, VariantArray<Vector2i>, Int, Int, Boolean> =
        MethodStringName5<TileMap, Unit, Int, VariantArray<Vector2i>, Int, Int, Boolean>("set_cells_terrain_connect")

    @JvmStatic
    public val setCellsTerrainPathName:
        MethodStringName5<TileMap, Unit, Int, VariantArray<Vector2i>, Int, Int, Boolean> =
        MethodStringName5<TileMap, Unit, Int, VariantArray<Vector2i>, Int, Int, Boolean>("set_cells_terrain_path")

    @JvmStatic
    public val fixInvalidTilesName: MethodStringName0<TileMap, Unit> =
        MethodStringName0<TileMap, Unit>("fix_invalid_tiles")

    @JvmStatic
    public val clearLayerName: MethodStringName1<TileMap, Unit, Int> =
        MethodStringName1<TileMap, Unit, Int>("clear_layer")

    @JvmStatic
    public val clearName: MethodStringName0<TileMap, Unit> =
        MethodStringName0<TileMap, Unit>("clear")

    @JvmStatic
    public val updateInternalsName: MethodStringName0<TileMap, Unit> =
        MethodStringName0<TileMap, Unit>("update_internals")

    @JvmStatic
    public val notifyRuntimeTileDataUpdateName: MethodStringName1<TileMap, Unit, Int> =
        MethodStringName1<TileMap, Unit, Int>("notify_runtime_tile_data_update")

    @JvmStatic
    public val getSurroundingCellsName: MethodStringName1<TileMap, VariantArray<Vector2i>, Vector2i>
        = MethodStringName1<TileMap, VariantArray<Vector2i>, Vector2i>("get_surrounding_cells")

    @JvmStatic
    public val getUsedCellsName: MethodStringName1<TileMap, VariantArray<Vector2i>, Int> =
        MethodStringName1<TileMap, VariantArray<Vector2i>, Int>("get_used_cells")

    @JvmStatic
    public val getUsedCellsByIdName:
        MethodStringName4<TileMap, VariantArray<Vector2i>, Int, Int, Vector2i, Int> =
        MethodStringName4<TileMap, VariantArray<Vector2i>, Int, Int, Vector2i, Int>("get_used_cells_by_id")

    @JvmStatic
    public val getUsedRectName: MethodStringName0<TileMap, Rect2i> =
        MethodStringName0<TileMap, Rect2i>("get_used_rect")

    @JvmStatic
    public val mapToLocalName: MethodStringName1<TileMap, Vector2, Vector2i> =
        MethodStringName1<TileMap, Vector2, Vector2i>("map_to_local")

    @JvmStatic
    public val localToMapName: MethodStringName1<TileMap, Vector2i, Vector2> =
        MethodStringName1<TileMap, Vector2i, Vector2>("local_to_map")

    @JvmStatic
    public val getNeighborCellName:
        MethodStringName2<TileMap, Vector2i, Vector2i, TileSet.CellNeighbor> =
        MethodStringName2<TileMap, Vector2i, Vector2i, TileSet.CellNeighbor>("get_neighbor_cell")
  }

  public object MethodBindings {
    internal val setNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_navigation_map", 4040184819)

    internal val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_navigation_map", 495598643)

    internal val forceUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "force_update", 1025054187)

    internal val setTilesetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_tileset", 774531446)

    internal val getTilesetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_tileset", 2678226422)

    internal val setRenderingQuadrantSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_rendering_quadrant_size", 1286410249)

    internal val getRenderingQuadrantSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_rendering_quadrant_size", 3905245786)

    internal val getLayersCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_layers_count", 3905245786)

    internal val addLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "add_layer", 1286410249)

    internal val moveLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "move_layer", 3937882851)

    internal val removeLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "remove_layer", 1286410249)

    internal val setLayerNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_layer_name", 501894301)

    internal val getLayerNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_layer_name", 844755477)

    internal val setLayerEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_layer_enabled", 300928843)

    internal val isLayerEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "is_layer_enabled", 1116898809)

    internal val setLayerModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_layer_modulate", 2878471219)

    internal val getLayerModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_layer_modulate", 3457211756)

    internal val setLayerYSortEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_layer_y_sort_enabled", 300928843)

    internal val isLayerYSortEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "is_layer_y_sort_enabled", 1116898809)

    internal val setLayerYSortOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_layer_y_sort_origin", 3937882851)

    internal val getLayerYSortOriginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_layer_y_sort_origin", 923996154)

    internal val setLayerZIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_layer_z_index", 3937882851)

    internal val getLayerZIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_layer_z_index", 923996154)

    internal val setLayerNavigationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_layer_navigation_enabled", 300928843)

    internal val isLayerNavigationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "is_layer_navigation_enabled", 1116898809)

    internal val setLayerNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_layer_navigation_map", 4040184819)

    internal val getLayerNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_layer_navigation_map", 495598643)

    internal val setCollisionAnimatablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_collision_animatable", 2586408642)

    internal val isCollisionAnimatablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "is_collision_animatable", 36873697)

    internal val setCollisionVisibilityModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_collision_visibility_mode", 3193440636)

    internal val getCollisionVisibilityModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_collision_visibility_mode", 1697018252)

    internal val setNavigationVisibilityModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_navigation_visibility_mode", 3193440636)

    internal val getNavigationVisibilityModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_navigation_visibility_mode", 1697018252)

    internal val setCellPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_cell", 966713560)

    internal val eraseCellPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "erase_cell", 2311374912)

    internal val getCellSourceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_cell_source_id", 551761942)

    internal val getCellAtlasCoordsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_cell_atlas_coords", 1869815066)

    internal val getCellAlternativeTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_cell_alternative_tile", 551761942)

    internal val getCellTileDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_cell_tile_data", 2849631287)

    internal val isCellFlippedHPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "is_cell_flipped_h", 2908343862)

    internal val isCellFlippedVPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "is_cell_flipped_v", 2908343862)

    internal val isCellTransposedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "is_cell_transposed", 2908343862)

    internal val getCoordsForBodyRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_coords_for_body_rid", 291584212)

    internal val getLayerForBodyRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_layer_for_body_rid", 3917799429)

    internal val getPatternPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_pattern", 2833570986)

    internal val mapPatternPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "map_pattern", 1864516957)

    internal val setPatternPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_pattern", 1195853946)

    internal val setCellsTerrainConnectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_cells_terrain_connect", 3578627656)

    internal val setCellsTerrainPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "set_cells_terrain_path", 3578627656)

    internal val fixInvalidTilesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "fix_invalid_tiles", 3218959716)

    internal val clearLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "clear_layer", 1286410249)

    internal val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("TileMap", "clear", 3218959716)

    internal val updateInternalsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "update_internals", 3218959716)

    internal val notifyRuntimeTileDataUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "notify_runtime_tile_data_update", 1025054187)

    internal val getSurroundingCellsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_surrounding_cells", 2673526557)

    internal val getUsedCellsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_used_cells", 663333327)

    internal val getUsedCellsByIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_used_cells_by_id", 2931012785)

    internal val getUsedRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_used_rect", 410525958)

    internal val mapToLocalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "map_to_local", 108438297)

    internal val localToMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "local_to_map", 837806996)

    internal val getNeighborCellPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMap", "get_neighbor_cell", 986575103)
  }
}

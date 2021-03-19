// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.PoolIntArray
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Node for 2D tile-based maps.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/2d/using_tilemaps.html](https://docs.godotengine.org/en/latest/tutorials/2d/using_tilemaps.html)
 *
 * Node for 2D tile-based maps. Tilemaps use a [godot.TileSet] which contain a list of tiles (textures plus optional collision, navigation, and/or occluder shapes) which are used to create grid-based maps.
 */
@GodotBaseType
open class TileMap : Node2D() {
  /**
   * Emitted when a tilemap setting has changed.
   */
  val settingsChanged: Signal0 by signal()

  /**
   * If `true`, the cell's UVs will be clipped.
   */
  open var cellClipUv: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_CELL_CLIP_UV, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_CELL_CLIP_UV, NIL)
    }

  /**
   * The custom [godot.core.Transform2D] to be applied to the TileMap's cells.
   */
  open var cellCustomTransform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_CELL_CUSTOM_TRANSFORM,
          TRANSFORM2D)
      return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
    }
    set(value) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_CELL_CUSTOM_TRANSFORM,
          NIL)
    }

  /**
   * Amount to offset alternating tiles. See [enum HalfOffset] for possible values.
   */
  open var cellHalfOffset: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_CELL_HALF_OFFSET,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_CELL_HALF_OFFSET, NIL)
    }

  /**
   * The TileMap's quadrant size. Optimizes drawing by batching, using chunks of this size.
   */
  open var cellQuadrantSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_CELL_QUADRANT_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_CELL_QUADRANT_SIZE,
          NIL)
    }

  /**
   * The TileMap's cell size.
   */
  open var cellSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_CELL_SIZE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_CELL_SIZE, NIL)
    }

  /**
   * Position for tile origin. See [enum TileOrigin] for possible values.
   */
  open var cellTileOrigin: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_CELL_TILE_ORIGIN,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_CELL_TILE_ORIGIN, NIL)
    }

  /**
   * If `true`, the TileMap's children will be drawn in order of their Y coordinate.
   */
  open var cellYSort: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_CELL_Y_SORT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_CELL_Y_SORT, NIL)
    }

  /**
   * If `true`, the textures will be centered in the middle of each tile. This is useful for certain isometric or top-down modes when textures are made larger or smaller than the tiles (e.g. to avoid flickering on tile edges). The offset is still applied, but from the center of the tile. If used, [compatibilityMode] is ignored.
   *
   * If `false`, the texture position start in the top-left corner unless [compatibilityMode] is enabled.
   */
  open var centeredTextures: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_CENTERED_TEXTURES,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_CENTERED_TEXTURES,
          NIL)
    }

  /**
   * Bounce value for static body collisions (see `collision_use_kinematic`).
   */
  open var collisionBounce: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_COLLISION_BOUNCE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_COLLISION_BOUNCE, NIL)
    }

  /**
   * Friction value for static body collisions (see `collision_use_kinematic`).
   */
  open var collisionFriction: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_COLLISION_FRICTION,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_COLLISION_FRICTION,
          NIL)
    }

  /**
   * The collision layer(s) for all colliders in the TileMap. See [godot.Collision layers and masks](https://docs.godotengine.org/en/latest/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  open var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_COLLISION_LAYER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_COLLISION_LAYER, NIL)
    }

  /**
   * The collision mask(s) for all colliders in the TileMap. See [godot.Collision layers and masks](https://docs.godotengine.org/en/latest/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  open var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_COLLISION_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_COLLISION_MASK, NIL)
    }

  /**
   * If `true`, TileMap collisions will be handled as a kinematic body. If `false`, collisions will be handled as static body.
   */
  open var collisionUseKinematic: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_COLLISION_USE_KINEMATIC, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_COLLISION_USE_KINEMATIC, NIL)
    }

  /**
   * If `true`, this tilemap's collision shape will be added to the collision shape of the parent. The parent has to be a [godot.CollisionObject2D].
   */
  open var collisionUseParent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_COLLISION_USE_PARENT,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_COLLISION_USE_PARENT,
          NIL)
    }

  /**
   * If `true`, the compatibility with the tilemaps made in Godot 3.1 or earlier is maintained (textures move when the tile origin changes and rotate if the texture size is not homogeneous). This mode presents problems when doing `flip_h`, `flip_v` and `transpose` tile operations on non-homogeneous isometric tiles (e.g. 2:1), in which the texture could not coincide with the collision, thus it is not recommended for isometric or non-square tiles.
   *
   * If `false`, the textures do not move when doing `flip_h`, `flip_v` operations if no offset is used, nor when changing the tile origin.
   *
   * The compatibility mode doesn't work with the [centeredTextures] option, because displacing textures with the [cellTileOrigin] option or in irregular tiles is not relevant when centering those textures.
   */
  open var compatibilityMode: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_COMPATIBILITY_MODE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_COMPATIBILITY_MODE,
          NIL)
    }

  /**
   * The TileMap orientation mode. See [enum Mode] for possible values.
   */
  open var mode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_MODE, NIL)
    }

  /**
   * The light mask assigned to all light occluders in the TileMap. The TileSet's light occluders will cast shadows only from Light2D(s) that have the same light mask(s).
   */
  open var occluderLightMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_OCCLUDER_LIGHT_MASK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_OCCLUDER_LIGHT_MASK,
          NIL)
    }

  /**
   * The assigned [godot.TileSet].
   */
  open var tileSet: TileSet?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_TILE_SET, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as TileSet?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_TILE_SET, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_TILEMAP)
  }

  open fun cellCustomTransform(schedule: Transform2D.() -> Unit): Transform2D =
      cellCustomTransform.apply{
      schedule(this)
      cellCustomTransform = this
  }


  open fun cellSize(schedule: Vector2.() -> Unit): Vector2 = cellSize.apply{
      schedule(this)
      cellSize = this
  }


  open fun _clearQuadrants() {
  }

  open fun _getOldCellSize(): Long {
    throw NotImplementedError("_get_old_cell_size is not implemented for TileMap")
  }

  open fun _getTileData(): PoolIntArray {
    throw NotImplementedError("_get_tile_data is not implemented for TileMap")
  }

  open fun _recreateQuadrants() {
  }

  open fun _setCelld(position: Vector2, data: Dictionary<Any?, Any?>) {
  }

  open fun _setOldCellSize(size: Long) {
  }

  open fun _setTileData(arg0: PoolIntArray) {
  }

  /**
   * Clears all cells.
   */
  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_CLEAR, NIL)
  }

  /**
   * Clears cells that do not exist in the tileset.
   */
  open fun fixInvalidTiles() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_FIX_INVALID_TILES, NIL)
  }

  /**
   * Returns the tile index of the given cell. If no tile exists in the cell, returns [INVALID_CELL].
   */
  open fun getCell(x: Long, y: Long): Long {
    TransferContext.writeArguments(LONG to x, LONG to y)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_CELL, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the coordinate (subtile column and row) of the autotile variation in the tileset. Returns a zero vector if the cell doesn't have autotiling.
   */
  open fun getCellAutotileCoord(x: Long, y: Long): Vector2 {
    TransferContext.writeArguments(LONG to x, LONG to y)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_CELL_AUTOTILE_COORD,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the tile index of the cell given by a Vector2. If no tile exists in the cell, returns [INVALID_CELL].
   */
  open fun getCellv(position: Vector2): Long {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_CELLV, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if the given collision layer bit is set.
   */
  open fun getCollisionLayerBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_COLLISION_LAYER_BIT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given collision mask bit is set.
   */
  open fun getCollisionMaskBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_COLLISION_MASK_BIT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a [godot.core.Vector2] array with the positions of all cells containing a tile from the tileset (i.e. a tile index different from `-1`).
   */
  open fun getUsedCells(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_USED_CELLS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns an array of all cells with the given tile index specified in `id`.
   */
  open fun getUsedCellsById(id: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_USED_CELLS_BY_ID, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns a rectangle enclosing the used (non-empty) tiles of the map.
   */
  open fun getUsedRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_USED_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns `true` if the given cell is transposed, i.e. the X and Y axes are swapped.
   */
  open fun isCellTransposed(x: Long, y: Long): Boolean {
    TransferContext.writeArguments(LONG to x, LONG to y)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_IS_CELL_TRANSPOSED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given cell is flipped in the X axis.
   */
  open fun isCellXFlipped(x: Long, y: Long): Boolean {
    TransferContext.writeArguments(LONG to x, LONG to y)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_IS_CELL_X_FLIPPED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given cell is flipped in the Y axis.
   */
  open fun isCellYFlipped(x: Long, y: Long): Boolean {
    TransferContext.writeArguments(LONG to x, LONG to y)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_IS_CELL_Y_FLIPPED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the global position corresponding to the given tilemap (grid-based) coordinates.
   *
   * Optionally, the tilemap's half offset can be ignored.
   */
  open fun mapToWorld(mapPosition: Vector2, ignoreHalfOfs: Boolean = false): Vector2 {
    TransferContext.writeArguments(VECTOR2 to mapPosition, BOOL to ignoreHalfOfs)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_MAP_TO_WORLD, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Sets the tile index for the cell given by a Vector2.
   *
   * An index of `-1` clears the cell.
   *
   * Optionally, the tile can also be flipped, transposed, or given autotile coordinates. The autotile coordinate refers to the column and row of the subtile.
   *
   * **Note:** Data such as navigation polygons and collision shapes are not immediately updated for performance reasons.
   *
   * If you need these to be immediately updated, you can call [updateDirtyQuadrants].
   *
   * Overriding this method also overrides it internally, allowing custom logic to be implemented when tiles are placed/removed:
   *
   * ```
   * 				func set_cell(x, y, tile, flip_x=false, flip_y=false, transpose=false, autotile_coord=Vector2())
   * 				    # Write your custom logic here.
   * 				    # To call the default method:
   * 				    .set_cell(x, y, tile, flip_x, flip_y, transpose, autotile_coord)
   * 				```
   */
  open fun setCell(
    x: Long,
    y: Long,
    tile: Long,
    flipX: Boolean = false,
    flipY: Boolean = false,
    transpose: Boolean = false,
    autotileCoord: Vector2 = Vector2(0.0, 0.0)
  ) {
    TransferContext.writeArguments(LONG to x, LONG to y, LONG to tile, BOOL to flipX, BOOL to flipY,
        BOOL to transpose, VECTOR2 to autotileCoord)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_CELL, NIL)
  }

  /**
   * Sets the tile index for the given cell.
   *
   * An index of `-1` clears the cell.
   *
   * Optionally, the tile can also be flipped or transposed.
   *
   * **Note:** Data such as navigation polygons and collision shapes are not immediately updated for performance reasons.
   *
   * If you need these to be immediately updated, you can call [updateDirtyQuadrants].
   */
  open fun setCellv(
    position: Vector2,
    tile: Long,
    flipX: Boolean = false,
    flipY: Boolean = false,
    transpose: Boolean = false
  ) {
    TransferContext.writeArguments(VECTOR2 to position, LONG to tile, BOOL to flipX, BOOL to flipY,
        BOOL to transpose)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_CELLV, NIL)
  }

  /**
   * Sets the given collision layer bit.
   */
  open fun setCollisionLayerBit(bit: Long, value: Boolean) {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_COLLISION_LAYER_BIT,
        NIL)
  }

  /**
   * Sets the given collision mask bit.
   */
  open fun setCollisionMaskBit(bit: Long, value: Boolean) {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_COLLISION_MASK_BIT, NIL)
  }

  /**
   * Applies autotiling rules to the cell (and its adjacent cells) referenced by its grid-based X and Y coordinates.
   */
  open fun updateBitmaskArea(position: Vector2) {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_UPDATE_BITMASK_AREA, NIL)
  }

  /**
   * Applies autotiling rules to the cells in the given region (specified by grid-based X and Y coordinates).
   *
   * Calling with invalid (or missing) parameters applies autotiling rules for the entire tilemap.
   */
  open fun updateBitmaskRegion(start: Vector2 = Vector2(0.0, 0.0), end: Vector2 = Vector2(0.0,
      0.0)) {
    TransferContext.writeArguments(VECTOR2 to start, VECTOR2 to end)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_UPDATE_BITMASK_REGION, NIL)
  }

  /**
   * Updates the tile map's quadrants, allowing things such as navigation and collision shapes to be immediately used if modified.
   */
  open fun updateDirtyQuadrants() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_UPDATE_DIRTY_QUADRANTS, NIL)
  }

  /**
   * Returns the tilemap (grid-based) coordinates corresponding to the given local position.
   */
  open fun worldToMap(worldPosition: Vector2): Vector2 {
    TransferContext.writeArguments(VECTOR2 to worldPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_WORLD_TO_MAP, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  enum class Mode(
    id: Long
  ) {
    /**
     * Orthogonal orientation mode.
     */
    MODE_SQUARE(0),

    /**
     * Isometric orientation mode.
     */
    MODE_ISOMETRIC(1),

    /**
     * Custom orientation mode.
     */
    MODE_CUSTOM(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TileOrigin(
    id: Long
  ) {
    /**
     * Tile origin at its top-left corner.
     */
    TILE_ORIGIN_TOP_LEFT(0),

    /**
     * Tile origin at its center.
     */
    TILE_ORIGIN_CENTER(1),

    /**
     * Tile origin at its bottom-left corner.
     */
    TILE_ORIGIN_BOTTOM_LEFT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class HalfOffset(
    id: Long
  ) {
    /**
     * Half offset on the X coordinate.
     */
    HALF_OFFSET_X(0),

    /**
     * Half offset on the Y coordinate.
     */
    HALF_OFFSET_Y(1),

    /**
     * Half offset disabled.
     */
    HALF_OFFSET_DISABLED(2),

    /**
     * Half offset on the X coordinate (negative).
     */
    HALF_OFFSET_NEGATIVE_X(3),

    /**
     * Half offset on the Y coordinate (negative).
     */
    HALF_OFFSET_NEGATIVE_Y(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Half offset disabled.
     */
    final const val HALF_OFFSET_DISABLED: Long = 2

    /**
     * Half offset on the X coordinate (negative).
     */
    final const val HALF_OFFSET_NEGATIVE_X: Long = 3

    /**
     * Half offset on the Y coordinate (negative).
     */
    final const val HALF_OFFSET_NEGATIVE_Y: Long = 4

    /**
     * Half offset on the X coordinate.
     */
    final const val HALF_OFFSET_X: Long = 0

    /**
     * Half offset on the Y coordinate.
     */
    final const val HALF_OFFSET_Y: Long = 1

    /**
     * Returned when a cell doesn't exist.
     */
    final const val INVALID_CELL: Long = -1

    /**
     * Custom orientation mode.
     */
    final const val MODE_CUSTOM: Long = 2

    /**
     * Isometric orientation mode.
     */
    final const val MODE_ISOMETRIC: Long = 1

    /**
     * Orthogonal orientation mode.
     */
    final const val MODE_SQUARE: Long = 0

    /**
     * Tile origin at its bottom-left corner.
     */
    final const val TILE_ORIGIN_BOTTOM_LEFT: Long = 2

    /**
     * Tile origin at its center.
     */
    final const val TILE_ORIGIN_CENTER: Long = 1

    /**
     * Tile origin at its top-left corner.
     */
    final const val TILE_ORIGIN_TOP_LEFT: Long = 0
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.TileSet
import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 * Tile library for tilemaps.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/113](https://godotengine.org/asset-library/asset/113)
 *
 * A TileSet is a library of tiles for a [godot.TileMap]. It contains a list of tiles, each consisting of a sprite and optional collision shapes.
 *
 * Tiles are referenced by a unique integer ID.
 */
@GodotBaseType
open class TileSet : Resource() {
  override fun __new() {
    callConstructor(ENGINECLASS_TILESET)
  }

  /**
   *
   */
  open fun _forwardAtlasSubtileSelection(
    atlastileId: Long,
    tilemap: Object,
    tileLocation: Vector2
  ): Vector2 {
    throw NotImplementedError("_forward_atlas_subtile_selection is not implemented for TileSet")
  }

  /**
   *
   */
  open fun _forwardSubtileSelection(
    autotileId: Long,
    bitmask: Long,
    tilemap: Object,
    tileLocation: Vector2
  ): Vector2 {
    throw NotImplementedError("_forward_subtile_selection is not implemented for TileSet")
  }

  /**
   * Determines when the auto-tiler should consider two different auto-tile IDs to be bound together.
   *
   * **Note:** `neighbor_id` will be `-1` ([godot.TileMap.INVALID_CELL]) when checking a tile against an empty neighbor tile.
   */
  open fun _isTileBound(drawnId: Long, neighborId: Long): Boolean {
    throw NotImplementedError("_is_tile_bound is not implemented for TileSet")
  }

  /**
   * Clears all bitmask information of the autotile.
   */
  open fun autotileClearBitmaskMap(id: Long) {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_AUTOTILE_CLEAR_BITMASK_MAP,
        NIL)
  }

  /**
   * Returns the bitmask of the subtile from an autotile given its coordinates.
   *
   * The value is the sum of the values in [enum AutotileBindings] present in the subtile (e.g. a value of 5 means the bitmask has bindings in both the top left and top right).
   */
  open fun autotileGetBitmask(id: Long, coord: Vector2): Long {
    TransferContext.writeArguments(LONG to id, VECTOR2 to coord)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_AUTOTILE_GET_BITMASK, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [enum BitmaskMode] of the autotile.
   */
  open fun autotileGetBitmaskMode(id: Long): TileSet.BitmaskMode {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_AUTOTILE_GET_BITMASK_MODE,
        LONG)
    return TileSet.BitmaskMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the subtile that's being used as an icon in an atlas/autotile given its coordinates.
   *
   * The subtile defined as the icon will be used as a fallback when the atlas/autotile's bitmask information is incomplete. It will also be used to represent it in the TileSet editor.
   */
  open fun autotileGetIconCoordinate(id: Long): Vector2 {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_AUTOTILE_GET_ICON_COORDINATE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the light occluder of the subtile from an atlas/autotile given its coordinates.
   */
  open fun autotileGetLightOccluder(id: Long, coord: Vector2): OccluderPolygon2D? {
    TransferContext.writeArguments(LONG to id, VECTOR2 to coord)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_AUTOTILE_GET_LIGHT_OCCLUDER,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as OccluderPolygon2D?
  }

  /**
   * Returns the navigation polygon of the subtile from an atlas/autotile given its coordinates.
   */
  open fun autotileGetNavigationPolygon(id: Long, coord: Vector2): NavigationPolygon? {
    TransferContext.writeArguments(LONG to id, VECTOR2 to coord)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_AUTOTILE_GET_NAVIGATION_POLYGON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as NavigationPolygon?
  }

  /**
   * Returns the size of the subtiles in an atlas/autotile.
   */
  open fun autotileGetSize(id: Long): Vector2 {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_AUTOTILE_GET_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the spacing between subtiles of the atlas/autotile.
   */
  open fun autotileGetSpacing(id: Long): Long {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_AUTOTILE_GET_SPACING, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the priority of the subtile from an autotile given its coordinates.
   *
   * When more than one subtile has the same bitmask value, one of them will be picked randomly for drawing. Its priority will define how often it will be picked.
   */
  open fun autotileGetSubtilePriority(id: Long, coord: Vector2): Long {
    TransferContext.writeArguments(LONG to id, VECTOR2 to coord)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_AUTOTILE_GET_SUBTILE_PRIORITY, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the drawing index of the subtile from an atlas/autotile given its coordinates.
   */
  open fun autotileGetZIndex(id: Long, coord: Vector2): Long {
    TransferContext.writeArguments(LONG to id, VECTOR2 to coord)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_AUTOTILE_GET_Z_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the bitmask of the subtile from an autotile given its coordinates.
   *
   * The value is the sum of the values in [enum AutotileBindings] present in the subtile (e.g. a value of 5 means the bitmask has bindings in both the top left and top right).
   */
  open fun autotileSetBitmask(
    id: Long,
    bitmask: Vector2,
    flag: Long
  ) {
    TransferContext.writeArguments(LONG to id, VECTOR2 to bitmask, LONG to flag)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_AUTOTILE_SET_BITMASK, NIL)
  }

  /**
   * Sets the [enum BitmaskMode] of the autotile.
   */
  open fun autotileSetBitmaskMode(id: Long, mode: Long) {
    TransferContext.writeArguments(LONG to id, LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_AUTOTILE_SET_BITMASK_MODE,
        NIL)
  }

  /**
   * Sets the subtile that will be used as an icon in an atlas/autotile given its coordinates.
   *
   * The subtile defined as the icon will be used as a fallback when the atlas/autotile's bitmask information is incomplete. It will also be used to represent it in the TileSet editor.
   */
  open fun autotileSetIconCoordinate(id: Long, coord: Vector2) {
    TransferContext.writeArguments(LONG to id, VECTOR2 to coord)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_AUTOTILE_SET_ICON_COORDINATE, NIL)
  }

  /**
   * Sets the light occluder of the subtile from an atlas/autotile given its coordinates.
   */
  open fun autotileSetLightOccluder(
    id: Long,
    lightOccluder: OccluderPolygon2D,
    coord: Vector2
  ) {
    TransferContext.writeArguments(LONG to id, OBJECT to lightOccluder, VECTOR2 to coord)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_AUTOTILE_SET_LIGHT_OCCLUDER,
        NIL)
  }

  /**
   * Sets the navigation polygon of the subtile from an atlas/autotile given its coordinates.
   */
  open fun autotileSetNavigationPolygon(
    id: Long,
    navigationPolygon: NavigationPolygon,
    coord: Vector2
  ) {
    TransferContext.writeArguments(LONG to id, OBJECT to navigationPolygon, VECTOR2 to coord)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_AUTOTILE_SET_NAVIGATION_POLYGON, NIL)
  }

  /**
   * Sets the size of the subtiles in an atlas/autotile.
   */
  open fun autotileSetSize(id: Long, size: Vector2) {
    TransferContext.writeArguments(LONG to id, VECTOR2 to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_AUTOTILE_SET_SIZE, NIL)
  }

  /**
   * Sets the spacing between subtiles of the atlas/autotile.
   */
  open fun autotileSetSpacing(id: Long, spacing: Long) {
    TransferContext.writeArguments(LONG to id, LONG to spacing)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_AUTOTILE_SET_SPACING, NIL)
  }

  /**
   * Sets the priority of the subtile from an autotile given its coordinates.
   *
   * When more than one subtile has the same bitmask value, one of them will be picked randomly for drawing. Its priority will define how often it will be picked.
   */
  open fun autotileSetSubtilePriority(
    id: Long,
    coord: Vector2,
    priority: Long
  ) {
    TransferContext.writeArguments(LONG to id, VECTOR2 to coord, LONG to priority)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_AUTOTILE_SET_SUBTILE_PRIORITY, NIL)
  }

  /**
   * Sets the drawing index of the subtile from an atlas/autotile given its coordinates.
   */
  open fun autotileSetZIndex(
    id: Long,
    coord: Vector2,
    zIndex: Long
  ) {
    TransferContext.writeArguments(LONG to id, VECTOR2 to coord, LONG to zIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_AUTOTILE_SET_Z_INDEX, NIL)
  }

  /**
   * Clears all tiles.
   */
  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_CLEAR, NIL)
  }

  /**
   * Creates a new tile with the given ID.
   */
  open fun createTile(id: Long) {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_CREATE_TILE, NIL)
  }

  /**
   * Returns the first tile matching the given name.
   */
  open fun findTileByName(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_FIND_TILE_BY_NAME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the ID following the last currently used ID, useful when creating a new tile.
   */
  open fun getLastUnusedTileId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_LAST_UNUSED_TILE_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an array of all currently used tile IDs.
   */
  open fun getTilesIds(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_GET_TILES_IDS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Removes the given tile ID.
   */
  open fun removeTile(id: Long) {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_REMOVE_TILE, NIL)
  }

  /**
   * Adds a shape to the tile.
   */
  open fun tileAddShape(
    id: Long,
    shape: Shape2D,
    shapeTransform: Transform2D,
    oneWay: Boolean = false,
    autotileCoord: Vector2 = Vector2(0.0, 0.0)
  ) {
    TransferContext.writeArguments(LONG to id, OBJECT to shape, TRANSFORM2D to shapeTransform, BOOL
        to oneWay, VECTOR2 to autotileCoord)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_ADD_SHAPE, NIL)
  }

  /**
   * Returns the tile's light occluder.
   */
  open fun tileGetLightOccluder(id: Long): OccluderPolygon2D? {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_GET_LIGHT_OCCLUDER,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as OccluderPolygon2D?
  }

  /**
   * Returns the tile's material.
   */
  open fun tileGetMaterial(id: Long): ShaderMaterial? {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_GET_MATERIAL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ShaderMaterial?
  }

  /**
   * Returns the tile's modulation color.
   */
  open fun tileGetModulate(id: Long): Color {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_GET_MODULATE, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the tile's name.
   */
  open fun tileGetName(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_GET_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the navigation polygon of the tile.
   */
  open fun tileGetNavigationPolygon(id: Long): NavigationPolygon? {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_GET_NAVIGATION_POLYGON,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as NavigationPolygon?
  }

  /**
   * Returns the offset of the tile's navigation polygon.
   */
  open fun tileGetNavigationPolygonOffset(id: Long): Vector2 {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_TILE_GET_NAVIGATION_POLYGON_OFFSET, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the tile's normal map texture.
   */
  open fun tileGetNormalMap(id: Long): Texture? {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_GET_NORMAL_MAP, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  /**
   * Returns the offset of the tile's light occluder.
   */
  open fun tileGetOccluderOffset(id: Long): Vector2 {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_GET_OCCLUDER_OFFSET,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the tile sub-region in the texture.
   */
  open fun tileGetRegion(id: Long): Rect2 {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_GET_REGION, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns a tile's given shape.
   */
  open fun tileGetShape(id: Long, shapeId: Long): Shape2D? {
    TransferContext.writeArguments(LONG to id, LONG to shapeId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_GET_SHAPE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Shape2D?
  }

  /**
   * Returns the number of shapes assigned to a tile.
   */
  open fun tileGetShapeCount(id: Long): Long {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_GET_SHAPE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the offset of a tile's shape.
   */
  open fun tileGetShapeOffset(id: Long, shapeId: Long): Vector2 {
    TransferContext.writeArguments(LONG to id, LONG to shapeId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_GET_SHAPE_OFFSET,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the one-way collision value of a tile's shape.
   */
  open fun tileGetShapeOneWay(id: Long, shapeId: Long): Boolean {
    TransferContext.writeArguments(LONG to id, LONG to shapeId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_GET_SHAPE_ONE_WAY,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  open fun tileGetShapeOneWayMargin(id: Long, shapeId: Long): Double {
    TransferContext.writeArguments(LONG to id, LONG to shapeId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_TILE_GET_SHAPE_ONE_WAY_MARGIN, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the [godot.core.Transform2D] of a tile's shape.
   */
  open fun tileGetShapeTransform(id: Long, shapeId: Long): Transform2D {
    TransferContext.writeArguments(LONG to id, LONG to shapeId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_GET_SHAPE_TRANSFORM,
        TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Returns an array of dictionaries describing the tile's shapes.
   *
   * **Dictionary structure in the array returned by this method:**
   *
   * ```
   * 				{
   * 				    "autotile_coord": Vector2,
   * 				    "one_way": bool,
   * 				    "one_way_margin": int,
   * 				    "shape": CollisionShape2D,
   * 				    "shape_transform": Transform2D,
   * 				}
   * 				```
   */
  open fun tileGetShapes(id: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_GET_SHAPES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the tile's texture.
   */
  open fun tileGetTexture(id: Long): Texture? {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_GET_TEXTURE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  /**
   * Returns the texture offset of the tile.
   */
  open fun tileGetTextureOffset(id: Long): Vector2 {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_GET_TEXTURE_OFFSET,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the tile's [enum TileMode].
   */
  open fun tileGetTileMode(id: Long): TileSet.TileMode {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_GET_TILE_MODE, LONG)
    return TileSet.TileMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the tile's Z index (drawing layer).
   */
  open fun tileGetZIndex(id: Long): Long {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_GET_Z_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets a light occluder for the tile.
   */
  open fun tileSetLightOccluder(id: Long, lightOccluder: OccluderPolygon2D) {
    TransferContext.writeArguments(LONG to id, OBJECT to lightOccluder)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_SET_LIGHT_OCCLUDER,
        NIL)
  }

  /**
   * Sets the tile's material.
   */
  open fun tileSetMaterial(id: Long, material: ShaderMaterial) {
    TransferContext.writeArguments(LONG to id, OBJECT to material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_SET_MATERIAL, NIL)
  }

  /**
   * Sets the tile's modulation color.
   */
  open fun tileSetModulate(id: Long, color: Color) {
    TransferContext.writeArguments(LONG to id, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_SET_MODULATE, NIL)
  }

  /**
   * Sets the tile's name.
   */
  open fun tileSetName(id: Long, name: String) {
    TransferContext.writeArguments(LONG to id, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_SET_NAME, NIL)
  }

  /**
   * Sets the tile's navigation polygon.
   */
  open fun tileSetNavigationPolygon(id: Long, navigationPolygon: NavigationPolygon) {
    TransferContext.writeArguments(LONG to id, OBJECT to navigationPolygon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_SET_NAVIGATION_POLYGON,
        NIL)
  }

  /**
   * Sets an offset for the tile's navigation polygon.
   */
  open fun tileSetNavigationPolygonOffset(id: Long, navigationPolygonOffset: Vector2) {
    TransferContext.writeArguments(LONG to id, VECTOR2 to navigationPolygonOffset)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_TILE_SET_NAVIGATION_POLYGON_OFFSET, NIL)
  }

  /**
   * Sets the tile's normal map texture.
   *
   * **Note:** Godot expects the normal map to use X+, Y-, and Z+ coordinates. See [this page](http://wiki.polycount.com/wiki/Normal_Map_Technical_Details#Common_Swizzle_Coordinates) for a comparison of normal map coordinates expected by popular engines.
   */
  open fun tileSetNormalMap(id: Long, normalMap: Texture) {
    TransferContext.writeArguments(LONG to id, OBJECT to normalMap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_SET_NORMAL_MAP, NIL)
  }

  /**
   * Sets an offset for the tile's light occluder.
   */
  open fun tileSetOccluderOffset(id: Long, occluderOffset: Vector2) {
    TransferContext.writeArguments(LONG to id, VECTOR2 to occluderOffset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_SET_OCCLUDER_OFFSET,
        NIL)
  }

  /**
   * Sets the tile's sub-region in the texture. This is common in texture atlases.
   */
  open fun tileSetRegion(id: Long, region: Rect2) {
    TransferContext.writeArguments(LONG to id, RECT2 to region)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_SET_REGION, NIL)
  }

  /**
   * Sets a shape for the tile, enabling collision.
   */
  open fun tileSetShape(
    id: Long,
    shapeId: Long,
    shape: Shape2D
  ) {
    TransferContext.writeArguments(LONG to id, LONG to shapeId, OBJECT to shape)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_SET_SHAPE, NIL)
  }

  /**
   * Sets the offset of a tile's shape.
   */
  open fun tileSetShapeOffset(
    id: Long,
    shapeId: Long,
    shapeOffset: Vector2
  ) {
    TransferContext.writeArguments(LONG to id, LONG to shapeId, VECTOR2 to shapeOffset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_SET_SHAPE_OFFSET, NIL)
  }

  /**
   * Enables one-way collision on a tile's shape.
   */
  open fun tileSetShapeOneWay(
    id: Long,
    shapeId: Long,
    oneWay: Boolean
  ) {
    TransferContext.writeArguments(LONG to id, LONG to shapeId, BOOL to oneWay)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_SET_SHAPE_ONE_WAY, NIL)
  }

  /**
   *
   */
  open fun tileSetShapeOneWayMargin(
    id: Long,
    shapeId: Long,
    oneWay: Double
  ) {
    TransferContext.writeArguments(LONG to id, LONG to shapeId, DOUBLE to oneWay)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESET_TILE_SET_SHAPE_ONE_WAY_MARGIN, NIL)
  }

  /**
   * Sets a [godot.core.Transform2D] on a tile's shape.
   */
  open fun tileSetShapeTransform(
    id: Long,
    shapeId: Long,
    shapeTransform: Transform2D
  ) {
    TransferContext.writeArguments(LONG to id, LONG to shapeId, TRANSFORM2D to shapeTransform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_SET_SHAPE_TRANSFORM,
        NIL)
  }

  /**
   * Sets an array of shapes for the tile, enabling collision.
   */
  open fun tileSetShapes(id: Long, shapes: VariantArray<Any?>) {
    TransferContext.writeArguments(LONG to id, ARRAY to shapes)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_SET_SHAPES, NIL)
  }

  /**
   * Sets the tile's texture.
   */
  open fun tileSetTexture(id: Long, texture: Texture) {
    TransferContext.writeArguments(LONG to id, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_SET_TEXTURE, NIL)
  }

  /**
   * Sets the tile's texture offset.
   */
  open fun tileSetTextureOffset(id: Long, textureOffset: Vector2) {
    TransferContext.writeArguments(LONG to id, VECTOR2 to textureOffset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_SET_TEXTURE_OFFSET,
        NIL)
  }

  /**
   * Sets the tile's [enum TileMode].
   */
  open fun tileSetTileMode(id: Long, tilemode: Long) {
    TransferContext.writeArguments(LONG to id, LONG to tilemode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_SET_TILE_MODE, NIL)
  }

  /**
   * Sets the tile's drawing index.
   */
  open fun tileSetZIndex(id: Long, zIndex: Long) {
    TransferContext.writeArguments(LONG to id, LONG to zIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESET_TILE_SET_Z_INDEX, NIL)
  }

  enum class TileMode(
    id: Long
  ) {
    /**
     *
     */
    SINGLE_TILE(0),

    /**
     *
     */
    AUTO_TILE(1),

    /**
     *
     */
    ATLAS_TILE(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class AutotileBindings(
    id: Long
  ) {
    /**
     *
     */
    BIND_TOPLEFT(1),

    /**
     *
     */
    BIND_TOP(2),

    /**
     *
     */
    BIND_TOPRIGHT(4),

    /**
     *
     */
    BIND_LEFT(8),

    /**
     *
     */
    BIND_CENTER(16),

    /**
     *
     */
    BIND_RIGHT(32),

    /**
     *
     */
    BIND_BOTTOMLEFT(64),

    /**
     *
     */
    BIND_BOTTOM(128),

    /**
     *
     */
    BIND_BOTTOMRIGHT(256);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BitmaskMode(
    id: Long
  ) {
    /**
     *
     */
    BITMASK_2X2(0),

    /**
     *
     */
    BITMASK_3X3_MINIMAL(1),

    /**
     *
     */
    BITMASK_3X3(2);

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
     *
     */
    final const val ATLAS_TILE: Long = 2

    /**
     *
     */
    final const val AUTO_TILE: Long = 1

    /**
     *
     */
    final const val BIND_BOTTOM: Long = 128

    /**
     *
     */
    final const val BIND_BOTTOMLEFT: Long = 64

    /**
     *
     */
    final const val BIND_BOTTOMRIGHT: Long = 256

    /**
     *
     */
    final const val BIND_CENTER: Long = 16

    /**
     *
     */
    final const val BIND_LEFT: Long = 8

    /**
     *
     */
    final const val BIND_RIGHT: Long = 32

    /**
     *
     */
    final const val BIND_TOP: Long = 2

    /**
     *
     */
    final const val BIND_TOPLEFT: Long = 1

    /**
     *
     */
    final const val BIND_TOPRIGHT: Long = 4

    /**
     *
     */
    final const val BITMASK_2X2: Long = 0

    /**
     *
     */
    final const val BITMASK_3X3: Long = 2

    /**
     *
     */
    final const val BITMASK_3X3_MINIMAL: Long = 1

    /**
     *
     */
    final const val SINGLE_TILE: Long = 0
  }
}

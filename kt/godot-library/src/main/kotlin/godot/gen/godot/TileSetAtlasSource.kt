// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.Rect2i
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.RECT2I
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Exposes a 2D atlas texture as a set of tiles for a [godot.TileSet] resource.
 *
 * An atlas is a grid of tiles laid out on a texture. Each tile in the grid must be exposed using [createTile]. Those tiles are then indexed using their coordinates in the grid.
 *
 * Each tile can also have a size in the grid coordinates, making it more or less cells in the atlas.
 *
 *
 *
 * Alternatives version of a tile can be created using [createAlternativeTile], which are then indexed using an alternative ID. The main tile (the one in the grid), is accessed with an alternative ID equal to 0.
 *
 *
 *
 * Each tile alternate has a set of properties that is defined by the source's [godot.TileSet] layers. Those properties are stored in a TileData object that can be accessed and modified using [getTileData].
 *
 * As TileData properties are stored directly in the TileSetAtlasSource resource, their properties might also be set using `TileSetAtlasSource.set("<coords_x>:<coords_y>/<alternative_id>/<tile_data_property>")`.
 */
@GodotBaseType
public open class TileSetAtlasSource : TileSetSource() {
  /**
   * The atlas texture.
   */
  public open var texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TEXTURE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_TEXTURE,
          NIL)
      return TransferContext.readReturnValue(NIL, true) as Unit?
    }

  /**
   * Margins, in pixels, to offset the origin of the grid in the texture.
   */
  public open var margins: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_MARGINS,
          VECTOR2I)
      return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_MARGINS,
          NIL)
    }

  /**
   * Separation, in pixels, between each tile texture region of the grid.
   */
  public open var separation: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_SEPARATION,
          VECTOR2I)
      return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_SEPARATION,
          NIL)
    }

  /**
   * The base tile size in the texture (in pixel). This size must be bigger than the TileSet's `tile_size` value.
   */
  public open var textureRegionSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TEXTURE_REGION_SIZE, VECTOR2I)
      return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_TEXTURE_REGION_SIZE, NIL)
    }

  /**
   * If `true`, generates an internal texture with an additional one pixel padding around each tile. Texture padding avoids a common artifact where lines appear between tiles.
   *
   * Disabling this setting might lead a small performance improvement, as generating the internal texture requires both memory and processing time when the TileSetAtlasSource resource is modified.
   */
  public open var useTexturePadding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_USE_TEXTURE_PADDING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_USE_TEXTURE_PADDING, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TILESETATLASSOURCE)
  }

  /**
   * Creates a new tile at coords `atlas_coords` with size `size`.
   */
  public open fun createTile(atlasCoords: Vector2i, size: Vector2i = Vector2iVector2i(1.0, 1.0)):
      Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_CREATE_TILE, NIL)
  }

  /**
   * Remove a tile and its alternative at coordinates `atlas_coords`.
   */
  public open fun removeTile(atlasCoords: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_REMOVE_TILE, NIL)
  }

  /**
   * Move the tile and its alternatives at the `atlas_coords` coordinates to the `new_atlas_coords` coordinates with the `new_size` size. This functions will fail if a tile is already present in the given area.
   *
   * If `new_atlas_coords` is `Vector2i(-1, -1)`, keeps the tile's coordinates. If `new_size` is `Vector2i(-1, -1)`, keeps the tile's size.
   *
   * To avoid an error, first check if a move is possible using [hasRoomForTile].
   */
  public open fun moveTileInAtlas(
    atlasCoords: Vector2i,
    newAtlasCoords: Vector2i = Vector2iVector2i(-1.0, -1.0),
    newSize: Vector2i = Vector2iVector2i(-1.0, -1.0)
  ): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, VECTOR2I to newAtlasCoords, VECTOR2I to
        newSize)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_MOVE_TILE_IN_ATLAS, NIL)
  }

  /**
   * Returns the size of the tile (in the grid coordinates system) at coordinates `atlas_coords`.
   */
  public open fun getTileSizeInAtlas(atlasCoords: Vector2i): Vector2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILE_SIZE_IN_ATLAS, VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Returns whether there is enough room in an atlas to create/modify a tile with the given properties. If `ignored_tile` is provided, act as is the given tile was not present in the atlas. This may be used when you want to modify a tile's properties.
   */
  public open fun hasRoomForTile(
    atlasCoords: Vector2i,
    size: Vector2i,
    animationColumns: Long,
    animationSeparation: Vector2i,
    framesCount: Long,
    ignoredTile: Vector2i = Vector2iVector2i(-1.0, -1.0)
  ): Boolean {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, VECTOR2I to size, LONG to
        animationColumns, VECTOR2I to animationSeparation, LONG to framesCount, VECTOR2I to
        ignoredTile)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_HAS_ROOM_FOR_TILE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns an array of tiles coordinates ID that will be automatically removed when modifying one or several of those properties: `texture`, `margins`, `separation` or `texture_region_size`. This can be used to undo changes that would have caused tiles data loss.
   */
  public open fun getTilesToBeRemovedOnChange(
    texture: Texture2D,
    margins: Vector2i,
    separation: Vector2i,
    textureRegionSize: Vector2i
  ): PackedVector2Array {
    TransferContext.writeArguments(OBJECT to texture, VECTOR2I to margins, VECTOR2I to separation,
        VECTOR2I to textureRegionSize)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILES_TO_BE_REMOVED_ON_CHANGE,
        PACKED_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
  }

  /**
   * If there is a tile covering the `atlas_coords` coordinates, returns the top-left coordinates of the tile (thus its coordinate ID). Returns `Vector2i(-1, -1)` otherwise.
   */
  public open fun getTileAtCoords(atlasCoords: Vector2i): Vector2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILE_AT_COORDS, VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Sets the number of columns in the animation layout of the tile at coordinates `atlas_coords`. If set to 0, then the different frames of the animation are laid out as a single horizontal line in the atlas.
   */
  public open fun setTileAnimationColumns(atlasCoords: Vector2i, frameColumns: Long): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frameColumns)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_TILE_ANIMATION_COLUMNS, NIL)
  }

  /**
   * Returns how many columns the tile at `atlas_coords` has in its animation layout.
   */
  public open fun getTileAnimationColumns(atlasCoords: Vector2i): Long {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILE_ANIMATION_COLUMNS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the margin (in grid tiles) between each tile in the animation layout of the tile at coordinates `atlas_coords` has.
   */
  public open fun setTileAnimationSeparation(atlasCoords: Vector2i, separation: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, VECTOR2I to separation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_TILE_ANIMATION_SEPARATION, NIL)
  }

  /**
   * Returns the separation (as in the atlas grid) between each frame of an animated tile at coordinates `atlas_coords`.
   */
  public open fun getTileAnimationSeparation(atlasCoords: Vector2i): Vector2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILE_ANIMATION_SEPARATION, VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Sets the animation speed of the tile at coordinates `atlas_coords` has.
   */
  public open fun setTileAnimationSpeed(atlasCoords: Vector2i, speed: Double): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, DOUBLE to speed)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_TILE_ANIMATION_SPEED, NIL)
  }

  /**
   * Returns the animation speed of the tile at coordinates `atlas_coords`.
   */
  public open fun getTileAnimationSpeed(atlasCoords: Vector2i): Double {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILE_ANIMATION_SPEED, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets how many animation frames the tile at coordinates `atlas_coords` has.
   */
  public open fun setTileAnimationFramesCount(atlasCoords: Vector2i, framesCount: Long): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to framesCount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_TILE_ANIMATION_FRAMES_COUNT, NIL)
  }

  /**
   * Returns how many animation frames has the tile at coordinates `atlas_coords`.
   */
  public open fun getTileAnimationFramesCount(atlasCoords: Vector2i): Long {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILE_ANIMATION_FRAMES_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the animation frame duration of frame `frame_index` for the tile at coordinates `atlas_coords`.
   */
  public open fun setTileAnimationFrameDuration(
    atlasCoords: Vector2i,
    frameIndex: Long,
    duration: Double
  ): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frameIndex, DOUBLE to duration)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_TILE_ANIMATION_FRAME_DURATION, NIL)
  }

  /**
   * Returns the animation frame duration of frame `frame_index` for the tile at coordinates `atlas_coords`.
   */
  public open fun getTileAnimationFrameDuration(atlasCoords: Vector2i, frameIndex: Long): Double {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frameIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILE_ANIMATION_FRAME_DURATION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the sum of the sum of the frame durations of the tile at coordinates `atlas_coords`. This value needs to be divided by the animation speed to get the actual animation loop duration.
   */
  public open fun getTileAnimationTotalDuration(atlasCoords: Vector2i): Double {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILE_ANIMATION_TOTAL_DURATION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Creates an alternative tile for the tile at coords `atlas_coords`. If `alternative_id_override` is -1, give it an automatically generated unique ID, or assigns it the given ID otherwise.
   *
   * Returns the new alternative identifier, or -1 if the alternative could not be created with a provided `alternative_id_override`.
   */
  public open fun createAlternativeTile(atlasCoords: Vector2i, alternativeIdOverride: Long = -1):
      Long {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeIdOverride)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_CREATE_ALTERNATIVE_TILE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Remove a tile's alternative with alternative ID `alternative_tile`.
   *
   * Calling this function with `alternative_tile` equals to 0 will fail, as the base tile alternative cannot be removed.
   */
  public open fun removeAlternativeTile(atlasCoords: Vector2i, alternativeTile: Long): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeTile)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_REMOVE_ALTERNATIVE_TILE, NIL)
  }

  /**
   * Change a tile's alternative ID from `alternative_tile` to `new_id`.
   *
   * Calling this function with `alternative_id` equals to 0 will fail, as the base tile alternative cannot be moved.
   */
  public open fun setAlternativeTileId(
    atlasCoords: Vector2i,
    alternativeTile: Long,
    newId: Long
  ): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeTile, LONG to newId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_ALTERNATIVE_TILE_ID, NIL)
  }

  /**
   * Returns the alternative ID a following call to [createAlternativeTile] would return.
   */
  public open fun getNextAlternativeTileId(atlasCoords: Vector2i): Long {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_NEXT_ALTERNATIVE_TILE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [godot.TileData] object for the given atlas coordinates and alternative ID.
   */
  public open fun getTileData(atlasCoords: Vector2i, alternativeTile: Long): TileData? {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeTile)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILE_DATA,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TileData?
  }

  /**
   * Returns the atlas grid size, which depends on how many tiles can fit in the texture. It thus depends on the Texture's size, the atlas `margins` the tiles' `texture_region_size`.
   */
  public open fun getAtlasGridSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_ATLAS_GRID_SIZE, VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Returns a tile's texture region in the atlas texture. For animated tiles, a `frame` argument might be provided for the different frames of the animation.
   */
  public open fun getTileTextureRegion(atlasCoords: Vector2i, frame: Long = 0): Rect2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frame)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILE_TEXTURE_REGION, RECT2I)
    return TransferContext.readReturnValue(RECT2I, false) as Rect2i
  }

  /**
   * If [useTexturePadding] is `false`, returns [texture]. Otherwise, returns and internal [godot.ImageTexture] created that includes the padding.
   */
  public open fun getRuntimeTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_RUNTIME_TEXTURE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * Returns the region of the tile at coordinates `atlas_coords` for frame `frame` inside the texture returned by [getRuntimeTexture].
   *
   * **Note:** If [useTexturePadding] is `false`, returns the same as [getTileTextureRegion].
   */
  public open fun getRuntimeTileTextureRegion(atlasCoords: Vector2i, frame: Long): Rect2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frame)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_RUNTIME_TILE_TEXTURE_REGION, RECT2I)
    return TransferContext.readReturnValue(RECT2I, false) as Rect2i
  }

  public companion object
}

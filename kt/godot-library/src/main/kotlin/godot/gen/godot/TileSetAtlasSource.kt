// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.Rect2i
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.RECT2I
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
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
 * Alternatives version of a tile can be created using [createAlternativeTile], which are then indexed using an alternative ID. The main tile (the one in the grid), is accessed with an alternative ID equal to 0.
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
  public var texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TEXTURE,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_TEXTURE,
          NIL)
    }

  /**
   * Margins, in pixels, to offset the origin of the grid in the texture.
   */
  public var margins: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_MARGINS,
          VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_MARGINS,
          NIL)
    }

  /**
   * Separation, in pixels, between each tile texture region of the grid.
   */
  public var separation: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_SEPARATION,
          VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_SEPARATION,
          NIL)
    }

  /**
   * The base tile size in the texture (in pixel). This size must be bigger than the TileSet's `tile_size` value.
   */
  public var textureRegionSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TEXTURE_REGION_SIZE, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
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
  public var useTexturePadding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_USE_TEXTURE_PADDING, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_USE_TEXTURE_PADDING, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TILESETATLASSOURCE, scriptIndex)
    return true
  }

  /**
   * Creates a new tile at coordinates [atlasCoords] with the given [size].
   */
  public fun createTile(atlasCoords: Vector2i, size: Vector2i = Vector2i(1, 1)): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_CREATE_TILE, NIL)
  }

  /**
   * Remove a tile and its alternative at coordinates [atlasCoords].
   */
  public fun removeTile(atlasCoords: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_REMOVE_TILE, NIL)
  }

  /**
   * Move the tile and its alternatives at the [atlasCoords] coordinates to the [newAtlasCoords] coordinates with the [newSize] size. This functions will fail if a tile is already present in the given area.
   *
   * If [newAtlasCoords] is `Vector2i(-1, -1)`, keeps the tile's coordinates. If [newSize] is `Vector2i(-1, -1)`, keeps the tile's size.
   *
   * To avoid an error, first check if a move is possible using [hasRoomForTile].
   */
  public fun moveTileInAtlas(
    atlasCoords: Vector2i,
    newAtlasCoords: Vector2i = Vector2i(-1, -1),
    newSize: Vector2i = Vector2i(-1, -1),
  ): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, VECTOR2I to newAtlasCoords, VECTOR2I to newSize)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_MOVE_TILE_IN_ATLAS, NIL)
  }

  /**
   * Returns the size of the tile (in the grid coordinates system) at coordinates [atlasCoords].
   */
  public fun getTileSizeInAtlas(atlasCoords: Vector2i): Vector2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILE_SIZE_IN_ATLAS, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Returns whether there is enough room in an atlas to create/modify a tile with the given properties. If [ignoredTile] is provided, act as is the given tile was not present in the atlas. This may be used when you want to modify a tile's properties.
   */
  public fun hasRoomForTile(
    atlasCoords: Vector2i,
    size: Vector2i,
    animationColumns: Int,
    animationSeparation: Vector2i,
    framesCount: Int,
    ignoredTile: Vector2i = Vector2i(-1, -1),
  ): Boolean {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, VECTOR2I to size, LONG to animationColumns.toLong(), VECTOR2I to animationSeparation, LONG to framesCount.toLong(), VECTOR2I to ignoredTile)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_HAS_ROOM_FOR_TILE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns an array of tiles coordinates ID that will be automatically removed when modifying one or several of those properties: [texture], [margins], [separation] or [textureRegionSize]. This can be used to undo changes that would have caused tiles data loss.
   */
  public fun getTilesToBeRemovedOnChange(
    texture: Texture2D,
    margins: Vector2i,
    separation: Vector2i,
    textureRegionSize: Vector2i,
  ): PackedVector2Array {
    TransferContext.writeArguments(OBJECT to texture, VECTOR2I to margins, VECTOR2I to separation, VECTOR2I to textureRegionSize)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILES_TO_BE_REMOVED_ON_CHANGE,
        PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * If there is a tile covering the [atlasCoords] coordinates, returns the top-left coordinates of the tile (thus its coordinate ID). Returns `Vector2i(-1, -1)` otherwise.
   */
  public fun getTileAtCoords(atlasCoords: Vector2i): Vector2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILE_AT_COORDS, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Sets the number of columns in the animation layout of the tile at coordinates [atlasCoords]. If set to 0, then the different frames of the animation are laid out as a single horizontal line in the atlas.
   */
  public fun setTileAnimationColumns(atlasCoords: Vector2i, frameColumns: Int): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frameColumns.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_TILE_ANIMATION_COLUMNS, NIL)
  }

  /**
   * Returns how many columns the tile at [atlasCoords] has in its animation layout.
   */
  public fun getTileAnimationColumns(atlasCoords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILE_ANIMATION_COLUMNS, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the margin (in grid tiles) between each tile in the animation layout of the tile at coordinates [atlasCoords] has.
   */
  public fun setTileAnimationSeparation(atlasCoords: Vector2i, separation: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, VECTOR2I to separation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_TILE_ANIMATION_SEPARATION, NIL)
  }

  /**
   * Returns the separation (as in the atlas grid) between each frame of an animated tile at coordinates [atlasCoords].
   */
  public fun getTileAnimationSeparation(atlasCoords: Vector2i): Vector2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILE_ANIMATION_SEPARATION, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Sets the animation speed of the tile at coordinates [atlasCoords] has.
   */
  public fun setTileAnimationSpeed(atlasCoords: Vector2i, speed: Float): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, DOUBLE to speed.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_TILE_ANIMATION_SPEED, NIL)
  }

  /**
   * Returns the animation speed of the tile at coordinates [atlasCoords].
   */
  public fun getTileAnimationSpeed(atlasCoords: Vector2i): Float {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILE_ANIMATION_SPEED, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets how many animation frames the tile at coordinates [atlasCoords] has.
   */
  public fun setTileAnimationFramesCount(atlasCoords: Vector2i, framesCount: Int): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to framesCount.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_TILE_ANIMATION_FRAMES_COUNT, NIL)
  }

  /**
   * Returns how many animation frames has the tile at coordinates [atlasCoords].
   */
  public fun getTileAnimationFramesCount(atlasCoords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILE_ANIMATION_FRAMES_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the animation frame [duration] of frame [frameIndex] for the tile at coordinates [atlasCoords].
   */
  public fun setTileAnimationFrameDuration(
    atlasCoords: Vector2i,
    frameIndex: Int,
    duration: Float,
  ): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frameIndex.toLong(), DOUBLE to duration.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_TILE_ANIMATION_FRAME_DURATION, NIL)
  }

  /**
   * Returns the animation frame duration of frame [frameIndex] for the tile at coordinates [atlasCoords].
   */
  public fun getTileAnimationFrameDuration(atlasCoords: Vector2i, frameIndex: Int): Float {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frameIndex.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILE_ANIMATION_FRAME_DURATION, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the sum of the sum of the frame durations of the tile at coordinates [atlasCoords]. This value needs to be divided by the animation speed to get the actual animation loop duration.
   */
  public fun getTileAnimationTotalDuration(atlasCoords: Vector2i): Float {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILE_ANIMATION_TOTAL_DURATION, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Creates an alternative tile for the tile at coordinates [atlasCoords]. If [alternativeIdOverride] is -1, give it an automatically generated unique ID, or assigns it the given ID otherwise.
   *
   * Returns the new alternative identifier, or -1 if the alternative could not be created with a provided [alternativeIdOverride].
   */
  public fun createAlternativeTile(atlasCoords: Vector2i, alternativeIdOverride: Int = -1): Int {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeIdOverride.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_CREATE_ALTERNATIVE_TILE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Remove a tile's alternative with alternative ID [alternativeTile].
   *
   * Calling this function with [alternativeTile] equals to 0 will fail, as the base tile alternative cannot be removed.
   */
  public fun removeAlternativeTile(atlasCoords: Vector2i, alternativeTile: Int): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_REMOVE_ALTERNATIVE_TILE, NIL)
  }

  /**
   * Change a tile's alternative ID from [alternativeTile] to [newId].
   *
   * Calling this function with [newId] of 0 will fail, as the base tile alternative cannot be moved.
   */
  public fun setAlternativeTileId(
    atlasCoords: Vector2i,
    alternativeTile: Int,
    newId: Int,
  ): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeTile.toLong(), LONG to newId.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_SET_ALTERNATIVE_TILE_ID, NIL)
  }

  /**
   * Returns the alternative ID a following call to [createAlternativeTile] would return.
   */
  public fun getNextAlternativeTileId(atlasCoords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_NEXT_ALTERNATIVE_TILE_ID, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [godot.TileData] object for the given atlas coordinates and alternative ID.
   */
  public fun getTileData(atlasCoords: Vector2i, alternativeTile: Int): TileData? {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILE_DATA,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TileData?)
  }

  /**
   * Returns the atlas grid size, which depends on how many tiles can fit in the texture. It thus depends on the Texture's size, the atlas `margins` the tiles' `texture_region_size`.
   */
  public fun getAtlasGridSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_ATLAS_GRID_SIZE, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Returns a tile's texture region in the atlas texture. For animated tiles, a [frame] argument might be provided for the different frames of the animation.
   */
  public fun getTileTextureRegion(atlasCoords: Vector2i, frame: Int = 0): Rect2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frame.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_TILE_TEXTURE_REGION, RECT2I)
    return (TransferContext.readReturnValue(RECT2I, false) as Rect2i)
  }

  /**
   * If [useTexturePadding] is `false`, returns [texture]. Otherwise, returns and internal [godot.ImageTexture] created that includes the padding.
   */
  public fun getRuntimeTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_RUNTIME_TEXTURE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * Returns the region of the tile at coordinates [atlasCoords] for the given [frame] inside the texture returned by [getRuntimeTexture].
   *
   * **Note:** If [useTexturePadding] is `false`, returns the same as [getTileTextureRegion].
   */
  public fun getRuntimeTileTextureRegion(atlasCoords: Vector2i, frame: Int): Rect2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frame.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETATLASSOURCE_GET_RUNTIME_TILE_TEXTURE_REGION, RECT2I)
    return (TransferContext.readReturnValue(RECT2I, false) as Rect2i)
  }

  public companion object
}

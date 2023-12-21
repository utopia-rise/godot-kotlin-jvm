// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.Rect2i
import godot.core.TypeManager
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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * An atlas is a grid of tiles laid out on a texture. Each tile in the grid must be exposed using
 * [createTile]. Those tiles are then indexed using their coordinates in the grid.
 * Each tile can also have a size in the grid coordinates, making it more or less cells in the
 * atlas.
 * Alternatives version of a tile can be created using [createAlternativeTile], which are then
 * indexed using an alternative ID. The main tile (the one in the grid), is accessed with an
 * alternative ID equal to 0.
 * Each tile alternate has a set of properties that is defined by the source's [TileSet] layers.
 * Those properties are stored in a TileData object that can be accessed and modified using
 * [getTileData].
 * As TileData properties are stored directly in the TileSetAtlasSource resource, their properties
 * might also be set using
 * `TileSetAtlasSource.set("<coords_x>:<coords_y>/<alternative_id>/<tile_data_property>")`.
 */
@GodotBaseType
public open class TileSetAtlasSource : TileSetSource() {
  /**
   * The atlas texture.
   */
  public var texture: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  /**
   * Margins, in pixels, to offset the origin of the grid in the texture.
   */
  @CoreTypeLocalCopy
  public var margins: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMarginsPtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMarginsPtr, NIL)
    }

  /**
   * Separation, in pixels, between each tile texture region of the grid.
   */
  @CoreTypeLocalCopy
  public var separation: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSeparationPtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSeparationPtr, NIL)
    }

  /**
   * The base tile size in the texture (in pixel). This size must be bigger than the TileSet's
   * `tile_size` value.
   */
  @CoreTypeLocalCopy
  public var textureRegionSize: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureRegionSizePtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureRegionSizePtr, NIL)
    }

  /**
   * If `true`, generates an internal texture with an additional one pixel padding around each tile.
   * Texture padding avoids a common artifact where lines appear between tiles.
   * Disabling this setting might lead a small performance improvement, as generating the internal
   * texture requires both memory and processing time when the TileSetAtlasSource resource is modified.
   */
  public var useTexturePadding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUseTexturePaddingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseTexturePaddingPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TILESETATLASSOURCE, scriptIndex)
    return true
  }

  /**
   * Margins, in pixels, to offset the origin of the grid in the texture.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = tilesetatlassource.margins
   * //Your changes
   * tilesetatlassource.margins = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun marginsMutate(block: Vector2i.() -> Unit): Vector2i = margins.apply{
      block(this)
      margins = this
  }


  /**
   * Separation, in pixels, between each tile texture region of the grid.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = tilesetatlassource.separation
   * //Your changes
   * tilesetatlassource.separation = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun separationMutate(block: Vector2i.() -> Unit): Vector2i = separation.apply{
      block(this)
      separation = this
  }


  /**
   * The base tile size in the texture (in pixel). This size must be bigger than the TileSet's
   * `tile_size` value.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = tilesetatlassource.textureRegionSize
   * //Your changes
   * tilesetatlassource.textureRegionSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun textureRegionSizeMutate(block: Vector2i.() -> Unit): Vector2i =
      textureRegionSize.apply{
      block(this)
      textureRegionSize = this
  }


  /**
   * Creates a new tile at coordinates [atlasCoords] with the given [size].
   */
  @JvmOverloads
  public fun createTile(atlasCoords: Vector2i, size: Vector2i = Vector2i(1, 1)): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.createTilePtr, NIL)
  }

  /**
   * Remove a tile and its alternative at coordinates [atlasCoords].
   */
  public fun removeTile(atlasCoords: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.removeTilePtr, NIL)
  }

  /**
   * Move the tile and its alternatives at the [atlasCoords] coordinates to the [newAtlasCoords]
   * coordinates with the [newSize] size. This functions will fail if a tile is already present in the
   * given area.
   * If [newAtlasCoords] is `Vector2i(-1, -1)`, keeps the tile's coordinates. If [newSize] is
   * `Vector2i(-1, -1)`, keeps the tile's size.
   * To avoid an error, first check if a move is possible using [hasRoomForTile].
   */
  @JvmOverloads
  public fun moveTileInAtlas(
    atlasCoords: Vector2i,
    newAtlasCoords: Vector2i = Vector2i(-1, -1),
    newSize: Vector2i = Vector2i(-1, -1),
  ): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, VECTOR2I to newAtlasCoords, VECTOR2I to newSize)
    TransferContext.callMethod(rawPtr, MethodBindings.moveTileInAtlasPtr, NIL)
  }

  /**
   * Returns the size of the tile (in the grid coordinates system) at coordinates [atlasCoords].
   */
  public fun getTileSizeInAtlas(atlasCoords: Vector2i): Vector2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.getTileSizeInAtlasPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Returns whether there is enough room in an atlas to create/modify a tile with the given
   * properties. If [ignoredTile] is provided, act as is the given tile was not present in the atlas.
   * This may be used when you want to modify a tile's properties.
   */
  @JvmOverloads
  public fun hasRoomForTile(
    atlasCoords: Vector2i,
    size: Vector2i,
    animationColumns: Int,
    animationSeparation: Vector2i,
    framesCount: Int,
    ignoredTile: Vector2i = Vector2i(-1, -1),
  ): Boolean {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, VECTOR2I to size, LONG to animationColumns.toLong(), VECTOR2I to animationSeparation, LONG to framesCount.toLong(), VECTOR2I to ignoredTile)
    TransferContext.callMethod(rawPtr, MethodBindings.hasRoomForTilePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns an array of tiles coordinates ID that will be automatically removed when modifying one
   * or several of those properties: [texture], [margins], [separation] or [textureRegionSize]. This
   * can be used to undo changes that would have caused tiles data loss.
   */
  public fun getTilesToBeRemovedOnChange(
    texture: Texture2D,
    margins: Vector2i,
    separation: Vector2i,
    textureRegionSize: Vector2i,
  ): PackedVector2Array {
    TransferContext.writeArguments(OBJECT to texture, VECTOR2I to margins, VECTOR2I to separation, VECTOR2I to textureRegionSize)
    TransferContext.callMethod(rawPtr, MethodBindings.getTilesToBeRemovedOnChangePtr,
        PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * If there is a tile covering the [atlasCoords] coordinates, returns the top-left coordinates of
   * the tile (thus its coordinate ID). Returns `Vector2i(-1, -1)` otherwise.
   */
  public fun getTileAtCoords(atlasCoords: Vector2i): Vector2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.getTileAtCoordsPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Checks if the source has any tiles that don't fit the texture area (either partially or
   * completely).
   */
  public fun hasTilesOutsideTexture(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasTilesOutsideTexturePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Removes all tiles that don't fit the available texture area. This method iterates over all the
   * source's tiles, so it's advised to use [hasTilesOutsideTexture] beforehand.
   */
  public fun clearTilesOutsideTexture(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearTilesOutsideTexturePtr, NIL)
  }

  /**
   * Sets the number of columns in the animation layout of the tile at coordinates [atlasCoords]. If
   * set to 0, then the different frames of the animation are laid out as a single horizontal line in
   * the atlas.
   */
  public fun setTileAnimationColumns(atlasCoords: Vector2i, frameColumns: Int): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frameColumns.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setTileAnimationColumnsPtr, NIL)
  }

  /**
   * Returns how many columns the tile at [atlasCoords] has in its animation layout.
   */
  public fun getTileAnimationColumns(atlasCoords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.getTileAnimationColumnsPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the margin (in grid tiles) between each tile in the animation layout of the tile at
   * coordinates [atlasCoords] has.
   */
  public fun setTileAnimationSeparation(atlasCoords: Vector2i, separation: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, VECTOR2I to separation)
    TransferContext.callMethod(rawPtr, MethodBindings.setTileAnimationSeparationPtr, NIL)
  }

  /**
   * Returns the separation (as in the atlas grid) between each frame of an animated tile at
   * coordinates [atlasCoords].
   */
  public fun getTileAnimationSeparation(atlasCoords: Vector2i): Vector2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.getTileAnimationSeparationPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Sets the animation speed of the tile at coordinates [atlasCoords] has.
   */
  public fun setTileAnimationSpeed(atlasCoords: Vector2i, speed: Float): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, DOUBLE to speed.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setTileAnimationSpeedPtr, NIL)
  }

  /**
   * Returns the animation speed of the tile at coordinates [atlasCoords].
   */
  public fun getTileAnimationSpeed(atlasCoords: Vector2i): Float {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.getTileAnimationSpeedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the [TileAnimationMode] of the tile at [atlasCoords] to [mode]. See also
   * [getTileAnimationMode].
   */
  public fun setTileAnimationMode(atlasCoords: Vector2i, mode: TileAnimationMode): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setTileAnimationModePtr, NIL)
  }

  /**
   * Returns the [TileAnimationMode] of the tile at [atlasCoords]. See also [setTileAnimationMode].
   */
  public fun getTileAnimationMode(atlasCoords: Vector2i): TileAnimationMode {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.getTileAnimationModePtr, LONG)
    return TileSetAtlasSource.TileAnimationMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets how many animation frames the tile at coordinates [atlasCoords] has.
   */
  public fun setTileAnimationFramesCount(atlasCoords: Vector2i, framesCount: Int): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to framesCount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setTileAnimationFramesCountPtr, NIL)
  }

  /**
   * Returns how many animation frames has the tile at coordinates [atlasCoords].
   */
  public fun getTileAnimationFramesCount(atlasCoords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.getTileAnimationFramesCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the animation frame [duration] of frame [frameIndex] for the tile at coordinates
   * [atlasCoords].
   */
  public fun setTileAnimationFrameDuration(
    atlasCoords: Vector2i,
    frameIndex: Int,
    duration: Float,
  ): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frameIndex.toLong(), DOUBLE to duration.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setTileAnimationFrameDurationPtr, NIL)
  }

  /**
   * Returns the animation frame duration of frame [frameIndex] for the tile at coordinates
   * [atlasCoords].
   */
  public fun getTileAnimationFrameDuration(atlasCoords: Vector2i, frameIndex: Int): Float {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frameIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTileAnimationFrameDurationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the sum of the sum of the frame durations of the tile at coordinates [atlasCoords].
   * This value needs to be divided by the animation speed to get the actual animation loop duration.
   */
  public fun getTileAnimationTotalDuration(atlasCoords: Vector2i): Float {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.getTileAnimationTotalDurationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Creates an alternative tile for the tile at coordinates [atlasCoords]. If
   * [alternativeIdOverride] is -1, give it an automatically generated unique ID, or assigns it the
   * given ID otherwise.
   * Returns the new alternative identifier, or -1 if the alternative could not be created with a
   * provided [alternativeIdOverride].
   */
  @JvmOverloads
  public fun createAlternativeTile(atlasCoords: Vector2i, alternativeIdOverride: Int = -1): Int {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeIdOverride.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.createAlternativeTilePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Remove a tile's alternative with alternative ID [alternativeTile].
   * Calling this function with [alternativeTile] equals to 0 will fail, as the base tile
   * alternative cannot be removed.
   */
  public fun removeAlternativeTile(atlasCoords: Vector2i, alternativeTile: Int): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeAlternativeTilePtr, NIL)
  }

  /**
   * Change a tile's alternative ID from [alternativeTile] to [newId].
   * Calling this function with [newId] of 0 will fail, as the base tile alternative cannot be
   * moved.
   */
  public fun setAlternativeTileId(
    atlasCoords: Vector2i,
    alternativeTile: Int,
    newId: Int,
  ): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeTile.toLong(), LONG to newId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setAlternativeTileIdPtr, NIL)
  }

  /**
   * Returns the alternative ID a following call to [createAlternativeTile] would return.
   */
  public fun getNextAlternativeTileId(atlasCoords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.getNextAlternativeTileIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [TileData] object for the given atlas coordinates and alternative ID.
   */
  public fun getTileData(atlasCoords: Vector2i, alternativeTile: Int): TileData? {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTileDataPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TileData?)
  }

  /**
   * Returns the atlas grid size, which depends on how many tiles can fit in the texture. It thus
   * depends on the [texture]'s size, the atlas [margins], and the tiles' [textureRegionSize].
   */
  public fun getAtlasGridSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAtlasGridSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Returns a tile's texture region in the atlas texture. For animated tiles, a [frame] argument
   * might be provided for the different frames of the animation.
   */
  @JvmOverloads
  public fun getTileTextureRegion(atlasCoords: Vector2i, frame: Int = 0): Rect2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frame.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTileTextureRegionPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I, false) as Rect2i)
  }

  /**
   * If [useTexturePadding] is `false`, returns [texture]. Otherwise, returns and internal
   * [ImageTexture] created that includes the padding.
   */
  public fun getRuntimeTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRuntimeTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * Returns the region of the tile at coordinates [atlasCoords] for the given [frame] inside the
   * texture returned by [getRuntimeTexture].
   * **Note:** If [useTexturePadding] is `false`, returns the same as [getTileTextureRegion].
   */
  public fun getRuntimeTileTextureRegion(atlasCoords: Vector2i, frame: Int): Rect2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frame.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getRuntimeTileTextureRegionPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I, false) as Rect2i)
  }

  public enum class TileAnimationMode(
    id: Long,
  ) {
    /**
     * Tile animations start at same time, looking identical.
     */
    TILE_ANIMATION_MODE_DEFAULT(0),
    /**
     * Tile animations start at random times, looking varied.
     */
    TILE_ANIMATION_MODE_RANDOM_START_TIMES(1),
    /**
     * Represents the size of the [TileAnimationMode] enum.
     */
    TILE_ANIMATION_MODE_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Represents cell's horizontal flip flag. Should be used directly with [TileMap] to flip placed
     * tiles by altering their alternative IDs.
     * [codeblock]
     * var alternate_id = $TileMap.get_cell_alternative_tile(0, Vector2i(2, 2))
     * if not alternate_id & TileSetAtlasSource.TRANSFORM_FLIP_H:
     *     # If tile is not already flipped, flip it.
     *     $TileMap.set_cell(0, Vector2i(2, 2), source_id, atlas_coords, alternate_id |
     * TileSetAtlasSource.TRANSFORM_FLIP_H)
     * [/codeblock]
     */
    public final const val TRANSFORM_FLIP_H: Long = 4096

    /**
     * Represents cell's vertical flip flag. See [TRANSFORMFLIPH] for usage.
     */
    public final const val TRANSFORM_FLIP_V: Long = 8192

    /**
     * Represents cell's transposed flag. See [TRANSFORMFLIPH] for usage.
     */
    public final const val TRANSFORM_TRANSPOSE: Long = 16384
  }

  internal object MethodBindings {
    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_texture")

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_texture")

    public val setMarginsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_margins")

    public val getMarginsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_margins")

    public val setSeparationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_separation")

    public val getSeparationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_separation")

    public val setTextureRegionSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_texture_region_size")

    public val getTextureRegionSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_texture_region_size")

    public val setUseTexturePaddingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_use_texture_padding")

    public val getUseTexturePaddingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_use_texture_padding")

    public val createTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "create_tile")

    public val removeTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "remove_tile")

    public val moveTileInAtlasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "move_tile_in_atlas")

    public val getTileSizeInAtlasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_size_in_atlas")

    public val hasRoomForTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "has_room_for_tile")

    public val getTilesToBeRemovedOnChangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tiles_to_be_removed_on_change")

    public val getTileAtCoordsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_at_coords")

    public val hasTilesOutsideTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "has_tiles_outside_texture")

    public val clearTilesOutsideTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "clear_tiles_outside_texture")

    public val setTileAnimationColumnsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_tile_animation_columns")

    public val getTileAnimationColumnsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_animation_columns")

    public val setTileAnimationSeparationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_tile_animation_separation")

    public val getTileAnimationSeparationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_animation_separation")

    public val setTileAnimationSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_tile_animation_speed")

    public val getTileAnimationSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_animation_speed")

    public val setTileAnimationModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_tile_animation_mode")

    public val getTileAnimationModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_animation_mode")

    public val setTileAnimationFramesCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_tile_animation_frames_count")

    public val getTileAnimationFramesCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_animation_frames_count")

    public val setTileAnimationFrameDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_tile_animation_frame_duration")

    public val getTileAnimationFrameDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_animation_frame_duration")

    public val getTileAnimationTotalDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_animation_total_duration")

    public val createAlternativeTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "create_alternative_tile")

    public val removeAlternativeTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "remove_alternative_tile")

    public val setAlternativeTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_alternative_tile_id")

    public val getNextAlternativeTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_next_alternative_tile_id")

    public val getTileDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_data")

    public val getAtlasGridSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_atlas_grid_size")

    public val getTileTextureRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_texture_region")

    public val getRuntimeTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_runtime_texture")

    public val getRuntimeTileTextureRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_runtime_tile_texture_region")
  }
}

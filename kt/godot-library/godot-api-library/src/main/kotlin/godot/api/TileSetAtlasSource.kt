// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.PackedVector2Array
import godot.core.Rect2i
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.RECT2I
import godot.core.VariantParser.VECTOR2I
import godot.core.Vector2i
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * An atlas is a grid of tiles laid out on a texture. Each tile in the grid must be exposed using
 * [createTile]. Those tiles are then indexed using their coordinates in the grid.
 *
 * Each tile can also have a size in the grid coordinates, making it more or less cells in the
 * atlas.
 *
 * Alternatives version of a tile can be created using [createAlternativeTile], which are then
 * indexed using an alternative ID. The main tile (the one in the grid), is accessed with an
 * alternative ID equal to 0.
 *
 * Each tile alternate has a set of properties that is defined by the source's [TileSet] layers.
 * Those properties are stored in a TileData object that can be accessed and modified using
 * [getTileData].
 *
 * As TileData properties are stored directly in the TileSetAtlasSource resource, their properties
 * might also be set using
 * `TileSetAtlasSource.set("<coords_x>:<coords_y>/<alternative_id>/<tile_data_property>")`.
 */
@GodotBaseType
public open class TileSetAtlasSource : TileSetSource() {
  /**
   * The atlas texture.
   */
  public final inline var texture: Texture2D?
    @JvmName("textureProperty")
    get() = getTexture()
    @JvmName("textureProperty")
    set(`value`) {
      setTexture(value)
    }

  /**
   * Margins, in pixels, to offset the origin of the grid in the texture.
   */
  @CoreTypeLocalCopy
  public final inline var margins: Vector2i
    @JvmName("marginsProperty")
    get() = getMargins()
    @JvmName("marginsProperty")
    set(`value`) {
      setMargins(value)
    }

  /**
   * Separation, in pixels, between each tile texture region of the grid.
   */
  @CoreTypeLocalCopy
  public final inline var separation: Vector2i
    @JvmName("separationProperty")
    get() = getSeparation()
    @JvmName("separationProperty")
    set(`value`) {
      setSeparation(value)
    }

  /**
   * The base tile size in the texture (in pixel). This size must be bigger than or equal to the
   * TileSet's `tile_size` value.
   */
  @CoreTypeLocalCopy
  public final inline var textureRegionSize: Vector2i
    @JvmName("textureRegionSizeProperty")
    get() = getTextureRegionSize()
    @JvmName("textureRegionSizeProperty")
    set(`value`) {
      setTextureRegionSize(value)
    }

  /**
   * If `true`, generates an internal texture with an additional one pixel padding around each tile.
   * Texture padding avoids a common artifact where lines appear between tiles.
   *
   * Disabling this setting might lead a small performance improvement, as generating the internal
   * texture requires both memory and processing time when the TileSetAtlasSource resource is modified.
   */
  public final inline var useTexturePadding: Boolean
    @JvmName("useTexturePaddingProperty")
    get() = getUseTexturePadding()
    @JvmName("useTexturePaddingProperty")
    set(`value`) {
      setUseTexturePadding(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(690, scriptIndex)
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
  public final fun marginsMutate(block: Vector2i.() -> Unit): Vector2i = margins.apply{
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
  public final fun separationMutate(block: Vector2i.() -> Unit): Vector2i = separation.apply{
      block(this)
      separation = this
  }


  /**
   * The base tile size in the texture (in pixel). This size must be bigger than or equal to the
   * TileSet's `tile_size` value.
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
  public final fun textureRegionSizeMutate(block: Vector2i.() -> Unit): Vector2i =
      textureRegionSize.apply{
      block(this)
      textureRegionSize = this
  }


  public final fun setTexture(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setTexturePtr, NIL)
  }

  public final fun getTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setMargins(margins: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to margins)
    TransferContext.callMethod(ptr, MethodBindings.setMarginsPtr, NIL)
  }

  public final fun getMargins(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMarginsPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  public final fun setSeparation(separation: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to separation)
    TransferContext.callMethod(ptr, MethodBindings.setSeparationPtr, NIL)
  }

  public final fun getSeparation(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSeparationPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  public final fun setTextureRegionSize(textureRegionSize: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to textureRegionSize)
    TransferContext.callMethod(ptr, MethodBindings.setTextureRegionSizePtr, NIL)
  }

  public final fun getTextureRegionSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureRegionSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  public final fun setUseTexturePadding(useTexturePadding: Boolean): Unit {
    TransferContext.writeArguments(BOOL to useTexturePadding)
    TransferContext.callMethod(ptr, MethodBindings.setUseTexturePaddingPtr, NIL)
  }

  public final fun getUseTexturePadding(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUseTexturePaddingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Creates a new tile at coordinates [atlasCoords] with the given [size].
   */
  @JvmOverloads
  public final fun createTile(atlasCoords: Vector2i, size: Vector2i = Vector2i(1, 1)): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, VECTOR2I to size)
    TransferContext.callMethod(ptr, MethodBindings.createTilePtr, NIL)
  }

  /**
   * Remove a tile and its alternative at coordinates [atlasCoords].
   */
  public final fun removeTile(atlasCoords: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(ptr, MethodBindings.removeTilePtr, NIL)
  }

  /**
   * Move the tile and its alternatives at the [atlasCoords] coordinates to the [newAtlasCoords]
   * coordinates with the [newSize] size. This functions will fail if a tile is already present in the
   * given area.
   *
   * If [newAtlasCoords] is `Vector2i(-1, -1)`, keeps the tile's coordinates. If [newSize] is
   * `Vector2i(-1, -1)`, keeps the tile's size.
   *
   * To avoid an error, first check if a move is possible using [hasRoomForTile].
   */
  @JvmOverloads
  public final fun moveTileInAtlas(
    atlasCoords: Vector2i,
    newAtlasCoords: Vector2i = Vector2i(-1, -1),
    newSize: Vector2i = Vector2i(-1, -1),
  ): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, VECTOR2I to newAtlasCoords, VECTOR2I to newSize)
    TransferContext.callMethod(ptr, MethodBindings.moveTileInAtlasPtr, NIL)
  }

  /**
   * Returns the size of the tile (in the grid coordinates system) at coordinates [atlasCoords].
   */
  public final fun getTileSizeInAtlas(atlasCoords: Vector2i): Vector2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(ptr, MethodBindings.getTileSizeInAtlasPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns whether there is enough room in an atlas to create/modify a tile with the given
   * properties. If [ignoredTile] is provided, act as is the given tile was not present in the atlas.
   * This may be used when you want to modify a tile's properties.
   */
  @JvmOverloads
  public final fun hasRoomForTile(
    atlasCoords: Vector2i,
    size: Vector2i,
    animationColumns: Int,
    animationSeparation: Vector2i,
    framesCount: Int,
    ignoredTile: Vector2i = Vector2i(-1, -1),
  ): Boolean {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, VECTOR2I to size, LONG to animationColumns.toLong(), VECTOR2I to animationSeparation, LONG to framesCount.toLong(), VECTOR2I to ignoredTile)
    TransferContext.callMethod(ptr, MethodBindings.hasRoomForTilePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns an array of tiles coordinates ID that will be automatically removed when modifying one
   * or several of those properties: [texture], [margins], [separation] or [textureRegionSize]. This
   * can be used to undo changes that would have caused tiles data loss.
   */
  public final fun getTilesToBeRemovedOnChange(
    texture: Texture2D?,
    margins: Vector2i,
    separation: Vector2i,
    textureRegionSize: Vector2i,
  ): PackedVector2Array {
    TransferContext.writeArguments(OBJECT to texture, VECTOR2I to margins, VECTOR2I to separation, VECTOR2I to textureRegionSize)
    TransferContext.callMethod(ptr, MethodBindings.getTilesToBeRemovedOnChangePtr,
        PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * If there is a tile covering the [atlasCoords] coordinates, returns the top-left coordinates of
   * the tile (thus its coordinate ID). Returns `Vector2i(-1, -1)` otherwise.
   */
  public final fun getTileAtCoords(atlasCoords: Vector2i): Vector2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(ptr, MethodBindings.getTileAtCoordsPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Checks if the source has any tiles that don't fit the texture area (either partially or
   * completely).
   */
  public final fun hasTilesOutsideTexture(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasTilesOutsideTexturePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Removes all tiles that don't fit the available texture area. This method iterates over all the
   * source's tiles, so it's advised to use [hasTilesOutsideTexture] beforehand.
   */
  public final fun clearTilesOutsideTexture(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearTilesOutsideTexturePtr, NIL)
  }

  /**
   * Sets the number of columns in the animation layout of the tile at coordinates [atlasCoords]. If
   * set to 0, then the different frames of the animation are laid out as a single horizontal line in
   * the atlas.
   */
  public final fun setTileAnimationColumns(atlasCoords: Vector2i, frameColumns: Int): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frameColumns.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setTileAnimationColumnsPtr, NIL)
  }

  /**
   * Returns how many columns the tile at [atlasCoords] has in its animation layout.
   */
  public final fun getTileAnimationColumns(atlasCoords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(ptr, MethodBindings.getTileAnimationColumnsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the margin (in grid tiles) between each tile in the animation layout of the tile at
   * coordinates [atlasCoords] has.
   */
  public final fun setTileAnimationSeparation(atlasCoords: Vector2i, separation: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, VECTOR2I to separation)
    TransferContext.callMethod(ptr, MethodBindings.setTileAnimationSeparationPtr, NIL)
  }

  /**
   * Returns the separation (as in the atlas grid) between each frame of an animated tile at
   * coordinates [atlasCoords].
   */
  public final fun getTileAnimationSeparation(atlasCoords: Vector2i): Vector2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(ptr, MethodBindings.getTileAnimationSeparationPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Sets the animation speed of the tile at coordinates [atlasCoords] has.
   */
  public final fun setTileAnimationSpeed(atlasCoords: Vector2i, speed: Float): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, DOUBLE to speed.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTileAnimationSpeedPtr, NIL)
  }

  /**
   * Returns the animation speed of the tile at coordinates [atlasCoords].
   */
  public final fun getTileAnimationSpeed(atlasCoords: Vector2i): Float {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(ptr, MethodBindings.getTileAnimationSpeedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the tile animation mode of the tile at [atlasCoords] to [mode]. See also
   * [getTileAnimationMode].
   */
  public final fun setTileAnimationMode(atlasCoords: Vector2i, mode: TileAnimationMode): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setTileAnimationModePtr, NIL)
  }

  /**
   * Returns the tile animation mode of the tile at [atlasCoords]. See also [setTileAnimationMode].
   */
  public final fun getTileAnimationMode(atlasCoords: Vector2i): TileAnimationMode {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(ptr, MethodBindings.getTileAnimationModePtr, LONG)
    return TileAnimationMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets how many animation frames the tile at coordinates [atlasCoords] has.
   */
  public final fun setTileAnimationFramesCount(atlasCoords: Vector2i, framesCount: Int): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to framesCount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setTileAnimationFramesCountPtr, NIL)
  }

  /**
   * Returns how many animation frames has the tile at coordinates [atlasCoords].
   */
  public final fun getTileAnimationFramesCount(atlasCoords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(ptr, MethodBindings.getTileAnimationFramesCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the animation frame [duration] of frame [frameIndex] for the tile at coordinates
   * [atlasCoords].
   */
  public final fun setTileAnimationFrameDuration(
    atlasCoords: Vector2i,
    frameIndex: Int,
    duration: Float,
  ): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frameIndex.toLong(), DOUBLE to duration.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTileAnimationFrameDurationPtr, NIL)
  }

  /**
   * Returns the animation frame duration of frame [frameIndex] for the tile at coordinates
   * [atlasCoords].
   */
  public final fun getTileAnimationFrameDuration(atlasCoords: Vector2i, frameIndex: Int): Float {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frameIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTileAnimationFrameDurationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the sum of the sum of the frame durations of the tile at coordinates [atlasCoords].
   * This value needs to be divided by the animation speed to get the actual animation loop duration.
   */
  public final fun getTileAnimationTotalDuration(atlasCoords: Vector2i): Float {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(ptr, MethodBindings.getTileAnimationTotalDurationPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Creates an alternative tile for the tile at coordinates [atlasCoords]. If
   * [alternativeIdOverride] is -1, give it an automatically generated unique ID, or assigns it the
   * given ID otherwise.
   *
   * Returns the new alternative identifier, or -1 if the alternative could not be created with a
   * provided [alternativeIdOverride].
   */
  @JvmOverloads
  public final fun createAlternativeTile(atlasCoords: Vector2i, alternativeIdOverride: Int = -1):
      Int {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeIdOverride.toLong())
    TransferContext.callMethod(ptr, MethodBindings.createAlternativeTilePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Remove a tile's alternative with alternative ID [alternativeTile].
   *
   * Calling this function with [alternativeTile] equals to 0 will fail, as the base tile
   * alternative cannot be removed.
   */
  public final fun removeAlternativeTile(atlasCoords: Vector2i, alternativeTile: Int): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    TransferContext.callMethod(ptr, MethodBindings.removeAlternativeTilePtr, NIL)
  }

  /**
   * Change a tile's alternative ID from [alternativeTile] to [newId].
   *
   * Calling this function with [newId] of 0 will fail, as the base tile alternative cannot be
   * moved.
   */
  public final fun setAlternativeTileId(
    atlasCoords: Vector2i,
    alternativeTile: Int,
    newId: Int,
  ): Unit {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeTile.toLong(), LONG to newId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setAlternativeTileIdPtr, NIL)
  }

  /**
   * Returns the alternative ID a following call to [createAlternativeTile] would return.
   */
  public final fun getNextAlternativeTileId(atlasCoords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(ptr, MethodBindings.getNextAlternativeTileIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the [TileData] object for the given atlas coordinates and alternative ID.
   */
  public final fun getTileData(atlasCoords: Vector2i, alternativeTile: Int): TileData? {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTileDataPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as TileData?)
  }

  /**
   * Returns the atlas grid size, which depends on how many tiles can fit in the texture. It thus
   * depends on the [texture]'s size, the atlas [margins], and the tiles' [textureRegionSize].
   */
  public final fun getAtlasGridSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAtlasGridSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns a tile's texture region in the atlas texture. For animated tiles, a [frame] argument
   * might be provided for the different frames of the animation.
   */
  @JvmOverloads
  public final fun getTileTextureRegion(atlasCoords: Vector2i, frame: Int = 0): Rect2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frame.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTileTextureRegionPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I) as Rect2i)
  }

  /**
   * If [useTexturePadding] is `false`, returns [texture]. Otherwise, returns and internal
   * [ImageTexture] created that includes the padding.
   */
  public final fun getRuntimeTexture(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRuntimeTexturePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Returns the region of the tile at coordinates [atlasCoords] for the given [frame] inside the
   * texture returned by [getRuntimeTexture].
   *
   * **Note:** If [useTexturePadding] is `false`, returns the same as [getTileTextureRegion].
   */
  public final fun getRuntimeTileTextureRegion(atlasCoords: Vector2i, frame: Int): Rect2i {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to frame.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getRuntimeTileTextureRegionPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I) as Rect2i)
  }

  public enum class TileAnimationMode(
    id: Long,
  ) {
    /**
     * Tile animations start at same time, looking identical.
     */
    DEFAULT(0),
    /**
     * Tile animations start at random times, looking varied.
     */
    RANDOM_START_TIMES(1),
    /**
     * Represents the size of the [TileAnimationMode] enum.
     */
    MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TileAnimationMode = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Represents cell's horizontal flip flag. Should be used directly with [TileMap] to flip placed
     * tiles by altering their alternative IDs.
     *
     * ```
     * var alternate_id = $TileMap.get_cell_alternative_tile(0, Vector2i(2, 2))
     * if not alternate_id & TileSetAtlasSource.TRANSFORM_FLIP_H:
     *     # If tile is not already flipped, flip it.
     *     $TileMap.set_cell(0, Vector2i(2, 2), source_id, atlas_coords, alternate_id |
     * TileSetAtlasSource.TRANSFORM_FLIP_H)
     * ```
     *
     * **Note:** These transformations can be combined to do the equivalent of 0, 90, 180, and 270
     * degree rotations, as shown below:
     *
     * ```
     * enum TileTransform {
     *     ROTATE_0 = 0,
     *     ROTATE_90 = TileSetAtlasSource.TRANSFORM_TRANSPOSE | TileSetAtlasSource.TRANSFORM_FLIP_H,
     *     ROTATE_180 = TileSetAtlasSource.TRANSFORM_FLIP_H | TileSetAtlasSource.TRANSFORM_FLIP_V,
     *     ROTATE_270 = TileSetAtlasSource.TRANSFORM_TRANSPOSE |
     * TileSetAtlasSource.TRANSFORM_FLIP_V,
     * }
     * ```
     */
    public final const val TRANSFORM_FLIP_H: Long = 4096

    /**
     * Represents cell's vertical flip flag. See [TRANSFORM_FLIP_H] for usage.
     */
    public final const val TRANSFORM_FLIP_V: Long = 8192

    /**
     * Represents cell's transposed flag. See [TRANSFORM_FLIP_H] for usage.
     */
    public final const val TRANSFORM_TRANSPOSE: Long = 16384
  }

  public object MethodBindings {
    internal val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_texture", 4051416890)

    internal val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_texture", 3635182373)

    internal val setMarginsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_margins", 1130785943)

    internal val getMarginsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_margins", 3690982128)

    internal val setSeparationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_separation", 1130785943)

    internal val getSeparationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_separation", 3690982128)

    internal val setTextureRegionSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_texture_region_size", 1130785943)

    internal val getTextureRegionSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_texture_region_size", 3690982128)

    internal val setUseTexturePaddingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_use_texture_padding", 2586408642)

    internal val getUseTexturePaddingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_use_texture_padding", 36873697)

    internal val createTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "create_tile", 190528769)

    internal val removeTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "remove_tile", 1130785943)

    internal val moveTileInAtlasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "move_tile_in_atlas", 3870111920)

    internal val getTileSizeInAtlasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_size_in_atlas", 3050897911)

    internal val hasRoomForTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "has_room_for_tile", 3018597268)

    internal val getTilesToBeRemovedOnChangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tiles_to_be_removed_on_change", 1240378054)

    internal val getTileAtCoordsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_at_coords", 3050897911)

    internal val hasTilesOutsideTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "has_tiles_outside_texture", 36873697)

    internal val clearTilesOutsideTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "clear_tiles_outside_texture", 3218959716)

    internal val setTileAnimationColumnsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_tile_animation_columns", 3200960707)

    internal val getTileAnimationColumnsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_animation_columns", 2485466453)

    internal val setTileAnimationSeparationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_tile_animation_separation", 1941061099)

    internal val getTileAnimationSeparationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_animation_separation", 3050897911)

    internal val setTileAnimationSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_tile_animation_speed", 2262553149)

    internal val getTileAnimationSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_animation_speed", 719993801)

    internal val setTileAnimationModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_tile_animation_mode", 3192753483)

    internal val getTileAnimationModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_animation_mode", 4025349959)

    internal val setTileAnimationFramesCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_tile_animation_frames_count", 3200960707)

    internal val getTileAnimationFramesCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_animation_frames_count", 2485466453)

    internal val setTileAnimationFrameDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_tile_animation_frame_duration", 2843487787)

    internal val getTileAnimationFrameDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_animation_frame_duration", 1802448425)

    internal val getTileAnimationTotalDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_animation_total_duration", 719993801)

    internal val createAlternativeTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "create_alternative_tile", 2226298068)

    internal val removeAlternativeTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "remove_alternative_tile", 3200960707)

    internal val setAlternativeTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "set_alternative_tile_id", 1499785778)

    internal val getNextAlternativeTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_next_alternative_tile_id", 2485466453)

    internal val getTileDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_data", 3534028207)

    internal val getAtlasGridSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_atlas_grid_size", 3690982128)

    internal val getTileTextureRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_tile_texture_region", 241857547)

    internal val getRuntimeTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_runtime_texture", 3635182373)

    internal val getRuntimeTileTextureRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetAtlasSource", "get_runtime_tile_texture_region", 104874263)
  }
}

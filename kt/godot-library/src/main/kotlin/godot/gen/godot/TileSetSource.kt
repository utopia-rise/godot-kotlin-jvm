// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Exposes a set of tiles for a [godot.TileSet] resource.
 *
 * Exposes a set of tiles for a [godot.TileSet] resource.
 *
 * Tiles in a source are indexed with two IDs, coordinates ID (of type Vector2i) and an alternative ID (of type int), named according to their use in the [godot.TileSetAtlasSource] class.
 *
 * Depending on the TileSet source type, those IDs might have restrictions on their values, this is why the base [godot.TileSetSource] class only exposes getters for them.
 *
 * You can iterate over all tiles exposed by a TileSetSource by first iterating over coordinates IDs using [getTilesCount] and [getTileId], then over alternative IDs using [getAlternativeTilesCount] and [getAlternativeTileId].
 */
@GodotBaseType
public open class TileSetSource internal constructor() : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TILESETSOURCE)
  }

  /**
   * Returns how many tiles this atlas source defines (not including alternative tiles).
   */
  public fun getTilesCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETSOURCE_GET_TILES_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the tile coordinates ID of the tile with index [index].
   */
  public fun getTileId(index: Long): Vector2i {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETSOURCE_GET_TILE_ID, VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Returns if this atlas has a tile with coordinates ID [atlasCoords].
   */
  public fun hasTile(atlasCoords: Vector2i): Boolean {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETSOURCE_HAS_TILE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the number of alternatives tiles for the coordinates ID [atlasCoords].
   *
   * For [godot.TileSetAtlasSource], this always return at least 1, as the base tile with ID 0 is always part of the alternatives list.
   *
   * Returns -1 if there is not tile at the given coords.
   */
  public fun getAlternativeTilesCount(atlasCoords: Vector2i): Long {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSOURCE_GET_ALTERNATIVE_TILES_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the alternative ID for the tile with coordinates ID [atlasCoords] at index [index].
   */
  public fun getAlternativeTileId(atlasCoords: Vector2i, index: Long): Long {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILESETSOURCE_GET_ALTERNATIVE_TILE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns if the base tile at coordinates [atlasCoords] has an alternative with ID [alternativeTile].
   */
  public fun hasAlternativeTile(atlasCoords: Vector2i, alternativeTile: Long): Boolean {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeTile)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILESETSOURCE_HAS_ALTERNATIVE_TILE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Holds a pattern to be copied from or pasted into [godot.TileMap]s.
 *
 * This resource holds a set of cells to help bulk manipulations of [godot.TileMap].
 *
 * A pattern always start at the `(0,0)` coordinates and cannot have cells with negative coordinates.
 */
@GodotBaseType
public open class TileMapPattern : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TILEMAPPATTERN)
  }

  /**
   * Sets the tile indentifiers for the cell at coordinates [coords]. See [godot.TileMap.setCell].
   */
  public fun setCell(
    coords: Vector2i,
    sourceId: Long = -1,
    atlasCoords: Vector2i = Vector2i(-1, -1),
    alternativeTile: Long = -1
  ): Unit {
    TransferContext.writeArguments(VECTOR2I to coords, LONG to sourceId, VECTOR2I to atlasCoords, LONG to alternativeTile)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAPPATTERN_SET_CELL, NIL)
  }

  /**
   * Returns whether the pattern has a tile at the given coordinates.
   */
  public fun hasCell(coords: Vector2i): Boolean {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAPPATTERN_HAS_CELL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Remove the cell at the given coordinates.
   */
  public fun removeCell(coords: Vector2i, updateSize: Boolean): Unit {
    TransferContext.writeArguments(VECTOR2I to coords, BOOL to updateSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAPPATTERN_REMOVE_CELL, NIL)
  }

  /**
   * Returns the tile source ID of the cell at [coords].
   */
  public fun getCellSourceId(coords: Vector2i): Long {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAPPATTERN_GET_CELL_SOURCE_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the tile atlas coordinates ID of the cell at [coords].
   */
  public fun getCellAtlasCoords(coords: Vector2i): Vector2i {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEMAPPATTERN_GET_CELL_ATLAS_COORDS, VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Returns the tile alternative ID of the cell at [coords].
   */
  public fun getCellAlternativeTile(coords: Vector2i): Long {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEMAPPATTERN_GET_CELL_ALTERNATIVE_TILE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the list of used cell coordinates in the pattern.
   */
  public fun getUsedCells(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAPPATTERN_GET_USED_CELLS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the size, in cells, of the pattern.
   */
  public fun getSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAPPATTERN_GET_SIZE, VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Sets the size of the pattern.
   */
  public fun setSize(size: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAPPATTERN_SET_SIZE, NIL)
  }

  /**
   * Returns whether the pattern is empty or not.
   */
  public fun isEmpty(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAPPATTERN_IS_EMPTY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}

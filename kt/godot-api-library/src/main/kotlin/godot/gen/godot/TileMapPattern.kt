// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * This resource holds a set of cells to help bulk manipulations of [TileMap].
 * A pattern always start at the `(0,0)` coordinates and cannot have cells with negative
 * coordinates.
 */
@GodotBaseType
public open class TileMapPattern : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_TILEMAPPATTERN, scriptIndex)
  }

  /**
   * Sets the tile identifiers for the cell at coordinates [coords]. See [TileMap.setCell].
   */
  @JvmOverloads
  public final fun setCell(
    coords: Vector2i,
    sourceId: Int = -1,
    atlasCoords: Vector2i = Vector2i(-1, -1),
    alternativeTile: Int = -1,
  ): Unit {
    TransferContext.writeArguments(VECTOR2I to coords, LONG to sourceId.toLong(), VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCellPtr, NIL)
  }

  /**
   * Returns whether the pattern has a tile at the given coordinates.
   */
  public final fun hasCell(coords: Vector2i): Boolean {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(rawPtr, MethodBindings.hasCellPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Remove the cell at the given coordinates.
   */
  public final fun removeCell(coords: Vector2i, updateSize: Boolean): Unit {
    TransferContext.writeArguments(VECTOR2I to coords, BOOL to updateSize)
    TransferContext.callMethod(rawPtr, MethodBindings.removeCellPtr, NIL)
  }

  /**
   * Returns the tile source ID of the cell at [coords].
   */
  public final fun getCellSourceId(coords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(rawPtr, MethodBindings.getCellSourceIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the tile atlas coordinates ID of the cell at [coords].
   */
  public final fun getCellAtlasCoords(coords: Vector2i): Vector2i {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(rawPtr, MethodBindings.getCellAtlasCoordsPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the tile alternative ID of the cell at [coords].
   */
  public final fun getCellAlternativeTile(coords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(rawPtr, MethodBindings.getCellAlternativeTilePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the list of used cell coordinates in the pattern.
   */
  public final fun getUsedCells(): VariantArray<Vector2i> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUsedCellsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Vector2i>)
  }

  /**
   * Returns the size, in cells, of the pattern.
   */
  public final fun getSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Sets the size of the pattern.
   */
  public final fun setSize(size: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
  }

  /**
   * Returns whether the pattern is empty or not.
   */
  public final fun isEmpty(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isEmptyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setCellPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "set_cell", 2224802556)

    public val hasCellPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "has_cell", 3900751641)

    public val removeCellPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "remove_cell", 4153096796)

    public val getCellSourceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "get_cell_source_id", 2485466453)

    public val getCellAtlasCoordsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "get_cell_atlas_coords", 3050897911)

    public val getCellAlternativeTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "get_cell_alternative_tile", 2485466453)

    public val getUsedCellsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "get_used_cells", 3995934104)

    public val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "get_size", 3690982128)

    public val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "set_size", 1130785943)

    public val isEmptyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "is_empty", 36873697)
  }
}

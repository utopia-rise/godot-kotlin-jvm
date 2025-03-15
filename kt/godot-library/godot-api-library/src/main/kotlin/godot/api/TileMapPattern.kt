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
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2I
import godot.core.Vector2i
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
    createNativeObject(687, scriptIndex)
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
    TransferContext.callMethod(ptr, MethodBindings.setCellPtr, NIL)
  }

  /**
   * Returns whether the pattern has a tile at the given coordinates.
   */
  public final fun hasCell(coords: Vector2i): Boolean {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(ptr, MethodBindings.hasCellPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Remove the cell at the given coordinates.
   */
  public final fun removeCell(coords: Vector2i, updateSize: Boolean): Unit {
    TransferContext.writeArguments(VECTOR2I to coords, BOOL to updateSize)
    TransferContext.callMethod(ptr, MethodBindings.removeCellPtr, NIL)
  }

  /**
   * Returns the tile source ID of the cell at [coords].
   */
  public final fun getCellSourceId(coords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(ptr, MethodBindings.getCellSourceIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the tile atlas coordinates ID of the cell at [coords].
   */
  public final fun getCellAtlasCoords(coords: Vector2i): Vector2i {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(ptr, MethodBindings.getCellAtlasCoordsPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the tile alternative ID of the cell at [coords].
   */
  public final fun getCellAlternativeTile(coords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(ptr, MethodBindings.getCellAlternativeTilePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the list of used cell coordinates in the pattern.
   */
  public final fun getUsedCells(): VariantArray<Vector2i> {
    TransferContext.callMethod(ptr, MethodBindings.getUsedCellsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Vector2i>)
  }

  /**
   * Returns the size, in cells, of the pattern.
   */
  public final fun getSize(): Vector2i {
    TransferContext.callMethod(ptr, MethodBindings.getSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Sets the size of the pattern.
   */
  public final fun setSize(size: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(ptr, MethodBindings.setSizePtr, NIL)
  }

  /**
   * Returns whether the pattern is empty or not.
   */
  public final fun isEmpty(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.isEmptyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setCellPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "set_cell", 2224802556)

    internal val hasCellPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "has_cell", 3900751641)

    internal val removeCellPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "remove_cell", 4153096796)

    internal val getCellSourceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "get_cell_source_id", 2485466453)

    internal val getCellAtlasCoordsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "get_cell_atlas_coords", 3050897911)

    internal val getCellAlternativeTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "get_cell_alternative_tile", 2485466453)

    internal val getUsedCellsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "get_used_cells", 3995934104)

    internal val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "get_size", 3690982128)

    internal val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "set_size", 1130785943)

    internal val isEmptyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileMapPattern", "is_empty", 36873697)
  }
}

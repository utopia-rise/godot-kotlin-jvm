// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR2I
import godot.core.Vector2i
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_TILEMAPPATTERN_INDEX: Int = 666

/**
 * This resource holds a set of cells to help bulk manipulations of [TileMap].
 * A pattern always start at the `(0,0)` coordinates and cannot have cells with negative
 * coordinates.
 */
@GodotBaseType
public open class TileMapPattern : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_TILEMAPPATTERN_INDEX, scriptIndex)
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
    Internals.writeArguments(VECTOR2I to coords, LONG to sourceId.toLong(), VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setCellPtr, NIL)
  }

  /**
   * Returns whether the pattern has a tile at the given coordinates.
   */
  public final fun hasCell(coords: Vector2i): Boolean {
    Internals.writeArguments(VECTOR2I to coords)
    Internals.callMethod(rawPtr, MethodBindings.hasCellPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Remove the cell at the given coordinates.
   */
  public final fun removeCell(coords: Vector2i, updateSize: Boolean): Unit {
    Internals.writeArguments(VECTOR2I to coords, BOOL to updateSize)
    Internals.callMethod(rawPtr, MethodBindings.removeCellPtr, NIL)
  }

  /**
   * Returns the tile source ID of the cell at [coords].
   */
  public final fun getCellSourceId(coords: Vector2i): Int {
    Internals.writeArguments(VECTOR2I to coords)
    Internals.callMethod(rawPtr, MethodBindings.getCellSourceIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the tile atlas coordinates ID of the cell at [coords].
   */
  public final fun getCellAtlasCoords(coords: Vector2i): Vector2i {
    Internals.writeArguments(VECTOR2I to coords)
    Internals.callMethod(rawPtr, MethodBindings.getCellAtlasCoordsPtr, VECTOR2I)
    return (Internals.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the tile alternative ID of the cell at [coords].
   */
  public final fun getCellAlternativeTile(coords: Vector2i): Int {
    Internals.writeArguments(VECTOR2I to coords)
    Internals.callMethod(rawPtr, MethodBindings.getCellAlternativeTilePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the list of used cell coordinates in the pattern.
   */
  public final fun getUsedCells(): VariantArray<Vector2i> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUsedCellsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Vector2i>)
  }

  /**
   * Returns the size, in cells, of the pattern.
   */
  public final fun getSize(): Vector2i {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2I)
    return (Internals.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Sets the size of the pattern.
   */
  public final fun setSize(size: Vector2i): Unit {
    Internals.writeArguments(VECTOR2I to size)
    Internals.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
  }

  /**
   * Returns whether the pattern is empty or not.
   */
  public final fun isEmpty(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isEmptyPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setCellPtr: VoidPtr =
        Internals.getMethodBindPtr("TileMapPattern", "set_cell", 2224802556)

    internal val hasCellPtr: VoidPtr =
        Internals.getMethodBindPtr("TileMapPattern", "has_cell", 3900751641)

    internal val removeCellPtr: VoidPtr =
        Internals.getMethodBindPtr("TileMapPattern", "remove_cell", 4153096796)

    internal val getCellSourceIdPtr: VoidPtr =
        Internals.getMethodBindPtr("TileMapPattern", "get_cell_source_id", 2485466453)

    internal val getCellAtlasCoordsPtr: VoidPtr =
        Internals.getMethodBindPtr("TileMapPattern", "get_cell_atlas_coords", 3050897911)

    internal val getCellAlternativeTilePtr: VoidPtr =
        Internals.getMethodBindPtr("TileMapPattern", "get_cell_alternative_tile", 2485466453)

    internal val getUsedCellsPtr: VoidPtr =
        Internals.getMethodBindPtr("TileMapPattern", "get_used_cells", 3995934104)

    internal val getSizePtr: VoidPtr =
        Internals.getMethodBindPtr("TileMapPattern", "get_size", 3690982128)

    internal val setSizePtr: VoidPtr =
        Internals.getMethodBindPtr("TileMapPattern", "set_size", 1130785943)

    internal val isEmptyPtr: VoidPtr =
        Internals.getMethodBindPtr("TileMapPattern", "is_empty", 36873697)
  }
}

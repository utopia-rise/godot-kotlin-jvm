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
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.RECT2I
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * [AStarGrid2D] is a variant of [AStar2D] that is specialized for partial 2D grids. It is simpler
 * to use because it doesn't require you to manually create points and connect them together. This
 * class also supports multiple types of heuristics, modes for diagonal movement, and a jumping mode to
 * speed up calculations.
 * To use [AStarGrid2D], you only need to set the [region] of the grid, optionally set the
 * [cellSize], and then call the [update] method:
 *
 * gdscript:
 * ```gdscript
 * var astar_grid = AStarGrid2D.new()
 * astar_grid.region = Rect2i(0, 0, 32, 32)
 * astar_grid.cell_size = Vector2(16, 16)
 * astar_grid.update()
 * print(astar_grid.get_id_path(Vector2i(0, 0), Vector2i(3, 4))) # prints (0, 0), (1, 1), (2, 2),
 * (3, 3), (3, 4)
 * print(astar_grid.get_point_path(Vector2i(0, 0), Vector2i(3, 4))) # prints (0, 0), (16, 16), (32,
 * 32), (48, 48), (48, 64)
 * ```
 * csharp:
 * ```csharp
 * AStarGrid2D astarGrid = new AStarGrid2D();
 * astarGrid.Region = new Rect2I(0, 0, 32, 32);
 * astarGrid.CellSize = new Vector2I(16, 16);
 * astarGrid.Update();
 * GD.Print(astarGrid.GetIdPath(Vector2I.Zero, new Vector2I(3, 4))); // prints (0, 0), (1, 1), (2,
 * 2), (3, 3), (3, 4)
 * GD.Print(astarGrid.GetPointPath(Vector2I.Zero, new Vector2I(3, 4))); // prints (0, 0), (16, 16),
 * (32, 32), (48, 48), (48, 64)
 * ```
 *
 * To remove a point from the pathfinding grid, it must be set as "solid" with [setPointSolid].
 */
@GodotBaseType
public open class AStarGrid2D : RefCounted() {
  /**
   * The region of grid cells available for pathfinding. If changed, [update] needs to be called
   * before finding the next path.
   */
  @CoreTypeLocalCopy
  public var region: Rect2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRegionPtr, RECT2I)
      return (TransferContext.readReturnValue(RECT2I, false) as Rect2i)
    }
    set(`value`) {
      TransferContext.writeArguments(RECT2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRegionPtr, NIL)
    }

  /**
   * The size of the grid (number of cells of size [cellSize] on each axis). If changed, [update]
   * needs to be called before finding the next path.
   */
  @CoreTypeLocalCopy
  public var size: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
    }

  /**
   * The offset of the grid which will be applied to calculate the resulting point position returned
   * by [getPointPath]. If changed, [update] needs to be called before finding the next path.
   */
  @CoreTypeLocalCopy
  public var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
    }

  /**
   * The size of the point cell which will be applied to calculate the resulting point position
   * returned by [getPointPath]. If changed, [update] needs to be called before finding the next path.
   */
  @CoreTypeLocalCopy
  public var cellSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCellSizePtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCellSizePtr, NIL)
    }

  /**
   * The cell shape. Affects how the positions are placed in the grid. If changed, [update] needs to
   * be called before finding the next path.
   */
  public var cellShape: CellShape
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCellShapePtr, LONG)
      return AStarGrid2D.CellShape.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCellShapePtr, NIL)
    }

  /**
   * Enables or disables jumping to skip up the intermediate points and speeds up the searching
   * algorithm.
   * **Note:** Currently, toggling it on disables the consideration of weight scaling in
   * pathfinding.
   */
  public var jumpingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isJumpingEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setJumpingEnabledPtr, NIL)
    }

  /**
   * The default [Heuristic] which will be used to calculate the cost between two points if
   * [_computeCost] was not overridden.
   */
  public var defaultComputeHeuristic: Heuristic
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultComputeHeuristicPtr, LONG)
      return AStarGrid2D.Heuristic.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultComputeHeuristicPtr, NIL)
    }

  /**
   * The default [Heuristic] which will be used to calculate the cost between the point and the end
   * point if [_estimateCost] was not overridden.
   */
  public var defaultEstimateHeuristic: Heuristic
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultEstimateHeuristicPtr, LONG)
      return AStarGrid2D.Heuristic.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultEstimateHeuristicPtr, NIL)
    }

  /**
   * A specific [DiagonalMode] mode which will force the path to avoid or accept the specified
   * diagonals.
   */
  public var diagonalMode: DiagonalMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDiagonalModePtr, LONG)
      return AStarGrid2D.DiagonalMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDiagonalModePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_ASTARGRID2D, scriptIndex)
  }

  /**
   * The region of grid cells available for pathfinding. If changed, [update] needs to be called
   * before finding the next path.
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
   * val myCoreType = astargrid2d.region
   * //Your changes
   * astargrid2d.region = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun regionMutate(block: Rect2i.() -> Unit): Rect2i = region.apply{
      block(this)
      region = this
  }


  /**
   * The size of the grid (number of cells of size [cellSize] on each axis). If changed, [update]
   * needs to be called before finding the next path.
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
   * val myCoreType = astargrid2d.size
   * //Your changes
   * astargrid2d.size = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun sizeMutate(block: Vector2i.() -> Unit): Vector2i = size.apply{
      block(this)
      size = this
  }


  /**
   * The offset of the grid which will be applied to calculate the resulting point position returned
   * by [getPointPath]. If changed, [update] needs to be called before finding the next path.
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
   * val myCoreType = astargrid2d.offset
   * //Your changes
   * astargrid2d.offset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
      block(this)
      offset = this
  }


  /**
   * The size of the point cell which will be applied to calculate the resulting point position
   * returned by [getPointPath]. If changed, [update] needs to be called before finding the next path.
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
   * val myCoreType = astargrid2d.cellSize
   * //Your changes
   * astargrid2d.cellSize = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun cellSizeMutate(block: Vector2.() -> Unit): Vector2 = cellSize.apply{
      block(this)
      cellSize = this
  }


  /**
   * Called when estimating the cost between a point and the path's ending point.
   * Note that this function is hidden in the default [AStarGrid2D] class.
   */
  public open fun _estimateCost(fromId: Vector2i, toId: Vector2i): Float {
    throw NotImplementedError("_estimate_cost is not implemented for AStarGrid2D")
  }

  /**
   * Called when computing the cost between two connected points.
   * Note that this function is hidden in the default [AStarGrid2D] class.
   */
  public open fun _computeCost(fromId: Vector2i, toId: Vector2i): Float {
    throw NotImplementedError("_compute_cost is not implemented for AStarGrid2D")
  }

  /**
   * Returns `true` if the [x] and [y] is a valid grid coordinate (id), i.e. if it is inside
   * [region]. Equivalent to `region.has_point(Vector2i(x, y))`.
   */
  public fun isInBounds(x: Int, y: Int): Boolean {
    TransferContext.writeArguments(LONG to x.toLong(), LONG to y.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isInBoundsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the [id] vector is a valid grid coordinate, i.e. if it is inside [region].
   * Equivalent to `region.has_point(id)`.
   */
  public fun isInBoundsv(id: Vector2i): Boolean {
    TransferContext.writeArguments(VECTOR2I to id)
    TransferContext.callMethod(rawPtr, MethodBindings.isInBoundsvPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Indicates that the grid parameters were changed and [update] needs to be called.
   */
  public fun isDirty(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDirtyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Updates the internal state of the grid according to the parameters to prepare it to search the
   * path. Needs to be called if parameters like [region], [cellSize] or [offset] are changed.
   * [isDirty] will return `true` if this is the case and this needs to be called.
   * **Note:** All point data (solidity and weight scale) will be cleared.
   */
  public fun update(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.updatePtr, NIL)
  }

  /**
   * Disables or enables the specified point for pathfinding. Useful for making an obstacle. By
   * default, all points are enabled.
   * **Note:** Calling [update] is not needed after the call of this function.
   */
  @JvmOverloads
  public fun setPointSolid(id: Vector2i, solid: Boolean = true): Unit {
    TransferContext.writeArguments(VECTOR2I to id, BOOL to solid)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointSolidPtr, NIL)
  }

  /**
   * Returns `true` if a point is disabled for pathfinding. By default, all points are enabled.
   */
  public fun isPointSolid(id: Vector2i): Boolean {
    TransferContext.writeArguments(VECTOR2I to id)
    TransferContext.callMethod(rawPtr, MethodBindings.isPointSolidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the [weightScale] for the point with the given [id]. The [weightScale] is multiplied by
   * the result of [_computeCost] when determining the overall cost of traveling across a segment from
   * a neighboring point to this point.
   * **Note:** Calling [update] is not needed after the call of this function.
   */
  public fun setPointWeightScale(id: Vector2i, weightScale: Float): Unit {
    TransferContext.writeArguments(VECTOR2I to id, DOUBLE to weightScale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPointWeightScalePtr, NIL)
  }

  /**
   * Returns the weight scale of the point associated with the given [id].
   */
  public fun getPointWeightScale(id: Vector2i): Float {
    TransferContext.writeArguments(VECTOR2I to id)
    TransferContext.callMethod(rawPtr, MethodBindings.getPointWeightScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Fills the given [region] on the grid with the specified value for the solid flag.
   * **Note:** Calling [update] is not needed after the call of this function.
   */
  @JvmOverloads
  public fun fillSolidRegion(region: Rect2i, solid: Boolean = true): Unit {
    TransferContext.writeArguments(RECT2I to region, BOOL to solid)
    TransferContext.callMethod(rawPtr, MethodBindings.fillSolidRegionPtr, NIL)
  }

  /**
   * Fills the given [region] on the grid with the specified value for the weight scale.
   * **Note:** Calling [update] is not needed after the call of this function.
   */
  public fun fillWeightScaleRegion(region: Rect2i, weightScale: Float): Unit {
    TransferContext.writeArguments(RECT2I to region, DOUBLE to weightScale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.fillWeightScaleRegionPtr, NIL)
  }

  /**
   * Clears the grid and sets the [region] to `Rect2i(0, 0, 0, 0)`.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns the position of the point associated with the given [id].
   */
  public fun getPointPosition(id: Vector2i): Vector2 {
    TransferContext.writeArguments(VECTOR2I to id)
    TransferContext.callMethod(rawPtr, MethodBindings.getPointPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns an array with the points that are in the path found by [AStarGrid2D] between the given
   * points. The array is ordered from the starting point to the ending point of the path.
   * If there is no valid path to the target, and [allowPartialPath] is `true`, returns a path to
   * the point closest to the target that can be reached.
   * **Note:** This method is not thread-safe. If called from a [Thread], it will return an empty
   * array and will print an error message.
   */
  @JvmOverloads
  public fun getPointPath(
    fromId: Vector2i,
    toId: Vector2i,
    allowPartialPath: Boolean = false,
  ): PackedVector2Array {
    TransferContext.writeArguments(VECTOR2I to fromId, VECTOR2I to toId, BOOL to allowPartialPath)
    TransferContext.callMethod(rawPtr, MethodBindings.getPointPathPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * Returns an array with the IDs of the points that form the path found by AStar2D between the
   * given points. The array is ordered from the starting point to the ending point of the path.
   * If there is no valid path to the target, and [allowPartialPath] is `true`, returns a path to
   * the point closest to the target that can be reached.
   */
  @JvmOverloads
  public fun getIdPath(
    fromId: Vector2i,
    toId: Vector2i,
    allowPartialPath: Boolean = false,
  ): VariantArray<Vector2i> {
    TransferContext.writeArguments(VECTOR2I to fromId, VECTOR2I to toId, BOOL to allowPartialPath)
    TransferContext.callMethod(rawPtr, MethodBindings.getIdPathPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector2i>)
  }

  public enum class Heuristic(
    id: Long,
  ) {
    /**
     * The [url=https://en.wikipedia.org/wiki/Euclidean_distance]Euclidean heuristic[/url] to be
     * used for the pathfinding using the following formula:
     * [codeblock]
     * dx = abs(to_id.x - from_id.x)
     * dy = abs(to_id.y - from_id.y)
     * result = sqrt(dx * dx + dy * dy)
     * [/codeblock]
     * **Note:** This is also the internal heuristic used in [AStar3D] and [AStar2D] by default
     * (with the inclusion of possible z-axis coordinate).
     */
    HEURISTIC_EUCLIDEAN(0),
    /**
     * The [url=https://en.wikipedia.org/wiki/Taxicab_geometry]Manhattan heuristic[/url] to be used
     * for the pathfinding using the following formula:
     * [codeblock]
     * dx = abs(to_id.x - from_id.x)
     * dy = abs(to_id.y - from_id.y)
     * result = dx + dy
     * [/codeblock]
     * **Note:** This heuristic is intended to be used with 4-side orthogonal movements, provided by
     * setting the [diagonalMode] to [DIAGONAL_MODE_NEVER].
     */
    HEURISTIC_MANHATTAN(1),
    /**
     * The Octile heuristic to be used for the pathfinding using the following formula:
     * [codeblock]
     * dx = abs(to_id.x - from_id.x)
     * dy = abs(to_id.y - from_id.y)
     * f = sqrt(2) - 1
     * result = (dx < dy) ? f * dx + dy : f * dy + dx;
     * [/codeblock]
     */
    HEURISTIC_OCTILE(2),
    /**
     * The [url=https://en.wikipedia.org/wiki/Chebyshev_distance]Chebyshev heuristic[/url] to be
     * used for the pathfinding using the following formula:
     * [codeblock]
     * dx = abs(to_id.x - from_id.x)
     * dy = abs(to_id.y - from_id.y)
     * result = max(dx, dy)
     * [/codeblock]
     */
    HEURISTIC_CHEBYSHEV(3),
    /**
     * Represents the size of the [Heuristic] enum.
     */
    HEURISTIC_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Heuristic = entries.single { it.id == `value` }
    }
  }

  public enum class DiagonalMode(
    id: Long,
  ) {
    /**
     * The pathfinding algorithm will ignore solid neighbors around the target cell and allow
     * passing using diagonals.
     */
    DIAGONAL_MODE_ALWAYS(0),
    /**
     * The pathfinding algorithm will ignore all diagonals and the way will be always orthogonal.
     */
    DIAGONAL_MODE_NEVER(1),
    /**
     * The pathfinding algorithm will avoid using diagonals if at least two obstacles have been
     * placed around the neighboring cells of the specific path segment.
     */
    DIAGONAL_MODE_AT_LEAST_ONE_WALKABLE(2),
    /**
     * The pathfinding algorithm will avoid using diagonals if any obstacle has been placed around
     * the neighboring cells of the specific path segment.
     */
    DIAGONAL_MODE_ONLY_IF_NO_OBSTACLES(3),
    /**
     * Represents the size of the [DiagonalMode] enum.
     */
    DIAGONAL_MODE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DiagonalMode = entries.single { it.id == `value` }
    }
  }

  public enum class CellShape(
    id: Long,
  ) {
    /**
     * Rectangular cell shape.
     */
    CELL_SHAPE_SQUARE(0),
    /**
     * Diamond cell shape (for isometric look). Cell coordinates layout where the horizontal axis
     * goes up-right, and the vertical one goes down-right.
     */
    CELL_SHAPE_ISOMETRIC_RIGHT(1),
    /**
     * Diamond cell shape (for isometric look). Cell coordinates layout where the horizontal axis
     * goes down-right, and the vertical one goes down-left.
     */
    CELL_SHAPE_ISOMETRIC_DOWN(2),
    /**
     * Represents the size of the [CellShape] enum.
     */
    CELL_SHAPE_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CellShape = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setRegionPtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "set_region")

    public val getRegionPtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "get_region")

    public val setSizePtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "set_size")

    public val getSizePtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "get_size")

    public val setOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "set_offset")

    public val getOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "get_offset")

    public val setCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_cell_size")

    public val getCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_cell_size")

    public val setCellShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_cell_shape")

    public val getCellShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_cell_shape")

    public val isInBoundsPtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "is_in_bounds")

    public val isInBoundsvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "is_in_boundsv")

    public val isDirtyPtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "is_dirty")

    public val updatePtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "update")

    public val setJumpingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_jumping_enabled")

    public val isJumpingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "is_jumping_enabled")

    public val setDiagonalModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_diagonal_mode")

    public val getDiagonalModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_diagonal_mode")

    public val setDefaultComputeHeuristicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_default_compute_heuristic")

    public val getDefaultComputeHeuristicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_default_compute_heuristic")

    public val setDefaultEstimateHeuristicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_default_estimate_heuristic")

    public val getDefaultEstimateHeuristicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_default_estimate_heuristic")

    public val setPointSolidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_point_solid")

    public val isPointSolidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "is_point_solid")

    public val setPointWeightScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_point_weight_scale")

    public val getPointWeightScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_point_weight_scale")

    public val fillSolidRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "fill_solid_region")

    public val fillWeightScaleRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "fill_weight_scale_region")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "clear")

    public val getPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_point_position")

    public val getPointPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_point_path")

    public val getIdPathPtr: VoidPtr = TypeManager.getMethodBindPtr("AStarGrid2D", "get_id_path")
  }
}

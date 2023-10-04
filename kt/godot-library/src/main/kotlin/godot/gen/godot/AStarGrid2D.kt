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
 * An implementation of A* for finding the shortest path between two points on a partial 2D grid.
 *
 * [godot.AStarGrid2D] is a variant of [godot.AStar2D] that is specialized for partial 2D grids. It is simpler to use because it doesn't require you to manually create points and connect them together. This class also supports multiple types of heuristics, modes for diagonal movement, and a jumping mode to speed up calculations.
 *
 * To use [godot.AStarGrid2D], you only need to set the [region] of the grid, optionally set the [cellSize], and then call the [update] method:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var astar_grid = AStarGrid2D.new()
 *
 * astar_grid.region = Rect2i(0, 0, 32, 32)
 *
 * astar_grid.cell_size = Vector2(16, 16)
 *
 * astar_grid.update()
 *
 * print(astar_grid.get_id_path(Vector2i(0, 0), Vector2i(3, 4))) # prints (0, 0), (1, 1), (2, 2), (3, 3), (3, 4)
 *
 * print(astar_grid.get_point_path(Vector2i(0, 0), Vector2i(3, 4))) # prints (0, 0), (16, 16), (32, 32), (48, 48), (48, 64)
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * AStarGrid2D astarGrid = new AStarGrid2D();
 *
 * astarGrid.Size = new Vector2I(32, 32);
 *
 * astarGrid.CellSize = new Vector2I(16, 16);
 *
 * astarGrid.Update();
 *
 * GD.Print(astarGrid.GetIdPath(Vector2I.Zero, new Vector2I(3, 4))); // prints (0, 0), (1, 1), (2, 2), (3, 3), (3, 4)
 *
 * GD.Print(astarGrid.GetPointPath(Vector2I.Zero, new Vector2I(3, 4))); // prints (0, 0), (16, 16), (32, 32), (48, 48), (48, 64)
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * To remove a point from the pathfinding grid, it must be set as "solid" with [setPointSolid].
 */
@GodotBaseType
public open class AStarGrid2D : RefCounted() {
  /**
   * The region of grid cells available for pathfinding. If changed, [update] needs to be called before finding the next path.
   */
  @CoreTypeLocalCopy
  public var region: Rect2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_GET_REGION, RECT2I)
      return (TransferContext.readReturnValue(RECT2I, false) as Rect2i)
    }
    set(`value`) {
      TransferContext.writeArguments(RECT2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_SET_REGION, NIL)
    }

  /**
   * The size of the grid (number of cells of size [cellSize] on each axis). If changed, [update] needs to be called before finding the next path.
   *
   * *Deprecated.* Use [region] instead.
   */
  @CoreTypeLocalCopy
  public var size: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_GET_SIZE, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_SET_SIZE, NIL)
    }

  /**
   * The offset of the grid which will be applied to calculate the resulting point position returned by [getPointPath]. If changed, [update] needs to be called before finding the next path.
   */
  @CoreTypeLocalCopy
  public var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_GET_OFFSET, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_SET_OFFSET, NIL)
    }

  /**
   * The size of the point cell which will be applied to calculate the resulting point position returned by [getPointPath]. If changed, [update] needs to be called before finding the next path.
   */
  @CoreTypeLocalCopy
  public var cellSize: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_GET_CELL_SIZE,
          VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_SET_CELL_SIZE, NIL)
    }

  /**
   * Enables or disables jumping to skip up the intermediate points and speeds up the searching algorithm.
   *
   * **Note:** Currently, toggling it on disables the consideration of weight scaling in pathfinding.
   */
  public var jumpingEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_IS_JUMPING_ENABLED,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_SET_JUMPING_ENABLED,
          NIL)
    }

  /**
   * The default [enum Heuristic] which will be used to calculate the cost between two points if [_computeCost] was not overridden.
   */
  public var defaultComputeHeuristic: Heuristic
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_GET_DEFAULT_COMPUTE_HEURISTIC, LONG)
      return AStarGrid2D.Heuristic.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_SET_DEFAULT_COMPUTE_HEURISTIC, NIL)
    }

  /**
   * The default [enum Heuristic] which will be used to calculate the cost between the point and the end point if [_estimateCost] was not overridden.
   */
  public var defaultEstimateHeuristic: Heuristic
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_GET_DEFAULT_ESTIMATE_HEURISTIC, LONG)
      return AStarGrid2D.Heuristic.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_SET_DEFAULT_ESTIMATE_HEURISTIC, NIL)
    }

  /**
   * A specific [enum DiagonalMode] mode which will force the path to avoid or accept the specified diagonals.
   */
  public var diagonalMode: DiagonalMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_GET_DIAGONAL_MODE,
          LONG)
      return AStarGrid2D.DiagonalMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_SET_DIAGONAL_MODE,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ASTARGRID2D, scriptIndex)
    return true
  }

  /**
   * The region of grid cells available for pathfinding. If changed, [update] needs to be called before finding the next path.
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
   * The size of the grid (number of cells of size [cellSize] on each axis). If changed, [update] needs to be called before finding the next path.
   *
   * *Deprecated.* Use [region] instead.
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
   * The offset of the grid which will be applied to calculate the resulting point position returned by [getPointPath]. If changed, [update] needs to be called before finding the next path.
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
   * The size of the point cell which will be applied to calculate the resulting point position returned by [getPointPath]. If changed, [update] needs to be called before finding the next path.
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
   *
   * Note that this function is hidden in the default `AStarGrid2D` class.
   */
  public open fun _estimateCost(fromId: Vector2i, toId: Vector2i): Float {
    throw NotImplementedError("_estimate_cost is not implemented for AStarGrid2D")
  }

  /**
   * Called when computing the cost between two connected points.
   *
   * Note that this function is hidden in the default `AStarGrid2D` class.
   */
  public open fun _computeCost(fromId: Vector2i, toId: Vector2i): Float {
    throw NotImplementedError("_compute_cost is not implemented for AStarGrid2D")
  }

  /**
   * Returns `true` if the [x] and [y] is a valid grid coordinate (id).
   */
  public fun isInBounds(x: Int, y: Int): Boolean {
    TransferContext.writeArguments(LONG to x.toLong(), LONG to y.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_IS_IN_BOUNDS, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the [id] vector is a valid grid coordinate.
   */
  public fun isInBoundsv(id: Vector2i): Boolean {
    TransferContext.writeArguments(VECTOR2I to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_IS_IN_BOUNDSV, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Indicates that the grid parameters were changed and [update] needs to be called.
   */
  public fun isDirty(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_IS_DIRTY, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Updates the internal state of the grid according to the parameters to prepare it to search the path. Needs to be called if parameters like [region], [cellSize] or [offset] are changed. [isDirty] will return `true` if this is the case and this needs to be called.
   *
   * **Note:** All point data (solidity and weight scale) will be cleared.
   */
  public fun update(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_UPDATE, NIL)
  }

  /**
   * Disables or enables the specified point for pathfinding. Useful for making an obstacle. By default, all points are enabled.
   *
   * **Note:** Calling [update] is not needed after the call of this function.
   */
  @JvmOverloads
  public fun setPointSolid(id: Vector2i, solid: Boolean = true): Unit {
    TransferContext.writeArguments(VECTOR2I to id, BOOL to solid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_SET_POINT_SOLID, NIL)
  }

  /**
   * Returns `true` if a point is disabled for pathfinding. By default, all points are enabled.
   */
  public fun isPointSolid(id: Vector2i): Boolean {
    TransferContext.writeArguments(VECTOR2I to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_IS_POINT_SOLID, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the [weightScale] for the point with the given [id]. The [weightScale] is multiplied by the result of [_computeCost] when determining the overall cost of traveling across a segment from a neighboring point to this point.
   *
   * **Note:** Calling [update] is not needed after the call of this function.
   */
  public fun setPointWeightScale(id: Vector2i, weightScale: Float): Unit {
    TransferContext.writeArguments(VECTOR2I to id, DOUBLE to weightScale.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_SET_POINT_WEIGHT_SCALE,
        NIL)
  }

  /**
   * Returns the weight scale of the point associated with the given [id].
   */
  public fun getPointWeightScale(id: Vector2i): Float {
    TransferContext.writeArguments(VECTOR2I to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_GET_POINT_WEIGHT_SCALE,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Clears the grid and sets the [region] to `Rect2i(0, 0, 0, 0)`.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_CLEAR, NIL)
  }

  /**
   * Returns the position of the point associated with the given [id].
   */
  public fun getPointPosition(id: Vector2i): Vector2 {
    TransferContext.writeArguments(VECTOR2I to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_GET_POINT_POSITION,
        VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns an array with the points that are in the path found by AStarGrid2D between the given points. The array is ordered from the starting point to the ending point of the path.
   *
   * **Note:** This method is not thread-safe. If called from a [godot.Thread], it will return an empty [godot.PackedVector3Array] and will print an error message.
   */
  public fun getPointPath(fromId: Vector2i, toId: Vector2i): PackedVector2Array {
    TransferContext.writeArguments(VECTOR2I to fromId, VECTOR2I to toId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_GET_POINT_PATH,
        PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * Returns an array with the IDs of the points that form the path found by AStar2D between the given points. The array is ordered from the starting point to the ending point of the path.
   */
  public fun getIdPath(fromId: Vector2i, toId: Vector2i): VariantArray<Vector2i> {
    TransferContext.writeArguments(VECTOR2I to fromId, VECTOR2I to toId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ASTARGRID2D_GET_ID_PATH, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector2i>)
  }

  public enum class Heuristic(
    id: Long,
  ) {
    /**
     * The [godot.Euclidean heuristic](https://en.wikipedia.org/wiki/Euclidean_distance) to be used for the pathfinding using the following formula:
     *
     * ```
     * 			dx = abs(to_id.x - from_id.x)
     * 			dy = abs(to_id.y - from_id.y)
     * 			result = sqrt(dx * dx + dy * dy)
     * 			```
     *
     * **Note:** This is also the internal heuristic used in [godot.AStar3D] and [godot.AStar2D] by default (with the inclusion of possible z-axis coordinate).
     */
    HEURISTIC_EUCLIDEAN(0),
    /**
     * The [godot.Manhattan heuristic](https://en.wikipedia.org/wiki/Taxicab_geometry) to be used for the pathfinding using the following formula:
     *
     * ```
     * 			dx = abs(to_id.x - from_id.x)
     * 			dy = abs(to_id.y - from_id.y)
     * 			result = dx + dy
     * 			```
     *
     * **Note:** This heuristic is intended to be used with 4-side orthogonal movements, provided by setting the [diagonalMode] to [DIAGONAL_MODE_NEVER].
     */
    HEURISTIC_MANHATTAN(1),
    /**
     * The Octile heuristic to be used for the pathfinding using the following formula:
     *
     * ```
     * 			dx = abs(to_id.x - from_id.x)
     * 			dy = abs(to_id.y - from_id.y)
     * 			f = sqrt(2) - 1
     * 			result = (dx < dy) ? f * dx + dy : f * dy + dx;
     * 			```
     */
    HEURISTIC_OCTILE(2),
    /**
     * The [godot.Chebyshev heuristic](https://en.wikipedia.org/wiki/Chebyshev_distance) to be used for the pathfinding using the following formula:
     *
     * ```
     * 			dx = abs(to_id.x - from_id.x)
     * 			dy = abs(to_id.y - from_id.y)
     * 			result = max(dx, dy)
     * 			```
     */
    HEURISTIC_CHEBYSHEV(3),
    /**
     * Represents the size of the [enum Heuristic] enum.
     */
    HEURISTIC_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class DiagonalMode(
    id: Long,
  ) {
    /**
     * The pathfinding algorithm will ignore solid neighbors around the target cell and allow passing using diagonals.
     */
    DIAGONAL_MODE_ALWAYS(0),
    /**
     * The pathfinding algorithm will ignore all diagonals and the way will be always orthogonal.
     */
    DIAGONAL_MODE_NEVER(1),
    /**
     * The pathfinding algorithm will avoid using diagonals if at least two obstacles have been placed around the neighboring cells of the specific path segment.
     */
    DIAGONAL_MODE_AT_LEAST_ONE_WALKABLE(2),
    /**
     * The pathfinding algorithm will avoid using diagonals if any obstacle has been placed around the neighboring cells of the specific path segment.
     */
    DIAGONAL_MODE_ONLY_IF_NO_OBSTACLES(3),
    /**
     * Represents the size of the [enum DiagonalMode] enum.
     */
    DIAGONAL_MODE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}

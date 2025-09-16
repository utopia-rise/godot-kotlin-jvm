// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Dictionary
import godot.core.PackedVector2Array
import godot.core.Rect2i
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.RECT2I
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * [AStarGrid2D] is a variant of [AStar2D] that is specialized for partial 2D grids. It is simpler to use because it doesn't require you to manually create points and connect them together. This class also supports multiple types of heuristics, modes for diagonal movement, and a jumping mode to speed up calculations.
 *
 * To use [AStarGrid2D], you only need to set the [region] of the grid, optionally set the [cellSize], and then call the [update] method:
 *
 * ```gdscript
 * //gdscript
 * var astar_grid = AStarGrid2D.new()
 * astar_grid.region = Rect2i(0, 0, 32, 32)
 * astar_grid.cell_size = Vector2(16, 16)
 * astar_grid.update()
 * print(astar_grid.get_id_path(Vector2i(0, 0), Vector2i(3, 4))) # Prints [(0, 0), (1, 1), (2, 2), (3, 3), (3, 4)]
 * print(astar_grid.get_point_path(Vector2i(0, 0), Vector2i(3, 4))) # Prints [(0, 0), (16, 16), (32, 32), (48, 48), (48, 64)]
 * ```
 *
 * ```csharp
 * //csharp
 * AStarGrid2D astarGrid = new AStarGrid2D();
 * astarGrid.Region = new Rect2I(0, 0, 32, 32);
 * astarGrid.CellSize = new Vector2I(16, 16);
 * astarGrid.Update();
 * GD.Print(astarGrid.GetIdPath(Vector2I.Zero, new Vector2I(3, 4))); // Prints [(0, 0), (1, 1), (2, 2), (3, 3), (3, 4)]
 * GD.Print(astarGrid.GetPointPath(Vector2I.Zero, new Vector2I(3, 4))); // Prints [(0, 0), (16, 16), (32, 32), (48, 48), (48, 64)]
 * ```
 *
 * To remove a point from the pathfinding grid, it must be set as "solid" with [setPointSolid].
 */
@GodotBaseType
public open class AStarGrid2D : RefCounted() {
  /**
   * The region of grid cells available for pathfinding. If changed, [update] needs to be called before finding the next path.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var region: Rect2i
    @JvmName("regionProperty")
    get() = getRegion()
    @JvmName("regionProperty")
    set(`value`) {
      setRegion(value)
    }

  /**
   * The size of the grid (number of cells of size [cellSize] on each axis). If changed, [update] needs to be called before finding the next path.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var size: Vector2i
    @JvmName("sizeProperty")
    get() = getSize()
    @JvmName("sizeProperty")
    set(`value`) {
      setSize(value)
    }

  /**
   * The offset of the grid which will be applied to calculate the resulting point position returned by [getPointPath]. If changed, [update] needs to be called before finding the next path.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var offset: Vector2
    @JvmName("offsetProperty")
    get() = getOffset()
    @JvmName("offsetProperty")
    set(`value`) {
      setOffset(value)
    }

  /**
   * The size of the point cell which will be applied to calculate the resulting point position returned by [getPointPath]. If changed, [update] needs to be called before finding the next path.
   *
   * **Warning:**
   * Be careful when trying to modify a local [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again afterward.
   */
  @CoreTypeLocalCopy
  public final inline var cellSize: Vector2
    @JvmName("cellSizeProperty")
    get() = getCellSize()
    @JvmName("cellSizeProperty")
    set(`value`) {
      setCellSize(value)
    }

  /**
   * The cell shape. Affects how the positions are placed in the grid. If changed, [update] needs to be called before finding the next path.
   */
  public final inline var cellShape: CellShape
    @JvmName("cellShapeProperty")
    get() = getCellShape()
    @JvmName("cellShapeProperty")
    set(`value`) {
      setCellShape(value)
    }

  /**
   * Enables or disables jumping to skip up the intermediate points and speeds up the searching algorithm.
   *
   * **Note:** Currently, toggling it on disables the consideration of weight scaling in pathfinding.
   */
  public final inline var jumpingEnabled: Boolean
    @JvmName("jumpingEnabledProperty")
    get() = isJumpingEnabled()
    @JvmName("jumpingEnabledProperty")
    set(`value`) {
      setJumpingEnabled(value)
    }

  /**
   * The default [Heuristic] which will be used to calculate the cost between two points if [_computeCost] was not overridden.
   */
  public final inline var defaultComputeHeuristic: Heuristic
    @JvmName("defaultComputeHeuristicProperty")
    get() = getDefaultComputeHeuristic()
    @JvmName("defaultComputeHeuristicProperty")
    set(`value`) {
      setDefaultComputeHeuristic(value)
    }

  /**
   * The default [Heuristic] which will be used to calculate the cost between the point and the end point if [_estimateCost] was not overridden.
   */
  public final inline var defaultEstimateHeuristic: Heuristic
    @JvmName("defaultEstimateHeuristicProperty")
    get() = getDefaultEstimateHeuristic()
    @JvmName("defaultEstimateHeuristicProperty")
    set(`value`) {
      setDefaultEstimateHeuristic(value)
    }

  /**
   * A specific [DiagonalMode] mode which will force the path to avoid or accept the specified diagonals.
   */
  public final inline var diagonalMode: DiagonalMode
    @JvmName("diagonalModeProperty")
    get() = getDiagonalMode()
    @JvmName("diagonalModeProperty")
    set(`value`) {
      setDiagonalMode(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(5, scriptIndex)
  }

  /**
   * This is a helper function for [region] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = astargrid2d.region
   * //Your changes
   * astargrid2d.region = myCoreType
   * ``````
   *
   * The region of grid cells available for pathfinding. If changed, [update] needs to be called before finding the next path.
   */
  @CoreTypeHelper
  public final fun regionMutate(block: Rect2i.() -> Unit): Rect2i = region.apply {
     block(this)
     region = this
  }

  /**
   * This is a helper function for [size] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = astargrid2d.size
   * //Your changes
   * astargrid2d.size = myCoreType
   * ``````
   *
   * The size of the grid (number of cells of size [cellSize] on each axis). If changed, [update] needs to be called before finding the next path.
   */
  @CoreTypeHelper
  public final fun sizeMutate(block: Vector2i.() -> Unit): Vector2i = size.apply {
     block(this)
     size = this
  }

  /**
   * This is a helper function for [offset] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = astargrid2d.offset
   * //Your changes
   * astargrid2d.offset = myCoreType
   * ``````
   *
   * The offset of the grid which will be applied to calculate the resulting point position returned by [getPointPath]. If changed, [update] needs to be called before finding the next path.
   */
  @CoreTypeHelper
  public final fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply {
     block(this)
     offset = this
  }

  /**
   * This is a helper function for [cellSize] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = astargrid2d.cellSize
   * //Your changes
   * astargrid2d.cellSize = myCoreType
   * ``````
   *
   * The size of the point cell which will be applied to calculate the resulting point position returned by [getPointPath]. If changed, [update] needs to be called before finding the next path.
   */
  @CoreTypeHelper
  public final fun cellSizeMutate(block: Vector2.() -> Unit): Vector2 = cellSize.apply {
     block(this)
     cellSize = this
  }

  /**
   * Called when estimating the cost between a point and the path's ending point.
   *
   * Note that this function is hidden in the default [AStarGrid2D] class.
   */
  public open fun _estimateCost(fromId: Vector2i, endId: Vector2i): Float {
    throw NotImplementedError("AStarGrid2D::_estimateCost is not implemented.")
  }

  /**
   * Called when computing the cost between two connected points.
   *
   * Note that this function is hidden in the default [AStarGrid2D] class.
   */
  public open fun _computeCost(fromId: Vector2i, toId: Vector2i): Float {
    throw NotImplementedError("AStarGrid2D::_computeCost is not implemented.")
  }

  public final fun setRegion(region: Rect2i) {
    TransferContext.writeArguments(RECT2I to region)
    TransferContext.callMethod(ptr, MethodBindings.setRegionPtr, NIL)
  }

  public final fun getRegion(): Rect2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRegionPtr, RECT2I)
    return (TransferContext.readReturnValue(RECT2I) as Rect2i)
  }

  public final fun setSize(size: Vector2i) {
    TransferContext.writeArguments(VECTOR2I to size)
    TransferContext.callMethod(ptr, MethodBindings.setSizePtr, NIL)
  }

  public final fun getSize(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSizePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  public final fun setOffset(offset: Vector2) {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(ptr, MethodBindings.setOffsetPtr, NIL)
  }

  public final fun getOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setCellSize(cellSize: Vector2) {
    TransferContext.writeArguments(VECTOR2 to cellSize)
    TransferContext.callMethod(ptr, MethodBindings.setCellSizePtr, NIL)
  }

  public final fun getCellSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCellSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setCellShape(cellShape: CellShape) {
    TransferContext.writeArguments(LONG to cellShape.id)
    TransferContext.callMethod(ptr, MethodBindings.setCellShapePtr, NIL)
  }

  public final fun getCellShape(): CellShape {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCellShapePtr, LONG)
    return CellShape.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the [x] and [y] is a valid grid coordinate (id), i.e. if it is inside [region]. Equivalent to `region.has_point(Vector2i(x, y))`.
   */
  public final fun isInBounds(x: Int, y: Int): Boolean {
    TransferContext.writeArguments(LONG to x.toLong(), LONG to y.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isInBoundsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the [id] vector is a valid grid coordinate, i.e. if it is inside [region]. Equivalent to `region.has_point(id)`.
   */
  public final fun isInBoundsv(id: Vector2i): Boolean {
    TransferContext.writeArguments(VECTOR2I to id)
    TransferContext.callMethod(ptr, MethodBindings.isInBoundsvPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Indicates that the grid parameters were changed and [update] needs to be called.
   */
  public final fun isDirty(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDirtyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Updates the internal state of the grid according to the parameters to prepare it to search the path. Needs to be called if parameters like [region], [cellSize] or [offset] are changed. [isDirty] will return `true` if this is the case and this needs to be called.
   *
   * **Note:** All point data (solidity and weight scale) will be cleared.
   */
  public final fun update() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.updatePtr, NIL)
  }

  public final fun setJumpingEnabled(enabled: Boolean) {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setJumpingEnabledPtr, NIL)
  }

  public final fun isJumpingEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isJumpingEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDiagonalMode(mode: DiagonalMode) {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setDiagonalModePtr, NIL)
  }

  public final fun getDiagonalMode(): DiagonalMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDiagonalModePtr, LONG)
    return DiagonalMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setDefaultComputeHeuristic(heuristic: Heuristic) {
    TransferContext.writeArguments(LONG to heuristic.id)
    TransferContext.callMethod(ptr, MethodBindings.setDefaultComputeHeuristicPtr, NIL)
  }

  public final fun getDefaultComputeHeuristic(): Heuristic {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDefaultComputeHeuristicPtr, LONG)
    return Heuristic.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setDefaultEstimateHeuristic(heuristic: Heuristic) {
    TransferContext.writeArguments(LONG to heuristic.id)
    TransferContext.callMethod(ptr, MethodBindings.setDefaultEstimateHeuristicPtr, NIL)
  }

  public final fun getDefaultEstimateHeuristic(): Heuristic {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDefaultEstimateHeuristicPtr, LONG)
    return Heuristic.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Disables or enables the specified point for pathfinding. Useful for making an obstacle. By default, all points are enabled.
   *
   * **Note:** Calling [update] is not needed after the call of this function.
   */
  @JvmOverloads
  public final fun setPointSolid(id: Vector2i, solid: Boolean = true) {
    TransferContext.writeArguments(VECTOR2I to id, BOOL to solid)
    TransferContext.callMethod(ptr, MethodBindings.setPointSolidPtr, NIL)
  }

  /**
   * Returns `true` if a point is disabled for pathfinding. By default, all points are enabled.
   */
  public final fun isPointSolid(id: Vector2i): Boolean {
    TransferContext.writeArguments(VECTOR2I to id)
    TransferContext.callMethod(ptr, MethodBindings.isPointSolidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the [weightScale] for the point with the given [id]. The [weightScale] is multiplied by the result of [_computeCost] when determining the overall cost of traveling across a segment from a neighboring point to this point.
   *
   * **Note:** Calling [update] is not needed after the call of this function.
   */
  public final fun setPointWeightScale(id: Vector2i, weightScale: Float) {
    TransferContext.writeArguments(VECTOR2I to id, DOUBLE to weightScale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPointWeightScalePtr, NIL)
  }

  /**
   * Returns the weight scale of the point associated with the given [id].
   */
  public final fun getPointWeightScale(id: Vector2i): Float {
    TransferContext.writeArguments(VECTOR2I to id)
    TransferContext.callMethod(ptr, MethodBindings.getPointWeightScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Fills the given [region] on the grid with the specified value for the solid flag.
   *
   * **Note:** Calling [update] is not needed after the call of this function.
   */
  @JvmOverloads
  public final fun fillSolidRegion(region: Rect2i, solid: Boolean = true) {
    TransferContext.writeArguments(RECT2I to region, BOOL to solid)
    TransferContext.callMethod(ptr, MethodBindings.fillSolidRegionPtr, NIL)
  }

  /**
   * Fills the given [region] on the grid with the specified value for the weight scale.
   *
   * **Note:** Calling [update] is not needed after the call of this function.
   */
  public final fun fillWeightScaleRegion(region: Rect2i, weightScale: Float) {
    TransferContext.writeArguments(RECT2I to region, DOUBLE to weightScale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.fillWeightScaleRegionPtr, NIL)
  }

  /**
   * Clears the grid and sets the [region] to `Rect2i(0, 0, 0, 0)`.
   */
  public final fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns the position of the point associated with the given [id].
   */
  public final fun getPointPosition(id: Vector2i): Vector2 {
    TransferContext.writeArguments(VECTOR2I to id)
    TransferContext.callMethod(ptr, MethodBindings.getPointPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns an array of dictionaries with point data (`id`: [Vector2i], `position`: [Vector2], `solid`: [bool], `weight_scale`: [float]) within a [region].
   */
  public final fun getPointDataInRegion(region: Rect2i): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(RECT2I to region)
    TransferContext.callMethod(ptr, MethodBindings.getPointDataInRegionPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns an array with the points that are in the path found by [AStarGrid2D] between the given points. The array is ordered from the starting point to the ending point of the path.
   *
   * If there is no valid path to the target, and [allowPartialPath] is `true`, returns a path to the point closest to the target that can be reached.
   *
   * **Note:** This method is not thread-safe. If called from a [Thread], it will return an empty array and will print an error message.
   *
   * Additionally, when [allowPartialPath] is `true` and [toId] is solid the search may take an unusually long time to finish.
   */
  @JvmOverloads
  public final fun getPointPath(
    fromId: Vector2i,
    toId: Vector2i,
    allowPartialPath: Boolean = false,
  ): PackedVector2Array {
    TransferContext.writeArguments(VECTOR2I to fromId, VECTOR2I to toId, BOOL to allowPartialPath)
    TransferContext.callMethod(ptr, MethodBindings.getPointPathPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * Returns an array with the IDs of the points that form the path found by AStar2D between the given points. The array is ordered from the starting point to the ending point of the path.
   *
   * If there is no valid path to the target, and [allowPartialPath] is `true`, returns a path to the point closest to the target that can be reached.
   *
   * **Note:** When [allowPartialPath] is `true` and [toId] is solid the search may take an unusually long time to finish.
   */
  @JvmOverloads
  public final fun getIdPath(
    fromId: Vector2i,
    toId: Vector2i,
    allowPartialPath: Boolean = false,
  ): VariantArray<Vector2i> {
    TransferContext.writeArguments(VECTOR2I to fromId, VECTOR2I to toId, BOOL to allowPartialPath)
    TransferContext.callMethod(ptr, MethodBindings.getIdPathPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Vector2i>)
  }

  public enum class Heuristic(
    id: Long,
  ) {
    /**
     * The [url=https://en.wikipedia.org/wiki/Euclidean_distance]Euclidean heuristic[/url] to be used for the pathfinding using the following formula:
     *
     * ```
     * dx = abs(to_id.x - from_id.x)
     * dy = abs(to_id.y - from_id.y)
     * result = sqrt(dx * dx + dy * dy)
     * ```
     *
     * **Note:** This is also the internal heuristic used in [AStar3D] and [AStar2D] by default (with the inclusion of possible z-axis coordinate).
     */
    EUCLIDEAN(0),
    /**
     * The [url=https://en.wikipedia.org/wiki/Taxicab_geometry]Manhattan heuristic[/url] to be used for the pathfinding using the following formula:
     *
     * ```
     * dx = abs(to_id.x - from_id.x)
     * dy = abs(to_id.y - from_id.y)
     * result = dx + dy
     * ```
     *
     * **Note:** This heuristic is intended to be used with 4-side orthogonal movements, provided by setting the [diagonalMode] to [DIAGONAL_MODE_NEVER].
     */
    MANHATTAN(1),
    /**
     * The Octile heuristic to be used for the pathfinding using the following formula:
     *
     * ```
     * dx = abs(to_id.x - from_id.x)
     * dy = abs(to_id.y - from_id.y)
     * f = sqrt(2) - 1
     * result = (dx < dy) ? f * dx + dy : f * dy + dx;
     * ```
     */
    OCTILE(2),
    /**
     * The [url=https://en.wikipedia.org/wiki/Chebyshev_distance]Chebyshev heuristic[/url] to be used for the pathfinding using the following formula:
     *
     * ```
     * dx = abs(to_id.x - from_id.x)
     * dy = abs(to_id.y - from_id.y)
     * result = max(dx, dy)
     * ```
     */
    CHEBYSHEV(3),
    /**
     * Represents the size of the [Heuristic] enum.
     */
    MAX(4),
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
     * The pathfinding algorithm will ignore solid neighbors around the target cell and allow passing using diagonals.
     */
    ALWAYS(0),
    /**
     * The pathfinding algorithm will ignore all diagonals and the way will be always orthogonal.
     */
    NEVER(1),
    /**
     * The pathfinding algorithm will avoid using diagonals if at least two obstacles have been placed around the neighboring cells of the specific path segment.
     */
    AT_LEAST_ONE_WALKABLE(2),
    /**
     * The pathfinding algorithm will avoid using diagonals if any obstacle has been placed around the neighboring cells of the specific path segment.
     */
    ONLY_IF_NO_OBSTACLES(3),
    /**
     * Represents the size of the [DiagonalMode] enum.
     */
    MAX(4),
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
    SQUARE(0),
    /**
     * Diamond cell shape (for isometric look). Cell coordinates layout where the horizontal axis goes up-right, and the vertical one goes down-right.
     */
    ISOMETRIC_RIGHT(1),
    /**
     * Diamond cell shape (for isometric look). Cell coordinates layout where the horizontal axis goes down-right, and the vertical one goes down-left.
     */
    ISOMETRIC_DOWN(2),
    /**
     * Represents the size of the [CellShape] enum.
     */
    MAX(3),
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

  public object MethodBindings {
    internal val setRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_region", 1_763_793_166)

    internal val getRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_region", 410_525_958)

    internal val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_size", 1_130_785_943)

    internal val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_size", 3_690_982_128)

    internal val setOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_offset", 743_155_724)

    internal val getOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_offset", 3_341_600_327)

    internal val setCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_cell_size", 743_155_724)

    internal val getCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_cell_size", 3_341_600_327)

    internal val setCellShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_cell_shape", 4_130_591_146)

    internal val getCellShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_cell_shape", 3_293_463_634)

    internal val isInBoundsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "is_in_bounds", 2_522_259_332)

    internal val isInBoundsvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "is_in_boundsv", 3_900_751_641)

    internal val isDirtyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "is_dirty", 36_873_697)

    internal val updatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "update", 3_218_959_716)

    internal val setJumpingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_jumping_enabled", 2_586_408_642)

    internal val isJumpingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "is_jumping_enabled", 36_873_697)

    internal val setDiagonalModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_diagonal_mode", 1_017_829_798)

    internal val getDiagonalModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_diagonal_mode", 3_129_282_674)

    internal val setDefaultComputeHeuristicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_default_compute_heuristic", 1_044_375_519)

    internal val getDefaultComputeHeuristicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_default_compute_heuristic", 2_074_731_422)

    internal val setDefaultEstimateHeuristicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_default_estimate_heuristic", 1_044_375_519)

    internal val getDefaultEstimateHeuristicPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_default_estimate_heuristic", 2_074_731_422)

    internal val setPointSolidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_point_solid", 1_765_703_753)

    internal val isPointSolidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "is_point_solid", 3_900_751_641)

    internal val setPointWeightScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "set_point_weight_scale", 2_262_553_149)

    internal val getPointWeightScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_point_weight_scale", 719_993_801)

    internal val fillSolidRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "fill_solid_region", 2_261_970_063)

    internal val fillWeightScaleRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "fill_weight_scale_region", 2_793_244_083)

    internal val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "clear", 3_218_959_716)

    internal val getPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_point_position", 108_438_297)

    internal val getPointDataInRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_point_data_in_region", 3_893_818_462)

    internal val getPointPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_point_path", 1_641_925_693)

    internal val getIdPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AStarGrid2D", "get_id_path", 1_918_132_273)
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * By changing various properties of this object, such as the start and target position, you can
 * configure path queries to the [NavigationServer2D].
 */
@GodotBaseType
public open class NavigationPathQueryParameters2D : RefCounted() {
  /**
   * The navigation map [RID] used in the path query.
   */
  public final inline var map: RID
    @JvmName("mapProperty")
    get() = getMap()
    @JvmName("mapProperty")
    set(`value`) {
      setMap(value)
    }

  /**
   * The pathfinding start position in global coordinates.
   */
  @CoreTypeLocalCopy
  public final inline var startPosition: Vector2
    @JvmName("startPositionProperty")
    get() = getStartPosition()
    @JvmName("startPositionProperty")
    set(`value`) {
      setStartPosition(value)
    }

  /**
   * The pathfinding target position in global coordinates.
   */
  @CoreTypeLocalCopy
  public final inline var targetPosition: Vector2
    @JvmName("targetPositionProperty")
    get() = getTargetPosition()
    @JvmName("targetPositionProperty")
    set(`value`) {
      setTargetPosition(value)
    }

  /**
   * The navigation layers the query will use (as a bitmask).
   */
  public final inline var navigationLayers: Long
    @JvmName("navigationLayersProperty")
    get() = getNavigationLayers()
    @JvmName("navigationLayersProperty")
    set(`value`) {
      setNavigationLayers(value)
    }

  /**
   * The pathfinding algorithm used in the path query.
   */
  public final inline var pathfindingAlgorithm: PathfindingAlgorithm
    @JvmName("pathfindingAlgorithmProperty")
    get() = getPathfindingAlgorithm()
    @JvmName("pathfindingAlgorithmProperty")
    set(`value`) {
      setPathfindingAlgorithm(value)
    }

  /**
   * The path postprocessing applied to the raw path corridor found by the [pathfindingAlgorithm].
   */
  public final inline var pathPostprocessing: PathPostProcessing
    @JvmName("pathPostprocessingProperty")
    get() = getPathPostprocessing()
    @JvmName("pathPostprocessingProperty")
    set(`value`) {
      setPathPostprocessing(value)
    }

  /**
   * Additional information to include with the navigation path.
   */
  public final inline var metadataFlags: PathMetadataFlags
    @JvmName("metadataFlagsProperty")
    get() = getMetadataFlags()
    @JvmName("metadataFlagsProperty")
    set(`value`) {
      setMetadataFlags(value)
    }

  /**
   * If `true` a simplified version of the path will be returned with less critical path points
   * removed. The simplification amount is controlled by [simplifyEpsilon]. The simplification uses a
   * variant of Ramer-Douglas-Peucker algorithm for curve point decimation.
   * Path simplification can be helpful to mitigate various path following issues that can arise
   * with certain agent types and script behaviors. E.g. "steering" agents or avoidance in "open
   * fields".
   */
  public final inline var simplifyPath: Boolean
    @JvmName("simplifyPathProperty")
    get() = getSimplifyPath()
    @JvmName("simplifyPathProperty")
    set(`value`) {
      setSimplifyPath(value)
    }

  /**
   * The path simplification amount in worlds units.
   */
  public final inline var simplifyEpsilon: Float
    @JvmName("simplifyEpsilonProperty")
    get() = getSimplifyEpsilon()
    @JvmName("simplifyEpsilonProperty")
    set(`value`) {
      setSimplifyEpsilon(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_NAVIGATIONPATHQUERYPARAMETERS2D, scriptIndex)
  }

  /**
   * The pathfinding start position in global coordinates.
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
   * val myCoreType = navigationpathqueryparameters2d.startPosition
   * //Your changes
   * navigationpathqueryparameters2d.startPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun startPositionMutate(block: Vector2.() -> Unit): Vector2 = startPosition.apply{
      block(this)
      startPosition = this
  }


  /**
   * The pathfinding target position in global coordinates.
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
   * val myCoreType = navigationpathqueryparameters2d.targetPosition
   * //Your changes
   * navigationpathqueryparameters2d.targetPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun targetPositionMutate(block: Vector2.() -> Unit): Vector2 = targetPosition.apply{
      block(this)
      targetPosition = this
  }


  public final fun setPathfindingAlgorithm(pathfindingAlgorithm: PathfindingAlgorithm): Unit {
    TransferContext.writeArguments(LONG to pathfindingAlgorithm.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setPathfindingAlgorithmPtr, NIL)
  }

  public final fun getPathfindingAlgorithm(): PathfindingAlgorithm {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPathfindingAlgorithmPtr, LONG)
    return NavigationPathQueryParameters2D.PathfindingAlgorithm.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setPathPostprocessing(pathPostprocessing: PathPostProcessing): Unit {
    TransferContext.writeArguments(LONG to pathPostprocessing.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setPathPostprocessingPtr, NIL)
  }

  public final fun getPathPostprocessing(): PathPostProcessing {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPathPostprocessingPtr, LONG)
    return NavigationPathQueryParameters2D.PathPostProcessing.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMap(map: RID): Unit {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.setMapPtr, NIL)
  }

  public final fun getMap(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setStartPosition(startPosition: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to startPosition)
    TransferContext.callMethod(rawPtr, MethodBindings.setStartPositionPtr, NIL)
  }

  public final fun getStartPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStartPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setTargetPosition(targetPosition: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to targetPosition)
    TransferContext.callMethod(rawPtr, MethodBindings.setTargetPositionPtr, NIL)
  }

  public final fun getTargetPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTargetPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setNavigationLayers(navigationLayers: Long): Unit {
    TransferContext.writeArguments(LONG to navigationLayers)
    TransferContext.callMethod(rawPtr, MethodBindings.setNavigationLayersPtr, NIL)
  }

  public final fun getNavigationLayers(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMetadataFlags(flags: PathMetadataFlags): Unit {
    TransferContext.writeArguments(LONG to flags.flag)
    TransferContext.callMethod(rawPtr, MethodBindings.setMetadataFlagsPtr, NIL)
  }

  public final fun getMetadataFlags(): PathMetadataFlags {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMetadataFlagsPtr, LONG)
    return PathMetadataFlagsValue(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSimplifyPath(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setSimplifyPathPtr, NIL)
  }

  public final fun getSimplifyPath(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSimplifyPathPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSimplifyEpsilon(epsilon: Float): Unit {
    TransferContext.writeArguments(DOUBLE to epsilon.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setSimplifyEpsilonPtr, NIL)
  }

  public final fun getSimplifyEpsilon(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSimplifyEpsilonPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public enum class PathfindingAlgorithm(
    id: Long,
  ) {
    /**
     * The path query uses the default A* pathfinding algorithm.
     */
    PATHFINDING_ALGORITHM_ASTAR(0),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PathfindingAlgorithm = entries.single { it.id == `value` }
    }
  }

  public enum class PathPostProcessing(
    id: Long,
  ) {
    /**
     * Applies a funnel algorithm to the raw path corridor found by the pathfinding algorithm. This
     * will result in the shortest path possible inside the path corridor. This postprocessing very
     * much depends on the navigation mesh polygon layout and the created corridor. Especially tile- or
     * gridbased layouts can face artificial corners with diagonal movement due to a jagged path
     * corridor imposed by the cell shapes.
     */
    PATH_POSTPROCESSING_CORRIDORFUNNEL(0),
    /**
     * Centers every path position in the middle of the traveled navigation mesh polygon edge. This
     * creates better paths for tile- or gridbased layouts that restrict the movement to the cells
     * center.
     */
    PATH_POSTPROCESSING_EDGECENTERED(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PathPostProcessing = entries.single { it.id == `value` }
    }
  }

  public sealed interface PathMetadataFlags {
    public val flag: Long

    public infix fun or(other: PathMetadataFlags): PathMetadataFlags =
        PathMetadataFlagsValue(flag.or(other.flag))

    public infix fun or(other: Long): PathMetadataFlags = PathMetadataFlagsValue(flag.or(other))

    public infix fun xor(other: PathMetadataFlags): PathMetadataFlags =
        PathMetadataFlagsValue(flag.xor(other.flag))

    public infix fun xor(other: Long): PathMetadataFlags = PathMetadataFlagsValue(flag.xor(other))

    public infix fun and(other: PathMetadataFlags): PathMetadataFlags =
        PathMetadataFlagsValue(flag.and(other.flag))

    public infix fun and(other: Long): PathMetadataFlags = PathMetadataFlagsValue(flag.and(other))

    public operator fun plus(other: PathMetadataFlags): PathMetadataFlags =
        PathMetadataFlagsValue(flag.plus(other.flag))

    public operator fun plus(other: Long): PathMetadataFlags =
        PathMetadataFlagsValue(flag.plus(other))

    public operator fun minus(other: PathMetadataFlags): PathMetadataFlags =
        PathMetadataFlagsValue(flag.minus(other.flag))

    public operator fun minus(other: Long): PathMetadataFlags =
        PathMetadataFlagsValue(flag.minus(other))

    public operator fun times(other: PathMetadataFlags): PathMetadataFlags =
        PathMetadataFlagsValue(flag.times(other.flag))

    public operator fun times(other: Long): PathMetadataFlags =
        PathMetadataFlagsValue(flag.times(other))

    public operator fun div(other: PathMetadataFlags): PathMetadataFlags =
        PathMetadataFlagsValue(flag.div(other.flag))

    public operator fun div(other: Long): PathMetadataFlags =
        PathMetadataFlagsValue(flag.div(other))

    public operator fun rem(other: PathMetadataFlags): PathMetadataFlags =
        PathMetadataFlagsValue(flag.rem(other.flag))

    public operator fun rem(other: Long): PathMetadataFlags =
        PathMetadataFlagsValue(flag.rem(other))

    public fun unaryPlus(): PathMetadataFlags = PathMetadataFlagsValue(flag.unaryPlus())

    public fun unaryMinus(): PathMetadataFlags = PathMetadataFlagsValue(flag.unaryMinus())

    public fun inv(): PathMetadataFlags = PathMetadataFlagsValue(flag.inv())

    public infix fun shl(bits: Int): PathMetadataFlags = PathMetadataFlagsValue(flag shl bits)

    public infix fun shr(bits: Int): PathMetadataFlags = PathMetadataFlagsValue(flag shr bits)

    public infix fun ushr(bits: Int): PathMetadataFlags = PathMetadataFlagsValue(flag ushr bits)

    public companion object {
      public val PATH_METADATA_INCLUDE_NONE: PathMetadataFlags = PathMetadataFlagsValue(0)

      public val PATH_METADATA_INCLUDE_TYPES: PathMetadataFlags = PathMetadataFlagsValue(1)

      public val PATH_METADATA_INCLUDE_RIDS: PathMetadataFlags = PathMetadataFlagsValue(2)

      public val PATH_METADATA_INCLUDE_OWNERS: PathMetadataFlags = PathMetadataFlagsValue(4)

      public val PATH_METADATA_INCLUDE_ALL: PathMetadataFlags = PathMetadataFlagsValue(7)
    }
  }

  @JvmInline
  internal value class PathMetadataFlagsValue internal constructor(
    public override val flag: Long,
  ) : PathMetadataFlags

  public companion object

  internal object MethodBindings {
    public val setPathfindingAlgorithmPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "set_pathfinding_algorithm", 2783519915)

    public val getPathfindingAlgorithmPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "get_pathfinding_algorithm", 3000421146)

    public val setPathPostprocessingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "set_path_postprocessing", 2864409082)

    public val getPathPostprocessingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "get_path_postprocessing", 3798118993)

    public val setMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "set_map", 2722037293)

    public val getMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "get_map", 2944877500)

    public val setStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "set_start_position", 743155724)

    public val getStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "get_start_position", 3341600327)

    public val setTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "set_target_position", 743155724)

    public val getTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "get_target_position", 3341600327)

    public val setNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "set_navigation_layers", 1286410249)

    public val getNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "get_navigation_layers", 3905245786)

    public val setMetadataFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "set_metadata_flags", 24274129)

    public val getMetadataFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "get_metadata_flags", 488152976)

    public val setSimplifyPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "set_simplify_path", 2586408642)

    public val getSimplifyPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "get_simplify_path", 36873697)

    public val setSimplifyEpsilonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "set_simplify_epsilon", 373806689)

    public val getSimplifyEpsilonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters2D", "get_simplify_epsilon", 1740695150)
  }
}

public infix fun Long.or(other: godot.NavigationPathQueryParameters2D.PathMetadataFlags): Long =
    this.or(other.flag)

public infix fun Long.xor(other: godot.NavigationPathQueryParameters2D.PathMetadataFlags): Long =
    this.xor(other.flag)

public infix fun Long.and(other: godot.NavigationPathQueryParameters2D.PathMetadataFlags): Long =
    this.and(other.flag)

public operator fun Long.plus(other: godot.NavigationPathQueryParameters2D.PathMetadataFlags): Long
    = this.plus(other.flag)

public operator fun Long.minus(other: godot.NavigationPathQueryParameters2D.PathMetadataFlags): Long
    = this.minus(other.flag)

public operator fun Long.times(other: godot.NavigationPathQueryParameters2D.PathMetadataFlags): Long
    = this.times(other.flag)

public operator fun Long.div(other: godot.NavigationPathQueryParameters2D.PathMetadataFlags): Long =
    this.div(other.flag)

public operator fun Long.rem(other: godot.NavigationPathQueryParameters2D.PathMetadataFlags): Long =
    this.rem(other.flag)

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
import godot.core.RID
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR3
import godot.core.VariantParser._RID
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

public infix fun Long.or(other: NavigationPathQueryParameters3D.PathMetadataFlags): Long =
    this.or(other.flag)

public infix fun Long.xor(other: NavigationPathQueryParameters3D.PathMetadataFlags): Long =
    this.xor(other.flag)

public infix fun Long.and(other: NavigationPathQueryParameters3D.PathMetadataFlags): Long =
    this.and(other.flag)

/**
 * By changing various properties of this object, such as the start and target position, you can
 * configure path queries to the [NavigationServer3D].
 */
@GodotBaseType
public open class NavigationPathQueryParameters3D : RefCounted() {
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
  public final inline var startPosition: Vector3
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
  public final inline var targetPosition: Vector3
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
    createNativeObject(385, scriptIndex)
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
   * val myCoreType = navigationpathqueryparameters3d.startPosition
   * //Your changes
   * navigationpathqueryparameters3d.startPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun startPositionMutate(block: Vector3.() -> Unit): Vector3 = startPosition.apply{
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
   * val myCoreType = navigationpathqueryparameters3d.targetPosition
   * //Your changes
   * navigationpathqueryparameters3d.targetPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun targetPositionMutate(block: Vector3.() -> Unit): Vector3 = targetPosition.apply{
      block(this)
      targetPosition = this
  }


  public final fun setPathfindingAlgorithm(pathfindingAlgorithm: PathfindingAlgorithm): Unit {
    TransferContext.writeArguments(LONG to pathfindingAlgorithm.id)
    TransferContext.callMethod(ptr, MethodBindings.setPathfindingAlgorithmPtr, NIL)
  }

  public final fun getPathfindingAlgorithm(): PathfindingAlgorithm {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathfindingAlgorithmPtr, LONG)
    return NavigationPathQueryParameters3D.PathfindingAlgorithm.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setPathPostprocessing(pathPostprocessing: PathPostProcessing): Unit {
    TransferContext.writeArguments(LONG to pathPostprocessing.id)
    TransferContext.callMethod(ptr, MethodBindings.setPathPostprocessingPtr, NIL)
  }

  public final fun getPathPostprocessing(): PathPostProcessing {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathPostprocessingPtr, LONG)
    return NavigationPathQueryParameters3D.PathPostProcessing.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMap(map: RID): Unit {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(ptr, MethodBindings.setMapPtr, NIL)
  }

  public final fun getMap(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setStartPosition(startPosition: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to startPosition)
    TransferContext.callMethod(ptr, MethodBindings.setStartPositionPtr, NIL)
  }

  public final fun getStartPosition(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStartPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setTargetPosition(targetPosition: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to targetPosition)
    TransferContext.callMethod(ptr, MethodBindings.setTargetPositionPtr, NIL)
  }

  public final fun getTargetPosition(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTargetPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setNavigationLayers(navigationLayers: Long): Unit {
    TransferContext.writeArguments(LONG to navigationLayers)
    TransferContext.callMethod(ptr, MethodBindings.setNavigationLayersPtr, NIL)
  }

  public final fun getNavigationLayers(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNavigationLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMetadataFlags(flags: PathMetadataFlags): Unit {
    TransferContext.writeArguments(LONG to flags.flag)
    TransferContext.callMethod(ptr, MethodBindings.setMetadataFlagsPtr, NIL)
  }

  public final fun getMetadataFlags(): PathMetadataFlags {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMetadataFlagsPtr, LONG)
    return PathMetadataFlags(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSimplifyPath(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setSimplifyPathPtr, NIL)
  }

  public final fun getSimplifyPath(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSimplifyPathPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSimplifyEpsilon(epsilon: Float): Unit {
    TransferContext.writeArguments(DOUBLE to epsilon.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSimplifyEpsilonPtr, NIL)
  }

  public final fun getSimplifyEpsilon(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSimplifyEpsilonPtr, DOUBLE)
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
    /**
     * Applies no postprocessing and returns the raw path corridor as found by the pathfinding
     * algorithm.
     */
    PATH_POSTPROCESSING_NONE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PathPostProcessing = entries.single { it.id == `value` }
    }
  }

  @JvmInline
  public value class PathMetadataFlags(
    public val flag: Long,
  ) {
    public infix fun or(other: PathMetadataFlags): PathMetadataFlags =
        PathMetadataFlags(flag.or(other.flag))

    public infix fun or(other: Long): PathMetadataFlags = PathMetadataFlags(flag.or(other))

    public infix fun xor(other: PathMetadataFlags): PathMetadataFlags =
        PathMetadataFlags(flag.xor(other.flag))

    public infix fun xor(other: Long): PathMetadataFlags = PathMetadataFlags(flag.xor(other))

    public infix fun and(other: PathMetadataFlags): PathMetadataFlags =
        PathMetadataFlags(flag.and(other.flag))

    public infix fun and(other: Long): PathMetadataFlags = PathMetadataFlags(flag.and(other))

    public fun unaryPlus(): PathMetadataFlags = PathMetadataFlags(flag.unaryPlus())

    public fun unaryMinus(): PathMetadataFlags = PathMetadataFlags(flag.unaryMinus())

    public fun inv(): PathMetadataFlags = PathMetadataFlags(flag.inv())

    public infix fun shl(bits: Int): PathMetadataFlags = PathMetadataFlags(flag shl bits)

    public infix fun shr(bits: Int): PathMetadataFlags = PathMetadataFlags(flag shr bits)

    public infix fun ushr(bits: Int): PathMetadataFlags = PathMetadataFlags(flag ushr bits)

    public companion object {
      /**
       * Don't include any additional metadata about the returned path.
       */
      public val PATH_METADATA_INCLUDE_NONE: PathMetadataFlags = PathMetadataFlags(0)

      /**
       * Include the type of navigation primitive (region or link) that each point of the path goes
       * through.
       */
      public val PATH_METADATA_INCLUDE_TYPES: PathMetadataFlags = PathMetadataFlags(1)

      /**
       * Include the [RID]s of the regions and links that each point of the path goes through.
       */
      public val PATH_METADATA_INCLUDE_RIDS: PathMetadataFlags = PathMetadataFlags(2)

      /**
       * Include the `ObjectID`s of the [Object]s which manage the regions and links each point of
       * the path goes through.
       */
      public val PATH_METADATA_INCLUDE_OWNERS: PathMetadataFlags = PathMetadataFlags(4)

      /**
       * Include all available metadata about the returned path.
       */
      public val PATH_METADATA_INCLUDE_ALL: PathMetadataFlags = PathMetadataFlags(7)
    }
  }

  public companion object

  public object MethodBindings {
    internal val setPathfindingAlgorithmPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "set_pathfinding_algorithm", 394560454)

    internal val getPathfindingAlgorithmPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "get_pathfinding_algorithm", 3398491350)

    internal val setPathPostprocessingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "set_path_postprocessing", 2267362344)

    internal val getPathPostprocessingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "get_path_postprocessing", 3883858360)

    internal val setMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "set_map", 2722037293)

    internal val getMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "get_map", 2944877500)

    internal val setStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "set_start_position", 3460891852)

    internal val getStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "get_start_position", 3360562783)

    internal val setTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "set_target_position", 3460891852)

    internal val getTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "get_target_position", 3360562783)

    internal val setNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "set_navigation_layers", 1286410249)

    internal val getNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "get_navigation_layers", 3905245786)

    internal val setMetadataFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "set_metadata_flags", 2713846708)

    internal val getMetadataFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "get_metadata_flags", 1582332802)

    internal val setSimplifyPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "set_simplify_path", 2586408642)

    internal val getSimplifyPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "get_simplify_path", 36873697)

    internal val setSimplifyEpsilonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "set_simplify_epsilon", 373806689)

    internal val getSimplifyEpsilonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationPathQueryParameters3D", "get_simplify_epsilon", 1740695150)
  }
}
